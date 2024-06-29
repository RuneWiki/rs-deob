import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class155 extends class165 {

    @OriginalMember(owner = "client!oc", name = "kb", descriptor = "Z")
    private volatile boolean field2827 = false;

    @OriginalMember(owner = "client!oc", name = "fb", descriptor = "Z")
    private boolean field2822 = false;

    @OriginalMember(owner = "client!oc", name = "gb", descriptor = "I")
    private int field2823 = -1;

    @OriginalMember(owner = "client!oc", name = "qb", descriptor = "I")
    private int field2833;

    @OriginalMember(owner = "client!oc", name = "vb", descriptor = "Lu;")
    private class214 field2838;

    @OriginalMember(owner = "client!oc", name = "xb", descriptor = "Lu;")
    private class214 field2840;

    @OriginalMember(owner = "client!oc", name = "db", descriptor = "[S")
    public static short[] field2820 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!oc", name = "ib", descriptor = "[I")
    public static int[] field2825 = new int[99];

    @OriginalMember(owner = "client!oc", name = "wb", descriptor = "Lmb;")
    public static class132 field2839 = class166.method1092("Lade Konfiguration )2 ", 115);

    @OriginalMember(owner = "client!oc", name = "zb", descriptor = "Lmb;")
    private static class132 field2842;

    @OriginalMember(owner = "client!oc", name = "Ab", descriptor = "Lmb;")
    public static class132 field2843;

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!oc", name = "eb", descriptor = "I")
    private int field2821;

    @OriginalMember(owner = "client!oc", name = "hb", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!oc", name = "jb", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!oc", name = "lb", descriptor = "I")
    private int field2828;

    @OriginalMember(owner = "client!oc", name = "mb", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!oc", name = "nb", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!oc", name = "pb", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!oc", name = "rb", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!oc", name = "sb", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!oc", name = "tb", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!oc", name = "ub", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!oc", name = "yb", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!oc", name = "Bb", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!oc", name = "Cb", descriptor = "[Lvi;")
    public static class233[] field2845;

    @OriginalMember(owner = "client!oc", name = "ob", descriptor = "[Z")
    private volatile boolean[] field2831;

    @OriginalMember(owner = "client!oc", name = "Db", descriptor = "[[S")
    public static short[][] field2846;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
    private final void method1008(byte arg0) {
        ++field2834;
        this.field2831 = new boolean[super.field3005.length];
        for (int var2 = 0; ~var2 > ~this.field2831.length; ++var2) {
            this.field2831[var2] = false;
        }
        if (this.field2838 == null) {
            this.field2827 = true;
        } else {
            this.field2823 = -1;
            for (int var3 = 0; ~var3 > ~this.field2831.length; ++var3) {
                if (~super.field3019[var3] < -1) {
                    class111.method705(this, 1, this.field2838, var3);
                    this.field2823 = var3;
                }
            }
            if (arg0 >= -121) {
                this.method1011(false, 113, (byte) -95, (byte[]) null, (class214) null);
            }
            if (~this.field2823 == 0) {
                this.field2827 = true;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(II)V")
    public final void method1009(int arg0, int arg1) {
        if (arg1 == -287) {
            ++field2835;
            if (this.method1063(arg0, (byte) 87)) {
                class145.method978(this.field2833, 390667664, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lld;I)V")
    public static final void method1010(class123 arg0, int arg1) {
        class82.method502(arg1, arg0, arg1 ^ 200000);
        ++field2829;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZIB[BLu;)V")
    public final void method1011(boolean arg0, int arg1, byte arg2, byte[] arg3, class214 arg4) {
        ++field2830;
        int var6 = -36 / ((81 - arg2) / 32);
        if (this.field2840 != arg4) {
            if (!arg0 && ~this.field2823 == ~arg1) {
                this.field2827 = true;
            }
            if (arg3 == null || arg3.length <= 2) {
                this.field2831[arg1] = false;
                if (this.field2822 || arg0) {
                    class233.method1479(this.field2833, super.field2969[arg1], -1, (byte) 2, arg0, arg1, this);
                }
                return;
            }
            class162.field2935.reset();
            class162.field2935.update(arg3, 0, arg3.length + -2);
            int var7 = (int) class162.field2935.getValue();
            int var8 = (arg3[arg3.length + -2] << 8 & 65280) + (255 & arg3[arg3.length + -1]);
            if (super.field2969[arg1] != var7 || super.field3016[arg1] != var8) {
                this.field2831[arg1] = false;
                if (this.field2822 || arg0) {
                    class233.method1479(this.field2833, super.field2969[arg1], -1, (byte) 2, arg0, arg1, this);
                }
                return;
            }
            this.field2831[arg1] = true;
            if (arg0) {
                super.field3005[arg1] = class219.method1366(-124, arg3, false);
                return;
            }
        } else {
            if (this.field2827) {
                throw new RuntimeException();
            }
            if (arg3 == null) {
                class233.method1479(255, this.field2821, -1, (byte) 0, true, this.field2833, this);
                return;
            }
            class162.field2935.reset();
            class162.field2935.update(arg3, 0, arg3.length);
            int var9 = (int) class162.field2935.getValue();
            if (~this.field2821 != ~var9) {
                class233.method1479(255, this.field2821, -1, (byte) 0, true, this.field2833, this);
                return;
            }
            class112 var10;
            try {
                var10 = new class112(class161.method1040(0, arg3));
            } catch (RuntimeException var13) {
                class233.method1479(255, this.field2821, -1, (byte) 0, true, this.field2833, this);
                return;
            }
            int var11 = var10.method716(-1308);
            if (~var11 != -6 && ~var11 != -7) {
                class233.method1479(255, this.field2821, -1, (byte) 0, true, this.field2833, this);
                return;
            }
            int var12 = 0;
            if (var11 >= 6) {
                var12 = var10.method759(118);
            }
            if (~this.field2828 != ~var12) {
                class233.method1479(255, this.field2821, -1, (byte) 0, true, this.field2833, this);
                return;
            }
            this.method1083(-4578, arg3);
            this.method1008((byte) -124);
        }
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)I")
    public final int method1012(int arg0) {
        ++field2824;
        if (this.field2827) {
            return 100;
        } else if (super.field3005 != null) {
            return 99;
        } else {
            int var2 = class85.method531(255, (byte) 96, this.field2833);
            if (arg0 != -1734) {
                this.field2840 = null;
            }
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(II)V")
    public final void method1013(int arg0, int arg1) {
        ++field2832;
        if (this.method1063(arg1, (byte) 95)) {
            int var3 = -47 / ((arg0 - 7) / 62);
            if (this.field2838 != null && this.field2831 != null && this.field2831[arg1]) {
                class141.method953(arg1, this, -14111, this.field2838);
            } else {
                class233.method1479(this.field2833, super.field2969[arg1], -1, (byte) 2, true, arg1, this);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([BIBZZ)V")
    public final void method1014(byte[] arg0, int arg1, byte arg2, boolean arg3, boolean arg4) {
        ++field2819;
        if (arg3) {
            if (this.field2827) {
                throw new RuntimeException();
            }
            if (this.field2840 != null) {
                class173.method1129(this.field2833, this.field2840, -34, arg0);
            }
            this.method1083(-4578, arg0);
            this.method1008((byte) -124);
        } else {
            arg0[arg0.length + -2] = (byte) (super.field3016[arg1] >> 8);
            arg0[arg0.length + -1] = (byte) super.field3016[arg1];
            if (this.field2838 != null) {
                class173.method1129(arg1, this.field2838, 98, arg0);
                this.field2831[arg1] = true;
            }
            if (arg4) {
                super.field3005[arg1] = class219.method1366(-103, arg0, false);
            }
        }
        if (arg2 <= 56) {
            this.method1016(-75, 86, 32);
        }
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V")
    public static final void method1015(int arg0) {
        ++field2837;
        Object var1 = class131.field2416;
        synchronized (class131.field2416) {
            if (class241.field4327 == 0) {
                class189.field3482.method505(new class192(), 5, -4263);
            }
            class241.field4327 = 600;
        }
        if (arg0 != -21568) {
            field2841 = 7;
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(III)V")
    public final void method1016(int arg0, int arg1, int arg2) {
        this.field2821 = arg1;
        this.field2828 = arg0;
        ++field2836;
        if (arg2 != 0) {
            this.method1013(4, -42);
        }
        if (this.field2840 != null) {
            class141.method953(this.field2833, this, -14111, this.field2840);
        } else {
            class233.method1479(255, this.field2821, -1, (byte) 0, true, this.field2833, this);
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lu;Lu;IZZZ)V")
    public class155(class214 arg0, class214 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2833 = arg2;
        this.field2838 = arg0;
        this.field2822 = arg5;
        this.field2840 = arg1;
        class209.method1292((byte) -15, this.field2833, this);
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(II)I")
    public final int method1017(int arg0, int arg1) {
        ++field2826;
        if (!this.method1063(arg1, (byte) 108)) {
            return 0;
        } else {
            if (arg0 != 200000) {
                field2842 = null;
            }
            if (super.field3005[arg1] != null) {
                return 100;
            } else {
                return this.field2831[arg1] ? 100 : class85.method531(this.field2833, (byte) 69, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
    public static void method1018(int arg0) {
        field2845 = null;
        field2820 = null;
        field2825 = null;
        field2839 = null;
        if (arg0 == 19356) {
            field2846 = null;
            field2842 = null;
            field2843 = null;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) (300.0D * Math.pow(2.0D, (double) var2 / 7.0D) + (double) var2);
            var0 += var3;
            field2825[var1] = var0 / 4;
        }
        field2842 = class166.method1092("Choose Option", 124);
        field2843 = field2842;
    }
}
