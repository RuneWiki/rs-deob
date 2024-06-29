import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class615 extends class539 {

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Ljava/lang/String;")
    public String field8520;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Lfc;")
    public static class235 field8522 = new class235(49, -1);

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public static int field8521;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IJ)V")
    public static final void method3401(int arg0, long arg1) {
        try {
            if (arg0 != -1) {
                method3401(-1, -89L);
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field8521++;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    public class615() {
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method3402(byte arg0) {
        if (arg0 != 113) {
            field8522 = null;
        }
        field8522 = null;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class615(String arg0) {
        this.field8520 = arg0;
    }
}
