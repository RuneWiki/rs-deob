import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class715 extends class687 {

    @OriginalMember(owner = "client!ifa", name = "L", descriptor = "I")
    public int field10170 = 12800;

    @OriginalMember(owner = "client!ifa", name = "F", descriptor = "I")
    public int field10177 = -1;

    @OriginalMember(owner = "client!ifa", name = "x", descriptor = "I")
    public int field10180 = -1;

    @OriginalMember(owner = "client!ifa", name = "v", descriptor = "I")
    public int field10165 = 0;

    @OriginalMember(owner = "client!ifa", name = "C", descriptor = "I")
    public int field10162 = 12800;

    @OriginalMember(owner = "client!ifa", name = "u", descriptor = "Z")
    public boolean field10169 = true;

    @OriginalMember(owner = "client!ifa", name = "A", descriptor = "I")
    public int field10183 = 0;

    @OriginalMember(owner = "client!ifa", name = "B", descriptor = "Ljava/lang/String;")
    public String field10178;

    @OriginalMember(owner = "client!ifa", name = "J", descriptor = "I")
    public int field10181;

    @OriginalMember(owner = "client!ifa", name = "D", descriptor = "Ljava/lang/String;")
    public String field10174;

    @OriginalMember(owner = "client!ifa", name = "O", descriptor = "I")
    public int field10173;

    @OriginalMember(owner = "client!ifa", name = "z", descriptor = "Ltf;")
    public class524 field10172;

    @OriginalMember(owner = "client!ifa", name = "Q", descriptor = "[Ljava/lang/String;")
    private static final String[] field10185 = new String[] { method5193(method5192("\u000fg\u0013\u0018\u000fN")), method5193(method5192("\u000fg\u0013\u0018\u000bN")), method5193(method5192("\u001d/\\\u00181")), method5193(method5192("\bt\u001eZ")), method5193(method5192("\u000fg\u0013\u0018\tN")), method5193(method5192("\u000fg\u0013\u0018p\u000fo\u001bBrN")), method5193(method5192("\u000fg\u0013\u0018\nN")), method5193(method5192("\u000fg\u0013\u0018\rN")), method5193(method5192("\u000fg\u0013\u0018\u0004N")), method5193(method5192("\u000fg\u0013\u0018\u000eN")), method5193(method5192("\u000fg\u0013\u0018\bN")) };

    @OriginalMember(owner = "client!ifa", name = "P", descriptor = "I")
    public static int field10182 = 0;

    @OriginalMember(owner = "client!ifa", name = "w", descriptor = "Lsb;")
    public static class261 field10175 = new class261(142, 2);

    @OriginalMember(owner = "client!ifa", name = "t", descriptor = "I")
    public static int field10163;

    @OriginalMember(owner = "client!ifa", name = "G", descriptor = "I")
    public static int field10164;

    @OriginalMember(owner = "client!ifa", name = "M", descriptor = "I")
    public static int field10166;

    @OriginalMember(owner = "client!ifa", name = "H", descriptor = "I")
    public static int field10167;

    @OriginalMember(owner = "client!ifa", name = "I", descriptor = "I")
    public static int field10168;

    @OriginalMember(owner = "client!ifa", name = "N", descriptor = "I")
    public static int field10171;

    @OriginalMember(owner = "client!ifa", name = "K", descriptor = "I")
    public static int field10179;

    @OriginalMember(owner = "client!ifa", name = "y", descriptor = "Lpca;")
    public static class774 field10176;

    @OriginalMember(owner = "client!ifa", name = "E", descriptor = "[I")
    public static int[] field10184;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method5184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field10166++;
            class224 var8 = null;
            for (class224 var9 = (class224) class486.field7127.method3977((byte) -32); var9 != null; var9 = (class224) class486.field7127.method3987(0)) {
                if (var9.field3256 == arg4 && var9.field3248 == arg2 && var9.field3247 == arg1 && var9.field3258 == arg7) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == null) {
                var8 = new class224();
                var8.field3256 = arg4;
                var8.field3248 = arg2;
                var8.field3258 = arg7;
                var8.field3247 = arg1;
                if (arg2 >= 0 && arg1 >= 0 && class625.field8929 > arg2 && arg1 < class14.field187) {
                    class771.method5556(true, var8);
                }
                class486.field7127.method3984(var8, 0);
            }
            var8.field3246 = arg0;
            var8.field3243 = true;
            var8.field3259 = false;
            if (arg5 != 0) {
                method5185(true, 44);
            }
            var8.field3249 = arg3;
            var8.field3250 = arg6;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field10185[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public static final String method5185(boolean arg0, int arg1) {
        try {
            field10164++;
            class500 var2 = (class500) class687.field9624.method3693(arg0, (long) arg1);
            if (var2 != null) {
                class107 var3 = var2.field7313.method3103((byte) -125);
                if (var3 != null) {
                    double var4 = var2.field7313.method3106((byte) 61);
                    if ((double) var3.method1018(true) <= var4 && (double) var3.method1019(!arg0) >= var4) {
                        return var3.method1015((byte) -68);
                    }
                }
            }
            return null;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field10185[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Z)V")
    public final void method5186(boolean arg0) {
        try {
            if (!arg0) {
                this.method5187(-128, -102, 120, null);
            }
            field10167++;
            this.field10183 = 0;
            this.field10165 = 0;
            this.field10162 = 12800;
            this.field10170 = 12800;
            for (class785 var2 = (class785) this.field10172.method3977((byte) -48); var2 != null; var2 = (class785) this.field10172.method3987(0)) {
                if (var2.field11330 < this.field10170) {
                    this.field10170 = var2.field11330;
                }
                if (this.field10165 < var2.field11343) {
                    this.field10165 = var2.field11343;
                }
                if (var2.field11335 < this.field10162) {
                    this.field10162 = var2.field11335;
                }
                if (this.field10183 < var2.field11346) {
                    this.field10183 = var2.field11346;
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10185[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(III[I)Z")
    public final boolean method5187(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            field10163++;
            if (arg1 != 0) {
                field10182 = -80;
            }
            for (class785 var5 = (class785) this.field10172.method3977((byte) -46); var5 != null; var5 = (class785) this.field10172.method3987(0)) {
                if (var5.method5657(arg2, 2, arg0)) {
                    var5.method5656(-120, arg3, arg2, arg0);
                    return true;
                }
            }
            return false;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field10185[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field10185[3] : field10185[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "([IIIBI)Z")
    public final boolean method5188(int[] arg0, int arg1, int arg2, byte arg3, int arg4) {
        try {
            field10171++;
            int var6 = -114 / ((77 - arg3) / 47);
            for (class785 var7 = (class785) this.field10172.method3977((byte) -126); var7 != null; var7 = (class785) this.field10172.method3987(0)) {
                if (var7.method5651((byte) 114, arg4, arg2, arg1)) {
                    var7.method5656(-96, arg0, arg4, arg2);
                    return true;
                }
            }
            return false;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field10185[1] + (arg0 == null ? field10185[3] : field10185[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "([IZII)Z")
    public final boolean method5189(int[] arg0, boolean arg1, int arg2, int arg3) {
        try {
            field10179++;
            if (!arg1) {
                method5185(false, 70);
            }
            for (class785 var5 = (class785) this.field10172.method3977((byte) -100); var5 != null; var5 = (class785) this.field10172.method3987(0)) {
                if (var5.method5655(arg2, true, arg3)) {
                    var5.method5654(12654, arg0, arg3, arg2);
                    return true;
                }
            }
            return false;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field10185[10] + (arg0 == null ? field10185[3] : field10185[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)V")
    public static void method5190(byte arg0) {
        try {
            if (arg0 > 107) {
                field10176 = null;
                field10184 = null;
                field10175 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10185[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(III)Z")
    public final boolean method5191(int arg0, int arg1, int arg2) {
        try {
            field10168++;
            if (arg2 != 2) {
                this.field10173 = -110;
            }
            for (class785 var4 = (class785) this.field10172.method3977((byte) -116); var4 != null; var4 = (class785) this.field10172.method3987(0)) {
                if (var4.method5657(arg1, 2, arg0)) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10185[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class715(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        try {
            this.field10178 = arg2;
            this.field10180 = arg4;
            this.field10177 = arg6;
            this.field10181 = arg0;
            this.field10174 = arg1;
            this.field10173 = arg3;
            this.field10169 = arg5;
            if (this.field10177 == 255) {
                this.field10177 = 0;
            }
            this.field10172 = new class524();
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field10185[5] + arg0 + ',' + (arg1 == null ? field10185[3] : field10185[2]) + ',' + (arg2 == null ? field10185[3] : field10185[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ifa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5192(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ifa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5193(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 102;
                    break;
                case 1:
                    var10005 = 1;
                    break;
                case 2:
                    var10005 = 114;
                    break;
                case 3:
                    var10005 = 54;
                    break;
                default:
                    var10005 = 76;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
