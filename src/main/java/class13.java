import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class13 {

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "[I")
    private int[] field97;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "[I")
    private int[] field93;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field104 = 0;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
    public static int field107 = -1;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    private int field102;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
    private int field105;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    private int field108;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    private int field109;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "Lqg;")
    public static class391 field100;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBI)Z")
    public static final boolean method101(int arg0, byte arg1, int arg2) {
        field98++;
        if (arg1 < 0) {
            method106(8, -122, 63, 91, (byte) -89, -24, -16);
        }
        return class418.method2377(arg2, arg0, -19751) & class70.method386((byte) 52, arg2, arg0);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
    private final void method102(byte arg0) {
        field92++;
        this.field102 += ++this.field105;
        int var2 = 0;
        int var3 = -119 / ((arg0 - 8) / 46);
        while (var2 < 256) {
            int var4 = this.field93[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field109 ^= this.field109 << 13;
                } else {
                    this.field109 ^= this.field109 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field109 ^= this.field109 << 2;
            } else {
                this.field109 ^= this.field109 >>> 16;
            }
            this.field109 += this.field93[var2 + 128 & 0xFF];
            int var5;
            this.field93[var2] = var5 = this.field102 + this.field93[class288.method1624(var4, 1020) >> 2] + this.field109;
            this.field97[var2] = this.field102 = var4 + this.field93[class288.method1624(var5 >> 8 >> 2, 255)];
            var2++;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Z")
    public static final boolean method103(int arg0, int arg1, int arg2) {
        field95++;
        if (arg1 != 2) {
            method109(-21);
        }
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)I")
    public final int method104(int arg0) {
        if (arg0 != 34847) {
            return -84;
        }
        if (this.field108 == 0) {
            this.method102((byte) 89);
            this.field108 = 256;
        }
        field106++;
        return this.field97[this.field108 - 1];
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)I")
    public static final int method105(int arg0, int arg1) {
        field99++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else if (arg1 == 6410 || arg1 == 34847) {
            return 6410;
        } else if (arg1 == 6402) {
            return 6402;
        } else if (arg0 == 6410) {
            throw new IllegalArgumentException("");
        } else {
            return -90;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIBII)V")
    public static final void method106(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        class637.field9148 = arg6;
        class173.field2098 = arg2;
        class53.field442 = arg3;
        class333.field4321 = arg5;
        if (arg4 > -40) {
            field107 = -13;
        }
        class357.field4691 = arg0;
        field103++;
        class473.field6632 = arg1;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
    private final void method107(int arg0) {
        if (arg0 <= 51) {
            return;
        }
        field101++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field97[var11 + 3] + var6;
            int var38 = this.field97[var11] + var9;
            int var39 = this.field97[var11 + 5] + var4;
            int var40 = this.field97[var11 + 7] + var2;
            int var41 = this.field97[var11 + 4] + var5;
            int var42 = this.field97[var11 + 6] + var3;
            int var43 = this.field97[var11 + 2] + var7;
            int var44 = this.field97[var11 + 1] + var8;
            int var45 = var38 ^ var44 << 11;
            int var46 = var37 + var45;
            int var47 = var43 + var44;
            int var48 = var47 ^ var43 >>> 2;
            int var49 = var43 + var46;
            int var50 = var41 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var39 + var51;
            int var53 = var46 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var50 + var52;
            int var55 = var6 + var42;
            var5 = var54 ^ var52 << 10;
            int var56 = var52 + var55;
            int var57 = var5 + var40;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var55 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            int var60 = var57 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field93[var11] = var9;
            this.field93[var11 + 1] = var8;
            this.field93[var11 + 2] = var7;
            this.field93[var11 + 3] = var6;
            this.field93[var11 + 4] = var5;
            this.field93[var11 + 5] = var4;
            this.field93[var11 + 6] = var3;
            this.field93[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field93[var12 + 1] + var8;
            int var14 = this.field93[var12 + 7] + var2;
            int var15 = this.field93[var12] + var9;
            int var16 = this.field93[var12 + 4] + var5;
            int var17 = this.field93[var12 + 5] + var4;
            int var18 = this.field93[var12 + 3] + var6;
            int var19 = this.field93[var12 + 2] + var7;
            int var20 = this.field93[var12 + 6] + var3;
            int var21 = var15 ^ var13 << 11;
            int var22 = var18 + var21;
            int var23 = var13 + var19;
            int var24 = var23 ^ var19 >>> 2;
            int var25 = var19 + var22;
            int var26 = var16 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var22 + var26;
            int var29 = var17 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var26 + var29;
            int var31 = var6 + var20;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var14;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field93[var12] = var9;
            this.field93[var12 + 1] = var8;
            this.field93[var12 + 2] = var7;
            this.field93[var12 + 3] = var6;
            this.field93[var12 + 4] = var5;
            this.field93[var12 + 5] = var4;
            this.field93[var12 + 6] = var3;
            this.field93[var12 + 7] = var2;
        }
        this.method102((byte) -69);
        this.field108 = 256;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)I")
    public final int method108(byte arg0) {
        field96++;
        int var2 = -20 / ((-arg0 - 9) / 54);
        if (this.field108 == 0) {
            this.method102((byte) -52);
            this.field108 = 256;
        }
        return this.field97[--this.field108];
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V")
    public static final void method109(int arg0) {
        class373.field4898 = null;
        field94++;
        class554.field8152 = null;
        class93.field1140 = null;
        class368.field4861 = null;
        if (arg0 != -544556112) {
            method106(-98, 11, -47, 7, (byte) -87, 29, -123);
        }
        class513.field7254 = null;
        class184.field2231 = false;
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V")
    public static void method110(int arg0) {
        field100 = null;
        if (arg0 != 6407) {
            field107 = -87;
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
    private class13() {
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "([I)V")
    public class13(int[] arg0) {
        this.field97 = new int[256];
        this.field93 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field97[var2] = arg0[var2];
        }
        this.method107(68);
    }
}
