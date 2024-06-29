import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public class class194 extends class766 {

    @OriginalMember(owner = "client!cka", name = "n", descriptor = "J")
    public long field2906;

    @OriginalMember(owner = "client!cka", name = "o", descriptor = "I")
    public static int field2907 = 0;

    @OriginalMember(owner = "client!cka", name = "p", descriptor = "Lgga;")
    public static class513 field2908;

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(II)I", line = 3)
    public static int method1380(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(B)V", line = 11)
    public static void method1381(byte arg0) {
        field2908 = null;
        int var1 = 43 % ((3 - arg0) / 60);
    }

    @OriginalMember(owner = "client!cka", name = "<init>", descriptor = "()V", line = 26)
    public class194() {
    }

    @OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(J)V", line = 29)
    public class194(long arg0) {
        this.field2906 = arg0;
    }
}
