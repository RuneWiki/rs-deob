import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class275 {

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Lja;")
    private class61 field4493 = new class61();

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    private int field4507;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    private int field4499;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Li;")
    private class58 field4491;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "[I")
    public static int[] field4498 = new int[128];

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field4503 = 0;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "[I")
    public static int[] field4502 = new int[500];

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "Lad;")
    public static class275 field4497 = new class275(128);

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "[[S")
    public static short[][] field4510 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4511 = "skill: ";

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Le;")
    public static class67 field4506;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method1872(int arg0) {
        field4510 = null;
        field4497 = null;
        field4506 = null;
        if (arg0 != 0) {
            method1882(112);
        }
        field4502 = null;
        field4498 = null;
        field4511 = null;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public final void method1873(int arg0) {
        field4500++;
        this.field4493.method392(0);
        if (arg0 == -7401) {
            this.field4491.method377((byte) -1);
            this.field4507 = this.field4499;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)J")
    public static final long method1874(int arg0, int arg1, int arg2) {
        class116 var3 = class307.field4991[arg0][arg1][arg2];
        return var3 == null || var3.field1765 == null ? 0L : var3.field1765.field1933;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILrg;)I")
    public static final int method1875(int arg0, int arg1, class248 arg2) {
        field4509++;
        if (arg1 <= 16) {
            method1872(5);
        }
        if (!client.method1126(arg2).method179((byte) -104, arg0) && arg2.field3986 == null) {
            return -1;
        } else if (arg2.field3970 == null || arg0 >= arg2.field3970.length) {
            return -1;
        } else {
            return arg2.field3970[arg0];
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public final void method1876(byte arg0) {
        field4492++;
        if (arg0 <= 112) {
            return;
        }
        for (class41 var2 = (class41) this.field4493.method391((byte) -117); var2 != null; var2 = (class41) this.field4493.method394((byte) 88)) {
            if (var2.method249((byte) -101)) {
                var2.method952((byte) 66);
                var2.method1708((byte) 90);
                this.field4507++;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lie;IIIII)V")
    public static final void method1877(class34 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class284.field4608 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class95.field1504) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class200.field3208 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class116 var14 = class307.field4991[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class166.field2746[var11][var12 + 1][var13] + class166.field2746[var11][var12][var13] + class166.field2746[var11][var12][var13 + 1] + class166.field2746[var11][var12 + 1][var13 + 1]) / 4 - (class166.field2746[arg1][arg2 + 1][arg3] + class166.field2746[arg1][arg2][arg3] + class166.field2746[arg1][arg2][arg3 + 1] + class166.field2746[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class138 var16 = var14.field1775;
                                    if (var16 != null) {
                                        if (var16.field2226.method254()) {
                                            arg0.method255(var16.field2226, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2227 != null && var16.field2227.method254()) {
                                            arg0.method255(var16.field2227, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field1787; var17++) {
                                        class90 var18 = var14.field1782[var17];
                                        if (var18 != null && var18.field1416.method254() && (var18.field1405 == var12 || var7 == var12) && (var18.field1407 == var13 || var9 == var13)) {
                                            int var19 = var18.field1420 + 1 - var18.field1405;
                                            int var20 = var18.field1399 + 1 - var18.field1407;
                                            arg0.method255(var18.field1416, (var18.field1405 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1407 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IJ)V")
    public final void method1878(int arg0, long arg1) {
        field4495++;
        class41 var4 = (class41) this.field4491.method371(arg0 - 230, arg1);
        if (var4 != null) {
            var4.method952((byte) 80);
            var4.method1708((byte) 90);
            this.field4507++;
        }
        if (arg0 != 128) {
            this.method1881(false);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method1879(int arg0, long arg1) {
        field4505++;
        if (arg0 != 8887) {
            field4502 = null;
        }
        class41 var4 = (class41) this.field4491.method371(arg0 ^ 0xFFFFDD35, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method245(-15007);
        if (var5 == null) {
            var4.method952((byte) 46);
            var4.method1708((byte) 90);
            this.field4507++;
            return null;
        }
        if (var4.method249((byte) -106)) {
            class33 var6 = new class33(var5);
            this.field4491.method368(var4.field2209, var6, -79);
            this.field4493.method388(var6, false);
            var6.field4135 = 0L;
            var4.method952((byte) 40);
            var4.method1708((byte) 90);
        } else {
            this.field4493.method388(var4, false);
            var4.field4135 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
    public final void method1880(int arg0, int arg1) {
        if (arg0 > -60) {
            field4503 = -61;
        }
        field4494++;
        if (class173.field2899 == null) {
            return;
        }
        for (class41 var3 = (class41) this.field4493.method391((byte) 101); var3 != null; var3 = (class41) this.field4493.method394((byte) 106)) {
            if (var3.method249((byte) -111)) {
                if (var3.method245(-15007) == null) {
                    var3.method952((byte) 20);
                    var3.method1708((byte) 90);
                    this.field4507++;
                }
            } else if ((long) arg1 < ++var3.field4135) {
                class41 var4 = class173.field2899.method289(125, var3);
                this.field4491.method368(var3.field2209, var4, -94);
                class76.method545(var4, var3, 0);
                var3.method952((byte) 88);
                var3.method1708((byte) 90);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)I")
    public final int method1881(boolean arg0) {
        field4508++;
        if (!arg0) {
            return 26;
        }
        int var2 = 0;
        for (class41 var3 = (class41) this.field4493.method391((byte) -128); var3 != null; var3 = (class41) this.field4493.method394((byte) 55)) {
            if (!var3.method249((byte) -82)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
    public static final void method1882(int arg0) {
        class311.field5027.method2081(false, 227);
        class311.field5027.method1824(class104.field1644, 28357);
        field4490++;
        class85.field1346++;
        if (arg0 != 64) {
            field4503 = -12;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(I)V")
    public class275(int arg0) {
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field4507 = arg0;
        this.field4499 = arg0;
        this.field4491 = new class58(var2);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(JILjava/lang/Object;)V")
    public final void method1883(long arg0, int arg1, Object arg2) {
        field4501++;
        this.method1878(128, arg0);
        if (this.field4507 == 0) {
            class41 var5 = (class41) this.field4493.method396(0);
            var5.method952((byte) 112);
            var5.method1708((byte) 90);
        } else {
            this.field4507--;
        }
        int var6 = -54 % ((arg1 + 21) / 34);
        class33 var7 = new class33(arg2);
        this.field4491.method368(arg0, var7, -120);
        this.field4493.method388(var7, false);
        var7.field4135 = 0L;
    }
}
