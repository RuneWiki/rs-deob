import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class684 extends class266 {

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Z")
    private boolean field9623 = false;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field9621 = 2;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field9620;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field9622;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field9624;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field9625;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field9626;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field9627;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field9629;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "[I")
    public static int[] field9628;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)Z", line = 5)
    public final boolean method154(int arg0) {
        ++field9627;
        if (arg0 <= 101) {
            this.field9623 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)V", line = 16)
    public static void method3771(int arg0) {
        field9628 = null;
        if (arg0 <= 104) {
            method3771(-34);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lek;IB)V", line = 27)
    public final void method150(class467 arg0, int arg1, byte arg2) {
        super.field3785.method3232(false, arg0);
        if (arg2 > -56) {
            this.method148(82, true);
        }
        ++field9629;
        super.field3785.method3229(arg1, 12);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLjava/lang/String;)V", line = 45)
    public static final void method3772(byte arg0, String arg1) {
        ++field9626;
        if (arg1 != null) {
            if ((class372.field5293 < 200 || class206.field3037) && ~class372.field5293 > -201) {
                String var3 = class200.method1347((byte) -126, arg1);
                if (var3 != null) {
                    for (int var4 = 0; var4 < class372.field5293; ++var4) {
                        String var9 = class200.method1347((byte) -105, class129.field1779[var4]);
                        if (var9 != null && var9.equals(var3)) {
                            class235.method1482(4, 24658, arg1 + class9.field172.method42(class666.field9377, 19572));
                            return;
                        }
                        if (class460.field6515[var4] != null) {
                            String var10 = class200.method1347((byte) -122, class460.field6515[var4]);
                            if (var10 != null && var10.equals(var3)) {
                                class235.method1482(4, 24658, arg1 + class9.field172.method42(class666.field9377, 19572));
                                return;
                            }
                        }
                    }
                    for (int var5 = 0; ~class261.field3711 < ~var5; ++var5) {
                        String var7 = class200.method1347((byte) -117, client.field3854[var5]);
                        if (var7 != null && var7.equals(var3)) {
                            class235.method1482(4, 24658, class9.field177.method42(class666.field9377, 19572) + arg1 + class9.field178.method42(class666.field9377, 19572));
                            return;
                        }
                        if (class325.field4809[var5] != null) {
                            String var8 = class200.method1347((byte) -115, class325.field4809[var5]);
                            if (var8 != null && var8.equals(var3)) {
                                class235.method1482(4, 24658, class9.field177.method42(class666.field9377, 19572) + arg1 + class9.field178.method42(class666.field9377, 19572));
                                return;
                            }
                        }
                    }
                    if (class200.method1347((byte) -105, class253.field3576.field3975).equals(var3)) {
                        class235.method1482(4, 24658, class9.field175.method42(class666.field9377, 19572));
                    } else {
                        ++class630.field8792;
                        class1.method5(1, class172.field2577);
                        class288.field4014.method746((byte) -100, class499.method2790(arg1, 119));
                        int var6 = 45 % ((arg0 - 3) / 54);
                        class288.field4014.method708(-126, arg1);
                    }
                }
            } else {
                class235.method1482(4, 24658, class9.field97.method42(class666.field9377, 19572));
                String var2 = class9.field98.method42(class666.field9377, 19572);
                if (var2 != null) {
                    class235.method1482(4, 24658, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(IZ)V", line = 147)
    public final void method144(int arg0, boolean arg1) {
        if (arg0 != 1) {
            field9628 = null;
        }
        ++field9624;
        super.field3785.method3193(class137.field1929, class24.field325, 0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V", line = 159)
    public final void method156(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field9628 = null;
        }
        ++field9622;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lgj;)V", line = 173)
    public class684(class580 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V", line = 177)
    public final void method155(boolean arg0) {
        ++field9620;
        if (this.field9623) {
            super.field3785.method3220(1, -23809);
            super.field3785.method286(class570.field7657, 9762);
            super.field3785.method3193(class137.field1929, class137.field1929, 0);
            super.field3785.method3177(2, 66, class22.field305);
            super.field3785.method3235(class558.field7530, -12912, 0);
            super.field3785.method3198((byte) -87);
            super.field3785.method3232(false, (class467) null);
            super.field3785.method3220(0, -23809);
            this.field9623 = false;
        } else {
            super.field3785.method3235(class558.field7530, -12912, 0);
        }
        super.field3785.method3193(class137.field1929, class137.field1929, 0);
        if (arg0) {
            field9628 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)V", line = 203)
    public final void method148(int arg0, boolean arg1) {
        if (arg0 != 0) {
            field9628 = null;
        }
        ++field9625;
        class300 var3 = super.field3785.method3253((byte) 4);
        if (var3 != null && arg1) {
            super.field3785.method3220(1, arg0 + -23809);
            super.field3785.method3232(false, var3);
            super.field3785.method286(class209.field3087, arg0 ^ 9762);
            super.field3785.method3220(1, -23809);
            super.field3785.method3193(class175.field2614, class24.field325, 0);
            super.field3785.method316(false, class85.field1174, true, 2, false);
            super.field3785.method3235(class391.field5472, -12912, 0);
            class367 var4 = super.field3785.method3204(112);
            var4.method2161(super.field3785.method3191(arg0 ^ -123), (byte) -85);
            super.field3785.method3201(-17, class625.field8725);
            super.field3785.method3220(0, arg0 + -23809);
            this.field9623 = true;
        } else {
            super.field3785.method3235(class391.field5472, -12912, 0);
        }
    }
}
