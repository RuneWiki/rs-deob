import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class165 {

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Lsc;")
    public static class181 field2803 = class149.method967(255, ")1p");

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "[[I")
    public static int[][] field2798 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lsc;")
    public static class181 field2802 = class149.method967(255, "Hidden)2");

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lhd;")
    public static class214 field2807 = new class214(8);

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field2813 = 0;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "[I")
    public static int[] field2815 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public int field2806;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public int field2810;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public int field2811;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILvf;B)V")
    private final void method1097(int arg0, class230 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field2810 = arg1.method1535(2);
            this.field2806 = arg1.method1516((byte) 82);
            this.field2811 = arg1.method1516((byte) 82);
        }
        field2801++;
        int var4 = -76 / ((54 - arg2) / 39);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLvf;)V")
    public final void method1098(byte arg0, class230 arg1) {
        if (arg0 != 23) {
            return;
        }
        field2808++;
        while (true) {
            int var3 = arg1.method1516((byte) 82);
            if (var3 == 0) {
                return;
            }
            this.method1097(var3, arg1, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)Z")
    public static final boolean method1099(byte arg0, int arg1) {
        field2805++;
        if (arg0 < 56) {
            return false;
        } else {
            return ((arg1 & 0x2DE59A) >> 21) != 0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)I")
    public static final int method1100(int arg0, boolean arg1) {
        field2800++;
        if (arg0 < 0) {
            return 0;
        }
        if (arg1) {
            field2813 = 9;
        }
        class196 var2 = (class196) class254.field4435.method1424(true, (long) arg0);
        if (var2 == null) {
            return class26.method222(arg0, (byte) -88).field2111;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field3420.length; var4++) {
            if (var2.field3420[var4] == -1) {
                var3++;
            }
        }
        return var3 + class26.method222(arg0, (byte) -29).field2111 - var2.field3420.length;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(IZ)V")
    public static final void method1101(int arg0, boolean arg1) {
        class253.method1724(class143.field2321, class243.field4227, arg1, 1490393848, class41.field620);
        if (arg0 != 8) {
            method1103(true);
        }
        field2804++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILvf;I)Lsc;")
    public static final class181 method1102(int arg0, class230 arg1, int arg2) {
        field2812++;
        try {
            class181 var3 = new class181();
            if (arg2 != 4) {
                return null;
            }
            var3.field3155 = arg1.method1517(false);
            if (arg0 < var3.field3155) {
                var3.field3155 = arg0;
            }
            var3.field3166 = new byte[var3.field3155];
            arg1.field3933 += class156.field2608.method143(var3.field3155, var3.field3166, 0, arg1.field3977, -62, arg1.field3933);
            return var3;
        } catch (Exception var4) {
            return class168.field2830;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public static void method1103(boolean arg0) {
        field2803 = null;
        field2807 = null;
        field2815 = null;
        field2802 = null;
        field2798 = null;
        if (!arg0) {
            method1104(23);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static final void method1104(int arg0) {
        class174.field2920 = null;
        class63.field984 = null;
        class70.field1130 = null;
        if (arg0 <= -96) {
            class87.field1385 = null;
            field2809++;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZLej;)V")
    public static final void method1105(int arg0, boolean arg1, class142 arg2) {
        if (arg0 != -1) {
            method1103(false);
        }
        field2814++;
        if (arg1) {
            class209.field3590 = 3;
            class209.method1385(false, (byte) 119);
            class225.field3883 = 0;
            class78.field1268 = false;
            class173.field2911 = 127;
            class55.field849 = 127;
            class184.field3252 = 0;
            class180.field3140 = false;
            class77.field1241 = false;
            class82.field1317 = false;
            class85.field1351 = 0;
            class239.field4154 = false;
            class264.field4614 = false;
            class8.field140 = false;
            class242.field4212 = 0;
            class207.field3552 = false;
            class73.field1166 = false;
            class239.field4165 = false;
            class94.field1502 = 255;
            class254.field4445 = false;
            class148.field2481 = false;
            class120.method788(arg2, 20374);
            return;
        }
        class209.field3590 = 3;
        class209.method1385(true, (byte) 119);
        class82.field1317 = true;
        class264.field4614 = true;
        class254.field4445 = true;
        class8.field140 = true;
        class184.field3252 = 2;
        class73.field1166 = true;
        class239.field4154 = true;
        class173.field2911 = 127;
        class239.field4165 = true;
        class77.field1241 = true;
        class94.field1502 = 255;
        class78.field1268 = true;
        class148.field2481 = true;
        class242.field4212 = 0;
        class85.field1351 = 0;
        class225.field3883 = 0;
        class6 var3 = null;
        class207.field3552 = true;
        class180.field3140 = true;
        class55.field849 = 127;
        try {
            class118 var4 = arg2.method910("runescape", (byte) -35);
            while (var4.field1933 == 0) {
                class95.method632(true, 1L);
            }
            if (var4.field1933 == 1) {
                var3 = (class6) var4.field1935;
                byte[] var5 = new byte[(int) var3.method51(0)];
                int var7;
                for (int var6 = 0; var6 < var5.length; var6 += var7) {
                    var7 = var3.method47(var5.length - var6, true, var5, var6);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class187.method1300(new class230(var5), true);
            }
        } catch (Exception var9) {
        }
        try {
            if (var3 != null) {
                var3.method49(false);
                return;
            }
        } catch (Exception var8) {
            return;
        }
    }
}
