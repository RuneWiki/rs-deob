import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class210 {

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public int field3016 = -1;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public int field3015 = 0;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    private int field3017 = -1;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    private int field3021 = -1;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Z")
    public boolean field3008 = true;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "[Ljava/lang/String;")
    public String[] field3028 = new String[5];

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public int field3036 = -1;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "Z")
    public boolean field3038 = true;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public int field3030 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public int field3029 = -1;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public int field3031 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    private int field3034 = -1;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "Z")
    public boolean field3041 = false;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public int field3045 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public int field3042 = -1;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
    private int field3046 = -1;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "Z")
    public boolean field3049 = true;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public int field3040 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!db", name = "V", descriptor = "I")
    private int field3051 = -1;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Lvp;")
    public static class123 field3018 = new class123(5, 6);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    private int field3010;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    private int field3012;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    private int field3014;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public int field3019;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public int field3020;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public int field3023;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public int field3024;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    private int field3047;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "I")
    public int field3050;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Lgr;")
    public class297 field3005;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "Lcv;")
    private class398 field3033;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Ljava/lang/String;")
    public String field3011;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "Ljava/lang/String;")
    public String field3039;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "[I")
    public int[] field3035;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "[Z")
    public static boolean[] field3022;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lti;B)V")
    public final void method1394(class303 arg0, byte arg1) {
        if (arg1 > -88) {
            return;
        }
        field3007++;
        while (true) {
            int var3 = arg0.method1918((byte) 121);
            if (var3 == 0) {
                return;
            }
            this.method1406(118, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
    public static void method1395(boolean arg0) {
        field3018 = null;
        field3022 = null;
        if (!arg0) {
            field3022 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Lti;B)Ldf;")
    public static final class274 method1396(class303 arg0, byte arg1) {
        if (arg1 <= 45) {
            method1403(true);
        }
        field3025++;
        class274 var2 = new class274();
        var2.field3959 = arg0.method1868(0);
        var2.field3953 = class121.field1892.method1689(var2.field3959, (byte) -83);
        return var2;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Ltt;")
    public static final class60 method1397(int arg0) {
        if (arg0 != 4822) {
            return null;
        }
        field3037++;
        try {
            return (class60) Class.forName("te").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V")
    public static final void method1398(int arg0, int arg1, int arg2) {
        class114.method841(false, class379.field5656);
        class60.field1049++;
        field3006++;
        class86.field1436.method1878(48, arg0);
        if (arg1 < -103) {
            class86.field1436.method1875(arg2, (byte) -91);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(III)I")
    public final int method1399(int arg0, int arg1, int arg2) {
        field3013++;
        if (this.field3033 == null) {
            return arg2;
        }
        class242 var4 = (class242) this.field3033.method2485(40, (long) arg1);
        if (var4 == null) {
            return arg2;
        } else {
            if (arg0 != -65536) {
                this.method1405(null, 115, -14);
            }
            return var4.field3509;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BB)V")
    public static final void method1400(byte arg0, byte arg1) {
        field3044++;
        if (arg0 != -107) {
            return;
        }
        if (class275.field3993 == null) {
            class275.field3993 = new byte[4][class237.field3436][class83.field1366];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class237.field3436; var3++) {
                for (int var4 = 0; var4 < class83.field1366; var4++) {
                    class275.field3993[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lav;I)Z")
    public final boolean method1401(class449 arg0, int arg1) {
        field3052++;
        int var3;
        if (this.field3046 == -1) {
            if (this.field3017 == -1) {
                return true;
            }
            var3 = arg0.method2708(true, this.field3017);
        } else {
            var3 = arg0.method2709(true, this.field3046);
        }
        if (var3 < this.field3014 || this.field3010 < var3) {
            return false;
        }
        boolean var4 = false;
        int var5;
        if (this.field3021 == -1) {
            if (this.field3051 == -1) {
                return true;
            }
            var5 = arg0.method2708(true, this.field3051);
        } else {
            var5 = arg0.method2709(true, this.field3021);
        }
        if (var5 >= this.field3012 && var5 <= this.field3047) {
            if (arg1 <= 61) {
                this.field3038 = false;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lqa;I)Lf;")
    public final class528 method1402(class162 arg0, int arg1) {
        int var3 = 125 / (arg1 / 62);
        field3032++;
        class528 var4 = (class528) this.field3005.field4251.method2339(-119, (long) (arg0.field2452 << 29 | 0x20000 | this.field3034));
        if (var4 != null) {
            return var4;
        }
        this.field3005.field4248.method682(0, this.field3034);
        class158 var5 = class158.method1134(this.field3005.field4248, this.field3034, 0);
        if (var5 != null) {
            var4 = arg0.method517(var5, true);
            this.field3005.field4251.method2342((long) (this.field3034 | 0x20000 | arg0.field2452 << 29), var4, 56);
        }
        return var4;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)I")
    public static final int method1403(boolean arg0) {
        field3026++;
        try {
            if (class169.field2541 == 0) {
                if (class303.field4343 > (class464.method2773((byte) 103) - 5000L)) {
                    return 0;
                }
                class226.field3306 = class112.field1785.method1962(1, class68.field1189, class310.field4445);
                class204.field2942 = class464.method2773((byte) 103);
                class169.field2541 = 1;
            }
            if ((class204.field2942 + 30000L) < class464.method2773((byte) 103)) {
                return class485.method2896(4, 1000);
            }
            if (class169.field2541 == 1) {
                if (class226.field3306.field1604 == 2) {
                    return class485.method2896(4, 1001);
                }
                if (class226.field3306.field1604 != 1) {
                    return -1;
                }
                class138.field2091 = new class85((Socket) class226.field3306.field1608, class112.field1785);
                class226.field3306 = null;
                int var1 = 0;
                class86.field1436.field4333 = 0;
                if (class324.field4977) {
                    var1 = class494.field7202;
                }
                class86.field1436.method1923((byte) 62, class224.field3256.field6584);
                class86.field1436.method1892(397825512, var1);
                class138.field2091.method695(class86.field1436.field4333, 0, class86.field1436.field4326, (byte) 113);
                class13.method125(-4);
                int var2 = class138.field2091.method697(0);
                class13.method125(-4);
                if (var2 != 0) {
                    return class485.method2896(4, var2);
                }
                class169.field2541 = 2;
            }
            if (class169.field2541 == 2) {
                if (class138.field2091.method693((byte) -119) < 2) {
                    return -1;
                }
                class314.field4488 = class138.field2091.method697(0);
                class314.field4488 <<= 0x8;
                class314.field4488 += class138.field2091.method697(0);
                class495.field7208 = new byte[class314.field4488];
                class169.field2541 = 3;
                class527.field7762 = 0;
            }
            if (arg0) {
                field3022 = null;
            }
            if (class169.field2541 != 3) {
                return -1;
            }
            int var3 = class138.field2091.method693((byte) -128);
            if (var3 < 1) {
                return -1;
            }
            if ((class314.field4488 - class527.field7762) < var3) {
                var3 = class314.field4488 - class527.field7762;
            }
            class138.field2091.method691(class527.field7762, class495.field7208, 125, var3);
            class527.field7762 += var3;
            if (class527.field7762 < class314.field4488) {
                return -1;
            } else if (class88.method722(-28282, class495.field7208)) {
                class291.field4170 = new class507[class14.field240];
                int var4 = 0;
                for (int var5 = class57.field827; var5 <= class244.field3529; var5++) {
                    class507 var6 = class379.method2406(var5, 0);
                    if (var6 != null) {
                        class291.field4170[var4++] = var6;
                    }
                }
                class6.field93 = 0;
                class127.field1931 = null;
                class138.field2091.method694(arg0);
                class138.field2091 = null;
                class495.field7208 = null;
                class169.field2541 = 0;
                class258.field3722 = 0;
                class303.field4343 = class464.method2773((byte) 103);
                return 0;
            } else {
                return class485.method2896(4, 1002);
            }
        } catch (IOException var7) {
            return class485.method2896(4, 1003);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lqa;IZ)Lf;")
    public final class528 method1404(class162 arg0, int arg1, boolean arg2) {
        field3004++;
        int var4 = arg2 ? this.field3036 : this.field3042;
        int var5 = var4 | arg0.field2452 << 29;
        class528 var6 = (class528) this.field3005.field4251.method2339(-83, (long) var5);
        if (var6 != null) {
            return var6;
        } else if (this.field3005.field4248.method682(arg1 ^ arg1, var4)) {
            class158 var7 = class158.method1134(this.field3005.field4248, var4, 0);
            if (var7 != null) {
                var6 = arg0.method517(var7, true);
                this.field3005.field4251.method2342((long) var5, var6, 26);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
    public final String method1405(String arg0, int arg1, int arg2) {
        field3043++;
        if (this.field3033 == null) {
            return arg0;
        }
        if (arg2 != 2) {
            this.field3046 = 114;
        }
        class411 var4 = (class411) this.field3033.method2485(103, (long) arg1);
        return var4 == null ? arg0 : var4.field6046;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILti;I)V")
    private final void method1406(int arg0, class303 arg1, int arg2) {
        field3048++;
        if (arg0 <= 87) {
            return;
        }
        if (arg2 == 1) {
            this.field3042 = arg1.method1868(0);
        } else if (arg2 == 2) {
            this.field3036 = arg1.method1868(0);
        } else if (arg2 == 3) {
            this.field3039 = arg1.method1879(30669);
        } else if (arg2 == 4) {
            this.field3020 = arg1.method1866(false);
        } else if (arg2 == 5) {
            this.field3029 = arg1.method1866(false);
        } else if (arg2 == 6) {
            this.field3015 = arg1.method1918((byte) -104);
        } else if (arg2 == 7) {
            int var4 = arg1.method1918((byte) 76);
            if ((var4 & 0x1) == 0) {
                this.field3008 = false;
            }
            if ((var4 & 0x2) == 2) {
                this.field3041 = true;
                return;
            }
        } else if (arg2 == 8) {
            this.field3038 = arg1.method1918((byte) 110) == 1;
        } else if (arg2 == 9) {
            this.field3017 = arg1.method1868(0);
            if (this.field3017 == 65535) {
                this.field3017 = -1;
            }
            this.field3046 = arg1.method1868(0);
            if (this.field3046 == 65535) {
                this.field3046 = -1;
            }
            this.field3014 = arg1.method1870(-1945262512);
            this.field3010 = arg1.method1870(-1945262512);
            return;
        } else if (arg2 < 10 || arg2 > 14) {
            if (arg2 != 15) {
                if (arg2 != 16) {
                    if (arg2 != 17) {
                        if (arg2 == 18) {
                            this.field3034 = arg1.method1868(0);
                        } else if (arg2 == 19) {
                            this.field3016 = arg1.method1868(0);
                            return;
                        } else if (arg2 == 20) {
                            this.field3051 = arg1.method1868(0);
                            if (this.field3051 == 65535) {
                                this.field3051 = -1;
                            }
                            this.field3021 = arg1.method1868(0);
                            if (this.field3021 == 65535) {
                                this.field3021 = -1;
                            }
                            this.field3012 = arg1.method1870(-1945262512);
                            this.field3047 = arg1.method1870(-1945262512);
                            return;
                        } else if (arg2 == 21) {
                            this.field3024 = arg1.method1870(-1945262512);
                            return;
                        } else if (arg2 == 22) {
                            this.field3053 = arg1.method1870(-1945262512);
                            return;
                        } else if (arg2 == 249) {
                            int var7 = arg1.method1918((byte) -55);
                            if (this.field3033 == null) {
                                int var8 = class159.method1146(false, var7);
                                this.field3033 = new class398(var8);
                            }
                            for (int var9 = 0; var9 < var7; var9++) {
                                boolean var10 = arg1.method1918((byte) 112) == 1;
                                int var11 = arg1.method1866(false);
                                class439 var12;
                                if (var10) {
                                    var12 = new class411(arg1.method1879(30669));
                                } else {
                                    var12 = new class242(arg1.method1870(-1945262512));
                                }
                                this.field3033.method2486(-123, var12, (long) var11);
                            }
                            return;
                        }
                        return;
                    }
                    this.field3011 = arg1.method1879(30669);
                    return;
                }
                this.field3049 = false;
                return;
            }
            int var5 = arg1.method1918((byte) 119);
            this.field3035 = new int[var5 * 2];
            for (int var6 = 0; var6 < var5 * 2; var6++) {
                this.field3035[var6] = arg1.method1901(121);
            }
            this.field3050 = arg1.method1870(-1945262512);
            this.field3019 = arg1.method1870(-1945262512);
            return;
        } else {
            this.field3028[arg2 - 10] = arg1.method1879(30669);
            return;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public final void method1407(int arg0) {
        if (this.field3035 != null) {
            for (int var2 = 0; var2 < this.field3035.length; var2 += 2) {
                if (this.field3035[var2] < this.field3040) {
                    this.field3040 = this.field3035[var2];
                } else if (this.field3045 < this.field3035[var2]) {
                    this.field3045 = this.field3035[var2];
                }
                if (this.field3035[var2 + 1] < this.field3031) {
                    this.field3031 = this.field3035[var2 + 1];
                } else if (this.field3035[var2 + 1] > this.field3030) {
                    this.field3030 = this.field3035[var2 + 1];
                }
            }
        }
        if (arg0 != 142) {
            this.field3042 = -97;
        }
        field3009++;
    }
}
