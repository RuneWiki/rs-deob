import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class16 {

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field195 = 0;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Lue;")
    public static class286 field196 = null;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "Z")
    public static boolean field203 = false;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field204 = 0;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "Lfe;")
    public static class153 field199 = null;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Lfh;")
    public static class140 field190;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[I")
    public static int[] field192;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 7)
    public static final void method115(int arg0) {
        field200++;
        if (arg0 >= -114) {
            return;
        }
        while (class240.field3490.method1310(class315.field4648, 8) >= 27) {
            int var1 = class240.field3490.method1311(15, 7);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class251.field3688[var1] == null) {
                var2 = true;
                class251.field3688[var1] = new class169();
            }
            class169 var3 = class251.field3688[var1];
            class305.field4455[class257.field3747++] = var1;
            var3.field4875 = class313.field4603;
            if (var3.field2345 != null && var3.field2345.method1205(0)) {
                class65.method478((byte) 64, var3);
            }
            int var4 = class240.field3490.method1311(5, 7);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class159.field2267[class240.field3490.method1311(3, 7)];
            if (var2) {
                var3.field4912 = var3.field4926 = var5;
            }
            int var6 = class240.field3490.method1311(5, 7);
            var3.method1250((byte) 90, class148.method1138(-3, class240.field3490.method1311(14, 7)));
            int var7 = class240.field3490.method1311(1, 7);
            if (var6 > 15) {
                var6 -= 32;
            }
            if (var7 == 1) {
                class35.field430[class318.field4689++] = var1;
            }
            int var8 = class240.field3490.method1311(1, 7);
            var3.method2302(23751, var3.field2345.field2224);
            var3.field4871 = var3.field2345.field2223;
            var3.field4903 = var3.field2345.field2197;
            if (var3.field4903 == 0) {
                var3.field4926 = 0;
            }
            var3.method2290((byte) 124, class359.field5616.field4936[0] + var4, var3.method1699(-1), class359.field5616.field4842[0] + var6, var8 == 1);
            if (var3.field2345.method1205(0)) {
                class1.method2(128, (class219) null, var3.field4842[0], var3, var3.field4936[0], (class239) null, 0, class56.field724);
            }
        }
        class240.field3490.method1303(0);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)I", line = 88)
    public static final int method116(int arg0, boolean arg1) {
        field198++;
        if (arg0 != 2061) {
            return 58;
        }
        long var2 = class6.method37(10828);
        for (class132 var4 = arg1 ? (class132) class322.field4726.method2277(arg0 + 11231) : (class132) class322.field4726.method2278((byte) -67); var4 != null; var4 = (class132) class322.field4726.method2278((byte) -105)) {
            if (var2 > (var4.field1794 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field1794 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field304;
                    class208.field2956[var5] = class360.field5638[var5];
                    var4.method179((byte) 51);
                    return var5;
                }
                var4.method179((byte) 51);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIII)V", line = 126)
    public static final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != -1) {
            return;
        }
        field197++;
        if (arg6 < 1 || arg3 < 1 || arg6 > 102 || arg3 > 102) {
            return;
        }
        if (!class138.method1038(true) && (class9.field101[0][arg6][arg3] & 0x2) == 0) {
            int var8 = arg1;
            if ((class9.field101[arg1][arg6][arg3] & 0x8) != 0) {
                var8 = 0;
            }
            if (class226.field3256 != var8) {
                return;
            }
        }
        int var9 = arg1;
        if (arg1 < 3 && (class9.field101[1][arg6][arg3] & 0x2) == 2) {
            var9 = arg1 + 1;
        }
        class276.method1868((byte) -116, arg1, var9, arg3, class231.field3312[arg1], arg4, arg6);
        if (arg5 >= 0) {
            boolean var10 = class329.field4812;
            class329.field4812 = true;
            class171.method1259(arg2, arg1, arg5, var9, arg6, 4, false, arg3, class231.field3312[arg1], false, arg7);
            class329.field4812 = var10;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 179)
    public static final int method118(boolean arg0, String arg1) {
        field193++;
        return arg0 ? class83.method614(10, arg1, 92, true) : 47;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V", line = 197)
    public static void method119(boolean arg0) {
        field190 = null;
        field199 = null;
        field192 = null;
        if (arg0) {
            method118(true, (String) null);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILf;)V", line = 210)
    public static final void method120(int arg0, class239 arg1) {
        if (arg0 != 15) {
            field203 = false;
        }
        field188++;
        class96 var2 = (class96) class169.field2344.method2279(class201.method1476(arg0 - 138, arg1.field3475), -128);
        if (var2 == null) {
            return;
        }
        if (var2.field1260 != null) {
            class186.field2548.method2246(var2.field1260);
            var2.field1260 = null;
        }
        var2.method179((byte) 51);
    }
}
