import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class314 {

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "Ljw;")
    public static class581 field4520 = new class581(115, -1);

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "Lgea;")
    public static class81 field4522 = null;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "[I")
    public static int[] field4525 = new int[5];

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V", line = 4)
    public static void method1978(byte arg0) {
        field4525 = null;
        if (arg0 >= 94) {
            field4520 = null;
            field4522 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljp;I)Lgu;", line = 17)
    public static final class607 method1979(class376 arg0, int arg1) {
        if (arg1 != -1) {
            field4522 = null;
        }
        field4521++;
        return new class607(arg0.method2355(3), arg0.method2355(3), arg0.method2355(arg1 + 4), arg0.method2355(3), arg0.method2373(arg1 + 1223262425), arg0.method2398(-1372747256));
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILjava/lang/String;)V", line = 33)
    public static final void method1980(int arg0, String arg1) {
        System.out.println("Error: " + class176.method1244("\n", arg1, -8560, "%0a"));
        if (arg0 < 5) {
            field4525 = null;
        }
        field4519++;
    }

    @OriginalMember(owner = "client!eo", name = "toString", descriptor = "()Ljava/lang/String;", line = 44)
    public final String toString() {
        field4524++;
        throw new IllegalStateException();
    }
}
