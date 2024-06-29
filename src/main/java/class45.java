import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class45 implements Runnable {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Z")
    public boolean field649 = true;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field652 = new Object();

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "[I")
    public int[] field656 = new int[500];

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public int field657 = 0;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "[I")
    public int[] field660 = new int[500];

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "[I")
    public static int[] field648 = new int[5];

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "[S")
    public static short[] field653 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Lcc;")
    public static class216 field651 = new class216(100);

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field658 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method337(int arg0) {
        field648 = null;
        field651 = null;
        field658 = null;
        field653 = null;
        if (arg0 != -2) {
            field658 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZIIIIIIILv;IIZ)V")
    public static final void method338(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class152 arg8, int arg9, int arg10, boolean arg11) {
        if (arg9 != 4276) {
            return;
        }
        field654++;
        if (arg1 < 0 || arg1 >= 104 || arg5 < 0 || arg5 >= 104) {
            while (true) {
                int var14 = arg8.method1111(255);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg8.method1111(255);
                    return;
                }
                if (var14 <= 49) {
                    arg8.method1111(255);
                }
            }
        }
        if (!arg0 && !arg11) {
            class86.field1277[arg4][arg1][arg5] = 0;
        }
        while (true) {
            int var12 = arg8.method1111(arg9 ^ 0x104B);
            if (var12 == 0) {
                if (arg0) {
                    class220.field3533[0][arg1 + arg2][arg5 + arg7] = class169.field2724[0][arg1 + arg2][arg5 + arg7];
                    return;
                } else if (arg4 == 0) {
                    class220.field3533[0][arg1 + arg2][arg5 + arg7] = -class53.method403(arg10 + 932731, false, arg6 + 556238) * 8;
                    return;
                } else {
                    class220.field3533[arg4][arg1 + arg2][arg5 + arg7] = class220.field3533[arg4 - 1][arg1 + arg2][arg5 + arg7] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg8.method1111(arg9 ^ 0x104B);
                if (!arg0) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg4 == 0) {
                        class220.field3533[0][arg1 + arg2][arg5 + arg7] = -var13 * 8;
                        return;
                    }
                    class220.field3533[arg4][arg1 + arg2][arg5 + arg7] = class220.field3533[arg4 - 1][arg1 + arg2][arg5 + arg7] - (var13 * 8);
                    return;
                }
                class220.field3533[0][arg1 + arg2][arg5 + arg7] = var13 * 8 + class169.field2724[0][arg1 + arg2][arg5 + arg7];
                return;
            }
            if (var12 <= 49) {
                if (arg11) {
                    arg8.method1111(arg9 - 4021);
                } else {
                    class163.field2647[arg4][arg1][arg5] = arg8.method1092((byte) -62);
                    class145.field2371[arg4][arg1][arg5] = (byte) ((var12 - 2) / 4);
                    class240.field3832[arg4][arg1][arg5] = (byte) class179.method1337(arg3 + var12 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!arg0 && !arg11) {
                    class86.field1277[arg4][arg1][arg5] = (byte) (var12 - 49);
                }
            } else if (!arg11) {
                class94.field1402[arg4][arg1][arg5] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)J")
    public static final long method339(int arg0) {
        if (arg0 != 500) {
            method338(true, -112, 93, -115, -52, 55, 114, 95, (class152) null, -20, -107, false);
        }
        field650++;
        return class85.field1236.method912(arg0 + 11104);
    }

    @OriginalMember(owner = "client!sd", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field649) {
            Object var1 = this.field652;
            synchronized (this.field652) {
                if (this.field657 < 500) {
                    this.field660[this.field657] = class169.field2731;
                    this.field656[this.field657] = class296.field4680;
                    this.field657++;
                }
            }
            class43.method324(50L, -96);
        }
        field659++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != 0) {
            return;
        }
        if (class272.field4374 <= arg0 && class211.field3386 >= arg6 && class207.field3328 <= arg5 && class228.field3657 >= arg3) {
            class148.method1054(arg2, arg1 + 29, arg5, arg3, arg6, arg4, arg0, arg7);
        } else {
            class240.method1682(arg0, arg2, arg5, arg3, arg7, arg4, arg6, -6384);
        }
        field655++;
    }
}
