import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class170 extends class222 {

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "I")
    private int field3000 = 32768;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "Lsb;")
    public static class98 field3001 = class47.method368("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", 0);

    @OriginalMember(owner = "client!jb", name = "gb", descriptor = "Lsb;")
    public static class98 field3004 = class47.method368("<img=1>", 0);

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "[S")
    public static short[] field3003 = new short[] { 28, 17, 26, 46, 49, 39, 41, 51 };

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!jb", name = "hb", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "Ljava/awt/Image;")
    public static Image field2994;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
    public final void method288(int arg0) {
        int var2 = 69 % ((57 - arg0) / 51);
        class133.method1002(0);
        ++field3002;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method4(84, -79);
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field3842 = ~arg0.method1446(5350) == -2;
            }
        } else {
            this.field3000 = arg0.method1487(84) << 4;
        }
        ++field2999;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
    public static void method1204(boolean arg0) {
        field3003 = null;
        field3001 = null;
        field3004 = null;
        if (!arg0) {
            field3001 = null;
        }
        field2994 = null;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(II)[[I")
    public final int[][] method4(int arg0, int arg1) {
        int[][] var3 = super.field3834.method627(4103, arg0);
        if (arg1 != 1) {
            this.method3((class216) null, false, 89);
        }
        if (super.field3834.field1486) {
            int[] var4 = this.method1537((byte) 79, 1, arg0);
            int[] var5 = this.method1537((byte) 118, 2, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class13.field253; ++var9) {
                int var10 = (1048228 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field3000 >> 12;
                int var12 = class132.field2351[var10] * var11 >> 12;
                int var13 = class33.field573[var10] * var11 >> 12;
                int var14 = class191.field3299 & arg0 - -(var13 >> 12);
                int var15 = (var12 >> 12) + var9 & class162.field2924;
                int[][] var16 = this.method1531(var14, 0, 118);
                var6[var9] = var16[0][var15];
                var7[var9] = var16[1][var15];
                var8[var9] = var16[2][var15];
            }
        }
        ++field2998;
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
    public class170() {
        super(3, false);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1205(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != -57) {
            field3004 = null;
        }
        ++field2997;
        if (~arg1 == ~arg5) {
            class235.method1608(23044, arg5, arg2, arg0, arg3);
        } else if (arg2 - arg5 >= class229.field3933 && ~(arg2 + arg5) >= ~class106.field1899 && ~(-arg1 + arg0) <= ~class116.field2077 && arg0 + arg1 <= class215.field3666) {
            class188.method1294(arg3, arg2, arg5, arg0, arg1, 111);
        } else {
            class249.method1732((byte) -93, arg3, arg1, arg0, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBIII)V")
    public static final void method1206(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field3005;
        class37.method305(-7, class43.field721[arg2], arg4 - -arg3, arg0, -arg3 + arg4);
        if (arg1 >= -6) {
            method1204(true);
        }
        int var5 = 0;
        int var6 = -arg3;
        int var7 = arg3;
        int var8 = -1;
        while (~var5 > ~var7) {
            ++var5;
            var8 += 2;
            var6 += var8;
            if (~var6 <= -1) {
                --var7;
                var6 -= var7 << 1;
                int[] var9 = class43.field721[arg2 + var7];
                int[] var10 = class43.field721[arg2 - var7];
                int var11 = arg4 + var5;
                int var12 = -var5 + arg4;
                class37.method305(-7, var9, var11, arg0, var12);
                class37.method305(-7, var10, var11, arg0, var12);
            }
            int var13 = arg4 + var7;
            int[] var14 = class43.field721[-var5 + arg2];
            int var15 = -var7 + arg4;
            int[] var16 = class43.field721[arg2 + var5];
            class37.method305(-7, var16, var13, arg0, var15);
            class37.method305(-7, var14, var13, arg0, var15);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        int[] var3 = super.field3844.method22(0, arg1);
        ++field2995;
        if (super.field3844.field61) {
            int[] var4 = this.method1537((byte) 60, 1, arg1);
            int[] var5 = this.method1537((byte) 58, 2, arg1);
            for (int var6 = 0; class13.field253 > var6; ++var6) {
                int var7 = var5[var6] * this.field3000 >> 12;
                int var8 = (var4[var6] & 4092) >> 4;
                int var9 = class33.field573[var8] * var7 >> 12;
                int var10 = arg1 - -(var9 >> 12) & class191.field3299;
                int var11 = class132.field2351[var8] * var7 >> 12;
                int var12 = class162.field2924 & (var11 >> 12) + var6;
                int[] var13 = this.method1537((byte) 121, 0, var10);
                var3[var6] = var13[var12];
            }
        }
        if (arg0 <= 35) {
            this.method4(115, -18);
        }
        return var3;
    }
}
