import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class641 {

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "Ldea;")
    public static class205 field9319 = new class205(32);

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "Z")
    public static boolean field9320 = true;

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "I")
    public static int field9321;

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "I")
    public static int field9322;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)V")
    public static void method3702(int arg0) {
        field9319 = null;
        if (arg0 != 65535) {
            field9321 = -77;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(II)V")
    public static final void method3703(int arg0, int arg1) {
        if (arg0 != 912387760) {
            field9321 = 83;
        }
        for (class176 var2 = class259.field3603.method1248(arg0 ^ 0xC99E114F); var2 != null; var2 = class259.field3603.method1245((byte) 95)) {
            if ((var2.field2524 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method1117(arg0 ^ 0x3661EEB0);
            }
        }
        field9322++;
    }
}
