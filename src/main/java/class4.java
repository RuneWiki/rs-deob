import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class17 {

    @OriginalMember(owner = "client!ft", name = "N", descriptor = "I")
    private int field74 = 3216;

    @OriginalMember(owner = "client!ft", name = "P", descriptor = "I")
    private int field76 = 4096;

    @OriginalMember(owner = "client!ft", name = "Q", descriptor = "[I")
    private int[] field77 = new int[3];

    @OriginalMember(owner = "client!ft", name = "M", descriptor = "I")
    private int field73 = 3216;

    @OriginalMember(owner = "client!ft", name = "H", descriptor = "[I")
    public static int[] field68 = new int[256];

    @OriginalMember(owner = "client!ft", name = "O", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ft", name = "S", descriptor = "[I")
    public static int[] field79;

    @OriginalMember(owner = "client!ft", name = "F", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ft", name = "G", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ft", name = "I", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ft", name = "J", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ft", name = "K", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ft", name = "L", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ft", name = "R", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ft", name = "U", descriptor = "Llg;")
    public static class289 field81;

    @OriginalMember(owner = "client!ft", name = "T", descriptor = "[Lob;")
    public static class528[] field80;

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if ((1 & var1) == 1) {
                    var1 = -306674912 ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field68[var0] = var1;
        }
        field75 = 0;
        new class530("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field79 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)[I", line = 7)
    public final int[] method27(int arg0, int arg1) {
        ++field71;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (super.field210.field6442) {
            int var4 = class350.field5035 * this.field76 >> 12;
            int[] var5 = this.method88(arg0 + -1 & class38.field417, -4526, 0);
            int[] var6 = this.method88(arg0, -4526, 0);
            int[] var7 = this.method88(arg0 + 1 & class38.field417, -4526, 0);
            for (int var8 = 0; var8 < class530.field7763; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class43.field499] + -var6[var8 + 1 & class43.field499]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class206.field2987[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field77[2] * var16 >> 12;
                int var18 = this.field77[0] * var14 >> 12;
                int var19 = this.field77[1] * var15 >> 12;
                var3[var8] = var18 + var19 - -var17;
            }
        }
        if (arg1 <= 53) {
            field68 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "(I)I", line = 84)
    public static final int method28(int arg0) {
        ++field69;
        if (arg0 != 2) {
            method30(76);
        }
        return 2;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZ)V", line = 96)
    public static final void method29(int arg0, boolean arg1) {
        if (arg1) {
            if (~class472.field6578 != 0) {
                class471.method2726(arg0 ^ -7947, class472.field6578);
            }
            for (class489 var2 = (class489) class255.field3763.method2414((byte) -127); var2 != null; var2 = (class489) class255.field3763.method2410((byte) 85)) {
                if (!var2.method2894(0)) {
                    var2 = (class489) class255.field3763.method2414((byte) -127);
                    if (var2 == null) {
                        break;
                    }
                }
                class309.method1870(var2, -26349, true, false);
            }
            class472.field6578 = -1;
            class255.field3763 = new class406(8);
            class355.method2096(0);
            class472.field6578 = class358.field5133;
            class106.method719(2, false);
            class385.method2235((byte) 85);
            class495.method2867(class472.field6578);
        }
        ++field70;
        class137.field1794 = false;
        if (arg0 == -7952) {
            class449.field6287 = "";
            class153.field2198 = "";
            class261.method1671(0);
            class432.field6097 = -1;
            class255.method1645(4096, class190.field2719);
            class246.field3587 = new class22();
            class246.field3587.field1896 = class43.field494 * 128 / 2;
            class246.field3587.field1899 = class500.field7068 * 128 / 2;
            class246.field3587.field3368[0] = class43.field494 / 2;
            class515.field7596 = 0;
            class478.field6654 = 0;
            class246.field3587.field3378[0] = class500.field7068 / 2;
            if (class504.field7461 == 2) {
                class515.field7596 = class218.field3160 << 7;
                class478.field6654 = class158.field2368 << 7;
            } else {
                class197.method1248((byte) -124);
            }
            class373.method2185(true);
        }
    }

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "(I)V", line = 160)
    public static void method30(int arg0) {
        if (arg0 == -492) {
            field79 = null;
            field68 = null;
            field80 = null;
            field81 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "(I)V", line = 175)
    public final void method31(int arg0) {
        ++field78;
        if (arg0 != -9) {
            field68 = null;
        }
        this.method32((byte) -96);
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V", line = 187)
    public class4() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)V", line = 227)
    private final void method32(byte arg0) {
        ++field72;
        double var2 = Math.cos((double) ((float) this.field74 / 4096.0F));
        this.field77[0] = (int) (4096.0D * Math.sin((double) ((float) this.field73 / 4096.0F)) * var2);
        this.field77[1] = (int) (Math.cos((double) ((float) this.field73 / 4096.0F)) * var2 * 4096.0D);
        this.field77[2] = (int) (4096.0D * Math.sin((double) ((float) this.field74 / 4096.0F)));
        int var4 = this.field77[0] * this.field77[0] >> 12;
        int var5 = this.field77[1] * this.field77[1] >> 12;
        if (arg0 == -96) {
            int var6 = this.field77[2] * this.field77[2] >> 12;
            int var7 = (int) (4096.0D * Math.sqrt((double) (var4 - -var6 + var5 >> 12)));
            if (~var7 != -1) {
                this.field77[2] = (this.field77[2] << 12) / var7;
                this.field77[1] = (this.field77[1] << 12) / var7;
                this.field77[0] = (this.field77[0] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILnt;Ljava/lang/String;Z)Lum;", line = 259)
    public static final class370 method33(int arg0, class151 arg1, String arg2, boolean arg3) {
        ++field67;
        if (arg0 == 0) {
            return arg1.method948(arg2, (byte) 64);
        } else {
            if (!arg3) {
                field68 = null;
            }
            if (arg0 == 1) {
                try {
                    class297.method1825("openjs", -116, new Object[] { (new URL(arg1.field2165.getCodeBase(), arg2)).toString() }, arg1.field2165);
                    class370 var4 = new class370();
                    var4.field5277 = 1;
                    return var4;
                } catch (Throwable var10) {
                    class370 var5 = new class370();
                    var5.field5277 = 2;
                    return var5;
                }
            } else if (arg0 == 2) {
                try {
                    arg1.field2165.getAppletContext().showDocument(new URL(arg1.field2165.getCodeBase(), arg2), "_blank");
                    class370 var6 = new class370();
                    var6.field5277 = 1;
                    return var6;
                } catch (Exception var11) {
                    class370 var7 = new class370();
                    var7.field5277 = 2;
                    return var7;
                }
            } else if (arg0 == 3) {
                try {
                    class297.method1826("loggedout", -14648, arg1.field2165);
                } catch (Throwable var13) {
                }
                try {
                    arg1.field2165.getAppletContext().showDocument(new URL(arg1.field2165.getCodeBase(), arg2), "_top");
                    class370 var8 = new class370();
                    var8.field5277 = 1;
                    return var8;
                } catch (Exception var12) {
                    class370 var9 = new class370();
                    var9.field5277 = 2;
                    return var9;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lwm;II)V", line = 356)
    public final void method34(class403 arg0, int arg1, int arg2) {
        ++field66;
        if (arg2 != 5159) {
            this.method34((class403) null, 24, -12);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field74 = arg0.method2338(0);
                }
            } else {
                this.field73 = arg0.method2338(arg2 + -5159);
            }
        } else {
            this.field76 = arg0.method2338(0);
        }
    }
}
