import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class399 extends class449 {

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public int field5470 = 0;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public int field5477 = -1;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "Lrc;")
    public static class108 field5465 = new class108(63, 0);

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "[I")
    public static int[] field5473 = new int[50];

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "[Lmq;")
    public static class46[] field5469 = new class46[128];

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public int field5467;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public int field5468;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public int field5472;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    public int field5474;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public int field5475;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public int field5476;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public int field5478;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public int field5479;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    public int field5482;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
    public int field5483;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "[[Z")
    public static boolean[][] field5480;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLfo;)V")
    public static final void method2397(boolean arg0, class418 arg1) {
        field5471++;
        boolean var2 = false;
        if (class364.field5010 == arg1.field5787 || arg1.field5742 == -1 || arg1.field5773 != 0) {
            var2 = true;
        } else {
            class303 var3 = class386.field5289.method1856(118, arg1.field5742);
            if (var3.field4300 || arg1.field5770 + 1 > var3.field4283[arg1.field5789]) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field5787 - arg1.field5750;
            int var5 = class364.field5010 - arg1.field5750;
            int var6 = arg1.field5777 * 128 + (arg1.method245(4452) * 64);
            int var7 = arg1.field5782 * 128 + arg1.method245(4452) * 64;
            int var8 = arg1.field5745 * 128 + arg1.method245(4452) * 64;
            int var9 = arg1.field5776 * 128 + arg1.method245(4452) * 64;
            arg1.field4537 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg1.field4530 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg1.field5805 = 0;
        if (arg1.field5769 == 0) {
            arg1.method2499((byte) -29, 8192);
        }
        if (arg1.field5769 == 1) {
            arg1.method2499((byte) -29, 12288);
        }
        if (arg1.field5769 == 2) {
            arg1.method2499((byte) -29, 0);
        }
        if (arg0 && arg1.field5769 == 3) {
            arg1.method2499((byte) -29, 4096);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILwt;I)Ldg;")
    public static final class131 method2398(int arg0, class325 arg1, int arg2) {
        field5481++;
        class131 var3;
        if (class163.field2379 == null) {
            var3 = new class131();
        } else {
            var3 = class163.field2379;
            class163.field2379 = class163.field2379.field1796;
            var3.field1796 = null;
            class200.field2972--;
        }
        var3.field1803 = arg1;
        var3.field1798 = arg0;
        if (arg2 != 16) {
            method2401(66);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
    public static void method2399(int arg0) {
        field5469 = null;
        field5465 = null;
        if (arg0 != -13954) {
            method2398(-75, (class325) null, -60);
        }
        field5480 = null;
        field5473 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lae;Z)V")
    public static final void method2400(class172 arg0, boolean arg1) {
        if (arg1) {
            method2399(78);
        }
        field5466++;
        if (class307.field4359 != arg0.field2624) {
            return;
        }
        if (class262.field3781.field485 == null) {
            arg0.field2551 = 0;
            arg0.field2492 = 0;
            return;
        }
        arg0.field2578 = 150;
        arg0.field2556 = (int) (Math.sin((double) class364.field5010 / 40.0D) * 256.0D) & 0x7FF;
        arg0.field2488 = 5;
        arg0.field2551 = class168.field2432;
        arg0.field2492 = class118.method916((byte) 57, class262.field3781.field485);
        arg0.field2559 = class262.field3781.field5767;
        arg0.field2528 = class262.field3781.field5752;
        arg0.field2597 = class262.field3781.field5763;
        arg0.field2585 = 0;
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
    public static final void method2401(int arg0) {
        field5464++;
        int var1 = 0;
        if (arg0 != -4518) {
            field5465 = null;
        }
        if (class62.field913) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        class300.method1935(var1, arg0 ^ 0x5D84);
        class468.field6599.method507(var1, -1);
        class373.field5128.method1648(arg0 ^ 0xFFFFEE7A, var1);
        class363.field5001.method1994(var1, arg0 + 4582);
        class371.field5108.method1665(var1, 111);
        class382.method2333((byte) 70, var1);
        class249.method1709(var1, (byte) -95);
        class75.method665(var1, (byte) 89);
        class256.method1736(false, var1);
        if (class347.field4787 == 10) {
            class237.method1649(28, false);
        } else if (class347.field4787 == 30) {
            class237.method1649(25, false);
            return;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method2402(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class380.field5232 = arg0;
        class47.field719 = 0x1 << class380.field5232;
        class289.field4100 = class47.field719 >> 1;
        class165.field2406 = (int) Math.sqrt((double) (class289.field4100 * class289.field4100 + class289.field4100 * class289.field4100));
        class310.field4401 = arg2;
        class97.field1374 = arg3;
        class4.field30 = arg4;
        class36.field393 = new class52[arg1][class310.field4401][class97.field1374];
        class190.field2858 = new class241[arg1];
        if (arg5) {
            class486.field6872 = new int[class310.field4401][class97.field1374];
            class332.field4610 = new byte[class310.field4401][class97.field1374];
            class218.field3157 = new byte[class310.field4401][class97.field1374];
            class267.field3862 = new class52[1][class310.field4401][class97.field1374];
            class427.field5960 = new class241[1];
        } else {
            class486.field6872 = null;
            class332.field4610 = null;
            class218.field3157 = null;
            class267.field3862 = null;
            class427.field5960 = null;
        }
        if (arg6) {
            class221.field3191 = new long[arg1][arg2][arg3];
            class357.field4906 = new class87[65535];
            class392.field5409 = new boolean[65535];
            class237.field3467 = 0;
        } else {
            class221.field3191 = null;
            class357.field4906 = null;
            class392.field5409 = null;
            class237.field3467 = 0;
        }
        class484.method2859(false);
        class153.field2126 = new class34[500];
        class198.field2924 = 0;
        class55.field816 = new class34[500];
        class357.field4936 = 0;
        class117.field1629 = new int[arg1][class310.field4401 + 1][class97.field1374 + 1];
        class360.field4950 = new class325[5000];
        class239.field3495 = 0;
        class154.field2129 = new boolean[class4.field30 + class4.field30 + 1][class4.field30 + class4.field30 + 1];
        field5480 = new boolean[class4.field30 + class4.field30 + 2][class4.field30 + class4.field30 + 2];
        class291.field4124 = null;
    }
}
