import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class189 {

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    private int field2216;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "[Lra;")
    private class179[] field2215;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "J")
    private long field2223;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "Lra;")
    private class179 field2219;

    static {
        new class72("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIZI)I", line = 13)
    public static final int method1170(int arg0, int arg1, boolean arg2, int arg3) {
        field2222++;
        if (class304.field4096 == null) {
            return 0;
        }
        int var4 = arg1 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || (class22.field232 - 1) < var4 || var5 > (class196.field2329 - 1)) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class222.field2770[1][var4][var5] & 0x2) != 0) {
            var6 = arg3 + 1;
        }
        return arg2 ? class304.field4096[var6].method1054(arg1, arg0) : 66;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BJ)Lra;", line = 40)
    public final class179 method1171(byte arg0, long arg1) {
        this.field2223 = arg1;
        field2220++;
        class179 var4 = this.field2215[(int) ((long) (this.field2216 - 1) & arg1)];
        for (this.field2219 = var4.field2085; this.field2219 != var4; this.field2219 = this.field2219.field2085) {
            if (this.field2219.field2090 == arg1) {
                class179 var5 = this.field2219;
                this.field2219 = this.field2219.field2085;
                return var5;
            }
        }
        this.field2219 = null;
        return arg0 < 52 ? null : null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Lra;", line = 74)
    public final class179 method1172(int arg0) {
        field2224++;
        if (arg0 <= 75) {
            return null;
        } else if (this.field2219 == null) {
            return null;
        } else {
            class179 var2 = this.field2215[(int) ((long) (this.field2216 - 1) & this.field2223)];
            while (this.field2219 != var2) {
                if (this.field2219.field2090 == this.field2223) {
                    class179 var3 = this.field2219;
                    this.field2219 = this.field2219.field2085;
                    return var3;
                }
                this.field2219 = this.field2219.field2085;
            }
            this.field2219 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIZ)I", line = 109)
    public static final int method1173(int arg0, int arg1, int arg2, boolean arg3) {
        field2217++;
        if (arg3) {
            return 13;
        } else if ((class222.field2770[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (class222.field2770[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(JLra;I)V", line = 131)
    public final void method1174(long arg0, class179 arg1, int arg2) {
        if (arg1.field2089 != null) {
            arg1.method1123((byte) -31);
        }
        field2218++;
        if (arg2 != 30059) {
            this.field2216 = -23;
        }
        class179 var5 = this.field2215[(int) (arg0 & (long) (this.field2216 - 1))];
        arg1.field2089 = var5.field2089;
        arg1.field2085 = var5;
        arg1.field2089.field2085 = arg1;
        arg1.field2085.field2089 = arg1;
        arg1.field2090 = arg0;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[B)Z", line = 153)
    public static final boolean method1175(int arg0, byte[] arg1) {
        field2221++;
        class242 var2 = new class242(arg1);
        int var3 = var2.method1563(arg0 ^ 0xFFFFFF82);
        if (var3 != 1) {
            return false;
        }
        if (arg0 != 2) {
            method1173(75, 92, 119, true);
        }
        boolean var4 = var2.method1563(-128) == 1;
        if (var4) {
            class194.method1205(127, var2);
        }
        class270.method1697(var2, -2);
        return true;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I)V", line = 184)
    public class189(int arg0) {
        this.field2216 = arg0;
        this.field2215 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2215[var2] = new class179();
            var3.field2089 = var3;
            var3.field2085 = var3;
        }
    }
}
