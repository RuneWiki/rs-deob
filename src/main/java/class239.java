import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class239 {

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "[I")
    private int[] field4325;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "[I")
    private int[] field4327;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "Lsd;")
    private class23 field4313;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Lsd;")
    private class23 field4312;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "[Lsd;")
    private class23[] field4315;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "[I")
    public static int[] field4318 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Llc;")
    public static class143 field4319 = class66.method374("<br>", -1);

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field4321 = 100;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "Lrb;")
    public static class193 field4326;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "[I")
    public static int[] field4316;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "[I")
    public static int[] field4324;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
    public static final void method1601(boolean arg0) {
        if (arg0) {
            field4324 = null;
        }
        field4323++;
        class50.field986++;
        class285.field5010.method799(103, 71);
        class285.field5010.method1276(844519173, class69.method399(-127));
        class285.field5010.method1278(class10.field222, (byte) 47);
        class285.field5010.method1278(class269.field4820, (byte) 63);
        class285.field5010.method1276(844519173, class127.field2244);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public static void method1602(byte arg0) {
        if (arg0 >= -58) {
            return;
        }
        field4316 = null;
        field4324 = null;
        field4326 = null;
        field4319 = null;
        field4318 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZ)I")
    public static final int method1603(int arg0, boolean arg1) {
        if (arg1) {
            field4320++;
            return (arg0 & 0x3F8B4) >> 11;
        } else {
            return -114;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lgf;ILg;)Z")
    public final boolean method1604(class7 arg0, int arg1, class138 arg2) {
        if (arg1 != 20948) {
            return true;
        }
        field4314++;
        if (class179.field3206 <= 0) {
            for (int var4 = 0; var4 < this.field4327.length; var4++) {
                if (!arg0.method40(this.field4327[var4], 99)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4327.length; var5++) {
                if (!arg0.method53((byte) 85, class179.field3206, this.field4327[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field4325.length; var6++) {
            if (!arg2.method384(1, this.field4325[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZBLgf;Lg;DZII)[I")
    public final int[] method1605(boolean arg0, byte arg1, class7 arg2, class138 arg3, double arg4, boolean arg5, int arg6, int arg7) {
        int[] var10 = new int[arg6 * arg7];
        field4317++;
        class177.method1167(arg4, 255);
        class117.field2089 = arg2;
        class228.field4122 = arg3;
        class204.method1397(arg7, (byte) -57, arg6);
        for (int var11 = 0; var11 < this.field4315.length; var11++) {
            this.field4315[var11].method160((byte) -128, arg7, arg6);
        }
        byte var12;
        int var13;
        int var14;
        if (arg0) {
            var12 = -1;
            var13 = arg7 - 1;
            var14 = -1;
        } else {
            var13 = 0;
            var14 = arg7;
            var12 = 1;
        }
        int var15 = 0;
        if (arg1 != 79) {
            field4316 = null;
        }
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg5) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4313.field373) {
                int[] var22 = this.field4313.method86(arg1 ^ 0xFFFFFFE6, var16);
                var19 = var22;
                var21 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field4313.method131(var16, 1);
                var19 = var18[2];
                var20 = var18[0];
                var21 = var18[1];
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
                int var24 = var20[var23] >> 4;
                int var25 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                int var26 = var21[var23] >> 4;
                int var27 = class282.field4959[var24];
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class282.field4959[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class282.field4959[var26];
                var10[var15++] = (var27 << 16) + (var29 << 8) + var28;
                if (arg5) {
                    var15 += arg7 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field4315.length; var17++) {
            this.field4315[var17].method126((byte) 109);
        }
        return var10;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
    public static final Object method1606(int arg0, byte[] arg1, boolean arg2) {
        field4322++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > arg0 && !class55.field1076) {
            try {
                class276 var3 = (class276) Class.forName("pa").getDeclaredConstructor().newInstance();
                var3.method6(true, arg1);
                return var3;
            } catch (Throwable var4) {
                class55.field1076 = true;
            }
        }
        return arg2 ? class66.method377(arg1, false) : arg1;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class239() {
        this.field4325 = new int[0];
        this.field4327 = new int[0];
        this.field4313 = new class201();
        this.field4313.field371 = 1;
        this.field4312 = new class201();
        this.field4312.field371 = 1;
        this.field4315 = new class23[] { this.field4313, this.field4312 };
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lh;)V")
    public class239(class190 arg0) {
        int var2 = 0;
        int var3 = arg0.method1265(113);
        this.field4315 = new class23[var3];
        int var4 = 0;
        int[][] var5 = new int[var3][];
        for (int var6 = 0; var6 < var3; var6++) {
            class23 var16 = class31.method207(arg0, 72);
            if (var16.method156((byte) 84) >= 0) {
                var2++;
            }
            if (var16.method129(19275) >= 0) {
                var4++;
            }
            int var17 = var16.field376.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1265(115);
            }
            this.field4315[var6] = var16;
        }
        this.field4325 = new int[var4];
        int var7 = 0;
        this.field4327 = new int[var2];
        int var8 = 0;
        for (int var9 = 0; var9 < var3; var9++) {
            class23 var11 = this.field4315[var9];
            int var12 = var11.field376.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field376[var13] = this.field4315[var5[var9][var13]];
            }
            int var14 = var11.method156((byte) 84);
            int var15 = var11.method129(19275);
            if (var14 > 0) {
                this.field4327[var8++] = var14;
            }
            if (var15 > 0) {
                this.field4325[var7++] = var15;
            }
            var5[var9] = null;
        }
        this.field4313 = this.field4315[arg0.method1265(113)];
        Object var10 = null;
        this.field4312 = this.field4315[arg0.method1265(115)];
    }
}
