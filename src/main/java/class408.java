import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class408 extends class263 {

    @OriginalMember(owner = "client!jt", name = "K", descriptor = "Z")
    public static boolean field6157 = false;

    @OriginalMember(owner = "client!jt", name = "E", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!jt", name = "F", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!jt", name = "G", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!jt", name = "H", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!jt", name = "I", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!jt", name = "J", descriptor = "[Leb;")
    private class60[] field6156;

    static {
        new class347("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V", line = 4)
    public class408() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "([[IB)V", line = 13)
    private final void method2451(int[][] arg0, byte arg1) {
        ++field6153;
        if (arg1 == -81) {
            int var3 = class367.field5597;
            int var4 = class372.field5635;
            class364.method2177(arg1 + 7, arg0);
            class158.method1123(0, class142.field2133, 0, (byte) -13, class83.field1326);
            if (this.field6156 != null) {
                for (int var5 = 0; this.field6156.length > var5; ++var5) {
                    class60 var6 = this.field6156[var5];
                    int var7 = var6.field822;
                    int var8 = var6.field820;
                    if (~var7 > -1) {
                        if (~var8 <= -1) {
                            var6.method432(25878, var3, var4);
                        }
                    } else if (~var8 <= -1) {
                        var6.method429(arg1 ^ 152, var4, var3);
                    } else {
                        var6.method431(var4, -76, var3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IZLgk;)V", line = 64)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        ++field6154;
        if (!arg1) {
            this.method2451((int[][]) null, (byte) 107);
        }
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field3927 = ~arg2.method2765(57) == -2;
                return;
            }
        } else {
            this.field6156 = new class60[arg2.method2765(77)];
            for (int var4 = 0; ~var4 > ~this.field6156.length; ++var4) {
                int var5 = arg2.method2765(113);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field6156[var4] = class506.method2988(1599844320, arg2);
                            }
                        } else {
                            this.field6156[var4] = class389.method2334(arg2, -26956);
                        }
                    } else {
                        this.field6156[var4] = class3.method12(arg2, 0);
                    }
                } else {
                    this.field6156[var4] = class420.method2502((byte) 0, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IB)[I", line = 141)
    public final int[] method33(int arg0, byte arg1) {
        ++field6155;
        if (arg1 <= 40) {
            return null;
        } else {
            int[] var3 = super.field3917.method41(arg0, 1);
            if (super.field3917.field91) {
                this.method2451(super.field3917.method42(0), (byte) -81);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(IB)[[I", line = 164)
    public final int[][] method34(int arg0, byte arg1) {
        ++field6151;
        int[][] var3 = super.field3912.method2649(arg0, false);
        if (super.field3912.field6681) {
            int var4 = class367.field5597;
            int var5 = class372.field5635;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field3912.method2646(0);
            this.method2451(var6, (byte) -81);
            for (int var8 = 0; var8 < class372.field5635; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class367.field5597; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class140.method1023(var15 << 4, 4080);
                    var12[var14] = class140.method1023(65280, var15) >> 4;
                    var11[var14] = class140.method1023(16711680, var15) >> 12;
                }
            }
        }
        return arg1 > -45 ? null : var3;
    }
}
