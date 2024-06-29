import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public class class29 {

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "I")
    public static int field355 = 0;

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "Lk;")
    public static class21 field356 = class14.method92((byte) 57, "labels)3dat");

    @OriginalMember(owner = "mapview!q", name = "f", descriptor = "Lk;")
    public static class21 field358 = class14.method92((byte) 57, "Key");

    @OriginalMember(owner = "mapview!q", name = "g", descriptor = "Lk;")
    public static class21 field359 = class14.method92((byte) 57, "Archery Shop");

    @OriginalMember(owner = "mapview!q", name = "h", descriptor = "Lk;")
    public static class21 field360 = class14.method92((byte) 57, "Dungeon");

    @OriginalMember(owner = "mapview!q", name = "e", descriptor = "Lk;")
    public static class21 field357 = class14.method92((byte) 57, "Dairy Churn");

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "Lma;")
    public static class26 field353;

    @OriginalMember(owner = "mapview!q", name = "i", descriptor = "Z")
    public static boolean field361;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "([Lk;III)Lk;", line = 61)
    public static final class21 method179(class21[] arg0, int arg1, int arg2, int arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg0[arg2 + var5] == null) {
                arg0[arg2 + var5] = class30.field370;
            }
            var4 += arg0[arg2 + var5].field256;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg1; var8++) {
            class21 var9 = arg0[arg2 + var8];
            class31.method186(var9.field259, 0, var7, var6, var9.field256);
            var6 += var9.field256;
        }
        if (arg3 != 26405) {
            method180(-36);
        }
        class21 var10 = new class21();
        var10.field259 = var7;
        var10.field256 = var4;
        return var10;
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I)V", line = 128)
    public static void method180(int arg0) {
        if (arg0 >= -75) {
            method179(null, 15, -51, -75);
        }
        field357 = null;
        field359 = null;
        field353 = null;
        field356 = null;
        field360 = null;
        field358 = null;
    }
}
