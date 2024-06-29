import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class110 {

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "[[I")
    private int[][] field2596;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    private int field2597;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    private int field2593;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "Leb;")
    public static class31 field2598 = new class31(64);

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "Z")
    public static boolean field2600 = false;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field2606 = 0;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "Lqf;")
    private static class117 field2605 = class72.method514(108, "Too many connections from your address)3");

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static volatile int field2604 = 0;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Lqf;")
    public static class117 field2603 = field2605;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Leb;")
    public static class31 field2599 = new class31(128);

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "Lqf;")
    public static class117 field2608 = class72.method514(112, "hitmarks");

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "[Lma;")
    public static class84[] field2609 = new class84[1000];

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "Lqf;")
    public static class117 field2610 = class72.method514(122, "scape main");

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "[I")
    public static int[] field2611 = new int[256];

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)I")
    public final int method824(boolean arg0, int arg1) {
        field2607++;
        if (this.field2596 != null) {
            arg1 = (int) ((long) this.field2593 * (long) arg1 / (long) this.field2597);
        }
        return arg0 ? arg1 : -22;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)I")
    public final int method825(int arg0, byte arg1) {
        field2601++;
        if (arg1 <= 12) {
            method827(true);
        }
        if (this.field2596 != null) {
            arg0 = (int) ((long) this.field2593 * (long) arg0 / (long) this.field2597) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([BB)[B")
    public final byte[] method826(byte[] arg0, byte arg1) {
        if (this.field2596 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field2593 / (long) this.field2597) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field2596[var5];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var6 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2593 + var5;
                int var14 = var13 / this.field2597;
                var5 = var13 - this.field2597 * var14;
                var6 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        if (arg1 != -39) {
            field2604 = 64;
        }
        field2595++;
        return arg0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
    public static void method827(boolean arg0) {
        field2611 = null;
        field2609 = null;
        field2598 = null;
        field2599 = null;
        field2610 = null;
        field2605 = null;
        field2603 = null;
        field2608 = null;
        if (arg0) {
            field2605 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static final void method828(int arg0) {
        class153.field3783++;
        field2592++;
        class85.method680(1442380142, true);
        class116.method898(true, 64);
        class85.method680(1442380142, false);
        class116.method898(false, 64);
        class4.method12(-13313);
        class124.method986(7962);
        if (!class76.field1676) {
            int var1 = class24.field475 + class128.field3035 & 0x7FF;
            int var2 = class65.field1354;
            if (class135.field3244 / 256 > var2) {
                var2 = class135.field3244 / 256;
            }
            if (class70.field1493[4] && class146.field3567[4] + 128 > var2) {
                var2 = class146.field3567[4] + 128;
            }
            class52.method383(class29.field569, class80.method626(class141.field3395.field1998, class140.field3344, class141.field3395.field1960, -125) - 50, class70.field1481, true, var2 * 3 + 600, var2, var1);
        }
        int var3;
        if (class76.field1676) {
            var3 = class72.method515(20055);
        } else {
            var3 = class139.method1084(arg0 + 34768);
        }
        int var4 = class136.field3247;
        int var5 = class87.field1959;
        int var6 = class117.field2813;
        int var7 = class77.field1722;
        int var8 = class27.field530;
        for (int var9 = 0; var9 < 5; var9++) {
            if (class70.field1493[var9]) {
                int var10 = (int) ((double) -class67.field1402[var9] + (double) (class67.field1402[var9] * 2 + 1) * Math.random() + Math.sin((double) class72.field1553[var9] / 100.0D * (double) class68.field1424[var9]) * (double) class146.field3567[var9]);
                if (var9 == 2) {
                    class117.field2813 += var10;
                }
                if (var9 == 1) {
                    class136.field3247 += var10;
                }
                if (var9 == 4) {
                    class77.field1722 += var10;
                    if (class77.field1722 < 128) {
                        class77.field1722 = 128;
                    }
                    if (class77.field1722 > 383) {
                        class77.field1722 = 383;
                    }
                }
                if (var9 == 3) {
                    class27.field530 = class27.field530 + var10 & 0x7FF;
                }
                if (var9 == 0) {
                    class87.field1959 += var10;
                }
            }
        }
        class66.method469(114);
        class30.field641 = 0;
        if (arg0 != -32768) {
            return;
        }
        class30.field623 = true;
        class30.field645 = class143.field3504 - 4;
        class30.field640 = class18.field274 - 4;
        class120.method964(arg0 ^ 0xFFFF8001);
        class49.method353();
        class120.method964(1);
        class19.field311.method841(class87.field1959, class136.field3247, class117.field2813, class77.field1722, class27.field530, var3);
        class120.method964(1);
        class19.field311.method858();
        class55.method410((byte) -78);
        class4.method11(20);
        ((class71) class12.field179).method503(arg0 ^ 0xFFFF8000, class83.field1911);
        class27.method205(6019);
        if (class115.field2713 && class91.method720(false, true, (byte) -112) == 0) {
            class115.field2713 = false;
        }
        if (class115.field2713) {
            class66.method469(107);
            class49.method353();
            class119.method955(class76.field1659, false, null, 3);
        }
        class120.method964(1);
        class152.method1214((byte) -123);
        class77.field1722 = var7;
        class27.field530 = var8;
        class87.field1959 = var5;
        class136.field3247 = var4;
        class117.field2813 = var6;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLjb;)V")
    public static final void method829(byte arg0, class64 arg1) {
        if (arg0 > -75) {
            field2604 = -31;
        }
        field2594++;
        class28.field543 = arg1;
        class58.field1189 = class28.field543.method440(16, false);
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(II)V")
    public class110(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class28.method213(arg1, 11890, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field2596 = new int[var4][14];
            this.field2597 = var4;
            this.field2593 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                int[] var9 = this.field2596[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var11 = (double) var5 / (double) var4;
                int var13 = (int) Math.ceil(var7 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var10 < var13) {
                    double var14 = ((double) var10 - var7) * 3.141592653589793D;
                    double var16 = var11;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
