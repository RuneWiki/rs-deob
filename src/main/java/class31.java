import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class31 extends class153 {

    @OriginalMember(owner = "client!na", name = "E", descriptor = "Lpj;")
    public static class237 field611 = class33.method353("RuneScape wird geladen )2 bitte warten)3)3)3", 55);

    @OriginalMember(owner = "client!na", name = "M", descriptor = "I")
    public static int field619 = 0;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "Lpj;")
    private static class237 field621 = class33.method353("Loaded interfaces", 121);

    @OriginalMember(owner = "client!na", name = "I", descriptor = "Lpj;")
    public static class237 field615 = field621;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "Lfa;")
    public static class239 field612;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(I)V")
    public static void method285(int arg0) {
        if (arg0 != 27583) {
            field613 = 108;
        }
        field615 = null;
        field612 = null;
        field621 = null;
        field611 = null;
    }

    @OriginalMember(owner = "client!na", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method286(int arg0);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(JI)Lpj;")
    public static final class237 method287(long arg0, int arg1) {
        class235.field4071.setTime(new Date(arg0));
        int var3 = class235.field4071.get(7);
        int var4 = class235.field4071.get(arg1);
        int var5 = class235.field4071.get(2);
        field617++;
        int var6 = class235.field4071.get(1);
        int var7 = class235.field4071.get(11);
        int var8 = class235.field4071.get(12);
        int var9 = class235.field4071.get(13);
        return class238.method1626(new class237[] { class179.field3148[var3 - 1], class33.field711, class14.method130(var4 / 10, (byte) 117), class14.method130(var4 % 10, (byte) 117), class226.field3876, class273.field4713[var5], class226.field3876, class14.method130(var6, (byte) 117), class234.field4047, class14.method130(var7 / 10, (byte) 117), class14.method130(var7 % 10, (byte) 117), class170.field2978, class14.method130(var8 / 10, (byte) 117), class14.method130(var8 % 10, (byte) 117), class170.field2978, class14.method130(var9 / 10, (byte) 117), class14.method130(var9 % 10, (byte) 117), class45.field982 }, arg1 ^ 0xFFFFFF89);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILpj;II)V")
    public static final void method288(int arg0, int arg1, class237 arg2, int arg3, int arg4) {
        field618++;
        class141 var5 = class61.method519(arg4, 0, arg3);
        if (var5 == null) {
            return;
        }
        if (var5.field2466 != null) {
            class117 var6 = new class117();
            var6.field2049 = arg1;
            var6.field2053 = var5.field2466;
            var6.field2046 = var5;
            var6.field2057 = arg2;
            class229.method1519(-101, var6);
        }
        boolean var7 = true;
        if (var5.field2492 > 0) {
            var7 = class34.method365(var5, (byte) -2);
        }
        if (!var7 || !class46.method432(client.method1042(var5), 4, arg1 - 1)) {
            return;
        }
        if (arg1 == 1) {
            class107.field1909++;
            class223.field3830.method368(arg0 - 101, 39);
            class223.field3830.method290((byte) -20, arg3);
            class223.field3830.method350((byte) 19, arg4);
        }
        if (arg1 == 2) {
            class216.field3761++;
            class223.field3830.method368(-98, 131);
            class223.field3830.method290((byte) -20, arg3);
            class223.field3830.method350((byte) 19, arg4);
        }
        if (arg1 == 3) {
            class108.field1924++;
            class223.field3830.method368(-128, 36);
            class223.field3830.method290((byte) -20, arg3);
            class223.field3830.method350((byte) 19, arg4);
        }
        if (arg1 == 4) {
            class213.field3634++;
            class223.field3830.method368(110, 34);
            class223.field3830.method290((byte) -20, arg3);
            class223.field3830.method350((byte) 19, arg4);
        }
        if (arg0 == arg1) {
            class184.field3230++;
            class223.field3830.method368(-120, 215);
            class223.field3830.method290((byte) -20, arg3);
            class223.field3830.method350((byte) 19, arg4);
        }
        if (arg1 == 6) {
            class273.field4733++;
            class223.field3830.method368(-104, 83);
            class223.field3830.method290((byte) -20, arg3);
            class223.field3830.method350((byte) 19, arg4);
        }
        if (arg1 == 7) {
            class223.field3830.method368(-104, 237);
            class271.field4673++;
            class223.field3830.method290((byte) -20, arg3);
            class223.field3830.method350((byte) 19, arg4);
        }
        if (arg1 == 8) {
            class249.field4320++;
            class223.field3830.method368(-113, 238);
            class223.field3830.method290((byte) -20, arg3);
            class223.field3830.method350((byte) 19, arg4);
        }
        if (arg1 == 9) {
            class46.field990++;
            class223.field3830.method368(-102, 79);
            class223.field3830.method290((byte) -20, arg3);
            class223.field3830.method350((byte) 19, arg4);
        }
        if (arg1 == 10) {
            class223.field3830.method368(-125, 161);
            class223.field3830.method290((byte) -20, arg3);
            class223.field3830.method350((byte) 19, arg4);
            class83.field1561++;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)Z")
    public abstract boolean method289(boolean arg0);
}
