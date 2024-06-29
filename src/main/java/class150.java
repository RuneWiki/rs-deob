import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class150 extends class170 {

    @OriginalMember(owner = "client!qa", name = "ib", descriptor = "I")
    private int field2638 = 32768;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "Lqk;")
    public static class207 field2628 = class24.method212(255, "null");

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "Lqk;")
    public static class207 field2629 = class24.method212(255, "Veuillez patienter )2 tentative de r-Btablissement)3");

    @OriginalMember(owner = "client!qa", name = "db", descriptor = "Lqk;")
    public static class207 field2633 = class24.method212(255, " (X");

    @OriginalMember(owner = "client!qa", name = "jb", descriptor = "[I")
    public static int[] field2639 = new int[100];

    @OriginalMember(owner = "client!qa", name = "kb", descriptor = "[J")
    public static long[] field2640 = new long[200];

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!qa", name = "ab", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!qa", name = "cb", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!qa", name = "eb", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!qa", name = "gb", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!qa", name = "lb", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!qa", name = "hb", descriptor = "Lsh;")
    public static class212 field2637;

    @OriginalMember(owner = "client!qa", name = "bb", descriptor = "Z")
    public static boolean field2631;

    @OriginalMember(owner = "client!qa", name = "fb", descriptor = "[Luh;")
    public static class100[] field2635;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lpk;ILpk;)V")
    public static final void method1088(class99 arg0, int arg1, class99 arg2) {
        class107.field1901 = arg0;
        ++field2630;
        class48.field948 = arg2;
        if (arg1 != -24843) {
            method1089((byte) -106);
        }
        class12.field171 = class48.field948.method698(arg1 ^ -24846, 3);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method32(int arg0, boolean arg1) {
        if (arg1) {
            field2629 = null;
        }
        int[][] var3 = super.field3002.method427(arg0, 239);
        if (super.field3002.field1077) {
            int[] var4 = this.method1226(1, arg0, -64);
            int[] var5 = this.method1226(2, arg0, 122);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class88.field1595 < ~var9; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field2638 >> 12;
                int var12 = class95.field1690[var10] * var11 >> 12;
                int var13 = class207.field3689[var10] * var11 >> 12;
                int var14 = (var13 >> 12) + var9 & class94.field1684;
                int var15 = class233.field4294 & (var12 >> 12) + arg0;
                int[][] var16 = this.method1223(0, 107, var15);
                var7[var9] = var16[0][var14];
                var6[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        ++field2641;
        return var3;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)V")
    public static final void method1089(byte arg0) {
        ++field2626;
        if (!class213.field3774 && ~class164.field2903 != -3) {
            try {
                class187.field3302.method1465(63, class136.field2347);
                int var1 = 80 / ((-19 - arg0) / 44);
            } catch (Throwable var2) {
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        if (arg0 != -30) {
            field2631 = false;
        }
        ++field2636;
        int[] var3 = super.field3001.method1538(95, arg1);
        if (super.field3001.field3835) {
            int[] var4 = this.method1226(1, arg1, 120);
            int[] var5 = this.method1226(2, arg1, -88);
            for (int var6 = 0; ~var6 > ~class88.field1595; ++var6) {
                int var7 = (var4[var6] & 4090) >> 4;
                int var8 = var5[var6] * this.field2638 >> 12;
                int var9 = class207.field3689[var7] * var8 >> 12;
                int var10 = (var9 >> 12) + var6 & class94.field1684;
                int var11 = class95.field1690[var7] * var8 >> 12;
                int var12 = arg1 - -(var11 >> 12) & class233.field4294;
                int[] var13 = this.method1226(0, var12, -112);
                var3[var6] = var13[var10];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public final void method50(int arg0) {
        if (arg0 <= 14) {
            field2629 = null;
        }
        ++field2632;
        class235.method1681(-125);
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    public class150() {
        super(3, false);
    }

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V")
    public static void method1090(int arg0) {
        field2628 = null;
        int var1 = 60 % ((arg0 - 51) / 36);
        field2639 = null;
        field2629 = null;
        field2635 = null;
        field2637 = null;
        field2640 = null;
        field2633 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (arg1 != 5877) {
            field2637 = null;
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field2998 = arg0.method1045((byte) 99) == 1;
            }
        } else {
            this.field2638 = arg0.method1050(1272006568) << 4;
        }
        ++field2627;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZLa;)V")
    public static final void method1091(int arg0, boolean arg1, class47 arg2) {
        ++field2634;
        if (arg0 == -11138) {
            int var3 = (int) arg2.field3407;
            int var4 = arg2.field934;
            arg2.method1346((byte) -16);
            if (arg1) {
                class107.method776(true, var4);
            }
            class190.method1324(true, var4);
            class220 var5 = class233.method1667(var3, 114);
            if (var5 != null) {
                class82.method614((byte) 80, var5);
            }
            int var6 = class268.field4751;
            for (int var7 = 0; ~var6 < ~var7; ++var7) {
                if (class147.method1022(class82.field1494[var7], 7)) {
                    class186.method1300(arg0 ^ -11229, var7);
                }
            }
            if (class268.field4751 == 1) {
                class256.field4588 = false;
                class245.method1725(class132.field2279, class214.field3806, class17.field268, 0, class182.field3250);
            } else {
                class245.method1725(class132.field2279, class214.field3806, class17.field268, 0, class182.field3250);
                int var8 = class284.field4996.method1608(class83.field1533);
                for (int var9 = 0; ~var9 > ~class268.field4751; ++var9) {
                    int var10 = class284.field4996.method1608(class244.method1718(var9, arg0 ^ -11138));
                    if (var8 < var10) {
                        var8 = var10;
                    }
                }
                class132.field2279 = var8 + 8;
                class214.field3806 = class268.field4751 * 15 - -(class221.field4068 ? 26 : 22);
            }
            if (class165.field2915 != -1) {
                class41.method313(1, true, class165.field2915);
            }
        }
    }
}
