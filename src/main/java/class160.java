import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class160 extends class5 {

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public int field2088;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "Z")
    public static boolean field2089 = true;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "Lwi;")
    public static class330 field2086 = new class330(32);

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "Low;")
    public static class234 field2087;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(JZ)V", line = 5)
    public static final void method1038(long arg0, boolean arg1) {
        field2084++;
        if (arg1) {
            method1039(-76);
        }
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 21)
    public static void method1039(int arg0) {
        field2087 = null;
        field2086 = null;
        if (arg0 < 27) {
            field2089 = false;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V", line = 45)
    public class160() {
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I)V", line = 47)
    public class160(int arg0) {
        this.field2088 = arg0;
    }
}
