import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class361 extends class263 {

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
    private int field5526 = 2048;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
    private int field5528 = 1024;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
    private int field5529 = 3072;

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(B)V")
    public final void method748(byte arg0) {
        ++field5525;
        if (arg0 == 110) {
            this.field5526 = this.field5529 - this.field5528;
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class361() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZIZIILjava/lang/String;JIZZLjava/lang/String;I)V")
    public static final void method2158(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, String arg5, long arg6, int arg7, boolean arg8, boolean arg9, String arg10, int arg11) {
        ++field5527;
        if (arg2) {
            class394.method2366(arg1 ^ 13772);
            if (class269.field4001.equals("")) {
                class151.field2288 = 39;
                return;
            }
        }
        int[] var13 = new int[4];
        for (int var14 = 0; var14 < 3; ++var14) {
            var13[var14] = (int) (Math.random() * 9.9999999E7D);
        }
        class468 var15 = new class468(128);
        var15.method2754(10, arg1 ^ 5575);
        var15.method2777((byte) 74, (!arg9 ? 0 : 4) | (arg8 ? 1 : 0) | (!arg0 ? 0 : 2));
        var15.method2718(arg6, arg1 ^ -105);
        var15.method2717(var13[0], 496598568);
        var15.method2731(arg5, (byte) -105);
        var15.method2717(var13[1], arg1 ^ 496598569);
        var15.method2777((byte) 74, class86.field1357);
        var15.method2754(arg11, arg1 + 5573);
        var15.method2754(arg7, 5574);
        var15.method2717(var13[2], 496598568);
        var15.method2777((byte) 74, arg4);
        var15.method2777((byte) 74, arg3);
        var15.method2717(var13[3], arg1 + 496598567);
        var15.method2720(class107.field1596, 0, class53.field690);
        class468 var16 = new class468(366);
        var16.method2731(arg10, (byte) -94);
        if (arg2) {
            var16.method2718(class123.method915(class269.field4001, (byte) 46), arg1 ^ -47);
            try {
                var16.method2718(Long.parseLong(class489.field7291), -125);
            } catch (Exception var19) {
                class151.field2288 = 39;
                return;
            }
        }
        int var17 = -(7 & var16.field6830) + 8;
        for (int var18 = 0; var17 > var18; ++var18) {
            var16.method2754((int) (255.0D * Math.random()), 5574);
        }
        var16.method2766((byte) 7, var13);
        class43.field559.field6830 = 0;
        class43.field559.method2754(arg2 ? class445.field6560.field1866 : class445.field6557.field1866, 5574);
        class43.field559.method2777((byte) 74, var15.field6830 + var16.field6830 + 28);
        class43.field559.method2777((byte) 74, 595);
        class43.field559.method2754(class30.field430, 5574);
        class43.field559.method2754(class251.field3433.field3910, 5574);
        class288.method1779(class43.field559, (byte) 56);
        class43.field559.method2736(-1, 0, var15.field6830, var15.field6868);
        class43.field559.method2736(-1, 0, var16.field6830, var16.field6868);
        class151.field2288 = -3;
        class488.field7281 = 0;
        class510.field7495 = 0;
        class409.field6167 = arg1;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZLgk;)V")
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        ++field5530;
        if (arg1) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        super.field3927 = arg2.method2765(71) == 1;
                    }
                } else {
                    this.field5529 = arg2.method2727((byte) 43);
                }
            } else {
                this.field5528 = arg2.method2727((byte) 43);
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(IB)[[I")
    public final int[][] method34(int arg0, byte arg1) {
        ++field5531;
        if (arg1 > -45) {
            this.field5529 = -103;
        }
        int[][] var3 = super.field3912.method2649(arg0, false);
        if (super.field3912.field6681) {
            int[][] var4 = this.method1646(0, 2, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class367.field5597; ++var11) {
                var8[var11] = (var5[var11] * this.field5526 >> 12) + this.field5528;
                var9[var11] = this.field5528 - -(var6[var11] * this.field5526 >> 12);
                var10[var11] = (var7[var11] * this.field5526 >> 12) + this.field5528;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)[I")
    public final int[] method33(int arg0, byte arg1) {
        if (arg1 < 40) {
            return null;
        } else {
            ++field5524;
            int[] var3 = super.field3917.method41(arg0, 1);
            if (super.field3917.field91) {
                int[] var4 = this.method1644(0, 0, arg0);
                for (int var5 = 0; class367.field5597 > var5; ++var5) {
                    var3[var5] = (var4[var5] * this.field5526 >> 12) + this.field5528;
                }
            }
            return var3;
        }
    }

    static {
        new class347("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
    }
}
