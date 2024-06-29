import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class105 extends class83 {

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "Lrc;")
    public class121 field2381 = new class121();

    @OriginalMember(owner = "client!pa", name = "jb", descriptor = "Lia;")
    public class57 field2405 = new class57();

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "Lh;")
    private class49 field2391;

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
    public static int field2380 = 0;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "Lsc;")
    private static class128 field2377 = class129.method1017(false, "Password: ");

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "I")
    public static int field2389 = 0;

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "[[S")
    public static short[][] field2388 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "[I")
    public static int[] field2378 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "I")
    public static int field2392 = 0;

    @OriginalMember(owner = "client!pa", name = "Y", descriptor = "[Lsc;")
    public static class128[] field2394 = new class128[500];

    @OriginalMember(owner = "client!pa", name = "eb", descriptor = "[I")
    public static int[] field2400 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    public static int field2376 = 0;

    @OriginalMember(owner = "client!pa", name = "fb", descriptor = "Lsc;")
    public static class128 field2401 = class129.method1017(false, "k");

    @OriginalMember(owner = "client!pa", name = "hb", descriptor = "Lsc;")
    public static class128 field2403 = field2377;

    @OriginalMember(owner = "client!pa", name = "ib", descriptor = "Lsc;")
    public static class128 field2404 = class129.method1017(false, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!pa", name = "ab", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!pa", name = "cb", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!pa", name = "kb", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "Lsf;")
    public static class131 field2386;

    @OriginalMember(owner = "client!pa", name = "db", descriptor = "Z")
    public static boolean field2399;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "[Lsc;")
    public static class128[] field2379;

    @OriginalMember(owner = "client!pa", name = "bb", descriptor = "[Li;")
    public static class56[] field2397;

    @OriginalMember(owner = "client!pa", name = "gb", descriptor = "[Lb;")
    public static class8[] field2402;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BJ)V")
    public static final void method784(byte arg0, long arg1) {
        field2387++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 != -76) {
            method786(null, -60, -94, -90, -106);
        }
        for (int var3 = 0; var3 < class151.field3476; var3++) {
            if (class51.field1033[var3] == arg1) {
                class151.field3476--;
                class69.field1546++;
                for (int var4 = var3; var4 < class151.field3476; var4++) {
                    class51.field1033[var4] = class51.field1033[var4 + 1];
                    class148.field3415[var4] = class148.field3415[var4 + 1];
                }
                class75.field1648 = class135.field3186;
                class152.field3502.method507(56, 178);
                class152.field3502.method651(-1070186000, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Llf;IZ)V")
    private final void method785(class82 arg0, int arg1, boolean arg2) {
        if ((this.field2391.field930[arg0.field1830] & 0x4) != 0 && arg0.field1815 < 0) {
            int var4 = this.field2391.field907[arg0.field1830] / class49.field920;
            int var5 = (var4 + 1048575 - arg0.field1823) / var4;
            arg0.field1823 = arg1 * var4 + arg0.field1823 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field2391.field902[arg0.field1830] == 0) {
                    arg0.field1834 = class107.method816(arg0.field1831, arg0.field1834.method803(), arg0.field1834.method832(), arg0.field1834.method800());
                } else {
                    arg0.field1834 = class107.method816(arg0.field1831, arg0.field1834.method803(), 0, arg0.field1834.method800());
                    this.field2391.method348(arg0.field1846.field351[arg0.field1817] < 0, arg0, 2);
                }
                if (arg0.field1846.field351[arg0.field1817] < 0) {
                    arg0.field1834.method814(-1);
                }
                arg1 = arg0.field1823 / var4;
            }
        }
        arg0.field1834.method360(arg1);
        if (arg2) {
            method784((byte) 115, -100L);
        }
        field2393++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "()Lm;")
    public final class83 method353() {
        field2383++;
        class82 var1 = (class82) this.field2381.method920((byte) -63);
        if (var1 == null) {
            return null;
        } else if (var1.field1834 == null) {
            return this.method377();
        } else {
            return var1.field1834;
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "()I")
    public final int method357() {
        field2406++;
        return 0;
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "()Lm;")
    public final class83 method377() {
        field2398++;
        class82 var1;
        do {
            var1 = (class82) this.field2381.method932(-6);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1834 == null);
        return var1.field1834;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lsc;IIII)V")
    public static final void method786(class128 arg0, int arg1, int arg2, int arg3, int arg4) {
        field2396++;
        class54 var5 = class152.method1210(arg4, false, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field1113 != null) {
            class18 var6 = new class18();
            var6.field314 = var5;
            var6.field315 = arg1;
            var6.field321 = var5.field1113;
            var6.field331 = arg0;
            class46.method341(var6, arg3 ^ 0xA28);
        }
        boolean var7 = true;
        if (var5.field1078 > 0) {
            var7 = class14.method146((byte) 126, var5);
        }
        if (!var7 || !class143.method1165(31740, arg1 + arg3, class77.method561(107, var5))) {
            return;
        }
        if (arg1 == 1) {
            class152.field3502.method507(113, 50);
            class152.field3502.method649(-88, arg4);
            class71.field1583++;
            class152.field3502.method631(arg2, (byte) 126);
        }
        if (arg1 == 2) {
            class152.field3502.method507(-121, 157);
            class5.field44++;
            class152.field3502.method649(-44, arg4);
            class152.field3502.method631(arg2, (byte) 106);
        }
        if (arg1 == 3) {
            class152.field3502.method507(arg3 ^ 0x53, 135);
            class152.field3502.method649(-122, arg4);
            class152.field3502.method631(arg2, (byte) 122);
            class64.field1389++;
        }
        if (arg1 == 4) {
            class152.field3502.method507(124, 133);
            class112.field2539++;
            class152.field3502.method649(-24, arg4);
            class152.field3502.method631(arg2, (byte) 120);
        }
        if (arg1 == 5) {
            class152.field3502.method507(102, 189);
            class152.field3502.method649(-51, arg4);
            class89.field2032++;
            class152.field3502.method631(arg2, (byte) 112);
        }
        if (arg1 == 6) {
            class152.field3502.method507(-120, 76);
            class9.field137++;
            class152.field3502.method649(-97, arg4);
            class152.field3502.method631(arg2, (byte) 92);
        }
        if (arg1 == 7) {
            class70.field1581++;
            class152.field3502.method507(-89, 102);
            class152.field3502.method649(-45, arg4);
            class152.field3502.method631(arg2, (byte) 91);
        }
        if (arg1 == 8) {
            class152.field3502.method507(-110, 252);
            class152.field3502.method649(-52, arg4);
            class90.field2045++;
            class152.field3502.method631(arg2, (byte) 116);
        }
        if (arg1 == 9) {
            class152.field3502.method507(arg3 ^ 0xFFFFFFA0, 77);
            class19.field345++;
            class152.field3502.method649(-53, arg4);
            class152.field3502.method631(arg2, (byte) 95);
        }
        if (arg1 == 10) {
            class148.field3420++;
            class152.field3502.method507(arg3 + 83, 94);
            class152.field3502.method649(-90, arg4);
            class152.field3502.method631(arg2, (byte) 93);
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
    public static void method787(int arg0) {
        field2377 = null;
        if (arg0 >= -117) {
            method786(null, -86, -122, -75, 1);
        }
        field2401 = null;
        field2397 = null;
        field2404 = null;
        field2388 = null;
        field2402 = null;
        field2378 = null;
        field2386 = null;
        field2379 = null;
        field2403 = null;
        field2400 = null;
        field2394 = null;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public final void method360(int arg0) {
        field2385++;
        this.field2405.method360(arg0);
        for (class82 var2 = (class82) this.field2381.method920((byte) -60); var2 != null; var2 = (class82) this.field2381.method932(-6)) {
            if (!this.field2391.method365(var2, 123)) {
                int var3 = arg0;
                do {
                    if (var2.field1829 >= var3) {
                        this.method785(var2, var3, false);
                        var2.field1829 -= var3;
                        break;
                    }
                    this.method785(var2, var2.field1829, false);
                    var3 -= var2.field1829;
                } while (!this.field2391.method366(92, null, var2, var3, 0));
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([IIIIILlf;)V")
    private final void method788(int[] arg0, int arg1, int arg2, int arg3, int arg4, class82 arg5) {
        if ((this.field2391.field930[arg5.field1830] & 0x4) != 0 && arg5.field1815 < 0) {
            int var7 = this.field2391.field907[arg5.field1830] / class49.field920;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field1823) / var7;
                if (arg3 < var8) {
                    arg5.field1823 += arg3 * var7;
                    break;
                }
                arg5.field1834.method372(arg0, arg4, var8);
                arg5.field1823 += var7 * var8 - 1048576;
                arg4 += var8;
                arg3 -= var8;
                int var9 = class49.field920 / 100;
                int var10 = 262144 / var7;
                class107 var11 = arg5.field1834;
                if (var9 > var10) {
                    var9 = var10;
                }
                if (this.field2391.field902[arg5.field1830] == 0) {
                    arg5.field1834 = class107.method816(arg5.field1831, var11.method803(), var11.method832(), var11.method800());
                } else {
                    arg5.field1834 = class107.method816(arg5.field1831, var11.method803(), 0, var11.method800());
                    this.field2391.method348(arg5.field1846.field351[arg5.field1817] < 0, arg5, 2);
                    arg5.field1834.method794(var9, var11.method832());
                }
                if (arg5.field1846.field351[arg5.field1817] < 0) {
                    arg5.field1834.method814(-1);
                }
                var11.method797(var9);
                var11.method372(arg0, arg4, arg1 - arg4);
                if (var11.method818()) {
                    this.field2405.method438(var11);
                }
            }
        }
        arg5.field1834.method372(arg0, arg4, arg3);
        field2382++;
        if (arg2 != -17598) {
            field2379 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "([III)V")
    public final void method372(int[] arg0, int arg1, int arg2) {
        field2384++;
        this.field2405.method372(arg0, arg1, arg2);
        for (class82 var4 = (class82) this.field2381.method920((byte) -107); var4 != null; var4 = (class82) this.field2381.method932(-6)) {
            if (!this.field2391.method365(var4, 120)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1829) {
                        this.method788(arg0, var5 + var6, -17598, var6, var5, var4);
                        var4.field1829 -= var6;
                        break;
                    }
                    this.method788(arg0, var5 + var6, -17598, var4.field1829, var5, var4);
                    var5 += var4.field1829;
                    var6 -= var4.field1829;
                } while (!this.field2391.method366(-99, arg0, var4, var6, var5));
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lh;)V")
    public class105(class49 arg0) {
        this.field2391 = arg0;
    }
}
