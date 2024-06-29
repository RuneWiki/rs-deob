import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class class314 {

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Lok;")
    public static class41 field5294 = class137.method956(" weitere Optionen", 45);

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field5298 = 0;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field5305 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Lok;")
    public static class41 field5296 = class137.method956("0(U", 45);

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public int field5290;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public int field5291;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public int field5292;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public int field5300;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public int field5304;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public int field5306;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lmh;")
    public static class65 field5289;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "[I")
    public static int[] field5288;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "[I")
    public static int[] field5297;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "[[[B")
    public static byte[][][] field5301;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZ)I", line = 18)
    public static final int method2169(int arg0, boolean arg1) {
        field5299++;
        if (arg0 <= 126) {
            return 17;
        }
        long var2 = class247.method1762(19166);
        for (class248 var4 = arg1 ? (class248) class16.field206.method609(108) : (class248) class16.field206.method616(4); var4 != null; var4 = (class248) class16.field206.method616(-126)) {
            if (var2 > (var4.field3961 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field3961 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field844;
                    class60.field885[var5] = class268.field4291[var5];
                    var4.method418(6971);
                    return var5;
                }
                var4.method418(6971);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLmh;)V", line = 62)
    public static final void method2170(byte arg0, class65 arg1) {
        field5303++;
        class46.field723 = arg1.method476(class306.field5119, (byte) -4);
        if (arg0 >= -101) {
            method2171(-53, -67, (byte) -11);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIB)I", line = 76)
    public static final int method2171(int arg0, int arg1, byte arg2) {
        field5293++;
        if (arg2 != -92) {
            return -128;
        }
        if (arg0 < arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIZ)Lok;", line = 114)
    public static final class41 method2172(int arg0, int arg1, int arg2, boolean arg3) {
        field5302++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var4 = arg0 / arg2;
        int var5 = 1;
        while (var4 != 0) {
            var5++;
            var4 /= arg2;
        }
        int var6 = var5;
        if (arg0 < 0 || arg3) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        if (arg1 != -10) {
            field5296 = (class41) null;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = arg0 % arg2;
            if (var9 < 0) {
                var9 = -var9;
            }
            arg0 /= arg2;
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class41 var10 = new class41();
        var10.field617 = var6;
        var10.field660 = var7;
        return var10;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 185)
    public static void method2173(int arg0) {
        field5288 = null;
        field5301 = (byte[][][]) null;
        if (arg0 != 0) {
            field5301 = (byte[][][]) ((byte[][][]) null);
        }
        field5297 = null;
        field5289 = null;
        field5294 = null;
        field5296 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIIILth;IZJ)Z", line = 202)
    public static final boolean method2174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class126 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class278.field4548 == class184.field3008;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class272.field4434 || var16 >= class65.field996) {
                    return false;
                }
                class308 var17 = class205.field3312[arg0][var15][var16];
                if (var17 != null && var17.field5193 >= 5) {
                    return false;
                }
            }
        }
        class232 var18 = new class232();
        var18.field3672 = arg11;
        var18.field3667 = arg0;
        var18.field3658 = arg5;
        var18.field3664 = arg6;
        var18.field3659 = arg7;
        var18.field3674 = arg8;
        var18.field3662 = arg9;
        var18.field3668 = arg1;
        var18.field3665 = arg2;
        var18.field3673 = arg1 + arg3 - 1;
        var18.field3676 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class205.field3312[var22][var19][var20] == null) {
                        class205.field3312[var22][var19][var20] = new class308(var22, var19, var20);
                    }
                }
                class308 var23 = class205.field3312[arg0][var19][var20];
                var23.field5201[var23.field5193] = var18;
                var23.field5195[var23.field5193] = var21;
                var23.field5191 |= var21;
                var23.field5193++;
                if (var13 && class208.field3365[var19][var20] != 0) {
                    var14 = class208.field3365[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class208.field3365[var24][var25] == 0) {
                        class208.field3365[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class241.field3857[class234.field3732++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)V", line = 320)
    public static final void method2175(int arg0, int arg1, int arg2) {
        field5295++;
        class268.field4291[arg2] = arg1;
        if (arg0 != 4) {
            field5301 = (byte[][][]) ((byte[][][]) null);
        }
        class248 var3 = (class248) class16.field206.method617((long) arg2, false);
        if (var3 == null) {
            class248 var4 = new class248(4611686018427387905L);
            class16.field206.method610(90, var4, (long) arg2);
        } else if (var3.field3961 != 4611686018427387905L) {
            var3.field3961 = class247.method1762(19166) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V")
    public abstract void method44(int arg0, int arg1);

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(III)V")
    public abstract void method43(int arg0, int arg1, int arg2);
}
