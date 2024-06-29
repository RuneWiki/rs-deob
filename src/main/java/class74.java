import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class74 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "[I")
    public static int[] field958 = new int[2];

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field963 = 0;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field965 = 0;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field966 = -1;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "[I")
    public static int[] field960;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "[Lij;")
    public static class178[] field962;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "[Z")
    public static boolean[] field961;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IILre;)Ljava/lang/String;", line = 8)
    public static final String method472(int arg0, int arg1, class263 arg2) {
        field968++;
        try {
            int var3 = arg2.method1832(-32768);
            if (var3 > arg1) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field4025 += class296.field4529.method2054(var3, arg2.field3986, 0, var4, arg2.field4025, -22213);
            return class318.method2173(7816, var3, arg0, var4);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)I", line = 42)
    public static final int method473(int arg0, int arg1, int arg2, int arg3) {
        field959++;
        if (class294.field4502 == null) {
            return 0;
        }
        int var4 = arg1 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class179.field2645[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var7) * class294.field4502[var6][var4][var5] + class294.field4502[var6][var4 + 1][var5] * var7 >> 7;
        int var9 = arg0 & 0x7F;
        if (arg2 == 64) {
            int var10 = (128 - var7) * class294.field4502[var6][var4][var5 + 1] + class294.field4502[var6][var4 + 1][var5 + 1] * var7 >> 7;
            return (128 - var9) * var8 + var9 * var10 >> 7;
        } else {
            return -116;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLjava/lang/String;)J", line = 82)
    public static final long method474(byte arg0, String arg1) {
        if (arg0 != -128) {
            return -6L;
        }
        field964++;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 = (long) arg1.charAt(var5) + ((var2 << 5) - var2);
        }
        return var2;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)J", line = 103)
    public static final long method475(int arg0, int arg1, int arg2) {
        class221 var3 = class158.field2367[arg0][arg1][arg2];
        return var3 == null || var3.field3368 == null ? 0L : var3.field3368.field3440;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lre;I)V", line = 119)
    public static final void method476(class263 arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field967++;
        while (true) {
            while (arg0.field3986.length > arg0.field4025) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1787(false) == 1) {
                    var2 = true;
                    var4 = arg0.method1787(false);
                    var3 = arg0.method1787(false);
                }
                int var5 = arg0.method1787(false);
                int var6 = arg0.method1787(false);
                int var7 = var5 * 64 - class292.field4439;
                int var8 = class111.field1719 - (var6 * 64 + 1 - class296.field4533);
                if (var7 >= 0 && var8 - 63 >= 0 && class41.field497 > (var7 + 63) && class111.field1719 > var8) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var4 * 8) && var4 * 8 + 8 > var11 && (var3 * 8) <= var12 && var12 < var3 * 8 + 8) {
                                int var13 = arg0.method1787(false);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method1787(false);
                                        if (class123.field1930[var10][var9] == null) {
                                            class123.field1930[var10][var9] = new byte[4096];
                                        }
                                        class123.field1930[var10][var9][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method1824(false);
                                        if (class203.field3034[var10][var9] == null) {
                                            class203.field3034[var10][var9] = new int[4096];
                                        }
                                        class203.field3034[var10][var9][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg0.method1824(false);
                                        if (class255.field3854[var10][var9] == null) {
                                            class255.field3854[var10][var9] = new int[4096];
                                        }
                                        var16--;
                                        class22 var17 = class284.method1980(var16, (byte) 79);
                                        if (var17.field336 != null) {
                                            var17 = var17.method142(arg1 + 1);
                                            if (var17 == null || var17.field318 == -1) {
                                                continue;
                                            }
                                        }
                                        class255.field3854[var10][var9][(63 - var12 << 6) + var11] = var17.field331 + 1;
                                        class186 var18 = new class186();
                                        var18.field2772 = var7;
                                        var18.field2778 = var8;
                                        var18.field2774 = var17.field318;
                                        class113.field1737.method1108(var18, arg1 + 65281);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg0.method1787(false);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field4025++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field4025 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field4025 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 272)
    public static void method477(int arg0) {
        field958 = null;
        field961 = null;
        field960 = null;
        field962 = null;
        if (arg0 != 63) {
            method475(-113, 16, -45);
        }
    }
}
