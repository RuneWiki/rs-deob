import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class330 {

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "[C")
    public static char[] field4751 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field4749 = 0;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Z")
    public static boolean field4752 = true;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lec;")
    public static class40 field4748 = new class40("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field4750;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)Lrm;")
    public static final class183 method2001(int arg0, int arg1, int arg2) {
        class263 var3 = class293.field4356[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3784;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public static void method2002(boolean arg0) {
        if (!arg0) {
            field4750 = null;
            field4751 = null;
            field4748 = null;
        }
    }
}
