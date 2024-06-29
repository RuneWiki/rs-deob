import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class196 extends class130 {

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "I")
    private int field3926 = -1;

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "I")
    private int field3939 = 0;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "[S")
    public static short[] field3924 = new short[500];

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "Lgg;")
    private static class63 field3930 = class116.method911(43, "Connecting to update server");

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "Lgg;")
    public static class63 field3933 = class116.method911(43, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "Lgg;")
    public static class63 field3927 = field3930;

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "Lgg;")
    public static class63 field3945 = class116.method911(43, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "Lgg;")
    public static class63 field3941 = class116.method911(43, "<col=ff3000>");

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "Lgg;")
    public static class63 field3931 = class116.method911(43, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "Lgg;")
    public static class63 field3947 = class116.method911(43, "<col=ffff00>*V");

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "I")
    public static int field3936 = 0;

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "[I")
    public static int[] field3934 = new int[25];

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    public int field3925;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
    public int field3932;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
    public int field3935;

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "I")
    public int field3943;

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!vg", name = "cb", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!vg", name = "ab", descriptor = "Loh;")
    public static class134 field3946;

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "[Lwb;")
    public static class200[] field3940;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
    public static final void method1278(int arg0) {
        if (class149.field3134.toLowerCase().indexOf("microsoft") == -1) {
            class8.field176[44] = 71;
            class8.field176[61] = 27;
            class8.field176[93] = 43;
            class8.field176[46] = 72;
            class8.field176[45] = 26;
            class8.field176[92] = 74;
            class8.field176[91] = 42;
            class8.field176[59] = 57;
            if (class149.field3136 == null) {
                class8.field176[222] = 59;
                class8.field176[192] = 58;
            } else {
                class8.field176[520] = 59;
                class8.field176[192] = 28;
                class8.field176[222] = 58;
            }
            class8.field176[47] = 73;
        } else {
            class8.field176[189] = 26;
            class8.field176[220] = 74;
            class8.field176[221] = 43;
            class8.field176[219] = 42;
            class8.field176[223] = 28;
            class8.field176[188] = 71;
            class8.field176[192] = 58;
            class8.field176[190] = 72;
            class8.field176[186] = 57;
            class8.field176[222] = 59;
            class8.field176[191] = 73;
            class8.field176[187] = 27;
        }
        field3938++;
        if (arg0 != -4654) {
            field3927 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)V")
    private final void method1279(int arg0, byte arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        field3948++;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var17 = (var9 + var11) / 2.0D;
        this.field3943 = (int) (var17 * 256.0D);
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (-var9 + var11) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        if (var17 > 0.5D) {
            this.field3925 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3925 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3943 < 0) {
            this.field3943 = 0;
        } else if (this.field3943 > 255) {
            this.field3943 = 255;
        }
        if (this.field3925 < 1) {
            this.field3925 = 1;
        }
        if (arg1 > -52) {
            method1281((byte) -100, -98L);
        }
        this.field3935 = (int) (var15 * 256.0D);
        if (this.field3935 < 0) {
            this.field3935 = 0;
        } else if (this.field3935 > 255) {
            this.field3935 = 255;
        }
        double var19 = var13 / 6.0D;
        this.field3932 = (int) ((double) this.field3925 * var19);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lab;II)V")
    public final void method1280(class3 arg0, int arg1, int arg2) {
        field3937++;
        if (arg2 > -77) {
            field3946 = null;
        }
        while (true) {
            int var4 = arg0.method64(31790);
            if (var4 == 0) {
                return;
            }
            this.method1284(var4, arg0, (byte) -33, arg1);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BJ)V")
    public static final void method1281(byte arg0, long arg1) {
        field3929++;
        if (arg0 != -8) {
            field3931 = null;
        }
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class17.method186(24117, arg1 - 1L);
            class17.method186(arg0 + 24125, 1L);
        } else {
            class17.method186(arg0 ^ 0xFFFFA1CD, arg1);
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
    public static void method1282(byte arg0) {
        field3947 = null;
        field3930 = null;
        field3946 = null;
        field3931 = null;
        field3927 = null;
        field3945 = null;
        if (arg0 < 89) {
            field3940 = null;
        }
        field3934 = null;
        field3941 = null;
        field3940 = null;
        field3924 = null;
        field3933 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method1283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field3928++;
        if (arg7 != 83) {
            method1282((byte) -58);
        }
        if (class144.method1026((byte) -124, arg4)) {
            class55.method539(-1, arg1, arg0, class23.field539[arg4], arg5, arg2, arg6, arg3, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILab;BI)V")
    private final void method1284(int arg0, class3 arg1, byte arg2, int arg3) {
        field3944++;
        if (arg2 != -33) {
            field3946 = null;
        }
        if (arg0 == 1) {
            this.field3939 = arg1.method20((byte) 66);
            this.method1279(this.field3939, (byte) -98);
        } else if (arg0 == 2) {
            this.field3926 = arg1.method46((byte) 65);
            if (this.field3926 == 65535) {
                this.field3926 = -1;
                return;
            }
        } else if (arg0 == 3) {
            arg1.method46((byte) 65);
        } else {
            return;
        }
    }
}
