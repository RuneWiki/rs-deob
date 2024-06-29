import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class13 {

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "[I")
    public static int[] field237 = new int[14];

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Ljava/lang/String;")
    public static String field236 = "Loaded update list";

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Ljava/lang/String;")
    public static String field239 = "rating: ";

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field242 = 0;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Lbc;")
    public static class175 field243;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method105(int arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        field240++;
        int var2 = 126 % ((arg0 + 44) / 49);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZILog;IIBIII)V")
    public static final void method106(boolean arg0, int arg1, class221 arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        if (arg8 >= 0 && arg8 < 104 && arg4 >= 0 && arg4 < 104) {
            if (!arg0) {
                class201.field3198[arg1][arg8][arg4] = 0;
            }
            while (true) {
                int var9 = arg2.method1517((byte) -96);
                if (var9 == 0) {
                    if (arg0) {
                        class124.field2012[0][arg8][arg4] = class219.field3586[0][arg8][arg4];
                    } else if (arg1 == 0) {
                        class124.field2012[0][arg8][arg4] = -class100.method733(932731 - (-arg7 - arg8), arg4 + 556238 + arg3, -114) * 8;
                    } else {
                        class124.field2012[arg1][arg8][arg4] = class124.field2012[arg1 - 1][arg8][arg4] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg2.method1517((byte) -96);
                    if (arg0) {
                        class124.field2012[0][arg8][arg4] = var10 * 8 + class219.field3586[0][arg8][arg4];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg1 == 0) {
                            class124.field2012[0][arg8][arg4] = -var10 * 8;
                        } else {
                            class124.field2012[arg1][arg8][arg4] = class124.field2012[arg1 - 1][arg8][arg4] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class143.field2305[arg1][arg8][arg4] = arg2.method1535((byte) -115);
                    class5.field60[arg1][arg8][arg4] = (byte) ((var9 - 2) / 4);
                    class226.field3746[arg1][arg8][arg4] = (byte) class202.method1393(arg6 + var9 - 2, 3);
                } else if (var9 > 81) {
                    class44.field811[arg1][arg8][arg4] = (byte) (var9 - 81);
                } else if (!arg0) {
                    class201.field3198[arg1][arg8][arg4] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg2.method1517((byte) -96);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg2.method1517((byte) -96);
                    break;
                }
                if (var11 <= 49) {
                    arg2.method1517((byte) -96);
                }
            }
        }
        int var12 = -88 / ((-arg5 - 54) / 54);
        field244++;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static final void method107(int arg0) {
        field241++;
        class184 var1 = class12.field234;
        synchronized (class12.field234) {
            class270.field4259 = class241.field3895;
            class220.field3601++;
            class241.field3898 = class43.field803;
            class109.field1801 = class221.field3635;
            class115.field1920 = class90.field1493;
            int var2 = -112 / ((43 - arg0) / 35);
            class248.field3953 = class83.field1300;
            class235.field3829 = class85.field1357;
            class161.field2574 = class4.field54;
            class90.field1493 = 0;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    public static void method108(int arg0) {
        field243 = null;
        if (arg0 != 8) {
            method107(111);
        }
        field236 = null;
        field239 = null;
        field237 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()V")
    public static final void method109() {
        class73.field1194 = 0;
        label191: for (int var0 = 0; var0 < class179.field2821; var0++) {
            class126 var1 = class34.field541[var0];
            if (class73.field1197 != null) {
                for (int var2 = 0; var2 < class73.field1197.length; var2++) {
                    if (class73.field1197[var2] != -1000000 && (var1.field2042 <= class73.field1197[var2] || var1.field2048 <= class73.field1197[var2]) && (var1.field2031 <= class64.field1074[var2] || var1.field2035 <= class64.field1074[var2]) && (var1.field2031 >= class280.field4434[var2] || var1.field2035 >= class280.field4434[var2]) && (var1.field2043 <= class77.field1235[var2] || var1.field2025 <= class77.field1235[var2]) && (var1.field2043 >= class201.field3211[var2] || var1.field2025 >= class201.field3211[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field2034 == 1) {
                int var3 = var1.field2029 + class148.field2370 - class8.field105;
                if (var3 >= 0 && var3 <= class148.field2370 + class148.field2370) {
                    int var4 = var1.field2032 + class148.field2370 - class214.field3496;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field2038 + class148.field2370 - class214.field3496;
                    if (var5 > class148.field2370 + class148.field2370) {
                        var5 = class148.field2370 + class148.field2370;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class254.field4040[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class4.field47 - var1.field2031;
                        if (var7 > 32) {
                            var1.field2027 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field2027 = 2;
                            var7 = -var7;
                        }
                        var1.field2030 = (var1.field2043 - class21.field353 << 8) / var7;
                        var1.field2023 = (var1.field2025 - class21.field353 << 8) / var7;
                        var1.field2033 = (var1.field2042 - class11.field157 << 8) / var7;
                        var1.field2036 = (var1.field2048 - class11.field157 << 8) / var7;
                        class175.field2756[class73.field1194++] = var1;
                    }
                }
            } else if (var1.field2034 == 2) {
                int var8 = var1.field2032 + class148.field2370 - class214.field3496;
                if (var8 >= 0 && var8 <= class148.field2370 + class148.field2370) {
                    int var9 = var1.field2029 + class148.field2370 - class8.field105;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field2028 + class148.field2370 - class8.field105;
                    if (var10 > class148.field2370 + class148.field2370) {
                        var10 = class148.field2370 + class148.field2370;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class254.field4040[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class21.field353 - var1.field2043;
                        if (var12 > 32) {
                            var1.field2027 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field2027 = 4;
                            var12 = -var12;
                        }
                        var1.field2047 = (var1.field2031 - class4.field47 << 8) / var12;
                        var1.field2041 = (var1.field2035 - class4.field47 << 8) / var12;
                        var1.field2033 = (var1.field2042 - class11.field157 << 8) / var12;
                        var1.field2036 = (var1.field2048 - class11.field157 << 8) / var12;
                        class175.field2756[class73.field1194++] = var1;
                    }
                }
            } else if (var1.field2034 == 4) {
                int var13 = var1.field2042 - class11.field157;
                if (var13 > 128) {
                    int var14 = var1.field2032 + class148.field2370 - class214.field3496;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field2038 + class148.field2370 - class214.field3496;
                    if (var15 > class148.field2370 + class148.field2370) {
                        var15 = class148.field2370 + class148.field2370;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field2029 + class148.field2370 - class8.field105;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field2028 + class148.field2370 - class8.field105;
                        if (var17 > class148.field2370 + class148.field2370) {
                            var17 = class148.field2370 + class148.field2370;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class254.field4040[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field2027 = 5;
                            var1.field2047 = (var1.field2031 - class4.field47 << 8) / var13;
                            var1.field2041 = (var1.field2035 - class4.field47 << 8) / var13;
                            var1.field2030 = (var1.field2043 - class21.field353 << 8) / var13;
                            var1.field2023 = (var1.field2025 - class21.field353 << 8) / var13;
                            class175.field2756[class73.field1194++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I[B)Ljb;")
    public static final class269 method110(int arg0, byte[] arg1) {
        field245++;
        if (arg1 == null) {
            return null;
        }
        class104 var2 = new class104(arg1, class152.field2464, class74.field1202, class148.field2385, class236.field3847, class145.field2332);
        if (arg0 != -7559) {
            method105(62, (String) null);
        }
        class287.method1923(0);
        return var2;
    }
}
