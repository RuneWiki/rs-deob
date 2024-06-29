import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class84 {

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1245 = null;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field1247 = 0;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "Lfa;")
    public static class212 field1249;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "Lrc;")
    public static class499 field1244;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "Lrs;")
    public static class605 field1246;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "Lsea;")
    public static class648 field1250;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZILjba;)V", line = 11)
    public static final void method636(boolean arg0, int arg1, class364 arg2) {
        field1248++;
        class11.field99.method3554(arg2, 4);
        if (arg0) {
            class558.method3123(class23.field279, 29631, class442.field6134, class11.field99, class76.field992, arg2);
        }
        int var3 = -10 / ((73 - arg1) / 35);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)V", line = 28)
    public static void method637(boolean arg0) {
        field1244 = null;
        field1245 = null;
        if (!arg0) {
            method637(true);
        }
        field1250 = null;
        field1246 = null;
        field1249 = null;
    }
}
