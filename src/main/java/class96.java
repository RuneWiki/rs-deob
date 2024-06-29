import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class96 {

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Lia;")
    public static class257 field1803 = null;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Lnativeadvert/browsercontrol;")
    public static browsercontrol field1805 = null;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field1810 = 0;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZILla;III)V")
    public static final void method697(boolean arg0, int arg1, class103 arg2, int arg3, int arg4, int arg5) {
        field1804++;
        if (arg2.field1927 == -1 && arg2.field1918 == null) {
            return;
        }
        int var6 = 0;
        if (arg1 > arg2.field1926) {
            var6 += arg1 - arg2.field1926;
        } else if (arg1 < arg2.field1912) {
            var6 += arg2.field1912 - arg1;
        }
        if (arg2.field1922 < arg3) {
            var6 += arg3 - arg2.field1922;
        } else if (arg3 < arg2.field1932) {
            var6 += arg2.field1932 - arg3;
        }
        if ((var6 - 64) > arg2.field1928 || class99.field1830 == 0 || arg2.field1931 != arg4) {
            if (arg2.field1913 != null) {
                class78.field1504.method459(arg2.field1913);
                arg2.field1913 = null;
            }
            if (arg2.field1925 != null) {
                class78.field1504.method459(arg2.field1925);
                arg2.field1925 = null;
            }
            return;
        }
        var6 -= 64;
        if (arg0) {
            method697(true, -91, (class103) null, 22, -60, 74);
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg2.field1928 - var6) * class99.field1830 / arg2.field1928;
        if (arg2.field1913 != null) {
            arg2.field1913.method57(var7);
        } else if (arg2.field1927 >= 0) {
            class88 var8 = class88.method659(class76.field1490, arg2.field1927, 0);
            if (var8 != null) {
                class261 var9 = var8.method658().method1735(class57.field1211);
                class4 var10 = class4.method80(var9, 100, var7);
                var10.method77(-1);
                class78.field1504.method461(var10);
                arg2.field1913 = var10;
            }
        }
        if (arg2.field1925 != null) {
            arg2.field1925.method57(var7);
            if (!arg2.field1925.method247(-75)) {
                arg2.field1925 = null;
            }
        } else if (arg2.field1918 != null && (arg2.field1915 -= arg5) <= 0) {
            int var11 = (int) (Math.random() * (double) arg2.field1918.length);
            class88 var12 = class88.method659(class76.field1490, arg2.field1918[var11], 0);
            if (var12 != null) {
                class261 var13 = var12.method658().method1735(class57.field1211);
                class4 var14 = class4.method80(var13, 100, var7);
                var14.method77(0);
                class78.field1504.method461(var14);
                arg2.field1925 = var14;
                arg2.field1915 = arg2.field1929 + (int) (Math.random() * (double) (arg2.field1908 - arg2.field1929));
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)Lk;")
    public static final class152 method698(byte arg0) {
        field1811++;
        class152 var1 = new class152(24);
        var1.method1023(13195, 2);
        var1.method1023(13195, class30.field566);
        var1.method1023(13195, class215.field3651 ? 1 : 0);
        var1.method1023(13195, class72.field1409 ? 1 : 0);
        var1.method1023(13195, class133.field2387 ? 1 : 0);
        var1.method1023(13195, class2.field62 ? 1 : 0);
        var1.method1023(13195, class204.field3503 ? 1 : 0);
        var1.method1023(13195, class169.field2918 ? 1 : 0);
        if (arg0 < 17) {
            method700((Throwable) null, (String) null);
        }
        var1.method1023(13195, class152.field2649 ? 1 : 0);
        var1.method1023(13195, class19.field399 ? 1 : 0);
        var1.method1023(13195, class25.field488);
        var1.method1023(13195, class209.field3573 ? 1 : 0);
        var1.method1023(13195, class179.field3093 ? 1 : 0);
        var1.method1023(13195, class81.field1574 ? 1 : 0);
        var1.method1023(13195, class238.field4089);
        var1.method1023(13195, class2.field45 ? 1 : 0);
        var1.method1023(13195, class38.field747);
        var1.method1023(13195, class26.field513);
        var1.method1023(13195, class99.field1830);
        var1.method1065(class115.field2080, 1210792072);
        var1.method1065(class115.field2070, 1210792072);
        return var1;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
    public static void method699(byte arg0) {
        field1803 = null;
        field1805 = null;
        int var1 = 60 / ((arg0 - 43) / 50);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lva;")
    public static final class144 method700(Throwable arg0, String arg1) {
        field1806++;
        class144 var2;
        if (arg0 instanceof class144) {
            var2 = (class144) arg0;
            var2.field2520 = var2.field2520 + ' ' + arg1;
        } else {
            var2 = new class144(arg0, arg1);
        }
        return var2;
    }
}
