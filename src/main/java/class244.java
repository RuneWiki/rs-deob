import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class244 {

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "B")
    public static byte field3406;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Lr;")
    public class181 field3404;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Lka;")
    public class469 field3407;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)I", line = 3)
    public static final int method1627(int arg0, int arg1) {
        field3403++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg0 & 0xFFC6) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = (double) arg1;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 1) + (var21 >> 5 << 7) + ((var20 >> 2 & 0x3F) << 10);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V", line = 103)
    public static final void method1628(int arg0) {
        field3405++;
        int[] var1 = new int[class558.field7942.field1260];
        int var2 = 0;
        for (int var3 = 0; var3 < class558.field7942.field1260; var3++) {
            class253 var5 = class558.field7942.method721(126, var3);
            if (var5.field3607 >= 0 || var5.field3650 >= 0) {
                var1[var2++] = var3;
            }
        }
        class621.field8957 = new int[var2];
        for (int var4 = arg0; var4 < var2; var4++) {
            class621.field8957[var4] = var1[var4];
        }
    }
}
