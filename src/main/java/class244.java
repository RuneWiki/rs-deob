import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class244 extends class117 {

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
    private int field3875 = 32768;

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "I")
    public static int field3873 = 0;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "Lhb;")
    public static class155 field3880 = new class155(8);

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    public static int field3883 = 0;

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
    public static int field3884 = 0;

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "(I)V")
    public static final void method1632(int arg0) {
        if (arg0 == -29741) {
            ++field3876;
            class47.field796.method1257(-125);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)[[I")
    public final int[][] method47(int arg0, int arg1) {
        ++field3882;
        int var3 = -101 % ((arg1 - 37) / 38);
        int[][] var4 = super.field1886.method419(arg0, (byte) -8);
        if (super.field1886.field1022) {
            int[] var5 = this.method837(0, 1, arg0);
            int[] var6 = this.method837(0, 2, arg0);
            int[] var7 = var4[2];
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            for (int var10 = 0; var10 < class168.field2737; ++var10) {
                int var11 = (var5[var10] * 255 & 1048099) >> 12;
                int var12 = var6[var10] * this.field3875 >> 12;
                int var13 = class261.field4202[var11] * var12 >> 12;
                int var14 = class2.field32[var11] * var12 >> 12;
                int var15 = arg0 - -(var13 >> 12) & class293.field4689;
                int var16 = class234.field3769 & (var14 >> 12) + var10;
                int[][] var17 = this.method838(0, 0, var15);
                var8[var10] = var17[0][var16];
                var9[var10] = var17[1][var16];
                var7[var10] = var17[2][var16];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V")
    public final void method64(int arg0) {
        if (arg0 != 1) {
            method1633(true);
        }
        ++field3878;
        class11.method53(arg0 + -16417);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)V")
    public static void method1633(boolean arg0) {
        field3880 = null;
        if (!arg0) {
            method1633(false);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII)V")
    public static final void method1634(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3872;
        class175 var5 = class182.method1317(8, arg4, false);
        var5.method1279((byte) -80);
        var5.field2857 = arg2;
        if (arg1 == -1878362036) {
            var5.field2865 = arg0;
            var5.field2855 = arg3;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1635(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3877;
        if (arg1 != -5413) {
            method1633(false);
        }
        for (int var6 = arg0; arg3 > var6; ++var6) {
            for (int var7 = arg2; arg4 > var7; ++var7) {
                if (~class15.field165[var6][var7] == ~arg5 && ~class308.field4922[var6][var7] >= -2) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class244() {
        super(3, false);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        if (arg0 != 2) {
            this.method46(11, 112);
        }
        ++field3874;
        int[] var3 = super.field1883.method531(arg1, (byte) 118);
        if (super.field1883.field1313) {
            int[] var4 = this.method837(0, 1, arg1);
            int[] var5 = this.method837(0, 2, arg1);
            for (int var6 = 0; class168.field2737 > var6; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field3875 >> 12;
                int var9 = class261.field4202[var7] * var8 >> 12;
                int var10 = class2.field32[var7] * var8 >> 12;
                int var11 = (var10 >> 12) + var6 & class234.field3769;
                int var12 = (var9 >> 12) + arg1 & class293.field4689;
                int[] var13 = this.method837(0, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        ++field3881;
        if (arg1 != 255) {
            field3884 = -55;
        }
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field1885 = ~arg0.method1133((byte) 53) == -2;
            }
        } else {
            this.field3875 = arg0.method1142(arg1 + -19225) << 4;
        }
    }
}
