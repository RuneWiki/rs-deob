import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class510 {

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "J")
    public long field7111;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Lep;")
    private class371 field7108;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "S")
    public static short field7113 = 205;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field7110;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Lhh;")
    public static class529 field7114;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "[I")
    public static int[] field7112;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)Lrea;", line = 5)
    public static final class120 method3041(int arg0) {
        if (arg0 < 37) {
            field7114 = null;
        }
        field7110++;
        class120 var1 = class538.method3213(334);
        var1.field1656 = 0;
        var1.field1655 = null;
        var1.field1653 = new class583(5000);
        return var1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)V", line = 21)
    public static final void method3042(int arg0, int arg1, byte arg2) {
        if (class559.field7945 == 1) {
            class541.method3220(class717.field10138, true, arg1, arg0);
        } else if (class559.field7945 == 2) {
            if (class264.field3595) {
                class82.method487(22351, arg1 + class142.method934((byte) -88), arg0 - -class468.method2788(false));
            } else {
                class82.method487(22351, arg1, arg0);
            }
        }
        if (arg2 > -78) {
            method3041(-73);
        }
        field7107++;
        class717.field10138 = null;
        class559.field7945 = 0;
    }

    @OriginalMember(owner = "client!ee", name = "finalize", descriptor = "()V", line = 49)
    protected final void finalize() throws Throwable {
        this.field7108.method2120(6408, this.field7111);
        field7115++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V", line = 60)
    public static void method3043(byte arg0) {
        field7114 = null;
        field7112 = null;
        if (arg0 != 21) {
            method3041(-28);
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lep;JI)V", line = 79)
    public class510(class371 arg0, long arg1, int arg2) {
        this.field7111 = arg1;
        this.field7108 = arg0;
    }
}
