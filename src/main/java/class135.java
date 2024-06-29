import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class135 {

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Lrf;")
    public static class163 field2784 = class53.method392(-113, ")2");

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lfc;")
    public static class54 field2781 = new class54(64);

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lrf;")
    public static class163 field2785 = class53.method392(-117, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lfc;")
    public static class54 field2787 = new class54(64);

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Lrf;")
    public static class163 field2788 = class53.method392(-54, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Z")
    public static boolean field2791 = false;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Lrf;")
    public static class163 field2789 = class53.method392(-94, "p11_full");

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lrf;")
    public static class163 field2790 = class53.method392(62, "Hierhin gehen");

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BII)I")
    public static final int method891(byte arg0, int arg1, int arg2) {
        if (arg0 != -15) {
            return -82;
        }
        field2786++;
        int var3 = 0;
        while (arg1 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg1--;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)I")
    public static final int method892(int arg0, int arg1, int arg2) {
        if (arg0 <= 82) {
            method893((byte) 76);
        }
        field2783++;
        int var3 = class25.method152(arg2 - 1, arg1 - 1, false) + class25.method152(arg2 - 1, arg1 + 1, false) + class25.method152(arg2 + 1, arg1 + -1, false) + class25.method152(arg2 + 1, arg1 + 1, false);
        int var4 = class25.method152(arg2, arg1 - 1, false) + class25.method152(arg2, arg1 + 1, false) + class25.method152(arg2 + -1, arg1, false) + class25.method152(arg2 + 1, arg1, false);
        int var5 = class25.method152(arg2, arg1, false);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method893(byte arg0) {
        if (arg0 < 53) {
            field2785 = null;
        }
        field2784 = null;
        field2788 = null;
        field2789 = null;
        field2790 = null;
        field2787 = null;
        field2785 = null;
        field2781 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZI)I")
    public static final int method894(int arg0, boolean arg1, int arg2) {
        class95 var3 = (class95) class65.field1373.method465((long) arg0, (byte) -33);
        field2782++;
        if (var3 == null) {
            return 0;
        } else {
            if (arg1) {
                method892(4, -45, 50);
            }
            return arg2 >= 0 && arg2 < var3.field2038.length ? var3.field2038[arg2] : 0;
        }
    }
}
