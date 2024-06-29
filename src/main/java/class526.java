import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class526 extends class466 {

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
    private int field7387 = 4096;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "Z")
    private boolean field7388 = true;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "Lit;")
    public static class555 field7389 = new class555();

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "Lst;")
    public static class366 field7393 = new class366();

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "Lcba;")
    public static class471 field7396 = new class471(78, 2);

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "F")
    public static float field7394;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "F")
    public static float field7395;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg1 != -5062) {
            method3030(36, 27);
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field7388 = arg0.method110((byte) 123) == 1;
            }
        } else {
            this.field7387 = arg0.method93((byte) 94);
        }
        ++field7392;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)V")
    public static void method3029(byte arg0) {
        if (arg0 >= -79) {
            method3029((byte) -117);
        }
        field7389 = null;
        field7396 = null;
        field7393 = null;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)Z")
    public static final boolean method3030(int arg0, int arg1) {
        if (arg1 != 1) {
            return false;
        } else {
            ++field7386;
            return ~arg0 == -26 || arg0 == 51 || arg0 == 1009 || ~arg0 == -4 || arg0 == 47;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method33(int arg0, boolean arg1) {
        ++field7391;
        int[][] var3 = super.field6569.method828((byte) 127, arg0);
        if (arg1) {
            this.field7387 = 121;
        }
        if (super.field6569.field1934) {
            int[] var4 = this.method2721(0, arg0 + -1 & class105.field1581, 2);
            int[] var5 = this.method2721(0, arg0, 2);
            int[] var6 = this.method2721(0, class105.field1581 & arg0 + 1, 2);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class312.field4207; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field7387;
                int var12 = (var5[class340.field4582 & var10 - -1] - var5[class340.field4582 & var10 + -1]) * this.field7387;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = var11 / var17;
                    var20 = 16777216 / var17;
                    var18 = var12 / var17;
                }
                if (this.field7388) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                }
                var7[var10] = var18;
                var8[var10] = var19;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class526() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIII)Z")
    public static final boolean method3031(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7390;
        for (int var6 = arg4; ~var6 >= ~arg2; ++var6) {
            for (int var7 = arg5; ~arg1 <= ~var7; ++var7) {
                if (~class280.field3890[var6][var7] == ~arg3 && ~class264.field3691[var6][var7] >= -2) {
                    return true;
                }
            }
        }
        if (arg0 != -2) {
            return false;
        } else {
            return false;
        }
    }
}
