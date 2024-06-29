import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class83 {

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Lqe;")
    public class116 field2061 = new class116();

    @OriginalMember(owner = "client!m", name = "b", descriptor = "[I")
    public static int[] field2055 = new int[] { 36, 43, 49, 25, 50, 58, 29, 18 };

    @OriginalMember(owner = "client!m", name = "j", descriptor = "[I")
    public static int[] field2063 = new int[] { 0, 0, 0, -2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 8, 0, 4, 0, 0, 0, 0, 0, 0, 15, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 6, 0, 7, 0, 5, 3, 0, 0, 0, 0, -2, 0, 0, 0, -1, 0, 0, 0, 3, 0, 0, 0, 0, 11, 0, 6, 3, 0, 6, 2, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 4, 0, 11, 0, 0, 0, -2, 0, -1, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 4, 0, 4, 0, 0, 0, 8, 5, 2, 0, 0, 0, 0, 0, 0, 2, -2, 2, 2, 0, 0, 6, -2, 6, 0, 0, 0, 0, 0, 6, 12, 0, 0, 2, 0, -1, 0, 0, 6, 0, 0, 0, 0, 4, 3, 0, 0, 7, 0, 14, 0, 0, 0, -2, 0, 0, 0, 0, 6, 0, -2, 0, 0, 0, 2, -2, 0, 0, 10, 0, 0, 4, 0, 0, -2, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 5, 0, 6, 6, 0, 0, 0, 0, 0, 6, 0, 0, -2, 24, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, -2, 0, 0, 0 };

    @OriginalMember(owner = "client!m", name = "s", descriptor = "Lic;")
    public static class59 field2072 = class59.method433(0, "<)4col>");

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "Lqe;")
    private class116 field2071;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "Ldd;")
    public static class26 field2070;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Lmd;")
    public static class87 field2062;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "Z")
    public static boolean field2067;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLqe;)V")
    public final void method679(boolean arg0, class116 arg1) {
        if (arg1.field2731 != null) {
            arg1.method929(108);
        }
        arg1.field2733 = this.field2061.field2733;
        field2056++;
        arg1.field2731 = this.field2061;
        if (!arg0) {
            field2072 = null;
        }
        arg1.field2731.field2733 = arg1;
        arg1.field2733.field2731 = arg1;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public final void method680(int arg0) {
        int var2 = -90 / ((-arg0 - 35) / 55);
        field2065++;
        while (true) {
            class116 var3 = this.field2061.field2733;
            if (this.field2061 == var3) {
                return;
            }
            var3.method929(104);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)Z")
    public static final boolean method681(int arg0, int arg1) {
        field2054++;
        if (arg0 != 0) {
            return false;
        } else if (arg1 < 0) {
            return false;
        } else {
            int var2 = class53.field1324[arg1];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1004;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)Lqe;")
    public final class116 method682(int arg0) {
        if (arg0 != 0) {
            field2072 = null;
        }
        field2069++;
        class116 var2 = this.field2061.field2733;
        if (this.field2061 == var2) {
            this.field2071 = null;
            return null;
        } else {
            this.field2071 = var2.field2733;
            return var2;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)Lqe;")
    public final class116 method683(boolean arg0) {
        field2060++;
        if (!arg0) {
            field2070 = null;
        }
        class116 var2 = this.field2061.field2731;
        if (this.field2061 == var2) {
            return null;
        } else {
            var2.method929(107);
            return var2;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)Lqe;")
    public final class116 method684(byte arg0) {
        field2059++;
        if (arg0 != -65) {
            field2067 = false;
        }
        class116 var2 = this.field2071;
        if (this.field2061 == var2) {
            this.field2071 = null;
            return null;
        } else {
            this.field2071 = var2.field2733;
            return var2;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILqe;Lqe;)V")
    public final void method685(int arg0, class116 arg1, class116 arg2) {
        field2068++;
        if (arg2.field2731 != null) {
            arg2.method929(123);
        }
        arg2.field2731 = arg1.field2731;
        arg2.field2733 = arg1;
        if (arg0 != 17488) {
            field2072 = null;
        }
        arg2.field2731.field2733 = arg2;
        arg2.field2733.field2731 = arg2;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)V")
    public static void method686(boolean arg0) {
        field2072 = null;
        field2062 = null;
        field2070 = null;
        field2063 = null;
        if (!arg0) {
            field2055 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)Lqe;")
    public final class116 method687(byte arg0) {
        if (arg0 < 108) {
            field2063 = null;
        }
        field2058++;
        class116 var2 = this.field2061.field2731;
        if (this.field2061 == var2) {
            this.field2071 = null;
            return null;
        } else {
            this.field2071 = var2.field2731;
            return var2;
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)Lqe;")
    public final class116 method688(int arg0) {
        field2064++;
        class116 var2 = this.field2071;
        if (this.field2061 == var2) {
            this.field2071 = null;
            return null;
        } else {
            this.field2071 = var2.field2731;
            return arg0 == 23497 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lqe;B)V")
    public final void method689(class116 arg0, byte arg1) {
        field2057++;
        if (arg0.field2731 != null) {
            arg0.method929(124);
        }
        arg0.field2731 = this.field2061.field2731;
        arg0.field2733 = this.field2061;
        arg0.field2731.field2733 = arg0;
        arg0.field2733.field2731 = arg0;
        int var3 = -69 / ((arg1 + 87) / 36);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII[Lkd;II[BLq;I)V")
    public static final void method690(int arg0, int arg1, int arg2, int arg3, int arg4, class73[] arg5, int arg6, int arg7, byte[] arg8, class111 arg9, int arg10) {
        if (arg10 != 25) {
            return;
        }
        class157 var11 = new class157(arg8);
        field2066++;
        int var12 = -1;
        while (true) {
            int var13 = var11.method1171(-32768);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1171(arg10 - 32793);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 6 & 0x3F;
                int var17 = var14 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method1194(false);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg4 == var18 && var16 >= arg6 && arg6 + 8 > var16 && arg1 <= var17 && var17 < arg1 + 8) {
                    class19 var22 = class53.method397(var12, 13415);
                    int var23 = class84.method693(var22.field418, var16 & 0x7, var20, var17 & 0x7, true, arg0, var22.field434) + arg7;
                    int var24 = arg2 + class3.method15(var17 & 0x7, arg0, 5210, var16 & 0x7, var22.field418, var22.field434, var20);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg3;
                        if ((class121.field2785[1][var23][var24] & 0x2) == 2) {
                            var25 = arg3 - 1;
                        }
                        class73 var26 = null;
                        if (var25 >= 0) {
                            var26 = arg5[var25];
                        }
                        class21.method120(arg0 + var20 & 0x3, var12, arg3, var21, arg9, var24, var26, var23, 10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)Lqe;")
    public final class116 method691(int arg0) {
        field2073++;
        if (arg0 != 0) {
            return null;
        }
        class116 var2 = this.field2061.field2733;
        if (this.field2061 == var2) {
            return null;
        } else {
            var2.method929(107);
            return var2;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class83() {
        this.field2061.field2731 = this.field2061;
        this.field2061.field2733 = this.field2061;
    }
}
