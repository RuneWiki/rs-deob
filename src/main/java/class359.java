import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class359 extends class207 {

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "[[Z")
    public static boolean[][] field5224 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "[[I")
    public static int[][] field5228 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IB)V", line = 3)
    public final void method41(int arg0, byte arg1) {
        if (arg1 < -7) {
            ++field5220;
            super.field2669 = arg0;
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lrd;)V", line = 14)
    public class359(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)I", line = 17)
    public final int method36(int arg0) {
        ++field5221;
        if (arg0 > -14) {
            this.method36(-8);
        }
        return 1;
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(ILrd;)V", line = 31)
    public class359(int arg0, class355 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)Leq;", line = 38)
    public static final class224 method2275(int arg0, int arg1, int arg2) {
        ++field5227;
        if (arg2 <= 106) {
            method2278((class539) null, true);
        }
        class224 var3 = new class224();
        var3.field2912 = -1;
        var3.field2903 = arg1 + 6;
        var3.field2911 = arg0 + 5 + 1;
        var3.field2896 = -1;
        var3.field2908 = new int[var3.field2903][var3.field2911];
        var3.method1425(-1);
        return var3;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V", line = 58)
    public final void method37(int arg0) {
        int var2 = -92 / ((-58 - arg0) / 48);
        ++field5222;
        if (~super.field2669 != -2 && ~super.field2669 != -1) {
            super.field2669 = this.method36(-120);
        }
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)I", line = 73)
    public final int method2276(int arg0) {
        ++field5223;
        if (arg0 != 43) {
            this.method37(98);
        }
        return super.field2669;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(IB)I", line = 85)
    public final int method39(int arg0, byte arg1) {
        ++field5226;
        return arg1 != 69 ? 31 : 1;
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)V", line = 99)
    public static void method2277(int arg0) {
        if (arg0 <= 115) {
            method2277(-13);
        }
        field5228 = null;
        field5224 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lnga;Z)Z", line = 112)
    public static final boolean method2278(class539 arg0, boolean arg1) {
        boolean var2 = class737.field10008 == class645.field8694;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method771(32082);
        if (arg0.field7466 >= 0 && arg0.field7467 >= 0 && arg0.field7455 < class196.field2540 && arg0.field7453 < class247.field3229) {
            short var6 = 0;
            for (int var7 = arg0.field7466; var7 <= arg0.field7455; ++var7) {
                for (int var11 = arg0.field7467; var11 <= arg0.field7453; ++var11) {
                    class194 var12 = class782.method4289(arg0.field2813, var7, var11);
                    if (var12 != null) {
                        class511 var13 = class687.method3770(arg0, -48);
                        class511 var14 = var12.field2525;
                        if (var14 == null) {
                            var12.field2525 = var13;
                        } else {
                            while (var14.field7127 != null) {
                                var14 = var14.field7127;
                            }
                            var14.field7127 = var13;
                        }
                        if (var2 && (class455.field6521[var7][var11] & -16777216) != 0) {
                            var3 = class455.field6521[var7][var11];
                            var4 = class43.field462[var7][var11];
                            var5 = class456.field6537[var7][var11];
                        }
                        if (!arg1 && var12.field2519 != null && var12.field2519.field8518 > var6) {
                            var6 = var12.field2519.field8518;
                        }
                    }
                }
            }
            if (var2 && (var3 & -16777216) != 0) {
                for (int var8 = arg0.field7466; var8 <= arg0.field7455; ++var8) {
                    for (int var9 = arg0.field7467; var9 <= arg0.field7453; ++var9) {
                        if ((class455.field6521[var8][var9] & -16777216) == 0) {
                            class455.field6521[var8][var9] = var3;
                            class43.field462[var8][var9] = var4;
                            class456.field6537[var8][var9] = var5;
                        }
                    }
                }
            }
            if (arg1) {
                class281.field4062[class25.field250++] = arg0;
            } else {
                int var10 = class737.field10008 == class645.field8694 ? 1 : 0;
                if (arg0.method769(-122)) {
                    if (arg0.method777(-99)) {
                        arg0.field2808 = class151.field2056[var10];
                        class151.field2056[var10] = arg0;
                    } else {
                        arg0.field2808 = class737.field10005[var10];
                        class737.field10005[var10] = arg0;
                        class132.field1818 = true;
                    }
                } else {
                    arg0.field2808 = class570.field7774[var10];
                    class570.field7774[var10] = arg0;
                }
            }
            if (arg1) {
                arg0.field2815 -= var6;
            }
            return true;
        } else {
            return false;
        }
    }
}
