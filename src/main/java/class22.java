import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public class class22 {

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "Lt;")
    public static class36 field273 = class3.method8(13631, "Holiday Event");

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "Lt;")
    public static class36 field275 = class3.method8(13631, "75(U");

    @OriginalMember(owner = "mapview!la", name = "e", descriptor = "Lt;")
    public static class36 field277 = class3.method8(13631, "Spice Shop");

    @OriginalMember(owner = "mapview!la", name = "d", descriptor = "Lt;")
    public static class36 field276 = class3.method8(13631, "Anvil");

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "Lw;")
    public static class41 field274;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(I)V", line = 15)
    public static void method127(int arg0) {
        field273 = null;
        field276 = null;
        field275 = null;
        field274 = null;
        if (arg0 > -72) {
            method128(-73, null, 1, null, -108);
        }
        field277 = null;
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(ILk;ILk;I)Lm;", line = 41)
    public static final class23 method128(int arg0, class19 arg1, int arg2, class19 arg3, int arg4) {
        if (class41.method265(arg0, arg2, (byte) 75, arg1)) {
            return arg4 == 3769 ? class29.method170(arg3.method103(arg0, arg2, (byte) -17), 0) : (class23) null;
        } else {
            return null;
        }
    }
}
