import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public abstract class class307 extends class390 {

    @OriginalMember(owner = "client!um", name = "l", descriptor = "[S")
    public static short[] field4236;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)I")
    public abstract int method383(int arg0);

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)V")
    public static final void method1975(int arg0) {
        field4235++;
        if (class128.field1805 != null) {
            return;
        }
        class128.field1805 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0 != 6) {
            return;
        }
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFF95) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x3D2) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (0.6666666666666666D - var4) * (var16 - var18) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var24 * 6.0D < 1.0D) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
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
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class128.field1805[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)I")
    public abstract int method388(int arg0);

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)I")
    public abstract int method384(int arg0);

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(B)J")
    public abstract long method385(byte arg0);

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(B)V")
    public static void method1976(byte arg0) {
        int var1 = -112 / ((arg0 + 9) / 58);
        field4236 = null;
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(I)V")
    public static final void method1977(int arg0) {
        if (arg0 != -4) {
            method1975(94);
        }
        field4234++;
        class133.field1915.method905((byte) 77);
    }

    static {
        new class442("Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.");
        new class442("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field4236 = new short[256];
    }
}
