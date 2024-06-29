import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class278 {

    @OriginalMember(owner = "client!un", name = "b", descriptor = "Lwt;")
    public static class194 field3961 = new class194("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!un", name = "g", descriptor = "[J")
    public static long[] field3966 = new long[32];

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "Lqg;")
    public static class307 field3965;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method1700(int arg0, byte arg1) {
        class364.field5477 = arg0;
        if (arg1 >= -12) {
            field3961 = null;
        }
        class134.field1711 = -1;
        field3960++;
        class134.field1711 = -1;
        class126.method706(4832);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V", line = 22)
    public static void method1701(int arg0) {
        field3965 = null;
        field3966 = null;
        int var1 = -61 / ((arg0 - 72) / 32);
        field3961 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)V", line = 36)
    public static final void method1702(int arg0, int arg1) {
        field3962++;
        class28.field488.method39(false, arg0);
        if (arg1 != -2) {
            field3963 = -25;
        }
    }
}
