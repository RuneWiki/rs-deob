import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class547 {

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    private int field7827;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
    private int field7837;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "[[I")
    private int[][] field7832;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "[I")
    public static int[] field7823;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "[I")
    public static int[] field7831;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "[I")
    public static int[] field7830;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "Lkp;")
    public static class421 field7824;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "Lig;")
    public static class206 field7833;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "Lsd;")
    public static class80 field7835;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "[I")
    public static int[] field7838;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field7826;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public static int field7834;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public static int field7836;

    static {
        new class474("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field7823 = new int[4];
        field7831 = new int[3];
        field7830 = new int[] { 1, 2, 4, 8 };
        field7824 = new class421(1);
        field7833 = new class206(104, 19);
        field7835 = new class80(512);
        field7838 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V", line = 14)
    public static void method3181(int arg0) {
        field7831 = null;
        field7833 = null;
        field7824 = null;
        field7838 = null;
        field7830 = null;
        field7823 = null;
        if (arg0 == 2) {
            field7835 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B[B)[B", line = 33)
    public final byte[] method3182(byte arg0, byte[] arg1) {
        int var3 = -12 % ((arg0 + 12) / 37);
        field7826++;
        if (this.field7832 != null) {
            int var4 = (int) ((long) arg1.length * (long) this.field7827 / (long) this.field7837) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.length; var8++) {
                byte var11 = arg1[var8];
                int[] var12 = this.field7832[var7];
                for (int var13 = 0; var13 < 14; var13++) {
                    var5[var6 + var13] += var12[var13] * var11;
                }
                int var14 = this.field7827 + var7;
                int var15 = var14 / this.field7837;
                var6 += var15;
                var7 = var14 - this.field7837 * var15;
            }
            arg1 = new byte[var4];
            for (int var9 = 0; var9 < var4; var9++) {
                int var10 = var5[var9] + 32768 >> 16;
                if (var10 < -128) {
                    arg1[var9] = -128;
                } else if (var10 > 127) {
                    arg1[var9] = 127;
                } else {
                    arg1[var9] = (byte) var10;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)I", line = 103)
    public final int method3183(int arg0, int arg1) {
        field7828++;
        if (arg1 == 2) {
            if (this.field7832 != null) {
                arg0 = ((int) ((long) this.field7827 * (long) arg0 / (long) this.field7837)) + 6;
            }
            return arg0;
        } else {
            return -126;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIII)V", line = 127)
    public static final void method3184(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= arg4) {
            for (int var5 = arg4; var5 < arg0; var5++) {
                class402.field6087[var5][arg3] = arg2;
            }
        } else {
            for (int var6 = arg0; var6 < arg4; var6++) {
                class402.field6087[var6][arg3] = arg2;
            }
        }
        field7825++;
        if (arg1 != 16247) {
            field7830 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(II)I", line = 167)
    public final int method3185(int arg0, int arg1) {
        if (this.field7832 != null) {
            arg0 = (int) ((long) this.field7827 * (long) arg0 / (long) this.field7837);
        }
        field7829++;
        if (arg1 != -22221) {
            this.method3185(-59, -23);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(II)V", line = 195)
    public class547(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class185.method1081(arg1, arg0, (byte) -106);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field7827 = var5;
            this.field7837 = var4;
            this.field7832 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field7832[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
