import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class9 extends class163 {

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Lwa;")
    public static class75 field115 = class66.method560("loc", false);

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field118 = -1;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field119 = 0;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "Lwa;")
    public static class75 field117 = class66.method560("::errortest", false);

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "Lwa;")
    public static class75 field114;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V", line = 26)
    public static void method45(boolean arg0) {
        field114 = null;
        field117 = null;
        if (arg0) {
            method45(true);
        }
        field115 = null;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V", line = 38)
    public static final void method46(int arg0) {
        class212.field3613.method358((byte) -73);
        field120++;
        if (arg0 != -1) {
            field115 = (class75) null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III[[[Ltf;ZI)Z", line = 62)
    public static final boolean method47(int arg0, int arg1, int arg2, class242[][][] arg3, boolean arg4, int arg5) {
        byte var6 = arg4 ? 1 : (byte) (class190.field3167 & 0xFF);
        field116++;
        if (class198.field3324[class67.field1174][arg2][arg0] == var6) {
            return false;
        } else if ((class204.field3459[class67.field1174][arg2][arg0] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class263.field4567[var7] = arg2;
            int var32 = var7 + 1;
            class2.field10[var7] = arg0;
            class198.field3324[class67.field1174][arg2][arg0] = var6;
            int var8 = 0;
            while (var32 != var8) {
                int var9 = class263.field4567[var8] >> 24 & 0xFF;
                int var10 = class2.field10[var8] & 0xFFFF;
                int var11 = class263.field4567[var8] & 0xFFFF;
                int var12 = class2.field10[var8] >> 16 & 0xFF;
                int var13 = (class263.field4567[var8] & 0xFFADD5) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class204.field3459[class67.field1174][var11][var10] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class67.field1174 + 1; var16 <= 3; var16++) {
                    if ((class204.field3459[var16][var11][var10] & 0x8) == 0) {
                        if (var14 && arg3[var16][var11][var10] != null) {
                            if (arg3[var16][var11][var10].field4098 != null) {
                                int var17 = class258.method1837(var13, -2);
                                if (arg3[var16][var11][var10].field4098.field2818 == var17 || arg3[var16][var11][var10].field4098.field2821 == var17) {
                                    continue;
                                }
                                if (var9 != 0) {
                                    int var18 = class258.method1837(var9, -2);
                                    if (arg3[var16][var11][var10].field4098.field2818 == var18 || arg3[var16][var11][var10].field4098.field2821 == var18) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var19 = class258.method1837(var12, -2);
                                    if (arg3[var16][var11][var10].field4098.field2818 == var19 || arg3[var16][var11][var10].field4098.field2821 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg3[var16][var11][var10].field4083 != null) {
                                for (int var20 = 0; var20 < arg3[var16][var11][var10].field4086; var20++) {
                                    int var21 = (int) (arg3[var16][var11][var10].field4083[var20].field4914 >> 14 & 0x3FL);
                                    int var22 = (int) (arg3[var16][var11][var10].field4083[var20].field4914 >> 20 & 0x3L);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var23 = var22 << 6 | var21;
                                    if (var13 == var23 || var9 != 0 && var9 == var23 || var12 != 0 && var12 == var23) {
                                        continue label237;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class242 var24 = arg3[var16][var11][var10];
                        if (var24 != null && var24.field4086 > 0) {
                            for (int var25 = 0; var25 < var24.field4086; var25++) {
                                class285 var26 = var24.field4083[var25];
                                if (var26.field4911 != var26.field4907 || var26.field4896 != var26.field4895) {
                                    for (int var27 = var26.field4907; var27 <= var26.field4911; var27++) {
                                        for (int var28 = var26.field4895; var28 <= var26.field4896; var28++) {
                                            class198.field3324[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class198.field3324[var16][var11][var10] = var6;
                    }
                }
                if (var15) {
                    if (class198.field3316[arg1] < class53.field879[class67.field1174 + 1][var11][var10]) {
                        class198.field3316[arg1] = class53.field879[class67.field1174 + 1][var11][var10];
                    }
                    int var29 = var10 << 7;
                    int var30 = var11 << 7;
                    if (class176.field2957[arg1] > var30) {
                        class176.field2957[arg1] = var30;
                    } else if (var30 > class145.field2500[arg1]) {
                        class145.field2500[arg1] = var30;
                    }
                    if (var29 < class5.field59[arg1]) {
                        class5.field59[arg1] = var29;
                    } else if (class223.field3783[arg1] < var29) {
                        class223.field3783[arg1] = var29;
                    }
                }
                if (!var14) {
                    if (var11 >= 1 && class198.field3324[class67.field1174][var11 - 1][var10] != var6) {
                        class263.field4567[var32] = class102.method799(class102.method799(var11 - 1, 1179648), -754974720);
                        class2.field10[var32] = class102.method799(1245184, var10);
                        var32 = var32 + 1 & 0xFFF;
                        class198.field3324[class67.field1174][var11 - 1][var10] = var6;
                    }
                    var10++;
                    if (var10 < 104) {
                        if (var11 - 1 >= 0 && class198.field3324[class67.field1174][var11 - 1][var10] != var6 && (class204.field3459[class67.field1174][var11][var10] & 0x4) == 0 && (class204.field3459[class67.field1174][var11 - 1][var10 - 1] & 0x4) == 0) {
                            class263.field4567[var32] = class102.method799(1375731712, class102.method799(var11 - 1, 1179648));
                            class2.field10[var32] = class102.method799(1245184, var10);
                            var32 = var32 + 1 & 0xFFF;
                            class198.field3324[class67.field1174][var11 - 1][var10] = var6;
                        }
                        if (class198.field3324[class67.field1174][var11][var10] != var6) {
                            class263.field4567[var32] = class102.method799(318767104, class102.method799(var11, 5373952));
                            class2.field10[var32] = class102.method799(var10, 5439488);
                            class198.field3324[class67.field1174][var11][var10] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if (var11 + 1 < 104 && class198.field3324[class67.field1174][var11 + 1][var10] != var6 && (class204.field3459[class67.field1174][var11][var10] & 0x4) == 0 && (class204.field3459[class67.field1174][var11 + 1][var10 - 1] & 0x4) == 0) {
                            class263.field4567[var32] = class102.method799(-1845493760, class102.method799(5373952, var11 + 1));
                            class2.field10[var32] = class102.method799(5439488, var10);
                            var32 = var32 + 1 & 0xFFF;
                            class198.field3324[class67.field1174][var11 + 1][var10] = var6;
                        }
                    }
                    var10--;
                    if ((var11 + 1) < 104 && class198.field3324[class67.field1174][var11 + 1][var10] != var6) {
                        class263.field4567[var32] = class102.method799(1392508928, class102.method799(var11 + 1, 9568256));
                        class2.field10[var32] = class102.method799(9633792, var10);
                        class198.field3324[class67.field1174][var11 + 1][var10] = var6;
                        var32 = var32 + 1 & 0xFFF;
                    }
                    var10--;
                    if (var10 >= 0) {
                        if (var11 - 1 >= 0 && class198.field3324[class67.field1174][var11 - 1][var10] != var6 && (class204.field3459[class67.field1174][var11][var10] & 0x4) == 0 && (class204.field3459[class67.field1174][var11 - 1][var10 + 1] & 0x4) == 0) {
                            class263.field4567[var32] = class102.method799(301989888, class102.method799(13762560, var11 - 1));
                            class2.field10[var32] = class102.method799(13828096, var10);
                            class198.field3324[class67.field1174][var11 - 1][var10] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if (class198.field3324[class67.field1174][var11][var10] != var6) {
                            class263.field4567[var32] = class102.method799(-1828716544, class102.method799(13762560, var11));
                            class2.field10[var32] = class102.method799(var10, 13828096);
                            class198.field3324[class67.field1174][var11][var10] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if ((var11 + 1) < 104 && class198.field3324[class67.field1174][var11 + 1][var10] != var6 && (class204.field3459[class67.field1174][var11][var10] & 0x4) == 0 && (class204.field3459[class67.field1174][var11 + 1][var10 + 1] & 0x4) == 0) {
                            class263.field4567[var32] = class102.method799(class102.method799(var11 + 1, 9568256), -771751936);
                            class2.field10[var32] = class102.method799(9633792, var10);
                            class198.field3324[class67.field1174][var11 + 1][var10] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                    }
                }
            }
            int var31 = 99 % ((arg5 - 10) / 54);
            if (class198.field3316[arg1] != -1000000) {
                class198.field3316[arg1] += 10;
                class176.field2957[arg1] -= 50;
                class145.field2500[arg1] += 50;
                class223.field3783[arg1] += 50;
                class5.field59[arg1] -= 50;
            }
            return true;
        }
    }
}
