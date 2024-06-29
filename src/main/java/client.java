import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class206 {

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field3579;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Ljava/lang/Class;")
    public static Class field3580;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
    public static boolean field3581;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1690() {
        class22.field250 = 0;
        for (int var0 = 0; var0 < class99.field1276; var0++) {
            class506 var1 = ((class704) class168.field1973.method3828((long) class352.field4562[var0], (byte) -91)).field9854;
            if (var1.field446 && var1.method217((byte) -34) != -1) {
                int var2 = (var1.method210(false) - 1) * 256 + 252;
                int var3 = var1.field8018 - var2 >> 9;
                int var4 = var1.field8011 - var2 >> 9;
                class32 var5 = class411.method2306(var1.field8010, var4, var3, (byte) 7);
                if (var5 != null) {
                    int var6 = var5.field495;
                    if (var5 instanceof class506) {
                        var6 += 2048;
                    }
                    if (var5.field475 == 0 && var5.method217((byte) -34) != -1) {
                        class396.field5035[class22.field250] = var6;
                        class461.field5747[class22.field250] = var6;
                        class22.field250++;
                        var5.field475++;
                    }
                    class396.field5035[class22.field250] = var6;
                    class461.field5747[class22.field250] = var1.field495 + 2048;
                    class22.field250++;
                    var5.field475++;
                }
            }
        }
        class474.method2577(0, 0, class22.field250 - 1, class461.field5747, class396.field5035);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static final void method1691(int arg0) {
        int var1 = class149.field1788;
        int[] var2 = class95.field1239;
        for (int var3 = 0; var3 < class99.field1276 + var1; var3++) {
            class32 var4;
            if (var3 < var1) {
                var4 = class132.field1601[var2[var3]];
            } else {
                var4 = ((class704) class168.field1973.method3828((long) class352.field4562[var3 - var1], (byte) -91)).field9854;
            }
            if (var4.field8010 == arg0 && var4.field476 >= 0) {
                int var5 = var4.method210(false);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field8018 & 0x1FF) != 0 || (var4.field8011 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field8018 & 0x1FF) != 256 || (var4.field8011 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field8018 >> 9;
                    int var7 = var4.field8011 >> 9;
                    if (var4.field476 > class701.field9813[var6][var7]) {
                        class701.field9813[var6][var7] = var4.field476;
                        class372.field4799[var6][var7] = 1;
                    } else if (class701.field9813[var6][var7] == var4.field476) {
                        var10002 = class372.field4799[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field8018 - var8 >> 9;
                    int var10 = var4.field8011 - var8 >> 9;
                    int var11 = var4.field8018 + var8 >> 9;
                    int var12 = var4.field8011 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field476 > class701.field9813[var13][var14]) {
                                class701.field9813[var13][var14] = var4.field476;
                                class372.field4799[var13][var14] = 1;
                            } else if (class701.field9813[var13][var14] == var4.field476) {
                                var10002 = class372.field4799[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1692() {
        int var0 = class149.field1788;
        int[] var1 = class95.field1239;
        int var2 = class363.field4646 ? var0 : class99.field1276 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class32 var4;
            if (var3 < var0) {
                var4 = class132.field1601[var1[var3]];
            } else {
                var4 = ((class704) class168.field1973.method3828((long) class352.field4562[var3 - var0], (byte) -91)).field9854;
            }
            if (var4.field476 >= 0) {
                int var5 = var4.method210(false);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field8018 & 0x1FF) == 0 && (var4.field8011 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field8018 & 0x1FF) == 256 && (var4.field8011 & 0x1FF) == 256) {
                    continue;
                }
                if (var4 instanceof class365 && var4.field507 != null && class665.field9027 >= var4.field507.field8153 && class665.field9027 < var4.field507.field8146) {
                    ((class365) var4).field4701 = false;
                }
                var4.field8013 = class514.method2798(var4.field8011, var4.field8018, var4.field8010, (byte) 23);
                class223.method1332(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method1194(int arg0) {
        if (arg0 != 0) {
            main(null);
        }
        field3575++;
        if (class628.field8526 != 2) {
            this.method1698(-20794);
            return;
        }
        try {
            this.method1698(-20794);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class564.method2994((byte) 34, var5.getMessage() + " (Recovered) " + this.method1204(992), var5);
            class364.method2114(0, arg0 + 118);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lrr;)Lah;")
    public static final class357 method1693(class337 arg0) {
        class357 var1 = (class357) class96.field1248.method3828(((long) arg0.field4172 << 32) + (long) arg0.field4310, (byte) -91);
        return var1 == null ? arg0.field4316 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lrr;IIIIIIIII)V")
    public static final void method1694(class337[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class337 var11 = arg0[var10];
            if (var11 != null && var11.field4190 == arg1) {
                int var12 = var11.field4153 + arg6;
                int var13 = var11.field4227 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field4212 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field4309 + var12;
                    int var19 = var11.field4211 + var13;
                    if (var11.field4212 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field4212 == 0 || var11.field4276 || method1693(var11).field4604 != 0 || class85.field1089 == var11 || class323.field4030 == var11.field4298) {
                    if (!method1702(var11)) {
                        if (class338.field4324 == var11 && class67.method524(class338.field4324, 4) != null) {
                            class300.field3811 = true;
                            class124.field1519 = var12;
                            class103.field1315 = var13;
                        }
                        if (var11.field4268 || var14 < var16 && var15 < var17) {
                            if (var11.field4157 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class402 var20 = (class402) class144.field1743.method1909(true); var20 != null; var20 = (class402) class144.field1743.method1916((byte) 109)) {
                                    if (var20.field5164) {
                                        var20.method1566(-73);
                                        var20.field5154.field4289 = false;
                                    }
                                }
                                if (class52.field661 == 0) {
                                    class338.field4324 = null;
                                    class85.field1089 = null;
                                }
                                class336.field4145 = 0;
                                class669.field9070 = false;
                                class500.field6239 = false;
                                if (!class367.field4752) {
                                    class29.method183(65);
                                }
                            }
                            boolean var21;
                            if (class113.field1423.method1074((byte) 125) >= var14 && class113.field1423.method1078((byte) 125) >= var15 && class113.field1423.method1074((byte) 127) < var16 && class113.field1423.method1078((byte) 116) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class37.field542 && var21) {
                                if (var11.field4203 >= 0) {
                                    class530.field6684 = var11.field4203;
                                } else if (var11.field4157) {
                                    class530.field6684 = -1;
                                }
                            }
                            if (!class367.field4752 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class92.method681((byte) -117, arg9 - var13, var11, arg8 - var12);
                            }
                            boolean var22 = false;
                            if (class113.field1423.method1072(-51) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class132 var24 = (class132) class500.field6235.method1909(true);
                            if (var24 != null && var24.method855((byte) -108) == 0 && var24.method860(true) >= var14 && var24.method851(-1160828951) >= var15 && var24.method860(true) < var16 && var24.method851(-1160828951) < var17) {
                                var23 = true;
                            }
                            if (var11.field4257 != null && !class635.method3558(-23418)) {
                                for (int var25 = 0; var25 < var11.field4257.length; var25++) {
                                    if (class307.field3884.method1592((byte) -120, var11.field4257[var25])) {
                                        if (var11.field4293 == null || class665.field9027 >= var11.field4293[var25]) {
                                            byte var26 = var11.field4285[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class307.field3884.method1592((byte) -120, 86) && !class307.field3884.method1592((byte) -120, 82) && !class307.field3884.method1592((byte) -120, 81)) && ((var26 & 0x2) == 0 || class307.field3884.method1592((byte) -120, 86)) && ((var26 & 0x1) == 0 || class307.field3884.method1592((byte) -120, 82)) && ((var26 & 0x4) == 0 || class307.field3884.method1592((byte) -120, 81))) {
                                                if (var25 < 10) {
                                                    class345.method1991(-1, "", 31281, var25 + 1, var11.field4172);
                                                } else if (var25 == 10) {
                                                    class167.method1012(112);
                                                    class357 var27 = method1693(var11);
                                                    class136.method872(var11, 0, var27.method2042(-122), var27.field4602);
                                                    class467.field5794 = class687.method3798(var11, 0);
                                                    if (class467.field5794 == null) {
                                                        class467.field5794 = "Null";
                                                    }
                                                    class351.field4540 = var11.field4272 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field4251[var25];
                                                if (var11.field4293 == null) {
                                                    var11.field4293 = new int[var11.field4257.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field4293[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field4293[var25] = class665.field9027 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field4293 != null) {
                                        var11.field4293[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class522.method2822(var11, var24.method851(-1160828951) - var13, 65535, var24.method860(true) - var12);
                            }
                            if (class338.field4324 != null && class338.field4324 != var11 && var21 && method1693(var11).method2043(120)) {
                                class528.field6660 = var11;
                            }
                            if (class85.field1089 == var11) {
                                class46.field621 = true;
                                class689.field9562 = var12;
                                class420.field5352 = var13;
                            }
                            if (var11.field4276 || var11.field4298 != 0) {
                                if (var21 && class278.field3538 != 0 && var11.field4187 != null) {
                                    class402 var29 = new class402();
                                    var29.field5164 = true;
                                    var29.field5154 = var11;
                                    var29.field5159 = class278.field3538;
                                    var29.field5153 = var11.field4187;
                                    class144.field1743.method1904(var29, -85);
                                }
                                if (class338.field4324 != null || class367.field4752 || class513.field6458 != var11.field4298 && class336.field4145 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field4298 != 0) {
                                    if (class710.field9928 == var11.field4298 || class583.field7835 == var11.field4298) {
                                        class228.field2952 = var11;
                                        if (class613.field8337 != null) {
                                            class613.field8337.method792(0, class309.field3898, var11.field4211);
                                        }
                                        if (class710.field9928 == var11.field4298) {
                                            if (!class367.field4752 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class186.method1105(arg9, arg8, class309.field3898, (byte) -108);
                                                for (class341 var30 = (class341) class163.field1920.method1715((byte) 127); var30 != null; var30 = (class341) class163.field1920.method1712((byte) 127)) {
                                                    if (arg8 >= var30.field4351 && arg8 < var30.field4347 && arg9 >= var30.field4349 && arg9 < var30.field4352) {
                                                        class29.method183(65);
                                                        class278.method1678(var30.field4350, (byte) 84);
                                                    }
                                                }
                                            }
                                            class628.method3508(var11, var13, -1354365800, var12);
                                            continue;
                                        }
                                    }
                                    if (class323.field4030 == var11.field4298) {
                                        if (var11.method1927(class309.field3898, -121) == null || class666.field9038 != 0 && class666.field9038 != 3 || class367.field4752 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field4283[var32];
                                        if (var31 < var33 || var31 > var11.field4261[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field4309 / 2;
                                        int var35 = var32 - var11.field4211 / 2;
                                        int var36;
                                        if (class385.field4946 == 4) {
                                            var36 = (int) class689.field9561 & 0x3FFF;
                                        } else {
                                            var36 = (int) class689.field9561 + class290.field3661 & 0x3FFF;
                                        }
                                        int var37 = class243.field3129[var36];
                                        int var38 = class243.field3128[var36];
                                        if (class385.field4946 != 4) {
                                            var37 = (class352.field4559 + 256) * var37 >> 8;
                                            var38 = (class352.field4559 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 14;
                                        int var40 = var35 * var38 - var34 * var37 >> 14;
                                        int var41;
                                        int var42;
                                        if (class385.field4946 == 4) {
                                            var41 = (class702.field9824 >> 9) + (var39 >> 2);
                                            var42 = (class576.field7580 >> 9) - (var40 >> 2);
                                        } else {
                                            int var43 = (class67.field815.method210(false) - 1) * 256;
                                            var41 = (class67.field815.field8018 - var43 >> 9) + (var39 >> 2);
                                            var42 = (class67.field815.field8011 - var43 >> 9) - (var40 >> 2);
                                        }
                                        if (class37.field542 && (class458.field5709 & 0x40) != 0) {
                                            class337 var44 = class680.method3758(true, class168.field1978, class112.field1383);
                                            if (var44 == null) {
                                                class167.method1012(124);
                                            } else {
                                                class688.method3802(false, true, var11.field4252, 45, 0, class467.field5794, 1L, " ->", var42, class7.field74, var41);
                                            }
                                            continue;
                                        }
                                        if (class341.field4353 == class237.field3061) {
                                            class688.method3802(false, true, -1, 8, 0, class671.field9141.method3726((byte) 64, class71.field912), 1L, "", var42, -1, var41);
                                        }
                                        class688.method3802(false, true, -1, 9, 0, class691.field9587, 1L, "", var42, class151.field1802, var41);
                                        continue;
                                    }
                                    if (class513.field6458 == var11.field4298) {
                                        class578.field7767 = var11;
                                        if (var21) {
                                            class669.field9070 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method860(true) - var12 - var11.field4309 / 2) * 2.0D / (double) class604.field8113);
                                            int var46 = (int) (-((double) (var24.method851(-1160828951) - var13 - var11.field4211 / 2) * 2.0D / (double) class604.field8113));
                                            int var47 = class227.field2939 + var45 + class604.field8128;
                                            int var48 = class537.field6759 + var46 + class604.field8140;
                                            class474 var49 = class303.method1799(false);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method2570((byte) -35, var47, var48, var50);
                                            if (var50 != null) {
                                                if (class307.field3884.method1592((byte) -120, 82) && class146.field1745 > 0) {
                                                    class667.method3709(63, var50[0], var50[2], var50[1]);
                                                    continue;
                                                }
                                                class500.field6239 = true;
                                                class387.field4958 = var50[0];
                                                class466.field5776 = var50[1];
                                                class243.field3148 = var50[2];
                                            }
                                            class336.field4145 = 1;
                                            class296.field3781 = false;
                                            class250.field3230 = class113.field1423.method1074((byte) -7);
                                            class410.field5265 = class113.field1423.method1078((byte) 124);
                                            continue;
                                        }
                                        if (var22 && class336.field4145 > 0) {
                                            if (class336.field4145 == 1 && (class250.field3230 != class113.field1423.method1074((byte) 122) || class410.field5265 != class113.field1423.method1078((byte) 122))) {
                                                class628.field8530 = class227.field2939;
                                                class232.field3015 = class537.field6759;
                                                class336.field4145 = 2;
                                            }
                                            if (class336.field4145 == 2) {
                                                class296.field3781 = true;
                                                class688.method3805(false, class628.field8530 + (int) ((double) (class250.field3230 - class113.field1423.method1074((byte) -123)) * 2.0D / (double) class604.field8111));
                                                class480.method2624(class232.field3015 - (int) ((double) (class410.field5265 - class113.field1423.method1078((byte) 112)) * 2.0D / (double) class604.field8111), -126);
                                            }
                                            continue;
                                        }
                                        if (class336.field4145 > 0 && !class296.field3781) {
                                            if ((class175.field2061 == 1 || class681.method3766(-5)) && class638.field8648 > 2) {
                                                class477.method2608(class410.field5265, (byte) 99, class250.field3230);
                                            } else if (class42.method262(-51)) {
                                                class477.method2608(class410.field5265, (byte) 80, class250.field3230);
                                            }
                                        }
                                        class336.field4145 = 0;
                                        continue;
                                    }
                                    if (class682.field9282 == var11.field4298) {
                                        if (var22) {
                                            class614.method3434(class113.field1423.method1074((byte) -102) - var12, var11.field4309, var11.field4211, -32508, class113.field1423.method1078((byte) 118) - var13);
                                        }
                                        continue;
                                    }
                                    if (class438.field5517 == var11.field4298) {
                                        class221.method1267((byte) 97, var11, var12, var13);
                                        continue;
                                    }
                                }
                                if (!var11.field4286 && var23) {
                                    var11.field4286 = true;
                                    if (var11.field4254 != null) {
                                        class402 var51 = new class402();
                                        var51.field5164 = true;
                                        var51.field5154 = var11;
                                        var51.field5158 = var24.method860(true) - var12;
                                        var51.field5159 = var24.method851(-1160828951) - var13;
                                        var51.field5153 = var11.field4254;
                                        class144.field1743.method1904(var51, -102);
                                    }
                                }
                                if (var11.field4286 && var22 && var11.field4290 != null) {
                                    class402 var52 = new class402();
                                    var52.field5164 = true;
                                    var52.field5154 = var11;
                                    var52.field5158 = class113.field1423.method1074((byte) 127) - var12;
                                    var52.field5159 = class113.field1423.method1078((byte) 126) - var13;
                                    var52.field5153 = var11.field4290;
                                    class144.field1743.method1904(var52, -113);
                                }
                                if (var11.field4286 && !var22) {
                                    var11.field4286 = false;
                                    if (var11.field4151 != null) {
                                        class402 var53 = new class402();
                                        var53.field5164 = true;
                                        var53.field5154 = var11;
                                        var53.field5158 = class113.field1423.method1074((byte) -24) - var12;
                                        var53.field5159 = class113.field1423.method1078((byte) 119) - var13;
                                        var53.field5153 = var11.field4151;
                                        class692.field9589.method1904(var53, -44);
                                    }
                                }
                                if (var22 && var11.field4228 != null) {
                                    class402 var54 = new class402();
                                    var54.field5164 = true;
                                    var54.field5154 = var11;
                                    var54.field5158 = class113.field1423.method1074((byte) 127) - var12;
                                    var54.field5159 = class113.field1423.method1078((byte) 112) - var13;
                                    var54.field5153 = var11.field4228;
                                    class144.field1743.method1904(var54, -25);
                                }
                                if (!var11.field4289 && var21) {
                                    var11.field4289 = true;
                                    if (var11.field4189 != null) {
                                        class402 var55 = new class402();
                                        var55.field5164 = true;
                                        var55.field5154 = var11;
                                        var55.field5158 = class113.field1423.method1074((byte) -15) - var12;
                                        var55.field5159 = class113.field1423.method1078((byte) 127) - var13;
                                        var55.field5153 = var11.field4189;
                                        class144.field1743.method1904(var55, -10);
                                    }
                                }
                                if (var11.field4289 && var21 && var11.field4204 != null) {
                                    class402 var56 = new class402();
                                    var56.field5164 = true;
                                    var56.field5154 = var11;
                                    var56.field5158 = class113.field1423.method1074((byte) -36) - var12;
                                    var56.field5159 = class113.field1423.method1078((byte) 123) - var13;
                                    var56.field5153 = var11.field4204;
                                    class144.field1743.method1904(var56, -51);
                                }
                                if (var11.field4289 && !var21) {
                                    var11.field4289 = false;
                                    if (var11.field4234 != null) {
                                        class402 var57 = new class402();
                                        var57.field5164 = true;
                                        var57.field5154 = var11;
                                        var57.field5158 = class113.field1423.method1074((byte) 122) - var12;
                                        var57.field5159 = class113.field1423.method1078((byte) 119) - var13;
                                        var57.field5153 = var11.field4234;
                                        class692.field9589.method1904(var57, -126);
                                    }
                                }
                                if (var11.field4240 != null) {
                                    class402 var58 = new class402();
                                    var58.field5154 = var11;
                                    var58.field5153 = var11.field4240;
                                    class315.field3946.method1904(var58, -126);
                                }
                                if (var11.field4230 != null && class51.field651 > var11.field4199) {
                                    if (var11.field4295 == null || class51.field651 - var11.field4199 > 32) {
                                        class402 var63 = new class402();
                                        var63.field5154 = var11;
                                        var63.field5153 = var11.field4230;
                                        class144.field1743.method1904(var63, -21);
                                    } else {
                                        label694: for (int var59 = var11.field4199; var59 < class51.field651; var59++) {
                                            int var60 = class301.field3834[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field4295.length; var61++) {
                                                if (var11.field4295[var61] == var60) {
                                                    class402 var62 = new class402();
                                                    var62.field5154 = var11;
                                                    var62.field5153 = var11.field4230;
                                                    class144.field1743.method1904(var62, -15);
                                                    break label694;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4199 = class51.field651;
                                }
                                if (var11.field4169 != null && class183.field2155 > var11.field4191) {
                                    if (var11.field4291 == null || class183.field2155 - var11.field4191 > 32) {
                                        class402 var68 = new class402();
                                        var68.field5154 = var11;
                                        var68.field5153 = var11.field4169;
                                        class144.field1743.method1904(var68, -125);
                                    } else {
                                        label670: for (int var64 = var11.field4191; var64 < class183.field2155; var64++) {
                                            int var65 = class161.field1892[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field4291.length; var66++) {
                                                if (var11.field4291[var66] == var65) {
                                                    class402 var67 = new class402();
                                                    var67.field5154 = var11;
                                                    var67.field5153 = var11.field4169;
                                                    class144.field1743.method1904(var67, -33);
                                                    break label670;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4191 = class183.field2155;
                                }
                                if (var11.field4205 != null && class175.field2050 > var11.field4279) {
                                    if (var11.field4304 == null || class175.field2050 - var11.field4279 > 32) {
                                        class402 var73 = new class402();
                                        var73.field5154 = var11;
                                        var73.field5153 = var11.field4205;
                                        class144.field1743.method1904(var73, -106);
                                    } else {
                                        label646: for (int var69 = var11.field4279; var69 < class175.field2050; var69++) {
                                            int var70 = class33.field517[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field4304.length; var71++) {
                                                if (var11.field4304[var71] == var70) {
                                                    class402 var72 = new class402();
                                                    var72.field5154 = var11;
                                                    var72.field5153 = var11.field4205;
                                                    class144.field1743.method1904(var72, -53);
                                                    break label646;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4279 = class175.field2050;
                                }
                                if (var11.field4206 != null && class175.field2063 > var11.field4197) {
                                    if (var11.field4278 == null || class175.field2063 - var11.field4197 > 32) {
                                        class402 var78 = new class402();
                                        var78.field5154 = var11;
                                        var78.field5153 = var11.field4206;
                                        class144.field1743.method1904(var78, -11);
                                    } else {
                                        label622: for (int var74 = var11.field4197; var74 < class175.field2063; var74++) {
                                            int var75 = class561.field7023[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field4278.length; var76++) {
                                                if (var11.field4278[var76] == var75) {
                                                    class402 var77 = new class402();
                                                    var77.field5154 = var11;
                                                    var77.field5153 = var11.field4206;
                                                    class144.field1743.method1904(var77, -9);
                                                    break label622;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4197 = class175.field2063;
                                }
                                if (var11.field4170 != null && class267.field3377 > var11.field4255) {
                                    if (var11.field4292 == null || class267.field3377 - var11.field4255 > 32) {
                                        class402 var83 = new class402();
                                        var83.field5154 = var11;
                                        var83.field5153 = var11.field4170;
                                        class144.field1743.method1904(var83, -63);
                                    } else {
                                        label598: for (int var79 = var11.field4255; var79 < class267.field3377; var79++) {
                                            int var80 = class484.field6019[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field4292.length; var81++) {
                                                if (var11.field4292[var81] == var80) {
                                                    class402 var82 = new class402();
                                                    var82.field5154 = var11;
                                                    var82.field5153 = var11.field4170;
                                                    class144.field1743.method1904(var82, -25);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4255 = class267.field3377;
                                }
                                if (class242.field3119 > var11.field4311 && var11.field4209 != null) {
                                    class402 var84 = new class402();
                                    var84.field5154 = var11;
                                    var84.field5153 = var11.field4209;
                                    class144.field1743.method1904(var84, -59);
                                }
                                if (class78.field1019 > var11.field4311 && var11.field4296 != null) {
                                    class402 var85 = new class402();
                                    var85.field5154 = var11;
                                    var85.field5153 = var11.field4296;
                                    class144.field1743.method1904(var85, -86);
                                }
                                if (class182.field2140 > var11.field4311 && var11.field4183 != null) {
                                    class402 var86 = new class402();
                                    var86.field5154 = var11;
                                    var86.field5153 = var11.field4183;
                                    class144.field1743.method1904(var86, -28);
                                }
                                if (class441.field5539 > var11.field4311 && var11.field4307 != null) {
                                    class402 var87 = new class402();
                                    var87.field5154 = var11;
                                    var87.field5153 = var11.field4307;
                                    class144.field1743.method1904(var87, -53);
                                }
                                if (class278.field3536 > var11.field4311 && var11.field4247 != null) {
                                    class402 var88 = new class402();
                                    var88.field5154 = var11;
                                    var88.field5153 = var11.field4247;
                                    class144.field1743.method1904(var88, -127);
                                }
                                var11.field4311 = class696.field9643;
                                if (var11.field4180 != null) {
                                    for (int var89 = 0; var89 < class142.field1725; var89++) {
                                        class402 var90 = new class402();
                                        var90.field5154 = var11;
                                        var90.field5155 = class184.field2162[var89].method731((byte) -96);
                                        var90.field5157 = class184.field2162[var89].method730(13610);
                                        var90.field5153 = var11.field4180;
                                        class144.field1743.method1904(var90, -94);
                                    }
                                }
                                if (class324.field4048 && var11.field4216 != null) {
                                    class402 var91 = new class402();
                                    var91.field5154 = var11;
                                    var91.field5153 = var11.field4216;
                                    class144.field1743.method1904(var91, -100);
                                }
                            }
                            if (var11.field4212 == 5 && var11.field4267 != -1) {
                                var11.method1941((byte) -24, class671.field9178, class7.field77).method792(0, class309.field3898, var11.field4211);
                            }
                            class325.method1874(-2060, var11);
                            if (var11.field4212 == 0) {
                                method1694(arg0, var11.field4172, var14, var15, var16, var17, var12 - var11.field4300, var13 - var11.field4208, arg8, arg9);
                                if (var11.field4179 != null) {
                                    method1694(var11.field4179, var11.field4172, var14, var15, var16, var17, var12 - var11.field4300, var13 - var11.field4208, arg8, arg9);
                                }
                                class293 var92 = (class293) class216.field2530.method3828((long) var11.field4172, (byte) -91);
                                if (var92 != null) {
                                    if (class540.field6812 == class341.field4353 && var92.field3729 == 0 && !class367.field4752 && var21 && !class373.field4819) {
                                        class29.method183(65);
                                    }
                                    class205.method1189(var12, var15, var14, var17, var13, var92.field3727, arg9, var16, arg8, -1);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class325.method1874(-2060, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/lang/String;")
    public final String method1204(int arg0) {
        field3572++;
        String var2 = null;
        try {
            var2 = "[1)" + class227.field2938 + "," + class522.field6612 + "," + class85.field1090 + "," + class656.field8932 + "|";
            if (class67.field815 != null) {
                var2 = var2 + "2)" + class675.field9219 + "," + (class67.field815.field508[0] + class227.field2938) + "," + (class67.field815.field511[0] + class522.field6612) + "|";
            }
            var2 = var2 + "3)" + class628.field8526 + "|4)" + class611.field8310.field8721 + "|5)" + class207.method1211(3) + "|6)" + class309.field3890 + "," + class491.field6129 + "|";
            var2 = var2 + "7)" + class611.field8310.method3593(class628.field8526, (byte) -96) + "|";
            var2 = var2 + "8)" + class611.field8310.method3598(-15929, class628.field8526) + "|";
            var2 = var2 + "9)" + class611.field8310.field8698 + "|";
            var2 = var2 + "10)" + class611.field8310.field8685 + "|";
            var2 = var2 + "11)" + class611.field8310.field8703 + "|";
            var2 = var2 + "12)" + class611.field8310.method2744(class628.field8526, 4) + "|";
            var2 = var2 + "13)" + class357.field4610 + "|";
            var2 = var2 + "14)" + class470.field5804;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class628.field8526 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field3580 == null ? (field3580 = method1707("client")) : field3580).getClassLoader());
                    for (int var8 = 0; var8 < var7.size(); var8++) {
                        try {
                            Object var9 = var7.elementAt(var8);
                            Field var10 = var9.getClass().getDeclaredField("name");
                            var6.invoke(var10, Boolean.TRUE);
                            try {
                                String var11 = (String) var10.get(var9);
                                if (var11 != null && var11.indexOf("sw3d.dll") != -1) {
                                    Field var12 = var9.getClass().getDeclaredField("handle");
                                    var6.invoke(var12, Boolean.TRUE);
                                    var2 = var2 + "|16)" + Long.toHexString(var12.getLong(var9));
                                    var6.invoke(var12, Boolean.FALSE);
                                }
                            } catch (Throwable var13) {
                            }
                            var6.invoke(var10, Boolean.FALSE);
                        } catch (Throwable var14) {
                        }
                    }
                }
            } catch (Throwable var16) {
            }
            var2 = var2 + "]";
            if (arg0 != 992) {
                field3568 = 32;
            }
        } catch (Throwable var17) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1695(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3567++;
        if (class409.method2299((byte) -56, arg1)) {
            if (arg2 != -28691) {
                method1699(76);
            }
            class133.method866(arg0, arg3, arg4, -85, class325.field4062[arg1], -1);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1696() {
        int var0 = class149.field1788;
        int[] var1 = class95.field1239;
        boolean var2 = class611.field8310.field8718 == 1 && var0 > 200 || class611.field8310.field8718 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class365 var13 = class132.field1601[var1[var3]];
            if (var13.method2127((byte) -108)) {
                var13.method226(2);
                if (var13.field8017 >= 0 && var13.field8014 >= 0 && var13.field8005 < class85.field1090 && var13.field8008 < class656.field8932) {
                    var13.field4701 = var13.field488 ? var2 : false;
                    if (class67.field815 == var13) {
                        var13.field476 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field446) {
                            var14++;
                        }
                        if (var13.field434 > class665.field9027) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method210(false) << 2);
                        if (var13.field4697) {
                            var15 += 512;
                        } else {
                            if (class525.field6638 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field476 = var15 + 1;
                    }
                } else {
                    var13.field476 = -1;
                }
            } else {
                var13.field476 = -1;
            }
        }
        for (int var4 = 0; var4 < class99.field1276; var4++) {
            class506 var10 = ((class704) class168.field1973.method3828((long) class352.field4562[var4], (byte) -91)).field9854;
            if (var10.method2762((byte) -99) && var10.field6326.method3816(-1, class327.field4084)) {
                var10.method226(74);
                if (var10.field8017 >= 0 && var10.field8014 >= 0 && var10.field8005 < class85.field1090 && var10.field8008 < class656.field8932) {
                    int var11 = 0;
                    if (!var10.field446) {
                        var11++;
                    }
                    if (var10.field434 > class665.field9027) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method210(false) << 2);
                    if (class525.field6638 == 0) {
                        if (var10.field6326.field9529) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class525.field6638 == 1) {
                        if (var10.field6326.field9529) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field6326.field9499) {
                        var12 += 1024;
                    } else if (!var10.field6326.field9509) {
                        var12 += 256;
                    }
                    var10.field476 = var12 + 1;
                } else {
                    var10.field476 = -1;
                }
            } else {
                var10.field476 = -1;
            }
        }
        for (int var5 = 0; var5 < class565.field7071.length; var5++) {
            class26 var6 = class565.field7071[var5];
            if (var6 != null) {
                if (var6.field301 == 1) {
                    class704 var7 = (class704) class168.field1973.method3828((long) var6.field300, (byte) -91);
                    if (var7 != null) {
                        class506 var8 = var7.field9854;
                        if (var8.field476 >= 0) {
                            var8.field476 += 2048;
                        }
                    }
                } else if (var6.field301 == 10) {
                    class365 var9 = class132.field1601[var6.field300];
                    if (var9 != null && class67.field815 != var9 && var9.field476 >= 0) {
                        var9.field476 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    private final void method1697(boolean arg0) {
        if (class470.field5804 == 7 && class583.field7833 == 0) {
            if (class675.field9221 > 1) {
                class278.field3536 = class696.field9643;
                class675.field9221--;
            }
            if (!class367.field4752) {
                class29.method183(65);
            }
            for (int var2 = 0; var2 < 100 && class510.method2778((byte) -42); var2++) {
            }
        }
        field3563++;
        class231.field3008++;
        class628.method3508(null, -1, -1354365800, -1);
        class221.method1267((byte) -112, null, -1, -1);
        class97.method717(-124);
        class696.field9643++;
        for (int var3 = 0; var3 < class215.field2516; var3++) {
            class506 var4 = class140.field1687[var3].field9854;
            if (var4 != null) {
                byte var5 = var4.field6326.field9490;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method210(false);
                    if ((var5 & 0x2) != 0 && var4.field503 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field508[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (class85.field1090 - var6 - 1 < var9) {
                                var9 = class85.field1090 - var6 - 1;
                            }
                            int var10 = var4.field511[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > (class656.field8932 - var6 - 1)) {
                                var10 = class656.field8932 - var6 - 1;
                            }
                            int var11 = class510.method2783(true, var4.field511[0], class634.field8601[var4.field8010], -1, 0, var6, var4.field508[0], var10, var9, var6, class20.field211, 0, var6, -90, class703.field9846);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field508[var12] = class20.field211[var11 - var12 - 1];
                                    var4.field511[var12] = class703.field9846[var11 - var12 - 1];
                                    var4.field505[var12] = 1;
                                }
                                var4.field503 = var11;
                            }
                        }
                    }
                    class382.method2197(true, var4, true);
                    int var13 = class667.method3708(var4, (byte) 87);
                    class62.method509(var13, class318.field3987, class174.field2037, 0, var4);
                    class696.method3848(var4, class174.field2037, 0);
                    class488.method2653(var4, 121);
                }
            }
        }
        if (class583.field7833 == 0 && class303.field3848 == 0) {
            if (class385.field4946 == 2) {
                class561.method2984(-4);
            } else {
                class257.method1535(64);
            }
            if (class238.field3071 >> 9 < 14 || (class85.field1090 - 14) <= (class238.field3071 >> 9) || class710.field9924 >> 9 < 14 || (class710.field9924 >> 9) >= (class656.field8932 - 14)) {
                class668.method3712((byte) 80);
            }
        }
        while (true) {
            class402 var14;
            class337 var15;
            class337 var16;
            do {
                var14 = (class402) class315.field3946.method1906(67);
                if (var14 == null) {
                    while (true) {
                        class402 var17;
                        class337 var18;
                        class337 var19;
                        do {
                            var17 = (class402) class692.field9589.method1906(126);
                            if (var17 == null) {
                                while (true) {
                                    class402 var20;
                                    class337 var21;
                                    class337 var22;
                                    do {
                                        var20 = (class402) class144.field1743.method1906(109);
                                        if (var20 == null) {
                                            if (class338.field4324 != null) {
                                                class66.method523(false);
                                            }
                                            if (class665.field9027 % 1500 == 0) {
                                                class618.method3445(-5942);
                                            }
                                            if (class470.field5804 == 7 && class583.field7833 == 0) {
                                                class560.method2977(-25195);
                                            }
                                            class627.method3499((byte) 102);
                                            if (class290.field3668 && class321.method1854(-58) - 60000L > class141.field1689) {
                                                class81.method616(10522);
                                            }
                                            if (!arg0) {
                                                method1692();
                                            }
                                            for (class500 var23 = (class500) class207.field2432.method1715((byte) 125); var23 != null; var23 = (class500) class207.field2432.method1712((byte) 127)) {
                                                if ((class321.method1854(-30) / 1000L - 5L) > ((long) var23.field6237)) {
                                                    if (var23.field6233 > 0) {
                                                        class417.method2324("", "", "", var23.field6236 + class671.field9133.method3726((byte) 63, class71.field912), 0, (byte) -95, 5);
                                                    }
                                                    if (var23.field6233 == 0) {
                                                        class417.method2324("", "", "", var23.field6236 + class671.field9134.method3726((byte) 104, class71.field912), 0, (byte) -95, 5);
                                                    }
                                                    var23.method1619((byte) -93);
                                                }
                                            }
                                            if (class470.field5804 == 7 && class583.field7833 == 0) {
                                                if (class335.field4139 == null) {
                                                    class349.method2010(false, true);
                                                    return;
                                                }
                                                class299.field3800++;
                                                if (class299.field3800 > 50) {
                                                    class491.field6131++;
                                                    class124 var24 = class336.method1924(class289.field3653, class636.field8620, (byte) -46);
                                                    class197.method1156((byte) 116, var24);
                                                }
                                                try {
                                                    class605.method3355(85);
                                                    return;
                                                } catch (IOException var25) {
                                                    class349.method2010(false, true);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field5154;
                                        if (var21.field4310 < 0) {
                                            break;
                                        }
                                        var22 = class442.method2421(var21.field4190, 101);
                                    } while (var22 == null || var22.field4179 == null || var21.field4310 >= var22.field4179.length || var22.field4179[var21.field4310] != var21);
                                    class620.method3450(var20);
                                }
                            }
                            var18 = var17.field5154;
                            if (var18.field4310 < 0) {
                                break;
                            }
                            var19 = class442.method2421(var18.field4190, 98);
                        } while (var19 == null || var19.field4179 == null || var18.field4310 >= var19.field4179.length || var19.field4179[var18.field4310] != var18);
                        class620.method3450(var17);
                    }
                }
                var15 = var14.field5154;
                if (var15.field4310 < 0) {
                    break;
                }
                var16 = class442.method2421(var15.field4190, 54);
            } while (var16 == null || var16.field4179 == null || var16.field4179.length <= var15.field4310 || var16.field4179[var15.field4310] != var15);
            class620.method3450(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1698(int arg0) {
        field3579++;
        if (class470.field5804 == 14) {
            return;
        }
        class665.field9027++;
        if ((class665.field9027 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class455.field5686 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class653.field8907.setSeed((long) class455.field5686);
        }
        if ((class665.field9027 % 50) == 0) {
            class645.field8745 = class169.field1984;
            class169.field1984 = 0;
            class539.field6803 = class505.field6315;
            class505.field6315 = 0;
        }
        this.method1703(60000);
        if (class186.field2195 != null) {
            class186.field2195.method675(-43);
        }
        class520.method2818(arg0 ^ 0x5141);
        class307.field3884.method1591(arg0 ^ 0xFFFFAE86);
        class113.field1423.method1069(arg0 + 20919);
        if (class309.field3898 != null) {
            class309.field3898.method354((int) class321.method1854(-57));
        }
        class385.method2210((byte) -54);
        class142.field1725 = 0;
        class372.field4803 = 0;
        for (class521 var3 = class307.field3884.method1593(7); var3 != null; var3 = class307.field3884.method1593(7)) {
            int var6 = var3.method733(-117);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method730(13610);
                if (class365.method2125((byte) -128) && (var7 == '`' || var7 == '§')) {
                    if (class635.method3558(arg0 - 2624)) {
                        class549.method2934((byte) 26);
                    } else {
                        class510.method2780(-102);
                    }
                } else if (class142.field1725 < 128) {
                    class184.field2162[class142.field1725] = var3;
                    class142.field1725++;
                }
            } else if (var6 == 0 && class372.field4803 < 75) {
                class389.field4991[class372.field4803] = var3;
                class372.field4803++;
            }
        }
        class278.field3538 = 0;
        if (arg0 != -20794) {
            this.method1703(-37);
        }
        for (class132 var4 = class113.field1423.method1079(arg0 + 40987); var4 != null; var4 = class113.field1423.method1079(20193)) {
            int var5 = var4.method855((byte) -72);
            if (var5 == -1) {
                class445.field5595.method1904(var4, arg0 + 20773);
            } else if (var5 == 6) {
                class278.field3538 += var4.method861((byte) -101);
            } else if (class154.method946((byte) -117, var5)) {
                class500.field6235.method1904(var4, arg0 ^ 0x512D);
                if (class500.field6235.method1912(16) > 10) {
                    class500.field6235.method1906(67);
                }
            }
        }
        if (class635.method3558(arg0 ^ 0xA40)) {
            class314.method1837(103);
        }
        if (class398.method2252(class470.field5804, arg0 ^ 0xFFFFAEC4)) {
            class95.method711(100);
            class422.method2337(-28508);
        } else if (class291.method1749(class470.field5804, (byte) 67)) {
            class458.method2521((byte) 126);
        }
        if (class35.method233((byte) -77, class470.field5804) && !class291.method1749(class470.field5804, (byte) -124)) {
            this.method1697(true);
            class681.method3762((byte) 118);
            class345.method1967(99);
        } else if (class411.method2307(class470.field5804, arg0 + 20802) && !class291.method1749(class470.field5804, (byte) -102)) {
            this.method1697(true);
            class345.method1967(arg0 ^ 0x5166);
        } else if (class470.field5804 == 12) {
            class345.method1967(-102);
        } else if (class671.method3724(class470.field5804, 12) && !class291.method1749(class470.field5804, (byte) 11)) {
            class313.method1835(-24172);
        } else if (class470.field5804 == 13) {
            class345.method1967(arg0 + 20697);
            if (class55.field708 != -3 && class55.field708 != 2 && class55.field708 != 15) {
                class349.method2010(false, true);
            }
        }
        class539.method2894(class309.field3898, -1);
        class500.field6235.method1906(55);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static final void method1699(int arg0) {
        int var1 = class149.field1788;
        int[] var2 = class95.field1239;
        int var3 = class363.field4646 ? var1 : class99.field1276 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class32 var5;
            if (var4 < var1) {
                var5 = class132.field1601[var2[var4]];
            } else {
                var5 = ((class704) class168.field1973.method3828((long) class352.field4562[var4 - var1], (byte) -91)).field9854;
            }
            if (var5.field8010 == arg0) {
                var5.field475 = 0;
                if (var5.field476 < 0) {
                    var5.field446 = false;
                } else {
                    int var6 = var5.method210(false);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field8018 & 0x1FF) != 0 || (var5.field8011 & 0x1FF) != 0) {
                            var5.field446 = false;
                            continue;
                        }
                    } else if ((var5.field8018 & 0x1FF) != 256 || (var5.field8011 & 0x1FF) != 256) {
                        var5.field446 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field8018 >> 9;
                        int var8 = var5.field8011 >> 9;
                        if (class701.field9813[var7][var8] != var5.field476) {
                            var5.field446 = true;
                            continue;
                        }
                        if (class372.field4799[var7][var8] > 1) {
                            var10002 = class372.field4799[var7][var8]--;
                            var5.field446 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field8018 - var9 >> 9;
                        int var11 = var5.field8011 - var9 >> 9;
                        int var12 = var5.field8018 + var9 >> 9;
                        int var13 = var5.field8011 + var9 >> 9;
                        if (!class50.method293(true, var5.field476, var13, var12, var11, var10)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class701.field9813[var14][var15] == var5.field476) {
                                        var10002 = class372.field4799[var14][var15]--;
                                    }
                                }
                            }
                            var5.field446 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class365 && var5.field507 != null && class665.field9027 >= var5.field507.field8153 && class665.field9027 < var5.field507.field8146) {
                        ((class365) var5).field4701 = false;
                    }
                    var5.field446 = false;
                    var5.field8013 = class514.method2798(var5.field8011, var5.field8018, var5.field8010, (byte) 34);
                    class223.method1332(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method1700(byte arg0) {
        field3576++;
        if (arg0 < 54 || class470.field5804 == 14) {
            return;
        }
        long var2 = class415.method2313((byte) 95) / 1000000L - class80.field1039;
        class80.field1039 = class415.method2313((byte) 85) / 1000000L;
        boolean var4 = class293.method1770((byte) 107);
        if (var4 && class89.field1160 && class506.field6334 != null) {
            class506.field6334.method1758(119);
        }
        if (class534.method2878(9415, class470.field5804)) {
            if (class510.field6386 != 0L && class510.field6386 < class321.method1854(-89)) {
                class645.method3607(false, class207.method1211(3), class611.field8310.field8706, class611.field8310.field8690, (byte) -127);
            } else if (!class309.field3898.method404() && class268.field3389) {
                class582.method3233(true);
            }
        }
        if (class90.field1174 == null) {
            Container var5;
            if (class338.field4326 != null) {
                var5 = class338.field4326;
            } else if (class95.field1241 == null) {
                var5 = class699.field9680;
            } else {
                var5 = class95.field1241;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class338.field4326 == var5) {
                Insets var8 = class338.field4326.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class578.field7765 != var6 || class200.field2327 != var7 || class36.field537) {
                if (class309.field3898 == null || class309.field3898.method466()) {
                    class627.method3500(true);
                } else {
                    class200.field2327 = var7;
                    class578.field7765 = var6;
                }
                class510.field6386 = class321.method1854(-27) + 500L;
                class36.field537 = false;
            }
        }
        if (class90.field1174 != null && !class205.field2372 && class534.method2878(9415, class470.field5804)) {
            class645.method3607(false, class611.field8310.field8697, -1, -1, (byte) -127);
        }
        boolean var9 = false;
        if (class118.field1468) {
            var9 = true;
            class118.field1468 = false;
        }
        if (var9) {
            class215.method1251(109);
        }
        if (class309.field3898 != null && class309.field3898.method404() || class207.method1211(3) != 1) {
            class377.method2172(100);
        }
        if (class398.method2252(class470.field5804, 2)) {
            class290.method1743((byte) -106, var9);
        } else if (class38.method248(class470.field5804, (byte) 107)) {
            class151.method940(0);
        } else if (class705.method3893((byte) -45, class470.field5804)) {
            class151.method940(0);
        } else if (class291.method1749(class470.field5804, (byte) 101)) {
            if (class343.field4370 == 1) {
                if (class596.field7993 < class592.field7948) {
                    class596.field7993 = class592.field7948;
                }
                int var11 = (class596.field7993 - class592.field7948) * 50 / class596.field7993;
                class340.method1951(class671.field9126.method3726((byte) 45, class71.field912) + "<br>(" + var11 + "%)", class321.field3994, -126, class616.field8348, class309.field3898, true);
            } else if (class343.field4370 == 2) {
                if (class40.field577 > class313.field3931) {
                    class313.field3931 = class40.field577;
                }
                int var10 = (class313.field3931 - class40.field577) * 50 / class313.field3931 + 50;
                class340.method1951(class671.field9126.method3726((byte) 113, class71.field912) + "<br>(" + var10 + "%)", class321.field3994, -102, class616.field8348, class309.field3898, true);
            } else {
                class340.method1951(class671.field9126.method3726((byte) 100, class71.field912), class321.field3994, -110, class616.field8348, class309.field3898, true);
            }
        } else if (class470.field5804 == 10) {
            class499.method2720(16764, var2);
        } else if (class470.field5804 == 13) {
            class340.method1951(class671.field9128.method3726((byte) 105, class71.field912) + "<br>" + class671.field9129.method3726((byte) 88, class71.field912), class321.field3994, -103, class616.field8348, class309.field3898, true);
        }
        if (class252.field3241 == 3) {
            for (int var12 = 0; var12 < class211.field2489; var12++) {
                Rectangle var13 = class68.field824[var12];
                if (class33.field516[var12]) {
                    class309.field3898.method3630((byte) -112, var13.width, var13.y, var13.x, -1996553985, var13.height);
                } else if (class128.field1559[var12]) {
                    class309.field3898.method3630((byte) 47, var13.width, var13.y, var13.x, -1996554240, var13.height);
                }
            }
        }
        if (class635.method3558(-23418)) {
            class159.method982(class309.field3898, (byte) -122);
        }
        if (class386.field4955.field5925 && class534.method2878(9415, class470.field5804) && class252.field3241 == 0 && class207.method1211(3) == 1 && !var9) {
            int var16 = 0;
            for (int var17 = 0; var17 < class211.field2489; var17++) {
                if (class128.field1559[var17]) {
                    class128.field1559[var17] = false;
                    class380.field4873[var16++] = class68.field824[var17];
                }
            }
            try {
                class309.field3898.method345(class380.field4873, var16);
            } catch (class202 var18) {
            }
        } else if (!class398.method2252(class470.field5804, 2)) {
            for (int var14 = 0; var14 < class211.field2489; var14++) {
                class128.field1559[var14] = false;
            }
            try {
                class309.field3898.method318();
            } catch (class202 var19) {
                class564.method2994((byte) 34, var19.getMessage() + " (Recovered) " + this.method1204(992), var19);
                class364.method2114(0, 96);
            }
        }
        if (class611.field8310.field8677 == 0) {
            class700.method3867(29279, 15L);
        } else if (class611.field8310.field8677 == 1) {
            class700.method3867(29279, 10L);
        } else if (class611.field8310.field8677 == 2) {
            class700.method3867(29279, 5L);
        } else if (class611.field8310.field8677 == 3) {
            class700.method3867(29279, 2L);
        }
        if (class117.field1452) {
            class178.method1058((byte) 104);
        }
        if (class611.field8310.field8713 && class470.field5804 == 3 && class305.field3866 != -1) {
            class611.field8310.field8713 = false;
            class611.field8310.method2749(class386.field4955, -92);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method1200(int arg0) {
        if (class290.field3668) {
            class81.method616(10522);
        }
        field3573++;
        class228.method1376(arg0 ^ 0xFFFFB39E);
        if (class309.field3898 != null) {
            class309.field3898.method3623((byte) -112);
        }
        if (class90.field1174 != null) {
            class78.method606(class386.field4955, (byte) -101, class90.field1174);
            class90.field1174 = null;
        }
        if (class335.field4139 != null) {
            class335.field4139.method2511((byte) 82);
            class335.field4139 = null;
        }
        class93.method689(0);
        class167.field1965.method695((byte) 0);
        class688.field9477.method1845(arg0 ^ 0xFFFFFFDE);
        if (class124.field1518 != null) {
            class124.field1518.method737(true);
            class124.field1518 = null;
        }
        try {
            class20.field223.method647((byte) 30);
            if (arg0 == -36) {
                for (int var2 = 0; var2 < 35; var2++) {
                    class432.field5456[var2].method647((byte) 30);
                }
                class638.field8643.method647((byte) 30);
                class509.field6374.method647((byte) 30);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method1203(boolean arg0) {
        field3578++;
        if (class628.field8526 == 2) {
            try {
                this.method1700((byte) 100);
            } catch (ThreadDeath var4) {
                throw var4;
            } catch (Throwable var5) {
                class564.method2994((byte) 34, var5.getMessage() + " (Recovered) " + this.method1204(992), var5);
                class364.method2114(0, 126);
            }
        } else {
            this.method1700((byte) 95);
        }
        if (arg0) {
            method1702(null);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class487.method2651(true, "Argument count");
            }
            class373.field4810 = new class234();
            class373.field4810.field3030 = Integer.parseInt(arg0[0]);
            class194.field2293 = new class234();
            class194.field2293.field3030 = Integer.parseInt(arg0[1]);
            class349.field4478 = new class234();
            class349.field4478.field3030 = Integer.parseInt(arg0[2]);
            class257.field3292 = class235.field3043;
            if (arg0[3].equals("live")) {
                class689.field9558 = class250.field3229;
            } else if (arg0[3].equals("rc")) {
                class689.field9558 = class165.field1941;
            } else if (arg0[3].equals("wip")) {
                class689.field9558 = class663.field9010;
            } else {
                class487.method2651(true, "modewhat");
            }
            class71.field912 = class292.method1767(false, arg0[4]);
            if (class71.field912 == -1) {
                if (arg0[4].equals("english")) {
                    class71.field912 = 0;
                } else if (arg0[4].equals("german")) {
                    class71.field912 = 1;
                } else {
                    class487.method2651(true, "language");
                }
            }
            class361.field4630 = false;
            class180.field2123 = false;
            if (arg0[5].equals("game0")) {
                class341.field4353 = class540.field6812;
            } else if (arg0[5].equals("game1")) {
                class341.field4353 = class237.field3061;
            } else {
                class487.method2651(true, "game");
            }
            class583.field7832 = 0;
            class192.field2274 = 0L;
            class135.field1641 = false;
            class122.field1487 = "";
            class74.field988 = 0;
            class26.field310 = false;
            class367.field4736 = true;
            class700.field9795 = true;
            class594.field7969 = 0;
            class130.field1573 = class341.field4353.field8728;
            class109.field1356 = null;
            client var1 = new client();
            class455.field5687 = var1;
            var1.method1205(class341.field4353.field8727, 1024, (byte) -87, 768, false, 616, 35, class689.field9558.method839(true) + 32);
            class338.field4326.setLocation(40, 40);
        } catch (Exception var3) {
            class564.method2994((byte) 34, null, var3);
        }
        field3569++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method1196(int arg0) {
        if (class135.field1641) {
            class357.field4610 = 64;
        }
        field3566++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class627.method3500(true);
        class688.field9477 = new class318(class386.field4955);
        class167.field1965 = new class94();
        class196.method1149(0, new int[] { 1000, 100 }, new int[] { 20, 260 });
        if (class257.field3292 != class255.field3277) {
            class238.field3075 = new byte[50][];
        }
        class611.field8310 = new class503(class386.field4955);
        if (class257.field3292 == class255.field3277) {
            class373.field4810.field3035 = this.getCodeBase().getHost();
        } else if (class276.method1673(true, class257.field3292)) {
            class373.field4810.field3035 = this.getCodeBase().getHost();
            class373.field4810.field3031 = class373.field4810.field3030 + 40000;
            class194.field2293.field3031 = class194.field2293.field3030 + 40000;
            class373.field4810.field3037 = class373.field4810.field3030 + 50000;
            class349.field4478.field3031 = class349.field4478.field3030 + 40000;
            class194.field2293.field3037 = class194.field2293.field3030 + 50000;
            class349.field4478.field3037 = class349.field4478.field3030 + 50000;
        } else if (class257.field3292 == class235.field3043) {
            class373.field4810.field3035 = "127.0.0.1";
            class194.field2293.field3035 = "127.0.0.1";
            class349.field4478.field3035 = "127.0.0.1";
            class373.field4810.field3031 = class373.field4810.field3030 + 40000;
            class194.field2293.field3031 = class194.field2293.field3030 + 40000;
            class373.field4810.field3037 = class373.field4810.field3030 + 50000;
            class349.field4478.field3031 = class349.field4478.field3030 + 40000;
            class194.field2293.field3037 = class194.field2293.field3030 + 50000;
            class349.field4478.field3037 = class349.field4478.field3030 + 50000;
        }
        class360.field4628 = class373.field4810;
        if (class540.field6812 == class341.field4353) {
            class47.field634 = false;
        }
        if (class341.field4353 == class237.field3061) {
            class51.field654 = class307.field3886;
            class540.field6821 = class424.field5377;
            class225.field2914 = 0;
            class272.field3438 = true;
            class35.field524 = 16777215;
        } else {
            class540.field6821 = class170.field1996;
            class51.field654 = class324.field4046;
        }
        class694.field9629 = class435.field5481 = class15.field146 = class395.field5028 = new short[256];
        class307.field3884 = class113.method780(class472.field5828, (byte) 11);
        class113.field1423 = class539.method2895(arg0 - 14133, true, class472.field5828);
        try {
            if (class386.field4955.field5917 != null) {
                class20.field223 = new class86(class386.field4955.field5917, 5200, 0);
                for (int var3 = 0; var3 < 35; var3++) {
                    class432.field5456[var3] = new class86(class386.field4955.field5912[var3], 6000, 0);
                }
                class638.field8643 = new class86(class386.field4955.field5903, 6000, 0);
                class657.field8935 = new class237(255, class20.field223, class638.field8643, 500000);
                class509.field6374 = new class86(class386.field4955.field5922, 24, 0);
                class386.field4955.field5922 = null;
                class386.field4955.field5903 = null;
                class386.field4955.field5912 = null;
                class386.field4955.field5917 = null;
            }
        } catch (IOException var4) {
            class657.field8935 = null;
            class509.field6374 = null;
            class20.field223 = null;
            class638.field8643 = null;
        }
        if (class257.field3292 != class255.field3277) {
            class684.field9354 = true;
        }
        if (arg0 != 64) {
            method1691(-86);
        }
        if (class540.field6812 == class341.field4353) {
            class85.field1085 = class671.field9112.method3726((byte) 35, class71.field912);
        } else if (class341.field4353 == class237.field3061) {
            class85.field1085 = class671.field9113.method3726((byte) 104, class71.field912);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field3577++;
        if (!this.method1193(-128)) {
            return;
        }
        class373.field4810 = new class234();
        class373.field4810.field3030 = Integer.parseInt(this.getParameter("worldid"));
        class194.field2293 = new class234();
        class194.field2293.field3030 = Integer.parseInt(this.getParameter("lobbyid"));
        class194.field2293.field3035 = this.getParameter("lobbyaddress");
        class349.field4478 = new class234();
        class349.field4478.field3030 = Integer.parseInt(this.getParameter("demoid"));
        class349.field4478.field3035 = this.getParameter("demoaddress");
        class257.field3292 = class517.method2805(Integer.parseInt(this.getParameter("modewhere")), 0);
        if (class257.field3292 == class235.field3043) {
            class257.field3292 = class295.field3761;
        } else if (!class276.method1673(true, class257.field3292) && class257.field3292 != class255.field3277) {
            class257.field3292 = class255.field3277;
        }
        class689.field9558 = class697.method3851(Integer.parseInt(this.getParameter("modewhat")), (byte) -56);
        if (class689.field9558 != class663.field9010 && class689.field9558 != class165.field1941 && class689.field9558 != class250.field3229) {
            class689.field9558 = class250.field3229;
        }
        try {
            class71.field912 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class71.field912 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class361.field4630 = true;
        } else {
            class361.field4630 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class180.field2123 = true;
        } else {
            class180.field2123 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class385.field4948 = true;
        } else {
            class385.field4948 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class341.field4353 = class540.field6812;
            } else if (var4.equals("1")) {
                class341.field4353 = class237.field3061;
            }
        }
        try {
            class594.field7969 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class594.field7969 = 0;
        }
        class99.field1281 = this.getParameter("quiturl");
        class122.field1487 = this.getParameter("settings");
        if (class122.field1487 == null) {
            class122.field1487 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class583.field7832 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class583.field7832 = 0;
            }
        }
        class130.field1573 = Integer.parseInt(this.getParameter("colourid"));
        if (class130.field1573 < 0 || class130.field1573 >= class3.field25.length) {
            class130.field1573 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class367.field4736 = true;
            class700.field9795 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class26.field310 = true;
        }
        class109.field1356 = this.getParameter("sskey");
        if (class109.field1356 != null && class109.field1356.length() < 2) {
            class109.field1356 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class135.field1641 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class74.field988 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class192.field2274 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        if (class540.field6812 == class341.field4353) {
            class696.field9640 = 765;
            class634.field8596 = 503;
        } else if (class341.field4353 == class237.field3061) {
            class634.field8596 = 480;
            class696.field9640 = 640;
        }
        class455.field5687 = this;
        this.method1192((byte) -82, class696.field9640, 35, class689.field9558.method839(true) + 32, 616, class634.field8596, class341.field4353.field8727);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method1701(int arg0, byte arg1) {
        int var3 = 38 / (-arg1 / 41);
        class167.field1965.field1222++;
        class401.field5149 = 0;
        class28.field324 = null;
        field3564++;
        class656.field8933 = null;
        class167.field1965.field1224 = arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lrr;)Z")
    public static final boolean method1702(class337 arg0) {
        if (class373.field4819) {
            if (method1693(arg0).field4604 != 0) {
                return false;
            }
            if (arg0.field4212 == 0) {
                return false;
            }
        }
        return arg0.field4185;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method1703(int arg0) {
        field3571++;
        boolean var2 = class167.field1965.method698(90);
        if (arg0 == 60000 && !var2) {
            this.method1705((byte) 109);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method1197(int arg0) {
        field3570++;
        class534.method2881((byte) 7);
        class243.method1458(73);
        class671.method3725(0);
        class420.method2329(arg0 - 10343);
        class545.method2918(27085);
        class110.method767(arg0 ^ 0xE4C);
        class350.method2015(768);
        class435.method2394((byte) -75);
        class188.method1117((byte) 1);
        class363.method2111(0);
        class456.method2503(-1);
        class694.method3837(21125);
        class206.method1206(127);
        class391.method2226((byte) 15);
        class492.method2669((byte) -5);
        class643.method3601(122);
        class396.method2242(8975);
        class650.method3625((byte) 39);
        class503.method2743(false);
        class26.method163(-1);
        class53.method309((byte) 94);
        class238.method1433(22814);
        class94.method697(-2);
        class90.method672(arg0 - 3715);
        class275.method1636((byte) 60);
        class237.method1431(-274254239);
        class208.method1217(-6675);
        class541.method2903(arg0 - 3617);
        class635.method3561(66);
        class640.method3591((byte) 114);
        class665.method3698(arg0 ^ 0xFFFFF1BD);
        class10.method48(6);
        class637.method3569((byte) -118);
        class95.method710(9875);
        class466.method2544(arg0 ^ 0xE42);
        class428.method2363(true);
        class17.method95(false);
        class164.method1003(true);
        class681.method3759((byte) 50);
        class273.method1623((byte) 88);
        class24.method154(-116);
        class193.method1136(64);
        class525.method2831(2048);
        class372.method2154(383);
        class128.method835((byte) 67);
        class360.method2096(14);
        class636.method3564(arg0 ^ 0xE02);
        class588.method3266((byte) 113);
        class704.method3887((byte) -1);
        class324.method1867(arg0 - 3643);
        class638.method3573(-109);
        class103.method741((byte) -9);
        class582.method3234(-1);
        class158.method976(-2097153);
        class586.method3256(12790);
        class474.method2571((byte) -110);
        class489.method2658(arg0 ^ 0xE3A);
        class117.method789((byte) -128);
        class337.method1930(0);
        class365.method2119(131072);
        class647.method3612((byte) -32);
        class189.method1125(-10);
        class327.method1882((byte) 80);
        class572.method3074(true);
        class124.method824((byte) -120);
        class32.method222((byte) 97);
        class565.method3004((byte) -122);
        class27.method167((byte) 69);
        class589.method3271(-4138);
        class40.method255(4);
        class506.method2760(118);
        class293.method1771(2199);
        class357.method2040((byte) 23);
        class47.method288(5);
        class289.method1737((byte) 32);
        class659.method3676(128);
        class165.method1011((byte) -91);
        class272.method1620(true);
        class255.method1532(-77);
        class634.method3555((byte) -108);
        class321.method1856((byte) 113);
        class1.method1((byte) -112);
        class277.method1675((byte) -85);
        class305.method1815(3072);
        class610.method3424(-13226);
        class234.method1416((byte) 99);
        class559.method2975(5);
        class39.method254(-19095);
        class444.method2438(true);
        class290.method1738(47);
        class612.method3427(66);
        class552.method2951(true);
        class642.method3595((byte) -33);
        class621.method3463((byte) -111);
        class81.method617((byte) -49);
        class207.method1208((byte) -97);
        class78.method608((byte) 94);
        class347.method2004(false);
        class662.method3685((byte) -123);
        class299.method1782(arg0 ^ arg0);
        class687.method3801(-39);
        class229.method1393(109090434);
        class180.method1067((byte) 80);
        class140.method886(108);
        class689.method3810((byte) -120);
        class68.method549(arg0 - 3752);
        class448.method2450(-1);
        class379.method2183((byte) 112);
        class202.method1181((byte) 37);
        class219.method1259(5);
        class37.method241(110);
        class20.method126(256);
        class228.method1377((byte) 120);
        class227.method1369(8);
        class76.method603(arg0 ^ 0xE2C);
        class345.method1968(arg0 ^ 0xFFFFF1E4);
        class292.method1761((byte) 2);
        class680.method3755((byte) 116);
        class175.method1048(arg0 ^ 0xE46);
        class618.method3448(false);
        class83.method635(7);
        class179.method1062(-2474);
        class692.method3822(-611);
        class479.method2618(16392);
        class614.method3432(-67);
        class520.method2816(false);
        class678.method3751((byte) -126);
        class514.method2800((byte) -64);
        class528.method2850(108);
        class204.method1186(9);
        class705.method3892(0);
        class667.method3710(true);
        class488.method2654((byte) -95);
        class523.method2829(arg0 - 13674);
        class604.method3344();
        class442.method2420(-9723);
        class340.method1952(true);
        class176.method1052((byte) 86);
        class131.method844(0);
        class599.method3298(62);
        class146.method910(0);
        class580.method3208(-26862);
        class597.method3295((byte) -125);
        class209.method1232(108);
        class686.method3782(-99);
        class595.method3288(36);
        class434.method2389(arg0 ^ 0xFFFFF1BD);
        class18.method104();
        class403.method2265(81);
        class15.method84(false);
        class682.method3773((byte) -126);
        class478.method2613(-11370);
        class392.method2230((byte) -127);
        class620.method3451();
        class590.method3274(22);
        class182.method1083(-2167);
        class79.method611(16123);
        class44.method273();
        class663.method3692(-46);
        class566.method3006((byte) -91);
        class354.method2030(116);
        class187.method1108(arg0 - 10802);
        class532.method2876((byte) 7);
        class661.method3684(arg0 ^ 0x4D48);
        class317.method1844((byte) -99);
        class156.method957(-15061);
        class418.method2325(2);
        class578.method3201(arg0 ^ 0xE41);
        class352.method2024(117);
        class660.method3679((byte) 29);
        class445.method2439(0);
        class539.method2896(arg0 ^ 0xE42);
        class436.method2397((byte) -128);
        class279.method1679((byte) -75);
        class440.method2416(0);
        class265.method1573();
        class556.method2958((byte) 98);
        class493.method2671(-123);
        class465.method2537(arg0 ^ 0xE6F);
        class264.method1568();
        class449.method2455(arg0 - 3541);
        class408.method2296(arg0 ^ 0xFFFFF1E8);
        class561.method2985(121);
        class261.method1562(arg0 ^ 0xE46);
        class36.method236(arg0 ^ 0xFFFFF190);
        class45.method275(arg0 ^ 0xE42);
        class112.method777(-22462);
        class494.method2677();
        class163.method998((byte) 74);
        class240.method1442((byte) -36);
        class197.method1155(-94);
        class505.method2755(arg0 ^ 0x4B8B);
        class253.method1528((byte) 88);
        class171.method1029(false);
        class666.method3706(1);
        class527.method2849((byte) 4);
        class329.method1884(false);
        class388.method2217(arg0 ^ 0xEBB);
        class424.method2338(31626);
        class99.method722((byte) 119);
        class438.method2407(3);
        class558.method2970(true);
        class401.method2261((byte) -94);
        class458.method2519(2);
        class380.method2185(-7563);
        class684.method3780((byte) 125);
        class374.method2164((byte) 49);
        class200.method1160((byte) 106);
        class69.method550((byte) 116);
        class33.method232(-14575);
        class677.method3749(-80);
        class341.method1953(arg0 ^ 0xE7C);
        class487.method2646(arg0 - 3546);
        class367.method2140((byte) 105);
        class190.method1126(0);
        class62.method508(false);
        class407.method2285(27323);
        class141.method887(arg0 ^ 0xFFFFF1BD);
        class211.method1239(-29800);
        class3.method9(0);
        class509.method2776(-94);
        class142.method898(true);
        class591.method3278(0);
        class710.method3906(arg0 ^ 0xE42);
        class657.method3666((byte) 123);
        class645.method3608((byte) -16);
        class269.method1598(arg0 - 3536);
        class564.method3002(arg0 ^ 0xE2E);
        class216.method1255(-15220);
        class334.method1917((byte) -53);
        class349.method2011(25122);
        class563.method2990(0);
        class410.method2305((byte) -90);
        class6.method21((byte) 126);
        class431.method2369(true);
        class406.method2283(-42);
        class268.method1589(arg0 - 3702);
        class276.method1671(arg0 + 19800);
        class398.method2251(10);
        class655.method3660((byte) 106);
        class60.method505(-6874);
        class152.method941((byte) 125);
        class381.method2190((byte) 118);
        class250.method1510(-10435);
        class706.method3900(arg0 ^ 0xFFFFE414);
        class252.method1522(-111);
        class404.method2273(31050);
        class607.method3377(true);
        class386.method2212(8);
        class395.method2238((byte) 107);
        class593.method3282((byte) 61);
        class664.method3696((byte) -81);
        class194.method1143(arg0 ^ 0xE43);
        class701.method3878(arg0 - 3642);
        class315.method1842(124);
        class29.method185(true);
        class658.method3675();
        class570.method3022(arg0 ^ 0xFFFFF1C3);
        class306.method1822(-2830);
        class225.method1364((byte) -40);
        class504.method2751((byte) 123);
        class157.method960((byte) -106);
        class669.method3714(0);
        class471.method2560(true);
        class522.method2823((byte) 68);
        class484.method2635(arg0 ^ 0xE42);
        class569.method3019(22260);
        class511.method2785((byte) 127);
        class322.method1857((byte) 31);
        class84.method636(85);
        class319.method1852(-18153);
        class654.method3658(-8422);
        class526.method2838(83);
        class256.method1534(false);
        class50.method294(arg0 - 3138);
        class546.method2922((byte) -105);
        class147.method914();
        class480.method2623(arg0 - 3522);
        class74.method595((byte) 1);
        class708.method3904();
        class649.method3620();
        class400.method2256(arg0 + 13563);
        class309.method1828(arg0 - 3743);
        class328.method1883();
        class377.method2175((byte) 13);
        class144.method906(arg0 ^ 0xE34);
        class644.method3604(arg0 ^ 0xFFFFF9B1);
        class214.method1247((byte) 68);
        class80.method615(117);
        class64.method510(12);
        class203.method1183(5);
        class251.method1513(-54);
        class376.method2171(51);
        class323.method1864(127);
        class690.method3819(-16145);
        class439.method2414((byte) 125);
        class639.method3588(true);
        class702.method3880(2);
        class111.method773(-1);
        class356.method2033((byte) 119);
        class409.method2297((byte) 19);
        class413.method2310((byte) 117);
        class271.method1618();
        class571.method3027(false);
        class82.method630(arg0 + 685903618);
        class469.method2557(55);
        class116.method787(0);
        class688.method3803((byte) 116);
        class537.method2893(-100);
        class46.method282(arg0 ^ 0xFFFFF1D8);
        class472.method2563((byte) -107);
        class364.method2116(1);
        class632.method3548(false);
        class432.method2373((byte) -124);
        class416.method2315(6032);
        class286.method1725((byte) -124);
        class455.method2500((byte) -118);
        class348.method2008(72);
        class683.method3776((byte) 109);
        class475.method2583(false);
        class576.method3189(-71);
        class42.method264(8);
        class447.method2444((byte) 75);
        class496.method2706((byte) 65);
        class353.method2028((byte) 124);
        class703.method3883(arg0 ^ 0x45DF);
        class14.method76(-98);
        class185.method1095(arg0 ^ 0xFFFFF1CE);
        class109.method759((byte) 126);
        class58.method498(0);
        class288.method1733(85);
        class113.method783(-83);
        class51.method297((byte) -118);
        class223.method1325((byte) -109);
        class133.method865(true);
        class100.method729(124);
        class161.method992(arg0 - 3778);
        class338.method1944((byte) -64);
        class98.method719((byte) -109);
        class375.method2168(-32181);
        class405.method2278(false);
        class139.method880((byte) 118);
        class242.method1447(false);
        class195.method1145(arg0 + 22786);
        class87.method659(arg0 ^ 0xE1B);
        class502.method2729((byte) -119);
        class304.method1813((byte) -118);
        class278.method1676(arg0 - 3744);
        class192.method1134(false);
        class617.method3441((byte) -104);
        class513.method2795(-71);
        class311.method1830((byte) 112);
        class560.method2976(true);
        class490.method2660();
        class151.method938(arg0 - 3771);
        class72.method566(6);
        class624.method3476(true);
        class394.method2235(arg0 - 3650);
        class518.method2810(14282);
        class85.method646(false);
        class245.method1472(42);
        class485.method2637((byte) 49);
        class540.method2900(0);
        class611.method3425(-128);
        class536.method2889(4096);
        class186.method1106(95);
        class22.method145(arg0 ^ 0xE31);
        class633.method3550(arg0 ^ 0xFFFFF1DE);
        class653.method3655(-77);
        class267.method1586(27954);
        class183.method1091(arg0 ^ 0xFFFFF1E4);
        class467.method2545(arg0 ^ 0xFFFFF1C8);
        class343.method1957((byte) 59);
        class167.method1017((byte) 50);
        class7.method25((byte) -45);
        class169.method1022((byte) -99);
        class220.method1261(-16233);
        class106.method747(arg0 - 3651);
        class16.method90(1);
        class136.method871(2);
        class184.method1093(2);
        class510.method2782((byte) -124);
        class177.method1053(true);
        class370.method2148(arg0 ^ 0xFFFFACB8);
        class596.method3292(0);
        class651.method3643();
        class162.method993(arg0 ^ 0xFFFFC196);
        class43.method267();
        class2.method4(-84);
        class461.method2532(-83);
        class280.method1685(false);
        class530.method2858(0);
        class512.method2789(65);
        class30.method188(-22943);
        class65.method522(206);
        class389.method2222(arg0 ^ 0xE42);
        class433.method2375(true);
        class477.method2607(arg0 ^ 0xFFFFF1BF);
        class38.method242(-114);
        class331.method1901(arg0 ^ 0xE46);
        class89.method670((byte) 36);
        class266.method1584(118);
        class336.method1923((byte) 93);
        class577.method3198((byte) -106);
        class257.method1537(arg0 - 3652);
        class93.method685(true);
        class631.method3543((byte) -92);
        class294.method1775((byte) -116);
        class373.method2161((byte) 35);
        class583.method3235(28559);
        class656.method3664(true);
        class482.method2628(-12);
        class691.method3820(arg0 ^ 0x7627);
        class25.method161(-4);
        class248.method1481(arg0 ^ 0xFFFF806E);
        class125.method826((byte) -104);
        class11.method51((byte) -110);
        class215.method1252(4658);
        class5.method14(2);
        class668.method3713(-1);
        class491.method2666(108);
        class608.method3381(false);
        class711.method3907(0);
        class287.method1726(-6830);
        class178.method1059((byte) -24);
        class67.method530(0);
        class670.method3722((byte) -99);
        class296.method1779((byte) 10);
        class422.method2336(-57);
        class382.method2199(105);
        class28.method170(15505);
        class587.method3258(23735);
        class19.method117(1121);
        class126.method829(27530);
        class222.method1269(102);
        class170.method1024((byte) -103);
        class555.method2956(82);
        class351.method2021((byte) -107);
        class325.method1873((byte) 110);
        class300.method1785(-105);
        class226.method1365((byte) 76);
        class236.method1424(30031);
        class550.method2941(true);
        class616.method3440((byte) 26);
        class674.method3739(114);
        class52.method300(false);
        class339.method1945(-10255);
        class397.method2249(101);
        class254.method1531(arg0 ^ 0x7FBC);
        class693.method3826((byte) 115);
        class594.method3285((byte) -119);
        class517.method2806((byte) 47);
        class697.method3852(4);
        class301.method1796(-126);
        class96.method712(arg0 ^ 0xE42);
        class531.method2867((byte) -80);
        class627.method3501(true);
        class500.method2724((byte) -93);
        class232.method1401(-126);
        class210.method1233(62);
        class132.method856(false);
        class307.method1823(arg0 - 35611);
        class371.method2151(0);
        class295.method1777(18946);
        class549.method2937((byte) 103);
        class102.method736(arg0 - 19002);
        class585.method3244(arg0 ^ 0xFFFFF1D7);
        class291.method1750(arg0 ^ 0xE18);
        class430.method2366(14);
        class71.method560(2);
        class235.method1419(false);
        class335.method1921((byte) 112);
        class160.method988(42);
        class77.method604(15046);
        class159.method985((byte) 12);
        class55.method399(arg0 ^ 0x40000E42);
        class92.method678(255);
        class221.method1264(-107);
        class497.method2709(95);
        class557.method2962((byte) -61);
        class8.method31(false);
        class168.method1019((byte) 109);
        class314.method1838((byte) -122);
        class122.method808((byte) -102);
        class239.method1441(19582);
        class613.method3431(arg0 ^ 0x3583CB8E);
        if (class206.field2409) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lrr;)Lrr;")
    public static final class337 method1704(class337 arg0) {
        int var1 = method1693(arg0).method2039((byte) -85);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class442.method2421(arg0.field4190, 103);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method1705(byte arg0) {
        field3574++;
        if (class167.field1965.field1222 > class688.field9478) {
            class360.field4628.method1410(35714);
            class523.field6621 = (class167.field1965.field1222 - 1) * 50 * 5;
            if (class523.field6621 > 3000) {
                class523.field6621 = 3000;
            }
            if (class167.field1965.field1222 >= 2 && class167.field1965.field1224 == 6) {
                this.method1191((byte) 91, "js5connect_outofdate");
                class470.field5804 = 14;
                return;
            }
            if (class167.field1965.field1222 >= 4 && class167.field1965.field1224 == -1) {
                this.method1191((byte) -95, "js5crc");
                class470.field5804 = 14;
                return;
            }
            if (class167.field1965.field1222 >= 4 && class398.method2252(class470.field5804, 2)) {
                if (class167.field1965.field1224 == 7 || class167.field1965.field1224 == 9) {
                    this.method1191((byte) 101, "js5connect_full");
                } else if (class167.field1965.field1224 <= 0) {
                    this.method1191((byte) 93, "js5io");
                } else if (class438.field5520 == null) {
                    this.method1191((byte) -56, "js5connect");
                } else {
                    this.method1191((byte) 73, "js5proxy_" + class438.field5520.trim());
                }
                class470.field5804 = 14;
                return;
            }
        }
        class688.field9478 = class167.field1965.field1222;
        if (class523.field6621 > 0) {
            class523.field6621--;
            return;
        }
        try {
            if (class401.field5149 == 0) {
                class656.field8933 = class360.field4628.method1409(class386.field4955, -8);
                class401.field5149++;
            }
            if (class401.field5149 == 1) {
                if (class656.field8933.field2546 == 2) {
                    if (class656.field8933.field2547 != null) {
                        class438.field5520 = (String) class656.field8933.field2547;
                    }
                    this.method1701(1000, (byte) 45);
                    return;
                }
                if (class656.field8933.field2546 == 1) {
                    class401.field5149++;
                }
            }
            if (class401.field5149 == 2) {
                class28.field324 = new class238((Socket) class656.field8933.field2547, class386.field4955);
                class572 var2 = new class572(5);
                var2.method3090(class295.field3747.field7095, 3);
                var2.method3061(616, (byte) 115);
                class28.field324.method1435(var2.field7318, 5, -125, 0);
                class401.field5149++;
                class296.field3791 = class321.method1854(-78);
            }
            if (arg0 < 37) {
                field3568 = 65;
            }
            if (class401.field5149 == 3) {
                if (class398.method2252(class470.field5804, 2) || class28.field324.method1436(0) > 0) {
                    int var3 = class28.field324.method1440((byte) 106);
                    if (var3 != 0) {
                        this.method1701(var3, (byte) -119);
                        return;
                    }
                    class401.field5149++;
                } else if ((class321.method1854(-22) - class296.field3791) > 30000L) {
                    this.method1701(1001, (byte) 105);
                    return;
                }
            }
            if (class401.field5149 == 4) {
                boolean var4 = class398.method2252(class470.field5804, 2) || class35.method233((byte) -77, class470.field5804) || class411.method2307(class470.field5804, 8);
                class350[] var5 = class350.method2019(15578);
                class572 var6 = new class572(var5.length * 4);
                class28.field324.method1434(-1, var6.field7318.length, var6.field7318, 0);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method2014(true, var6.method3064(-2031091464));
                }
                class167.field1965.method705(!var4, false, class28.field324);
                class656.field8933 = null;
                class401.field5149 = 0;
                class28.field324 = null;
            }
        } catch (IOException var8) {
            this.method1701(1002, (byte) 54);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1706() {
        for (int var0 = 0; var0 < class85.field1090; var0++) {
            int[] var1 = class701.field9813[var0];
            for (int var2 = 0; var2 < class656.field8932; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final synchronized void method1202(byte arg0) {
        field3565++;
        if (class95.field1241 != null && class472.field5828 == null) {
            try {
                Class var2 = class95.field1241.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class472.field5828 = (Canvas) var3.get(class95.field1241);
                var3.set(class95.field1241, null);
                if (class472.field5828 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method1202(arg0);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1707(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
