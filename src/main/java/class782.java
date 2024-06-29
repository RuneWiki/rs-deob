import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fja")
public class class782 {

    @OriginalMember(owner = "client!fja", name = "d", descriptor = "J")
    public long field10765;

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "Log;")
    private class673 field10762;

    @OriginalMember(owner = "client!fja", name = "b", descriptor = "I")
    public static int field10763;

    @OriginalMember(owner = "client!fja", name = "c", descriptor = "I")
    public static int field10764;

    @OriginalMember(owner = "client!fja", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        this.field10762.method3815(this.field10765, 0);
        field10764++;
        super.finalize();
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(II)V", line = 16)
    public static final void method4287(int arg0, int arg1) {
        field10763++;
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        class211.field3063 = arg0;
        class785.field10786 = new class24[class380.field5456[class211.field3063] + 1];
        class261.field3685 = 0;
        class494.field7012 = arg1;
    }

    @OriginalMember(owner = "client!fja", name = "<init>", descriptor = "(Log;J[Lut;)V", line = 32)
    public class782(class673 arg0, long arg1, class134[] arg2) {
        this.field10765 = arg1;
        this.field10762 = arg0;
    }
}
