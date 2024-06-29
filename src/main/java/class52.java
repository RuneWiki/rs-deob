import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class52 extends class40 {

    @OriginalMember(owner = "client!ps", name = "K", descriptor = "I")
    private int field668 = 0;

    @OriginalMember(owner = "client!ps", name = "W", descriptor = "I")
    private int field680 = 8192;

    @OriginalMember(owner = "client!ps", name = "T", descriptor = "I")
    private int field677 = 12288;

    @OriginalMember(owner = "client!ps", name = "X", descriptor = "I")
    private int field681 = 2048;

    @OriginalMember(owner = "client!ps", name = "V", descriptor = "I")
    private int field679 = 2048;

    @OriginalMember(owner = "client!ps", name = "Y", descriptor = "I")
    private int field682 = 4096;

    @OriginalMember(owner = "client!ps", name = "ab", descriptor = "I")
    private int field684 = 0;

    @OriginalMember(owner = "client!ps", name = "P", descriptor = "I")
    public static int field673 = 0;

    @OriginalMember(owner = "client!ps", name = "L", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!ps", name = "M", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!ps", name = "N", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!ps", name = "O", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!ps", name = "Q", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!ps", name = "R", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!ps", name = "S", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!ps", name = "U", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!ps", name = "Z", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IILlf;)V")
    public final void method43(int arg0, int arg1, class130 arg2) {
        if (arg1 <= 79) {
            this.field680 = -101;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field680 = arg2.method798(false);
                                }
                            } else {
                                this.field682 = arg2.method798(false);
                            }
                        } else {
                            this.field677 = arg2.method798(false);
                        }
                    } else {
                        this.field681 = arg2.method798(false);
                    }
                } else {
                    this.field668 = arg2.method798(false);
                }
            } else {
                this.field684 = arg2.method798(false);
            }
        } else {
            this.field679 = arg2.method798(false);
        }
        ++field672;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(III)I")
    public static final int method336(int arg0, int arg1, int arg2) {
        ++field678;
        int var3 = arg1 - 1 & arg0 >> 31;
        int var4 = -110 % ((arg2 - -34) / 43);
        return ((arg0 >>> 31) + arg0) % arg1 - -var3;
    }

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "(B)V")
    public final void method39(byte arg0) {
        ++field670;
        if (arg0 == -23) {
            class187.method1341(true);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIZ)Z")
    private final boolean method337(int arg0, int arg1, boolean arg2) {
        ++field674;
        int var4 = (arg1 - -arg0) * this.field677 >> 12;
        int var5 = class185.field2650[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field677;
        int var7 = (var6 << 12) / this.field680;
        int var8 = this.field682 * var7 >> 12;
        if (!arg2) {
            this.field679 = -69;
        }
        return var8 > -arg0 + arg1 && ~(-arg0 + arg1) < ~(-var8);
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(IZI)Z")
    private final boolean method338(int arg0, boolean arg1, int arg2) {
        ++field676;
        int var4 = (-arg2 + arg0) * this.field677 >> 12;
        int var5 = class185.field2650[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field677;
        if (arg1) {
            field673 = 82;
        }
        int var7 = (var6 << 12) / this.field680;
        int var8 = this.field682 * var7 >> 12;
        return arg0 + arg2 < var8 && ~(-var8) > ~(arg0 + arg2);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BI)[I")
    public final int[] method44(byte arg0, int arg1) {
        ++field675;
        int[] var3 = super.field551.method185(65280, arg1);
        if (arg0 > -20) {
            this.field682 = -118;
        }
        if (super.field551.field441) {
            int var4 = class86.field1123[arg1] + -2048;
            for (int var5 = 0; class410.field5886 > var5; ++var5) {
                int var6 = class9.field124[var5] + -2048;
                int var7 = this.field679 + var6;
                int var8 = var7 < -2048 ? var7 - -4096 : var7;
                int var9 = ~var8 < -2049 ? var8 + -4096 : var8;
                int var10 = var4 - -this.field684;
                int var11 = ~var10 > 2047 ? var10 + 4096 : var10;
                int var12 = ~var11 < -2049 ? var11 - 4096 : var11;
                int var13 = var6 - -this.field668;
                int var14 = var13 < -2048 ? var13 - -4096 : var13;
                int var15 = ~var14 >= -2049 ? var14 : var14 + -4096;
                int var16 = var4 - -this.field681;
                int var17 = ~var16 <= 2047 ? var16 : var16 + 4096;
                int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                var3[var5] = !this.method338(var12, false, var9) && !this.method337(var15, var18, true) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IBII)V")
    public static final void method339(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < 63) {
            method336(-22, -127, 77);
        }
        ++field683;
        if (~arg3 != -1004) {
            if (arg3 == 1010) {
                class424.method2653(11, arg2, arg0);
            } else if (arg3 == 1006) {
                class424.method2653(12, arg2, arg0);
            } else {
                if (~arg3 != -1013) {
                    if (~arg3 == -1010) {
                        class424.method2653(14, arg2, arg0);
                        return;
                    }
                } else {
                    class424.method2653(13, arg2, arg0);
                }
            }
        } else {
            class424.method2653(10, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "(B)V")
    public static final void method340(byte arg0) {
        ++field671;
        if (arg0 != -110) {
            method339(-48, (byte) 12, -10, 115);
        }
        for (class102 var1 = (class102) class128.field1810.method2752(-49); var1 != null; var1 = (class102) class128.field1810.method2754(-1)) {
            if (var1.field1292 == -1) {
                var1.field1291 = 0;
                class32.method176(var1, (byte) 110);
            } else {
                var1.method2660((byte) 116);
            }
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V")
    public class52() {
        super(0, true);
    }

    static {
        new class349("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
    }
}
