import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class157 {

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Lhe;")
    public static class54 field3581 = class6.method58("Nehmen", false);

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Lhe;")
    public static class54 field3576 = null;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lhe;")
    public static class54 field3579 = class6.method58("Fps:", false);

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "Lhe;")
    private static class54 field3583 = class6.method58("Cancel", false);

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "[I")
    public static int[] field3574 = new int[500];

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Lhe;")
    public static class54 field3575 = field3583;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "Lhe;")
    public static class54 field3586 = class6.method58("<col=ffff00>", false);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static final void method1205(byte arg0) {
        if (arg0 > -65) {
            field3581 = null;
        }
        field3582++;
        class13.field358 = new class130();
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
    public static void method1206(byte arg0) {
        field3574 = null;
        field3579 = null;
        field3586 = null;
        field3576 = null;
        if (arg0 < 13) {
            method1207(false, 70);
        }
        field3581 = null;
        field3583 = null;
        field3575 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1207(boolean arg0, int arg1) {
        field3585++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            if (arg0) {
                method1205((byte) 72);
            }
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)I")
    public static final int method1208(int arg0, int arg1, int arg2) {
        field3584++;
        if (arg1 >= -30) {
            field3575 = null;
        }
        int var3 = arg0 >>> 31;
        return (arg0 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIILm;IIII)V")
    public static final void method1209(int arg0, int arg1, int arg2, class83 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 != -105) {
            method1209(-108, -72, -54, null, -111, 32, -17, 87);
        }
        if (arg1 >= 0 && arg1 < 104 && arg2 >= 0 && arg2 < 104) {
            class87.field2152[arg0][arg1][arg2] = 0;
            while (true) {
                int var8 = arg3.method638(0);
                if (var8 == 0) {
                    if (arg0 == 0) {
                        class141.field3211[0][arg1][arg2] = -class138.method1071(arg4 + arg2 + 556238, arg5 + -5501, arg1 + arg6 + 932731) * 8;
                    } else {
                        class141.field3211[arg0][arg1][arg2] = class141.field3211[arg0 - 1][arg1][arg2] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg3.method638(0);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg0 == 0) {
                        class141.field3211[0][arg1][arg2] = -var9 * 8;
                    } else {
                        class141.field3211[arg0][arg1][arg2] = class141.field3211[arg0 - 1][arg1][arg2] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class118.field2760[arg0][arg1][arg2] = arg3.method651(45);
                    class84.field2085[arg0][arg1][arg2] = (byte) ((var8 - 2) / 4);
                    class84.field2096[arg0][arg1][arg2] = (byte) class118.method887(var8 + arg7 - 2, 3);
                } else if (var8 <= 81) {
                    class87.field2152[arg0][arg1][arg2] = (byte) (var8 - 49);
                } else {
                    class27.field728[arg0][arg1][arg2] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg3.method638(0);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg3.method638(arg5 + 105);
                    break;
                }
                if (var10 <= 49) {
                    arg3.method638(0);
                }
            }
        }
        field3578++;
    }
}
