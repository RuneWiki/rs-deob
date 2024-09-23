import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("zb")
public class Tone {

    @OriginalMember(owner = "zb", name = "k", descriptor = "[I")
    private int[] field784 = new int[5];

    @OriginalMember(owner = "zb", name = "l", descriptor = "[I")
    private int[] field785 = new int[5];

    @OriginalMember(owner = "zb", name = "m", descriptor = "[I")
    private int[] field786 = new int[5];

    @OriginalMember(owner = "zb", name = "o", descriptor = "I")
    private int field788 = 100;

    @OriginalMember(owner = "zb", name = "p", descriptor = "I")
    public int field789 = 500;

    @OriginalMember(owner = "zb", name = "a", descriptor = "I")
    private static int field774 = 410;

    @OriginalMember(owner = "zb", name = "u", descriptor = "[I")
    private static int[] field794 = new int[5];

    @OriginalMember(owner = "zb", name = "v", descriptor = "[I")
    private static int[] field795 = new int[5];

    @OriginalMember(owner = "zb", name = "w", descriptor = "[I")
    private static int[] field796 = new int[5];

    @OriginalMember(owner = "zb", name = "x", descriptor = "[I")
    private static int[] field797 = new int[5];

    @OriginalMember(owner = "zb", name = "y", descriptor = "[I")
    private static int[] field798 = new int[5];

    @OriginalMember(owner = "zb", name = "n", descriptor = "I")
    private int field787;

    @OriginalMember(owner = "zb", name = "q", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "zb", name = "c", descriptor = "Lxb;")
    private Envelope field776;

    @OriginalMember(owner = "zb", name = "d", descriptor = "Lxb;")
    private Envelope field777;

    @OriginalMember(owner = "zb", name = "e", descriptor = "Lxb;")
    private Envelope field778;

    @OriginalMember(owner = "zb", name = "f", descriptor = "Lxb;")
    private Envelope field779;

    @OriginalMember(owner = "zb", name = "g", descriptor = "Lxb;")
    private Envelope field780;

    @OriginalMember(owner = "zb", name = "h", descriptor = "Lxb;")
    private Envelope field781;

    @OriginalMember(owner = "zb", name = "i", descriptor = "Lxb;")
    private Envelope field782;

    @OriginalMember(owner = "zb", name = "j", descriptor = "Lxb;")
    private Envelope field783;

    @OriginalMember(owner = "zb", name = "b", descriptor = "Z")
    private static boolean field775;

    @OriginalMember(owner = "zb", name = "z", descriptor = "Z")
    public static boolean field799;

    @OriginalMember(owner = "zb", name = "r", descriptor = "[I")
    private static int[] field791;

    @OriginalMember(owner = "zb", name = "s", descriptor = "[I")
    private static int[] field792;

    @OriginalMember(owner = "zb", name = "t", descriptor = "[I")
    private static int[] field793;

    @OriginalMember(owner = "zb", name = "a", descriptor = "()V")
    public static final void method269() {
        field792 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field792[var0] = 1;
            } else {
                field792[var0] = -1;
            }
        }
        field793 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field793[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field791 = new int[220500];
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(II)[I")
    public final int[] method270(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field791[var3] = 0;
        }
        if (arg1 < 10) {
            return field791;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field776.method261(field775);
        this.field777.method261(field775);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field778 != null) {
            this.field778.method261(field775);
            this.field779.method261(field775);
            var6 = (int) ((double) (this.field778.field757 - this.field778.field756) * 32.768D / var4);
            var7 = (int) ((double) this.field778.field756 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field780 != null) {
            this.field780.method261(field775);
            this.field781.method261(field775);
            var9 = (int) ((double) (this.field780.field757 - this.field780.field756) * 32.768D / var4);
            var10 = (int) ((double) this.field780.field756 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field784[var12] != 0) {
                field794[var12] = 0;
                field795[var12] = (int) ((double) this.field786[var12] * var4);
                field796[var12] = (this.field784[var12] << 14) / 100;
                field797[var12] = (int) ((double) (this.field776.field757 - this.field776.field756) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field785[var12]) / var4);
                field798[var12] = (int) ((double) this.field776.field756 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var24 = this.field776.method262(820, arg0);
            int var25 = this.field777.method262(820, arg0);
            if (this.field778 != null) {
                int var26 = this.field778.method262(820, arg0);
                int var27 = this.field779.method262(820, arg0);
                var24 += this.method271(var27, 0, var8, this.field778.field758) >> 1;
                var8 += (var6 * var26 >> 16) + var7;
            }
            if (this.field780 != null) {
                int var28 = this.field780.method262(820, arg0);
                int var29 = this.field781.method262(820, arg0);
                var25 = var25 * ((this.method271(var29, 0, var11, this.field780.field758) >> 1) + 32768) >> 15;
                var11 += (var9 * var28 >> 16) + var10;
            }
            for (int var30 = 0; var30 < 5; var30++) {
                if (this.field784[var30] != 0) {
                    int var31 = field795[var30] + var13;
                    if (var31 < arg0) {
                        field791[var31] += this.method271(field796[var30] * var25 >> 15, 0, field794[var30], this.field776.field758);
                        field794[var30] += (field797[var30] * var24 >> 16) + field798[var30];
                    }
                }
            }
        }
        if (this.field782 != null) {
            this.field782.method261(field775);
            this.field783.method261(field775);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field782.method262(820, arg0);
                int var19 = this.field783.method262(820, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field782.field757 - this.field782.field756) * var18 >> 8) + this.field782.field756;
                } else {
                    var20 = ((this.field782.field757 - this.field782.field756) * var19 >> 8) + this.field782.field756;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field791[var17] = 0;
                }
            }
        }
        if (this.field787 > 0 && this.field788 > 0) {
            int var21 = (int) ((double) this.field787 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field791[var22] += field791[var22 - var21] * this.field788 / 100;
            }
        }
        for (int var23 = 0; var23 < arg0; var23++) {
            if (field791[var23] < -32768) {
                field791[var23] = -32768;
            }
            if (field791[var23] > 32767) {
                field791[var23] = 32767;
            }
        }
        return field791;
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(IIII)I")
    private final int method271(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            field775 = !field775;
        }
        if (arg3 == 1) {
            return (arg2 & 0x7FFF) < 16384 ? arg0 : -arg0;
        } else if (arg3 == 2) {
            return field793[arg2 & 0x7FFF] * arg0 >> 14;
        } else if (arg3 == 3) {
            return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
        } else if (arg3 == 4) {
            return field792[arg2 / 2607 & 0x7FFF] * arg0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Lkb;I)V")
    public final void method272(Packet arg0, int arg1) {
        this.field776 = new Envelope();
        this.field776.method260(arg0, 0);
        this.field777 = new Envelope();
        this.field777.method260(arg0, 0);
        int var3 = arg0.method209();
        if (var3 != 0) {
            arg0.field621--;
            this.field778 = new Envelope();
            this.field778.method260(arg0, 0);
            this.field779 = new Envelope();
            this.field779.method260(arg0, 0);
        }
        int var4 = arg0.method209();
        if (var4 != 0) {
            arg0.field621--;
            this.field780 = new Envelope();
            this.field780.method260(arg0, 0);
            this.field781 = new Envelope();
            this.field781.method260(arg0, 0);
        }
        int var5 = arg0.method209();
        if (var5 != 0) {
            arg0.field621--;
            this.field782 = new Envelope();
            this.field782.method260(arg0, 0);
            this.field783 = new Envelope();
            this.field783.method260(arg0, 0);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method223();
            if (var7 == 0) {
                break;
            }
            this.field784[var6] = var7;
            this.field785[var6] = arg0.method222();
            this.field786[var6] = arg0.method223();
        }
        this.field787 = arg0.method223();
        this.field788 = arg0.method223();
        if (arg1 != 0) {
            field774 = 373;
        }
        this.field789 = arg0.method211();
        this.field790 = arg0.method211();
    }
}
