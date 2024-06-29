import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class161 {

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public int field2682 = 0;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field2674 = 0;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2672 = "wave2:";

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2683 = "Loading sprites - ";

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2679 = " has logged out.";

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLeh;)V")
    public final void method1092(byte arg0, class101 arg1) {
        while (true) {
            int var3 = arg1.method669((byte) 36);
            if (var3 == 0) {
                if (arg0 > -90) {
                    return;
                }
                field2671++;
                return;
            }
            this.method1095(18891, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)V")
    public static final void method1093(byte arg0, int arg1) {
        field2678++;
        class169.field2791 = null;
        if (arg0 >= -59) {
            method1097(36, (byte) -107);
        }
        class90.field1588 = -1;
        class122.field2151 = false;
        class82.field1503 = -1;
        class268.field4330 = arg1;
        class146.field2484 = 1;
        class286.field4533 = 0;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(BI)V")
    public static final void method1094(byte arg0, int arg1) {
        field2677++;
        class168.field2783.method63(0, arg1);
        class139.field2397.method63(0, arg1);
        if (arg0 != -94) {
            field2681 = -95;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILeh;)V")
    private final void method1095(int arg0, int arg1, class101 arg2) {
        if (arg1 == 5) {
            this.field2682 = arg2.method677(false);
        }
        if (arg0 == 18891) {
            field2675++;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
    public static void method1096(boolean arg0) {
        field2679 = null;
        if (arg0) {
            method1094((byte) 116, -89);
        }
        field2683 = null;
        field2672 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)V")
    public static final void method1097(int arg0, byte arg1) {
        field2680++;
        class239.field3925.method63(0, arg0);
        class153.field2549.method63(0, arg0);
        if (arg1 >= -6) {
            field2681 = 60;
        }
        class189.field3067.method63(0, arg0);
        class264.field4291.method63(0, arg0);
    }
}
