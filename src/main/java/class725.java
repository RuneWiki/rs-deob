import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class725 {

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "Lui;")
    private class251 field10315 = new class251(64);

    @OriginalMember(owner = "client!hha", name = "g", descriptor = "Llga;")
    private class47 field10311;

    @OriginalMember(owner = "client!hha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10320 = new String[] { method5255(method5254("\r\u0019\nD")), method5255(method5254("\u0018BH\u0006\t")), method5255(method5254("\u000b\u0004\u0007\u00066K")), method5255(method5254("\u000b\u0004\u0007\u00062K")), method5255(method5254("\u000b\u0004\u0007\u00063K")), method5255(method5254("\u000b\u0004\u0007\u00060K")), method5255(method5254("\u000b\u0004\u0007\u00067K")), method5255(method5254("\u000b\u0004\u0007\u00065K")), method5255(method5254("\u000b\u0004\u0007\u0006H\n\u0002\u000f\\JK")), method5255(method5254("\u000b\u0004\u0007\u00061K")) };

    @OriginalMember(owner = "client!hha", name = "j", descriptor = "I")
    public static int field10316 = 1;

    @OriginalMember(owner = "client!hha", name = "l", descriptor = "I")
    public static int field10314 = 0;

    @OriginalMember(owner = "client!hha", name = "i", descriptor = "I")
    public static int field10308;

    @OriginalMember(owner = "client!hha", name = "d", descriptor = "I")
    public static int field10309;

    @OriginalMember(owner = "client!hha", name = "k", descriptor = "I")
    public static int field10310;

    @OriginalMember(owner = "client!hha", name = "e", descriptor = "I")
    public static int field10312;

    @OriginalMember(owner = "client!hha", name = "f", descriptor = "I")
    public static int field10317;

    @OriginalMember(owner = "client!hha", name = "h", descriptor = "I")
    public static int field10318;

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "I")
    public static int field10319;

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "[[[Z")
    public static boolean[][][] field10313;

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(B)V", line = 8)
    public static void method5247(byte arg0) {
        try {
            field10313 = null;
            if (arg0 != -6) {
                field10314 = -85;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10320[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)V", line = 19)
    public final void method5248(int arg0) {
        try {
            class251 var2 = this.field10315;
            synchronized (this.field10315) {
                if (arg0 != 8352) {
                    method5253(null, 118);
                }
                this.field10315.method2043(false);
            }
            field10317++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10320[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(II)Lvp;", line = 35)
    public final class11 method5249(int arg0, int arg1) {
        try {
            field10309++;
            class251 var3 = this.field10315;
            class11 var4;
            synchronized (this.field10315) {
                var4 = (class11) this.field10315.method2053(0, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class47 var5 = this.field10311;
            byte[] var6;
            synchronized (this.field10311) {
                var6 = this.field10311.method512(arg1, 35, (byte) -91);
            }
            class11 var7 = new class11();
            if (var6 != null) {
                var7.method78(-103, new class711(var6));
            }
            var7.method75(122);
            class251 var8 = this.field10315;
            synchronized (this.field10315) {
                this.field10315.method2051((long) arg1, var7, 93);
            }
            int var9 = 55 % ((21 - arg0) / 48);
            return var7;
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field10320[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "(II)V", line = 75)
    public final void method5250(int arg0, int arg1) {
        try {
            class251 var3 = this.field10315;
            synchronized (this.field10315) {
                this.field10315.method2038(0, arg1);
            }
            field10308++;
            if (arg0 != -1573592480) {
                method5252(-68, -78, 0.2785746F, -119, -91, 108, 1.0259796F, null, -83, null, 1.4548587F, 60, 1.1927294F, 0.4676553F);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10320[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(Z)V", line = 88)
    public final void method5251(boolean arg0) {
        try {
            class251 var2 = this.field10315;
            synchronized (this.field10315) {
                this.field10315.method2047(11914);
            }
            field10319++;
            if (!arg0) {
                this.method5249(-24, 12);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10320[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(IIFIIIF[BILkc;FIFF)V", line = 101)
    public static final void method5252(int arg0, int arg1, float arg2, int arg3, int arg4, int arg5, float arg6, byte[] arg7, int arg8, class734 arg9, float arg10, int arg11, float arg12, float arg13) {
        try {
            field10318++;
            int var14 = arg8 * arg11;
            float[] var15 = new float[var14];
            for (int var16 = arg5; var16 < arg3; var16++) {
                arg9.method4556(var15, 16383, arg1, arg6 / (float) arg8, arg8, arg4, arg13 * 127.0F, arg12 / (float) arg1, arg2 / (float) arg11, arg11, 0);
                int var17 = arg0;
                arg6 *= 2.0F;
                arg2 *= 2.0F;
                for (int var18 = 0; var18 < var14; var18++) {
                    arg7[var17] = (byte) ((int) ((float) arg7[var17] + var15[var18]));
                    var17++;
                }
                arg12 *= 2.0F;
                arg13 = arg10 * arg13;
            }
            int var19 = arg0;
            for (int var20 = 0; var20 < var14; var20++) {
                arg7[var19] = (byte) (arg7[var19] + 127);
                var19++;
            }
        } catch (RuntimeException var22) {
            throw class665.method4799(var22, field10320[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field10320[0] : field10320[1]) + ',' + arg8 + ',' + (arg9 == null ? field10320[0] : field10320[1]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(Ljka;I)I", line = 149)
    public static final int method5253(class228 arg0, int arg1) {
        try {
            field10312++;
            if (arg1 <= 15) {
                field10313 = null;
            }
            String var2 = class105.method1003((byte) 94, arg0);
            int[] var3 = null;
            if (class279.method2274(arg0.field3311, (byte) -120)) {
                var3 = class153.field1955.method3237((int) arg0.field3299, 0).field5428;
            } else if (arg0.field3313 != -1) {
                var3 = class153.field1955.method3237(arg0.field3313, 0).field5428;
            } else if (class161.method1354(arg0.field3311, 2353)) {
                class527 var4 = (class527) class479.field7063.method3693(false, (long) ((int) arg0.field3299));
                if (var4 != null) {
                    class717 var5 = var4.field7672;
                    class134 var6 = var5.field10229;
                    if (var6.field1659 != null) {
                        var6 = var6.method1178(class734.field10459, (byte) -101);
                    }
                    if (var6 != null) {
                        var3 = var6.field1700;
                    }
                }
            } else if (class572.method4258((byte) -42, arg0.field3311)) {
                class789 var7 = class101.field1359.method2832(119, (int) (arg0.field3299 >>> 32 & 0x7FFFFFFFL));
                if (var7.field11465 != null) {
                    var7 = var7.method5688(107, class734.field10459);
                }
                if (var7 != null) {
                    var3 = var7.field11395;
                }
            }
            if (var3 != null) {
                var2 = var2 + class222.method1864(0, var3);
            }
            int var8 = class520.field7584.method1366(class342.field4978, -103, var2);
            if (arg0.field3308) {
                var8 += class621.field8840.method1376() + 4;
            }
            return var8;
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field10320[9] + (arg0 == null ? field10320[0] : field10320[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hha", name = "<init>", descriptor = "(Lfs;ILlga;)V", line = 227)
    public class725(class796 arg0, int arg1, class47 arg2) {
        try {
            this.field10311 = arg2;
            if (this.field10311 != null) {
                this.field10311.method509(true, 35);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10320[8] + (arg0 == null ? field10320[0] : field10320[1]) + ',' + arg1 + ',' + (arg2 == null ? field10320[0] : field10320[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!hha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5254(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x74);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5255(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 99;
                    break;
                case 1:
                    var10005 = 108;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 40;
                    break;
                default:
                    var10005 = 116;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
