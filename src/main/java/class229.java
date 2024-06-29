import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class229 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Z")
    public boolean field3631 = true;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public int field3642 = 128;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public int field3647 = -1;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    private int field3656 = 0;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field3645 = 0;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3644 = null;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lhh;")
    public static class169 field3636 = new class169();

    @OriginalMember(owner = "client!p", name = "A", descriptor = "I")
    public static int field3657 = 0;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "F")
    public static float field3637;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public int field3640;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public int field3643;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public int field3646;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public int field3655;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 14)
    public static final void method1615(int arg0) {
        field3641++;
        if (class179.field2972 != -1) {
            class26.method149(-1, -1, class179.field2972, 29681);
            class179.field2972 = -1;
        }
        if (arg0 != -1) {
            method1619((byte) 116, 71);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljj;IB)V", line = 31)
    public final void method1616(class44 arg0, int arg1, byte arg2) {
        field3632++;
        while (true) {
            int var4 = arg0.method286((byte) -112);
            if (var4 == 0) {
                int var5 = 74 / ((-arg2 - 39) / 38);
                return;
            }
            this.method1621(3, arg1, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLqm;)V", line = 50)
    public static final void method1617(byte arg0, class334 arg1) {
        field3654++;
        if (arg0 != -26) {
            method1615(24);
        }
        class155 var2 = (class155) class77.field1091.method451(class204.method1491(arg0 - 26890, arg1.field5216), (byte) 100);
        if (var2 == null) {
            class215.method1546((class97) null, arg0 ^ 0xFFFFFF66, arg1, class49.field698, (class234) null, arg1.field4248[0], arg1.field4184[0], 0);
        } else {
            var2.method1108(arg0 ^ 0xFFFFF73D);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILak;)V", line = 70)
    public static final void method1618(int arg0, class172 arg1) {
        field3650++;
        class139.field2181 = class245.method1751(0, arg1, class316.field4900);
        class318.field4948 = new int[256];
        if (arg0 != -13822) {
            return;
        }
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) ((class301.field4730[var2] & 0xFF0000) >> 16);
            int var4 = (class301.field4730[var2 + 1] & 0xFF0000) >> 16;
            float var5 = (float) ((class301.field4730[var2] & 0xFF00) >> 8);
            int var6 = (class301.field4730[var2 + 1] & 0xFF00) >> 8;
            float var7 = ((float) var4 - var3) / 64.0F;
            float var8 = ((float) var6 - var5) / 64.0F;
            int var9 = class301.field4730[var2 + 1] & 0xFF;
            float var10 = (float) (class301.field4730[var2] & 0xFF);
            float var11 = ((float) var9 - var10) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class318.field4948[var2 * 64 + var12] = class122.method882((int) var10, class122.method882((int) var5 << 8, (int) var3 << 16));
                var3 += var7;
                var10 += var11;
                var5 += var8;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class318.field4948[var13] = class301.field4730[3];
        }
        class309.field4804 = new int[32768];
        class224.field3585 = new int[32768];
        class91.method608(arg0 + 13822, (class326) null);
        class137.field2166 = new int[32768];
        class331.field5166 = new int[32768];
        class193.field3158 = new class220(128, 254);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)Lhn;", line = 142)
    public static final class271 method1619(byte arg0, int arg1) {
        field3639++;
        class271 var2 = (class271) class143.field2234.method755((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class178.field2962.method1287(arg1, 5, -1);
        class271 var4 = new class271();
        if (arg0 > -97) {
            method1626();
        }
        if (var3 != null) {
            var4.method1923(-60, new class44(var3));
        }
        class143.field2234.method750(var4, (long) arg1, -18339);
        return var4;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V", line = 168)
    public static void method1620(boolean arg0) {
        field3636 = null;
        field3644 = null;
        if (!arg0) {
            field3637 = -0.5988147F;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IILjj;I)V", line = 183)
    private final void method1621(int arg0, int arg1, class44 arg2, int arg3) {
        if (arg3 == 1) {
            this.field3656 = arg2.method273(-867673064);
            this.method1622(this.field3656, (byte) -96);
        } else if (arg3 == 2) {
            this.field3647 = arg2.method271(21081);
            if (this.field3647 == 65535) {
                this.field3647 = -1;
            }
        } else if (arg3 == 3) {
            this.field3642 = arg2.method271(21081);
        } else if (arg3 == 4) {
            this.field3631 = false;
        }
        if (arg0 != 3) {
            this.method1622(-54, (byte) -77);
        }
        field3653++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)V", line = 220)
    private final void method1622(int arg0, byte arg1) {
        field3648++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF58) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        if (arg1 > -37) {
            field3657 = 118;
        }
        double var9 = var3;
        double var11 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var5 > var3) {
            var11 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field3646 = (int) (var15 * 256.0D);
        if (this.field3646 < 0) {
            this.field3646 = 0;
        } else if (this.field3646 > 255) {
            this.field3646 = 255;
        }
        this.field3655 = (int) (var17 * 256.0D);
        if (var17 > 0.5D) {
            this.field3643 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3643 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3655 < 0) {
            this.field3655 = 0;
        } else if (this.field3655 > 255) {
            this.field3655 = 255;
        }
        double var19 = var13 / 6.0D;
        if (this.field3643 < 1) {
            this.field3643 = 1;
        }
        this.field3640 = (int) ((double) this.field3643 * var19);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 325)
    public static final void method1623(byte arg0) {
        if (class61.field870 != null) {
            class149 var1 = new class149();
            for (int var2 = 0; var2 < 13; var2++) {
                for (int var3 = 0; var3 < 13; var3++) {
                    class61.field870[var2][var3] = var1;
                }
            }
        }
        if (arg0 <= 125) {
            method1615(-13);
        }
        field3638++;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)Lek;", line = 360)
    public static final class220 method1624(int arg0) {
        field3635++;
        byte[] var1 = class278.field4481[0];
        int var2 = class184.field3046[0] * class102.field1489[0];
        if (arg0 > -46) {
            return (class220) null;
        }
        class220 var5;
        if (class18.field252[0]) {
            int[] var6 = new int[var2];
            byte[] var7 = class54.field757[0];
            for (int var8 = 0; var8 < var2; var8++) {
                var6[var8] = class122.method882(client.method767(255, var7[var8]) << 24, class205.field3370[client.method767(var1[var8], 255)]);
            }
            var5 = new class293(class303.field4757, class243.field3832, class270.field4364[0], class51.field732[0], class102.field1489[0], class184.field3046[0], var6);
        } else {
            int[] var3 = new int[var2];
            for (int var4 = 0; var4 < var2; var4++) {
                var3[var4] = class205.field3370[client.method767(255, var1[var4])];
            }
            var5 = new class220(class303.field4757, class243.field3832, class270.field4364[0], class51.field732[0], class102.field1489[0], class184.field3046[0], var3);
        }
        class106.method727(true);
        return var5;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)I", line = 406)
    public static final int method1625(int arg0) {
        if (arg0 != 1) {
            method1618(27, (class172) null);
        }
        field3652++;
        class88.field1222 = 0;
        return class304.method2164((byte) 82);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V", line = 420)
    public static final void method1626() {
        if (class66.field958 != null) {
            for (int var0 = 0; var0 < class66.field958.length; var0++) {
                for (int var1 = 0; var1 < class45.field633; var1++) {
                    for (int var2 = 0; var2 < class158.field2618; var2++) {
                        class66.field958[var0][var1][var2] = null;
                    }
                }
            }
        }
        class340.field5292 = (class206[][]) null;
        if (class310.field4833 != null) {
            for (int var3 = 0; var3 < class310.field4833.length; var3++) {
                for (int var4 = 0; var4 < class45.field633; var4++) {
                    for (int var5 = 0; var5 < class158.field2618; var5++) {
                        class310.field4833[var3][var4][var5] = null;
                    }
                }
            }
        }
        class310.field4840 = (class206[][]) null;
        class336.field5259 = 0;
        if (class261.field4167 != null) {
            for (int var6 = 0; var6 < class336.field5259; var6++) {
                class261.field4167[var6] = null;
            }
        }
        if (class94.field1291 != null) {
            for (int var7 = 0; var7 < class274.field4415; var7++) {
                class94.field1291[var7] = null;
            }
            class274.field4415 = 0;
        }
        if (class243.field3843 != null) {
            for (int var8 = 0; var8 < class243.field3843.length; var8++) {
                class243.field3843[var8] = null;
            }
        }
    }
}
