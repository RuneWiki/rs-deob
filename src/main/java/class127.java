import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class127 extends class354 {

    @OriginalMember(owner = "client!ru", name = "O", descriptor = "I")
    private int field1933 = 4;

    @OriginalMember(owner = "client!ru", name = "I", descriptor = "I")
    private int field1927 = 4;

    @OriginalMember(owner = "client!ru", name = "M", descriptor = "Lbg;")
    public static class323 field1931 = null;

    @OriginalMember(owner = "client!ru", name = "P", descriptor = "Ldq;")
    public static class489 field1934 = new class489(8, 3);

    @OriginalMember(owner = "client!ru", name = "Q", descriptor = "[I")
    public static int[] field1935 = new int[4096];

    @OriginalMember(owner = "client!ru", name = "H", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!ru", name = "J", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!ru", name = "K", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!ru", name = "L", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!ru", name = "N", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!ru", name = "R", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BI)[[I", line = 6)
    public final int[][] method207(byte arg0, int arg1) {
        if (arg0 > -40) {
            return null;
        } else {
            ++field1928;
            int[][] var3 = super.field5351.method2819((byte) -80, arg1);
            if (super.field5351.field6959) {
                int var4 = class404.field5952 / this.field1933;
                int var5 = class337.field5146 / this.field1927;
                int[][] var7;
                if (~var5 < -1) {
                    int var6 = arg1 % var5;
                    var7 = this.method2291(0, (byte) -97, class337.field5146 * var6 / var5);
                } else {
                    var7 = this.method2291(0, (byte) -97, 0);
                }
                int[] var8 = var7[0];
                int[] var9 = var7[1];
                int[] var10 = var7[2];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; var14 < class404.field5952; ++var14) {
                    int var15;
                    if (var4 <= 0) {
                        var15 = 0;
                    } else {
                        int var16 = var14 % var4;
                        var15 = class404.field5952 * var16 / var4;
                    }
                    var11[var14] = var8[var15];
                    var12[var14] = var9[var15];
                    var13[var14] = var10[var15];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)I", line = 75)
    public static final int method939(byte arg0) {
        if (arg0 >= -79) {
            method939((byte) -57);
        }
        ++field1932;
        return 16;
    }

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "(B)V", line = 86)
    public static final void method940(byte arg0) {
        int var1 = -101 % ((-57 - arg0) / 48);
        if (~class357.field5407 != 0) {
            class270.method1735(-1, class357.field5407, false, -1, (byte) 45);
            class357.field5407 = -1;
        }
        ++field1926;
    }

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "(B)V", line = 103)
    public static void method941(byte arg0) {
        field1934 = null;
        int var1 = 14 % ((2 - arg0) / 54);
        field1931 = null;
        field1935 = null;
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "()V", line = 118)
    public class127() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILti;I)V", line = 121)
    public final void method206(int arg0, class303 arg1, int arg2) {
        ++field1936;
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field1927 = arg1.method1918((byte) 115);
            }
        } else {
            this.field1933 = arg1.method1918((byte) -64);
        }
        if (arg0 != 15180) {
            this.method253(7, (byte) 18);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IB)[I", line = 169)
    public final int[] method253(int arg0, byte arg1) {
        ++field1930;
        if (arg1 != -95) {
            return null;
        } else {
            int[] var3 = super.field5357.method861(true, arg0);
            if (super.field5357.field1869) {
                int var4 = class404.field5952 / this.field1933;
                int var5 = class337.field5146 / this.field1927;
                int[] var6;
                if (~var5 >= -1) {
                    var6 = this.method2293(0, 0, (byte) 69);
                } else {
                    int var7 = arg0 % var5;
                    var6 = this.method2293(0, class337.field5146 * var7 / var5, (byte) 69);
                }
                for (int var8 = 0; var8 < class404.field5952; ++var8) {
                    if (var4 <= 0) {
                        var3[var8] = var6[0];
                    } else {
                        int var9 = var8 % var4;
                        var3[var8] = var6[class404.field5952 * var9 / var4];
                    }
                }
            }
            return var3;
        }
    }
}
