import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class503 {

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field6962 = 1;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "[Lpfa;")
    public static class313[] field6968 = new class313[128];

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "Lwga;")
    public static class779 field6966 = new class779();

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field6972 = 0;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "Lhv;")
    public static class546 field6971 = new class546(0, 1);

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "B")
    public static byte field6965;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field6960;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field6963;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field6964;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "Lgk;")
    public class503 field6967;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "Lgk;")
    public class503 field6970;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "[I")
    public static int[] field6969;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "[Lwea;")
    public static class167[] field6961;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2920(boolean arg0) {
        field6961 = null;
        field6971 = null;
        field6969 = null;
        field6966 = null;
        if (arg0) {
            field6965 = -66;
        }
        field6968 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZ)V", line = 18)
    public static final void method2921(int arg0, boolean arg1) {
        class152.method1121((byte) -110, class140.field2048, class593.field8019, class69.field968, arg1);
        if (arg0 >= -35) {
            field6972 = 26;
        }
        field6959++;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 34)
    public final void method2922(byte arg0) {
        field6960++;
        if (this.field6967 == null) {
            return;
        }
        this.field6967.field6970 = this.field6970;
        if (arg0 > -71) {
            field6966 = null;
        }
        this.field6970.field6967 = this.field6967;
        this.field6967 = null;
        this.field6970 = null;
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(I)V", line = 61)
    public static final void method2923(int arg0) {
        class645.method3581(0);
        field6963++;
        class155.method1133(2, class712.field9959.field1296.method4127(40) == 1, (byte) 0, 22050);
        class558.field7520 = class549.method3114(16036, class706.field9894, 0, class730.field10124, 22050);
        class706.method3961(class466.method2754(null, arg0 - 126), 52, true);
        class268.field3953 = class549.method3114(16036, class706.field9894, arg0, class730.field10124, 2048);
        class268.field3953.method1263(class686.field9647, (byte) -116);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLel;)Z", line = 74)
    public static final boolean method2924(byte arg0, class574 arg1) {
        field6964++;
        if (arg1 == null) {
            return false;
        } else {
            if (arg0 != 58) {
                field6965 = 0;
            }
            return class600.method3337(arg1.field7717, arg1.field7711 - arg1.field7717, arg1.field7709 - arg1.field7716, arg1.field7714 - arg1.field7701, -7515, arg1.field7716, arg1.field7701);
        }
    }
}
