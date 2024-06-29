import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class264 {

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    private int field3683 = 0;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Lec;")
    private class129 field3681;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lpl;")
    private class390 field3679;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field3685;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BII)V", line = 7)
    public static final void method1724(byte arg0, int arg1, int arg2) {
        int var3 = 56 % ((34 - arg0) / 62);
        field3680++;
        class239 var4 = class436.method2740(1, arg2, -323285792);
        var4.method1622(-109);
        var4.field3399 = arg1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Lpl;", line = 25)
    public final class390 method1725(int arg0) {
        field3688++;
        if (this.field3683 > 0 && this.field3681.field1824[this.field3683 - 1] != this.field3679) {
            class390 var2 = this.field3679;
            this.field3679 = var2.field5597;
            return var2;
        }
        while (this.field3681.field1809 > this.field3683) {
            class390 var4 = this.field3681.field1824[this.field3683++].field5597;
            if (this.field3681.field1824[this.field3683 - 1] != var4) {
                this.field3679 = var4.field5597;
                return var4;
            }
        }
        int var3 = -106 % ((11 - arg0) / 45);
        return null;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 60)
    public static void method1726(int arg0) {
        if (arg0 == 0) {
            field3685 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lec;)V", line = 72)
    public class264(class129 arg0) {
        this.field3681 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)Lpl;", line = 81)
    public final class390 method1727(int arg0) {
        field3686++;
        this.field3683 = arg0;
        return this.method1725(arg0 ^ 0x7C);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIZIILkh;Z)V", line = 90)
    public static final void method1728(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, class11 arg10, boolean arg11) {
        if (arg2 == 1) {
            arg5 = 1;
        } else if (arg2 == 2) {
            arg6 = 1;
            arg5 = 1;
        } else if (arg2 == 3) {
            arg6 = 1;
        }
        field3682++;
        if (arg1 <= 9) {
            method1726(-33);
        }
        if (arg9 < 0 || class211.field2954 <= arg9 || arg0 < 0 || arg0 >= class290.field4061) {
            while (true) {
                int var14 = arg10.method172((byte) 52);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg10.method172((byte) 52);
                    return;
                }
                if (var14 <= 49) {
                    arg10.method172((byte) 52);
                }
            }
        }
        if (!arg11 && !arg7) {
            class368.field5193[arg3][arg9][arg0] = 0;
        }
        while (true) {
            int var12 = arg10.method172((byte) 52);
            if (var12 == 0) {
                if (arg11) {
                    class57.field783[0][arg6 + arg9][arg0 + arg5] = class418.field5939[0].method737(arg9 + arg6, arg0 + arg5);
                    return;
                } else if (arg3 == 0) {
                    class57.field783[0][arg6 + arg9][arg0 + arg5] = -class404.method2532(2048, arg8 + 556238, 932731 - -arg4) * 8;
                    return;
                } else {
                    class57.field783[arg3][arg6 + arg9][arg0 + arg5] = class57.field783[arg3 - 1][arg9 + arg6][arg0 + arg5] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg10.method172((byte) 52);
                if (!arg11) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg3 == 0) {
                        class57.field783[0][arg6 + arg9][arg0 + arg5] = -var13 * 8;
                        return;
                    }
                    class57.field783[arg3][arg6 + arg9][arg0 + arg5] = class57.field783[arg3 - 1][arg9 + arg6][arg0 + arg5] - (var13 * 8);
                    return;
                }
                class57.field783[0][arg6 + arg9][arg0 + arg5] = var13 * 8 + class418.field5939[0].method737(arg6 + arg9, arg0 + arg5);
                return;
            }
            if (var12 <= 49) {
                if (arg7) {
                    arg10.method172((byte) 52);
                } else {
                    class277.field3882[arg3][arg9][arg0] = arg10.method162(-4436);
                    class290.field4074[arg3][arg9][arg0] = (byte) ((var12 - 2) / 4);
                    class65.field968[arg3][arg9][arg0] = (byte) class387.method2454(var12 + arg2 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!arg11 && !arg7) {
                    class368.field5193[arg3][arg9][arg0] = (byte) (var12 - 49);
                }
            } else if (!arg7) {
                class414.field5879[arg3][arg9][arg0] = (byte) (var12 - 81);
            }
        }
    }
}
