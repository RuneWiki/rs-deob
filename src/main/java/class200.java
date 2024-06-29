import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class200 extends class157 {

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "I")
    private int field3574 = 2048;

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "I")
    private int field3573 = 0;

    @OriginalMember(owner = "client!qh", name = "T", descriptor = "I")
    private int field3577 = 10;

    @OriginalMember(owner = "client!qh", name = "Y", descriptor = "I")
    public static int field3582 = 0;

    @OriginalMember(owner = "client!qh", name = "ab", descriptor = "Lcc;")
    public static class209 field3584 = class95.method669(101, "scrollbar");

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "Lcc;")
    public static class209 field3572 = class95.method669(120, ")4j");

    @OriginalMember(owner = "client!qh", name = "eb", descriptor = "Lcc;")
    public static class209 field3588 = class95.method669(106, "::gc");

    @OriginalMember(owner = "client!qh", name = "gb", descriptor = "I")
    public static int field3590 = 5063219;

    @OriginalMember(owner = "client!qh", name = "fb", descriptor = "Lcc;")
    private static class209 field3589 = class95.method669(123, "glow3:");

    @OriginalMember(owner = "client!qh", name = "hb", descriptor = "Lcc;")
    public static class209 field3591 = field3589;

    @OriginalMember(owner = "client!qh", name = "S", descriptor = "Lcc;")
    public static class209 field3576 = field3589;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!qh", name = "U", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!qh", name = "V", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!qh", name = "W", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!qh", name = "X", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!qh", name = "Z", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!qh", name = "bb", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!qh", name = "cb", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!qh", name = "ib", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!qh", name = "jb", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!qh", name = "db", descriptor = "[I")
    private int[] field3587;

    @OriginalMember(owner = "client!qh", name = "kb", descriptor = "[I")
    private int[] field3594;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "(I)V")
    private final void method1365(int arg0) {
        int var2 = 48 / ((-11 - arg0) / 42);
        this.field3594 = new int[this.field3577 + 1];
        ++field3592;
        int var3 = 0;
        this.field3587 = new int[this.field3577 + 1];
        int var4 = 4096 / this.field3577;
        int var5 = this.field3574 * var4 >> 12;
        for (int var6 = 0; this.field3577 > var6; ++var6) {
            this.field3587[var6] = var3;
            this.field3594[var6] = var3 - -var5;
            var3 += var4;
        }
        this.field3587[this.field3577] = 4096;
        this.field3594[this.field3577] = 4096 - -this.field3594[0];
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        this.method1365(73);
        ++field3575;
        int var2 = -127 / ((arg0 - -51) / 52);
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(III)Ljh;")
    public static final class284 method1366(int arg0, int arg1, int arg2) {
        ++field3585;
        if (arg0 < 30) {
            return null;
        } else {
            for (class284 var3 = (class284) class21.field396.method1119(20896); var3 != null; var3 = (class284) class21.field396.method1120(117)) {
                if (var3.field5007 && var3.method1909(0, arg1, arg2)) {
                    return var3;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    public class200() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V")
    public static void method1367(byte arg0) {
        field3572 = null;
        if (arg0 != -57) {
            method1371(-68, (class49) null);
        }
        field3584 = null;
        field3576 = null;
        field3589 = null;
        field3588 = null;
        field3591 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        int[] var3 = super.field2879.method1269(arg1, 17885);
        ++field3593;
        if (super.field2879.field3363) {
            int var4 = class129.field2479[arg1];
            if (this.field3573 != 0) {
                for (int var5 = 0; class226.field4124 > var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class50.field987[var5];
                    int var9 = this.field3573;
                    if (~var9 != -2) {
                        if (var9 != 2) {
                            if (var9 == 3) {
                                var6 = (var8 - var4 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var4 + var8 + -4096 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; var10 < this.field3577; ++var10) {
                        if (~this.field3587[var10] >= ~var6 && var6 < this.field3587[var10 + 1]) {
                            if (this.field3594[var10] > var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field3577; ++var12) {
                    if (var4 >= this.field3587[var12] && var4 < this.field3587[var12 + 1]) {
                        if (this.field3594[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class270.method1844(var3, 0, class226.field4124, var11);
            }
        }
        if (arg0 != -98) {
            this.method1(-121, (byte) -46, (class106) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "(I)V")
    public static final void method1368(int arg0) {
        if (arg0 == 19201) {
            class62.field1230.method664(125);
            ++field3578;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lde;I)I")
    public static final int method1369(class108 arg0, int arg1) {
        int var2 = -56 % ((48 - arg1) / 57);
        int var3 = arg0.field2161;
        ++field3581;
        if (arg0.field1551 == arg0.field1549) {
            var3 = arg0.field2176;
        } else if (~arg0.field1551 == ~arg0.field1513) {
            var3 = arg0.field2148;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lsj;I)I")
    public static final int method1370(class49 arg0, int arg1) {
        ++field3579;
        int var2 = 0;
        if (arg0.method351((byte) 82, class1.field8)) {
            ++var2;
        }
        if (arg1 != 1) {
            field3589 = null;
        }
        if (arg0.method351((byte) -128, class253.field4552)) {
            ++var2;
        }
        if (arg0.method351((byte) 79, class36.field619)) {
            ++var2;
        }
        if (arg0.method351((byte) -117, class239.field4328)) {
            ++var2;
        }
        if (arg0.method351((byte) 8, class122.field2412)) {
            ++var2;
        }
        if (arg0.method351((byte) -117, class94.field1862)) {
            ++var2;
        }
        if (arg0.method351((byte) -113, class201.field3597)) {
            ++var2;
        }
        if (arg0.method351((byte) -111, class144.field2658)) {
            ++var2;
        }
        if (arg0.method351((byte) 9, class257.field4659)) {
            ++var2;
        }
        if (arg0.method351((byte) 16, class75.field1399)) {
            ++var2;
        }
        if (arg0.method351((byte) 51, class231.field4202)) {
            ++var2;
        }
        if (arg0.method351((byte) -125, class137.field2565)) {
            ++var2;
        }
        if (arg0.method351((byte) -110, class104.field2009)) {
            ++var2;
        }
        if (arg0.method351((byte) 31, class165.field2982)) {
            ++var2;
        }
        if (arg0.method351((byte) -128, class215.field3870)) {
            ++var2;
        }
        if (arg0.method351((byte) -114, class67.field1278)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILsj;)V")
    public static final void method1371(int arg0, class49 arg1) {
        ++field3583;
        class264.field4737 = class159.method1102(0, arg1, -1, class1.field8);
        class70.field1333 = new class194[class264.field4737.length];
        class185.field3336 = new class194[class264.field4737.length];
        class170.field3112 = new class194[class264.field4737.length];
        for (int var2 = 0; ~class264.field4737.length < ~var2; ++var2) {
            class264.field4737[var2].method1327();
            class70.field1333[var2] = class264.field4737[var2].method1334();
            class264.field4737[var2].method1327();
            class185.field3336[var2] = class264.field4737[var2].method1334();
            class264.field4737[var2].method1327();
            class170.field3112[var2] = class264.field4737[var2].method1334();
            class264.field4737[var2].method1327();
        }
        class163.field2950 = class103.method706(arg1, (byte) -81, class253.field4552, 0);
        class254.field4577 = class257.method1786(class36.field619, 10, 0, arg1);
        class44.field876 = class257.method1786(class239.field4328, 10, 0, arg1);
        class130.field2496 = class257.method1786(class122.field2412, 10, 0, arg1);
        if (arg0 == 7) {
            class198.field3557 = class257.method1786(class94.field1862, 10, 0, arg1);
            class249.field4482 = class45.method337(arg1, (byte) -122, 0, class201.field3597);
            class261.field4697 = class45.method337(arg1, (byte) 84, 0, class144.field2658);
            class176.field3223 = class155.method1087(arg1, 0, class257.field4659, (byte) -22);
            class256.field4630 = class45.method337(arg1, (byte) -86, 0, class75.field1399);
            class97.field1896 = class45.method337(arg1, (byte) -102, 0, class231.field4202);
            class206.field3688 = class23.method192(0, false, arg1, class137.field2565);
            class234.field4218 = class23.method192(0, false, arg1, class104.field2009);
            class66.field1270.method1279(class234.field4218, (int[]) null);
            class256.field4623.method1279(class234.field4218, (int[]) null);
            class66.field1269.method1279(class234.field4218, (int[]) null);
            class269 var3 = class224.method1578(0, -60, arg1, class215.field3870);
            var3.method1835();
            class145.field2680 = var3;
            class269[] var4 = class103.method706(arg1, (byte) -81, class67.field1278, 0);
            for (int var5 = 0; ~var4.length < ~var5; ++var5) {
                var4[var5].method1835();
            }
            class209.field3765 = var4;
            int var6 = -10 + (int) (21.0D * Math.random());
            int var7 = (int) (21.0D * Math.random()) - 10;
            int var8 = (int) (41.0D * Math.random()) - 20;
            int var9 = (int) (Math.random() * 21.0D) + -10;
            for (int var10 = 0; ~var10 > ~class163.field2950.length; ++var10) {
                class163.field2950[var10].method1838(var6 - -var8, var7 + var8, var8 + var9);
            }
            class264.field4737[0].method1333(var6 + var8, var7 - -var8, var8 + var9);
            class230.field4186 = class163.field2950;
        }
    }

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "(I)V")
    public static final void method1372(int arg0) {
        client.field2818.method294(arg0 + 2917);
        ++field3586;
        int var1 = client.field2818.method289(8, 1);
        if (~var1 != -1) {
            int var2 = client.field2818.method289(8, 2);
            if (~var2 == -1) {
                class211.field3840[class244.field4423++] = 2047;
            } else if (var2 == 1) {
                int var3 = client.field2818.method289(8, 3);
                class223.field4069.method570(false, var3, false);
                int var4 = client.field2818.method289(8, 1);
                if (~var4 == -2) {
                    class211.field3840[class244.field4423++] = 2047;
                }
            } else if (~var2 == -3) {
                int var5 = client.field2818.method289(8, 3);
                class223.field4069.method570(true, var5, false);
                int var6 = client.field2818.method289(arg0 ^ -2852, 3);
                class223.field4069.method570(true, var6, false);
                int var7 = client.field2818.method289(8, 1);
                if (~var7 == -2) {
                    class211.field3840[class244.field4423++] = 2047;
                }
            } else if (~var2 == -4) {
                int var8 = client.field2818.method289(8, 1);
                class99.field1937 = client.field2818.method289(arg0 ^ -2852, 2);
                int var9 = client.field2818.method289(8, 1);
                if (var9 == 1) {
                    class211.field3840[class244.field4423++] = 2047;
                }
                int var10 = client.field2818.method289(8, 7);
                int var11 = client.field2818.method289(arg0 + 2868, 7);
                class223.field4069.method784(var11, var8 == 1, var10, arg0 ^ -2834);
            } else if (arg0 != -2860) {
                field3589 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        ++field3571;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field3573 = arg2.method774((byte) 100);
                }
            } else {
                this.field3574 = arg2.method736(125);
            }
        } else {
            this.field3577 = arg2.method774((byte) 87);
        }
        if (arg1 > -29) {
            this.field3594 = null;
        }
    }
}
