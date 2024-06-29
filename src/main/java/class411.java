import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class411 {

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "[I")
    private int[] field5908;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "[I")
    private int[] field5912;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "[B")
    public static byte[] field5914 = new byte[2048];

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "[Lfs;")
    public static class360[] field5901 = new class360[50];

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "[[Z")
    public static boolean[][] field5899 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    private int field5902;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    private int field5903;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    private int field5906;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    private int field5919;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lct;")
    public static class104 field5900;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Lct;")
    public static class104 field5907;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    private final void method2548(int arg0) {
        field5905++;
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
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var7 + var63;
            int var66 = var5 + var64;
            int var67 = var65 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var66 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var71 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field5908[var11 + 7] + var2;
            int var38 = this.field5908[var11] + var9;
            int var39 = this.field5908[var11 + 4] + var5;
            int var40 = this.field5908[var11 + 5] + var4;
            int var41 = this.field5908[var11 + 6] + var3;
            int var42 = this.field5908[var11 + 2] + var7;
            int var43 = this.field5908[var11 + 1] + var8;
            int var44 = this.field5908[var11 + 3] + var6;
            int var45 = var38 ^ var43 << 11;
            int var46 = var42 + var43;
            int var47 = var44 + var45;
            int var48 = var46 ^ var42 >>> 2;
            int var49 = var42 + var47;
            int var50 = var39 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var47 + var50;
            int var53 = var40 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var6 + var41;
            int var55 = var50 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var37;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field5912[var11] = var9;
            this.field5912[var11 + 1] = var8;
            this.field5912[var11 + 2] = var7;
            this.field5912[var11 + 3] = var6;
            this.field5912[var11 + 4] = var5;
            this.field5912[var11 + 5] = var4;
            this.field5912[var11 + 6] = var3;
            this.field5912[var11 + 7] = var2;
        }
        if (arg0 >= -30) {
            return;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field5912[var12 + 3] + var6;
            int var14 = this.field5912[var12 + 2] + var7;
            int var15 = this.field5912[var12 + 7] + var2;
            int var16 = this.field5912[var12 + 5] + var4;
            int var17 = this.field5912[var12 + 4] + var5;
            int var18 = this.field5912[var12] + var9;
            int var19 = this.field5912[var12 + 1] + var8;
            int var20 = this.field5912[var12 + 6] + var3;
            int var21 = var18 ^ var19 << 11;
            int var22 = var14 + var19;
            int var23 = var13 + var21;
            int var24 = var22 ^ var14 >>> 2;
            int var25 = var14 + var23;
            int var26 = var17 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var23 + var26;
            int var29 = var16 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var26 + var29;
            int var31 = var6 + var20;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var15;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field5912[var12] = var9;
            this.field5912[var12 + 1] = var8;
            this.field5912[var12 + 2] = var7;
            this.field5912[var12 + 3] = var6;
            this.field5912[var12 + 4] = var5;
            this.field5912[var12 + 5] = var4;
            this.field5912[var12 + 6] = var3;
            this.field5912[var12 + 7] = var2;
        }
        this.method2550((byte) -128);
        this.field5902 = 256;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILkg;Lae;ILtm;II)V")
    public static final void method2549(int arg0, int arg1, class223 arg2, class285 arg3, int arg4, class195 arg5, int arg6, int arg7) {
        field5913++;
        if (arg3 == null) {
            return;
        }
        int var8;
        if (class28.field402 == 4) {
            var8 = (int) class1.field19 & 0x3FFF;
        } else {
            var8 = (int) class1.field19 + class303.field4429 & 0x3FFF;
        }
        int var9 = Math.max(arg2.field3233 / 2, arg2.field3352 / 2) + 10;
        int var10 = arg1 * arg1 + arg4 * arg4;
        if (var9 * var9 < var10) {
            return;
        }
        int var11 = class327.field4863[var8];
        if (arg0 != -1) {
            return;
        }
        int var12 = class327.field4862[var8];
        if (class28.field402 != 4) {
            var11 = var11 * 256 / (class30.field422 + 256);
            var12 = var12 * 256 / (class30.field422 + 256);
        }
        int var13 = arg4 * var11 + (arg1 * var12) >> 15;
        int var14 = arg4 * var12 - (arg1 * var11) >> 15;
        arg3.method926(arg2.field3233 / 2 + arg6 + var13 - arg3.method1861() / 2, arg2.field3352 / 2 + arg7 + -var14 - arg3.method1860() / 2, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    private final void method2550(byte arg0) {
        field5918++;
        if (arg0 > -127) {
            return;
        }
        this.field5903 += ++this.field5919;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field5912[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field5906 ^= this.field5906 << 13;
                } else {
                    this.field5906 ^= this.field5906 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field5906 ^= this.field5906 << 2;
            } else {
                this.field5906 ^= this.field5906 >>> 16;
            }
            this.field5906 += this.field5912[var2 + 128 & 0xFF];
            int var4;
            this.field5912[var2] = var4 = this.field5906 + this.field5912[class386.method2438(var3 >> 2, 255)] + this.field5903;
            this.field5908[var2] = this.field5903 = var3 + this.field5912[class386.method2438(var4 >> 8, 1020) >> 2];
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lwc;I)V")
    public static final void method2551(class380 arg0, int arg1) {
        field5909++;
        if (arg1 != 2) {
            field5899 = null;
        }
        class138 var2 = (class138) class381.field5600.method609((long) arg0.field777, 56);
        if (var2 == null) {
            return;
        }
        if (var2.field1898 != null) {
            class452.field6671.method278(var2.field1898);
            var2.field1898 = null;
        }
        var2.method1820(-25246);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)I")
    public final int method2552(int arg0) {
        field5916++;
        if (this.field5902 == arg0) {
            this.method2550((byte) -128);
            this.field5902 = 256;
        }
        return this.field5908[this.field5902 - 1];
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Z")
    public static final boolean method2553(int arg0, int arg1) {
        field5917++;
        if (arg1 == 30 || arg1 == 5 || arg1 == 19 || arg1 == 58 || arg1 == 46) {
            return true;
        } else {
            if (arg0 != 2661) {
                method2549(67, 24, (class223) null, (class285) null, 98, (class195) null, -2, 91);
            }
            return arg1 == 59 || arg1 == 1010;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lge;II)Z")
    public static final boolean method2554(class108 arg0, int arg1, int arg2) {
        field5904++;
        int var3 = arg0.method773(2, (byte) -122);
        if (var3 == 0) {
            if (arg0.method773(1, (byte) 92) != 0) {
                method2554(arg0, -1234547605, arg2);
            }
            int var4 = arg0.method773(6, (byte) -122);
            int var5 = arg0.method773(6, (byte) -108);
            boolean var6 = arg0.method773(1, (byte) 103) == 1;
            if (var6) {
                class178.field2491[class367.field5309++] = arg2;
            }
            if (class455.field6731[arg2] != null) {
                throw new RuntimeException("hr:lr");
            }
            class380 var7 = class455.field6731[arg2] = new class380();
            var7.field777 = arg2;
            if (class228.field3433[arg2] != null) {
                var7.method2414(class228.field3433[arg2], -125);
            }
            var7.method437(class465.field6852[arg2], 10);
            var7.field709 = class18.field294[arg2];
            int var8 = class393.field5727[arg2];
            int var9 = var8 >> 28;
            int var10 = (var8 & 0x3FFA64) >> 14;
            var7.field786[0] = field5914[arg2];
            int var11 = var8 & 0xFF;
            var7.field4960 = (byte) var9;
            var7.method2415((byte) 54, (var10 << 6) + var4 - class28.field399, (var11 << 6) + (var5 - class134.field1846));
            var7.field5562 = -1;
            return true;
        } else if (var3 == 1) {
            int var12 = arg0.method773(2, (byte) 104);
            int var13 = class393.field5727[arg2];
            class393.field5727[arg2] = (class386.method2438(3, (var13 >> 28) + var12) << 28) + class386.method2438(var13, 268435455);
            return false;
        } else if (var3 == 2) {
            int var14 = arg0.method773(5, (byte) 54);
            int var15 = var14 >> 3;
            int var16 = var14 & 0x7;
            int var17 = class393.field5727[arg2];
            int var18 = (var17 >> 28) + var15 & 0x3;
            int var19 = var17 >> 14 & 0xFF;
            int var20 = var17 & 0xFF;
            if (var16 == 0) {
                var20--;
                var19--;
            }
            if (var16 == 1) {
                var20--;
            }
            if (var16 == 2) {
                var19++;
                var20--;
            }
            if (var16 == 3) {
                var19--;
            }
            if (var16 == 4) {
                var19++;
            }
            if (var16 == 5) {
                var20++;
                var19--;
            }
            if (var16 == 6) {
                var20++;
            }
            if (var16 == 7) {
                var19++;
                var20++;
            }
            class393.field5727[arg2] = (var19 << 14) + (var18 << 28) + var20;
            return false;
        } else {
            int var21 = arg0.method773(18, (byte) -111);
            int var22 = var21 >> 16;
            int var23 = (var21 & 0xFF83) >> 8;
            int var24 = var21 & 0xFF;
            int var25 = class393.field5727[arg2];
            int var26 = (var25 >> 28) + var22 & 0x3;
            int var27 = (var25 >> 14) + var23 & 0xFF;
            int var28 = var25 + var24 & 0xFF;
            if (arg1 != -1234547605) {
                field5907 = null;
            }
            class393.field5727[arg2] = (var27 << 14) + (var26 << 28) + var28;
            return false;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)V")
    public static final void method2555(int arg0, byte arg1) {
        field5915++;
        class125 var2 = class56.method428(arg0, 10, -3636);
        var2.method847(52);
        if (arg1 != 124) {
            method2554((class108) null, 12, 55);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
    public static void method2556(byte arg0) {
        field5899 = null;
        field5907 = null;
        field5901 = null;
        field5900 = null;
        field5914 = null;
        if (arg0 < 117) {
            field5914 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)I")
    public final int method2557(int arg0) {
        if (arg0 != 1) {
            return -72;
        }
        field5910++;
        if (this.field5902 == 0) {
            this.method2550((byte) -128);
            this.field5902 = 256;
        }
        return this.field5908[--this.field5902];
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    private class411() {
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "([I)V")
    public class411(int[] arg0) {
        this.field5908 = new int[256];
        this.field5912 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field5908[var2] = arg0[var2];
        }
        this.method2548(-42);
    }
}
