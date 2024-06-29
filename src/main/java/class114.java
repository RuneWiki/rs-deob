import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class114 {

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "Lgg;")
    public static class63 field2554 = class116.method911(43, "::rect_debug");

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field2555 = 3353893;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "[I")
    public static int[] field2556 = new int[5];

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "[I")
    public static int[] field2551 = new int[25];

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Lgg;")
    private static class63 field2552 = class116.method911(43, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "Lgg;")
    public static class63 field2560 = class116.method911(43, "runes");

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Lgg;")
    public static class63 field2558 = field2552;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Luh;")
    public static class188 field2548;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Lwb;")
    public static class200 field2549;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Lff;")
    public static class54 field2557;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "[I")
    public static int[] field2559;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)Lgg;")
    public static final class63 method902(int arg0, byte arg1) {
        if (arg1 != 102) {
            method902(-93, (byte) -8);
        }
        field2550++;
        return class89.method772((byte) 51, new class63[] { class175.method1162((byte) -126, arg0 >> 24 & 0xFF), class138.field2970, class175.method1162((byte) -126, arg0 >> 16 & 0xFF), class138.field2970, class175.method1162((byte) -126, arg0 >> 8 & 0xFF), class138.field2970, class175.method1162((byte) -126, arg0 & 0xFF) });
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method903(KeyEvent arg0, int arg1) {
        field2553++;
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (arg1 >= var2 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static void method904(int arg0) {
        field2554 = null;
        field2560 = null;
        field2557 = null;
        field2556 = null;
        field2559 = null;
        field2558 = null;
        if (arg0 == 1348862560) {
            field2549 = null;
            field2552 = null;
            field2548 = null;
            field2551 = null;
        }
    }
}
