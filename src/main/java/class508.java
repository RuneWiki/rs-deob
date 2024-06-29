import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class508 {

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "Z")
    public static boolean field7056 = false;

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "I")
    public static int field7057 = 0;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "Luu;")
    public static class237 field7054;

    @OriginalMember(owner = "client!maa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7055++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V")
    public static void method3050(int arg0) {
        if (arg0 != 16827) {
            method3050(-109);
        }
        field7054 = null;
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(II)V")
    public class508(int arg0, int arg1) {
    }
}
