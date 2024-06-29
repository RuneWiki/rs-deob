import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class181 {

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Lmq;")
    public static class78 field2377 = new class78(6, -2);

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "Z")
    public static boolean field2382 = false;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public int field2374;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public int field2375;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public int field2378;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public int field2379;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)V")
    public static final void method1159(int arg0, byte arg1) {
        class610.field8449 = -1;
        field2380++;
        class488.field6949 = 100;
        if (arg1 >= -55) {
            method1162((byte) -30);
        }
        class718.field10122 = arg0;
        class383.field5336 = 3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static void method1160(byte arg0) {
        if (arg0 != 54) {
            field2382 = false;
        }
        field2377 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)I")
    public static final int method1161(int arg0, int arg1) {
        field2372++;
        if (arg1 < ~arg0) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
    public static final void method1162(byte arg0) {
        if (arg0 != 83) {
            return;
        }
        field2376++;
        for (class63 var1 = (class63) class73.field955.method3111(64); var1 != null; var1 = (class63) class73.field955.method3116(-118)) {
            if (var1.field847 > 0) {
                var1.field847--;
            }
            if (var1.field847 != 0) {
                if (var1.field855 > 0) {
                    var1.field855--;
                }
                if (var1.field855 == 0 && var1.field856 >= 1 && var1.field848 >= 1 && (class613.field8591 - 2) >= var1.field856 && var1.field848 <= class1.field3 - 2 && (var1.field845 < 0 || class597.method3299(var1.field845, var1.field854, -79))) {
                    class272.method1636(var1.field849, var1.field854, var1.field848, var1.field856, -1, false, var1.field846, var1.field857, var1.field845);
                    var1.field855 = -1;
                    if (var1.field853 == var1.field845 && var1.field853 == -1) {
                        var1.method3426((byte) -96);
                    } else if (var1.field853 == var1.field845 && var1.field859 == var1.field849 && var1.field858 == var1.field854) {
                        var1.method3426((byte) -52);
                    }
                }
            } else if (var1.field853 < 0 || class597.method3299(var1.field853, var1.field858, -118)) {
                class272.method1636(var1.field859, var1.field858, var1.field848, var1.field856, -1, false, var1.field846, var1.field857, var1.field853);
                var1.method3426((byte) -57);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lkha;Z)V")
    public static final void method1163(class687 arg0, boolean arg1) {
        class14.field199 = arg0.method3820("p11_full", -1);
        field2381++;
        class275.field3484 = arg0.method3820("p12_full", -1);
        if (arg1) {
            class238.field3073 = arg0.method3820("b12_full", -1);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static final void method1164(int arg0) {
        field2371++;
        class447.field6292 = null;
        if (arg0 != -1) {
            return;
        }
        class111.field1372 = null;
        class601.field8352 = null;
        class153.field1863 = false;
        class494.field6998 = null;
        class132.field1571 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
    public static final void method1165(int arg0, int arg1, int arg2) {
        field2373++;
        if (class422.field5998 == null) {
            return;
        }
        int var3 = class680.field9231;
        int var4 = class665.field9109;
        if (arg2 <= 28) {
            return;
        }
        class409.method2424(arg1, arg0, -114);
        if (class709.field9973 == 0) {
            class297.field3856 = null;
            class297.field3856 = class422.field5998.method154(class422.field5998.method174(class635.field8800, class162.field2073), class422.field5998.method148(class635.field8800, class162.field2073));
        } else if (class709.field9973 == 1 && (class641.field8860 == null || class680.field9231 != var3 || class665.field9109 != var4)) {
            class641.field8860 = new class344[class680.field9231 * class665.field9109];
            for (int var5 = 0; var5 < class641.field8860.length; var5++) {
                class641.field8860[var5] = class422.field5998.method154(class422.field5998.method174(class112.field1383, class664.field9087), class422.field5998.method148(class112.field1383, class664.field9087));
            }
            class743.field10378 = 1;
            class87.field1109 = new int[class680.field9231 * class665.field9109];
        }
        class571.field7967 = true;
    }
}
