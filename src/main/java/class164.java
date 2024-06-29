import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class164 {

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "J")
    public long field2668 = 0L;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "[I")
    public static int[] field2653 = new int[50];

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Ljd;")
    public static class241 field2652 = new class241(5000);

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "Lsg;")
    public static class191 field2674 = null;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "Lmh;")
    public static class62 field2673 = class201.method1405(true, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public int field2651;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public int field2656;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public int field2657;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public int field2659;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public int field2660;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public int field2661;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public int field2663;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public int field2664;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public int field2665;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public int field2667;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public int field2670;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Ljm;")
    public class123 field2672;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 12)
    public static void method1180(int arg0) {
        field2674 = null;
        field2653 = null;
        field2652 = null;
        field2673 = null;
        if (arg0 != -2516) {
            field2666 = 57;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZB)Lmh;", line = 28)
    public static final class62 method1181(int arg0, int arg1, boolean arg2, byte arg3) {
        field2658++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var4 = 1;
        int var5 = arg0 / arg1;
        if (arg3 != -35) {
            field2653 = (int[]) null;
        }
        while (var5 != 0) {
            var5 /= arg1;
            var4++;
        }
        int var6 = var4;
        if (arg0 < 0 || arg2) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg0 % arg1;
            arg0 /= arg1;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class62 var10 = new class62();
        var10.field893 = var6;
        var10.field906 = var7;
        return var10;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V", line = 93)
    public static final void method1182(int arg0) {
        field2662++;
        if (class304.field5235 == null) {
            return;
        }
        if (class287.field4904 < 10) {
            if (!class229.field3988.method158(67, class304.field5235.field4650) || !class229.field3988.method158(75, class254.method1772(new class62[] { class304.field5235.field4650, class21.field228 }, arg0 ^ 0xFFFFDD61))) {
                class287.field4904 = class275.field4718.method141(class304.field5235.field4650, true) / 10;
                return;
            }
            class241.method1691((byte) -110);
            class287.field4904 = 10;
        }
        if (class287.field4904 == 10) {
            class187.field2990 = 8.0F;
            class169.field2758 = 8.0F;
            field2666 = class304.field5235.field4646 >> 6 << 6;
            class248.field4219 = (class304.field5235.field4651 >> 6 << 6) + 64 - field2666;
            int var1 = field2666 + class248.field4219 - class290.field4936 - (class268.field4551.field3814 >> 7) - 1;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            class22.field239 = class304.field5235.field4637 >> 6 << 6;
            class184.field2955 = (class304.field5235.field4638 >> 6 << 6) + 64 - class22.field239;
            int var3 = (class268.field4551.field3821 >> 7) + class120.field2006 - class22.field239;
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            if (var4 >= 0 && class184.field2955 > var4 && var2 >= 0 && var2 < class248.field4219) {
                class282.field4813 = var2;
                class114.field1915 = var4;
            } else {
                class114.field1915 = class304.field5235.field4654 * 64 - class22.field239;
                class282.field4813 = class248.field4219 + field2666 - (class304.field5235.field4647 * 64) - 1;
            }
            class225.method1595((byte) 87);
            int var5 = class251.field4247 >> 2 << 10;
            int var6 = class184.field2955 >> 6;
            int var7 = class276.field4741 >> 1;
            int var8 = class248.field4219 >> 6;
            class32.field445 = new int[var6][var8][];
            class271.field4609 = new byte[var6][var8][];
            class41.field619 = new byte[var6][var8][];
            class14.field118 = new byte[var6][var8][];
            class192.field3234 = new int[class297.field5073 + 1];
            class177.field2841 = new int[var6][var8][];
            class226.field3941 = new byte[var6][var8][];
            class266.field4497 = new byte[var6][var8][];
            class238.field4075 = new short[var6][var8][];
            class156.method1154(var5, true, var7);
            class287.field4904 = 20;
        } else if (class287.field4904 == 20) {
            class22.method98(-104, new class92(class229.field3988.method139(class304.field5235.field4650, class222.field3881, arg0 + 8873)));
            class287.field4904 = 30;
            class137.method1037(25, true);
            class176.method1239((byte) -94);
        } else if (arg0 == -8863) {
            if (class287.field4904 == 30) {
                class80.method620(new class92(class229.field3988.method139(class304.field5235.field4650, class115.field1929, 10)), true);
                class287.field4904 = 40;
                class176.method1239((byte) -94);
            } else if (class287.field4904 == 40) {
                class209.method1466(new class92(class229.field3988.method139(class304.field5235.field4650, class220.field3786, 10)), (byte) -13);
                class287.field4904 = 50;
                class176.method1239((byte) -94);
            } else if (class287.field4904 == 50) {
                class113.method887(1, new class92(class229.field3988.method139(class304.field5235.field4650, class98.field1608, 10)));
                class287.field4904 = 60;
                class137.method1037(25, true);
                class176.method1239((byte) -94);
            } else if (class287.field4904 == 60) {
                class252.field4270 = class19.method79(class254.method1772(new class62[] { class304.field5235.field4650, class21.field228 }, 0), (byte) 78, class229.field3988);
                class287.field4904 = 70;
                class176.method1239((byte) -94);
            } else if (class287.field4904 == 70) {
                class198.field3341 = new class242(11, true, class243.field4132);
                class287.field4904 = 73;
                class137.method1037(25, true);
                class176.method1239((byte) -94);
            } else if (class287.field4904 == 73) {
                class241.field4107 = new class242(12, true, class243.field4132);
                class287.field4904 = 76;
                class137.method1037(25, true);
                class176.method1239((byte) -94);
            } else if (class287.field4904 == 76) {
                class24.field271 = new class242(14, true, class243.field4132);
                class287.field4904 = 79;
                class137.method1037(arg0 ^ 0xFFFFDD78, true);
                class176.method1239((byte) -94);
            } else if (class287.field4904 == 79) {
                class208.field3528 = new class242(17, true, class243.field4132);
                class287.field4904 = 82;
                class137.method1037(arg0 + 8888, true);
                class176.method1239((byte) -94);
            } else if (class287.field4904 == 82) {
                class97.field1595 = new class242(19, true, class243.field4132);
                class287.field4904 = 85;
                class137.method1037(25, true);
                class176.method1239((byte) -94);
            } else if (class287.field4904 == 85) {
                class20.field192 = new class242(22, true, class243.field4132);
                class287.field4904 = 88;
                class137.method1037(arg0 + 8888, true);
                class176.method1239((byte) -94);
            } else if (class287.field4904 == 88) {
                class156.field2509 = new class242(26, true, class243.field4132);
                class287.field4904 = 91;
                class137.method1037(25, true);
                class176.method1239((byte) -94);
            } else {
                class56.field830 = new class242(30, true, class243.field4132);
                class287.field4904 = 100;
                class137.method1037(25, true);
                class176.method1239((byte) -94);
                class90.field1422 = -1;
                class103.field1696 = -1;
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lu;I)I", line = 284)
    public static final int method1183(class204 arg0, int arg1) {
        field2655++;
        class275 var2 = arg0.field3435;
        if (var2.field4720 != null) {
            var2 = var2.method1878(false);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4679;
        if (arg0.field3879 == arg0.field3876) {
            var3 = var2.field4692;
        } else if (arg0.field3876 == arg0.field3875) {
            var3 = var2.field4696;
        }
        if (arg1 <= 77) {
            field2653 = (int[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Z", line = 315)
    public static final boolean method1184(int arg0, int arg1) {
        if (arg0 != 1494583933) {
            field2652 = (class241) null;
        }
        field2654++;
        return (arg1 >> 29 & 0x1) != 0;
    }
}
