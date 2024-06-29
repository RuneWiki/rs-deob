import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class28 extends class110 {

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    public static int field378 = 0;

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "I")
    public static int field387 = 0;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
    public static int field377 = 0;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "[I")
    public static int[] field380;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "[I")
    public static int[] field381;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZI[[[Lum;III)Z", line = 5)
    public static final boolean method176(boolean arg0, int arg1, class221[][][] arg2, int arg3, int arg4, int arg5) {
        byte var6 = arg0 ? 1 : (byte) (class207.field3135 & 0xFF);
        field385++;
        if (class81.field1136[class180.field2697][arg5][arg1] == var6) {
            return false;
        } else if ((class179.field2645[class180.field2697][arg5][arg1] & 0x4) == 0) {
            return false;
        } else {
            int var7 = 0;
            byte var8 = 0;
            class97.field1462[var8] = arg5;
            int var31 = var8 + 1;
            class93.field1399[var8] = arg1;
            class81.field1136[class180.field2697][arg5][arg1] = var6;
            while (var7 != var31) {
                int var9 = class97.field1462[var7] >> 24 & 0xFF;
                int var10 = class97.field1462[var7] >> 16 & 0xFF;
                int var11 = class97.field1462[var7] & 0xFFFF;
                int var12 = class93.field1399[var7] & 0xFFFF;
                int var13 = class93.field1399[var7] >> 16 & 0xFF;
                var7 = var7 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class179.field2645[class180.field2697][var11][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label239: for (int var16 = class180.field2697 + 1; var16 <= 3; var16++) {
                    if ((class179.field2645[var16][var11][var12] & 0x8) == 0) {
                        if (var14 && arg2[var16][var11][var12] != null) {
                            if (arg2[var16][var11][var12].field3370 != null) {
                                int var17 = class64.method423(16776960, var10);
                                if (arg2[var16][var11][var12].field3370.field2460 == var17 || arg2[var16][var11][var12].field3370.field2457 == var17) {
                                    continue;
                                }
                                if (var9 != 0) {
                                    int var18 = class64.method423(arg4 + 16776959, var9);
                                    if (arg2[var16][var11][var12].field3370.field2460 == var18 || arg2[var16][var11][var12].field3370.field2457 == var18) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var19 = class64.method423(16776960, var13);
                                    if (arg2[var16][var11][var12].field3370.field2460 == var19 || arg2[var16][var11][var12].field3370.field2457 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg2[var16][var11][var12].field3354 != null) {
                                for (int var20 = 0; var20 < arg2[var16][var11][var12].field3374; var20++) {
                                    int var21 = (int) (arg2[var16][var11][var12].field3354[var20].field4720 >> 14 & 0x3FL);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var22 = (int) (arg2[var16][var11][var12].field3354[var20].field4720 >> 20 & 0x3L);
                                    int var23 = var22 << 6 | var21;
                                    if (var10 == var23 || var9 != 0 && var9 == var23 || var13 != 0 && var13 == var23) {
                                        continue label239;
                                    }
                                }
                            }
                        }
                        class221 var24 = arg2[var16][var11][var12];
                        if (var24 != null && var24.field3374 > 0) {
                            for (int var25 = 0; var25 < var24.field3374; var25++) {
                                class311 var26 = var24.field3354[var25];
                                if (var26.field4724 != var26.field4722 || var26.field4735 != var26.field4726) {
                                    for (int var27 = var26.field4724; var27 <= var26.field4722; var27++) {
                                        for (int var28 = var26.field4735; var28 <= var26.field4726; var28++) {
                                            class81.field1136[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class81.field1136[var16][var11][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var29 = var11 << 7;
                    int var30 = var12 << 7;
                    if (class294.field4502[class180.field2697 + 1][var11][var12] > class56.field713[arg3]) {
                        class56.field713[arg3] = class294.field4502[class180.field2697 + 1][var11][var12];
                    }
                    if (var29 < class162.field2445[arg3]) {
                        class162.field2445[arg3] = var29;
                    } else if (class74.field958[arg3] < var29) {
                        class74.field958[arg3] = var29;
                    }
                    if (class210.field3167[arg3] > var30) {
                        class210.field3167[arg3] = var30;
                    } else if (class8.field55[arg3] < var30) {
                        class8.field55[arg3] = var30;
                    }
                }
                if (!var14) {
                    if (var11 >= 1 && class81.field1136[class180.field2697][var11 - 1][var12] != var6) {
                        class97.field1462[var31] = class140.method1009(class140.method1009(var11 - 1, 1179648), -754974720);
                        class93.field1399[var31] = class140.method1009(var12, 1245184);
                        class81.field1136[class180.field2697][var11 - 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < 104) {
                        if ((var11 - 1) >= 0 && class81.field1136[class180.field2697][var11 - 1][var12] != var6 && (class179.field2645[class180.field2697][var11][var12] & 0x4) == 0 && (class179.field2645[class180.field2697][var11 - 1][var12 - 1] & 0x4) == 0) {
                            class97.field1462[var31] = class140.method1009(1375731712, class140.method1009(var11 - 1, 1179648));
                            class93.field1399[var31] = class140.method1009(var12, 1245184);
                            class81.field1136[class180.field2697][var11 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class81.field1136[class180.field2697][var11][var12] != var6) {
                            class97.field1462[var31] = class140.method1009(318767104, class140.method1009(5373952, var11));
                            class93.field1399[var31] = class140.method1009(5439488, var12);
                            class81.field1136[class180.field2697][var11][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var11 + 1) < 104 && class81.field1136[class180.field2697][var11 + 1][var12] != var6 && (class179.field2645[class180.field2697][var11][var12] & 0x4) == 0 && (class179.field2645[class180.field2697][var11 + 1][var12 - 1] & 0x4) == 0) {
                            class97.field1462[var31] = class140.method1009(-1845493760, class140.method1009(5373952, var11 + 1));
                            class93.field1399[var31] = class140.method1009(5439488, var12);
                            class81.field1136[class180.field2697][var11 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (var11 + 1 < 104 && class81.field1136[class180.field2697][var11 + 1][var12] != var6) {
                        class97.field1462[var31] = class140.method1009(1392508928, class140.method1009(9568256, var11 + 1));
                        class93.field1399[var31] = class140.method1009(var12, 9633792);
                        class81.field1136[class180.field2697][var11 + 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var11 - 1) >= 0 && class81.field1136[class180.field2697][var11 - 1][var12] != var6 && (class179.field2645[class180.field2697][var11][var12] & 0x4) == 0 && (class179.field2645[class180.field2697][var11 - 1][var12 + 1] & 0x4) == 0) {
                            class97.field1462[var31] = class140.method1009(class140.method1009(var11 - 1, 13762560), 301989888);
                            class93.field1399[var31] = class140.method1009(var12, 13828096);
                            class81.field1136[class180.field2697][var11 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class81.field1136[class180.field2697][var11][var12] != var6) {
                            class97.field1462[var31] = class140.method1009(class140.method1009(13762560, var11), -1828716544);
                            class93.field1399[var31] = class140.method1009(var12, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class81.field1136[class180.field2697][var11][var12] = var6;
                        }
                        if (var11 + 1 < 104 && class81.field1136[class180.field2697][var11 + 1][var12] != var6 && (class179.field2645[class180.field2697][var11][var12] & 0x4) == 0 && (class179.field2645[class180.field2697][var11 + 1][var12 + 1] & 0x4) == 0) {
                            class97.field1462[var31] = class140.method1009(-771751936, class140.method1009(9568256, var11 + 1));
                            class93.field1399[var31] = class140.method1009(var12, 9633792);
                            class81.field1136[class180.field2697][var11 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class56.field713[arg3] != -1000000) {
                class56.field713[arg3] += 10;
                class162.field2445[arg3] -= 50;
                class74.field958[arg3] += 50;
                class8.field55[arg3] += 50;
                class210.field3167[arg3] -= 50;
            }
            if (arg4 != 1) {
                field387 = 11;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 314)
    public class28() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(III)I", line = 320)
    private final int method177(int arg0, int arg1, int arg2) {
        field379++;
        if (arg0 != -25295) {
            method180(13);
        }
        int var4 = arg1 * 57 + arg2;
        int var5 = var4 ^ var4 << 1;
        return 4096 - (((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BC)Z", line = 339)
    public static final boolean method178(byte arg0, char arg1) {
        if (arg0 == 92) {
            field386++;
            return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "(I)V", line = 351)
    public static void method179(int arg0) {
        field381 = null;
        if (arg0 <= -42) {
            field380 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "(I)Ljava/lang/String;", line = 363)
    public static final String method180(int arg0) {
        field383++;
        String var1 = "www";
        if (~class252.field3769 != arg0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class171.field2569 != null) {
            var2 = "/p=" + class171.field2569;
        }
        return "http://" + var1 + ".runescape.com/l=" + class256.field3882 + "/a=" + class5.field24 + var2 + "/";
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(III)Ljava/lang/String;", line = 381)
    public static final String method181(int arg0, int arg1, int arg2) {
        field388++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (~var3 >= arg0) {
            return var3 <= 0 ? "<col=ffff00>" : "<col=c0ff00>";
        } else {
            return "<col=80ff00>";
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)[I", line = 421)
    public final int[] method46(int arg0, int arg1) {
        field384++;
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (arg0 != 1) {
            this.method177(92, -77, -124);
        }
        if (this.field1695.field875) {
            int var4 = class177.field2615[arg1];
            for (int var5 = 0; var5 < class124.field1936; var5++) {
                var3[var5] = this.method177(class206.method1421(arg0, -25296), var4, class249.field3714[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(III)Ltm;", line = 457)
    public static final class163 method182(int arg0, int arg1, int arg2) {
        class221 var3 = class158.field2367[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class163 var4 = var3.field3370;
            var3.field3370 = null;
            return var4;
        }
    }
}
