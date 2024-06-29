import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class102 extends class300 {

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
    public static int field1504 = 50;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "Z")
    public static boolean field1510 = false;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        ++field1505;
        int var3 = -84 / (-arg0 / 47);
        int[][] var4 = super.field4786.method538(arg1, (byte) 116);
        if (super.field4786.field1200) {
            int[] var5 = this.method2018(2, -1, arg1);
            int[][] var6 = this.method2021(arg1, false, 0);
            int[][] var7 = this.method2021(arg1, false, 1);
            int[] var8 = var4[0];
            int[] var9 = var6[1];
            int[] var10 = var4[2];
            int[] var11 = var6[0];
            int[] var12 = var4[1];
            int[] var13 = var6[2];
            int[] var14 = var7[1];
            int[] var15 = var7[0];
            int[] var16 = var7[2];
            for (int var17 = 0; class180.field2826 > var17; ++var17) {
                int var18 = var5[var17];
                if (~var18 == -4097) {
                    var8[var17] = var11[var17];
                    var12[var17] = var9[var17];
                    var10[var17] = var13[var17];
                } else if (var18 != 0) {
                    int var19 = 4096 - var18;
                    var8[var17] = var11[var17] * var18 + var15[var17] * var19 >> 12;
                    var12[var17] = var9[var17] * var18 + var14[var17] * var19 >> 12;
                    var10[var17] = var13[var17] * var18 - -(var16[var17] * var19) >> 12;
                } else {
                    var8[var17] = var15[var17];
                    var12[var17] = var14[var17];
                    var10[var17] = var16[var17];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;II)V")
    public static final void method686(String arg0, String arg1, byte arg2, String arg3, int arg4, int arg5) {
        int var6 = 99;
        if (arg2 < -82) {
            while (~var6 < -1) {
                class117.field1692[var6] = class117.field1692[var6 + -1];
                class55.field796[var6] = class55.field796[var6 + -1];
                class169.field2606[var6] = class169.field2606[var6 - 1];
                class29.field354[var6] = class29.field354[var6 - 1];
                class27.field329[var6] = class27.field329[var6 - 1];
                --var6;
            }
            ++class176.field2775;
            class117.field1692[0] = arg5;
            class55.field796[0] = arg3;
            class27.field329[0] = arg4;
            ++field1509;
            class313.field5022 = client.field3871;
            class169.field2606[0] = arg0;
            class29.field354[0] = arg1;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lim;Z)Lga;")
    public static final class18 method687(class170 arg0, boolean arg1) {
        ++field1506;
        if (!arg1) {
            method687((class170) null, true);
        }
        return new class18(arg0.method1193(-1), arg0.method1193(-1), arg0.method1193(-1), arg0.method1193(-1), arg0.method1212(460736848), arg0.method1212(460736848), arg0.method1218(-55));
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class102() {
        super(3, false);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        if (arg1 >= -43) {
            field1504 = -75;
        }
        ++field1508;
        if (arg2 == 0) {
            super.field4784 = arg0.method1218(-68) == 1;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        if (arg1 != -957953300) {
            return null;
        } else {
            ++field1507;
            int[] var3 = super.field4797.method217(arg0, true);
            if (super.field4797.field470) {
                int[] var4 = this.method2018(0, -1, arg0);
                int[] var5 = this.method2018(1, -1, arg0);
                int[] var6 = this.method2018(2, arg1 ^ 957953299, arg0);
                for (int var7 = 0; ~var7 > ~class180.field2826; ++var7) {
                    int var8 = var6[var7];
                    if (~var8 == -4097) {
                        var3[var7] = var4[var7];
                    } else if (~var8 != -1) {
                        var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                }
            }
            return var3;
        }
    }
}
