import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class195 extends class184 {

    @OriginalMember(owner = "client!rq", name = "I", descriptor = "I")
    public int field2686 = -1;

    @OriginalMember(owner = "client!rq", name = "M", descriptor = "I")
    public int field2690 = -1;

    @OriginalMember(owner = "client!rq", name = "H", descriptor = "[I")
    public static int[] field2685 = new int[100];

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "I")
    public int field2678;

    @OriginalMember(owner = "client!rq", name = "A", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!rq", name = "B", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!rq", name = "C", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!rq", name = "E", descriptor = "I")
    public int field2683;

    @OriginalMember(owner = "client!rq", name = "G", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!rq", name = "J", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!rq", name = "K", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!rq", name = "L", descriptor = "I")
    public int field2689;

    @OriginalMember(owner = "client!rq", name = "N", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!rq", name = "O", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!rq", name = "P", descriptor = "I")
    public int field2693;

    @OriginalMember(owner = "client!rq", name = "D", descriptor = "[[[B")
    public static byte[][][] field2682;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZIIIZ)V")
    public static final void method1259(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field2688;
        if (~class326.field4462 != -1) {
            class434.field6129 = class326.field4462;
            class412.method2588(0, 79);
        } else {
            class18.method251((byte) 89, false);
        }
        class135.field1962 = arg3;
        class275.field3834 = arg1;
        class423.field5983 = arg4;
        if (arg0) {
            field2685 = null;
        }
        class354.method2264(arg2);
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(Luo;I)V")
    public final void method678(class345 arg0, int arg1) {
        if (arg1 != -22948) {
            method1260(32);
        }
        ++field2691;
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)V")
    public static void method1260(int arg0) {
        field2682 = null;
        if (arg0 != 0) {
            method1264(-112, -45, (class453[]) null);
        }
        field2685 = null;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IILuo;I)Z")
    public final boolean method675(int arg0, int arg1, class345 arg2, int arg3) {
        ++field2692;
        class417 var5 = arg2.method84();
        var5.method702(super.field2506, super.field2502, super.field2508);
        class394 var6 = class51.method433((byte) 87, this.field2678).method2303(arg2, (class411) null, 65536, this.field2693, 0, -1, 0, 128, (class133) null);
        if (arg1 != -20759) {
            return false;
        } else if (var6 != null && var6.method1465(arg3, arg0, var5, true)) {
            return true;
        } else {
            if (this.field2690 != -1) {
                class394 var7 = class51.method433((byte) 87, this.field2690).method2303(arg2, (class411) null, 65536, this.field2689, 0, -1, 0, 128, (class133) null);
                if (var7 != null && var7.method1465(arg3, arg0, var5, true)) {
                    return true;
                }
            }
            if (~this.field2686 != 0) {
                class394 var8 = class51.method433((byte) 87, this.field2686).method2303(arg2, (class411) null, 65536, this.field2683, 0, -1, 0, arg1 ^ -20887, (class133) null);
                if (var8 != null && var8.method1465(arg3, arg0, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(B)V")
    public static final void method1261(byte arg0) {
        class107.field1482.method900(arg0 + -73);
        ++field2687;
        class46.field650.method900(arg0 ^ 73);
        if (arg0 != 73) {
            field2682 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZLuo;)Laj;")
    public final class170 method681(boolean arg0, class345 arg1) {
        ++field2681;
        class417 var3 = arg1.method84();
        var3.method702(super.field2506, super.field2502, super.field2508);
        class170 var4 = class175.method1152((byte) 72, 3);
        if (this.field2686 != -1) {
            class394 var5 = class51.method433((byte) 87, this.field2686).method2303(arg1, (class411) null, 1024, this.field2683, 0, -1, 0, 128, (class133) null);
            if (var5 != null) {
                var5.method1416(var3, var4.field2333[2], 0);
            }
        }
        if (!arg0) {
            method1262(-31);
        }
        if (this.field2690 != -1) {
            class394 var6 = class51.method433((byte) 87, this.field2690).method2303(arg1, (class411) null, 1024, this.field2689, 0, -1, 0, 128, (class133) null);
            if (var6 != null) {
                var6.method1416(var3, var4.field2333[1], 0);
            }
        }
        class394 var7 = class51.method433((byte) 87, this.field2678).method2303(arg1, (class411) null, 1024, this.field2693, 0, -1, 0, 128, (class133) null);
        if (var7 != null) {
            var7.method1416(var3, var4.field2333[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "(I)V")
    public static final void method1262(int arg0) {
        if (class151.method1029(true)) {
            if (class399.field5695 == null) {
                class124.method847(120);
            }
            class304.field4201 = new boolean[100];
            class20.field370 = new int[100];
            class74.field1049 = new int[100];
            class437.field6148 = true;
            class243.field3447 = new int[100];
            class364.field5133 = 0;
            for (int var1 = 0; ~var1 > -101; ++var1) {
                class20.field370[var1] = (int) (Math.random() * (double) class47.field661);
                class243.field3447[var1] = (int) (350.0D * Math.random());
                class74.field1049[var1] = (int) (Math.random() * 102.0D);
                class304.field4201[var1] = Math.random() < 0.5D;
            }
            try {
                class175.field2393 = class133.field1914.getToolkit().getSystemClipboard();
            } catch (Exception var2) {
            }
        }
        if (arg0 != 100) {
            method1261((byte) -50);
        }
        ++field2684;
    }

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "(B)V")
    public static final void method1263(byte arg0) {
        ++field2679;
        class163.field2261.method1194((byte) -41);
        for (int var1 = 0; ~var1 > -33; ++var1) {
            class212.field2971[var1] = 0L;
        }
        int var2 = 0;
        if (arg0 != -50) {
            field2685 = null;
        }
        while (var2 < 32) {
            class348.field4770[var2] = 0L;
            ++var2;
        }
        class240.field3422 = 0;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II[Lms;)V")
    public static final void method1264(int arg0, int arg1, class453[] arg2) {
        for (int var3 = arg0; arg2.length > var3; ++var3) {
            class453 var4 = arg2[var3];
            if (var4 != null) {
                if (~var4.field6356 == -1) {
                    if (var4.field6382 != null) {
                        method1264(0, arg1, var4.field6382);
                    }
                    class26 var5 = (class26) class454.field6477.method886((long) var4.field6314, 25651);
                    if (var5 != null) {
                        class46.method410(arg1, var5.field463, -119);
                    }
                }
                if (~arg1 == -1 && var4.field6436 != null) {
                    class7 var6 = new class7();
                    var6.field97 = var4.field6436;
                    var6.field95 = var4;
                    class177.method1168(var6);
                }
                if (~arg1 == -2 && var4.field6395 != null) {
                    if (var4.field6406 >= 0) {
                        class453 var7 = class442.method2767(var4.field6314, arg0 ^ -1229996208);
                        if (var7 == null || var7.field6382 == null || var4.field6406 >= var7.field6382.length || var7.field6382[var4.field6406] != var4) {
                            continue;
                        }
                    }
                    class7 var8 = new class7();
                    var8.field95 = var4;
                    var8.field97 = var4.field6395;
                    class177.method1168(var8);
                }
            }
        }
        ++field2680;
    }
}
