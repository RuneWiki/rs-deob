import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class158 {

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "Lmj;")
    public class599 field2375 = null;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "Lta;")
    public class194 field2376 = null;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Ldd;")
    public static class647 field2374 = null;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)V", line = 3)
    public static final void method1093(int arg0, byte arg1) {
        field2373++;
        class679 var2 = class669.method3708(3, arg0, 1403048928);
        if (arg1 == -2) {
            var2.method3749(arg1 - 52);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[[[BIBII)V", line = 24)
    public static final void method1094(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class687.field9664++;
        class252.field3535 = 0;
        for (int var6 = class323.field4766; var6 < class552.field7467; var6++) {
            class486[][] var15 = class658.field9266[var6];
            for (int var16 = class380.field5354; var16 < class426.field5996; var16++) {
                for (int var17 = class661.field9284; var17 < class116.field1549; var17++) {
                    class486 var18 = var15[var16][var17];
                    if (var18 != null) {
                        if (class525.field7157[var16 + class614.field8507 - class532.field7247][var17 + class614.field8507 - class159.field2386] && arg1 == null || var6 < arg2 || arg1[var6][var16][var17] != arg3) {
                            var18.field6730 = true;
                            var18.field6742 = true;
                            if (var18.field6751 == null) {
                                var18.field6736 = false;
                            } else {
                                var18.field6736 = true;
                            }
                            class252.field3535++;
                        } else {
                            var18.field6730 = false;
                            var18.field6742 = false;
                            var18.field6735 = 0;
                            if (var16 >= class532.field7247 - 16 && var16 <= class532.field7247 + 16 && var17 >= class159.field2386 - 16 && var17 <= class159.field2386 + 16 && (var18.field6750 != null || var18.field6741 != null || var18.field6729 != null || var18.field6728 != null || var18.field6748 != null || var18.field6751 != null)) {
                                class220.field3196.method2424(false, var18);
                            }
                        }
                    }
                }
            }
        }
        for (int var7 = class323.field4766; var7 < class552.field7467; var7++) {
            if (class449.field6276.method385() && var7 >= arg2 && arg1 != null) {
                int var8 = class525.field7157.length;
                if (class525.field7157.length + class380.field5354 > class137.field1931) {
                    var8 -= class525.field7157.length + class380.field5354 - class137.field1931;
                }
                int var9 = class525.field7157[0].length;
                if (class525.field7157[0].length + class661.field9284 > class22.field308) {
                    var9 -= class525.field7157[0].length + class661.field9284 - class22.field308;
                }
                int var10 = class678.field9560;
                while (true) {
                    if (var10 >= var8) {
                        class220.field3196.method2422(-15856, var7, true, class144.field2149[var7]);
                        break;
                    }
                    int var11 = class380.field5354 + var10 - class678.field9560;
                    for (int var12 = class106.field1424; var12 < var9; var12++) {
                        class81.field1138[var10][var12] = false;
                        if (class525.field7157[var10][var12]) {
                            int var13 = class661.field9284 + var12 - class106.field1424;
                            for (int var14 = var7; var14 >= 0; var14--) {
                                if (class658.field9266[var14][var11][var13] != null && class658.field9266[var14][var11][var13].field6737 == var7) {
                                    class81.field1138[var10][var12] = class658.field9266[var14][var11][var13].field6730;
                                    break;
                                }
                            }
                        }
                    }
                    var10++;
                }
            } else {
                class220.field3196.method2422(-15856, var7, false, class144.field2149[var7]);
            }
            class220.field3196.method2421((byte) 120);
        }
        if (!class527.method2926(true)) {
            class527.method2926(false);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V", line = 158)
    public static void method1095(byte arg0) {
        if (arg0 >= -95) {
            field2374 = null;
        }
        field2374 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "()V", line = 169)
    public static final void method1096() {
        class411.field5807 = 0;
        label212: for (int var0 = 0; var0 < class160.field2390; var0++) {
            class205 var1 = class398.field5527[var0];
            if (class210.field3091 != null) {
                for (int var2 = 0; var2 < class210.field3091.length; var2++) {
                    if (class210.field3091[var2] != -1000000 && (var1.field3028 <= class210.field3091[var2] || var1.field3027 <= class210.field3091[var2]) && (var1.field3024 <= class516.field7043[var2] || var1.field3013 <= class516.field7043[var2]) && (var1.field3024 >= class245.field3497[var2] || var1.field3013 >= class245.field3497[var2]) && (var1.field3015 <= class25.field332[var2] || var1.field3016 <= class25.field332[var2]) && (var1.field3015 >= class638.field9066[var2] || var1.field3016 >= class638.field9066[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field3012 == 1) {
                int var3 = var1.field3019 + class614.field8507 - class532.field7247;
                if (var3 >= 0 && var3 <= class614.field8507 + class614.field8507) {
                    int var4 = var1.field3017 + class614.field8507 - class159.field2386;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class614.field8507 + class614.field8507) {
                        continue;
                    }
                    int var5 = var1.field3021 + class614.field8507 - class159.field2386;
                    if (var5 > class614.field8507 + class614.field8507) {
                        var5 = class614.field8507 + class614.field8507;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class525.field7157[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class7.field76 - var1.field3024;
                        if (var7 > class528.field7232) {
                            var1.field3011 = 1;
                        } else {
                            if (var7 >= -class528.field7232) {
                                continue;
                            }
                            var1.field3011 = 2;
                            var7 = -var7;
                        }
                        var1.field3018 = (var1.field3015 - class247.field3511 << 8) / var7;
                        var1.field3020 = (var1.field3016 - class247.field3511 << 8) / var7;
                        var1.field3029 = (var1.field3028 - class7.field59 << 8) / var7;
                        var1.field3025 = (var1.field3027 - class7.field59 << 8) / var7;
                        class261.field3713[class411.field5807++] = var1;
                    }
                }
            } else if (var1.field3012 == 2) {
                int var8 = var1.field3017 + class614.field8507 - class159.field2386;
                if (var8 >= 0 && var8 <= class614.field8507 + class614.field8507) {
                    int var9 = var1.field3019 + class614.field8507 - class532.field7247;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class614.field8507 + class614.field8507) {
                        continue;
                    }
                    int var10 = var1.field3008 + class614.field8507 - class532.field7247;
                    if (var10 > class614.field8507 + class614.field8507) {
                        var10 = class614.field8507 + class614.field8507;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class525.field7157[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class247.field3511 - var1.field3015;
                        if (var12 > class528.field7232) {
                            var1.field3011 = 3;
                        } else {
                            if (var12 >= -class528.field7232) {
                                continue;
                            }
                            var1.field3011 = 4;
                            var12 = -var12;
                        }
                        var1.field3009 = (var1.field3024 - class7.field76 << 8) / var12;
                        var1.field3030 = (var1.field3013 - class7.field76 << 8) / var12;
                        var1.field3029 = (var1.field3028 - class7.field59 << 8) / var12;
                        var1.field3025 = (var1.field3027 - class7.field59 << 8) / var12;
                        class261.field3713[class411.field5807++] = var1;
                    }
                }
            } else if (var1.field3012 == 4) {
                int var13 = var1.field3028 - class7.field59;
                if (var13 > class302.field4477) {
                    int var14 = var1.field3017 + class614.field8507 - class159.field2386;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class614.field8507 + class614.field8507) {
                        continue;
                    }
                    int var15 = var1.field3021 + class614.field8507 - class159.field2386;
                    if (var15 > class614.field8507 + class614.field8507) {
                        var15 = class614.field8507 + class614.field8507;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field3019 + class614.field8507 - class532.field7247;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class614.field8507 + class614.field8507) {
                        continue;
                    }
                    int var17 = var1.field3008 + class614.field8507 - class532.field7247;
                    if (var17 > class614.field8507 + class614.field8507) {
                        var17 = class614.field8507 + class614.field8507;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class525.field7157[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field3011 = 5;
                        var1.field3009 = (var1.field3024 - class7.field76 << 8) / var13;
                        var1.field3030 = (var1.field3013 - class7.field76 << 8) / var13;
                        var1.field3018 = (var1.field3015 - class247.field3511 << 8) / var13;
                        var1.field3020 = (var1.field3016 - class247.field3511 << 8) / var13;
                        class261.field3713[class411.field5807++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lta;)V", line = 501)
    public class158(class194 arg0) {
        this.field2376 = arg0;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lta;Lmj;)V", line = 509)
    public class158(class194 arg0, class599 arg1) {
        this.field2375 = arg1;
        this.field2376 = arg0;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ltt;IILjava/lang/String;)Loaa;", line = 424)
    public static final class260 method1097(class79 arg0, int arg1, int arg2, String arg3) {
        field2377++;
        if (arg2 == 0) {
            return arg0.method630(arg3, arg1 + 18);
        }
        if (arg1 != 3) {
            method1095((byte) 31);
        }
        if (arg2 == 1) {
            try {
                class2.method10(new Object[] { (new URL(class188.field2779.getCodeBase(), arg3)).toString() }, 21570, "openjs", class188.field2779);
                class260 var4 = new class260();
                var4.field3702 = 1;
                return var4;
            } catch (Throwable var10) {
                class260 var5 = new class260();
                var5.field3702 = 2;
                return var5;
            }
        } else if (arg2 == 2) {
            try {
                class188.field2779.getAppletContext().showDocument(new URL(class188.field2779.getCodeBase(), arg3), "_blank");
                class260 var6 = new class260();
                var6.field3702 = 1;
                return var6;
            } catch (Exception var11) {
                class260 var7 = new class260();
                var7.field3702 = 2;
                return var7;
            }
        } else if (arg2 == 3) {
            try {
                class2.method11("loggedout", class188.field2779, 21190);
            } catch (Throwable var13) {
            }
            try {
                class188.field2779.getAppletContext().showDocument(new URL(class188.field2779.getCodeBase(), arg3), "_top");
                class260 var8 = new class260();
                var8.field3702 = 1;
                return var8;
            } catch (Exception var12) {
                class260 var9 = new class260();
                var9.field3702 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
