import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 extends class56 {

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
    private int field12 = -32768;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field6 = 100;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field4 = 0;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "[Ljd;")
    public static class85[] field5 = new class85[200];

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "Ljd;")
    public static class85 field13 = class221.method1499("gelb:", (byte) -79);

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "Lge;")
    public static class68 field10;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3++;
        class26 var11 = class32.method221(11649, this.field9).method415(0, this.field11, (class106) null, true);
        if (var11 != null) {
            var11.method1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field12 = var11.method6();
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V")
    public static final void method2(byte arg0) {
        if (class129.field2267 != -1) {
            class66.method445(-122, class129.field2267);
        }
        for (int var1 = 0; var1 < class22.field307; var1++) {
            if (class20.field286[var1]) {
                class217.field3803[var1] = true;
            }
            class269.field4778[var1] = class20.field286[var1];
            class20.field286[var1] = false;
        }
        class98.field1770 = -1;
        class22.field309 = null;
        class239.field4124 = -1;
        if (arg0 < 122) {
            return;
        }
        field1++;
        class211.field3704 = class151.field2555;
        if (class129.field2267 != -1) {
            class22.field307 = 0;
            class182.method1252(-1, class154.field2664, 0, (byte) 4, class154.field2662, 0, 0, 0, class129.field2267);
        }
        class179.method1212();
        class218.field3820 = 0;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ldb;IIIILrh;Lnb;I)V")
    public static final void method3(class17 arg0, int arg1, int arg2, int arg3, int arg4, class44 arg5, class199 arg6, int arg7) {
        field8++;
        class185 var8 = new class185();
        var8.field3176 = arg1;
        var8.field3188 = arg2 * arg4;
        var8.field3178 = arg7 * 128;
        if (arg6 != null) {
            var8.field3171 = arg6.field3465;
            var8.field3177 = arg6;
            var8.field3186 = arg6.field3436;
            var8.field3170 = arg6.field3442;
            int var10 = arg6.field3473;
            var8.field3184 = arg6.field3469;
            var8.field3168 = arg6.field3402 * 128;
            int var11 = arg6.field3464;
            if (arg3 == 1 || arg3 == 3) {
                var10 = arg6.field3464;
                var11 = arg6.field3473;
            }
            var8.field3173 = (arg2 + var11) * 128;
            var8.field3164 = (arg7 + var10) * 128;
            if (arg6.field3474 != null) {
                var8.field3181 = true;
                var8.method1276(true);
            }
            if (var8.field3184 != null) {
                var8.field3175 = var8.field3171 + ((int) (Math.random() * (double) (var8.field3170 - var8.field3171)));
            }
            class247.field4254.method116((byte) -121, var8);
            return;
        }
        if (arg0 != null) {
            var8.field3183 = arg0;
            class263 var9 = arg0.field247;
            if (var9.field4695 != null) {
                var8.field3181 = true;
                var9 = var9.method1794((byte) 95);
            }
            if (var9 != null) {
                var8.field3164 = (arg7 + var9.field4700) * 128;
                var8.field3173 = (arg2 + var9.field4700) * 128;
                var8.field3186 = class207.method1415(-1, arg0);
                var8.field3168 = var9.field4687 * 128;
            }
            class187.field3218.method116((byte) -121, var8);
            return;
        }
        if (arg5 == null) {
            return;
        }
        var8.field3169 = arg5;
        var8.field3164 = (arg5.method311((byte) 119) + arg7) * 128;
        var8.field3173 = (arg5.method311((byte) -37) + arg2) * 128;
        var8.field3186 = class168.method1128(arg5, -3102);
        var8.field3168 = arg5.field795 * 128;
        class31.field472.method1393(var8, arg5.field762.method624(false), 817);
        return;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method4(int arg0) {
        field13 = null;
        if (arg0 == 10772) {
            field10 = null;
            field5 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class212 var20 = new class212(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class99.field1780[var21][arg1][arg2] == null) {
                    class99.field1780[var21][arg1][arg2] = new class208(var21, arg1, arg2);
                }
            }
            class99.field1780[arg0][arg1][arg2].field3640 = var20;
        } else if (arg3 == 1) {
            class212 var22 = new class212(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class99.field1780[var23][arg1][arg2] == null) {
                    class99.field1780[var23][arg1][arg2] = new class208(var23, arg1, arg2);
                }
            }
            class99.field1780[arg0][arg1][arg2].field3640 = var22;
        } else {
            class170 var24 = new class170(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class99.field1780[var25][arg1][arg2] == null) {
                    class99.field1780[var25][arg1][arg2] = new class208(var25, arg1, arg2);
                }
            }
            class99.field1780[arg0][arg1][arg2].field3644 = var24;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "()I")
    public final int method6() {
        field2++;
        return this.field12;
    }
}
