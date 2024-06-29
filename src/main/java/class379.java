import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class379 {

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "[I")
    private static int[] field5230 = new int[3];

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    private static int field5233 = 0;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "[Ljava/lang/String;")
    private static String[] field5244 = new String[1000];

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "[I")
    private static int[] field5245 = new int[5];

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "[J")
    private static long[] field5243 = new long[1000];

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "[I")
    private static int[] field5251 = new int[1000];

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    private static int field5238 = 0;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    private static int field5240 = 0;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "[[I")
    private static int[][] field5254 = new int[5][5000];

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
    private static int field5246 = 0;

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "[Lsj;")
    private static class483[] field5250 = new class483[50];

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Loo;")
    public static class652 field5225 = new class652(4);

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
    private static int field5255 = 0;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "Lmda;")
    private static class276 field5247;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "Lhs;")
    private static class344 field5236;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "Lmea;")
    private static class451 field5234;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "Lmea;")
    private static class451 field5235;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Llc;")
    private static class673 field5227;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "[I")
    private static int[] field5252;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "[J")
    private static long[] field5231;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "[Ljava/lang/String;")
    private static String[] field5229;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method2344(String arg0, int arg1) {
        if (class745.field10317 == 0 && !(!class404.field5525 || class34.field466) || class338.field4740) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class620.field8708.method3580(0, 12))) {
            var3 = 0;
            arg0 = arg0.substring(class620.field8708.method3580(0, 12).length());
        } else if (var2.startsWith(class620.field8709.method3580(0, 12))) {
            var3 = 1;
            arg0 = arg0.substring(class620.field8709.method3580(0, 12).length());
        } else if (var2.startsWith(class620.field8710.method3580(0, 12))) {
            var3 = 2;
            arg0 = arg0.substring(class620.field8710.method3580(0, 12).length());
        } else if (var2.startsWith(class620.field8711.method3580(0, 12))) {
            var3 = 3;
            arg0 = arg0.substring(class620.field8711.method3580(0, 12).length());
        } else if (var2.startsWith(class620.field8712.method3580(0, 12))) {
            var3 = 4;
            arg0 = arg0.substring(class620.field8712.method3580(0, 12).length());
        } else if (var2.startsWith(class620.field8713.method3580(0, 12))) {
            var3 = 5;
            arg0 = arg0.substring(class620.field8713.method3580(0, 12).length());
        } else if (var2.startsWith(class620.field8714.method3580(0, 12))) {
            var3 = 6;
            arg0 = arg0.substring(class620.field8714.method3580(0, 12).length());
        } else if (var2.startsWith(class620.field8715.method3580(0, 12))) {
            var3 = 7;
            arg0 = arg0.substring(class620.field8715.method3580(0, 12).length());
        } else if (var2.startsWith(class620.field8716.method3580(0, 12))) {
            var3 = 8;
            arg0 = arg0.substring(class620.field8716.method3580(0, 12).length());
        } else if (var2.startsWith(class620.field8717.method3580(0, 12))) {
            var3 = 9;
            arg0 = arg0.substring(class620.field8717.method3580(0, 12).length());
        } else if (var2.startsWith(class620.field8718.method3580(0, 12))) {
            var3 = 10;
            arg0 = arg0.substring(class620.field8718.method3580(0, 12).length());
        } else if (var2.startsWith(class620.field8719.method3580(0, 12))) {
            var3 = 11;
            arg0 = arg0.substring(class620.field8719.method3580(0, 12).length());
        } else if (class140.field2081 != 0) {
            if (var2.startsWith(class620.field8708.method3580(class140.field2081, 12))) {
                var3 = 0;
                arg0 = arg0.substring(class620.field8708.method3580(class140.field2081, 12).length());
            } else if (var2.startsWith(class620.field8709.method3580(class140.field2081, 12))) {
                var3 = 1;
                arg0 = arg0.substring(class620.field8709.method3580(class140.field2081, 12).length());
            } else if (var2.startsWith(class620.field8710.method3580(class140.field2081, 12))) {
                var3 = 2;
                arg0 = arg0.substring(class620.field8710.method3580(class140.field2081, 12).length());
            } else if (var2.startsWith(class620.field8711.method3580(class140.field2081, 12))) {
                var3 = 3;
                arg0 = arg0.substring(class620.field8711.method3580(class140.field2081, 12).length());
            } else if (var2.startsWith(class620.field8712.method3580(class140.field2081, 12))) {
                var3 = 4;
                arg0 = arg0.substring(class620.field8712.method3580(class140.field2081, 12).length());
            } else if (var2.startsWith(class620.field8713.method3580(class140.field2081, 12))) {
                var3 = 5;
                arg0 = arg0.substring(class620.field8713.method3580(class140.field2081, 12).length());
            } else if (var2.startsWith(class620.field8714.method3580(class140.field2081, 12))) {
                var3 = 6;
                arg0 = arg0.substring(class620.field8714.method3580(class140.field2081, 12).length());
            } else if (var2.startsWith(class620.field8715.method3580(class140.field2081, 12))) {
                var3 = 7;
                arg0 = arg0.substring(class620.field8715.method3580(class140.field2081, 12).length());
            } else if (var2.startsWith(class620.field8716.method3580(class140.field2081, 12))) {
                var3 = 8;
                arg0 = arg0.substring(class620.field8716.method3580(class140.field2081, 12).length());
            } else if (var2.startsWith(class620.field8717.method3580(class140.field2081, 12))) {
                var3 = 9;
                arg0 = arg0.substring(class620.field8717.method3580(class140.field2081, 12).length());
            } else if (var2.startsWith(class620.field8718.method3580(class140.field2081, 12))) {
                var3 = 10;
                arg0 = arg0.substring(class620.field8718.method3580(class140.field2081, 12).length());
            } else if (var2.startsWith(class620.field8719.method3580(class140.field2081, 12))) {
                var3 = 11;
                arg0 = arg0.substring(class620.field8719.method3580(class140.field2081, 12).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class620.field8720.method3580(0, 12))) {
            var5 = 1;
            arg0 = arg0.substring(class620.field8720.method3580(0, 12).length());
        } else if (var4.startsWith(class620.field8721.method3580(0, 12))) {
            var5 = 2;
            arg0 = arg0.substring(class620.field8721.method3580(0, 12).length());
        } else if (var4.startsWith(class620.field8722.method3580(0, 12))) {
            var5 = 3;
            arg0 = arg0.substring(class620.field8722.method3580(0, 12).length());
        } else if (var4.startsWith(class620.field8723.method3580(0, 12))) {
            var5 = 4;
            arg0 = arg0.substring(class620.field8723.method3580(0, 12).length());
        } else if (var4.startsWith(class620.field8724.method3580(0, 12))) {
            var5 = 5;
            arg0 = arg0.substring(class620.field8724.method3580(0, 12).length());
        } else if (class140.field2081 != 0) {
            if (var4.startsWith(class620.field8720.method3580(class140.field2081, 12))) {
                var5 = 1;
                arg0 = arg0.substring(class620.field8720.method3580(class140.field2081, 12).length());
            } else if (var4.startsWith(class620.field8721.method3580(class140.field2081, 12))) {
                var5 = 2;
                arg0 = arg0.substring(class620.field8721.method3580(class140.field2081, 12).length());
            } else if (var4.startsWith(class620.field8722.method3580(class140.field2081, 12))) {
                var5 = 3;
                arg0 = arg0.substring(class620.field8722.method3580(class140.field2081, 12).length());
            } else if (var4.startsWith(class620.field8723.method3580(class140.field2081, 12))) {
                var5 = 4;
                arg0 = arg0.substring(class620.field8723.method3580(class140.field2081, 12).length());
            } else if (var4.startsWith(class620.field8724.method3580(class140.field2081, 12))) {
                var5 = 5;
                arg0 = arg0.substring(class620.field8724.method3580(class140.field2081, 12).length());
            }
        }
        field5253++;
        class312 var6 = class353.method2245(class87.field971, class210.field3251, (byte) 100);
        var6.field4445.method2952(0, 0);
        int var7 = var6.field4445.field7042;
        var6.field4445.method2952(0, var3);
        var6.field4445.method2952(0, var5);
        class488.method2904(arg0, -100, var6.field4445);
        var6.field4445.method2951(false, var6.field4445.field7042 - var7);
        class208.method1440(var6, 53);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "()V")
    public static void method2345() {
        field5252 = null;
        field5229 = null;
        field5231 = null;
        field5245 = null;
        field5254 = null;
        field5251 = null;
        field5244 = null;
        field5243 = null;
        field5250 = null;
        field5234 = null;
        field5235 = null;
        field5227 = null;
        field5247 = null;
        field5236 = null;
        field5230 = null;
        field5225 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)V")
    private static final void method2346(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 150) {
                field5238 -= 3;
                int var2 = field5251[field5238];
                int var3 = field5251[field5238 + 1];
                int var4 = field5251[field5238 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class451 var5 = class166.method1238((byte) -121, var2);
                if (var5.field6270 == null) {
                    var5.field6270 = new class451[var4 + 1];
                }
                if (var5.field6270.length <= var4) {
                    class451[] var6 = new class451[var4 + 1];
                    for (int var7 = 0; var7 < var5.field6270.length; var7++) {
                        var6[var7] = var5.field6270[var7];
                    }
                    var5.field6270 = var6;
                }
                if (var4 > 0 && var5.field6270[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class451 var8 = new class451();
                var8.field6210 = var3;
                var8.field6233 = var8.field6222 = var5.field6222;
                var8.field6246 = var4;
                var5.field6270[var4] = var8;
                if (arg1) {
                    field5235 = var8;
                } else {
                    field5234 = var8;
                }
                class564.method3329(var5, 8195);
                return;
            }
            if (arg0 == 151) {
                class451 var9 = arg1 ? field5235 : field5234;
                if (var9.field6246 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class451 var10 = class166.method1238((byte) -71, var9.field6222);
                var10.field6270[var9.field6246] = null;
                class564.method3329(var10, 8195);
                return;
            }
            if (arg0 == 152) {
                class451 var11 = class166.method1238((byte) -59, field5251[--field5238]);
                var11.field6270 = null;
                class564.method3329(var11, 8195);
                return;
            }
            if (arg0 == 200) {
                field5238 -= 2;
                int var12 = field5251[field5238];
                int var13 = field5251[field5238 + 1];
                class451 var14 = class63.method422(var13, 17492, var12);
                if (var14 != null && var13 != -1) {
                    field5251[field5238++] = 1;
                    if (arg1) {
                        field5235 = var14;
                        return;
                    }
                    field5234 = var14;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field5251[--field5238];
                class451 var16 = class166.method1238((byte) -63, var15);
                if (var16 != null) {
                    field5251[field5238++] = 1;
                    if (arg1) {
                        field5235 = var16;
                        return;
                    }
                    field5234 = var16;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field5251[--field5238];
                method2361(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field5251[--field5238];
                method2351(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field5238 -= 2;
                int var19 = field5251[field5238];
                int var20 = field5251[field5238 + 1];
                if (class210.field3250.field9765 == null) {
                    return;
                }
                for (int var21 = 0; var21 < class124.field1924.length; var21++) {
                    if (class124.field1924[var21] == var19) {
                        class210.field3250.field9765.method1333(class386.field5352, var21, var20, 126);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class694.field9689.length; var22++) {
                    if (class694.field9689[var22] == var19) {
                        class210.field3250.field9765.method1333(class386.field5352, var22, var20, 55);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field5238 -= 2;
                int var23 = field5251[field5238];
                int var24 = field5251[field5238 + 1];
                if (class210.field3250.field9765 == null) {
                    return;
                }
                class210.field3250.field9765.method1325(23276, var23, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field5251[--field5238] != 0;
                if (class210.field3250.field9765 == null) {
                    return;
                }
                class210.field3250.field9765.method1335(0, var25);
                return;
            }
            if (arg0 == 411) {
                field5238 -= 2;
                int var26 = field5251[field5238];
                int var27 = field5251[field5238 + 1];
                if (class210.field3250.field9765 == null) {
                    return;
                }
                class210.field3250.field9765.method1330(var26, class313.field4456, -1, var27);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class451 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class166.method1238((byte) -82, field5251[--field5238]);
            } else {
                var28 = arg1 ? field5235 : field5234;
            }
            if (arg0 == 1000) {
                field5238 -= 4;
                var28.field6174 = field5251[field5238];
                var28.field6284 = field5251[field5238 + 1];
                int var29 = field5251[field5238 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field5251[field5238 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field6325 = (byte) var29;
                var28.field6177 = (byte) var30;
                class564.method3329(var28, 8195);
                class620.method3578((byte) -128, var28);
                if (var28.field6246 == -1) {
                    class62.method414(true, var28.field6222);
                }
                return;
            }
            if (arg0 == 1001) {
                field5238 -= 4;
                var28.field6202 = field5251[field5238];
                var28.field6257 = field5251[field5238 + 1];
                var28.field6243 = 0;
                var28.field6267 = 0;
                int var31 = field5251[field5238 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field5251[field5238 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field6286 = (byte) var31;
                var28.field6327 = (byte) var32;
                class564.method3329(var28, 8195);
                class620.method3578((byte) -128, var28);
                if (var28.field6210 == 0) {
                    class679.method3849(82, var28, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field5251[--field5238] == 1;
                if (var28.field6255 != var33) {
                    var28.field6255 = var33;
                    class564.method3329(var28, 8195);
                }
                if (var28.field6246 == -1) {
                    class295.method1923(var28.field6222, 7);
                }
                return;
            }
            if (arg0 == 1004) {
                field5238 -= 2;
                var28.field6234 = field5251[field5238];
                var28.field6294 = field5251[field5238 + 1];
                class564.method3329(var28, 8195);
                class620.method3578((byte) -128, var28);
                if (var28.field6210 == 0) {
                    class679.method3849(94, var28, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field6212 = field5251[--field5238] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class451 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class166.method1238((byte) -106, field5251[--field5238]);
            } else {
                var34 = arg1 ? field5235 : field5234;
            }
            if (arg0 == 1100) {
                field5238 -= 2;
                var34.field6292 = field5251[field5238];
                if (var34.field6292 > var34.field6301 - var34.field6290) {
                    var34.field6292 = var34.field6301 - var34.field6290;
                }
                if (var34.field6292 < 0) {
                    var34.field6292 = 0;
                }
                var34.field6173 = field5251[field5238 + 1];
                if (var34.field6173 > var34.field6169 - var34.field6288) {
                    var34.field6173 = var34.field6169 - var34.field6288;
                }
                if (var34.field6173 < 0) {
                    var34.field6173 = 0;
                }
                class564.method3329(var34, 8195);
                if (var34.field6246 == -1) {
                    class314.method2012(12, var34.field6222);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field6304 = field5251[--field5238];
                class564.method3329(var34, 8195);
                if (var34.field6246 == -1) {
                    class139.method1007(6, var34.field6222);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field6343 = field5251[--field5238] == 1;
                class564.method3329(var34, 8195);
                return;
            }
            if (arg0 == 1103) {
                var34.field6307 = field5251[--field5238];
                class564.method3329(var34, 8195);
                return;
            }
            if (arg0 == 1104) {
                var34.field6193 = field5251[--field5238];
                class564.method3329(var34, 8195);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field5251[--field5238];
                if (var34.field6264 != var35) {
                    var34.field6264 = var35;
                    class564.method3329(var34, 8195);
                }
                if (var34.field6246 == -1) {
                    class642.method3661(false, var34.field6222);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field6218 = field5251[--field5238];
                class564.method3329(var34, 8195);
                return;
            }
            if (arg0 == 1107) {
                var34.field6322 = field5251[--field5238] == 1;
                class564.method3329(var34, 8195);
                return;
            }
            if (arg0 == 1108) {
                var34.field6248 = 1;
                var34.field6239 = field5251[--field5238];
                class564.method3329(var34, 8195);
                if (var34.field6246 == -1) {
                    class100.method713(var34.field6222, 107);
                }
                return;
            }
            if (arg0 == 1109) {
                field5238 -= 6;
                var34.field6273 = field5251[field5238];
                var34.field6199 = field5251[field5238 + 1];
                var34.field6172 = field5251[field5238 + 2];
                var34.field6258 = field5251[field5238 + 3];
                var34.field6208 = field5251[field5238 + 4];
                var34.field6299 = field5251[field5238 + 5];
                class564.method3329(var34, 8195);
                if (var34.field6246 == -1) {
                    class495.method3008(8, var34.field6222);
                    class673.method3826((byte) 105, var34.field6222);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field5251[--field5238];
                if (var34.field6167 != var36) {
                    var34.field6167 = var36;
                    var34.field6339 = 0;
                    var34.field6228 = 1;
                    var34.field6324 = 0;
                    class607 var37 = var34.field6167 == -1 ? null : class563.field7993.method651(var34.field6167, (byte) 107);
                    if (var37 != null) {
                        class662.method3776(var37, var34.field6339, -32);
                    }
                    class564.method3329(var34, 8195);
                }
                if (var34.field6246 == -1) {
                    class487.method2899((byte) 14, var34.field6222);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field6185 = field5251[--field5238] == 1;
                class564.method3329(var34, 8195);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field5244[--field5233];
                if (!var38.equals(var34.field6241)) {
                    var34.field6241 = var38;
                    class564.method3329(var34, 8195);
                }
                if (var34.field6246 == -1) {
                    class575.method3378(var34.field6222, 3);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field6266 = field5251[--field5238];
                class564.method3329(var34, 8195);
                if (var34.field6246 == -1) {
                    class48.method338(var34.field6222, 55);
                }
                return;
            }
            if (arg0 == 1114) {
                field5238 -= 3;
                var34.field6237 = field5251[field5238];
                var34.field6225 = field5251[field5238 + 1];
                var34.field6194 = field5251[field5238 + 2];
                class564.method3329(var34, 8195);
                return;
            }
            if (arg0 == 1115) {
                var34.field6205 = field5251[--field5238] == 1;
                class564.method3329(var34, 8195);
                return;
            }
            if (arg0 == 1116) {
                var34.field6303 = field5251[--field5238];
                class564.method3329(var34, 8195);
                return;
            }
            if (arg0 == 1117) {
                var34.field6282 = field5251[--field5238];
                class564.method3329(var34, 8195);
                return;
            }
            if (arg0 == 1118) {
                var34.field6213 = field5251[--field5238] == 1;
                class564.method3329(var34, 8195);
                return;
            }
            if (arg0 == 1119) {
                var34.field6179 = field5251[--field5238] == 1;
                class564.method3329(var34, 8195);
                return;
            }
            if (arg0 == 1120) {
                field5238 -= 2;
                var34.field6301 = field5251[field5238];
                var34.field6169 = field5251[field5238 + 1];
                class564.method3329(var34, 8195);
                if (var34.field6210 == 0) {
                    class679.method3849(107, var34, false);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field6297 = field5251[--field5238] == 1;
                class564.method3329(var34, 8195);
                return;
            }
            if (arg0 == 1123) {
                var34.field6299 = field5251[--field5238];
                class564.method3329(var34, 8195);
                if (var34.field6246 == -1) {
                    class495.method3008(8, var34.field6222);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field5251[--field5238];
                var34.field6201 = var39 == 1;
                class564.method3329(var34, 8195);
                return;
            }
            if (arg0 == 1125) {
                field5238 -= 2;
                var34.field6196 = field5251[field5238];
                var34.field6206 = field5251[field5238 + 1];
                class564.method3329(var34, 8195);
                return;
            }
            if (arg0 == 1126) {
                var34.field6249 = field5251[--field5238];
                class564.method3329(var34, 8195);
                return;
            }
            if (arg0 == 1127) {
                field5238 -= 2;
                int var40 = field5251[field5238];
                int var41 = field5251[field5238 + 1];
                class645 var42 = class184.field2832.method4117((byte) 49, var40);
                if (var42.field9011 != var41) {
                    var34.method2696(var40, -8243, var41);
                    return;
                }
                var34.method2682(var40, (byte) 81);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field5251[--field5238];
                String var44 = field5244[--field5233];
                class645 var45 = class184.field2832.method4117((byte) 49, var43);
                if (!var45.field9012.equals(var44)) {
                    var34.method2683(var43, 14044, var44);
                    return;
                }
                var34.method2682(var43, (byte) 43);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var52 = field5251[--field5238];
                if ((var34.field6210 == 5 || arg0 != 1129) && (var34.field6210 == 4 || arg0 != 1130)) {
                    if (var34.field6236 != var52) {
                        var34.field6236 = var52;
                        class564.method3329(var34, 8195);
                    }
                    if (var34.field6246 == -1) {
                        class16.method154(var34.field6222, 21857);
                    }
                    return;
                }
                return;
            }
            if (arg0 == 1131) {
                field5238 -= 3;
                int var46 = field5251[field5238];
                short var47 = (short) field5251[field5238 + 1];
                short var48 = (short) field5251[field5238 + 2];
                if (var46 >= 0 && var46 < 5) {
                    var34.method2699((byte) -109, var48, var47, var46);
                    class564.method3329(var34, 8195);
                    if (var34.field6246 == -1) {
                        class393.method2431(var46, false, var34.field6222);
                    }
                    return;
                }
                return;
            }
            if (arg0 == 1132) {
                field5238 -= 3;
                int var49 = field5251[field5238];
                short var50 = (short) field5251[field5238 + 1];
                short var51 = (short) field5251[field5238 + 2];
                if (var49 >= 0 && var49 < 5) {
                    var34.method2698(var51, var50, var49, -13278);
                    class564.method3329(var34, 8195);
                    if (var34.field6246 == -1) {
                        class480.method2858(19, var49, var34.field6222);
                    }
                    return;
                }
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class451 var53;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var53 = class166.method1238((byte) -127, field5251[--field5238]);
            } else {
                var53 = arg1 ? field5235 : field5234;
            }
            class564.method3329(var53, 8195);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field5238 -= 2;
                int var54 = field5251[field5238];
                int var55 = field5251[field5238 + 1];
                if (var53.field6246 == -1) {
                    class597.method3484(var53.field6222, 9);
                    class495.method3008(8, var53.field6222);
                    class673.method3826((byte) 105, var53.field6222);
                }
                if (var54 == -1) {
                    var53.field6248 = 1;
                    var53.field6239 = -1;
                    var53.field6183 = -1;
                    return;
                }
                var53.field6183 = var54;
                var53.field6268 = var55;
                if (arg0 == 1208 || arg0 == 1209) {
                    var53.field6204 = true;
                } else {
                    var53.field6204 = false;
                }
                class689 var56 = class313.field4456.method1681(var54, 86);
                var53.field6172 = var56.field9645;
                var53.field6258 = var56.field9629;
                var53.field6208 = var56.field9608;
                var53.field6273 = var56.field9617;
                var53.field6199 = var56.field9589;
                var53.field6299 = var56.field9613;
                if (arg0 == 1205 || arg0 == 1209) {
                    var53.field6318 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var53.field6318 = 1;
                } else {
                    var53.field6318 = 2;
                }
                if (var53.field6243 > 0) {
                    var53.field6299 = var53.field6299 * 32 / var53.field6243;
                    return;
                }
                if (var53.field6202 > 0) {
                    var53.field6299 = var53.field6299 * 32 / var53.field6202;
                }
                return;
            }
            if (arg0 == 1201) {
                var53.field6248 = 2;
                var53.field6239 = field5251[--field5238];
                if (var53.field6246 == -1) {
                    class100.method713(var53.field6222, 118);
                }
                return;
            }
            if (arg0 == 1202) {
                var53.field6248 = 3;
                var53.field6239 = -1;
                if (var53.field6246 == -1) {
                    class100.method713(var53.field6222, 123);
                }
                return;
            }
            if (arg0 == 1203) {
                var53.field6248 = 6;
                var53.field6239 = field5251[--field5238];
                if (var53.field6246 == -1) {
                    class100.method713(var53.field6222, 118);
                }
                return;
            }
            if (arg0 == 1204) {
                var53.field6248 = 5;
                var53.field6239 = field5251[--field5238];
                if (var53.field6246 == -1) {
                    class100.method713(var53.field6222, 125);
                }
                return;
            }
            if (arg0 == 1206) {
                field5238 -= 4;
                var53.field6316 = field5251[field5238];
                var53.field6335 = field5251[field5238 + 1];
                var53.field6265 = field5251[field5238 + 2];
                var53.field6345 = field5251[field5238 + 3];
                class564.method3329(var53, 8195);
                return;
            }
            if (arg0 == 1207) {
                field5238 -= 2;
                var53.field6170 = field5251[field5238];
                var53.field6178 = field5251[field5238 + 1];
                class564.method3329(var53, 8195);
                return;
            }
            if (arg0 == 1210) {
                field5238 -= 4;
                var53.field6239 = field5251[field5238];
                var53.field6188 = field5251[field5238 + 1];
                if (field5251[field5238 + 2] == 1) {
                    var53.field6248 = 9;
                } else {
                    var53.field6248 = 8;
                }
                if (field5251[field5238 + 3] == 1) {
                    var53.field6204 = true;
                } else {
                    var53.field6204 = false;
                }
                if (var53.field6246 == -1) {
                    class100.method713(var53.field6222, 109);
                }
                return;
            }
            if (arg0 == 1211) {
                var53.field6248 = 5;
                var53.field6239 = class250.field3689;
                var53.field6188 = 0;
                if (var53.field6246 == -1) {
                    class100.method713(var53.field6222, 93);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class451 var57;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var57 = class166.method1238((byte) -45, field5251[--field5238]);
            } else {
                var57 = arg1 ? field5235 : field5234;
            }
            if (arg0 == 1300) {
                int var58 = field5251[--field5238] - 1;
                if (var58 >= 0 && var58 <= 9) {
                    var57.method2688(field5244[--field5233], var58, (byte) 121);
                    return;
                }
                field5233--;
                return;
            }
            if (arg0 == 1301) {
                field5238 -= 2;
                int var59 = field5251[field5238];
                int var60 = field5251[field5238 + 1];
                if (var59 == -1 && var60 == -1) {
                    var57.field6332 = null;
                    return;
                }
                var57.field6332 = class63.method422(var60, 17492, var59);
                return;
            }
            if (arg0 == 1302) {
                int var61 = field5251[--field5238];
                if (class479.field6741 != var61 && class311.field4434 != var61 && class254.field3745 != var61) {
                    return;
                }
                var57.field6272 = var61;
                return;
            }
            if (arg0 == 1303) {
                var57.field6219 = field5251[--field5238];
                return;
            }
            if (arg0 == 1304) {
                var57.field6224 = field5251[--field5238];
                return;
            }
            if (arg0 == 1305) {
                var57.field6211 = field5244[--field5233];
                return;
            }
            if (arg0 == 1306) {
                var57.field6279 = field5244[--field5233];
                return;
            }
            if (arg0 == 1307) {
                var57.field6180 = null;
                return;
            }
            if (arg0 == 1308) {
                var57.field6281 = field5251[--field5238];
                var57.field6207 = field5251[--field5238];
                return;
            }
            if (arg0 == 1309) {
                int var62 = field5251[--field5238];
                int var63 = field5251[--field5238];
                if (var63 >= 1 && var63 <= 10) {
                    var57.method2697(var63 - 1, var62, 65535);
                }
                return;
            }
            if (arg0 == 1310) {
                var57.field6247 = field5244[--field5233];
                return;
            }
            if (arg0 == 1311) {
                var57.field6308 = field5251[--field5238];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var64;
                int var65;
                int var66;
                if (arg0 == 1312) {
                    field5238 -= 3;
                    var64 = field5251[field5238] - 1;
                    var65 = field5251[field5238 + 1];
                    var66 = field5251[field5238 + 2];
                    if (var64 < 0 || var64 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field5238 -= 2;
                    var64 = 10;
                    var65 = field5251[field5238];
                    var66 = field5251[field5238 + 1];
                }
                if (var57.field6315 == null) {
                    if (var65 == 0) {
                        return;
                    }
                    var57.field6315 = new byte[11];
                    var57.field6302 = new byte[11];
                    var57.field6203 = new int[11];
                }
                var57.field6315[var64] = (byte) var65;
                if (var65 == 0) {
                    var57.field6256 = false;
                    for (int var67 = 0; var67 < var57.field6315.length; var67++) {
                        if (var57.field6315[var67] != 0) {
                            var57.field6256 = true;
                            break;
                        }
                    }
                } else {
                    var57.field6256 = true;
                }
                var57.field6302[var64] = (byte) var66;
                return;
            }
            if (arg0 == 1314) {
                var57.field6192 = field5251[--field5238];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class451 var68;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var68 = class166.method1238((byte) -50, field5251[--field5238]);
            } else {
                var68 = arg1 ? field5235 : field5234;
            }
            if (arg0 == 1499) {
                var68.method2686(0);
                return;
            }
            String var69 = field5244[--field5233];
            int[] var70 = null;
            if (var69.length() > 0 && var69.charAt(var69.length() - 1) == 'Y') {
                int var71 = field5251[--field5238];
                if (var71 > 0) {
                    var70 = new int[var71];
                    while (var71-- > 0) {
                        var70[var71] = field5251[--field5238];
                    }
                }
                var69 = var69.substring(0, var69.length() - 1);
            }
            Object[] var72 = new Object[var69.length() + 1];
            for (int var73 = var72.length - 1; var73 >= 1; var73--) {
                if (var69.charAt(var73 - 1) == 's') {
                    var72[var73] = field5244[--field5233];
                } else if (var69.charAt(var73 - 1) == '§') {
                    var72[var73] = Long.valueOf(field5243[--field5240]);
                } else {
                    var72[var73] = Integer.valueOf(field5251[--field5238]);
                }
            }
            int var74 = field5251[--field5238];
            if (var74 == -1) {
                var72 = null;
            } else {
                var72[0] = Integer.valueOf(var74);
            }
            if (arg0 == 1400) {
                var68.field6276 = var72;
            } else if (arg0 == 1401) {
                var68.field6190 = var72;
            } else if (arg0 == 1402) {
                var68.field6341 = var72;
            } else if (arg0 == 1403) {
                var68.field6250 = var72;
            } else if (arg0 == 1404) {
                var68.field6232 = var72;
            } else if (arg0 == 1405) {
                var68.field6277 = var72;
            } else if (arg0 == 1406) {
                var68.field6229 = var72;
            } else if (arg0 == 1407) {
                var68.field6220 = var72;
                var68.field6216 = var70;
            } else if (arg0 == 1408) {
                var68.field6227 = var72;
            } else if (arg0 == 1409) {
                var68.field6300 = var72;
            } else if (arg0 == 1410) {
                var68.field6263 = var72;
            } else if (arg0 == 1411) {
                var68.field6329 = var72;
            } else if (arg0 == 1412) {
                var68.field6175 = var72;
            } else if (arg0 == 1414) {
                var68.field6226 = var72;
                var68.field6338 = var70;
            } else if (arg0 == 1415) {
                var68.field6217 = var72;
                var68.field6261 = var70;
            } else if (arg0 == 1416) {
                var68.field6321 = var72;
            } else if (arg0 == 1417) {
                var68.field6214 = var72;
            } else if (arg0 == 1418) {
                var68.field6230 = var72;
            } else if (arg0 == 1419) {
                var68.field6278 = var72;
            } else if (arg0 == 1420) {
                var68.field6166 = var72;
            } else if (arg0 == 1421) {
                var68.field6195 = var72;
            } else if (arg0 == 1422) {
                var68.field6168 = var72;
            } else if (arg0 == 1423) {
                var68.field6200 = var72;
            } else if (arg0 == 1424) {
                var68.field6337 = var72;
            } else if (arg0 == 1425) {
                var68.field6330 = var72;
            } else if (arg0 == 1426) {
                var68.field6275 = var72;
            } else if (arg0 == 1427) {
                var68.field6184 = var72;
            } else if (arg0 == 1428) {
                var68.field6314 = var72;
                var68.field6342 = var70;
            } else if (arg0 == 1429) {
                var68.field6186 = var72;
                var68.field6253 = var70;
            } else if (arg0 == 1430) {
                var68.field6280 = var72;
            } else if (arg0 == 1431) {
                var68.field6296 = var72;
            } else if (arg0 == 1432) {
                var68.field6245 = var72;
            }
            var68.field6313 = true;
            return;
        } else if (arg0 < 1600) {
            class451 var75 = arg1 ? field5235 : field5234;
            if (arg0 == 1500) {
                field5251[field5238++] = var75.field6333;
                return;
            }
            if (arg0 == 1501) {
                field5251[field5238++] = var75.field6242;
                return;
            }
            if (arg0 == 1502) {
                field5251[field5238++] = var75.field6290;
                return;
            }
            if (arg0 == 1503) {
                field5251[field5238++] = var75.field6288;
                return;
            }
            if (arg0 == 1504) {
                field5251[field5238++] = var75.field6255 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field5251[field5238++] = var75.field6233;
                return;
            }
            if (arg0 == 1506) {
                class451 var76 = class596.method3481(var75, 1887758448);
                field5251[field5238++] = var76 == null ? -1 : var76.field6222;
                return;
            }
        } else if (arg0 < 1700) {
            class451 var77 = arg1 ? field5235 : field5234;
            if (arg0 == 1600) {
                field5251[field5238++] = var77.field6292;
                return;
            }
            if (arg0 == 1601) {
                field5251[field5238++] = var77.field6173;
                return;
            }
            if (arg0 == 1602) {
                field5244[field5233++] = var77.field6241;
                return;
            }
            if (arg0 == 1603) {
                field5251[field5238++] = var77.field6301;
                return;
            }
            if (arg0 == 1604) {
                field5251[field5238++] = var77.field6169;
                return;
            }
            if (arg0 == 1605) {
                field5251[field5238++] = var77.field6299;
                return;
            }
            if (arg0 == 1606) {
                field5251[field5238++] = var77.field6172;
                return;
            }
            if (arg0 == 1607) {
                field5251[field5238++] = var77.field6208;
                return;
            }
            if (arg0 == 1608) {
                field5251[field5238++] = var77.field6258;
                return;
            }
            if (arg0 == 1609) {
                field5251[field5238++] = var77.field6307;
                return;
            }
            if (arg0 == 1610) {
                field5251[field5238++] = var77.field6273;
                return;
            }
            if (arg0 == 1611) {
                field5251[field5238++] = var77.field6199;
                return;
            }
            if (arg0 == 1612) {
                field5251[field5238++] = var77.field6264;
                return;
            }
            if (arg0 == 1613) {
                int var78 = field5251[--field5238];
                class645 var79 = class184.field2832.method4117((byte) 49, var78);
                if (var79.method3701((byte) 61)) {
                    field5244[field5233++] = var77.method2689(var79.field9012, var78, 123);
                    return;
                }
                field5251[field5238++] = var77.method2690(-127, var78, var79.field9011);
                return;
            }
            if (arg0 == 1614) {
                field5251[field5238++] = var77.field6218;
                return;
            }
            if (arg0 == 2614) {
                field5251[field5238++] = var77.field6248 == 1 ? var77.field6239 : -1;
                return;
            }
        } else if (arg0 < 1800) {
            class451 var80 = arg1 ? field5235 : field5234;
            if (arg0 == 1700) {
                field5251[field5238++] = var80.field6183;
                return;
            }
            if (arg0 == 1701) {
                if (var80.field6183 != -1) {
                    field5251[field5238++] = var80.field6268;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field5251[field5238++] = var80.field6246;
                return;
            }
        } else if (arg0 < 1900) {
            class451 var81 = arg1 ? field5235 : field5234;
            if (arg0 == 1800) {
                field5251[field5238++] = client.method2046(var81).method267((byte) 120);
                return;
            }
            if (arg0 == 1801) {
                int var82 = field5251[--field5238];
                int var383 = var82 - 1;
                if (var81.field6180 != null && var383 < var81.field6180.length && var81.field6180[var383] != null) {
                    field5244[field5233++] = var81.field6180[var383];
                    return;
                }
                field5244[field5233++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var81.field6211 == null) {
                    field5244[field5233++] = "";
                    return;
                }
                field5244[field5233++] = var81.field6211;
                return;
            }
        } else if (arg0 < 2000 || !(arg0 < 2900 || arg0 >= 3000)) {
            class451 var381;
            if (arg0 >= 2000) {
                var381 = class166.method1238((byte) -24, field5251[--field5238]);
                arg0 -= 1000;
            } else {
                var381 = arg1 ? field5235 : field5234;
            }
            if (field5255 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var381.field6184 == null) {
                    return;
                }
                class166 var382 = new class166();
                var382.field2627 = var381;
                var382.field2619 = var381.field6184;
                var382.field2621 = field5255 + 1;
                class208.field3220.method1727(var382, (byte) 66);
                return;
            }
        } else if (arg0 < 2600) {
            class451 var83 = class166.method1238((byte) -105, field5251[--field5238]);
            if (arg0 == 2500) {
                field5251[field5238++] = var83.field6333;
                return;
            }
            if (arg0 == 2501) {
                field5251[field5238++] = var83.field6242;
                return;
            }
            if (arg0 == 2502) {
                field5251[field5238++] = var83.field6290;
                return;
            }
            if (arg0 == 2503) {
                field5251[field5238++] = var83.field6288;
                return;
            }
            if (arg0 == 2504) {
                field5251[field5238++] = var83.field6255 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field5251[field5238++] = var83.field6233;
                return;
            }
            if (arg0 == 1506) {
                class451 var84 = class596.method3481(var83, 1887758448);
                field5251[field5238++] = var84 == null ? -1 : var84.field6222;
                return;
            }
        } else if (arg0 < 2700) {
            class451 var85 = class166.method1238((byte) -34, field5251[--field5238]);
            if (arg0 == 2600) {
                field5251[field5238++] = var85.field6292;
                return;
            }
            if (arg0 == 2601) {
                field5251[field5238++] = var85.field6173;
                return;
            }
            if (arg0 == 2602) {
                field5244[field5233++] = var85.field6241;
                return;
            }
            if (arg0 == 2603) {
                field5251[field5238++] = var85.field6301;
                return;
            }
            if (arg0 == 2604) {
                field5251[field5238++] = var85.field6169;
                return;
            }
            if (arg0 == 2605) {
                field5251[field5238++] = var85.field6299;
                return;
            }
            if (arg0 == 2606) {
                field5251[field5238++] = var85.field6172;
                return;
            }
            if (arg0 == 2607) {
                field5251[field5238++] = var85.field6208;
                return;
            }
            if (arg0 == 2608) {
                field5251[field5238++] = var85.field6258;
                return;
            }
            if (arg0 == 2609) {
                field5251[field5238++] = var85.field6307;
                return;
            }
            if (arg0 == 2610) {
                field5251[field5238++] = var85.field6273;
                return;
            }
            if (arg0 == 2611) {
                field5251[field5238++] = var85.field6199;
                return;
            }
            if (arg0 == 2612) {
                field5251[field5238++] = var85.field6264;
                return;
            }
            if (arg0 == 2613) {
                field5251[field5238++] = var85.field6218;
                return;
            }
            if (arg0 == 2614) {
                field5251[field5238++] = var85.field6248 == 1 ? var85.field6239 : -1;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class451 var86 = class166.method1238((byte) -82, field5251[--field5238]);
                field5251[field5238++] = var86.field6183;
                return;
            }
            if (arg0 == 2701) {
                class451 var87 = class166.method1238((byte) -24, field5251[--field5238]);
                if (var87.field6183 != -1) {
                    field5251[field5238++] = var87.field6268;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var88 = field5251[--field5238];
                class744 var89 = (class744) class11.field217.method2242((long) var88, -1);
                if (var89 != null) {
                    field5251[field5238++] = 1;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class451 var90 = class166.method1238((byte) -69, field5251[--field5238]);
                if (var90.field6270 == null) {
                    field5251[field5238++] = 0;
                    return;
                }
                int var91 = var90.field6270.length;
                for (int var92 = 0; var92 < var90.field6270.length; var92++) {
                    if (var90.field6270[var92] == null) {
                        var91 = var92;
                        break;
                    }
                }
                field5251[field5238++] = var91;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field5238 -= 2;
                int var93 = field5251[field5238];
                int var94 = field5251[field5238 + 1];
                class744 var95 = (class744) class11.field217.method2242((long) var93, -1);
                if (var95 != null && var95.field10314 == var94) {
                    field5251[field5238++] = 1;
                    return;
                } else {
                    field5251[field5238++] = 0;
                    return;
                }
            }
        } else if (arg0 < 2900) {
            class451 var96 = class166.method1238((byte) -100, field5251[--field5238]);
            if (arg0 == 2800) {
                field5251[field5238++] = client.method2046(var96).method267((byte) 122);
                return;
            }
            if (arg0 == 2801) {
                int var97 = field5251[--field5238];
                int var384 = var97 - 1;
                if (var96.field6180 != null && var384 < var96.field6180.length && var96.field6180[var384] != null) {
                    field5244[field5233++] = var96.field6180[var384];
                    return;
                }
                field5244[field5233++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var96.field6211 == null) {
                    field5244[field5233++] = "";
                    return;
                }
                field5244[field5233++] = var96.field6211;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var98 = field5244[--field5233];
                class629.method3606(14717, var98);
                return;
            }
            if (arg0 == 3101) {
                field5238 -= 2;
                class63.method419(field5251[field5238 + 1], (byte) 4, class210.field3250, field5251[field5238]);
                return;
            }
            if (arg0 == 3103) {
                class776.method4272(true, (byte) -98);
                return;
            }
            if (arg0 == 3104) {
                String var99 = field5244[--field5233];
                int var100 = 0;
                if (class670.method3805(var99, (byte) 127)) {
                    var100 = class163.method1224(false, var99);
                }
                field5237++;
                class312 var101 = class353.method2245(class87.field971, class519.field7324, (byte) 19);
                var101.field4445.method2959(var100, (byte) -100);
                class208.method1440(var101, 46);
                return;
            }
            if (arg0 == 3105) {
                String var102 = field5244[--field5233];
                field5242++;
                class312 var103 = class353.method2245(class87.field971, class98.field1114, (byte) 117);
                var103.field4445.method2952(0, var102.length() + 1);
                var103.field4445.method2953(var102, -28136);
                class208.method1440(var103, 97);
                return;
            }
            if (arg0 == 3106) {
                String var104 = field5244[--field5233];
                field5232++;
                class312 var105 = class353.method2245(class87.field971, class289.field4237, (byte) 109);
                var105.field4445.method2952(0, var104.length() + 1);
                var105.field4445.method2953(var104, -28136);
                class208.method1440(var105, 75);
                return;
            }
            if (arg0 == 3107) {
                int var106 = field5251[--field5238];
                String var107 = field5244[--field5233];
                class87.method656(var106, true, var107);
                return;
            }
            if (arg0 == 3108) {
                field5238 -= 3;
                int var108 = field5251[field5238];
                int var109 = field5251[field5238 + 1];
                int var110 = field5251[field5238 + 2];
                class451 var111 = class166.method1238((byte) -88, var110);
                class82.method624(var109, false, var111, var108);
                return;
            }
            if (arg0 == 3109) {
                field5238 -= 2;
                int var112 = field5251[field5238];
                int var113 = field5251[field5238 + 1];
                class451 var114 = arg1 ? field5235 : field5234;
                class82.method624(var113, false, var114, var112);
                return;
            }
            if (arg0 == 3110) {
                int var115 = field5251[--field5238];
                field5249++;
                class312 var116 = class353.method2245(class87.field971, class92.field1037, (byte) 20);
                var116.field4445.method2957(var115, 1267307848);
                class208.method1440(var116, 74);
                return;
            }
            if (arg0 == 3111) {
                field5238 -= 2;
                int var117 = field5251[field5238];
                int var118 = field5251[field5238 + 1];
                class744 var119 = (class744) class11.field217.method2242((long) var117, -1);
                if (var119 != null) {
                    class698.method3932((byte) 86, var119, var119.field10314 != var118, true);
                }
                class436.method2604((byte) -25, true, var117, var118, 3);
                return;
            }
            if (arg0 == 3112) {
                field5238--;
                int var120 = field5251[field5238];
                class744 var121 = (class744) class11.field217.method2242((long) var120, -1);
                if (var121 != null && var121.field10312 == 3) {
                    class698.method3932((byte) 113, var121, true, true);
                }
                return;
            }
            if (arg0 == 3113) {
                class500.method3032((byte) -119, field5244[--field5233]);
                return;
            }
            if (arg0 == 3114) {
                field5238 -= 2;
                int var122 = field5251[field5238];
                int var123 = field5251[field5238 + 1];
                String var124 = field5244[--field5233];
                class788.method4313("", (byte) 51, "", var124, var122, var123, "");
                return;
            }
            if (arg0 == 3115) {
                field5238 -= 11;
                class97[] var125 = class391.method2424((byte) -122);
                class463[] var126 = class670.method3807((byte) 80);
                class669.method3802(field5251[field5238 + 2], var126[field5251[field5238 + 1]], field5251[field5238 + 4], field5251[field5238 + 6], field5251[field5238 + 8], field5251[field5238 + 9], field5251[field5238 + 5], field5251[field5238 + 3], field5251[field5238 + 7], var125[field5251[field5238]], field5251[field5238 + 10], -14250);
                return;
            }
            if (arg0 == 3116) {
                int var127 = field5251[--field5238];
                field5237++;
                class312 var128 = class353.method2245(class87.field971, class621.field8737, (byte) 38);
                var128.field4445.method2957(var127, 1267307848);
                class208.method1440(var128, 49);
                return;
            }
            if (arg0 == 3117) {
                String var129 = field5244[--field5233];
                class312 var130 = class353.method2245(class87.field971, class56.field712, (byte) 24);
                var130.field4445.method2952(0, var129.length() + 1);
                var130.field4445.method2953(var129, -28136);
                class208.method1440(var130, 76);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field5238 -= 3;
                class442.method2635(255, -81, field5251[field5238 + 2], field5251[field5238 + 1], field5251[field5238], 256);
                return;
            }
            if (arg0 == 3201) {
                class772.method4257(-107, field5251[--field5238], 50, 255);
                return;
            }
            if (arg0 == 3202) {
                field5238 -= 2;
                class88.method662((byte) 84, field5251[field5238], field5251[field5238 + 1], 255);
                return;
            }
            if (arg0 == 3203) {
                field5238 -= 4;
                class442.method2635(field5251[field5238 + 3], -110, field5251[field5238 + 2], field5251[field5238 + 1], field5251[field5238], 256);
                return;
            }
            if (arg0 == 3204) {
                field5238 -= 3;
                class772.method4257(-96, field5251[field5238], field5251[field5238 + 2], field5251[field5238 + 1]);
                return;
            }
            if (arg0 == 3205) {
                field5238 -= 3;
                class88.method662((byte) 84, field5251[field5238], field5251[field5238 + 1], field5251[field5238 + 2]);
                return;
            }
            if (arg0 == 3206) {
                field5238 -= 4;
                class355.method2259(256, true, field5251[field5238 + 3], field5251[field5238 + 2], false, field5251[field5238], field5251[field5238 + 1]);
                return;
            }
            if (arg0 == 3207) {
                field5238 -= 4;
                class355.method2259(256, true, field5251[field5238 + 3], field5251[field5238 + 2], true, field5251[field5238], field5251[field5238 + 1]);
                return;
            }
            if (arg0 == 3208) {
                field5238 -= 5;
                class442.method2635(field5251[field5238 + 3], -72, field5251[field5238 + 2], field5251[field5238 + 1], field5251[field5238], field5251[field5238 + 4]);
                return;
            }
            if (arg0 == 3209) {
                field5238 -= 5;
                class355.method2259(field5251[field5238 + 4], true, field5251[field5238 + 3], field5251[field5238 + 2], false, field5251[field5238], field5251[field5238 + 1]);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field5251[field5238++] = class192.field2961;
                return;
            }
            if (arg0 == 3301) {
                field5238 -= 2;
                int var131 = field5251[field5238];
                int var132 = field5251[field5238 + 1];
                field5251[field5238++] = class781.method4291(false, var131, 12, var132);
                return;
            }
            if (arg0 == 3302) {
                field5238 -= 2;
                int var133 = field5251[field5238];
                int var134 = field5251[field5238 + 1];
                field5251[field5238++] = class342.method2166(0, false, var133, var134);
                return;
            }
            if (arg0 == 3303) {
                field5238 -= 2;
                int var135 = field5251[field5238];
                int var136 = field5251[field5238 + 1];
                field5251[field5238++] = class571.method3361(var135, var136, 25473, false);
                return;
            }
            if (arg0 == 3304) {
                int var137 = field5251[--field5238];
                field5251[field5238++] = class648.field9065.method1975((byte) 6, var137).field4516;
                return;
            }
            if (arg0 == 3305) {
                int var138 = field5251[--field5238];
                field5251[field5238++] = class732.field10133[var138];
                return;
            }
            if (arg0 == 3306) {
                int var139 = field5251[--field5238];
                field5251[field5238++] = class529.field7628[var139];
                return;
            }
            if (arg0 == 3307) {
                int var140 = field5251[--field5238];
                field5251[field5238++] = class6.field51[var140];
                return;
            }
            if (arg0 == 3308) {
                byte var141 = class210.field3250.field5755;
                int var142 = (class210.field3250.field5742 >> 9) + class124.field1922;
                int var143 = (class210.field3250.field5746 >> 9) + class88.field999;
                field5251[field5238++] = (var141 << 28) + (var142 << 14) + var143;
                return;
            }
            if (arg0 == 3309) {
                int var144 = field5251[--field5238];
                field5251[field5238++] = var144 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var145 = field5251[--field5238];
                field5251[field5238++] = var145 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var146 = field5251[--field5238];
                field5251[field5238++] = var146 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field5251[field5238++] = class792.field10895 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field5238 -= 2;
                int var147 = field5251[field5238];
                int var148 = field5251[field5238 + 1];
                field5251[field5238++] = class781.method4291(true, var147, 12, var148);
                return;
            }
            if (arg0 == 3314) {
                field5238 -= 2;
                int var149 = field5251[field5238];
                int var150 = field5251[field5238 + 1];
                field5251[field5238++] = class342.method2166(0, true, var149, var150);
                return;
            }
            if (arg0 == 3315) {
                field5238 -= 2;
                int var151 = field5251[field5238];
                int var152 = field5251[field5238 + 1];
                field5251[field5238++] = class571.method3361(var151, var152, 25473, true);
                return;
            }
            if (arg0 == 3316) {
                if (class745.field10317 >= 2) {
                    field5251[field5238++] = class745.field10317;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field5251[field5238++] = class625.field8754;
                return;
            }
            if (arg0 == 3318) {
                field5251[field5238++] = class5.field34.field763;
                return;
            }
            if (arg0 == 3321) {
                field5251[field5238++] = class618.field8643;
                return;
            }
            if (arg0 == 3322) {
                field5251[field5238++] = class561.field7979;
                return;
            }
            if (arg0 == 3323) {
                if (class475.field6652 >= 5 && class475.field6652 <= 9) {
                    field5251[field5238++] = 1;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class475.field6652 >= 5 && class475.field6652 <= 9) {
                    field5251[field5238++] = class475.field6652;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field5251[field5238++] = class678.field9432 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field5251[field5238++] = class210.field3250.field9786;
                return;
            }
            if (arg0 == 3327) {
                field5251[field5238++] = class210.field3250.field9765 != null && class210.field3250.field9765.field2941 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field5251[field5238++] = class338.field4740 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var153 = field5251[--field5238];
                field5251[field5238++] = class632.method3621(false, var153, 0);
                return;
            }
            if (arg0 == 3331) {
                field5238 -= 2;
                int var154 = field5251[field5238];
                int var155 = field5251[field5238 + 1];
                field5251[field5238++] = class233.method1565(false, false, false, var155, var154);
                return;
            }
            if (arg0 == 3332) {
                field5238 -= 2;
                int var156 = field5251[field5238];
                int var157 = field5251[field5238 + 1];
                field5251[field5238++] = class233.method1565(false, true, false, var157, var156);
                return;
            }
            if (arg0 == 3333) {
                field5251[field5238++] = class320.method2064(-16623);
                return;
            }
            if (arg0 == 3335) {
                field5251[field5238++] = class140.field2081;
                return;
            }
            if (arg0 == 3336) {
                field5238 -= 4;
                int var158 = field5251[field5238];
                int var159 = field5251[field5238 + 1];
                int var160 = field5251[field5238 + 2];
                int var161 = field5251[field5238 + 3];
                int var162 = (var159 << 14) + var158;
                int var163 = (var160 << 28) + var162;
                int var164 = var161 + var163;
                field5251[field5238++] = var164;
                return;
            }
            if (arg0 == 3337) {
                field5251[field5238++] = class467.field6560;
                return;
            }
            if (arg0 == 3338) {
                field5251[field5238++] = class592.method3444((byte) -99);
                return;
            }
            if (arg0 == 3339) {
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 3340) {
                field5251[field5238++] = class319.field4529 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field5251[field5238++] = class192.field2962 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field5251[field5238++] = class152.field2154.method2646(9);
                return;
            }
            if (arg0 == 3343) {
                field5251[field5238++] = class152.field2154.method2650((byte) -74);
                return;
            }
            if (arg0 == 3344) {
                field5244[field5233++] = class404.method2487(-1);
                return;
            }
            if (arg0 == 3345) {
                field5244[field5233++] = class209.method1444((byte) 24);
                return;
            }
            if (arg0 == 3346) {
                field5251[field5238++] = class217.method1494(82);
                return;
            }
            if (arg0 == 3347) {
                field5251[field5238++] = class648.field9063;
                return;
            }
            if (arg0 == 3349) {
                field5251[field5238++] = class210.field3250.field4647.method4200((byte) -3) >> 3;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field5238 -= 2;
                int var165 = field5251[field5238];
                int var166 = field5251[field5238 + 1];
                class759 var167 = class88.field998.method741(var165, (byte) -126);
                field5244[field5233++] = var167.method4221(var166, 78);
                return;
            }
            if (arg0 == 3408) {
                field5238 -= 4;
                int var168 = field5251[field5238];
                int var169 = field5251[field5238 + 1];
                int var170 = field5251[field5238 + 2];
                int var171 = field5251[field5238 + 3];
                class759 var172 = class88.field998.method741(var170, (byte) -128);
                if (var172.field10473 == var168 && var172.field10467 == var169) {
                    if (var169 == 115) {
                        field5244[field5233++] = var172.method4221(var171, -48);
                        return;
                    }
                    field5251[field5238++] = var172.method4218(-2, var171);
                    return;
                }
                throw new RuntimeException("C3408-1 " + var170 + "-" + var171);
            }
            if (arg0 == 3409) {
                field5238 -= 3;
                int var173 = field5251[field5238];
                int var174 = field5251[field5238 + 1];
                int var175 = field5251[field5238 + 2];
                if (var174 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class759 var176 = class88.field998.method741(var174, (byte) -127);
                if (var176.field10467 != var173) {
                    throw new RuntimeException("C3409-1");
                }
                field5251[field5238++] = var176.method4215(-2, var175) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var177 = field5251[--field5238];
                String var178 = field5244[--field5233];
                if (var177 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class759 var179 = class88.field998.method741(var177, (byte) -127);
                if (var179.field10467 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field5251[field5238++] = var179.method4222(var178, 123) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var180 = field5251[--field5238];
                class759 var181 = class88.field998.method741(var180, (byte) -125);
                field5251[field5238++] = var181.field10465.method2244(false);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class500.field7110 == 0) {
                    field5251[field5238++] = -2;
                    return;
                }
                if (class500.field7110 == 1) {
                    field5251[field5238++] = -1;
                    return;
                }
                field5251[field5238++] = class22.field365;
                return;
            }
            if (arg0 == 3601) {
                int var182 = field5251[--field5238];
                if (class500.field7110 == 2 && var182 < class22.field365) {
                    field5244[field5233++] = class440.field5967[var182];
                    if (class36.field484[var182] != null) {
                        field5244[field5233++] = class36.field484[var182];
                        return;
                    }
                    field5244[field5233++] = "";
                    return;
                }
                field5244[field5233++] = "";
                field5244[field5233++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var183 = field5251[--field5238];
                if (class500.field7110 == 2 && var183 < class22.field365) {
                    field5251[field5238++] = class207.field3210[var183];
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var184 = field5251[--field5238];
                if (class500.field7110 == 2 && var184 < class22.field365) {
                    field5251[field5238++] = class453.field6356[var184];
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var185 = field5244[--field5233];
                int var186 = field5251[--field5238];
                class57.method394(var186, (byte) -96, var185);
                return;
            }
            if (arg0 == 3605) {
                String var187 = field5244[--field5233];
                class572.method3366(var187, 92);
                return;
            }
            if (arg0 == 3606) {
                String var188 = field5244[--field5233];
                class601.method3495(var188, (byte) -107);
                return;
            }
            if (arg0 == 3607) {
                String var189 = field5244[--field5233];
                class270.method1749(var189, false, (byte) 69);
                return;
            }
            if (arg0 == 3608) {
                String var190 = field5244[--field5233];
                class533.method3211(var190, false);
                return;
            }
            if (arg0 == 3609) {
                String var191 = field5244[--field5233];
                if (var191.startsWith("<img=0>") || var191.startsWith("<img=1>")) {
                    var191 = var191.substring(7);
                }
                field5251[field5238++] = class658.method3759(var191, true) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var192 = field5251[--field5238];
                if (class500.field7110 == 2 && var192 < class22.field365) {
                    field5244[field5233++] = class377.field5210[var192];
                    return;
                }
                field5244[field5233++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class459.field6423 != null) {
                    field5244[field5233++] = class274.method1777(class459.field6423, (byte) 67);
                    return;
                }
                field5244[field5233++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class459.field6423 != null) {
                    field5251[field5238++] = class187.field2886;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var193 = field5251[--field5238];
                if (class459.field6423 != null && var193 < class187.field2886) {
                    field5244[field5233++] = class762.field10501[var193].field4770;
                    return;
                }
                field5244[field5233++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var194 = field5251[--field5238];
                if (class459.field6423 != null && var194 < class187.field2886) {
                    field5251[field5238++] = class762.field10501[var194].field4773;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var195 = field5251[--field5238];
                if (class459.field6423 != null && var195 < class187.field2886) {
                    field5251[field5238++] = class762.field10501[var195].field4771;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field5251[field5238++] = class76.field863;
                return;
            }
            if (arg0 == 3617) {
                String var196 = field5244[--field5233];
                class629.method3605(var196, 4);
                return;
            }
            if (arg0 == 3618) {
                field5251[field5238++] = class721.field9980;
                return;
            }
            if (arg0 == 3619) {
                String var197 = field5244[--field5233];
                class400.method2462((byte) -61, var197);
                return;
            }
            if (arg0 == 3620) {
                class434.method2597(false);
                return;
            }
            if (arg0 == 3621) {
                if (class500.field7110 == 0) {
                    field5251[field5238++] = -1;
                    return;
                }
                field5251[field5238++] = class47.field600;
                return;
            }
            if (arg0 == 3622) {
                int var198 = field5251[--field5238];
                if (class500.field7110 != 0 && var198 < class47.field600) {
                    field5244[field5233++] = class646.field9032[var198];
                    if (class758.field10440[var198] != null) {
                        field5244[field5233++] = class758.field10440[var198];
                        return;
                    }
                    field5244[field5233++] = "";
                    return;
                }
                field5244[field5233++] = "";
                field5244[field5233++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var199 = field5244[--field5233];
                if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                    var199 = var199.substring(7);
                }
                field5251[field5238++] = class610.method3548(var199, (byte) -116) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var200 = field5251[--field5238];
                if (class762.field10501 != null && var200 < class187.field2886 && class762.field10501[var200].field4762.equalsIgnoreCase(class210.field3250.field9768)) {
                    field5251[field5238++] = 1;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class666.field9270 != null) {
                    field5244[field5233++] = class666.field9270;
                    return;
                }
                field5244[field5233++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var201 = field5251[--field5238];
                if (class459.field6423 != null && var201 < class187.field2886) {
                    field5244[field5233++] = class762.field10501[var201].field4767;
                    return;
                }
                field5244[field5233++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var202 = field5251[--field5238];
                if (class500.field7110 == 2 && var202 >= 0 && var202 < class22.field365) {
                    field5251[field5238++] = class712.field9884[var202] ? 1 : 0;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var203 = field5244[--field5233];
                if (var203.startsWith("<img=0>") || var203.startsWith("<img=1>")) {
                    var203 = var203.substring(7);
                }
                field5251[field5238++] = class282.method1842(var203, 10111);
                return;
            }
            if (arg0 == 3629) {
                field5251[field5238++] = class450.field6162;
                return;
            }
            if (arg0 == 3630) {
                String var204 = field5244[--field5233];
                class270.method1749(var204, true, (byte) 118);
                return;
            }
            if (arg0 == 3631) {
                int var205 = field5251[--field5238];
                field5251[field5238++] = class270.field3916[var205] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var206 = field5251[--field5238];
                if (class459.field6423 != null && var206 < class187.field2886) {
                    field5244[field5233++] = class762.field10501[var206].field4762;
                    return;
                }
                field5244[field5233++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var207 = field5251[--field5238];
                if (class500.field7110 != 0 && var207 < class47.field600) {
                    field5244[field5233++] = class31.field431[var207];
                    return;
                }
                field5244[field5233++] = "";
                return;
            }
        } else if (arg0 < 3800) {
            if (arg0 == 3700) {
                if (class393.field5405 != null) {
                    field5251[field5238++] = 1;
                    field5247 = class393.field5405;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 3701) {
                if (class195.field2999 != null) {
                    field5251[field5238++] = 1;
                    field5247 = class195.field2999;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 3702) {
                field5244[field5233++] = field5247.field4018;
                return;
            }
            if (arg0 == 3703) {
                field5251[field5238++] = field5247.field3999 ? 1 : 0;
                return;
            }
            if (arg0 == 3704) {
                field5251[field5238++] = field5247.field4009;
                return;
            }
            if (arg0 == 3705) {
                field5251[field5238++] = field5247.field3996;
                return;
            }
            if (arg0 == 3706) {
                field5251[field5238++] = field5247.field3995;
                return;
            }
            if (arg0 == 3707) {
                field5251[field5238++] = field5247.field3988;
                return;
            }
            if (arg0 == 3709) {
                field5251[field5238++] = field5247.field4029;
                return;
            }
            if (arg0 == 3710) {
                int var208 = field5251[--field5238];
                field5244[field5233++] = field5247.field4027[var208];
                return;
            }
            if (arg0 == 3711) {
                int var209 = field5251[--field5238];
                field5251[field5238++] = field5247.field4032[var209];
                return;
            }
            if (arg0 == 3712) {
                field5251[field5238++] = field5247.field4001;
                return;
            }
            if (arg0 == 3713) {
                int var210 = field5251[--field5238];
                field5244[field5233++] = field5247.field4024[var210];
                return;
            }
            if (arg0 == 3714) {
                field5238 -= 3;
                int var211 = field5251[field5238];
                int var212 = field5251[field5238 + 1];
                int var213 = field5251[field5238 + 2];
                field5251[field5238++] = field5247.method1783(var213, var211, (byte) -117, var212);
                return;
            }
            if (arg0 == 3715) {
                field5251[field5238++] = field5247.field3994;
                return;
            }
            if (arg0 == 3716) {
                field5251[field5238++] = field5247.field4033;
                return;
            }
            if (arg0 == 3717) {
                field5251[field5238++] = field5247.method1799(0, field5244[--field5233]);
                return;
            }
            if (arg0 == 3718) {
                field5251[field5238 - 1] = field5247.method1790(0)[field5251[field5238 - 1]];
                return;
            }
            if (arg0 == 3750) {
                if (class259.field3811 != null) {
                    field5251[field5238++] = 1;
                    field5236 = class259.field3811;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 3751) {
                if (class673.field9377 != null) {
                    field5251[field5238++] = 1;
                    field5236 = class673.field9377;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 3752) {
                field5244[field5233++] = field5236.field4802;
                return;
            }
            if (arg0 == 3753) {
                field5251[field5238++] = field5236.field4798;
                return;
            }
            if (arg0 == 3754) {
                field5251[field5238++] = field5236.field4806;
                return;
            }
            if (arg0 == 3755) {
                field5251[field5238++] = field5236.field4797;
                return;
            }
            if (arg0 == 3756) {
                int var214 = field5251[--field5238];
                field5244[field5233++] = field5236.field4799[var214].field4428;
                return;
            }
            if (arg0 == 3757) {
                int var215 = field5251[--field5238];
                field5251[field5238++] = field5236.field4799[var215].field4427;
                return;
            }
            if (arg0 == 3758) {
                int var216 = field5251[--field5238];
                field5251[field5238++] = field5236.field4799[var216].field4424;
                return;
            }
            if (arg0 == 3759) {
                int var217 = field5251[--field5238];
                class377.method2333(var217, class673.field9377 == field5236, 5);
                return;
            }
            if (arg0 == 3760) {
                field5251[field5238++] = field5236.method2181(field5244[--field5233], (byte) 87);
                return;
            }
            if (arg0 == 3761) {
                field5251[field5238 - 1] = field5236.method2184((byte) -118)[field5251[field5238 - 1]];
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var218 = field5251[--field5238];
                field5251[field5238++] = class718.field9944[var218].method1746(-69);
                return;
            }
            if (arg0 == 3904) {
                int var219 = field5251[--field5238];
                field5251[field5238++] = class718.field9944[var219].field3913;
                return;
            }
            if (arg0 == 3905) {
                int var220 = field5251[--field5238];
                field5251[field5238++] = class718.field9944[var220].field3906;
                return;
            }
            if (arg0 == 3906) {
                int var221 = field5251[--field5238];
                field5251[field5238++] = class718.field9944[var221].field3909;
                return;
            }
            if (arg0 == 3907) {
                int var222 = field5251[--field5238];
                field5251[field5238++] = class718.field9944[var222].field3904;
                return;
            }
            if (arg0 == 3908) {
                int var223 = field5251[--field5238];
                field5251[field5238++] = class718.field9944[var223].field3910;
                return;
            }
            if (arg0 == 3910) {
                int var224 = field5251[--field5238];
                int var225 = class718.field9944[var224].method1744((byte) -45);
                field5251[field5238++] = var225 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var226 = field5251[--field5238];
                int var227 = class718.field9944[var226].method1744((byte) -41);
                field5251[field5238++] = var227 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var228 = field5251[--field5238];
                int var229 = class718.field9944[var228].method1744((byte) -107);
                field5251[field5238++] = var229 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var230 = field5251[--field5238];
                int var231 = class718.field9944[var230].method1744((byte) -77);
                field5251[field5238++] = var231 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field5238 -= 2;
                int var232 = field5251[field5238];
                int var233 = field5251[field5238 + 1];
                field5251[field5238++] = var232 + var233;
                return;
            }
            if (arg0 == 4001) {
                field5238 -= 2;
                int var234 = field5251[field5238];
                int var235 = field5251[field5238 + 1];
                field5251[field5238++] = var234 - var235;
                return;
            }
            if (arg0 == 4002) {
                field5238 -= 2;
                int var236 = field5251[field5238];
                int var237 = field5251[field5238 + 1];
                field5251[field5238++] = var236 * var237;
                return;
            }
            if (arg0 == 4003) {
                field5238 -= 2;
                int var238 = field5251[field5238];
                int var239 = field5251[field5238 + 1];
                field5251[field5238++] = var238 / var239;
                return;
            }
            if (arg0 == 4004) {
                int var240 = field5251[--field5238];
                field5251[field5238++] = (int) (Math.random() * (double) var240);
                return;
            }
            if (arg0 == 4005) {
                int var241 = field5251[--field5238];
                field5251[field5238++] = (int) (Math.random() * (double) (var241 + 1));
                return;
            }
            if (arg0 == 4006) {
                field5238 -= 5;
                int var242 = field5251[field5238];
                int var243 = field5251[field5238 + 1];
                int var244 = field5251[field5238 + 2];
                int var245 = field5251[field5238 + 3];
                int var246 = field5251[field5238 + 4];
                field5251[field5238++] = (var243 - var242) * (var246 - var244) / (var245 - var244) + var242;
                return;
            }
            if (arg0 == 4007) {
                field5238 -= 2;
                long var247 = (long) field5251[field5238];
                long var249 = (long) field5251[field5238 + 1];
                field5251[field5238++] = (int) (var247 * var249 / 100L + var247);
                return;
            }
            if (arg0 == 4008) {
                field5238 -= 2;
                int var251 = field5251[field5238];
                int var252 = field5251[field5238 + 1];
                field5251[field5238++] = var251 | 0x1 << var252;
                return;
            }
            if (arg0 == 4009) {
                field5238 -= 2;
                int var253 = field5251[field5238];
                int var254 = field5251[field5238 + 1];
                field5251[field5238++] = var253 & -(0x1 << var254) - 1;
                return;
            }
            if (arg0 == 4010) {
                field5238 -= 2;
                int var255 = field5251[field5238];
                int var256 = field5251[field5238 + 1];
                field5251[field5238++] = (var255 & 0x1 << var256) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field5238 -= 2;
                int var257 = field5251[field5238];
                int var258 = field5251[field5238 + 1];
                field5251[field5238++] = var257 % var258;
                return;
            }
            if (arg0 == 4012) {
                field5238 -= 2;
                int var259 = field5251[field5238];
                int var260 = field5251[field5238 + 1];
                if (var259 == 0) {
                    field5251[field5238++] = 0;
                    return;
                }
                field5251[field5238++] = (int) Math.pow((double) var259, (double) var260);
                return;
            }
            if (arg0 == 4013) {
                field5238 -= 2;
                int var261 = field5251[field5238];
                int var262 = field5251[field5238 + 1];
                if (var261 == 0) {
                    field5251[field5238++] = 0;
                    return;
                }
                if (var262 == 0) {
                    field5251[field5238++] = Integer.MAX_VALUE;
                    return;
                }
                field5251[field5238++] = (int) Math.pow((double) var261, 1.0D / (double) var262);
                return;
            }
            if (arg0 == 4014) {
                field5238 -= 2;
                int var263 = field5251[field5238];
                int var264 = field5251[field5238 + 1];
                field5251[field5238++] = var263 & var264;
                return;
            }
            if (arg0 == 4015) {
                field5238 -= 2;
                int var265 = field5251[field5238];
                int var266 = field5251[field5238 + 1];
                field5251[field5238++] = var265 | var266;
                return;
            }
            if (arg0 == 4016) {
                field5238 -= 2;
                int var267 = field5251[field5238];
                int var268 = field5251[field5238 + 1];
                field5251[field5238++] = var267 < var268 ? var267 : var268;
                return;
            }
            if (arg0 == 4017) {
                field5238 -= 2;
                int var269 = field5251[field5238];
                int var270 = field5251[field5238 + 1];
                field5251[field5238++] = var269 > var270 ? var269 : var270;
                return;
            }
            if (arg0 == 4018) {
                field5238 -= 3;
                long var271 = (long) field5251[field5238];
                long var273 = (long) field5251[field5238 + 1];
                long var275 = (long) field5251[field5238 + 2];
                field5251[field5238++] = (int) (var271 * var275 / var273);
                return;
            }
            if (arg0 == 4019) {
                field5238 -= 2;
                int var277 = field5251[field5238];
                int var278 = field5251[field5238 + 1];
                if (var277 > 700 || var278 > 700) {
                    field5251[field5238++] = 256;
                }
                double var279 = (Math.random() * (double) (var277 + var278) + 800.0D - (double) var277) / 100.0D;
                field5251[field5238++] = (int) (Math.pow(2.0D, var279) + 0.5D);
                return;
            }
            if (arg0 == 4020) {
                int var281 = field5251[--field5238];
                field5251[field5238++] = class2.field14[class22.method226(-1, var281) & 0xFFFF];
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var282 = field5244[--field5233];
                int var283 = field5251[--field5238];
                field5244[field5233++] = var282 + var283;
                return;
            }
            if (arg0 == 4101) {
                field5233 -= 2;
                String var284 = field5244[field5233];
                String var285 = field5244[field5233 + 1];
                field5244[field5233++] = var284 + var285;
                return;
            }
            if (arg0 == 4102) {
                String var286 = field5244[--field5233];
                int var287 = field5251[--field5238];
                field5244[field5233++] = var286 + class788.method4315(var287, -110, true);
                return;
            }
            if (arg0 == 4103) {
                String var288 = field5244[--field5233];
                field5244[field5233++] = var288.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field5244[field5233++] = class30.method255(26105, class494.method2971(field5251[--field5238], 11745), class140.field2081);
                return;
            }
            if (arg0 == 4105) {
                field5233 -= 2;
                String var289 = field5244[field5233];
                String var290 = field5244[field5233 + 1];
                if (class210.field3250.field9765 != null && class210.field3250.field9765.field2941) {
                    field5244[field5233++] = var290;
                    return;
                }
                field5244[field5233++] = var289;
                return;
            }
            if (arg0 == 4106) {
                int var291 = field5251[--field5238];
                field5244[field5233++] = Integer.toString(var291);
                return;
            }
            if (arg0 == 4107) {
                field5233 -= 2;
                field5251[field5238++] = class210.method1446(class140.field2081, field5244[field5233], -47, field5244[field5233 + 1]);
                return;
            }
            if (arg0 == 4108) {
                String var292 = field5244[--field5233];
                field5238 -= 2;
                int var293 = field5251[field5238];
                int var294 = field5251[field5238 + 1];
                class6 var295 = class121.method924(class124.field1928, (byte) -120, 0, var294);
                field5251[field5238++] = var295.method43(var292, (byte) 96, class459.field6425, var293);
                return;
            }
            if (arg0 == 4109) {
                String var296 = field5244[--field5233];
                field5238 -= 2;
                int var297 = field5251[field5238];
                int var298 = field5251[field5238 + 1];
                class6 var299 = class121.method924(class124.field1928, (byte) -84, 0, var298);
                field5251[field5238++] = var299.method39(class459.field6425, var296, var297, (byte) -27);
                return;
            }
            if (arg0 == 4110) {
                field5233 -= 2;
                String var300 = field5244[field5233];
                String var301 = field5244[field5233 + 1];
                if (field5251[--field5238] == 1) {
                    field5244[field5233++] = var300;
                    return;
                }
                field5244[field5233++] = var301;
                return;
            }
            if (arg0 == 4111) {
                String var302 = field5244[--field5233];
                field5244[field5233++] = class317.method2057(117, var302);
                return;
            }
            if (arg0 == 4112) {
                String var303 = field5244[--field5233];
                int var304 = field5251[--field5238];
                if (var304 == -1) {
                    throw new RuntimeException("null char");
                }
                field5244[field5233++] = var303 + (char) var304;
                return;
            }
            if (arg0 == 4113) {
                int var305 = field5251[--field5238];
                field5251[field5238++] = method2355((char) var305);
                return;
            }
            if (arg0 == 4114) {
                int var306 = field5251[--field5238];
                field5251[field5238++] = class140.method1012((char) var306, 94) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var307 = field5251[--field5238];
                field5251[field5238++] = class548.method3275((char) var307, (byte) 100) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var308 = field5251[--field5238];
                field5251[field5238++] = class581.method3404((byte) -54, (char) var308) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var309 = field5244[--field5233];
                if (var309 != null) {
                    field5251[field5238++] = var309.length();
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var310 = field5244[--field5233];
                field5238 -= 2;
                int var311 = field5251[field5238];
                int var312 = field5251[field5238 + 1];
                field5244[field5233++] = var310.substring(var311, var312);
                return;
            }
            if (arg0 == 4119) {
                String var313 = field5244[--field5233];
                StringBuffer var314 = new StringBuffer(var313.length());
                boolean var315 = false;
                for (int var316 = 0; var316 < var313.length(); var316++) {
                    char var317 = var313.charAt(var316);
                    if (var317 == '<') {
                        var315 = true;
                    } else if (var317 == '>') {
                        var315 = false;
                    } else if (!var315) {
                        var314.append(var317);
                    }
                }
                field5244[field5233++] = var314.toString();
                return;
            }
            if (arg0 == 4120) {
                String var318 = field5244[--field5233];
                field5238 -= 2;
                int var319 = field5251[field5238];
                int var320 = field5251[field5238 + 1];
                field5251[field5238++] = var318.indexOf(var319, var320);
                return;
            }
            if (arg0 == 4121) {
                field5233 -= 2;
                String var321 = field5244[field5233];
                String var322 = field5244[field5233 + 1];
                int var323 = field5251[--field5238];
                field5251[field5238++] = var321.indexOf(var322, var323);
                return;
            }
            if (arg0 == 4122) {
                int var324 = field5251[--field5238];
                field5251[field5238++] = Character.toLowerCase((char) var324);
                return;
            }
            if (arg0 == 4123) {
                int var325 = field5251[--field5238];
                field5251[field5238++] = Character.toUpperCase((char) var325);
                return;
            }
            if (arg0 == 4124) {
                boolean var326 = field5251[--field5238] != 0;
                int var327 = field5251[--field5238];
                field5244[field5233++] = class784.method4293(class140.field2081, true, var326, 0, (long) var327);
                return;
            }
            if (arg0 == 4125) {
                String var328 = field5244[--field5233];
                int var329 = field5251[--field5238];
                class6 var330 = class121.method924(class124.field1928, (byte) -64, 0, var329);
                field5251[field5238++] = var330.method40(var328, class459.field6425, (byte) 20);
                return;
            }
            if (arg0 == 4126) {
                field5244[field5233++] = class239.method1597(class140.field2081, 5, (long) field5251[--field5238] * 60000L, true) + " UTC";
                return;
            }
            if (arg0 == 4127) {
                long var331 = field5243[--field5240];
                field5244[field5233++] = var331 == -1L ? "" : Long.toString(var331, 36).toUpperCase();
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var333 = field5251[--field5238];
                field5244[field5233++] = class313.field4456.method1681(var333, 125).field9565;
                return;
            }
            if (arg0 == 4201) {
                field5238 -= 2;
                int var334 = field5251[field5238];
                int var335 = field5251[field5238 + 1];
                class689 var336 = class313.field4456.method1681(var334, 125);
                if (var335 >= 1 && var335 <= 5 && var336.field9648[var335 - 1] != null) {
                    field5244[field5233++] = var336.field9648[var335 - 1];
                    return;
                }
                field5244[field5233++] = "";
                return;
            }
            if (arg0 == 4202) {
                field5238 -= 2;
                int var337 = field5251[field5238];
                int var338 = field5251[field5238 + 1];
                class689 var339 = class313.field4456.method1681(var337, 93);
                if (var338 >= 1 && var338 <= 5 && var339.field9587[var338 - 1] != null) {
                    field5244[field5233++] = var339.field9587[var338 - 1];
                    return;
                }
                field5244[field5233++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var340 = field5251[--field5238];
                field5251[field5238++] = class313.field4456.method1681(var340, 83).field9599;
                return;
            }
            if (arg0 == 4204) {
                int var341 = field5251[--field5238];
                field5251[field5238++] = class313.field4456.method1681(var341, 118).field9573 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var342 = field5251[--field5238];
                class689 var343 = class313.field4456.method1681(var342, 120);
                if (var343.field9594 == -1 && var343.field9638 >= 0) {
                    field5251[field5238++] = var343.field9638;
                    return;
                }
                field5251[field5238++] = var342;
                return;
            }
            if (arg0 == 4206) {
                int var344 = field5251[--field5238];
                class689 var345 = class313.field4456.method1681(var344, 127);
                if (var345.field9594 >= 0 && var345.field9638 >= 0) {
                    field5251[field5238++] = var345.field9638;
                    return;
                }
                field5251[field5238++] = var344;
                return;
            }
            if (arg0 == 4207) {
                int var346 = field5251[--field5238];
                field5251[field5238++] = class313.field4456.method1681(var346, 95).field9575 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field5238 -= 2;
                int var347 = field5251[field5238];
                int var348 = field5251[field5238 + 1];
                class645 var349 = class184.field2832.method4117((byte) 49, var348);
                if (var349.method3701((byte) 61)) {
                    field5244[field5233++] = class313.field4456.method1681(var347, 91).method3880(var348, var349.field9012, (byte) 49);
                    return;
                }
                field5251[field5238++] = class313.field4456.method1681(var347, 102).method3883(var348, (byte) -117, var349.field9011);
                return;
            }
            if (arg0 == 4209) {
                field5238 -= 2;
                int var350 = field5251[field5238];
                int var351 = field5251[field5238 + 1] - 1;
                class689 var352 = class313.field4456.method1681(var350, 100);
                if (var352.field9605 == var351) {
                    field5251[field5238++] = var352.field9625;
                    return;
                }
                if (var352.field9634 == var351) {
                    field5251[field5238++] = var352.field9635;
                    return;
                }
                field5251[field5238++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var353 = field5244[--field5233];
                int var354 = field5251[--field5238];
                class731.method4091(-86, var354 == 1, var353);
                field5251[field5238++] = class280.field4072;
                return;
            }
            if (arg0 == 4211) {
                if (class656.field9139 != null && class561.field7976 < class280.field4072) {
                    field5251[field5238++] = class656.field9139[class561.field7976++] & 0xFFFF;
                    return;
                }
                field5251[field5238++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class561.field7976 = 0;
                return;
            }
            if (arg0 == 4213) {
                int var355 = field5251[--field5238];
                field5251[field5238++] = class313.field4456.method1681(var355, 93).field9640;
                return;
            }
            if (arg0 == 4214) {
                String var356 = field5244[--field5233];
                field5238 -= 3;
                int var357 = field5251[field5238];
                int var358 = field5251[field5238 + 1];
                int var359 = field5251[field5238 + 2];
                class744.method4147(var359, var356, var357 == 1, var358, -31280);
                field5251[field5238++] = class280.field4072;
                return;
            }
            if (arg0 == 4215) {
                field5233 -= 2;
                field5238 -= 2;
                String var360 = field5244[field5233];
                int var361 = field5251[field5238];
                int var362 = field5251[field5238 + 1];
                String var363 = field5244[field5233 + 1];
                class429.method2579(var361 == 1, var363, (byte) 53, var360, var362);
                field5251[field5238++] = class280.field4072;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field5238 -= 2;
                int var364 = field5251[field5238];
                int var365 = field5251[field5238 + 1];
                class645 var366 = class184.field2832.method4117((byte) 49, var365);
                if (var366.method3701((byte) 61)) {
                    field5244[field5233++] = class575.field8103.method2439((byte) 73, var364).method843(var366.field9012, 4, var365);
                    return;
                }
                field5251[field5238++] = class575.field8103.method2439((byte) 73, var364).method845((byte) -59, var366.field9011, var365);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field5238 -= 2;
                int var367 = field5251[field5238];
                int var368 = field5251[field5238 + 1];
                class645 var369 = class184.field2832.method4117((byte) 49, var368);
                if (var369.method3701((byte) 61)) {
                    field5244[field5233++] = class277.field4038.method3919(true, var367).method1838(var368, var369.field9012, (byte) 97);
                    return;
                }
                field5251[field5238++] = class277.field4038.method3919(true, var367).method1835(var369.field9011, var368, (byte) 94);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field5238 -= 2;
                int var370 = field5251[field5238];
                int var371 = field5251[field5238 + 1];
                class645 var372 = class184.field2832.method4117((byte) 49, var371);
                if (var372.method3701((byte) 61)) {
                    field5244[field5233++] = class89.field1002.method2826(var370, (byte) -108).method3114((byte) -104, var372.field9012, var371);
                    return;
                }
                field5251[field5238++] = class89.field1002.method2826(var370, (byte) -120).method3117(var372.field9011, var371, true);
                return;
            }
        } else if (arg0 < 4700) {
            if (arg0 == 4600) {
                int var373 = field5251[--field5238];
                class539 var374 = class541.field7792.method1719(var373, 32);
                if (var374.field7749 != null && var374.field7749.length > 0) {
                    int var375 = 0;
                    int var376 = var374.field7774[0];
                    for (int var377 = 1; var377 < var374.field7749.length; var377++) {
                        if (var374.field7774[var377] > var376) {
                            var375 = var377;
                            var376 = var374.field7774[var377];
                        }
                    }
                    field5251[field5238++] = var374.field7749[var375];
                    return;
                }
                field5251[field5238++] = var374.field7773;
                return;
            }
        } else if (arg0 < 4800) {
            if (arg0 == 4700) {
                field5251[field5238++] = class621.field8736 ? 1 : 0;
                return;
            }
            if (arg0 == 4701) {
                String var378 = field5244[--field5233];
                if (class266.field3873 == 7 && !class140.method1013((byte) -86)) {
                    if (var378.length() > 20) {
                        class513.field7251 = -4;
                        return;
                    }
                    class513.field7251 = -1;
                    class312 var379 = class353.method2245(class87.field971, class780.field10703, (byte) 26);
                    var379.field4445.method2952(0, 0);
                    int var380 = var379.field4445.field7042;
                    var379.field4445.method2953(var378, -28136);
                    var379.field4445.method2951(false, var379.field4445.field7042 - var380);
                    class208.method1440(var379, 76);
                    return;
                }
                class513.field7251 = -5;
                return;
            }
            if (arg0 == 4702) {
                field5251[field5238++] = class513.field7251;
                if (class513.field7251 != -1) {
                    class513.field7251 = -6;
                }
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(IZ)V")
    private static final void method2347(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field5251[field5238++] = class13.field270;
                return;
            }
            if (arg0 == 5001) {
                field5238 -= 3;
                class13.field270 = field5251[field5238];
                class66.field818 = class547.method3271((byte) 79, field5251[field5238 + 1]);
                if (class66.field818 == null) {
                    class66.field818 = class581.field8213;
                }
                class766.field10544 = field5251[field5238 + 2];
                field5241++;
                class312 var2 = class353.method2245(class87.field971, class20.field335, (byte) 119);
                var2.field4445.method2952(0, class13.field270);
                var2.field4445.method2952(0, class66.field818.field5359);
                var2.field4445.method2952(0, class766.field10544);
                class208.method1440(var2, 98);
                return;
            }
            if (arg0 == 5002) {
                field5233 -= 2;
                String var3 = field5244[field5233];
                String var4 = field5244[field5233 + 1];
                field5238 -= 2;
                int var5 = field5251[field5238];
                int var6 = field5251[field5238 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field5226++;
                class312 var7 = class353.method2245(class87.field971, class189.field2921, (byte) 76);
                var7.field4445.method2952(0, class348.method2204((byte) -68, var3) + class348.method2204((byte) -105, var4) + 2);
                var7.field4445.method2953(var3, -28136);
                var7.field4445.method2952(0, var5 - 1);
                var7.field4445.method2952(0, var6);
                var7.field4445.method2953(var4, -28136);
                class208.method1440(var7, 92);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field5251[--field5238];
                class418 var9 = class785.method4304((byte) -83, var8);
                String var10 = "";
                if (var9 != null && var9.field5727 != null) {
                    var10 = var9.field5727;
                }
                field5244[field5233++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field5251[--field5238];
                class418 var12 = class785.method4304((byte) -109, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field5728;
                }
                field5251[field5238++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class66.field818 == null) {
                    field5251[field5238++] = -1;
                    return;
                }
                field5251[field5238++] = class66.field818.field5359;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field5251[--field5238];
                class312 var15 = class353.method2245(class87.field971, class166.field2622, (byte) 102);
                var15.field4445.method2952(0, var14);
                class208.method1440(var15, 89);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field5244[--field5233];
                method2344(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field5233 -= 2;
                String var17 = field5244[field5233];
                String var18 = field5244[field5233 + 1];
                if (class745.field10317 != 0 || (!class404.field5525 || class34.field466) && !class338.field4740) {
                    field5239++;
                    class312 var19 = class353.method2245(class87.field971, class410.field5564, (byte) 32);
                    var19.field4445.method2952(0, 0);
                    int var20 = var19.field4445.field7042;
                    var19.field4445.method2953(var17, -28136);
                    class488.method2904(var18, -126, var19.field4445);
                    var19.field4445.method2951(false, var19.field4445.field7042 - var20);
                    class208.method1440(var19, 62);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field5251[--field5238];
                class418 var22 = class785.method4304((byte) -100, var21);
                String var23 = "";
                if (var22 != null && var22.field5729 != null) {
                    var23 = var22.field5729;
                }
                field5244[field5233++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field5251[--field5238];
                class418 var25 = class785.method4304((byte) -102, var24);
                String var26 = "";
                if (var25 != null && var25.field5720 != null) {
                    var26 = var25.field5720;
                }
                field5244[field5233++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field5251[--field5238];
                class418 var28 = class785.method4304((byte) -108, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field5725;
                }
                field5251[field5238++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class210.field3250 == null || class210.field3250.field9753 == null) {
                    var30 = "";
                } else {
                    var30 = class210.field3250.method3976(true, -1);
                }
                field5244[field5233++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field5251[field5238++] = class766.field10544;
                return;
            }
            if (arg0 == 5017) {
                field5251[field5238++] = class698.method3930((byte) -30);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field5251[--field5238];
                class418 var32 = class785.method4304((byte) -118, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field5718;
                }
                field5251[field5238++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field5251[--field5238];
                class418 var35 = class785.method4304((byte) -54, var34);
                String var36 = "";
                if (var35 != null && var35.field5717 != null) {
                    var36 = var35.field5717;
                }
                field5244[field5233++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class210.field3250 == null || class210.field3250.field9753 == null) {
                    var37 = "";
                } else {
                    var37 = class210.field3250.method3979(0, false);
                }
                field5244[field5233++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field5251[--field5238];
                class418 var39 = class785.method4304((byte) -52, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field5723;
                }
                field5251[field5238++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field5251[--field5238];
                class418 var42 = class785.method4304((byte) -124, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field5721;
                }
                field5251[field5238++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field5251[--field5238];
                class418 var45 = class785.method4304((byte) -93, var44);
                String var46 = "";
                if (var45 != null && var45.field5726 != null) {
                    var46 = var45.field5726;
                }
                field5244[field5233++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field5251[--field5238];
                field5244[field5233++] = class737.field10169.method4292(true, var47).field5520;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field5251[--field5238];
                class403 var49 = class737.field10169.method4292(true, var48);
                if (var49.field5512 == null) {
                    field5251[field5238++] = 0;
                    return;
                }
                field5251[field5238++] = var49.field5512.length;
                return;
            }
            if (arg0 == 5052) {
                field5238 -= 2;
                int var50 = field5251[field5238];
                int var51 = field5251[field5238 + 1];
                class403 var52 = class737.field10169.method4292(true, var50);
                int var53 = var52.field5512[var51];
                field5251[field5238++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field5251[--field5238];
                class403 var55 = class737.field10169.method4292(true, var54);
                if (var55.field5511 == null) {
                    field5251[field5238++] = 0;
                    return;
                }
                field5251[field5238++] = var55.field5511.length;
                return;
            }
            if (arg0 == 5054) {
                field5238 -= 2;
                int var56 = field5251[field5238];
                int var57 = field5251[field5238 + 1];
                field5251[field5238++] = class737.field10169.method4292(true, var56).field5511[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field5251[--field5238];
                field5244[field5233++] = class204.field3172.method3795(var58, (byte) 105).method1343(25212);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field5251[--field5238];
                class193 var60 = class204.field3172.method3795(var59, (byte) 82);
                if (var60.field2984 == null) {
                    field5251[field5238++] = 0;
                    return;
                }
                field5251[field5238++] = var60.field2984.length;
                return;
            }
            if (arg0 == 5057) {
                field5238 -= 2;
                int var61 = field5251[field5238];
                int var62 = field5251[field5238 + 1];
                field5251[field5238++] = class204.field3172.method3795(var61, (byte) 84).field2984[var62];
                return;
            }
            if (arg0 == 5058) {
                field5227 = new class673();
                field5227.field9374 = field5251[--field5238];
                field5227.field9381 = class204.field3172.method3795(field5227.field9374, (byte) 83);
                field5227.field9382 = new int[field5227.field9381.method1342(99)];
                return;
            }
            if (arg0 == 5059) {
                field5248++;
                class312 var63 = class353.method2245(class87.field971, class96.field1091, (byte) 100);
                var63.field4445.method2952(0, 0);
                int var64 = var63.field4445.field7042;
                var63.field4445.method2952(0, 0);
                var63.field4445.method2957(field5227.field9374, 1267307848);
                field5227.field9381.method1347(field5227.field9382, var63.field4445, false);
                var63.field4445.method2951(false, var63.field4445.field7042 - var64);
                class208.method1440(var63, 86);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field5244[--field5233];
                field5228++;
                class312 var66 = class353.method2245(class87.field971, class620.field8727, (byte) 72);
                var66.field4445.method2952(0, 0);
                int var67 = var66.field4445.field7042;
                var66.field4445.method2953(var65, -28136);
                var66.field4445.method2957(field5227.field9374, 1267307848);
                field5227.field9381.method1347(field5227.field9382, var66.field4445, false);
                var66.field4445.method2951(false, var66.field4445.field7042 - var67);
                class208.method1440(var66, 72);
                return;
            }
            if (arg0 == 5061) {
                field5248++;
                class312 var68 = class353.method2245(class87.field971, class96.field1091, (byte) 120);
                var68.field4445.method2952(0, 0);
                int var69 = var68.field4445.field7042;
                var68.field4445.method2952(0, 1);
                var68.field4445.method2957(field5227.field9374, 1267307848);
                field5227.field9381.method1347(field5227.field9382, var68.field4445, false);
                var68.field4445.method2951(false, var68.field4445.field7042 - var69);
                class208.method1440(var68, 101);
                return;
            }
            if (arg0 == 5062) {
                field5238 -= 2;
                int var70 = field5251[field5238];
                int var71 = field5251[field5238 + 1];
                field5251[field5238++] = class737.field10169.method4292(true, var70).field5508[var71];
                return;
            }
            if (arg0 == 5063) {
                field5238 -= 2;
                int var72 = field5251[field5238];
                int var73 = field5251[field5238 + 1];
                field5251[field5238++] = class737.field10169.method4292(true, var72).field5518[var73];
                return;
            }
            if (arg0 == 5064) {
                field5238 -= 2;
                int var74 = field5251[field5238];
                int var75 = field5251[field5238 + 1];
                if (var75 == -1) {
                    field5251[field5238++] = -1;
                    return;
                }
                field5251[field5238++] = class737.field10169.method4292(true, var74).method2477((char) var75, -26132);
                return;
            }
            if (arg0 == 5065) {
                field5238 -= 2;
                int var76 = field5251[field5238];
                int var77 = field5251[field5238 + 1];
                if (var77 == -1) {
                    field5251[field5238++] = -1;
                    return;
                }
                field5251[field5238++] = class737.field10169.method4292(true, var76).method2478(false, (char) var77);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field5251[--field5238];
                field5251[field5238++] = class204.field3172.method3795(var78, (byte) 119).method1342(125);
                return;
            }
            if (arg0 == 5067) {
                field5238 -= 2;
                int var79 = field5251[field5238];
                int var80 = field5251[field5238 + 1];
                int var81 = class204.field3172.method3795(var79, (byte) 113).method1340(var80, -110).field2732;
                field5251[field5238++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field5238 -= 2;
                int var82 = field5251[field5238];
                int var83 = field5251[field5238 + 1];
                field5227.field9382[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field5238 -= 2;
                int var84 = field5251[field5238];
                int var85 = field5251[field5238 + 1];
                field5227.field9382[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field5238 -= 3;
                int var86 = field5251[field5238];
                int var87 = field5251[field5238 + 1];
                int var88 = field5251[field5238 + 2];
                class193 var89 = class204.field3172.method3795(var86, (byte) 64);
                if (var89.method1340(var87, -116).field2732 != 0) {
                    throw new RuntimeException("bad command");
                }
                field5251[field5238++] = var89.method1349(var87, var88, 98);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field5244[--field5233];
                boolean var91 = field5251[--field5238] == 1;
                class229.method1553(var90, -1, var91);
                field5251[field5238++] = class280.field4072;
                return;
            }
            if (arg0 == 5072) {
                if (class656.field9139 != null && class561.field7976 < class280.field4072) {
                    field5251[field5238++] = class656.field9139[class561.field7976++] & 0xFFFF;
                    return;
                }
                field5251[field5238++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class561.field7976 = 0;
                return;
            }
            if (arg0 == 5074) {
                class312 var92 = class353.method2245(class87.field971, class96.field1091, (byte) 98);
                var92.field4445.method2952(0, 0);
                int var93 = var92.field4445.field7042;
                var92.field4445.method2952(0, 2);
                var92.field4445.method2957(field5227.field9374, 1267307848);
                field5227.field9381.method1347(field5227.field9382, var92.field4445, false);
                var92.field4445.method2951(false, var92.field4445.field7042 - var93);
                class208.method1440(var92, 109);
                return;
            }
            if (arg0 == 5075) {
                class312 var94 = class353.method2245(class87.field971, class96.field1091, (byte) 76);
                var94.field4445.method2952(0, 0);
                int var95 = var94.field4445.field7042;
                var94.field4445.method2952(0, 3);
                var94.field4445.method2957(field5227.field9374, 1267307848);
                field5227.field9381.method1347(field5227.field9382, var94.field4445, false);
                var94.field4445.method2951(false, var94.field4445.field7042 - var95);
                class208.method1440(var94, 60);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class629.field8820.method2138(86, -6759)) {
                    field5251[field5238++] = 1;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class629.field8820.method2138(82, -6759)) {
                    field5251[field5238++] = 1;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class629.field8820.method2138(81, -6759)) {
                    field5251[field5238++] = 1;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class784.method4300(false, field5251[--field5238]);
                return;
            }
            if (arg0 == 5201) {
                field5251[field5238++] = class12.method136(-11);
                return;
            }
            if (arg0 == 5205) {
                class430.method2582(-1, field5251[--field5238], -1, false, (byte) -99);
                return;
            }
            if (arg0 == 5206) {
                int var96 = field5251[--field5238];
                class758 var97 = class117.method877(var96 >> 14 & 0x3FFF, var96 & 0x3FFF);
                if (var97 == null) {
                    field5251[field5238++] = -1;
                    return;
                }
                field5251[field5238++] = var97.field10442;
                return;
            }
            if (arg0 == 5207) {
                class758 var98 = class117.method878(field5251[--field5238]);
                if (var98 != null && var98.field10441 != null) {
                    field5244[field5233++] = var98.field10441;
                    return;
                }
                field5244[field5233++] = "";
                return;
            }
            if (arg0 == 5208) {
                field5251[field5238++] = class98.field1117;
                field5251[field5238++] = class776.field10665;
                return;
            }
            if (arg0 == 5209) {
                field5251[field5238++] = class671.field9338 + class117.field1804;
                field5251[field5238++] = class752.field10398 + class117.field1806;
                return;
            }
            if (arg0 == 5210) {
                int var99 = field5251[--field5238];
                class758 var100 = class117.method878(var99);
                if (var100 == null) {
                    field5251[field5238++] = 0;
                    field5251[field5238++] = 0;
                    return;
                }
                field5251[field5238++] = var100.field10439 >> 14 & 0x3FFF;
                field5251[field5238++] = var100.field10439 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var101 = field5251[--field5238];
                class758 var102 = class117.method878(var101);
                if (var102 == null) {
                    field5251[field5238++] = 0;
                    field5251[field5238++] = 0;
                    return;
                }
                field5251[field5238++] = var102.field10459 - var102.field10447;
                field5251[field5238++] = var102.field10443 - var102.field10454;
                return;
            }
            if (arg0 == 5212) {
                class492 var103 = class174.method1264((byte) -128);
                if (var103 == null) {
                    field5251[field5238++] = -1;
                    field5251[field5238++] = -1;
                    return;
                }
                field5251[field5238++] = var103.field6971;
                int var104 = var103.field6973 << 28 | class117.field1804 + var103.field6970 << 14 | class117.field1806 + var103.field6969;
                field5251[field5238++] = var104;
                return;
            }
            if (arg0 == 5213) {
                class492 var105 = class433.method2594(6);
                if (var105 == null) {
                    field5251[field5238++] = -1;
                    field5251[field5238++] = -1;
                    return;
                }
                field5251[field5238++] = var105.field6971;
                int var106 = var105.field6973 << 28 | class117.field1804 + var105.field6970 << 14 | class117.field1806 + var105.field6969;
                field5251[field5238++] = var106;
                return;
            }
            if (arg0 == 5214) {
                int var107 = field5251[--field5238];
                class758 var108 = class142.method1014(-74);
                if (var108 != null) {
                    boolean var109 = var108.method4210(field5230, true, var107 >> 14 & 0x3FFF, var107 >> 28 & 0x3, var107 & 0x3FFF);
                    if (var109) {
                        class392.method2427(field5230[1], -115, field5230[2]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field5238 -= 2;
                int var110 = field5251[field5238];
                int var111 = field5251[field5238 + 1];
                class83 var112 = class117.method883(var110 >> 14 & 0x3FFF, var110 & 0x3FFF);
                boolean var113 = false;
                for (class758 var114 = (class758) var112.method636(256); var114 != null; var114 = (class758) var112.method637(false)) {
                    if (var114.field10442 == var111) {
                        var113 = true;
                        break;
                    }
                }
                if (var113) {
                    field5251[field5238++] = 1;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var115 = field5251[--field5238];
                class758 var116 = class117.method878(var115);
                if (var116 == null) {
                    field5251[field5238++] = -1;
                    return;
                }
                field5251[field5238++] = var116.field10438;
                return;
            }
            if (arg0 == 5220) {
                field5251[field5238++] = class197.field3016 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var117 = field5251[--field5238];
                class392.method2427(var117 >> 14 & 0x3FFF, -122, var117 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class758 var118 = class142.method1014(-109);
                if (var118 != null) {
                    boolean var119 = var118.method4208(0, class671.field9338 + class117.field1804, field5230, class752.field10398 + class117.field1806);
                    if (var119) {
                        field5251[field5238++] = field5230[1];
                        field5251[field5238++] = field5230[2];
                        return;
                    }
                    field5251[field5238++] = -1;
                    field5251[field5238++] = -1;
                    return;
                }
                field5251[field5238++] = -1;
                field5251[field5238++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field5238 -= 2;
                int var120 = field5251[field5238];
                int var121 = field5251[field5238 + 1];
                class430.method2582(var121 & 0x3FFF, var120, var121 >> 14 & 0x3FFF, false, (byte) -99);
                return;
            }
            if (arg0 == 5224) {
                int var122 = field5251[--field5238];
                class758 var123 = class142.method1014(-96);
                if (var123 != null) {
                    boolean var124 = var123.method4210(field5230, true, var122 >> 14 & 0x3FFF, var122 >> 28 & 0x3, var122 & 0x3FFF);
                    if (var124) {
                        field5251[field5238++] = field5230[1];
                        field5251[field5238++] = field5230[2];
                        return;
                    }
                    field5251[field5238++] = -1;
                    field5251[field5238++] = -1;
                    return;
                }
                field5251[field5238++] = -1;
                field5251[field5238++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var125 = field5251[--field5238];
                class758 var126 = class142.method1014(-97);
                if (var126 != null) {
                    boolean var127 = var126.method4208(0, var125 >> 14 & 0x3FFF, field5230, var125 & 0x3FFF);
                    if (var127) {
                        field5251[field5238++] = field5230[1];
                        field5251[field5238++] = field5230[2];
                        return;
                    }
                    field5251[field5238++] = -1;
                    field5251[field5238++] = -1;
                    return;
                }
                field5251[field5238++] = -1;
                field5251[field5238++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class34.method281(field5251[--field5238], 114);
                return;
            }
            if (arg0 == 5227) {
                field5238 -= 2;
                int var128 = field5251[field5238];
                int var129 = field5251[field5238 + 1];
                class430.method2582(var129 & 0x3FFF, var128, var129 >> 14 & 0x3FFF, true, (byte) -99);
                return;
            }
            if (arg0 == 5228) {
                class749.field10383 = field5251[--field5238] == 1;
                return;
            }
            if (arg0 == 5229) {
                field5251[field5238++] = class749.field10383 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var130 = field5251[--field5238];
                class346.method2200((byte) 99, var130);
                return;
            }
            if (arg0 == 5231) {
                field5238 -= 2;
                int var131 = field5251[field5238];
                boolean var132 = field5251[field5238 + 1] == 1;
                if (class173.field2687 != null) {
                    class577 var133 = class173.field2687.method2242((long) var131, -1);
                    if (var133 != null && !var132) {
                        var133.method3387((byte) -69);
                        return;
                    }
                    if (var133 == null && var132) {
                        class577 var134 = new class577();
                        class173.field2687.method2241(-48, (long) var131, var134);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var135 = field5251[--field5238];
                if (class173.field2687 != null) {
                    class577 var136 = class173.field2687.method2242((long) var135, -1);
                    field5251[field5238++] = var136 == null ? 0 : 1;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field5238 -= 2;
                int var137 = field5251[field5238];
                boolean var138 = field5251[field5238 + 1] == 1;
                if (class561.field7977 != null) {
                    class577 var139 = class561.field7977.method2242((long) var137, -1);
                    if (var139 != null && !var138) {
                        var139.method3387((byte) 107);
                        return;
                    }
                    if (var139 == null && var138) {
                        class577 var140 = new class577();
                        class561.field7977.method2241(-82, (long) var137, var140);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var141 = field5251[--field5238];
                if (class561.field7977 != null) {
                    class577 var142 = class561.field7977.method2242((long) var141, -1);
                    field5251[field5238++] = var142 == null ? 0 : 1;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field5251[field5238++] = class117.field1791 == null ? -1 : class117.field1791.field10442;
                return;
            }
            if (arg0 == 5236) {
                field5238 -= 2;
                int var143 = field5251[field5238];
                int var144 = field5251[field5238 + 1];
                int var145 = var144 >> 14 & 0x3FFF;
                int var146 = var144 & 0x3FFF;
                int var147 = class455.method2712(var143, 67, var146, var145);
                if (var147 < 0) {
                    field5251[field5238++] = -1;
                    return;
                }
                field5251[field5238++] = var147;
                return;
            }
            if (arg0 == 5237) {
                class355.method2257(94);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field5238 -= 2;
                int var148 = field5251[field5238];
                int var149 = field5251[field5238 + 1];
                class666.method3797(var148, -108, var149, false, 3);
                field5251[field5238++] = class161.field2561 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class161.field2561 != null) {
                    class666.method3797(-1, -118, -1, false, class21.field353.field10097.method3352(-52));
                }
                return;
            }
            if (arg0 == 5302) {
                class293[] var150 = class429.method2581((byte) -83);
                field5251[field5238++] = var150.length;
                return;
            }
            if (arg0 == 5303) {
                int var151 = field5251[--field5238];
                class293[] var152 = class429.method2581((byte) -96);
                field5251[field5238++] = var152[var151].field4281;
                field5251[field5238++] = var152[var151].field4275;
                return;
            }
            if (arg0 == 5305) {
                int var153 = class257.field3773;
                int var154 = class317.field4520;
                int var155 = -1;
                class293[] var156 = class429.method2581((byte) -98);
                for (int var157 = 0; var157 < var156.length; var157++) {
                    class293 var158 = var156[var157];
                    if (var158.field4281 == var153 && var158.field4275 == var154) {
                        var155 = var157;
                        break;
                    }
                }
                field5251[field5238++] = var155;
                return;
            }
            if (arg0 == 5306) {
                field5251[field5238++] = class592.method3442((byte) -56);
                return;
            }
            if (arg0 == 5307) {
                int var159 = field5251[--field5238];
                if (var159 >= 1 && var159 <= 2) {
                    class666.method3797(-1, -117, -1, false, var159);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field5251[field5238++] = class21.field353.field10097.method3352(-75);
                return;
            }
            if (arg0 == 5309) {
                int var160 = field5251[--field5238];
                if (var160 >= 1 && var160 <= 2) {
                    class21.field353.method4080(true, class21.field353.field10097, var160);
                    class21.field353.method4080(true, class21.field353.field10079, var160);
                    class580.method3397((byte) 13);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field5233 -= 2;
                String var161 = field5244[field5233];
                String var162 = field5244[field5233 + 1];
                int var163 = field5251[--field5238];
                field5224++;
                class312 var164 = class353.method2245(class87.field971, class142.field2100, (byte) 68);
                var164.field4445.method2952(0, class348.method2204((byte) -80, var161) + class348.method2204((byte) -95, var162) + 1);
                var164.field4445.method2953(var161, -28136);
                var164.field4445.method2953(var162, -28136);
                var164.field4445.method2952(0, var163);
                class208.method1440(var164, 40);
                return;
            }
            if (arg0 == 5401) {
                field5238 -= 2;
                class116.field1780[field5251[field5238]] = (short) class306.method1978(field5251[field5238 + 1], (byte) 64);
                class313.field4456.method1680(72);
                class313.field4456.method1672(-91);
                class575.field8103.method2437(25480);
                class351.method2224((byte) 119);
                return;
            }
            if (arg0 == 5405) {
                field5238 -= 2;
                int var165 = field5251[field5238];
                int var166 = field5251[field5238 + 1];
                if (var165 >= 0 && var165 < 2) {
                    class483.field6811[var165] = new int[var166 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field5238 -= 7;
                int var167 = field5251[field5238];
                int var168 = field5251[field5238 + 1] << 1;
                int var169 = field5251[field5238 + 2];
                int var170 = field5251[field5238 + 3];
                int var171 = field5251[field5238 + 4];
                int var172 = field5251[field5238 + 5];
                int var173 = field5251[field5238 + 6];
                if (var167 >= 0 && var167 < 2 && class483.field6811[var167] != null && var168 >= 0 && var168 < class483.field6811[var167].length) {
                    class483.field6811[var167][var168] = new int[] { (var169 >> 14 & 0x3FFF) << 9, var170 << 2, (var169 & 0x3FFF) << 9, var173 };
                    class483.field6811[var167][var168 + 1] = new int[] { (var171 >> 14 & 0x3FFF) << 9, var172 << 2, (var171 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var174 = class483.field6811[field5251[--field5238]].length >> 1;
                field5251[field5238++] = var174;
                return;
            }
            if (arg0 == 5411) {
                if (class161.field2561 != null) {
                    class666.method3797(-1, -113, -1, false, class21.field353.field10097.method3352(-55));
                }
                if (class384.field5278 != null) {
                    class787.method4312(-30475);
                    System.exit(0);
                    return;
                }
                String var175 = class666.field9267 == null ? class662.method3777((byte) -128) : class666.field9267;
                class613.method3562(false, class519.field7328, -123, var175, class21.field353.field10098.method1588(-26) == 1);
                return;
            }
            if (arg0 == 5419) {
                String var176 = "";
                if (class348.field4877 != null) {
                    if (class348.field4877.field2092 == null) {
                        var176 = class215.method1476(569, class348.field4877.field2087);
                    } else {
                        var176 = (String) class348.field4877.field2092;
                    }
                }
                field5244[field5233++] = var176;
                return;
            }
            if (arg0 == 5420) {
                field5251[field5238++] = class519.field7328.field6674 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class161.field2561 != null) {
                    class666.method3797(-1, -122, -1, false, class21.field353.field10097.method3352(-65));
                }
                String var177 = field5244[--field5233];
                boolean var178 = field5251[--field5238] == 1;
                String var179 = class662.method3777((byte) -112) + var177;
                class613.method3562(var178, class519.field7328, -84, var179, class21.field353.field10098.method1588(-69) == 1);
                return;
            }
            if (arg0 == 5422) {
                field5233 -= 2;
                String var180 = field5244[field5233];
                String var181 = field5244[field5233 + 1];
                int var182 = field5251[--field5238];
                if (var180.length() > 0) {
                    if (class171.field2665 == null) {
                        class171.field2665 = new String[class127.field1954[class60.field734.field3718]];
                    }
                    class171.field2665[var182] = var180;
                }
                if (var181.length() > 0) {
                    if (class713.field9891 == null) {
                        class713.field9891 = new String[class127.field1954[class60.field734.field3718]];
                    }
                    class713.field9891[var182] = var181;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field5244[--field5233]);
                return;
            }
            if (arg0 == 5424) {
                field5238 -= 11;
                class161.field2560 = field5251[field5238];
                class492.field6977 = field5251[field5238 + 1];
                class301.field4344 = field5251[field5238 + 2];
                class330.field4626 = field5251[field5238 + 3];
                class741.field10219 = field5251[field5238 + 4];
                class777.field10676 = field5251[field5238 + 5];
                class319.field4528 = field5251[field5238 + 6];
                class737.field10170 = field5251[field5238 + 7];
                class528.field7548 = field5251[field5238 + 8];
                class665.field9264 = field5251[field5238 + 9];
                class789.field10825 = field5251[field5238 + 10];
                class152.field2163.method4349((byte) -102, class741.field10219);
                class152.field2163.method4349((byte) -102, class777.field10676);
                class152.field2163.method4349((byte) -102, class319.field4528);
                class152.field2163.method4349((byte) -102, class737.field10170);
                class152.field2163.method4349((byte) -102, class528.field7548);
                class639.field8966 = null;
                class273.field3936 = null;
                class758.field10461 = null;
                class182.field2809 = null;
                class95.field1079 = null;
                class772.field10606 = null;
                class78.field888 = null;
                class205.field3183 = null;
                class463.field6530 = true;
                return;
            }
            if (arg0 == 5425) {
                class74.method586((byte) -64);
                class463.field6530 = false;
                return;
            }
            if (arg0 == 5426) {
                field5238 -= 2;
                class572.field8073 = field5251[field5238];
                class450.field6165 = field5251[field5238 + 1];
                return;
            }
            if (arg0 == 5427) {
                field5238 -= 2;
                class547.field7869 = field5251[field5238 + 1];
                return;
            }
            if (arg0 == 5428) {
                field5238 -= 2;
                int var183 = field5251[field5238];
                int var184 = field5251[field5238 + 1];
                field5251[field5238++] = class240.method1600(var184, var183, (byte) -85) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class90.method675(field5244[--field5233], 6, false, false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class323.method2083(-10217, "accountcreated", class319.field4527);
                    return;
                } catch (Throwable var336) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class323.method2083(-10217, "accountcreatestarted", class319.field4527);
                    return;
                } catch (Throwable var337) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var185 = "";
                if (class430.field5834 != null) {
                    Transferable var186 = class430.field5834.getContents(null);
                    if (var186 != null) {
                        try {
                            var185 = (String) var186.getTransferData(DataFlavor.stringFlavor);
                            if (var185 == null) {
                                var185 = "";
                            }
                        } catch (Exception var338) {
                        }
                    }
                }
                field5244[field5233++] = var185;
                return;
            }
            if (arg0 == 5433) {
                class617.field8632 = field5251[--field5238];
                return;
            }
            if (arg0 == 5435) {
                field5251[field5238++] = class685.field9515 ? 1 : 0;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field5238 -= 4;
                int var187 = field5251[field5238];
                int var188 = field5251[field5238 + 1];
                int var189 = field5251[field5238 + 2];
                int var190 = field5251[field5238 + 3];
                class665.method3786((var187 >> 14 & 0x3FFF) - class124.field1922, false, var189, (byte) 11, var190, (var187 & 0x3FFF) - class88.field999, var188 << 2);
                return;
            }
            if (arg0 == 5501) {
                field5238 -= 4;
                int var191 = field5251[field5238];
                int var192 = field5251[field5238 + 1];
                int var193 = field5251[field5238 + 2];
                int var194 = field5251[field5238 + 3];
                class226.method1541(var193, var192 << 2, var194, (var191 & 0x3FFF) - class88.field999, false, (var191 >> 14 & 0x3FFF) - class124.field1922);
                return;
            }
            if (arg0 == 5502) {
                field5238 -= 6;
                int var195 = field5251[field5238];
                if (var195 >= 2) {
                    throw new RuntimeException();
                }
                class733.field10150 = var195;
                int var196 = field5251[field5238 + 1];
                if (var196 + 1 >= class483.field6811[class733.field10150].length >> 1) {
                    throw new RuntimeException();
                }
                class46.field580 = var196;
                class159.field2544 = 0;
                class436.field5892 = field5251[field5238 + 2];
                class41.field530 = field5251[field5238 + 3];
                int var197 = field5251[field5238 + 4];
                if (var197 >= 2) {
                    throw new RuntimeException();
                }
                class276.field4014 = var197;
                int var198 = field5251[field5238 + 5];
                if (var198 + 1 >= class483.field6811[class276.field4014].length >> 1) {
                    throw new RuntimeException();
                }
                class182.field2810 = var198;
                class416.field5704 = 3;
                class375.field5176 = -1;
                class429.field5830 = -1;
                return;
            }
            if (arg0 == 5503) {
                class202.method1415(24828);
                return;
            }
            if (arg0 == 5504) {
                field5238 -= 2;
                class75.method593(true, field5251[field5238 + 1], 0, field5251[field5238]);
                return;
            }
            if (arg0 == 5505) {
                field5251[field5238++] = (int) class642.field8990 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field5251[field5238++] = (int) class758.field10460 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class105.method736(-501);
                return;
            }
            if (arg0 == 5508) {
                class763.method4231(53);
                return;
            }
            if (arg0 == 5509) {
                class510.method3084(-4);
                return;
            }
            if (arg0 == 5510) {
                class312.method1997(-342758856);
                return;
            }
            if (arg0 == 5511) {
                int var199 = field5251[--field5238];
                int var200 = var199 >> 14 & 0x3FFF;
                int var201 = var199 & 0x3FFF;
                int var202 = var200 - class124.field1922;
                if (var202 < 0) {
                    var202 = 0;
                } else if (var202 >= class768.field10571) {
                    var202 = class768.field10571;
                }
                int var203 = var201 - class88.field999;
                if (var203 < 0) {
                    var203 = 0;
                } else if (var203 >= class350.field4898) {
                    var203 = class350.field4898;
                }
                class574.field8093 = (var202 << 9) + 256;
                class207.field3211 = (var203 << 9) + 256;
                class416.field5704 = 4;
                class375.field5176 = -1;
                class429.field5830 = -1;
                return;
            }
            if (arg0 == 5512) {
                class401.method2467((byte) 84);
                return;
            }
            if (arg0 == 5514) {
                class740.field10197 = field5251[--field5238];
                return;
            }
            if (arg0 == 5516) {
                field5251[field5238++] = class740.field10197;
                return;
            }
            if (arg0 == 5517) {
                int var204 = field5251[--field5238];
                if (var204 == -1) {
                    int var205 = var204 >> 14 & 0x3FFF;
                    int var206 = var204 & 0x3FFF;
                    int var207 = var205 - class124.field1922;
                    if (var207 < 0) {
                        var207 = 0;
                    } else if (var207 >= class768.field10571) {
                        var207 = class768.field10571;
                    }
                    int var208 = var206 - class88.field999;
                    if (var208 < 0) {
                        var208 = 0;
                    } else if (var208 >= class350.field4898) {
                        var208 = class350.field4898;
                    }
                    class429.field5830 = (var207 << 9) + 256;
                    class375.field5176 = (var208 << 9) + 256;
                    return;
                }
                class429.field5830 = -1;
                class375.field5176 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field5233 -= 2;
                String var209 = field5244[field5233];
                String var210 = field5244[field5233 + 1];
                int var211 = field5251[--field5238];
                class745.method4153(var209, var210, var211, 0);
                return;
            }
            if (arg0 == 5601) {
                class265.method1720(11);
                return;
            }
            if (arg0 == 5602) {
                if (!class140.method1013((byte) -125)) {
                    class613.method3559(-6878);
                }
                return;
            }
            if (arg0 == 5604) {
                field5233--;
                if (class266.field3873 != 3) {
                    return;
                }
                if (!class140.method1013((byte) -87) && class339.field4745 == 0) {
                    class580.method3396(field5244[field5233], 0);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field5233 -= 2;
                field5238 -= 2;
                if (class266.field3873 != 3) {
                    return;
                }
                if (!class140.method1013((byte) -60) && class339.field4745 == 0) {
                    class306.method1986(field5244[field5233 + 1], field5251[field5238], field5244[field5233], -99, field5251[field5238 + 1] == 1);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class339.field4745 == 0) {
                    class617.field8633 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field5251[field5238++] = class200.field3046;
                return;
            }
            if (arg0 == 5608) {
                field5251[field5238++] = class715.field9936;
                return;
            }
            if (arg0 == 5609) {
                field5251[field5238++] = class617.field8633;
                return;
            }
            if (arg0 == 5611) {
                field5251[field5238++] = class596.field8370;
                return;
            }
            if (arg0 == 5612) {
                int var212 = field5251[--field5238];
                class554.method3294((byte) -127, var212);
                return;
            }
            if (arg0 == 5613) {
                field5251[field5238++] = class200.field3046;
                return;
            }
            if (arg0 == 5615) {
                field5233 -= 2;
                String var213 = field5244[field5233];
                String var214 = field5244[field5233 + 1];
                class563.method3323(var213, 79, var214);
                return;
            }
            if (arg0 == 5616) {
                class195.method1354((byte) -61, false);
                return;
            }
            if (arg0 == 5617) {
                field5251[field5238++] = class745.field10318;
                return;
            }
            if (arg0 == 5618) {
                field5238--;
                return;
            }
            if (arg0 == 5619) {
                field5238--;
                return;
            }
            if (arg0 == 5620) {
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field5233 -= 2;
                field5238 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class378.field5220 != null) {
                    field5251[field5238++] = 1;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field5251[field5238++] = (int) (class243.field3624 >> 32);
                field5251[field5238++] = (int) (class243.field3624 & 0xFFFFFFFFFFFFFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field5251[field5238++] = class337.field4726 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class337.field4726 = true;
                class583.method3411(86400000);
                return;
            }
            if (arg0 == 5628) {
                field5251[field5238++] = class140.method1013((byte) -122) ? 1 : 0;
                return;
            }
            if (arg0 == 5630) {
                class513.method3094(-1);
                return;
            }
            if (arg0 == 5631) {
                field5238 -= 2;
                int var215 = field5251[field5238];
                int var216 = field5251[field5238 + 1];
                class55.method386((byte) 114, var216, var215);
                return;
            }
            if (arg0 == 5632) {
                int var217 = field5251[--field5238];
                class167.method1244((byte) 10, var217);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var218 = field5251[--field5238];
                class21.field353.method4080(true, class21.field353.field10074, var218);
                class13.method139(true);
                class580.method3397((byte) 13);
                class768.field10567 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var219 = field5251[--field5238] == 1;
                class21.field353.method4080(true, class21.field353.field10075, var219 ? 1 : 0);
                class21.field353.method4080(true, class21.field353.field10086, var219 ? 1 : 0);
                class13.method139(true);
                class620.method3581(-2);
                class580.method3397((byte) 13);
                class768.field10567 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var220 = field5251[--field5238] == 1;
                class21.field353.method4080(true, class21.field353.field10058, var220 ? 2 : 1);
                class21.field353.method4080(true, class21.field353.field10073, var220 ? 2 : 1);
                class620.method3581(-2);
                class580.method3397((byte) 13);
                class768.field10567 = false;
                return;
            }
            if (arg0 == 6005) {
                class21.field353.method4080(true, class21.field353.field10067, field5251[--field5238] == 1 ? 1 : 0);
                class13.method139(true);
                class580.method3397((byte) 13);
                class768.field10567 = false;
                return;
            }
            if (arg0 == 6007) {
                class21.field353.method4080(true, class21.field353.field10104, field5251[--field5238]);
                class580.method3397((byte) 13);
                class768.field10567 = false;
                return;
            }
            if (arg0 == 6008) {
                class21.field353.method4080(true, class21.field353.field10064, field5251[--field5238] == 1 ? 1 : 0);
                class580.method3397((byte) 13);
                class768.field10567 = false;
                return;
            }
            if (arg0 == 6010) {
                class21.field353.method4080(true, class21.field353.field10069, field5251[--field5238] == 1 ? 1 : 0);
                class580.method3397((byte) 13);
                class768.field10567 = false;
                return;
            }
            if (arg0 == 6011) {
                class21.field353.method4080(true, class21.field353.field10062, field5251[--field5238]);
                class13.method139(true);
                class580.method3397((byte) 13);
                class768.field10567 = false;
                return;
            }
            if (arg0 == 6012) {
                class21.field353.method4080(true, class21.field353.field10080, field5251[--field5238] == 1 ? 1 : 0);
                class594.method3464(true);
                class37.method289((byte) 68);
                class580.method3397((byte) 13);
                class768.field10567 = false;
                return;
            }
            if (arg0 == 6014) {
                class21.field353.method4080(true, class21.field353.field10072, field5251[--field5238] == 1 ? 2 : 0);
                class13.method139(true);
                class580.method3397((byte) 13);
                class768.field10567 = false;
                return;
            }
            if (arg0 == 6015) {
                class21.field353.method4080(true, class21.field353.field10091, field5251[--field5238] == 1 ? 1 : 0);
                class13.method139(true);
                class580.method3397((byte) 13);
                class768.field10567 = false;
                return;
            }
            if (arg0 == 6016) {
                class21.field353.method4080(true, class21.field353.field10070, field5251[--field5238]);
                class9.method61(class21.field353.field10098.method1588(-45), false, (byte) -40);
                class580.method3397((byte) 13);
                return;
            }
            if (arg0 == 6017) {
                class21.field353.method4080(true, class21.field353.field10081, field5251[--field5238] == 1 ? 1 : 0);
                class738.method4111(true);
                class580.method3397((byte) 13);
                class768.field10567 = false;
                return;
            }
            if (arg0 == 6018) {
                class21.field353.method4080(true, class21.field353.field10061, field5251[--field5238]);
                class580.method3397((byte) 13);
                class768.field10567 = false;
                return;
            }
            if (arg0 == 6019) {
                int var221 = field5251[--field5238];
                int var222 = class21.field353.field10078.method2896(-73);
                if (var221 != var222) {
                    if (class695.method3923(class266.field3873, false)) {
                        if (var222 == 0 && class577.field8137 != -1) {
                            class370.method2306(var221, 0, class488.field6899, class577.field8137, (byte) -84, false);
                            class753.method4192(50);
                            class169.field2642 = false;
                        } else if (var221 == 0) {
                            class601.method3496(true);
                            class169.field2642 = false;
                        } else {
                            class511.method3089(var221, 4096);
                        }
                    }
                    class21.field353.method4080(true, class21.field353.field10078, var221);
                    class580.method3397((byte) 13);
                    class768.field10567 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class21.field353.method4080(true, class21.field353.field10095, field5251[--field5238]);
                class580.method3397((byte) 13);
                class768.field10567 = false;
                return;
            }
            if (arg0 == 6021) {
                int var223 = class21.field353.field10058.method1614(-57);
                class21.field353.method4080(true, class21.field353.field10073, field5251[--field5238] == 1 ? 0 : var223);
                class620.method3581(-2);
                return;
            }
            if (arg0 == 6023) {
                int var224 = field5251[--field5238];
                class21.field353.method4080(true, class21.field353.field10102, var224);
                class580.method3397((byte) 13);
                class768.field10567 = false;
                return;
            }
            if (arg0 == 6024) {
                class21.field353.method4080(true, class21.field353.field10096, field5251[--field5238]);
                class580.method3397((byte) 13);
                return;
            }
            if (arg0 == 6025) {
                class21.field353.method4080(true, class21.field353.field10100, field5251[--field5238]);
                class580.method3397((byte) 13);
                class768.field10567 = false;
                return;
            }
            if (arg0 == 6027) {
                int var225 = field5251[--field5238];
                if (var225 < 0 || var225 > 1) {
                    var225 = 0;
                }
                class338.method2145((byte) -27, var225 == 1);
                return;
            }
            if (arg0 == 6028) {
                class21.field353.method4080(true, class21.field353.field10101, field5251[--field5238] == 0 ? 0 : 1);
                class580.method3397((byte) 13);
                return;
            }
            if (arg0 == 6029) {
                class21.field353.method4080(true, class21.field353.field10104, field5251[--field5238]);
                class580.method3397((byte) 13);
                return;
            }
            if (arg0 == 6030) {
                class21.field353.method4080(true, class21.field353.field10089, field5251[--field5238] == 0 ? 0 : 1);
                class580.method3397((byte) 13);
                class13.method139(true);
                return;
            }
            if (arg0 == 6031) {
                int var226 = field5251[--field5238];
                if (var226 < 0 || var226 > 5) {
                    var226 = 2;
                }
                class9.method61(var226, false, (byte) -40);
                return;
            }
            if (arg0 == 6032) {
                field5238 -= 2;
                int var227 = field5251[field5238];
                boolean var228 = field5251[field5238 + 1] == 1;
                class21.field353.method4080(true, class21.field353.field10076, var227);
                if (!var228) {
                    class21.field353.method4080(true, class21.field353.field10088, 0);
                }
                class580.method3397((byte) 13);
                class768.field10567 = false;
                return;
            }
            if (arg0 == 6033) {
                class21.field353.method4080(true, class21.field353.field10059, field5251[--field5238]);
                class580.method3397((byte) 13);
                return;
            }
            if (arg0 == 6034) {
                class21.field353.method4080(true, class21.field353.field10057, field5251[--field5238] == 1 ? 1 : 0);
                class580.method3397((byte) 13);
                class594.method3464(true);
                class768.field10567 = false;
                return;
            }
            if (arg0 == 6035) {
                int var229 = class21.field353.field10075.method1642(-71);
                class21.field353.method4080(true, class21.field353.field10086, field5251[--field5238] == 1 ? 1 : var229);
                class13.method139(true);
                class620.method3581(-2);
                return;
            }
            if (arg0 == 6036) {
                class21.field353.method4080(true, class21.field353.field10087, field5251[--field5238]);
                class580.method3397((byte) 13);
                class446.field6088 = true;
                return;
            }
            if (arg0 == 6037) {
                class21.field353.method4080(true, class21.field353.field10094, field5251[--field5238]);
                class580.method3397((byte) 13);
                class768.field10567 = false;
                return;
            }
            if (arg0 == 6038) {
                int var230 = field5251[--field5238];
                int var231 = class21.field353.field10083.method2896(-58);
                if (var230 != var231 && class577.field8137 == class181.field2801) {
                    if (!class695.method3923(class266.field3873, false)) {
                        if (var231 == 0) {
                            class370.method2306(var230, 0, class488.field6899, class577.field8137, (byte) -84, false);
                            class753.method4192(49);
                            class169.field2642 = false;
                        } else if (var230 == 0) {
                            class601.method3496(true);
                            class169.field2642 = false;
                        } else {
                            class511.method3089(var230, 4096);
                        }
                    }
                    class21.field353.method4080(true, class21.field353.field10083, var230);
                    class580.method3397((byte) 13);
                    class768.field10567 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var232 = field5251[--field5238];
                if (var232 > 255 || var232 < 0) {
                    var232 = 0;
                }
                if (var232 != class21.field353.field10103.method287(-102)) {
                    class21.field353.method4080(true, class21.field353.field10103, var232);
                    class580.method3397((byte) 13);
                    class768.field10567 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var233 = field5251[--field5238];
                if (var233 != class21.field353.field10082.method4067(-104)) {
                    class21.field353.method4080(true, class21.field353.field10082, var233);
                    class580.method3397((byte) 13);
                    class768.field10567 = false;
                    class83.method627(808);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field5251[field5238++] = class21.field353.field10074.method315(-82);
                return;
            }
            if (arg0 == 6102) {
                field5251[field5238++] = class21.field353.field10075.method1642(-87) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field5251[field5238++] = class21.field353.field10058.method1614(-119) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field5251[field5238++] = class21.field353.field10067.method3318(-59) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field5251[field5238++] = class21.field353.field10104.method3376(-69);
                return;
            }
            if (arg0 == 6108) {
                field5251[field5238++] = class21.field353.field10064.method3719(-120) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field5251[field5238++] = class21.field353.field10069.method1229(-93) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field5251[field5238++] = class21.field353.field10062.method4001(-93);
                return;
            }
            if (arg0 == 6112) {
                field5251[field5238++] = class21.field353.field10080.method4366(-117) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field5251[field5238++] = class21.field353.field10072.method697(-97) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field5251[field5238++] = class21.field353.field10091.method1432(-116) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field5251[field5238++] = class21.field353.field10070.method1629(-97);
                return;
            }
            if (arg0 == 6117) {
                field5251[field5238++] = class21.field353.field10081.method1474(-34) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field5251[field5238++] = class21.field353.field10061.method2896(-100);
                return;
            }
            if (arg0 == 6119) {
                field5251[field5238++] = class21.field353.field10078.method2896(-123);
                return;
            }
            if (arg0 == 6120) {
                field5251[field5238++] = class21.field353.field10095.method2896(-57);
                return;
            }
            if (arg0 == 6123) {
                field5251[field5238++] = class41.method312((byte) 24);
                return;
            }
            if (arg0 == 6124) {
                field5251[field5238++] = class21.field353.field10096.method1629(-91);
                return;
            }
            if (arg0 == 6125) {
                field5251[field5238++] = class21.field353.field10100.method1660(-22);
                return;
            }
            if (arg0 == 6127) {
                field5251[field5238++] = class21.field353.field10090.method2426(-125) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field5251[field5238++] = class21.field353.field10101.method397(-61) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field5251[field5238++] = class21.field353.field10104.method3376(-86);
                return;
            }
            if (arg0 == 6130) {
                field5251[field5238++] = class21.field353.field10089.method124(-32) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field5251[field5238++] = class21.field353.field10098.method1588(-20);
                return;
            }
            if (arg0 == 6132) {
                field5251[field5238++] = class21.field353.field10076.method1588(-121);
                return;
            }
            if (arg0 == 6133) {
                field5251[field5238++] = class519.field7328.field6674 && !class519.field7328.field6692 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field5251[field5238++] = class21.field353.field10059.method4252(-106);
                return;
            }
            if (arg0 == 6136) {
                field5251[field5238++] = class21.field353.field10057.method1024(-118) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field5251[field5238++] = class400.method2464(class21.field353.field10098.method1588(-41), 14170, 200);
                return;
            }
            if (arg0 == 6139) {
                field5251[field5238++] = class21.field353.field10087.method3752(-44);
                return;
            }
            if (arg0 == 6142) {
                field5251[field5238++] = class21.field353.field10094.method2896(-19);
                return;
            }
            if (arg0 == 6143) {
                field5251[field5238++] = class21.field353.field10083.method2896(-58);
                return;
            }
            if (arg0 == 6144) {
                field5251[field5238++] = class248.field3673 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field5251[field5238++] = class21.field353.field10103.method287(-87);
                return;
            }
            if (arg0 == 6146) {
                field5251[field5238++] = class21.field353.field10082.method4067(-76);
                return;
            }
            if (arg0 == 6147) {
                field5251[field5238++] = class716.field9938.field249 < 512 || class248.field3673 || class678.field9431 ? 1 : 0;
                return;
            }
            if (arg0 == 6148) {
                field5251[field5238++] = class349.field4878 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field5238 -= 2;
                class37.field490 = (short) field5251[field5238];
                if (class37.field490 <= 0) {
                    class37.field490 = 256;
                }
                class504.field7155 = (short) field5251[field5238 + 1];
                if (class504.field7155 <= 0) {
                    class504.field7155 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field5238 -= 2;
                class768.field10572 = (short) field5251[field5238];
                if (class768.field10572 <= 0) {
                    class768.field10572 = 256;
                }
                class313.field4458 = (short) field5251[field5238 + 1];
                if (class313.field4458 <= 0) {
                    class313.field4458 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field5238 -= 4;
                class695.field9713 = (short) field5251[field5238];
                if (class695.field9713 <= 0) {
                    class695.field9713 = 1;
                }
                class210.field3252 = (short) field5251[field5238 + 1];
                if (class210.field3252 <= 0) {
                    class210.field3252 = 32767;
                } else if (class210.field3252 < class695.field9713) {
                    class210.field3252 = class695.field9713;
                }
                class96.field1099 = (short) field5251[field5238 + 2];
                if (class96.field1099 <= 0) {
                    class96.field1099 = 1;
                }
                class311.field4438 = (short) field5251[field5238 + 3];
                if (class311.field4438 <= 0) {
                    class311.field4438 = 32767;
                    return;
                }
                if (class311.field4438 < class96.field1099) {
                    class311.field4438 = class96.field1099;
                }
                return;
            }
            if (arg0 == 6203) {
                class495.method3007(0, 0, false, class209.field3245.field6290, 2, class209.field3245.field6288);
                field5251[field5238++] = class353.field4962;
                field5251[field5238++] = class250.field3688;
                return;
            }
            if (arg0 == 6204) {
                field5251[field5238++] = class768.field10572;
                field5251[field5238++] = class313.field4458;
                return;
            }
            if (arg0 == 6205) {
                field5251[field5238++] = class37.field490;
                field5251[field5238++] = class504.field7155;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field5251[field5238++] = (int) (class459.method2731(113) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field5251[field5238++] = (int) (class459.method2731(108) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field5238 -= 3;
                int var234 = field5251[field5238];
                int var235 = field5251[field5238 + 1];
                int var236 = field5251[field5238 + 2];
                long var237 = class504.method3044((byte) 37, var236, 0, 0, 12, var235, var234);
                int var239 = class613.method3557(-11745, var237);
                if (var236 < 1970) {
                    var239--;
                }
                field5251[field5238++] = var239;
                return;
            }
            if (arg0 == 6303) {
                field5251[field5238++] = class421.method2547(-76, class459.method2731(117));
                return;
            }
            if (arg0 == 6304) {
                int var240 = field5251[--field5238];
                boolean var241 = true;
                if (var240 < 0) {
                    var241 = (var240 + 1) % 4 == 0;
                } else if (var240 < 1582) {
                    var241 = var240 % 4 == 0;
                } else if (var240 % 4 != 0) {
                    var241 = false;
                } else if (var240 % 100 != 0) {
                    var241 = true;
                } else if (var240 % 400 != 0) {
                    var241 = false;
                }
                field5251[field5238++] = var241 ? 1 : 0;
                return;
            }
            if (arg0 == 6305) {
                int var242 = field5251[--field5238];
                int[] var243 = class262.method1698(var242, 22772);
                class595.method3473(var243, 0, field5251, field5238, 3);
                field5238 += 3;
                return;
            }
            if (arg0 == 6306) {
                int var244 = field5251[--field5238];
                field5251[field5238++] = (int) (class494.method2971(var244, 11745) / 60000L);
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field5251[field5238++] = class380.method2362(-1) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field5251[field5238++] = class244.method1621((byte) 51) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class266.field3873 == 7 && !class140.method1013((byte) -46) && class339.field4745 == 0) {
                    if (class368.field5110) {
                        field5251[field5238++] = 0;
                        return;
                    }
                    if (class693.field9668 > class459.method2731(110) - 1000L) {
                        field5251[field5238++] = 1;
                        return;
                    }
                    class368.field5110 = true;
                    class312 var245 = class353.method2245(class87.field971, class291.field4253, (byte) 30);
                    var245.field4445.method2959(class225.field3469, (byte) 110);
                    class208.method1440(var245, 109);
                    field5251[field5238++] = 0;
                    return;
                }
                field5251[field5238++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class204 var246 = class225.method1536((byte) 123);
                if (var246 != null) {
                    field5251[field5238++] = var246.field3170;
                    field5251[field5238++] = var246.field7399;
                    field5244[field5233++] = var246.field3166;
                    class261 var247 = var246.method1426(-60);
                    field5251[field5238++] = var247.field3835;
                    field5244[field5233++] = var247.field3833;
                    field5251[field5238++] = var246.field7400;
                    field5251[field5238++] = var246.field3173;
                    field5244[field5233++] = var246.field3169;
                    return;
                }
                field5251[field5238++] = -1;
                field5251[field5238++] = 0;
                field5244[field5233++] = "";
                field5251[field5238++] = 0;
                field5244[field5233++] = "";
                field5251[field5238++] = 0;
                field5251[field5238++] = 0;
                field5244[field5233++] = "";
                return;
            }
            if (arg0 == 6502) {
                class204 var248 = class467.method2790((byte) 121);
                if (var248 != null) {
                    field5251[field5238++] = var248.field3170;
                    field5251[field5238++] = var248.field7399;
                    field5244[field5233++] = var248.field3166;
                    class261 var249 = var248.method1426(-127);
                    field5251[field5238++] = var249.field3835;
                    field5244[field5233++] = var249.field3833;
                    field5251[field5238++] = var248.field7400;
                    field5251[field5238++] = var248.field3173;
                    field5244[field5233++] = var248.field3169;
                    return;
                }
                field5251[field5238++] = -1;
                field5251[field5238++] = 0;
                field5244[field5233++] = "";
                field5251[field5238++] = 0;
                field5244[field5233++] = "";
                field5251[field5238++] = 0;
                field5251[field5238++] = 0;
                field5244[field5233++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var250 = field5251[--field5238];
                String var251 = field5244[--field5233];
                if (class266.field3873 == 7 && !class140.method1013((byte) -53) && class339.field4745 == 0) {
                    field5251[field5238++] = class157.method1204(var250, var251, 50000) ? 1 : 0;
                    return;
                }
                field5251[field5238++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var252 = field5251[--field5238];
                class204 var253 = class577.method3390(2, var252);
                if (var253 != null) {
                    field5251[field5238++] = var253.field7399;
                    field5244[field5233++] = var253.field3166;
                    class261 var254 = var253.method1426(-66);
                    field5251[field5238++] = var254.field3835;
                    field5244[field5233++] = var254.field3833;
                    field5251[field5238++] = var253.field7400;
                    field5251[field5238++] = var253.field3173;
                    field5244[field5233++] = var253.field3169;
                    return;
                }
                field5251[field5238++] = -1;
                field5244[field5233++] = "";
                field5251[field5238++] = 0;
                field5244[field5233++] = "";
                field5251[field5238++] = 0;
                field5251[field5238++] = 0;
                field5244[field5233++] = "";
                return;
            }
            if (arg0 == 6507) {
                field5238 -= 4;
                int var255 = field5251[field5238];
                boolean var256 = field5251[field5238 + 1] == 1;
                int var257 = field5251[field5238 + 2];
                boolean var258 = field5251[field5238 + 3] == 1;
                class550.method3284(0, var258, var255, var256, var257);
                return;
            }
            if (arg0 == 6508) {
                class564.method3328(false);
                return;
            }
            if (arg0 == 6509) {
                if (class266.field3873 != 7) {
                    return;
                }
                class13.field255 = field5251[--field5238] == 1;
                return;
            }
            if (arg0 == 6510) {
                field5251[field5238++] = class425.field5804;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class723.field10013 == class589.field8303) {
                if (arg0 == 6700) {
                    int var259 = class11.field217.method2244(false);
                    if (class371.field5137 != -1) {
                        var259++;
                    }
                    field5251[field5238++] = var259;
                    return;
                }
                if (arg0 == 6701) {
                    int var260 = field5251[--field5238];
                    if (class371.field5137 != -1) {
                        if (var260 == 0) {
                            field5251[field5238++] = class371.field5137;
                            return;
                        }
                        var260--;
                    }
                    class744 var261 = (class744) class11.field217.method2243((byte) 100);
                    while (var260-- > 0) {
                        var261 = (class744) class11.field217.method2248(-15690);
                    }
                    field5251[field5238++] = var261.field10314;
                    return;
                }
                if (arg0 == 6702) {
                    int var262 = field5251[--field5238];
                    if (class787.field10812[var262] == null) {
                        field5244[field5233++] = "";
                        return;
                    }
                    String var263 = class787.field10812[var262][0].field6209;
                    if (var263 == null) {
                        field5244[field5233++] = "";
                        return;
                    }
                    field5244[field5233++] = var263.substring(0, var263.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var264 = field5251[--field5238];
                    if (class787.field10812[var264] == null) {
                        field5251[field5238++] = 0;
                        return;
                    }
                    field5251[field5238++] = class787.field10812[var264].length;
                    return;
                }
                if (arg0 == 6704) {
                    field5238 -= 2;
                    int var265 = field5251[field5238];
                    int var266 = field5251[field5238 + 1];
                    if (class787.field10812[var265] == null) {
                        field5244[field5233++] = "";
                        return;
                    }
                    String var267 = class787.field10812[var265][var266].field6209;
                    if (var267 == null) {
                        field5244[field5233++] = "";
                        return;
                    }
                    field5244[field5233++] = var267;
                    return;
                }
                if (arg0 == 6705) {
                    field5238 -= 2;
                    int var268 = field5251[field5238];
                    int var269 = field5251[field5238 + 1];
                    if (class787.field10812[var268] == null) {
                        field5251[field5238++] = 0;
                        return;
                    }
                    field5251[field5238++] = class787.field10812[var268][var269].field6311;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field5238 -= 3;
                    int var270 = field5251[field5238];
                    int var271 = field5251[field5238 + 1];
                    int var272 = field5251[field5238 + 2];
                    class179.method1287(var272, false, var270 << 16 | var271, 1, "");
                    return;
                }
                if (arg0 == 6708) {
                    field5238 -= 3;
                    int var273 = field5251[field5238];
                    int var274 = field5251[field5238 + 1];
                    int var275 = field5251[field5238 + 2];
                    class179.method1287(var275, false, var273 << 16 | var274, 2, "");
                    return;
                }
                if (arg0 == 6709) {
                    field5238 -= 3;
                    int var276 = field5251[field5238];
                    int var277 = field5251[field5238 + 1];
                    int var278 = field5251[field5238 + 2];
                    class179.method1287(var278, false, var276 << 16 | var277, 3, "");
                    return;
                }
                if (arg0 == 6710) {
                    field5238 -= 3;
                    int var279 = field5251[field5238];
                    int var280 = field5251[field5238 + 1];
                    int var281 = field5251[field5238 + 2];
                    class179.method1287(var281, false, var279 << 16 | var280, 4, "");
                    return;
                }
                if (arg0 == 6711) {
                    field5238 -= 3;
                    int var282 = field5251[field5238];
                    int var283 = field5251[field5238 + 1];
                    int var284 = field5251[field5238 + 2];
                    class179.method1287(var284, false, var282 << 16 | var283, 5, "");
                    return;
                }
                if (arg0 == 6712) {
                    field5238 -= 3;
                    int var285 = field5251[field5238];
                    int var286 = field5251[field5238 + 1];
                    int var287 = field5251[field5238 + 2];
                    class179.method1287(var287, false, var285 << 16 | var286, 6, "");
                    return;
                }
                if (arg0 == 6713) {
                    field5238 -= 3;
                    int var288 = field5251[field5238];
                    int var289 = field5251[field5238 + 1];
                    int var290 = field5251[field5238 + 2];
                    class179.method1287(var290, false, var288 << 16 | var289, 7, "");
                    return;
                }
                if (arg0 == 6714) {
                    field5238 -= 3;
                    int var291 = field5251[field5238];
                    int var292 = field5251[field5238 + 1];
                    int var293 = field5251[field5238 + 2];
                    class179.method1287(var293, false, var291 << 16 | var292, 8, "");
                    return;
                }
                if (arg0 == 6715) {
                    field5238 -= 3;
                    int var294 = field5251[field5238];
                    int var295 = field5251[field5238 + 1];
                    int var296 = field5251[field5238 + 2];
                    class179.method1287(var296, false, var294 << 16 | var295, 9, "");
                    return;
                }
                if (arg0 == 6716) {
                    field5238 -= 3;
                    int var297 = field5251[field5238];
                    int var298 = field5251[field5238 + 1];
                    int var299 = field5251[field5238 + 2];
                    class179.method1287(var299, false, var297 << 16 | var298, 10, "");
                    return;
                }
                if (arg0 == 6717) {
                    field5238 -= 3;
                    int var300 = field5251[field5238];
                    int var301 = field5251[field5238 + 1];
                    int var302 = field5251[field5238 + 2];
                    class451 var303 = class63.method422(var302, 17492, var300 << 16 | var301);
                    class337.method2136(-161);
                    class33 var304 = client.method2046(var303);
                    class262.method1701(0, var304.method267((byte) 114), var304.field442, var303);
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var305 = field5251[--field5238];
                    class413 var306 = class53.field669.method1231(78, var305);
                    if (var306.field5646 == null) {
                        field5244[field5233++] = "";
                        return;
                    }
                    field5244[field5233++] = var306.field5646;
                    return;
                }
                if (arg0 == 6801) {
                    int var307 = field5251[--field5238];
                    class413 var308 = class53.field669.method1231(120, var307);
                    field5251[field5238++] = var308.field5625;
                    return;
                }
                if (arg0 == 6802) {
                    int var309 = field5251[--field5238];
                    class413 var310 = class53.field669.method1231(64, var309);
                    field5251[field5238++] = var310.field5623;
                    return;
                }
                if (arg0 == 6803) {
                    int var311 = field5251[--field5238];
                    class413 var312 = class53.field669.method1231(124, var311);
                    field5251[field5238++] = var312.field5656;
                    return;
                }
                if (arg0 == 6804) {
                    field5238 -= 2;
                    int var313 = field5251[field5238];
                    int var314 = field5251[field5238 + 1];
                    class645 var315 = class184.field2832.method4117((byte) 49, var314);
                    if (var315.method3701((byte) 61)) {
                        field5244[field5233++] = class53.field669.method1231(118, var313).method2508((byte) 109, var314, var315.field9012);
                        return;
                    }
                    field5251[field5238++] = class53.field669.method1231(76, var313).method2499(-7, var314, var315.field9011);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field5251[field5238++] = class404.field5525 && !class34.field466 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field5251[field5238++] = (int) (class411.field5573 / 60000L);
                    field5251[field5238++] = (int) ((class411.field5573 - class459.method2731(124) - class588.field8295) / 60000L);
                    field5251[field5238++] = class243.field3620 ? 1 : 0;
                    return;
                }
                if (arg0 == 6902) {
                    field5251[field5238++] = class457.field6403;
                    return;
                }
                if (arg0 == 6903) {
                    field5251[field5238++] = class190.field2944;
                    return;
                }
                if (arg0 == 6904) {
                    field5251[field5238++] = class86.field949;
                    return;
                }
                if (arg0 == 6905) {
                    String var316 = "";
                    if (class348.field4877 != null) {
                        if (class348.field4877.field2092 == null) {
                            var316 = class215.method1476(569, class348.field4877.field2087);
                        } else {
                            var316 = (String) class348.field4877.field2092;
                        }
                    }
                    field5244[field5233++] = var316;
                    return;
                }
                if (arg0 == 6906) {
                    field5251[field5238++] = class633.field8890;
                    return;
                }
                if (arg0 == 6907) {
                    field5251[field5238++] = class597.field8402;
                    return;
                }
                if (arg0 == 6908) {
                    field5251[field5238++] = class772.field10607;
                    return;
                }
                if (arg0 == 6909) {
                    field5251[field5238++] = class342.field4764 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field5251[field5238++] = class725.field10027;
                    return;
                }
                if (arg0 == 6911) {
                    field5251[field5238++] = class173.field2689;
                    return;
                }
                if (arg0 == 6912) {
                    field5251[field5238++] = class58.field733;
                    return;
                }
                if (arg0 == 6913) {
                    field5251[field5238++] = class558.field7943;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var317 = class745.method4156((byte) 115);
                    field5251[field5238++] = class607.field8500 = class21.field353.field10098.method1588(-105);
                    field5251[field5238++] = var317;
                    class13.method139(true);
                    class580.method3397((byte) 13);
                    class768.field10567 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class563.method3322((byte) 40);
                    class13.method139(true);
                    class580.method3397((byte) 13);
                    class768.field10567 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class424.method2567(0);
                    class13.method139(true);
                    class580.method3397((byte) 13);
                    class768.field10567 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class474.method2821(127);
                    class13.method139(true);
                    class580.method3397((byte) 13);
                    class768.field10567 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class142.method1016(104, true);
                    class13.method139(true);
                    class580.method3397((byte) 13);
                    class768.field10567 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class21.field353.method4080(true, class21.field353.field10088, 0);
                    class580.method3397((byte) 13);
                    class768.field10567 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class607.field8500 == 2) {
                        class367.field5101 = true;
                        return;
                    }
                    if (class607.field8500 == 1) {
                        class690.field9654 = true;
                        return;
                    }
                    if (class607.field8500 == 3) {
                        class784.field10767 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field5251[field5238++] = class21.field353.field10088.method1292(-125);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field5238 -= 2;
                    int var318 = field5251[field5238];
                    int var319 = field5251[field5238 + 1];
                    if (var318 != -1) {
                        if (var319 > 255) {
                            var319 = 255;
                        } else if (var319 < 0) {
                            var319 = 0;
                        }
                        class314.method2014(var318, var319, 25260, false);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var320 = field5251[--field5238];
                    if (var320 != -1) {
                        class13.method140(-257, var320);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var321 = field5251[--field5238];
                    if (var321 != -1) {
                        class296.method1925(var321, (byte) -11);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field5251[field5238++] = class54.method383("jagtheora", (byte) 43) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field5251[field5238++] = class21.field353.field10067.method3319(79) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field5251[field5238++] = class21.field353.field10069.method1228(117) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field5251[field5238++] = class21.field353.field10062.method4002(75) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field5251[field5238++] = class21.field353.field10072.method698(97) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field5251[field5238++] = class21.field353.field10096.method1628(80) && class37.field491.method492() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field5251[field5238++] = class21.field353.field10102.method4118(94) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field5251[field5238++] = class21.field353.field10100.method1658(120) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field5251[field5238++] = class21.field353.field10090.method2429(105) && class37.field491.method534() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field5251[field5238++] = class21.field353.field10089.method125(92) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field5251[field5238++] = class21.field353.field10057.method1026(103) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field5251[field5238++] = class21.field353.field10087.method3754(83) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field5251[field5238++] = class21.field353.field10091.method1431(81) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field5251[field5238++] = class21.field353.field10082.method4068(90) ? 1 : 0;
                    return;
                }
                if (arg0 == 7214) {
                    field5251[field5238++] = class21.field353.field10076.method1592(127) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var322 = field5251[--field5238];
                    field5251[field5238++] = class21.field353.field10067.method129(-1, var322);
                    return;
                }
                if (arg0 == 7302) {
                    int var323 = field5251[--field5238];
                    field5251[field5238++] = class21.field353.field10069.method129(-1, var323);
                    return;
                }
                if (arg0 == 7303) {
                    int var324 = field5251[--field5238];
                    field5251[field5238++] = class21.field353.field10062.method129(-1, var324);
                    return;
                }
                if (arg0 == 7304) {
                    int var325 = field5251[--field5238];
                    field5251[field5238++] = class21.field353.field10072.method129(-1, var325);
                    return;
                }
                if (arg0 == 7305) {
                    int var326 = field5251[--field5238];
                    if (!class37.field491.method492()) {
                        field5251[field5238++] = 3;
                        return;
                    }
                    field5251[field5238++] = class21.field353.field10096.method129(-1, var326);
                    return;
                }
                if (arg0 == 7306) {
                    int var327 = field5251[--field5238];
                    field5251[field5238++] = class21.field353.field10102.method129(-1, var327);
                    return;
                }
                if (arg0 == 7307) {
                    int var328 = field5251[--field5238];
                    field5251[field5238++] = class21.field353.field10100.method129(-1, var328);
                    return;
                }
                if (arg0 == 7308) {
                    int var329 = field5251[--field5238];
                    if (!class37.field491.method534()) {
                        field5251[field5238++] = 3;
                        return;
                    }
                    field5251[field5238++] = class21.field353.field10090.method129(-1, var329);
                    return;
                }
                if (arg0 == 7309) {
                    int var330 = field5251[--field5238];
                    field5251[field5238++] = class21.field353.field10089.method129(-1, var330);
                    return;
                }
                if (arg0 == 7310) {
                    int var331 = field5251[--field5238];
                    field5251[field5238++] = class21.field353.field10057.method129(-1, var331);
                    return;
                }
                if (arg0 == 7311) {
                    int var332 = field5251[--field5238];
                    field5251[field5238++] = class21.field353.field10087.method129(-1, var332);
                    return;
                }
                if (arg0 == 7312) {
                    int var333 = field5251[--field5238];
                    field5251[field5238++] = class21.field353.field10091.method129(-1, var333);
                    return;
                }
                if (arg0 == 7313) {
                    int var334 = field5251[--field5238];
                    field5251[field5238++] = class21.field353.field10082.method129(-1, var334);
                    return;
                }
                if (arg0 == 7314) {
                    int var335 = field5251[--field5238];
                    field5251[field5238++] = class21.field353.field10076.method129(-1, var335);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lfi;I)V")
    private static final void method2348(class581 arg0, int arg1) {
        field5238 = 0;
        field5233 = 0;
        int var2 = -1;
        int[] var3 = arg0.field8214;
        int[] var4 = arg0.field8198;
        byte var5 = -1;
        field5246 = 0;
        try {
            int var6 = 0;
            label333: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var45 = var3[var2];
                if (var45 >= 150) {
                    boolean var37;
                    if (var4[var2] == 1) {
                        var37 = true;
                    } else {
                        var37 = false;
                    }
                    if (var45 >= 150 && var45 < 5000) {
                        method2346(var45, var37);
                    } else if (var45 >= 5000 && var45 < 10000) {
                        method2347(var45, var37);
                    } else {
                        throw new IllegalStateException("Command: " + var45);
                    }
                } else if (var45 == 0) {
                    field5251[field5238++] = var4[var2];
                } else if (var45 == 1) {
                    int var7 = var4[var2];
                    field5251[field5238++] = class537.field7727.field10294[var7];
                } else if (var45 == 2) {
                    int var8 = var4[var2];
                    class537.field7727.method4141((byte) 101, field5251[--field5238], var8);
                } else if (var45 == 3) {
                    field5244[field5233++] = arg0.field8205[var2];
                } else if (var45 == 6) {
                    var2 += var4[var2];
                } else if (var45 == 7) {
                    field5238 -= 2;
                    if (field5251[field5238 + 1] != field5251[field5238]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 8) {
                    field5238 -= 2;
                    if (field5251[field5238 + 1] == field5251[field5238]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 9) {
                    field5238 -= 2;
                    if (field5251[field5238] < field5251[field5238 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 10) {
                    field5238 -= 2;
                    if (field5251[field5238] > field5251[field5238 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 21) {
                    if (field5246 == 0) {
                        return;
                    }
                    class483 var9 = field5250[--field5246];
                    arg0 = var9.field6805;
                    var3 = arg0.field8214;
                    var4 = arg0.field8198;
                    var2 = var9.field6807;
                    field5252 = var9.field6808;
                    field5229 = var9.field6803;
                    field5231 = var9.field6804;
                } else if (var45 == 25) {
                    int var10 = var4[var2];
                    field5251[field5238++] = class537.field7727.method4135(var10, (byte) -120);
                } else if (var45 == 27) {
                    int var11 = var4[var2];
                    class537.field7727.method4139(field5251[--field5238], true, var11);
                } else if (var45 == 31) {
                    field5238 -= 2;
                    if (field5251[field5238] <= field5251[field5238 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 32) {
                    field5238 -= 2;
                    if (field5251[field5238] >= field5251[field5238 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 33) {
                    field5251[field5238++] = field5252[var4[var2]];
                } else if (var45 == 34) {
                    field5252[var4[var2]] = field5251[--field5238];
                } else if (var45 == 35) {
                    field5244[field5233++] = field5229[var4[var2]];
                } else if (var45 == 36) {
                    field5229[var4[var2]] = field5244[--field5233];
                } else if (var45 == 37) {
                    int var12 = var4[var2];
                    field5233 -= var12;
                    String var13 = class27.method243((byte) -10, var12, field5233, field5244);
                    field5244[field5233++] = var13;
                } else if (var45 == 38) {
                    field5238--;
                } else if (var45 == 39) {
                    field5233--;
                } else if (var45 == 40) {
                    int var14 = var4[var2];
                    class581 var15 = class149.method1036(var14, (byte) 119);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field8207];
                    String[] var17 = new String[var15.field8201];
                    long[] var18 = new long[var15.field8206];
                    for (int var19 = 0; var19 < var15.field8199; var19++) {
                        var16[var19] = field5251[field5238 + var19 - var15.field8199];
                    }
                    for (int var20 = 0; var20 < var15.field8212; var20++) {
                        var17[var20] = field5244[field5233 + var20 - var15.field8212];
                    }
                    for (int var21 = 0; var21 < var15.field8202; var21++) {
                        var18[var21] = field5243[field5240 + var21 - var15.field8202];
                    }
                    field5238 -= var15.field8199;
                    field5233 -= var15.field8212;
                    field5240 -= var15.field8202;
                    class483 var22 = new class483();
                    var22.field6805 = arg0;
                    var22.field6807 = var2;
                    var22.field6808 = field5252;
                    var22.field6803 = field5229;
                    var22.field6804 = field5231;
                    if (field5246 >= field5250.length) {
                        throw new RuntimeException();
                    }
                    field5250[field5246++] = var22;
                    arg0 = var15;
                    var3 = var15.field8214;
                    var4 = var15.field8198;
                    var2 = -1;
                    field5252 = var16;
                    field5229 = var17;
                    field5231 = var18;
                } else if (var45 == 42) {
                    field5251[field5238++] = class672.field9369[var4[var2]];
                } else if (var45 == 43) {
                    int var23 = var4[var2];
                    class672.field9369[var23] = field5251[--field5238];
                    class519.method3128(-13077, var23);
                    class274.field3955 |= class433.field5868[var23];
                } else if (var45 == 44) {
                    int var24 = var4[var2] >> 16;
                    int var25 = var4[var2] & 0xFFFF;
                    int var26 = field5251[--field5238];
                    if (var26 >= 0 && var26 <= 5000) {
                        field5245[var24] = var26;
                        byte var27 = -1;
                        if (var25 == 105) {
                            var27 = 0;
                        }
                        int var28 = 0;
                        while (true) {
                            if (var28 >= var26) {
                                continue label333;
                            }
                            field5254[var24][var28] = var27;
                            var28++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var45 == 45) {
                    int var29 = var4[var2];
                    int var30 = field5251[--field5238];
                    if (var30 < 0 || var30 >= field5245[var29]) {
                        throw new RuntimeException();
                    }
                    field5251[field5238++] = field5254[var29][var30];
                } else if (var45 == 46) {
                    int var31 = var4[var2];
                    field5238 -= 2;
                    int var32 = field5251[field5238];
                    if (var32 < 0 || var32 >= field5245[var31]) {
                        throw new RuntimeException();
                    }
                    field5254[var31][var32] = field5251[field5238 + 1];
                } else if (var45 == 47) {
                    String var33 = class635.field8916[var4[var2]];
                    if (var33 == null) {
                        var33 = "null";
                    }
                    field5244[field5233++] = var33;
                } else if (var45 == 48) {
                    int var34 = var4[var2];
                    class635.field8916[var34] = field5244[--field5233];
                    class458.method2728((byte) 110, var34);
                } else if (var45 == 51) {
                    class353 var35 = arg0.field8209[var4[var2]];
                    class489 var36 = (class489) var35.method2242((long) field5251[--field5238], -1);
                    if (var36 != null) {
                        var2 += var36.field6926;
                    }
                } else if (var45 == 54) {
                    field5243[field5240++] = arg0.field8203[var2];
                } else if (var45 == 55) {
                    field5240--;
                } else if (var45 == 66) {
                    field5243[field5240++] = field5231[var4[var2]];
                } else if (var45 == 67) {
                    field5231[var4[var2]] = field5243[--field5240];
                } else if (var45 == 68) {
                    field5240 -= 2;
                    if (field5243[field5240 + 1] != field5243[field5240]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 69) {
                    field5240 -= 2;
                    if (field5243[field5240 + 1] == field5243[field5240]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 70) {
                    field5240 -= 2;
                    if (field5243[field5240] < field5243[field5240 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 71) {
                    field5240 -= 2;
                    if (field5243[field5240] > field5243[field5240 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 72) {
                    field5240 -= 2;
                    if (field5243[field5240] <= field5243[field5240 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 73) {
                    field5240 -= 2;
                    if (field5243[field5240] >= field5243[field5240 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 86) {
                    if (field5251[--field5238] == 1) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 87) {
                    if (field5251[--field5238] == 0) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 112) {
                    field5251[field5238++] = method2359(var4[var2]);
                } else if (var45 == 113) {
                    field5251[field5238++] = method2358(var4[var2]);
                } else if (var45 == 114) {
                    field5243[field5240++] = method2350(var4[var2]);
                } else if (var45 == 115) {
                    field5244[field5233++] = method2354(var4[var2]);
                }
            }
        } catch (Exception var44) {
            if (arg0.field8215 == null) {
                StringBuffer var42 = new StringBuffer(30);
                var42.append("CS2: ").append(arg0.field8133).append(" ");
                for (int var43 = field5246 - 1; var43 >= 0; var43--) {
                    var42.append("v: ").append(field5250[var43].field6805.field8133).append(" ");
                }
                var42.append("op: ").append(var5);
                class678.method3848(var42.toString(), var44, false);
            } else {
                class227.method1550((byte) -67, 4, "Clientscript error in: " + arg0.field8215);
                StringBuffer var39 = new StringBuffer(30);
                var39.append("Clientscript error in: ").append(arg0.field8215).append("\n");
                for (int var40 = field5246 - 1; var40 >= 0; var40--) {
                    var39.append("via: ").append(field5250[var40].field6805.field8215).append("\n");
                }
                var39.append("Op: ").append(var5).append("\n");
                String var41 = var44.getMessage();
                if (var41 != null && var41.length() > 0) {
                    var39.append("Message: ").append(var41).append("\n");
                }
                class678.method3848(var39.toString(), var44, false);
                class587.method3423(var39.toString(), -121);
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lwea;)V")
    public static final void method2349(class166 arg0) {
        method2353(arg0, 200000);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)J")
    private static final long method2350(int arg0) {
        Long var1 = field5247.method1803(class60.field734.field3718 << 16 | arg0, -119);
        return var1 == null ? -1L : var1;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
    private static final void method2351(int arg0) {
        class451 var1 = class166.method1238((byte) -31, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class451[] var3 = class254.field3741[var2];
        if (var3 == null) {
            class451[] var4 = class787.field10812[var2];
            int var5 = var4.length;
            var3 = class254.field3741[var2] = new class451[var5];
            class595.method3472(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class595.method3472(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lpha;II)V")
    public static final void method2352(class174 arg0, int arg1, int arg2) {
        class581 var3 = class133.method983(arg2, arg0, -110, arg1);
        if (var3 == null) {
            return;
        }
        field5252 = new int[var3.field8207];
        field5229 = new String[var3.field8201];
        if (class502.field7115 == var3.field8211 || class710.field9864 == var3.field8211 || class217.field3365 == var3.field8211) {
            int var4 = 0;
            int var5 = 0;
            if (class120.field1850 != null) {
                var4 = class120.field1850.field6333;
                var5 = class120.field1850.field6242;
            }
            field5252[0] = class152.field2154.method2646(9) - var4;
            field5252[1] = class152.field2154.method2650((byte) -126) - var5;
        }
        method2348(var3, 200000);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lwea;I)V")
    private static final void method2353(class166 arg0, int arg1) {
        Object[] var2 = arg0.field2619;
        int var3 = (Integer) var2[0];
        class581 var4 = class149.method1036(var3, (byte) 114);
        if (var4 == null) {
            return;
        }
        field5252 = new int[var4.field8207];
        int var5 = 0;
        field5229 = new String[var4.field8201];
        int var6 = 0;
        field5231 = new long[var4.field8206];
        int var7 = 0;
        for (int var8 = 1; var8 < var2.length; var8++) {
            if (var2[var8] instanceof Integer) {
                int var9 = (Integer) var2[var8];
                if (var9 == -2147483647) {
                    var9 = arg0.field2614;
                }
                if (var9 == -2147483646) {
                    var9 = arg0.field2616;
                }
                if (var9 == -2147483645) {
                    var9 = arg0.field2627 == null ? -1 : arg0.field2627.field6222;
                }
                if (var9 == -2147483644) {
                    var9 = arg0.field2617;
                }
                if (var9 == -2147483643) {
                    var9 = arg0.field2627 == null ? -1 : arg0.field2627.field6246;
                }
                if (var9 == -2147483642) {
                    var9 = arg0.field2623 == null ? -1 : arg0.field2623.field6222;
                }
                if (var9 == -2147483641) {
                    var9 = arg0.field2623 == null ? -1 : arg0.field2623.field6246;
                }
                if (var9 == -2147483640) {
                    var9 = arg0.field2620;
                }
                if (var9 == -2147483639) {
                    var9 = arg0.field2613;
                }
                field5252[var5++] = var9;
            } else if (var2[var8] instanceof String) {
                String var10 = (String) var2[var8];
                if (var10.equals("event_opbase")) {
                    var10 = arg0.field2628;
                }
                field5229[var6++] = var10;
            } else if (var2[var8] instanceof Long) {
                long var11 = (Long) var2[var8];
                field5231[var7++] = var11;
            }
        }
        field5255 = arg0.field2621;
        method2348(var4, arg1);
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)Ljava/lang/String;")
    private static final String method2354(int arg0) {
        String var1 = field5247.method1793(class60.field734.field3718 << 16 | arg0, -1);
        return var1 == null ? "" : var1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(C)I")
    private static final int method2355(char arg0) {
        return class144.method1023(-10520, arg0) ? 1 : 0;
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V")
    public static final void method2356(int arg0) {
        if (arg0 == -1 || !class217.method1490(arg0, -1)) {
            return;
        }
        class451[] var1 = class787.field10812[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class451 var3 = var1[var2];
            if (var3.field6269 != null) {
                class166 var4 = new class166();
                var4.field2627 = var3;
                var4.field2619 = var3.field6269;
                method2353(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(IZ)V")
    public static final void method2357(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)I")
    private static final int method2358(int arg0) {
        class546 var1 = class564.field7999.method2469(arg0, (byte) -45);
        if (var1 == null) {
            throw new RuntimeException("sr-c113");
        }
        Integer var2 = field5247.method1804(class60.field734.field3718 << 16 | var1.field7857, -95, var1.field7858, var1.field7854);
        return var2 == null ? 0 : var2;
    }

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)I")
    private static final int method2359(int arg0) {
        class546 var1 = class564.field7999.method2469(arg0, (byte) 60);
        if (var1 == null) {
            throw new RuntimeException("sr-c112");
        }
        Integer var2 = field5247.method1787(class60.field734.field3718 << 16 | arg0, 0);
        if (var2 == null) {
            return var1.field7853 == 'i' || var1.field7853 == '1' ? 0 : -1;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "()V")
    public static final void method2360() {
    }

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)V")
    private static final void method2361(int arg0) {
        class451 var1 = class166.method1238((byte) -32, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class451[] var3 = class254.field3741[var2];
        if (var3 == null) {
            class451[] var4 = class787.field10812[var2];
            int var5 = var4.length;
            var3 = class254.field3741[var2] = new class451[var5];
            class595.method3472(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class595.method3472(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }
}
