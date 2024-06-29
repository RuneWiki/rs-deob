import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class330 {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static volatile int field5622 = -1;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field5625 = 0;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "[I")
    public static int[] field5623 = new int[2500];

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Lhi;")
    private static class82 field5621 = class95.method664((byte) -113, "yellow:");

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Lhi;")
    public static class82 field5629 = field5621;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Lhi;")
    public static class82 field5626 = field5621;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Lhi;")
    public static class82 field5624 = class95.method664((byte) -55, "(Y<)4col>");

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 6)
    public static void method2256(int arg0) {
        field5623 = null;
        field5624 = null;
        field5621 = null;
        field5626 = null;
        field5629 = null;
        if (arg0 > -104) {
            field5621 = (class82) null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILhi;)V", line = 23)
    public static final void method2257(int arg0, class82 arg1) {
        field5628++;
        class159.field2765 = arg1;
        if (class55.field881.field2109 == null) {
            return;
        }
        try {
            class82 var2 = class143.field2450.method527((byte) -15, class55.field881.field2109);
            class82 var3 = class179.field3065.method527((byte) -15, class55.field881.field2109);
            class82 var4 = class29.method182(-6039, new class82[] { var2, class292.field4902, arg1, class124.field2162, var3 });
            class82 var5;
            if (arg0 == arg1.method535(true)) {
                var5 = class29.method182(-6039, new class82[] { var4, class51.field835 });
            } else {
                var5 = class29.method182(-6039, new class82[] { var4, class305.field5183, class331.method2262(class57.method391(19211) + 94608000000L, -89), class289.field4851, class201.method1408(73, 94608000L) });
            }
            class29.method182(-6039, new class82[] { class63.field980, var5, class182.field3113 }).method575(class55.field881.field2109, arg0 + 121);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lsh;", line = 85)
    public static final class32 method2258(Throwable arg0, String arg1) {
        field5627++;
        class32 var2;
        if ((arg0 instanceof class32)) {
            var2 = (class32) arg0;
            var2.field474 = var2.field474 + ' ' + arg1;
        } else {
            var2 = new class32(arg0, arg1);
        }
        return var2;
    }
}
