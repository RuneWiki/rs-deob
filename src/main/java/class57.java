import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class57 {

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Lui;")
    private class251 field810 = new class251(64);

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Llga;")
    private class47 field804;

    @OriginalMember(owner = "client!am", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field814 = new String[] { method613(method612("(`9\u0013j")), method613(method612("2#9{?")), method613(method612("(`9i+'dckj")), method613(method612("'x{9")), method613(method612("15!\nt}")), method613(method612("9}tz")), method613(method612("%dy :")), method613(method612("$~}44(\"")), method613(method612("(`9\u0016j")), method613(method612("$lt")), method613(method612(">dy1->~8")), method613(method612(" >/c")), method613(method612(">dy")), method613(method612(" 9/c")), method613(method612("$lt:1f")), method613(method612("9}t")), method613(method612(" 8/c")), method613(method612("(`scv")), method613(method612("15!z")), method613(method612("<c~#';~v9m")), method613(method612("15!\nt}\"")), method613(method612("%dy :f")), method613(method612("15!")), method613(method612("(`9\u001dj")), method613(method612("(`9\u0014j")), method613(method612("(`9\u0012j")), method613(method612("(`9\u0017j")), method613(method612("(`9\u0011j")), method613(method612("(`9\u0010j")) };

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field800 = -1;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field809 = 0;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "[J")
    public static long[] field813 = new long[256];

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field812;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field813[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIII)V", line = 5)
    public static final void method604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            if (class335.field4844 <= arg4 && arg0 <= class507.field7453 && arg2 >= class557.field8113 && class50.field717 >= arg3) {
                class203.method1740(arg3, arg2, arg0, arg5, arg4, true);
            } else {
                class105.method1002(arg4, (byte) 109, arg2, arg0, arg3, arg5);
            }
            field807++;
            if (arg1 != 22792) {
                method606(null, null, (byte) 10);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field814[28] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V", line = 22)
    public static void method605(byte arg0) {
        try {
            field813 = null;
            if (arg0 < 105) {
                field809 = -49;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field814[27] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljc;Lpga;B)Lvq;", line = 32)
    public static final class363 method606(class711 arg0, class371 arg1, byte arg2) {
        try {
            if (arg2 != 108) {
                method609(null, null, (byte) 118);
            }
            field811++;
            class363 var3 = new class363(arg1);
            int var4 = arg0.method5128(0);
            boolean var5 = (var4 & 0x1) != 0;
            boolean var6 = (var4 & 0x2) != 0;
            boolean var7 = (var4 & 0x4) != 0;
            if (var5) {
                var3.field5267[0] = arg0.method5142((byte) 12);
                var3.field5271[0] = arg0.method5142((byte) 12);
                if (arg1.field5433 != -1 || arg1.field5384 != -1) {
                    var3.field5267[1] = arg0.method5142((byte) 12);
                    var3.field5271[1] = arg0.method5142((byte) 12);
                }
                if (arg1.field5412 != -1 || arg1.field5380 != -1) {
                    var3.field5267[2] = arg0.method5142((byte) 12);
                    var3.field5271[2] = arg0.method5142((byte) 12);
                }
            }
            boolean var8 = (var4 & 0x8) != 0;
            if (var6) {
                var3.field5270[0] = arg0.method5142((byte) 12);
                var3.field5268[0] = arg0.method5142((byte) 12);
                if (arg1.field5424 != -1 || arg1.field5375 != -1) {
                    var3.field5270[1] = arg0.method5142((byte) 12);
                    var3.field5268[1] = arg0.method5142((byte) 12);
                }
            }
            if (var7) {
                int var9 = arg0.method5116((byte) -105);
                int[] var10 = new int[] { class434.method3377(var9, 15), class434.method3377(242, var9) >> 4, class434.method3377(var9, 3977) >> 8, class434.method3377(var9 >> 12, 15) };
                for (int var11 = 0; var11 < 4; var11++) {
                    if (var10[var11] != 15) {
                        var3.field5272[var10[var11]] = (short) arg0.method5116((byte) -118);
                    }
                }
            }
            if (var8) {
                int var12 = arg0.method5128(0);
                int[] var13 = new int[] { class434.method3377(15, var12), class434.method3377(243, var12) >> 4 };
                for (int var14 = 0; var14 < 2; var14++) {
                    if (var13[var14] != 15) {
                        var3.field5264[var13[var14]] = (short) arg0.method5116((byte) -114);
                    }
                }
            }
            return var3;
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field814[24] + (arg0 == null ? field814[3] : field814[1]) + ',' + (arg1 == null ? field814[3] : field814[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)V", line = 133)
    public final void method607(int arg0, int arg1) {
        try {
            class251 var3 = this.field810;
            synchronized (this.field810) {
                this.field810.method2038(arg1 ^ arg1, arg0);
            }
            field801++;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field814[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 144)
    public final void method608(int arg0) {
        try {
            field806++;
            class251 var2 = this.field810;
            synchronized (this.field810) {
                if (arg0 != 0) {
                    field802 = 42;
                }
                this.field810.method2047(11914);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field814[26] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Llga;Lft;B)V", line = 162)
    public static final void method609(class47 arg0, class188 arg1, byte arg2) {
        try {
            class740.field10523 = "";
            class97.field1320 = arg0;
            field812++;
            class306.field4249 = arg1;
            if (class447.field6571.startsWith(field814[12])) {
                class740.field10523 = class740.field10523 + field814[10];
            } else if (class447.field6571.startsWith(field814[6])) {
                class740.field10523 = class740.field10523 + field814[21];
            } else if (class447.field6571.startsWith(field814[9])) {
                class740.field10523 = class740.field10523 + field814[14];
            }
            if (arg2 <= 78) {
                field808 = -33;
            }
            if (class306.field4249.field2483) {
                class740.field10523 = class740.field10523 + field814[7];
            } else if (class447.field6572.startsWith(field814[17]) || class447.field6572.startsWith(field814[4])) {
                class740.field10523 = class740.field10523 + field814[20];
            } else if (class447.field6572.startsWith(field814[11]) || class447.field6572.startsWith(field814[13]) || class447.field6572.startsWith(field814[16]) || class447.field6572.startsWith(field814[22])) {
                class740.field10523 = class740.field10523 + field814[18];
            } else if (class447.field6572.startsWith(field814[15])) {
                class740.field10523 = class740.field10523 + field814[5];
            } else {
                class740.field10523 = class740.field10523 + field814[19];
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field814[8] + (arg0 == null ? field814[3] : field814[1]) + ',' + (arg1 == null ? field814[3] : field814[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 220)
    public final void method610(byte arg0) {
        try {
            field805++;
            class251 var2 = this.field810;
            synchronized (this.field810) {
                this.field810.method2043(false);
                int var3 = -74 / ((-arg0 - 25) / 53);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field814[25] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZI)Lqm;", line = 233)
    public final class573 method611(boolean arg0, int arg1) {
        try {
            field803++;
            class251 var3 = this.field810;
            class573 var4;
            synchronized (this.field810) {
                var4 = (class573) this.field810.method2053(0, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            if (arg0) {
                field802 = 74;
            }
            class47 var5 = this.field804;
            byte[] var6;
            synchronized (this.field804) {
                var6 = this.field804.method512(arg1, 11, (byte) -122);
            }
            class573 var7 = new class573();
            if (var6 != null) {
                var7.method4266(new class711(var6), -1);
            }
            class251 var8 = this.field810;
            synchronized (this.field810) {
                this.field810.method2051((long) arg1, var7, 93);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field814[23] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lfs;ILlga;)V", line = 296)
    public class57(class796 arg0, int arg1, class47 arg2) {
        try {
            this.field804 = arg2;
            if (this.field804 != null) {
                this.field804.method509(true, 11);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field814[2] + (arg0 == null ? field814[3] : field814[1]) + ',' + arg1 + ',' + (arg2 == null ? field814[3] : field814[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!am", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method612(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x42);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!am", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method613(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 73;
                    break;
                case 1:
                    var10005 = 13;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 85;
                    break;
                default:
                    var10005 = 66;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
