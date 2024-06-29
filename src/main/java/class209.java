import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class209 {

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lv;")
    public static class218 field3672 = new class218();

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Z")
    public static boolean field3675 = false;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field3673 = 0;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field3677 = 0;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Loc;")
    private static class151 field3676 = class137.method873(2, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Loc;")
    public static class151 field3674 = field3676;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method1305(int arg0) {
        if (arg0 != 217) {
            method1306(105, (byte) 0);
        }
        field3674 = null;
        field3672 = null;
        field3676 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)I")
    public static final int method1306(int arg0, byte arg1) {
        field3671++;
        if (arg0 == 16711935) {
            return -1;
        }
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        if (arg1 != 116) {
            return 67;
        }
        double var8 = var2;
        if (var4 > var2) {
            var8 = var4;
        }
        if (var8 < var6) {
            var8 = var6;
        }
        double var10 = 0.0D;
        double var12 = 0.0D;
        double var14 = var2;
        if (var2 > var4) {
            var14 = var4;
        }
        if (var6 < var14) {
            var14 = var6;
        }
        double var16 = (var8 + var14) / 2.0D;
        int var18 = (int) (var16 * 256.0D);
        if (var8 != var14) {
            if (var2 == var8) {
                var12 = (var4 - var6) / (var8 - var14);
            } else if (var4 == var8) {
                var12 = (var6 - var2) / (var8 - var14) + 2.0D;
            } else if (var6 == var8) {
                var12 = (var2 - var4) / (var8 - var14) + 4.0D;
            }
            if (var16 < 0.5D) {
                var10 = (var8 - var14) / (var8 + var14);
            }
            if (var16 >= 0.5D) {
                var10 = (var8 - var14) / (-var8 + 2.0D + -var14);
            }
        }
        double var19 = var12 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        int var22 = (int) (var10 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var18 > 243) {
            var22 >>= 0x4;
        } else if (var18 > 217) {
            var22 >>= 0x3;
        } else if (var18 > 192) {
            var22 >>= 0x2;
        } else if (var18 > 179) {
            var22 >>= 0x1;
        }
        return (var21 >> 2 << 10) + (var22 >> 5 << 7) + (var18 >> 1);
    }
}
