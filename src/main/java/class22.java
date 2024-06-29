import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class22 {

    @OriginalMember(owner = "mapview!l", name = "e", descriptor = "Ld;")
    public static class7 field243 = class38.method251((byte) 58, "Slayer Master");

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "Ld;")
    public static class7 field242 = class38.method251((byte) -125, "_");

    @OriginalMember(owner = "mapview!l", name = "g", descriptor = "Ld;")
    public static class7 field245 = class38.method251((byte) 127, "sprites");

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "Ld;")
    public static class7 field239 = class38.method251((byte) -66, "Cookery Shop");

    @OriginalMember(owner = "mapview!l", name = "f", descriptor = "Ld;")
    public static class7 field244 = class38.method251((byte) 123, "Shield Shop");

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "Ld;")
    public static class7 field241 = class38.method251((byte) 116, "General Store");

    @OriginalMember(owner = "mapview!l", name = "h", descriptor = "[B")
    public static byte[] field246;

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "[Lla;")
    public static class23[] field240;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IB)Ld;", line = 6)
    public static final class7 method157(int arg0, byte arg1) {
        if (arg1 != -112) {
            method157(-38, (byte) -113);
        }
        return class8.method85(arg0, false, 127, 10);
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(II)Ld;", line = 32)
    public static final class7 method158(int arg0, int arg1) {
        class7 var2 = new class7();
        var2.field76 = arg1;
        var2.field75 = new byte[arg0];
        return var2;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(I)V", line = 50)
    public static void method159(int arg0) {
        field241 = null;
        int var1 = 64 / ((arg0 - 16) / 60);
        field245 = null;
        field246 = null;
        field243 = null;
        field240 = null;
        field242 = null;
        field244 = null;
        field239 = null;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(II[Ld;I)V", line = 86)
    public static final void method160(int arg0, int arg1, class7[] arg2, int arg3) {
        if (arg3 != 0) {
            field242 = null;
        }
        if (arg0 == 1) {
            arg2[0].method63(-98);
        } else {
            mapview.method184(arg1, arg0, arg2, (byte) -113).method63(-124);
        }
    }
}
