import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class215 extends class667 {

    @OriginalMember(owner = "client!cha", name = "H", descriptor = "I")
    private int field3081 = 4;

    @OriginalMember(owner = "client!cha", name = "G", descriptor = "I")
    private int field3080 = 4;

    @OriginalMember(owner = "client!cha", name = "K", descriptor = "Z")
    public static boolean field3084 = false;

    @OriginalMember(owner = "client!cha", name = "B", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!cha", name = "C", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!cha", name = "D", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!cha", name = "E", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!cha", name = "F", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!cha", name = "I", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!cha", name = "J", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!cha", name = "<init>", descriptor = "()V")
    public class215() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(BI)[I")
    public final int[] method117(byte arg0, int arg1) {
        ++field3075;
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (arg0 >= -87) {
            return null;
        } else {
            if (super.field9355.field3728) {
                int var4 = class77.field1455 / this.field3080;
                int var5 = class694.field9758 / this.field3081;
                int[] var7;
                if (~var5 < -1) {
                    int var6 = arg1 % var5;
                    var7 = this.method3744(class694.field9758 * var6 / var5, (byte) 119, 0);
                } else {
                    var7 = this.method3744(0, (byte) 119, 0);
                }
                for (int var8 = 0; class77.field1455 > var8; ++var8) {
                    if (~var4 < -1) {
                        int var9 = var8 % var4;
                        var3[var8] = var7[class77.field1455 * var9 / var4];
                    } else {
                        var3[var8] = var7[0];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(Lud;II)V")
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field3081 = arg0.method273(255);
            }
        } else {
            this.field3080 = arg0.method273(255);
        }
        ++field3078;
        if (arg1 != 3) {
            method1498(-56, false);
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(IZ)V")
    public static final void method1498(int arg0, boolean arg1) {
        ++field3083;
        int var2 = 50 % ((-3 - arg0) / 39);
        if (class718.field10065.length() != 0) {
            class569.method3326("--> " + class718.field10065, (byte) -42);
            class217.method1512(arg1, false, -19797, class718.field10065);
            class129.field1942 = 0;
            class718.field10065 = "";
            class42.field643 = 0;
        }
    }

    @OriginalMember(owner = "client!cha", name = "c", descriptor = "(B)Lvr;")
    public static final class135 method1499(byte arg0) {
        ++field3082;
        if (arg0 != 64) {
            method1499((byte) 79);
        }
        return ~class436.field6093 == -1 ? new class135() : class312.field4406[--class436.field6093];
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method777(boolean arg0, int arg1) {
        if (arg0) {
            return null;
        } else {
            ++field3076;
            int[][] var3 = super.field9357.method2314((byte) 41, arg1);
            if (super.field9357.field5178) {
                int var4 = class77.field1455 / this.field3080;
                int var5 = class694.field9758 / this.field3081;
                int[][] var6;
                if (var5 <= 0) {
                    var6 = this.method3748(0, 0, 0);
                } else {
                    int var7 = arg1 % var5;
                    var6 = this.method3748(class694.field9758 * var7 / var5, 0, 0);
                }
                int[] var8 = var6[0];
                int[] var9 = var6[1];
                int[] var10 = var6[2];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; var14 < class77.field1455; ++var14) {
                    int var16;
                    if (~var4 < -1) {
                        int var15 = var14 % var4;
                        var16 = class77.field1455 * var15 / var4;
                    } else {
                        var16 = 0;
                    }
                    var11[var14] = var8[var16];
                    var12[var14] = var9[var16];
                    var13[var14] = var10[var16];
                }
            }
            return var3;
        }
    }
}
