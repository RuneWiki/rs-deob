import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class5 extends class115 {

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public int field118 = 0;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "Z")
    public static volatile boolean field114 = false;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    public static int field119 = 0;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "Lrb;")
    public static class254 field115 = new class254(64);

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public static int field120 = 0;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    public static void method20(int arg0) {
        field115 = null;
        if (arg0 != 0) {
            method20(126);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lnj;Z)V")
    public final void method21(class226 arg0, boolean arg1) {
        if (arg1) {
            field114 = false;
        }
        while (true) {
            int var3 = arg0.method1471(255);
            if (var3 == 0) {
                field112++;
                return;
            }
            this.method22(var3, arg0, (byte) -91);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILnj;B)V")
    private final void method22(int arg0, class226 arg1, byte arg2) {
        if (arg0 == 2) {
            this.field118 = arg1.method1447(0);
        }
        if (arg2 > -88) {
            field115 = null;
        }
        field117++;
    }
}
