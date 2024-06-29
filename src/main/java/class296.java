import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public abstract class class296 {

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "I")
    public int field3919;

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "I")
    public int field3920;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "I")
    public int field3918;

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "Lwh;")
    public static class546 field3921 = new class546(64);

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V")
    public static void method1745(byte arg0) {
        field3921 = null;
        if (arg0 >= -40) {
            field3921 = null;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(BII)V")
    public abstract void method136(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IBI)V")
    public abstract void method135(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(III)V")
    public class296(int arg0, int arg1, int arg2) {
        this.field3919 = arg1;
        this.field3920 = arg0;
        this.field3918 = arg2;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(III)V")
    public abstract void method134(int arg0, int arg1, int arg2);
}
