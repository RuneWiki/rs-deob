import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class6 {

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Z")
    public static boolean field36 = false;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Lcf;")
    public static class92 field38 = new class92();

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "Z")
    public static boolean field41 = false;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "Lch;")
    public static class151 field40 = new class151("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "Llo;")
    public static class280 field42 = new class280("runescape", 0);

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "[Lcu;")
    public static class184[] field43 = new class184[16];

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BI)I")
    public static final int method31(byte arg0, int arg1) {
        field39++;
        if (arg0 > -101) {
            return 3;
        }
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IBII)V")
    public static final void method32(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg0 << 3;
        field37++;
        int var5 = arg2 << 3;
        int var6 = arg3 << 3;
        if (class390.field5393 == 2) {
            class366.field5028 = var5;
            class103.field1455 = var6;
            class158.field2258 = var4;
        }
        class421.field5826 = (float) var5;
        class91.field1281 = (float) var6;
        class141.method1020(-101);
        if (arg1 != -62) {
            field43 = null;
        }
        class303.field4311 = true;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method33(int arg0) {
        field40 = null;
        if (arg0 > -36) {
            field42 = null;
        }
        field43 = null;
        field38 = null;
        field42 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lfq;)V")
    public static final void method34(class87 arg0) {
        if (class237.field3467 >= 65535) {
            return;
        }
        class357.field4906[class237.field3467] = arg0;
        class392.field5409[class237.field3467] = false;
        class237.field3467++;
        int var1 = arg0.field1226;
        if (arg0.field1233) {
            var1 = 0;
        }
        int var2 = arg0.field1226;
        if (arg0.field1223) {
            var2 = class310.field4398 - 1;
        }
        for (int var3 = var1; var3 <= var2; var3++) {
            int var4 = 0;
            int var5 = arg0.field1461 + class289.field4100 - arg0.field1467 >> class380.field5232;
            if (var5 < 0) {
                var4 -= var5;
                var5 = 0;
            }
            int var6 = arg0.field1467 + arg0.field1461 - class289.field4100 >> class380.field5232;
            if (var6 >= class97.field1374) {
                var6 = class97.field1374 - 1;
            }
            for (int var7 = var5; var7 <= var6; var7++) {
                short var8 = arg0.field1228[var4++];
                int var9 = (var8 >>> 8) + (arg0.field1466 + class289.field4100 - arg0.field1467 >> class380.field5232);
                int var10 = (var8 & 0xFF) + var9 - 1;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var10 >= class310.field4401) {
                    var10 = class310.field4401 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    long var12 = class221.field3191[var3][var11][var7];
                    if ((var12 & 0xFFFFL) == 0L) {
                        class221.field3191[var3][var11][var7] = var12 | (long) class237.field3467;
                    } else if ((var12 & 0xFFFF0000L) == 0L) {
                        class221.field3191[var3][var11][var7] = var12 | (long) class237.field3467 << 16;
                    } else if ((var12 & 0xFFFF00000000L) == 0L) {
                        class221.field3191[var3][var11][var7] = var12 | (long) class237.field3467 << 32;
                    } else if ((var12 & 0xFFFF000000000000L) == 0L) {
                        class221.field3191[var3][var11][var7] = var12 | (long) class237.field3467 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)I")
    public static final int method35(int arg0, int arg1, int arg2) {
        field35++;
        if (arg2 < 47) {
            field36 = false;
        }
        return arg0 == 1 || arg0 == 3 ? class422.field5848[arg1 & 0x3] : class259.field3695[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lvc;Luq;IIIII)V")
    public static final void method36(class89 arg0, class316 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class310.field4398 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class310.field4401) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class97.field1374 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class52 var15 = class385.field5285[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class340.field4692[var12].method591(var13, var14) + class340.field4692[var12].method591(var13 + 1, var14) + class340.field4692[var12].method591(var13, var14 + 1) + class340.field4692[var12].method591(var13 + 1, var14 + 1)) / 4 - (class340.field4692[arg2].method591(arg3, arg4) + class340.field4692[arg2].method591(arg3 + 1, arg4) + class340.field4692[arg2].method591(arg3, arg4 + 1) + class340.field4692[arg2].method591(arg3 + 1, arg4 + 1)) / 4;
                                    class421 var17 = var15.field772;
                                    class421 var18 = var15.field752;
                                    if (var17 != null && var17.method68(-80)) {
                                        arg1.method70(var7, 117, arg0, (var13 - arg3) * class47.field719 + (1 - arg5) * class289.field4100, (var14 - arg4) * class47.field719 + (1 - arg6) * class289.field4100, var17, var16);
                                    }
                                    if (var18 != null && var18.method68(71)) {
                                        arg1.method70(var7, 44, arg0, (var13 - arg3) * class47.field719 + (1 - arg5) * class289.field4100, (var14 - arg4) * class47.field719 + (1 - arg6) * class289.field4100, var18, var16);
                                    }
                                    for (class131 var19 = var15.field763; var19 != null; var19 = var19.field1796) {
                                        class325 var20 = var19.field1803;
                                        if (var20 != null && var20.method68(-63) && (var20.field4535 == var13 || var8 == var13) && (var20.field4539 == var14 || var10 == var14)) {
                                            int var21 = var20.field4526 + 1 - var20.field4535;
                                            int var22 = var20.field4534 + 1 - var20.field4539;
                                            arg1.method70(var7, 86, arg0, (var20.field4535 - arg3) * class47.field719 + (var21 - arg5) * class289.field4100, (var20.field4539 - arg4) * class47.field719 + (var22 - arg6) * class289.field4100, var20, var16);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }
}
