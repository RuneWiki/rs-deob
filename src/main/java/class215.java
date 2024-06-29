import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class215 extends class182 {

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
    private int field3901 = -1;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "I")
    private int field3904 = 0;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "Lkh;")
    private static class117 field3899 = class224.method1450((byte) -106, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "Lkh;")
    public static class117 field3906 = field3899;

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
    public static int field3907 = 0;

    @OriginalMember(owner = "client!tg", name = "bb", descriptor = "I")
    public static int field3914 = 0;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
    public static int field3896 = 0;

    @OriginalMember(owner = "client!tg", name = "ab", descriptor = "Lkh;")
    public static class117 field3913 = class224.method1450((byte) -125, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!tg", name = "V", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!tg", name = "W", descriptor = "I")
    public int field3909;

    @OriginalMember(owner = "client!tg", name = "X", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!tg", name = "Y", descriptor = "I")
    public int field3911;

    @OriginalMember(owner = "client!tg", name = "Z", descriptor = "I")
    public int field3912;

    @OriginalMember(owner = "client!tg", name = "cb", descriptor = "I")
    public int field3915;

    @OriginalMember(owner = "client!tg", name = "db", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "Lvb;")
    public static class232 field3900;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "[[[B")
    public static byte[][][] field3903;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
    private final void method1410(int arg0, int arg1) {
        field3897++;
        double var3 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var5;
        double var11 = var5;
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var3 > var5) {
            var11 = var3;
        }
        if (var5 > var3) {
            var9 = var3;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var13 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var5 == var11) {
                var15 = (var3 - var7) / (var11 - var9);
            } else if (var3 == var11) {
                var15 = (var7 - var5) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var15 = (var5 - var3) / (-var9 + var11) + 4.0D;
            }
        }
        this.field3915 = (int) (var13 * 256.0D);
        if (arg1 <= 72) {
            field3914 = 66;
        }
        double var19 = var15 / 6.0D;
        if (var17 > 0.5D) {
            this.field3909 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field3909 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field3909 < 1) {
            this.field3909 = 1;
        }
        if (this.field3915 < 0) {
            this.field3915 = 0;
        } else if (this.field3915 > 255) {
            this.field3915 = 255;
        }
        this.field3911 = (int) ((double) this.field3909 * var19);
        this.field3912 = (int) (var17 * 256.0D);
        if (this.field3912 < 0) {
            this.field3912 = 0;
        } else if (this.field3912 > 255) {
            this.field3912 = 255;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([BIII)I")
    public static final int method1411(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 4874) {
            return 119;
        }
        int var4 = -1;
        field3910++;
        for (int var5 = arg1; var5 < arg2; var5++) {
            var4 = class204.field3683[(var4 ^ arg0[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lnc;II)V")
    public final void method1412(class145 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method998(119);
            if (var4 == 0) {
                if (arg2 != -11678) {
                    method1414(47, false);
                }
                field3898++;
                return;
            }
            this.method1417(arg1, var4, arg0, arg2 + 11771);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BIIII)V")
    public static final void method1413(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class43.field952 < 100) {
            class150.method1071(19);
        }
        field3902++;
        class83.method575(arg4, arg3, arg4 + arg1, arg2 + arg3);
        if (class43.field952 < 100) {
            byte var5 = 20;
            int var6 = arg1 / 2 + arg4;
            int var7 = arg3 + arg2 / 2 - var5 - 18;
            class83.method579(arg4, arg3, arg1, arg2, 0);
            class83.method586(var6 - 152, var7, 304, 34, 9179409);
            class83.method586(var6 - 151, var7 + 1, 302, 32, 0);
            class83.method579(var6 - 150, var7 + 2, class43.field952 * 3, 30, 9179409);
            class83.method579(class43.field952 * 3 + var6 - 150, var7 + 2, 300 - class43.field952 * 3, 30, 0);
            class199.field3603.method935(class42.field935, var6, var5 + var7, 16777215, -1);
            return;
        }
        class70.field1345 = (int) ((double) (arg2 * 2) / class90.field1672);
        int var8 = class1.field12 - (int) ((double) arg2 / class90.field1672);
        int var9 = class156.field2838 - (int) ((double) arg1 / class90.field1672);
        class12.field400 = class156.field2838 - (int) ((double) arg1 / class90.field1672);
        class100.field1835 = (int) ((double) (arg1 * 2) / class90.field1672);
        class40.field925 = class1.field12 - (int) ((double) arg2 / class90.field1672);
        int var10 = (int) ((double) arg1 / class90.field1672) + class156.field2838;
        int var11 = (int) ((double) arg2 / class90.field1672) + class1.field12;
        class150.method1074(var10, arg3, var11, 2, arg3 + arg2, arg4, var8, arg1 + arg4, var9);
        class161.method1152(var10, arg3, -7, arg1 + arg4, var9, arg4, var8, var11, arg2 + arg3);
        if (arg0 != -118) {
            method1415(82);
        }
        if (class243.field4426 > 0) {
            class243.field4426--;
        }
        if (!class10.field356) {
            return;
        }
        int var12 = arg1 + arg4 - 5;
        int var13 = arg3 + arg2 - 8;
        class53.field1081.method929(class36.method316((byte) -34, new class117[] { client.field777, class42.method358(class37.field855, (byte) 34) }), var12, var13, 16776960, -1);
        int var17 = var13 - 15;
        Runtime var14 = Runtime.getRuntime();
        int var15 = 16776960;
        int var16 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var15 = 16711680;
        }
        class53.field1081.method929(class36.method316((byte) -34, new class117[] { class224.field4041, class42.method358(var16, (byte) 34), class66.field1279 }), var12, var17, var15, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZ)V")
    public static final void method1414(int arg0, boolean arg1) {
        class167.field3016 = new int[104];
        class140.field2556 = new int[104];
        if (arg0 != -15459) {
            return;
        }
        class33.field770 = 99;
        class180.field3260 = new int[104];
        field3908++;
        class184.field3305 = new int[104];
        class88.field1635 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class38.field873 = new int[var2][105][105];
        class109.field2062 = new byte[var2][104][104];
        class120.field2268 = new byte[var2][104][104];
        class225.field4049 = new byte[var2][105][105];
        class73.field1394 = new byte[var2][104][104];
        class196.field3496 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public static void method1415(int arg0) {
        field3900 = null;
        field3899 = null;
        field3903 = null;
        int var1 = -60 / ((-arg0 - 42) / 62);
        field3913 = null;
        field3906 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZB)V")
    public static final void method1416(boolean arg0, byte arg1) {
        if (arg1 != 50) {
            field3914 = 26;
        }
        field3916++;
        byte[][] var2 = class30.field718;
        byte var3 = 4;
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class216.field3936[var5] & 0xFF) * 64 - class184.field3319;
            int var12 = (class216.field3936[var5] >> 8) * 64 - class143.field2591;
            byte[] var13 = var2[var5];
            if (var13 != null) {
                class93.method637(arg1 + 9950);
                class117.method817(var11, (byte) -127, var12, (class38.field880 - 6) * 8, class150.field2733 * 8 - 48, arg0, class173.field3123, var13);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class216.field3936[var6] >> 8) * 64 - class143.field2591;
            byte[] var8 = var2[var6];
            int var9 = (class216.field3936[var6] & 0xFF) * 64 - class184.field3319;
            if (var8 == null && class38.field880 < 800) {
                class93.method637(10000);
                for (int var10 = 0; var10 < var3; var10++) {
                    class79.method547(var10, var9, 64, var7, 64, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILnc;I)V")
    private final void method1417(int arg0, int arg1, class145 arg2, int arg3) {
        if (arg1 == 1) {
            this.field3904 = arg2.method1023(-1002744);
            this.method1410(this.field3904, 104);
        } else if (arg1 == 2) {
            this.field3901 = arg2.method1049((byte) 127);
            if (this.field3901 == 65535) {
                this.field3901 = -1;
            }
        } else if (arg1 == 3) {
            arg2.method1049((byte) 112);
        }
        field3905++;
        int var5 = 21 % ((arg3 - 32) / 61);
    }
}
