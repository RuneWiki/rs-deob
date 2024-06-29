import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class758 extends class334 {

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    private int field10507 = 4;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    private int field10506 = 4;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "Z")
    public static boolean field10503 = false;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field10502;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public static int field10504;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public static int field10505;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field10508;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public static int field10509;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)[[I", line = 3)
    public final int[][] method283(boolean arg0, int arg1) {
        ++field10502;
        int[][] var3 = super.field4734.method275(26422, arg1);
        if (!arg0) {
            this.field10506 = -12;
        }
        if (super.field4734.field425) {
            int var4 = class439.field6099 / this.field10506;
            int var5 = class327.field4668 / this.field10507;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method2053(1, 0, class327.field4668 * var6 / var5);
            } else {
                var7 = this.method2053(1, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class439.field6099; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class439.field6099 * var15 / var4;
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

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 71)
    public class758() {
        super(1, false);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)V", line = 74)
    public static final void method4192(int arg0, int arg1) {
        class494 var2 = class729.field10165;
        synchronized (class729.field10165) {
            if (arg0 >= -110) {
                return;
            }
            class729.field10165.method2888(arg1, 124);
        }
        ++field10505;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZLol;)V", line = 88)
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (arg1) {
            this.field10506 = -52;
        }
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field10507 = arg2.method2557(14929);
            }
        } else {
            this.field10506 = arg2.method2557(14929);
        }
        ++field10508;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[I", line = 131)
    public final int[] method28(int arg0, int arg1) {
        ++field10504;
        if (arg1 != -22563988) {
            this.field10506 = -117;
        }
        int[] var3 = super.field4743.method1027((byte) -79, arg0);
        if (super.field4743.field1993) {
            int var4 = class439.field6099 / this.field10506;
            int var5 = class327.field4668 / this.field10507;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method2052(0, 0, class327.field4668 * var6 / var5);
            } else {
                var7 = this.method2052(0, 0, 0);
            }
            for (int var8 = 0; class439.field6099 > var8; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class439.field6099 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }
}
