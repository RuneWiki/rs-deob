import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class182 extends class33 {

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
    private int field3566 = 32768;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "Lrd;")
    public static class173 field3562 = class133.method843(" )2> ", 116);

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "Lrd;")
    private static class173 field3574 = class133.method843("Too many connections from your address)3", 18);

    @OriginalMember(owner = "client!sc", name = "cb", descriptor = "Lrd;")
    public static class173 field3578 = field3574;

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "I")
    public static int field3575 = 0;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "Laf;")
    public static class7 field3571 = new class7(64);

    @OriginalMember(owner = "client!sc", name = "db", descriptor = "I")
    public static int field3579 = 1;

    @OriginalMember(owner = "client!sc", name = "fb", descriptor = "Lrd;")
    public static class173 field3581 = class133.method843("Konfig geladen)3", -73);

    @OriginalMember(owner = "client!sc", name = "eb", descriptor = "I")
    public static int field3580 = -2;

    @OriginalMember(owner = "client!sc", name = "gb", descriptor = "Z")
    public static boolean field3582 = false;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!sc", name = "ab", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!sc", name = "bb", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!sc", name = "hb", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "Lbc;")
    public static class14 field3564;

    @OriginalMember(owner = "client!sc", name = "ib", descriptor = "La;")
    public static class1 field3584;

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "Lce;")
    public static class26 field3573;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
    public final void method179(int arg0) {
        if (arg0 == -1) {
            class172.method1105(5000);
            ++field3568;
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(III)V")
    public static final void method1235(int arg0, int arg1, int arg2) {
        class97.field1773 = true;
        class23.field497 = arg0;
        class3.field23 = arg1;
        class57.field1142 = arg2;
        class116.field2154 = -1;
        class139.field2598 = -1;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)[[I")
    public final int[][] method178(int arg0, int arg1) {
        ++field3569;
        int[][] var3 = super.field731.method1340(-101, arg1);
        if (arg0 <= 112) {
            method1239(-100);
        }
        if (super.field731.field3925) {
            int[] var4 = this.method262(arg1, 9, 1);
            int[] var5 = this.method262(arg1, -123, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class117.field2173; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field3566 >> 12;
                int var12 = class57.field1143[var10] * var11 >> 12;
                int var13 = class26.field545 & (var12 >> 12) + arg1;
                int var14 = class54.field1079[var10] * var11 >> 12;
                int var15 = class125.field2347 & (var14 >> 12) + var9;
                int[][] var16 = this.method259(0, -9, var13);
                var6[var9] = var16[0][var15];
                var7[var9] = var16[1][var15];
                var8[var9] = var16[2][var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIII)V")
    public static final void method1236(int arg0, int arg1, int arg2, int arg3) {
        ++field3577;
        if (~arg2 <= -129 && ~arg0 <= -129 && arg2 <= 13056 && ~arg0 >= -13057) {
            int var4 = class56.method361(class172.field3347, arg0, (byte) -67, arg2) - arg1;
            int var5 = class72.field1396[class186.field3635];
            int var6 = class72.field1404[class186.field3635];
            int var7 = var4 - class168.field3246;
            int var8 = arg2 - class62.field1225;
            int var9 = class72.field1404[class183.field3595];
            int var10 = arg0 - class97.field1778;
            int var11 = class72.field1396[class183.field3595];
            int var12 = var8 * var9 + var10 * var11 >> 16;
            int var13 = var9 * var10 + -(var8 * var11) >> 16;
            int var15 = var6 * var7 - var5 * var13 >> 16;
            if (arg3 == -1) {
                int var16 = var5 * var7 + var6 * var13 >> 16;
                if (~var16 <= -51) {
                    class15.field352 = (var15 << 9) / var16 + 167;
                    class189.field3678 = (var12 << 9) / var16 + 256;
                } else {
                    class15.field352 = -1;
                    class189.field3678 = -1;
                }
            }
        } else {
            class15.field352 = -1;
            class189.field3678 = -1;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZI)Lac;")
    public static final class4 method1237(boolean arg0, int arg1) {
        ++field3567;
        class4 var2 = (class4) class105.field1938.method46((long) arg1, 26580);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class21.field465.method142(class214.method1407(arg1, -27987512), class149.method983(arg0, arg1), (byte) 2);
            class4 var4 = new class4();
            var4.field90 = arg1;
            if (var3 != null) {
                var4.method27(new class121(var3), -11707);
            }
            var4.method30(95);
            if (var4.field100) {
                var4.field45 = 0;
                var4.field77 = false;
            }
            class105.field1938.method52(-3583, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(JI)V")
    public static final void method1238(long arg0, int arg1) {
        if (arg1 != -1649689620) {
            method1236(-91, 9, -11, -34);
        }
        ++field3570;
        if (arg0 != 0L) {
            for (int var3 = 0; class149.field2840 > var3; ++var3) {
                if (class52.field1074[var3] == arg0) {
                    --class149.field2840;
                    ++class56.field1111;
                    for (int var4 = var3; class149.field2840 > var4; ++var4) {
                        class52.field1074[var4] = class52.field1074[var4 + 1];
                        class191.field3730[var4] = class191.field3730[var4 - -1];
                    }
                    class189.field3692 = class34.field741;
                    class165.field3175.method1023(47, arg1 ^ 1649676590);
                    class165.field3175.method756(arg0, 127);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)V")
    public static void method1239(int arg0) {
        if (arg0 == -1) {
            field3571 = null;
            field3573 = null;
            field3578 = null;
            field3574 = null;
            field3562 = null;
            field3584 = null;
            field3581 = null;
            field3564 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        int var3 = 79 / ((-65 - arg1) / 60);
        ++field3565;
        int[] var4 = super.field718.method514(arg0, -20);
        if (super.field718.field1615) {
            int[] var5 = this.method262(arg0, -105, 1);
            int[] var6 = this.method262(arg0, 59, 2);
            for (int var7 = 0; ~var7 > ~class117.field2173; ++var7) {
                int var8 = var5[var7] >> 4 & 255;
                int var9 = var6[var7] * this.field3566 >> 12;
                int var10 = class57.field1143[var8] * var9 >> 12;
                int var11 = class54.field1079[var8] * var9 >> 12;
                int var12 = (var11 >> 12) + var7 & class125.field2347;
                int var13 = class26.field545 & (var10 >> 12) + arg0;
                int[] var14 = this.method262(var13, -1, 0);
                var4[var7] = var14[var12];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
    public static final void method1240(boolean arg0) {
        ++field3572;
        if (class34.field738 != null) {
            class34.field738.method1095((byte) 127);
            class34.field738 = null;
        }
        class84.method548(16118);
        class124.method799();
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class35.field760[var1].method1183((byte) -57);
        }
        System.gc();
        class143.method904(1, 2);
        class138.field2588 = arg0;
        class170.field3282 = -1;
        class40.method297((byte) 36);
        class148.method978(10, 8780);
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class182() {
        super(3, false);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (arg1 < -99) {
            if (~arg0 != -1) {
                if (~arg0 == -2) {
                    super.field729 = arg2.method751((byte) 93) == 1;
                }
            } else {
                this.field3566 = arg2.method755((byte) -77) << 4;
            }
            ++field3576;
        }
    }
}
