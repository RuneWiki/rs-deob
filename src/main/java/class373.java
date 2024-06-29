import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class373 extends class147 {

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "Ljava/lang/String;")
    public String field5332;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field5335 = new String[200];

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "Lsd;")
    public static class74 field5337;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lve;II)Z")
    public static final boolean method2253(class331 arg0, int arg1, int arg2) {
        field5336++;
        int var3 = arg0.method2017(-87, 2);
        if (var3 == 0) {
            if (arg0.method2017(arg2 ^ 0x580E, 1) != 0) {
                method2253(arg0, arg1, -22575);
            }
            int var4 = arg0.method2017(arg2 ^ 0x584D, 6);
            int var5 = arg0.method2017(-80, 6);
            boolean var6 = arg0.method2017(-22, 1) == 1;
            if (var6) {
                class450.field6373[class468.field6579++] = arg1;
            }
            if (class46.field596[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class198 var7 = class46.field596[arg1] = new class198();
            var7.field2457 = arg1;
            if (class360.field5176[arg1] != null) {
                var7.method1078(class360.field5176[arg1], true);
            }
            var7.method1015((byte) -8, class456.field6431[arg1]);
            var7.field2511 = class210.field2904[arg1];
            int var8 = class138.field1671[arg1];
            int var9 = var8 >> 28;
            int var10 = (var8 & 0x3FF3E1) >> 14;
            int var11 = var8 & 0xFF;
            var7.field2531[0] = class188.field2556[arg1];
            var7.field994 = (byte) var9;
            var7.method1082((var11 << 6) + var5 - class349.field5023, (var10 << 6) + -class93.field1163 + var4, (byte) -108);
            var7.field2720 = -1;
            return true;
        } else if (var3 == 1) {
            int var12 = arg0.method2017(arg2 + 22572, 2);
            int var13 = class138.field1671[arg1];
            class138.field1671[arg1] = class444.method2618((var13 >> 28) + var12 << 28, 805306368) + class444.method2618(var13, 268435455);
            return false;
        } else if (var3 == 2) {
            int var14 = arg0.method2017(-90, 5);
            int var15 = var14 >> 3;
            int var16 = var14 & 0x7;
            int var17 = class138.field1671[arg1];
            int var18 = (var17 >> 28) + var15 & 0x3;
            int var19 = (var17 & 0x3FF52E) >> 14;
            int var20 = var17 & 0xFF;
            if (var16 == 0) {
                var19--;
                var20--;
            }
            if (var16 == 1) {
                var20--;
            }
            if (var16 == 2) {
                var19++;
                var20--;
            }
            if (var16 == 3) {
                var19--;
            }
            if (var16 == 4) {
                var19++;
            }
            if (var16 == 5) {
                var19--;
                var20++;
            }
            if (var16 == 6) {
                var20++;
            }
            if (var16 == 7) {
                var19++;
                var20++;
            }
            class138.field1671[arg1] = (var18 << 28) + (var19 << 14) + var20;
            return false;
        } else if (arg2 == -22575) {
            int var21 = arg0.method2017(-19, 18);
            int var22 = var21 >> 16;
            int var23 = var21 >> 8 & 0xFF;
            int var24 = var21 & 0xFF;
            int var25 = class138.field1671[arg1];
            int var26 = (var25 >> 28) + var22 & 0x3;
            int var27 = (var25 >> 14) + var23 & 0xFF;
            int var28 = var24 + var25 & 0xFF;
            class138.field1671[arg1] = (var27 << 14) + ((var26 << 28) + var28);
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILgn;)V")
    public static final void method2254(int arg0, class187 arg1) {
        arg1.field2474 = false;
        field5333++;
        if (arg0 < 39) {
            return;
        }
        if (arg1.field2514 != -1) {
            class207 var2 = class175.field2103.method1267(-116, arg1.field2514);
            if (var2 == null || var2.field2853 == null) {
                arg1.field2497 = false;
                arg1.field2514 = -1;
            } else {
                label304: {
                    arg1.field2506++;
                    if (arg1.field2458 < var2.field2853.length && var2.field2843[arg1.field2458] < arg1.field2506) {
                        arg1.field2461++;
                        arg1.field2506 = 1;
                        arg1.field2458++;
                        class126.method602(var2, class19.field258 == arg1, arg1.field1008, arg1.field2458, arg1.field1005, false, arg1.field994);
                    }
                    if (arg1.field2458 >= var2.field2853.length) {
                        arg1.field2458 = 0;
                        arg1.field2506 = 0;
                        if (arg1.field2497) {
                            arg1.field2514 = arg1.method1018(-124).method2109(-28272);
                            if (arg1.field2514 == -1) {
                                arg1.field2497 = false;
                                break label304;
                            }
                            var2 = class175.field2103.method1267(-96, arg1.field2514);
                        }
                        class126.method602(var2, class19.field258 == arg1, arg1.field1008, arg1.field2458, arg1.field1005, false, arg1.field994);
                    }
                    arg1.field2461 = arg1.field2458 + 1;
                    if (var2.field2853.length <= arg1.field2461) {
                        arg1.field2461 = 0;
                    }
                }
            }
        }
        if (arg1.field2485 != -1 && arg1.field2477 <= class204.field2796) {
            class12 var3 = class234.field3258.method2456(arg1.field2485, 600);
            int var4 = var3.field178;
            if (var4 == -1) {
                arg1.field2485 = -1;
            } else {
                label306: {
                    class207 var5 = class175.field2103.method1267(-111, var4);
                    if (var3.field164) {
                        if (var5.field2839 == 3) {
                            if (arg1.field2537 > 0 && arg1.field2509 <= class204.field2796 && arg1.field2508 < class204.field2796) {
                                arg1.field2485 = -1;
                                break label306;
                            }
                        } else if (var5.field2839 == 1 && arg1.field2537 > 0 && arg1.field2509 <= class204.field2796 && class204.field2796 > arg1.field2508) {
                            arg1.field2477 = class204.field2796 + 1;
                            break label306;
                        }
                    }
                    if (var5 == null || var5.field2853 == null) {
                        arg1.field2485 = -1;
                    } else {
                        if (arg1.field2494 < 0) {
                            arg1.field2494 = 0;
                            class126.method602(var5, class19.field258 == arg1, arg1.field1008, 0, arg1.field1005, false, arg1.field994);
                        }
                        arg1.field2478++;
                        if (var5.field2853.length > arg1.field2494 && arg1.field2478 > var5.field2843[arg1.field2494]) {
                            arg1.field2478 = 1;
                            arg1.field2494++;
                            class126.method602(var5, class19.field258 == arg1, arg1.field1008, arg1.field2494, arg1.field1005, false, arg1.field994);
                        }
                        if (var5.field2853.length <= arg1.field2494) {
                            if (var3.field164) {
                                arg1.field2496++;
                                arg1.field2494 -= var5.field2864;
                                if (var5.field2857 <= arg1.field2496) {
                                    arg1.field2485 = -1;
                                } else if (arg1.field2494 >= 0 && arg1.field2494 < var5.field2853.length) {
                                    class126.method602(var5, class19.field258 == arg1, arg1.field1008, arg1.field2494, arg1.field1005, false, arg1.field994);
                                } else {
                                    arg1.field2485 = -1;
                                }
                            } else {
                                arg1.field2485 = -1;
                            }
                        }
                        arg1.field2447 = arg1.field2494 + 1;
                        if (arg1.field2447 >= var5.field2853.length) {
                            if (var3.field164) {
                                arg1.field2447 -= var5.field2864;
                                if ((arg1.field2496 + 1) >= var5.field2857) {
                                    arg1.field2447 = -1;
                                } else if (arg1.field2447 < 0 || var5.field2853.length <= arg1.field2447) {
                                    arg1.field2447 = -1;
                                }
                            } else {
                                arg1.field2447 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field2449 != -1 && arg1.field2495 <= 1) {
            class207 var6 = class175.field2103.method1267(-74, arg1.field2449);
            if (var6.field2839 == 3) {
                if (arg1.field2537 > 0 && class204.field2796 >= arg1.field2509 && arg1.field2508 < class204.field2796) {
                    arg1.field2449 = -1;
                }
            } else if (var6.field2839 == 1 && arg1.field2537 > 0 && class204.field2796 >= arg1.field2509 && arg1.field2508 < class204.field2796) {
                arg1.field2495 = 2;
            }
        }
        if (arg1.field2449 != -1 && arg1.field2495 == 0) {
            class207 var7 = class175.field2103.method1267(-96, arg1.field2449);
            if (var7 == null || var7.field2853 == null) {
                arg1.field2449 = -1;
            } else {
                arg1.field2450++;
                if (arg1.field2498 < var7.field2853.length && var7.field2843[arg1.field2498] < arg1.field2450) {
                    arg1.field2450 = 1;
                    arg1.field2498++;
                    class126.method602(var7, class19.field258 == arg1, arg1.field1008, arg1.field2498, arg1.field1005, false, arg1.field994);
                }
                if (var7.field2853.length <= arg1.field2498) {
                    arg1.field2498 -= var7.field2864;
                    arg1.field2507++;
                    if (arg1.field2507 >= var7.field2857) {
                        arg1.field2449 = -1;
                    } else if (arg1.field2498 >= 0 && var7.field2853.length > arg1.field2498) {
                        class126.method602(var7, class19.field258 == arg1, arg1.field1008, arg1.field2498, arg1.field1005, false, arg1.field994);
                    } else {
                        arg1.field2449 = -1;
                    }
                }
                arg1.field2518 = arg1.field2498 + 1;
                if (var7.field2853.length <= arg1.field2518) {
                    arg1.field2518 -= var7.field2864;
                    if (arg1.field2507 + 1 >= var7.field2857) {
                        arg1.field2518 = -1;
                    } else if (arg1.field2518 < 0 || arg1.field2518 >= var7.field2853.length) {
                        arg1.field2518 = -1;
                    }
                }
                arg1.field2474 = var7.field2856;
            }
        }
        if (arg1.field2495 > 0) {
            arg1.field2495--;
        }
        for (int var8 = 0; var8 < arg1.field2487.length; var8++) {
            class178 var9 = arg1.field2487[var8];
            if (var9 != null) {
                if (var9.field2148 > 0) {
                    var9.field2148--;
                } else {
                    class207 var10 = class175.field2103.method1267(-78, var9.field2143);
                    if (var10 == null || var10.field2853 == null) {
                        arg1.field2487[var8] = null;
                    } else {
                        var9.field2145++;
                        if (var9.field2147 < var10.field2853.length && var9.field2145 > var10.field2843[var9.field2147]) {
                            var9.field2147++;
                            var9.field2145 = 1;
                            class126.method602(var10, class19.field258 == arg1, arg1.field1008, var9.field2147, arg1.field1005, false, arg1.field994);
                        }
                        if (var10.field2853.length <= var9.field2147) {
                            var9.field2146++;
                            var9.field2147 -= var10.field2864;
                            if (var9.field2146 >= var10.field2857) {
                                arg1.field2487[var8] = null;
                            } else if (var9.field2147 >= 0 && var10.field2853.length > var9.field2147) {
                                class126.method602(var10, class19.field258 == arg1, arg1.field1008, var9.field2147, arg1.field1005, false, arg1.field994);
                            } else {
                                arg1.field2487[var8] = null;
                            }
                        }
                        var9.field2144 = var9.field2147 + 1;
                        if (var10.field2853.length <= var9.field2144) {
                            var9.field2144 -= var10.field2864;
                            if (var9.field2146 + 1 >= var10.field2857) {
                                var9.field2144 = -1;
                            } else if (var9.field2144 < 0 || var10.field2853.length <= var9.field2144) {
                                var9.field2144 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)V")
    public static final void method2255(int arg0, int arg1, int arg2) {
        class263 var3 = class293.field4356[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field3784 != null) {
            var3.field3784 = null;
        }
        if (var3.field3782 != null) {
            var3.field3782 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method2256(Throwable arg0, int arg1) throws IOException {
        field5334++;
        String var2;
        if ((arg0 instanceof class215)) {
            class215 var3 = (class215) arg0;
            var2 = var3.field2960 + " | ";
            arg0 = var3.field2959;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                if (arg1 != 40) {
                    method2254(-26, (class187) null);
                }
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
    public class373() {
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class373(String arg0) {
        this.field5332 = arg0;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
    public static void method2257(int arg0) {
        field5335 = null;
        if (arg0 == -1) {
            field5337 = null;
        }
    }

    static {
        new class40("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field5337 = new class74(104, 10);
    }
}
