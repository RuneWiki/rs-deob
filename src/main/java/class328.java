import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class class328 {

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field4919 = 0;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "Loe;")
    public static class127 field4920;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public int field4913;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public int field4914;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public int field4916;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)Z")
    public final boolean method2039(int arg0) {
        if (arg0 == 1) {
            field4918++;
            return (this.field4916 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)Z")
    public static final boolean method2040(boolean arg0, int arg1) {
        field4911++;
        boolean var2 = class345.field5116.method1975();
        if (arg1 != -1) {
            field4920 = null;
        }
        if (var2 == arg0) {
            return true;
        }
        if (!arg0) {
            class345.field5116.method1992();
        } else if (!class345.field5116.method1911()) {
            arg0 = false;
        }
        if (var2 == arg0) {
            return false;
        } else {
            class463.field7116.field2955 = arg0;
            class463.field7116.method80(class7.field86, (byte) -124);
            return true;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static void method2041(byte arg0) {
        field4920 = null;
        if (arg0 != 25) {
            method2045(-122, 125, 23, -110);
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)Z")
    public final boolean method2042(byte arg0) {
        field4912++;
        int var2 = -61 % ((42 - arg0) / 59);
        return (this.field4916 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)Z")
    public final boolean method2043(byte arg0) {
        field4910++;
        if (arg0 == 124) {
            return (this.field4916 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)Z")
    public final boolean method2044(boolean arg0) {
        field4917++;
        if (arg0) {
            return false;
        } else {
            return (this.field4916 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIII)V")
    public static final void method2045(int arg0, int arg1, int arg2, int arg3) {
        field4915++;
        if (arg1 <= 60) {
            method2040(true, -20);
        }
        class64 var4 = class230.method1387(arg3, (byte) 40, 11);
        var4.method441((byte) 58);
        var4.field1051 = arg2;
        var4.field1059 = arg0;
    }

    static {
        new class423("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field4920 = new class127(44, 4);
        field4921 = 0;
    }
}
