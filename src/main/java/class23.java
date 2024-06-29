import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public class class23 {

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "Lt;")
    public static class35 field256 = class3.method28(false, "Dungeon");

    @OriginalMember(owner = "mapview!la", name = "h", descriptor = "Lt;")
    public static class35 field261 = class3.method28(false, "POH Portal");

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "Lt;")
    public static class35 field254 = class3.method28(false, "???");

    @OriginalMember(owner = "mapview!la", name = "k", descriptor = "Lt;")
    public static class35 field264 = class3.method28(false, "Brewery");

    @OriginalMember(owner = "mapview!la", name = "j", descriptor = "[I")
    public static int[] field263 = new int[128];

    @OriginalMember(owner = "mapview!la", name = "g", descriptor = "Lt;")
    public static class35 field260 = class3.method28(false, "Rare Trees");

    @OriginalMember(owner = "mapview!la", name = "d", descriptor = "Lt;")
    public static class35 field257 = class3.method28(false, "Spinning Wheel");

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "mapview!la", name = "e", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "mapview!la", name = "f", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "mapview!la", name = "l", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "mapview!la", name = "m", descriptor = "Lt;")
    public static class35 field266;

    @OriginalMember(owner = "mapview!la", name = "i", descriptor = "[I")
    public static int[] field262;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(I)V", line = 13)
    public static void method132(int arg0) {
        field264 = null;
        field262 = null;
        field263 = null;
        field260 = null;
        int var1 = -10 / ((arg0 - 4) / 39);
        field261 = null;
        field257 = null;
        field266 = null;
        field256 = null;
        field254 = null;
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(B)I", line = 36)
    public static final int method133(byte arg0) {
        if (arg0 != -127) {
            field266 = null;
        }
        if (class27.field307 == null) {
            return 0;
        } else if (class27.field307.field102 == null) {
            return field262[class27.field307.field104 & 0xFF];
        } else {
            return field262[class27.field307.field102[class31.field392] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(ZI)[B", line = 70)
    public static final synchronized byte[] method134(boolean arg0, int arg1) {
        if (arg1 == 100 && class13.field171 > 0) {
            byte[] var2 = class13.field167[--class13.field171];
            class13.field167[class13.field171] = null;
            return var2;
        } else if (arg1 == 5000 && class32.field401 > 0) {
            byte[] var3 = class18.field206[--class32.field401];
            class18.field206[class32.field401] = null;
            return var3;
        } else if (!arg0) {
            return (byte[]) null;
        } else if (arg1 == 30000 && class35.field440 > 0) {
            byte[] var4 = class19.field219[--class35.field440];
            class19.field219[class35.field440] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
