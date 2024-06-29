import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class787 extends class596 {

    @OriginalMember(owner = "client!gfa", name = "f", descriptor = "Lrc;")
    public class59 field10781;

    @OriginalMember(owner = "client!gfa", name = "g", descriptor = "[Lmr;")
    public static class637[] field10782 = new class637[75];

    @OriginalMember(owner = "client!gfa", name = "j", descriptor = "[[I")
    public static int[][] field10785 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!gfa", name = "i", descriptor = "I")
    public static int field10784;

    @OriginalMember(owner = "client!gfa", name = "k", descriptor = "I")
    public static int field10786;

    @OriginalMember(owner = "client!gfa", name = "h", descriptor = "[[[Z")
    public static boolean[][][] field10783;

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)V")
    public static void method4309(int arg0) {
        field10785 = null;
        field10782 = null;
        field10783 = null;
        if (arg0 != 127) {
            method4311((byte) 16);
        }
    }

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "(I)V")
    public static final void method4310(int arg0) {
        field10784++;
        if (class594.field7542 != null) {
            return;
        }
        class594.field7542 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0 > -94) {
            return;
        }
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFE6C) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - var6 * var8;
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 * 6.0D < 1.0D) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var33 << 8) + (var32 << 16) + var34;
            class594.field7542[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V")
    public static final void method4311(byte arg0) {
        if (arg0 != -71) {
            method4310(84);
        }
        class687.field8841.method3540(97);
        field10786++;
        class168.field2234 = null;
        class416.field5500 = null;
        class693.field8903 = 1;
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lck;II[B)V")
    public class787(class733 arg0, int arg1, int arg2, byte[] arg3) {
        this.field10781 = class683.method3666(arg2, 6406, 6406, arg0, arg3, false, arg1, 3553);
        this.field10781.method2873(-26403, false, false);
    }
}
