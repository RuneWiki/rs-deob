import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class223 extends class310 {

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "I")
    private int field3699 = 32768;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
    public static int field3701 = 0;

    @OriginalMember(owner = "client!nk", name = "Y", descriptor = "I")
    public static int field3709 = 0;

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "I")
    public static int field3706 = 0;

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "Lth;")
    public static class57 field3696;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "Lth;")
    public static class57 field3700;

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "[I")
    public static int[] field3708;

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V", line = 5)
    public class223() {
        super(3, false);
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(B)V", line = 10)
    public static final void method1694(byte arg0) {
        field3704++;
        class310.method2203(0, 0, 16);
        if (arg0 != -125) {
            method1696(-60, 68, (byte) -63, -10, 73);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;ZZ)V", line = 23)
    public static final void method1695(String arg0, boolean arg1, boolean arg2) {
        field3702++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class281.field4614; var6++) {
            class52 var7 = class6.method22(var6, 16430);
            if ((!arg1 || var7.field849) && var7.field824 == -1 && var7.field812 == -1 && var7.field822 == 0 && var7.field871.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class248.field4051 = -1;
                    class17.field204 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var8 = new short[var4.length * 2];
                    for (int var9 = 0; var9 < var5; var9++) {
                        var8[var9] = var4[var9];
                    }
                    var4 = var8;
                }
                var4[var5++] = (short) var6;
            }
        }
        if (arg2) {
            return;
        }
        class248.field4051 = var5;
        class343.field5463 = 0;
        class17.field204 = var4;
        String[] var10 = new String[class248.field4051];
        for (int var11 = 0; var11 < class248.field4051; var11++) {
            var10[var11] = class6.method22(var4[var11], 16430).field871;
        }
        class26.method168(class17.field204, 124, var10);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIBII)V", line = 98)
    public static final void method1696(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -12) {
            field3709 = -74;
        }
        field3705++;
        if (class296.field4758 <= arg4 && arg4 <= class273.field4522) {
            int var5 = class315.method2235(class355.field5640, arg0, class74.field1269, 122);
            int var6 = class315.method2235(class355.field5640, arg3, class74.field1269, arg2 ^ 0xFFFFFF84);
            class59.method499(arg4, var6, (byte) -35, var5, arg1);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)[I", line = 120)
    public final int[] method77(int arg0, int arg1) {
        if (arg1 != -13093) {
            return (int[]) null;
        }
        field3707++;
        int[] var3 = this.field4950.method930(arg0, 0);
        if (this.field4950.field2001) {
            int[] var4 = this.method2200(1, arg0, (byte) 74);
            int[] var5 = this.method2200(2, arg0, (byte) 74);
            for (int var6 = 0; var6 < class261.field4405; var6++) {
                int var7 = var4[var6] >> 4 & 0xFF;
                int var8 = var5[var6] * this.field3699 >> 12;
                int var9 = class74.field1255[var7] * var8 >> 12;
                int var10 = class98.field1628 & (var9 >> 12) + var6;
                int var11 = class74.field1265[var7] * var8 >> 12;
                int var12 = (var11 >> 12) + arg0 & class113.field1861;
                int[] var13 = this.method2200(0, var12, (byte) 74);
                var3[var6] = var13[var10];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "(B)V", line = 170)
    public static void method1697(byte arg0) {
        field3700 = null;
        field3696 = null;
        if (arg0 != 119) {
            method1694((byte) -114);
        }
        field3708 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lqm;II)V", line = 183)
    public final void method75(class227 arg0, int arg1, int arg2) {
        field3698++;
        if (arg2 == 0) {
            this.field3699 = arg0.method1765(true) << 4;
        } else if (arg2 == 1) {
            this.field4940 = arg0.method1720((byte) -60) == 1;
        }
        if (arg1 != -2470) {
            this.method391(-64, false);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZ)[[I", line = 230)
    public final int[][] method391(int arg0, boolean arg1) {
        if (!arg1) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field4942.method10((byte) -111, arg0);
        field3703++;
        if (this.field4942.field30) {
            int[] var4 = this.method2200(1, arg0, (byte) 74);
            int[] var5 = this.method2200(2, arg0, (byte) 74);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class261.field4405; var9++) {
                int var10 = var4[var9] * 255 >> 12 & 0xFF;
                int var11 = var5[var9] * this.field3699 >> 12;
                int var12 = class74.field1265[var10] * var11 >> 12;
                int var13 = class74.field1255[var10] * var11 >> 12;
                int var14 = class113.field1861 & arg0 + (var12 >> 12);
                int var15 = class98.field1628 & var9 + (var13 >> 12);
                int[][] var16 = this.method2199(21101, var14, 0);
                var6[var9] = var16[0][var15];
                var7[var9] = var16[1][var15];
                var8[var9] = var16[2][var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(B)V", line = 296)
    public final void method553(byte arg0) {
        class26.method169(-66);
        if (arg0 >= -82) {
            field3708 = (int[]) null;
        }
        field3695++;
    }
}
