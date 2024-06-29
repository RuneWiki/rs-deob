import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class346 extends class476 {

    @OriginalMember(owner = "client!dp", name = "p", descriptor = "I")
    public volatile int field4983 = -1;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "Ljava/lang/String;")
    public volatile String field4979;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "Z")
    public static boolean field4977 = false;

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "Lrb;")
    public static class283 field4982 = new class283(94, 6);

    @OriginalMember(owner = "client!dp", name = "q", descriptor = "I")
    public static int field4984 = -1;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!dp", name = "r", descriptor = "Lor;")
    public static class173 field4985;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIZIZ)Ldk;", line = 4)
    public static final class421 method2082(int arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field4976++;
        class126 var5 = null;
        if (class184.field2733 != null) {
            var5 = new class126(arg0, class184.field2733, class148.field2269[arg0], 1000000);
        }
        class285.field3865[arg0] = class418.field6059.method3083(false, var5, arg0, class412.field5862);
        if (arg2) {
            class285.field3865[arg0].method2402((byte) -64);
        }
        return arg3 == 1000000 ? new class421(class285.field3865[arg0], arg4, arg1) : null;
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(B)V", line = 36)
    public static void method2083(byte arg0) {
        if (arg0 == 102) {
            field4982 = null;
            field4985 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZIIII)V", line = 47)
    public static final void method2084(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0) {
            method2084(false, -86, -6, 40, 82);
        }
        for (int var5 = 0; var5 < class293.field3963; var5++) {
            Rectangle var6 = class428.field6209[var5];
            if (arg2 < (var6.x + var6.width) && arg2 + arg1 > var6.x && arg4 < var6.y + var6.height && var6.y < arg3 + arg4) {
                class259.field3517[var5] = true;
            }
        }
        field4978++;
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 79)
    public class346(String arg0) {
        this.field4979 = arg0;
    }
}
