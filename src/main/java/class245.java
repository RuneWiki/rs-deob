import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class245 {

    @OriginalMember(owner = "client!id", name = "c", descriptor = "B")
    private byte field4160;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public int field4159;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public int field4162;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public int field4167;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public int field4168;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public int field4170;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "[Z")
    public static boolean[] field4166 = new boolean[200];

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Lbe;")
    public static class283 field4163 = class153.method941(-16, "<col=ff9040>");

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Lbe;")
    public static class283 field4165 = class153.method941(-119, "<col=ffffff>");

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Lbe;")
    public static class283 field4174 = class153.method941(126, "; Expires=");

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Lbe;")
    public static class283 field4171 = class153.method941(-70, "cookieprefix");

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field4173 = 0;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 10)
    public static final void method1665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class141 var20 = new class141(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class86.field1459[var21][arg1][arg2] == null) {
                    class86.field1459[var21][arg1][arg2] = new class160(var21, arg1, arg2);
                }
            }
            class86.field1459[arg0][arg1][arg2].field2634 = var20;
        } else if (arg3 == 1) {
            class141 var22 = new class141(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class86.field1459[var23][arg1][arg2] == null) {
                    class86.field1459[var23][arg1][arg2] = new class160(var23, arg1, arg2);
                }
            }
            class86.field1459[arg0][arg1][arg2].field2634 = var22;
        } else {
            class211 var24 = new class211(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class86.field1459[var25][arg1][arg2] == null) {
                    class86.field1459[var25][arg1][arg2] = new class160(var25, arg1, arg2);
                }
            }
            class86.field1459[arg0][arg1][arg2].field2638 = var24;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)I", line = 59)
    public final int method1666(byte arg0) {
        if (arg0 != 76) {
            field4166 = (boolean[]) null;
        }
        field4158++;
        return this.field4160 & 0x7;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)I", line = 78)
    public final int method1667(int arg0) {
        if (arg0 == 0) {
            field4169++;
            return (this.field4160 & 0x8) == 8 ? 1 : 0;
        } else {
            return -108;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZLkg;I)V", line = 90)
    public static final void method1668(boolean arg0, class69 arg1, int arg2) {
        field4164++;
        int var3 = arg1.field998 == 0 ? arg1.field1069 : arg1.field998;
        int var4 = arg1.field987 == arg2 ? arg1.field1085 : arg1.field987;
        class13.method71(var3, var4, class122.field2036[arg1.field1079 >> 16], arg0, arg1.field1079, 29);
        if (arg1.field1043 != null) {
            class13.method71(var3, var4, arg1.field1043, arg0, arg1.field1079, -105);
        }
        class159 var5 = (class159) class58.field805.method1612((long) arg1.field1079, 106);
        if (var5 != null) {
            class194.method1250(var5.field2600, 1, var4, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V", line = 135)
    public static final void method1669(boolean arg0) {
        class167.method1035();
        if (arg0) {
            return;
        }
        if (browsercontrol.iscreated()) {
            browsercontrol.hide();
        }
        field4161++;
        class57.method372(class264.field4487, 31499);
        class197.method1268(23725, class264.field4487);
        if (class272.field4571 != null) {
            class272.field4571.method52(176, class264.field4487);
        }
        class174.method1152(29840);
        client.method1598(class264.field4487, (byte) -122);
        class86.method553(class264.field4487, 3);
        if (class272.field4571 != null) {
            class272.field4571.method53(-4277, class264.field4487);
        }
        class27.method186((byte) -108);
        class167.method1029(class264.field4487, class119.field2007 * 2);
        class13.method73(82);
        class6.method34(0);
        class23.field356 = 0L;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IBILl;I)V", line = 176)
    public static final void method1670(int arg0, byte arg1, int arg2, class281 arg3, int arg4) {
        field4172++;
        if (arg1 != -57) {
            field4163 = (class283) null;
        }
        for (class183 var5 = (class183) class58.field797.method1812((byte) -103); var5 != null; var5 = (class183) class58.field797.method1813((byte) 124)) {
            if (var5.field3144 == arg0 && (arg2 * 128) == var5.field3138 && (arg4 * 128) == var5.field3149 && var5.field3148.field4693 == arg3.field4693) {
                if (var5.field3155 != null) {
                    class301.field5089.method1275(var5.field3155);
                    var5.field3155 = null;
                }
                if (var5.field3135 != null) {
                    class301.field5089.method1275(var5.field3135);
                    var5.field3135 = null;
                }
                var5.method557((byte) -89);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V", line = 213)
    public static void method1671(byte arg0) {
        field4171 = null;
        field4174 = null;
        field4166 = null;
        if (arg0 != 73) {
            method1671((byte) -125);
        }
        field4165 = null;
        field4163 = null;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V", line = 241)
    public class245() {
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lfe;)V", line = 243)
    public class245(class229 arg0) {
        this.field4160 = arg0.method1497(false);
        this.field4159 = arg0.method1496(true);
        this.field4162 = arg0.method1528(true);
        this.field4167 = arg0.method1528(true);
        this.field4168 = arg0.method1528(true);
        this.field4170 = arg0.method1528(true);
    }
}
