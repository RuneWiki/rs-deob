import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class114 extends class58 {

    @OriginalMember(owner = "client!u", name = "gb", descriptor = "I")
    private int field2462 = 0;

    @OriginalMember(owner = "client!u", name = "ib", descriptor = "Z")
    public boolean field2464 = false;

    @OriginalMember(owner = "client!u", name = "Ab", descriptor = "I")
    private int field2482 = 0;

    @OriginalMember(owner = "client!u", name = "fb", descriptor = "I")
    public int field2461;

    @OriginalMember(owner = "client!u", name = "yb", descriptor = "I")
    public int field2480;

    @OriginalMember(owner = "client!u", name = "ub", descriptor = "I")
    public int field2476;

    @OriginalMember(owner = "client!u", name = "vb", descriptor = "I")
    public int field2477;

    @OriginalMember(owner = "client!u", name = "wb", descriptor = "I")
    private int field2478;

    @OriginalMember(owner = "client!u", name = "qb", descriptor = "I")
    public int field2472;

    @OriginalMember(owner = "client!u", name = "rb", descriptor = "Lf;")
    private class31 field2473;

    @OriginalMember(owner = "client!u", name = "pb", descriptor = "Lo;")
    public static class84 field2471 = class15.method124("scrollbar", 255);

    @OriginalMember(owner = "client!u", name = "tb", descriptor = "J")
    public static long field2475 = 0L;

    @OriginalMember(owner = "client!u", name = "sb", descriptor = "Lo;")
    private static class84 field2474 = class15.method124("Drop", 255);

    @OriginalMember(owner = "client!u", name = "mb", descriptor = "Lo;")
    public static class84 field2468 = field2474;

    @OriginalMember(owner = "client!u", name = "jb", descriptor = "I")
    public static int field2465 = 0;

    @OriginalMember(owner = "client!u", name = "zb", descriptor = "[Lvb;")
    public static class121[] field2481 = new class121[1000];

    @OriginalMember(owner = "client!u", name = "nb", descriptor = "Leb;")
    public static class27 field2469 = new class27(new byte[5000]);

    @OriginalMember(owner = "client!u", name = "Db", descriptor = "Lo;")
    public static class84 field2485 = class15.method124("Login limit exceeded)3", 255);

    @OriginalMember(owner = "client!u", name = "Eb", descriptor = "Lo;")
    public static class84 field2486 = class15.method124("Moderator option: Mute player for 48 hours: <OFF>", 255);

    @OriginalMember(owner = "client!u", name = "Fb", descriptor = "Lo;")
    public static class84 field2487 = class15.method124("mapedge", 255);

    @OriginalMember(owner = "client!u", name = "Gb", descriptor = "I")
    public static int field2488 = 0;

    @OriginalMember(owner = "client!u", name = "hb", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!u", name = "kb", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!u", name = "lb", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!u", name = "ob", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!u", name = "xb", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!u", name = "Bb", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!u", name = "Cb", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZLud;Lud;)V", line = 14)
    public static final void method880(boolean arg0, boolean arg1, class118 arg2, class118 arg3) {
        class28.field564 = arg2;
        class85.field1941 = arg3;
        class44.field881 = arg1;
        field2467++;
        if (!arg0) {
            field2488 = -122;
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(IIIIIII)V", line = 169)
    public class114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2461 = arg4;
        this.field2480 = arg1;
        this.field2476 = arg5 + arg6;
        this.field2477 = arg2;
        this.field2478 = arg0;
        this.field2472 = arg3;
        int var8 = class6.method36((byte) 30, this.field2478).field594;
        if (var8 == -1) {
            this.field2464 = true;
        } else {
            this.field2464 = false;
            this.field2473 = class74.method554(var8, 4867);
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(B)Lne;", line = 37)
    public final class83 method471(byte arg0) {
        class30 var2 = class6.method36((byte) 30, this.field2478);
        class83 var3;
        if (this.field2464) {
            var3 = var2.method264((byte) -39, -1);
        } else {
            var3 = var2.method264((byte) -39, this.field2482);
        }
        field2484++;
        if (arg0 != 3) {
            field2485 = null;
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)V", line = 70)
    public final void method881(int arg0, boolean arg1) {
        field2463++;
        if (this.field2464) {
            return;
        }
        if (!arg1) {
            this.field2464 = false;
        }
        this.field2462 += arg0;
        while (this.field2462 > this.field2473.field628[this.field2482]) {
            this.field2462 -= this.field2473.field628[this.field2482];
            this.field2482++;
            if (this.field2482 >= this.field2473.field612.length) {
                this.field2464 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "h", descriptor = "(I)V", line = 99)
    public static void method882(int arg0) {
        int var1 = -127 / ((-arg0 - 31) / 46);
        field2487 = null;
        field2469 = null;
        field2471 = null;
        field2468 = null;
        field2474 = null;
        field2486 = null;
        field2485 = null;
        field2481 = null;
    }
}
