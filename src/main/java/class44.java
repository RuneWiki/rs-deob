import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class44 {

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "J")
    public long field701 = 0L;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field690 = 99;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Ljava/lang/String;")
    public static String field691 = "Allocating memory";

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field688 = 0;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "Ljava/lang/String;")
    public static String field698 = "Prepared sound engine";

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    public static int field703 = -1;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public static int field707 = 7759444;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public static int field705 = 0;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public int field692;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public int field695;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public int field699;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public int field702;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "Luk;")
    public class104 field694;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "Luk;")
    public class104 field700;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "[Lwb;")
    public static class171[] field696;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "[[I")
    public static int[][] field706;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 7)
    public static final void method393(byte arg0) {
        field708++;
        class287 var1 = (class287) class203.field3460.method2297(14204);
        if (arg0 != -1) {
            return;
        }
        while (var1 != null) {
            if (var1.field4568 > 0) {
                var1.field4568--;
            }
            if (var1.field4568 != 0) {
                if (var1.field4584 > 0) {
                    var1.field4584--;
                }
                if (var1.field4584 == 0 && var1.field4578 >= 1 && var1.field4566 >= 1 && var1.field4578 <= 102 && var1.field4566 <= 102 && (var1.field4579 < 0 || class12.method115(var1.field4579, var1.field4565, arg0 + 9))) {
                    class42.method348(var1.field4578, var1.field4565, var1.field4566, var1.field4577, (byte) -97, var1.field4580, var1.field4579, var1.field4564);
                    var1.field4584 = -1;
                    if (var1.field4579 == var1.field4571 && var1.field4571 == -1) {
                        var1.method2195(arg0 ^ 0x0);
                    } else if (var1.field4579 == var1.field4571 && var1.field4569 == var1.field4564 && var1.field4587 == var1.field4565) {
                        var1.method2195(-1);
                    }
                }
            } else if (var1.field4571 < 0 || class12.method115(var1.field4571, var1.field4587, 8)) {
                class42.method348(var1.field4578, var1.field4587, var1.field4566, var1.field4577, (byte) -126, var1.field4580, var1.field4571, var1.field4569);
                var1.method2195(arg0);
            }
            var1 = (class287) class203.field3460.method2291(96);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II[[[Lk;IIZ)Z", line = 77)
    public static final boolean method394(int arg0, int arg1, class257[][][] arg2, int arg3, int arg4, boolean arg5) {
        field704++;
        byte var6 = arg5 ? 1 : (byte) (class178.field3022 & 0xFF);
        if (class35.field498[class205.field3497][arg4][arg3] == var6) {
            return false;
        } else if ((class152.field2683[class205.field3497][arg4][arg3] & 0x4) == 0) {
            return false;
        } else {
            if (arg1 >= -15) {
                method395((byte) -91);
            }
            byte var7 = 0;
            class258.field4174[var7] = arg4;
            int var31 = var7 + 1;
            class247.field4015[var7] = arg3;
            int var8 = 0;
            class35.field498[class205.field3497][arg4][arg3] = var6;
            while (var31 != var8) {
                int var9 = class258.field4174[var8] >> 16 & 0xFF;
                int var10 = class258.field4174[var8] >> 24 & 0xFF;
                boolean var11 = false;
                int var12 = class247.field4015[var8] & 0xFFFF;
                int var13 = class258.field4174[var8] & 0xFFFF;
                int var14 = (class247.field4015[var8] & 0xFFE808) >> 16;
                if ((class152.field2683[class205.field3497][var13][var12] & 0x4) == 0) {
                    var11 = true;
                }
                boolean var15 = false;
                label243: for (int var16 = class205.field3497 + 1; var16 <= 3; var16++) {
                    if ((class152.field2683[var16][var13][var12] & 0x8) == 0) {
                        if (var11 && arg2[var16][var13][var12] != null) {
                            if (arg2[var16][var13][var12].field4146 != null) {
                                int var17 = class286.method1952(var9, 20624);
                                if (arg2[var16][var13][var12].field4146.field4734 == var17 || arg2[var16][var13][var12].field4146.field4739 == var17) {
                                    continue;
                                }
                                if (var10 != 0) {
                                    int var18 = class286.method1952(var10, 20624);
                                    if (arg2[var16][var13][var12].field4146.field4734 == var18 || arg2[var16][var13][var12].field4146.field4739 == var18) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var19 = class286.method1952(var14, 20624);
                                    if (arg2[var16][var13][var12].field4146.field4734 == var19 || arg2[var16][var13][var12].field4146.field4739 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg2[var16][var13][var12].field4147 != null) {
                                for (int var20 = 0; var20 < arg2[var16][var13][var12].field4150; var20++) {
                                    int var21 = (int) (arg2[var16][var13][var12].field4147[var20].field3936 >> 14 & 0x3FL);
                                    int var22 = (int) (arg2[var16][var13][var12].field4147[var20].field3936 >> 20 & 0x3L);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var23 = var22 << 6 | var21;
                                    if (var9 == var23 || var10 != 0 && var10 == var23 || var14 != 0 && var14 == var23) {
                                        continue label243;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class257 var24 = arg2[var16][var13][var12];
                        if (var24 != null && var24.field4150 > 0) {
                            for (int var25 = 0; var25 < var24.field4150; var25++) {
                                class241 var26 = var24.field4147[var25];
                                if (var26.field3932 != var26.field3930 || var26.field3929 != var26.field3928) {
                                    for (int var27 = var26.field3932; var27 <= var26.field3930; var27++) {
                                        for (int var28 = var26.field3929; var28 <= var26.field3928; var28++) {
                                            class35.field498[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class35.field498[var16][var13][var12] = var6;
                    }
                }
                if (var15) {
                    int var29 = var13 << 7;
                    if (class137.field2487[class205.field3497 + 1][var13][var12] > class193.field3238[arg0]) {
                        class193.field3238[arg0] = class137.field2487[class205.field3497 + 1][var13][var12];
                    }
                    int var30 = var12 << 7;
                    if (class300.field4780[arg0] > var29) {
                        class300.field4780[arg0] = var29;
                    } else if (var29 > class100.field1626[arg0]) {
                        class100.field1626[arg0] = var29;
                    }
                    if (class303.field4793[arg0] > var30) {
                        class303.field4793[arg0] = var30;
                    } else if (class146.field2640[arg0] < var30) {
                        class146.field2640[arg0] = var30;
                    }
                }
                var8 = var8 + 1 & 0xFFF;
                if (!var11) {
                    if (var13 >= 1 && class35.field498[class205.field3497][var13 - 1][var12] != var6) {
                        class258.field4174[var31] = class144.method1159(class144.method1159(1179648, var13 - 1), -754974720);
                        class247.field4015[var31] = class144.method1159(1245184, var12);
                        class35.field498[class205.field3497][var13 - 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < 104) {
                        if (var13 - 1 >= 0 && class35.field498[class205.field3497][var13 - 1][var12] != var6 && (class152.field2683[class205.field3497][var13][var12] & 0x4) == 0 && (class152.field2683[class205.field3497][var13 - 1][var12 - 1] & 0x4) == 0) {
                            class258.field4174[var31] = class144.method1159(class144.method1159(var13 - 1, 1179648), 1375731712);
                            class247.field4015[var31] = class144.method1159(var12, 1245184);
                            class35.field498[class205.field3497][var13 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class35.field498[class205.field3497][var13][var12] != var6) {
                            class258.field4174[var31] = class144.method1159(318767104, class144.method1159(var13, 5373952));
                            class247.field4015[var31] = class144.method1159(5439488, var12);
                            class35.field498[class205.field3497][var13][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var13 + 1 < 104 && class35.field498[class205.field3497][var13 + 1][var12] != var6 && (class152.field2683[class205.field3497][var13][var12] & 0x4) == 0 && (class152.field2683[class205.field3497][var13 + 1][var12 - 1] & 0x4) == 0) {
                            class258.field4174[var31] = class144.method1159(class144.method1159(5373952, var13 + 1), -1845493760);
                            class247.field4015[var31] = class144.method1159(5439488, var12);
                            class35.field498[class205.field3497][var13 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if ((var13 + 1) < 104 && class35.field498[class205.field3497][var13 + 1][var12] != var6) {
                        class258.field4174[var31] = class144.method1159(class144.method1159(var13 + 1, 9568256), 1392508928);
                        class247.field4015[var31] = class144.method1159(var12, 9633792);
                        class35.field498[class205.field3497][var13 + 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var13 - 1 >= 0 && class35.field498[class205.field3497][var13 - 1][var12] != var6 && (class152.field2683[class205.field3497][var13][var12] & 0x4) == 0 && (class152.field2683[class205.field3497][var13 - 1][var12 + 1] & 0x4) == 0) {
                            class258.field4174[var31] = class144.method1159(301989888, class144.method1159(var13 - 1, 13762560));
                            class247.field4015[var31] = class144.method1159(var12, 13828096);
                            class35.field498[class205.field3497][var13 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class35.field498[class205.field3497][var13][var12] != var6) {
                            class258.field4174[var31] = class144.method1159(-1828716544, class144.method1159(13762560, var13));
                            class247.field4015[var31] = class144.method1159(var12, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class35.field498[class205.field3497][var13][var12] = var6;
                        }
                        if (var13 + 1 < 104 && class35.field498[class205.field3497][var13 + 1][var12] != var6 && (class152.field2683[class205.field3497][var13][var12] & 0x4) == 0 && (class152.field2683[class205.field3497][var13 + 1][var12 + 1] & 0x4) == 0) {
                            class258.field4174[var31] = class144.method1159(-771751936, class144.method1159(var13 + 1, 9568256));
                            class247.field4015[var31] = class144.method1159(9633792, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class35.field498[class205.field3497][var13 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class193.field3238[arg0] != -1000000) {
                class193.field3238[arg0] += 10;
                class300.field4780[arg0] -= 50;
                class100.field1626[arg0] += 50;
                class146.field2640[arg0] += 50;
                class303.field4793[arg0] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V", line = 387)
    public static void method395(byte arg0) {
        field691 = null;
        field706 = (int[][]) null;
        field696 = null;
        field698 = null;
        if (arg0 > -126) {
            method393((byte) -34);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lpi;Ljava/lang/String;I)I", line = 409)
    public static final int method396(class336 arg0, String arg1, int arg2) {
        int var3 = arg0.field5353;
        byte[] var4 = class153.method1209(arg1, (byte) -107);
        if (arg2 == 1) {
            field693++;
            arg0.method2346(var4.length, -122);
            arg0.field5353 += class289.field4608.method330(var4, arg0.field5342, 0, arg0.field5353, (byte) -128, var4.length);
            return arg0.field5353 - var3;
        } else {
            return -104;
        }
    }
}
