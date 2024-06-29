import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class221 {

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "[Lvg;")
    private class8[] field3546;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Z")
    public static boolean field3548 = false;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3550 = "Loaded title screen";

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "[[Log;")
    public static class157[][] field3547;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V", line = 34)
    public static void method1579(byte arg0) {
        if (arg0 != 17) {
            field3550 = (String) null;
        }
        field3550 = null;
        field3547 = (class157[][]) null;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V", line = 43)
    public class221(int arg0) {
        this.field3546 = new class8[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class8 var3 = this.field3546[var2] = new class8();
            var3.field115 = var3;
            var3.field114 = var3;
        }
    }
}
