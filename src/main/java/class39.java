import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public abstract class class39 extends class132 {

    @OriginalMember(owner = "client!gs", name = "z", descriptor = "Z")
    public volatile boolean field792 = true;

    @OriginalMember(owner = "client!gs", name = "C", descriptor = "Lcba;")
    public static class471 field795 = new class471(40, -1);

    @OriginalMember(owner = "client!gs", name = "A", descriptor = "Lao;")
    public static class240 field793;

    @OriginalMember(owner = "client!gs", name = "y", descriptor = "Z")
    public boolean field791;

    @OriginalMember(owner = "client!gs", name = "B", descriptor = "Z")
    public boolean field794;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
    public static void method409(int arg0) {
        if (arg0 <= -83) {
            field793 = null;
            field795 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)[B")
    public abstract byte[] method410(int arg0);

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "(I)I")
    public abstract int method411(int arg0);
}
