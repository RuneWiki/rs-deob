import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public abstract class class3 {

    @OriginalMember(owner = "mapview!b", name = "d", descriptor = "Lj;")
    public static class17 field93 = class30.method190(-102, "details)3dat");

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "Lj;")
    public static class17 field91 = class30.method190(-119, "Farming shop");

    @OriginalMember(owner = "mapview!b", name = "f", descriptor = "Lj;")
    public static class17 field95 = class30.method190(-102, "Herbalist");

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "mapview!b", name = "e", descriptor = "[I")
    public static int[] field94;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(I)V", line = 4)
    public static final void method28(int arg0) {
        class31.field396 = null;
        class29.field375 = null;
        class33.field415 = null;
        class26.field334 = null;
        mapview.field2 = null;
        class1.field68 = null;
        if (arg0 != 11793) {
            method28(80);
        }
    }

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "(I)V", line = 29)
    public static void method29(int arg0) {
        field94 = null;
        field93 = null;
        field95 = null;
        if (arg0 > -99) {
            field95 = null;
        }
        field91 = null;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IIILt;)[Lv;", line = 76)
    public static final class36[] method30(int arg0, int arg1, int arg2, class34 arg3) {
        if (class8.method76(arg0, arg1, arg3, (byte) -104)) {
            return arg2 < 11 ? (class36[]) null : class32.method207(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "(I)V")
    public abstract void method31(int arg0);

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(III)I")
    public abstract int method32(int arg0, int arg1, int arg2);
}
