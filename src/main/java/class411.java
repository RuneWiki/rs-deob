import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class411 {

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field5764 = 0;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "Lwf;")
    public static class79 field5769;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "Lbe;")
    public static class28 field5770;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field5762;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIII)I")
    public static final int method2427(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= -112) {
            method2435(-28, true, -24, 62, false);
        }
        field5765++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return 1023 - arg3;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BLbj;Z)V")
    public static final void method2428(byte arg0, class146 arg1, boolean arg2) {
        field5767++;
        class332 var3 = arg1.method924((byte) -32);
        if (arg1.field2168 == 0) {
            class37.field476 = 0;
            class90.field1124 = -1;
            arg1.field2162 = 0;
            return;
        }
        if (arg1.field2080 != -1 && arg1.field2094 == 0) {
            class153 var4 = class64.field836.method2081(arg1.field2080, 0);
            if (arg1.field2160 > 0 && var4.field2286 == 0) {
                class90.field1124 = -1;
                class37.field476 = 0;
                arg1.field2162++;
                return;
            }
            if (arg1.field2160 <= 0 && var4.field2278 == 0) {
                arg1.field2162++;
                class37.field476 = 0;
                class90.field1124 = -1;
                return;
            }
        }
        if (arg1.field2147 != -1 && class353.field5090 >= arg1.field2096) {
            class327 var5 = class324.field4674.method1279(arg1.field2147, -2);
            if (var5.field4728 && var5.field4714 != -1) {
                class153 var6 = class64.field836.method2081(var5.field4714, 0);
                if (arg1.field2160 > 0 && var6.field2286 == 0) {
                    class90.field1124 = -1;
                    class37.field476 = 0;
                    arg1.field2162++;
                    return;
                }
                if (arg1.field2160 <= 0 && var6.field2278 == 0) {
                    class37.field476 = 0;
                    arg1.field2162++;
                    class90.field1124 = -1;
                    return;
                }
            }
        }
        int var7 = arg1.field4331;
        int var8 = arg1.field4317;
        int var9 = arg1.field2163[arg1.field2168 - 1] * 128 + (arg1.method918(false) * 64);
        int var10 = arg1.field2159[arg1.field2168 - 1] * 128 + (arg1.method918(false) * 64);
        if (var7 < var9) {
            if (var8 < var10) {
                arg1.method919((byte) 44, 10240);
            } else if (var8 <= var10) {
                arg1.method919((byte) -127, 12288);
            } else {
                arg1.method919((byte) -126, 14336);
            }
        } else if (var9 >= var7) {
            if (var10 > var8) {
                arg1.method919((byte) 58, 8192);
            } else if (var10 < var8) {
                arg1.method919((byte) 70, 0);
            }
        } else if (var10 > var8) {
            arg1.method919((byte) 9, 6144);
        } else if (var8 > var10) {
            arg1.method919((byte) 81, 2048);
        } else {
            arg1.method919((byte) -117, 4096);
        }
        byte var11 = arg1.field2166[arg1.field2168 - 1];
        if (!arg2 && ((var9 - var7) > 256 || (var9 - var7) < -256 || (var10 - var8) > 256 || (var10 - var8) < -256)) {
            arg1.field4317 = var10;
            arg1.field4331 = var9;
            arg1.method914(118, arg1.field2112);
            class37.field476 = 0;
            if (arg1.field2160 > 0) {
                arg1.field2160--;
            }
            class90.field1124 = -1;
            arg1.field2168--;
            return;
        }
        int var12 = 4;
        boolean var13 = true;
        if (arg1 instanceof class216) {
            var13 = ((class216) arg1).field3232.field6572;
        }
        if (var13) {
            int var14 = arg1.field2112 - arg1.field2153.field1327;
            if (var14 != 0 && arg1.field2125 == -1 && arg1.field2123 != 0) {
                var12 = 2;
            }
            if (!arg2 && arg1.field2168 > 2) {
                var12 = 6;
            }
            if (!arg2 && arg1.field2168 > 3) {
                var12 = 8;
            }
        } else {
            if (!arg2 && arg1.field2168 > 1) {
                var12 = 6;
            }
            if (!arg2 && arg1.field2168 > 2) {
                var12 = 8;
            }
        }
        if (arg1.field2162 > 0 && arg1.field2168 > 1) {
            arg1.field2162--;
            var12 = 8;
        }
        if (var11 == 2) {
            var12 <<= 0x1;
        } else if (var11 == 0) {
            var12 >>= 0x1;
        }
        class37.field476 = 0;
        if (var3.field4820 != -1) {
            int var15 = var12 << 7;
            if (arg1.field2168 == 1) {
                int var16 = arg1.field2165 * arg1.field2165;
                int var17 = (arg1.field4331 <= var9 ? var9 - arg1.field4331 : -var9 + arg1.field4331) << 7;
                int var18 = (var10 >= arg1.field4317 ? var10 - arg1.field4317 : -var10 + arg1.field4317) << 7;
                int var19 = var17 > var18 ? var17 : var18;
                int var20 = var3.field4820 * 2 * var19;
                if (var16 > var20) {
                    arg1.field2165 /= 2;
                } else if (var16 / 2 > var19) {
                    arg1.field2165 -= var3.field4820;
                    if (arg1.field2165 < 0) {
                        arg1.field2165 = 0;
                    }
                } else if (arg1.field2165 < var15) {
                    arg1.field2165 += var3.field4820;
                    if (arg1.field2165 > var15) {
                        arg1.field2165 = var15;
                    }
                }
            } else if (arg1.field2165 < var15) {
                arg1.field2165 += var3.field4820;
                if (var15 < arg1.field2165) {
                    arg1.field2165 = var15;
                }
            } else if (arg1.field2165 > 0) {
                arg1.field2165 -= var3.field4820;
                if (arg1.field2165 < 0) {
                    arg1.field2165 = 0;
                }
            }
            var12 = arg1.field2165 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        if (var7 < var9) {
            arg1.field4331 += var12;
            class37.field476 |= 0x4;
            if (var9 < arg1.field4331) {
                arg1.field4331 = var9;
            }
        } else if (var7 > var9) {
            class37.field476 |= 0x8;
            arg1.field4331 -= var12;
            if (arg1.field4331 < var9) {
                arg1.field4331 = var9;
            }
        }
        if (arg0 < 31) {
            method2427(111, -4, 78, -122);
        }
        if (var10 > var8) {
            class37.field476 |= 0x1;
            arg1.field4317 += var12;
            if (var10 < arg1.field4317) {
                arg1.field4317 = var10;
            }
        } else if (var10 < var8) {
            arg1.field4317 -= var12;
            class37.field476 |= 0x2;
            if (var10 > arg1.field4317) {
                arg1.field4317 = var10;
            }
        }
        if (var12 >= 8) {
            class90.field1124 = 2;
        } else {
            class90.field1124 = var11;
        }
        if (arg1.field4331 != var9 || arg1.field4317 != var10) {
            return;
        }
        arg1.field2168--;
        if (arg1.field2160 > 0) {
            arg1.field2160--;
            return;
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V")
    public class411() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public static final void method2429(byte arg0) {
        field5768++;
        class110.field1393.method2771(-5);
        class141.field1881.method1557(true);
        class96.field1231.method1557(true);
        if (arg0 >= -61) {
            field5764 = 40;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lrp;[BI)V")
    public final void method2430(class276 arg0, byte[] arg1, int arg2) {
        if (arg2 != 8) {
            return;
        }
        field5760++;
        if (arg0.field4064[arg0.field4021] != 31 || arg0.field4064[arg0.field4021 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field5762 == null) {
            this.field5762 = new Inflater(true);
        }
        try {
            this.field5762.setInput(arg0.field4064, arg0.field4021 + 10, arg0.field4064.length + -8 + -arg0.field4021 + -10);
            this.field5762.inflate(arg1);
        } catch (Exception var4) {
            this.field5762.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field5762.reset();
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)V")
    public static final void method2431(int arg0, int arg1, int arg2) {
        class88 var3 = class330.field4786[arg0][arg1][arg2];
        if (var3 != null && var3.field1070 != null) {
            var3.field1070 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public static void method2432(int arg0) {
        field5769 = null;
        field5770 = null;
        if (arg0 != -1) {
            field5770 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II[BI)I")
    public static final int method2433(int arg0, int arg1, byte[] arg2, int arg3) {
        field5766++;
        int var4 = -1;
        for (int var5 = arg3; var5 < arg1; var5++) {
            var4 = var4 >>> 8 ^ class444.field6134[(arg2[var5] ^ var4) & 0xFF];
        }
        int var6 = ~var4;
        return arg0 == 883512936 ? var6 : -74;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZ)V")
    public static final void method2434(int arg0, boolean arg1) {
        field5759++;
        if (arg0 != 1) {
            return;
        }
        for (class342 var2 = (class342) class99.field1270.method2843(arg0 + 1123227611); var2 != null; var2 = (class342) class99.field1270.method2842(1673506446)) {
            if (var2.field4984 != null) {
                class59.field796.method2561(var2.field4984);
                var2.field4984 = null;
            }
            if (var2.field4974 != null) {
                class59.field796.method2561(var2.field4974);
                var2.field4974 = null;
            }
            var2.method1510((byte) -13);
        }
        if (!arg1) {
            return;
        }
        for (class342 var3 = (class342) class114.field1459.method2843(arg0 + 1123227611); var3 != null; var3 = (class342) class114.field1459.method2842(arg0 ^ 0x63BFAE8F)) {
            if (var3.field4984 != null) {
                class59.field796.method2561(var3.field4984);
                var3.field4984 = null;
            }
            var3.method1510((byte) -13);
        }
        for (class342 var4 = (class342) class389.field5521.method2769((byte) -75); var4 != null; var4 = (class342) class389.field5521.method2768((byte) -88)) {
            if (var4.field4984 != null) {
                class59.field796.method2561(var4.field4984);
                var4.field4984 = null;
            }
            var4.method1510((byte) -13);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZIIZ)Ljn;")
    public static final class465 method2435(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field5761++;
        if (arg4) {
            field5764 = -95;
        }
        class465 var5 = new class465();
        var5.field6500 = arg3;
        var5.field6502 = arg0;
        class146.field2146.method2767(-1, (long) arg2, var5);
        class148.method937(-2, arg0);
        class145 var6 = class166.method1028(arg2, 107);
        if (var6 != null) {
            class22.method148((byte) -78, var6);
        }
        if (class207.field3166 != null) {
            class22.method148((byte) -78, class207.field3166);
            class207.field3166 = null;
        }
        class124.method747(8);
        if (var6 != null) {
            class88.method495(!arg1, var6, (byte) 92);
        }
        if (!arg1) {
            class290.method1820(arg0);
        }
        if (!arg1 && class36.field472 != -1) {
            class24.method169((byte) -6, class36.field472, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(III)V")
    private class411(int arg0, int arg1, int arg2) {
    }

    static {
        new class326("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        new class326((String) null, "geschickt werden.", (String) null, (String) null);
        field5769 = new class79(27, 8);
    }
}
