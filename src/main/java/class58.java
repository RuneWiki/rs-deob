import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class58 extends class93 {

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "[S")
    public static short[] field1194 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "Lkh;")
    public static class117 field1193 = class224.method1450((byte) 121, "Fertigkeit)2");

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "Lkh;")
    private static class117 field1197 = class224.method1450((byte) -103, "Loaded textures");

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "Lkh;")
    public static class117 field1200 = field1197;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "Lkh;")
    public static class117 field1201 = class224.method1450((byte) -92, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "Lkh;")
    public static class117 field1202 = class224.method1450((byte) 116, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1196;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "[[I")
    public static int[][] field1199;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIILdd;IJZ)Z")
    public static final boolean method438(int arg0, int arg1, int arg2, int arg3, int arg4, class38 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class172.method1203(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
    public static void method439(byte arg0) {
        field1200 = null;
        field1201 = null;
        field1193 = null;
        field1194 = null;
        int var1 = 47 % ((-arg0 - 76) / 50);
        field1202 = null;
        field1199 = null;
        field1197 = null;
        field1196 = null;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(BI)Lmi;")
    public static final class140 method440(byte arg0, int arg1) {
        field1198++;
        class140 var2 = (class140) class213.field3868.method506(1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class26.field662.method104(-109, class119.method838(arg1, (byte) 41), class51.method392(arg1, (byte) -15));
        int var4 = -13 / ((32 - arg0) / 53);
        class140 var5 = new class140();
        if (var3 != null) {
            var5.method957(true, new class145(var3));
        }
        class213.field3868.method497((long) arg1, var5, -99);
        return var5;
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V")
    public static final void method441(int arg0) {
        field1195++;
        if (arg0 >= -114) {
            method438(24, -97, -95, -34, -74, null, -44, 108L, true);
        }
        class49.field1028.method503(10);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)I")
    public static final int method442(int arg0, int arg1) {
        field1192++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var6 < var2) {
            var8 = var6;
        }
        double var10 = 0.0D;
        double var12 = var2;
        if (var8 > var4) {
            var8 = var4;
        }
        if (var6 > var2) {
            var12 = var6;
        }
        double var14 = 0.0D;
        int var16 = -58 / ((-arg0 - 45) / 46);
        if (var4 > var12) {
            var12 = var4;
        }
        double var17 = (var8 + var12) / 2.0D;
        if (var8 != var12) {
            if (var17 < 0.5D) {
                var14 = (var12 - var8) / (var8 + var12);
            }
            if (var17 >= 0.5D) {
                var14 = (var12 - var8) / (2.0D - var12 - var8);
            }
            if (var2 == var12) {
                var10 = (var6 - var4) / (-var8 + var12);
            } else if (var6 == var12) {
                var10 = (var4 - var2) / (-var8 + var12) + 2.0D;
            } else if (var4 == var12) {
                var10 = (var2 - var6) / (-var8 + var12) + 4.0D;
            }
        }
        int var19 = (int) (var14 * 256.0D);
        double var20 = var10 / 6.0D;
        int var22 = (int) (var20 * 256.0D);
        int var23 = (int) (var17 * 256.0D);
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var23 > 243) {
            var19 >>= 0x4;
        } else if (var23 > 217) {
            var19 >>= 0x3;
        } else if (var23 > 192) {
            var19 >>= 0x2;
        } else if (var23 > 179) {
            var19 >>= 0x1;
        }
        return (var19 >> 5 << 7) + (var22 >> 2 << 10) + (var23 >> 1);
    }
}
