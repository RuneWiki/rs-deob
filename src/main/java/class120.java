import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class120 extends class249 {

    @OriginalMember(owner = "client!b", name = "r", descriptor = "[I")
    public static int[] field2220 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!b", name = "x", descriptor = "Lmb;")
    private static class96 field2226 = class243.method1708("Ok", (byte) 94);

    @OriginalMember(owner = "client!b", name = "w", descriptor = "Lmb;")
    public static class96 field2225 = field2226;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "Lmb;")
    public static class96 field2223 = class243.method1708("Lade Konfiguration )2 ", (byte) 91);

    @OriginalMember(owner = "client!b", name = "y", descriptor = "Lmb;")
    public static class96 field2227 = class243.method1708("", (byte) 96);

    @OriginalMember(owner = "client!b", name = "t", descriptor = "Lmb;")
    public static class96 field2222 = field2227;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "Lmb;")
    public static class96 field2221 = field2227;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "B")
    public byte field2218;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public int field2217;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "Lji;")
    public static class228 field2228;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "Lmb;")
    public class96 field2219;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "Lmb;")
    public class96 field2224;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIILnb;IZJ)Z")
    public static final boolean method925(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class108 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class25.field418 == class173.field3022;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class264.field4614 || var24 >= class17.field254) {
                    return false;
                }
                class187 var25 = class259.field4487[arg0][var15][var24];
                if (var25 != null && var25.field3282 >= 5) {
                    return false;
                }
            }
        }
        class70 var16 = new class70();
        var16.field1197 = arg11;
        var16.field1198 = arg0;
        var16.field1200 = arg5;
        var16.field1202 = arg6;
        var16.field1209 = arg7;
        var16.field1214 = arg8;
        var16.field1212 = arg9;
        var16.field1208 = arg1;
        var16.field1204 = arg2;
        var16.field1205 = arg1 + arg3 - 1;
        var16.field1211 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class259.field4487[var22][var17][var20] == null) {
                        class259.field4487[var22][var17][var20] = new class187(var22, var17, var20);
                    }
                }
                class187 var23 = class259.field4487[arg0][var17][var20];
                var23.field3274[var23.field3282] = var16;
                var23.field3268[var23.field3282] = var21;
                var23.field3276 |= var21;
                var23.field3282++;
                if (var13 && class34.field605[var17][var20] != 0) {
                    var14 = class34.field605[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class34.field605[var18][var19] == 0) {
                        class34.field605[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class185.field3222[class19.field320++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    public static void method926(int arg0) {
        field2225 = null;
        field2222 = null;
        field2220 = null;
        field2223 = null;
        if (arg0 != 1) {
            field2221 = null;
        }
        field2226 = null;
        field2221 = null;
        field2227 = null;
        field2228 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V")
    public static final void method927() {
        for (int var0 = 0; var0 < class19.field320; var0++) {
            class70 var1 = class185.field3222[var0];
            class62.method444(var1);
            class185.field3222[var0] = null;
        }
        class19.field320 = 0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lnb;IIIII)V")
    public static final void method928(class108 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class163.field2893 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class264.field4614) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class17.field254 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class187 var14 = class259.field4487[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class173.field3022[var11][var12 + 1][var13] + class173.field3022[var11][var12][var13] + class173.field3022[var11][var12][var13 + 1] + class173.field3022[var11][var12 + 1][var13 + 1]) / 4 - (class173.field3022[arg1][arg2 + 1][arg3] + class173.field3022[arg1][arg2][arg3] + class173.field3022[arg1][arg2][arg3 + 1] + class173.field3022[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class19 var16 = var14.field3281;
                                    if (var16 != null) {
                                        if (var16.field311.method831()) {
                                            arg0.method832(var16.field311, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field303 != null && var16.field303.method831()) {
                                            arg0.method832(var16.field303, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3282; var17++) {
                                        class70 var18 = var14.field3274[var17];
                                        if (var18 != null && var18.field1214.method831() && (var18.field1208 == var12 || var7 == var12) && (var18.field1204 == var13 || var9 == var13)) {
                                            int var19 = var18.field1205 + 1 - var18.field1208;
                                            int var20 = var18.field1211 + 1 - var18.field1204;
                                            arg0.method832(var18.field1214, (var18.field1208 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1204 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }
}
