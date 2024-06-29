import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public abstract class class4 {

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "I")
    public static int field33 = 0;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "Lr;")
    public static class33 field32 = class29.method192("Farming patch", (byte) 126);

    @OriginalMember(owner = "mapview!ba", name = "h", descriptor = "Lr;")
    public static class33 field39 = class29.method192("General Store", (byte) 126);

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "Lr;")
    public static class33 field35 = class29.method192("u_pass", (byte) 126);

    @OriginalMember(owner = "mapview!ba", name = "j", descriptor = "Z")
    public static boolean field41 = true;

    @OriginalMember(owner = "mapview!ba", name = "i", descriptor = "Lr;")
    public static class33 field40 = class29.method192("details)3dat", (byte) 126);

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "mapview!ba", name = "e", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "mapview!ba", name = "f", descriptor = "Ls;")
    public static class35 field37;

    @OriginalMember(owner = "mapview!ba", name = "g", descriptor = "[B")
    public static byte[] field38;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(B)V", line = 16)
    public static void method24(byte arg0) {
        field38 = null;
        field32 = null;
        field35 = null;
        field40 = null;
        field39 = null;
        if (arg0 >= -31) {
            method27((byte) -41);
        }
        field37 = null;
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(B)V", line = 82)
    public static final void method27(byte arg0) {
        if (class31.field441[0][class21.field216][class32.field454] == null) {
            class8.field106 = null;
        } else {
            class8.field106 = class31.field441[0][class21.field216][class32.field454];
        }
        if (class31.field441[1][class21.field216][class32.field454] == null) {
            class36.field491 = null;
        } else {
            class36.field491 = class31.field441[1][class21.field216][class32.field454];
        }
        if (class31.field441[2][class21.field216][class32.field454] == null) {
            class29.field422 = null;
        } else {
            class29.field422 = class31.field441[2][class21.field216][class32.field454];
        }
        if (class31.field441[3][class21.field216][class32.field454] == null) {
            class29.field423 = null;
        } else {
            class29.field423 = class31.field441[3][class21.field216][class32.field454];
        }
        if (class31.field441[4][class21.field216][class32.field454] == null) {
            class36.field495 = null;
        } else {
            class36.field495 = class31.field441[4][class21.field216][class32.field454];
        }
        if (class24.field262[class21.field216][class32.field454] == null) {
            class25.field267 = null;
        } else {
            class25.field267 = class24.field262[class21.field216][class32.field454];
        }
        if (class22.field235[class21.field216][class32.field454] == null) {
            field37 = null;
        } else {
            field37 = class22.field235[class21.field216][class32.field454];
        }
        if (class22.field233[class21.field216][class32.field454] == null) {
            class30.field430 = null;
        } else {
            class30.field430 = class22.field233[class21.field216][class32.field454];
        }
        int var1 = 33 % ((54 - arg0) / 58);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I)V")
    public abstract void method25(int arg0);

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(IIB)I")
    public abstract int method26(int arg0, int arg1, byte arg2);
}
