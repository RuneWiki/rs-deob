import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class189 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2976 = "flash1:";

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2979 = "wave:";

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lnc;")
    public static class85 field2980 = new class85();

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field2984 = 100;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field2985 = 0;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Ldl;")
    public static class123 field2981;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method1328(int arg0) {
        field2981 = null;
        field2979 = null;
        field2976 = null;
        if (arg0 != -14) {
            field2980 = null;
        }
        field2980 = null;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static final void method1329(int arg0) {
        if (class262.field4243 == null || class216.field3527 == null) {
            class216.field3527 = new int[256];
            class262.field4243 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class262.field4243[var1] = (int) (Math.sin(var2) * 4096.0D);
                class216.field3527[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field2977++;
        if (arg0 != 21822) {
            field2982 = -76;
        }
    }
}
