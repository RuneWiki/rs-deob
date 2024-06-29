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
public class client extends class417 {

    @OriginalMember(owner = "client!client", name = "C", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field4076;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Ljava/lang/Class;")
    public static Class field4075;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lvg;)Z")
    public static final boolean method1763(class49 arg0) {
        if (class681.field9611) {
            if (method1767(arg0).field1943 != 0) {
                return false;
            }
            if (arg0.field980 == 0) {
                return false;
            }
        }
        return arg0.field937;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lvg;IIIIIIIII)V")
    public static final void method1764(class49[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class49 var11 = arg0[var10];
            if (var11 != null && var11.field885 == arg1) {
                int var12 = var11.field957 + arg6;
                int var13 = var11.field920 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field980 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field967 + var12;
                    int var19 = var11.field877 + var13;
                    if (var11.field980 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field980 == 0 || var11.field952 || method1767(var11).field1943 != 0 || class461.field6646 == var11 || class224.field3153 == var11.field963 || class388.field5765 == var11.field963) {
                    if (!method1763(var11)) {
                        if (class648.field9107 == var11 && class1.method6((byte) -86, class648.field9107) != null) {
                            class372.field5312 = true;
                            class130.field1925 = var12;
                            class591.field8283 = var13;
                        }
                        if (var11.field984 || var14 < var16 && var15 < var17) {
                            if (var11.field899 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class14 var20 = (class14) class293.field4324.method472((byte) -100); var20 != null; var20 = (class14) class293.field4324.method482(125)) {
                                    if (var20.field119) {
                                        var20.method3678(-1);
                                        var20.field129.field1013 = false;
                                    }
                                }
                                if (class285.field4264 == 0) {
                                    class648.field9107 = null;
                                    class461.field6646 = null;
                                }
                                class83.field1375 = 0;
                                class688.field9686 = false;
                                class608.field8556 = false;
                                if (!class623.field8731) {
                                    class21.method262((byte) -8);
                                }
                            }
                            boolean var21;
                            if (class508.field7171.method2090(-7249) >= var14 && class508.field7171.method2093(22302) >= var15 && class508.field7171.method2090(-7249) < var16 && class508.field7171.method2093(22302) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class245.field3797 && var21) {
                                if (var11.field986 >= 0) {
                                    class190.field2750 = var11.field986;
                                } else if (var11.field899) {
                                    class190.field2750 = -1;
                                }
                            }
                            if (!class623.field8731 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class169.method1166(arg8 - var12, arg9 - var13, -102, var11);
                            }
                            boolean var22 = false;
                            if (class508.field7171.method2092(-124) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class356 var24 = (class356) class691.field9713.method472((byte) -33);
                            if (var24 != null && var24.method1030(124) == 0 && var24.method1031((byte) -109) >= var14 && var24.method1032((byte) 15) >= var15 && var24.method1031((byte) -126) < var16 && var24.method1032((byte) 15) < var17) {
                                var23 = true;
                            }
                            if (var11.field1019 != null && !class577.method3266((byte) -65)) {
                                for (int var25 = 0; var25 < var11.field1019.length; var25++) {
                                    if (class603.field8514.method1364(true, var11.field1019[var25])) {
                                        if (var11.field996 == null || class564.field7962 >= var11.field996[var25]) {
                                            byte var26 = var11.field904[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class603.field8514.method1364(true, 86) && !class603.field8514.method1364(true, 82) && !class603.field8514.method1364(true, 81)) && ((var26 & 0x2) == 0 || class603.field8514.method1364(true, 86)) && ((var26 & 0x1) == 0 || class603.field8514.method1364(true, 82)) && ((var26 & 0x4) == 0 || class603.field8514.method1364(true, 81))) {
                                                if (var25 < 10) {
                                                    class53.method585(var25 + 1, var11.field977, -1, -2, "");
                                                } else if (var25 == 10) {
                                                    class272.method1794(107);
                                                    class132 var27 = method1767(var11);
                                                    class431.method2573(0, var27.field1952, var27.method974(-2090995594), var11);
                                                    class331.field4896 = class372.method2247(-84, var11);
                                                    if (class331.field4896 == null) {
                                                        class331.field4896 = "Null";
                                                    }
                                                    class338.field4988 = var11.field928 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field890[var25];
                                                if (var11.field996 == null) {
                                                    var11.field996 = new int[var11.field1019.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field996[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field996[var25] = class564.field7962 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field996 != null) {
                                        var11.field996[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class647.method3590(var24.method1032((byte) 15) - var13, var11, (byte) -106, var24.method1031((byte) -36) - var12);
                            }
                            if (class648.field9107 != null && class648.field9107 != var11 && var21 && method1767(var11).method978((byte) -109)) {
                                class20.field231 = var11;
                            }
                            if (class461.field6646 == var11) {
                                class593.field8367 = true;
                                class644.field9058 = var12;
                                class527.field7429 = var13;
                            }
                            if (var11.field952 || var11.field963 != 0) {
                                if (var21 && class691.field9722 != 0 && var11.field982 != null) {
                                    class14 var29 = new class14();
                                    var29.field119 = true;
                                    var29.field129 = var11;
                                    var29.field125 = class691.field9722;
                                    var29.field122 = var11.field982;
                                    class293.field4324.method474(var29, 6);
                                }
                                if (class648.field9107 != null || class623.field8731 || class599.field8477 != var11.field963 && class83.field1375 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field963 != 0) {
                                    if (class235.field3642 == var11.field963 || class129.field1906 == var11.field963) {
                                        class575.field8091 = var11;
                                        if (class380.field5380 != null) {
                                            class380.field5380.method1023(true, var11.field877, class282.field4228);
                                        }
                                        if (class235.field3642 == var11.field963) {
                                            if (!class623.field8731 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class680.method3770(567050408, arg8, arg9, class282.field4228);
                                                for (class408 var30 = (class408) class590.field8270.method2417(false); var30 != null; var30 = (class408) class590.field8270.method2414(true)) {
                                                    if (arg8 >= var30.field5956 && arg8 < var30.field5960 && arg9 >= var30.field5962 && arg9 < var30.field5957) {
                                                        class21.method262((byte) -8);
                                                        class421.method2527((byte) -102, var30.field5959);
                                                    }
                                                }
                                            }
                                            class488.method2835(var11, var12, var13, (byte) -109);
                                            continue;
                                        }
                                    }
                                    if (class224.field3153 == var11.field963) {
                                        if (var11.method553(126, class282.field4228) == null || class581.field8187 != 0 && class581.field8187 != 3 || class623.field8731 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field863[var32];
                                        if (var31 < var33 || var31 > var11.field998[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field967 / 2;
                                        int var35 = var32 - var11.field877 / 2;
                                        int var36;
                                        if (class43.field700 == 4) {
                                            var36 = (int) class630.field8811 & 0x3FFF;
                                        } else {
                                            var36 = (int) class630.field8811 + class252.field3880 & 0x3FFF;
                                        }
                                        int var37 = class189.field2719[var36];
                                        int var38 = class189.field2721[var36];
                                        if (class43.field700 != 4) {
                                            var37 = (class287.field4280 + 256) * var37 >> 8;
                                            var38 = (class287.field4280 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 14;
                                        int var40 = var35 * var38 - var34 * var37 >> 14;
                                        int var41;
                                        int var42;
                                        if (class43.field700 == 4) {
                                            var41 = (class72.field1267 >> 9) + (var39 >> 2);
                                            var42 = (class124.field1866 >> 9) - (var40 >> 2);
                                        } else {
                                            int var43 = (class648.field9106.method2553((byte) 108) - 1) * 256;
                                            var41 = (class648.field9106.field3024 - var43 >> 9) + (var39 >> 2);
                                            var42 = (class648.field9106.field3029 - var43 >> 9) - (var40 >> 2);
                                        }
                                        if (class245.field3797 && (class435.field6357 & 0x40) != 0) {
                                            class49 var44 = class639.method3557(class19.field223, class189.field2716, 1);
                                            if (var44 == null) {
                                                class272.method1794(104);
                                            } else {
                                                class605.method3404(var41, " ->", var42, true, 10, var11.field1023, false, -23, class484.field6876, 1L, class331.field4896);
                                            }
                                            continue;
                                        }
                                        if (class673.field9519 == class586.field8208) {
                                            class605.method3404(var41, "", var42, true, 2, -1, false, -100, -1, 1L, class274.field4143.method1804(7175, class512.field7203));
                                        }
                                        class605.method3404(var41, "", var42, true, 48, -1, false, -35, class696.field9826, 1L, class264.field4011);
                                        continue;
                                    }
                                    if (class599.field8477 == var11.field963) {
                                        class382.field5392 = var11;
                                        if (var21) {
                                            class688.field9686 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method1031((byte) -88) - var12 - var11.field967 / 2) * 2.0D / (double) class25.field343);
                                            int var46 = (int) (-((double) (var24.method1032((byte) 15) - var13 - var11.field877 / 2) * 2.0D / (double) class25.field343));
                                            int var47 = class199.field2808 + var45 + class25.field365;
                                            int var48 = class671.field9481 + var46 + class25.field366;
                                            class326 var49 = class370.method2239((byte) -92);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method2051(var48, -1, var47, var50);
                                            if (var50 != null) {
                                                if (class603.field8514.method1364(true, 82) && class558.field7877 > 0) {
                                                    class85.method748((byte) 101, var50[1], var50[0], var50[2]);
                                                    continue;
                                                }
                                                class608.field8556 = true;
                                                class389.field5776 = var50[0];
                                                class249.field3866 = var50[1];
                                                class636.field8998 = var50[2];
                                            }
                                            class83.field1375 = 1;
                                            class669.field9451 = false;
                                            class60.field1143 = class508.field7171.method2090(-7249);
                                            class197.field2804 = class508.field7171.method2093(22302);
                                            continue;
                                        }
                                        if (var22 && class83.field1375 > 0) {
                                            if (class83.field1375 == 1 && (class60.field1143 != class508.field7171.method2090(-7249) || class197.field2804 != class508.field7171.method2093(22302))) {
                                                class573.field8066 = class199.field2808;
                                                class41.field686 = class671.field9481;
                                                class83.field1375 = 2;
                                            }
                                            if (class83.field1375 == 2) {
                                                class669.field9451 = true;
                                                class654.method3609(-64, class573.field8066 + (int) ((double) (class60.field1143 - class508.field7171.method2090(-7249)) * 2.0D / (double) class25.field341));
                                                class465.method2756((byte) 44, class41.field686 - (int) ((double) (class197.field2804 - class508.field7171.method2093(22302)) * 2.0D / (double) class25.field341));
                                            }
                                            continue;
                                        }
                                        if (class83.field1375 > 0 && !class669.field9451) {
                                            if ((class330.field4877 == 1 || class111.method863((byte) 57)) && class340.field5002 > 2) {
                                                class48.method493((byte) -120, class60.field1143, class197.field2804);
                                            } else if (class641.method3569(20844)) {
                                                class48.method493((byte) -120, class60.field1143, class197.field2804);
                                            }
                                        }
                                        class83.field1375 = 0;
                                        continue;
                                    }
                                    if (class108.field1666 == var11.field963) {
                                        if (var22) {
                                            class637.method3546(class508.field7171.method2090(-7249) - var12, class508.field7171.method2093(22302) - var13, var11.field967, var11.field877, -31579);
                                        }
                                        continue;
                                    }
                                    if (class388.field5765 == var11.field963) {
                                        class213.method1412(var12, 116, var11, var13);
                                        continue;
                                    }
                                }
                                if (!var11.field881 && var23) {
                                    var11.field881 = true;
                                    if (var11.field945 != null) {
                                        class14 var51 = new class14();
                                        var51.field119 = true;
                                        var51.field129 = var11;
                                        var51.field126 = var24.method1031((byte) -43) - var12;
                                        var51.field125 = var24.method1032((byte) 15) - var13;
                                        var51.field122 = var11.field945;
                                        class293.field4324.method474(var51, 6);
                                    }
                                }
                                if (var11.field881 && var22 && var11.field948 != null) {
                                    class14 var52 = new class14();
                                    var52.field119 = true;
                                    var52.field129 = var11;
                                    var52.field126 = class508.field7171.method2090(-7249) - var12;
                                    var52.field125 = class508.field7171.method2093(22302) - var13;
                                    var52.field122 = var11.field948;
                                    class293.field4324.method474(var52, 6);
                                }
                                if (var11.field881 && !var22) {
                                    var11.field881 = false;
                                    if (var11.field934 != null) {
                                        class14 var53 = new class14();
                                        var53.field119 = true;
                                        var53.field129 = var11;
                                        var53.field126 = class508.field7171.method2090(-7249) - var12;
                                        var53.field125 = class508.field7171.method2093(22302) - var13;
                                        var53.field122 = var11.field934;
                                        class475.field6773.method474(var53, 6);
                                    }
                                }
                                if (var22 && var11.field958 != null) {
                                    class14 var54 = new class14();
                                    var54.field119 = true;
                                    var54.field129 = var11;
                                    var54.field126 = class508.field7171.method2090(-7249) - var12;
                                    var54.field125 = class508.field7171.method2093(22302) - var13;
                                    var54.field122 = var11.field958;
                                    class293.field4324.method474(var54, 6);
                                }
                                if (!var11.field1013 && var21) {
                                    var11.field1013 = true;
                                    if (var11.field991 != null) {
                                        class14 var55 = new class14();
                                        var55.field119 = true;
                                        var55.field129 = var11;
                                        var55.field126 = class508.field7171.method2090(-7249) - var12;
                                        var55.field125 = class508.field7171.method2093(22302) - var13;
                                        var55.field122 = var11.field991;
                                        class293.field4324.method474(var55, 6);
                                    }
                                }
                                if (var11.field1013 && var21 && var11.field1010 != null) {
                                    class14 var56 = new class14();
                                    var56.field119 = true;
                                    var56.field129 = var11;
                                    var56.field126 = class508.field7171.method2090(-7249) - var12;
                                    var56.field125 = class508.field7171.method2093(22302) - var13;
                                    var56.field122 = var11.field1010;
                                    class293.field4324.method474(var56, 6);
                                }
                                if (var11.field1013 && !var21) {
                                    var11.field1013 = false;
                                    if (var11.field1018 != null) {
                                        class14 var57 = new class14();
                                        var57.field119 = true;
                                        var57.field129 = var11;
                                        var57.field126 = class508.field7171.method2090(-7249) - var12;
                                        var57.field125 = class508.field7171.method2093(22302) - var13;
                                        var57.field122 = var11.field1018;
                                        class475.field6773.method474(var57, 6);
                                    }
                                }
                                if (var11.field874 != null) {
                                    class14 var58 = new class14();
                                    var58.field129 = var11;
                                    var58.field122 = var11.field874;
                                    class467.field6719.method474(var58, 6);
                                }
                                if (var11.field976 != null && class64.field1199 > var11.field875) {
                                    if (var11.field878 == null || class64.field1199 - var11.field875 > 32) {
                                        class14 var63 = new class14();
                                        var63.field129 = var11;
                                        var63.field122 = var11.field976;
                                        class293.field4324.method474(var63, 6);
                                    } else {
                                        label696: for (int var59 = var11.field875; var59 < class64.field1199; var59++) {
                                            int var60 = class26.field389[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field878.length; var61++) {
                                                if (var11.field878[var61] == var60) {
                                                    class14 var62 = new class14();
                                                    var62.field129 = var11;
                                                    var62.field122 = var11.field976;
                                                    class293.field4324.method474(var62, 6);
                                                    break label696;
                                                }
                                            }
                                        }
                                    }
                                    var11.field875 = class64.field1199;
                                }
                                if (var11.field1000 != null && class147.field2159 > var11.field929) {
                                    if (var11.field1002 == null || class147.field2159 - var11.field929 > 32) {
                                        class14 var68 = new class14();
                                        var68.field129 = var11;
                                        var68.field122 = var11.field1000;
                                        class293.field4324.method474(var68, 6);
                                    } else {
                                        label672: for (int var64 = var11.field929; var64 < class147.field2159; var64++) {
                                            int var65 = class196.field2801[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field1002.length; var66++) {
                                                if (var11.field1002[var66] == var65) {
                                                    class14 var67 = new class14();
                                                    var67.field129 = var11;
                                                    var67.field122 = var11.field1000;
                                                    class293.field4324.method474(var67, 6);
                                                    break label672;
                                                }
                                            }
                                        }
                                    }
                                    var11.field929 = class147.field2159;
                                }
                                if (var11.field887 != null && class674.field9522 > var11.field922) {
                                    if (var11.field1005 == null || class674.field9522 - var11.field922 > 32) {
                                        class14 var73 = new class14();
                                        var73.field129 = var11;
                                        var73.field122 = var11.field887;
                                        class293.field4324.method474(var73, 6);
                                    } else {
                                        label648: for (int var69 = var11.field922; var69 < class674.field9522; var69++) {
                                            int var70 = class321.field4724[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field1005.length; var71++) {
                                                if (var11.field1005[var71] == var70) {
                                                    class14 var72 = new class14();
                                                    var72.field129 = var11;
                                                    var72.field122 = var11.field887;
                                                    class293.field4324.method474(var72, 6);
                                                    break label648;
                                                }
                                            }
                                        }
                                    }
                                    var11.field922 = class674.field9522;
                                }
                                if (var11.field892 != null && class216.field3035 > var11.field961) {
                                    if (var11.field1006 == null || class216.field3035 - var11.field961 > 32) {
                                        class14 var78 = new class14();
                                        var78.field129 = var11;
                                        var78.field122 = var11.field892;
                                        class293.field4324.method474(var78, 6);
                                    } else {
                                        label624: for (int var74 = var11.field961; var74 < class216.field3035; var74++) {
                                            int var75 = class632.field8837[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field1006.length; var76++) {
                                                if (var11.field1006[var76] == var75) {
                                                    class14 var77 = new class14();
                                                    var77.field129 = var11;
                                                    var77.field122 = var11.field892;
                                                    class293.field4324.method474(var77, 6);
                                                    break label624;
                                                }
                                            }
                                        }
                                    }
                                    var11.field961 = class216.field3035;
                                }
                                if (var11.field988 != null && class310.field4597 > var11.field883) {
                                    if (var11.field930 == null || class310.field4597 - var11.field883 > 32) {
                                        class14 var83 = new class14();
                                        var83.field129 = var11;
                                        var83.field122 = var11.field988;
                                        class293.field4324.method474(var83, 6);
                                    } else {
                                        label600: for (int var79 = var11.field883; var79 < class310.field4597; var79++) {
                                            int var80 = class520.field7328[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field930.length; var81++) {
                                                if (var11.field930[var81] == var80) {
                                                    class14 var82 = new class14();
                                                    var82.field129 = var11;
                                                    var82.field122 = var11.field988;
                                                    class293.field4324.method474(var82, 6);
                                                    break label600;
                                                }
                                            }
                                        }
                                    }
                                    var11.field883 = class310.field4597;
                                }
                                if (class52.field1043 > var11.field981 && var11.field947 != null) {
                                    class14 var84 = new class14();
                                    var84.field129 = var11;
                                    var84.field122 = var11.field947;
                                    class293.field4324.method474(var84, 6);
                                }
                                if (class264.field4013 > var11.field981 && var11.field884 != null) {
                                    class14 var85 = new class14();
                                    var85.field129 = var11;
                                    var85.field122 = var11.field884;
                                    class293.field4324.method474(var85, 6);
                                }
                                if (class594.field8401 > var11.field981 && var11.field973 != null) {
                                    class14 var86 = new class14();
                                    var86.field129 = var11;
                                    var86.field122 = var11.field973;
                                    class293.field4324.method474(var86, 6);
                                }
                                if (class681.field9608 > var11.field981 && var11.field1008 != null) {
                                    class14 var87 = new class14();
                                    var87.field129 = var11;
                                    var87.field122 = var11.field1008;
                                    class293.field4324.method474(var87, 6);
                                }
                                if (class24.field331 > var11.field981 && var11.field866 != null) {
                                    class14 var88 = new class14();
                                    var88.field129 = var11;
                                    var88.field122 = var11.field866;
                                    class293.field4324.method474(var88, 6);
                                }
                                var11.field981 = class363.field5184;
                                if (var11.field969 != null) {
                                    for (int var89 = 0; var89 < class32.field502; var89++) {
                                        class14 var90 = new class14();
                                        var90.field129 = var11;
                                        var90.field124 = class231.field3603[var89].method920((byte) -113);
                                        var90.field118 = class231.field3603[var89].method923(8348);
                                        var90.field122 = var11.field969;
                                        class293.field4324.method474(var90, 6);
                                    }
                                }
                                if (class173.field2465 && var11.field871 != null) {
                                    class14 var91 = new class14();
                                    var91.field129 = var11;
                                    var91.field122 = var11.field871;
                                    class293.field4324.method474(var91, 6);
                                }
                            }
                            if (var11.field980 == 5 && var11.field979 != -1) {
                                var11.method552(class177.field2526, class226.field3182, false).method1023(true, var11.field877, class282.field4228);
                            }
                            class434.method2582((byte) 14, var11);
                            if (var11.field980 == 0) {
                                method1764(arg0, var11.field977, var14, var15, var16, var17, var12 - var11.field909, var13 - var11.field891, arg8, arg9);
                                if (var11.field1014 != null) {
                                    method1764(var11.field1014, var11.field977, var14, var15, var16, var17, var12 - var11.field909, var13 - var11.field891, arg8, arg9);
                                }
                                class320 var92 = (class320) class654.field9178.method1405((long) var11.field977, (byte) -116);
                                if (var92 != null) {
                                    if (class689.field9693 == class586.field8208 && var92.field4704 == 0 && !class623.field8731 && var21 && !class681.field9611) {
                                        class21.method262((byte) -8);
                                    }
                                    class525.method3019(var12, var92.field4703, var15, var14, var17, var13, 122, arg9, var16, arg8);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class434.method2582((byte) 14, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field4067++;
        if (!this.method2514(1)) {
            return;
        }
        class352.field5077 = new class333();
        class352.field5077.field4938 = Integer.parseInt(this.getParameter("worldid"));
        class533.field7487 = new class333();
        class533.field7487.field4938 = Integer.parseInt(this.getParameter("lobbyid"));
        class533.field7487.field4948 = this.getParameter("lobbyaddress");
        class136.field1994 = new class333();
        class136.field1994.field4938 = Integer.parseInt(this.getParameter("demoid"));
        class136.field1994.field4948 = this.getParameter("demoaddress");
        class379.field5372 = class436.method2593(Integer.parseInt(this.getParameter("modewhere")), false);
        if (class379.field5372 == class160.field2306) {
            class379.field5372 = class667.field9412;
        } else if (!class632.method3516((byte) -72, class379.field5372) && class379.field5372 != class296.field4357) {
            class379.field5372 = class296.field4357;
        }
        class205.field2892 = class179.method1213(Integer.parseInt(this.getParameter("modewhat")), -112);
        if (class205.field2892 != class103.field1617 && class205.field2892 != class134.field1976 && class401.field5904 != class205.field2892) {
            class205.field2892 = class401.field5904;
        }
        try {
            class512.field7203 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class512.field7203 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class161.field2312 = true;
        } else {
            class161.field2312 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class273.field4108 = true;
        } else {
            class273.field4108 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class162.field2328 = true;
        } else {
            class162.field2328 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class586.field8208 = class689.field9693;
            } else if (var4.equals("1")) {
                class586.field8208 = class673.field9519;
            }
        }
        try {
            class40.field657 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class40.field657 = 0;
        }
        class28.field408 = this.getParameter("quiturl");
        class31.field483 = this.getParameter("settings");
        if (class31.field483 == null) {
            class31.field483 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class421.field6124 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class421.field6124 = 0;
            }
        }
        class340.field5001 = Integer.parseInt(this.getParameter("colourid"));
        if (class340.field5001 < 0 || class340.field5001 >= class64.field1209.length) {
            class340.field5001 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class206.field2906 = true;
            class149.field2169 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class145.field2122 = true;
        }
        class87.field1469 = this.getParameter("sskey");
        if (class87.field1469 != null && class87.field1469.length() < 2) {
            class87.field1469 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class544.field7663 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class143.field2113 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class254.field3901 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class493.field7018 = this.getParameter("additionalInfo");
        if (class493.field7018 != null && class493.field7018.length() > 50) {
            class493.field7018 = null;
        }
        if (class689.field9693 == class586.field8208) {
            class544.field7651 = 503;
            class245.field3815 = 765;
        } else if (class673.field9519 == class586.field8208) {
            class245.field3815 = 640;
            class544.field7651 = 480;
        }
        class565.field7967 = this;
        this.method2509(class245.field3815, class205.field2892.method2519(18) + 32, class586.field8208.field9737, 35, 618, 0, class544.field7651);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method1765(int arg0) {
        class555.method3147(-87);
        field4072++;
        class191.method1289((byte) 123);
        class274.method1803((byte) -118);
        class205.method1362((byte) -59);
        class424.method2541(-124);
        class407.method2466(true);
        class114.method893((byte) -66);
        class540.method3070(23);
        class323.method2033(1);
        class375.method2261((byte) 37);
        class665.method3677((byte) -66);
        class108.method853(arg0 ^ 0x15CF);
        class213.method1402((byte) -10);
        class158.method1103(19998);
        class418.method2521((byte) -2);
        class583.method3317((byte) -66);
        class693.method3808(-125);
        class391.method2405(arg0 ^ 0xFFFFFFB5);
        class166.method1153(1);
        class390.method2403((byte) -97);
        class263.method1726((byte) -29);
        class46.method473(arg0 ^ 0xFFFFFFF9);
        class393.method2421(arg0 ^ 0x78);
        class17.method98(-1763);
        class187.method1261(65536);
        class101.method823(2);
        class522.method2998((byte) 115);
        class421.method2534(~arg0);
        class691.method3803(false);
        class382.method2288(false);
        class200.method1331((byte) 56);
        class50.method574((byte) -99);
        class316.method1992((byte) 79);
        class290.method1853(arg0 ^ 0xFFFFDE3C);
        class141.method1020(124);
        class277.method1810(arg0 ^ 0xFFFFFFFE);
        class100.method809((byte) -110);
        class539.method3060(false);
        class33.method366(0);
        class638.method3548(26085);
        class112.method870(2);
        class344.method2136((byte) -115);
        class552.method3127(0);
        class409.method2471(34);
        class223.method1471((byte) -10);
        class518.method2956(-21968);
        class575.method3261(-46);
        class59.method630(arg0 + 126);
        class53.method583(-103);
        class553.method3138((byte) -127);
        class32.method360((byte) 110);
        class368.method2230(-17574);
        class129.method962(arg0 ^ 0xFFFFFFFC);
        class26.method313(-102);
        class664.method3670(0);
        class352.method2162(arg0 ^ 0x20);
        class674.method3751(false);
        class56.method612((byte) 122);
        class326.method2050(~arg0);
        class373.method2253(-12124);
        class491.method2847(5);
        class351.method2160(16082);
        class119.method913(false);
        class199.method1328(-87);
        class695.method3856(true);
        class135.method986(12853);
        class425.method2547(531);
        class40.method457((byte) -125);
        class264.method1737(false);
        class697.method3891(12078);
        class370.method2238(-2);
        class577.method3272(-5926);
        class132.method977(2416949);
        class547.method3094((byte) -45);
        class508.method2917((byte) 88);
        class89.method769((byte) -51);
        class595.method3366(1197785896);
        class600.method3394(true);
        class389.method2398((byte) 68);
        class490.method2841(0);
        class294.method1856(arg0 ^ 0xFFFFFF9A);
        class315.method1986((byte) 127);
        class178.method1207(16);
        class184.method1235(-30756);
        class333.method2099(-2);
        class295.method1859((byte) 88);
        class102.method828(30903);
        class383.method2294(false);
        class103.method832(arg0 ^ 0x7B66BC1E);
        class150.method1063(551);
        class273.method1800((byte) 104);
        class505.method2910((byte) 115);
        class98.method804(-125);
        class300.method1932((byte) -127);
        class55.method599(false);
        class297.method1921(7);
        class248.method1668((byte) -122);
        class363.method2204((byte) 112);
        class550.method3117((byte) -119);
        class461.method2711((byte) -52);
        class336.method2116((byte) 113);
        class37.method444(arg0 ^ 0xFFFF8145);
        class592.method3359(31578);
        class186.method1247((byte) 122);
        class416.method2503((byte) 96);
        class203.method1346((byte) 102);
        class617.method3424(0);
        class492.method2854(117);
        class146.method1041(-114);
        class499.method2885((byte) 54);
        class498.method2881((byte) 63);
        class366.method2218((byte) 81);
        class34.method377(0);
        class322.method2018(-15651);
        class578.method3284(arg0 + 1);
        class603.method3401(arg0 + 25657);
        class479.method2804(170);
        class161.method1111(6);
        class229.method1581(114);
        class298.method1926((byte) 96);
        class360.method2198(-25954);
        class321.method2007(~arg0);
        class371.method2242(false);
        class6.method36(-122);
        class519.method2964(false);
        class503.method2897(-75);
        class677.method3761(false);
        class270.method1758(-81);
        class443.method2625(arg0);
        class25.method298();
        class598.method3383(2929);
        class334.method2105(9);
        class230.method1589((byte) -33);
        class173.method1187(4);
        class188.method1269((byte) -89);
        class7.method41(-1269184308);
        class109.method856(52);
        class630.method3512(-105);
        class454.method2682(-89);
        class549.method3107(16777215);
        class548.method3097((byte) -28);
        class515.method2950((byte) 71);
        class29.method326();
        class87.method758(arg0 + 1);
        class641.method3571((byte) -113);
        class634.method3539((byte) 94);
        class66.method671((byte) -45);
        class496.method2870((byte) 9);
        class369.method2236((byte) -117);
        class220.method1446();
        class217.method1431(226890990);
        class666.method3687(true);
        class177.method1206((byte) 34);
        class627.method3498(12411);
        class324.method2039();
        class588.method3328(false);
        class475.method2787(127);
        class405.method2459((byte) 71);
        class83.method736((byte) 61);
        class14.method78((byte) -114);
        class27.method323((byte) -124);
        class189.method1272(-28);
        class36.method428((byte) -117);
        class562.method3209(arg0);
        class701.method3905((byte) -31);
        class423.method2538((byte) -76);
        class244.method1653(124);
        class106.method842(arg0 ^ 0xFFFFFFCD);
        class54.method590((byte) -86);
        class81.method734((byte) 49);
        class337.method2120();
        class568.method3234(-56);
        class77.method710(15147);
        class692.method3807((byte) -121);
        class43.method468((byte) 27);
        class365.method2217();
        class376.method2266((byte) 127);
        class255.method1702(83);
        class309.method1971(arg0 + 107);
        class535.method3043(false);
        class138.method997((byte) -89);
        class648.method3594(true);
        class28.method325(-1);
        class359.method2194();
        class94.method775(arg0 + 4);
        class99.method807(-1);
        class460.method2707((byte) 80);
        class444.method2632(84);
        class681.method3772((byte) 53);
        class563.method3213(-21058);
        class262.method1724(arg0);
        class282.method1831(-74);
        class493.method2860(arg0 ^ 0xFFFFB1EF);
        class473.method2780(true);
        class78.method720(1198);
        class542.method3073(arg0 ^ 0xD85833B7);
        class152.method1069(-1);
        class590.method3338(0);
        class157.method1092(false);
        class486.method2825(2116812800);
        class286.method1839((byte) 1);
        class52.method579(-114);
        class338.method2129(true);
        class145.method1033(-1684);
        class401.method2450(13503);
        class308.method1959((byte) 4);
        class513.method2939(125);
        class236.method1612((byte) -60);
        class313.method1981(10);
        class44.method470(-113);
        class310.method1974(false);
        class690.method3799(87);
        class239.method1632(0);
        class9.method53(arg0 ^ 0xFFFFFF85);
        class69.method678((byte) 108);
        class533.method3037((byte) 127);
        class564.method3221(2048);
        class15.method86((byte) -125);
        class172.method1178((byte) -40);
        class619.method3445(94);
        class42.method465(21801);
        class196.method1322(32);
        class703.method3918(126);
        class377.method2270(false);
        class374.method2255(-104);
        class240.method1642((byte) 49);
        class64.method660(-81);
        class455.method2683(arg0 + 1);
        class413.method2484((byte) -37);
        class266.method1744((byte) -95);
        class143.method1027(-121);
        class159.method1105((byte) 118);
        class329.method2068(false);
        class495.method2866((byte) -21);
        class660.method3656(15837);
        class327.method2059(arg0 - 16403);
        class130.method969(true);
        class197.method1323(32583);
        class75.method705(86);
        class441.method2612(0);
        class608.method3413(1);
        class115.method897(364);
        class586.method3319(1);
        class70.method681(-1);
        class13.method69();
        class167.method1158(1);
        class181.method1220(-87);
        class453.method2680(-17);
        class160.method1107((byte) 104);
        class472.method2775(true);
        class61.method643(-121);
        class221.method1455((byte) 11);
        class622.method3457((byte) 125);
        class176.method1196(false);
        class104.method836(true);
        class485.method2821((byte) -77);
        class394.method2427((byte) 65);
        class111.method864(-52);
        class500.method2891((byte) -128);
        class208.method1380(-119);
        class386.method2307((byte) -87);
        class380.method2274(49);
        class591.method3340(true);
        class676.method3758((byte) 73);
        class194.method1316();
        class72.method693((byte) 74);
        class63.method653();
        class670.method3713();
        class640.method3563(arg0 + 110);
        class527.method3022(19879);
        class246.method1659();
        class561.method3199(arg0 ^ 0x23);
        class440.method2608(arg0 + 4);
        class572.method3253((byte) 118);
        class60.method637(true);
        class466.method2759(60);
        class700.method3900(true);
        class278.method1817((byte) -110);
        class35.method418(95);
        class626.method3497((byte) 105);
        class581.method3314(0);
        class31.method352(-31483);
        class249.method1676((byte) 80);
        class311.method1975(121);
        class545.method3087((byte) -56);
        class224.method1480(2);
        class612.method3416((byte) -57);
        class325.method2047(arg0 - 90);
        class511.method2928(3);
        class411.method2481(arg0 ^ 0xA07);
        class464.method2730();
        class235.method1606((byte) 115);
        class120.method915(-48);
        class162.method1114(-120);
        class635.method3540(true);
        class566.method3224((byte) 98);
        class484.method2816(true);
        class521.method2972(124);
        class671.method3721(arg0 - 94);
        class571.method3251(-23234);
        class565.method3223((byte) 115);
        class668.method3699(true);
        class689.method3796(22089);
        class318.method1999(-1345);
        class293.method1855(arg0 ^ 0x160D);
        class385.method2299((byte) -2);
        class477.method2796(0);
        class412.method2483(-6909);
        class483.method2813((byte) -8);
        class140.method1016(-22872);
        class651.method3600(13);
        class228.method1558(-5819);
        class219.method1436((byte) -127);
        class307.method1954((byte) -93);
        class667.method3694((byte) -21);
        class601.method3396(0);
        class458.method2689(-1);
        class358.method2181((byte) -91);
        class123.method941(75);
        class139.method1010(-22201);
        class657.method3619((byte) 75);
        class673.method3729(false);
        class546.method3089((byte) -106);
        class633.method3526((byte) -108);
        class512.method2930(2);
        class231.method1591((byte) 110);
        class431.method2571(true);
        class342.method2134(97);
        class218.method1432(arg0 ^ 0x15CD);
        class234.method1602((byte) -100);
        class21.method257((byte) -87);
        class652.method3607(107);
        class433.method2581(arg0 ^ 0xFFFFFFCB);
        class704.method3920((byte) -106);
        class639.method3559((byte) 81);
        class252.method1683((byte) -92);
        class415.method2489(arg0);
        class268.method1749(-1350933182);
        class190.method1278(1);
        class305.method1947(-22344);
        class597.method3373(-2087747519);
        class559.method3194((byte) 100);
        class399.method2448((byte) 111);
        class296.method1896(true);
        class606.method3410();
        class534.method3039(false);
        class345.method2143(-128);
        class686.method3785(-83);
        class678.method3764((byte) 125);
        class379.method2273((byte) 75);
        class654.method3608((byte) -128);
        class20.method235(-258);
        class629.method3508(-2);
        class661.method3663((byte) -47);
        class341.method2132((byte) -116);
        class502.method2893((byte) 120);
        class67.method675(0);
        class185.method1239((byte) 71);
        class88.method761((byte) -48);
        class672.method3727((byte) 125);
        class573.method3255(arg0);
        class259.method1712(true);
        class319.method2001(0);
        class261.method1716(32623);
        class331.method2077(0);
        class596.method3372(85);
        class662.method3664(arg0 ^ 0xFFFFEFFF);
        class192.method1293(0);
        class179.method1215(2);
        class201.method1337(arg0 ^ 0xFFFFEA0F);
        class136.method989(arg0 ^ 0x77);
        class517.method2953(1096046444);
        class488.method2837(-87);
        class24.method283((byte) 73);
        class514.method2942(true);
        class105.method840(-12542);
        class687.method3791();
        class659.method3629();
        class242.method1644((byte) -112);
        class632.method3518(arg0 ^ 0xFFFFFF86);
        class247.method1663(arg0 ^ 0xFFFFFFC2);
        class153.method1075(31376);
        class127.method954((byte) 77);
        class289.method1846(false);
        class623.method3464(arg0 + 16567);
        class452.method2673(95);
        class462.method2724((byte) -64);
        class164.method1135(true);
        class232.method1595(-25602);
        class354.method2167(134217728);
        class182.method1228(0);
        class520.method2968((byte) -103);
        class523.method3010((byte) -111);
        class448.method2667(85);
        class436.method2592(arg0 + Integer.MIN_VALUE);
        class414.method2487((byte) -99);
        class487.method2829(true);
        class339.method2131(29);
        class80.method732(-26090);
        class437.method2600(true);
        class41.method460(-112);
        class165.method1145(-74);
        class658.method3623((byte) -119);
        class131.method970((byte) 121);
        class8.method50(1);
        class497.method2872((byte) 36);
        class19.method227(124);
        class439.method2604((byte) 126);
        class574.method3256(0);
        class558.method3193(0);
        class580.method3311((byte) 118);
        class124.method944((byte) 61);
        class267.method1745(94);
        class22.method278((byte) 35);
        class23.method280(117);
        class226.method1489(0);
        class554.method3144((byte) 70);
        class271.method1790(arg0 ^ 0xFFFFFF00);
        class302.method1938((byte) 104);
        class58.method626(arg0 ^ 0xFFFFFF92);
        class163.method1124(18);
        class655.method3610((byte) 94);
        class647.method3588(-10);
        class97.method795(109636600);
        class471.method2774(128);
        class117.method908((byte) -115);
        class451.method2672((byte) -24);
        class312.method1979((byte) -124);
        class683.method3777(arg0 + 21666);
        class569.method3245((byte) -59);
        class381.method2276(10576);
        class207.method1373((byte) 76);
        class260.method1715(-106);
        class151.method1067(true);
        class656.method3613(30422);
        class395.method2436(-116);
        class68.method677((byte) -127);
        class254.method1693(false);
        class122.method924(arg0 ^ 0xFFFFFFFA);
        class258.method1711(-50);
        class645.method3581(arg0);
        class149.method1059(-20203);
        class86.method752(~arg0);
        class134.method982(false);
        class532.method3031(-121);
        class287.method1840(arg0 + 23245);
        class330.method2075((byte) 122);
        class434.method2583((byte) -47);
        class420.method2524((byte) 49);
        class356.method2173((byte) -117);
        class355.method2171((byte) -108);
        class47.method486(false);
        class361.method2200((byte) -101);
        class84.method745((byte) -125);
        class279.method1819(4);
        class85.method747((byte) -106);
        class544.method3082(arg0 + 22261);
        class210.method1394(true);
        class174.method1190(0);
        class95.method778((byte) -82);
        class243.method1651(arg0 + 8022);
        class57.method619((byte) 122);
        class663.method3668(27);
        class2.method8(1);
        class118.method909((byte) -88);
        class682.method3775(200);
        class169.method1167(arg0 - 81);
        class388.method2393((byte) 13);
        class524.method3016(true);
        class599.method3389(95);
        class478.method2800((byte) 89);
        class206.method1366((byte) 109);
        class303.method1940(-112);
        class272.method1796((byte) 80);
        class467.method2763((byte) -53);
        if (class417.field6081) {
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method1766(int arg0) {
        field4070++;
        if (class622.field8693.field8623 > class200.field2824) {
            class228.field3284.method2103(-1);
            class430.field6309 = (class622.field8693.field8623 * 50 - 50) * 5;
            if (class430.field6309 > 3000) {
                class430.field6309 = 3000;
            }
            if (class622.field8693.field8623 >= 2 && class622.field8693.field8625 == 6) {
                this.method2511(-128, "js5connect_outofdate");
                class420.field6113 = 14;
                return;
            }
            if (class622.field8693.field8623 >= 4 && class622.field8693.field8625 == -1) {
                this.method2511(-126, "js5crc");
                class420.field6113 = 14;
                return;
            }
            if (class622.field8693.field8623 >= 4 && class54.method592(8, class420.field6113)) {
                if (class622.field8693.field8625 == 7 || class622.field8693.field8625 == 9) {
                    this.method2511(-126, "js5connect_full");
                } else if (class622.field8693.field8625 <= 0) {
                    this.method2511(-127, "js5io");
                } else if (class176.field2489 == null) {
                    this.method2511(-127, "js5connect");
                } else {
                    this.method2511(-127, "js5proxy_" + class176.field2489.trim());
                }
                class420.field6113 = 14;
                return;
            }
        }
        class200.field2824 = class622.field8693.field8623;
        if (class430.field6309 > 0) {
            class430.field6309--;
            return;
        }
        try {
            if (class455.field6531 == 0) {
                class167.field2418 = class228.field3284.method2104(29767, class368.field5267);
                class455.field6531++;
            }
            if (class455.field6531 == 1) {
                if (class167.field2418.field7024 == 2) {
                    if (class167.field2418.field7019 != null) {
                        class176.field2489 = (String) class167.field2418.field7019;
                    }
                    this.method1777(1000, (byte) 6);
                    return;
                }
                if (class167.field2418.field7024 == 1) {
                    class455.field6531++;
                }
            }
            int var2 = -32 % ((arg0 + 46) / 51);
            if (class455.field6531 == 2) {
                class704.field9916 = new class393((Socket) class167.field2418.field7019, class368.field5267);
                class695 var3 = new class695(5);
                var3.method3853((byte) 51, class370.field5281.field6777);
                var3.method3868(618, -318419336);
                class704.field9916.method2419(var3.field9796, 43, 5, 0);
                class455.field6531++;
                class578.field8151 = class490.method2840(true);
            }
            if (class455.field6531 == 3) {
                if (class54.method592(8, class420.field6113) || class704.field9916.method2425(-100) > 0) {
                    int var4 = class704.field9916.method2423(120);
                    if (var4 != 0) {
                        this.method1777(var4, (byte) 6);
                        return;
                    }
                    class455.field6531++;
                } else if ((class490.method2840(true) - class578.field8151) > 30000L) {
                    this.method1777(1001, (byte) 6);
                    return;
                }
            }
            if (class455.field6531 == 4) {
                boolean var5 = class54.method592(8, class420.field6113) || class47.method485(200, class420.field6113) || class204.method1356(class420.field6113, (byte) -110);
                class114[] var6 = class114.method890(10);
                class695 var7 = new class695(var6.length * 4);
                class704.field9916.method2418(0, var7.field9796, var7.field9796.length, 0);
                for (int var8 = 0; var8 < var6.length; var8++) {
                    var6[var8].method892(var7.method3880(8), false);
                }
                class622.field8693.method3440(-27117, !var5, class704.field9916);
                class167.field2418 = null;
                class704.field9916 = null;
                class455.field6531 = 0;
            }
        } catch (IOException var9) {
            this.method1777(1002, (byte) 6);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lvg;)Lwh;")
    public static final class132 method1767(class49 arg0) {
        class132 var1 = (class132) class219.field3065.method1405(((long) arg0.field977 << 32) + (long) arg0.field914, (byte) -63);
        return var1 == null ? arg0.field935 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1768() {
        int var0 = class7.field65;
        int[] var1 = class629.field8801;
        boolean var2 = class287.field4270.field3711 == 1 && var0 > 200 || class287.field4270.field3711 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class491 var13 = class141.field2087[var1[var3]];
            if (var13.method2849((byte) 75)) {
                var13.method2555(0);
                if (var13.field6524 >= 0 && var13.field6521 >= 0 && var13.field6526 < class199.field2812 && var13.field6516 < class232.field3611) {
                    var13.field6956 = var13.field6230 ? var2 : false;
                    if (class648.field9106 == var13) {
                        var13.field6180 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field6186) {
                            var14++;
                        }
                        if (var13.field6210 > class564.field7962) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method2553((byte) 80) << 2);
                        if (var13.field6999) {
                            var15 += 512;
                        } else {
                            if (class332.field4921 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field6180 = var15 + 1;
                    }
                } else {
                    var13.field6180 = -1;
                }
            } else {
                var13.field6180 = -1;
            }
        }
        for (int var4 = 0; var4 < class217.field3042; var4++) {
            class577 var10 = ((class16) class189.field2723.method1405((long) class85.field1396[var4], (byte) -71)).field174;
            if (var10.method3268((byte) -57) && var10.field8121.method3354(class61.field1163, -1)) {
                var10.method2555(0);
                if (var10.field6524 >= 0 && var10.field6521 >= 0 && var10.field6526 < class199.field2812 && var10.field6516 < class232.field3611) {
                    int var11 = 0;
                    if (!var10.field6186) {
                        var11++;
                    }
                    if (var10.field6210 > class564.field7962) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method2553((byte) 116) << 2);
                    if (class332.field4921 == 0) {
                        if (var10.field8121.field8346) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class332.field4921 == 1) {
                        if (var10.field8121.field8346) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field8121.field8293) {
                        var12 += 1024;
                    } else if (!var10.field8121.field8361) {
                        var12 += 256;
                    }
                    var10.field6180 = var12 + 1;
                } else {
                    var10.field6180 = -1;
                }
            } else {
                var10.field6180 = -1;
            }
        }
        for (int var5 = 0; var5 < class601.field8496.length; var5++) {
            class390 var6 = class601.field8496[var5];
            if (var6 != null) {
                if (var6.field5787 == 1) {
                    class16 var7 = (class16) class189.field2723.method1405((long) var6.field5786, (byte) -57);
                    if (var7 != null) {
                        class577 var8 = var7.field174;
                        if (var8.field6180 >= 0) {
                            var8.field6180 += 2048;
                        }
                    }
                } else if (var6.field5787 == 10) {
                    class491 var9 = class141.field2087[var6.field5786];
                    if (var9 != null && class648.field9106 != var9 && var9.field6180 >= 0) {
                        var9.field6180 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    private final void method1769(int arg0) {
        field4062++;
        if (class420.field6113 == 7 && class676.field9555 == 0) {
            if (class593.field8378 > 1) {
                class24.field331 = class363.field5184;
                class593.field8378--;
            }
            if (!class623.field8731) {
                class21.method262((byte) -8);
            }
            for (int var2 = 0; var2 < 100 && class124.method943(arg0 - 1628); var2++) {
            }
        }
        class312.field4621++;
        class488.method2835(null, -1, -1, (byte) 95);
        class213.method1412(-1, 119, null, -1);
        class321.method2008(1295);
        class363.field5184++;
        for (int var3 = 0; var3 < class428.field6288; var3++) {
            class577 var4 = class261.field3968[var3].field174;
            if (var4 != null) {
                byte var5 = var4.field8121.field8330;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method2553((byte) 84);
                    if ((var5 & 0x2) != 0 && var4.field6269 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field6271[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > class199.field2812 - var6 - 1) {
                                var9 = class199.field2812 - var6 - 1;
                            }
                            int var10 = var4.field6262[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if ((class232.field3611 - var6 - 1) < var10) {
                                var10 = class232.field3611 - var6 - 1;
                            }
                            int var11 = class615.method3421(var4.field6271[0], 0, var6, var4.field6262[0], false, class355.field5107, class423.field6155[var4.field3019], var10, true, var9, var6, -1, 0, class178.field2533, var6);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field6271[var12] = class178.field2533[var11 - var12 - 1];
                                    var4.field6262[var12] = class355.field5107[var11 - var12 - 1];
                                    var4.field6265[var12] = 1;
                                }
                                var4.field6269 = var11;
                            }
                        }
                    }
                    class666.method3682(true, (byte) -66, var4);
                    int var13 = class700.method3902((byte) -32, var4);
                    class637.method3544(var13, (byte) 81, class132.field1954, var4, class369.field5276);
                    class633.method3534(var4, class132.field1954, (byte) 116);
                    class326.method2052(var4, arg0 - 1501);
                }
            }
        }
        if (class676.field9555 == 0 && class594.field8391 == 0) {
            if (class43.field700 == 2) {
                class51.method575((byte) 16);
            } else {
                class623.method3465(28519);
            }
            if ((class131.field1928 >> 9) < 14 || (class199.field2812 - 14) <= (class131.field1928 >> 9) || (class413.field6011 >> 9) < 14 || class413.field6011 >> 9 >= class232.field3611 - 14) {
                class454.method2681(-21844);
            }
        }
        while (true) {
            class14 var14;
            class49 var15;
            class49 var16;
            do {
                var14 = (class14) class467.field6719.method483((byte) -122);
                if (var14 == null) {
                    while (true) {
                        class14 var17;
                        class49 var18;
                        class49 var19;
                        do {
                            var17 = (class14) class475.field6773.method483((byte) -117);
                            if (var17 == null) {
                                while (true) {
                                    class14 var20;
                                    class49 var21;
                                    class49 var22;
                                    do {
                                        var20 = (class14) class293.field4324.method483((byte) -119);
                                        if (var20 == null) {
                                            if (class648.field9107 != null) {
                                                class592.method3346(141);
                                            }
                                            if (class564.field7962 % arg0 == 0) {
                                                class641.method3570(-129);
                                            }
                                            if (class420.field6113 == 7 && class676.field9555 == 0) {
                                                class666.method3685(arg0 ^ 0x5AE);
                                            }
                                            class443.method2628(19576);
                                            if (class52.field1042 && class580.field8175 < class490.method2840(true) - 60000L) {
                                                class436.method2598(arg0 ^ 0xFFFFFA19);
                                            }
                                            for (class330 var23 = (class330) class600.field8482.method2417(false); var23 != null; var23 = (class330) class600.field8482.method2414(true)) {
                                                if ((long) var23.field4878 < class490.method2840(true) / 1000L - 5L) {
                                                    if (var23.field4879 > 0) {
                                                        class376.method2265(5, 0, "", "", (byte) -123, "", var23.field4881 + class274.field4135.method1804(arg0 + 5675, class512.field7203));
                                                    }
                                                    if (var23.field4879 == 0) {
                                                        class376.method2265(5, 0, "", "", (byte) -124, "", var23.field4881 + class274.field4136.method1804(7175, class512.field7203));
                                                    }
                                                    var23.method3414(0);
                                                }
                                            }
                                            if (class420.field6113 == 7 && class676.field9555 == 0) {
                                                if (class274.field4181 == null) {
                                                    class88.method764(0, false);
                                                    return;
                                                }
                                                class66.field1222++;
                                                if (class66.field1222 > 50) {
                                                    class345.field5040++;
                                                    class135 var24 = class688.method3794(class351.field5066, class583.field8198, (byte) 38);
                                                    class19.method223(var24, 0);
                                                }
                                                try {
                                                    class475.method2788(0);
                                                    return;
                                                } catch (IOException var25) {
                                                    class88.method764(0, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field129;
                                        if (var21.field914 < 0) {
                                            break;
                                        }
                                        var22 = class534.method3038(-122, var21.field885);
                                    } while (var22 == null || var22.field1014 == null || var22.field1014.length <= var21.field914 || var22.field1014[var21.field914] != var21);
                                    class220.method1443(var20);
                                }
                            }
                            var18 = var17.field129;
                            if (var18.field914 < 0) {
                                break;
                            }
                            var19 = class534.method3038(-107, var18.field885);
                        } while (var19 == null || var19.field1014 == null || var19.field1014.length <= var18.field914 || var19.field1014[var18.field914] != var18);
                        class220.method1443(var17);
                    }
                }
                var15 = var14.field129;
                if (var15.field914 < 0) {
                    break;
                }
                var16 = class534.method3038(-83, var15.field885);
            } while (var16 == null || var16.field1014 == null || var15.field914 >= var16.field1014.length || var16.field1014[var15.field914] != var15);
            class220.method1443(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    private final void method1770(int arg0) {
        field4071++;
        if (class420.field6113 == 14) {
            return;
        }
        class564.field7962++;
        if (class564.field7962 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class518.field7304 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class424.field6159.setSeed((long) class518.field7304);
        }
        if ((class564.field7962 % 50) == 0) {
            class50.field1027 = class23.field313;
            class131.field1930 = class514.field7265;
            class23.field313 = 0;
            class514.field7265 = 0;
        }
        this.method1775((byte) -39);
        if (class235.field3641 != null) {
            class235.field3641.method1263(arg0 ^ 0x519E);
        }
        class408.method2468(126);
        class603.field8514.method1360((byte) 105);
        class508.field7171.method2080(arg0 + 1024);
        if (class282.field4228 != null) {
            class282.field4228.method151((int) class490.method2840(true));
        }
        if (arg0 != -1145) {
            return;
        }
        class633.method3531(arg0 + 1147);
        class22.field300 = 0;
        class32.field502 = 0;
        for (class121 var3 = class603.field8514.method1365(4); var3 != null; var3 = class603.field8514.method1365(4)) {
            int var6 = var3.method921((byte) 117);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method923(arg0 ^ 0xFFFFDB1B);
                if (class329.method2070(-2) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class577.method3266((byte) -65)) {
                        class358.method2182(arg0 + 1149);
                    } else {
                        class513.method2933(-32447);
                    }
                } else if (class32.field502 < 128) {
                    class231.field3603[class32.field502] = var3;
                    class32.field502++;
                }
            } else if (var6 == 0 && class22.field300 < 75) {
                class431.field6314[class22.field300] = var3;
                class22.field300++;
            }
        }
        class691.field9722 = 0;
        for (class356 var4 = class508.field7171.method2095(90); var4 != null; var4 = class508.field7171.method2095(arg0 + 1204)) {
            int var5 = var4.method1030(arg0 + 1239);
            if (var5 == -1) {
                class630.field8810.method474(var4, 6);
            } else if (var5 == 6) {
                class691.field9722 += var4.method1029((byte) 50);
            } else if (class123.method928(true, var5)) {
                class691.field9713.method474(var4, 6);
                if (class691.field9713.method477(15650) > 10) {
                    class691.field9713.method483((byte) -118);
                }
            }
        }
        if (class577.method3266((byte) -65)) {
            class448.method2668((byte) -33);
        }
        if (class54.method592(8, class420.field6113)) {
            class57.method620(3338);
            class588.method3324((byte) 110);
        } else if (class588.method3336(arg0 + 1144, class420.field6113)) {
            class575.method3259(false);
        }
        if (class47.method485(200, class420.field6113) && !class588.method3336(-1, class420.field6113)) {
            this.method1769(1500);
            class622.method3455(2490);
            class545.method3088(13132);
        } else if (class204.method1356(class420.field6113, (byte) -110) && !class588.method3336(-1, class420.field6113)) {
            this.method1769(1500);
            class545.method3088(arg0 + 14277);
        } else if (class420.field6113 == 12) {
            class545.method3088(13132);
        } else if (class320.method2003(arg0 + 1020, class420.field6113) && !class588.method3336(-1, class420.field6113)) {
            class363.method2203(-2122);
        } else if (class420.field6113 == 13) {
            class545.method3088(13132);
            if (class508.field7174 != -3 && class508.field7174 != 2 && class508.field7174 != 15) {
                class88.method764(0, false);
            }
        }
        class387.method2325(-35, class282.field4228);
        class691.field9713.method483((byte) -119);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method1771(int arg0) {
        field4068++;
        if (arg0 <= 29) {
            return;
        }
        if (class328.field4859 != 2) {
            this.method1778(50);
            return;
        }
        try {
            this.method1778(50);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class699.method3896(117, var5, var5.getMessage() + " (Recovered) " + this.method1774(95));
            class33.method363(-30052, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public static final void method1772(int arg0) {
        int var1 = class7.field65;
        int[] var2 = class629.field8801;
        for (int var3 = 0; var3 < class217.field3042 + var1; var3++) {
            class425 var4;
            if (var3 < var1) {
                var4 = class141.field2087[var2[var3]];
            } else {
                var4 = ((class16) class189.field2723.method1405((long) class85.field1396[var3 - var1], (byte) -73)).field174;
            }
            if (var4.field3019 == arg0 && var4.field6180 >= 0) {
                int var5 = var4.method2553((byte) 123);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field3024 & 0x1FF) != 0 || (var4.field3029 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field3024 & 0x1FF) != 256 || (var4.field3029 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field3024 >> 9;
                    int var7 = var4.field3029 >> 9;
                    if (var4.field6180 > class671.field9492[var6][var7]) {
                        class671.field9492[var6][var7] = var4.field6180;
                        class678.field9587[var6][var7] = 1;
                    } else if (class671.field9492[var6][var7] == var4.field6180) {
                        var10002 = class678.field9587[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field3024 - var8 >> 9;
                    int var10 = var4.field3029 - var8 >> 9;
                    int var11 = var4.field3024 + var8 >> 9;
                    int var12 = var4.field3029 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field6180 > class671.field9492[var13][var14]) {
                                class671.field9492[var13][var14] = var4.field6180;
                                class678.field9587[var13][var14] = 1;
                            } else if (class671.field9492[var13][var14] == var4.field6180) {
                                var10002 = class678.field9587[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public final void method1773(int arg0) {
        if (arg0 != 3541) {
            this.method1778(60);
        }
        field4074++;
        if (class544.field7663) {
            class266.field4022 = 64;
        }
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class384.method2296((byte) -45);
        class434.field6344 = new class17(class368.field5267);
        class622.field8693 = new class618();
        class109.method855(new int[] { 20, 260 }, (byte) -65, new int[] { 1000, 100 });
        if (class379.field5372 != class296.field4357) {
            class267.field4034 = new byte[50][];
        }
        class287.field4270 = new class465(class368.field5267);
        if (class379.field5372 == class296.field4357) {
            class352.field5077.field4948 = this.getCodeBase().getHost();
        } else if (class632.method3516((byte) -108, class379.field5372)) {
            class352.field5077.field4948 = this.getCodeBase().getHost();
            class352.field5077.field4937 = class352.field5077.field4938 + 40000;
            class533.field7487.field4937 = class533.field7487.field4938 + 40000;
            class352.field5077.field4941 = class352.field5077.field4938 + 50000;
            class136.field1994.field4937 = class136.field1994.field4938 + 40000;
            class533.field7487.field4941 = class533.field7487.field4938 + 50000;
            class136.field1994.field4941 = class136.field1994.field4938 + 50000;
        } else if (class379.field5372 == class160.field2306) {
            class352.field5077.field4948 = "127.0.0.1";
            class533.field7487.field4948 = "127.0.0.1";
            class136.field1994.field4948 = "127.0.0.1";
            class352.field5077.field4937 = class352.field5077.field4938 + 40000;
            class533.field7487.field4937 = class533.field7487.field4938 + 40000;
            class136.field1994.field4937 = class136.field1994.field4938 + 40000;
            class352.field5077.field4941 = class352.field5077.field4938 + 50000;
            class533.field7487.field4941 = class533.field7487.field4938 + 50000;
            class136.field1994.field4941 = class136.field1994.field4938 + 50000;
        }
        class228.field3284 = class352.field5077;
        if (class689.field9693 == class586.field8208) {
            class164.field2359 = false;
        }
        if (class673.field9519 == class586.field8208) {
            class671.field9479 = true;
            class571.field8044 = 0;
            class72.field1265 = class186.field2668;
            class118.field1796 = class381.field5387;
            class114.field1748 = 16777215;
        } else {
            class72.field1265 = class555.field7859;
            class118.field1796 = class411.field6000;
        }
        class58.field1119 = class122.field1832 = class54.field1060 = class247.field3834 = new short[256];
        try {
            class434.field6342 = class565.field7967.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class603.field8514 = class19.method221(true, class31.field486);
        class508.field7171 = class242.method1646(arg0 ^ 0x5B78, class31.field486, true);
        try {
            if (class368.field5267.field30 != null) {
                class356.field5111 = new class421(class368.field5267.field30, 5200, 0);
                for (int var3 = 0; var3 < 35; var3++) {
                    class95.field1503[var3] = new class421(class368.field5267.field31[var3], 6000, 0);
                }
                class361.field5176 = new class421(class368.field5267.field44, 6000, 0);
                class547.field7692 = new class691(255, class356.field5111, class361.field5176, 500000);
                class68.field1242 = new class421(class368.field5267.field42, 24, 0);
                class368.field5267.field42 = null;
                class368.field5267.field30 = null;
                class368.field5267.field44 = null;
                class368.field5267.field31 = null;
            }
        } catch (IOException var5) {
            class356.field5111 = null;
            class68.field1242 = null;
            class547.field7692 = null;
            class361.field5176 = null;
        }
        if (class379.field5372 != class296.field4357) {
            class122.field1830 = true;
        }
        if (class689.field9693 == class586.field8208) {
            class518.field7315 = class274.field4115.method1804(7175, class512.field7203);
        } else if (class673.field9519 == class586.field8208) {
            class518.field7315 = class274.field4116.method1804(7175, class512.field7203);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/lang/String;")
    public final String method1774(int arg0) {
        field4073++;
        String var2 = null;
        try {
            var2 = "[1)" + class109.field1672 + "," + class203.field2874 + "," + class199.field2812 + "," + class232.field3611 + "|";
            if (class648.field9106 != null) {
                var2 = var2 + "2)" + class58.field1112 + "," + (class648.field9106.field6271[0] + class109.field1672) + "," + (class648.field9106.field6262[0] + class203.field2874) + "|";
            }
            var2 = var2 + "3)" + class328.field4859 + "|4)" + class287.field4270.field3706 + "|5)" + class488.method2836(3) + "|6)" + class487.field6930 + "," + class31.field494 + "|";
            var2 = var2 + "7)" + class287.field4270.method1624(10814, class328.field4859) + "|";
            var2 = var2 + "8)" + class287.field4270.method1625(-103, class328.field4859) + "|";
            var2 = var2 + "9)" + class287.field4270.field3705 + "|";
            var2 = var2 + "10)" + class287.field4270.field3724 + "|";
            var2 = var2 + "11)" + class287.field4270.field3700 + "|";
            int var3 = 124 % ((arg0 - 27) / 50);
            var2 = var2 + "12)" + class287.field4270.method2747(74, class328.field4859) + "|";
            var2 = var2 + "13)" + class266.field4022 + "|";
            var2 = var2 + "14)" + class420.field6113;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var16) {
            }
            try {
                if (class328.field4859 == 2) {
                    Class var4 = Class.forName("java.lang.ClassLoader");
                    Field var5 = var4.getDeclaredField("nativeLibraries");
                    Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var7.invoke(var5, Boolean.TRUE);
                    Vector var8 = (Vector) var5.get((field4075 == null ? (field4075 = method1786("client")) : field4075).getClassLoader());
                    for (int var9 = 0; var8.size() > var9; var9++) {
                        try {
                            Object var10 = var8.elementAt(var9);
                            Field var11 = var10.getClass().getDeclaredField("name");
                            var7.invoke(var11, Boolean.TRUE);
                            try {
                                String var12 = (String) var11.get(var10);
                                if (var12 != null && var12.indexOf("sw3d.dll") != -1) {
                                    Field var13 = var10.getClass().getDeclaredField("handle");
                                    var7.invoke(var13, Boolean.TRUE);
                                    var2 = var2 + "|16)" + Long.toHexString(var13.getLong(var10));
                                    var7.invoke(var13, Boolean.FALSE);
                                }
                            } catch (Throwable var14) {
                            }
                            var7.invoke(var11, Boolean.FALSE);
                        } catch (Throwable var15) {
                        }
                    }
                }
            } catch (Throwable var17) {
            }
            var2 = var2 + "]";
        } catch (Throwable var18) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field4066++;
        try {
            if (arg0.length != 6) {
                class623.method3461("Argument count", -25643);
            }
            class352.field5077 = new class333();
            class352.field5077.field4938 = Integer.parseInt(arg0[0]);
            class533.field7487 = new class333();
            class533.field7487.field4938 = Integer.parseInt(arg0[1]);
            class136.field1994 = new class333();
            class136.field1994.field4938 = Integer.parseInt(arg0[2]);
            class379.field5372 = class160.field2306;
            if (arg0[3].equals("live")) {
                class205.field2892 = class401.field5904;
            } else if (arg0[3].equals("rc")) {
                class205.field2892 = class134.field1976;
            } else if (arg0[3].equals("wip")) {
                class205.field2892 = class103.field1617;
            } else {
                class623.method3461("modewhat", -25643);
            }
            class512.field7203 = class318.method1996(arg0[4], 0);
            if (class512.field7203 == -1) {
                if (arg0[4].equals("english")) {
                    class512.field7203 = 0;
                } else if (arg0[4].equals("german")) {
                    class512.field7203 = 1;
                } else {
                    class623.method3461("language", -25643);
                }
            }
            class161.field2312 = false;
            class273.field4108 = false;
            if (arg0[5].equals("game0")) {
                class586.field8208 = class689.field9693;
            } else if (arg0[5].equals("game1")) {
                class586.field8208 = class673.field9519;
            } else {
                class623.method3461("game", -25643);
            }
            class206.field2906 = true;
            class149.field2169 = true;
            class143.field2113 = 0;
            class340.field5001 = class586.field8208.field9738;
            class544.field7663 = false;
            class254.field3901 = 0L;
            class31.field483 = "";
            class40.field657 = 0;
            class493.field7018 = null;
            class421.field6124 = 0;
            class87.field1469 = null;
            class145.field2122 = false;
            client var1 = new client();
            class565.field7967 = var1;
            var1.method2518(false, class205.field2892.method2519(18) + 32, 35, 618, -120, 768, 1024, class586.field8208.field9737);
            class683.field9634.setLocation(40, 40);
        } catch (Exception var3) {
            class699.method3896(95, var3, null);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    private final void method1775(byte arg0) {
        field4064++;
        boolean var2 = class622.field8693.method3441(arg0);
        if (!var2) {
            this.method1766(arg0 - 62);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1776() {
        int var0 = class7.field65;
        int[] var1 = class629.field8801;
        int var2 = class542.field7626 ? var0 : class217.field3042 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class425 var4;
            if (var3 < var0) {
                var4 = class141.field2087[var1[var3]];
            } else {
                var4 = ((class16) class189.field2723.method1405((long) class85.field1396[var3 - var0], (byte) -55)).field174;
            }
            if (var4.field6180 >= 0) {
                int var5 = var4.method2553((byte) 102);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field3024 & 0x1FF) == 0 && (var4.field3029 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field3024 & 0x1FF) == 256 && (var4.field3029 & 0x1FF) == 256) {
                    continue;
                }
                var4.field3018 = class674.method3748(var4.field3024, var4.field3019, 95, var4.field3029);
                class598.method3381(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method1777(int arg0, byte arg1) {
        class167.field2418 = null;
        class622.field8693.field8625 = arg0;
        class455.field6531 = 0;
        field4061++;
        if (arg1 == 6) {
            class704.field9916 = null;
            class622.field8693.field8623++;
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
    private final void method1778(int arg0) {
        field4063++;
        if (class420.field6113 == 14) {
            return;
        }
        long var2 = class477.method2798((byte) -66) / 1000000L - class56.field1090;
        class56.field1090 = class477.method2798((byte) -66) / 1000000L;
        boolean var4 = class268.method1751(3);
        if (var4 && class43.field701 && class574.field8072 != null) {
            class574.field8072.method2013(-55);
        }
        if (class499.method2888(class420.field6113, arg0 + 29)) {
            if (class635.field8984 != 0L && class490.method2840(true) > class635.field8984) {
                class134.method983(class488.method2836(3), class287.field4270.field3710, false, class287.field4270.field3690, false);
            } else if (!class282.field4228.method166() && class153.field2211) {
                class157.method1094(4897);
            }
        }
        if (class554.field7847 == null) {
            Container var5;
            if (class683.field9634 != null) {
                var5 = class683.field9634;
            } else if (class421.field6129 == null) {
                var5 = class108.field1660;
            } else {
                var5 = class421.field6129;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class683.field9634 == var5) {
                Insets var8 = class683.field9634.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.left + var8.right;
            }
            if (class319.field4702 != var6 || class443.field6457 != var7 || class641.field9040) {
                if (class282.field4228 == null || class282.field4228.method161()) {
                    class384.method2296((byte) 41);
                } else {
                    class319.field4702 = var6;
                    class443.field6457 = var7;
                }
                class635.field8984 = class490.method2840(true) + 500L;
                class641.field9040 = false;
            }
        }
        if (class554.field7847 != null && !class67.field1229 && class499.method2888(class420.field6113, 118)) {
            class134.method983(class287.field4270.field3718, -1, false, -1, false);
        }
        boolean var9 = false;
        if (arg0 != 50) {
            return;
        }
        if (class245.field3808) {
            var9 = true;
            class245.field3808 = false;
        }
        if (var9) {
            class157.method1089(arg0 - 50);
        }
        if (class282.field4228 != null && class282.field4228.method166() || class488.method2836(arg0 ^ 0x31) != 1) {
            class158.method1100(110);
        }
        if (class54.method592(arg0 - 42, class420.field6113)) {
            class486.method2827(var9, 127);
        } else if (class78.method721(true, class420.field6113)) {
            class407.method2465((byte) -3);
        } else if (class386.method2305(57, class420.field6113)) {
            class407.method2465((byte) -3);
        } else if (class588.method3336(arg0 - 51, class420.field6113)) {
            if (class224.field3166 == 1) {
                if (class485.field6910 < class586.field8213) {
                    class485.field6910 = class586.field8213;
                }
                int var10 = (class485.field6910 - class586.field8213) * 50 / class485.field6910;
                class140.method1015(class563.field7931, true, class244.field3796, class282.field4228, (byte) 96, class274.field4128.method1804(arg0 + 7125, class512.field7203) + "<br>(" + var10 + "%)");
            } else if (class224.field3166 == 2) {
                if (class270.field4054 < class572.field8055) {
                    class270.field4054 = class572.field8055;
                }
                int var11 = (class270.field4054 - class572.field8055) * 50 / class270.field4054 + 50;
                class140.method1015(class563.field7931, true, class244.field3796, class282.field4228, (byte) 43, class274.field4128.method1804(7175, class512.field7203) + "<br>(" + var11 + "%)");
            } else {
                class140.method1015(class563.field7931, true, class244.field3796, class282.field4228, (byte) 70, class274.field4128.method1804(7175, class512.field7203));
            }
        } else if (class420.field6113 == 10) {
            class186.method1241(119, var2);
        } else if (class420.field6113 == 13) {
            class140.method1015(class563.field7931, false, class244.field3796, class282.field4228, (byte) 23, class274.field4130.method1804(7175, class512.field7203) + "<br>" + class274.field4131.method1804(7175, class512.field7203));
        }
        if (class700.field9890 == 3) {
            for (int var12 = 0; var12 < class28.field407; var12++) {
                Rectangle var13 = class210.field2933[var12];
                if (class312.field4620[var12]) {
                    class282.field4228.method1150(var13.width, var13.y, var13.x, -1, -1996553985, var13.height);
                } else if (class380.field5381[var12]) {
                    class282.field4228.method1150(var13.width, var13.y, var13.x, -1, -1996554240, var13.height);
                }
            }
        }
        if (class577.method3266((byte) -65)) {
            class136.method988(class282.field4228, -122);
        }
        if (class368.field5267.field47 && class499.method2888(class420.field6113, arg0 ^ 0xFFFFFF9C) && class700.field9890 == 0 && class488.method2836(3) == 1 && !var9) {
            int var16 = 0;
            for (int var17 = 0; var17 < class28.field407; var17++) {
                if (class380.field5381[var17]) {
                    class380.field5381[var17] = false;
                    class371.field5301[var16++] = class210.field2933[var17];
                }
            }
            try {
                class282.field4228.method198(class371.field5301, var16);
            } catch (class621 var18) {
            }
        } else if (!class54.method592(8, class420.field6113)) {
            for (int var14 = 0; var14 < class28.field407; var14++) {
                class380.field5381[var14] = false;
            }
            try {
                class282.field4228.method203();
            } catch (class621 var19) {
                class699.method3896(85, var19, var19.getMessage() + " (Recovered) " + this.method1774(arg0 ^ 0xFFFFFFE8));
                class33.method363(-30052, 0);
            }
        }
        if (class287.field4270.field3682 == 0) {
            class561.method3202(15L, (byte) -32);
        } else if (class287.field4270.field3682 == 1) {
            class561.method3202(10L, (byte) -72);
        } else if (class287.field4270.field3682 == 2) {
            class561.method3202(5L, (byte) -66);
        } else if (class287.field4270.field3682 == 3) {
            class561.method3202(2L, (byte) -21);
        }
        if (class514.field7270) {
            class539.method3066((byte) 101);
        }
        if (class287.field4270.field3692 && class420.field6113 == 3 && class100.field1556 != -1) {
            class287.field4270.field3692 = false;
            class287.field4270.method2753(false, class368.field5267);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lvg;)Lvg;")
    public static final class49 method1779(class49 arg0) {
        int var1 = method1767(arg0).method973(92);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class534.method3038(-85, arg0.field885);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1780() {
        for (int var0 = 0; var0 < class199.field2812; var0++) {
            int[] var1 = class671.field9492[var0];
            for (int var2 = 0; var2 < class232.field3611; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public final synchronized void method1781(int arg0) {
        field4060++;
        if (class421.field6129 != null && class31.field486 == null && !class368.field5267.field47) {
            try {
                Class var2 = class421.field6129.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class31.field486 = (Canvas) var3.get(class421.field6129);
                var3.set(class421.field6129, null);
                if (class31.field486 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method1781(arg0);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method1782(int arg0) {
        if (class52.field1042) {
            class436.method2598(arg0 - 111);
        }
        field4069++;
        class355.method2172(arg0 + 14);
        if (class282.field4228 != null) {
            class282.field4228.method1154(false);
        }
        if (class554.field7847 != null) {
            class182.method1227(class368.field5267, -5245, class554.field7847);
            class554.field7847 = null;
        }
        if (class274.field4181 != null) {
            class274.field4181.method2234(false);
            class274.field4181 = null;
        }
        class577.method3271(true);
        class622.field8693.method3430(0);
        class434.field6344.method95(0);
        if (class578.field8142 != null) {
            class578.field8142.method63(arg0 - 9312);
            class578.field8142 = null;
        }
        try {
            if (arg0 == 35) {
                class356.field5111.method2535(0);
                for (int var2 = 0; var2 < 35; var2++) {
                    class95.field1503[var2].method2535(0);
                }
                class361.field5176.method2535(0);
                class68.field1242.method2535(0);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1783() {
        class67.field1231 = 0;
        for (int var0 = 0; var0 < class217.field3042; var0++) {
            class577 var1 = ((class16) class189.field2723.method1405((long) class85.field1396[var0], (byte) -99)).field174;
            if (var1.field6186 && var1.method2560(-1) != -1) {
                int var2 = (var1.method2553((byte) 87) - 1) * 256 + 252;
                int var3 = var1.field3024 - var2 >> 9;
                int var4 = var1.field3029 - var2 >> 9;
                class425 var5 = class426.method2561(var1.field3019, 112, var3, var4);
                if (var5 != null) {
                    int var6 = var5.field6216;
                    if (var5 instanceof class577) {
                        var6 += 2048;
                    }
                    if (var5.field6245 == 0 && var5.method2560(-1) != -1) {
                        class592.field8366[class67.field1231] = var6;
                        class619.field8630[class67.field1231] = var6;
                        class67.field1231++;
                        var5.field6245++;
                    }
                    class592.field8366[class67.field1231] = var6;
                    class619.field8630[class67.field1231] = var1.field6216 + 2048;
                    class67.field1231++;
                    var5.field6245++;
                }
            }
        }
        class534.method3042(class67.field1231 - 1, -37, class619.field8630, class592.field8366, 0);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method1784(int arg0) {
        int var2 = 110 / ((arg0 - 19) / 57);
        field4065++;
        if (class328.field4859 != 2) {
            this.method1770(-1145);
            return;
        }
        try {
            this.method1770(-1145);
        } catch (ThreadDeath var5) {
            throw var5;
        } catch (Throwable var6) {
            class699.method3896(79, var6, var6.getMessage() + " (Recovered) " + this.method1774(107));
            class33.method363(-30052, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public static final void method1785(int arg0) {
        int var1 = class7.field65;
        int[] var2 = class629.field8801;
        int var3 = class542.field7626 ? var1 : class217.field3042 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class425 var5;
            if (var4 < var1) {
                var5 = class141.field2087[var2[var4]];
            } else {
                var5 = ((class16) class189.field2723.method1405((long) class85.field1396[var4 - var1], (byte) -20)).field174;
            }
            if (var5.field3019 == arg0) {
                var5.field6245 = 0;
                if (var5.field6180 < 0) {
                    var5.field6186 = false;
                } else {
                    int var6 = var5.method2553((byte) 117);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field3024 & 0x1FF) != 0 || (var5.field3029 & 0x1FF) != 0) {
                            var5.field6186 = false;
                            continue;
                        }
                    } else if ((var5.field3024 & 0x1FF) != 256 || (var5.field3029 & 0x1FF) != 256) {
                        var5.field6186 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field3024 >> 9;
                        int var8 = var5.field3029 >> 9;
                        if (class671.field9492[var7][var8] != var5.field6180) {
                            var5.field6186 = true;
                            continue;
                        }
                        if (class678.field9587[var7][var8] > 1) {
                            var10002 = class678.field9587[var7][var8]--;
                            var5.field6186 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field3024 - var9 >> 9;
                        int var11 = var5.field3029 - var9 >> 9;
                        int var12 = var5.field3024 + var9 >> 9;
                        int var13 = var5.field3029 + var9 >> 9;
                        if (!class561.method3201((byte) -40, var10, var12, var5.field6180, var11, var13)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class671.field9492[var14][var15] == var5.field6180) {
                                        var10002 = class678.field9587[var14][var15]--;
                                    }
                                }
                            }
                            var5.field6186 = true;
                            continue;
                        }
                    }
                    var5.field6186 = false;
                    var5.field3018 = class674.method3748(var5.field3024, var5.field3019, 115, var5.field3029);
                    class598.method3381(var5, true);
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1786(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
