import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class421 extends RuntimeException {

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Ljava/lang/String;")
    public String field5867;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field5865;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field5868 = 0;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Lcb;")
    public static class318 field5866 = new class318(7, -2);

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Lrh;")
    public static class59 field5871 = new class59();

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field5873 = 0;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Ljj;")
    public static class398 field5872 = new class398(14, 8);

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "[I")
    public static int[] field5869;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "[[Lfca;")
    public static class188[][] field5864;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BII)V")
    public static final void method2441(byte arg0, int arg1, int arg2) {
        if (arg0 != 33) {
            method2442(false);
        }
        field5870++;
        class19 var3 = class364.method2236(1248116640, arg2, 7);
        var3.method110(12142);
        var3.field171 = arg1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
    public static void method2442(boolean arg0) {
        field5872 = null;
        if (!arg0) {
            field5873 = -85;
        }
        field5864 = null;
        field5869 = null;
        field5866 = null;
        field5871 = null;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class421(Throwable arg0, String arg1) {
        this.field5867 = arg1;
        this.field5865 = arg0;
    }
}
