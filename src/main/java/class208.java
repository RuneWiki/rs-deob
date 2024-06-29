import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class208 {

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Lph;")
    public static class229 field3425 = class266.method1858("hitmarks", 0);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Lvm;")
    public static class202 field3419 = new class202(100);

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Lph;")
    private static class229 field3427 = class266.method1858("Loading interfaces )2 ", 0);

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Lph;")
    public static class229 field3426 = field3427;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "Lvm;")
    public static class202 field3428 = new class202(64);

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field3429 = 0;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "Lph;")
    public static class229 field3430 = class266.method1858(")3", 0);

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Lph;")
    public static class229 field3431 = null;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "Lph;")
    public static class229 field3435 = class266.method1858("blinken3:", 0);

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "[I")
    public static int[] field3432;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLhb;)V", line = 6)
    public static final void method1446(byte arg0, class164 arg1) {
        field3422++;
        if (arg0 >= -100) {
            field3427 = (class229) null;
        }
        if (class102.field1738 != null) {
            try {
                class102.field1738.method4(0L, 0);
                class102.field1738.method5(arg1.field2668, arg1.field2670, (byte) -125, 24);
            } catch (Exception var3) {
            }
        }
        arg1.field2670 += 24;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILri;ZI)V", line = 30)
    public static final void method1447(int arg0, int arg1, class301 arg2, boolean arg3, int arg4) {
        int var5 = arg2.field4882;
        int var6 = arg2.field4923;
        if (arg2.field4956 == 0) {
            arg2.field4923 = arg2.field5037;
        } else if (arg2.field4956 == 1) {
            arg2.field4923 = arg4 - arg2.field5037;
        } else if (arg2.field4956 == 2) {
            arg2.field4923 = arg2.field5037 * arg4 >> 14;
        } else if (arg2.field4956 == 3) {
            if (arg2.field4920 == 2) {
                arg2.field4923 = (arg2.field5037 - 1) * arg2.field5046 + arg2.field5037 * 32;
            } else if (arg2.field4920 == 7) {
                arg2.field4923 = (arg2.field5037 - 1) * arg2.field5046 + arg2.field5037 * 115;
            }
        }
        if (arg2.field4957 == 0) {
            arg2.field4882 = arg2.field5026;
        } else if (arg2.field4957 == 1) {
            arg2.field4882 = arg1 - arg2.field5026;
        } else if (arg2.field4957 == 2) {
            arg2.field4882 = arg2.field5026 * arg1 >> 14;
        } else if (arg2.field4957 == 3) {
            if (arg2.field4920 == 2) {
                arg2.field4882 = arg2.field5026 * 32 + ((arg2.field5026 - 1) * arg2.field4904);
            } else if (arg2.field4920 == 7) {
                arg2.field4882 = (arg2.field5026 - 1) * arg2.field4904 + arg2.field5026 * 12;
            }
        }
        int var7 = -35 / ((arg0 + 13) / 58);
        field3423++;
        if (arg2.field4956 == 4) {
            arg2.field4923 = arg2.field4927 * arg2.field4882 / arg2.field5027;
        }
        if (arg2.field4957 == 4) {
            arg2.field4882 = arg2.field5027 * arg2.field4923 / arg2.field4927;
        }
        if (class40.field647 && (client.method2168(arg2) != 0 || arg2.field4920 == 0)) {
            if (arg2.field4882 < 5 && arg2.field4923 < 5) {
                arg2.field4923 = 5;
                arg2.field4882 = 5;
            } else {
                if (arg2.field4923 <= 0) {
                    arg2.field4923 = 5;
                }
                if (arg2.field4882 <= 0) {
                    arg2.field4882 = 5;
                }
            }
        }
        if (arg2.field4996 == 1337) {
            class52.field742 = arg2;
        }
        if (arg3 && arg2.field5048 != null && (arg2.field4923 != var6 || arg2.field4882 != var5)) {
            class157 var8 = new class157();
            var8.field2551 = arg2;
            var8.field2552 = arg2.field5048;
            class225.field3702.method1582(var8, 4);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V", line = 133)
    public static final void method1448(int arg0, int arg1, int arg2) {
        if (arg0 != 32) {
            return;
        }
        field3420++;
        class85.field1454[arg2] = arg1;
        class266 var3 = (class266) class179.field2941.method713(3365, (long) arg2);
        if (var3 == null) {
            class266 var4 = new class266(4611686018427387905L);
            class179.field2941.method710(var4, (byte) 127, (long) arg2);
        } else if (var3.field4477 != 4611686018427387905L) {
            var3.field4477 = class130.method935(false) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)Lpk;", line = 168)
    public static final class48 method1449(int arg0, int arg1, int arg2, int arg3) {
        class48 var4 = new class48();
        var4.field699 = arg2;
        field3424++;
        var4.field700 = arg1;
        class251.field4176.method710(var4, (byte) 112, (long) arg0);
        class60.method405(arg1, 114);
        class301 var5 = class206.method1440(arg0, (byte) -68);
        if (var5 != null) {
            class296.method2006(var5, 127);
        }
        if (class156.field2535 != null) {
            class296.method2006(class156.field2535, arg3 ^ 0xFFFFFF86);
            class156.field2535 = null;
        }
        int var6 = class314.field5337;
        if (arg3 != -8) {
            field3425 = (class229) null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            if (class66.method501(class53.field748[var7], -92)) {
                class157.method1126((byte) -111, var7);
            }
        }
        if (class314.field5337 == 1) {
            class186.field3027 = false;
            class329.method2253(class108.field1845, false, class156.field2537, class36.field595, class304.field5078);
        } else {
            class329.method2253(class108.field1845, false, class156.field2537, class36.field595, class304.field5078);
            int var8 = class213.field3517.method258(class134.field2183);
            for (int var9 = 0; var9 < class314.field5337; var9++) {
                int var10 = class213.field3517.method258(class263.method1834(var9, (byte) -116));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class108.field1845 = var8 + 8;
            class156.field2537 = class314.field5337 * 15 + 22;
        }
        if (var5 != null) {
            class103.method787(false, var5, 63);
        }
        class6.method42((byte) 109, arg1);
        if (class198.field3292 != -1) {
            class253.method1772(1, 0, class198.field3292);
        }
        return var4;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 247)
    public static void method1450(int arg0) {
        field3428 = null;
        field3427 = null;
        field3435 = null;
        int var1 = 118 % ((56 - arg0) / 37);
        field3426 = null;
        field3419 = null;
        field3432 = null;
        field3425 = null;
        field3431 = null;
        field3430 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIILrk;JZ)V", line = 264)
    public static final void method1451(int arg0, int arg1, int arg2, int arg3, class216 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class162 var8 = new class162();
        var8.field2607 = arg4;
        var8.field2611 = arg1 * 128 + 64;
        var8.field2613 = arg2 * 128 + 64;
        var8.field2608 = arg3;
        var8.field2615 = arg5;
        var8.field2612 = arg6;
        if (class225.field3705[arg0][arg1][arg2] == null) {
            class225.field3705[arg0][arg1][arg2] = new class72(arg0, arg1, arg2);
        }
        class225.field3705[arg0][arg1][arg2].field1225 = var8;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Lea;", line = 285)
    public static final class71 method1452(int arg0, int arg1) {
        field3421++;
        class71 var2 = (class71) class232.field3838.method1413((long) arg0, true);
        int var3 = 60 % ((-arg1 - 10) / 51);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class111.field1876.method523(-101, arg0, 16);
        class71 var5 = new class71();
        if (var4 != null) {
            var5.method558(true, new class164(var4));
        }
        class232.field3838.method1419((long) arg0, 5216, var5);
        return var5;
    }
}
