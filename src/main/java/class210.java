import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class210 {

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public int field3226 = -1;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "Z")
    public static boolean field3237 = false;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Z")
    public static boolean field3236 = false;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "Lfk;")
    public static class317 field3232 = new class317();

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public static int field3241 = 50;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "[I")
    public static int[] field3240 = new int[256];

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public static int field3242 = 0;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field3243 = 0;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "Lrn;")
    public static class18 field3234;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Lvd;")
    public class72 field3227;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "[I")
    public int[] field3230;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "[I")
    public static int[] field3235;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "[Ljava/lang/String;")
    public String[] field3231;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1554(int arg0) {
        class362.field5734.method655(arg0 ^ 0xFFFFB47D);
        if (arg0 != 19330) {
            field3237 = true;
        }
        field3239++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)Z", line = 17)
    public static final boolean method1555(int arg0, int arg1) {
        field3228++;
        if (class18.field299 == arg1) {
            return false;
        }
        class206.field3171 = new int[104][104];
        class244.field3809 = new int[104][104];
        class74.field1090 = new int[4][13][13];
        class321.field4947 = new int[104][104];
        class335.field5123 = new int[104][104];
        for (int var2 = arg0; var2 < 4; var2++) {
            class57.field905[var2] = new class290(104, 104);
        }
        class157.field2521 = new byte[4][104][104];
        class146.field2386 = new byte[4][104][104];
        class349.field5540 = new class317[4][104][104];
        if (class240.field3737) {
            class299.method2153(4, 104, 104);
            class127.method1097(104, 104);
            class49.field774 = new class110[13][13];
        }
        class18.field299 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(JZ)V", line = 64)
    public static final void method1556(long arg0, boolean arg1) {
        if (!class278.field4292) {
            class279.field4312 += (float) arg0 * class121.field1935 / 40.0F;
            class313.field4846 += (float) arg0 * class101.field1531 / 40.0F;
        }
        field3233++;
        if (arg1) {
            method1557((byte) -74);
        }
        int var3 = class64.field979;
        if (class231.field3609 != var3) {
            int var4 = var3 - class231.field3609;
            int var5 = (int) ((long) var4 * arg0 / 320L);
            if (var4 <= 0) {
                if (var5 == 0) {
                    var5 = -1;
                } else if (var5 < var4) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = 1;
            } else if (var5 > var4) {
                var5 = var4;
            }
            class231.field3609 += var5;
        }
        int var6 = class62.field950;
        if (class226.field3519 != var6) {
            int var7 = var6 - class226.field3519;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class226.field3519 += var8;
        }
        class304.method2189((byte) -102);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V", line = 153)
    public static void method1557(byte arg0) {
        field3240 = null;
        field3232 = null;
        field3234 = null;
        if (arg0 >= -101) {
            method1555(-34, -104);
        }
        field3235 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILrg;I)I", line = 170)
    public static final int method1558(int arg0, class342 arg1, int arg2) {
        field3238++;
        if (arg1.field5434 == null || arg1.field5434.length <= arg2) {
            return -2;
        }
        if (arg0 != -17249) {
            method1554(-109);
        }
        try {
            int var3 = 0;
            int var4 = 0;
            int[] var5 = arg1.field5434[arg2];
            byte var6 = 0;
            while (true) {
                int var7 = var5[var3++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var8 = class176.field2778[var5[var3++]];
                }
                if (var7 == 2) {
                    var8 = class100.field1497[var5[var3++]];
                }
                if (var7 == 3) {
                    var8 = class260.field3982[var5[var3++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 4) {
                    int var10 = var5[var3++] << 16;
                    int var11 = var10 + var5[var3++];
                    class342 var12 = class355.method2497(0, var11);
                    int var13 = var5[var3++];
                    if (var13 != -1 && (!class48.method469(10, var13).field4095 || class42.field668)) {
                        for (int var14 = 0; var14 < var12.field5280.length; var14++) {
                            if (var13 + 1 == var12.field5280[var14]) {
                                var8 += var12.field5344[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class160.field2538[var5[var3++]];
                }
                if (var7 == 6) {
                    var8 = class109.field1631[class100.field1497[var5[var3++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class160.field2538[var5[var3++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class173.field2746.field2722;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class305.field4739[var15]) {
                            var8 += class100.field1497[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var5[var3++] << 16;
                    int var17 = var16 + var5[var3++];
                    class342 var18 = class355.method2497(0, var17);
                    int var19 = var5[var3++];
                    if (var19 != -1 && (!class48.method469(arg0 + 17259, var19).field4095 || class42.field668)) {
                        for (int var20 = 0; var20 < var18.field5280.length; var20++) {
                            if (var19 + 1 == var18.field5280[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class61.field940;
                }
                if (var7 == 12) {
                    var8 = class194.field3052;
                }
                if (var7 == 13) {
                    int var21 = class160.field2538[var5[var3++]];
                    int var22 = var5[var3++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var5[var3++];
                    var8 = class305.method2195(var23, (byte) 5);
                }
                if (var7 == 18) {
                    var8 = (class173.field2746.field1359 >> 7) + class358.field5696;
                }
                if (var7 == 19) {
                    var8 = (class173.field2746.field1286 >> 7) + class49.field755;
                }
                if (var7 == 20) {
                    var8 = var5[var3++];
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
        } catch (Exception var25) {
            return -1;
        }
    }
}
