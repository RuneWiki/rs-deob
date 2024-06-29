import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class222 {

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "[I")
    private int[] field3732;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "[I")
    private int[] field3738;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Lt;")
    private class175 field3729;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lt;")
    private class175 field3728;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "[Lt;")
    private class175[] field3735;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field3734 = 500;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Lij;")
    public static class50 field3731 = class78.method578(127, "http:)4)4");

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Lpe;")
    public static class100 field3733 = new class100(64);

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Z")
    public static boolean field3743 = false;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field3740 = 0;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "Lij;")
    private static class50 field3742 = class78.method578(121, "Connection lost)3");

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Lij;")
    public static class50 field3741 = field3742;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIII)V")
    public static final void method1519(int arg0, int arg1, int arg2, int arg3) {
        class65 var4 = class59.field1089[arg0][arg1][arg2];
        if (var4 != null) {
            class59.field1089[arg0][arg1][arg2].field1243 = arg3;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method1520(int arg0) {
        if (arg0 != 1) {
            field3731 = null;
        }
        field3742 = null;
        field3741 = null;
        field3731 = null;
        field3733 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lda;ILmb;)Z")
    public final boolean method1521(class22 arg0, int arg1, class72 arg2) {
        field3737++;
        for (int var4 = 0; var4 < this.field3732.length; var4++) {
            if (!arg0.method188((byte) 105, this.field3732[var4])) {
                return false;
            }
        }
        int var5 = 28 / ((arg1 + 35) / 60);
        for (int var6 = 0; var6 < this.field3738.length; var6++) {
            if (!arg2.method546(this.field3738[var6], -48)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)I")
    public static final int method1522(int arg0, int arg1) {
        if (arg1 != 1981643761) {
            method1520(17);
        }
        field3736++;
        return (arg0 & 0xEA83F) >> 17;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(DZIILda;BLmb;Z)[I")
    public final int[] method1523(double arg0, boolean arg1, int arg2, int arg3, class22 arg4, byte arg5, class72 arg6, boolean arg7) {
        class205.method1384(arg0, 66);
        class154.field2689 = arg6;
        field3739++;
        int[] var10 = new int[arg2 * arg3];
        class49.field881 = arg4;
        class115.method827((byte) -116, arg2, arg3);
        for (int var11 = 0; var11 < this.field3735.length; var11++) {
            this.field3735[var11].method1207(arg3, arg2, (byte) -49);
        }
        byte var12;
        int var13;
        int var14;
        if (arg1) {
            var12 = -1;
            var13 = -1;
            var14 = arg2 - 1;
        } else {
            var13 = arg2;
            var12 = 1;
            var14 = 0;
        }
        int var15 = 0;
        if (arg5 >= -78) {
            return null;
        }
        for (int var16 = 0; var16 < arg3; var16++) {
            if (arg7) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field3729.field2925) {
                int[] var22 = this.field3729.method29(var16, -27746);
                var20 = var22;
                var21 = var22;
                var19 = var22;
            } else {
                int[][] var18 = this.field3729.method32(var16, -20740);
                var19 = var18[1];
                var20 = var18[2];
                var21 = var18[0];
            }
            for (int var23 = var14; var23 != var13; var23 += var12) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                int var26 = class15.field347[var24];
                int var27 = var20[var23] >> 4;
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var28 = class15.field347[var27];
                if (var25 < 0) {
                    var25 = 0;
                }
                int var29 = class15.field347[var25];
                var10[var15++] = (var26 << 8) + (var29 << 16) + var28;
                if (arg7) {
                    var15 += arg2 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field3735.length; var17++) {
            this.field3735[var17].method803((byte) 126);
        }
        return var10;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class222() {
        this.field3732 = new int[0];
        this.field3738 = new int[0];
        this.field3729 = new class24();
        this.field3729.field2935 = 1;
        this.field3728 = new class24();
        this.field3728.field2935 = 1;
        this.field3735 = new class175[] { this.field3729, this.field3728 };
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lwd;)V")
    public class222(class217 arg0) {
        int var2 = arg0.method1487(255);
        this.field3735 = new class175[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class175 var16 = class132.method932(arg0, (byte) 79);
            if (var16.method804((byte) 99) >= 0) {
                var3++;
            }
            if (var16.method1209(-87) >= 0) {
                var4++;
            }
            int var17 = var16.field2938.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1487(255);
            }
            this.field3735[var6] = var16;
        }
        this.field3738 = new int[var4];
        this.field3732 = new int[var3];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class175 var11 = this.field3735[var9];
            int var12 = var11.field2938.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field2938[var13] = this.field3735[var5[var9][var13]];
            }
            int var14 = var11.method804((byte) 20);
            int var15 = var11.method1209(-104);
            if (var14 > 0) {
                this.field3732[var7++] = var14;
            }
            if (var15 > 0) {
                this.field3738[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field3729 = this.field3735[arg0.method1487(255)];
        this.field3728 = this.field3735[arg0.method1487(255)];
        Object var10 = null;
    }
}
