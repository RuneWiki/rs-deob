import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class314 {

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field5337 = 0;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "Lph;")
    public static class229 field5353 = class266.method1858("underlay", 0);

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "Lph;")
    public static class229 field5340 = class266.method1858("Connect-B au serveur de mise -9 jour", 0);

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "[I")
    private static int[] field5348 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public int field5349;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public int field5354;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lii;")
    public static class247 field5339;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Llh;")
    public static class63 field5343;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "Lsi;")
    public static class66 field5351;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field5341;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "[I")
    public int[] field5344;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "[I")
    public static int[] field5346;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "[I")
    public static int[] field5347;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "[Lka;")
    public static class293[] field5342;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLri;)Z", line = 10)
    public static final boolean method2129(byte arg0, class301 arg1) {
        field5336++;
        if (arg0 != 40) {
            method2130(-118, -39, 64, -76, false);
        }
        if (arg1.field5013 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field5013.length; var2++) {
            int var3 = class69.method539(arg1, var2, arg0 ^ 0xF0D39BB8);
            int var4 = arg1.field5035[var2];
            if (arg1.field5013[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field5013[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field5013[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIZ)V", line = 69)
    public static final void method2130(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var5 = 0;
        int var6 = arg1;
        field5338++;
        int var7 = -arg1;
        int var8 = -1;
        int var9 = class178.method1278(class77.field1289, arg1 + arg2, -18842, class192.field3172);
        int var10 = class178.method1278(class77.field1289, arg2 - arg1, -18842, class192.field3172);
        class193.method1354((byte) -37, var9, var10, arg3, class202.field3337[arg0]);
        if (!arg4) {
            return;
        }
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                int var11 = arg0 - var6;
                int var12 = arg0 + var6;
                var7 -= var6 << 1;
                if (class206.field3398 <= var12 && class214.field3533 >= var11) {
                    int var13 = class178.method1278(class77.field1289, arg2 + var5, -18842, class192.field3172);
                    int var14 = class178.method1278(class77.field1289, arg2 - var5, -18842, class192.field3172);
                    if (class214.field3533 >= var12) {
                        class193.method1354((byte) -37, var13, var14, arg3, class202.field3337[var12]);
                    }
                    if (class206.field3398 <= var11) {
                        class193.method1354((byte) -37, var13, var14, arg3, class202.field3337[var11]);
                    }
                }
            }
            var5++;
            int var15 = arg0 + var5;
            int var16 = arg0 - var5;
            if (var15 >= class206.field3398 && var16 <= class214.field3533) {
                int var17 = class178.method1278(class77.field1289, arg2 + var6, -18842, class192.field3172);
                int var18 = class178.method1278(class77.field1289, arg2 - var6, -18842, class192.field3172);
                if (class214.field3533 >= var15) {
                    class193.method1354((byte) -37, var17, var18, arg3, class202.field3337[var15]);
                }
                if (var16 >= class206.field3398) {
                    class193.method1354((byte) -37, var17, var18, arg3, class202.field3337[var16]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 145)
    public final void method2131(byte arg0) {
        field5352++;
        if (arg0 != 40) {
            this.field5341 = (Image) null;
        }
        class210.method1481(this.field5344, this.field5349, this.field5354);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lkk;Z)V", line = 155)
    public static final void method2132(class72 arg0, boolean arg1) {
        class173.field2828.method1582(arg0, 4);
        while (true) {
            class72 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class72[][] var7;
            class72 var118;
            do {
                class72 var117;
                do {
                    class72 var116;
                    do {
                        class72 var115;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class72) class173.field2828.method1574(-18);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1222);
                                            var3 = var2.field1227;
                                            var4 = var2.field1223;
                                            var5 = var2.field1218;
                                            var6 = var2.field1215;
                                            var7 = class225.field3705[var5];
                                            float var8 = 0.0F;
                                            if (class99.field1675) {
                                                if (class203.field3346 == class192.field3174) {
                                                    int var9 = class39.field622[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class39.field624 != var10) {
                                                        class39.field624 = var10;
                                                        class332.method2270(var10, -127);
                                                        class117.method885(class63.method454(941338512));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class303.field5065 != var11) {
                                                        class303.field5065 = var11;
                                                        class219.method1535(var11, 126);
                                                    }
                                                    int var12 = class103.field1753[0][var3 + 1][var4] + class103.field1753[0][var3][var4] + class103.field1753[0][var3][var4 + 1] + class103.field1753[0][var3 + 1][var4 + 1] >> 2;
                                                    class285.method1964(110, 3, -var12);
                                                    var8 = 201.5F;
                                                    class99.method741(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class99.method741(var8);
                                                }
                                            }
                                            if (!var2.field1217) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class72 var13 = class225.field3705[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field1222) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class254.field4249 && var3 > class70.field1182) {
                                                    class72 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field1222 && (var14.field1217 || (var2.field1226 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class254.field4249 && var3 < class141.field2274 - 1) {
                                                    class72 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field1222 && (var15.field1217 || (var2.field1226 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class102.field1745 && var4 > class328.field5589) {
                                                    class72 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field1222 && (var16.field1217 || (var2.field1226 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class102.field1745 && var4 < class324.field5543 - 1) {
                                                    class72 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field1222 && (var17.field1217 || (var2.field1226 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1217 = false;
                                            if (var2.field1209 != null) {
                                                class72 var18 = var2.field1209;
                                                if (class99.field1675) {
                                                    class99.method741(201.5F - (float) (var18.field1215 + 1) * 50.0F);
                                                }
                                                if (var18.field1212 == null) {
                                                    if (var18.field1229 != null) {
                                                        if (class262.method1824(0, var3, var4)) {
                                                            class293.method1991(var18.field1229, class132.field2148, class53.field750, class93.field1576, class93.field1570, var3, var4, true);
                                                        } else {
                                                            class293.method1991(var18.field1229, class132.field2148, class53.field750, class93.field1576, class93.field1570, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class262.method1824(0, var3, var4)) {
                                                    class59.method400(var18.field1212, 0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var3, var4, true);
                                                } else {
                                                    class59.method400(var18.field1212, 0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var3, var4, false);
                                                }
                                                class207 var19 = var18.field1224;
                                                if (var19 != null) {
                                                    if (class99.field1675) {
                                                        if ((var19.field3417 & var2.field1208) == 0) {
                                                            class62.method431(class244.field4035, class129.field2111, class255.field4266, var5, var3, var4);
                                                        } else {
                                                            class62.method426(var19.field3417, class244.field4035, class129.field2111, class255.field4266, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field3416.method185(0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var19.field3415 - class244.field4035, var19.field3413 - class129.field2111, var19.field3411 - class255.field4266, var19.field3414, var5, (class194) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field1211; var20++) {
                                                    class152 var21 = var18.field1216[var20];
                                                    if (var21 != null) {
                                                        if (class99.field1675) {
                                                            class62.method431(class244.field4035, class129.field2111, class255.field4266, var5, var3, var4);
                                                        }
                                                        var21.field2461.method185(var21.field2470, class132.field2148, class53.field750, class93.field1576, class93.field1570, var21.field2462 - class244.field4035, var21.field2471 - class129.field2111, var21.field2475 - class255.field4266, var21.field2479, var5, (class194) null);
                                                    }
                                                }
                                                if (class99.field1675) {
                                                    class99.method741(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field1212 == null) {
                                                if (var2.field1229 != null) {
                                                    if (class262.method1824(var6, var3, var4)) {
                                                        class293.method1991(var2.field1229, class132.field2148, class53.field750, class93.field1576, class93.field1570, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class293.method1991(var2.field1229, class132.field2148, class53.field750, class93.field1576, class93.field1570, var3, var4, false);
                                                    }
                                                }
                                            } else if (class262.method1824(var6, var3, var4)) {
                                                class59.method400(var2.field1212, var6, class132.field2148, class53.field750, class93.field1576, class93.field1570, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field1212.field1650 != 12345678 || class198.field3304 && var5 <= class298.field4848) {
                                                    class59.method400(var2.field1212, var6, class132.field2148, class53.field750, class93.field1576, class93.field1570, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class162 var23 = var2.field1225;
                                                if (var23 != null && (var23.field2615 & 0x80000000L) != 0L) {
                                                    if (class99.field1675 && var23.field2612) {
                                                        class99.method741(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class99.field1675) {
                                                        class62.method431(class244.field4035, class129.field2111, class255.field4266, var5, var3, var4);
                                                    }
                                                    var23.field2607.method185(0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var23.field2611 - class244.field4035, var23.field2608 - class129.field2111, var23.field2613 - class255.field4266, var23.field2615, var5, (class194) null);
                                                    if (class99.field1675 && var23.field2612) {
                                                        class99.method741(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class207 var26 = var2.field1224;
                                            class88 var27 = var2.field1214;
                                            if (var26 != null || var27 != null) {
                                                if (class254.field4249 == var3) {
                                                    var24++;
                                                } else if (class254.field4249 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class102.field1745 == var4) {
                                                    var24 += 3;
                                                } else if (class102.field1745 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class120.field2008[var24];
                                                var2.field1208 = class59.field836[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field3417 & class141.field2286[var24]) == 0) {
                                                    var2.field1236 = 0;
                                                } else if (var26.field3417 == 16) {
                                                    var2.field1236 = 3;
                                                    var2.field1213 = class302.field5059[var24];
                                                    var2.field1210 = 3 - var2.field1213;
                                                } else if (var26.field3417 == 32) {
                                                    var2.field1236 = 6;
                                                    var2.field1213 = field5348[var24];
                                                    var2.field1210 = 6 - var2.field1213;
                                                } else if (var26.field3417 == 64) {
                                                    var2.field1236 = 12;
                                                    var2.field1213 = class328.field5590[var24];
                                                    var2.field1210 = 12 - var2.field1213;
                                                } else {
                                                    var2.field1236 = 9;
                                                    var2.field1213 = class166.field2709[var24];
                                                    var2.field1210 = 9 - var2.field1213;
                                                }
                                                if ((var26.field3417 & var25) != 0 && !class275.method1904(var6, var3, var4, var26.field3417)) {
                                                    if (class99.field1675) {
                                                        class62.method431(class244.field4035, class129.field2111, class255.field4266, var5, var3, var4);
                                                    }
                                                    var26.field3416.method185(0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var26.field3415 - class244.field4035, var26.field3413 - class129.field2111, var26.field3411 - class255.field4266, var26.field3414, var5, (class194) null);
                                                }
                                                if ((var26.field3410 & var25) != 0 && !class275.method1904(var6, var3, var4, var26.field3410)) {
                                                    if (class99.field1675) {
                                                        class62.method431(class244.field4035, class129.field2111, class255.field4266, var5, var3, var4);
                                                    }
                                                    var26.field3403.method185(0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var26.field3415 - class244.field4035, var26.field3413 - class129.field2111, var26.field3411 - class255.field4266, var26.field3414, var5, (class194) null);
                                                }
                                            }
                                            if (var27 != null && !class181.method1290(var6, var3, var4, var27.field1494.method182())) {
                                                if (class99.field1675) {
                                                    class99.method741(var8 - 0.5F);
                                                }
                                                if ((var27.field1484 & var25) != 0) {
                                                    if (class99.field1675) {
                                                        class62.method431(class244.field4035, class129.field2111, class255.field4266, var5, var3, var4);
                                                    }
                                                    var27.field1494.method185(0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var27.field1501 + var27.field1487 - class244.field4035, var27.field1488 - class129.field2111, var27.field1482 + var27.field1503 - class255.field4266, var27.field1502, var5, (class194) null);
                                                } else if (var27.field1484 == 256) {
                                                    int var28 = var27.field1501 - class244.field4035;
                                                    int var29 = var27.field1488 - class129.field2111;
                                                    int var30 = var27.field1482 - class255.field4266;
                                                    int var31 = var27.field1496;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class99.field1675) {
                                                            class62.method431(class244.field4035, class129.field2111, class255.field4266, var5, var3, var4);
                                                        }
                                                        var27.field1494.method185(0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var27.field1487 + var28, var29, var27.field1503 + var30, var27.field1502, var5, (class194) null);
                                                    } else if (var27.field1489 != null) {
                                                        if (class99.field1675) {
                                                            class62.method431(class244.field4035, class129.field2111, class255.field4266, var5, var3, var4);
                                                        }
                                                        var27.field1489.method185(0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var28, var29, var30, var27.field1502, var5, (class194) null);
                                                    }
                                                }
                                                if (class99.field1675) {
                                                    class99.method741(var8);
                                                }
                                            }
                                            if (var22) {
                                                class162 var34 = var2.field1225;
                                                if (var34 != null && (var34.field2615 & 0x80000000L) == 0L) {
                                                    if (class99.field1675 && var34.field2612) {
                                                        class99.method741(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class99.field1675) {
                                                        class62.method431(class244.field4035, class129.field2111, class255.field4266, var5, var3, var4);
                                                    }
                                                    var34.field2607.method185(0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var34.field2611 - class244.field4035, var34.field2608 - class129.field2111, var34.field2613 - class255.field4266, var34.field2615, var5, (class194) null);
                                                    if (class99.field1675 && var34.field2612) {
                                                        class99.method741(var8);
                                                    }
                                                }
                                                class101 var35 = var2.field1220;
                                                if (var35 != null && var35.field1731 == 0) {
                                                    if (class99.field1675) {
                                                        class62.method431(class244.field4035, class129.field2111, class255.field4266, var5, var3, var4);
                                                    }
                                                    if (var35.field1726 != null) {
                                                        var35.field1726.method185(0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var35.field1725 - class244.field4035, var35.field1724 - class129.field2111, var35.field1728 - class255.field4266, var35.field1730, var5, (class194) null);
                                                    }
                                                    if (var35.field1729 != null) {
                                                        var35.field1729.method185(0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var35.field1725 - class244.field4035, var35.field1724 - class129.field2111, var35.field1728 - class255.field4266, var35.field1730, var5, (class194) null);
                                                    }
                                                    if (var35.field1727 != null) {
                                                        var35.field1727.method185(0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var35.field1725 - class244.field4035, var35.field1724 - class129.field2111, var35.field1728 - class255.field4266, var35.field1730, var5, (class194) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field1226;
                                            if (var36 != 0) {
                                                if (var3 < class254.field4249 && (var36 & 0x4) != 0) {
                                                    class72 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field1222) {
                                                        class173.field2828.method1582(var37, 4);
                                                    }
                                                }
                                                if (var4 < class102.field1745 && (var36 & 0x2) != 0) {
                                                    class72 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field1222) {
                                                        class173.field2828.method1582(var38, 4);
                                                    }
                                                }
                                                if (var3 > class254.field4249 && (var36 & 0x1) != 0) {
                                                    class72 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field1222) {
                                                        class173.field2828.method1582(var39, 4);
                                                    }
                                                }
                                                if (var4 > class102.field1745 && (var36 & 0x8) != 0) {
                                                    class72 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field1222) {
                                                        class173.field2828.method1582(var40, 4);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1236 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field1211; var42++) {
                                                if (class271.field4536 != var2.field1216[var42].field2473 && (var2.field1221[var42] & var2.field1236) == var2.field1213) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class207 var43 = var2.field1224;
                                                if (!class275.method1904(var6, var3, var4, var43.field3417)) {
                                                    if (class99.field1675) {
                                                        label1026: {
                                                            if ((var43.field3414 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field3415 - class244.field4035;
                                                                int var45 = var43.field3411 - class255.field4266;
                                                                int var46 = (int) (var43.field3414 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class129.field2114 - 1) {
                                                                        class62.method431(class244.field4035, class129.field2111, class255.field4266, var5, var3 - 1, var4 + 1);
                                                                        break label1026;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class88.field1504 - 1 && var4 < class129.field2114 - 1) {
                                                                        class62.method431(class244.field4035, class129.field2111, class255.field4266, var5, var3 + 1, var4 + 1);
                                                                        break label1026;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class88.field1504 - 1 && var4 > 0) {
                                                                        class62.method431(class244.field4035, class129.field2111, class255.field4266, var5, var3 + 1, var4 - 1);
                                                                        break label1026;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class62.method431(class244.field4035, class129.field2111, class255.field4266, var5, var3 - 1, var4 - 1);
                                                                        break label1026;
                                                                    }
                                                                }
                                                            }
                                                            class62.method431(class244.field4035, class129.field2111, class255.field4266, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field3416.method185(0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var43.field3415 - class244.field4035, var43.field3413 - class129.field2111, var43.field3411 - class255.field4266, var43.field3414, var5, (class194) null);
                                                }
                                                var2.field1236 = 0;
                                            }
                                        }
                                        if (!var2.field1219) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field1211;
                                            var2.field1219 = false;
                                            int var48 = 0;
                                            label832: for (int var49 = 0; var49 < var47; var49++) {
                                                class152 var50 = var2.field1216[var49];
                                                if (class271.field4536 != var50.field2473) {
                                                    for (int var51 = var50.field2464; var51 <= var50.field2478; var51++) {
                                                        for (int var52 = var50.field2468; var52 <= var50.field2463; var52++) {
                                                            class72 var53 = var7[var51][var52];
                                                            if (var53.field1217) {
                                                                var2.field1219 = true;
                                                                continue label832;
                                                            }
                                                            if (var53.field1236 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field2464) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field2478) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field2468) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field2463) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field1236) == var2.field1210) {
                                                                    var2.field1219 = true;
                                                                    continue label832;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class167.field2720[var48++] = var50;
                                                    int var55 = class254.field4249 - var50.field2464;
                                                    int var56 = var50.field2478 - class254.field4249;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class102.field1745 - var50.field2468;
                                                    int var58 = var50.field2463 - class102.field1745;
                                                    if (var58 > var57) {
                                                        var50.field2476 = var55 + var58;
                                                    } else {
                                                        var50.field2476 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class152 var62 = class167.field2720[var61];
                                                    if (class271.field4536 != var62.field2473) {
                                                        if (var62.field2476 > var59) {
                                                            var59 = var62.field2476;
                                                            var60 = var61;
                                                        } else if (var62.field2476 == var59) {
                                                            int var63 = var62.field2462 - class244.field4035;
                                                            int var64 = var62.field2475 - class255.field4266;
                                                            int var65 = class167.field2720[var60].field2462 - class244.field4035;
                                                            int var66 = class167.field2720[var60].field2475 - class255.field4266;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class152 var67 = class167.field2720[var60];
                                                var67.field2473 = class271.field4536;
                                                if (!class77.method580(var6, var67.field2464, var67.field2478, var67.field2468, var67.field2463, var67.field2461.method182())) {
                                                    if (class99.field1675) {
                                                        if ((var67.field2479 & 0xFC000L) == 147456L) {
                                                            class62.method431(class244.field4035, class129.field2111, class255.field4266, var5, var3, var4);
                                                            int var68 = var67.field2462 - class244.field4035;
                                                            int var69 = var67.field2475 - class255.field4266;
                                                            int var70 = (int) (var67.field2479 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class62.method424(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class62.method424(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class62.method424(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class62.method424(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class62.method427(class244.field4035, class129.field2111, class255.field4266, var5, var67.field2464, var67.field2468, var67.field2478, var67.field2463);
                                                        }
                                                    }
                                                    var67.field2461.method185(var67.field2470, class132.field2148, class53.field750, class93.field1576, class93.field1570, var67.field2462 - class244.field4035, var67.field2471 - class129.field2111, var67.field2475 - class255.field4266, var67.field2479, var5, (class194) null);
                                                }
                                                for (int var71 = var67.field2464; var71 <= var67.field2478; var71++) {
                                                    for (int var72 = var67.field2468; var72 <= var67.field2463; var72++) {
                                                        class72 var73 = var7[var71][var72];
                                                        if (var73.field1236 != 0) {
                                                            class173.field2828.method1582(var73, 4);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field1222) {
                                                            class173.field2828.method1582(var73, 4);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1219) {
                                                break;
                                            }
                                        } catch (Exception var133) {
                                            var2.field1219 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field1233 != null) {
                                        if (class99.field1675) {
                                            GL var75 = class99.field1682;
                                            class194.method1373(class244.field4035, class129.field2111, class255.field4266);
                                            int var76 = var2.field1227 * 128 + 64 - class244.field4035;
                                            int var77 = class192.field3174[var5][var2.field1227][var2.field1223] - class129.field2111;
                                            int var78 = var2.field1223 * 128 + 64 - class255.field4266;
                                            int var79;
                                            if (var5 < 3) {
                                                var79 = class192.field3174[var5][var2.field1227][var2.field1223] - class192.field3174[var5 + 1][var2.field1227][var2.field1223];
                                            } else {
                                                var79 = 1024;
                                            }
                                            int var80 = class93.field1570 * var78 - class93.field1576 * var76 >> 16;
                                            int var81 = class53.field750 * var80 + class132.field2148 * var77 >> 16;
                                            int var82 = (class53.field750 * 92 + class132.field2148 * 0 >> 16) + var81;
                                            int var83 = (class53.field750 * -92 - class132.field2148 * var79 >> 16) + var81;
                                            int var84 = var82 + 2 - var83;
                                            class11 var85 = null;
                                            class168 var86 = null;
                                            int var87 = -1;
                                            class11 var88 = (class11) var2.field1233.method587((byte) -36);
                                            while (true) {
                                                label1042: {
                                                    if (var88 != null) {
                                                        if (var88.field151 == null || var88.field151.field2762.field3197) {
                                                            var88.method2075(6204);
                                                            break label1042;
                                                        }
                                                        if ((byte) ((int) (var88.field151.field2762.field3203 & 0xFFL)) != var2.field1207) {
                                                            var2.field1233 = null;
                                                            break;
                                                        }
                                                        if (var85 == null) {
                                                            var85 = var88;
                                                            var86 = var88.field151;
                                                            var87 = var86.field2745.field1153;
                                                            break label1042;
                                                        }
                                                    }
                                                    if (var85 != null && (var88 == null || var88.field151 != var86 || var88.field151.field2745.field1153 != var87)) {
                                                        for (int var89 = 0; var89 < var84; var89++) {
                                                            class194.field3213[var89] = 0;
                                                        }
                                                        for (int var90 = 0; var90 < 32; var90++) {
                                                            class194.field3215[var90] = 0;
                                                        }
                                                        class194.field3221 = 0;
                                                        for (class11 var91 = var85; var91 != var88; var91 = (class11) var91.field2588) {
                                                            if (var91.field151 != null) {
                                                                int var92 = (var91.field153 >> 12) - class244.field4035;
                                                                int var93 = (var91.field152 >> 12) - class129.field2111;
                                                                int var94 = (var91.field156 >> 12) - class255.field4266;
                                                                int var95 = class93.field1570 * var94 - class93.field1576 * var92 >> 16;
                                                                int var96 = (class53.field750 * var95 + class132.field2148 * var93 >> 16) - var83;
                                                                if (class194.field3213[var96] < 32) {
                                                                    class194.field3216[var96][class194.field3213[var96]++] = var91.field155;
                                                                } else {
                                                                    if (class194.field3213[var96] == 32) {
                                                                        if (class194.field3221 == 32) {
                                                                            if (class194.field3201) {
                                                                                System.out.println("Overflowed world-based radix sort");
                                                                            }
                                                                            break;
                                                                        }
                                                                        class194.field3213[var96] += class194.field3221++ + 1;
                                                                    }
                                                                    int var97 = class194.field3215[class194.field3213[var96] - 32 - 1];
                                                                    if (var97 < 768) {
                                                                        short[] var10000 = class194.field3218[class194.field3213[var96] - 32 - 1];
                                                                        int var10002 = class194.field3213[var96] - 32 - 1;
                                                                        int var10004 = class194.field3215[class194.field3213[var96] - 32 - 1];
                                                                        class194.field3215[var10002] = class194.field3215[class194.field3213[var96] - 32 - 1] + 1;
                                                                        var10000[var10004] = var91.field155;
                                                                    }
                                                                }
                                                            }
                                                            if (var2.field1233.field1295 == var91.field2588) {
                                                                break;
                                                            }
                                                        }
                                                        boolean var98 = false;
                                                        if (class194.field3207 && var86.field2745.field1130 != -1) {
                                                            class310.field5207.method111(119, var86.field2745.field1130);
                                                            var98 = true;
                                                        } else {
                                                            class99.method749(-1);
                                                        }
                                                        var75.glPointSize((float) var87);
                                                        var86.field2762.method1367(var75, var84, var98, var86.field2745.field1117);
                                                        if (var88 != null) {
                                                            var85 = var88;
                                                            var86 = var88.field151;
                                                            var87 = var88.field151.field2745.field1153;
                                                        }
                                                    }
                                                    if (var88 == null) {
                                                        break;
                                                    }
                                                }
                                                var88 = (class11) var2.field1233.method586((byte) -124);
                                            }
                                            class194.method1365();
                                        } else {
                                            int var99 = class310.field5212 + class194.field3205;
                                            int var100 = class310.field5211 + class194.field3194;
                                            class160 var101 = var2.field1233.field1295;
                                            for (class160 var102 = var101.field2588; var102 != var101; var102 = var102.field2588) {
                                                class11 var103 = (class11) var102;
                                                if (var103.field151 != null && !var103.field151.field2762.field3197) {
                                                    if ((byte) ((int) (var103.field151.field2762.field3203 & 0xFFL)) != var2.field1207) {
                                                        var2.field1233 = null;
                                                        break;
                                                    }
                                                    int var104 = (var103.field153 >> 12) - class244.field4035;
                                                    int var105 = (var103.field152 >> 12) - class129.field2111;
                                                    int var106 = (var103.field156 >> 12) - class255.field4266;
                                                    int var107 = class93.field1576 * var106 + class93.field1570 * var104 >> 16;
                                                    int var108 = class93.field1570 * var106 - class93.field1576 * var104 >> 16;
                                                    int var110 = class53.field750 * var105 - class132.field2148 * var108 >> 16;
                                                    int var111 = class53.field750 * var108 + class132.field2148 * var105 >> 16;
                                                    if (var111 >= 50) {
                                                        int var113 = (var107 << 9) / var111 + var99;
                                                        int var114 = (var110 << 9) / var111 + var100;
                                                        class210.method1480(var113, var114, var103.field151.field2745.field1153 >> 2, var103.field158, var103.field158 >> 24 & 0xFF);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field1222);
                            } while (var2.field1236 != 0);
                            if (var3 > class254.field4249 || var3 <= class70.field1182) {
                                break;
                            }
                            var115 = var7[var3 - 1][var4];
                        } while (var115 != null && var115.field1222);
                        if (var3 < class254.field4249 || var3 >= class141.field2274 - 1) {
                            break;
                        }
                        var116 = var7[var3 + 1][var4];
                    } while (var116 != null && var116.field1222);
                    if (var4 > class102.field1745 || var4 <= class328.field5589) {
                        break;
                    }
                    var117 = var7[var3][var4 - 1];
                } while (var117 != null && var117.field1222);
                if (var4 < class102.field1745 || var4 >= class324.field5543 - 1) {
                    break;
                }
                var118 = var7[var3][var4 + 1];
            } while (var118 != null && var118.field1222);
            var2.field1222 = false;
            class193.field3190--;
            class101 var119 = var2.field1220;
            if (var119 != null && var119.field1731 != 0) {
                if (class99.field1675) {
                    class62.method431(class244.field4035, class129.field2111, class255.field4266, var5, var3, var4);
                }
                if (var119.field1726 != null) {
                    var119.field1726.method185(0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var119.field1725 - class244.field4035, var119.field1724 - class129.field2111 - var119.field1731, var119.field1728 - class255.field4266, var119.field1730, var5, (class194) null);
                }
                if (var119.field1729 != null) {
                    var119.field1729.method185(0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var119.field1725 - class244.field4035, var119.field1724 - class129.field2111 - var119.field1731, var119.field1728 - class255.field4266, var119.field1730, var5, (class194) null);
                }
                if (var119.field1727 != null) {
                    var119.field1727.method185(0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var119.field1725 - class244.field4035, var119.field1724 - class129.field2111 - var119.field1731, var119.field1728 - class255.field4266, var119.field1730, var5, (class194) null);
                }
            }
            if (var2.field1208 != 0) {
                class88 var120 = var2.field1214;
                if (var120 != null && !class181.method1290(var6, var3, var4, var120.field1494.method182())) {
                    if ((var120.field1484 & var2.field1208) != 0) {
                        if (class99.field1675) {
                            class62.method431(class244.field4035, class129.field2111, class255.field4266, var5, var3, var4);
                        }
                        var120.field1494.method185(0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var120.field1501 + var120.field1487 - class244.field4035, var120.field1488 - class129.field2111, var120.field1482 + var120.field1503 - class255.field4266, var120.field1502, var5, (class194) null);
                    } else if (var120.field1484 == 256) {
                        int var121 = var120.field1501 - class244.field4035;
                        int var122 = var120.field1488 - class129.field2111;
                        int var123 = var120.field1482 - class255.field4266;
                        int var124 = var120.field1496;
                        int var125;
                        if (var124 == 1 || var124 == 2) {
                            var125 = -var121;
                        } else {
                            var125 = var121;
                        }
                        int var126;
                        if (var124 == 2 || var124 == 3) {
                            var126 = -var123;
                        } else {
                            var126 = var123;
                        }
                        if (var126 >= var125) {
                            if (class99.field1675) {
                                class62.method431(class244.field4035, class129.field2111, class255.field4266, var5, var3, var4);
                            }
                            var120.field1494.method185(0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var120.field1487 + var121, var122, var120.field1503 + var123, var120.field1502, var5, (class194) null);
                        } else if (var120.field1489 != null) {
                            if (class99.field1675) {
                                class62.method431(class244.field4035, class129.field2111, class255.field4266, var5, var3, var4);
                            }
                            var120.field1489.method185(0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var121, var122, var123, var120.field1502, var5, (class194) null);
                        }
                    }
                }
                class207 var127 = var2.field1224;
                if (var127 != null) {
                    if ((var127.field3410 & var2.field1208) != 0 && !class275.method1904(var6, var3, var4, var127.field3410)) {
                        if (class99.field1675) {
                            class62.method426(var127.field3410, class244.field4035, class129.field2111, class255.field4266, var6, var3, var4);
                        }
                        var127.field3403.method185(0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var127.field3415 - class244.field4035, var127.field3413 - class129.field2111, var127.field3411 - class255.field4266, var127.field3414, var5, (class194) null);
                    }
                    if ((var127.field3417 & var2.field1208) != 0 && !class275.method1904(var6, var3, var4, var127.field3417)) {
                        if (class99.field1675) {
                            class62.method426(var127.field3417, class244.field4035, class129.field2111, class255.field4266, var6, var3, var4);
                        }
                        var127.field3416.method185(0, class132.field2148, class53.field750, class93.field1576, class93.field1570, var127.field3415 - class244.field4035, var127.field3413 - class129.field2111, var127.field3411 - class255.field4266, var127.field3414, var5, (class194) null);
                    }
                }
            }
            if (var5 < class206.field3397 - 1) {
                class72 var128 = class225.field3705[var5 + 1][var3][var4];
                if (var128 != null && var128.field1222) {
                    class173.field2828.method1582(var128, 4);
                }
            }
            if (var3 < class254.field4249) {
                class72 var129 = var7[var3 + 1][var4];
                if (var129 != null && var129.field1222) {
                    class173.field2828.method1582(var129, 4);
                }
            }
            if (var4 < class102.field1745) {
                class72 var130 = var7[var3][var4 + 1];
                if (var130 != null && var130.field1222) {
                    class173.field2828.method1582(var130, 4);
                }
            }
            if (var3 > class254.field4249) {
                class72 var131 = var7[var3 - 1][var4];
                if (var131 != null && var131.field1222) {
                    class173.field2828.method1582(var131, 4);
                }
            }
            if (var4 > class102.field1745) {
                class72 var132 = var7[var3][var4 - 1];
                if (var132 != null && var132.field1222) {
                    class173.field2828.method1582(var132, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 1371)
    public static final void method2133(int arg0) {
        if (arg0 != 10171) {
            method2134(-79);
        }
        field5345++;
        class184.field2985.method1414(arg0 ^ 0x27C6);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V", line = 1389)
    public static void method2134(int arg0) {
        field5342 = null;
        field5348 = null;
        if (arg0 != -3102) {
            return;
        }
        field5353 = null;
        field5351 = null;
        field5347 = null;
        field5343 = null;
        field5346 = null;
        field5340 = null;
        field5339 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V", line = 1407)
    public static final void method2135(int arg0, int arg1, int arg2) {
        if (class234.field3860 != 0 && arg1 != -1) {
            class301.method2024(1, arg1, false, class1.field17, 0, class234.field3860);
            class300.field4870 = true;
        }
        int var3 = 28 % ((-arg2) / 41);
        field5350++;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V", line = 1428)
    protected class314() {
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
    public abstract void method1101(Graphics arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/awt/Graphics;IIBI)V")
    public abstract void method1102(int arg0, Graphics arg1, int arg2, int arg3, byte arg4, int arg5);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public abstract void method1100(Component arg0, int arg1, int arg2, int arg3);
}
