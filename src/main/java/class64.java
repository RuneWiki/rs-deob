import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class64 {

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Lof;")
    private class328 field1004 = new class328(64);

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Lmn;")
    private class162 field1010;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field1005 = 0;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field1008 = 0;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "[Lmk;")
    public static class251[] field1006;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)Llu;")
    public final class35 method469(byte arg0, int arg1) {
        field1009++;
        class328 var3 = this.field1004;
        class35 var4;
        synchronized (this.field1004) {
            var4 = (class35) this.field1004.method2191((byte) -73, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class162 var5 = this.field1010;
        byte[] var6;
        synchronized (this.field1010) {
            var6 = this.field1010.method1004(5, false, arg1);
        }
        if (arg0 > -6) {
            return null;
        }
        class35 var7 = new class35();
        if (var6 != null) {
            var7.method216(true, new class208(var6));
        }
        class328 var8 = this.field1004;
        synchronized (this.field1004) {
            this.field1004.method2188(-124, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method470(int arg0) {
        field1006 = null;
        if (arg0 != 65536) {
            method471((byte) -78);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static final void method471(byte arg0) {
        field1003++;
        if (class301.field4730 != null) {
            return;
        }
        class301.field4730 = new int[65536];
        if (arg0 != 77) {
            return;
        }
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x3DB) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
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
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (0.6666666666666666D - var4) * (var16 - var18) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
                    var14 = (0.6666666666666666D - var24) * (var16 - var18) * 6.0D + var18;
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
            int var35 = (var32 << 16) + var34 + (var33 << 8);
            class301.field4730[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lpr;ILmn;)V")
    public class64(class236 arg0, int arg1, class162 arg2) {
        this.field1010 = arg2;
        this.field1010.method1008(5, (byte) -21);
    }

    static {
        new class213("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
    }
}
