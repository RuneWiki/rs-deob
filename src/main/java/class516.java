import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class516 extends class529 {

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
    private int field7260 = 12288;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    private int field7266 = 0;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    private int field7263 = 2048;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    private int field7261 = 0;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
    private int field7265 = 8192;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    private int field7269 = 2048;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    private int field7259 = 4096;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "Lsca;")
    public static class239 field7272 = new class239();

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "Lqi;")
    public static class669 field7273 = new class669(4, 1);

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "[I")
    public static int[] field7275 = new int[32];

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "Ljava/lang/String;")
    public static String field7276 = "";

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    public static int field7270;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZI)Z")
    private final boolean method2958(int arg0, boolean arg1, int arg2) {
        ++field7267;
        int var4 = (arg0 + arg2) * this.field7260 >> 12;
        int var5 = class132.field1574[(var4 * 255 & 1045920) >> 12];
        if (!arg1) {
            this.method191(53, (byte) 101);
        }
        int var6 = (var5 << 12) / this.field7260;
        int var7 = (var6 << 12) / this.field7265;
        int var8 = this.field7259 * var7 >> 12;
        return -arg0 + arg2 < var8 && arg2 - arg0 > -var8;
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V")
    public static final void method2959(int arg0) {
        ++field7268;
        if (arg0 != 12288) {
            method2961((byte) -118);
        }
        if (class733.field10249 != null) {
            class733.field10249.method2369(4098);
        }
        if (class238.field3077 != null) {
            while (true) {
                try {
                    class238.field3077.join();
                    return;
                } catch (InterruptedException var1) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class516() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
    public final void method303(int arg0) {
        ++field7264;
        class713.method3947((byte) 110);
        if (arg0 >= -92) {
            this.method303(97);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)[I")
    public final int[] method191(int arg0, byte arg1) {
        int var3 = 7 / ((arg1 - 27) / 49);
        ++field7256;
        int[] var4 = super.field7456.method1635(arg0, -76);
        if (super.field7456.field3449) {
            int var5 = class310.field3960[arg0] + -2048;
            for (int var6 = 0; ~var6 > ~class304.field3909; ++var6) {
                int var7 = class225.field2973[var6] - 2048;
                int var8 = this.field7263 + var7;
                int var9 = ~var8 <= 2047 ? var8 : var8 + 4096;
                int var10 = var9 <= 2048 ? var9 : var9 + -4096;
                int var11 = var5 - -this.field7266;
                int var12 = var11 >= -2048 ? var11 : var11 + 4096;
                int var13 = ~var12 >= -2049 ? var12 : var12 + -4096;
                int var14 = this.field7261 + var7;
                int var15 = ~var14 > 2047 ? var14 + 4096 : var14;
                int var16 = ~var15 >= -2049 ? var15 : var15 + -4096;
                int var17 = this.field7269 + var5;
                int var18 = ~var17 > 2047 ? var17 + 4096 : var17;
                int var19 = var18 <= 2048 ? var18 : var18 + -4096;
                var4[var6] = !this.method2963(var13, var10, -56) && !this.method2958(var16, true, var19) ? 0 : 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)[B")
    public static final byte[] method2960(int arg0, int arg1) {
        ++field7262;
        if (arg0 != 255) {
            return null;
        } else {
            class419 var2 = (class419) class645.field8898.method3597((long) arg1, 2087);
            if (var2 == null) {
                byte[] var3 = new byte[512];
                Random var4 = new Random((long) arg1);
                for (int var5 = 0; ~var5 > -256; ++var5) {
                    var3[var5] = (byte) var5;
                }
                for (int var6 = 0; var6 < 255; ++var6) {
                    int var7 = -var6 + 255;
                    int var8 = class408.method2420((byte) -123, var4, var7);
                    byte var9 = var3[var8];
                    var3[var8] = var3[var7];
                    var3[var7] = var3[-var6 + 511] = var9;
                }
                var2 = new class419(var3);
                class645.field8898.method3599(var2, 100, (long) arg1);
            }
            return var2.field5957;
        }
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(B)V")
    public static final void method2961(byte arg0) {
        ++field7258;
        for (class742 var1 = (class742) class700.field9873.method3111(110); var1 != null; var1 = (class742) class700.field9873.method3116(-62)) {
            class68 var3 = var1.field10374;
            if (var3.field895 >= class266.field3368) {
                if (var3.field921 <= class266.field3368) {
                    var3.method510(-80);
                    if (var3.field926 > 0) {
                        class247 var4 = (class247) class563.field7875.method3248((long) (var3.field926 + -1), 0);
                        if (var4 != null) {
                            class124 var5 = var4.field3158;
                            if (~var5.field5790 <= -1 && ~(class613.field8591 * 512) < ~var5.field5790 && ~var5.field5784 <= -1 && ~var5.field5784 > ~(class1.field3 * 512)) {
                                var3.method518(class592.method3287(false, var5.field5784, var3.field5779, var5.field5790) + -var3.field912, class266.field3368, (byte) 62, var5.field5790, var5.field5784);
                            }
                        }
                    }
                    if (var3.field926 < 0) {
                        int var6 = -var3.field926 + -1;
                        class546 var7;
                        if (~class456.field6387 == ~var6) {
                            var7 = class339.field4374;
                        } else {
                            var7 = class447.field6287[var6];
                        }
                        if (var7 != null && ~var7.field5790 <= -1 && var7.field5790 < class613.field8591 * 512 && ~var7.field5784 <= -1 && ~(class1.field3 * 512) < ~var7.field5784) {
                            var3.method518(class592.method3287(false, var7.field5784, var3.field5779, var7.field5790) - var3.field912, class266.field3368, (byte) 62, var7.field5790, var7.field5784);
                        }
                    }
                    var3.method511(16383, class591.field8232);
                    class264.method1594(var3, true);
                }
            } else {
                var1.method3426((byte) -106);
                var3.method513(98);
            }
        }
        int var2 = -59 / ((arg0 - 21) / 45);
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(B)V")
    public static void method2962(byte arg0) {
        field7275 = null;
        field7273 = null;
        if (arg0 >= -88) {
            field7272 = null;
        }
        field7272 = null;
        field7276 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBLtn;)V")
    public final void method190(int arg0, byte arg1, class179 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field7265 = arg2.method1107(false);
                                }
                            } else {
                                this.field7259 = arg2.method1107(false);
                            }
                        } else {
                            this.field7260 = arg2.method1107(false);
                        }
                    } else {
                        this.field7269 = arg2.method1107(false);
                    }
                } else {
                    this.field7261 = arg2.method1107(false);
                }
            } else {
                this.field7266 = arg2.method1107(false);
            }
        } else {
            this.field7263 = arg2.method1107(false);
        }
        if (arg1 <= 45) {
            this.field7259 = -127;
        }
        ++field7271;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(III)Z")
    private final boolean method2963(int arg0, int arg1, int arg2) {
        ++field7257;
        int var4 = (-arg1 + arg0) * this.field7260 >> 12;
        int var5 = class132.field1574[(var4 * 255 & 1048414) >> 12];
        if (arg2 >= -31) {
            method2964(8);
        }
        int var6 = (var5 << 12) / this.field7260;
        int var7 = (var6 << 12) / this.field7265;
        int var8 = this.field7259 * var7 >> 12;
        return var8 > arg0 + arg1 && ~(-var8) > ~(arg0 + arg1);
    }

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)V")
    public static final void method2964(int arg0) {
        class518.field7289.method139(1.1523438F * ((float) class223.field2944.field598.method992((byte) -127) * 0.1F + 0.7F));
        ++field7270;
        if (arg0 != 255) {
            method2964(102);
        }
        class518.field7289.method85(class575.field8034, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class518.field7289.method130(class205.field2611, -1, 0);
        class518.field7289.method170(class489.field6957);
    }

    static {
        int var0 = 2;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            field7275[var1] = var0 + -1;
            var0 += var0;
        }
    }
}
