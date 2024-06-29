import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public abstract class class24 {

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "I")
    public static int field289 = 0;

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "Lba;")
    public static class4 field293 = class14.method105((byte) -125, "General Store");

    @OriginalMember(owner = "mapview!m", name = "g", descriptor = "[I")
    public static int[] field295 = new int[128];

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "Lba;")
    public static class4 field292 = class14.method105((byte) -105, "Mining Site");

    @OriginalMember(owner = "mapview!m", name = "f", descriptor = "I")
    public static int field294 = 0;

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "Lba;")
    public static class4 field290 = class14.method105((byte) -99, "Skirt Shop");

    @OriginalMember(owner = "mapview!m", name = "i", descriptor = "Z")
    public static boolean field297 = false;

    @OriginalMember(owner = "mapview!m", name = "h", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "[I")
    public static int[] field291;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Z)V", line = 17)
    public static void method165(boolean arg0) {
        field292 = null;
        field293 = null;
        if (arg0) {
            field295 = null;
            field290 = null;
            field291 = null;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I[BII)Lba;", line = 37)
    public static final class4 method167(int arg0, byte[] arg1, int arg2, int arg3) {
        class4 var4 = new class4();
        var4.field84 = 0;
        var4.field82 = new byte[arg2];
        for (int var5 = arg0; var5 < arg0 + arg2; var5++) {
            if (arg1[var5] != 0) {
                var4.field82[var4.field84++] = arg1[var5];
            }
        }
        if (arg3 != 5731) {
            method167(-88, null, -72, -99);
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I)V")
    public abstract void method166(int arg0);

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(IBI)I")
    public abstract int method168(int arg0, byte arg1, int arg2);
}
