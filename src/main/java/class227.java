import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class227 {

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "[Lct;")
    public static class93[] field3200 = new class93[128];

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "Lae;")
    public static class156 field3201 = new class156(1);

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
    public static void method1396(byte arg0) {
        field3201 = null;
        if (arg0 == -76) {
            field3200 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(III)Luf;")
    public static final class296 method1397(int arg0, int arg1, int arg2) {
        class468 var3 = class358.field5312[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class296 var4 = var3.field6770;
            var3.field6770 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IBII)I")
    public static final int method1398(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field3199++;
        if (var4 == 0) {
            return arg3;
        }
        int var5 = -111 / ((6 - arg1) / 61);
        if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }
}
