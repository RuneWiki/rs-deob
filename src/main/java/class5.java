import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Lgd;")
    public static class40 field148 = class14.method90(false, "Privater Chat");

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lgd;")
    private static class40 field146 = class14.method90(false, "level)2");

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Lgd;")
    private static class40 field150 = class14.method90(false, "Loaded update list");

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "Lgd;")
    public static class40 field154 = class14.method90(false, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "Lgd;")
    public static class40 field153 = field150;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Z")
    public static boolean field149 = false;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field156 = 0;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Lgd;")
    public static class40 field151 = field146;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "J")
    public static long field155;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 24)
    public static void method30(int arg0) {
        field150 = null;
        if (arg0 != 1) {
            field148 = null;
        }
        field153 = null;
        field154 = null;
        field151 = null;
        field146 = null;
        field148 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBII)I", line = 61)
    public static final int method31(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg0 / arg3;
        field152++;
        if (arg1 != 4) {
            field149 = true;
        }
        int var5 = arg2 & arg3 - 1;
        int var6 = arg3 - 1 & arg0;
        int var7 = arg2 / arg3;
        int var8 = class115.method886(var4, 3, var7);
        int var9 = class115.method886(var4 + 1, 3, var7);
        int var10 = class115.method886(var4, 3, var7 + 1);
        int var11 = class115.method886(var4 + 1, 3, var7 + 1);
        int var12 = class44.method304(var9, arg3, var6, var8, arg1 ^ 0x8C73D414);
        int var13 = class44.method304(var11, arg3, var6, var10, -1938566128);
        return class44.method304(var13, arg3, var5, var12, -1938566128);
    }
}
