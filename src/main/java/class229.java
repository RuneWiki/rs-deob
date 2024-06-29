import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class229 {

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public int field3635 = -1;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public int field3643 = -1;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "[[B")
    public static byte[][] field3645 = new byte[50][];

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "[I")
    public int[] field3646;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "[[[I")
    public static int[][][] field3641;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
    public static void method1518(int arg0) {
        field3641 = null;
        field3645 = null;
        if (arg0 != -9681) {
            field3641 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lhi;IB)V")
    public final void method1519(class264 arg0, int arg1, byte arg2) {
        while (true) {
            int var4 = arg0.method1779(-61);
            if (var4 == 0) {
                field3640++;
                if (arg2 > -15) {
                    field3641 = null;
                    return;
                }
                return;
            }
            this.method1521(var4, -421, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
    public static final void method1520(byte arg0) {
        field3638++;
        int var1 = 75 % ((51 - arg0) / 47);
        int var2 = 0;
        for (int var3 = 0; var3 < 104; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                if (class172.method1198(var2, var4, true, class273.field4415, var3, (byte) 24)) {
                    var2++;
                }
                if (var2 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILhi;I)V")
    private final void method1521(int arg0, int arg1, class264 arg2, int arg3) {
        field3637++;
        if (arg1 != -421) {
            method1523((class219) null, false, (class219) null, false, -51);
        }
        if (arg0 == 1) {
            this.field3635 = arg2.method1777(-37);
        } else if (arg0 == 2) {
            this.field3646 = new int[arg2.method1779(arg1 + 363)];
            for (int var5 = 0; var5 < this.field3646.length; var5++) {
                this.field3646[var5] = arg2.method1777(-74);
            }
            return;
        } else if (arg0 == 3) {
            this.field3643 = arg2.method1779(-83);
            return;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BII)I")
    public static final int method1522(byte arg0, int arg1, int arg2) {
        field3644++;
        int var3 = class49.method383(arg1 + 91923, 113, arg2 + 45365, 4) + (class49.method383(arg1 + 37821, -112, arg2 + 10294, 2) - 128 >> 1) + (class49.method383(arg1, arg0 + 47, arg2, 1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg0 != -24) {
            field3641 = null;
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lfd;ZLfd;ZI)I")
    public static final int method1523(class219 arg0, boolean arg1, class219 arg2, boolean arg3, int arg4) {
        field3642++;
        if (arg4 == 1) {
            int var5 = arg2.field2629;
            int var6 = arg0.field2629;
            if (!arg3) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return class250.method1652(arg0.method1457(false).field3516, arg2.method1457(false).field3516, 27403, class261.field4147);
        } else if (arg4 == 3) {
            if (arg2.field3509.equals("-")) {
                if (arg0.field3509.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg0.field3509.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class250.method1652(arg0.field3509, arg2.field3509, 27403, class261.field4147);
            }
        } else if (!arg1) {
            return -107;
        } else if (arg4 == 4) {
            if (arg2.method1114(-73)) {
                return arg0.method1114(117) ? 0 : 1;
            } else if (arg0.method1114(-118)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 5) {
            if (arg2.method1115((byte) 109)) {
                return arg0.method1115((byte) 107) ? 0 : 1;
            } else if (arg0.method1115((byte) -61)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 6) {
            if (arg2.method1110(-89)) {
                return arg0.method1110(-84) ? 0 : 1;
            } else if (arg0.method1110(-75)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 != 7) {
            return arg2.field3508 - arg0.field3508;
        } else if (arg2.method1113(119)) {
            return arg0.method1113(-107) ? 0 : 1;
        } else if (arg0.method1113(-127)) {
            return -1;
        } else {
            return 0;
        }
    }
}
