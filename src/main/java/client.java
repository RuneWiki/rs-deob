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
public class client extends class341 {

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Lgda;")
    public static class53 field4223 = new class53(47, 3);

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field4239;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Ljava/lang/Class;")
    public static Class field4240;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "Z")
    public static boolean field4241;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1971(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljb;)Z", line = 3)
    public static final boolean method1947(class493 arg0) {
        if (class600.field8422) {
            if (method1950(arg0).field6767 != 0) {
                return false;
            }
            if (arg0.field7016 == 0) {
                return false;
            }
        }
        return arg0.field7020;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 20)
    public static final void method1948() {
        for (int var0 = 0; var0 < class336.field4683; var0++) {
            int[] var1 = class662.field9064[var0];
            for (int var2 = 0; var2 < class700.field9768; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 40)
    public static final void method1949(int arg0) {
        int var1 = class578.field8168;
        int[] var2 = class240.field3201;
        int var3 = class237.field3174 ? var1 : class344.field4849 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class564 var5;
            if (var4 < var1) {
                var5 = class309.field4311[var2[var4]];
            } else {
                var5 = ((class740) class373.field5230.method1180((byte) 26, (long) class100.field1196[var4 - var1])).field10289;
            }
            if (var5.field1266 == arg0) {
                var5.field7916 = 0;
                if (var5.field7985 < 0) {
                    var5.field7970 = false;
                } else {
                    int var6 = var5.method1835((byte) 127);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field1264 & 0x1FF) != 0 || (var5.field1250 & 0x1FF) != 0) {
                            var5.field7970 = false;
                            continue;
                        }
                    } else if ((var5.field1264 & 0x1FF) != 256 || (var5.field1250 & 0x1FF) != 256) {
                        var5.field7970 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field1264 >> 9;
                        int var8 = var5.field1250 >> 9;
                        if (class662.field9064[var7][var8] != var5.field7985) {
                            var5.field7970 = true;
                            continue;
                        }
                        if (class115.field1388[var7][var8] > 1) {
                            var10002 = class115.field1388[var7][var8]--;
                            var5.field7970 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field1264 - var9 >> 9;
                        int var11 = var5.field1250 - var9 >> 9;
                        int var12 = var5.field1264 + var9 >> 9;
                        int var13 = var5.field1250 + var9 >> 9;
                        if (!class495.method2961(var11, var13, var10, var5.field7985, var12, 89)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class662.field9064[var14][var15] == var5.field7985) {
                                        var10002 = class115.field1388[var14][var15]--;
                                    }
                                }
                            }
                            var5.field7970 = true;
                            continue;
                        }
                    }
                    var5.field7970 = false;
                    var5.field1255 = class469.method2798(110, var5.field1250, var5.field1266, var5.field1264);
                    class505.method2989(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljb;)Llia;", line = 155)
    public static final class477 method1950(class493 arg0) {
        class477 var1 = (class477) class347.field4885.method1180((byte) 26, ((long) arg0.field6956 << 32) + (long) arg0.field6944);
        return var1 == null ? arg0.field7071 : var1;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 160)
    public final synchronized void method1951(int arg0) {
        field4226++;
        if (class213.field2800 != null && class366.field5196 == null && !class202.field2644.field4367) {
            try {
                Class var2 = class213.field2800.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class366.field5196 = (Canvas) var3.get(class213.field2800);
                var3.set(class213.field2800, null);
                if (class366.field5196 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method1951(arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ljb;IIIIIIIIIII)V", line = 190)
    public static final void method1952(class493[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label812: for (int var12 = 0; var12 < arg0.length; var12++) {
            class493 var13 = arg0[var12];
            if (var13 != null && var13.field7078 == arg1) {
                int var14 = var13.field6954 + arg6;
                int var15 = var13.field6975 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field7016 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field7095 + var14;
                    int var21 = var13.field7031 + var15;
                    if (var13.field7016 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field7016 == 0 || var13.field6947 || method1950(var13).field6767 != 0 || class76.field991 == var13 || class68.field840 == var13.field7021 || class716.field9963 == var13.field7021) {
                    if (!method1947(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class589.field8295) {
                            var22 = class171.method1102(5467);
                            var23 = class575.method3288((byte) -119);
                        }
                        if (class643.field8813 == var13 && class530.method3091((byte) 127, class643.field8813) != null) {
                            class363.field5147 = true;
                            class317.field4408 = var14;
                            class457.field6450 = var15;
                        }
                        if (var13.field7066 || var16 < var18 && var17 < var19) {
                            if (var13.field6979 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class357 var24 = (class357) class243.field3247.method2765(-12261); var24 != null; var24 = (class357) class243.field3247.method2759(-15361)) {
                                    if (var24.field5087) {
                                        var24.method1185(-73);
                                        var24.field5082.field7103 = false;
                                    }
                                }
                                if (class76.field985 == 0) {
                                    class643.field8813 = null;
                                    class76.field991 = null;
                                }
                                class242.field3233 = 0;
                                class391.field5527 = false;
                                class147.field2115 = false;
                                if (!class436.field6192) {
                                    class349.method2256(-2);
                                }
                            }
                            boolean var25;
                            if (class530.field7470.method1094(-97) + var22 >= var16 && class530.field7470.method1089((byte) -63) + var23 >= var17 && class530.field7470.method1094(-79) + var22 < var18 && class530.field7470.method1089((byte) -63) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class124.field1491 && var25) {
                                if (var13.field7111 >= 0) {
                                    class86.field1057 = var13.field7111;
                                } else if (var13.field6979) {
                                    class86.field1057 = -1;
                                }
                            }
                            if (!class436.field6192 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class643.method3553(arg11 - var15, (byte) 114, arg10 - var14, var13);
                            }
                            boolean var26 = false;
                            if (class530.field7470.method1098(0) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class382 var28 = (class382) class43.field528.method2765(-12261);
                            if (var28 != null && var28.method778(0) == 0 && var28.method779((byte) -101) + var22 >= var16 && var28.method776(-125) + var23 >= var17 && var28.method779((byte) -94) + var22 < var18 && var28.method776(-116) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field7064 != null && !class274.method1780(false)) {
                                for (int var29 = 0; var29 < var13.field7064.length; var29++) {
                                    if (class589.field8306.method1517(0, var13.field7064[var29])) {
                                        if (var13.field6996 == null || class740.field10285 >= var13.field6996[var29]) {
                                            byte var30 = var13.field7079[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class589.field8306.method1517(0, 86) && !class589.field8306.method1517(0, 82) && !class589.field8306.method1517(0, 81)) && ((var30 & 0x2) == 0 || class589.field8306.method1517(0, 86)) && ((var30 & 0x1) == 0 || class589.field8306.method1517(0, 82)) && ((var30 & 0x4) == 0 || class589.field8306.method1517(0, 81))) {
                                                if (var29 < 10) {
                                                    class481.method2872(var13.field6956, var29 + 1, -1, "", (byte) 124);
                                                } else if (var29 == 10) {
                                                    class37.method210(-1);
                                                    class477 var31 = method1950(var13);
                                                    class243.method1556(var31.method2855(false), var31.field6772, var13, true);
                                                    class291.field4101 = class713.method4011(var13, -10402);
                                                    if (class291.field4101 == null) {
                                                        class291.field4101 = "Null";
                                                    }
                                                    class701.field9774 = var13.field6991 + "<col=ffffff>";
                                                }
                                                int var32 = var13.field7052[var29];
                                                if (var13.field6996 == null) {
                                                    var13.field6996 = new int[var13.field7064.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field6996[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field6996[var29] = class740.field10285 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field6996 != null) {
                                        var13.field6996[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class681.method3817(var23 + var28.method776(-126) - var15, var22 + var28.method779((byte) 58) - var14, true, var13);
                            }
                            if (class643.field8813 != null && class643.field8813 != var13 && var25 && method1950(var13).method2856(9162)) {
                                class10.field235 = var13;
                            }
                            if (class76.field991 == var13) {
                                class403.field5706 = true;
                                class733.field10223 = var14;
                                class424.field5967 = var15;
                            }
                            if (var13.field6947 || var13.field7021 != 0) {
                                if (var25 && class677.field9256 != 0 && var13.field6985 != null) {
                                    class357 var33 = new class357();
                                    var33.field5087 = true;
                                    var33.field5082 = var13;
                                    var33.field5084 = class677.field9256;
                                    var33.field5076 = var13.field6985;
                                    class243.field3247.method2770((byte) -13, var33);
                                }
                                if (class643.field8813 != null || class436.field6192 || class553.field7775 != var13.field7021 && class242.field3233 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field7021 != 0) {
                                    if (class681.field9339 == var13.field7021 || class380.field5437 == var13.field7021) {
                                        class371.field5222 = var13;
                                        if (class745.field10351 != null) {
                                            class745.field10351.method3579(var13.field7031, 12162, class268.field3831);
                                        }
                                        if (class681.field9339 == var13.field7021) {
                                            if (class436.field6192 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class37.method209(116, arg8, class268.field3831, arg9);
                                            class9 var34 = (class9) class230.field3099.method2301(-31182);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label812;
                                                }
                                                if (arg10 >= var34.field132 && arg10 < var34.field136 && arg11 >= var34.field130 && arg11 < var34.field138) {
                                                    class349.method2256(-2);
                                                    class76.method607((byte) 1, var34.field129);
                                                }
                                                var34 = (class9) class230.field3099.method2310(87);
                                            }
                                        }
                                    }
                                    if (class68.field840 == var13.field7021) {
                                        if (var13.method2944((byte) 121, class268.field3831) == null || class454.field6418 != 0 && class454.field6418 != 3 || class436.field6192 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field7081[var36];
                                        if (var35 < var37 || var35 > var13.field7014[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field7095 / 2;
                                        int var39 = var36 - var13.field7031 / 2;
                                        int var40;
                                        if (class97.field1168 == 4) {
                                            var40 = (int) class552.field7773 & 0x3FFF;
                                        } else {
                                            var40 = (int) class552.field7773 + class535.field7520 & 0x3FFF;
                                        }
                                        int var41 = class164.field2258[var40];
                                        int var42 = class164.field2252[var40];
                                        if (class97.field1168 != 4) {
                                            var41 = (class180.field2412 + 256) * var41 >> 8;
                                            var42 = (class180.field2412 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class97.field1168 == 4) {
                                            var45 = (class711.field9884 >> 9) + (var43 >> 2);
                                            var46 = (class354.field5059 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class660.field9039.method1835((byte) 127) - 1) * 256;
                                            var45 = (class660.field9039.field1264 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class660.field9039.field1250 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class124.field1491 && (class351.field4969 & 0x40) != 0) {
                                            class493 var48 = class323.method2083(class58.field710, (byte) 33, class114.field1379);
                                            if (var48 == null) {
                                                class37.method210(-1);
                                            } else {
                                                class635.method3531(false, var46, var13.field6952, class291.field4101, true, class580.field8185, true, 5, (long) (var13.field6944 << 0 | var13.field6956), 1L, " ->", var45, 0);
                                            }
                                            continue;
                                        }
                                        if (class724.field10102 == class633.field8733) {
                                            class635.method3531(false, var46, -1, class71.field923.method588((byte) 124, class549.field7669), true, -1, true, 11, 0L, 1L, "", var45, 0);
                                        }
                                        class635.method3531(false, var46, -1, class218.field2845, true, class758.field10538, true, 21, 0L, 1L, "", var45, 0);
                                        continue;
                                    }
                                    if (class553.field7775 == var13.field7021) {
                                        class230.field3104 = var13;
                                        if (var25) {
                                            class391.field5527 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method779((byte) -84) - var14 - var13.field7095 / 2) * 2.0D / (double) class678.field9281);
                                            int var50 = (int) (-((double) (var23 + var28.method776(-127) - var15 - var13.field7031 / 2) * 2.0D / (double) class678.field9281));
                                            int var51 = class299.field4217 + var49 + class678.field9294;
                                            int var52 = class193.field2580 + var50 + class678.field9304;
                                            class52 var53 = class648.method3574(0);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method320(-127, var54, var51, var52);
                                            if (var54 != null) {
                                                if (class589.field8306.method1517(0, 82) && class399.field5645 > 0) {
                                                    class688.method3846(var54[2], -124, var54[1], var54[0]);
                                                    continue;
                                                }
                                                class147.field2115 = true;
                                                class274.field3905 = var54[0];
                                                class738.field10272 = var54[1];
                                                class465.field6589 = var54[2];
                                            }
                                            class242.field3233 = 1;
                                            class63.field780 = false;
                                            class481.field6800 = class530.field7470.method1094(-105);
                                            class640.field8791 = class530.field7470.method1089((byte) -63);
                                            continue;
                                        }
                                        if (var26 && class242.field3233 > 0) {
                                            if (class242.field3233 == 1 && (class481.field6800 != class530.field7470.method1094(-99) || class640.field8791 != class530.field7470.method1089((byte) -63))) {
                                                class207.field2726 = class299.field4217;
                                                class345.field4858 = class193.field2580;
                                                class242.field3233 = 2;
                                            }
                                            if (class242.field3233 == 2) {
                                                class63.field780 = true;
                                                class223.method1383(class207.field2726 + (int) ((double) (class481.field6800 - class530.field7470.method1094(-124)) * 2.0D / (double) class678.field9282), -70);
                                                class289.method1889(class345.field4858 - (int) ((double) (class640.field8791 - class530.field7470.method1089((byte) -63)) * 2.0D / (double) class678.field9282), -1);
                                            }
                                            continue;
                                        }
                                        if (class242.field3233 > 0 && !class63.field780) {
                                            if ((class499.field7167 == 1 || class349.method2251(1002)) && class25.field341 > 2) {
                                                class718.method4036(true, class481.field6800, class640.field8791);
                                            } else if (class254.method1687((byte) 127)) {
                                                class718.method4036(true, class481.field6800, class640.field8791);
                                            }
                                        }
                                        class242.field3233 = 0;
                                        continue;
                                    }
                                    if (class28.field370 == var13.field7021) {
                                        if (var26) {
                                            class358.method2297(var13.field7095, var13.field7031, var22 + class530.field7470.method1094(-109) - var14, false, var23 + class530.field7470.method1089((byte) -63) - var15);
                                        }
                                        continue;
                                    }
                                    if (class716.field9963 == var13.field7021) {
                                        class746.method4151(var13, var15, -109, var14);
                                        continue;
                                    }
                                }
                                if (!var13.field7086 && var27) {
                                    var13.field7086 = true;
                                    if (var13.field6960 != null) {
                                        class357 var55 = new class357();
                                        var55.field5087 = true;
                                        var55.field5082 = var13;
                                        var55.field5073 = var22 + var28.method779((byte) 76) - var14;
                                        var55.field5084 = var23 + var28.method776(-122) - var15;
                                        var55.field5076 = var13.field6960;
                                        class243.field3247.method2770((byte) -13, var55);
                                    }
                                }
                                if (var13.field7086 && var26 && var13.field7026 != null) {
                                    class357 var56 = new class357();
                                    var56.field5087 = true;
                                    var56.field5082 = var13;
                                    var56.field5073 = var22 + class530.field7470.method1094(-104) - var14;
                                    var56.field5084 = var23 + class530.field7470.method1089((byte) -63) - var15;
                                    var56.field5076 = var13.field7026;
                                    class243.field3247.method2770((byte) -13, var56);
                                }
                                if (var13.field7086 && !var26) {
                                    var13.field7086 = false;
                                    if (var13.field7097 != null) {
                                        class357 var57 = new class357();
                                        var57.field5087 = true;
                                        var57.field5082 = var13;
                                        var57.field5073 = var22 + class530.field7470.method1094(-79) - var14;
                                        var57.field5084 = var23 + class530.field7470.method1089((byte) -63) - var15;
                                        var57.field5076 = var13.field7097;
                                        class367.field5197.method2770((byte) -13, var57);
                                    }
                                }
                                if (var26 && var13.field7094 != null) {
                                    class357 var58 = new class357();
                                    var58.field5087 = true;
                                    var58.field5082 = var13;
                                    var58.field5073 = var22 + class530.field7470.method1094(-91) - var14;
                                    var58.field5084 = var23 + class530.field7470.method1089((byte) -63) - var15;
                                    var58.field5076 = var13.field7094;
                                    class243.field3247.method2770((byte) -13, var58);
                                }
                                if (!var13.field7103 && var25) {
                                    var13.field7103 = true;
                                    if (var13.field7049 != null) {
                                        class357 var59 = new class357();
                                        var59.field5087 = true;
                                        var59.field5082 = var13;
                                        var59.field5073 = var22 + class530.field7470.method1094(-120) - var14;
                                        var59.field5084 = var23 + class530.field7470.method1089((byte) -63) - var15;
                                        var59.field5076 = var13.field7049;
                                        class243.field3247.method2770((byte) -13, var59);
                                    }
                                }
                                if (var13.field7103 && var25 && var13.field7036 != null) {
                                    class357 var60 = new class357();
                                    var60.field5087 = true;
                                    var60.field5082 = var13;
                                    var60.field5073 = var22 + class530.field7470.method1094(-73) - var14;
                                    var60.field5084 = var23 + class530.field7470.method1089((byte) -63) - var15;
                                    var60.field5076 = var13.field7036;
                                    class243.field3247.method2770((byte) -13, var60);
                                }
                                if (var13.field7103 && !var25) {
                                    var13.field7103 = false;
                                    if (var13.field6946 != null) {
                                        class357 var61 = new class357();
                                        var61.field5087 = true;
                                        var61.field5082 = var13;
                                        var61.field5073 = var22 + class530.field7470.method1094(-116) - var14;
                                        var61.field5084 = var23 + class530.field7470.method1089((byte) -63) - var15;
                                        var61.field5076 = var13.field6946;
                                        class367.field5197.method2770((byte) -13, var61);
                                    }
                                }
                                if (var13.field7110 != null) {
                                    class357 var62 = new class357();
                                    var62.field5082 = var13;
                                    var62.field5076 = var13.field7110;
                                    class176.field2362.method2770((byte) -13, var62);
                                }
                                if (var13.field7000 != null && class592.field8348 > var13.field7084) {
                                    if (var13.field6986 == null || class592.field8348 - var13.field7084 > 32) {
                                        class357 var67 = new class357();
                                        var67.field5082 = var13;
                                        var67.field5076 = var13.field7000;
                                        class243.field3247.method2770((byte) -13, var67);
                                    } else {
                                        label699: for (int var63 = var13.field7084; var63 < class592.field8348; var63++) {
                                            int var64 = class380.field5446[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field6986.length; var65++) {
                                                if (var13.field6986[var65] == var64) {
                                                    class357 var66 = new class357();
                                                    var66.field5082 = var13;
                                                    var66.field5076 = var13.field7000;
                                                    class243.field3247.method2770((byte) -13, var66);
                                                    break label699;
                                                }
                                            }
                                        }
                                    }
                                    var13.field7084 = class592.field8348;
                                }
                                if (var13.field7060 != null && class519.field7377 > var13.field7114) {
                                    if (var13.field7113 == null || class519.field7377 - var13.field7114 > 32) {
                                        class357 var72 = new class357();
                                        var72.field5082 = var13;
                                        var72.field5076 = var13.field7060;
                                        class243.field3247.method2770((byte) -13, var72);
                                    } else {
                                        label675: for (int var68 = var13.field7114; var68 < class519.field7377; var68++) {
                                            int var69 = class640.field8793[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field7113.length; var70++) {
                                                if (var13.field7113[var70] == var69) {
                                                    class357 var71 = new class357();
                                                    var71.field5082 = var13;
                                                    var71.field5076 = var13.field7060;
                                                    class243.field3247.method2770((byte) -13, var71);
                                                    break label675;
                                                }
                                            }
                                        }
                                    }
                                    var13.field7114 = class519.field7377;
                                }
                                if (var13.field6948 != null && class690.field9427 > var13.field6963) {
                                    if (var13.field7089 == null || class690.field9427 - var13.field6963 > 32) {
                                        class357 var77 = new class357();
                                        var77.field5082 = var13;
                                        var77.field5076 = var13.field6948;
                                        class243.field3247.method2770((byte) -13, var77);
                                    } else {
                                        label651: for (int var73 = var13.field6963; var73 < class690.field9427; var73++) {
                                            int var74 = class219.field2858[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field7089.length; var75++) {
                                                if (var13.field7089[var75] == var74) {
                                                    class357 var76 = new class357();
                                                    var76.field5082 = var13;
                                                    var76.field5076 = var13.field6948;
                                                    class243.field3247.method2770((byte) -13, var76);
                                                    break label651;
                                                }
                                            }
                                        }
                                    }
                                    var13.field6963 = class690.field9427;
                                }
                                if (var13.field7115 != null && class286.field4059 > var13.field7069) {
                                    if (var13.field7008 == null || class286.field4059 - var13.field7069 > 32) {
                                        class357 var82 = new class357();
                                        var82.field5082 = var13;
                                        var82.field5076 = var13.field7115;
                                        class243.field3247.method2770((byte) -13, var82);
                                    } else {
                                        label627: for (int var78 = var13.field7069; var78 < class286.field4059; var78++) {
                                            int var79 = class93.field1089[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field7008.length; var80++) {
                                                if (var13.field7008[var80] == var79) {
                                                    class357 var81 = new class357();
                                                    var81.field5082 = var13;
                                                    var81.field5076 = var13.field7115;
                                                    class243.field3247.method2770((byte) -13, var81);
                                                    break label627;
                                                }
                                            }
                                        }
                                    }
                                    var13.field7069 = class286.field4059;
                                }
                                if (var13.field6988 != null && class366.field5193 > var13.field7055) {
                                    if (var13.field7022 == null || class366.field5193 - var13.field7055 > 32) {
                                        class357 var87 = new class357();
                                        var87.field5082 = var13;
                                        var87.field5076 = var13.field6988;
                                        class243.field3247.method2770((byte) -13, var87);
                                    } else {
                                        label603: for (int var83 = var13.field7055; var83 < class366.field5193; var83++) {
                                            int var84 = class489.field6915[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field7022.length; var85++) {
                                                if (var13.field7022[var85] == var84) {
                                                    class357 var86 = new class357();
                                                    var86.field5082 = var13;
                                                    var86.field5076 = var13.field6988;
                                                    class243.field3247.method2770((byte) -13, var86);
                                                    break label603;
                                                }
                                            }
                                        }
                                    }
                                    var13.field7055 = class366.field5193;
                                }
                                if (class312.field4326 > var13.field6974 && var13.field7032 != null) {
                                    class357 var88 = new class357();
                                    var88.field5082 = var13;
                                    var88.field5076 = var13.field7032;
                                    class243.field3247.method2770((byte) -13, var88);
                                }
                                if (class459.field6465 > var13.field6974 && var13.field6957 != null) {
                                    class357 var89 = new class357();
                                    var89.field5082 = var13;
                                    var89.field5076 = var13.field6957;
                                    class243.field3247.method2770((byte) -13, var89);
                                }
                                if (class543.field7581 > var13.field6974 && var13.field7085 != null) {
                                    class357 var90 = new class357();
                                    var90.field5082 = var13;
                                    var90.field5076 = var13.field7085;
                                    class243.field3247.method2770((byte) -13, var90);
                                }
                                if (class185.field2503 > var13.field6974 && var13.field7108 != null) {
                                    class357 var91 = new class357();
                                    var91.field5082 = var13;
                                    var91.field5076 = var13.field7108;
                                    class243.field3247.method2770((byte) -13, var91);
                                }
                                if (class542.field7578 > var13.field6974 && var13.field6965 != null) {
                                    class357 var92 = new class357();
                                    var92.field5082 = var13;
                                    var92.field5076 = var13.field6965;
                                    class243.field3247.method2770((byte) -13, var92);
                                }
                                var13.field6974 = class2.field13;
                                if (var13.field7058 != null) {
                                    for (int var93 = 0; var93 < class101.field1206; var93++) {
                                        class357 var94 = new class357();
                                        var94.field5082 = var13;
                                        var94.field5085 = class462.field6504[var93].method699(125);
                                        var94.field5072 = class462.field6504[var93].method697(4152);
                                        var94.field5076 = var13.field7058;
                                        class243.field3247.method2770((byte) -13, var94);
                                    }
                                }
                                if (class589.field8305 && var13.field6999 != null) {
                                    class357 var95 = new class357();
                                    var95.field5082 = var13;
                                    var95.field5076 = var13.field6999;
                                    class243.field3247.method2770((byte) -13, var95);
                                }
                            }
                            if (var13.field7016 == 5 && var13.field7088 != -1) {
                                var13.method2936(-121, class192.field2556, class6.field64).method3579(var13.field7031, 12162, class268.field3831);
                            }
                            class77.method613(73, var13);
                            if (var13.field7016 == 0) {
                                method1952(arg0, var13.field6956, var16, var17, var18, var19, var14 - var13.field7046, var15 - var13.field7073, arg8, arg9, arg10, arg11);
                                if (var13.field7009 != null) {
                                    method1952(var13.field7009, var13.field6956, var16, var17, var18, var19, var14 - var13.field7046, var15 - var13.field7073, arg8, arg9, arg10, arg11);
                                }
                                class47 var96 = (class47) class475.field6744.method1180((byte) 26, (long) var13.field6956);
                                if (var96 != null) {
                                    if (class633.field8733 == class556.field7800 && var96.field553 == 0 && !class436.field6192 && var25 && !class600.field8422) {
                                        class349.method2256(-2);
                                    }
                                    class349.method2252(var16, var17, var19, var15, arg9, -1, arg11, var14, arg10, var18, var96.field550, arg8);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class77.method613(63, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ljb;)Ljb;", line = 1101)
    public static final class493 method1953(class493 arg0) {
        int var1 = method1950(arg0).method2852(-1);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class127.method854((byte) -109, arg0.field7078);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 1121)
    public static final void method1954(int arg0) {
        int var1 = class578.field8168;
        int[] var2 = class240.field3201;
        for (int var3 = 0; var3 < class344.field4849 + var1; var3++) {
            class564 var4;
            if (var3 < var1) {
                var4 = class309.field4311[var2[var3]];
            } else {
                var4 = ((class740) class373.field5230.method1180((byte) 26, (long) class100.field1196[var3 - var1])).field10289;
            }
            if (var4.field1266 == arg0 && var4.field7985 >= 0) {
                int var5 = var4.method1835((byte) 127);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field1264 & 0x1FF) != 0 || (var4.field1250 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field1264 & 0x1FF) != 256 || (var4.field1250 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field1264 >> 9;
                    int var7 = var4.field1250 >> 9;
                    if (var4.field7985 > class662.field9064[var6][var7]) {
                        class662.field9064[var6][var7] = var4.field7985;
                        class115.field1388[var6][var7] = 1;
                    } else if (class662.field9064[var6][var7] == var4.field7985) {
                        var10002 = class115.field1388[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field1264 - var8 >> 9;
                    int var10 = var4.field1250 - var8 >> 9;
                    int var11 = var4.field1264 + var8 >> 9;
                    int var12 = var4.field1250 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field7985 > class662.field9064[var13][var14]) {
                                class662.field9064[var13][var14] = var4.field7985;
                                class115.field1388[var13][var14] = 1;
                            } else if (class662.field9064[var13][var14] == var4.field7985) {
                                var10002 = class115.field1388[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 1221)
    public final void method1955(byte arg0) {
        if (class476.field6748) {
            class642.method3550(false);
        }
        field4224++;
        class721.method4051(-19310);
        if (class268.field3831 != null) {
            class268.field3831.method474(1);
        }
        if (class272.field3891 != null) {
            class3.method13(class202.field2644, (byte) -104, class272.field3891);
            class272.field3891 = null;
        }
        if (class333.field4663 != null) {
            class333.field4663.method2844(arg0 ^ 0x80000067);
            class333.field4663 = null;
        }
        class180.method1139((byte) -95);
        class25.field349.method3404((byte) -65);
        class729.field10187.method2326(arg0 - 106);
        if (class19.field291 != null) {
            class19.field291.method4075((byte) 76);
            class19.field291 = null;
        }
        try {
            class286.field4060.method2586(true);
            if (arg0 != 103) {
                method1970();
            }
            for (int var2 = 0; var2 < 37; var2++) {
                class699.field9762[var2].method2586(true);
            }
            class46.field547.method2586(true);
            class209.field2757.method2586(true);
            class290.method1892(false);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1274)
    public final void init() {
        field4237++;
        if (!this.method2204(false)) {
            return;
        }
        class553.field7777 = new class748();
        class553.field7777.field10399 = Integer.parseInt(this.getParameter("worldid"));
        class343.field4784 = new class748();
        class343.field4784.field10399 = Integer.parseInt(this.getParameter("lobbyid"));
        class343.field4784.field10402 = this.getParameter("lobbyaddress");
        class552.field7772 = new class748();
        class552.field7772.field10399 = Integer.parseInt(this.getParameter("demoid"));
        class552.field7772.field10402 = this.getParameter("demoaddress");
        class277.field3922 = class498.method2967((byte) -9, Integer.parseInt(this.getParameter("modewhere")));
        if (class277.field3922 == class209.field2756) {
            class277.field3922 = class440.field6257;
        } else if (!class458.method2721(class277.field3922, 70) && class408.field5781 != class277.field3922) {
            class277.field3922 = class408.field5781;
        }
        class28.field378 = class279.method1828(26496, Integer.parseInt(this.getParameter("modewhat")));
        if (class622.field8663 != class28.field378 && class28.field378 != class105.field1257 && class28.field378 != class186.field2504) {
            class28.field378 = class186.field2504;
        }
        try {
            class549.field7669 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class549.field7669 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class387.field5485 = true;
        } else {
            class387.field5485 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class100.field1195 = true;
        } else {
            class100.field1195 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class755.field10504 = true;
        } else {
            class755.field10504 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class633.field8733 = class556.field7800;
            } else if (var4.equals("1")) {
                class633.field8733 = class724.field10102;
            } else if (var4.equals("2")) {
                class633.field8733 = class652.field8949;
            } else if (var4.equals("3")) {
                class633.field8733 = class538.field7546;
            }
        }
        try {
            class638.field8771 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class638.field8771 = 0;
        }
        class110.field1326 = this.getParameter("quiturl");
        class614.field8594 = this.getParameter("settings");
        if (class614.field8594 == null) {
            class614.field8594 = "";
        }
        class225.field3036 = "1".equals(this.getParameter("under"));
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class279.field3942 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class279.field3942 = 0;
            }
        }
        class55.field642 = Integer.parseInt(this.getParameter("colourid"));
        if (class55.field642 < 0 || class709.field9838.length <= class55.field642) {
            class55.field642 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class310.field4315 = true;
            class758.field10534 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class472.field6695 = true;
        }
        class448.field6360 = this.getParameter("sskey");
        if (class448.field6360 != null && class448.field6360.length() < 2) {
            class448.field6360 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class199.field2623 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class273.field3901 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class3.field32 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class246.field3287 = this.getParameter("additionalInfo");
        if (class246.field3287 != null && class246.field3287.length() > 50) {
            class246.field3287 = null;
        }
        class499.field7161 = this;
        if (class633.field8733 == class556.field7800) {
            class191.field2553 = 503;
            class192.field2561 = 765;
        } else if (class724.field10102 == class633.field8733) {
            class192.field2561 = 640;
            class191.field2553 = 480;
        }
        this.method2211(class192.field2561, 37, class28.field378.method2261(58) + 32, class191.field2553, class633.field8733.field4514, -127, 633);
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 1439)
    public static void method1956(int arg0) {
        field4223 = null;
        if (arg0 <= 116) {
            field4223 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 1449)
    public final String method1957(boolean arg0) {
        field4232++;
        String var2 = null;
        try {
            var2 = "[1)" + class228.field3063 + "," + class3.field30 + "," + class336.field4683 + "," + class700.field9768 + "|";
            if (class660.field9039 != null) {
                var2 = var2 + "2)" + class526.field7430 + "," + (class660.field9039.field8009[0] + class228.field3063) + "," + (class660.field9039.field8015[0] + class3.field30) + "|";
            }
            var2 = var2 + "3)" + class557.field7812.field6521.method2556(!arg0) + "|4)" + class557.field7812.field6537.method3560(!arg0) + "|5)" + class605.method3408((byte) 54) + "|6)" + class446.field6323 + "," + class172.field2348 + "|";
            var2 = var2 + "7)" + class557.field7812.field6548.method20(false) + "|";
            var2 = var2 + "8)" + class557.field7812.field6542.method1222(!arg0) + "|";
            var2 = var2 + "9)" + class557.field7812.field6520.method77(!arg0) + "|";
            var2 = var2 + "10)" + class557.field7812.field6522.method2865(false) + "|";
            var2 = var2 + "11)" + class557.field7812.field6524.method2217(false) + "|";
            var2 = var2 + "12)" + class557.field7812.field6532.method1419(false) + "|";
            var2 = var2 + "13)" + class698.field9627 + "|";
            var2 = var2 + "14)" + class222.field2897;
            if (!arg0) {
                field4223 = null;
            }
            if (class470.field6666 != null) {
                var2 = var2 + "|15)" + class470.field6666.field5558;
            }
            try {
                if (class557.field7812.field6521.method2556(false) == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field4240 == null ? (field4240 = method1971("client")) : field4240).getClassLoader());
                    for (int var8 = 0; var7.size() > var8; var8++) {
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
            } catch (Throwable var15) {
            }
            var2 = var2 + "]";
        } catch (Throwable var16) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 1534)
    private final void method1958(byte arg0) {
        if (class222.field2897 == 7 && class215.field2831 == 0) {
            if (class561.field7879 > 1) {
                class561.field7879--;
                class542.field7578 = class2.field13;
            }
            if (!class436.field6192) {
                class349.method2256(arg0 + 69);
            }
            for (int var2 = 0; var2 < 100 && class363.method2317(arg0 ^ 0x74); var2++) {
            }
        }
        field4231++;
        class144.field2064++;
        class545.method3156(-1, -1, null, 0);
        if (arg0 != -71) {
            field4223 = null;
        }
        class746.method4151(null, -1, -104, -1);
        class485.method2906(arg0 ^ 0xFFFFFFA0);
        class2.field13++;
        for (int var3 = 0; var3 < class438.field6239; var3++) {
            class468 var4 = class30.field399[var3].field10289;
            if (var4 != null) {
                byte var5 = var4.field6632.field5002;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method1835((byte) 127);
                    if ((var5 & 0x2) != 0 && var4.field8014 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field8009[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > class336.field4683 - var6 - 1) {
                                var9 = class336.field4683 - var6 - 1;
                            }
                            int var10 = var4.field8015[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if ((class700.field9768 - var6 - 1) < var10) {
                                var10 = class700.field9768 - var6 - 1;
                            }
                            int var11 = class511.method3019(var6, var4.field8009[0], var4.field8015[0], 0, -29375, var6, var6, var10, var9, class566.field8043, 0, class64.field784, class147.field2114[var4.field1266], -1, true);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field8009[var12] = class64.field784[var11 - var12 - 1];
                                    var4.field8015[var12] = class566.field8043[var11 - var12 - 1];
                                    var4.field8011[var12] = 1;
                                }
                                var4.field8014 = var11;
                            }
                        }
                    }
                    class347.method2243(true, (byte) 60, var4);
                    int var13 = class150.method1024(var4, (byte) -125);
                    class114.method798(var4, (byte) 49);
                    class293.method1907(class36.field457, var13, 1, class381.field5459, var4);
                    class245.method1565(class381.field5459, var4, -1);
                    class582.method3307(false, var4);
                }
            }
        }
        if (class215.field2831 == 0 && class69.field856 == 0) {
            if (class97.field1168 == 2) {
                class208.method1272(-256);
            } else {
                class352.method2270((byte) 126);
            }
            if ((class511.field7303 >> 9) < 14 || class511.field7303 >> 9 >= class336.field4683 - 14 || class32.field426 >> 9 < 14 || class32.field426 >> 9 >= class700.field9768 - 14) {
                class135.method961(8);
            }
        }
        while (true) {
            class357 var14;
            class493 var15;
            class493 var16;
            do {
                var14 = (class357) class176.field2362.method2762((byte) -16);
                if (var14 == null) {
                    while (true) {
                        class357 var17;
                        class493 var18;
                        class493 var19;
                        do {
                            var17 = (class357) class367.field5197.method2762((byte) -16);
                            if (var17 == null) {
                                while (true) {
                                    class357 var20;
                                    class493 var21;
                                    class493 var22;
                                    do {
                                        var20 = (class357) class243.field3247.method2762((byte) -16);
                                        if (var20 == null) {
                                            if (class643.field8813 != null) {
                                                class530.method3092(31167);
                                            }
                                            if (class740.field10285 % 1500 == 0) {
                                                class193.method1197(arg0 ^ 0x3C);
                                            }
                                            if (class222.field2897 == 7 && class215.field2831 == 0) {
                                                class124.method841(-30726);
                                            }
                                            class485.method2905(arg0 ^ 0xFFFFFFCB);
                                            if (class476.field6748 && (class479.method2864((byte) -54) - 60000L) > class13.field248) {
                                                class642.method3550(false);
                                            }
                                            for (class742 var23 = (class742) class454.field6413.method2301(-31182); var23 != null; var23 = (class742) class454.field6413.method2310(arg0 + 170)) {
                                                if (class479.method2864((byte) -69) / 1000L - 5L > (long) var23.field10312) {
                                                    if (var23.field10313 > 0) {
                                                        class336.method2182(-119, var23.field10314 + class71.field915.method588((byte) 106, class549.field7669), "", 0, "", "", 5);
                                                    }
                                                    if (var23.field10313 == 0) {
                                                        class336.method2182(-98, var23.field10314 + class71.field916.method588((byte) 91, class549.field7669), "", 0, "", "", 5);
                                                    }
                                                    var23.method3646((byte) -109);
                                                }
                                            }
                                            if (class222.field2897 == 7 && class215.field2831 == 0) {
                                                if (class333.field4663 == null) {
                                                    class415.method2550(false, -25626);
                                                    return;
                                                }
                                                class522.field7400++;
                                                if (class522.field7400 > 50) {
                                                    class549.field7661++;
                                                    class519 var24 = class357.method2293(class427.field5994, class112.field1371, (byte) -43);
                                                    class151.method1027(var24, arg0 - 30);
                                                }
                                                try {
                                                    class390.method2455((byte) 102);
                                                    return;
                                                } catch (IOException var25) {
                                                    class415.method2550(false, arg0 - 25555);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field5082;
                                        if (var21.field6944 < 0) {
                                            break;
                                        }
                                        var22 = class127.method854((byte) -96, var21.field7078);
                                    } while (var22 == null || var22.field7009 == null || var21.field6944 >= var22.field7009.length || var22.field7009[var21.field6944] != var21);
                                    class241.method1543(var20);
                                }
                            }
                            var18 = var17.field5082;
                            if (var18.field6944 < 0) {
                                break;
                            }
                            var19 = class127.method854((byte) -101, var18.field7078);
                        } while (var19 == null || var19.field7009 == null || var18.field6944 >= var19.field7009.length || var19.field7009[var18.field6944] != var18);
                        class241.method1543(var17);
                    }
                }
                var15 = var14.field5082;
                if (var15.field6944 < 0) {
                    break;
                }
                var16 = class127.method854((byte) -106, var15.field7078);
            } while (var16 == null || var16.field7009 == null || var15.field6944 >= var16.field7009.length || var16.field7009[var15.field6944] != var15);
            class241.method1543(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 1815)
    private final void method1959(int arg0, int arg1) {
        class270.field3874 = 0;
        class659.field9022 = null;
        class25.field349.field8514++;
        field4228++;
        class25.field349.field8516 = arg0;
        int var3 = -12 % ((arg1 + 41) / 58);
        class633.field8729 = null;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 1831)
    public final void method1960(int arg0) {
        int var2 = 98 / ((-arg0 - 56) / 52);
        field4230++;
        if (class557.field7812.field6521.method2556(false) != 2) {
            this.method1968((byte) 89);
            return;
        }
        try {
            this.method1968((byte) 103);
        } catch (ThreadDeath var5) {
            throw var5;
        } catch (Throwable var6) {
            class248.method1583((byte) -51, var6.getMessage() + " (Recovered) " + this.method1957(true), var6);
            class167.field2289 = true;
            class759.method4212(false, 0, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 1861)
    public final void method1961(byte arg0) {
        field4236++;
        method1956(123);
        class140.method986(false);
        class481.method2871(true);
        class592.method3346((byte) -16);
        class71.method591(-83);
        class237.method1518(-111);
        class747.method4154(8);
        class461.method2740(24);
        class647.method3573(29400);
        class199.method1221(-1608275071);
        class448.method2677(-3053);
        class583.method3309(0);
        class711.method4005((byte) -121);
        class341.method2212((byte) -49);
        class335.method2181((byte) 125);
        class350.method2262(-25086);
        class13.method84(-12320);
        class326.method2124((byte) -31);
        class513.method3022(true);
        class58.method388((byte) 103);
        class393.method2472((byte) -22);
        class584.method3313(112);
        class464.method2758(2);
        class546.method3164(-109);
        class605.method3409(-105);
        class723.method4061((byte) -106);
        class323.method2085((byte) 12);
        class421.method2580((byte) -121);
        class263.method1722(-28916);
        class714.method4017(27927);
        class625.method3509(true);
        class687.method3843(true);
        class291.method1901(true);
        class111.method785(-118);
        class337.method2188(true);
        class307.method2004(-93);
        class36.method203((byte) -12);
        class67.method559(false);
        class530.method3089((byte) -32);
        class226.method1413((byte) 18);
        class607.method3419(155);
        class25.method156(0);
        class195.method1201(-128);
        class633.method3524(24);
        class302.method1978(7);
        class677.method3777((byte) -99);
        class138.method976((byte) 120);
        class222.method1356(22311);
        class436.method2640((byte) 96);
        class30.method177(-1);
        class720.method4045(15);
        class141.method989(2);
        class591.method3342(1);
        class740.method4134(0);
        class724.method4073(false);
        class682.method3823((byte) 83);
        class98.method717(-123);
        class725.method4079(-123);
        class452.method2699(9413);
        class285.method1864(-3570);
        class735.method4112(17518);
        class52.method324((byte) -98);
        class38.method215((byte) 111);
        class650.method3581(-1);
        class360.method2311(0);
        class493.method2940(58);
        class611.method3432(-1);
        class280.method1841((byte) -113);
        class172.method1106(false);
        class400.method2498(-1);
        class675.method3716((byte) -118);
        class519.method3042(83);
        class165.method1083(-110);
        class60.method513(2);
        class639.method3544(103);
        class47.method305((byte) -38);
        class175.method1117(-10550);
        class84.method643((byte) 44);
        class670.method3645((byte) -13);
        class582.method3308(-120);
        class661.method3628((byte) 119);
        class479.method2863((byte) 83);
        class236.method1516(-6958);
        class622.method3495((byte) -112);
        class287.method1882(-3759);
        class434.method2638(110);
        class748.method4155((byte) 14);
        class665.method3636((byte) -121);
        class738.method4125(0);
        class134.method959(false);
        class103.method732(0);
        class529.method3082(4);
        class64.method542(30000);
        class680.method3811((byte) 102);
        class621.method3487((byte) 68);
        class709.method3977((byte) -74);
        class132.method957(-20435);
        class471.method2816(120);
        class634.method3528(12);
        class418.method2568(true);
        class194.method1200(14006);
        class394.method2478(-15443);
        class10.method66(-36);
        class6.method32(true);
        class102.method731(96);
        class278.method1814(5871);
        class551.method3188(107);
        class59.method501(15578);
        class178.method1127(-114);
        class343.method2216((byte) -126);
        class595.method3354(12165);
        class562.method3238(0);
        class213.method1309(false);
        class745.method4147((byte) 96);
        class4.method18((byte) -123);
        class200.method1223(-1);
        class115.method804(35);
        class734.method4105((byte) 125);
        class202.method1228(9564);
        class480.method2868(true);
        class227.method1420((byte) -64);
        class11.method79(12275);
        class43.method287(false);
        class333.method2178((byte) 106);
        class374.method2352(-122);
        class211.method1302(-129);
        class139.method981(-94);
        class515.method3031(true);
        class322.method2075(116);
        class423.method2590(109);
        class603.method3387((byte) 121);
        class76.method606((byte) 1);
        class486.method2908(107);
        class413.method2539(-1);
        class465.method2775(-122);
        class272.method1773((byte) -73);
        class105.method745(-17340);
        class398.method2490((byte) -62);
        class498.method2965(4);
        class241.method1533();
        class352.method2271(-1);
        class248.method1580(true);
        class298.method1926(-2);
        class554.method3207(-438808511);
        class70.method577(-1);
        class560.method3226(-28855);
        class152.method1029(256);
        class234.method1505(0);
        class147.method1017(0);
        class252.method1673(4);
        class701.method3950(0);
        class727.method4087(false);
        class62.method529(3198);
        class681.method3814(-1141);
        class170.method1101(99);
        class626.method3515((byte) -67);
        class617.method3447((byte) -63);
        class441.method2659(115);
        class455.method2704((byte) -104);
        class678.method3799();
        class710.method3985((byte) -65);
        class534.method3103((byte) -105);
        class457.method2715(-1);
        class518.method3039((byte) -99);
        class492.method2931((byte) 5);
        class489.method2922((byte) -116);
        class3.method10((byte) -68);
        class120.method827(2);
        class470.method2804((byte) -117);
        class91.method686(16491);
        class466.method2783(-67);
        class387.method2440(-46);
        class566.method3264(false);
        class325.method2114(-20169);
        class537.method3109();
        class224.method1403(-102);
        class31.method182(127);
        class107.method767(true);
        class97.method713(16711680);
        class197.method1211(126);
        class553.method3201(123);
        class69.method572(30328);
        class383.method2432((byte) 62);
        class507.method2998(128);
        class344.method2231(false);
        class80.method629();
        class462.method2743(87);
        class516.method3036((byte) 124);
        class609.method3429((byte) -93);
        class166.method1084(false);
        class357.method2296(false);
        class648.method3575(94);
        class233.method1500((byte) -64);
        class303.method1981(64);
        class244.method1558(16);
        class77.method620(123);
        class444.method2669(-118);
        class458.method2723((byte) 123);
        class356.method2288((byte) 46);
        class180.method1138((byte) -76);
        class432.method2634((byte) 126);
        class585.method3321();
        class531.method3097(true);
        class253.method1679(-1);
        class271.method1768(114);
        class79.method624((byte) -27);
        class250.method1586();
        class95.method702(19);
        class523.method3061((byte) 103);
        class231.method1497(256);
        class163.method1076();
        class729.method4094(109);
        class408.method2525(-10869);
        class100.method725(127);
        class192.method1191(-29278);
        class293.method1905(-119);
        class689.method3851(-31693);
        class728.method4093(78);
        class44.method292((byte) -122);
        class692.method3894(true);
        class694.method3917(true);
        class125.method847((byte) 3);
        class219.method1343(105);
        class487.method2910(255);
        class503.method2982((byte) 103);
        class191.method1190((byte) -91);
        class657.method3608(8);
        class228.method1423(-3778);
        class420.method2575(-32084);
        class218.method1339(255);
        class533.method3100(60);
        class445.method2673(false);
        class659.method3617(-32);
        class286.method1876(3);
        class243.method1554(0);
        class315.method2035(0);
        class9.method56(-49);
        class182.method1146((byte) 111);
        class596.method3358(-41);
        class35.method196(-27527);
        class601.method3372(127);
        class366.method2340(true);
        class151.method1026(-103);
        class279.method1827((byte) -109);
        class114.method800(false);
        class89.method677((byte) 30);
        class716.method4033(-99);
        class676.method3759(0);
        class129.method870(true);
        class746.method4152(-28097);
        class440.method2657(-115);
        class24.method151(-18169);
        class741.method4137(true);
        class565.method3257(1);
        class32.method189((byte) -86);
        class108.method770((byte) -104);
        class124.method843(32);
        class358.method2299(114);
        class145.method1007(-119);
        class704.method3959((byte) 72);
        class273.method1779(14);
        class342.method2213((byte) 122);
        class578.method3295(false);
        class502.method2981(8720);
        class597.method3362(7407);
        class449.method2691((byte) 111);
        class346.method2241((byte) 86);
        class500.method2976((byte) 108);
        class206.method1268(true);
        class104.method741(-18226);
        class419.method2574((byte) -128);
        class288.method1885(2);
        class230.method1494(4067);
        class733.method4104(true);
        class686.method3838(true);
        class310.method2016(-118);
        class146.method1013(512);
        class281.method1845((byte) 17);
        class247.method1578();
        class576.method3293((byte) -121);
        class451.method2696((byte) -123);
        class162.method1067((byte) 111);
        class640.method3548(-127);
        class476.method2849((byte) -114);
        class347.method2246(-1);
        class417.method2561(118);
        class557.method3215(-106);
        class429.method2621((byte) -90);
        class575.method3291(true);
        class473.method2827((byte) 124);
        class756.method4202(17511);
        class427.method2603((byte) 102);
        class157.method1049(-125);
        class439.method2654(-74);
        class510.method3015(8);
        class317.method2058(-1);
        class405.method2517(4);
        class521.method3051();
        class176.method1120(-2);
        class282.method1853();
        class528.method3071();
        class150.method1025(9);
        class311.method2018();
        class185.method1169(3);
        class118.method822(-1);
        class707.method3970(-90);
        class56.method368(0);
        class23.method147(48);
        class33.method193(58);
        class467.method2787((byte) -92);
        class719.method4038(117);
        class167.method1086((byte) 74);
        class656.method3604(58);
        class571.method3280((byte) 82);
        class164.method1080((byte) -123);
        class220.method1350((byte) 36);
        class8.method48(11);
        class254.method1686(30);
        class608.method3426(-119);
        class54.method334(79);
        class522.method3060(true);
        class556.method3212(false);
        class22.method138();
        class332.method2175((byte) 57);
        class402.method2510((byte) 87);
        class638.method3540(1844);
        class511.method3017(-4220);
        class668.method3643(false);
        class376.method2364(-7050);
        class674.method3683(0);
        class403.method2511((byte) 121);
        class93.method692(2);
        class430.method2631(true);
        class509.method3005(100);
        class568.method3272(-109);
        class636.method3535((byte) 109);
        class240.method1528(72);
        class355.method2286((byte) -56);
        class504.method2987(false);
        class1.method2(120);
        class577.method3294((byte) -122);
        class456.method2710((byte) -22);
        class593.method3353(-123);
        class496.method2963(-7045);
        class722.method4052(false);
        class131.method949(-68);
        class424.method2594(-21052);
        class409.method2532((byte) -122);
        class116.method814(1);
        class703.method3955(64);
        class55.method343(6);
        class561.method3234(1);
        class401.method2503(1278894712);
        class269.method1764(109);
        class210.method1287(-22076);
        class615.method3443(14701);
        class318.method2065(0);
        class364.method2321(-118);
        class428.method2609(0);
        class186.method1171(20816);
        class267.method1744(1);
        class251.method1597(0);
        class295.method1921(-105);
        class309.method2011((byte) -117);
        class698.method3926(86);
        class266.method1738(11677);
        class758.method4208(true);
        class559.method3220((byte) 124);
        class606.method3413(111);
        class112.method793(39);
        class705.method3962(true);
        class679.method3803(13);
        class542.method3148((byte) -73);
        class699.method3942((byte) -96);
        class505.method2992((byte) 76);
        class155.method1041(true);
        class459.method2725(119);
        class207.method1269(true);
        class378.method2370((byte) 86);
        class245.method1566(30386);
        class40.method274();
        class499.method2971(0);
        class662.method3630(-128);
        class34.method194(4096);
        class588.method3329((byte) -14);
        class370.method2345((byte) -97);
        class373.method2349(4);
        class540.method3126(-4096);
        class277.method1806(-111);
        class148.method1019(-124);
        class580.method3304(true);
        class579.method3299(1);
        class29.method172((byte) 18);
        class643.method3554(-75);
        class260.method1702(-7286);
        class614.method3438(true);
        class5.method26((byte) 35);
        class363.method2318((byte) -128);
        class598.method3366((byte) -88);
        class426.method2599((byte) 81);
        class642.method3551((byte) -106);
        class718.method4037(2535);
        class239.method1526(0);
        class660.method3619(0);
        class184.method1164((byte) 32);
        class600.method3368((byte) 127);
        class695.method3919((byte) 124);
        class422.method2589(-17189);
        class246.method1569(true);
        class589.method3333(1);
        int var2 = 81 % ((-arg0 - 71) / 36);
        class590.method3336(-47);
        class567.method3266(-1);
        class543.method3151(-1);
        class83.method639();
        class160.method1058((byte) 123);
        class86.method648(0);
        class488.method2921(40);
        class209.method1278(-117);
        class395.method2480((byte) -120);
        class731.method4102(0);
        class268.method1748(-1);
        class321.method2069((byte) 53);
        class604.method3393(-126);
        class631.method3519(117);
        class538.method3124(16);
        class654.method3600(93);
        class549.method3178(230);
        class340.method2196(-122);
        class397.method2482(false);
        class274.method1782(false);
        class380.method2423((byte) 53);
        class558.method3218(-22339);
        class563.method3241((byte) 64);
        class390.method2453(-65534);
        class225.method1409(34);
        class475.method2842(0);
        class404.method2513((byte) 52);
        class371.method2347((byte) 70);
        class377.method2365(true);
        class506.method2995(-128);
        class235.method1510((byte) -85);
        class294.method1916((byte) -122);
        class673.method3680(-28581);
        class19.method120(36);
        class443.method2667(0);
        class232.method1499(96);
        class485.method2907(421);
        class130.method872((byte) -86);
        class28.method166((byte) -116);
        class569.method3276((byte) -111);
        class18.method114(-1);
        class174.method1112(0);
        class203.method1233((byte) 56);
        class726.method4083(123);
        class389.method2450(-1);
        class750.method4167((byte) -122);
        class135.method962(-6804);
        class573.method3287(118);
        class552.method3200((byte) 93);
        class158.method1054((byte) 38);
        class367.method2342(90);
        class61.method522((byte) -82);
        class20.method126(-26913);
        class755.method4199(true);
        class90.method680(2);
        class215.method1319(94);
        class133.method958(-119);
        class453.method2700((byte) 105);
        class349.method2254((byte) -104);
        class48.method308(-5620);
        class454.method2702((byte) 81);
        class450.method2693(5);
        class336.method2183(0);
        class757.method4206((byte) 56);
        class2.method9(-12529);
        class85.method645(-76);
        class289.method1891((byte) -26);
        class739.method4126(false);
        class658.method3615(1388);
        class527.method3070(-31681);
        class472.method2822((byte) -74);
        class65.method546((byte) 25);
        class110.method782(-3625);
        class392.method2466((byte) 28);
        class414.method2542(-4);
        class649.method3577((byte) -114);
        class651.method3585(-42);
        class296.method1923(true);
        class101.method727((byte) -108);
        class655.method3602((byte) 74);
        class128.method858(false);
        class478.method2860(false);
        class299.method1943(-15784);
        class171.method1103(-110);
        class713.method4010((byte) -75);
        class712.method4007((byte) 108);
        class547.method3171((byte) 109);
        class508.method3004((byte) 75);
        class37.method208(true);
        class94.method698(-112);
        class290.method1898(0);
        class491.method2924((byte) 100);
        class221.method1352(96);
        class415.method2552(-113);
        class362.method2315((byte) -113);
        class238.method1523(-122);
        class612.method3433(31356);
        class136.method968((byte) 108);
        class497.method2964(8);
        class181.method1141(8);
        class21.method134(-15522);
        class652.method3591(-5949);
        class179.method1131((byte) -53);
        class187.method1173(0);
        class406.method2519((byte) 75);
        class539.method3125(-103);
        class46.method302(123);
        class297.method1925(-77);
        class119.method824((byte) 120);
        class587.method3326((byte) -114);
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V", line = 2390)
    private final void method1962(int arg0) {
        field4238++;
        if (class117.field1419 < class25.field349.field8514) {
            class584.field8222.method4163(83);
            class281.field4000 = (class25.field349.field8514 - 1) * 5 * 50;
            if (class281.field4000 > 3000) {
                class281.field4000 = 3000;
            }
            if (class25.field349.field8514 >= 2 && class25.field349.field8516 == 6) {
                this.method2202("js5connect_outofdate", -104);
                class222.field2897 = 14;
                return;
            }
            if (class25.field349.field8514 >= 4 && class25.field349.field8516 == -1) {
                this.method2202("js5crc", -114);
                class222.field2897 = 14;
                return;
            }
            if (class25.field349.field8514 >= 4 && class686.method3836(-97, class222.field2897)) {
                if (class25.field349.field8516 == 7 || class25.field349.field8516 == 9) {
                    this.method2202("js5connect_full", -118);
                } else if (class25.field349.field8516 <= 0) {
                    this.method2202("js5io", -115);
                } else if (class86.field1055 == null) {
                    this.method2202("js5connect", -101);
                } else {
                    this.method2202("js5proxy_" + class86.field1055.trim(), arg0 - 1108);
                }
                class222.field2897 = 14;
                return;
            }
        }
        class117.field1419 = class25.field349.field8514;
        if (class281.field4000 > 0) {
            class281.field4000--;
            return;
        }
        try {
            if (class270.field3874 == 0) {
                class633.field8729 = class584.field8222.method4160(class202.field2644, (byte) -95);
                class270.field3874++;
            }
            if (class270.field3874 == 1) {
                if (class633.field8729.field3310 == 2) {
                    if (class633.field8729.field3311 != null) {
                        class86.field1055 = (String) class633.field8729.field3311;
                    }
                    this.method1959(1000, 82);
                    return;
                }
                if (class633.field8729.field3310 == 1) {
                    class270.field3874++;
                }
            }
            if (arg0 != 1001) {
                field4239 = 119;
            }
            if (class270.field3874 == 2) {
                class659.field9022 = new class546((Socket) class633.field8729.field3311, class202.field2644, 25000);
                class675 var2 = new class675(5);
                var2.method3694(class95.field1116.field6501, -1528071456);
                var2.method3733(-49, 633);
                class659.field9022.method3165(5, 0, var2.field9154, (byte) 121);
                class270.field3874++;
                class721.field10005 = class479.method2864((byte) -47);
            }
            if (class270.field3874 == 3) {
                if (class686.method3836(-101, class222.field2897) || class659.field9022.method3162(-108) > 0) {
                    int var3 = class659.field9022.method3160(50);
                    if (var3 != 0) {
                        this.method1959(var3, -124);
                        return;
                    }
                    class270.field3874++;
                } else if ((class479.method2864((byte) -83) - class721.field10005) > 30000L) {
                    this.method1959(1001, 117);
                    return;
                }
            }
            if (class270.field3874 == 4) {
                boolean var4 = class686.method3836(-98, class222.field2897) || class333.method2179(class222.field2897, (byte) 126) || class307.method2010(class222.field2897, -8714);
                class647[] var5 = class647.method3568(false);
                class675 var6 = new class675(var5.length * 4);
                class659.field9022.method3166(var6.field9154.length, var6.field9154, -120, 0);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method3570(var6.method3703(arg0 - 897), true);
                }
                class25.field349.method3402(class659.field9022, !var4, arg0 - 26905);
                class633.field8729 = null;
                class270.field3874 = 0;
                class659.field9022 = null;
            }
        } catch (IOException var8) {
            this.method1959(1002, -103);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 2558)
    public final void method1963(int arg0) {
        if (class199.field2623) {
            class698.field9627 = 64;
        }
        field4233++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class96.method705((byte) -125);
        class729.field10187 = new class365(class202.field2644);
        class25.field349 = new class605();
        class756.method4201(19035, new int[] { 20, 260 }, new int[] { 1000, 100 });
        if (class408.field5781 != class277.field3922) {
            class739.field10278 = new byte[50][];
        }
        class557.field7812 = class705.method3963(-115);
        if (class408.field5781 == class277.field3922) {
            class553.field7777.field10402 = this.getCodeBase().getHost();
        } else if (class458.method2721(class277.field3922, 70)) {
            class553.field7777.field10402 = this.getCodeBase().getHost();
            class553.field7777.field10389 = class553.field7777.field10399 + 40000;
            class343.field4784.field10389 = class343.field4784.field10399 + 40000;
            class552.field7772.field10389 = class552.field7772.field10399 + 40000;
            class553.field7777.field10395 = class553.field7777.field10399 + 50000;
            class343.field4784.field10395 = class343.field4784.field10399 + 50000;
            class552.field7772.field10395 = class552.field7772.field10399 + 50000;
        } else if (class277.field3922 == class209.field2756) {
            class553.field7777.field10402 = "127.0.0.1";
            class343.field4784.field10402 = "127.0.0.1";
            class552.field7772.field10402 = "127.0.0.1";
            class553.field7777.field10389 = class553.field7777.field10399 + 40000;
            class343.field4784.field10389 = class343.field4784.field10399 + 40000;
            class553.field7777.field10395 = class553.field7777.field10399 + 50000;
            class552.field7772.field10389 = class552.field7772.field10399 + 40000;
            class343.field4784.field10395 = class343.field4784.field10399 + 50000;
            class552.field7772.field10395 = class552.field7772.field10399 + 50000;
        }
        if (class724.field10102 == class633.field8733) {
            class697.field9594 = 0;
            class465.field6591 = class124.field1502;
            class178.field2392 = 16777215;
            class713.field9914 = true;
            class485.field6815 = class466.field6608;
        } else if (class633.field8733 == class538.field7546) {
            class465.field6591 = class758.field10533;
            class485.field6815 = class467.field6621;
        } else {
            class485.field6815 = class418.field5910;
            class465.field6591 = class171.field2331;
        }
        if (class633.field8733 == class556.field7800) {
            class416.field5869 = false;
        }
        class510.field7298 = class187.field2518 = class152.field2149 = class110.field1355 = new short[256];
        class584.field8222 = class553.field7777;
        if (arg0 != 0) {
            this.method1967(-54);
        }
        try {
            class595.field8367 = class499.field7161.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class589.field8306 = class143.method994(class366.field5196, 13764);
        class530.field7470 = class293.method1904(-2451, true, class366.field5196);
        try {
            if (class202.field2644.field4383 != null) {
                class286.field4060 = new class421(class202.field2644.field4383, 5200, 0);
                for (int var3 = 0; var3 < 37; var3++) {
                    class699.field9762[var3] = new class421(class202.field2644.field4375[var3], 6000, 0);
                }
                class46.field547 = new class421(class202.field2644.field4376, 6000, 0);
                class33.field427 = new class263(255, class286.field4060, class46.field547, 500000);
                class209.field2757 = new class421(class202.field2644.field4392, 24, 0);
                class202.field2644.field4392 = null;
                class202.field2644.field4376 = null;
                class202.field2644.field4375 = null;
                class202.field2644.field4383 = null;
            }
        } catch (IOException var5) {
            class46.field547 = null;
            class209.field2757 = null;
            class33.field427 = null;
            class286.field4060 = null;
        }
        if (class408.field5781 != class277.field3922) {
            class59.field737 = true;
        }
        class738.field10273 = class71.field908.method588((byte) 113, class549.field7669);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 2684)
    private final void method1964(byte arg0) {
        field4229++;
        if (class222.field2897 == 14) {
            return;
        }
        if (arg0 <= 19) {
            this.method1955((byte) -81);
        }
        class740.field10285++;
        if ((class740.field10285 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class470.field6669 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class220.field2866.setSeed((long) class470.field6669);
        }
        if (class740.field10285 % 50 == 0) {
            class187.field2521 = class644.field8821;
            class644.field8821 = 0;
            class674.field9140 = class654.field8974;
            class654.field8974 = 0;
        }
        this.method1967(119);
        if (class371.field5219 != null) {
            class371.field5219.method1711((byte) 64);
        }
        class41.method275(false);
        class675.method3708(-14392);
        class589.field8306.method1522((byte) -30);
        class530.field7470.method1092(0);
        if (class268.field3831 != null) {
            class268.field3831.method399((int) class479.method2864((byte) -45));
        }
        class288.method1886(90);
        class721.field10004 = 0;
        class101.field1206 = 0;
        for (class620 var3 = class589.field8306.method1520((byte) 98); var3 != null; var3 = class589.field8306.method1520((byte) 90)) {
            int var6 = var3.method696(-31285);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method697(4152);
                if (class151.method1028(-2) && var7 == '`' || var7 == '§' || var7 == '²') {
                    if (class274.method1780(false)) {
                        class445.method2672(-12560);
                    } else {
                        class76.method608(12887);
                    }
                } else if (class101.field1206 < 128) {
                    class462.field6504[class101.field1206] = var3;
                    class101.field1206++;
                }
            } else if (var6 == 0 && class721.field10004 < 75) {
                class622.field8670[class721.field10004] = var3;
                class721.field10004++;
            }
        }
        class677.field9256 = 0;
        for (class382 var4 = class530.field7470.method1097(-3); var4 != null; var4 = class530.field7470.method1097(-3)) {
            int var5 = var4.method778(0);
            if (var5 == -1) {
                class648.field8911.method2770((byte) -13, var4);
            } else if (var5 == 6) {
                class677.field9256 += var4.method772(-5);
            } else if (class568.method3273((byte) 118, var5)) {
                class43.field528.method2770((byte) -13, var4);
                if (class43.field528.method2764(100) > 10) {
                    class43.field528.method2762((byte) -16);
                }
            }
        }
        if (class274.method1780(false)) {
            class303.method1983(99);
        }
        if (class686.method3836(-98, class222.field2897)) {
            class722.method4055((byte) 125);
            class701.method3948((byte) 85);
        } else if (class456.method2713(class222.field2897, (byte) -94)) {
            class674.method3681(-52);
        }
        if (class333.method2179(class222.field2897, (byte) 126) && !class456.method2713(class222.field2897, (byte) -99)) {
            this.method1958((byte) -71);
            class240.method1530((byte) -21);
            class44.method294((byte) 126);
        } else if (class307.method2010(class222.field2897, -8714) && !class456.method2713(class222.field2897, (byte) -85)) {
            this.method1958((byte) -71);
            class44.method294((byte) 117);
        } else if (class222.field2897 == 12) {
            class44.method294((byte) 126);
        } else if (class349.method2250((byte) 35, class222.field2897) && !class456.method2713(class222.field2897, (byte) -88)) {
            class430.method2629(false);
        } else if (class222.field2897 == 13) {
            class44.method294((byte) 123);
            if (class62.field759 != -3 && class62.field759 != 2 && class62.field759 != 15) {
                class415.method2550(false, -25626);
            }
        }
        class440.method2656(class268.field3831, 18975);
        class43.field528.method2762((byte) -16);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 2850)
    public static final void method1965() {
        class253.field3704 = 0;
        for (int var0 = 0; var0 < class344.field4849; var0++) {
            class468 var1 = ((class740) class373.field5230.method1180((byte) 26, (long) class100.field1196[var0])).field10289;
            if (var1.field7970 && var1.method1837((byte) 72) != -1) {
                int var2 = (var1.method1835((byte) 127) - 1) * 256 + 252;
                int var3 = var1.field1264 - var2 >> 9;
                int var4 = var1.field1250 - var2 >> 9;
                class564 var5 = class668.method3641(4, var4, var1.field1266, var3);
                if (var5 != null) {
                    int var6 = var5.field7958;
                    if (var5 instanceof class468) {
                        var6 += 2048;
                    }
                    if (var5.field7916 == 0 && var5.method1837((byte) 72) != -1) {
                        class573.field8111[class253.field3704] = var6;
                        class563.field7900[class253.field3704] = var6;
                        class253.field3704++;
                        var5.field7916++;
                    }
                    class573.field8111[class253.field3704] = var6;
                    class563.field7900[class253.field3704] = var1.field7958 + 2048;
                    class253.field3704++;
                    var5.field7916++;
                }
            }
        }
        class744.method4144(true, class573.field8111, 0, class563.field7900, class253.field3704 - 1);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2899)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class119.method825(true, "Argument count");
            }
            class553.field7777 = new class748();
            class553.field7777.field10399 = Integer.parseInt(arg0[0]);
            class343.field4784 = new class748();
            class343.field4784.field10399 = Integer.parseInt(arg0[1]);
            class552.field7772 = new class748();
            class552.field7772.field10399 = Integer.parseInt(arg0[2]);
            class277.field3922 = class209.field2756;
            if (arg0[3].equals("live")) {
                class28.field378 = class186.field2504;
            } else if (arg0[3].equals("rc")) {
                class28.field378 = class105.field1257;
            } else if (arg0[3].equals("wip")) {
                class28.field378 = class622.field8663;
            } else {
                class119.method825(true, "modewhat");
            }
            class549.field7669 = class343.method2219(arg0[4], 1);
            if (class549.field7669 == -1) {
                if (arg0[4].equals("english")) {
                    class549.field7669 = 0;
                } else if (arg0[4].equals("german")) {
                    class549.field7669 = 1;
                } else {
                    class119.method825(true, "language");
                }
            }
            class387.field5485 = false;
            class100.field1195 = false;
            if (arg0[5].equals("game0")) {
                class633.field8733 = class556.field7800;
            } else if (arg0[5].equals("game1")) {
                class633.field8733 = class724.field10102;
            } else if (arg0[5].equals("game2")) {
                class633.field8733 = class652.field8949;
            } else if (arg0[5].equals("game3")) {
                class633.field8733 = class538.field7546;
            } else {
                class119.method825(true, "game");
            }
            class3.field32 = 0L;
            class310.field4315 = true;
            class758.field10534 = true;
            class448.field6360 = null;
            class273.field3901 = 0;
            class279.field3942 = 0;
            class638.field8771 = 0;
            class55.field642 = class633.field8733.field4515;
            class614.field8594 = "";
            class246.field3287 = null;
            class199.field2623 = false;
            class472.field6695 = false;
            client var1 = new client();
            class499.field7161 = var1;
            var1.method2206(633, 0, 768, class633.field8733.field4514, false, class28.field378.method2261(-107) + 32, 1024, 37);
            class387.field5484.setLocation(40, 40);
        } catch (Exception var3) {
            class248.method1583((byte) -115, null, var3);
        }
        field4225++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 2987)
    public final void method1966(boolean arg0) {
        field4227++;
        if (class557.field7812.field6521.method2556(arg0) != 2) {
            this.method1964((byte) 70);
            return;
        }
        try {
            this.method1964((byte) 72);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class248.method1583((byte) -59, var5.getMessage() + " (Recovered) " + this.method1957(!arg0), var5);
            class167.field2289 = true;
            class759.method4212(false, 0, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V", line = 3012)
    private final void method1967(int arg0) {
        field4234++;
        if (arg0 <= 91) {
            field4223 = null;
        }
        boolean var2 = class25.field349.method3397(-125);
        if (!var2) {
            this.method1962(1001);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 3029)
    private final void method1968(byte arg0) {
        field4235++;
        if (class222.field2897 == 14) {
            return;
        }
        long var2 = class139.method980((byte) 84) / 1000000L - class294.field4132;
        class294.field4132 = class139.method980((byte) 84) / 1000000L;
        if (arg0 < 74) {
            method1950(null);
        }
        boolean var4 = class548.method3175(-22595);
        if (var4 && class105.field1268 && class220.field2882 != null) {
            class220.field2882.method2486(12107);
        }
        if (class194.method1199(class222.field2897, (byte) 121)) {
            if (class118.field1428 != 0L && class118.field1428 < class479.method2864((byte) -117)) {
                class342.method2214(3, false, class605.method3408((byte) 54), class408.field5788, class454.field6414);
            } else if (!class268.field3831.method471() && class35.field447) {
                class95.method701((byte) -28);
            }
        }
        if (class272.field3891 == null) {
            Container var5;
            if (class387.field5484 != null) {
                var5 = class387.field5484;
            } else if (class213.field2800 == null) {
                var5 = class125.field1524;
            } else {
                var5 = class213.field2800;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class387.field5484 == var5) {
                Insets var8 = class387.field5484.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class494.field7122 != var6 || class261.field3756 != var7 || class64.field792) {
                if (class268.field3831 == null || class268.field3831.method438()) {
                    class96.method705((byte) -126);
                } else {
                    class494.field7122 = var6;
                    class261.field3756 = var7;
                }
                class118.field1428 = class479.method2864((byte) -86) + 500L;
                class64.field792 = false;
            }
        }
        if (class272.field3891 != null && !class70.field876 && class194.method1199(class222.field2897, (byte) -26)) {
            class342.method2214(3, false, class557.field7812.field6551.method290(false), -1, -1);
        }
        boolean var9 = false;
        if (class202.field2642) {
            var9 = true;
            class202.field2642 = false;
        }
        if (var9) {
            class619.method3481((byte) 47);
        }
        if (class268.field3831 != null && class268.field3831.method471() || class605.method3408((byte) 54) != 1) {
            class350.method2257(-101);
        }
        if (class686.method3836(-119, class222.field2897)) {
            class79.method625(var9, -110);
        } else if (class342.method2215(class222.field2897, -6)) {
            class373.method2350(-84);
        } else if (class226.method1418(class222.field2897, 109)) {
            class373.method2350(-86);
        } else if (class456.method2713(class222.field2897, (byte) -94)) {
            if (class697.field9607 == 1) {
                if (class179.field2399 < class164.field2261) {
                    class179.field2399 = class164.field2261;
                }
                int var10 = (class179.field2399 - class164.field2261) * 50 / class179.field2399;
                class660.method3621(class455.field6428, class71.field908.method588((byte) 93, class549.field7669) + "<br>(" + var10 + "%)", true, 116, class478.field6780, class268.field3831);
            } else if (class697.field9607 == 2) {
                if (class551.field7760 < class166.field2281) {
                    class551.field7760 = class166.field2281;
                }
                int var11 = (class551.field7760 - class166.field2281) * 50 / class551.field7760 + 50;
                class660.method3621(class455.field6428, class71.field908.method588((byte) 120, class549.field7669) + "<br>(" + var11 + "%)", true, -101, class478.field6780, class268.field3831);
            } else {
                class660.method3621(class455.field6428, class71.field908.method588((byte) 100, class549.field7669), true, 106, class478.field6780, class268.field3831);
            }
        } else if (class222.field2897 == 10) {
            class689.method3855(var2, (byte) 87);
        } else if (class222.field2897 == 13) {
            class660.method3621(class455.field6428, class71.field910.method588((byte) 103, class549.field7669) + "<br>" + class71.field911.method588((byte) 109, class549.field7669), false, 106, class478.field6780, class268.field3831);
        }
        if (class422.field5956 == 3) {
            for (int var12 = 0; var12 < class540.field7565; var12++) {
                Rectangle var13 = class686.field9382[var12];
                if (class722.field10021[var12]) {
                    class268.field3831.method393(var13.y, -65281, var13.height, var13.width, 124, var13.x);
                } else if (class220.field2877[var12]) {
                    class268.field3831.method393(var13.y, -65536, var13.height, var13.width, 97, var13.x);
                } else {
                    class268.field3831.method393(var13.y, -16711936, var13.height, var13.width, 101, var13.x);
                }
            }
        }
        if (class274.method1780(false)) {
            class689.method3853(1599052696, class268.field3831);
        }
        if (class202.field2644.field4367 && class194.method1199(class222.field2897, (byte) 115) && class422.field5956 == 0 && class605.method3408((byte) 54) == 1 && !var9) {
            int var16 = 0;
            for (int var17 = 0; var17 < class540.field7565; var17++) {
                if (class220.field2877[var17]) {
                    class220.field2877[var17] = false;
                    class366.field5195[var16++] = class686.field9382[var17];
                }
            }
            try {
                if (class589.field8295) {
                    class312.method2024(class366.field5195, var16, (byte) -66);
                } else {
                    class268.field3831.method384(class366.field5195, 14629, var16);
                }
            } catch (class76 var19) {
            }
        } else if (!class686.method3836(-128, class222.field2897)) {
            for (int var14 = 0; var14 < class540.field7565; var14++) {
                class220.field2877[var14] = false;
            }
            try {
                if (class589.field8295) {
                    class124.method842((byte) 102);
                } else {
                    class268.field3831.method452(0);
                }
            } catch (class76 var20) {
                class248.method1583((byte) -90, var20.getMessage() + " (Recovered) " + this.method1957(true), var20);
                class759.method4212(false, 0, 0);
            }
        }
        class235.method1514(-43);
        int var18 = class557.field7812.field6540.method1300(false);
        if (var18 == 0) {
            class756.method4205(15L, 0);
        } else if (var18 == 1) {
            class756.method4205(10L, 0);
        } else if (var18 == 2) {
            class756.method4205(5L, 0);
        } else if (var18 == 3) {
            class756.method4205(2L, 0);
        }
        if (class48.field570) {
            class33.method192(-81);
        }
        if (class557.field7812.field6533.method3946(false) == 1 && class222.field2897 == 3 && class457.field6447 != -1) {
            class557.field7812.method2755(249682952, 0, class557.field7812.field6533);
            class90.method681(10343);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 3290)
    public static final void method1969() {
        int var0 = class578.field8168;
        int[] var1 = class240.field3201;
        int var2 = class237.field3174 ? var0 : class344.field4849 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class564 var4;
            if (var3 < var0) {
                var4 = class309.field4311[var1[var3]];
            } else {
                var4 = ((class740) class373.field5230.method1180((byte) 26, (long) class100.field1196[var3 - var0])).field10289;
            }
            if (var4.field7985 >= 0) {
                int var5 = var4.method1835((byte) 127);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field1264 & 0x1FF) == 0 && (var4.field1250 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field1264 & 0x1FF) == 256 && (var4.field1250 & 0x1FF) == 256) {
                    continue;
                }
                var4.field1255 = class469.method2798(109, var4.field1250, var4.field1266, var4.field1264);
                class505.method2989(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3332)
    public static final void method1970() {
        int var0 = class578.field8168;
        int[] var1 = class240.field3201;
        int var2 = class557.field7812.field6511.method4150(false);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class280 var14 = class309.field4311[var1[var4]];
            if (!var14.method1834(92160000)) {
                var14.field7985 = -1;
            } else if (var14.field3947) {
                var14.field7985 = -1;
            } else {
                var14.method1153(true);
                if (var14.field7415 >= 0 && var14.field7418 >= 0 && var14.field7413 < class336.field4683 && var14.field7409 < class700.field9768) {
                    var14.field3946 = var14.field7968 ? var3 : false;
                    if (class660.field9039 == var14) {
                        var14.field7985 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field7970) {
                            var15++;
                        }
                        if (var14.field7994 > class740.field10285) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method1835((byte) 127) << 2);
                        if (var14.field3985) {
                            var16 += 512;
                        } else {
                            if (class179.field2397 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field7985 = var16 + 1;
                    }
                } else {
                    var14.field7985 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class344.field4849; var5++) {
            class468 var11 = ((class740) class373.field5230.method1180((byte) 26, (long) class100.field1196[var5])).field10289;
            if (var11.method2792(92160000) && var11.field6632.method2281(0, class101.field1201)) {
                var11.method1153(true);
                if (var11.field7415 >= 0 && var11.field7418 >= 0 && var11.field7413 < class336.field4683 && var11.field7409 < class700.field9768) {
                    int var12 = 0;
                    if (!var11.field7970) {
                        var12++;
                    }
                    if (var11.field7994 > class740.field10285) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method1835((byte) 127) << 2);
                    if (class179.field2397 == 0) {
                        if (var11.field6632.field4985) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class179.field2397 == 1) {
                        if (var11.field6632.field4985) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field6632.field5022) {
                        var13 += 1024;
                    } else if (!var11.field6632.field5030) {
                        var13 += 256;
                    }
                    var11.field7985 = var13 + 1;
                } else {
                    var11.field7985 = -1;
                }
            } else {
                var11.field7985 = -1;
            }
        }
        for (int var6 = 0; var6 < class98.field1180.length; var6++) {
            class584 var7 = class98.field1180[var6];
            if (var7 != null) {
                if (var7.field8214 == 1) {
                    class740 var8 = (class740) class373.field5230.method1180((byte) 26, (long) var7.field8224);
                    if (var8 != null) {
                        class468 var9 = var8.field10289;
                        if (var9.field7985 >= 0) {
                            var9.field7985 += 2048;
                        }
                    }
                } else if (var7.field8214 == 10) {
                    class280 var10 = class309.field4311[var7.field8224];
                    if (var10 != null && class660.field9039 != var10 && var10.field7985 >= 0) {
                        var10.field7985 += 2048;
                    }
                }
            }
        }
    }
}
