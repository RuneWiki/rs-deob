import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public abstract class class34 {

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "Ll;")
    public static class22 field455 = class33.method229("Mining Site", -63);

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "Ll;")
    public static class22 field457 = class33.method229("Next page", -58);

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "Ll;")
    public static class22 field458 = class33.method229("world", -90);

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "Ll;")
    public static class22 field454 = class33.method229("Overview", -89);

    @OriginalMember(owner = "mapview!s", name = "i", descriptor = "Ll;")
    public static class22 field462 = class33.method229("Brewery", -58);

    @OriginalMember(owner = "mapview!s", name = "f", descriptor = "I")
    public static int field459 = 1;

    @OriginalMember(owner = "mapview!s", name = "g", descriptor = "[[[[B")
    public static byte[][][][] field460 = new byte[5][][][];

    @OriginalMember(owner = "mapview!s", name = "h", descriptor = "Ll;")
    public static class22 field461 = class33.method229("Fishing Spot", -113);

    @OriginalMember(owner = "mapview!s", name = "k", descriptor = "Ll;")
    public static class22 field464 = class33.method229("???", -84);

    @OriginalMember(owner = "mapview!s", name = "l", descriptor = "I")
    public static volatile int field465 = 0;

    @OriginalMember(owner = "mapview!s", name = "m", descriptor = "I")
    public static volatile int field466 = 0;

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "Ll;")
    public static class22 field456 = class33.method229("Clothes Shop", -57);

    @OriginalMember(owner = "mapview!s", name = "n", descriptor = "Lc;")
    public static class5 field467;

    @OriginalMember(owner = "mapview!s", name = "j", descriptor = "[[Lm;")
    public static class24[][] field463;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Lea;ZII)Z", line = 28)
    public static final boolean method233(class10 arg0, boolean arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method49(arg3, arg2, 5);
        if (var4 == null) {
            return false;
        } else {
            class16.method94((byte) -74, var4);
            return arg1;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Z)V", line = 45)
    public static void method234(boolean arg0) {
        field462 = null;
        field456 = null;
        field460 = null;
        field463 = null;
        field455 = null;
        if (!arg0) {
            return;
        }
        field454 = null;
        field464 = null;
        field461 = null;
        field458 = null;
        field457 = null;
        field467 = null;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(I)[B")
    public abstract byte[] method231(int arg0);

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(I[B)V")
    public abstract void method232(int arg0, byte[] arg1);
}
