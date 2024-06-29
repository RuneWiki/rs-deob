import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class737 {

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "[I")
    public static int[] field9925 = new int[1024];

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "Lmu;")
    public static class303 field9926 = new class303(54, 4);

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "Z")
    public static boolean field9928 = false;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field9927;

    @OriginalMember(owner = "client!kn", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field9927++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V", line = 15)
    public static void method4054(byte arg0) {
        field9926 = null;
        field9925 = null;
        if (arg0 < 87) {
            method4054((byte) -102);
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(II)V", line = 28)
    public class737(int arg0, int arg1) {
    }
}
