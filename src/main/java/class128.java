import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class128 extends class667 {

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
    public static int field1933 = 0;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    public static int field1936 = 0;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "Ld;")
    public static class149 field1937;

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "Leq;")
    public static class209 field1932;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "[Lfw;")
    public static class55[] field1938;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "[[B")
    public static byte[][] field1929;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
    public static final void method990(int arg0) {
        ++field1931;
        class322.field4583.method3048(false);
        if (arg0 <= 37) {
            method991(98, 59, -117, -98);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lud;II)V")
    public final void method116(class35 arg0, int arg1, int arg2) {
        ++field1935;
        if (~arg2 == -1) {
            super.field9344 = ~arg0.method273(arg1 ^ 252) == -2;
        }
        if (arg1 != 3) {
            this.method117((byte) -116, -123);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIII)V")
    public static final void method991(int arg0, int arg1, int arg2, int arg3) {
        ++field1930;
        class154 var4 = class359.field5033[arg2][arg0];
        class299.method1924(arg1 ^ arg1, var4 != null ? var4 : class692.field9743, arg3);
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class128() {
        super(3, false);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)[I")
    public final int[] method117(byte arg0, int arg1) {
        if (arg0 >= -87) {
            field1936 = -25;
        }
        ++field1934;
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (super.field9355.field3728) {
            int[] var4 = this.method3744(arg1, (byte) 117, 0);
            int[] var5 = this.method3744(arg1, (byte) 122, 1);
            int[] var6 = this.method3744(arg1, (byte) -107, 2);
            for (int var7 = 0; class77.field1455 > var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(B)V")
    public static void method992(byte arg0) {
        field1929 = null;
        field1938 = null;
        field1932 = null;
        field1937 = null;
        if (arg0 < 10) {
            method990(-74);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method777(boolean arg0, int arg1) {
        ++field1927;
        int[][] var3 = super.field9357.method2314((byte) 41, arg1);
        if (super.field9357.field5178) {
            int[] var4 = this.method3744(arg1, (byte) 122, 2);
            int[][] var5 = this.method3748(arg1, 0, 0);
            int[][] var6 = this.method3748(arg1, 0, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; class77.field1455 > var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (var17 != 0) {
                        int var18 = 4096 - var17;
                        var7[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                    } else {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        if (arg0) {
            this.method117((byte) -52, 109);
        }
        return var3;
    }
}
