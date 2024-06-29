import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class61 extends class702 {

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "[I")
    private int[] field939;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field942 = new String[] { method667(method666("~uP?1")), method667(method666("~uPJp{w\nH1")), method667(method666("~uP91")), method667(method666("{k\u0012\u001a")), method667(method666("83@V")), method667(method666("qw\f\u0013zar\u0011\u0011p{>")), method667(method666("n0PXd")), method667(method666("~uP&1")), method667(method666("~uP71")), method667(method666("~uP41")), method667(method666("~uP51")), method667(method666("~uP'1")) };

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "Z")
    public static boolean field934 = false;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field935 = new String[100];

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "Lsb;")
    public static class261 field937 = new class261(8, 1);

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    private int field932;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    private int field938;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "[B")
    private byte[] field933;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIBIZI)V", line = 4)
    public static final void method659(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        try {
            if (arg0 < 1) {
                arg0 = 1;
            }
            if (arg2 != -91) {
                field935 = null;
            }
            ++field930;
            if (~arg1 > -2) {
                arg1 = 1;
            }
            int var6 = arg0 + -334;
            if (~var6 > -1) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (-class185.field2402 + class137.field1757) * var6 / 100 + class185.field2402;
            if (~class602.field8633 < ~var7) {
                var7 = class602.field8633;
            } else if (var7 > class285.field4011) {
                var7 = class285.field4011;
            }
            int var8 = arg0 * 512 * var7 / (arg1 * 334);
            if (var8 < class335.field4846) {
                short var9 = class335.field4846;
                var7 = arg1 * 334 * var9 / (arg0 * 512);
                if (var7 > class285.field4011) {
                    var7 = class285.field4011;
                    int var10 = arg0 * 512 * var7 / (var9 * 334);
                    int var11 = (-var10 + arg1) / 2;
                    if (arg4) {
                        class236.field3418.method240();
                        class236.field3418.method121(var11, arg3, -66, arg0, -16777216, arg5);
                        class236.field3418.method121(var11, arg3 - var11 + arg1, -111, arg0, -16777216, arg5);
                    }
                    arg3 += var11;
                    arg1 -= var11 * 2;
                }
            } else if (var8 > class564.field8244) {
                short var12 = class564.field8244;
                var7 = arg1 * var12 * 334 / (arg0 * 512);
                if (~class602.field8633 < ~var7) {
                    var7 = class602.field8633;
                    int var13 = arg1 * var12 * 334 / (var7 * 512);
                    int var14 = (-var13 + arg0) / 2;
                    if (arg4) {
                        class236.field3418.method240();
                        class236.field3418.method121(arg1, arg3, -81, var14, -16777216, arg5);
                        class236.field3418.method121(arg1, arg3, -122, var14, -16777216, arg0 + arg5 - var14);
                    }
                    arg0 -= var14 * 2;
                    arg5 += var14;
                }
            }
            class785.field11340 = (short) arg0;
            class193.field2539 = arg3;
            class797.field11580 = (short) arg1;
            class321.field4381 = arg5;
            class750.field10684 = arg0 * var7 / 334;
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field942[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V", line = 103)
    public final void method660(int arg0, int arg1, int arg2) {
        try {
            this.field938 += this.field939[arg0] * arg2 >> 12;
            if (arg1 == -22460) {
                ++field941;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field942[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 116)
    public static final String method661(String arg0, int arg1) {
        try {
            ++field929;
            String var2 = null;
            int var3 = -98 / ((arg1 - 19) / 38);
            int var4 = arg0.indexOf(field942[4]);
            if (~var4 <= -1) {
                var2 = arg0.substring(0, var4 + 4);
                arg0 = arg0.substring(var4 + 4);
            }
            if (arg0.startsWith(field942[5])) {
                int var5 = arg0.indexOf(" ", field942[5].length());
                if (var5 >= 0) {
                    int var6 = arg0.length();
                    arg0 = arg0.substring(0, var5) + " ";
                    for (int var7 = var5 - -1; var7 < var6; ++var7) {
                        arg0 = arg0 + "*";
                    }
                }
            }
            return var2 != null ? var2 + arg0 : arg0;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field942[7] + (arg0 != null ? field942[6] : field942[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V", line = 162)
    public final void method662(byte arg0) {
        try {
            this.field938 = Math.abs(this.field938);
            ++field940;
            if (this.field938 >= 4096) {
                this.field938 = 4095;
            }
            this.method665(this.field932++, (byte) (this.field938 >> 4), (byte) -108);
            this.field938 = 0;
            if (arg0 != 47) {
                this.method662((byte) -10);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field942[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V", line = 178)
    public static void method663(int arg0) {
        try {
            field937 = null;
            if (arg0 < 24) {
                method663(-98);
            }
            field935 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field942[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIIIIF)V", line = 190)
    public class61(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        try {
            this.field939 = new int[super.field9820];
            for (int var7 = 0; super.field9820 > var7; ++var7) {
                this.field939[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field942[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V", line = 210)
    public final void method664(int arg0) {
        try {
            this.field938 = 0;
            ++field936;
            this.field932 = 0;
            if (arg0 != -9803) {
                method663(120);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field942[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBB)V", line = 227)
    public void method665(int arg0, byte arg1, byte arg2) {
        try {
            ++field931;
            this.field933[this.field932++] = (byte) (127 + class434.method3377(arg1 >> 1, 127));
            int var4 = -4 / ((-39 - arg2) / 55);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field942[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method666(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 25);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method667(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 21;
                    break;
                case 1:
                    var10005 = 30;
                    break;
                case 2:
                    var10005 = 126;
                    break;
                case 3:
                    var10005 = 118;
                    break;
                default:
                    var10005 = 25;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
