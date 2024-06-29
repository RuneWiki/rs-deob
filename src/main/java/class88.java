import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class88 extends class89 {

    @OriginalMember(owner = "client!me", name = "lb", descriptor = "Z")
    public boolean field2130 = false;

    @OriginalMember(owner = "client!me", name = "cb", descriptor = "I")
    private int field2121 = 0;

    @OriginalMember(owner = "client!me", name = "jb", descriptor = "I")
    private int field2128 = 0;

    @OriginalMember(owner = "client!me", name = "nb", descriptor = "I")
    private int field2132;

    @OriginalMember(owner = "client!me", name = "ub", descriptor = "I")
    public int field2139;

    @OriginalMember(owner = "client!me", name = "pb", descriptor = "I")
    public int field2134;

    @OriginalMember(owner = "client!me", name = "kb", descriptor = "I")
    public int field2129;

    @OriginalMember(owner = "client!me", name = "db", descriptor = "I")
    public int field2122;

    @OriginalMember(owner = "client!me", name = "bb", descriptor = "I")
    public int field2120;

    @OriginalMember(owner = "client!me", name = "tb", descriptor = "Lw;")
    private class153 field2138;

    @OriginalMember(owner = "client!me", name = "fb", descriptor = "Lr;")
    private static class118 field2124 = class153.method1136(110, "Connecting to update server");

    @OriginalMember(owner = "client!me", name = "hb", descriptor = "Lr;")
    public static class118 field2126 = field2124;

    @OriginalMember(owner = "client!me", name = "mb", descriptor = "I")
    public static int field2131 = 0;

    @OriginalMember(owner = "client!me", name = "gb", descriptor = "Lr;")
    public static class118 field2125 = class153.method1136(115, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!me", name = "sb", descriptor = "Lr;")
    public static class118 field2137 = class153.method1136(107, "Neuer Benutzer");

    @OriginalMember(owner = "client!me", name = "vb", descriptor = "I")
    public static int field2140 = 0;

    @OriginalMember(owner = "client!me", name = "rb", descriptor = "Lr;")
    public static class118 field2136 = class153.method1136(94, ": ");

    @OriginalMember(owner = "client!me", name = "ib", descriptor = "Lqb;")
    public static class113 field2127 = new class113();

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!me", name = "ab", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!me", name = "eb", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!me", name = "ob", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!me", name = "qb", descriptor = "Lff;")
    public static class42 field2135;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)Lwb;")
    public final class155 method215(int arg0) {
        if (arg0 != 15246) {
            this.method215(31);
        }
        class51 var2 = class1.method2(-15697, this.field2132);
        field2133++;
        class155 var3;
        if (this.field2130) {
            var3 = var2.method455((byte) 73, -1);
        } else {
            var3 = var2.method455((byte) 73, this.field2121);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)V")
    public final void method710(int arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field2119++;
        if (this.field2130) {
            return;
        }
        this.field2128 += arg0;
        while (this.field2138.field3478[this.field2121] < this.field2128) {
            this.field2128 -= this.field2138.field3478[this.field2121];
            this.field2121++;
            if (this.field2121 >= this.field2138.field3464.length) {
                this.field2130 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
    public static void method711(byte arg0) {
        if (arg0 <= 39) {
            field2135 = null;
        }
        field2136 = null;
        field2126 = null;
        field2127 = null;
        field2125 = null;
        field2137 = null;
        field2124 = null;
        field2135 = null;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIIIIII)V")
    public class88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2132 = arg0;
        this.field2139 = arg1;
        this.field2134 = arg3;
        this.field2129 = arg4;
        this.field2122 = arg2;
        this.field2120 = arg5 + arg6;
        int var8 = class1.method2(-15697, this.field2132).field1234;
        if (var8 == -1) {
            this.field2130 = true;
        } else {
            this.field2130 = false;
            this.field2138 = class125.method970((byte) -68, var8);
        }
    }
}
