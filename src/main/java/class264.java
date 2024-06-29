import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class264 {

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "I")
    private int field3736;

    @OriginalMember(owner = "client!gga", name = "j", descriptor = "[Lpea;")
    private class665[] field3742;

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "I")
    public static int field3734 = 0;

    @OriginalMember(owner = "client!gga", name = "e", descriptor = "[I")
    public static int[] field3737 = new int[14];

    @OriginalMember(owner = "client!gga", name = "p", descriptor = "[Z")
    public static boolean[] field3748 = new boolean[200];

    @OriginalMember(owner = "client!gga", name = "o", descriptor = "Ldg;")
    public static class377 field3747 = new class377();

    @OriginalMember(owner = "client!gga", name = "q", descriptor = "I")
    public static int field3749 = 0;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!gga", name = "h", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!gga", name = "i", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!gga", name = "k", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!gga", name = "m", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!gga", name = "n", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!gga", name = "l", descriptor = "J")
    private long field3744;

    @OriginalMember(owner = "client!gga", name = "g", descriptor = "Lpea;")
    private class665 field3739;

    @OriginalMember(owner = "client!gga", name = "f", descriptor = "[S")
    public static short[] field3738;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(III)Z", line = 11)
    public static final boolean method1602(int arg0, int arg1, int arg2) {
        field3741++;
        if (arg1 <= 36) {
            method1606(-58, null, true, 124, -54, (byte) 113);
        }
        return (arg0 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)V", line = 22)
    public static void method1603(int arg0) {
        field3748 = null;
        int var1 = 9 / ((30 - arg0) / 55);
        field3747 = null;
        field3737 = null;
        field3738 = null;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(JI)Lpea;", line = 39)
    public final class665 method1604(long arg0, int arg1) {
        field3735++;
        this.field3744 = arg0;
        class665 var4 = this.field3742[(int) ((long) (this.field3736 + arg1) & arg0)];
        for (this.field3739 = var4.field9368; this.field3739 != var4; this.field3739 = this.field3739.field9368) {
            if (this.field3739.field9371 == arg0) {
                class665 var5 = this.field3739;
                this.field3739 = this.field3739.field9368;
                return var5;
            }
        }
        this.field3739 = null;
        return null;
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(III)Z", line = 66)
    public static final boolean method1605(int arg0, int arg1, int arg2) {
        field3746++;
        if (!class229.field3278) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class676.field9545[var3] == null || class676.field9545[var3][var4] == null) {
            return false;
        }
        int var5 = -104 % ((arg0 + 50) / 63);
        class140 var6 = class676.field9545[var3][var4];
        if (arg1 == -1 && var6.field2023 == 0) {
            for (class345 var7 = (class345) class487.field6761.method1270((byte) -25); var7 != null; var7 = (class345) class487.field6761.method1282(0)) {
                if (var7.field4983 == 5 || var7.field4983 == 1012 || var7.field4983 == 23 || var7.field4983 == 60 || var7.field4983 == 50) {
                    for (class140 var8 = class266.method1626(var7.field4987, 108); var8 != null; var8 = class198.method1342(var8, true)) {
                        if (var6.field2100 == var8.field2100) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class345 var9 = (class345) class487.field6761.method1270((byte) -25); var9 != null; var9 = (class345) class487.field6761.method1282(0)) {
                if (var9.field4977 == arg1 && var6.field2100 == var9.field4987 && (var9.field4983 == 5 || var9.field4983 == 1012 || var9.field4983 == 23 || var9.field4983 == 60 || var9.field4983 == 50)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I[[[Lhl;ZIIB)Z", line = 133)
    public static final boolean method1606(int arg0, class486[][][] arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        field3733++;
        byte var6 = arg2 ? 1 : (byte) (class460.field6516 & 0xFF);
        if (class446.field6246[class233.field3305][arg3][arg0] == var6) {
            return false;
        }
        if (arg5 != -115) {
            method1605(29, 112, -68);
        }
        if ((class246.field3501[class233.field3305][arg3][arg0] & 0x4) == 0) {
            return false;
        }
        byte var7 = 0;
        class586.field8179[var7] = arg3;
        int var8 = 0;
        int var35 = var7 + 1;
        class666.field9375[var7] = arg0;
        class446.field6246[class233.field3305][arg3][arg0] = var6;
        while (var35 != var8) {
            int var9 = class586.field8179[var8] & 0xFFFF;
            int var10 = (class586.field8179[var8] & 0xFFCD29) >> 16;
            int var11 = class586.field8179[var8] >> 24 & 0xFF;
            int var12 = class666.field9375[var8] & 0xFFFF;
            int var13 = (class666.field9375[var8] & 0xFF55B2) >> 16;
            var8 = var8 + 1 & 0xFFF;
            boolean var14 = false;
            if ((class246.field3501[class233.field3305][var9][var12] & 0x4) == 0) {
                var14 = true;
            }
            boolean var15 = false;
            label237: for (int var16 = class233.field3305 + 1; var16 <= 3; var16++) {
                if ((class246.field3501[var16][var9][var12] & 0x8) == 0) {
                    if (var14 && arg1[var16][var9][var12] != null) {
                        if (arg1[var16][var9][var12].field6750 != null) {
                            int var20 = class27.method126(true, var10);
                            if (arg1[var16][var9][var12].field6750.field1180 == var20 || arg1[var16][var9][var12].field6741 != null && arg1[var16][var9][var12].field6741.field1180 == var20) {
                                continue;
                            }
                            if (var11 != 0) {
                                int var21 = class27.method126(true, var11);
                                if (arg1[var16][var9][var12].field6750.field1180 == var21 || arg1[var16][var9][var12].field6741 != null && arg1[var16][var9][var12].field6741.field1180 == var21) {
                                    continue;
                                }
                            }
                            if (var13 != 0) {
                                int var22 = class27.method126(true, var13);
                                if (arg1[var16][var9][var12].field6750.field1180 == var22 || arg1[var16][var9][var12].field6741 != null && arg1[var16][var9][var12].field6741.field1180 == var22) {
                                    continue;
                                }
                            }
                        }
                        class486 var23 = arg1[var16][var9][var12];
                        if (var23.field6751 != null) {
                            for (class20 var24 = var23.field6751; var24 != null; var24 = var24.field284) {
                                class39 var25 = var24.field281;
                                if (var25 instanceof class147) {
                                    class147 var26 = (class147) var25;
                                    int var27 = var26.method549(12352);
                                    if (var27 == 21) {
                                        var27 = 19;
                                    }
                                    int var28 = var26.method560(15654);
                                    int var29 = var28 << 6 | var27;
                                    if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                        continue label237;
                                    }
                                }
                            }
                        }
                    }
                    class486 var30 = arg1[var16][var9][var12];
                    if (var30 != null && var30.field6751 != null) {
                        for (class20 var31 = var30.field6751; var31 != null; var31 = var31.field284) {
                            class39 var32 = var31.field281;
                            if (var32.field517 != var32.field516 || var32.field519 != var32.field512) {
                                for (int var33 = var32.field517; var33 <= var32.field516; var33++) {
                                    for (int var34 = var32.field512; var34 <= var32.field519; var34++) {
                                        class446.field6246[var16][var33][var34] = var6;
                                    }
                                }
                            }
                        }
                    }
                    class446.field6246[var16][var9][var12] = var6;
                    var15 = true;
                }
            }
            if (var15) {
                int var17 = class144.field2149[class233.field3305 + 1].method273(var9, var12);
                if (class363.field5181[arg4] < var17) {
                    class363.field5181[arg4] = var17;
                }
                int var18 = var9 << 9;
                if (class551.field7457[arg4] > var18) {
                    class551.field7457[arg4] = var18;
                } else if (class57.field802[arg4] < var18) {
                    class57.field802[arg4] = var18;
                }
                int var19 = var12 << 9;
                if (var19 < class166.field2516[arg4]) {
                    class166.field2516[arg4] = var19;
                } else if (class245.field3496[arg4] < var19) {
                    class245.field3496[arg4] = var19;
                }
            }
            if (!var14) {
                if (var9 >= 1 && class446.field6246[class233.field3305][var9 - 1][var12] != var6) {
                    class586.field8179[var35] = class266.method1624(-754974720, class266.method1624(var9 - 1, 1179648));
                    class666.field9375[var35] = class266.method1624(1245184, var12);
                    class446.field6246[class233.field3305][var9 - 1][var12] = var6;
                    var35 = var35 + 1 & 0xFFF;
                }
                var12++;
                if (var12 < class526.field7212) {
                    if (var9 - 1 >= 0 && class446.field6246[class233.field3305][var9 - 1][var12] != var6 && (class246.field3501[class233.field3305][var9][var12] & 0x4) == 0 && (class246.field3501[class233.field3305][var9 - 1][var12 - 1] & 0x4) == 0) {
                        class586.field8179[var35] = class266.method1624(class266.method1624(var9 - 1, 1179648), 1375731712);
                        class666.field9375[var35] = class266.method1624(var12, 1245184);
                        class446.field6246[class233.field3305][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    if (class446.field6246[class233.field3305][var9][var12] != var6) {
                        class586.field8179[var35] = class266.method1624(318767104, class266.method1624(5373952, var9));
                        class666.field9375[var35] = class266.method1624(5439488, var12);
                        class446.field6246[class233.field3305][var9][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    if (var9 + 1 < class86.field1185 && class446.field6246[class233.field3305][var9 + 1][var12] != var6 && (class246.field3501[class233.field3305][var9][var12] & 0x4) == 0 && (class246.field3501[class233.field3305][var9 + 1][var12 - 1] & 0x4) == 0) {
                        class586.field8179[var35] = class266.method1624(class266.method1624(var9 + 1, 5373952), -1845493760);
                        class666.field9375[var35] = class266.method1624(var12, 5439488);
                        class446.field6246[class233.field3305][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                }
                var12--;
                if ((var9 + 1) < class86.field1185 && class446.field6246[class233.field3305][var9 + 1][var12] != var6) {
                    class586.field8179[var35] = class266.method1624(1392508928, class266.method1624(9568256, var9 + 1));
                    class666.field9375[var35] = class266.method1624(var12, 9633792);
                    var35 = var35 + 1 & 0xFFF;
                    class446.field6246[class233.field3305][var9 + 1][var12] = var6;
                }
                var12--;
                if (var12 >= 0) {
                    if (var9 - 1 >= 0 && class446.field6246[class233.field3305][var9 - 1][var12] != var6 && (class246.field3501[class233.field3305][var9][var12] & 0x4) == 0 && (class246.field3501[class233.field3305][var9 - 1][var12 + 1] & 0x4) == 0) {
                        class586.field8179[var35] = class266.method1624(class266.method1624(var9 - 1, 13762560), 301989888);
                        class666.field9375[var35] = class266.method1624(13828096, var12);
                        class446.field6246[class233.field3305][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    if (class446.field6246[class233.field3305][var9][var12] != var6) {
                        class586.field8179[var35] = class266.method1624(class266.method1624(13762560, var9), -1828716544);
                        class666.field9375[var35] = class266.method1624(13828096, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class446.field6246[class233.field3305][var9][var12] = var6;
                    }
                    if ((var9 + 1) < class86.field1185 && class446.field6246[class233.field3305][var9 + 1][var12] != var6 && (class246.field3501[class233.field3305][var9][var12] & 0x4) == 0 && (class246.field3501[class233.field3305][var9 + 1][var12 + 1] & 0x4) == 0) {
                        class586.field8179[var35] = class266.method1624(-771751936, class266.method1624(var9 + 1, 9568256));
                        class666.field9375[var35] = class266.method1624(var12, 9633792);
                        var35 = var35 + 1 & 0xFFF;
                        class446.field6246[class233.field3305][var9 + 1][var12] = var6;
                    }
                }
            }
        }
        if (class363.field5181[arg4] != -1000000) {
            class363.field5181[arg4] += 10;
            class551.field7457[arg4] -= 50;
            class57.field802[arg4] += 50;
            class245.field3496[arg4] += 50;
            class166.field2516[arg4] -= 50;
        }
        return true;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)Lpea;", line = 456)
    public final class665 method1607(byte arg0) {
        field3743++;
        int var2 = 67 / ((-arg0 - 17) / 58);
        if (this.field3739 == null) {
            return null;
        }
        class665 var3 = this.field3742[(int) (this.field3744 & (long) (this.field3736 - 1))];
        while (this.field3739 != var3) {
            if (this.field3739.field9371 == this.field3744) {
                class665 var4 = this.field3739;
                this.field3739 = this.field3739.field9368;
                return var4;
            }
            this.field3739 = this.field3739.field9368;
        }
        this.field3739 = null;
        return null;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lpea;ZJ)V", line = 490)
    public final void method1608(class665 arg0, boolean arg1, long arg2) {
        field3745++;
        if (arg0.field9370 != null) {
            arg0.method3691((byte) -119);
        }
        class665 var5 = this.field3742[(int) (arg2 & (long) (this.field3736 - 1))];
        arg0.field9370 = var5.field9370;
        arg0.field9368 = var5;
        arg0.field9370.field9368 = arg0;
        if (!arg1) {
            arg0.field9371 = arg2;
            arg0.field9368.field9370 = arg0;
        }
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)V", line = 516)
    public static final void method1609(int arg0) {
        if (class161.field2465 == 1 || class161.field2465 == 3 || class590.field8219 != class161.field2465 && (class161.field2465 == 0 || class590.field8219 == 0)) {
            class679.field9578 = 0;
            class602.field8365 = 0;
            class323.field4762.method2060(0);
        }
        field3740++;
        if (arg0 != -23221) {
            field3738 = null;
        }
        class590.field8219 = class161.field2465;
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(I)V", line = 550)
    public class264(int arg0) {
        this.field3736 = arg0;
        this.field3742 = new class665[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class665 var3 = this.field3742[var2] = new class665();
            var3.field9370 = var3;
            var3.field9368 = var3;
        }
    }
}
