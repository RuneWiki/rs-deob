import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class161 extends class530 {

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "Z")
    private boolean field2233 = true;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "Lju;")
    public static class102 field2234 = new class102(22, -1);

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "[I")
    public static int[] field2235 = new int[3];

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(II)V")
    public final void method70(int arg0, int arg1) {
        super.field7419 = arg0;
        ++field2225;
        if (arg1 >= -38) {
            this.field2233 = false;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        ++field2227;
        if (arg0) {
            if (!super.field7418.method2254((byte) -58).method1890(30589)) {
                super.field7419 = 0;
            }
            if (super.field7419 < 0 || super.field7419 > 5) {
                super.field7419 = this.method74(0);
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        ++field2226;
        if (!super.field7418.method2254((byte) -58).method1890(30589)) {
            return 3;
        } else {
            int var3 = -87 / ((arg1 - 63) / 60);
            return 2;
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(ILah;)V")
    public class161(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)Z")
    public final boolean method1005(int arg0) {
        if (arg0 >= -65) {
            field2234 = null;
        }
        ++field2231;
        return this.field2233;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lah;)V")
    public class161(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)I")
    public final int method74(int arg0) {
        ++field2232;
        if (!super.field7418.method2254((byte) -58).method1890(30589)) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.method73(false);
            }
            return 2;
        }
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)I")
    public final int method1006(int arg0) {
        if (arg0 != 0) {
            return -75;
        } else {
            ++field2228;
            return super.field7419;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZI)V")
    public final void method1007(boolean arg0, int arg1) {
        if (arg1 == 0) {
            ++field2229;
            this.field2233 = arg0;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1008(String arg0, int arg1) {
        ++field2230;
        if (arg0 == null) {
            return false;
        } else if (arg1 > -106) {
            return true;
        } else {
            for (int var2 = 0; var2 < class713.field10110; ++var2) {
                if (arg0.equalsIgnoreCase(class570.field8079[var2])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(class473.field6483.field9272);
        }
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)V")
    public static void method1009(int arg0) {
        field2234 = null;
        field2235 = null;
        if (arg0 != 0) {
            method1008((String) null, 114);
        }
    }
}
