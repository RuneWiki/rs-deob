import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 {

    @OriginalMember(owner = "client!f", name = "m", descriptor = "[I")
    private int[] field630;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "[I")
    private int[] field623;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Lnf;")
    private class157 field618;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Lnf;")
    private class157 field620;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "[Lnf;")
    private class157[] field626;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Lcc;")
    public static class209 field627 = class95.method669(102, "blinken1:");

    @OriginalMember(owner = "client!f", name = "l", descriptor = "[I")
    public static int[] field629 = new int[5];

    @OriginalMember(owner = "client!f", name = "d", descriptor = "[I")
    public static int[] field621 = new int[32];

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Lcc;")
    public static class209 field622 = class95.method669(109, "Hierhin gehen");

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method272(int arg0) {
        field629 = null;
        field622 = null;
        if (arg0 != -5237) {
            field621 = null;
        }
        field627 = null;
        field621 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lsj;Lra;B)Z")
    public final boolean method273(class49 arg0, class232 arg1, byte arg2) {
        if (arg2 >= -28) {
            this.method274(-0.011334543801963342D, false, 127, 106, (class49) null, true, (byte) 79, (class232) null);
        }
        field625++;
        if (class181.field3278 <= 0) {
            for (int var4 = 0; var4 < this.field630.length; var4++) {
                if (!arg0.method351((byte) -10, this.field630[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field630.length; var5++) {
                if (!arg0.method371(class181.field3278, 20103, this.field630[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field623.length; var6++) {
            if (!arg1.method1618(76, this.field623[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(DZIILsj;ZBLra;)[I")
    public final int[] method274(double arg0, boolean arg1, int arg2, int arg3, class49 arg4, boolean arg5, byte arg6, class232 arg7) {
        class109.method792(arg0, -42);
        int[] var10 = new int[arg2 * arg3];
        class229.field4164 = arg4;
        field624++;
        class243.field4397 = arg7;
        class47.method342(arg3, arg2, 0);
        for (int var11 = 0; var11 < this.field626.length; var11++) {
            this.field626[var11].method1098(arg3, -256, arg2);
        }
        int var12 = 29 / ((arg6 - 16) / 62);
        byte var13;
        int var14;
        int var15;
        if (arg5) {
            var13 = -1;
            var14 = arg2 - 1;
            var15 = -1;
        } else {
            var13 = 1;
            var14 = 0;
            var15 = arg2;
        }
        int var16 = 0;
        for (int var17 = 0; var17 < arg3; var17++) {
            if (arg1) {
                var16 = var17;
            }
            int[] var20;
            int[] var21;
            int[] var22;
            if (this.field618.field2877) {
                int[] var19 = this.field618.method4((byte) -98, var17);
                var20 = var19;
                var21 = var19;
                var22 = var19;
            } else {
                int[][] var23 = this.field618.method250(1, var17);
                var20 = var23[0];
                var21 = var23[1];
                var22 = var23[2];
            }
            for (int var24 = var14; var24 != var15; var24 += var13) {
                int var25 = var20[var24] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                int var26 = var21[var24] >> 4;
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = var22[var24] >> 4;
                int var28 = class205.field3661[var26];
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var29 = class205.field3661[var27];
                int var30 = class205.field3661[var25];
                var10[var16++] = (var30 << 16) + (var28 << 8) + var29;
                if (arg1) {
                    var16 += arg2 - 1;
                }
            }
        }
        for (int var18 = 0; var18 < this.field626.length; var18++) {
            this.field626[var18].method807((byte) -95);
        }
        return var10;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
    public static final void method275(byte arg0) {
        field628++;
        int var1 = -61 / ((-arg0 - 59) / 61);
        for (class111 var2 = (class111) class88.field1744.method1119(20896); var2 != null; var2 = (class111) class88.field1744.method1120(69)) {
            if (var2.field2238 == -1) {
                var2.field2239 = 0;
                class176.method1218(var2, -1);
            } else {
                var2.method269(-214950896);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
    public class36() {
        this.field630 = new int[0];
        this.field623 = new int[0];
        this.field618 = new class116();
        this.field618.field2870 = 1;
        this.field620 = new class116();
        this.field620.field2870 = 1;
        this.field626 = new class157[] { this.field618, this.field620 };
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Ltf;)V")
    public class36(class106 arg0) {
        int var2 = 0;
        int var3 = arg0.method774((byte) 116);
        this.field626 = new class157[var3];
        int var4 = 0;
        int[][] var5 = new int[var3][];
        for (int var6 = 0; var6 < var3; var6++) {
            class157 var16 = class257.method1774(110, arg0);
            if (var16.method1095(-1) >= 0) {
                var2++;
            }
            if (var16.method808(-127) >= 0) {
                var4++;
            }
            int var17 = var16.field2874.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method774((byte) 85);
            }
            this.field626[var6] = var16;
        }
        this.field623 = new int[var4];
        this.field630 = new int[var2];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var3; var9++) {
            class157 var11 = this.field626[var9];
            int var12 = var11.field2874.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field2874[var13] = this.field626[var5[var9][var13]];
            }
            int var14 = var11.method1095(-1);
            int var15 = var11.method808(-127);
            if (var14 > 0) {
                this.field630[var8++] = var14;
            }
            if (var15 > 0) {
                this.field623[var7++] = var15;
            }
            var5[var9] = null;
        }
        Object var10 = null;
        this.field618 = this.field626[arg0.method774((byte) 87)];
        this.field620 = this.field626[arg0.method774((byte) 92)];
    }
}
