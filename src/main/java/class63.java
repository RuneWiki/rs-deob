import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class63 extends class86 {

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
    private int field966 = 4096;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
    private int field963 = 4096;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    private int field971 = 4096;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "I")
    private int field972 = 409;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "[I")
    private int[] field973 = new int[3];

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "Ll;")
    public static class66 field967 = new class66(5);

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "Lrn;")
    public static class18 field969;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)V", line = 6)
    public static final void method627(int arg0) {
        class66.field1019.method3(31);
        for (int var1 = 0; var1 < 32; var1++) {
            class120.field1866[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class22.field350[var2] = 0L;
        }
        field962++;
        class98.field1477 = 0;
        if (arg0 != -33) {
            method629((byte) 41);
        }
    }

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)Lho;", line = 34)
    public static final class215 method628(int arg0) {
        field965++;
        int var1 = class62.field957[0] * class358.field5694[0];
        byte[] var2 = class172.field2732[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class38.field582[class301.method2169(255, var2[var4])];
        }
        class215 var5;
        if (class240.field3737) {
            var5 = new class2(class280.field4332, class49.field776, class150.field2449[0], class89.field1262[0], class358.field5694[0], class62.field957[0], var3);
        } else {
            var5 = new class361(class280.field4332, class49.field776, class150.field2449[0], class89.field1262[0], class358.field5694[0], class62.field957[0], var3);
        }
        class29.method330(arg0);
        return var5;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZLug;)V", line = 62)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        field961++;
        if (arg1) {
            method629((byte) 35);
        }
        if (arg0 == 0) {
            this.field972 = arg2.method314((byte) 108);
        } else if (arg0 == 1) {
            this.field966 = arg2.method314((byte) 75);
        } else if (arg0 == 2) {
            this.field971 = arg2.method314((byte) 65);
        } else if (arg0 == 3) {
            this.field963 = arg2.method314((byte) 119);
        } else if (arg0 == 4) {
            int var5 = arg2.method265(!arg1);
            this.field973[0] = class301.method2169(16711680, var5) << 4;
            this.field973[2] = class301.method2169(var5, 255) >> 12;
            this.field973[1] = class301.method2169(65280, var5) >> 4;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V", line = 127)
    public static void method629(byte arg0) {
        if (arg0 > -12) {
            field967 = (class66) null;
        }
        field967 = null;
        field969 = null;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V", line = 141)
    public class63() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IB)[[I", line = 150)
    public final int[][] method156(int arg0, byte arg1) {
        field970++;
        int[][] var3 = this.field1227.method2025(false, arg0);
        if (this.field1227.field4277) {
            int[][] var4 = this.method782(arg0, 0, 1);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class93.field1424; var11++) {
                int var12 = var8[var11];
                int var13 = var12 - this.field973[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field972) {
                    var7[var11] = var12;
                    var10[var11] = var6[var11];
                    var9[var11] = var5[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field973[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 <= this.field972) {
                        int var16 = var5[var11];
                        int var17 = var16 - this.field973[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 <= this.field972) {
                            var7[var11] = this.field963 * var12 >> 12;
                            var10[var11] = this.field971 * var14 >> 12;
                            var9[var11] = this.field966 * var16 >> 12;
                        } else {
                            var7[var11] = var12;
                            var10[var11] = var14;
                            var9[var11] = var16;
                        }
                    } else {
                        var7[var11] = var12;
                        var10[var11] = var14;
                        var9[var11] = var5[var11];
                    }
                }
            }
        }
        return arg1 >= -126 ? (int[][]) ((int[][]) null) : var3;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIBI)V", line = 260)
    public static final void method630(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if ((arg0 - arg2) >= class43.field693 && class128.field2130 >= (arg0 + arg2) && arg1 - arg2 >= class328.field5042 && class284.field4385 >= arg1 + arg2) {
            class318.method2249(arg2, 50, arg1, arg0, arg4);
        } else {
            class209.method1552(0, arg0, arg2, arg4, arg1);
        }
        int var5 = -84 / ((arg3 - 31) / 45);
        field964++;
    }
}
