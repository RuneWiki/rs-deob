import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class198 {

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "Lfs;")
    public class329 field3189 = new class329();

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "Z")
    public boolean field3197 = false;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field3190 = 0;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "Z")
    public static boolean field3192 = false;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public static int field3193 = 0;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field3188 = 0;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field3191 = -1;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "[I")
    public static int[] field3200 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
    public int field3198;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    public int field3199;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "J")
    public static long field3196;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IBI)V", line = 3)
    public static final void method1383(int arg0, byte arg1, int arg2) {
        field3194++;
        if (!class449.field6546) {
            return;
        }
        class11.field139.method2224(137, (byte) 0);
        class56.field688++;
        class11.field139.method1315(arg0, (byte) 69);
        if (arg1 >= 94) {
            class11.field139.method1286((byte) 124, class436.field6419);
            class11.field139.method1309(arg2, 115);
            class11.field139.method1309(class73.field925, 118);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V", line = 23)
    public static void method1384(byte arg0) {
        field3200 = null;
        if (arg0 > -101) {
            field3191 = 2;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZZ[[[Lwe;III)Z", line = 33)
    public static final boolean method1385(boolean arg0, boolean arg1, class232[][][] arg2, int arg3, int arg4, int arg5) {
        field3195++;
        if (arg0) {
            method1385(true, false, (class232[][][]) null, -108, -101, -114);
        }
        byte var6 = arg1 ? 1 : (byte) (class264.field4260 & 0xFF);
        if (class427.field6304[class266.field4286][arg3][arg4] == var6) {
            return false;
        } else if ((class31.field382[class266.field4286][arg3][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class315.field4954[var7] = arg3;
            int var35 = var7 + 1;
            class328.field5140[var7] = arg4;
            class427.field6304[class266.field4286][arg3][arg4] = var6;
            while (var35 != var8) {
                int var9 = class315.field4954[var8] & 0xFFFF;
                int var10 = class315.field4954[var8] >> 16 & 0xFF;
                int var11 = class315.field4954[var8] >> 24 & 0xFF;
                int var12 = class328.field5140[var8] & 0xFFFF;
                int var13 = (class328.field5140[var8] & 0xFF6D67) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class31.field382[class266.field4286][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class266.field4286 + 1; var16 <= 3; var16++) {
                    if ((class31.field382[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg2[var16][var9][var12] != null) {
                            if (arg2[var16][var9][var12].field3873 != null) {
                                int var20 = class171.method1183(var10, -126);
                                if (arg2[var16][var9][var12].field3873.field1121 == var20 || arg2[var16][var9][var12].field3872 != null && arg2[var16][var9][var12].field3872.field1121 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class171.method1183(var11, -126);
                                    if (arg2[var16][var9][var12].field3873.field1121 == var21 || arg2[var16][var9][var12].field3872 != null && arg2[var16][var9][var12].field3872.field1121 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class171.method1183(var13, -118);
                                    if (arg2[var16][var9][var12].field3873.field1121 == var22 || arg2[var16][var9][var12].field3872 != null && arg2[var16][var9][var12].field3872.field1121 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class232 var23 = arg2[var16][var9][var12];
                            if (var23.field3866 != null) {
                                for (class247 var24 = var23.field3866; var24 != null; var24 = var24.field4054) {
                                    class57 var25 = var24.field4052;
                                    if (var25 instanceof class149) {
                                        class149 var26 = (class149) var25;
                                        int var27 = var26.method195(3076);
                                        int var28 = var26.method183((byte) 122);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class232 var30 = arg2[var16][var9][var12];
                        if (var30 != null && var30.field3866 != null) {
                            for (class247 var31 = var30.field3866; var31 != null; var31 = var31.field4054) {
                                class57 var32 = var31.field4052;
                                if (var32.field726 != var32.field710 || var32.field720 != var32.field711) {
                                    for (int var33 = var32.field726; var33 <= var32.field710; var33++) {
                                        for (int var34 = var32.field720; var34 <= var32.field711; var34++) {
                                            class427.field6304[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class427.field6304[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class275.field4396[class266.field4286 + 1].method779(var9, var12);
                    if (var17 > class411.field6091[arg5]) {
                        class411.field6091[arg5] = var17;
                    }
                    int var18 = var9 << 7;
                    int var19 = var12 << 7;
                    if (class414.field6126[arg5] > var18) {
                        class414.field6126[arg5] = var18;
                    } else if (var18 > class102.field1428[arg5]) {
                        class102.field1428[arg5] = var18;
                    }
                    if (class377.field5699[arg5] > var19) {
                        class377.field5699[arg5] = var19;
                    } else if (var19 > class97.field1305[arg5]) {
                        class97.field1305[arg5] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class427.field6304[class266.field4286][var9 - 1][var12] != var6) {
                        class315.field4954[var35] = class35.method227(-754974720, class35.method227(1179648, var9 - 1));
                        class328.field5140[var35] = class35.method227(1245184, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class427.field6304[class266.field4286][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < class380.field5751) {
                        if (var9 - 1 >= 0 && class427.field6304[class266.field4286][var9 - 1][var12] != var6 && (class31.field382[class266.field4286][var9][var12] & 0x4) == 0 && (class31.field382[class266.field4286][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class315.field4954[var35] = class35.method227(class35.method227(var9 - 1, 1179648), 1375731712);
                            class328.field5140[var35] = class35.method227(var12, 1245184);
                            class427.field6304[class266.field4286][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class427.field6304[class266.field4286][var9][var12] != var6) {
                            class315.field4954[var35] = class35.method227(318767104, class35.method227(5373952, var9));
                            class328.field5140[var35] = class35.method227(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class427.field6304[class266.field4286][var9][var12] = var6;
                        }
                        if (var9 + 1 < class80.field1003 && class427.field6304[class266.field4286][var9 + 1][var12] != var6 && (class31.field382[class266.field4286][var9][var12] & 0x4) == 0 && (class31.field382[class266.field4286][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class315.field4954[var35] = class35.method227(-1845493760, class35.method227(5373952, var9 + 1));
                            class328.field5140[var35] = class35.method227(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class427.field6304[class266.field4286][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (class80.field1003 > (var9 + 1) && class427.field6304[class266.field4286][var9 + 1][var12] != var6) {
                        class315.field4954[var35] = class35.method227(1392508928, class35.method227(var9 + 1, 9568256));
                        class328.field5140[var35] = class35.method227(9633792, var12);
                        class427.field6304[class266.field4286][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class427.field6304[class266.field4286][var9 - 1][var12] != var6 && (class31.field382[class266.field4286][var9][var12] & 0x4) == 0 && (class31.field382[class266.field4286][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class315.field4954[var35] = class35.method227(301989888, class35.method227(13762560, var9 - 1));
                            class328.field5140[var35] = class35.method227(var12, 13828096);
                            class427.field6304[class266.field4286][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class427.field6304[class266.field4286][var9][var12] != var6) {
                            class315.field4954[var35] = class35.method227(class35.method227(var9, 13762560), -1828716544);
                            class328.field5140[var35] = class35.method227(var12, 13828096);
                            class427.field6304[class266.field4286][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class80.field1003 > (var9 + 1) && class427.field6304[class266.field4286][var9 + 1][var12] != var6 && (class31.field382[class266.field4286][var9][var12] & 0x4) == 0 && (class31.field382[class266.field4286][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class315.field4954[var35] = class35.method227(-771751936, class35.method227(9568256, var9 + 1));
                            class328.field5140[var35] = class35.method227(var12, 9633792);
                            var35 = var35 + 1 & 0xFFF;
                            class427.field6304[class266.field4286][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class411.field6091[arg5] != -1000000) {
                class411.field6091[arg5] += 10;
                class414.field6126[arg5] -= 50;
                class102.field1428[arg5] += 50;
                class97.field1305[arg5] += 50;
                class377.field5699[arg5] -= 50;
            }
            return true;
        }
    }
}
