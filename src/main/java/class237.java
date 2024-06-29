import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class237 {

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Z")
    public boolean field3308 = false;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field3312 = 0;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "[S")
    public static short[] field3313 = new short[256];

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public int field3311;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public int field3314;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Los;")
    public static class129 field3304;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "Lir;")
    public static class185 field3317;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "[Ll;")
    public static class315[] field3307;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1534(int arg0, long arg1) {
        field3309++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class40.field608[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            if (arg0 != -663656095) {
                method1541(-57, 50, -36, -72);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static void method1535(byte arg0) {
        field3317 = null;
        field3313 = null;
        field3307 = null;
        if (arg0 != -20) {
            field3313 = null;
        }
        field3304 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIIILjava/lang/String;)V")
    public static final void method1536(String arg0, String arg1, String arg2, boolean arg3, int arg4, int arg5, int arg6, String arg7) {
        for (int var8 = 99; var8 > 0; var8--) {
            class31.field510[var8] = class31.field510[var8 - 1];
            class68.field987[var8] = class68.field987[var8 - 1];
            class356.field5271[var8] = class356.field5271[var8 - 1];
            class232.field3225[var8] = class232.field3225[var8 - 1];
            class278.field4080[var8] = class278.field4080[var8 - 1];
            class24.field431[var8] = class24.field431[var8 - 1];
            class43.field634[var8] = class43.field634[var8 - 1];
        }
        field3306++;
        class31.field510[0] = arg5;
        class68.field987[0] = arg6;
        class356.field5271[0] = arg2;
        class232.field3225[0] = arg7;
        class278.field4080[0] = arg1;
        class440.field6371++;
        class24.field431[0] = arg0;
        class58.field865 = class394.field5732;
        if (!arg3) {
            field3312 = -30;
        }
        class43.field634[0] = arg4;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)V")
    public static final void method1537(byte arg0, int arg1) {
        field3322++;
        class381.field5585 = arg1;
        class51 var2 = class322.field4795;
        synchronized (class322.field4795) {
            class322.field4795.method372(125);
            if (arg0 != 67) {
                field3312 = 60;
            }
        }
        class51 var3 = class269.field3986;
        synchronized (class269.field3986) {
            class269.field3986.method372(116);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILfb;)V")
    public final void method1538(int arg0, int arg1, class341 arg2) {
        if (arg0 != 0) {
            method1545(30, 87, 54, -29, 21, -9, -22);
        }
        field3315++;
        while (true) {
            int var4 = arg2.method2233((byte) 104);
            if (var4 == 0) {
                return;
            }
            this.method1540(var4, arg0 ^ 0xFFFFFFFB, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)Z")
    public final boolean method1539(int arg0) {
        field3316++;
        return arg0 > -1 ? true : class425.field6206.method1205((byte) -48, this.field3311);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILfb;)V")
    private final void method1540(int arg0, int arg1, int arg2, class341 arg3) {
        if (arg1 != -5) {
            method1534(-96, -40L);
        }
        if (arg0 == 1) {
            this.field3311 = arg3.method2239(-1076227960);
        } else if (arg0 == 2) {
            this.field3314 = arg3.method2249(32767);
        } else if (arg0 == 3) {
            this.field3308 = true;
        } else if (arg0 == 4) {
            this.field3311 = -1;
        }
        field3318++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII)V")
    public static final void method1541(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 << 3;
        int var5 = arg0 << 3;
        int var6 = -34 % ((arg1 - 1) / 59);
        int var7 = arg2 << 3;
        field3305++;
        class39.field588 = (float) var5;
        class247.field3479 = (float) var4;
        if (class212.field2884 == 2) {
            class47.field716 = var5;
            class271.field3998 = var7;
            class7.field88 = var4;
        }
        class356.method2342((byte) -125);
        class164.field2233 = true;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILrr;ZZLrr;Z)I")
    public static final int method1542(int arg0, int arg1, class184 arg2, boolean arg3, boolean arg4, class184 arg5, boolean arg6) {
        field3310++;
        int var7 = class235.method1528(arg1, arg5, arg2, (byte) -127, arg4);
        if (var7 != 0) {
            return arg4 ? -var7 : var7;
        } else if (arg0 == -1) {
            return 0;
        } else {
            if (!arg6) {
                field3307 = null;
            }
            int var8 = class235.method1528(arg0, arg5, arg2, (byte) -128, arg3);
            return arg3 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ltj;IIZ)Ll;")
    public final class315 method1543(class298 arg0, int arg1, int arg2, boolean arg3) {
        field3319++;
        if (arg2 != 3) {
            field3307 = null;
        }
        long var5 = (long) (arg0.field4492 << 19 | (arg3 ? 262144 : 0) | this.field3311 | arg1 << 16);
        class315 var7 = (class315) class425.field6204.method378((byte) 28, var5);
        if (var7 != null) {
            return var7;
        } else if (class425.field6206.method1205((byte) -48, this.field3311)) {
            class10 var8 = class10.method88(class425.field6206, this.field3311, 0);
            if (var8 != null) {
                var8.field181 = var8.field186 = var8.field185 = var8.field188 = 0;
                if (arg3) {
                    var8.method83();
                }
                for (int var9 = 0; var9 < arg1; var9++) {
                    var8.method77();
                }
            }
            class315 var10 = arg0.method463(var8, true);
            if (var10 != null) {
                class425.field6204.method367(var5, var10, true);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method1544(long arg0, int arg1) {
        field3321++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        }
        if (arg1 != 11764) {
            field3307 = null;
        }
        if (arg0 % 37L == 0L) {
            return null;
        }
        int var3 = 0;
        long var4 = arg0;
        while (var4 != 0L) {
            var4 /= 37L;
            var3++;
        }
        StringBuffer var6 = new StringBuffer(var3);
        while (arg0 != 0L) {
            long var7 = arg0;
            arg0 /= 37L;
            var6.append(class40.field608[(int) (var7 - (arg0 * 37L))]);
        }
        return var6.reverse().toString();
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (class246 var7 = (class246) class354.field5254.method54((byte) 18); var7 != null; var7 = (class246) class354.field5254.method53((byte) 126)) {
            if (var7.field3459 <= class231.field3179) {
                var7.method2308(-34);
            } else {
                class158.method1054(arg1, 3, (var7.field3466 << 7) + 64, arg6 >> 1, var7.field3462 * 2, arg5 >> 1, arg2, (var7.field3467 << 7) + 64);
                class199.field2756.method925(0, var7.field3468, arg3 + class53.field814[0], var7.field3456 | 0xFF000000, arg4 + 3579, arg0 - -class53.field814[1]);
            }
        }
        if (arg4 == -26557) {
            field3320++;
        }
    }
}
