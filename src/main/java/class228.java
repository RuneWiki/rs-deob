import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jka")
public class class228 extends class687 {

    @OriginalMember(owner = "client!jka", name = "z", descriptor = "Z")
    public boolean field3301;

    @OriginalMember(owner = "client!jka", name = "M", descriptor = "I")
    public int field3311;

    @OriginalMember(owner = "client!jka", name = "t", descriptor = "I")
    public int field3297;

    @OriginalMember(owner = "client!jka", name = "Q", descriptor = "Z")
    public boolean field3308;

    @OriginalMember(owner = "client!jka", name = "v", descriptor = "Z")
    public boolean field3295;

    @OriginalMember(owner = "client!jka", name = "L", descriptor = "I")
    public int field3298;

    @OriginalMember(owner = "client!jka", name = "N", descriptor = "I")
    public int field3304;

    @OriginalMember(owner = "client!jka", name = "I", descriptor = "J")
    public long field3299;

    @OriginalMember(owner = "client!jka", name = "E", descriptor = "Ljava/lang/String;")
    public String field3292;

    @OriginalMember(owner = "client!jka", name = "A", descriptor = "J")
    public long field3303;

    @OriginalMember(owner = "client!jka", name = "P", descriptor = "I")
    public int field3313;

    @OriginalMember(owner = "client!jka", name = "J", descriptor = "Ljava/lang/String;")
    public String field3294;

    @OriginalMember(owner = "client!jka", name = "K", descriptor = "[Ljava/lang/String;")
    private static final String[] field3314 = new String[] { method1903(method1902("6|")), method1903(method1902("*7WOau7[@?uj")), method1903(method1902("x!TO")), method1903(method1902("|?Y\r\u001f>")), method1903(method1902("*7WOap2^E:pj")), method1903(method1902("6y\u0006\u0003`u;T\u001e:p2^E:(")), method1903(method1902("mz\u0016\r!")), method1903(method1902("|?Y\r\u001e>")), method1903(method1902("|?Y\r\u001a>")), method1903(method1902("|?Y\r`\u007f:QWb>")), method1903(method1902("|?Y\r\u0019>")), method1903(method1902("|?Y\r\u001b>")), method1903(method1902("|?Y\r\u001d>")), method1903(method1902("|?Y\r\u0018>")) };

    @OriginalMember(owner = "client!jka", name = "w", descriptor = "Z")
    public static boolean field3307 = false;

    @OriginalMember(owner = "client!jka", name = "u", descriptor = "Lsb;")
    public static class261 field3306 = new class261(6, -1);

    @OriginalMember(owner = "client!jka", name = "C", descriptor = "Lsb;")
    public static class261 field3310 = new class261(99, 7);

    @OriginalMember(owner = "client!jka", name = "O", descriptor = "I")
    public static int field3312 = 0;

    @OriginalMember(owner = "client!jka", name = "y", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!jka", name = "F", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!jka", name = "H", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!jka", name = "G", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!jka", name = "B", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!jka", name = "D", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!jka", name = "x", descriptor = "Ljava/lang/String;")
    public String field3300;

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(IZIIIZZ)V")
    public static final void method1895(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        try {
            if (arg2 < arg3) {
                int var7 = (arg2 + arg3) / 2;
                int var8 = arg2;
                class728 var9 = class390.field5689[var7];
                class390.field5689[var7] = class390.field5689[arg3];
                class390.field5689[arg3] = var9;
                for (int var10 = arg2; var10 < arg3; var10++) {
                    if (class694.method4949(arg5, var9, class390.field5689[var10], arg0, arg4, arg1, -123) <= 0) {
                        class728 var11 = class390.field5689[var10];
                        class390.field5689[var10] = class390.field5689[var8];
                        class390.field5689[var8++] = var11;
                    }
                }
                class390.field5689[arg3] = class390.field5689[var8];
                class390.field5689[var8] = var9;
                method1895(arg0, arg1, arg2, var8 - 1, arg4, arg5, true);
                method1895(arg0, arg1, var8 + 1, arg3, arg4, arg5, true);
            }
            if (!arg6) {
                method1895(-40, false, -112, -34, 68, false, true);
            }
            field3296++;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field3314[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(B)V")
    public static void method1896(byte arg0) {
        try {
            field3306 = null;
            field3310 = null;
            if (arg0 != -71) {
                field3307 = true;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3314[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(ZLem;Z)V")
    public static final void method1897(boolean arg0, class339 arg1, boolean arg2) {
        try {
            field3291++;
            if (class72.field1049 < 400) {
                if (arg0) {
                    method1899(-15, null);
                }
                if (class203.field2988 != arg1) {
                    String var3;
                    if (arg1.field4935 == 0) {
                        boolean var4 = true;
                        if (class203.field2988.field4911 != -1 && arg1.field4911 != -1) {
                            int var5 = arg1.field4911 <= class203.field2988.field4911 ? arg1.field4911 : class203.field2988.field4911;
                            int var6 = class203.field2988.field4940 - arg1.field4940;
                            if (var6 < 0) {
                                var6 = -var6;
                            }
                            if (var5 < var6) {
                                var4 = false;
                            }
                        }
                        String var7 = class544.field7978 == class316.field4323 ? class537.field7860.method4068((byte) -95, class405.field5883) : class537.field7858.method4068((byte) -44, class405.field5883);
                        if (arg1.field4942 <= arg1.field4940) {
                            var3 = arg1.method2717(true, -1) + (var4 ? class422.method3281(arg1.field4940, (byte) 102, class203.field2988.field4940) : field3314[4]) + field3314[0] + var7 + arg1.field4940 + ")";
                        } else {
                            var3 = arg1.method2717(true, -1) + (var4 ? class422.method3281(arg1.field4940, (byte) 113, class203.field2988.field4940) : field3314[4]) + field3314[0] + var7 + arg1.field4940 + "+" + (arg1.field4942 - arg1.field4940) + ")";
                        }
                    } else if (arg1.field4935 == -1) {
                        var3 = arg1.method2717(true, -1);
                    } else {
                        var3 = arg1.method2717(true, -1) + field3314[0] + class537.field7859.method4068((byte) -103, class405.field5883) + arg1.field4935 + ")";
                    }
                    if (class351.field5091 && !arg2 && (class140.field1826 & 0x8) != 0) {
                        class86.field1218++;
                        class751.method5441(class121.field1534, class109.field1426 + field3314[5] + var3, 0, -1, (long) arg1.field2200, true, class268.field3795, -1, false, 0, false, 48, (long) arg1.field2200);
                    }
                    if (arg2) {
                        class751.method5441(-1, "", 0, -1, (long) arg1.field2200, false, field3314[1] + var3, 0, false, 0, true, -1, 0L);
                    } else {
                        for (int var8 = 7; var8 >= 0; var8--) {
                            if (class787.field11367[var8] != null) {
                                short var9 = 0;
                                if (class544.field7978 == class378.field5530 && class787.field11367[var8].equalsIgnoreCase(class537.field7853.method4068((byte) -88, class405.field5883))) {
                                    if (class325.field4448 && arg1.field4940 > class203.field2988.field4940) {
                                        var9 = 2000;
                                    }
                                    if (class203.field2988.field4936 == 0 || arg1.field4936 == 0) {
                                        if (arg1.field4910) {
                                            var9 = 2000;
                                        }
                                    } else if (class203.field2988.field4936 == arg1.field4936) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                } else if (class281.field3963[var8]) {
                                    var9 = 2000;
                                }
                                short var10 = (short) (class167.field2144[var8] + var9);
                                int var11 = class190.field2523[var8] == -1 ? class487.field7153 : class190.field2523[var8];
                                class751.method5441(var11, field3314[4] + var3, 0, -1, (long) arg1.field2200, true, class787.field11367[var8], -1, false, 0, false, var10, (long) arg1.field2200);
                                class651.field9247++;
                            }
                        }
                    }
                    if (!arg2) {
                        for (class228 var12 = (class228) class45.field644.method3977((byte) -51); var12 != null; var12 = (class228) class45.field644.method3987(0)) {
                            if (var12.field3311 == 17) {
                                var12.field3300 = field3314[4] + var3;
                                return;
                            }
                        }
                    }
                } else if (class351.field5091 && (class140.field1826 & 0x10) != 0) {
                    class751.method5441(class121.field1534, class109.field1426 + field3314[5] + class537.field7867.method4068((byte) -113, class405.field5883), 0, -1, (long) arg1.field2200, true, class268.field3795, -1, false, 0, false, 21, 0L);
                    class563.field8242++;
                }
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field3314[3] + arg0 + ',' + (arg1 == null ? field3314[2] : field3314[6]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(Z)V")
    public static final void method1898(boolean arg0) {
        try {
            field3309++;
            if (class376.field5495 != null) {
                for (int var1 = 0; var1 < class740.field10526; var1++) {
                    class376.field5495[var1] = null;
                }
                class376.field5495 = null;
            }
            if (class601.field8604 != null) {
                for (int var2 = 0; var2 < class119.field1510; var2++) {
                    class601.field8604[var2] = null;
                }
                class601.field8604 = null;
            }
            if (class503.field7357 != null) {
                for (int var3 = 0; var3 < class151.field1936; var3++) {
                    class503.field7357[var3] = null;
                }
                class503.field7357 = null;
            }
            if (arg0) {
                method1897(false, null, true);
            }
            class117.field1492 = null;
            class518.field7582 = -1;
            class29.field372 = -1;
            class715.field10184 = null;
            class654.field9283 = null;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3314[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(ILrs;)V")
    public static final void method1899(int arg0, class297 arg1) {
        try {
            arg1.field4150 = null;
            field3305++;
            int var2 = arg1.field4153.length;
            for (int var3 = 0; var3 < var2; var3++) {
                arg1.field4153[var3].field7769 = false;
            }
            class470[] var4 = class236.field3400;
            synchronized (class236.field3400) {
                if (arg0 == -201 && var2 < class236.field3400.length && class124.field1565[var2] < 200) {
                    class236.field3400[var2].method3618(arg1, 109);
                    int var10002 = class124.field1565[var2]++;
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field3314[8] + arg0 + ',' + (arg1 == null ? field3314[2] : field3314[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1900(int arg0, int arg1, boolean arg2) {
        try {
            if (!arg2) {
                method1901(-55, 61, 111, -33, (byte) -80);
            }
            field3302++;
            return class560.method4187(arg1, -1264, arg0) | (arg1 & 0x70000) != 0 || class669.method4817(arg0, (byte) 110, arg1);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3314[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(IIIIB)V")
    public static final void method1901(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        try {
            if (arg4 == 121) {
                field3293++;
                if (arg1 <= arg2) {
                    for (int var5 = arg1; var5 < arg2; var5++) {
                        class529.field7682[var5][arg3] = arg0;
                    }
                } else {
                    for (int var6 = arg2; var6 < arg1; var6++) {
                        class529.field7682[var6][arg3] = arg0;
                    }
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field3314[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jka", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
    public class228(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        try {
            this.field3301 = arg11;
            this.field3311 = arg3;
            this.field3297 = arg7;
            this.field3308 = arg9;
            this.field3295 = arg8;
            this.field3298 = arg6;
            this.field3304 = arg2;
            this.field3299 = arg5;
            this.field3292 = arg0;
            this.field3303 = arg10;
            this.field3313 = arg4;
            this.field3294 = arg1;
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field3314[9] + (arg0 == null ? field3314[2] : field3314[6]) + ',' + (arg1 == null ? field3314[2] : field3314[6]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!jka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1902(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1903(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 22;
                    break;
                case 1:
                    var10005 = 84;
                    break;
                case 2:
                    var10005 = 56;
                    break;
                case 3:
                    var10005 = 35;
                    break;
                default:
                    var10005 = 92;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
