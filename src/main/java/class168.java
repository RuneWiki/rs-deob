import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class168 {

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "Lik;")
    private class115 field2814 = new class115();

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "Lra;")
    private class40 field2826 = new class40();

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    private int field2823;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    private int field2822;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "Lbc;")
    private class201 field2824;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Lub;")
    public static class227 field2811 = class257.method1749("<br>", 17263);

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "[I")
    public static int[] field2808 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "[I")
    public static int[] field2825 = new int[32];

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "Lrb;")
    public static class254 field2806 = new class254(64);

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "Lub;")
    public static class227 field2827 = class257.method1749("M", 17263);

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "[Lna;")
    public static class209[] field2807;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "[Lnf;")
    public static class213[] field2821;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILik;J)V")
    public final void method1032(int arg0, class115 arg1, long arg2) {
        field2820++;
        if (this.field2823 == 0) {
            class115 var5 = this.field2826.method219(21786);
            var5.method369(-55);
            var5.method727((byte) 2);
            if (this.field2814 == var5) {
                class115 var6 = this.field2826.method219(arg0 ^ 0xFFFFA9CC);
                var6.method369(-95);
                var6.method727((byte) 2);
            }
        } else {
            this.field2823--;
        }
        if (arg0 != -810) {
            field2825 = null;
        }
        this.field2824.method1300(arg1, arg2, arg0 ^ 0x813);
        this.field2826.method217(29, arg1);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)Lsf;")
    public final class60 method1033(int arg0) {
        if (arg0 == -27791) {
            field2818++;
            return this.field2824.method1299((byte) 125);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)V")
    public static final void method1034(int arg0, boolean arg1) {
        class114.method725((byte) -81);
        field2813++;
        if (class184.field3139 != 30 && class184.field3139 != 25) {
            return;
        }
        class184.field3134++;
        if (arg0 != 30 || class184.field3134 < 50 && !arg1) {
            return;
        }
        class184.field3134 = 0;
        if (!class109.field2044 && class9.field172 != null) {
            class176.field2935.method664((byte) 73, 233);
            class139.field2411++;
            try {
                class9.field172.method94(class176.field2935.field3879, (byte) -24, class176.field2935.field3901, 0);
                class176.field2935.field3879 = 0;
            } catch (IOException var2) {
                class109.field2044 = true;
            }
        }
        class114.method725((byte) -41);
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)Lsf;")
    public final class60 method1035(int arg0) {
        field2812++;
        if (arg0 != 1) {
            this.method1032(-112, (class115) null, 122L);
        }
        return this.field2824.method1295((byte) 31);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILhj;BII)V")
    public static final void method1036(int arg0, class147 arg1, byte arg2, int arg3, int arg4) {
        field2817++;
        if (class94.field1631 >= 400) {
            return;
        }
        if (arg1.field2563 != null) {
            arg1 = arg1.method933(29882);
        }
        if (arg1 == null || !arg1.field2562) {
            return;
        }
        class227 var5 = arg1.field2538;
        if (arg1.field2576 != 0) {
            var5 = class76.method445((byte) -86, new class227[] { var5, class36.method194(class216.field3639.field3802, (byte) 113, arg1.field2576), class178.field3020, class151.field2630, class204.method1303(arg1.field2576, 1), class27.field447 });
        }
        int var6 = -113 / ((arg2 - 73) / 48);
        if (class122.field2199 == 1) {
            class92.method538(arg4, class76.method445((byte) -114, new class227[] { class184.field3130, class205.field3493, var5 }), arg0, (short) 49, class40.field651, (long) arg3, (byte) -31);
            class143.field2461++;
        } else if (!class57.field1050) {
            class227[] var7 = arg1.field2565;
            class182.field3102++;
            if (class173.field2883) {
                var7 = class95.method587((byte) -77, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class106.field2001 != 0 || !var7[var8].method1522(class57.field1053, (byte) -56))) {
                        class47.field848++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 9;
                        }
                        if (var8 == 1) {
                            var9 = 30;
                        }
                        if (var8 == 2) {
                            var9 = 17;
                        }
                        if (var8 == 3) {
                            var9 = 18;
                        }
                        if (var8 == 4) {
                            var9 = 10;
                        }
                        class92.method538(arg4, class76.method445((byte) -121, new class227[] { class57.field1059, var5 }), arg0, var9, var7[var8], (long) arg3, (byte) -31);
                    }
                }
            }
            if (class106.field2001 == 0 && var7 != null) {
                for (int var10 = 4; var10 >= 0; var10--) {
                    if (var7[var10] != null && var7[var10].method1522(class57.field1053, (byte) -56)) {
                        class73.field1285++;
                        short var11 = 0;
                        short var12 = 0;
                        if (arg1.field2576 > class216.field3639.field3802) {
                            var12 = 2000;
                        }
                        if (var10 == 0) {
                            var11 = 9;
                        }
                        if (var10 == 1) {
                            var11 = 30;
                        }
                        if (var10 == 2) {
                            var11 = 17;
                        }
                        if (var10 == 3) {
                            var11 = 18;
                        }
                        if (var10 == 4) {
                            var11 = 10;
                        }
                        if (var11 != 0) {
                            var11 += var12;
                        }
                        class92.method538(arg4, class76.method445((byte) 119, new class227[] { class57.field1059, var5 }), arg0, var11, var7[var10], (long) arg3, (byte) -31);
                    }
                }
            }
            class92.method538(arg4, class76.method445((byte) 45, new class227[] { class57.field1059, var5 }), arg0, (short) 1001, class73.field1286, (long) arg3, (byte) -31);
            return;
        } else if ((class177.field2983 & 0x2) == 2) {
            class57.field1030++;
            class92.method538(arg4, class76.method445((byte) -116, new class227[] { class149.field2608, class205.field3493, var5 }), arg0, (short) 25, class88.field1528, (long) arg3, (byte) -31);
            return;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IJ)Lik;")
    public final class115 method1037(int arg0, long arg1) {
        class115 var4 = (class115) this.field2824.method1298(-102, arg1);
        field2809++;
        if (arg0 < 32) {
            field2810 = -127;
        }
        if (var4 != null) {
            this.field2826.method217(29, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
    public static final void method1038(int arg0) {
        field2819++;
        int var1 = 102 % ((arg0 - 54) / 54);
        if (class100.field1753 > 0) {
            class188.method1202(true);
        } else {
            class34.field581 = class9.field172;
            class9.field172 = null;
            class12.method60(40, -98);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public final void method1039(byte arg0) {
        field2816++;
        if (arg0 >= -9) {
            method1034(-78, true);
        }
        this.field2826.method216((byte) -28);
        this.field2824.method1292(25028);
        this.field2814 = new class115();
        this.field2823 = this.field2822;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V")
    public static void method1040(byte arg0) {
        field2827 = null;
        field2806 = null;
        if (arg0 != 23) {
            method1034(-52, true);
        }
        field2808 = null;
        field2821 = null;
        field2811 = null;
        field2807 = null;
        field2825 = null;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I)V")
    public class168(int arg0) {
        this.field2823 = arg0;
        int var2 = 1;
        this.field2822 = arg0;
        while (var2 + var2 < arg0) {
            var2 += var2;
        }
        this.field2824 = new class201(var2);
    }
}
