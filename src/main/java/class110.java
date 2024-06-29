import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class110 {

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    private int field1296 = 0;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "Lwh;")
    private class546 field1295;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Leba;")
    public static class550 field1294 = new class550(11, 12);

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "Lvu;")
    public static class204 field1298 = new class204();

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1300 = new Rectangle[100];

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "Ltt;")
    public static class338 field1301 = new class338(2, 4);

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "Leba;")
    public static class550 field1303 = new class550(47, 5);

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "[I")
    public static int[] field1305 = new int[1000];

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Ljca;")
    private class45 field1289;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V", line = 3)
    public static void method595(boolean arg0) {
        field1301 = null;
        field1303 = null;
        if (!arg0) {
            field1305 = null;
            field1294 = null;
            field1298 = null;
            field1300 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)Ljca;", line = 22)
    public final class45 method596(int arg0) {
        int var2 = 118 / ((arg0 + 22) / 56);
        field1291++;
        this.field1296 = 0;
        return this.method601((byte) 39);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIFF[FIIIIIFI)V", line = 36)
    public static final void method597(int arg0, int arg1, int arg2, float arg3, float arg4, float[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, float arg11, int arg12) {
        int var13 = arg9 - arg0;
        int var14 = arg1 - arg10;
        field1293++;
        int var15 = arg8 - arg6;
        float var16 = arg5[2] * (float) var14 + arg5[1] * (float) var15 + arg5[0] * (float) var13;
        float var17 = arg5[5] * (float) var14 + arg5[3] * (float) var13 + arg5[4] * (float) var15;
        float var18 = arg5[8] * (float) var14 + arg5[6] * (float) var13 + arg5[7] * (float) var15;
        if (arg2 != 12) {
            field1302 = -10;
        }
        float var19;
        float var20;
        if (arg7 == 0) {
            var19 = arg11 + 0.5F - var18;
            var20 = arg3 + var16 + 0.5F;
        } else if (arg7 == 1) {
            var19 = arg11 + var18 + 0.5F;
            var20 = arg3 + var16 + 0.5F;
        } else if (arg7 == 2) {
            var20 = arg3 + 0.5F - var16;
            var19 = arg4 + 0.5F - var17;
        } else if (arg7 == 3) {
            var19 = arg4 + 0.5F - var17;
            var20 = arg3 + var16 + 0.5F;
        } else if (arg7 == 4) {
            var19 = arg4 + 0.5F - var17;
            var20 = arg11 + var18 + 0.5F;
        } else {
            var20 = arg11 + 0.5F - var18;
            var19 = arg4 + 0.5F - var17;
        }
        if (arg12 == 1) {
            float var22 = var20;
            var20 = -var19;
            var19 = var22;
        } else if (arg12 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg12 == 3) {
            float var21 = var20;
            var20 = var19;
            var19 = -var21;
        }
        class294.field3904 = var19;
        class131.field1807 = var20;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;IIZ)I", line = 123)
    public static final int method598(String arg0, int arg1, int arg2, boolean arg3) {
        field1304++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg1) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if ((var10 / arg1) != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        } else if (arg2 >= -112) {
            return -98;
        } else {
            return var6;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLio;)Ljava/lang/String;", line = 205)
    public static final String method599(byte arg0, class157 arg1) {
        if (arg0 != -88) {
            method598(null, -59, -83, false);
        }
        field1297++;
        return class561.method3116(32767, arg0 + 88, arg1);
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V", line = 246)
    public class110() {
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lwh;)V", line = 248)
    public class110(class546 arg0) {
        this.field1295 = arg0;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lwv;III)V", line = 234)
    public static final void method600(class423 arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 5) {
            field1299++;
            class358.field4762 = arg0;
            class676.field9608 = arg2;
            class120.field1537 = arg3;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)Ljca;", line = 256)
    public final class45 method601(byte arg0) {
        if (arg0 != 39) {
            method598(null, 9, 69, false);
        }
        field1292++;
        if (this.field1296 > 0 && this.field1295.field7460[this.field1296 - 1] != this.field1289) {
            class45 var2 = this.field1289;
            this.field1289 = var2.field548;
            return var2;
        }
        while (this.field1296 < this.field1295.field7468) {
            class45 var3 = this.field1295.field7460[this.field1296++].field548;
            if (this.field1295.field7460[this.field1296 - 1] != var3) {
                this.field1289 = var3.field548;
                return var3;
            }
        }
        return null;
    }
}
