import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class680 extends class141 {

    @OriginalMember(owner = "client!ww", name = "S", descriptor = "[[Z")
    public static boolean[][] field9738 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!ww", name = "V", descriptor = "[I")
    public static int[] field9741 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ww", name = "X", descriptor = "I")
    public static int field9743 = 0;

    @OriginalMember(owner = "client!ww", name = "Q", descriptor = "I")
    public static int field9736;

    @OriginalMember(owner = "client!ww", name = "R", descriptor = "I")
    public static int field9737;

    @OriginalMember(owner = "client!ww", name = "T", descriptor = "I")
    public static int field9739;

    @OriginalMember(owner = "client!ww", name = "U", descriptor = "I")
    public static int field9740;

    @OriginalMember(owner = "client!ww", name = "W", descriptor = "I")
    public static int field9742;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ZI)V")
    public static final void method3856(boolean arg0, int arg1) {
        ++field9740;
        if (arg0) {
            method3857(-80, (String) null, 47);
        }
        if (~arg1 > -1 || ~arg1 < -3) {
            arg1 = 0;
        }
        class561.field8107 = arg1;
        class558.field8082 = new class684[class502.field7014[class561.field8107] - -1];
        class306.field4068 = 0;
        class649.field9208 = 0;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method3857(int arg0, String arg1, int arg2) {
        ++field9737;
        class233 var3 = class7.method44(arg2, 3, arg0 ^ 17727);
        var3.method1422(0);
        var3.field3119 = arg1;
        if (arg0 != -17728) {
            field9741 = null;
        }
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(II)[[I")
    public final int[][] method645(int arg0, int arg1) {
        ++field9739;
        if (arg1 != 3) {
            this.method645(27, -95);
        }
        int[][] var3 = super.field5148.method1054(arg0, 16257);
        if (super.field5148.field2041 && this.method929((byte) -19)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field1758 * super.field1758;
            for (int var8 = 0; var8 < class599.field8643; ++var8) {
                int var9 = super.field1766[var8 % super.field1761 + var7];
                var6[var8] = class435.method2605(255, var9) << 4;
                var5[var8] = class435.method2605(var9, 65280) >> 4;
                var4[var8] = class435.method2605(4080, var9 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I[BILjava/lang/String;)I")
    public static final int method3858(int arg0, byte[] arg1, int arg2, String arg3) {
        ++field9742;
        if (arg0 != 192) {
            field9743 = -33;
        }
        int var4 = arg2;
        int var5 = arg3.length();
        for (int var6 = 0; var5 > var6; var6 += 4) {
            int var7 = class678.method3849(arg3.charAt(var6), -1);
            int var8 = var5 <= var6 + 1 ? -1 : class678.method3849(arg3.charAt(var6 + 1), -1);
            int var9 = ~var5 >= ~(var6 + 2) ? -1 : class678.method3849(arg3.charAt(var6 + 2), -1);
            int var10 = var5 > var6 + 3 ? class678.method3849(arg3.charAt(var6 + 3), arg0 ^ -193) : -1;
            arg1[arg2++] = (byte) class242.method1474(var7 << 2, var8 >>> 4);
            if (var9 == -1) {
                break;
            }
            arg1[arg2++] = (byte) class242.method1474(class435.method2605(15, var8) << 4, var9 >>> 2);
            if (var10 == -1) {
                break;
            }
            arg1[arg2++] = (byte) class242.method1474(class435.method2605(var9 << 6, 192), var10);
        }
        return -var4 + arg2;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3859(int arg0, int arg1, byte arg2) {
        if (arg2 != -109) {
            field9741 = null;
        }
        ++field9736;
        return ~(arg0 & 1408) != -1;
    }

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "(I)V")
    public static void method3860(int arg0) {
        field9741 = null;
        if (arg0 > -62) {
            method3858(-54, (byte[]) null, -44, (String) null);
        }
        field9738 = null;
    }
}
