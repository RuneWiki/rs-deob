import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class179 {

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "[I")
    private int[] field2229;

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "[I")
    private int[] field2228;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "Lnc;")
    public static class580 field2230 = new class580();

    @OriginalMember(owner = "client!ov", name = "m", descriptor = "Lll;")
    public static class114 field2239 = new class114();

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
    public static int field2242 = 0;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
    private int field2231;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
    private int field2232;

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
    private int field2233;

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "I")
    private int field2238;

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)I", line = 9)
    public final int method1173(boolean arg0) {
        if (arg0) {
            method1179(-65);
        }
        if (this.field2232 == 0) {
            this.method1176(-1);
            this.field2232 = 256;
        }
        field2237++;
        return this.field2229[this.field2232 - 1];
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V", line = 36)
    private final void method1174(int arg0) {
        if (arg0 != 5) {
            return;
        }
        field2234++;
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
            int var74 = var4 + var61;
            int var75 = var70 + var73;
            var3 = var75 ^ var73 << 8;
            int var76 = var73 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2229[var11 + 7] + var2;
            int var38 = this.field2229[var11 + 3] + var6;
            int var39 = this.field2229[var11 + 1] + var8;
            int var40 = this.field2229[var11 + 2] + var7;
            int var41 = this.field2229[var11 + 4] + var5;
            int var42 = this.field2229[var11 + 5] + var4;
            int var43 = this.field2229[var11 + 6] + var3;
            int var44 = this.field2229[var11] + var9;
            int var45 = var44 ^ var39 << 11;
            int var46 = var39 + var40;
            int var47 = var38 + var45;
            int var48 = var46 ^ var40 >>> 2;
            int var49 = var41 + var48;
            int var50 = var40 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var42 + var51;
            int var53 = var47 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var6 + var43;
            int var55 = var49 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var37;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field2228[var11] = var9;
            this.field2228[var11 + 1] = var8;
            this.field2228[var11 + 2] = var7;
            this.field2228[var11 + 3] = var6;
            this.field2228[var11 + 4] = var5;
            this.field2228[var11 + 5] = var4;
            this.field2228[var11 + 6] = var3;
            this.field2228[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2228[var12 + 1] + var8;
            int var14 = this.field2228[var12 + 5] + var4;
            int var15 = this.field2228[var12 + 4] + var5;
            int var16 = this.field2228[var12 + 7] + var2;
            int var17 = this.field2228[var12 + 3] + var6;
            int var18 = this.field2228[var12] + var9;
            int var19 = this.field2228[var12 + 6] + var3;
            int var20 = this.field2228[var12 + 2] + var7;
            int var21 = var18 ^ var13 << 11;
            int var22 = var17 + var21;
            int var23 = var13 + var20;
            int var24 = var23 ^ var20 >>> 2;
            int var25 = var15 + var24;
            int var26 = var20 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var14 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            int var31 = var6 + var19;
            var5 = var30 ^ var29 << 10;
            int var32 = var29 + var31;
            int var33 = var5 + var16;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var31 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            int var36 = var33 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field2228[var12] = var9;
            this.field2228[var12 + 1] = var8;
            this.field2228[var12 + 2] = var7;
            this.field2228[var12 + 3] = var6;
            this.field2228[var12 + 4] = var5;
            this.field2228[var12 + 5] = var4;
            this.field2228[var12 + 6] = var3;
            this.field2228[var12 + 7] = var2;
        }
        this.method1176(-1);
        this.field2232 = 256;
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)V", line = 184)
    public static void method1175(int arg0) {
        field2230 = null;
        field2239 = null;
        if (arg0 <= 71) {
            field2230 = null;
        }
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)V", line = 195)
    private final void method1176(int arg0) {
        field2240++;
        if (arg0 != -1) {
            this.method1173(false);
        }
        this.field2233 += ++this.field2231;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2228[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2238 ^= this.field2238 << 13;
                } else {
                    this.field2238 ^= this.field2238 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2238 ^= this.field2238 << 2;
            } else {
                this.field2238 ^= this.field2238 >>> 16;
            }
            this.field2238 += this.field2228[var2 + 128 & 0xFF];
            int var4;
            this.field2228[var2] = var4 = this.field2238 + this.field2233 + this.field2228[class230.method1424(var3, 1020) >> 2];
            this.field2229[var2] = this.field2233 = var3 + this.field2228[class230.method1424(1020, var4 >> 8) >> 2];
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIB)Z", line = 237)
    public static final boolean method1177(int arg0, int arg1, byte arg2) {
        if (arg2 <= 94) {
            field2235 = 41;
        }
        field2241++;
        return ((arg1 & 0x2000) != 0 | class558.method3121(arg0, arg1, true) | class298.method1780(true, arg1, arg0)) & class495.method2794(arg0, 4965, arg1);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)I", line = 251)
    public final int method1178(byte arg0) {
        field2236++;
        if (arg0 != -2) {
            method1175(-68);
        }
        if (this.field2232 == 0) {
            this.method1176(-1);
            this.field2232 = 256;
        }
        return this.field2229[--this.field2232];
    }

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "(I)V", line = 269)
    public static final void method1179(int arg0) {
        field2227++;
        class428 var1 = null;
        try {
            class280 var2 = class495.field6687.method625(true, -25857, "2");
            while (var2.field3773 == 0) {
                class660.method3668(-1, 1L);
            }
            if (~var2.field3773 == arg0) {
                var1 = (class428) var2.field3772;
                byte[] var3 = new byte[(int) var1.method2468(0)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2466(var3, (byte) -69, var4, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class600.method3323(new class138(var3), false);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2467((byte) 106);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "()V", line = 315)
    private class179() {
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "([I)V", line = 322)
    public class179(int[] arg0) {
        this.field2229 = new int[256];
        this.field2228 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2229[var2] = arg0[var2];
        }
        this.method1174(5);
    }
}
