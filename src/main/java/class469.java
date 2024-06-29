import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class469 {

    @OriginalMember(owner = "client!bda", name = "i", descriptor = "Lmq;")
    private class472 field6552 = new class472(16);

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "Ljn;")
    private class668 field6546;

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "[I")
    public static int[] field6549 = new int[1];

    @OriginalMember(owner = "client!bda", name = "k", descriptor = "Lwo;")
    public static class690 field6554 = new class690(89, 1);

    @OriginalMember(owner = "client!bda", name = "n", descriptor = "Lwo;")
    public static class690 field6557 = new class690(90, 8);

    @OriginalMember(owner = "client!bda", name = "p", descriptor = "Z")
    public static boolean field6559 = false;

    @OriginalMember(owner = "client!bda", name = "q", descriptor = "Lop;")
    public static class172 field6560 = new class172();

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!bda", name = "g", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!bda", name = "h", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!bda", name = "l", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!bda", name = "m", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!bda", name = "o", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!bda", name = "j", descriptor = "Ljn;")
    public static class668 field6553;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Z)V", line = 8)
    public final void method2749(boolean arg0) {
        class472 var2 = this.field6552;
        synchronized (this.field6552) {
            this.field6552.method2776(false);
            if (!arg0) {
                field6553 = null;
            }
        }
        field6551++;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)V", line = 21)
    public static void method2750(byte arg0) {
        field6553 = null;
        if (arg0 != -36) {
            field6560 = null;
        }
        field6549 = null;
        field6554 = null;
        field6557 = null;
        field6560 = null;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)Lad;", line = 37)
    public static final class391 method2751(int arg0) {
        if (arg0 != 15555) {
            method2751(10);
        }
        field6555++;
        return class588.method3413((byte) 37, 1);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IBILjava/lang/String;I)V", line = 49)
    public static final void method2752(int arg0, byte arg1, int arg2, String arg3, int arg4) {
        field6544++;
        class17 var5 = class346.method1981(arg4, arg0, (byte) -126);
        if (var5 == null) {
            return;
        }
        if (var5.field338 != null) {
            class143 var6 = new class143();
            var6.field1787 = arg2;
            var6.field1789 = var5;
            var6.field1782 = arg3;
            var6.field1786 = var5.field338;
            class545.method3204(var6);
        }
        if (class114.field1485 != 10 || !client.method1659(var5).method994(true, arg2 - 1)) {
            return;
        }
        int var7 = 20 / ((arg1 - 37) / 32);
        if (arg2 == 1) {
            class354.field4731++;
            class543 var8 = class299.method1780(class84.field1196, class445.field6319, 73);
            class97.method736(arg4, arg0, 40, var8, var5.field412);
            class511.method3028(7482, var8);
        }
        if (arg2 == 2) {
            class279.field3786++;
            class543 var9 = class299.method1780(class84.field1196, class275.field3762, 66);
            class97.method736(arg4, arg0, 40, var9, var5.field412);
            class511.method3028(7482, var9);
        }
        if (arg2 == 3) {
            class666.field9447++;
            class543 var10 = class299.method1780(class84.field1196, class365.field4915, 49);
            class97.method736(arg4, arg0, 40, var10, var5.field412);
            class511.method3028(7482, var10);
        }
        if (arg2 == 4) {
            class17.field386++;
            class543 var11 = class299.method1780(class84.field1196, class677.field9702, 118);
            class97.method736(arg4, arg0, 40, var11, var5.field412);
            class511.method3028(7482, var11);
        }
        if (arg2 == 5) {
            class489.field6834++;
            class543 var12 = class299.method1780(class84.field1196, class176.field2168, 93);
            class97.method736(arg4, arg0, 40, var12, var5.field412);
            class511.method3028(7482, var12);
        }
        if (arg2 == 6) {
            class666.field9480++;
            class543 var13 = class299.method1780(class84.field1196, class198.field2402, 119);
            class97.method736(arg4, arg0, 40, var13, var5.field412);
            class511.method3028(7482, var13);
        }
        if (arg2 == 7) {
            class672.field9659++;
            class543 var14 = class299.method1780(class84.field1196, class452.field6351, 86);
            class97.method736(arg4, arg0, 40, var14, var5.field412);
            class511.method3028(7482, var14);
        }
        if (arg2 == 8) {
            class143.field1788++;
            class543 var15 = class299.method1780(class84.field1196, class113.field1462, 94);
            class97.method736(arg4, arg0, 40, var15, var5.field412);
            class511.method3028(7482, var15);
        }
        if (arg2 == 9) {
            class113.field1443++;
            class543 var16 = class299.method1780(class84.field1196, class570.field8338, 69);
            class97.method736(arg4, arg0, 40, var16, var5.field412);
            class511.method3028(7482, var16);
        }
        if (arg2 == 10) {
            class662.field9388++;
            class543 var17 = class299.method1780(class84.field1196, class298.field4020, 62);
            class97.method736(arg4, arg0, 40, var17, var5.field412);
            class511.method3028(7482, var17);
        }
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(B)V", line = 180)
    public final void method2753(byte arg0) {
        class472 var2 = this.field6552;
        synchronized (this.field6552) {
            this.field6552.method2778((byte) 126);
        }
        field6550++;
        int var3 = -39 % ((28 - arg0) / 43);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(BI)Lku;", line = 193)
    private final class345 method2754(byte arg0, int arg1) {
        if (arg0 <= 16) {
            return null;
        }
        field6548++;
        class472 var3 = this.field6552;
        class345 var4;
        synchronized (this.field6552) {
            var4 = (class345) this.field6552.method2766(-121, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class668 var5 = this.field6546;
        byte[] var6;
        synchronized (this.field6546) {
            var6 = this.field6546.method3800(arg1, 29, (byte) -92);
        }
        class345 var7 = new class345();
        if (var6 != null) {
            var7.method1978(new class389(var6), true);
        }
        class472 var8 = this.field6552;
        synchronized (this.field6552) {
            this.field6552.method2772(var7, true, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)V", line = 223)
    public static final void method2755(int arg0) {
        field6545++;
        class471 var1 = (class471) class404.field5707.method1132((byte) 62);
        if (arg0 != 90) {
            field6559 = true;
        }
        boolean var2 = class386.field5135 != null || class160.field1948 > 0;
        if (var2) {
            class188.field2297 = 1;
        }
        if (class189.field2310 && class376.field5043.method1687(-7653, 81) && class271.field3704 > 2) {
            if (var2) {
                class115.field1496 = (class377) class34.field679.field2232.field7522.field7522;
            } else {
                class397.method2402(var1.method1729(false), -31964, (class377) class34.field679.field2232.field7522.field7522, var1.method1733((byte) 105));
            }
        } else if (var2) {
            class115.field1496 = (class377) class34.field679.field2232.field7522;
        } else {
            class397.method2402(var1.method1729(false), -31964, (class377) class34.field679.field2232.field7522, var1.method1733((byte) 124));
        }
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Ler;ILjn;)V", line = 314)
    public class469(class90 arg0, int arg1, class668 arg2) {
        this.field6546 = arg2;
        this.field6546.method3805(29, false);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IILjea;III)Lmd;", line = 263)
    public final class504 method2756(int arg0, int arg1, class417 arg2, int arg3, int arg4, int arg5) {
        if (arg1 > -109) {
            this.method2749(false);
        }
        field6556++;
        class259[] var7 = null;
        class345 var8 = this.method2754((byte) 26, arg0);
        if (var8.field4530 != null) {
            var7 = new class259[var8.field4530.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class590 var10 = arg2.method2506(var8.field4530[var9], 28011);
                var7[var9] = new class259(var10.field8549, var10.field8556, var10.field8555, var10.field8547, var10.field8548, var10.field8552, var10.field8542, var10.field8551);
            }
        }
        return new class504(var8.field4533, var7, var8.field4532, arg5, arg4, arg3);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)V", line = 301)
    public final void method2757(int arg0, int arg1) {
        field6547++;
        class472 var3 = this.field6552;
        synchronized (this.field6552) {
            this.field6552.method2777(arg0, 88);
            if (arg1 != -1) {
                method2755(113);
            }
        }
    }
}
