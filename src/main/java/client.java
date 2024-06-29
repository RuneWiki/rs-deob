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
public class client extends class675 {

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field4353 = 16777215;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field4364;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "xb", descriptor = "Ljava/lang/Class;")
    public static Class field4363;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method2006() {
        for (int var0 = 0; var0 < class483.field6515; var0++) {
            int[] var1 = class74.field1069[var0];
            for (int var2 = 0; var2 < class65.field926; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lkh;IIIIIIIIIII)V")
    public static final void method2007(class17[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label824: for (int var12 = 0; var12 < arg0.length; var12++) {
            class17 var13 = arg0[var12];
            if (var13 != null && var13.field336 == arg1) {
                int var14 = var13.field248 + arg6;
                int var15 = var13.field416 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field352 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field347 + var14;
                    int var21 = var13.field330 + var15;
                    if (var13.field352 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field352 == 0 || var13.field256 || method2010(var13).field9638 != 0 || class679.field9452 == var13 || class55.field792 == var13.field379 || class411.field5627 == var13.field379) {
                    if (!method2030(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class618.field8597) {
                            var22 = class146.method1175(-29909);
                            var23 = class605.method3435((byte) -98);
                        }
                        if (class84.field1157 == var13 && class238.method1587(class84.field1157, true) != null) {
                            class268.field3763 = true;
                            class190.field2929 = var14;
                            class614.field8561 = var15;
                        }
                        if (var13.field323 || var16 < var18 && var17 < var19) {
                            if (var13.field267 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class255 var24 = (class255) class7.field124.method3589((byte) -128); var24 != null; var24 = (class255) class7.field124.method3591(0)) {
                                    if (var24.field3590) {
                                        var24.method1207(103);
                                        var24.field3583.field386 = false;
                                    }
                                }
                                if (class520.field7055 == 0) {
                                    class84.field1157 = null;
                                    class679.field9452 = null;
                                }
                                class462.field6287 = 0;
                                class164.field2645 = false;
                                class398.field5486 = false;
                                if (!class611.field8532) {
                                    class300.method1931((byte) -68);
                                }
                            }
                            boolean var25;
                            if (class420.field5727.method1326((byte) 127) + var22 >= var16 && class420.field5727.method1319((byte) 126) + var23 >= var17 && class420.field5727.method1326((byte) 107) + var22 < var18 && class420.field5727.method1319((byte) 126) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class675.field9384 && var25) {
                                if (var13.field327 >= 0) {
                                    class335.field4516 = var13.field327;
                                } else if (var13.field267) {
                                    class335.field4516 = -1;
                                }
                            }
                            if (!class611.field8532 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class174.method1329(arg11 - var15, 4873, arg10 - var14, var13);
                            }
                            boolean var26 = false;
                            if (class420.field5727.method1322(true) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class556 var28 = (class556) class373.field5070.method3589((byte) -127);
                            if (var28 != null && var28.method2733(0) == 0 && var28.method2731(125) + var22 >= var16 && var28.method2734(false) + var23 >= var17 && var28.method2731(125) + var22 < var18 && var28.method2734(false) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field397 != null && !class223.method1521(-46)) {
                                for (int var29 = 0; var29 < var13.field397.length; var29++) {
                                    if (class789.field10821.method1531(80, var13.field397[var29])) {
                                        if (var13.field318 == null || class440.field5977 >= var13.field318[var29]) {
                                            byte var30 = var13.field283[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class789.field10821.method1531(73, 86) && !class789.field10821.method1531(74, 82) && !class789.field10821.method1531(97, 81)) && ((var30 & 0x2) == 0 || class789.field10821.method1531(105, 86)) && ((var30 & 0x1) == 0 || class789.field10821.method1531(123, 82)) && ((var30 & 0x4) == 0 || class789.field10821.method1531(116, 81))) {
                                                if (var29 < 10) {
                                                    class736.method4083(var13.field372, -26207, -1, "", var29 + 1);
                                                } else if (var29 == 10) {
                                                    class200.method1443(false);
                                                    class698 var31 = method2010(var13);
                                                    class301.method1932(var31.field9641, (byte) 4, var31.method3889(true), var13);
                                                    class508.field6980 = class195.method1413((byte) 121, var13);
                                                    if (class508.field6980 == null) {
                                                        class508.field6980 = "Null";
                                                    }
                                                    class420.field5726 = var13.field328 + "<col=ffffff>";
                                                }
                                                int var32 = var13.field409[var29];
                                                if (var13.field318 == null) {
                                                    var13.field318 = new int[var13.field397.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field318[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field318[var29] = class440.field5977 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field318 != null) {
                                        var13.field318[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class330.method2082(var23 + var28.method2734(false) - var15, (byte) 48, var22 + var28.method2731(125) - var14, var13);
                            }
                            if (class84.field1157 != null && class84.field1157 != var13 && var25 && method2010(var13).method3888(false)) {
                                class335.field4518 = var13;
                            }
                            if (class679.field9452 == var13) {
                                class454.field6201 = true;
                                class517.field7030 = var14;
                                class300.field4136 = var15;
                            }
                            if (var13.field256 || var13.field379 != 0) {
                                if (var25 && class113.field2112 != 0 && var13.field360 != null) {
                                    class255 var33 = new class255();
                                    var33.field3590 = true;
                                    var33.field3583 = var13;
                                    var33.field3591 = class113.field2112;
                                    var33.field3586 = var13.field360;
                                    class7.field124.method3594((byte) -68, var33);
                                }
                                if (class84.field1157 != null || class611.field8532 || class624.field8707 != var13.field379 && class462.field6287 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field379 != 0) {
                                    if (class323.field4424 == var13.field379 || class622.field8681 == var13.field379) {
                                        class450.field6174 = var13;
                                        if (class288.field3973 != null) {
                                            class288.field3973.method2653(16885, class95.field1472, var13.field330);
                                        }
                                        if (class323.field4424 == var13.field379) {
                                            if (class611.field8532 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class43.method261(arg8, class95.field1472, arg9, 76);
                                            class704 var34 = (class704) class307.field4212.method1597((byte) -67);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label824;
                                                }
                                                if (arg10 >= var34.field9679 && arg10 < var34.field9676 && arg11 >= var34.field9682 && arg11 < var34.field9677) {
                                                    class300.method1931((byte) -83);
                                                    class168.method1299(var34.field9681, (byte) -123);
                                                }
                                                var34 = (class704) class307.field4212.method1601(117);
                                            }
                                        }
                                    }
                                    if (class55.field792 == var13.field379) {
                                        if (var13.method102(class95.field1472, -256) == null || class442.field5989 != 0 && class442.field5989 != 3 || class611.field8532 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field292[var36];
                                        if (var35 < var37 || var35 > var13.field310[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field347 / 2;
                                        int var39 = var36 - var13.field330 / 2;
                                        int var40;
                                        if (class536.field7291 == 4) {
                                            var40 = (int) class53.field763 & 0x3FFF;
                                        } else {
                                            var40 = (int) class53.field763 + class408.field5599 & 0x3FFF;
                                        }
                                        int var41 = class191.field2937[var40];
                                        int var42 = class191.field2936[var40];
                                        if (class536.field7291 != 4) {
                                            var41 = (class301.field4140 + 256) * var41 >> 8;
                                            var42 = (class301.field4140 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class536.field7291 == 4) {
                                            var45 = (class492.field6736 >> 9) + (var43 >> 2);
                                            var46 = (class229.field3347 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class235.field3379.method2342((byte) 87) - 1) * 256;
                                            var45 = (class235.field3379.field7396 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class235.field3379.field7398 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class675.field9384 && (class448.field6148 & 0x40) != 0) {
                                            class17 var48 = class326.method2066(class657.field9100, class342.field4609, 113);
                                            if (var48 == null) {
                                                class200.method1443(false);
                                            } else {
                                                class596.method3396(true, true, var13.field355, class340.field4584, var46, 1L, " ->", 20, class508.field6980, (long) (var13.field282 << 0 | var13.field372), (byte) 34, false, var45);
                                            }
                                            continue;
                                        }
                                        if (class403.field5534 == class177.field2797) {
                                            class596.method3396(true, true, -1, -1, var46, 1L, "", 50, class641.field8845.method3566((byte) 97, class464.field6309), 0L, (byte) 34, false, var45);
                                        }
                                        class596.method3396(true, true, -1, class229.field3332, var46, 1L, "", 16, class709.field9751, 0L, (byte) 34, false, var45);
                                        continue;
                                    }
                                    if (class624.field8707 == var13.field379) {
                                        class488.field6583 = var13;
                                        if (var25) {
                                            class164.field2645 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method2731(125) - var14 - var13.field347 / 2) * 2.0D / (double) class64.field891);
                                            int var50 = (int) (-((double) (var23 + var28.method2734(false) - var15 - var13.field330 / 2) * 2.0D / (double) class64.field891));
                                            int var51 = class215.field3194 + var49 + class64.field907;
                                            int var52 = class211.field3161 + var50 + class64.field914;
                                            class229 var53 = class38.method233(0);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method1560(var51, 30156, var54, var52);
                                            if (var54 != null) {
                                                if (class789.field10821.method1531(121, 82) && class407.field5593 > 0) {
                                                    class85.method685(var54[1], (byte) 127, var54[0], var54[2]);
                                                    continue;
                                                }
                                                class398.field5486 = true;
                                                class567.field8013 = var54[0];
                                                class356.field4860 = var54[1];
                                                class387.field5327 = var54[2];
                                            }
                                            class462.field6287 = 1;
                                            class406.field5581 = false;
                                            class262.field3675 = class420.field5727.method1326((byte) -73);
                                            class455.field6206 = class420.field5727.method1319((byte) 126);
                                            continue;
                                        }
                                        if (var26 && class462.field6287 > 0) {
                                            if (class462.field6287 == 1 && (class262.field3675 != class420.field5727.method1326((byte) 114) || class455.field6206 != class420.field5727.method1319((byte) 126))) {
                                                class478.field6463 = class215.field3194;
                                                class573.field8167 = class211.field3161;
                                                class462.field6287 = 2;
                                            }
                                            if (class462.field6287 == 2) {
                                                class406.field5581 = true;
                                                class440.method2565(class478.field6463 + (int) ((double) (class262.field3675 - class420.field5727.method1326((byte) 111)) * 2.0D / (double) class64.field890), -13157);
                                                class427.method2517((byte) 0, class573.field8167 - (int) ((double) (class455.field6206 - class420.field5727.method1319((byte) 126)) * 2.0D / (double) class64.field890));
                                            }
                                            continue;
                                        }
                                        if (class462.field6287 > 0 && !class406.field5581) {
                                            if ((class302.field4147 == 1 || class423.method2501(1001)) && class690.field9574 > 2) {
                                                class588.method3380((byte) 105, class455.field6206, class262.field3675);
                                            } else if (class200.method1441((byte) 61)) {
                                                class588.method3380((byte) 84, class455.field6206, class262.field3675);
                                            }
                                        }
                                        class462.field6287 = 0;
                                        continue;
                                    }
                                    if (class149.field2479 == var13.field379) {
                                        if (var26) {
                                            class676.method3812(var13.field330, (byte) -76, var22 + class420.field5727.method1326((byte) 117) - var14, var23 + class420.field5727.method1319((byte) 126) - var15, var13.field347);
                                        }
                                        continue;
                                    }
                                    if (class411.field5627 == var13.field379) {
                                        class23.method158(var14, var13, (byte) -122, var15);
                                        continue;
                                    }
                                }
                                if (!var13.field338 && var27) {
                                    var13.field338 = true;
                                    if (var13.field289 != null) {
                                        class255 var55 = new class255();
                                        var55.field3590 = true;
                                        var55.field3583 = var13;
                                        var55.field3595 = var22 + var28.method2731(125) - var14;
                                        var55.field3591 = var23 + var28.method2734(false) - var15;
                                        var55.field3586 = var13.field289;
                                        class7.field124.method3594((byte) 109, var55);
                                    }
                                }
                                if (var13.field338 && var26 && var13.field268 != null) {
                                    class255 var56 = new class255();
                                    var56.field3590 = true;
                                    var56.field3583 = var13;
                                    var56.field3595 = var22 + class420.field5727.method1326((byte) 97) - var14;
                                    var56.field3591 = var23 + class420.field5727.method1319((byte) 126) - var15;
                                    var56.field3586 = var13.field268;
                                    class7.field124.method3594((byte) -126, var56);
                                }
                                if (var13.field338 && !var26) {
                                    var13.field338 = false;
                                    if (var13.field270 != null) {
                                        class255 var57 = new class255();
                                        var57.field3590 = true;
                                        var57.field3583 = var13;
                                        var57.field3595 = var22 + class420.field5727.method1326((byte) 104) - var14;
                                        var57.field3591 = var23 + class420.field5727.method1319((byte) 126) - var15;
                                        var57.field3586 = var13.field270;
                                        class525.field7137.method3594((byte) -94, var57);
                                    }
                                }
                                if (var26 && var13.field401 != null) {
                                    class255 var58 = new class255();
                                    var58.field3590 = true;
                                    var58.field3583 = var13;
                                    var58.field3595 = var22 + class420.field5727.method1326((byte) 21) - var14;
                                    var58.field3591 = var23 + class420.field5727.method1319((byte) 126) - var15;
                                    var58.field3586 = var13.field401;
                                    class7.field124.method3594((byte) -113, var58);
                                }
                                if (!var13.field386 && var25) {
                                    var13.field386 = true;
                                    if (var13.field309 != null) {
                                        class255 var59 = new class255();
                                        var59.field3590 = true;
                                        var59.field3583 = var13;
                                        var59.field3595 = var22 + class420.field5727.method1326((byte) 112) - var14;
                                        var59.field3591 = var23 + class420.field5727.method1319((byte) 126) - var15;
                                        var59.field3586 = var13.field309;
                                        class7.field124.method3594((byte) 120, var59);
                                    }
                                }
                                if (var13.field386 && var25 && var13.field333 != null) {
                                    class255 var60 = new class255();
                                    var60.field3590 = true;
                                    var60.field3583 = var13;
                                    var60.field3595 = var22 + class420.field5727.method1326((byte) -35) - var14;
                                    var60.field3591 = var23 + class420.field5727.method1319((byte) 126) - var15;
                                    var60.field3586 = var13.field333;
                                    class7.field124.method3594((byte) -123, var60);
                                }
                                if (var13.field386 && !var25) {
                                    var13.field386 = false;
                                    if (var13.field311 != null) {
                                        class255 var61 = new class255();
                                        var61.field3590 = true;
                                        var61.field3583 = var13;
                                        var61.field3595 = var22 + class420.field5727.method1326((byte) -34) - var14;
                                        var61.field3591 = var23 + class420.field5727.method1319((byte) 126) - var15;
                                        var61.field3586 = var13.field311;
                                        class525.field7137.method3594((byte) 116, var61);
                                    }
                                }
                                if (var13.field353 != null) {
                                    class255 var62 = new class255();
                                    var62.field3583 = var13;
                                    var62.field3586 = var13.field353;
                                    class334.field4513.method3594((byte) -60, var62);
                                }
                                if (var13.field258 != null && class513.field7009 > var13.field332) {
                                    if (var13.field345 == null || class513.field7009 - var13.field332 > 32) {
                                        class255 var67 = new class255();
                                        var67.field3583 = var13;
                                        var67.field3586 = var13.field258;
                                        class7.field124.method3594((byte) -99, var67);
                                    } else {
                                        label711: for (int var63 = var13.field332; var63 < class513.field7009; var63++) {
                                            int var64 = class286.field3937[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field345.length; var65++) {
                                                if (var13.field345[var65] == var64) {
                                                    class255 var66 = new class255();
                                                    var66.field3583 = var13;
                                                    var66.field3586 = var13.field258;
                                                    class7.field124.method3594((byte) 103, var66);
                                                    break label711;
                                                }
                                            }
                                        }
                                    }
                                    var13.field332 = class513.field7009;
                                }
                                if (var13.field361 != null && class634.field8770 > var13.field334) {
                                    if (var13.field367 == null || class634.field8770 - var13.field334 > 32) {
                                        class255 var72 = new class255();
                                        var72.field3583 = var13;
                                        var72.field3586 = var13.field361;
                                        class7.field124.method3594((byte) -92, var72);
                                    } else {
                                        label687: for (int var68 = var13.field334; var68 < class634.field8770; var68++) {
                                            int var69 = class202.field3063[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field367.length; var70++) {
                                                if (var13.field367[var70] == var69) {
                                                    class255 var71 = new class255();
                                                    var71.field3583 = var13;
                                                    var71.field3586 = var13.field361;
                                                    class7.field124.method3594((byte) 127, var71);
                                                    break label687;
                                                }
                                            }
                                        }
                                    }
                                    var13.field334 = class634.field8770;
                                }
                                if (var13.field255 != null && class583.field8258 > var13.field395) {
                                    if (var13.field382 == null || class583.field8258 - var13.field395 > 32) {
                                        class255 var77 = new class255();
                                        var77.field3583 = var13;
                                        var77.field3586 = var13.field255;
                                        class7.field124.method3594((byte) 107, var77);
                                    } else {
                                        label663: for (int var73 = var13.field395; var73 < class583.field8258; var73++) {
                                            int var74 = class249.field3516[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field382.length; var75++) {
                                                if (var13.field382[var75] == var74) {
                                                    class255 var76 = new class255();
                                                    var76.field3583 = var13;
                                                    var76.field3586 = var13.field255;
                                                    class7.field124.method3594((byte) 114, var76);
                                                    break label663;
                                                }
                                            }
                                        }
                                    }
                                    var13.field395 = class583.field8258;
                                }
                                if (var13.field403 != null && class346.field4657 > var13.field384) {
                                    if (var13.field343 == null || class346.field4657 - var13.field384 > 32) {
                                        class255 var82 = new class255();
                                        var82.field3583 = var13;
                                        var82.field3586 = var13.field403;
                                        class7.field124.method3594((byte) 120, var82);
                                    } else {
                                        label639: for (int var78 = var13.field384; var78 < class346.field4657; var78++) {
                                            int var79 = class354.field4759[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field343.length; var80++) {
                                                if (var13.field343[var80] == var79) {
                                                    class255 var81 = new class255();
                                                    var81.field3583 = var13;
                                                    var81.field3586 = var13.field403;
                                                    class7.field124.method3594((byte) -107, var81);
                                                    break label639;
                                                }
                                            }
                                        }
                                    }
                                    var13.field384 = class346.field4657;
                                }
                                if (var13.field371 != null && class366.field4972 > var13.field337) {
                                    if (var13.field305 == null || class366.field4972 - var13.field337 > 32) {
                                        class255 var87 = new class255();
                                        var87.field3583 = var13;
                                        var87.field3586 = var13.field371;
                                        class7.field124.method3594((byte) -57, var87);
                                    } else {
                                        label615: for (int var83 = var13.field337; var83 < class366.field4972; var83++) {
                                            int var84 = class773.field10703[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field305.length; var85++) {
                                                if (var13.field305[var85] == var84) {
                                                    class255 var86 = new class255();
                                                    var86.field3583 = var13;
                                                    var86.field3586 = var13.field371;
                                                    class7.field124.method3594((byte) -50, var86);
                                                    break label615;
                                                }
                                            }
                                        }
                                    }
                                    var13.field337 = class366.field4972;
                                }
                                if (class25.field501 > var13.field264 && var13.field358 != null) {
                                    class255 var88 = new class255();
                                    var88.field3583 = var13;
                                    var88.field3586 = var13.field358;
                                    class7.field124.method3594((byte) 123, var88);
                                }
                                if (class720.field9894 > var13.field264 && var13.field250 != null) {
                                    class255 var89 = new class255();
                                    var89.field3583 = var13;
                                    var89.field3586 = var13.field250;
                                    class7.field124.method3594((byte) -89, var89);
                                }
                                if (class199.field3004 > var13.field264 && var13.field369 != null) {
                                    class255 var90 = new class255();
                                    var90.field3583 = var13;
                                    var90.field3586 = var13.field369;
                                    class7.field124.method3594((byte) 119, var90);
                                }
                                if (class427.field5824 > var13.field264 && var13.field319 != null) {
                                    class255 var91 = new class255();
                                    var91.field3583 = var13;
                                    var91.field3586 = var13.field319;
                                    class7.field124.method3594((byte) 125, var91);
                                }
                                if (class556.field7853 > var13.field264 && var13.field393 != null) {
                                    class255 var92 = new class255();
                                    var92.field3583 = var13;
                                    var92.field3586 = var13.field393;
                                    class7.field124.method3594((byte) -98, var92);
                                }
                                if (class568.field8032 > var13.field264 && var13.field349 != null) {
                                    class255 var93 = new class255();
                                    var93.field3583 = var13;
                                    var93.field3586 = var13.field349;
                                    class7.field124.method3594((byte) -50, var93);
                                }
                                if (class479.field6470 > var13.field264 && var13.field346 != null) {
                                    class255 var94 = new class255();
                                    var94.field3583 = var13;
                                    var94.field3586 = var13.field346;
                                    class7.field124.method3594((byte) 116, var94);
                                }
                                var13.field264 = class62.field859;
                                if (var13.field300 != null) {
                                    for (int var95 = 0; var95 < class399.field5508; var95++) {
                                        class255 var96 = new class255();
                                        var96.field3583 = var13;
                                        var96.field3587 = class257.field3606[var95].method2151((byte) -50);
                                        var96.field3584 = class257.field3606[var95].method2154(-37);
                                        var96.field3586 = var13.field300;
                                        class7.field124.method3594((byte) 116, var96);
                                    }
                                }
                                if (class608.field8490 && var13.field296 != null) {
                                    class255 var97 = new class255();
                                    var97.field3583 = var13;
                                    var97.field3586 = var13.field296;
                                    class7.field124.method3594((byte) -75, var97);
                                }
                            }
                            if (var13.field352 == 5 && var13.field354 != -1) {
                                var13.method118(58, class498.field6811, class780.field10746).method2653(16885, class95.field1472, var13.field330);
                            }
                            class675.method3807(var13, -56);
                            if (var13.field352 == 0) {
                                method2007(arg0, var13.field372, var16, var17, var18, var19, var14 - var13.field252, var15 - var13.field362, arg8, arg9, arg10, arg11);
                                if (var13.field320 != null) {
                                    method2007(var13.field320, var13.field372, var16, var17, var18, var19, var14 - var13.field252, var15 - var13.field362, arg8, arg9, arg10, arg11);
                                }
                                class637 var98 = (class637) class186.field2881.method337((long) var13.field372, 1);
                                if (var98 != null) {
                                    if (class505.field6887 == class177.field2797 && var98.field8790 == 0 && !class611.field8532 && var25 && !class178.field2814) {
                                        class300.method1931((byte) 122);
                                    }
                                    class628.method3530(var16, arg10, var98.field8789, arg11, arg9, var18, var14, arg8, var17, var15, (byte) -49, var19);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class675.method3807(var13, -78);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)Ljava/lang/String;")
    public final String method2008(byte arg0) {
        int var2 = 6 % ((arg0 + 11) / 57);
        field4355++;
        String var3 = null;
        try {
            var3 = "[1)" + class217.field3198 + "," + class400.field5510 + "," + class483.field6515 + "," + class65.field926 + "|";
            if (class235.field3379 != null) {
                var3 = var3 + "2)" + class282.field3917 + "," + (class235.field3379.field5304[0] + class217.field3198) + "," + (class235.field3379.field5308[0] + class400.field5510) + "|";
            }
            var3 = var3 + "3)" + class111.field1911.field6725.method3784((byte) 58) + "|4)" + class111.field1911.field6715.method2511((byte) 84) + "|5)" + class586.method3369(2) + "|6)" + class732.field10098 + "," + class108.field1697 + "|";
            var3 = var3 + "7)" + class111.field1911.field6749.method2258((byte) 92) + "|";
            var3 = var3 + "8)" + class111.field1911.field6717.method3695((byte) 83) + "|";
            var3 = var3 + "9)" + class111.field1911.field6735.method1135((byte) 117) + "|";
            var3 = var3 + "10)" + class111.field1911.field6743.method3385((byte) 79) + "|";
            var3 = var3 + "11)" + class111.field1911.field6760.method1226((byte) 106) + "|";
            var3 = var3 + "12)" + class111.field1911.field6734.method3639((byte) 85) + "|";
            var3 = var3 + "13)" + class455.field6207 + "|";
            var3 = var3 + "14)" + class753.field10398;
            if (class682.field9503 != null) {
                var3 = var3 + "|15)" + class682.field9503.field9139;
            }
            try {
                if (class111.field1911.field6725.method3784((byte) 82) == 2) {
                    Class var4 = Class.forName("java.lang.ClassLoader");
                    Field var5 = var4.getDeclaredField("nativeLibraries");
                    Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var7.invoke(var5, Boolean.TRUE);
                    Vector var8 = (Vector) var5.get((field4363 == null ? (field4363 = method2031("client")) : field4363).getClassLoader());
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
                                    var3 = var3 + "|16)" + Long.toHexString(var13.getLong(var10));
                                    var7.invoke(var13, Boolean.FALSE);
                                }
                            } catch (Throwable var14) {
                            }
                            var7.invoke(var11, Boolean.FALSE);
                        } catch (Throwable var15) {
                        }
                    }
                }
            } catch (Throwable var16) {
            }
            var3 = var3 + "]";
        } catch (Throwable var17) {
        }
        return var3;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method2009() {
        int var0 = class696.field9624;
        int[] var1 = class417.field5700;
        int var2 = class111.field1911.field6739.method1463((byte) 111);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class771 var14 = class527.field7150[var1[var4]];
            if (!var14.method4239(32767)) {
                var14.field5277 = -1;
            } else if (var14.field10622) {
                var14.field5277 = -1;
            } else {
                var14.method1283((byte) 111);
                if (var14.field8368 >= 0 && var14.field8369 >= 0 && var14.field8372 < class483.field6515 && var14.field8365 < class65.field926) {
                    var14.field10658 = var14.field5262 ? var3 : false;
                    if (class235.field3379 == var14) {
                        var14.field5277 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field5229) {
                            var15++;
                        }
                        if (var14.field5231 > class440.field5977) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method2342((byte) -101) << 2);
                        if (var14.field10639 || var14.field10635) {
                            var16 += 512;
                        } else {
                            if (class792.field10852 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field5277 = var16 + 1;
                    }
                } else {
                    var14.field5277 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class610.field8520; var5++) {
            class666 var11 = ((class755) class664.field9216.method337((long) class744.field10273[var5], 1)).field10414;
            if (var11.method3760(32767) && var11.field9253.method3279(-2188, class694.field9613)) {
                var11.method1283((byte) -113);
                if (var11.field8368 >= 0 && var11.field8369 >= 0 && var11.field8372 < class483.field6515 && var11.field8365 < class65.field926) {
                    int var12 = 0;
                    if (!var11.field5229) {
                        var12++;
                    }
                    if (var11.field5231 > class440.field5977) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method2342((byte) 103) << 2);
                    if (class792.field10852 == 0) {
                        if (var11.field9253.field8045) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class792.field10852 == 1) {
                        if (var11.field9253.field8045) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field9253.field8051) {
                        var13 += 1024;
                    } else if (!var11.field9253.field8025) {
                        var13 += 256;
                    }
                    var11.field5277 = var13 + 1;
                } else {
                    var11.field5277 = -1;
                }
            } else {
                var11.field5277 = -1;
            }
        }
        for (int var6 = 0; var6 < class13.field198.length; var6++) {
            class12 var7 = class13.field198[var6];
            if (var7 != null) {
                if (var7.field194 == 1) {
                    class755 var8 = (class755) class664.field9216.method337((long) var7.field192, 1);
                    if (var8 != null) {
                        class666 var9 = var8.field10414;
                        if (var9.field5277 >= 0) {
                            var9.field5277 += 2048;
                        }
                    }
                } else if (var7.field194 == 10) {
                    class771 var10 = class527.field7150[var7.field192];
                    if (var10 != null && class235.field3379 != var10 && var10.field5277 >= 0) {
                        var10.field5277 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lkh;)Lab;")
    public static final class698 method2010(class17 arg0) {
        class698 var1 = (class698) class396.field5475.method337(((long) arg0.field372 << 32) + (long) arg0.field282, 1);
        return var1 == null ? arg0.field263 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLv;)V")
    public static final void method2011(byte arg0, class606 arg1) {
        field4354++;
        arg1.method2942(false);
        boolean var2 = false;
        class606 var3 = (class606) class142.field2405.method1951(-723780560);
        if (arg0 != -69) {
            method2010(null);
        }
        while (var3 != null) {
            if (class513.method2940(arg1.method3443((byte) -26), -98, var3.method3443((byte) -26))) {
                class485.method2771(arg1, -126, var3);
                var2 = true;
                break;
            }
            var3 = (class606) class142.field2405.method1946(-6974);
        }
        if (!var2) {
            class142.field2405.method1953((byte) 83, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method2012(byte arg0) {
        field4352++;
        if (class635.field8783 < class336.field4527.field28) {
            class178.field2812.method4171(-103);
            class28.field536 = (class336.field4527.field28 - 1) * 50 * 5;
            if (class28.field536 > 3000) {
                class28.field536 = 3000;
            }
            if (class336.field4527.field28 >= 2 && class336.field4527.field30 == 6) {
                this.method3800(true, "js5connect_outofdate");
                class753.field10398 = 14;
                return;
            }
            if (class336.field4527.field28 >= 4 && class336.field4527.field30 == -1) {
                this.method3800(true, "js5crc");
                class753.field10398 = 14;
                return;
            }
            if (class336.field4527.field28 >= 4 && class423.method2500(class753.field10398, -32)) {
                if (class336.field4527.field30 == 7 || class336.field4527.field30 == 9) {
                    this.method3800(true, "js5connect_full");
                } else if (class336.field4527.field30 <= 0) {
                    this.method3800(true, "js5io");
                } else if (class459.field6240 == null) {
                    this.method3800(true, "js5connect");
                } else {
                    this.method3800(true, "js5proxy_" + class459.field6240.trim());
                }
                class753.field10398 = 14;
                return;
            }
        }
        class635.field8783 = class336.field4527.field28;
        if (class28.field536 > 0) {
            class28.field536--;
            return;
        }
        if (arg0 >= -115) {
            this.method2013(-100);
        }
        try {
            if (class164.field2604 == 0) {
                class650.field8982 = class178.field2812.method4168(class630.field8751, (byte) -102);
                class164.field2604++;
            }
            if (class164.field2604 == 1) {
                if (class650.field8982.field7412 == 2) {
                    if (class650.field8982.field7416 != null) {
                        class459.field6240 = (String) class650.field8982.field7416;
                    }
                    this.method2016(1000, (byte) 77);
                    return;
                }
                if (class650.field8982.field7412 == 1) {
                    class164.field2604++;
                }
            }
            if (class164.field2604 == 2) {
                class342.field4611 = new class655((Socket) class650.field8982.field7416, class630.field8751, 25000);
                class93 var2 = new class93(5);
                var2.method754(class733.field10119.field6570, 32);
                var2.method759(642, -98);
                class342.field4611.method3683(0, var2.field1413, 5, (byte) -32);
                class164.field2604++;
                class9.field167 = class197.method1423(1);
            }
            if (class164.field2604 == 3) {
                if (class423.method2500(class753.field10398, -101) || class342.field4611.method3684((byte) -109) > 0) {
                    int var3 = class342.field4611.method3685((byte) 23);
                    if (var3 != 0) {
                        this.method2016(var3, (byte) 77);
                        return;
                    }
                    class164.field2604++;
                } else if (class197.method1423(1) - class9.field167 > 30000L) {
                    this.method2016(1001, (byte) 77);
                    return;
                }
            }
            if (class164.field2604 == 4) {
                boolean var4 = class423.method2500(class753.field10398, 125) || class618.method3488(class753.field10398, 4) || class263.method1720(class753.field10398, 0);
                class651[] var5 = class651.method3652(-75);
                class93 var6 = new class93(var5.length * 4);
                class342.field4611.method3686(var6.field1413.length, var6.field1413, 0, -1);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method3645(false, var6.method773(3));
                }
                class336.field4527.method3((byte) 117, class342.field4611, !var4);
                class164.field2604 = 0;
                class650.field8982 = null;
                class342.field4611 = null;
            }
        } catch (IOException var8) {
            this.method2016(1002, (byte) 77);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field4349++;
        if (!this.method3810(57)) {
            return;
        }
        class13.field201 = new class752();
        class13.field201.field10374 = Integer.parseInt(this.getParameter("worldid"));
        class659.field9122 = new class752();
        class659.field9122.field10374 = Integer.parseInt(this.getParameter("lobbyid"));
        class659.field9122.field10366 = this.getParameter("lobbyaddress");
        class436.field5938 = new class752();
        class436.field5938.field10374 = Integer.parseInt(this.getParameter("demoid"));
        class436.field5938.field10366 = this.getParameter("demoaddress");
        class556.field7850 = class373.method2267(Integer.parseInt(this.getParameter("modewhere")), true);
        if (class556.field7850 == class204.field3075) {
            class556.field7850 = class333.field4510;
        } else if (!class368.method2242(class556.field7850, -2752) && class556.field7850 != class517.field7028) {
            class556.field7850 = class517.field7028;
        }
        class563.field7973 = class508.method2898(Integer.parseInt(this.getParameter("modewhat")), (byte) 93);
        if (class643.field8897 != class563.field7973 && class614.field8553 != class563.field7973 && class563.field7973 != class431.field5874) {
            class563.field7973 = class431.field5874;
        }
        try {
            class464.field6309 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class464.field6309 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class460.field6254 = true;
        } else {
            class460.field6254 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class740.field10206 = true;
        } else {
            class740.field10206 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class671.field9317 = true;
        } else {
            class671.field9317 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class177.field2797 = class505.field6887;
            } else if (var4.equals("1")) {
                class177.field2797 = class403.field5534;
            } else if (var4.equals("2")) {
                class177.field2797 = class154.field2526;
            } else if (var4.equals("3")) {
                class177.field2797 = class389.field5344;
            }
        }
        try {
            class361.field4919 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class361.field4919 = 0;
        }
        class207.field3115 = this.getParameter("quiturl");
        class178.field2806 = this.getParameter("settings");
        if (class178.field2806 == null) {
            class178.field2806 = "";
        }
        class235.field3381 = "1".equals(this.getParameter("under"));
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class520.field7057 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class520.field7057 = 0;
            }
        }
        class289.field3986 = Integer.parseInt(this.getParameter("colourid"));
        if (class289.field3986 < 0 || class289.field3986 >= class236.field3393.length) {
            class289.field3986 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class664.field9231 = true;
            class790.field10829 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class258.field3619 = true;
        }
        class245.field3476 = this.getParameter("sskey");
        if (class245.field3476 != null && class245.field3476.length() < 2) {
            class245.field3476 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class770.field10614 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class655.field9070 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class746.field10302 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class714.field9829 = this.getParameter("additionalInfo");
        if (class714.field9829 != null && class714.field9829.length() > 50) {
            class714.field9829 = null;
        }
        if (class505.field6887 == class177.field2797) {
            class412.field5635 = 503;
            class374.field5075 = 765;
        } else if (class403.field5534 == class177.field2797) {
            class374.field5075 = 640;
            class412.field5635 = 480;
        }
        class594.field8348 = this;
        this.method3809(37, 642, class563.field7973.method630((byte) -65) + 32, class374.field5075, class412.field5635, class177.field2797.field8380, 99);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method2013(int arg0) {
        field4344++;
        boolean var2 = class336.field4527.method13(false);
        if (!var2) {
            this.method2012((byte) -124);
        }
        if (arg0 > -32) {
            field4357 = 63;
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method2014(int arg0) {
        int var1 = class696.field9624;
        int[] var2 = class417.field5700;
        int var3 = class694.field9612 ? var1 : class610.field8520 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class385 var5;
            if (var4 < var1) {
                var5 = class527.field7150[var2[var4]];
            } else {
                var5 = ((class755) class664.field9216.method337((long) class744.field10273[var4 - var1], 1)).field10414;
            }
            if (var5.field7391 == arg0) {
                var5.field5210 = 0;
                if (var5.field5277 < 0) {
                    var5.field5229 = false;
                } else {
                    int var6 = var5.method2342((byte) 127);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field7396 & 0x1FF) != 0 || (var5.field7398 & 0x1FF) != 0) {
                            var5.field5229 = false;
                            continue;
                        }
                    } else if ((var5.field7396 & 0x1FF) != 256 || (var5.field7398 & 0x1FF) != 256) {
                        var5.field5229 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field7396 >> 9;
                        int var8 = var5.field7398 >> 9;
                        if (class74.field1069[var7][var8] != var5.field5277) {
                            var5.field5229 = true;
                            continue;
                        }
                        if (class78.field1107[var7][var8] > 1) {
                            var10002 = class78.field1107[var7][var8]--;
                            var5.field5229 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field7396 - var9 >> 9;
                        int var11 = var5.field7398 - var9 >> 9;
                        int var12 = var5.field7396 + var9 >> 9;
                        int var13 = var5.field7398 + var9 >> 9;
                        if (!class454.method2623(1, var13, var10, var12, var11, var5.field5277)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class74.field1069[var14][var15] == var5.field5277) {
                                        var10002 = class78.field1107[var14][var15]--;
                                    }
                                }
                            }
                            var5.field5229 = true;
                            continue;
                        }
                    }
                    var5.field5229 = false;
                    var5.field7405 = class309.method1973(15356, var5.field7396, var5.field7398, var5.field7391);
                    class737.method4088(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method2015() {
        class20.field441 = 0;
        for (int var0 = 0; var0 < class610.field8520; var0++) {
            class666 var1 = ((class755) class664.field9216.method337((long) class744.field10273[var0], 1)).field10414;
            if (var1.field5229 && var1.method2331((byte) -109) != -1) {
                int var2 = (var1.method2342((byte) 101) - 1) * 256 + 252;
                int var3 = var1.field7396 - var2 >> 9;
                int var4 = var1.field7398 - var2 >> 9;
                class385 var5 = class777.method4264(var3, (byte) 25, var1.field7391, var4);
                if (var5 != null) {
                    int var6 = var5.field5288;
                    if (var5 instanceof class666) {
                        var6 += 2048;
                    }
                    if (var5.field5210 == 0 && var5.method2331((byte) 122) != -1) {
                        class187.field2892[class20.field441] = var6;
                        class766.field10569[class20.field441] = var6;
                        class20.field441++;
                        var5.field5210++;
                    }
                    class187.field2892[class20.field441] = var6;
                    class766.field10569[class20.field441] = var1.field5288 + 2048;
                    class20.field441++;
                    var5.field5210++;
                }
            }
        }
        class642.method3572(class187.field2892, class766.field10569, -115, class20.field441 - 1, 0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method2016(int arg0, byte arg1) {
        class164.field2604 = 0;
        if (arg1 != 77) {
            field4357 = 82;
        }
        class650.field8982 = null;
        class336.field4527.field30 = arg0;
        field4347++;
        class336.field4527.field28++;
        class342.field4611 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final synchronized void method2017(int arg0) {
        field4362++;
        if (class286.field3936 != null && class558.field7896 == null && !class630.field8751.field10253) {
            try {
                Class var2 = class286.field3936.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class558.field7896 = (Canvas) var3.get(class286.field3936);
                var3.set(class286.field3936, null);
                if (class558.field7896 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method2017(arg0);
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method2018(int arg0) {
        field4356++;
        if (arg0 > -89) {
            field4353 = -5;
        }
        if (class753.field10398 == 14) {
            return;
        }
        long var2 = class63.method433(1) / 1000000L - class316.field4322;
        class316.field4322 = class63.method433(1) / 1000000L;
        boolean var4 = class610.method3464(19782);
        if (var4 && class299.field4117 && class89.field1277 != null) {
            class89.field1277.method2702(0);
        }
        if (class113.method1027(7, class753.field10398)) {
            if (class603.field8443 != 0L && class603.field8443 < class197.method1423(1)) {
                class66.method513(class672.field9325, 126, class586.method3369(2), class540.field7342, false);
            } else if (!class95.field1472.method578() && class768.field10590) {
                class356.method2196(82);
            }
        }
        if (class703.field9674 == null) {
            Container var5;
            if (class194.field2956 != null) {
                var5 = class194.field2956;
            } else if (class286.field3936 == null) {
                var5 = class286.field3938;
            } else {
                var5 = class286.field3936;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class194.field2956 == var5) {
                Insets var8 = class194.field2956.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.left + var8.right;
            }
            if (class760.field10464 != var6 || class540.field7360 != var7 || class235.field3375) {
                if (class95.field1472 == null || class95.field1472.method584()) {
                    class471.method2715(2048);
                } else {
                    class760.field10464 = var6;
                    class540.field7360 = var7;
                }
                class603.field8443 = class197.method1423(1) + 500L;
                class235.field3375 = false;
            }
        }
        if (class703.field9674 != null && !class29.field539 && class113.method1027(7, class753.field10398)) {
            class66.method513(-1, 121, class111.field1911.field6714.method2951((byte) 93), -1, false);
        }
        boolean var9 = false;
        if (class711.field9797) {
            var9 = true;
            class711.field9797 = false;
        }
        if (var9) {
            class472.method2717(0);
        }
        if (class95.field1472 != null && class95.field1472.method578() || class586.method3369(2) != 1) {
            class622.method3506(124);
        }
        if (class423.method2500(class753.field10398, 125)) {
            class424.method2505(var9, -79);
        } else if (class224.method1533(class753.field10398, -6)) {
            class436.method2548(0);
        } else if (class757.method4191(true, class753.field10398)) {
            class436.method2548(0);
        } else if (class287.method1837(class753.field10398, (byte) 69)) {
            if (class156.field2545 == 1) {
                if (class488.field6582 < class563.field7983) {
                    class488.field6582 = class563.field7983;
                }
                int var11 = (class488.field6582 - class563.field7983) * 50 / class488.field6582;
                class289.method1844(class95.field1472, class16.field239, class359.field4908, class641.field8830.method3566((byte) -64, class464.field6309) + "<br>(" + var11 + "%)", true, (byte) 11);
            } else if (class156.field2545 == 2) {
                if (class483.field6519 < class56.field799) {
                    class483.field6519 = class56.field799;
                }
                int var10 = (class483.field6519 - class56.field799) * 50 / class483.field6519 + 50;
                class289.method1844(class95.field1472, class16.field239, class359.field4908, class641.field8830.method3566((byte) -124, class464.field6309) + "<br>(" + var10 + "%)", true, (byte) 11);
            } else {
                class289.method1844(class95.field1472, class16.field239, class359.field4908, class641.field8830.method3566((byte) -74, class464.field6309), true, (byte) 11);
            }
        } else if (class753.field10398 == 10) {
            class558.method3229((byte) 59, var2);
        } else if (class753.field10398 == 13) {
            class289.method1844(class95.field1472, class16.field239, class359.field4908, class641.field8832.method3566((byte) 119, class464.field6309) + "<br>" + class641.field8833.method3566((byte) -52, class464.field6309), false, (byte) 11);
        }
        if (class652.field9029 == 3) {
            for (int var12 = 0; var12 < class526.field7139; var12++) {
                Rectangle var13 = class713.field9815[var12];
                if (class338.field4574[var12]) {
                    class95.field1472.method568(-65281, var13.x, var13.width, -74, var13.height, var13.y);
                } else if (class684.field9516[var12]) {
                    class95.field1472.method568(-65536, var13.x, var13.width, -103, var13.height, var13.y);
                } else {
                    class95.field1472.method568(-16711936, var13.x, var13.width, -75, var13.height, var13.y);
                }
            }
        }
        if (class223.method1521(-75)) {
            class520.method2960(class95.field1472, false);
        }
        if (class630.field8751.field10253 && class113.method1027(7, class753.field10398) && class652.field9029 == 0 && class586.method3369(2) == 1 && !var9) {
            int var14 = 0;
            for (int var15 = 0; var15 < class526.field7139; var15++) {
                if (class684.field9516[var15]) {
                    class684.field9516[var15] = false;
                    class125.field2212[var14++] = class713.field9815[var15];
                }
            }
            try {
                if (class618.field8597) {
                    class682.method3843(class125.field2212, var14, (byte) -84);
                } else {
                    class95.field1472.method571(class125.field2212, var14, 89);
                }
            } catch (class789 var20) {
            }
        } else if (!class423.method2500(class753.field10398, 125)) {
            for (int var16 = 0; var16 < class526.field7139; var16++) {
                class684.field9516[var16] = false;
            }
            try {
                if (class618.field8597) {
                    class407.method2429(-41);
                } else {
                    class95.field1472.method483(-2);
                }
            } catch (class789 var19) {
                class281.method1820(var19.getMessage() + " (Recovered) " + this.method2008((byte) 87), 28395, var19);
                class624.method3517(false, 0, 0);
            }
        }
        class305.method1952(-55);
        int var18 = class111.field1911.field6729.method1648((byte) 93);
        if (var18 == 0) {
            class643.method3577(15L, 0);
        } else if (var18 == 1) {
            class643.method3577(10L, 0);
        } else if (var18 == 2) {
            class643.method3577(5L, 0);
        } else if (var18 == 3) {
            class643.method3577(2L, 0);
        }
        if (class318.field4333) {
            class324.method2061((byte) 73);
        }
        if (class111.field1911.field6769.method3191((byte) 89) == 1 && class753.field10398 == 3 && class359.field4911 != -1) {
            class111.field1911.method2823(true, class111.field1911.field6769, 0);
            class307.method1957(0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method2019(int arg0) {
        field4359++;
        if (class770.field10614) {
            class455.field6207 = 64;
        }
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class471.method2715(2048);
        class499.field6818 = new class14(class630.field8751);
        class336.field4527 = new class1();
        class361.method2218(new int[] { 20, 260 }, new int[] { 1000, 100 }, arg0 - 10018);
        if (class556.field7850 != class517.field7028) {
            class143.field2426 = new byte[50][];
        }
        class111.field1911 = class229.method1559(false);
        if (class556.field7850 == class517.field7028) {
            class13.field201.field10366 = this.getCodeBase().getHost();
        } else if (class368.method2242(class556.field7850, arg0 - 12770)) {
            class13.field201.field10366 = this.getCodeBase().getHost();
            class13.field201.field10372 = class13.field201.field10374 + 40000;
            class659.field9122.field10372 = class659.field9122.field10374 + 40000;
            class436.field5938.field10372 = class436.field5938.field10374 + 40000;
            class13.field201.field10373 = class13.field201.field10374 + 50000;
            class659.field9122.field10373 = class659.field9122.field10374 + 50000;
            class436.field5938.field10373 = class436.field5938.field10374 + 50000;
        } else if (class556.field7850 == class204.field3075) {
            class13.field201.field10366 = "127.0.0.1";
            class659.field9122.field10366 = "127.0.0.1";
            class13.field201.field10372 = class13.field201.field10374 + 40000;
            class436.field5938.field10366 = "127.0.0.1";
            class659.field9122.field10372 = class659.field9122.field10374 + 40000;
            class436.field5938.field10372 = class436.field5938.field10374 + 40000;
            class13.field201.field10373 = class13.field201.field10374 + 50000;
            class659.field9122.field10373 = class659.field9122.field10374 + 50000;
            class436.field5938.field10373 = class436.field5938.field10374 + 50000;
        }
        class178.field2812 = class13.field201;
        class377.field5130 = class89.field1287 = class148.field2478 = class269.field3774 = new short[256];
        if (class403.field5534 == class177.field2797) {
            field4353 = 16777215;
            class260.field3651 = class501.field6854;
            class647.field8943 = class148.field2476;
            class318.field4334 = true;
            class625.field8718 = 0;
        } else if (class389.field5344 == class177.field2797) {
            class260.field3651 = class187.field2890;
            class647.field8943 = class277.field3837;
        } else {
            class260.field3651 = class57.field805;
            class647.field8943 = class364.field4949;
        }
        if (class505.field6887 == class177.field2797) {
            class195.field2971 = false;
        }
        try {
            if (arg0 != 10018) {
                this.method2020(-28);
            }
            class717.field9868 = class594.field8348.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class789.field10821 = class644.method3583(60, class558.field7896);
        class420.field5727 = class271.method1758(class558.field7896, (byte) -111, true);
        try {
            if (class630.field8751.field10229 != null) {
                class154.field2531 = new class439(class630.field8751.field10229, 5200, 0);
                for (int var3 = 0; var3 < 37; var3++) {
                    class371.field5052[var3] = new class439(class630.field8751.field10252[var3], 6000, 0);
                }
                class780.field10747 = new class439(class630.field8751.field10239, 6000, 0);
                class561.field7960 = new class241(255, class154.field2531, class780.field10747, 500000);
                class769.field10595 = new class439(class630.field8751.field10254, 24, 0);
                class630.field8751.field10229 = null;
                class630.field8751.field10239 = null;
                class630.field8751.field10254 = null;
                class630.field8751.field10252 = null;
            }
        } catch (IOException var5) {
            class561.field7960 = null;
            class780.field10747 = null;
            class769.field10595 = null;
            class154.field2531 = null;
        }
        if (class556.field7850 != class517.field7028) {
            class236.field3391 = true;
        }
        class735.field10155 = class641.field8830.method3566((byte) -103, class464.field6309);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method2020(int arg0) {
        field4361++;
        if (class111.field1911.field6725.method3784((byte) 50) == 2) {
            try {
                this.method2018(-105);
            } catch (ThreadDeath var4) {
                throw var4;
            } catch (Throwable var5) {
                class281.method1820(var5.getMessage() + " (Recovered) " + this.method2008((byte) -126), 28395, var5);
                class398.field5488 = true;
                class624.method3517(false, 0, 0);
            }
        } else {
            this.method2018(-95);
        }
        if (arg0 != 511) {
            this.method2018(-83);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZLha;Lc;Lka;IIIIIIII)Lka;")
    public static final class499 method2021(int arg0, int arg1, boolean arg2, class66 arg3, class200 arg4, class499 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field4351++;
        if (arg5 == null) {
            return null;
        }
        int var14 = 2055;
        if (!arg2) {
            field4353 = -103;
        }
        if (arg4 != null) {
            int var15 = var14 | arg4.method1440((byte) 56, arg8, -1, false);
            var14 = var15 & 0xFFFFFDFF;
        }
        long var16 = ((long) arg13 << 32) + (long) (arg10 - (-(arg6 << 16) - (arg11 << 24))) + ((long) arg7 << 48);
        class43 var18 = class770.field10617;
        class499 var19;
        synchronized (class770.field10617) {
            var19 = (class499) class770.field10617.method266((byte) -126, var16);
        }
        if (var19 == null || arg3.method482(var19.method300(), var14) != 0) {
            if (var19 != null) {
                var14 = arg3.method593(var14, var19.method300());
            }
            byte var20;
            if (arg10 == 1) {
                var20 = 9;
            } else if (arg10 == 2) {
                var20 = 12;
            } else if (arg10 == 3) {
                var20 = 15;
            } else if (arg10 == 4) {
                var20 = 18;
            } else {
                var20 = 21;
            }
            byte var21 = 3;
            int[] var22 = new int[] { 64, 96, 128 };
            class5 var23 = new class5(var20 * var21 + 1, var21 * 2 * var20 + -var20, 0);
            int var24 = var23.method36(0, 0, 124, 0);
            int[][] var25 = new int[var21][var20];
            for (int var26 = 0; var26 < var21; var26++) {
                int var27 = var22[var26];
                int var28 = var22[var26];
                for (int var29 = 0; var29 < var20; var29++) {
                    int var30 = (var29 << 14) / var20;
                    int var31 = class191.field2937[var30] * var27 >> 14;
                    int var32 = class191.field2936[var30] * var28 >> 14;
                    var25[var26][var29] = var23.method36(var31, 0, 125, var32);
                }
            }
            for (int var33 = 0; var33 < var21; var33++) {
                int var34 = (var33 * 256 + 128) / var21;
                int var35 = 256 - var34;
                byte var36 = (byte) (arg6 * var35 + arg11 * var34 >> 8);
                short var37 = (short) (((arg7 & 0x7F) * var34 + (arg13 & 0x7F) * var35 & 0x7F00) + ((arg7 & 0xFC00) * var34 + (arg13 & 0xFC00) * var35 & 0xFC0000) + ((arg7 & 0x380) * var34 + (arg13 & 0x380) * var35 & 0x38000) >> 8);
                for (int var38 = 0; var38 < var20; var38++) {
                    if (var33 == 0) {
                        var23.method37((byte) -1, (byte) 1, -127, (short) -1, var36, var25[0][var38], var37, var25[0][(var38 + 1) % var20], var24);
                    } else {
                        var23.method37((byte) -1, (byte) 1, -128, (short) -1, var36, var25[var33][(var38 + 1) % var20], var37, var25[var33 - 1][(var38 + 1) % var20], var25[var33 - 1][var38]);
                        var23.method37((byte) -1, (byte) 1, -128, (short) -1, var36, var25[var33][var38], var37, var25[var33][(var38 + 1) % var20], var25[var33 - 1][var38]);
                    }
                }
            }
            var19 = arg3.method505(var23, var14, class487.field6577, 64, 768);
            class43 var39 = class770.field10617;
            synchronized (class770.field10617) {
                class770.field10617.method270(var19, var16, -122);
            }
        }
        int var40 = arg5.method315();
        int var41 = arg5.method291();
        int var42 = arg5.method283();
        int var43 = arg5.method304();
        class366 var44 = null;
        if (arg4 != null) {
            int var45 = arg4.field3040[arg8];
            var44 = class108.field1696.method1277(var45 >> 16, -1);
            arg8 = var45 & 0xFFFF;
        }
        class499 var46;
        if (var44 == null) {
            var46 = var19.method324((byte) 3, var14, true);
            var46.method282(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method305(var40 + var41 >> 1, 0, var42 + var43 >> 1);
        } else {
            var46 = var19.method324((byte) 3, var14, true);
            var46.method282(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method305(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            var46.method2852(arg8, 0, var44);
        }
        if (arg12 != 0) {
            var46.method316(arg12);
        }
        if (arg0 != 0) {
            var46.method302(arg0);
        }
        if (arg1 != 0) {
            var46.method305(0, arg1, 0);
        }
        return var46;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class509.method2905("Argument count", 76);
            }
            class13.field201 = new class752();
            class13.field201.field10374 = Integer.parseInt(arg0[0]);
            class659.field9122 = new class752();
            class659.field9122.field10374 = Integer.parseInt(arg0[1]);
            class436.field5938 = new class752();
            class436.field5938.field10374 = Integer.parseInt(arg0[2]);
            class556.field7850 = class204.field3075;
            if (arg0[3].equals("live")) {
                class563.field7973 = class431.field5874;
            } else if (arg0[3].equals("rc")) {
                class563.field7973 = class614.field8553;
            } else if (arg0[3].equals("wip")) {
                class563.field7973 = class643.field8897;
            } else {
                class509.method2905("modewhat", 81);
            }
            class464.field6309 = class749.method4161(arg0[4], true);
            if (class464.field6309 == -1) {
                if (arg0[4].equals("english")) {
                    class464.field6309 = 0;
                } else if (arg0[4].equals("german")) {
                    class464.field6309 = 1;
                } else {
                    class509.method2905("language", 74);
                }
            }
            class740.field10206 = false;
            class460.field6254 = false;
            if (arg0[5].equals("game0")) {
                class177.field2797 = class505.field6887;
            } else if (arg0[5].equals("game1")) {
                class177.field2797 = class403.field5534;
            } else if (arg0[5].equals("game2")) {
                class177.field2797 = class154.field2526;
            } else if (arg0[5].equals("game3")) {
                class177.field2797 = class389.field5344;
            } else {
                class509.method2905("game", -112);
            }
            class714.field9829 = null;
            class245.field3476 = null;
            class746.field10302 = 0L;
            class664.field9231 = true;
            class790.field10829 = true;
            class655.field9070 = 0;
            class258.field3619 = false;
            class770.field10614 = false;
            class361.field4919 = 0;
            class178.field2806 = "";
            class520.field7057 = 0;
            class289.field3986 = class177.field2797.field8378;
            client var1 = new client();
            class594.field8348 = var1;
            var1.method3802(37, class563.field7973.method630((byte) -65) + 32, 10, false, 1024, 768, 642, class177.field2797.field8380);
            class194.field2956.setLocation(40, 40);
        } catch (Exception var3) {
            class281.method1820(null, 28395, var3);
        }
        field4358++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method2022(byte arg0) {
        int var2 = -93 % ((-arg0 - 45) / 62);
        field4345++;
        if (class111.field1911.field6725.method3784((byte) 127) != 2) {
            this.method2029((byte) -82);
            return;
        }
        try {
            this.method2029((byte) -50);
        } catch (ThreadDeath var5) {
            throw var5;
        } catch (Throwable var6) {
            class281.method1820(var6.getMessage() + " (Recovered) " + this.method2008((byte) 105), 28395, var6);
            class398.field5488 = true;
            class624.method3517(false, 0, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method2023(byte arg0) {
        field4360++;
        if (class753.field10398 == 7 && class517.field7034 == 0) {
            if (class445.field6088 > 1) {
                class479.field6470 = class62.field859;
                class445.field6088--;
            }
            if (!class611.field8532) {
                class300.method1931((byte) 96);
            }
            for (int var2 = 0; var2 < 100 && class528.method3004((byte) 109); var2++) {
            }
        }
        class241.field3425++;
        class259.method1687(-1, 10403, null, -1);
        class23.method158(-1, null, (byte) -49, -1);
        class13.method72(0);
        class62.field859++;
        for (int var3 = 0; var3 < class406.field5583; var3++) {
            class666 var4 = class491.field6712[var3].field10414;
            if (var4 != null) {
                byte var5 = var4.field9253.field8034;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method2342((byte) -88);
                    if ((var5 & 0x2) != 0 && var4.field5307 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field5304[0] + var7;
                            int var10 = var4.field5308[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if ((class483.field6515 - var6 - 1) < var9) {
                                var9 = class483.field6515 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (class65.field926 - var6 - 1 < var10) {
                                var10 = class65.field926 - var6 - 1;
                            }
                            int var11 = class260.method1689(0, -64, var6, -1, var10, var4.field5308[0], class711.field9798[var4.field7391], true, var9, class203.field3066, 0, class482.field6505, var6, var4.field5304[0], var6);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field5304[var12] = class482.field6505[var11 - var12 - 1];
                                    var4.field5308[var12] = class203.field3066[var11 - var12 - 1];
                                    var4.field5306[var12] = 1;
                                }
                                var4.field5307 = var11;
                            }
                        }
                    }
                    class650.method3641((byte) -51, true, var4);
                    int var13 = class790.method4312(var4, false);
                    class479.method2744(var4, false);
                    class179.method1353((byte) -127, class93.field1431, field4357, var4, var13);
                    class579.method3335(var4, field4357, 125);
                    class566.method3270(var4, 0);
                }
            }
        }
        if (class517.field7034 == 0 && class70.field1043 == 0) {
            if (class536.field7291 == 2) {
                class737.method4089((byte) 15);
            } else {
                class504.method2879((byte) -123);
            }
            if (class733.field10131 >> 9 < 14 || class733.field10131 >> 9 >= class483.field6515 - 14 || class450.field6172 >> 9 < 14 || (class450.field6172 >> 9) >= (class65.field926 - 14)) {
                class187.method1384(true);
            }
        }
        while (true) {
            class255 var14;
            class17 var15;
            class17 var16;
            do {
                var14 = (class255) class334.field4513.method3584(23287);
                if (var14 == null) {
                    while (true) {
                        class255 var17;
                        class17 var18;
                        class17 var19;
                        do {
                            var17 = (class255) class525.field7137.method3584(23287);
                            if (var17 == null) {
                                while (true) {
                                    class255 var20;
                                    class17 var21;
                                    class17 var22;
                                    do {
                                        var20 = (class255) class7.field124.method3584(23287);
                                        if (var20 == null) {
                                            if (class84.field1157 != null) {
                                                class15.method87(19597);
                                            }
                                            if (class440.field5977 % 1500 == 0) {
                                                class257.method1681((byte) -127);
                                            }
                                            if (class753.field10398 == 7 && class517.field7034 == 0) {
                                                class496.method2848(-16227);
                                            }
                                            class401.method2402(0);
                                            if (class271.field3792 && class18.field429 < class197.method1423(1) - 60000L) {
                                                class551.method3138((byte) -59);
                                            }
                                            for (class504 var23 = (class504) class61.field849.method1597((byte) -53); var23 != null; var23 = (class504) class61.field849.method1601(88)) {
                                                if ((long) var23.field6875 < class197.method1423(1) / 1000L - 5L) {
                                                    if (var23.field6878 > 0) {
                                                        class648.method3634(5, var23.field6880 + class641.field8837.method3566((byte) -48, class464.field6309), (byte) -13, "", "", 0, "");
                                                    }
                                                    if (var23.field6878 == 0) {
                                                        class648.method3634(5, var23.field6880 + class641.field8838.method3566((byte) -45, class464.field6309), (byte) -13, "", "", 0, "");
                                                    }
                                                    var23.method731((byte) 39);
                                                }
                                            }
                                            if (class753.field10398 == 7 && class517.field7034 == 0) {
                                                if (class193.field2948 == null) {
                                                    class479.method2746(false, false);
                                                    return;
                                                }
                                                class243.field3467++;
                                                if (class243.field3467 > 50) {
                                                    class664.field9226++;
                                                    class537 var24 = class476.method2729(class320.field4370, (byte) -46, class551.field7498);
                                                    class173.method1314(false, var24);
                                                }
                                                try {
                                                    class149.method1191(44);
                                                } catch (IOException var25) {
                                                    class479.method2746(false, false);
                                                }
                                            }
                                            if (arg0 > -12) {
                                                method2011((byte) 25, null);
                                                return;
                                            }
                                            return;
                                        }
                                        var21 = var20.field3583;
                                        if (var21.field282 < 0) {
                                            break;
                                        }
                                        var22 = class379.method2309(var21.field336, 192);
                                    } while (var22 == null || var22.field320 == null || var21.field282 >= var22.field320.length || var22.field320[var21.field282] != var21);
                                    class76.method644(var20);
                                }
                            }
                            var18 = var17.field3583;
                            if (var18.field282 < 0) {
                                break;
                            }
                            var19 = class379.method2309(var18.field336, 192);
                        } while (var19 == null || var19.field320 == null || var18.field282 >= var19.field320.length || var19.field320[var18.field282] != var18);
                        class76.method644(var17);
                    }
                }
                var15 = var14.field3583;
                if (var15.field282 < 0) {
                    break;
                }
                var16 = class379.method2309(var15.field336, 192);
            } while (var16 == null || var16.field320 == null || var15.field282 >= var16.field320.length || var16.field320[var15.field282] != var15);
            class76.method644(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method2024(int arg0) {
        class608.method3452(81);
        field4350++;
        class281.method1816((byte) 87);
        class641.method3564((byte) -102);
        class472.method2718(-1);
        class174.method1328(-91);
        class334.method2096((byte) 127);
        class576.method3325((byte) -79);
        class651.method3651(true);
        class358.method2207((byte) 75);
        class523.method2975(arg0 ^ 0xFFFFFFA9);
        class513.method2941(2481);
        class154.method1206((byte) 43);
        class305.method1947((byte) 69);
        class46.method340(0);
        class498.method2850(0);
        class71.method631((byte) -83);
        class235.method1582(true);
        class598.method3400((byte) -102);
        class650.method3643(arg0 - 84);
        class66.method555(true);
        class492.method2829(8);
        class659.method3702(125);
        class12.method69(true);
        class21.method141(125);
        class1.method2(0);
        class14.method77(arg0 ^ 0xFFFF95FF);
        class369.method2244(-21);
        class377.method2293(arg0 ^ 0x6B8B);
        class662.method3736(true);
        class439.method2555((byte) -68);
        class241.method1607(arg0 + 57);
        class16.method98((byte) 82);
        class323.method2057((byte) 60);
        class469.method2699(arg0 - 3);
        class647.method3632((byte) 127);
        class264.method1726((byte) -82);
        class381.method2316(arg0 ^ 0xFFFFFFD4);
        class726.method4026(54);
        class340.method2120(21);
        class318.method2003(arg0 + 55);
        class143.method1161((byte) -61);
        class654.method3674(-32512);
        class347.method2146(64);
        class10.method67(false);
        class790.method4311(0);
        class562.method3252(true);
        class299.method1922(arg0 ^ 0x67);
        class791.method4319((byte) -75);
        class777.method4262(-256);
        class341.method2122((byte) 50);
        class269.method1749(-128);
        class755.method4185(arg0 + 16777206);
        class107.method920(38);
        class93.method786((byte) -80);
        class415.method2451(arg0 - 119);
        class329.method2075(10);
        class783.method4276(-52);
        class243.method1624(3);
        class355.method2188((byte) 126);
        class157.method1222(-102);
        class678.method3821(126);
        class461.method2652(arg0 + 118);
        class277.method1782(4760);
        class771.method4242((byte) -126);
        class617.method3484(112);
        class280.method1804((byte) 97);
        class265.method1729(0);
        class118.method1047((byte) -95);
        class537.method3039((byte) -116);
        class385.method2334(-27550);
        class348.method2149(arg0 - 7);
        class666.method3762(-1);
        class637.method3556((byte) 33);
        class698.method3883((byte) 123);
        class320.method2035((byte) 24);
        class728.method4041((byte) 108);
        class455.method2626(arg0 + 8459);
        class90.method732((byte) 17);
        class384.method2328(34037);
        class525.method2988((byte) -24);
        class197.method1426((byte) -115);
        class635.method3552(arg0 + 22);
        class732.method4069(arg0 - 65545);
        class658.method3698(false);
        class102.method887(119);
        class505.method2883(true);
        class519.method2955(-60);
        class312.method1980(-15805);
        class257.method1682((byte) 109);
        class178.method1347((byte) 115);
        class620.method3492(arg0 - 9);
        class112.method1023(-1);
        class222.method1517((byte) 6);
        class366.method2235(true);
        class82.method671(16);
        class499.method2862(113);
        class578.method3332(false);
        class28.method184((byte) -108);
        class339.method2114(21721);
        class286.method1830(1);
        class445.method2585((byte) 106);
        class5.method40(0);
        class548.method3080(arg0 - 7547);
        class325.method2063(125);
        class730.method4062((byte) 99);
        class67.method606(-1);
        class583.method3352(false);
        class426.method2510(false);
        class159.method1225(3);
        class8.method54(arg0 - 14);
        class411.method2436(arg0 ^ 0x6738D8A9);
        class522.method2968(true);
        class611.method3468((byte) 110);
        class634.method3546(0);
        class206.method1464(-24601);
        class371.method2259((byte) -116);
        class657.method3693(-110);
        class333.method2091((byte) -126);
        class718.method3989(114);
        class183.method1367(-1478);
        class330.method2084(true);
        class592.method3388(3);
        class668.method3783(2);
        class649.method3640(1);
        class138.method1134(97);
        class517.method2950(-103);
        class249.method1650(29707);
        class276.method1777(-128);
        class554.method3192((byte) 68);
        class109.method924(127);
        class444.method2575(arg0 + 7);
        class502.method2873((byte) 22);
        class317.method1997(48);
        class100.method873(false);
        class789.method4310(-80);
        class514.method2944(1161);
        class307.method1960(true);
        class271.method1755(-8166);
        class543.method3062(arg0 ^ 0xFFFFFF86);
        class558.method3208(false);
        class470.method2705((byte) -66);
        class480.method2750(true);
        class481.method2757((byte) 3);
        class76.method646();
        class15.method86(-21707);
        class780.method4272((byte) -5);
        class177.method1345((byte) 126);
        class88.method706(-23039);
        class4.method22(0);
        class784.method4281(0);
        class745.method4134(256);
        class350.method2156(false);
        class74.method640(arg0 - 92);
        class352.method2158(0);
        class337.method2109(126);
        class466.method2685((byte) 106);
        class202.method1451(-12872);
        class614.method3475(21625);
        class431.method2528(0);
        class11.method68((byte) 8);
        class447.method2598(-19);
        class13.method74((byte) 113);
        class146.method1179((byte) 110);
        class290.method1848(-4259);
        class64.method459();
        class602.method3409((byte) 108);
        class425.method2507(2);
        class270.method1754((byte) 98);
        class748.method4154(true);
        class573.method3317(88);
        class496.method2847(-733);
        class282.method1822(110);
        class528.method3003(true);
        class494.method2838(arg0 + 70);
        class114.method1028(-1);
        class375.method2275(13);
        class186.method1379(90);
        class435.method2544(126);
        class467.method2686(51);
        class121.method1060(false);
        class788.method4297();
        class133.method1109((byte) -102);
        class120.method1054(116);
        class694.method3876(77);
        class503.method2875((byte) -124);
        class332.method2090((byte) 29);
        class194.method1408(1);
        class359.method2211((byte) -14);
        class508.method2897(0);
        class585.method3363();
        class228.method1553(12);
        class521.method2961(11920);
        class744.method4129(1);
        class150.method1193(false);
        class663.method3753(arg0 - 5);
        class199.method1434(arg0 - 9);
        class652.method3656(19637);
        class436.method2546(-52);
        class373.method2264((byte) -52);
        class524.method2985((byte) -36);
        class58.method411(-1);
        class3.method20(500);
        class667.method3774();
        class624.method3516(-49);
        class72.method632(75);
        class482.method2758((byte) 74);
        class38.method234(0);
        class167.method1298();
        class747.method4143((byte) -86);
        class491.method2814(true);
        class571.method3311((byte) 100);
        class539.method3048(255);
        class479.method2743(1);
        class253.method1662();
        class30.method191(100);
        class593.method3389(true);
        class665.method3759(2);
        class451.method2613(-104);
        class184.method1372(arg0 - 9);
        class153.method1204(-256);
        class706.method3948(0);
        class273.method1764(-1);
        class610.method3462(121);
        class126.method1083(arg0 ^ 0xFFFFFF8D);
        class6.method46((byte) 100);
        class485.method2774((byte) -119);
        class689.method3867((byte) 78);
        class304.method1943(false);
        class223.method1525(-92);
        class506.method2892(2);
        class395.method2390(arg0 + 115);
        class356.method2198(-1722598584);
        class125.method1076(false);
        class464.method2681(-1);
        class378.method2305(7641);
        class434.method2542(arg0 ^ 0x4A);
        class636.method3553(arg0 ^ 0x3A);
        class413.method2444(arg0 + 112);
        class78.method664(arg0 + 12657);
        class639.method3563((byte) -7);
        class630.method3540(false);
        class164.method1287((byte) -122);
        class104.method906(arg0 - 4);
        class459.method2641(-126);
        class653.method3671((byte) 42);
        class234.method1576(arg0 ^ 0xFFFFE043);
        class110.method926((byte) -128);
        class170.method1304(arg0 ^ 0x59A6);
        class766.method4218((byte) -98);
        class692.method3871((byte) -66);
        class487.method2778(65535);
        class533.method3021((byte) -93);
        class450.method2608(0);
        class628.method3532((byte) -122);
        class205.method1460(-2753);
        class322.method2050((byte) -106);
        class717.method3985((byte) 3);
        class313.method1983(18328);
        class119.method1052(-109);
        class364.method2223((byte) 4);
        class224.method1538(true);
        class404.method2416(true);
        class758.method4194(-32248);
        class433.method2538(26095);
        class101.method878((byte) 97);
        class603.method3423((byte) -112);
        class408.method2430(true);
        class429.method2522(false);
        class414.method2446(false);
        class478.method2740((byte) 79);
        class713.method3969(-127);
        class338.method2112((byte) -127);
        class37.method230(arg0 ^ 0xFFFFF04B);
        class236.method1586(arg0 ^ 0xFFFFFFA1);
        class311.method1978((byte) -46);
        class527.method2996(107);
        class84.method674(0);
        class686.method3862(-80);
        class709.method3955(67);
        class210.method1476(-69);
        class238.method1588((byte) 119);
        class616.method3482(arg0 ^ 0xFFFFBF15);
        class727.method4036(-109);
        class703.method3927((byte) 115);
        class360.method2215((byte) 126);
        class565.method3264((byte) -41);
        class198.method1429(2);
        class778.method4268((byte) -88);
        class625.method3518((byte) -112);
        class207.method1465(-52);
        class607.method3448(true);
        class526.method2991(128);
        class531.method3013(arg0 + 111);
        class553.method3184();
        class7.method50(256);
        class768.method4228(false);
        class302.method1934((byte) 87);
        class471.method2710((byte) -92);
        class117.method1041(-3442);
        class142.method1154(65536);
        class357.method2203(24);
        class564.method3262(16402);
        class622.method3507((byte) 123);
        class345.method2134((byte) 21);
        class682.method3842(arg0 + 118);
        class387.method2353(125);
        class550.method3085((byte) -126);
        class683.method3850(-104);
        class443.method2573(true);
        class261.method1694();
        class773.method4254(4);
        class500.method2865(true);
        class166.method1297();
        class50.method384();
        class80.method667((byte) 80);
        class684.method3853((byte) -26);
        class632.method3542();
        class124.method1071(false);
        class759.method4200((byte) 94);
        class383.method2326(5120);
        class656.method3688((byte) -118);
        class215.method1500(true);
        class507.method2894(-27940);
        class343.method2129((byte) -41);
        class279.method1788((byte) -122);
        class336.method2102(arg0 ^ 0x32E8);
        class70.method629(false);
        class476.method2727((byte) -113);
        class424.method2504(arg0 - 5);
        class594.method3392(arg0 ^ 0xFFFFFFF6);
        class541.method3056(-127);
        class403.method2409(100);
        class422.method2499((byte) -50);
        class705.method3936();
        class370.method2254(true);
        class774.method4258(-2);
        class566.method3269(arg0 - 5);
        class400.method2401(true);
        class227.method1551(0);
        class127.method1090(arg0 ^ 0xFFFFFFD5);
        class567.method3274(arg0 ^ 0x9);
        class428.method2521(arg0 - 34);
        class555.method3195(-1);
        class95.method804(arg0 ^ 0xA);
        class79.method666(true);
        class410.method2435(1);
        class644.method3579(arg0 - 23716);
        class532.method3017(-83);
        class55.method399(arg0 ^ 0xFFFFBCA3);
        class707.method3950((byte) -128);
        class418.method2459((byte) -95);
        class762.method4213(732);
        class111.method947((byte) -67);
        class315.method1992((byte) 23);
        class757.method4190(arg0 ^ 0x9);
        class65.method462(0);
        class648.method3638(1);
        class391.method2369((byte) 100);
        class711.method3960(118);
        class417.method2457((byte) 24);
        class346.method2138((byte) -82);
        class18.method127(arg0 ^ 0xFFFFFF88);
        class268.method1744(3314);
        class185.method1376(arg0 ^ 0x2D);
        class488.method2782(1);
        class354.method2166(-30196);
        class335.method2100(true);
        class34.method200((byte) 12);
        class551.method3104(true);
        class601.method3407((byte) 119);
        class497.method2849(true);
        class440.method2563(false);
        class421.method2477(15);
        class660.method3709(arg0 - 27753);
        class365.method2225((byte) -70);
        class626.method3525((byte) 81);
        class155.method1211(false);
        class246.method1640((byte) 120);
        class591.method3383((byte) 89);
        class552.method3174(0);
        class193.method1404(43);
        class89.method721(-127);
        class599.method3402(arg0 - 26502);
        class240.method1603((byte) -41);
        class677.method3818(3);
        class588.method3379((byte) 116);
        class761.method4210((byte) 122);
        class97.method813(false);
        class676.method3816((byte) 51);
        class468.method2691();
        class139.method1139(false);
        class169.method1301((byte) 111);
        class135.method1112((byte) -122);
        class501.method2870((byte) -52);
        class770.method4232(-67);
        class427.method2514(-120);
        class108.method923(0);
        class672.method3793(arg0 ^ 0xFFFFD5AB);
        class248.method1646(arg0 - 9);
        class324.method2060(5);
        class671.method3791(arg0 - 10);
        class695.method3877(-11727);
        class473.method2719((byte) 109);
        if (arg0 != 9) {
            this.method2017(-47);
        }
        class331.method2088((byte) 22);
        class664.method3755(-72);
        class179.method1352((byte) -1);
        class220.method1514(arg0 ^ 0xFFFFFFA2);
        class204.method1457((byte) 78);
        class590.method3381(-1);
        class62.method432(-4);
        class99.method871(75);
        class518.method2954((byte) -113);
        class661.method3717(4096);
        class288.method1841(arg0 + 4087);
        class148.method1185(126);
        class23.method159((byte) 100);
        class586.method3368(arg0 ^ 0x246B3F45);
        class456.method2629(arg0 ^ 0x809);
        class475.method2726(3);
        class681.method3840(-121);
        class258.method1683(true);
        class203.method1454(-124);
        class225.method1541();
        class559.method3248((byte) -78);
        class81.method669(-70);
        class609.method3459((byte) 6);
        class390.method2365(31778);
        class327.method2069((byte) 1);
        class298.method1913(arg0 - 9);
        class211.method1486(arg0 ^ 0x8);
        class679.method3828((byte) -89);
        class297.method1909(false);
        class712.method3965(true);
        class462.method2661(-126);
        class187.method1381(4);
        class580.method3340(-8050);
        class98.method870(-31940);
        class60.method419(0);
        class256.method1676(7548);
        class699.method3893((byte) 123);
        class509.method2903(21);
        class168.method1300((byte) -128);
        class191.method1397(arg0 ^ 0x4009);
        class724.method4018(2);
        class720.method3996(-65534);
        class27.method178(arg0 ^ 0xFFFFC638);
        class152.method1196(112);
        class579.method3333(5);
        class743.method4126(false);
        class190.method1395(97);
        class737.method4091(-97);
        class85.method682((byte) -128);
        class563.method3255((byte) -67);
        class396.method2392(16);
        class754.method4183(7681);
        class392.method2375(124);
        class546.method3068(86);
        class405.method2420(true);
        class407.method2426(3);
        class379.method2311(arg0 ^ 0xFFFFFFAD);
        class342.method2127(-22745);
        class582.method3341(false);
        class54.method394(true);
        class736.method4085(127);
        class642.method3568((byte) 127);
        class141.method1145(arg0 - 84);
        class87.method694(arg0 - 9);
        class389.method2362(3);
        class680.method3833(255);
        class760.method4207((byte) 78);
        class61.method424((byte) 69);
        class402.method2403((byte) 107);
        class218.method1509(-112);
        class259.method1686(false);
        class615.method3481(16741381);
        class295.method1893((byte) 44);
        class619.method3490(123);
        class643.method3576((byte) -44);
        class47.method346((byte) 71);
        class463.method2674(arg0 ^ 0x1408);
        class753.method4175(-18009);
        class673.method3796(false);
        class160.method1228((byte) -90);
        class397.method2396(true);
        class214.method1496(arg0 ^ 0x8);
        class561.method3250(arg0 + 34327);
        class278.method1785(38);
        class262.method1712(100);
        class245.method1633((byte) -81);
        class764.method4216((byte) 110);
        class309.method1972(1);
        class741.method4100(arg0 - 7);
        class201.method1447(30847);
        class57.method406(arg0 ^ 0x52);
        class33.method196(arg0 ^ 0x8);
        class483.method2762(81);
        class287.method1838((byte) -15);
        class504.method2878(8192);
        class536.method3037(69);
        class556.method3200(-120);
        class430.method2525(0);
        class399.method2399(arg0 - 10);
        class274.method1766(40);
        class128.method1092(-962345311);
        class776.method4260(false);
        class24.method164(arg0 + 67);
        class606.method3439(arg0 - 7280);
        class534.method3030(518);
        class208.method1466(arg0 - 265);
        class769.method4231((byte) -128);
        class449.method2606((byte) 55);
        class735.method4078((byte) 110);
        class132.method1106(true);
        class633.method3544((byte) 8);
        class714.method3975(arg0 + 90);
        class353.method2159((byte) -88);
        class687.method3864(arg0 - 22280);
        class767.method4223(-124);
        class260.method1692((byte) 110);
        class106.method913((byte) 13);
        class172.method1311(0);
        class495.method2842(213);
        class230.method1565((byte) 91);
        class700.method3894(5168);
        class254.method1672(true);
        class388.method2358((byte) -69);
        class465.method2684(10);
        class530.method3012(true);
        class584.method3358((byte) 0);
        class538.method3045(false);
        class209.method1470(0);
        class420.method2469(20939);
        class217.method1506(arg0 + 8253);
        class557.method3204(127);
        class782.method4274(28243);
        class733.method4072((byte) -82);
        class303.method1936(arg0 ^ 0xFFFFFF9A);
        class367.method2240((byte) -94);
        class22.method150(true);
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public static final void method2025(int arg0) {
        int var1 = class696.field9624;
        int[] var2 = class417.field5700;
        for (int var3 = 0; var3 < class610.field8520 + var1; var3++) {
            class385 var4;
            if (var3 < var1) {
                var4 = class527.field7150[var2[var3]];
            } else {
                var4 = ((class755) class664.field9216.method337((long) class744.field10273[var3 - var1], 1)).field10414;
            }
            if (var4.field7391 == arg0 && var4.field5277 >= 0) {
                int var5 = var4.method2342((byte) 93);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field7396 & 0x1FF) != 0 || (var4.field7398 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field7396 & 0x1FF) != 256 || (var4.field7398 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field7396 >> 9;
                    int var7 = var4.field7398 >> 9;
                    if (var4.field5277 > class74.field1069[var6][var7]) {
                        class74.field1069[var6][var7] = var4.field5277;
                        class78.field1107[var6][var7] = 1;
                    } else if (class74.field1069[var6][var7] == var4.field5277) {
                        var10002 = class78.field1107[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field7396 - var8 >> 9;
                    int var10 = var4.field7398 - var8 >> 9;
                    int var11 = var4.field7396 + var8 >> 9;
                    int var12 = var4.field7398 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field5277 > class74.field1069[var13][var14]) {
                                class74.field1069[var13][var14] = var4.field5277;
                                class78.field1107[var13][var14] = 1;
                            } else if (class74.field1069[var13][var14] == var4.field5277) {
                                var10002 = class78.field1107[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method2026() {
        int var0 = class696.field9624;
        int[] var1 = class417.field5700;
        int var2 = class694.field9612 ? var0 : class610.field8520 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class385 var4;
            if (var3 < var0) {
                var4 = class527.field7150[var1[var3]];
            } else {
                var4 = ((class755) class664.field9216.method337((long) class744.field10273[var3 - var0], 1)).field10414;
            }
            if (var4.field5277 >= 0) {
                int var5 = var4.method2342((byte) 115);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field7396 & 0x1FF) == 0 && (var4.field7398 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field7396 & 0x1FF) == 256 && (var4.field7398 & 0x1FF) == 256) {
                    continue;
                }
                var4.field7405 = class309.method1973(15356, var4.field7396, var4.field7398, var4.field7391);
                class737.method4088(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lkh;)Lkh;")
    public static final class17 method2027(class17 arg0) {
        int var1 = method2010(arg0).method3885(126);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class379.method2309(arg0.field336, 192);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method2028(byte arg0) {
        field4348++;
        if (class271.field3792) {
            class551.method3138((byte) -120);
        }
        class644.method3582(false);
        if (class95.field1472 != null) {
            class95.field1472.method594(0);
        }
        if (class703.field9674 != null) {
            class315.method1989(1, class703.field9674, class630.field8751);
            class703.field9674 = null;
        }
        if (class193.field2948 != null) {
            class193.field2948.method917(119);
            class193.field2948 = null;
        }
        class173.method1315(true);
        class336.field4527.method7(80);
        class499.field6818.method82(-18733);
        if (class111.field1848 != null) {
            class111.field1848.method1626(3808);
            class111.field1848 = null;
        }
        try {
            class154.field2531.method2549((byte) 76);
            if (arg0 <= 37) {
                method2026();
            }
            for (int var2 = 0; var2 < 37; var2++) {
                class371.field5052[var2].method2549((byte) 76);
            }
            class780.field10747.method2549((byte) 76);
            class769.field10595.method2549((byte) 76);
            class564.method3260(-1);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method2029(byte arg0) {
        field4346++;
        if (arg0 >= -42 || class753.field10398 == 14) {
            return;
        }
        class440.field5977++;
        if ((class440.field5977 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class461.field6257 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class599.field8385.setSeed((long) class461.field6257);
        }
        if ((class440.field5977 % 50) == 0) {
            class262.field3669 = class722.field9901;
            class523.field7114 = class671.field9314;
            class722.field9901 = 0;
            class671.field9314 = 0;
        }
        this.method2013(-51);
        if (class352.field4697 != null) {
            class352.field4697.method2246(126);
        }
        class748.method4153((byte) 87);
        class107.method918((byte) 125);
        class789.field10821.method1527(18696);
        class420.field5727.method1318((byte) -99);
        if (class95.field1472 != null) {
            class95.field1472.method481((int) class197.method1423(1));
        }
        class141.method1146(-31455);
        class399.field5508 = 0;
        class65.field944 = 0;
        for (class349 var3 = class789.field10821.method1530((byte) -109); var3 != null; var3 = class789.field10821.method1530((byte) -91)) {
            int var6 = var3.method2152(126);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method2154(125);
                if (class366.method2233(-15233) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class223.method1521(-118)) {
                        class787.method4290(-20016);
                    } else {
                        class749.method4159(0);
                    }
                } else if (class399.field5508 < 128) {
                    class257.field3606[class399.field5508] = var3;
                    class399.field5508++;
                }
            } else if (var6 == 0 && class65.field944 < 75) {
                class755.field10415[class65.field944] = var3;
                class65.field944++;
            }
        }
        class113.field2112 = 0;
        for (class556 var4 = class420.field5727.method1325(true); var4 != null; var4 = class420.field5727.method1325(true)) {
            int var5 = var4.method2733(0);
            if (var5 == -1) {
                class496.field6786.method3594((byte) 110, var4);
            } else if (var5 == 6) {
                class113.field2112 += var4.method2732(-76);
            } else if (class446.method2595(var5, (byte) -33)) {
                class373.field5070.method3594((byte) 115, var4);
                if (class373.field5070.method3595((byte) -123) > 10) {
                    class373.field5070.method3584(23287);
                }
            }
        }
        if (class223.method1521(-75)) {
            class141.method1148(2734);
        }
        if (class423.method2500(class753.field10398, -123)) {
            class554.method3190(-19018);
            class659.method3707(95);
        } else if (class287.method1837(class753.field10398, (byte) 68)) {
            class234.method1577((byte) -118);
        }
        if (class618.method3488(class753.field10398, 4) && !class287.method1837(class753.field10398, (byte) 50)) {
            this.method2023((byte) -96);
            class287.method1836((byte) -121);
            class9.method61(false);
        } else if (class263.method1720(class753.field10398, 0) && !class287.method1837(class753.field10398, (byte) 125)) {
            this.method2023((byte) -25);
            class9.method61(false);
        } else if (class753.field10398 == 12) {
            class9.method61(false);
        } else if (class787.method4288(class753.field10398, (byte) 79) && !class287.method1837(class753.field10398, (byte) 107)) {
            class274.method1768((byte) -101);
        } else if (class753.field10398 == 13) {
            class9.method61(false);
            if (class533.field7216 != -3 && class533.field7216 != 2 && class533.field7216 != 15) {
                class479.method2746(false, false);
            }
        }
        class519.method2956(class95.field1472, -86);
        class373.field5070.method3584(23287);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lkh;)Z")
    public static final boolean method2030(class17 arg0) {
        if (class178.field2814) {
            if (method2010(arg0).field9638 != 0) {
                return false;
            }
            if (arg0.field352 == 0) {
                return false;
            }
        }
        return arg0.field404;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2031(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
