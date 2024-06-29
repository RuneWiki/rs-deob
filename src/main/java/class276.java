import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class276 extends class175 {

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    private int field3994 = 32768;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "Lso;")
    public static class495 field3998;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)[I", line = 6)
    public final int[] method47(boolean arg0, int arg1) {
        ++field3995;
        int[] var3 = super.field2310.method91(0, arg1);
        if (!arg0) {
            this.method47(true, 113);
        }
        if (super.field2310.field169) {
            int[] var4 = this.method1202(arg1, -1150480797, 1);
            int[] var5 = this.method1202(arg1, -1150480797, 2);
            for (int var6 = 0; ~class598.field8136 < ~var6; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field3994 >> 12;
                int var9 = class10.field123[var7] * var8 >> 12;
                int var10 = class344.field4821[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class412.field5896;
                int var12 = (var10 >> 12) + arg1 & class698.field9254;
                int[] var13 = this.method1202(var12, -1150480797, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)V", line = 54)
    public static void method1811(boolean arg0) {
        field3998 = null;
        if (arg0) {
            method1812(true);
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 71)
    public class276() {
        super(3, false);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)[[I", line = 75)
    public final int[][] method238(int arg0, byte arg1) {
        if (arg1 >= -47) {
            this.field3994 = -37;
        }
        ++field4000;
        int[][] var3 = super.field2316.method3602(arg0, (byte) -74);
        if (super.field2316.field8746) {
            int[] var4 = this.method1202(arg0, -1150480797, 1);
            int[] var5 = this.method1202(arg0, -1150480797, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class598.field8136 < ~var9; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field3994 >> 12;
                int var12 = class10.field123[var10] * var11 >> 12;
                int var13 = class344.field4821[var10] * var11 >> 12;
                int var14 = var9 - -(var12 >> 12) & class412.field5896;
                int var15 = class698.field9254 & (var13 >> 12) + arg0;
                int[][] var16 = this.method1205(0, var15, 29179);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(Z)V", line = 133)
    public static final void method1812(boolean arg0) {
        ++field3996;
        if (~class227.field2935 != 0) {
            int var1 = class494.field6961.method1652(0);
            int var2 = class494.field6961.method1663((byte) 120);
            class428 var3 = (class428) class318.field4527.method679((byte) -86);
            if (var3 != null) {
                var1 = var3.method375(119);
                var2 = var3.method379(!arg0);
            }
            int var4 = 0;
            int var5 = 0;
            if (class24.field246) {
                var4 = class186.method1252(0);
                var5 = class550.method3163(16383);
            }
            class180.method1225(var4 - -class460.field6558, var4, var1, var2 + var5, var4, var1 + var4, var5, arg0, class227.field2935, class693.field9222 + var5, var2, var5);
            if (class254.field3722 != null) {
                class344.method2183(var2 + var5, (byte) -93, var1 - -var4);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 171)
    public final void method46(int arg0) {
        ++field3997;
        if (arg0 != -8) {
            this.method46(110);
        }
        class647.method3595((byte) -116);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILdt;Z)V", line = 182)
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        if (arg2) {
            this.method238(-41, (byte) 79);
        }
        ++field3993;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field2305 = arg1.method1731((byte) 64) == 1;
            }
        } else {
            this.field3994 = arg1.method1728((byte) 114) << 4;
        }
    }
}
