import java.io.IOException;
import java.lang.reflect.Method;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class273 {

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "J")
    public static long field4376 = 0L;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4384 = "scroll:";

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field4385 = 1;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field4380 = 0;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4382 = "cyan:";

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "Lnh;")
    public static class288 field4378;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gl", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field4388;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I[Lta;IB[BZ)V")
    public static final void method1790(int arg0, class189[] arg1, int arg2, byte arg3, byte[] arg4, boolean arg5) {
        int var6 = -1;
        field4375++;
        class101 var7 = new class101(arg4);
        while (true) {
            int var8 = var7.method664(-126);
            if (var8 == 0) {
                int var21 = 13 / ((arg3 + 30) / 34);
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method692(27029);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 6 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var7.method669((byte) 36);
                int var14 = var13 >> 2;
                int var15 = var9 & 0x3F;
                int var16 = var11 + arg2;
                int var17 = var13 & 0x3;
                int var18 = var15 + arg0;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    class189 var19 = null;
                    if (!arg5) {
                        int var20 = var12;
                        if ((class229.field3862[1][var16][var18] & 0x2) == 2) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg1[var20];
                        }
                    }
                    class29.method193(var17, var12, !arg5, var14, var18, arg5, var19, 335442796, var16, var6, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZIIZLjava/lang/String;JIIILjava/lang/String;Z)V")
    public static final void method1791(boolean arg0, int arg1, int arg2, boolean arg3, String arg4, long arg5, int arg6, int arg7, int arg8, String arg9, boolean arg10) {
        field4377++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class101 var14 = new class101(128);
        var14.method682(10, 22555);
        var14.method639((arg0 ? 4 : 0) | (arg10 ? 1 : 0) | (arg3 ? 2 : 0), 15267);
        var14.method640(21691, arg5);
        var14.method698(105, var12[0]);
        var14.method645(arg4, (byte) 120);
        var14.method698(-104, var12[1]);
        var14.method639(class191.field3090, 15267);
        var14.method682(arg1, 22555);
        var14.method682(arg8, 22555);
        var14.method698(-80, var12[2]);
        var14.method639(arg7, 15267);
        var14.method639(arg2, 15267);
        var14.method698(126, var12[3]);
        var14.method675(class262.field4267, class136.field2371, -2585);
        class101 var15 = new class101(350);
        var15.method645(arg9, (byte) 106);
        int var16 = 8 - (class285.method1904(arg9, (byte) 45) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method682((int) (Math.random() * 255.0D), 22555);
        }
        var15.method637(true, var12);
        class168.field2778.field1762 = 0;
        class168.field2778.method682(22, 22555);
        int var18 = 126 % ((-arg6 - 77) / 32);
        class168.field2778.method639(var15.field1762 + var14.field1762 + 2, 15267);
        class168.field2778.method639(539, 15267);
        class168.field2778.method678((byte) 0, var14.field1730, var14.field1762, 0);
        class168.field2778.method678((byte) 0, var15.field1730, var15.field1762, 0);
        class150.field2514 = 0;
        class54.field934 = 0;
        class139.field2396 = -3;
        class166.field2715 = 1;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public static void method1792(int arg0) {
        if (arg0 != 3) {
            field4385 = -37;
        }
        field4378 = null;
        field4382 = null;
        field4384 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public static final void method1793(byte arg0) {
        field4383++;
        if (class166.field2715 == 0) {
            return;
        }
        int var1 = -49 % ((40 - arg0) / 38);
        try {
            if (++class54.field934 > 2000) {
                if (class194.field3131 != null) {
                    class194.field3131.method1380(true);
                    class194.field3131 = null;
                }
                if (class150.field2514 >= 1) {
                    class139.field2396 = -5;
                    class166.field2715 = 0;
                    return;
                }
                class166.field2715 = 1;
                class150.field2514++;
                if (class4.field47 == class262.field4277) {
                    class4.field47 = class267.field4323;
                } else {
                    class4.field47 = class262.field4277;
                }
                class54.field934 = 0;
            }
            if (class166.field2715 == 1) {
                class88.field1572 = class127.field2238.method910((byte) 98, class21.field331, class4.field47);
                class166.field2715 = 2;
            }
            if (class166.field2715 == 2) {
                if (class88.field1572.field2857 == 2) {
                    throw new IOException();
                }
                if (class88.field1572.field2857 != 1) {
                    return;
                }
                class194.field3131 = new class207((Socket) class88.field1572.field2859, class127.field2238);
                class88.field1572 = null;
                class194.field3131.method1382(class168.field2778.field1730, class168.field2778.field1762, 0, (byte) -88);
                if (class154.field2576 != null) {
                    class154.field2576.method1712((byte) 32);
                }
                if (class259.field4243 != null) {
                    class259.field4243.method1712((byte) 32);
                }
                int var2 = class194.field3131.method1377(1);
                if (class154.field2576 != null) {
                    class154.field2576.method1712((byte) 32);
                }
                if (class259.field4243 != null) {
                    class259.field4243.method1712((byte) 32);
                }
                if (var2 != 21) {
                    class166.field2715 = 0;
                    class139.field2396 = var2;
                    class194.field3131.method1380(true);
                    class194.field3131 = null;
                    return;
                }
                class166.field2715 = 3;
            }
            if (class166.field2715 == 3) {
                if (class194.field3131.method1386(true) < 1) {
                    return;
                }
                class114.field2052 = new String[class194.field3131.method1377(-81)];
                class166.field2715 = 4;
            }
            if (class166.field2715 == 4 && class194.field3131.method1386(true) >= class114.field2052.length * 8) {
                class248.field4058.field1762 = 0;
                class194.field3131.method1390(class114.field2052.length * 8, 0, class248.field4058.field1730, true);
                for (int var3 = 0; var3 < class114.field2052.length; var3++) {
                    class114.field2052[var3] = class21.method145(class248.field4058.method694(false), 32481);
                }
                class166.field2715 = 0;
                class139.field2396 = 21;
                class194.field3131.method1380(true);
                class194.field3131 = null;
            }
        } catch (IOException var4) {
            if (class194.field3131 != null) {
                class194.field3131.method1380(true);
                class194.field3131 = null;
            }
            if (class150.field2514 < 1) {
                class166.field2715 = 1;
                class54.field934 = 0;
                if (class4.field47 == class262.field4277) {
                    class4.field47 = class267.field4323;
                } else {
                    class4.field47 = class262.field4277;
                }
                class150.field2514++;
            } else {
                class139.field2396 = -4;
                class166.field2715 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V")
    public static final void method1794(byte arg0) {
        field4381++;
        try {
            if (arg0 != 112) {
                method1790(-83, (class189[]) null, -21, (byte) 3, (byte[]) null, true);
            }
            Method var1 = (field4388 == null ? (field4388 = method1798("java.lang.Runtime")) : field4388).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class56.field982 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
    public static final void method1795(int arg0, int arg1) {
        if (arg0 >= -26) {
            field4376 = 93L;
        }
        field4386++;
        if (!class110.method766(-13786, arg1)) {
            return;
        }
        class46[] var2 = class115.field2068[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class46 var4 = var2[var3];
            if (var4 != null) {
                var4.field760 = 0;
                var4.field802 = 0;
                var4.field643 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)V")
    public static final void method1796(byte arg0, int arg1) {
        field4379++;
        class252.field4130.method63(0, arg1);
        class188.field3047.method63(0, arg1);
        if (arg0 < 113) {
            field4385 = -83;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI[Ldl;)V")
    public static final void method1797(byte arg0, int arg1, class46[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class46 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field812 == 0) {
                    if (var4.field785 != null) {
                        method1797((byte) -115, arg1, var4.field785);
                    }
                    class194 var5 = (class194) class41.field607.method779(-121, (long) var4.field786);
                    if (var5 != null) {
                        class252.method1670(var5.field3128, arg1, (byte) -88);
                    }
                }
                if (arg1 == 0 && var4.field766 != null) {
                    class198 var6 = new class198();
                    var6.field3205 = var4;
                    var6.field3204 = var4.field766;
                    class71.method434(-10521, var6);
                }
                if (arg1 == 1 && var4.field705 != null) {
                    if (var4.field704 >= 0) {
                        class46 var7 = class108.method760(-29533, var4.field786);
                        if (var7 == null || var7.field785 == null || var4.field704 >= var7.field785.length || var7.field785[var4.field704] != var4) {
                            continue;
                        }
                    }
                    class198 var8 = new class198();
                    var8.field3204 = var4.field705;
                    var8.field3205 = var4;
                    class71.method434(-10521, var8);
                }
            }
        }
        if (arg0 >= -21) {
            method1796((byte) 39, -62);
        }
        field4387++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1798(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
