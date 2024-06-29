import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class213 extends class154 {

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "J")
    public static long field3900 = 0L;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field3908 = 0;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "Lcf;")
    public static class93 field3901 = class147.method1066("leuchten1:", -48);

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "[I")
    public static int[] field3905;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)I")
    public static final int method1503(int arg0) {
        field3906++;
        if (class220.field3985) {
            return 0;
        } else if (class13.method57(2357)) {
            if (arg0 < 107) {
                field3908 = 110;
            }
            return class170.field3000 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lli;ILli;IIZZ)I")
    public static final int method1504(class288 arg0, int arg1, class288 arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        if (arg4 != 0) {
            method1504((class288) null, -13, (class288) null, 123, -51, true, false);
        }
        int var7 = class128.method934(arg6, 2001, arg0, arg3, arg2);
        field3907++;
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var8 = class128.method934(arg5, 2001, arg0, arg1, arg2);
            return arg5 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILui;)V")
    public static final void method1505(int arg0, class227 arg1) {
        field3902++;
        for (class43 var2 = (class43) class58.field990.method1151(114); var2 != null; var2 = (class43) class58.field990.method1159(84)) {
            if (var2.field684 == arg1) {
                if (var2.field671 != null) {
                    class35.field543.method1657(var2.field671);
                    var2.field671 = null;
                }
                var2.method1544((byte) -71);
                return;
            }
        }
        if (arg0 != -1) {
            method1507(false, -19, -111);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public static void method1506(int arg0) {
        if (arg0 == -16214) {
            field3901 = null;
            field3905 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZII)I")
    public static final int method1507(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field3900 = 103L;
        }
        field3903++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg2 *= arg2;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V")
    public static final void method1508(int arg0, int arg1) {
        field3909++;
        if (arg1 != -23531) {
            method1508(-22, -16);
        }
        short var2 = 256;
        if (var2 < arg0) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class63.field1138 += arg0 * 128;
        if (class222.field4002.length < class63.field1138) {
            class63.field1138 -= class222.field4002.length;
            int var3 = (int) (Math.random() * 12.0D);
            class151.method1088((byte) 87, class157.field2790[var3]);
        }
        int var4 = arg0 * 128;
        int var5 = (var2 - arg0) * 128;
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var26 = class70.field1280[var6 + var4] - (class222.field4002[class222.field4002.length - 1 & class63.field1138 + var6] * arg0 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class70.field1280[var6++] = var26;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class70.field1280[var23 + var24] = 255;
                } else {
                    class70.field1280[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < var2 - arg0; var9++) {
            class250.field4500[var9] = class250.field4500[arg0 + var9];
        }
        for (int var10 = var2 - arg0; var10 < var2; var10++) {
            class250.field4500[var10] = (int) (Math.sin((double) class165.field2920 / 14.0D) * 16.0D + Math.sin((double) class165.field2920 / 15.0D) * 14.0D + Math.sin((double) class165.field2920 / 16.0D) * 12.0D);
            class165.field2920++;
        }
        class60.field1015 += arg0;
        int var11 = ((class275.field4921 & 0x1) + arg0) / 2;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class60.field1015; var12++) {
            int var21 = (int) (Math.random() * 128.0D) + 128;
            int var22 = (int) (Math.random() * 124.0D) + 2;
            class70.field1280[(var21 << 7) + var22] = 192;
        }
        class60.field1015 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = 0;
            int var19 = var13 * 128;
            for (int var20 = -var11; var20 < 128; var20++) {
                if ((var11 + var20) < 128) {
                    var18 += class70.field1280[var11 + var20 + var19];
                }
                if ((var20 - var11 - 1) >= 0) {
                    var18 -= class70.field1280[var19 + var20 - var11 - 1];
                }
                if (var20 >= 0) {
                    class278.field4981[var19 + var20] = var18 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if (var2 > var16 + var11) {
                    var15 += class278.field4981[var11 * 128 + (var14 + var17)];
                }
                if (var16 - var11 - 1 >= 0) {
                    var15 -= class278.field4981[var14 - (-var17 - (-(var11 * 128) - 128))];
                }
                if (var16 >= 0) {
                    class70.field1280[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }
}
