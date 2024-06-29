import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public abstract class class355 extends class366 {

    @OriginalMember(owner = "client!th", name = "E", descriptor = "[J")
    public static long[] field5141 = new long[32];

    @OriginalMember(owner = "client!th", name = "D", descriptor = "I")
    public static int field5140 = 0;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    public static int field5139 = 3;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "[I")
    public static int[] field5147 = new int[5];

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "[Lqk;")
    public static class12[] field5143;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(B)Z")
    public abstract boolean method494(byte arg0);

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(Z)V")
    public static void method2321(boolean arg0) {
        if (!arg0) {
            method2322((byte) -85, -67);
        }
        field5141 = null;
        field5147 = null;
        field5143 = null;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method491(int arg0);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)V")
    public static final void method2322(byte arg0, int arg1) {
        field5145++;
        if (arg0 == -14) {
            class276 var2 = class264.method1816((byte) -115, arg1, 6);
            var2.method1870((byte) 126);
        }
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(B)V")
    public static final void method2323(byte arg0) {
        field5142++;
        if (class131.field1911 != null) {
            return;
        }
        class131.field1911 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0 >= -53) {
            return;
        }
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFFD4) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
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
                if (var20 * 6.0D < 1.0D) {
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
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
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
            int var35 = (var32 << 16) + var34 + (var33 << 8);
            class131.field1911[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILuh;)V")
    public static final void method2324(int arg0, class92 arg1) {
        class439.field6280[arg0] = arg1;
    }
}
