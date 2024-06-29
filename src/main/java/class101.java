import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class101 extends class176 {

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Lwb;")
    public static class200 field2369;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Lgg;")
    public class63 field2367;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)V")
    public static final void method845(int arg0, int arg1, int arg2, int arg3) {
        if (class59.field1517 != 0 && arg0 != 0 && class161.field3317 < 50) {
            class43.field1043[class161.field3317] = arg3;
            class21.field498[class161.field3317] = arg0;
            class10.field242[class161.field3317] = arg2;
            class126.field2778[class161.field3317] = null;
            class136.field2948[class161.field3317] = 0;
            class161.field3317++;
        }
        if (arg1 != 0) {
            method845(121, 62, -55, 117);
        }
        field2370++;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(Z)V")
    public static void method846(boolean arg0) {
        field2369 = null;
        if (!arg0) {
            field2368 = -92;
        }
    }
}
