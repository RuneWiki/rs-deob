import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class12 {

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Lrd;")
    private static class173 field191 = class133.method843("FULL", 42);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Lrd;")
    public static class173 field190 = field191;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "[I")
    public static int[] field196 = new int[256];

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Lrd;")
    public static class173 field198 = class133.method843(" <col=ffff00>", -81);

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Laf;")
    public static class7 field193 = new class7(500);

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field199 = 0;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "Lrd;")
    public static class173 field200 = class133.method843("", 75);

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "Lrd;")
    public static class173 field201 = class133.method843("Fallen lassen", 118);

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Lbc;")
    public static class14 field192;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static void method72(byte arg0) {
        field193 = null;
        field190 = null;
        field200 = null;
        field192 = null;
        if (arg0 > -84) {
            method73(83, 109, 110);
        }
        field196 = null;
        field201 = null;
        field191 = null;
        field198 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)I")
    public static final int method73(int arg0, int arg1, int arg2) {
        field197++;
        if (arg2 != -767549439) {
            return 99;
        }
        int var3 = class188.method1261(arg1 + 45365, 32087, 4, arg0 + 91923) + (class188.method1261(arg1 + 10294, 32087, 2, arg0 + 37821) - 128 >> 1) + (class188.method1261(arg1, 32087, 1, arg0) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }
}
