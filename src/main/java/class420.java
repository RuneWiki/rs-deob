import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class420 extends class375 {

    @OriginalMember(owner = "client!iga", name = "F", descriptor = "Lmb;")
    public class236 field6118;

    @OriginalMember(owner = "client!iga", name = "z", descriptor = "I")
    public static int field6113 = 0;

    @OriginalMember(owner = "client!iga", name = "v", descriptor = "[[B")
    public static byte[][] field6109 = new byte[250][];

    @OriginalMember(owner = "client!iga", name = "x", descriptor = "F")
    public static float field6111;

    @OriginalMember(owner = "client!iga", name = "w", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!iga", name = "y", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!iga", name = "C", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!iga", name = "D", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!iga", name = "E", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!iga", name = "B", descriptor = "Lpga;")
    public static class494 field6114;

    @OriginalMember(owner = "client!iga", name = "u", descriptor = "[Li;")
    public static class37[] field6108;

    @OriginalMember(owner = "client!iga", name = "t", descriptor = "[Lf;")
    public static class702[] field6107;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2522(int arg0) {
        field6115++;
        if (arg0 != 519) {
            method2522(-27);
        }
        class169.field2429 = class139.method1006(8, 2048, 4, -4003, 0.4F, 8, true, 35);
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(IIIIII)V", line = 17)
    public static final void method2523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 54) {
            method2525(7);
        }
        field6116++;
        if (class287.field4270.field3697 != 0 && arg4 != 0 && class8.field83 < 50 && arg0 != -1) {
            class106.field1642[class8.field83++] = new class603((byte) 1, arg0, arg4, arg1, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "(B)V", line = 37)
    public static void method2524(byte arg0) {
        field6114 = null;
        if (arg0 != 49) {
            method2523(-25, -76, -6, 106, 35, -7);
        }
        field6107 = null;
        field6109 = null;
        field6108 = null;
    }

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "(I)V", line = 52)
    public static final void method2525(int arg0) {
        field6117++;
        if (class572.field8054 == null) {
            return;
        }
        class27.field400 = new class598();
        class27.field400.method3388(class600.field8484, class572.field8054.field3561.method1804(7175, class512.field7203), class572.field8054.field3560, class572.field8054, 0);
        class162.field2317 = new Thread(class27.field400, "");
        if (arg0 <= -76) {
            class162.field2317.start();
        }
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(Lmb;)V", line = 80)
    public class420(class236 arg0) {
        this.field6118 = arg0;
    }
}
