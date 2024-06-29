import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!oa")
public class class30 {

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "Lu;")
    public static class38 field376 = class28.method177("Enter place name to find", (byte) -84);

    @OriginalMember(owner = "mapview!oa", name = "i", descriptor = "[[B")
    public static byte[][] field382 = new byte[1000][];

    @OriginalMember(owner = "mapview!oa", name = "e", descriptor = "[I")
    public static int[] field378 = new int[128];

    @OriginalMember(owner = "mapview!oa", name = "f", descriptor = "Lu;")
    public static class38 field379 = class28.method177("POH Portal", (byte) -84);

    @OriginalMember(owner = "mapview!oa", name = "k", descriptor = "Lu;")
    public static class38 field384 = class28.method177("Suchen", (byte) -84);

    @OriginalMember(owner = "mapview!oa", name = "h", descriptor = "Lu;")
    public static class38 field381 = class28.method177("Overview", (byte) -84);

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "mapview!oa", name = "g", descriptor = "J")
    public long field380;

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "Loa;")
    public class30 field375;

    @OriginalMember(owner = "mapview!oa", name = "l", descriptor = "Loa;")
    public class30 field385;

    @OriginalMember(owner = "mapview!oa", name = "d", descriptor = "Lt;")
    public static class37 field377;

    @OriginalMember(owner = "mapview!oa", name = "j", descriptor = "[B")
    public static byte[] field383;

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(B)V", line = 29)
    public static final void method182(byte arg0) {
        if (class7.field67[0][class29.field363][class28.field354] == null) {
            mapview.field290 = null;
        } else {
            mapview.field290 = class7.field67[0][class29.field363][class28.field354];
        }
        if (class7.field67[1][class29.field363][class28.field354] == null) {
            class33.field413 = null;
        } else {
            class33.field413 = class7.field67[1][class29.field363][class28.field354];
        }
        if (arg0 != -7) {
            method183((byte) -44);
        }
        if (class7.field67[2][class29.field363][class28.field354] == null) {
            class33.field414 = null;
        } else {
            class33.field414 = class7.field67[2][class29.field363][class28.field354];
        }
        if (class7.field67[3][class29.field363][class28.field354] == null) {
            class3.field30 = null;
        } else {
            class3.field30 = class7.field67[3][class29.field363][class28.field354];
        }
        if (class7.field67[4][class29.field363][class28.field354] == null) {
            class29.field367 = null;
        } else {
            class29.field367 = class7.field67[4][class29.field363][class28.field354];
        }
        if (class24.field236[class29.field363][class28.field354] == null) {
            class1.field6 = null;
        } else {
            class1.field6 = class24.field236[class29.field363][class28.field354];
        }
        if (class10.field95[class29.field363][class28.field354] == null) {
            class8.field72 = null;
        } else {
            class8.field72 = class10.field95[class29.field363][class28.field354];
        }
        if (class28.field359[class29.field363][class28.field354] == null) {
            class38.field493 = null;
        } else {
            class38.field493 = class28.field359[class29.field363][class28.field354];
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "(B)V", line = 82)
    public static void method183(byte arg0) {
        if (arg0 > -37) {
            method182((byte) 70);
        }
        field379 = null;
        field381 = null;
        field383 = null;
        field378 = null;
        field382 = null;
        field377 = null;
        field384 = null;
        field376 = null;
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(BLu;Lb;Lu;)[Lca;", line = 103)
    public static final class6[] method184(byte arg0, class38 arg1, class3 arg2, class38 arg3) {
        int var4 = arg2.method20(arg3, (byte) 88);
        if (arg0 != 61) {
            method184((byte) 114, null, null, null);
        }
        int var5 = arg2.method22(var4, -98, arg1);
        return class32.method192(var4, arg2, var5, 0);
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(IBILb;)[Lra;", line = 124)
    public static final class35[] method185(int arg0, byte arg1, int arg2, class3 arg3) {
        if (class7.method39(arg3, (byte) -19, arg0, arg2)) {
            if (arg1 >= -3) {
                method184((byte) -127, null, null, null);
            }
            return class32.method191((byte) 38);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "(B)V", line = 153)
    public final void method186(byte arg0) {
        if (arg0 <= 111) {
            method183((byte) -119);
        }
        if (this.field385 != null) {
            this.field385.field375 = this.field375;
            this.field375.field385 = this.field385;
            this.field385 = null;
            this.field375 = null;
        }
    }
}
