import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class71 {

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field788 = 0;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field789 = 0;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Lam;")
    public static class286 field787;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IILfd;)I")
    public static final int method407(int arg0, int arg1, class194 arg2) {
        field786++;
        if (arg2.field2579 == null || arg2.field2579.length <= arg1) {
            return -2;
        }
        try {
            if (arg0 != 29042) {
                return -59;
            }
            int[] var3 = arg2.field2579[arg1];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var8 = class198.field2653[var3[var5++]];
                }
                if (var7 == 2) {
                    var8 = class342.field4580[var3[var5++]];
                }
                if (var7 == 3) {
                    var8 = class232.field3199[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class194 var12 = class57.method301(var11, (byte) 127);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class65.method368(var13, -113).field1522 || class21.field210)) {
                        for (int var14 = 0; var14 < var12.field2473.length; var14++) {
                            if (var13 + 1 == var12.field2473[var14]) {
                                var8 += var12.field2489[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class254.field3495[var3[var5++]];
                }
                if (var7 == 6) {
                    var8 = class73.field809[class342.field4580[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class254.field3495[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class427.field6264.field2022;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class327.field4362[var15]) {
                            var8 += class342.field4580[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class194 var18 = class57.method301(var17, (byte) 124);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class65.method368(var19, arg0 ^ 0xFFFF8EF8).field1522 || class21.field210)) {
                        for (int var20 = 0; var20 < var18.field2473.length; var20++) {
                            if (var19 + 1 == var18.field2473[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class418.field6008;
                }
                if (var7 == 12) {
                    var8 = class194.field2587;
                }
                if (var7 == 13) {
                    int var21 = class254.field3495[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = class181.method955(var23, (byte) 35);
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 18) {
                    var8 = (class427.field6264.field152 >> 7) + class70.field767;
                }
                if (var7 == 19) {
                    var8 = (class427.field6264.field154 >> 7) + class291.field3961;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
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

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
    public static final void method408(int arg0, int arg1) {
        class14.field130.method614(-126, arg1);
        field785++;
        int var2 = 5 % ((arg0 + 19) / 61);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method409(int arg0) {
        field787 = null;
        int var1 = -46 / ((-arg0 - 25) / 58);
    }
}
