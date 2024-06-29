import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class135 {

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Lae;")
    public static class6 field3295 = class64.method474(113, "Wen m-Ochten Sie entfernen?");

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "Lae;")
    public static class6 field3307 = class64.method474(122, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "Lae;")
    public static class6 field3302 = class64.method474(123, "Schlie-8en");

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Lae;")
    public static class6 field3304 = class64.method474(103, "Duell akzeptieren");

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Lae;")
    public static class6 field3293 = class64.method474(106, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "Lae;")
    public static class6 field3303 = class64.method474(126, "null");

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field3300 = 0;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Lsd;")
    public static class114 field3294;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Lva;")
    public static class128 field3296;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Lva;")
    public static class128 field3297;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IJ)V", line = 4)
    public static final void method1101(int arg0, long arg1) {
        field3306++;
        if (arg1 == 0L) {
            return;
        }
        if (class7.field139 >= 100 && class123.field3033 != 1 || class7.field139 >= 200) {
            class73.method575(class133.field3262, class4.field52, false, 0);
            return;
        }
        class6 var3 = class95.method783(arg1, (byte) 96).method44((byte) -116);
        for (int var4 = 0; var4 < class7.field139; var4++) {
            if (class109.field2609[var4] == arg1) {
                class73.method575(class133.field3262, class85.method731(new class6[] { var3, class118.field2805 }, arg0 ^ 0x38E9), false, 0);
                return;
            }
        }
        for (int var5 = arg0; var5 < class24.field613; var5++) {
            if (class64.field1402[var5] == arg1) {
                class73.method575(class133.field3262, class85.method731(new class6[] { class103.field2423, var3, class68.field1492 }, 14569), false, 0);
                return;
            }
        }
        if (var3.method60(class12.field229.field1456, (byte) 113)) {
            return;
        }
        class41.field924[class7.field139] = var3;
        class109.field2609[class7.field139] = arg1;
        class66.field1470[class7.field139] = 0;
        class95.field2241++;
        class7.field139++;
        class139.field3380 = true;
        class111.field2660.method938((byte) 63, 90);
        class111.field2660.method639(true, arg1);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)V", line = 81)
    public static final void method1102(int arg0, byte arg1) {
        field3305++;
        if (arg0 == -1 || !class42.field958[arg0]) {
            return;
        }
        class118.field2802.method148(arg0, 12319);
        if (class35.field828[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class35.field828[arg0].length; var3++) {
            if (class35.field828[arg0][var3] != null) {
                if (class35.field828[arg0][var3].field2971 == 2) {
                    var2 = false;
                } else {
                    class35.field828[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class35.field828[arg0] = null;
        }
        if (arg1 >= 49) {
            class42.field958[arg0] = false;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lm;Lae;I)I", line = 134)
    public static final int method1103(class77 arg0, class6 arg1, int arg2) {
        int var3 = arg0.field1821;
        if (arg2 > -81) {
            field3300 = 84;
        }
        arg0.method666((byte) 30, arg1.field93);
        field3301++;
        arg0.field1821 += class40.field904.method505(arg1.field114, 255, 0, arg1.field93, arg0.field1821, arg0.field1858);
        return arg0.field1821 - var3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 152)
    public static void method1104(int arg0) {
        field3307 = null;
        field3297 = null;
        field3302 = null;
        if (arg0 != 15) {
            field3304 = null;
        }
        field3295 = null;
        field3293 = null;
        field3304 = null;
        field3294 = null;
        field3296 = null;
        field3303 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILte;)I", line = 179)
    public static final int method1105(int arg0, int arg1, class121 arg2) {
        field3298++;
        if (arg2.field2968 == null || arg0 >= arg2.field2968.length) {
            return -2;
        }
        try {
            int[] var3 = arg2.field2968[arg0];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            if (arg1 != 2) {
                method1104(-35);
            }
            while (true) {
                int var7 = var3[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var5;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 1) {
                    var8 = class59.field1285[var3[var4++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 2) {
                    var8 = class125.field3050[var3[var4++]];
                }
                if (var7 == 3) {
                    var8 = class139.field3404[var3[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class121 var12 = class67.method490((byte) 61, var11);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class43.method356(-123, var13).field538 || class30.field725)) {
                        for (int var14 = 0; var14 < var12.field2963.length; var14++) {
                            if (var13 + 1 == var12.field2963[var14]) {
                                var8 += var12.field2946[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class133.field3245[var3[var4++]];
                }
                if (var7 == 6) {
                    var8 = class104.field2459[class125.field3050[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class133.field3245[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class12.field229.field1436;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class93.field2220[var15]) {
                            var8 += class125.field3050[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class121 var18 = class67.method490((byte) 125, var17);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class43.method356(-69, var19).field538 || class30.field725)) {
                        for (int var20 = 0; var20 < var18.field2963.length; var20++) {
                            if (var19 + 1 == var18.field2963[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class87.field2088;
                }
                if (var7 == 12) {
                    var8 = class58.field1267;
                }
                if (var7 == 13) {
                    int var21 = class133.field3245[var3[var4++]];
                    int var22 = var3[var4++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var8 = class81.method692(var23, (byte) -83);
                }
                if (var7 == 18) {
                    var8 = (class12.field229.field1783 >> 7) + class130.field3164;
                }
                if (var7 == 19) {
                    var8 = (class12.field229.field1752 >> 7) + class61.field1329;
                }
                if (var7 == 20) {
                    var8 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var5 += var8;
                    }
                    if (var6 == 1) {
                        var5 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var5 /= var8;
                    }
                    if (var6 == 3) {
                        var5 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }
}
