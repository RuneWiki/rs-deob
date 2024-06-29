import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class99 extends class137 {

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "Laf;")
    private static class7 field2352 = class48.method406(40, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "Laf;")
    public static class7 field2349 = field2352;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "Laf;")
    public static class7 field2358 = class48.method406(40, "(Y<)4col>");

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "Laf;")
    private static class7 field2362 = class48.method406(40, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "Laf;")
    public static class7 field2361 = field2362;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "Lob;")
    public class99 field2347;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "Lob;")
    public class99 field2356;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZII)I")
    public static final int method810(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = 256 - arg2;
        if (!arg1) {
            method813((byte) -51);
        }
        field2353++;
        return ((arg0 & 0xFF00) * var4 + (arg3 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var4 + ((arg3 & 0xFF00FF) * arg2) & 0xFF00FF00) >> 8;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILrd;)Laf;")
    public static final class7 method811(int arg0, class122 arg1) {
        if (arg0 < 5) {
            return null;
        } else {
            field2359++;
            return class92.method743(true, arg1, 32767);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public static void method812(int arg0) {
        field2352 = null;
        field2361 = null;
        if (arg0 != 1) {
            method811(67, null);
        }
        field2362 = null;
        field2349 = null;
        field2358 = null;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)V")
    public static final void method813(byte arg0) {
        field2355++;
        class102.field2421.method391((byte) -73);
        if (arg0 != -56) {
            field2358 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZBLdf;)V")
    public static final void method814(boolean arg0, byte arg1, class28 arg2) {
        int var3 = arg2.field734;
        field2357++;
        int var4 = (int) arg2.field3261;
        arg2.method1124((byte) 62);
        if (arg0) {
            class58.method471(0, var3);
        }
        class2.method16(var3, -101);
        if (arg1 < 77) {
            return;
        }
        class103 var5 = class37.method328(0, var4);
        if (var5 != null) {
            class141.method1151(15569, var5);
        }
        class78.field1817 = false;
        class19.field449 = 0;
        class113.method892(class24.field640, 118, class18.field436, class27.field711, class52.field1247);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lof;IIIIIII)V")
    public static final void method815(class103 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2350++;
        if (class69.field1513) {
            class42.field998 = 32;
        } else {
            class42.field998 = 0;
        }
        int var8 = -119 % ((30 - arg6) / 57);
        class69.field1513 = false;
        if (class97.field2311 != 0) {
            if (arg7 >= arg1 && arg7 < arg1 + 16 && arg2 >= arg3 && arg3 + 16 > arg2) {
                arg0.field2486 -= 4;
                class141.method1151(15569, arg0);
            } else if (arg7 >= arg1 && arg1 + 16 > arg7 && arg2 >= arg3 + arg5 - 16 && arg3 + arg5 > arg2) {
                arg0.field2486 += 4;
                class141.method1151(15569, arg0);
            } else if (arg1 - class42.field998 <= arg7 && class42.field998 + arg1 + 16 > arg7 && arg2 >= arg3 + 16 && arg3 + arg5 - 16 > arg2) {
                int var9 = (arg5 - 32) * arg5 / arg4;
                if (var9 < 8) {
                    var9 = 8;
                }
                int var10 = arg5 - var9 - 32;
                int var11 = arg2 - arg3 - var9 / 2 - 16;
                arg0.field2486 = (arg4 - arg5) * var11 / var10;
                class141.method1151(15569, arg0);
                class69.field1513 = true;
            }
        }
        if (class142.field3364 == 0) {
            return;
        }
        int var12 = arg0.field2550;
        if (arg1 - var12 <= arg7 && arg2 >= arg3 && arg1 + 16 > arg7 && arg2 <= arg3 + arg5) {
            arg0.field2486 += class142.field3364 * 45;
            class141.method1151(15569, arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIZ[B)Laf;")
    public static final class7 method816(int arg0, int arg1, boolean arg2, byte[] arg3) {
        class7 var4 = new class7();
        field2354++;
        var4.field162 = new byte[arg0];
        var4.field139 = 0;
        for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
            if (arg3[var5] != 0) {
                var4.field162[var4.field139++] = arg3[var5];
            }
        }
        if (arg2) {
            return null;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIB)I")
    public static final int method817(int arg0, int arg1, byte arg2) {
        int var3 = -10 % ((arg2 - 44) / 41);
        int var4 = class69.method553(arg0 - 1, 116, arg1 - 1) + class69.method553(arg0 - 1, 75, arg1 + 1) + class69.method553(arg0 - -1, 113, arg1 + -1) + class69.method553(arg0 + 1, 109, arg1 + 1);
        field2351++;
        int var5 = class69.method553(arg0, 125, arg1 - 1) + class69.method553(arg0, 125, arg1 + 1) + class69.method553(arg0 + -1, 99, arg1) + class69.method553(arg0 + 1, 95, arg1);
        int var6 = class69.method553(arg0, 77, arg1);
        return var6 / 4 + var4 / 16 + var5 / 8;
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(B)V")
    public final void method818(byte arg0) {
        field2348++;
        if (this.field2347 == null) {
            return;
        }
        if (arg0 > -109) {
            method817(-91, -36, (byte) 7);
        }
        this.field2347.field2356 = this.field2356;
        this.field2356.field2347 = this.field2347;
        this.field2347 = null;
        this.field2356 = null;
    }
}
