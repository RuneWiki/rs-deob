import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class269 {

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "Liha;")
    private class29 field4337 = new class29(128);

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "Liha;")
    public class29 field4343 = new class29(64);

    @OriginalMember(owner = "client!sda", name = "k", descriptor = "Lgda;")
    public class58 field4336;

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "Lgda;")
    private class58 field4332;

    @OriginalMember(owner = "client!sda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4344 = new String[] { method2330(method2329("n$b[65")), method2330(method2329("n$b[55")), method2330(method2329("n$b[45")), method2330(method2329("s5o\u0019")), method2330(method2329("n$b[Lt.j\u0001N5")), method2330(method2329("fn-[\r")), method2330(method2329("n$b[15")), method2330(method2329("n$b[25")), method2330(method2329("n$b[75")), method2330(method2329("n$b[35")), method2330(method2329("n$b[85")) };

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "[I")
    public static int[] field4342 = new int[1];

    @OriginalMember(owner = "client!sda", name = "g", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!sda", name = "j", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!sda", name = "m", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!sda", name = "l", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!sda", name = "h", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!sda", name = "n", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!sda", name = "i", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "J")
    public static long field4331;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(BI)V")
    public final void method2321(byte arg0, int arg1) {
        try {
            field4330++;
            class29 var3 = this.field4337;
            synchronized (this.field4337) {
                this.field4337.method294(arg1, -630);
            }
            class29 var4 = this.field4343;
            synchronized (this.field4343) {
                this.field4343.method294(arg1, -630);
                if (arg0 <= 124) {
                    this.method2324((byte) -48);
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4344[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V")
    public final void method2322(int arg0) {
        try {
            class29 var2 = this.field4337;
            synchronized (this.field4337) {
                this.field4337.method298(5);
            }
            field4341++;
            class29 var3 = this.field4343;
            synchronized (this.field4343) {
                if (arg0 != 11824) {
                    method2326((byte) -68);
                }
                this.field4343.method298(5);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4344[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(III)Z")
    public static final boolean method2323(int arg0, int arg1, int arg2) {
        try {
            field4333++;
            if (arg0 != 1048832) {
                method2323(-36, 95, 35);
            }
            return (arg2 & 0x100100) != 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4344[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)V")
    public final void method2324(byte arg0) {
        try {
            field4338++;
            class29 var2 = this.field4337;
            synchronized (this.field4337) {
                if (arg0 != 15) {
                    this.method2325(-111, 58);
                }
                this.field4337.method304(1);
            }
            class29 var3 = this.field4343;
            synchronized (this.field4343) {
                this.field4343.method304(1);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4344[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)Lrfa;")
    public final class209 method2325(int arg0, int arg1) {
        try {
            field4334++;
            class29 var3 = this.field4337;
            class209 var4;
            synchronized (this.field4337) {
                var4 = (class209) this.field4337.method302(-108, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field4332;
            byte[] var6;
            synchronized (this.field4332) {
                if (arg0 != -2) {
                    this.field4343 = null;
                }
                var6 = this.field4332.method604((byte) -120, arg1, 36);
            }
            class209 var7 = new class209();
            var7.field3309 = this;
            var7.field3264 = arg1;
            if (var6 != null) {
                var7.method1883(-81, new class176(var6));
            }
            var7.method1887((byte) -101);
            class29 var8 = this.field4337;
            synchronized (this.field4337) {
                this.field4337.method295(false, (long) arg1, var7);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field4344[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(B)V")
    public static void method2326(byte arg0) {
        try {
            if (arg0 == -106) {
                field4342 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4344[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)V")
    public final void method2327(int arg0, int arg1, int arg2) {
        try {
            if (arg2 < 14) {
                field4331 = -66L;
            }
            field4335++;
            this.field4337 = new class29(arg1);
            this.field4343 = new class29(arg0);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4344[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILha;)V")
    public static final void method2328(int arg0, class63 arg1) {
        try {
            field4339++;
            int var2 = 0;
            int var3 = 0;
            if (class316.field5141) {
                var2 = class50.method516(false);
                var3 = class568.method4171(0);
            }
            int var4 = -10660793;
            class665.method4824(arg1, class209.field3290, var4, -16777216, class65.field897 + var2, class489.field7379, (byte) -90, class606.field8725 + var3);
            class461.field7108.method679(0, class65.field897 + var2 + 3, -1, var4, class709.field10226.method5154(class795.field11624, (byte) 65), class606.field8725 + var3 + 14);
            int var5 = class15.field174.method5051(0) + var2;
            int var6 = class15.field174.method5048(true) + var3;
            if (arg0 <= 28) {
                field4340 = -36;
            }
            if (class595.field8598) {
                int var10 = 0;
                for (class603 var11 = (class603) class580.field8365.method5147((byte) -56); var11 != null; var11 = (class603) class580.field8365.method5144(256)) {
                    int var12 = (var10 * 16) + class606.field8725 + var3 + 31;
                    var10++;
                    if (var11.field8711 == 1) {
                        class432.method3415(var12, class65.field897 + var2, true, var6, arg1, (class59) var11.field8713.field10193.field7074, var5, class209.field3290, -1, class606.field8725 + var3, class489.field7379, -256);
                    } else {
                        class139.method1291(class606.field8725 + var3, -1, arg1, class65.field897 + var2, -256, class209.field3290, var6, var11, var5, -98, class489.field7379, var12);
                    }
                }
                if (class116.field1694 != null) {
                    class665.method4824(arg1, class541.field7977, var4, -16777216, class452.field6990, class630.field9060, (byte) -97, class270.field4346);
                    int var13 = 0;
                    class461.field7108.method679(0, class452.field6990 + 3, -1, var4, class116.field1694.field8710, class270.field4346 + 14);
                    for (class59 var14 = (class59) class116.field1694.field8713.method5147((byte) 118); var14 != null; var14 = (class59) class116.field1694.field8713.method5144(256)) {
                        int var15 = var13 * 16 + class270.field4346 + 31;
                        class432.method3415(var15, class452.field6990, true, var6, arg1, var14, var5, class541.field7977, -1, class270.field4346, class630.field9060, -256);
                        var13++;
                    }
                    class785.method5647((byte) 87, class452.field6990, class270.field4346, class541.field7977, class630.field9060);
                }
            } else {
                int var7 = 0;
                for (class59 var8 = (class59) class439.field6858.method3228(11); var8 != null; var8 = (class59) class439.field6858.method3216(true)) {
                    int var9 = (class320.field5213 - var7 - 1) * 16 + var3 + class606.field8725 + 31;
                    class432.method3415(var9, class65.field897 + var2, true, var6, arg1, var8, var5, class209.field3290, -1, class606.field8725 + var3, class489.field7379, -256);
                    var7++;
                }
            }
            class785.method5647((byte) 87, class65.field897 + var2, class606.field8725 + var3, class209.field3290, class489.field7379);
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field4344[10] + arg0 + ',' + (arg1 == null ? field4344[3] : field4344[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lpo;ILgda;Lgda;)V")
    public class269(class585 arg0, int arg1, class58 arg2, class58 arg3) {
        try {
            this.field4336 = arg3;
            this.field4332 = arg2;
            this.field4332.method580(64, 36);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4344[4] + (arg0 == null ? field4344[3] : field4344[5]) + ',' + arg1 + ',' + (arg2 == null ? field4344[3] : field4344[5]) + ',' + (arg3 == null ? field4344[3] : field4344[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!sda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2329(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x70);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2330(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 29;
                    break;
                case 1:
                    var10005 = 64;
                    break;
                case 2:
                    var10005 = 3;
                    break;
                case 3:
                    var10005 = 117;
                    break;
                default:
                    var10005 = 112;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
