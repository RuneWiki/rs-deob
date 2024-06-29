import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class235 {

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Luf;")
    public static class417 field3311 = new class417();

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Ldb;")
    public static class298 field3312 = new class298(62, -1);

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "[I")
    public static int[] field3314 = new int[2];

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "F")
    public static float field3315;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Lbi;")
    public static class449 field3313;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method1466(int arg0) {
        field3313 = null;
        field3311 = null;
        if (arg0 != -1) {
            method1466(113);
        }
        field3312 = null;
        field3314 = null;
    }

    @OriginalMember(owner = "client!kf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3310++;
        throw new IllegalStateException();
    }
}
