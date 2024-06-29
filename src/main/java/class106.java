import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class106 extends class110 {

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "Leh;")
    private static class47 field2219 = class195.method1282((byte) -4, "Prepared sound engine");

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
    public static int field2216 = 0;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "Z")
    public static boolean field2224 = true;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "Leh;")
    public static class47 field2211 = field2219;

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "Leh;")
    public static class47 field2222 = class195.method1282((byte) -4, "<col=00ffff>");

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "Leh;")
    private static class47 field2225 = class195.method1282((byte) -4, "Login");

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "Leh;")
    public static class47 field2223 = field2225;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "Llg;")
    public class106 field2213;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "Llg;")
    public class106 field2220;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "Lah;")
    public static class9 field2218;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "[[[I")
    public static int[][][] field2215;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZI)V")
    public static final void method861(boolean arg0, int arg1) {
        field2214++;
        if (class140.field2743 == null) {
            return;
        }
        try {
            class68 var2 = new class68(4);
            var2.method609(arg0 ? 2 : 3, (byte) -121);
            var2.method585(0, -224823824);
            class140.field2743.method679(arg1, (byte) 42, var2.field1495, 0);
        } catch (IOException var4) {
            try {
                class140.field2743.method678((byte) -101);
            } catch (Exception var3) {
            }
            class53.field1032++;
            class140.field2743 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILah;I)[Ldh;")
    public static final class38[] method862(int arg0, int arg1, class9 arg2, int arg3) {
        field2212++;
        if (arg0 > -52) {
            field2211 = null;
        }
        return class187.method1240(arg3, (byte) 71, arg1, arg2) ? class174.method1168((byte) 101) : null;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Z)V")
    public static void method863(boolean arg0) {
        field2215 = null;
        field2219 = null;
        field2222 = null;
        field2218 = null;
        field2211 = null;
        field2223 = null;
        if (!arg0) {
            method864(-5, -20, -62, -84, -95, -33, -34, 46, null, 28, true, -41L);
        }
        field2225 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIILkb;IZJ)Z")
    public static final boolean method864(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class92 arg8, int arg9, boolean arg10, long arg11) {
        for (int var13 = arg1; var13 < arg1 + arg3; var13++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                if (var13 < 0 || var20 < 0 || var13 >= class103.field2156 || var20 >= class100.field2102) {
                    return false;
                }
                class152 var21 = class173.field3351[arg0][var13][var20];
                if (var21 != null && var21.field2975 >= 5) {
                    return false;
                }
            }
        }
        class60 var14 = new class60();
        var14.field1157 = arg11;
        var14.field1155 = arg0;
        var14.field1152 = arg5;
        var14.field1161 = arg6;
        var14.field1162 = arg7;
        var14.field1150 = arg8;
        var14.field1159 = arg9;
        var14.field1172 = arg1;
        var14.field1170 = arg2;
        var14.field1153 = arg1 + arg3 - 1;
        var14.field1168 = arg2 + arg4 - 1;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                int var17 = 0;
                if (var15 > arg1) {
                    var17++;
                }
                if (var15 < arg1 + arg3 - 1) {
                    var17 += 4;
                }
                if (var16 > arg2) {
                    var17 += 8;
                }
                if (var16 < arg2 + arg4 - 1) {
                    var17 += 2;
                }
                for (int var18 = arg0; var18 >= 0; var18--) {
                    if (class173.field3351[var18][var15][var16] == null) {
                        class173.field3351[var18][var15][var16] = new class152(var18, var15, var16);
                    }
                }
                class152 var19 = class173.field3351[arg0][var15][var16];
                var19.field2979[var19.field2975] = var14;
                var19.field2986[var19.field2975] = var17;
                var19.field2993 |= var17;
                var19.field2975++;
            }
        }
        if (arg10) {
            class103.field2166[class14.field305++] = var14;
        }
        return true;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
    public final void method865(int arg0) {
        field2217++;
        if (this.field2213 == null) {
            return;
        }
        this.field2213.field2220 = this.field2220;
        this.field2220.field2213 = this.field2213;
        this.field2213 = null;
        if (arg0 == -13283) {
            this.field2220 = null;
        }
    }
}
