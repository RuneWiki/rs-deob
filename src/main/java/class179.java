import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public abstract class class179 {

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "Z")
    public static boolean field2849 = false;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field2846 = 0;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Lgd;")
    public static class325 field2847 = new class325(500);

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "Z")
    public static boolean field2854 = false;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "[I")
    public static int[] field2856 = new int[500];

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2857 = "glow1:";

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "()Z", line = 8)
    public boolean method115() {
        field2845++;
        return false;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLpk;)Z", line = 22)
    public static final boolean method1315(byte arg0, class120 arg1) {
        field2848++;
        int var2 = 121 % ((arg0 - 76) / 42);
        return arg1.method939((byte) 104, class45.field701);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V", line = 41)
    public static void method1316(byte arg0) {
        field2857 = null;
        field2847 = null;
        field2856 = null;
        int var1 = -79 / ((30 - arg0) / 38);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Leh;", line = 61)
    public class179 method114(int arg0, int arg1, int arg2) {
        field2855++;
        return this;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Leh;IIIZ)V", line = 70)
    public void method104(class179 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2852++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BJ)V", line = 90)
    public static final void method1317(byte arg0, long arg1) {
        int var3 = -17 / ((65 - arg0) / 48);
        field2850++;
        if (arg1 != 0L) {
            class155.field2521++;
            class209.field3305.method1808((byte) -74, 99);
            class209.field3305.method59(arg1, false);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIII)V")
    public abstract void method111(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIIIJILrb;)V")
    public abstract void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class236 arg10);

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "()I")
    public abstract int method137();
}
