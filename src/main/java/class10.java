import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 {

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "Lhm;")
    private class208 field98 = new class208(128);

    @OriginalMember(owner = "client!hba", name = "i", descriptor = "Lpfa;")
    private class275 field99;

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "Luv;")
    public static class338 field96 = new class338();

    @OriginalMember(owner = "client!hba", name = "j", descriptor = "I")
    public static int field100 = 0;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)Ljl;")
    public final class253 method44(int arg0, int arg1) {
        field94++;
        class208 var3 = this.field98;
        class253 var4;
        synchronized (this.field98) {
            var4 = (class253) this.field98.method1221((long) arg1, true);
        }
        if (var4 != null) {
            return var4;
        }
        class275 var5 = this.field99;
        byte[] var6;
        synchronized (this.field99) {
            var6 = this.field99.method1659(-2, arg1, 1);
            if (arg0 != 2) {
                this.method46(-121);
            }
        }
        class253 var7 = new class253();
        if (var6 != null) {
            var7.method1529(new class572(var6), 16793);
        }
        class208 var8 = this.field98;
        synchronized (this.field98) {
            this.field98.method1230((byte) 65, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
    public static final void method45(int arg0) {
        field91++;
        if (class76.field999 != null) {
            return;
        }
        class76.field999 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0 != 127) {
            field100 = -30;
        }
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x391) >> 7) / 8.0D + 0.0625D;
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
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (0.6666666666666666D - var4) * (var16 - var18) * 6.0D + var18;
                } else {
                    var12 = var18;
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
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class76.field999[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(I)V")
    public final void method46(int arg0) {
        class208 var2 = this.field98;
        synchronized (this.field98) {
            this.field98.method1224(false);
        }
        field95++;
        if (arg0 != 975653767) {
            this.method46(42);
        }
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(II)V")
    public final void method47(int arg0, int arg1) {
        class208 var3 = this.field98;
        synchronized (this.field98) {
            if (arg1 != 3) {
                return;
            }
            this.field98.method1222(arg1 + 14561, arg0);
        }
        field92++;
    }

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "(I)V")
    public static void method48(int arg0) {
        if (arg0 != 6) {
            field96 = null;
        }
        field96 = null;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)V")
    public final void method49(byte arg0) {
        class208 var2 = this.field98;
        synchronized (this.field98) {
            this.field98.method1218(105);
            if (arg0 <= 64) {
                this.method46(-52);
            }
        }
        field97++;
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lbs;ILpfa;)V")
    public class10(class643 arg0, int arg1, class275 arg2) {
        this.field99 = arg2;
        this.field99.method1655(1, (byte) -82);
    }
}
