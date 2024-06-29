import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class161 extends class59 {

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "I")
    private int field3076 = 4096;

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "[I")
    public static int[] field3081 = new int[500];

    @OriginalMember(owner = "client!rh", name = "X", descriptor = "Z")
    public static boolean field3080 = false;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "Lsd;")
    private static class166 field3077 = class135.method935("OFF", 0);

    @OriginalMember(owner = "client!rh", name = "eb", descriptor = "Lsd;")
    public static class166 field3087 = field3077;

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!rh", name = "W", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!rh", name = "bb", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!rh", name = "cb", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!rh", name = "db", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "Lkf;")
    public static class96 field3082;

    @OriginalMember(owner = "client!rh", name = "ab", descriptor = "[I")
    public static int[] field3083;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBIII)V")
    public static final void method1089(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field3085;
        class17.method90(arg0, arg2, arg0 - -arg3, arg2 + arg4);
        if (arg1 < 103) {
            method1092(-23, -12, (byte) -70, -107, -73);
        }
        class40.method279();
        ++class112.field2194;
        class99.method740(7, true);
        class167.method1162(-6612, true);
        class99.method740(7, false);
        class167.method1162(-6612, false);
        class203.method1333(-1);
        class204.method1338(127);
        if (!class25.field446) {
            int var5 = client.field515 + class89.field1756 & 2047;
            int var6 = class95.field1833;
            if (class54.field1011 / 256 > var6) {
                var6 = class54.field1011 / 256;
            }
            if (class29.field534[4] && class200.field3961[4] + 128 > var6) {
                var6 = class200.field3961[4] + 128;
            }
            class129.method913(class119.method864(class41.field728.field3526, class41.field728.field3513, class165.field3130, true) - 50, var5, class48.field886, var6 * 3 + 600, (byte) 110, class31.field571, var6);
        }
        int var7;
        if (!class25.field446) {
            var7 = class184.method1241(4);
        } else {
            var7 = class49.method376((byte) 104);
        }
        int var8 = class61.field1242;
        int var9 = class38.field690;
        int var10 = class22.field385;
        int var11 = class143.field2786;
        int var12 = class159.field3046;
        for (int var13 = 0; var13 < 5; ++var13) {
            if (class29.field534[var13]) {
                int var16 = (int) ((double) (-class12.field233[var13]) + (double) (class12.field233[var13] * 2 + 1) * Math.random() + Math.sin((double) class204.field4034[var13] / 100.0D * (double) class48.field894[var13]) * (double) class200.field3961[var13]);
                if (~var13 == -4) {
                    class159.field3046 = class159.field3046 + var16 & 2047;
                }
                if (var13 == 4) {
                    class143.field2786 += var16;
                    if (class143.field2786 < 128) {
                        class143.field2786 = 128;
                    }
                    if (~class143.field2786 < -384) {
                        class143.field2786 = 383;
                    }
                }
                if (var13 == 0) {
                    class38.field690 += var16;
                }
                if (var13 == 1) {
                    class61.field1242 += var16;
                }
                if (~var13 == -3) {
                    class22.field385 += var16;
                }
            }
        }
        int var14 = class5.field110;
        int var15 = class41.field734;
        if (var15 >= arg0 && arg0 - -arg3 > var15 && var14 >= arg2 && ~(arg2 + arg4) < ~var14) {
            class126.field2473 = -arg0 + class41.field734;
            class126.field2478 = -arg2 + class5.field110;
            class126.field2481 = 0;
            class126.field2480 = true;
        } else {
            class126.field2480 = false;
            class126.field2481 = 0;
        }
        class121.method872(false);
        class17.method91(arg0, arg2, arg3, arg4, 0);
        class121.method872(false);
        class131.field2556.method579(class38.field690, class61.field1242, class22.field385, class143.field2786, class159.field3046, var7);
        class121.method872(false);
        class131.field2556.method575();
        class29.method228(arg3, 11216, arg0, arg2, arg4);
        class109.method796(arg0, (byte) -101, arg2);
        ((class112) class40.field721).method817(50, class187.field3570);
        class82.method666(arg4, arg2, arg3, arg0, true);
        class61.field1242 = var8;
        class159.field3046 = var12;
        class143.field2786 = var11;
        class22.field385 = var10;
        class38.field690 = var9;
        if (class121.field2380 && ~class63.method531(true, false, true) == -1) {
            class121.field2380 = false;
        }
        if (class121.field2380) {
            class17.method91(arg0, arg2, arg3, arg4, 0);
            class116.method838(250, false, class146.field2880);
        }
        if (!class121.field2380 && !class192.field3654 && ~var15 <= ~arg0 && arg0 + arg3 > var15 && ~arg2 >= ~var14 && var14 < arg2 - -arg4) {
            class31.method232(true, var14, arg0, var15, arg2);
        }
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)V")
    public static void method1090(int arg0) {
        field3077 = null;
        field3081 = null;
        field3087 = null;
        field3082 = null;
        if (arg0 != -16034) {
            method1092(-127, -19, (byte) 127, 50, 12);
        }
        field3083 = null;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class161() {
        super(1, true);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field3076 = arg0.method405(2);
        }
        ++field3086;
        if (arg1 < 18) {
            this.method41((class53) null, (byte) -61, -107);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        ++field3084;
        if (arg1 >= -124) {
            this.method41((class53) null, (byte) 78, 18);
        }
        int[] var3 = super.field1219.method721(arg0, -124);
        if (super.field1219.field1816) {
            int[] var4 = this.method499(0, class137.field2679 & arg0 + -1, 0);
            int[] var5 = this.method499(0, arg0, 0);
            int[] var6 = this.method499(0, arg0 + 1 & class137.field2679, 0);
            for (int var7 = 0; class98.field1879 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field3076;
                int var9 = var8 >> 12;
                int var10 = (var5[class187.field3571 & var7 + 1] - var5[var7 + -1 & class187.field3571]) * this.field3076;
                int var11 = var9 * var9 >> 12;
                int var12 = var10 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((var11 - -4096 + var13) / 4096)));
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILsd;)Z")
    public static final boolean method1091(int arg0, class166 arg1) {
        ++field3079;
        if (arg1 == null) {
            return false;
        } else {
            int var2 = 0;
            if (arg0 != 1237) {
                field3087 = null;
            }
            while (var2 < class119.field2344) {
                if (arg1.method1146((byte) -118, class128.field2507[var2])) {
                    return true;
                }
                ++var2;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIBII)V")
    public static final void method1092(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 117) {
            field3077 = null;
        }
        for (int var5 = 0; ~class91.field1788 < ~var5; ++var5) {
            if (~arg3 > ~(class82.field1663[var5] + class22.field388[var5]) && class82.field1663[var5] < arg3 + arg4 && ~(class38.field688[var5] + class184.field3515[var5]) < ~arg1 && arg0 + arg1 > class184.field3515[var5]) {
                class95.field1834[var5] = true;
            }
        }
        ++field3078;
    }
}
