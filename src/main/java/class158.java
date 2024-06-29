import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class158 {

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Lrh;")
    public static class46 field2431 = new class46();

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2432 = "";

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Z")
    public static boolean field2437 = false;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field2436 = 0;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method1063(int arg0) {
        field2431 = null;
        if (arg0 != 0) {
            method1063(-75);
        }
        field2432 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Llj;I)Lsb;")
    public static final class224 method1064(class25 arg0, int arg1) {
        arg0.method201(255);
        if (arg1 != 26582) {
            method1064((class25) null, 110);
        }
        field2428++;
        int var2 = arg0.method201(arg1 ^ 0x6729);
        class224 var3 = class17.method116((byte) -8, var2);
        var3.field3629 = arg0.method201(arg1 ^ 0x6729);
        int var4 = arg0.method201(255);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method201(arg1 - 26327);
            var3.method16(arg0, var6, (byte) -81);
        }
        var3.method18(-28);
        return var3;
    }
}
