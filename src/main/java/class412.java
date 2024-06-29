import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class412 {

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "Z")
    public boolean field5818 = true;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "Lkn;")
    public static class530 field5827 = new class530("K", "T", "K", "K");

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "[I")
    public static int[] field5828 = new int[14];

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "C")
    private char field5825;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public int field5823;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "Lrp;")
    public static class305 field5829;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "Ljava/lang/String;")
    public String field5821;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)I", line = 3)
    public static final int method2439(boolean arg0) {
        field5826++;
        if (!arg0) {
            field5828 = null;
        }
        return class450.field6300;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IBLwm;)V", line = 15)
    public static final void method2440(int arg0, byte arg1, class403 arg2) {
        if (arg1 > 0) {
            method2444((byte) -28);
        }
        field5830++;
        if (class454.field6372 == null) {
            return;
        }
        try {
            class454.field6372.method44(0L, -30985);
            class454.field6372.method39(24, arg0, arg2.field5663, -1);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(Z)Lti;", line = 41)
    public static final class309 method2441(boolean arg0) {
        if (arg0) {
            field5828 = null;
        }
        field5822++;
        return class245.field3547;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lwm;Z)V", line = 53)
    public final void method2442(class403 arg0, boolean arg1) {
        field5819++;
        if (!arg1) {
            method2444((byte) 72);
        }
        while (true) {
            int var3 = arg0.method2357((byte) 111);
            if (var3 == 0) {
                return;
            }
            this.method2445(!arg1, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)Z", line = 76)
    public final boolean method2443(int arg0) {
        if (arg0 == 115) {
            field5824++;
            return this.field5825 == 's';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V", line = 87)
    public static void method2444(byte arg0) {
        field5829 = null;
        if (arg0 != -93) {
            field5828 = null;
        }
        field5828 = null;
        field5827 = null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZLwm;I)V", line = 101)
    private final void method2445(boolean arg0, class403 arg1, int arg2) {
        field5820++;
        if (arg2 == 1) {
            this.field5825 = class120.method805(arg1.method2359(119), (byte) -35);
        } else if (arg2 == 2) {
            this.field5823 = arg1.method2319((byte) 102);
        } else if (arg2 == 4) {
            this.field5818 = false;
        } else if (arg2 == 5) {
            this.field5821 = arg1.method2356(-25178);
        }
        if (arg0) {
            this.field5818 = false;
        }
    }
}
