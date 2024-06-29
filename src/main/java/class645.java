import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class645 {

    @OriginalMember(owner = "client!iga", name = "h", descriptor = "I")
    public int field9072 = 1;

    @OriginalMember(owner = "client!iga", name = "i", descriptor = "Lrga;")
    public static class280 field9073 = new class280(45, 1);

    @OriginalMember(owner = "client!iga", name = "j", descriptor = "Lae;")
    public static class40 field9074 = new class40();

    @OriginalMember(owner = "client!iga", name = "k", descriptor = "Z")
    public static boolean field9075 = false;

    @OriginalMember(owner = "client!iga", name = "e", descriptor = "C")
    public char field9069;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "I")
    public static int field9066;

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "I")
    public static int field9067;

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "I")
    public static int field9068;

    @OriginalMember(owner = "client!iga", name = "f", descriptor = "I")
    public static int field9070;

    @OriginalMember(owner = "client!iga", name = "g", descriptor = "Lf;")
    public static class536 field9071;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)V", line = 3)
    public static void method3600(int arg0) {
        if (arg0 != 81) {
            method3604(null, null, false);
        }
        field9074 = null;
        field9073 = null;
        field9071 = null;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZILes;)V", line = 16)
    private final void method3601(boolean arg0, int arg1, class630 arg2) {
        if (arg1 == 1) {
            this.field9069 = class670.method3763((byte) 115, arg2.method3480(-20933));
        } else if (arg1 == 2) {
            this.field9072 = 0;
        }
        field9068++;
        if (arg0) {
            method3603(-33);
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(BLes;)V", line = 39)
    public final void method3602(byte arg0, class630 arg1) {
        if (arg0 < 59) {
            field9073 = null;
        }
        while (true) {
            int var3 = arg1.method3501(-9268);
            if (var3 == 0) {
                field9065++;
                return;
            }
            this.method3601(false, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(I)V", line = 62)
    public static final void method3603(int arg0) {
        field9070++;
        if (arg0 != 2) {
            method3603(-113);
        }
        class368 var1 = (class368) class403.field5058.method237(93);
        boolean var2 = class358.field4562 != null || class373.field4707 > 0;
        if (var2) {
            class19.field287 = 1;
        }
        if (class267.field3381 && class277.field3470.method448((byte) -68, 81) && class463.field5904 > 2) {
            if (var2) {
                class480.field6386 = (class145) class1.field7.field541.field4196.field4196;
            } else {
                class161.method929(arg0 - 2, var1.method439(true), (class145) class1.field7.field541.field4196.field4196, var1.method437(arg0 + 7));
            }
        } else if (var2) {
            class480.field6386 = (class145) class1.field7.field541.field4196;
        } else {
            class161.method929(0, var1.method439(true), (class145) class1.field7.field541.field4196, var1.method437(9));
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(Ljava/awt/Frame;Lrj;Z)V", line = 108)
    public static final void method3604(Frame arg0, class648 arg1, boolean arg2) {
        field9067++;
        while (true) {
            class264 var3 = arg1.method3643(arg0, (byte) -36);
            while (var3.field3358 == 0) {
                class419.method2233(-28448, 10L);
            }
            if (var3.field3358 == 1) {
                arg0.setVisible(arg2);
                arg0.dispose();
                return;
            }
            class419.method2233(-28448, 100L);
        }
    }
}
