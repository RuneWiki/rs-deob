import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class227 extends class286 {

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    private int field3813 = 4096;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    private int field3818 = 3216;

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "[I")
    private int[] field3822 = new int[3];

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    private int field3809 = 3216;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "Lbe;")
    private static class283 field3814 = class153.method941(-15, "Walk here");

    @OriginalMember(owner = "client!td", name = "U", descriptor = "Z")
    public static boolean field3816 = false;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "Lbe;")
    public static class283 field3820 = field3814;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "Lbe;")
    public static class283 field3812 = class153.method941(125, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!td", name = "V", descriptor = "Lbe;")
    public static class283 field3817 = class153.method941(-6, "leuchten3:");

    @OriginalMember(owner = "client!td", name = "hb", descriptor = "Lbe;")
    public static class283 field3829 = class153.method941(-72, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!td", name = "fb", descriptor = "Lbe;")
    public static class283 field3827 = class153.method941(125, "k");

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!td", name = "bb", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!td", name = "cb", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!td", name = "db", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!td", name = "eb", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!td", name = "gb", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!td", name = "ib", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "Lek;")
    public static class172 field3821;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V", line = 7)
    public static void method1484(byte arg0) {
        field3814 = null;
        field3829 = null;
        field3827 = null;
        field3812 = null;
        field3821 = null;
        field3817 = null;
        if (arg0 != 63) {
            method1485(-26, -100, (byte) 92);
        }
        field3820 = null;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V", line = 56)
    public class227() {
        super(1, true);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIB)V", line = 39)
    public static final void method1485(int arg0, int arg1, byte arg2) {
        field3810++;
        class72 var3 = class25.method174(arg1, (byte) -64, 7);
        var3.method477(-108);
        var3.field1265 = arg0;
        int var4 = 3 % ((arg2 + 26) / 38);
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V", line = 61)
    public final void method276(int arg0) {
        if (arg0 != 3) {
            method1488(80, -93);
        }
        field3824++;
        this.method1490((byte) 69);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)I", line = 75)
    public static final int method1486(byte arg0, int arg1) {
        field3828++;
        int var2 = 11 / ((arg0 + 38) / 52);
        if (arg1 >= 97 && arg1 <= 122 || arg1 >= 224 && arg1 <= 254 && arg1 != 247) {
            return arg1 - 32;
        } else if (arg1 == 255) {
            return 159;
        } else if (arg1 == 156) {
            return 140;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(IB)V", line = 99)
    public static final void method1487(int arg0, byte arg1) {
        class7.field73.method1637(true, arg0);
        class69.field1144.method1637(true, arg0);
        class35.field521.method1637(true, arg0);
        field3826++;
        class190.field3249.method1637(true, arg0);
        if (arg1 > -25) {
            method1487(17, (byte) -76);
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)Z", line = 125)
    public static final boolean method1488(int arg0, int arg1) {
        field3819++;
        if (arg1 == -224) {
            return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)[I", line = 143)
    public final int[] method14(int arg0, int arg1) {
        field3811++;
        if (arg0 >= -52) {
            return (int[]) null;
        }
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (this.field4863.field3984) {
            int var4 = class192.field3294 * this.field3813 >> 12;
            int[] var5 = this.method1963(arg1 - 1 & class126.field2100, 0, -1);
            int[] var6 = this.method1963(arg1, 0, -1);
            int[] var7 = this.method1963(class126.field2100 & arg1 + 1, 0, -1);
            for (int var8 = 0; var8 < class27.field410; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 - 1 & class284.field4857] - var6[var8 + 1 & class284.field4857]) * var4 >> 12;
                int var11 = var9 >> 4;
                int var12 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class48.field664[((var11 + 1) * var11 >> 1) + var12] & 0xFF;
                int var14 = var13 * 4096 >> 8;
                int var15 = this.field3822[2] * var14 >> 12;
                int var16 = var9 * var13 >> 8;
                int var17 = var10 * var13 >> 8;
                int var18 = this.field3822[1] * var16 >> 12;
                int var19 = this.field3822[0] * var17 >> 12;
                var3[var8] = var18 + var19 + var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lfe;ZI)V", line = 210)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        field3823++;
        if (arg2 == 0) {
            this.field3813 = arg0.method1496(!arg1);
        } else if (arg2 == 1) {
            this.field3818 = arg0.method1496(true);
        } else if (arg2 == 2) {
            this.field3809 = arg0.method1496(true);
        }
        if (arg1) {
            field3814 = (class283) null;
        }
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "(I)V", line = 260)
    public static final void method1489(int arg0) {
        if (arg0 != 17657) {
            return;
        }
        field3830++;
        if (class123.field2044 < class162.field2649) {
            class123.field2044 = (float) ((double) class123.field2044 / 30.0D + (double) class123.field2044);
            if (class162.field2649 < class123.field2044) {
                class123.field2044 = class162.field2649;
            }
            class305.method2070(-1);
        } else if (class162.field2649 < class123.field2044) {
            class123.field2044 = (float) ((double) class123.field2044 - (double) class123.field2044 / 30.0D);
            if (class123.field2044 < class162.field2649) {
                class123.field2044 = class162.field2649;
            }
            class305.method2070(arg0 - 17658);
        }
        if (class241.field4074 == -1 || class237.field3962 == -1) {
            return;
        }
        int var1 = class241.field4074 - class7.field79;
        int var2 = class237.field3962 - class159.field2604;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class7.field79 += var1;
        class159.field2604 += var2;
        if (var1 == 0 && var2 == 0) {
            class241.field4074 = -1;
            class237.field3962 = -1;
        }
        class305.method2070(arg0 - 17658);
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(B)V", line = 332)
    private final void method1490(byte arg0) {
        field3815++;
        double var2 = Math.cos((double) ((float) this.field3809 / 4096.0F));
        this.field3822[0] = (int) (Math.sin((double) ((float) this.field3818 / 4096.0F)) * var2 * 4096.0D);
        this.field3822[1] = (int) (Math.cos((double) ((float) this.field3818 / 4096.0F)) * var2 * 4096.0D);
        this.field3822[2] = (int) (Math.sin((double) ((float) this.field3809 / 4096.0F)) * 4096.0D);
        int var4 = this.field3822[1] * this.field3822[1] >> 12;
        if (arg0 != 69) {
            this.field3809 = -98;
        }
        int var5 = this.field3822[0] * this.field3822[0] >> 12;
        int var6 = this.field3822[2] * this.field3822[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var6 + var5 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field3822[0] = (this.field3822[0] << 12) / var7;
            this.field3822[1] = (this.field3822[1] << 12) / var7;
            this.field3822[2] = (this.field3822[2] << 12) / var7;
        }
    }
}
