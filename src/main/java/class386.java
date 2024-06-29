import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class386 extends RuntimeException {

    @OriginalMember(owner = "client!og", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field5827;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Ljava/lang/String;")
    public String field5834;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "Lbd;")
    public static class37 field5832 = new class37();

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field5835 = 0;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 3)
    public static void method2445(int arg0) {
        if (arg0 != 1) {
            method2448(false);
        }
        field5832 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIII)I", line = 16)
    public static final int method2446(int arg0, int arg1, int arg2, int arg3) {
        field5831++;
        int var4 = 255 - arg2;
        if (arg1 != -2240) {
            field5836 = 122;
        }
        int var5 = ((arg3 & 0xFF00FF) * arg2 & 0xFF00FF00 | (arg3 & 0xFF00) * arg2 & 0xFF0000) >>> 8;
        return (((arg0 & 0xFF00) * var4 & 0xFF0000 | (arg0 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BC)C", line = 32)
    public static final char method2447(byte arg0, char arg1) {
        field5828++;
        if (arg0 != 75) {
            field5832 = null;
        }
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V", line = 63)
    public static final void method2448(boolean arg0) {
        field5829++;
        if (class300.field4760 == 0 || class300.field4760 == 5) {
            return;
        }
        try {
            if (++class160.field2531 > 2000) {
                if (class421.field6216 != null) {
                    class421.field6216.method1098((byte) 103);
                    class421.field6216 = null;
                }
                if (class57.field715 >= 1) {
                    class300.field4760 = 0;
                    class357.field5463 = -5;
                    return;
                }
                if (class422.field6235 == class299.field4756) {
                    class299.field4756 = class196.field3170;
                } else {
                    class299.field4756 = class422.field6235;
                }
                class300.field4760 = 1;
                class160.field2531 = 0;
                class57.field715++;
            }
            if (!arg0) {
                method2447((byte) -60, '!');
            }
            if (class300.field4760 == 1) {
                class234.field3906 = class63.field822.method1894(0, class430.field6323, class299.field4756);
                class300.field4760 = 2;
            }
            if (class300.field4760 == 2) {
                if (class234.field3906.field304 == 2) {
                    throw new IOException();
                }
                if (class234.field3906.field304 != 1) {
                    return;
                }
                class421.field6216 = new class156((Socket) class234.field3906.field305, class63.field822);
                class234.field3906 = null;
                long var1 = class198.field3196 = class158.method1112(class336.field5222, (byte) -41);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class11.field139.field3044 = 0;
                class11.field139.method1312(14, -106);
                class11.field139.method1312(var3, -63);
                class421.field6216.method1101(class11.field139.field3066, 0, 2, 3);
                if (class441.field6457 != null) {
                    class441.field6457.method1546(2124);
                }
                if (class313.field4928 != null) {
                    class313.field4928.method1546(2124);
                }
                int var4 = class421.field6216.method1105(false);
                if (class441.field6457 != null) {
                    class441.field6457.method1546(2124);
                }
                if (class313.field4928 != null) {
                    class313.field4928.method1546(2124);
                }
                if (var4 != 0) {
                    class300.field4760 = 0;
                    class357.field5463 = var4;
                    class421.field6216.method1098((byte) 77);
                    class421.field6216 = null;
                    return;
                }
                class300.field4760 = 3;
            }
            if (class300.field4760 == 3) {
                if (class421.field6216.method1102(30000) < 8) {
                    return;
                }
                class421.field6216.method1103(0, class158.field2514.field3066, 8, 0);
                class158.field2514.field3044 = 0;
                class430.field6328 = class158.field2514.method1290(!arg0);
                int[] var5 = new int[4];
                class11.field139.field3044 = 0;
                var5[2] = (int) (class430.field6328 >> 32);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class430.field6328;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class11.field139.method1312(10, -109);
                class11.field139.method1315(var5[0], (byte) 116);
                class11.field139.method1315(var5[1], (byte) 70);
                class11.field139.method1315(var5[2], (byte) 107);
                class11.field139.method1315(var5[3], (byte) 75);
                class11.field139.method1318(0, class158.method1112(class336.field5222, (byte) -87));
                class11.field139.method1301(class232.field3852, 116);
                class11.field139.method1308((byte) -101, class336.field5223, class325.field5095);
                class450.field6550.field3044 = 0;
                if (class262.field4219 == 40) {
                    class450.field6550.method1312(18, -122);
                } else {
                    class450.field6550.method1312(16, -55);
                }
                class450.field6550.method1283(8, class11.field139.field3044 + class317.method2110(true, class341.field5264) + 161);
                class450.field6550.method1315(564, (byte) 116);
                class450.field6550.method1312(class70.field866, -54);
                class450.field6550.method1312(class199.method1386((byte) 102), -91);
                class450.field6550.method1283(8, class369.field5615);
                class450.field6550.method1283(8, class430.field6324);
                class450.field6550.method1312(class418.field6198, -103);
                class27.method179(class450.field6550, -124);
                class450.field6550.method1301(class341.field5264, 104);
                class450.field6550.method1315(class173.field2882, (byte) 75);
                class450.field6550.method1315(class11.method104((byte) 88), (byte) 55);
                class444.field6477 = true;
                class450.field6550.method1283(8, class160.field2530);
                class450.field6550.method1315(class79.field998.method2777(-9), (byte) 87);
                class450.field6550.method1315(class199.field3218.method2777(-9), (byte) 34);
                class450.field6550.method1315(class220.field3636.method2777(-9), (byte) 66);
                class450.field6550.method1315(class110.field1525.method2777(-9), (byte) 71);
                class450.field6550.method1315(class236.field3950.method2777(-9), (byte) 107);
                class450.field6550.method1315(class212.field3401.method2777(-9), (byte) 20);
                class450.field6550.method1315(class125.field1930.method2777(-9), (byte) 52);
                class450.field6550.method1315(class267.field4293.method2777(-9), (byte) 16);
                class450.field6550.method1315(class223.field3727.method2777(-9), (byte) 62);
                class450.field6550.method1315(class262.field4205.method2777(-9), (byte) 85);
                class450.field6550.method1315(class391.field5875.method2777(-9), (byte) 24);
                class450.field6550.method1315(class282.field4531.method2777(-9), (byte) 75);
                class450.field6550.method1315(class377.field5700.method2777(-9), (byte) 67);
                class450.field6550.method1315(class33.field407.method2777(-9), (byte) 78);
                class450.field6550.method1315(class156.field2460.method2777(-9), (byte) 123);
                class450.field6550.method1315(class127.field1990.method2777(-9), (byte) 126);
                class450.field6550.method1315(class132.field2058.method2777(-9), (byte) 47);
                class450.field6550.method1315(class150.field2335.method2777(-9), (byte) 27);
                class450.field6550.method1315(class412.field6103.method2777(-9), (byte) 61);
                class450.field6550.method1315(class56.field698.method2777(-9), (byte) 126);
                class450.field6550.method1315(class321.field5002.method2777(-9), (byte) 35);
                class450.field6550.method1315(class27.field309.method2777(-9), (byte) 59);
                class450.field6550.method1315(class300.field4759.method2777(-9), (byte) 35);
                class450.field6550.method1315(class311.field4900.method2777(-9), (byte) 42);
                class450.field6550.method1315(class447.field6512.method2777(-9), (byte) 115);
                class450.field6550.method1315(class430.field6326.method2777(-9), (byte) 127);
                class450.field6550.method1315(class47.field590.method2777(-9), (byte) 116);
                class450.field6550.method1315(class342.field5277.method2777(-9), (byte) 122);
                class450.field6550.method1315(class256.field4160.method2777(-9), (byte) 119);
                class450.field6550.method1269(!arg0, 0, class11.field139.field3066, class11.field139.field3044);
                class421.field6216.method1101(class450.field6550.field3066, 0, class450.field6550.field3044, 3);
                class11.field139.method2231(var5, (byte) 16);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class158.field2514.method2231(var5, (byte) 16);
                class300.field4760 = 4;
            }
            if (class300.field4760 == 4) {
                if (class421.field6216.method1102(30000) < 1) {
                    return;
                }
                int var7 = class421.field6216.method1105(false);
                if (var7 == 21) {
                    class300.field4760 = 7;
                } else if (var7 == 29) {
                    class300.field4760 = 10;
                } else if (var7 == 1) {
                    class300.field4760 = 5;
                    class357.field5463 = var7;
                    return;
                } else if (var7 == 2) {
                    class300.field4760 = 8;
                } else if (var7 == 15) {
                    class300.field4760 = 0;
                    class357.field5463 = var7;
                    return;
                } else if (var7 == 23 && class57.field715 < 1) {
                    class160.field2531 = 0;
                    class300.field4760 = 1;
                    class57.field715++;
                    class421.field6216.method1098((byte) 88);
                    class421.field6216 = null;
                    return;
                } else {
                    class300.field4760 = 0;
                    class357.field5463 = var7;
                    class421.field6216.method1098((byte) 108);
                    class421.field6216 = null;
                    return;
                }
            }
            if (class300.field4760 == 6) {
                class11.field139.field3044 = 0;
                class11.field139.method2224(17, (byte) 0);
                class421.field6216.method1101(class11.field139.field3066, 0, class11.field139.field3044, 3);
                class300.field4760 = 4;
            } else if (class300.field4760 == 7) {
                if (class421.field6216.method1102(30000) >= 1) {
                    class182.field2977 = class421.field6216.method1105(false) * 60 + 180;
                    class357.field5463 = 21;
                    class300.field4760 = 0;
                    class421.field6216.method1098((byte) 119);
                    class421.field6216 = null;
                }
            } else if (class300.field4760 != 10) {
                if (class300.field4760 == 8) {
                    if (class421.field6216.method1102(30000) < 14) {
                        return;
                    }
                    class421.field6216.method1103(0, class158.field2514.field3066, 14, 0);
                    class158.field2514.field3044 = 0;
                    class382.field5772 = class158.field2514.method1322(false);
                    class198.field3190 = class158.field2514.method1322(false);
                    class52.field651 = class158.field2514.method1322(false) == 1;
                    class277.field4416 = class158.field2514.method1322(false) == 1;
                    class375.field5676 = class158.field2514.method1322(!arg0) == 1;
                    class333.field5199 = class158.field2514.method1322(false) == 1;
                    class104.field1467 = class158.field2514.method1322(false) == 1;
                    class39.field500 = class158.field2514.method1272((byte) -76);
                    class226.field3809 = class158.field2514.method1322(false) == 1;
                    class84.field1040 = class158.field2514.method1322(false) == 1;
                    class381.method2424(class84.field1040, -123);
                    class225.method1613(0, class84.field1040);
                    class61.method401(117, class84.field1040);
                    if ((!class52.field651 || class375.field5676) && !class226.field3809) {
                        try {
                            class169.method1180(class63.field822.field4464, "unzap", !arg0);
                        } catch (Throwable var9) {
                        }
                    } else {
                        try {
                            class169.method1180(class63.field822.field4464, "zap", false);
                        } catch (Throwable var10) {
                        }
                    }
                    if (class141.field2184 == 0) {
                        try {
                            class169.method1180(class63.field822.field4464, "loggedin", false);
                        } catch (Throwable var8) {
                        }
                    }
                    class208.field3345 = class158.field2514.method2227((byte) -101);
                    class345.field5331 = class158.field2514.method1272((byte) -61);
                    class300.field4760 = 9;
                }
                if (class300.field4760 == 9 && class421.field6216.method1102(30000) >= class345.field5331) {
                    class158.field2514.field3044 = 0;
                    class421.field6216.method1103(0, class158.field2514.field3066, class345.field5331, 0);
                    class300.field4760 = 0;
                    class357.field5463 = 2;
                    class53.method349(false);
                    class418.field6195 = -1;
                    class287.method1941(false, true);
                    class208.field3345 = -1;
                }
            } else if (class421.field6216.method1102(30000) >= 1) {
                class318.field4987 = class421.field6216.method1105(false);
                class300.field4760 = 0;
                class357.field5463 = 29;
                class421.field6216.method1098((byte) 104);
                class421.field6216 = null;
            }
        } catch (IOException var11) {
            if (class421.field6216 != null) {
                class421.field6216.method1098((byte) 102);
                class421.field6216 = null;
            }
            if (class57.field715 < 1) {
                class57.field715++;
                class300.field4760 = 1;
                if (class422.field6235 == class299.field4756) {
                    class299.field4756 = class196.field3170;
                } else {
                    class299.field4756 = class422.field6235;
                }
                class160.field2531 = 0;
            } else {
                class300.field4760 = 0;
                class357.field5463 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZI)Lag;", line = 443)
    public static final class406 method2449(boolean arg0, int arg1) {
        field5830++;
        class52 var2 = class8.field102;
        class406 var3;
        synchronized (class8.field102) {
            var3 = (class406) class8.field102.method331((byte) 69, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class158.field2519.method2771(16, arg1, 3);
        if (!arg0) {
            field5832 = null;
        }
        class406 var5 = new class406();
        if (var4 != null) {
            var5.method2546(new class186(var4), -52);
        }
        class52 var6 = class8.field102;
        synchronized (class8.field102) {
            class8.field102.method341(91, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(IIII)V", line = 471)
    public static final void method2450(int arg0, int arg1, int arg2, int arg3) {
        field5837++;
        int var4 = class232.field3867 * arg3 >> 8;
        if (var4 != 0 && arg1 != -1) {
            class208.method1463(false, var4, arg1, (byte) -126, 0, class282.field4531);
            class241.field3998 = true;
        }
        if (arg0 < 97) {
            method2445(-113);
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 495)
    public class386(Throwable arg0, String arg1) {
        this.field5827 = arg0;
        this.field5834 = arg1;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V", line = 510)
    public static final void method2451(int arg0, int arg1) {
        if (arg0 != 682) {
            method2446(-109, 94, -33, 15);
        }
        field5833++;
        class97.field1305 = new int[arg1];
        class414.field6126 = new int[arg1];
        class411.field6091 = new int[arg1];
        class102.field1428 = new int[arg1];
        class377.field5699 = new int[arg1];
    }
}
