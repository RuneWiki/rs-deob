import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class18 {

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field448 = 0;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Lrd;")
    private static class117 field443 = class95.method812("To", (byte) 8);

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Lrd;")
    private static class117 field447 = class95.method812("Please use a different world)3", (byte) 8);

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Lrd;")
    public static class117 field452 = field447;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "[Lr;")
    public static class113[] field454 = new class113[50];

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Lrd;")
    public static class117 field446 = field443;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lrd;")
    public static class117 field442 = field447;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "Z")
    public static boolean field458 = false;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lrd;")
    public static class117 field453 = class95.method812("sch-Utteln:", (byte) 8);

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Lrd;")
    private static class117 field450 = class95.method812("Prepared sound engine", (byte) 8);

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "Lrd;")
    public static class117 field456 = field450;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field457 = 0;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "[Lhc;")
    public static class52[] field461 = new class52[4];

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field462 = 0;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lra;")
    public static class114 field444;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "Lga;")
    public static class44 field460;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Lge;")
    public static class47 field449;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([Lrd;I)Lrd;")
    public static final class117 method193(class117[] arg0, int arg1) {
        field459++;
        if (arg1 <= 17) {
            method197(-65, 36);
        }
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class46.method494(arg0.length, arg0, (byte) 104, 0);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)I")
    public static final int method194(int arg0, int arg1, int arg2, int arg3) {
        field451++;
        if (arg1 > 179) {
            arg0 /= 2;
        }
        if (arg1 > 192) {
            arg0 /= 2;
        }
        if (arg1 > 217) {
            arg0 /= 2;
        }
        if (arg1 > 243) {
            arg0 /= 2;
        }
        return (arg3 / 4 << 10) + (arg0 / 32 << 7) + arg1 / arg2;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static void method195(byte arg0) {
        field447 = null;
        field456 = null;
        field443 = null;
        field450 = null;
        field449 = null;
        field452 = null;
        int var1 = -72 / ((arg0 + 63) / 51);
        field460 = null;
        field444 = null;
        field446 = null;
        field453 = null;
        field461 = null;
        field454 = null;
        field442 = null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
    public static final void method196(byte arg0) {
        field445++;
        class49.method544((byte) 107);
        class39.field1135 = true;
        class24.method261(arg0 - 89);
        if (arg0 != -38) {
            field452 = null;
        }
        if (class27.field805 != -1) {
            boolean var1 = class84.method762(1, (byte) 60, 190, 261, class27.field805, 0, 0);
            if (!var1) {
                class13.field262 = true;
            }
        } else if (class134.field3210[class101.field2518] != -1) {
            boolean var2 = class84.method762(1, (byte) 113, 190, 261, class134.field3210[class101.field2518], 0, 0);
            if (!var2) {
                class13.field262 = true;
            }
        }
        if (class15.field354 && client.field613 == 1) {
            if (class72.field2022 == 1) {
                class49.method543(4);
            } else {
                class56.method593((byte) -89);
            }
        }
        class84.method759((byte) -122);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lrd;")
    public static final class117 method197(int arg0, int arg1) {
        if (arg0 == 30712) {
            field455++;
            return arg1 < 999999999 ? class142.method1131(arg1, true) : class58.field1616;
        } else {
            return null;
        }
    }
}
