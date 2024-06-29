import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class class18 extends class16 {

    @OriginalMember(owner = "mapview!j", name = "k", descriptor = "Lt;")
    public static class31 field247 = class11.method64(114, "Apothecary");

    @OriginalMember(owner = "mapview!j", name = "l", descriptor = "Lt;")
    public static class31 field248 = class11.method64(89, "???");

    @OriginalMember(owner = "mapview!j", name = "j", descriptor = "Lo;")
    public static class27 field246;

    @OriginalMember(owner = "mapview!j", name = "m", descriptor = "Lt;")
    public class31 field249;

    @OriginalMember(owner = "mapview!j", name = "i", descriptor = "[I")
    public static int[] field245;

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(Z)V", line = 16)
    public static final void method102(boolean arg0) {
        if (arg0 && class11.field186 != null) {
            class28 var1 = class11.field186;
            synchronized (class11.field186) {
                class11.field186 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(B)V", line = 48)
    public static void method103(byte arg0) {
        field245 = null;
        if (arg0 != 117) {
            method103((byte) 12);
        }
        field246 = null;
        field248 = null;
        field247 = null;
    }
}
