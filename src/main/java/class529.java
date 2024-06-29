import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class529 extends OutputStream {

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
    public static int field7896 = 0;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
    public static int field7895 = 0;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "I")
    public static int field7899 = 0;

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "F")
    public static float field7898;

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
    public static int field7897;

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "I")
    public static int field7900;

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "I")
    public static int field7901;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILwca;)V")
    public static final void method3188(int arg0, class583 arg1) {
        field7900++;
        if (class446.field6245) {
            return;
        }
        if (arg0 != -19054) {
            field7898 = -1.5376614F;
        }
        arg1.method2457(-8422);
        class103.field1484--;
    }

    @OriginalMember(owner = "client!aaa", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field7897++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
    public static final void method3189(int arg0) {
        field7901++;
        if (class60.field758 != null) {
            return;
        }
        class60.field758 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        if (arg0 > -76) {
            field7895 = 104;
        }
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFD59) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x380) >> 7) / 8.0D + 0.0625D;
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
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
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
            int var35 = (var32 << 16) + ((var33 << 8) + var34);
            class60.field758[var3] = var35;
        }
    }
}
