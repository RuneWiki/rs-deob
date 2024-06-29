import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class320 {

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field4511 = 0;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "[Lmb;")
    public static class262[] field4513 = new class262[5];

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "[I")
    public static int[] field4514;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static void method2033(byte arg0) {
        if (arg0 > 97) {
            field4513 = null;
            field4514 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < field4513.length; var0++) {
            field4513[var0] = new class262();
        }
        field4514 = new int[2048];
    }
}
