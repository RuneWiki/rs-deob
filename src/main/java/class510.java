import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class510 extends Exception {

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "[I")
    public static int[] field7196 = new int[6];

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "Z")
    public static boolean field7197 = true;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "Lan;")
    public static class182 field7198 = new class182(12, 3);

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "Lmq;")
    public static class78 field7199 = new class78(120, -1);

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 9)
    public static void method2937(int arg0) {
        field7196 = null;
        field7198 = null;
        field7199 = null;
        if (arg0 < 57) {
            method2937(-56);
        }
    }
}
