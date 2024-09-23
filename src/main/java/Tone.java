import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("zb")
public class Tone {

    @OriginalMember(owner = "zb", name = "j", descriptor = "[I")
    private int[] field780 = new int[5];

    @OriginalMember(owner = "zb", name = "k", descriptor = "[I")
    private int[] field781 = new int[5];

    @OriginalMember(owner = "zb", name = "l", descriptor = "[I")
    private int[] field782 = new int[5];

    @OriginalMember(owner = "zb", name = "n", descriptor = "I")
    private int field784 = 100;

    @OriginalMember(owner = "zb", name = "o", descriptor = "I")
    public int field785 = 500;

    @OriginalMember(owner = "zb", name = "a", descriptor = "B")
    private static byte field771 = -79;

    @OriginalMember(owner = "zb", name = "t", descriptor = "[I")
    private static int[] field790 = new int[5];

    @OriginalMember(owner = "zb", name = "u", descriptor = "[I")
    private static int[] field791 = new int[5];

    @OriginalMember(owner = "zb", name = "v", descriptor = "[I")
    private static int[] field792 = new int[5];

    @OriginalMember(owner = "zb", name = "w", descriptor = "[I")
    private static int[] field793 = new int[5];

    @OriginalMember(owner = "zb", name = "x", descriptor = "[I")
    private static int[] field794 = new int[5];

    @OriginalMember(owner = "zb", name = "m", descriptor = "I")
    private int field783;

    @OriginalMember(owner = "zb", name = "p", descriptor = "I")
    public int field786;

    @OriginalMember(owner = "zb", name = "b", descriptor = "Lxb;")
    private Envelope field772;

    @OriginalMember(owner = "zb", name = "c", descriptor = "Lxb;")
    private Envelope field773;

    @OriginalMember(owner = "zb", name = "d", descriptor = "Lxb;")
    private Envelope field774;

    @OriginalMember(owner = "zb", name = "e", descriptor = "Lxb;")
    private Envelope field775;

    @OriginalMember(owner = "zb", name = "f", descriptor = "Lxb;")
    private Envelope field776;

    @OriginalMember(owner = "zb", name = "g", descriptor = "Lxb;")
    private Envelope field777;

    @OriginalMember(owner = "zb", name = "h", descriptor = "Lxb;")
    private Envelope field778;

    @OriginalMember(owner = "zb", name = "i", descriptor = "Lxb;")
    private Envelope field779;

    @OriginalMember(owner = "zb", name = "y", descriptor = "Z")
    public static boolean field795;

    @OriginalMember(owner = "zb", name = "q", descriptor = "[I")
    private static int[] field787;

    @OriginalMember(owner = "zb", name = "r", descriptor = "[I")
    private static int[] field788;

    @OriginalMember(owner = "zb", name = "s", descriptor = "[I")
    private static int[] field789;

    @OriginalMember(owner = "zb", name = "a", descriptor = "()V")
    public static final void method276() {
        field788 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field788[var0] = 1;
            } else {
                field788[var0] = -1;
            }
        }
        field789 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field789[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field787 = new int[220500];
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(II)[I")
    public final int[] method277(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field787[var3] = 0;
        }
        if (arg1 < 10) {
            return field787;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field772.method268(5);
        this.field773.method268(5);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field774 != null) {
            this.field774.method268(5);
            this.field775.method268(5);
            var6 = (int) ((double) (this.field774.field755 - this.field774.field754) * 32.768D / var4);
            var7 = (int) ((double) this.field774.field754 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field776 != null) {
            this.field776.method268(5);
            this.field777.method268(5);
            var9 = (int) ((double) (this.field776.field755 - this.field776.field754) * 32.768D / var4);
            var10 = (int) ((double) this.field776.field754 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field780[var12] != 0) {
                field790[var12] = 0;
                field791[var12] = (int) ((double) this.field782[var12] * var4);
                field792[var12] = (this.field780[var12] << 14) / 100;
                field793[var12] = (int) ((double) (this.field772.field755 - this.field772.field754) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field781[var12]) / var4);
                field794[var12] = (int) ((double) this.field772.field754 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var24 = this.field772.method269(arg0, (byte) 47);
            int var25 = this.field773.method269(arg0, (byte) 47);
            if (this.field774 != null) {
                int var26 = this.field774.method269(arg0, (byte) 47);
                int var27 = this.field775.method269(arg0, (byte) 47);
                var24 += this.method278(var27, field771, var8, this.field774.field756) >> 1;
                var8 += (var6 * var26 >> 16) + var7;
            }
            if (this.field776 != null) {
                int var28 = this.field776.method269(arg0, (byte) 47);
                int var29 = this.field777.method269(arg0, (byte) 47);
                var25 = var25 * ((this.method278(var29, field771, var11, this.field776.field756) >> 1) + 32768) >> 15;
                var11 += (var9 * var28 >> 16) + var10;
            }
            for (int var30 = 0; var30 < 5; var30++) {
                if (this.field780[var30] != 0) {
                    int var31 = field791[var30] + var13;
                    if (var31 < arg0) {
                        field787[var31] += this.method278(field792[var30] * var25 >> 15, field771, field790[var30], this.field772.field756);
                        field790[var30] += (field793[var30] * var24 >> 16) + field794[var30];
                    }
                }
            }
        }
        if (this.field778 != null) {
            this.field778.method268(5);
            this.field779.method268(5);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field778.method269(arg0, (byte) 47);
                int var19 = this.field779.method269(arg0, (byte) 47);
                int var20;
                if (var16) {
                    var20 = ((this.field778.field755 - this.field778.field754) * var18 >> 8) + this.field778.field754;
                } else {
                    var20 = ((this.field778.field755 - this.field778.field754) * var19 >> 8) + this.field778.field754;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field787[var17] = 0;
                }
            }
        }
        if (this.field783 > 0 && this.field784 > 0) {
            int var21 = (int) ((double) this.field783 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field787[var22] += field787[var22 - var21] * this.field784 / 100;
            }
        }
        for (int var23 = 0; var23 < arg0; var23++) {
            if (field787[var23] < -32768) {
                field787[var23] = -32768;
            }
            if (field787[var23] > 32767) {
                field787[var23] = 32767;
            }
        }
        return field787;
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(IBII)I")
    private final int method278(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -79) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg3 == 1) {
            return (arg2 & 0x7FFF) < 16384 ? arg0 : -arg0;
        } else if (arg3 == 2) {
            return field789[arg2 & 0x7FFF] * arg0 >> 14;
        } else if (arg3 == 3) {
            return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
        } else if (arg3 == 4) {
            return field788[arg2 / 2607 & 0x7FFF] * arg0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Lkb;Z)V")
    public final void method279(Packet arg0, boolean arg1) {
        this.field772 = new Envelope();
        this.field772.method267(arg0, true);
        this.field773 = new Envelope();
        this.field773.method267(arg0, true);
        int var3 = arg0.method216();
        if (!arg1) {
            throw new NullPointerException();
        }
        if (var3 != 0) {
            arg0.field624--;
            this.field774 = new Envelope();
            this.field774.method267(arg0, true);
            this.field775 = new Envelope();
            this.field775.method267(arg0, true);
        }
        int var4 = arg0.method216();
        if (var4 != 0) {
            arg0.field624--;
            this.field776 = new Envelope();
            this.field776.method267(arg0, true);
            this.field777 = new Envelope();
            this.field777.method267(arg0, true);
        }
        int var5 = arg0.method216();
        if (var5 != 0) {
            arg0.field624--;
            this.field778 = new Envelope();
            this.field778.method267(arg0, true);
            this.field779 = new Envelope();
            this.field779.method267(arg0, true);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method230();
            if (var7 == 0) {
                break;
            }
            this.field780[var6] = var7;
            this.field781[var6] = arg0.method229();
            this.field782[var6] = arg0.method230();
        }
        this.field783 = arg0.method230();
        this.field784 = arg0.method230();
        this.field785 = arg0.method218();
        this.field786 = arg0.method218();
    }
}
