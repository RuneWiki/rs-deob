import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class212 {

    @OriginalMember(owner = "client!md", name = "n", descriptor = "J")
    public long field3617 = 0L;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Lpj;")
    public static class237 field3616 = class33.method353("showingVideoAd", 88);

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public int field3606;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public int field3608;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public int field3610;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public int field3613;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public int field3615;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public int field3619;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public int field3622;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "Lfa;")
    public static class239 field3620;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lqe;")
    public class95 field3604;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Lqe;")
    public class95 field3605;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIBII)V")
    public static final void method1416(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = -86 / ((arg2 + 75) / 50);
        class94.field1676 = arg1;
        class34.field727 = arg4;
        class89.field1637 = arg3;
        field3609++;
        class13.field215 = arg0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method1417(int arg0) {
        field3620 = null;
        field3616 = null;
        if (arg0 != 3) {
            field3620 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)I")
    public static final int method1418(int arg0, int arg1, int arg2) {
        if (arg2 > -58) {
            return 125;
        } else {
            field3611++;
            int var3 = arg1 >> 31 & arg0 - 1;
            return ((arg1 >>> 31) + arg1) % arg0 + var3;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static final void method1419(int arg0) {
        field3607++;
        if (arg0 != -13313) {
            field3620 = null;
        }
        for (class121 var1 = (class121) class182.field3202.method673(false); var1 != null; var1 = (class121) class182.field3202.method680(62)) {
            class106 var2 = var1.field2134;
            if (class274.field4798 != var2.field1892 || class241.field4246 > var2.field1859) {
                var1.method629(0);
            } else if (var2.field1863 <= class241.field4246) {
                if (var2.field1893 > 0) {
                    class210 var3 = class232.field4022[var2.field1893 - 1];
                    if (var3 != null && var3.field3710 >= 0 && var3.field3710 < 13312 && var3.field3700 >= 0 && var3.field3700 < 13312) {
                        var2.method792(class241.field4246, (byte) 46, var3.field3710, class23.method216(-117, var3.field3700, var3.field3710, var2.field1892) - var2.field1858, var3.field3700);
                    }
                }
                if (var2.field1893 < 0) {
                    int var4 = -var2.field1893 - 1;
                    class271 var5;
                    if (class272.field4679 == var4) {
                        var5 = class229.field3911;
                    } else {
                        var5 = class232.field4025[var4];
                    }
                    if (var5 != null && var5.field3710 >= 0 && var5.field3710 < 13312 && var5.field3700 >= 0 && var5.field3700 < 13312) {
                        var2.method792(class241.field4246, (byte) 78, var5.field3710, class23.method216(-76, var5.field3700, var5.field3710, var2.field1892) - var2.field1858, var5.field3700);
                    }
                }
                var2.method791((byte) 65, class59.field1204);
                class185.method1269(class274.field4798, (int) var2.field1884, (int) var2.field1870, (int) var2.field1865, 60, var2, var2.field1875, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)I")
    public static final int method1420(int arg0, boolean arg1) {
        field3614++;
        if (!(arg0 < 65 || arg0 > 90) || !(arg0 < 192 || arg0 > 222 || arg0 == 215)) {
            return arg0 + 32;
        } else if (arg0 == 159) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else {
            if (!arg1) {
                field3620 = null;
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZI)V")
    public static final void method1421(boolean arg0, int arg1) {
        class177.field3103 = 1000 / arg1;
        if (!arg0) {
            field3616 = null;
        }
        field3623++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Ldi;")
    public static final class172 method1422(int arg0, int arg1) {
        field3621++;
        if (arg1 > -39) {
            field3616 = null;
        }
        class172 var2 = (class172) class41.field926.method940((long) arg0, 79);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class159.field2861.method1645(true, arg0, 3);
        class172 var4 = new class172();
        if (var3 != null) {
            var4.method1199(new class32(var3), true);
        }
        class41.field926.method937(-12, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
    public static final void method1423(int arg0) {
        if (class105.field1845 == null || class34.field730 == null) {
            class105.field1845 = new int[256];
            class34.field730 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class105.field1845[var1] = (int) (Math.sin(var2) * 4096.0D);
                class34.field730[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != -19836) {
            field3616 = null;
        }
        field3618++;
    }
}
