import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class558 {

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "Lok;")
    private class228 field7881;

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "J")
    public long field7878;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "I")
    public static int field7877 = 0;

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "Lpu;")
    public static class522 field7879;

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "Ljava/lang/String;")
    public static String field7882;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V", line = 5)
    public static void method3193(int arg0) {
        if (arg0 != 0) {
            method3193(81);
        }
        field7882 = null;
        field7879 = null;
    }

    @OriginalMember(owner = "client!kfa", name = "finalize", descriptor = "()V", line = 25)
    protected final void finalize() throws Throwable {
        field7880++;
        this.field7881.method1551(true, this.field7878);
        super.finalize();
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lok;JI)V", line = 33)
    public class558(class228 arg0, long arg1, int arg2) {
        this.field7881 = arg0;
        this.field7878 = arg1;
    }
}
