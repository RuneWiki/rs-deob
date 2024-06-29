import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class102 {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Z")
    public static boolean field1721 = false;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1724 = " is already on your ignore list.";

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1726 = " more options";

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "[S")
    public static short[] field1725 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field1727 = 0;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Lpm;")
    public static class103 field1723;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "[I")
    public static int[] field1728;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "[[I")
    public static int[][] field1729;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 5)
    public static void method787(byte arg0) {
        field1724 = null;
        field1725 = null;
        if (arg0 > -76) {
            field1725 = (short[]) null;
        }
        field1726 = null;
        field1728 = null;
        field1723 = null;
        field1729 = (int[][]) null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI[[[Lw;IIZ)Z", line = 40)
    public static final boolean method788(boolean arg0, int arg1, class272[][][] arg2, int arg3, int arg4, boolean arg5) {
        byte var6 = arg0 ? 1 : (byte) (class160.field2521 & 0xFF);
        field1722++;
        if (class212.field3381[class41.field734][arg1][arg3] == var6) {
            return false;
        } else if ((class250.field3857[class41.field734][arg1][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            if (arg5) {
                method787((byte) -73);
            }
            class217.field3470[var7] = arg1;
            int var31 = var7 + 1;
            class297.field4688[var7] = arg3;
            class212.field3381[class41.field734][arg1][arg3] = var6;
            while (var31 != var8) {
                int var9 = (class217.field3470[var8] & 0xFF1160) >> 16;
                int var10 = class217.field3470[var8] & 0xFFFF;
                int var11 = class217.field3470[var8] >> 24 & 0xFF;
                int var12 = class297.field4688[var8] & 0xFFFF;
                int var13 = (class297.field4688[var8] & 0xFFBBAD) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class250.field3857[class41.field734][var10][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label240: for (int var16 = class41.field734 + 1; var16 <= 3; var16++) {
                    if ((class250.field3857[var16][var10][var12] & 0x8) == 0) {
                        if (var14 && arg2[var16][var10][var12] != null) {
                            if (arg2[var16][var10][var12].field4236 != null) {
                                int var17 = class19.method153(var9, (byte) 54);
                                if (arg2[var16][var10][var12].field4236.field2999 == var17 || arg2[var16][var10][var12].field4236.field3009 == var17) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var18 = class19.method153(var11, (byte) 94);
                                    if (arg2[var16][var10][var12].field4236.field2999 == var18 || arg2[var16][var10][var12].field4236.field3009 == var18) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var19 = class19.method153(var13, (byte) 81);
                                    if (arg2[var16][var10][var12].field4236.field2999 == var19 || arg2[var16][var10][var12].field4236.field3009 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg2[var16][var10][var12].field4217 != null) {
                                for (int var20 = 0; var20 < arg2[var16][var10][var12].field4220; var20++) {
                                    int var21 = (int) (arg2[var16][var10][var12].field4217[var20].field776 >> 14 & 0x3FL);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var22 = (int) (arg2[var16][var10][var12].field4217[var20].field776 >> 20 & 0x3L);
                                    int var23 = var21 | var22 << 6;
                                    if (var9 == var23 || var11 != 0 && var11 == var23 || var13 != 0 && var13 == var23) {
                                        continue label240;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class272 var24 = arg2[var16][var10][var12];
                        if (var24 != null && var24.field4220 > 0) {
                            for (int var25 = 0; var25 < var24.field4220; var25++) {
                                class45 var26 = var24.field4217[var25];
                                if (var26.field785 != var26.field770 || var26.field784 != var26.field772) {
                                    for (int var27 = var26.field770; var27 <= var26.field785; var27++) {
                                        for (int var28 = var26.field772; var28 <= var26.field784; var28++) {
                                            class212.field3381[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class212.field3381[var16][var10][var12] = var6;
                    }
                }
                if (var15) {
                    if (class29.field475[class41.field734 + 1][var10][var12] > class185.field2939[arg4]) {
                        class185.field2939[arg4] = class29.field475[class41.field734 + 1][var10][var12];
                    }
                    int var29 = var10 << 7;
                    if (var29 < class259.field4019[arg4]) {
                        class259.field4019[arg4] = var29;
                    } else if (class10.field169[arg4] < var29) {
                        class10.field169[arg4] = var29;
                    }
                    int var30 = var12 << 7;
                    if (class74.field1140[arg4] > var30) {
                        class74.field1140[arg4] = var30;
                    } else if (class151.field2430[arg4] < var30) {
                        class151.field2430[arg4] = var30;
                    }
                }
                if (!var14) {
                    if (var10 >= 1 && class212.field3381[class41.field734][var10 - 1][var12] != var6) {
                        class217.field3470[var31] = class94.method673(class94.method673(var10 - 1, 1179648), -754974720);
                        class297.field4688[var31] = class94.method673(1245184, var12);
                        class212.field3381[class41.field734][var10 - 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < 104) {
                        if (var10 - 1 >= 0 && class212.field3381[class41.field734][var10 - 1][var12] != var6 && (class250.field3857[class41.field734][var10][var12] & 0x4) == 0 && (class250.field3857[class41.field734][var10 - 1][var12 - 1] & 0x4) == 0) {
                            class217.field3470[var31] = class94.method673(1375731712, class94.method673(1179648, var10 - 1));
                            class297.field4688[var31] = class94.method673(var12, 1245184);
                            class212.field3381[class41.field734][var10 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class212.field3381[class41.field734][var10][var12] != var6) {
                            class217.field3470[var31] = class94.method673(318767104, class94.method673(var10, 5373952));
                            class297.field4688[var31] = class94.method673(var12, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class212.field3381[class41.field734][var10][var12] = var6;
                        }
                        if (var10 + 1 < 104 && class212.field3381[class41.field734][var10 + 1][var12] != var6 && (class250.field3857[class41.field734][var10][var12] & 0x4) == 0 && (class250.field3857[class41.field734][var10 + 1][var12 - 1] & 0x4) == 0) {
                            class217.field3470[var31] = class94.method673(class94.method673(var10 + 1, 5373952), -1845493760);
                            class297.field4688[var31] = class94.method673(var12, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class212.field3381[class41.field734][var10 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if ((var10 + 1) < 104 && class212.field3381[class41.field734][var10 + 1][var12] != var6) {
                        class217.field3470[var31] = class94.method673(class94.method673(var10 + 1, 9568256), 1392508928);
                        class297.field4688[var31] = class94.method673(var12, 9633792);
                        var31 = var31 + 1 & 0xFFF;
                        class212.field3381[class41.field734][var10 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var10 - 1 >= 0 && class212.field3381[class41.field734][var10 - 1][var12] != var6 && (class250.field3857[class41.field734][var10][var12] & 0x4) == 0 && (class250.field3857[class41.field734][var10 - 1][var12 + 1] & 0x4) == 0) {
                            class217.field3470[var31] = class94.method673(class94.method673(13762560, var10 - 1), 301989888);
                            class297.field4688[var31] = class94.method673(13828096, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class212.field3381[class41.field734][var10 - 1][var12] = var6;
                        }
                        if (class212.field3381[class41.field734][var10][var12] != var6) {
                            class217.field3470[var31] = class94.method673(class94.method673(var10, 13762560), -1828716544);
                            class297.field4688[var31] = class94.method673(13828096, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class212.field3381[class41.field734][var10][var12] = var6;
                        }
                        if ((var10 + 1) < 104 && class212.field3381[class41.field734][var10 + 1][var12] != var6 && (class250.field3857[class41.field734][var10][var12] & 0x4) == 0 && (class250.field3857[class41.field734][var10 + 1][var12 + 1] & 0x4) == 0) {
                            class217.field3470[var31] = class94.method673(class94.method673(var10 + 1, 9568256), -771751936);
                            class297.field4688[var31] = class94.method673(var12, 9633792);
                            class212.field3381[class41.field734][var10 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class185.field2939[arg4] != -1000000) {
                class185.field2939[arg4] += 10;
                class259.field4019[arg4] -= 50;
                class10.field169[arg4] += 50;
                class151.field2430[arg4] += 50;
                class74.field1140[arg4] -= 50;
            }
            return true;
        }
    }
}
