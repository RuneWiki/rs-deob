import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class167 extends class242 {

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "I")
    private int field2925 = 4;

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "I")
    private int field2927 = 4;

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "Z")
    public static boolean field2929 = false;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "Lhe;")
    public static class19 field2924 = new class19(512);

    @OriginalMember(owner = "client!jg", name = "bb", descriptor = "Lp;")
    public static class280 field2932 = class18.method140((byte) -128, "cookiehost");

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "I")
    public static volatile int field2930 = 0;

    @OriginalMember(owner = "client!jg", name = "db", descriptor = "Lp;")
    private static class280 field2934 = class18.method140((byte) -124, "Walk here");

    @OriginalMember(owner = "client!jg", name = "cb", descriptor = "Lp;")
    public static class280 field2933 = field2934;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!jg", name = "ab", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method71(boolean arg0, int arg1) {
        ++field2926;
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field4257.method917(arg1, 1);
            if (super.field4257.field2357) {
                int var4 = class25.field486 / this.field2927;
                int var5 = class264.field4654 / this.field2925;
                int[][] var6;
                if (~var4 >= -1) {
                    var6 = this.method1648(26484, 0, 0);
                } else {
                    int var7 = arg1 % var4;
                    var6 = this.method1648(26484, class25.field486 * var7 / var4, 0);
                }
                int[] var8 = var6[0];
                int[] var9 = var6[1];
                int[] var10 = var6[2];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; class264.field4654 > var14; ++var14) {
                    int var15;
                    if (~var5 >= -1) {
                        var15 = 0;
                    } else {
                        int var16 = var14 % var5;
                        var15 = class264.field4654 * var16 / var5;
                    }
                    var11[var14] = var8[var15];
                    var12[var14] = var9[var15];
                    var13[var14] = var10[var15];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        int[] var3 = super.field4251.method1417((byte) 74, arg0);
        if (super.field4251.field3655) {
            int var4 = class264.field4654 / this.field2925;
            int var5 = class25.field486 / this.field2927;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method1647(0, 0, 48);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1647(0, class25.field486 * var7 / var5, 48);
            }
            for (int var8 = 0; class264.field4654 > var8; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class264.field4654 * var9 / var4];
                }
            }
        }
        ++field2923;
        int var10 = -49 % ((arg1 - 73) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        ++field2928;
        if (arg0 > -119) {
            this.method71(false, -74);
        }
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field2927 = arg2.method189((byte) -103);
            }
        } else {
            this.field2925 = arg2.method189((byte) -103);
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class167() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "(I)V")
    public static void method1167(int arg0) {
        if (arg0 < 75) {
            field2924 = null;
        }
        field2934 = null;
        field2932 = null;
        field2924 = null;
        field2933 = null;
    }
}
