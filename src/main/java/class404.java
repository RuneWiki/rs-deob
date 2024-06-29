import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class404 {

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "I")
    public static int field5807 = -1;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "Lmh;")
    public static class145 field5802 = new class145("", 17);

    @OriginalMember(owner = "client!hba", name = "i", descriptor = "Z")
    public static boolean field5808 = false;

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "F")
    public static float field5804;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!hba", name = "j", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!hba", name = "toString", descriptor = "()Ljava/lang/String;", line = 11)
    public final String toString() {
        field5806++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(JI)V", line = 20)
    public static final void method2419(long arg0, int arg1) {
        field5805++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 > -53) {
            method2419(95L, -18);
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIII)V", line = 34)
    public static final void method2420(int arg0, int arg1, int arg2, int arg3) {
        field5803++;
        if (arg0 == 1008) {
            class330.method2078(class498.field7481, arg3, arg1);
        } else if (arg0 == 1009) {
            class330.method2078(class41.field465, arg3, arg1);
        } else if (arg0 == 1004) {
            class330.method2078(class422.field6051, arg3, arg1);
        } else if (arg0 == 1003) {
            class330.method2078(class646.field9381, arg3, arg1);
        } else if (arg0 == 1007) {
            class330.method2078(class218.field3225, arg3, arg1);
        }
        if (arg2 != 1007) {
            field5809 = 113;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(BI)Z", line = 70)
    public static final boolean method2421(byte arg0, int arg1) {
        if (arg0 == -121) {
            field5801++;
            return arg1 == 6 || arg1 == 8;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V", line = 91)
    public static void method2422(int arg0) {
        field5802 = null;
        if (arg0 != -1803) {
            field5802 = null;
        }
    }
}
