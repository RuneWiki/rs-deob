import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class582 extends class748 {

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    private int field8282 = 4;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
    private int field8286 = 4;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    public static int field8281;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
    public static int field8283;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    public static int field8285;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
    public static int field8287;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public static int field8288;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        ++field8283;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field8286 = arg2.method194((byte) 119);
            }
        } else {
            this.field8282 = arg2.method194((byte) 119);
        }
        if (arg1) {
            field8284 = -115;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class582() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)[[I")
    public final int[][] method445(int arg0, int arg1) {
        ++field8285;
        int[][] var3 = super.field10420.method930(arg1 + 29784, arg0);
        if (super.field10420.field1979) {
            int var4 = class424.field5889 / this.field8282;
            int var5 = class245.field3400 / this.field8286;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method4159(0, 0, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method4159(0, 0, class245.field3400 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class424.field5889; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class424.field5889 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        if (arg1 != 0) {
            this.field8286 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)Lpl;")
    public static final class617 method3453(int arg0) {
        ++field8288;
        try {
            return (class617) Class.forName("go").newInstance();
        } catch (Throwable var1) {
            return arg0 != -20890 ? null : new class398();
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field8287;
        int[] var3 = super.field10407.method3873(0, arg0);
        if (arg1 != 255) {
            this.field8282 = 31;
        }
        if (super.field10407.field9527) {
            int var4 = class424.field5889 / this.field8282;
            int var5 = class245.field3400 / this.field8286;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method4157(0, (byte) -85, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method4157(0, (byte) 32, class245.field3400 * var7 / var5);
            }
            for (int var8 = 0; var8 < class424.field5889; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class424.field5889 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }
}
