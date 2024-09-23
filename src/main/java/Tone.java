import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("zb")
public class Tone {

    @OriginalMember(owner = "zb", name = "k", descriptor = "[I")
    private int[] field783 = new int[5];

    @OriginalMember(owner = "zb", name = "l", descriptor = "[I")
    private int[] field784 = new int[5];

    @OriginalMember(owner = "zb", name = "m", descriptor = "[I")
    private int[] field785 = new int[5];

    @OriginalMember(owner = "zb", name = "o", descriptor = "I")
    private int field787 = 100;

    @OriginalMember(owner = "zb", name = "p", descriptor = "I")
    public int field788 = 500;

    @OriginalMember(owner = "zb", name = "a", descriptor = "B")
    private static byte field773 = 6;

    @OriginalMember(owner = "zb", name = "u", descriptor = "[I")
    private static int[] field793 = new int[5];

    @OriginalMember(owner = "zb", name = "v", descriptor = "[I")
    private static int[] field794 = new int[5];

    @OriginalMember(owner = "zb", name = "w", descriptor = "[I")
    private static int[] field795 = new int[5];

    @OriginalMember(owner = "zb", name = "x", descriptor = "[I")
    private static int[] field796 = new int[5];

    @OriginalMember(owner = "zb", name = "y", descriptor = "[I")
    private static int[] field797 = new int[5];

    @OriginalMember(owner = "zb", name = "b", descriptor = "I")
    private int field774;

    @OriginalMember(owner = "zb", name = "n", descriptor = "I")
    private int field786;

    @OriginalMember(owner = "zb", name = "q", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "zb", name = "c", descriptor = "Lxb;")
    private Envelope field775;

    @OriginalMember(owner = "zb", name = "d", descriptor = "Lxb;")
    private Envelope field776;

    @OriginalMember(owner = "zb", name = "e", descriptor = "Lxb;")
    private Envelope field777;

    @OriginalMember(owner = "zb", name = "f", descriptor = "Lxb;")
    private Envelope field778;

    @OriginalMember(owner = "zb", name = "g", descriptor = "Lxb;")
    private Envelope field779;

    @OriginalMember(owner = "zb", name = "h", descriptor = "Lxb;")
    private Envelope field780;

    @OriginalMember(owner = "zb", name = "i", descriptor = "Lxb;")
    private Envelope field781;

    @OriginalMember(owner = "zb", name = "j", descriptor = "Lxb;")
    private Envelope field782;

    @OriginalMember(owner = "zb", name = "z", descriptor = "Z")
    public static boolean field798;

    @OriginalMember(owner = "zb", name = "r", descriptor = "[I")
    private static int[] field790;

    @OriginalMember(owner = "zb", name = "s", descriptor = "[I")
    private static int[] field791;

    @OriginalMember(owner = "zb", name = "t", descriptor = "[I")
    private static int[] field792;

    @OriginalMember(owner = "zb", name = "a", descriptor = "()V")
    public static final void method268() {
        field791 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field791[var0] = 1;
            } else {
                field791[var0] = -1;
            }
        }
        field792 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field792[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field790 = new int[220500];
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(II)[I")
    public final int[] method269(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field790[var3] = 0;
        }
        if (arg1 < 10) {
            return field790;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field775.method260(0);
        this.field776.method260(0);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field777 != null) {
            this.field777.method260(0);
            this.field778.method260(0);
            var6 = (int) ((double) (this.field777.field755 - this.field777.field754) * 32.768D / var4);
            var7 = (int) ((double) this.field777.field754 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field779 != null) {
            this.field779.method260(0);
            this.field780.method260(0);
            var9 = (int) ((double) (this.field779.field755 - this.field779.field754) * 32.768D / var4);
            var10 = (int) ((double) this.field779.field754 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field783[var12] != 0) {
                field793[var12] = 0;
                field794[var12] = (int) ((double) this.field785[var12] * var4);
                field795[var12] = (this.field783[var12] << 14) / 100;
                field796[var12] = (int) ((double) (this.field775.field755 - this.field775.field754) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field784[var12]) / var4);
                field797[var12] = (int) ((double) this.field775.field754 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var24 = this.field775.method261(arg0, -536);
            int var25 = this.field776.method261(arg0, -536);
            if (this.field777 != null) {
                int var26 = this.field777.method261(arg0, -536);
                int var27 = this.field778.method261(arg0, -536);
                var24 += this.method270((byte) -4, var8, var27, this.field777.field756) >> 1;
                var8 += (var6 * var26 >> 16) + var7;
            }
            if (this.field779 != null) {
                int var28 = this.field779.method261(arg0, -536);
                int var29 = this.field780.method261(arg0, -536);
                var25 = var25 * ((this.method270((byte) -4, var11, var29, this.field779.field756) >> 1) + 32768) >> 15;
                var11 += (var9 * var28 >> 16) + var10;
            }
            for (int var30 = 0; var30 < 5; var30++) {
                if (this.field783[var30] != 0) {
                    int var31 = field794[var30] + var13;
                    if (var31 < arg0) {
                        field790[var31] += this.method270((byte) -4, field793[var30], field795[var30] * var25 >> 15, this.field775.field756);
                        field793[var30] += (field796[var30] * var24 >> 16) + field797[var30];
                    }
                }
            }
        }
        if (this.field781 != null) {
            this.field781.method260(0);
            this.field782.method260(0);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field781.method261(arg0, -536);
                int var19 = this.field782.method261(arg0, -536);
                int var20;
                if (var16) {
                    var20 = ((this.field781.field755 - this.field781.field754) * var18 >> 8) + this.field781.field754;
                } else {
                    var20 = ((this.field781.field755 - this.field781.field754) * var19 >> 8) + this.field781.field754;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field790[var17] = 0;
                }
            }
        }
        if (this.field786 > 0 && this.field787 > 0) {
            int var21 = (int) ((double) this.field786 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field790[var22] += field790[var22 - var21] * this.field787 / 100;
            }
        }
        for (int var23 = 0; var23 < arg0; var23++) {
            if (field790[var23] < -32768) {
                field790[var23] = -32768;
            }
            if (field790[var23] > 32767) {
                field790[var23] = 32767;
            }
        }
        return field790;
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(BIII)I")
    private final int method270(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -4) {
            this.field774 = 402;
        }
        if (arg3 == 1) {
            return (arg1 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg3 == 2) {
            return field792[arg1 & 0x7FFF] * arg2 >> 14;
        } else if (arg3 == 3) {
            return ((arg1 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg3 == 4) {
            return field791[arg1 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(BLkb;)V")
    public final void method271(byte arg0, Packet arg1) {
        this.field775 = new Envelope();
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        this.field775.method259(field773, arg1);
        this.field776 = new Envelope();
        this.field776.method259(field773, arg1);
        int var3 = arg1.method208();
        if (var3 != 0) {
            arg1.field622--;
            this.field777 = new Envelope();
            this.field777.method259(field773, arg1);
            this.field778 = new Envelope();
            this.field778.method259(field773, arg1);
        }
        int var4 = arg1.method208();
        if (var4 != 0) {
            arg1.field622--;
            this.field779 = new Envelope();
            this.field779.method259(field773, arg1);
            this.field780 = new Envelope();
            this.field780.method259(field773, arg1);
        }
        int var5 = arg1.method208();
        if (var5 != 0) {
            arg1.field622--;
            this.field781 = new Envelope();
            this.field781.method259(field773, arg1);
            this.field782 = new Envelope();
            this.field782.method259(field773, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method222();
            if (var7 == 0) {
                break;
            }
            this.field783[var6] = var7;
            this.field784[var6] = arg1.method221();
            this.field785[var6] = arg1.method222();
        }
        this.field786 = arg1.method222();
        this.field787 = arg1.method222();
        this.field788 = arg1.method210();
        this.field789 = arg1.method210();
    }
}
