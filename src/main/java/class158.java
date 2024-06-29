import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class158 {

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "Z")
    public static boolean field2388 = false;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Lob;")
    public static class521 field2385 = new class521(27, 15);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public int field2383;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public int field2384;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public int field2386;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public int field2387;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1085(String arg0, int arg1) {
        field2382++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 == 32311) {
            for (int var4 = 0; var4 < var2; var4++) {
                var3 = (var3 << 5) - (var3 - arg0.charAt(var4));
            }
            return var3;
        } else {
            return 116;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method1086(int arg0) {
        field2385 = null;
        if (arg0 >= -74) {
            method1086(8);
        }
    }
}
