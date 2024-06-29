import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 {

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "[I")
    private int[] field25;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "[I")
    private int[] field37;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field39 = 0;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Lpj;")
    private static class237 field29 = class33.method353(" is already on your ignore list)3", 65);

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field36 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field31 = 1;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "[Lpj;")
    public static class237[] field23 = new class237[100];

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Lpj;")
    public static class237 field33 = field29;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    private int field24;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    private int field27;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    private int field28;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    private int field40;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "[Lgk;")
    public static class154[] field34;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "[[[B")
    public static byte[][][] field26;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method48(int arg0) {
        field29 = null;
        field23 = null;
        field34 = null;
        field26 = null;
        field33 = null;
        if (arg0 != -257) {
            method49(79, -42, 33, -91);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)I")
    public static final int method49(int arg0, int arg1, int arg2, int arg3) {
        field41++;
        if (arg3 != -11566) {
            field36 = -43;
        }
        if ((class73.field1410[arg1][arg0][arg2] & 0x8) == 0) {
            return arg1 <= 0 || (class73.field1410[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    private final void method50(int arg0) {
        field20++;
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
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var66 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var68 + var71;
            var4 = var72 ^ var71 >>> 4;
            int var73 = var4 + var61;
            int var74 = var2 + var5;
            int var75 = var71 + var74;
            var3 = var75 ^ var74 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var74;
            var2 = var76 ^ var73 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var73;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field25[var11 + 1] + var8;
            int var38 = this.field25[var11 + 3] + var6;
            int var39 = this.field25[var11 + 5] + var4;
            int var40 = this.field25[var11 + 2] + var7;
            int var41 = this.field25[var11] + var9;
            int var42 = var41 ^ var37 << 11;
            int var43 = var37 + var40;
            int var44 = this.field25[var11 + 6] + var3;
            int var45 = this.field25[var11 + 4] + var5;
            int var46 = var43 ^ var40 >>> 2;
            int var47 = var38 + var42;
            int var48 = var40 + var47;
            int var49 = var48 ^ var47 << 8;
            int var50 = var39 + var49;
            int var51 = var45 + var46;
            int var52 = var47 + var51;
            var6 = var52 ^ var51 >>> 16;
            int var53 = var6 + var44;
            int var54 = this.field25[var11 + 7] + var2;
            int var55 = var50 + var51;
            var5 = var55 ^ var50 << 10;
            int var56 = var5 + var54;
            int var57 = var50 + var53;
            var4 = var57 ^ var53 >>> 4;
            int var58 = var53 + var56;
            int var59 = var4 + var42;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var46;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            this.field37[var11] = var9;
            this.field37[var11 + 1] = var8;
            var7 = var2 + var49;
            this.field37[var11 + 2] = var7;
            this.field37[var11 + 3] = var6;
            this.field37[var11 + 4] = var5;
            this.field37[var11 + 5] = var4;
            this.field37[var11 + 6] = var3;
            this.field37[var11 + 7] = var2;
        }
        if (arg0 < 2) {
            method56(-115);
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field37[var12 + 7] + var2;
            int var14 = this.field37[var12 + 4] + var5;
            int var15 = this.field37[var12 + 3] + var6;
            int var16 = this.field37[var12] + var9;
            int var17 = this.field37[var12 + 5] + var4;
            int var18 = this.field37[var12 + 1] + var8;
            int var19 = this.field37[var12 + 2] + var7;
            int var20 = this.field37[var12 + 6] + var3;
            int var21 = var16 ^ var18 << 11;
            int var22 = var15 + var21;
            int var23 = var18 + var19;
            int var24 = var23 ^ var19 >>> 2;
            int var25 = var14 + var24;
            int var26 = var19 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var17 + var27;
            int var29 = var22 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            var5 = var30 ^ var28 << 10;
            int var31 = var6 + var20;
            int var32 = var5 + var13;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            this.field37[var12] = var9;
            var7 = var2 + var27;
            this.field37[var12 + 1] = var8;
            this.field37[var12 + 2] = var7;
            this.field37[var12 + 3] = var6;
            this.field37[var12 + 4] = var5;
            this.field37[var12 + 5] = var4;
            this.field37[var12 + 6] = var3;
            this.field37[var12 + 7] = var2;
        }
        this.method57(-113);
        this.field28 = 256;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)I")
    public static final int method51(int arg0, int arg1, int arg2) {
        field22++;
        int var3 = 1;
        if (arg1 != -1) {
            field34 = null;
        }
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg2 *= arg2;
            arg0 >>= 0x1;
        }
        if (arg0 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)Loh;")
    public static final class261 method52(int arg0, byte arg1) {
        field30++;
        if (arg1 >= -45) {
            field31 = -56;
        }
        class261 var2 = (class261) class95.field1685.method1549((long) arg0, 9447);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class49.field1049.method1645(true, arg0, 5);
        class261 var4 = new class261();
        if (var3 != null) {
            var4.method1755(0, new class32(var3));
        }
        class95.field1685.method1552((byte) -103, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)Lic;")
    public static final class138 method53(byte arg0) {
        field38++;
        try {
            if (arg0 != 76) {
                method52(-1, (byte) 126);
            }
            return (class138) Class.forName("r").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)I")
    public final int method54(int arg0) {
        if ((this.field28--) == 0) {
            this.method57(-111);
            this.field28 = 255;
        }
        field32++;
        int var2 = -121 / ((arg0 - 12) / 52);
        return this.field25[this.field28];
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILpj;)Z")
    public static final boolean method55(int arg0, class237 arg1) {
        field21++;
        if (arg1 == null) {
            return false;
        } else if (arg0 == -32496) {
            for (int var2 = 0; var2 < class179.field3143; var2++) {
                if (arg1.method1580(class78.field1477[var2], (byte) 27)) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)Z")
    public static final boolean method56(int arg0) {
        if (arg0 != -1026652120) {
            method51(95, 89, -46);
        }
        field42++;
        return class41.field930 == 0 ? class115.field2020.method1863(-10375) : true;
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
    private final void method57(int arg0) {
        this.field40 += ++this.field27;
        field35++;
        int var2 = 0;
        int var3 = -102 % ((arg0 - 57) / 35);
        while (var2 < 256) {
            int var4 = this.field37[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field24 ^= this.field24 << 13;
                } else {
                    this.field24 ^= this.field24 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field24 ^= this.field24 << 2;
            } else {
                this.field24 ^= this.field24 >>> 16;
            }
            this.field24 += this.field37[var2 + 128 & 0xFF];
            int var5;
            this.field37[var2] = var5 = this.field40 + this.field24 + this.field37[class272.method1817(var4, 1020) >> 2];
            this.field25[var2] = this.field40 = var4 + this.field37[class272.method1817(var5 >> 8 >> 2, 255)];
            var2++;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    private class3() {
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([I)V")
    public class3(int[] arg0) {
        this.field25 = new int[256];
        this.field37 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field25[var2] = arg0[var2];
        }
        this.method50(108);
    }
}
