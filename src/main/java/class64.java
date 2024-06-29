import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public abstract class class64 {

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Lok;")
    public static class146 field1098 = class235.method1724(-12908, "::");

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Lok;")
    public static class146 field1101 = class235.method1724(-12908, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "Lok;")
    public static class146 field1100 = class235.method1724(-12908, "Prendre");

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Lok;")
    private static class146 field1096 = class235.method1724(-12908, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Lan;")
    public static class315 field1102 = null;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "Lok;")
    public static class146 field1103 = field1096;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Lld;")
    public static class118 field1104 = new class118(512);

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "Llc;")
    public static class160 field1105 = new class160();

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "[Lvf;")
    public static class302[] field1106;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V", line = 13)
    public static final void method489(byte arg0) {
        field1097++;
        if (arg0 <= 106) {
            method494(43);
        }
        class140.method1033(0, 0, -5);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)V", line = 35)
    public static final void method491(int arg0, int arg1, int arg2) {
        field1099++;
        if (arg0 != 15297) {
            field1102 = (class315) null;
        }
        class158 var3 = class206.method1564(arg1, 5, -98);
        var3.method1236(arg0 ^ 0xFFFFF19F);
        var3.field2663 = arg2;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V", line = 54)
    public static final void method492(int arg0, int arg1) {
        field1095++;
        if (arg0 == -1 && !class85.field1357) {
            class169.method1305(false);
        } else if (arg0 != -1 && (class174.field2910 != arg0 || !class151.method1193(69)) && class27.field479 != 0 && !class85.field1357) {
            class98.method682(class116.field1865, 0, -98, arg0, false, class27.field479, 2);
        }
        if (arg1 <= 32) {
            method494(1);
        }
        class174.field2910 = arg0;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 92)
    public static void method494(int arg0) {
        int var1 = -98 % ((32 - arg0) / 38);
        field1098 = null;
        field1102 = null;
        field1096 = null;
        field1106 = null;
        field1100 = null;
        field1101 = null;
        field1104 = null;
        field1103 = null;
        field1105 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public abstract void method490(int arg0);

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)I")
    public abstract int method493(int arg0, int arg1, int arg2);
}
