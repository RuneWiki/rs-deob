import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("zb")
public class Tone {

    @OriginalMember(owner = "zb", name = "j", descriptor = "[I")
    private int[] field763 = new int[5];

    @OriginalMember(owner = "zb", name = "k", descriptor = "[I")
    private int[] field764 = new int[5];

    @OriginalMember(owner = "zb", name = "l", descriptor = "[I")
    private int[] field765 = new int[5];

    @OriginalMember(owner = "zb", name = "n", descriptor = "I")
    private int field767 = 100;

    @OriginalMember(owner = "zb", name = "o", descriptor = "I")
    public int field768 = 500;

    @OriginalMember(owner = "zb", name = "a", descriptor = "Z")
    private static boolean field754 = true;

    @OriginalMember(owner = "zb", name = "t", descriptor = "[I")
    private static int[] field773 = new int[5];

    @OriginalMember(owner = "zb", name = "u", descriptor = "[I")
    private static int[] field774 = new int[5];

    @OriginalMember(owner = "zb", name = "v", descriptor = "[I")
    private static int[] field775 = new int[5];

    @OriginalMember(owner = "zb", name = "w", descriptor = "[I")
    private static int[] field776 = new int[5];

    @OriginalMember(owner = "zb", name = "x", descriptor = "[I")
    private static int[] field777 = new int[5];

    @OriginalMember(owner = "zb", name = "m", descriptor = "I")
    private int field766;

    @OriginalMember(owner = "zb", name = "p", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "zb", name = "b", descriptor = "Lxb;")
    private Envelope field755;

    @OriginalMember(owner = "zb", name = "c", descriptor = "Lxb;")
    private Envelope field756;

    @OriginalMember(owner = "zb", name = "d", descriptor = "Lxb;")
    private Envelope field757;

    @OriginalMember(owner = "zb", name = "e", descriptor = "Lxb;")
    private Envelope field758;

    @OriginalMember(owner = "zb", name = "f", descriptor = "Lxb;")
    private Envelope field759;

    @OriginalMember(owner = "zb", name = "g", descriptor = "Lxb;")
    private Envelope field760;

    @OriginalMember(owner = "zb", name = "h", descriptor = "Lxb;")
    private Envelope field761;

    @OriginalMember(owner = "zb", name = "i", descriptor = "Lxb;")
    private Envelope field762;

    @OriginalMember(owner = "zb", name = "y", descriptor = "Z")
    public static boolean field778;

    @OriginalMember(owner = "zb", name = "q", descriptor = "[I")
    private static int[] field770;

    @OriginalMember(owner = "zb", name = "r", descriptor = "[I")
    private static int[] field771;

    @OriginalMember(owner = "zb", name = "s", descriptor = "[I")
    private static int[] field772;

    @OriginalMember(owner = "zb", name = "a", descriptor = "()V")
    public static final void method269() {
        field771 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field771[var0] = 1;
            } else {
                field771[var0] = -1;
            }
        }
        field772 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field772[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field770 = new int[220500];
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(II)[I")
    public final int[] method270(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field770[var3] = 0;
        }
        if (arg1 < 10) {
            return field770;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field755.method261(37305);
        this.field756.method261(37305);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field757 != null) {
            this.field757.method261(37305);
            this.field758.method261(37305);
            var6 = (int) ((double) (this.field757.field738 - this.field757.field737) * 32.768D / var4);
            var7 = (int) ((double) this.field757.field737 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field759 != null) {
            this.field759.method261(37305);
            this.field760.method261(37305);
            var9 = (int) ((double) (this.field759.field738 - this.field759.field737) * 32.768D / var4);
            var10 = (int) ((double) this.field759.field737 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field763[var12] != 0) {
                field773[var12] = 0;
                field774[var12] = (int) ((double) this.field765[var12] * var4);
                field775[var12] = (this.field763[var12] << 14) / 100;
                field776[var12] = (int) ((double) (this.field755.field738 - this.field755.field737) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field764[var12]) / var4);
                field777[var12] = (int) ((double) this.field755.field737 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var24 = this.field755.method262(false, arg0);
            int var25 = this.field756.method262(false, arg0);
            if (this.field757 != null) {
                int var26 = this.field757.method262(false, arg0);
                int var27 = this.field758.method262(false, arg0);
                var24 += this.method271(this.field757.field739, var27, true, var8) >> 1;
                var8 += (var6 * var26 >> 16) + var7;
            }
            if (this.field759 != null) {
                int var28 = this.field759.method262(false, arg0);
                int var29 = this.field760.method262(false, arg0);
                var25 = var25 * ((this.method271(this.field759.field739, var29, true, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var28 >> 16) + var10;
            }
            for (int var30 = 0; var30 < 5; var30++) {
                if (this.field763[var30] != 0) {
                    int var31 = field774[var30] + var13;
                    if (var31 < arg0) {
                        field770[var31] += this.method271(this.field755.field739, field775[var30] * var25 >> 15, true, field773[var30]);
                        field773[var30] += (field776[var30] * var24 >> 16) + field777[var30];
                    }
                }
            }
        }
        if (this.field761 != null) {
            this.field761.method261(37305);
            this.field762.method261(37305);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field761.method262(false, arg0);
                int var19 = this.field762.method262(false, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field761.field738 - this.field761.field737) * var18 >> 8) + this.field761.field737;
                } else {
                    var20 = ((this.field761.field738 - this.field761.field737) * var19 >> 8) + this.field761.field737;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field770[var17] = 0;
                }
            }
        }
        if (this.field766 > 0 && this.field767 > 0) {
            int var21 = (int) ((double) this.field766 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field770[var22] += field770[var22 - var21] * this.field767 / 100;
            }
        }
        for (int var23 = 0; var23 < arg0; var23++) {
            if (field770[var23] < -32768) {
                field770[var23] = -32768;
            }
            if (field770[var23] > 32767) {
                field770[var23] = 32767;
            }
        }
        return field770;
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(IIZI)I")
    private final int method271(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            field754 = !field754;
        }
        if (arg0 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg0 == 2) {
            return field772[arg3 & 0x7FFF] * arg1 >> 14;
        } else if (arg0 == 3) {
            return ((arg3 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg0 == 4) {
            return field771[arg3 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Lkb;B)V")
    public final void method272(Packet arg0, byte arg1) {
        this.field755 = new Envelope();
        this.field755.method260(arg0, (byte) 6);
        this.field756 = new Envelope();
        this.field756.method260(arg0, (byte) 6);
        int var3 = arg0.method209();
        if (var3 != 0) {
            arg0.field612--;
            this.field757 = new Envelope();
            this.field757.method260(arg0, (byte) 6);
            this.field758 = new Envelope();
            this.field758.method260(arg0, (byte) 6);
        }
        int var4 = arg0.method209();
        if (var4 != 0) {
            arg0.field612--;
            this.field759 = new Envelope();
            this.field759.method260(arg0, (byte) 6);
            this.field760 = new Envelope();
            this.field760.method260(arg0, (byte) 6);
        }
        int var5 = arg0.method209();
        if (arg1 == 6) {
            boolean var6 = false;
        } else {
            field754 = !field754;
        }
        if (var5 != 0) {
            arg0.field612--;
            this.field761 = new Envelope();
            this.field761.method260(arg0, (byte) 6);
            this.field762 = new Envelope();
            this.field762.method260(arg0, (byte) 6);
        }
        for (int var7 = 0; var7 < 10; var7++) {
            int var8 = arg0.method223();
            if (var8 == 0) {
                break;
            }
            this.field763[var7] = var8;
            this.field764[var7] = arg0.method222();
            this.field765[var7] = arg0.method223();
        }
        this.field766 = arg0.method223();
        this.field767 = arg0.method223();
        this.field768 = arg0.method211();
        this.field769 = arg0.method211();
    }
}
