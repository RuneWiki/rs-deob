import java.util.Random;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class270 {

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Ljava/util/Random;")
    public static Random field4455 = new Random();

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field4456 = -1;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field4458 = 0;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field4459 = 0;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "Lnm;")
    public static class221 field4457;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljj;Z)V", line = 9)
    public static final void method1904(class50 arg0, boolean arg1) {
        class204.field3122.method1077(16711935, arg0);
        while (true) {
            class50 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class50[][] var7;
            class50 var120;
            do {
                class50 var119;
                do {
                    class50 var118;
                    do {
                        class50 var117;
                        do {
                            do {
                                do {
                                    float var8;
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class50) class204.field3122.method1080(-1);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field750);
                                            var3 = var2.field741;
                                            var4 = var2.field731;
                                            var5 = var2.field729;
                                            var6 = var2.field739;
                                            var7 = class264.field4230[var5];
                                            var8 = 0.0F;
                                            if (class245.field3886) {
                                                if (class203.field3110 == class101.field1457) {
                                                    int var9 = class91.field1317[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class153.field2477 != var10) {
                                                        class153.field2477 = var10;
                                                        class115.method753(var10, false);
                                                        class234.method1619(class32.method270(1));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class296.field4916 != var11) {
                                                        class296.field4916 = var11;
                                                        class21.method126(false, var11);
                                                    }
                                                    int var12 = class223.field3444[0][var3 + 1][var4] + class223.field3444[0][var3][var4] + class223.field3444[0][var3][var4 + 1] + class223.field3444[0][var3 + 1][var4 + 1] >> 2;
                                                    class7.method53(3, -var12, true);
                                                    var8 = 201.5F;
                                                    class245.method1714(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class245.method1714(var8);
                                                }
                                            }
                                            if (!var2.field737) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class50 var13 = class264.field4230[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field750) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class258.field4094 && var3 > class352.field5611) {
                                                    class50 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field750 && (var14.field737 || (var2.field736 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class258.field4094 && var3 < class92.field1333 - 1) {
                                                    class50 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field750 && (var15.field737 || (var2.field736 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class296.field4906 && var4 > class214.field3303) {
                                                    class50 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field750 && (var16.field737 || (var2.field736 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class296.field4906 && var4 < class118.field1716 - 1) {
                                                    class50 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field750 && (var17.field737 || (var2.field736 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field737 = false;
                                            if (var2.field745 != null) {
                                                class50 var18 = var2.field745;
                                                if (class245.field3886) {
                                                    class245.method1714(201.5F - (float) (var18.field739 + 1) * 50.0F);
                                                }
                                                if (var18.field754 == null) {
                                                    if (var18.field740 != null) {
                                                        if (class148.method1054(0, var3, var4)) {
                                                            class290.method2054(var18.field740, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var3, var4, true);
                                                        } else {
                                                            class290.method2054(var18.field740, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class148.method1054(0, var3, var4)) {
                                                    class122.method795(var18.field754, 0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var3, var4, true);
                                                } else {
                                                    class122.method795(var18.field754, 0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var3, var4, false);
                                                }
                                                class257 var19 = var18.field732;
                                                if (var19 != null) {
                                                    if (class245.field3886) {
                                                        if ((var19.field4067 & var2.field734) == 0) {
                                                            class254.method1807(class244.field3847, class65.field959, class228.field3584, var5, var3, var4);
                                                        } else {
                                                            class254.method1798(var19.field4067, class244.field3847, class65.field959, class228.field3584, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field4070.method180(0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var19.field4068 - class244.field3847, var19.field4066 - class65.field959, var19.field4065 - class228.field3584, var19.field4069, var5, (class145) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field735; var20++) {
                                                    class258 var21 = var18.field752[var20];
                                                    if (var21 != null) {
                                                        if (class245.field3886) {
                                                            class254.method1807(class244.field3847, class65.field959, class228.field3584, var5, var3, var4);
                                                        }
                                                        var21.field4071.method180(var21.field4073, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var21.field4083 - class244.field3847, var21.field4080 - class65.field959, var21.field4075 - class228.field3584, var21.field4076, var5, (class145) null);
                                                    }
                                                }
                                                if (class245.field3886) {
                                                    class245.method1714(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field754 == null) {
                                                if (var2.field740 != null) {
                                                    if (class148.method1054(var6, var3, var4)) {
                                                        class290.method2054(var2.field740, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class290.method2054(var2.field740, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var3, var4, false);
                                                    }
                                                }
                                            } else if (class148.method1054(var6, var3, var4)) {
                                                class122.method795(var2.field754, var6, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field754.field246 != 12345678 || class146.field2361 && var5 <= class41.field623) {
                                                    class122.method795(var2.field754, var6, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class86 var23 = var2.field733;
                                                if (var23 != null && (var23.field1237 & 0x80000000L) != 0L) {
                                                    if (class245.field3886 && var23.field1244) {
                                                        class245.method1714(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class245.field3886) {
                                                        class254.method1807(class244.field3847, class65.field959, class228.field3584, var5, var3, var4);
                                                    }
                                                    var23.field1235.method180(0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var23.field1236 - class244.field3847, var23.field1230 - class65.field959, var23.field1239 - class228.field3584, var23.field1237, var5, (class145) null);
                                                    if (class245.field3886 && var23.field1244) {
                                                        class245.method1714(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class257 var26 = var2.field732;
                                            class206 var27 = var2.field747;
                                            if (var26 != null || var27 != null) {
                                                if (class258.field4094 == var3) {
                                                    var24++;
                                                } else if (class258.field4094 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class296.field4906 == var4) {
                                                    var24 += 3;
                                                } else if (class296.field4906 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class355.field5631[var24];
                                                var2.field734 = class255.field4042[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field4067 & class177.field2766[var24]) == 0) {
                                                    var2.field743 = 0;
                                                } else if (var26.field4067 == 16) {
                                                    var2.field743 = 3;
                                                    var2.field746 = class196.field2998[var24];
                                                    var2.field727 = 3 - var2.field746;
                                                } else if (var26.field4067 == 32) {
                                                    var2.field743 = 6;
                                                    var2.field746 = class251.field3999[var24];
                                                    var2.field727 = 6 - var2.field746;
                                                } else if (var26.field4067 == 64) {
                                                    var2.field743 = 12;
                                                    var2.field746 = class143.field2300[var24];
                                                    var2.field727 = 12 - var2.field746;
                                                } else {
                                                    var2.field743 = 9;
                                                    var2.field746 = class98.field1428[var24];
                                                    var2.field727 = 9 - var2.field746;
                                                }
                                                if ((var26.field4067 & var25) != 0 && !class78.method534(var6, var3, var4, var26.field4067)) {
                                                    if (class245.field3886) {
                                                        class254.method1807(class244.field3847, class65.field959, class228.field3584, var5, var3, var4);
                                                    }
                                                    var26.field4070.method180(0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var26.field4068 - class244.field3847, var26.field4066 - class65.field959, var26.field4065 - class228.field3584, var26.field4069, var5, (class145) null);
                                                }
                                                if ((var26.field4058 & var25) != 0 && !class78.method534(var6, var3, var4, var26.field4058)) {
                                                    if (class245.field3886) {
                                                        class254.method1807(class244.field3847, class65.field959, class228.field3584, var5, var3, var4);
                                                    }
                                                    var26.field4059.method180(0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var26.field4068 - class244.field3847, var26.field4066 - class65.field959, var26.field4065 - class228.field3584, var26.field4069, var5, (class145) null);
                                                }
                                            }
                                            if (var27 != null && !class219.method1481(var6, var3, var4, var27.field3136.method192())) {
                                                if (class245.field3886) {
                                                    class245.method1714(var8 - 0.5F);
                                                }
                                                if ((var27.field3137 & var25) != 0) {
                                                    if (class245.field3886) {
                                                        class254.method1807(class244.field3847, class65.field959, class228.field3584, var5, var3, var4);
                                                    }
                                                    var27.field3136.method180(0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var27.field3142 + var27.field3140 - class244.field3847, var27.field3131 - class65.field959, var27.field3135 + var27.field3138 - class228.field3584, var27.field3128, var5, (class145) null);
                                                } else if (var27.field3137 == 256) {
                                                    int var28 = var27.field3142 - class244.field3847;
                                                    int var29 = var27.field3131 - class65.field959;
                                                    int var30 = var27.field3135 - class228.field3584;
                                                    int var31 = var27.field3134;
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
                                                        if (class245.field3886) {
                                                            class254.method1807(class244.field3847, class65.field959, class228.field3584, var5, var3, var4);
                                                        }
                                                        var27.field3136.method180(0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var27.field3140 + var28, var29, var27.field3138 + var30, var27.field3128, var5, (class145) null);
                                                    } else if (var27.field3141 != null) {
                                                        if (class245.field3886) {
                                                            class254.method1807(class244.field3847, class65.field959, class228.field3584, var5, var3, var4);
                                                        }
                                                        var27.field3141.method180(0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var28, var29, var30, var27.field3128, var5, (class145) null);
                                                    }
                                                }
                                                if (class245.field3886) {
                                                    class245.method1714(var8);
                                                }
                                            }
                                            if (var22) {
                                                class86 var34 = var2.field733;
                                                if (var34 != null && (var34.field1237 & 0x80000000L) == 0L) {
                                                    if (class245.field3886 && var34.field1244) {
                                                        class245.method1714(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class245.field3886) {
                                                        class254.method1807(class244.field3847, class65.field959, class228.field3584, var5, var3, var4);
                                                    }
                                                    var34.field1235.method180(0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var34.field1236 - class244.field3847, var34.field1230 - class65.field959, var34.field1239 - class228.field3584, var34.field1237, var5, (class145) null);
                                                    if (class245.field3886 && var34.field1244) {
                                                        class245.method1714(var8);
                                                    }
                                                }
                                                class286 var35 = var2.field728;
                                                if (var35 != null && var35.field4690 == 0) {
                                                    if (class245.field3886) {
                                                        class254.method1807(class244.field3847, class65.field959, class228.field3584, var5, var3, var4);
                                                    }
                                                    if (var35.field4686 != null) {
                                                        var35.field4686.method180(0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var35.field4682 - class244.field3847, var35.field4679 - class65.field959, var35.field4685 - class228.field3584, var35.field4680, var5, (class145) null);
                                                    }
                                                    if (var35.field4687 != null) {
                                                        var35.field4687.method180(0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var35.field4682 - class244.field3847, var35.field4679 - class65.field959, var35.field4685 - class228.field3584, var35.field4680, var5, (class145) null);
                                                    }
                                                    if (var35.field4691 != null) {
                                                        var35.field4691.method180(0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var35.field4682 - class244.field3847, var35.field4679 - class65.field959, var35.field4685 - class228.field3584, var35.field4680, var5, (class145) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field736;
                                            if (var36 != 0) {
                                                if (var3 < class258.field4094 && (var36 & 0x4) != 0) {
                                                    class50 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field750) {
                                                        class204.field3122.method1077(16711935, var37);
                                                    }
                                                }
                                                if (var4 < class296.field4906 && (var36 & 0x2) != 0) {
                                                    class50 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field750) {
                                                        class204.field3122.method1077(16711935, var38);
                                                    }
                                                }
                                                if (var3 > class258.field4094 && (var36 & 0x1) != 0) {
                                                    class50 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field750) {
                                                        class204.field3122.method1077(16711935, var39);
                                                    }
                                                }
                                                if (var4 > class296.field4906 && (var36 & 0x8) != 0) {
                                                    class50 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field750) {
                                                        class204.field3122.method1077(16711935, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field743 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field735; var42++) {
                                                if (class141.field2268 != var2.field752[var42].field4087 && (var2.field753[var42] & var2.field743) == var2.field746) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class257 var43 = var2.field732;
                                                if (!class78.method534(var6, var3, var4, var43.field4067)) {
                                                    if (class245.field3886) {
                                                        label1037: {
                                                            if ((var43.field4069 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field4068 - class244.field3847;
                                                                int var45 = var43.field4065 - class228.field3584;
                                                                int var46 = (int) (var43.field4069 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class163.field2590 - 1) {
                                                                        class254.method1807(class244.field3847, class65.field959, class228.field3584, var5, var3 - 1, var4 + 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class263.field4155 - 1 && var4 < class163.field2590 - 1) {
                                                                        class254.method1807(class244.field3847, class65.field959, class228.field3584, var5, var3 + 1, var4 + 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class263.field4155 - 1 && var4 > 0) {
                                                                        class254.method1807(class244.field3847, class65.field959, class228.field3584, var5, var3 + 1, var4 - 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class254.method1807(class244.field3847, class65.field959, class228.field3584, var5, var3 - 1, var4 - 1);
                                                                        break label1037;
                                                                    }
                                                                }
                                                            }
                                                            class254.method1807(class244.field3847, class65.field959, class228.field3584, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field4070.method180(0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var43.field4068 - class244.field3847, var43.field4066 - class65.field959, var43.field4065 - class228.field3584, var43.field4069, var5, (class145) null);
                                                }
                                                var2.field743 = 0;
                                            }
                                        }
                                        if (!var2.field742) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field735;
                                            var2.field742 = false;
                                            int var48 = 0;
                                            label844: for (int var49 = 0; var49 < var47; var49++) {
                                                class258 var50 = var2.field752[var49];
                                                if (class141.field2268 != var50.field4087) {
                                                    for (int var51 = var50.field4082; var51 <= var50.field4084; var51++) {
                                                        for (int var52 = var50.field4081; var52 <= var50.field4077; var52++) {
                                                            class50 var53 = var7[var51][var52];
                                                            if (var53.field737) {
                                                                var2.field742 = true;
                                                                continue label844;
                                                            }
                                                            if (var53.field743 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field4082) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field4084) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field4081) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field4077) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field743) == var2.field727) {
                                                                    var2.field742 = true;
                                                                    continue label844;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class72.field1108[var48++] = var50;
                                                    int var55 = class258.field4094 - var50.field4082;
                                                    int var56 = var50.field4084 - class258.field4094;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class296.field4906 - var50.field4081;
                                                    int var58 = var50.field4077 - class296.field4906;
                                                    if (var58 > var57) {
                                                        var50.field4078 = var55 + var58;
                                                    } else {
                                                        var50.field4078 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class258 var62 = class72.field1108[var61];
                                                    if (class141.field2268 != var62.field4087) {
                                                        if (var62.field4078 > var59) {
                                                            var59 = var62.field4078;
                                                            var60 = var61;
                                                        } else if (var62.field4078 == var59) {
                                                            int var63 = var62.field4083 - class244.field3847;
                                                            int var64 = var62.field4075 - class228.field3584;
                                                            int var65 = class72.field1108[var60].field4083 - class244.field3847;
                                                            int var66 = class72.field1108[var60].field4075 - class228.field3584;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class258 var67 = class72.field1108[var60];
                                                var67.field4087 = class141.field2268;
                                                if (!class157.method1121(var6, var67.field4082, var67.field4084, var67.field4081, var67.field4077, var67.field4071.method192())) {
                                                    if (class245.field3886) {
                                                        if ((var67.field4076 & 0xFC000L) == 147456L) {
                                                            class254.method1807(class244.field3847, class65.field959, class228.field3584, var5, var3, var4);
                                                            int var68 = var67.field4083 - class244.field3847;
                                                            int var69 = var67.field4075 - class228.field3584;
                                                            int var70 = (int) (var67.field4076 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class254.method1808(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class254.method1808(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class254.method1808(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class254.method1808(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class254.method1799(class244.field3847, class65.field959, class228.field3584, var5, var67.field4082, var67.field4081, var67.field4084, var67.field4077);
                                                        }
                                                    }
                                                    var67.field4071.method180(var67.field4073, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var67.field4083 - class244.field3847, var67.field4080 - class65.field959, var67.field4075 - class228.field3584, var67.field4076, var5, (class145) null);
                                                }
                                                for (int var71 = var67.field4082; var71 <= var67.field4084; var71++) {
                                                    for (int var72 = var67.field4081; var72 <= var67.field4077; var72++) {
                                                        class50 var73 = var7[var71][var72];
                                                        if (var73.field743 != 0) {
                                                            class204.field3122.method1077(16711935, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field750) {
                                                            class204.field3122.method1077(16711935, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field742) {
                                                break;
                                            }
                                        } catch (Exception var135) {
                                            var2.field742 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field748 != null) {
                                        if (class245.field3886) {
                                            GL var75 = class245.field3884;
                                            class245.method1714(var8);
                                            class145.method1026(class244.field3847, class65.field959, class228.field3584);
                                            int var76 = var2.field741 * 128 + 64 - class244.field3847;
                                            int var77 = class101.field1457[var5][var2.field741][var2.field731] - class65.field959;
                                            int var78 = var2.field731 * 128 + 64 - class228.field3584;
                                            int var79;
                                            if (var5 < 3) {
                                                var79 = class101.field1457[var5][var2.field741][var2.field731] - class101.field1457[var5 + 1][var2.field741][var2.field731];
                                            } else {
                                                var79 = 1024;
                                            }
                                            int var80 = class347.field5560 * var78 - class160.field2555 * var76 >> 16;
                                            int var81 = class292.field4845 * var77 + class197.field3022 * var80 >> 16;
                                            int var82 = (class292.field4845 * 0 + class197.field3022 * 91 >> 16) + var81;
                                            int var83 = (class197.field3022 * -91 - class292.field4845 * var79 >> 16) + var81;
                                            if (var83 < var82 - 1597) {
                                                var83 = var82 - 1597;
                                            }
                                            int var84 = var82 + 2 - var83;
                                            class349 var85 = null;
                                            class209 var86 = null;
                                            int var87 = -1;
                                            class349 var88 = (class349) var2.field748.method1308(-13);
                                            while (true) {
                                                label1054: {
                                                    if (var88 != null) {
                                                        if (var88.field5576 == null || var88.field5576.field3167.field2306) {
                                                            var88.method1005((byte) -123);
                                                            break label1054;
                                                        }
                                                        if ((byte) ((int) (var88.field5576.field3167.field2311 & 0xFFL)) != var2.field730) {
                                                            var2.field748 = null;
                                                            break;
                                                        }
                                                        if (var85 == null) {
                                                            var85 = var88;
                                                            var86 = var88.field5576;
                                                            var87 = var86.field3163.field3505;
                                                            break label1054;
                                                        }
                                                    }
                                                    if (var85 != null && (var88 == null || var88.field5576 != var86 || var88.field5576.field3163.field3505 != var87)) {
                                                        for (int var89 = 0; var89 < var84; var89++) {
                                                            class145.field2333[var89] = 0;
                                                        }
                                                        for (int var90 = 0; var90 < 32; var90++) {
                                                            class145.field2327[var90] = 0;
                                                        }
                                                        class145.field2325 = 0;
                                                        for (class349 var91 = var85; var91 != var88; var91 = (class349) var91.field874) {
                                                            if (var91.field5576 != null) {
                                                                int var92 = (var91.field5582 >> 12) - class244.field3847;
                                                                int var93 = (var91.field5578 >> 12) - class65.field959;
                                                                int var94 = (var91.field5586 >> 12) - class228.field3584;
                                                                int var95 = class347.field5560 * var94 - class160.field2555 * var92 >> 16;
                                                                int var96 = (class292.field4845 * var93 + class197.field3022 * var95 >> 16) - var83;
                                                                if (class145.field2333[var96] < 32) {
                                                                    class145.field2335[var96][class145.field2333[var96]++] = var91.field5583;
                                                                } else {
                                                                    if (class145.field2333[var96] == 32) {
                                                                        if (class145.field2325 == 32) {
                                                                            if (class145.field2307) {
                                                                                System.out.println("Overflowed world-based radix sort");
                                                                            }
                                                                            break;
                                                                        }
                                                                        class145.field2333[var96] += class145.field2325++ + 1;
                                                                    }
                                                                    int var97 = class145.field2327[class145.field2333[var96] - 32 - 1];
                                                                    if (var97 < 768) {
                                                                        short[] var10000 = class145.field2328[class145.field2333[var96] - 32 - 1];
                                                                        int var10002 = class145.field2333[var96] - 32 - 1;
                                                                        int var10004 = class145.field2327[class145.field2333[var96] - 32 - 1];
                                                                        class145.field2327[var10002] = class145.field2327[class145.field2333[var96] - 32 - 1] + 1;
                                                                        var10000[var10004] = var91.field5583;
                                                                    }
                                                                }
                                                            }
                                                            if (var2.field748.field2933 == var91.field874) {
                                                                break;
                                                            }
                                                        }
                                                        boolean var98 = false;
                                                        if (class145.field2313 && var86.field3163.field3463 != -1) {
                                                            class272.field4467.method400((byte) 111, var86.field3163.field3463);
                                                            var98 = true;
                                                        } else {
                                                            class245.method1729(-1);
                                                        }
                                                        float var99 = (float) var87 * class145.field2340;
                                                        if (var99 > 64.0F) {
                                                            var99 = 64.0F;
                                                        }
                                                        var75.glPointSize(var99);
                                                        var86.field3167.method1018(var75, var84, var98, var86.field3163.field3460);
                                                        if (var88 != null) {
                                                            var85 = var88;
                                                            var86 = var88.field5576;
                                                            var87 = var88.field5576.field3163.field3505;
                                                        }
                                                    }
                                                    if (var88 == null) {
                                                        break;
                                                    }
                                                }
                                                var88 = (class349) var2.field748.method1311(-1436335792);
                                            }
                                            class145.method1029();
                                        } else {
                                            int var100 = class272.field4466 + class145.field2309;
                                            int var101 = class272.field4481 + class145.field2312;
                                            class58 var102 = var2.field748.field2933;
                                            for (class58 var103 = var102.field874; var103 != var102; var103 = var103.field874) {
                                                class349 var104 = (class349) var103;
                                                if (var104.field5576 != null && !var104.field5576.field3167.field2306) {
                                                    if ((byte) ((int) (var104.field5576.field3167.field2311 & 0xFFL)) != var2.field730) {
                                                        var2.field748 = null;
                                                        break;
                                                    }
                                                    int var105 = (var104.field5582 >> 12) - class244.field3847;
                                                    int var106 = (var104.field5578 >> 12) - class65.field959;
                                                    int var107 = (var104.field5586 >> 12) - class228.field3584;
                                                    int var108 = class347.field5560 * var105 + class160.field2555 * var107 >> 16;
                                                    int var109 = class347.field5560 * var107 - class160.field2555 * var105 >> 16;
                                                    int var111 = class197.field3022 * var106 - class292.field4845 * var109 >> 16;
                                                    int var112 = class292.field4845 * var106 + class197.field3022 * var109 >> 16;
                                                    if (var112 >= 50) {
                                                        int var114 = (var108 << 9) / var112 + var100;
                                                        int var115 = (var111 << 9) / var112 + var101;
                                                        int var116 = var112 * 400;
                                                        if (var116 == 0) {
                                                            var116 = 1;
                                                        }
                                                        class317.method2271(var114, var115, (var104.field5576.field3163.field3505 << 16) / var116, var104.field5580, var104.field5580 >> 24 & 0xFF);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field750);
                            } while (var2.field743 != 0);
                            if (var3 > class258.field4094 || var3 <= class352.field5611) {
                                break;
                            }
                            var117 = var7[var3 - 1][var4];
                        } while (var117 != null && var117.field750);
                        if (var3 < class258.field4094 || var3 >= class92.field1333 - 1) {
                            break;
                        }
                        var118 = var7[var3 + 1][var4];
                    } while (var118 != null && var118.field750);
                    if (var4 > class296.field4906 || var4 <= class214.field3303) {
                        break;
                    }
                    var119 = var7[var3][var4 - 1];
                } while (var119 != null && var119.field750);
                if (var4 < class296.field4906 || var4 >= class118.field1716 - 1) {
                    break;
                }
                var120 = var7[var3][var4 + 1];
            } while (var120 != null && var120.field750);
            var2.field750 = false;
            class51.field773--;
            class286 var121 = var2.field728;
            if (var121 != null && var121.field4690 != 0) {
                if (class245.field3886) {
                    class254.method1807(class244.field3847, class65.field959, class228.field3584, var5, var3, var4);
                }
                if (var121.field4686 != null) {
                    var121.field4686.method180(0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var121.field4682 - class244.field3847, var121.field4679 - class65.field959 - var121.field4690, var121.field4685 - class228.field3584, var121.field4680, var5, (class145) null);
                }
                if (var121.field4687 != null) {
                    var121.field4687.method180(0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var121.field4682 - class244.field3847, var121.field4679 - class65.field959 - var121.field4690, var121.field4685 - class228.field3584, var121.field4680, var5, (class145) null);
                }
                if (var121.field4691 != null) {
                    var121.field4691.method180(0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var121.field4682 - class244.field3847, var121.field4679 - class65.field959 - var121.field4690, var121.field4685 - class228.field3584, var121.field4680, var5, (class145) null);
                }
            }
            if (var2.field734 != 0) {
                class206 var122 = var2.field747;
                if (var122 != null && !class219.method1481(var6, var3, var4, var122.field3136.method192())) {
                    if ((var122.field3137 & var2.field734) != 0) {
                        if (class245.field3886) {
                            class254.method1807(class244.field3847, class65.field959, class228.field3584, var5, var3, var4);
                        }
                        var122.field3136.method180(0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var122.field3142 + var122.field3140 - class244.field3847, var122.field3131 - class65.field959, var122.field3135 + var122.field3138 - class228.field3584, var122.field3128, var5, (class145) null);
                    } else if (var122.field3137 == 256) {
                        int var123 = var122.field3142 - class244.field3847;
                        int var124 = var122.field3131 - class65.field959;
                        int var125 = var122.field3135 - class228.field3584;
                        int var126 = var122.field3134;
                        int var127;
                        if (var126 == 1 || var126 == 2) {
                            var127 = -var123;
                        } else {
                            var127 = var123;
                        }
                        int var128;
                        if (var126 == 2 || var126 == 3) {
                            var128 = -var125;
                        } else {
                            var128 = var125;
                        }
                        if (var128 >= var127) {
                            if (class245.field3886) {
                                class254.method1807(class244.field3847, class65.field959, class228.field3584, var5, var3, var4);
                            }
                            var122.field3136.method180(0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var122.field3140 + var123, var124, var122.field3138 + var125, var122.field3128, var5, (class145) null);
                        } else if (var122.field3141 != null) {
                            if (class245.field3886) {
                                class254.method1807(class244.field3847, class65.field959, class228.field3584, var5, var3, var4);
                            }
                            var122.field3141.method180(0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var123, var124, var125, var122.field3128, var5, (class145) null);
                        }
                    }
                }
                class257 var129 = var2.field732;
                if (var129 != null) {
                    if ((var129.field4058 & var2.field734) != 0 && !class78.method534(var6, var3, var4, var129.field4058)) {
                        if (class245.field3886) {
                            class254.method1798(var129.field4058, class244.field3847, class65.field959, class228.field3584, var6, var3, var4);
                        }
                        var129.field4059.method180(0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var129.field4068 - class244.field3847, var129.field4066 - class65.field959, var129.field4065 - class228.field3584, var129.field4069, var5, (class145) null);
                    }
                    if ((var129.field4067 & var2.field734) != 0 && !class78.method534(var6, var3, var4, var129.field4067)) {
                        if (class245.field3886) {
                            class254.method1798(var129.field4067, class244.field3847, class65.field959, class228.field3584, var6, var3, var4);
                        }
                        var129.field4070.method180(0, class292.field4845, class197.field3022, class160.field2555, class347.field5560, var129.field4068 - class244.field3847, var129.field4066 - class65.field959, var129.field4065 - class228.field3584, var129.field4069, var5, (class145) null);
                    }
                }
            }
            if (var5 < class217.field3348 - 1) {
                class50 var130 = class264.field4230[var5 + 1][var3][var4];
                if (var130 != null && var130.field750) {
                    class204.field3122.method1077(16711935, var130);
                }
            }
            if (var3 < class258.field4094) {
                class50 var131 = var7[var3 + 1][var4];
                if (var131 != null && var131.field750) {
                    class204.field3122.method1077(16711935, var131);
                }
            }
            if (var4 < class296.field4906) {
                class50 var132 = var7[var3][var4 + 1];
                if (var132 != null && var132.field750) {
                    class204.field3122.method1077(16711935, var132);
                }
            }
            if (var3 > class258.field4094) {
                class50 var133 = var7[var3 - 1][var4];
                if (var133 != null && var133.field750) {
                    class204.field3122.method1077(16711935, var133);
                }
            }
            if (var4 > class296.field4906) {
                class50 var134 = var7[var3][var4 - 1];
                if (var134 != null && var134.field750) {
                    class204.field3122.method1077(16711935, var134);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V", line = 1226)
    public static void method1905(byte arg0) {
        if (arg0 != -120) {
            field4458 = -94;
        }
        field4457 = null;
        field4455 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III[II)V", line = 1237)
    public static final void method1906(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field4453++;
        int var6 = arg1 - 1;
        int var5 = var6 - 7;
        if (arg4 <= 115) {
            return;
        }
        arg2--;
        while (arg2 < var5) {
            int var7 = arg2 + 1;
            arg3[var7] = arg0;
            int var8 = var7 + 1;
            arg3[var8] = arg0;
            int var9 = var8 + 1;
            arg3[var9] = arg0;
            int var10 = var9 + 1;
            arg3[var10] = arg0;
            int var11 = var10 + 1;
            arg3[var11] = arg0;
            int var12 = var11 + 1;
            arg3[var12] = arg0;
            int var13 = var12 + 1;
            arg3[var13] = arg0;
            arg2 = var13 + 1;
            arg3[arg2] = arg0;
        }
        while (arg2 < var6) {
            arg2++;
            arg3[arg2] = arg0;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZLjava/lang/String;B)Z", line = 1265)
    public static final boolean method1907(int arg0, boolean arg1, String arg2, byte arg3) {
        field4454++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        int var5 = 0;
        boolean var6 = false;
        int var7 = arg2.length();
        int var8 = 0;
        int var9 = -7 / ((arg3 - 61) / 49);
        while (var8 < var7) {
            label78: {
                char var10 = arg2.charAt(var8);
                if (var8 == 0) {
                    if (var10 == '-') {
                        var4 = true;
                        break label78;
                    }
                    if (var10 == '+' && arg1) {
                        break label78;
                    }
                }
                int var12;
                if (var10 >= '0' && var10 <= '9') {
                    var12 = var10 - '0';
                } else if (var10 >= 'A' && var10 <= 'Z') {
                    var12 = var10 - '7';
                } else if (var10 >= 'a' && var10 <= 'z') {
                    var12 = var10 - 'W';
                } else {
                    return false;
                }
                if (arg0 <= var12) {
                    return false;
                }
                if (var4) {
                    var12 = -var12;
                }
                int var11 = arg0 * var5 + var12;
                if (var11 / arg0 != var5) {
                    return false;
                }
                var6 = true;
                var5 = var11;
            }
            var8++;
        }
        return var6;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([[I[[FZIII[IILjb;ZIBIIII[ZZ[[F[[I[[FZ)V", line = 1339)
    public static final void method1908(int[][] arg0, float[][] arg1, boolean arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, class226 arg8, boolean arg9, int arg10, byte arg11, int arg12, int arg13, int arg14, int arg15, boolean[] arg16, boolean arg17, float[][] arg18, int[][] arg19, float[][] arg20, boolean arg21) {
        field4450++;
        int var22 = (arg2 ? 255 : 0) + (arg7 << 8);
        int var23 = (arg15 << 8) + (arg9 ? 255 : 0);
        int[] var24 = new int[arg6.length / 2];
        int var25 = (arg17 ? 255 : 0) + (arg14 << 8);
        int var26 = (arg5 << 8) + (arg21 ? 255 : 0);
        for (int var27 = arg12; var27 < var24.length; var27++) {
            int var28 = arg6[var27 + var27];
            int var29 = arg6[var27 + var27 + 1];
            int[][] var30 = arg19 == null || arg16 == null || !arg16[var27] ? arg0 : arg19;
            var24[var27] = class196.method1340(arg11, arg20, false, arg8, arg18, var26, arg13, -22095, arg1, var22, var30, (float) arg3, arg10, var23, var25, var28, var29, arg19);
        }
        arg8.method1531(arg4, arg13, arg10, var24, (int[]) null, false);
    }
}
