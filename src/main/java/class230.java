import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class230 {

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
    public int field3253;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "[I")
    public int[] field3250;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "[I")
    public int[] field3248;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "Llg;")
    public static class237 field3251 = new class237(64);

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "[I")
    public static int[] field3254 = new int[32];

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3258 = null;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "Lse;")
    public static class138 field3256 = new class138(64);

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "Lir;")
    public static class19 field3255;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
    public static void method1530(int arg0) {
        field3251 = null;
        if (arg0 == 20241) {
            field3255 = null;
            field3258 = null;
            field3256 = null;
            field3254 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
    public static final void method1531(byte arg0) {
        class237 var1 = class254.field3653;
        synchronized (class254.field3653) {
            if (arg0 != -13) {
                return;
            }
            class254.field3653.method1618(0);
        }
        field3249++;
        class237 var2 = class43.field534;
        synchronized (class43.field534) {
            class43.field534.method1618(0);
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(I)V")
    public class230(int arg0) {
        this.field3253 = arg0;
        this.field3250 = new int[this.field3253];
        this.field3248 = new int[this.field3253];
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ltq;Ltq;I)V")
    public static final void method1532(class376 arg0, class376 arg1, int arg2) {
        if (arg2 >= 97) {
            class435.field6273 = arg1;
            class337.field4792 = arg0;
            field3257++;
        }
    }
}
