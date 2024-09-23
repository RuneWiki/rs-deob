import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("zb")
public class Tone {

    @OriginalMember(owner = "zb", name = "c", descriptor = "I")
    private int field783 = 710;

    @OriginalMember(owner = "zb", name = "l", descriptor = "[I")
    private int[] field792 = new int[5];

    @OriginalMember(owner = "zb", name = "m", descriptor = "[I")
    private int[] field793 = new int[5];

    @OriginalMember(owner = "zb", name = "n", descriptor = "[I")
    private int[] field794 = new int[5];

    @OriginalMember(owner = "zb", name = "p", descriptor = "I")
    private int field796 = 100;

    @OriginalMember(owner = "zb", name = "q", descriptor = "I")
    public int field797 = 500;

    @OriginalMember(owner = "zb", name = "a", descriptor = "B")
    private static byte field781 = 8;

    @OriginalMember(owner = "zb", name = "b", descriptor = "B")
    private static byte field782 = 8;

    @OriginalMember(owner = "zb", name = "v", descriptor = "[I")
    private static int[] field802 = new int[5];

    @OriginalMember(owner = "zb", name = "w", descriptor = "[I")
    private static int[] field803 = new int[5];

    @OriginalMember(owner = "zb", name = "x", descriptor = "[I")
    private static int[] field804 = new int[5];

    @OriginalMember(owner = "zb", name = "y", descriptor = "[I")
    private static int[] field805 = new int[5];

    @OriginalMember(owner = "zb", name = "z", descriptor = "[I")
    private static int[] field806 = new int[5];

    @OriginalMember(owner = "zb", name = "o", descriptor = "I")
    private int field795;

    @OriginalMember(owner = "zb", name = "r", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "zb", name = "d", descriptor = "Lxb;")
    private Envelope field784;

    @OriginalMember(owner = "zb", name = "e", descriptor = "Lxb;")
    private Envelope field785;

    @OriginalMember(owner = "zb", name = "f", descriptor = "Lxb;")
    private Envelope field786;

    @OriginalMember(owner = "zb", name = "g", descriptor = "Lxb;")
    private Envelope field787;

    @OriginalMember(owner = "zb", name = "h", descriptor = "Lxb;")
    private Envelope field788;

    @OriginalMember(owner = "zb", name = "i", descriptor = "Lxb;")
    private Envelope field789;

    @OriginalMember(owner = "zb", name = "j", descriptor = "Lxb;")
    private Envelope field790;

    @OriginalMember(owner = "zb", name = "k", descriptor = "Lxb;")
    private Envelope field791;

    @OriginalMember(owner = "zb", name = "A", descriptor = "Z")
    public static boolean field807;

    @OriginalMember(owner = "zb", name = "s", descriptor = "[I")
    private static int[] field799;

    @OriginalMember(owner = "zb", name = "t", descriptor = "[I")
    private static int[] field800;

    @OriginalMember(owner = "zb", name = "u", descriptor = "[I")
    private static int[] field801;

    @OriginalMember(owner = "zb", name = "a", descriptor = "()V")
    public static final void method269() {
        field800 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field800[var0] = 1;
            } else {
                field800[var0] = -1;
            }
        }
        field801 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field801[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field799 = new int[220500];
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(II)[I")
    public final int[] method270(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field799[var3] = 0;
        }
        if (arg1 < 10) {
            return field799;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field784.method261(-81);
        this.field785.method261(-81);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field786 != null) {
            this.field786.method261(-81);
            this.field787.method261(-81);
            var6 = (int) ((double) (this.field786.field760 - this.field786.field759) * 32.768D / var4);
            var7 = (int) ((double) this.field786.field759 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field788 != null) {
            this.field788.method261(-81);
            this.field789.method261(-81);
            var9 = (int) ((double) (this.field788.field760 - this.field788.field759) * 32.768D / var4);
            var10 = (int) ((double) this.field788.field759 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field792[var12] != 0) {
                field802[var12] = 0;
                field803[var12] = (int) ((double) this.field794[var12] * var4);
                field804[var12] = (this.field792[var12] << 14) / 100;
                field805[var12] = (int) ((double) (this.field784.field760 - this.field784.field759) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field793[var12]) / var4);
                field806[var12] = (int) ((double) this.field784.field759 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var24 = this.field784.method262((byte) 6, arg0);
            int var25 = this.field785.method262((byte) 6, arg0);
            if (this.field786 != null) {
                int var26 = this.field786.method262((byte) 6, arg0);
                int var27 = this.field787.method262((byte) 6, arg0);
                var24 += this.method271(var27, var8, this.field786.field761, field782) >> 1;
                var8 += (var6 * var26 >> 16) + var7;
            }
            if (this.field788 != null) {
                int var28 = this.field788.method262((byte) 6, arg0);
                int var29 = this.field789.method262((byte) 6, arg0);
                var25 = var25 * ((this.method271(var29, var11, this.field788.field761, field782) >> 1) + 32768) >> 15;
                var11 += (var9 * var28 >> 16) + var10;
            }
            for (int var30 = 0; var30 < 5; var30++) {
                if (this.field792[var30] != 0) {
                    int var31 = field803[var30] + var13;
                    if (var31 < arg0) {
                        field799[var31] += this.method271(field804[var30] * var25 >> 15, field802[var30], this.field784.field761, field782);
                        field802[var30] += (field805[var30] * var24 >> 16) + field806[var30];
                    }
                }
            }
        }
        if (this.field790 != null) {
            this.field790.method261(-81);
            this.field791.method261(-81);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field790.method262((byte) 6, arg0);
                int var19 = this.field791.method262((byte) 6, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field790.field760 - this.field790.field759) * var18 >> 8) + this.field790.field759;
                } else {
                    var20 = ((this.field790.field760 - this.field790.field759) * var19 >> 8) + this.field790.field759;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field799[var17] = 0;
                }
            }
        }
        if (this.field795 > 0 && this.field796 > 0) {
            int var21 = (int) ((double) this.field795 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field799[var22] += field799[var22 - var21] * this.field796 / 100;
            }
        }
        for (int var23 = 0; var23 < arg0; var23++) {
            if (field799[var23] < -32768) {
                field799[var23] = -32768;
            }
            if (field799[var23] > 32767) {
                field799[var23] = 32767;
            }
        }
        return field799;
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(IIIB)I")
    private final int method271(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 8) {
            this.field783 = -423;
        }
        if (arg2 == 1) {
            return (arg1 & 0x7FFF) < 16384 ? arg0 : -arg0;
        } else if (arg2 == 2) {
            return field801[arg1 & 0x7FFF] * arg0 >> 14;
        } else if (arg2 == 3) {
            return ((arg1 & 0x7FFF) * arg0 >> 14) - arg0;
        } else if (arg2 == 4) {
            return field800[arg1 / 2607 & 0x7FFF] * arg0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(BLkb;)V")
    public final void method272(byte arg0, Packet arg1) {
        this.field784 = new Envelope();
        this.field784.method260(field781, arg1);
        this.field785 = new Envelope();
        this.field785.method260(field781, arg1);
        int var3 = arg1.method209();
        if (var3 != 0) {
            arg1.field623--;
            this.field786 = new Envelope();
            this.field786.method260(field781, arg1);
            this.field787 = new Envelope();
            this.field787.method260(field781, arg1);
        }
        int var4 = arg1.method209();
        if (arg0 == 8) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (var4 != 0) {
            arg1.field623--;
            this.field788 = new Envelope();
            this.field788.method260(field781, arg1);
            this.field789 = new Envelope();
            this.field789.method260(field781, arg1);
        }
        int var7 = arg1.method209();
        if (var7 != 0) {
            arg1.field623--;
            this.field790 = new Envelope();
            this.field790.method260(field781, arg1);
            this.field791 = new Envelope();
            this.field791.method260(field781, arg1);
        }
        for (int var8 = 0; var8 < 10; var8++) {
            int var9 = arg1.method223();
            if (var9 == 0) {
                break;
            }
            this.field792[var8] = var9;
            this.field793[var8] = arg1.method222();
            this.field794[var8] = arg1.method223();
        }
        this.field795 = arg1.method223();
        this.field796 = arg1.method223();
        this.field797 = arg1.method211();
        this.field798 = arg1.method211();
    }
}
