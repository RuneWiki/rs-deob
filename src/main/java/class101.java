import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class101 {

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Loa;")
    public static class98 field2335 = class38.method349(255, " )2> @yel@");

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Z")
    public static boolean field2339 = false;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field2332 = 0;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Loa;")
    public static class98 field2334 = class38.method349(255, " weitere Optionen");

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field2330 = 0;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field2333 = 0;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "[I")
    public static int[] field2336 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Loa;")
    private static class98 field2337 = class38.method349(255, "Please try again)3");

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Loa;")
    public static class98 field2331 = field2337;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZZZIZ)Lkd;")
    public static final class73 method833(boolean arg0, boolean arg1, boolean arg2, int arg3, boolean arg4) {
        if (!arg1) {
            field2336 = null;
        }
        class145 var5 = null;
        field2329++;
        if (class80.field1775 != null) {
            var5 = new class145(arg3, class80.field1775, class14.field287[arg3], 1000000);
        }
        return new class73(var5, class18.field393, arg3, arg2, arg4, arg0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Lqd;")
    public static final class114 method834(int arg0, int arg1) {
        field2341++;
        int var2 = -61 % ((arg0 - 29) / 36);
        class114 var3 = (class114) class36.field883.method730((byte) 35, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class20.field448.method1058(14, 38, arg1);
        class114 var5 = new class114();
        if (var4 != null) {
            var5.method919(-1, new class8(var4));
        }
        class36.field883.method732(-1, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static final void method835(int arg0) {
        field2340++;
        while (class36.field890.method178(1833460135, class88.field2028) >= 27) {
            int var1 = class36.field890.method175(61, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class38.field935[var1] == null) {
                class38.field935[var1] = new class150();
                var2 = true;
            }
            class150 var3 = class38.field935[var1];
            class90.field2073[class130.field3024++] = var1;
            var3.field3609 = class119.field2680;
            int var4 = class36.field890.method175(-126, 1);
            var3.field3709 = class11.method122(class36.field890.method175(-123, 13), 119);
            int var5 = class10.field210[class36.field890.method175(-118, 3)];
            if (var2) {
                var3.field3620 = var5;
            }
            int var6 = class36.field890.method175(45, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class36.field890.method175(-121, 5);
            int var8 = class36.field890.method175(-128, 1);
            if (var7 > 15) {
                var7 -= 32;
            }
            if (var8 == 1) {
                class96.field2205[class74.field1603++] = var1;
            }
            var3.field3660 = var3.field3709.field3333;
            var3.field3616 = var3.field3709.field3322;
            var3.field3640 = var3.field3709.field3340;
            var3.field3617 = var3.field3709.field3354;
            var3.field3624 = var3.field3709.field3321;
            var3.field3626 = var3.field3709.field3315;
            var3.field3658 = var3.field3709.field3364;
            if (var3.field3658 == 0) {
                var3.field3620 = 0;
            }
            var3.field3628 = var3.field3709.field3324;
            var3.field3642 = var3.field3709.field3355;
            var3.method1180(128, var4 == 1, class73.field1536.field3603[0] + var6, class73.field1536.field3648[0] + var7);
        }
        class36.field890.method170(33538048);
        int var9 = -102 % ((-arg0 - 38) / 38);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public static final void method836(int arg0) {
        field2338++;
        for (int var1 = -1; var1 < class131.field3082; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class65.field1394[var1];
            }
            class55 var3 = class33.field832[var2];
            if (var3 != null) {
                class10.method115((byte) 22, var3, 1);
            }
        }
        if (arg0 != 1) {
            field2331 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public static void method837(byte arg0) {
        field2336 = null;
        field2331 = null;
        field2335 = null;
        field2334 = null;
        field2337 = null;
        if (arg0 != -80) {
            field2339 = true;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
    public static final void method838(byte arg0) {
        field2342++;
        for (class37 var1 = (class37) class81.field1802.method512(-94); var1 != null; var1 = (class37) class81.field1802.method513(-66)) {
            if (var1.field912 > 0) {
                var1.field912--;
            }
            if (var1.field912 != 0) {
                if (var1.field914 > 0) {
                    var1.field914--;
                }
                if (var1.field914 == 0 && var1.field903 >= 1 && var1.field919 >= 1 && var1.field903 <= 102 && var1.field919 <= 102 && (var1.field915 < 0 || class71.method569(var1.field908, (byte) -81, var1.field915))) {
                    class71.method562(var1.field903, 124, var1.field902, var1.field919, var1.field923, var1.field908, var1.field926, var1.field915);
                    var1.field914 = -1;
                    if (var1.field928 == var1.field915 && var1.field928 == -1) {
                        var1.method975(30);
                    } else if (var1.field928 == var1.field915 && var1.field925 == var1.field923 && var1.field911 == var1.field908) {
                        var1.method975(-124);
                    }
                }
            } else if (var1.field928 < 0 || class71.method569(var1.field911, (byte) -81, var1.field928)) {
                class71.method562(var1.field903, -6, var1.field902, var1.field919, var1.field925, var1.field911, var1.field926, var1.field928);
                var1.method975(69);
            }
        }
        if (arg0 != 37) {
            method835(-25);
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
    public static final void method839(int arg0) {
        class123.field2730 = null;
        if (arg0 != 1) {
            method835(100);
        }
        class36.field898 = null;
        class90.field2069 = null;
        field2343++;
    }
}
