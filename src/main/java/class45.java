import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class45 extends class328 {

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "Ljava/lang/String;")
    public static String field716 = "Connecting to update server";

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "Ljava/lang/String;")
    public static String field721 = null;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)I", line = 4)
    public static final int method452(int arg0) {
        if (arg0 != -1) {
            field716 = (String) null;
        }
        field720++;
        return class214.field3346;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZII[[[Lqo;II)Z", line = 19)
    public static final boolean method453(boolean arg0, int arg1, int arg2, class329[][][] arg3, int arg4, int arg5) {
        field717++;
        byte var6 = arg0 ? 1 : (byte) (class192.field3027 & 0xFF);
        if (arg5 != 1179648) {
            field721 = (String) null;
        }
        if (class157.field2521[class119.field1826][arg2][arg4] == var6) {
            return false;
        } else if ((class146.field2386[class119.field1826][arg2][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class274.field4253[var7] = arg2;
            int var31 = var7 + 1;
            class89.field1270[var7] = arg4;
            int var8 = 0;
            class157.field2521[class119.field1826][arg2][arg4] = var6;
            while (var31 != var8) {
                int var9 = class274.field4253[var8] & 0xFFFF;
                int var10 = class274.field4253[var8] >> 24 & 0xFF;
                int var11 = (class274.field4253[var8] & 0xFF49FA) >> 16;
                int var12 = class89.field1270[var8] & 0xFFFF;
                boolean var13 = false;
                int var14 = (class89.field1270[var8] & 0xFFFC47) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var15 = false;
                if ((class146.field2386[class119.field1826][var9][var12] & 0x4) == 0) {
                    var15 = true;
                }
                label239: for (int var16 = class119.field1826 + 1; var16 <= 3; var16++) {
                    if ((class146.field2386[var16][var9][var12] & 0x8) == 0) {
                        if (var15 && arg3[var16][var9][var12] != null) {
                            if (arg3[var16][var9][var12].field5064 != null) {
                                int var17 = class326.method2301((byte) -117, var11);
                                if (arg3[var16][var9][var12].field5064.field3110 == var17 || arg3[var16][var9][var12].field5064.field3124 == var17) {
                                    continue;
                                }
                                if (var10 != 0) {
                                    int var18 = class326.method2301((byte) 111, var10);
                                    if (arg3[var16][var9][var12].field5064.field3110 == var18 || arg3[var16][var9][var12].field5064.field3124 == var18) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var19 = class326.method2301((byte) -121, var14);
                                    if (arg3[var16][var9][var12].field5064.field3110 == var19 || arg3[var16][var9][var12].field5064.field3124 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg3[var16][var9][var12].field5070 != null) {
                                for (int var20 = 0; var20 < arg3[var16][var9][var12].field5063; var20++) {
                                    int var21 = (int) (arg3[var16][var9][var12].field5070[var20].field4611 >> 14 & 0x3FL);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var22 = (int) (arg3[var16][var9][var12].field5070[var20].field4611 >> 20 & 0x3L);
                                    int var23 = var21 | var22 << 6;
                                    if (var11 == var23 || var10 != 0 && var10 == var23 || var14 != 0 && var14 == var23) {
                                        continue label239;
                                    }
                                }
                            }
                        }
                        var13 = true;
                        class329 var24 = arg3[var16][var9][var12];
                        if (var24 != null && var24.field5063 > 0) {
                            for (int var25 = 0; var25 < var24.field5063; var25++) {
                                class297 var26 = var24.field5070[var25];
                                if (var26.field4616 != var26.field4606 || var26.field4614 != var26.field4612) {
                                    for (int var27 = var26.field4616; var27 <= var26.field4606; var27++) {
                                        for (int var28 = var26.field4614; var28 <= var26.field4612; var28++) {
                                            class157.field2521[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class157.field2521[var16][var9][var12] = var6;
                    }
                }
                if (var13) {
                    if (class277.field4290[class119.field1826 + 1][var9][var12] > class102.field1533[arg1]) {
                        class102.field1533[arg1] = class277.field4290[class119.field1826 + 1][var9][var12];
                    }
                    int var29 = var9 << 7;
                    int var30 = var12 << 7;
                    if (var29 < class31.field479[arg1]) {
                        class31.field479[arg1] = var29;
                    } else if (class83.field1199[arg1] < var29) {
                        class83.field1199[arg1] = var29;
                    }
                    if (class120.field1870[arg1] > var30) {
                        class120.field1870[arg1] = var30;
                    } else if (class223.field3467[arg1] < var30) {
                        class223.field3467[arg1] = var30;
                    }
                }
                if (!var15) {
                    if (var9 >= 1 && class157.field2521[class119.field1826][var9 - 1][var12] != var6) {
                        class274.field4253[var31] = class41.method426(-754974720, class41.method426(var9 - 1, 1179648));
                        class89.field1270[var31] = class41.method426(var12, 1245184);
                        class157.field2521[class119.field1826][var9 - 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < 104) {
                        if ((var9 - 1) >= 0 && class157.field2521[class119.field1826][var9 - 1][var12] != var6 && (class146.field2386[class119.field1826][var9][var12] & 0x4) == 0 && (class146.field2386[class119.field1826][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class274.field4253[var31] = class41.method426(1375731712, class41.method426(var9 - 1, 1179648));
                            class89.field1270[var31] = class41.method426(1245184, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class157.field2521[class119.field1826][var9 - 1][var12] = var6;
                        }
                        if (class157.field2521[class119.field1826][var9][var12] != var6) {
                            class274.field4253[var31] = class41.method426(class41.method426(var9, 5373952), 318767104);
                            class89.field1270[var31] = class41.method426(5439488, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class157.field2521[class119.field1826][var9][var12] = var6;
                        }
                        if ((var9 + 1) < 104 && class157.field2521[class119.field1826][var9 + 1][var12] != var6 && (class146.field2386[class119.field1826][var9][var12] & 0x4) == 0 && (class146.field2386[class119.field1826][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class274.field4253[var31] = class41.method426(class41.method426(5373952, var9 + 1), -1845493760);
                            class89.field1270[var31] = class41.method426(5439488, var12);
                            class157.field2521[class119.field1826][var9 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if ((var9 + 1) < 104 && class157.field2521[class119.field1826][var9 + 1][var12] != var6) {
                        class274.field4253[var31] = class41.method426(class41.method426(var9 + 1, 9568256), 1392508928);
                        class89.field1270[var31] = class41.method426(var12, 9633792);
                        class157.field2521[class119.field1826][var9 + 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class157.field2521[class119.field1826][var9 - 1][var12] != var6 && (class146.field2386[class119.field1826][var9][var12] & 0x4) == 0 && (class146.field2386[class119.field1826][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class274.field4253[var31] = class41.method426(class41.method426(var9 - 1, 13762560), 301989888);
                            class89.field1270[var31] = class41.method426(13828096, var12);
                            class157.field2521[class119.field1826][var9 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class157.field2521[class119.field1826][var9][var12] != var6) {
                            class274.field4253[var31] = class41.method426(class41.method426(var9, 13762560), -1828716544);
                            class89.field1270[var31] = class41.method426(13828096, var12);
                            class157.field2521[class119.field1826][var9][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < 104 && class157.field2521[class119.field1826][var9 + 1][var12] != var6 && (class146.field2386[class119.field1826][var9][var12] & 0x4) == 0 && (class146.field2386[class119.field1826][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class274.field4253[var31] = class41.method426(class41.method426(9568256, var9 + 1), -771751936);
                            class89.field1270[var31] = class41.method426(var12, 9633792);
                            class157.field2521[class119.field1826][var9 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class102.field1533[arg1] != -1000000) {
                class102.field1533[arg1] += 10;
                class31.field479[arg1] -= 50;
                class83.field1199[arg1] += 50;
                class223.field3467[arg1] += 50;
                class120.field1870[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)V", line = 327)
    public static void method454(byte arg0) {
        field716 = null;
        field721 = null;
        if (arg0 <= 74) {
            method456(-113, (class18) null);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIBI)V", line = 338)
    public static final void method455(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field715++;
        class342 var7 = class320.method2259(arg0, arg3, 0);
        if (var7 != null && var7.field5324 != null) {
            class112 var8 = new class112();
            var8.field1706 = var7;
            var8.field1711 = var7.field5324;
            class160.method1288((byte) -45, var8);
        }
        if (arg5 >= -102) {
            method453(true, -20, -110, (class329[][][]) ((class329[][][]) null), 56, 89);
        }
        class210.field3237 = true;
        class270.field4155 = arg0;
        class174.field2761 = arg4;
        class281.field4355 = arg1;
        class259.field3969 = arg3;
        class285.field4432 = arg6;
        class209.field3214 = arg2;
        class339.method2380(var7, 112);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILrn;)V", line = 378)
    public static final void method456(int arg0, class18 arg1) {
        if (arg0 != 1) {
            method454((byte) -97);
        }
        field718++;
        class228.field3563 = arg1;
    }
}
