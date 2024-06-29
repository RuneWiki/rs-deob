import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public abstract class class390 {

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field5320 = 0;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "Lp;")
    public static class161 field5321;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "Lcq;")
    public static class72 field5324;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public int field5316;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public int field5318;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public int field5322;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static final void method2418(int arg0) {
        class215.field2658.method2167(-110);
        field5317++;
        int var1 = class215.field2658.method2171(1, 125);
        if (var1 == 0) {
            return;
        }
        int var2 = class215.field2658.method2171(2, 96);
        if (var2 == 0) {
            class332.field4530[class341.field4651++] = 2047;
        } else if (var2 == 1) {
            int var3 = class215.field2658.method2171(3, 95);
            class143.field1684.method840(var3, (byte) 56, 1);
            int var4 = class215.field2658.method2171(1, 103);
            if (var4 == 1) {
                class332.field4530[class341.field4651++] = 2047;
            }
        } else {
            if (arg0 >= -46) {
                method2426(39, (String) null, -112, (byte) -6, -38, (String) null, false, true, 64L, -125, true);
            }
            if (var2 == 2) {
                if (class215.field2658.method2171(1, 107) == 1) {
                    int var5 = class215.field2658.method2171(3, 73);
                    class143.field1684.method840(var5, (byte) 75, 2);
                    int var6 = class215.field2658.method2171(3, 96);
                    class143.field1684.method840(var6, (byte) 120, 2);
                } else {
                    int var7 = class215.field2658.method2171(3, 90);
                    class143.field1684.method840(var7, (byte) 114, 0);
                }
                int var8 = class215.field2658.method2171(1, 77);
                if (var8 == 1) {
                    class332.field4530[class341.field4651++] = 2047;
                }
            } else if (var2 == 3) {
                int var9 = class215.field2658.method2171(7, 91);
                int var10 = class215.field2658.method2171(7, 111);
                int var11 = class215.field2658.method2171(1, 89);
                class43.field513 = class215.field2658.method2171(2, 92);
                int var12 = class215.field2658.method2171(1, 123);
                if (var12 == 1) {
                    class332.field4530[class341.field4651++] = 2047;
                }
                class143.field1684.method842(var11 == 1, var10, (byte) 125, class43.field513, var9);
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)Z")
    public final boolean method2419(int arg0) {
        field5313++;
        if (arg0 != 0) {
            method2427(false, 114);
        }
        return (this.field5322 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)Z")
    public final boolean method2420(int arg0) {
        field5323++;
        int var2 = -36 / (-arg0 / 58);
        return (this.field5322 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)Z")
    public final boolean method2421(byte arg0) {
        field5310++;
        if (arg0 == -67) {
            return (this.field5322 & 0x8) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)Lfo;")
    public static final class12 method2422(int arg0, int arg1, int arg2) {
        field5314++;
        class12 var3 = (class12) class27.field304.method2218(1, (long) arg2 << 32 | (long) arg1);
        if (var3 == null) {
            var3 = new class12(arg2, arg1);
            class27.field304.method2227(var3, -8218, var3.field505);
        }
        if (arg0 != 341555040) {
            field5309 = -59;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V")
    public static void method2423(int arg0) {
        field5321 = null;
        if (arg0 <= 48) {
            field5320 = 74;
        }
        field5324 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIII)V")
    public static final void method2424(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -1) {
            field5325 = 61;
        }
        if (class96.field1136 != 0 && arg0 != 0 && class420.field5754 < 50 && arg1 != -1) {
            class107.field1286[class420.field5754] = arg1;
            class195.field2317[class420.field5754] = arg0;
            class30.field329[class420.field5754] = arg3;
            class92.field1074[class420.field5754] = null;
            class186.field2158[class420.field5754] = 0;
            class330.field4504[class420.field5754] = arg2;
            class420.field5754++;
        }
        field5312++;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)Z")
    public final boolean method2425(byte arg0) {
        if (arg0 == 74) {
            field5311++;
            return (this.field5322 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILjava/lang/String;IBILjava/lang/String;ZZJIZ)V")
    public static final void method2426(int arg0, String arg1, int arg2, byte arg3, int arg4, String arg5, boolean arg6, boolean arg7, long arg8, int arg9, boolean arg10) {
        field5315++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class242 var14 = new class242(128);
        var14.method1593(10, -95);
        var14.method1573(-6266, (arg6 ? 2 : 0) | (arg10 ? 1 : 0) | (arg7 ? 4 : 0));
        var14.method1591(arg3 + 2013886411, arg8);
        var14.method1560(arg3 - 26481, var12[0]);
        var14.method1562(91, arg5);
        var14.method1560(-26356, var12[1]);
        var14.method1573(-6266, class333.field4549);
        var14.method1593(arg9, -94);
        var14.method1593(arg2, -98);
        var14.method1560(arg3 - 26481, var12[2]);
        var14.method1573(-6266, arg4);
        var14.method1573(-6266, arg0);
        var14.method1560(arg3 - 26481, var12[3]);
        var14.method1594(arg3 - 188, class4.field28, class349.field4747);
        class242 var15 = new class242(350);
        var15.method1562(106, arg1);
        int var16 = 8 - (class350.method2229(2, arg1) % 8);
        if (arg3 != 125) {
            method2424(-33, 12, -83, 18, 53);
        }
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1593((int) (Math.random() * 255.0D), arg3 ^ 0xFFFFFFD8);
        }
        var15.method1556(var12, -101);
        class427.field5837.field3211 = 0;
        class427.field5837.method1593(22, -103);
        class427.field5837.method1573(-6266, var14.field3211 + var15.field3211 + 2);
        class427.field5837.method1573(-6266, 568);
        class427.field5837.method1544(var14.field3211, 121, 0, var14.field3188);
        class427.field5837.method1544(var15.field3211, -44, 0, var15.field3188);
        class265.field3417 = 0;
        class102.field1189 = 1;
        class80.field981 = 0;
        class388.field5299 = -3;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V")
    public static final void method2427(boolean arg0, int arg1) {
        if (arg1 != 0) {
            field5324 = null;
        }
        field5319++;
        if (class17.field185 != arg0) {
            class17.field185 = arg0;
            class54.method307(5748);
        }
    }

    static {
        new class72("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        field5321 = new class161();
        new class72((String) null, "bevor du die Option 'Regelverstoß melden' benutzt.", (String) null, (String) null);
        field5324 = new class72("K", "T", "K", "K");
    }
}
