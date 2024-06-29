import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class432 extends class530 {

    @OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
    public static int field5938 = 0;

    @OriginalMember(owner = "client!sca", name = "g", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!sca", name = "h", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!sca", name = "i", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!sca", name = "j", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!sca", name = "l", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!sca", name = "m", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!sca", name = "n", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        ++field5934;
        if (!arg0) {
            field5938 = 68;
        }
        if (~super.field7418.method2254((byte) -58).method1895(1) > -97) {
            super.field7419 = 0;
        }
        if (super.field7419 < 0 || super.field7419 > 2) {
            super.field7419 = this.method74(0);
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)I")
    public final int method74(int arg0) {
        if (arg0 != 0) {
            return -76;
        } else {
            ++field5935;
            return super.field7418.method2254((byte) -58).method1895(1) < 96 ? 0 : 2;
        }
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)I")
    public static final int method2608(int arg0) {
        if (arg0 != 0) {
            field5938 = -23;
        }
        ++field5940;
        return class132.field1789;
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(II)V")
    public final void method70(int arg0, int arg1) {
        super.field7419 = arg0;
        ++field5936;
        if (arg1 < -38) {
            class8.method37(true, super.field7419);
        }
    }

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "(I)I")
    public final int method2609(int arg0) {
        if (arg0 != 0) {
            this.method73(false);
        }
        ++field5939;
        return super.field7419;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        ++field5937;
        int var3 = -54 / ((63 - arg1) / 60);
        return super.field7418.method2254((byte) -58).method1895(1) < 96 ? 3 : 1;
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(Z)Z")
    public final boolean method2610(boolean arg0) {
        ++field5941;
        if (~super.field7418.method2254((byte) -58).method1895(1) > -97) {
            return false;
        } else {
            if (!arg0) {
                field5938 = 89;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lah;)V")
    public class432(class374 arg0) {
        super(arg0);
        class8.method37(true, super.field7419);
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(ILah;)V")
    public class432(int arg0, class374 arg1) {
        super(arg0, arg1);
        class8.method37(true, super.field7419);
    }
}
