import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class14 {

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "[I")
    private int[] field214;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "[I")
    private int[] field208;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field195 = 0;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "Ljava/lang/String;")
    public static String field210 = " is already on your friend list.";

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    public static int field211 = 1;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    private int field201;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Lfa;")
    public static class273 field205;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "[B")
    public static byte[] field197;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method85(int arg0) {
        field197 = null;
        if (arg0 != -32491) {
            field211 = -41;
        }
        field205 = null;
        field210 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIILfa;)Lea;")
    public static final class38 method86(int arg0, int arg1, int arg2, class273 arg3) {
        field207++;
        if (class163.method1081(0, arg3, arg0, arg1)) {
            int var4 = -10 % ((10 - arg2) / 32);
            return class295.method2058(-113);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIZI)V")
    public static final void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        if (!arg6) {
            field198++;
            if (class235.method1632(59, arg4)) {
                client.method1094(class283.field4741[arg4], -1, arg3, arg0, arg7, arg2, arg5, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    private final void method88(int arg0) {
        field194++;
        if (arg0 != 421739312) {
            return;
        }
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
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var5 + var63;
            int var65 = var6 + var61;
            int var66 = var7 + var65;
            int var67 = var66 ^ var65 << 8;
            int var68 = var64 + var65;
            var6 = var68 ^ var64 >>> 16;
            int var69 = var4 + var67;
            int var70 = var64 + var69;
            int var71 = var3 + var6;
            var5 = var70 ^ var69 << 10;
            int var72 = var69 + var71;
            var4 = var72 ^ var71 >>> 4;
            int var73 = var4 + var61;
            int var74 = var2 + var5;
            int var75 = var71 + var74;
            var3 = var75 ^ var74 << 8;
            var8 = var3 + var63;
            int var76 = var73 + var74;
            var2 = var76 ^ var73 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var73;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field208[var11 + 6] + var3;
            int var38 = this.field208[var11 + 7] + var2;
            int var39 = this.field208[var11] + var9;
            int var40 = this.field208[var11 + 3] + var6;
            int var41 = this.field208[var11 + 5] + var4;
            int var42 = this.field208[var11 + 4] + var5;
            int var43 = this.field208[var11 + 2] + var7;
            int var44 = this.field208[var11 + 1] + var8;
            int var45 = var39 ^ var44 << 11;
            int var46 = var43 + var44;
            int var47 = var40 + var45;
            int var48 = var46 ^ var43 >>> 2;
            int var49 = var43 + var47;
            int var50 = var42 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var47 + var50;
            int var53 = var41 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var50 + var53;
            var5 = var54 ^ var53 << 10;
            int var55 = var6 + var37;
            int var56 = var53 + var55;
            int var57 = var5 + var38;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var57;
            var3 = var59 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            this.field214[var11] = var9;
            this.field214[var11 + 1] = var8;
            var7 = var2 + var51;
            this.field214[var11 + 2] = var7;
            this.field214[var11 + 3] = var6;
            this.field214[var11 + 4] = var5;
            this.field214[var11 + 5] = var4;
            this.field214[var11 + 6] = var3;
            this.field214[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field214[var12 + 4] + var5;
            int var14 = this.field214[var12 + 1] + var8;
            int var15 = this.field214[var12] + var9;
            int var16 = var15 ^ var14 << 11;
            int var17 = this.field214[var12 + 6] + var3;
            int var18 = this.field214[var12 + 2] + var7;
            int var19 = this.field214[var12 + 3] + var6;
            int var20 = this.field214[var12 + 7] + var2;
            int var21 = var14 + var18;
            int var22 = var16 + var19;
            int var23 = var21 ^ var18 >>> 2;
            int var24 = var13 + var23;
            int var25 = this.field214[var12 + 5] + var4;
            int var26 = var18 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var24;
            int var29 = var25 + var27;
            var6 = var28 ^ var24 >>> 16;
            int var30 = var24 + var29;
            var5 = var30 ^ var29 << 10;
            int var31 = var5 + var20;
            int var32 = var6 + var17;
            int var33 = var29 + var32;
            var4 = var33 ^ var32 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var16;
            var3 = var34 ^ var31 << 8;
            var8 = var3 + var23;
            int var36 = var31 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field214[var12] = var9;
            this.field214[var12 + 1] = var8;
            this.field214[var12 + 2] = var7;
            this.field214[var12 + 3] = var6;
            this.field214[var12 + 4] = var5;
            this.field214[var12 + 5] = var4;
            this.field214[var12 + 6] = var3;
            this.field214[var12 + 7] = var2;
        }
        this.method89(-116);
        this.field196 = 256;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
    private final void method89(int arg0) {
        field209++;
        int var2 = 44 % ((arg0 + 3) / 60);
        this.field200 += ++this.field201;
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = this.field214[var3];
            if ((var3 & 0x2) == 0) {
                if ((var3 & 0x1) == 0) {
                    this.field213 ^= this.field213 << 13;
                } else {
                    this.field213 ^= this.field213 >>> 6;
                }
            } else if ((var3 & 0x1) == 0) {
                this.field213 ^= this.field213 << 2;
            } else {
                this.field213 ^= this.field213 >>> 16;
            }
            this.field213 += this.field214[var3 + 128 & 0xFF];
            int var5;
            this.field214[var3] = var5 = this.field200 + this.field214[class10.method53(1020, var4) >> 2] + this.field213;
            this.field208[var3] = this.field200 = var4 + this.field214[class10.method53(var5 >> 8, 1020) >> 2];
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)Ls;")
    public static final class261 method90(int arg0, int arg1) {
        if (arg0 < 121) {
            field211 = 25;
        }
        class261 var2 = (class261) class140.field2161.method149((byte) -105, (long) arg1);
        field202++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class171.field2649.method1877(arg1, 32, (byte) 57);
        class261 var4 = new class261();
        if (var3 != null) {
            var4.method1806(new class202(var3), (byte) 66);
        }
        var4.method1811(-4667);
        class140.field2161.method152(var4, (long) arg1, true);
        return var4;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method91(byte arg0, String arg1) {
        field199++;
        int var2 = arg1.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        if (arg0 <= 28) {
            method85(124);
        }
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class307.method2098(false, var6);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)Lgf;")
    public static final class132 method92(int arg0, boolean arg1) {
        if (arg1) {
            method96(80, (class254) null);
        }
        field193++;
        class132 var2 = (class132) class218.field3482.method149((byte) -72, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class252.field3989.method1877(class124.method822(53, arg0), class126.method838(arg0, (byte) 70), (byte) 105);
        class132 var4 = new class132();
        var4.field2053 = arg0;
        if (var3 != null) {
            var4.method896(new class202(var3), false);
        }
        var4.method890(-1);
        if (var4.field2068 != -1) {
            var4.method894(method92(var4.field2068, false), (byte) -86, method92(var4.field2094, arg1));
        }
        if (var4.field2087 != -1) {
            var4.method885(method92(var4.field2045, false), method92(var4.field2087, false), (byte) -11);
        }
        if (!class103.field1552 && var4.field2077) {
            var4.field2073 = 0;
            var4.field2086 = false;
            var4.field2044 = class147.field2311;
            var4.field2071 = class29.field373;
            var4.field2093 = class105.field1577;
        }
        class218.field3482.method152(var4, (long) arg0, true);
        return var4;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)I")
    public final int method93(boolean arg0) {
        field204++;
        if (arg0) {
            this.method93(false);
        }
        if ((this.field196--) == 0) {
            this.method89(-77);
            this.field196 = 255;
        }
        return this.field208[this.field196];
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIILkk;)V")
    public static final void method94(int arg0, int arg1, int arg2, int arg3, class254 arg4) {
        field212++;
        if (arg2 != 2013) {
            field210 = null;
        }
        if (class76.field1196 >= 3) {
            class62.method396(arg3, arg0, 0, arg4.field4193, arg4.field4092);
        } else {
            ((class38) class60.field922).method240(arg3, arg0, arg4.field4085, arg4.field4152, class60.field922.field4830 / 2, class60.field922.field4833 / 2, (int) class202.field3253, 256, arg4.field4193, arg4.field4092);
        }
        class241.field3799[arg1] = true;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIZIIIIIIII)V")
    public static final void method95(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field192++;
        class297 var13 = new class297();
        var13.field4878 = arg6;
        var13.field4891 = arg3;
        var13.field4883 = arg2;
        var13.field4892 = arg5;
        var13.field4882 = arg12;
        var13.field4880 = arg11;
        var13.field4888 = arg0;
        var13.field4877 = arg7;
        var13.field4894 = arg9;
        var13.field4884 = arg8;
        var13.field4881 = arg1;
        if (arg4) {
            method92(-126, false);
        }
        var13.field4890 = arg10;
        class301.field4938.method1952(var13, 76);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILkk;)Z")
    public static final boolean method96(int arg0, class254 arg1) {
        field203++;
        if (arg1.field4034 == null) {
            return false;
        }
        if (arg0 != 2) {
            method85(-103);
        }
        for (int var2 = 0; var2 < arg1.field4034.length; var2++) {
            int var3 = class256.method1790(arg1, var2, 0);
            int var4 = arg1.field4192[var2];
            if (arg1.field4034[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field4034[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field4034[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
    private class14() {
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "([I)V")
    public class14(int[] arg0) {
        this.field214 = new int[256];
        this.field208 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field208[var2] = arg0[var2];
        }
        this.method88(421739312);
    }
}
