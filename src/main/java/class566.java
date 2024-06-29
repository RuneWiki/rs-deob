import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class566 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public int field7095;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[I")
    public static int[] field7096 = new int[1];

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIILwv;II)V", line = 5)
    public static final void method3005(int arg0, int arg1, int arg2, int arg3, class32 arg4, int arg5, int arg6) {
        field7099++;
        if (arg6 != 27313) {
            field7096 = null;
        }
        class632.method3546(arg4.field8018, arg2, 0, arg4.field8011, arg3, 12673, arg1, arg4.field8010, arg5, arg0);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 17)
    public static void method3006(byte arg0) {
        field7096 = null;
        if (arg0 >= -2) {
            field7096 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)Lmc;", line = 27)
    public static final class124 method3007(byte arg0) {
        field7097++;
        if (arg0 >= -100) {
            field7096 = null;
        }
        return class340.field4346 == 0 ? new class124() : class504.field6294[--class340.field4346];
    }

    @OriginalMember(owner = "client!cf", name = "toString", descriptor = "()Ljava/lang/String;", line = 44)
    public final String toString() {
        field7098++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lun;", line = 52)
    public static final class391 method3008(int arg0) {
        field7100++;
        try {
            return new class121();
        } catch (Throwable var2) {
            if (arg0 != 0) {
                method3006((byte) 1);
            }
            try {
                return (class391) Class.forName("cc").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class600();
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(II)V", line = 84)
    public class566(int arg0, int arg1) {
        this.field7095 = arg0;
    }
}
