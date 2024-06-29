import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class171 extends class242 implements Runnable {

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "I")
    public int field2118 = -1;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "Z")
    private boolean field2112 = true;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "Lio;")
    private class692 field2119;

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "I")
    public static int field2122 = -1;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
    public static int field2121 = 0;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "[I")
    public static int[] field2117;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V")
    public static final void method1162(int arg0) {
        if (arg0 != -1) {
            method1162(97);
        }
        field2120++;
        for (class225 var1 = (class225) class21.field231.method2090(true); var1 != null; var1 = (class225) class21.field231.method2088(arg0 - 151)) {
            class46 var2 = var1.field2927;
            if (var2.field653) {
                var1.method2438((byte) 121);
                var2.method426((byte) -49);
            } else if (var2.field646 <= class424.field5503) {
                var2.method424(-119, class57.field767);
                if (var2.field653) {
                    var1.method2438((byte) 126);
                } else {
                    class587.method3203(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)V")
    public final void method1163(byte arg0) {
        (new Thread(this, "a")).start();
        if (arg0 != 78) {
            this.field2118 = -30;
        }
        field2113++;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V")
    public final void method1164(boolean arg0) {
        this.field2112 = arg0;
        field2115++;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZLdg;I)V")
    public static final void method1165(boolean arg0, class193 arg1, int arg2) {
        field2123++;
        if (class291.field3758 >= 400) {
            return;
        }
        if (class233.field3130 != arg1) {
            if (arg2 != 6) {
                method1165(false, null, 41);
            }
            String var9;
            if (arg1.field2471 == 0) {
                boolean var3 = true;
                if (class233.field3130.field2503 != -1 && arg1.field2503 != -1) {
                    int var4 = arg1.field2499 >= class233.field3130.field2499 ? arg1.field2499 : class233.field3130.field2499;
                    int var5 = arg1.field2503 <= class233.field3130.field2503 ? arg1.field2503 : class233.field3130.field2503;
                    int var6 = var4 * 10 / 100 + var5 + 5;
                    int var7 = class233.field3130.field2499 - arg1.field2499;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var6 < var7) {
                        var3 = false;
                    }
                }
                String var8 = class50.field699 == class153.field1947 ? class604.field8154.method3280((byte) -94, class144.field1890) : class604.field8152.method3280((byte) 75, class144.field1890);
                if (arg1.field2497 > arg1.field2499) {
                    var9 = arg1.method1270((byte) -116, true) + (var3 ? class25.method139(arg1.field2499, class233.field3130.field2499, 27371) : "<col=ffffff>") + " (" + var8 + arg1.field2499 + "+" + (arg1.field2497 - arg1.field2499) + ")";
                } else {
                    var9 = arg1.method1270((byte) -116, true) + (var3 ? class25.method139(arg1.field2499, class233.field3130.field2499, 27371) : "<col=ffffff>") + " (" + var8 + arg1.field2499 + ")";
                }
            } else if (arg1.field2471 == -1) {
                var9 = arg1.method1270((byte) -116, true);
            } else {
                var9 = arg1.method1270((byte) -116, true) + " (" + class604.field8153.method3280((byte) 80, class144.field1890) + arg1.field2471 + ")";
            }
            if (class499.field6560 && !arg0 && (class345.field4410 & 0x8) != 0) {
                class47.method433(0, class542.field7044 + " -> <col=ffffff>" + var9, (long) arg1.field2960, class295.field3842, 6, -1, false, class368.field4752, 0, true, (byte) 119);
                class218.field2859++;
            }
            if (arg0) {
                class47.method433(0, "", 0L, "<col=cccccc>" + var9, -1, 0, true, -1, 0, false, (byte) 119);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class428.field5544[var10] != null) {
                        short var12 = 0;
                        if (class245.field3273 == class153.field1947 && class428.field5544[var10].equalsIgnoreCase(class604.field8147.method3280((byte) -90, class144.field1890))) {
                            if (class233.field3130.field2499 < arg1.field2499) {
                                var12 = 2000;
                            }
                            if (class233.field3130.field2484 != 0 && arg1.field2484 != 0) {
                                if (class233.field3130.field2484 == arg1.field2484) {
                                    var12 = 2000;
                                } else {
                                    var12 = 0;
                                }
                            }
                        } else if (class652.field9069[var10]) {
                            var12 = 2000;
                        }
                        short var13 = (short) (class470.field6139[var10] + var12);
                        int var14 = class704.field9811[var10] == -1 ? class384.field4916 : class704.field9811[var10];
                        class681.field9386++;
                        class47.method433(0, "<col=ffffff>" + var9, (long) arg1.field2960, class428.field5544[var10], var13, -1, false, var14, 0, true, (byte) -28);
                    }
                }
            }
            if (!arg0) {
                for (class57 var11 = (class57) class658.field9176.method2090(true); var11 != null; var11 = (class57) class658.field9176.method2088(-152)) {
                    if (var11.field776 == 30) {
                        var11.field770 = "<col=ffffff>" + var9;
                        return;
                    }
                }
            }
        } else if (class499.field6560 && (class345.field4410 & 0x10) != 0) {
            class475.field6183++;
            class47.method433(0, class542.field7044 + " -> <col=ffffff>" + class604.field8161.method3280((byte) 100, class144.field1890), 0L, class295.field3842, 17, -1, false, class368.field4752, 0, true, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)V")
    public static void method1166(int arg0) {
        field2117 = null;
        if (arg0 != -90802751) {
            method1162(-54);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIII)I")
    public static final int method1167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2116++;
        int var5 = 65536 - class237.field3196[arg3 * 8192 / arg0] >> 1;
        if (arg4 != 6) {
            method1167(-10, -105, 89, -110, -62);
        }
        return ((65536 - var5) * arg2 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1168(String arg0, int arg1) {
        field2114++;
        if (class265.field3540 == null) {
            return;
        }
        class532.field6928++;
        if (arg1 < -84) {
            class11 var2 = class130.method931(class649.field9035, (byte) 54, class80.field1102);
            var2.field114.method2352(true, class367.method2111(2, arg0));
            var2.field114.method2374(arg0, -111);
            class100.method760(var2, -118);
        }
    }

    @OriginalMember(owner = "client!pq", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2112) {
            this.field2119.method3768(511122, this);
        }
        field2124++;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lio;)V")
    public class171(class692 arg0) {
        this.field2119 = arg0;
    }
}
