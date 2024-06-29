import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class30 extends class183 {

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "[I")
    public static int[] field366 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "Ljava/lang/String;")
    public static String field371 = null;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "[Z")
    public static boolean[] field370 = new boolean[200];

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public int field365;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILin;)I", line = 19)
    public static final int method175(int arg0, int arg1, class344 arg2) {
        field368++;
        if (arg2.field5218 == null || arg2.field5218.length <= arg1) {
            return -2;
        }
        if (arg0 != 100) {
            field366 = (int[]) null;
        }
        try {
            int[] var3 = arg2.field5218[arg1];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var9 = class213.field3072[var3[var5++]];
                }
                if (var7 == 2) {
                    var9 = class237.field3367[var3[var5++]];
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 3) {
                    var9 = class223.field3221[var3[var5++]];
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class344 var12 = class151.method1101(-35, var11);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class115.method854((byte) -71, var13).field2817 || class66.field869)) {
                        for (int var14 = 0; var14 < var12.field5278.length; var14++) {
                            if (var13 + 1 == var12.field5278[var14]) {
                                var9 += var12.field5237[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class324.field4920[var3[var5++]];
                }
                if (var7 == 6) {
                    var9 = class311.field4702[class237.field3367[var3[var5++]] - 1];
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 7) {
                    var9 = class324.field4920[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class173.field2356.field3416;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class15.field176[var15]) {
                            var9 += class237.field3367[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class344 var18 = class151.method1101(-41, var17);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class115.method854((byte) -77, var19).field2817 || class66.field869)) {
                        for (int var20 = 0; var20 < var18.field5278.length; var20++) {
                            if ((var19 + 1) == var18.field5278[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class24.field301;
                }
                if (var7 == 12) {
                    var9 = class203.field2906;
                }
                if (var7 == 13) {
                    int var21 = class324.field4920[var3[var5++]];
                    int var22 = var3[var5++];
                    var9 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var9 = class115.method855(var23, (byte) 105);
                }
                if (var7 == 18) {
                    var9 = (class173.field2356.field3745 >> 7) + class132.field1809;
                }
                if (var7 == 19) {
                    var9 = (class173.field2356.field3679 >> 7) + class296.field4394;
                }
                if (var7 == 20) {
                    var9 = var3[var5++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var4 += var9;
                    }
                    if (var6 == 1) {
                        var4 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var4 /= var9;
                    }
                    if (var6 == 3) {
                        var4 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 227)
    public static void method176(int arg0) {
        if (arg0 == -11) {
            field371 = null;
            field370 = null;
            field366 = null;
        }
    }
}
