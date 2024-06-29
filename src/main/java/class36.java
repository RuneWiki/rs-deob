import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public class class36 {

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "Z")
    public static volatile boolean field449 = true;

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "[I")
    public static int[] field447 = new int[128];

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "I")
    public static int field446 = 0;

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "Lua;")
    public static class41 field448 = class16.method86("Magic Shop", true);

    @OriginalMember(owner = "mapview!s", name = "g", descriptor = "Lua;")
    public static class41 field451 = class16.method86("Overview", true);

    @OriginalMember(owner = "mapview!s", name = "i", descriptor = "I")
    public static int field453 = 0;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "Lua;")
    public static class41 field445 = class16.method86("Grand Exchange", true);

    @OriginalMember(owner = "mapview!s", name = "f", descriptor = "Lua;")
    public static class41 field450 = class16.method86("Kebab Seller", true);

    @OriginalMember(owner = "mapview!s", name = "k", descriptor = "Lua;")
    public static class41 field455 = class16.method86("Mining Site", true);

    @OriginalMember(owner = "mapview!s", name = "j", descriptor = "Ljava/awt/Frame;")
    public static Frame field454;

    @OriginalMember(owner = "mapview!s", name = "h", descriptor = "[[Lq;")
    public static class32[][] field452;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(IBIIZ)V", line = 34)
    public static final void method204(int arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        int var5 = arg2 >> 6;
        int var6 = arg3 >> 6;
        if (arg4) {
            method205(42);
        }
        if (class16.field141[arg0][var6][var5] == null) {
            class16.field141[arg0][var6][var5] = new byte[4096];
        }
        class16.field141[arg0][var6][var5][class38.method213(4032, arg3 << 6) + class38.method213(63, arg2)] = arg1;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(I)V", line = 55)
    public static void method205(int arg0) {
        field454 = null;
        field450 = null;
        int var1 = -1 % ((arg0 + 48) / 54);
        field451 = null;
        field445 = null;
        field447 = null;
        field452 = null;
        field448 = null;
        field455 = null;
    }
}
