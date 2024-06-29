import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class294 {

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lpg;")
    public static class320 field4553 = new class320(50);

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4554 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field4556 = 0;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "[[[B")
    public static byte[][][] field4555;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIZIIIII)V", line = 5)
    public static final void method1998(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (!arg4) {
            return;
        }
        field4550++;
        if (arg5 == arg8 && arg3 == arg7 && arg0 == arg2 && arg1 == arg6) {
            class12.method91(arg9, arg8, -98, arg6, arg7, arg0);
            return;
        }
        int var10 = arg7;
        int var11 = arg8;
        int var12 = arg8 * 3;
        int var13 = arg7 * 3;
        int var14 = arg3 * 3;
        int var15 = arg2 * 3;
        int var16 = arg5 * 3;
        int var17 = arg1 * 3;
        int var18 = arg6 + var14 - var17 - arg7;
        int var19 = arg0 + var16 - arg8 - var15;
        int var20 = var15 - (var16 - var12) - var16;
        int var21 = var13 + var17 - var14 - var14;
        int var22 = var16 - var12;
        int var23 = var14 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var20 * var25;
            int var28 = var19 * var26;
            int var29 = var18 * var26;
            int var30 = var23 * var24;
            int var31 = var22 * var24;
            int var32 = var21 * var25;
            int var33 = (var28 + var27 + var31 >> 12) + arg8;
            int var34 = arg7 + (var29 - (-var30 - var32) >> 12);
            class12.method91(arg9, var11, -123, var34, var10, var33);
            var10 = var34;
            var11 = var33;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BIIII)V", line = 89)
    public static final void method1999(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class128.field2024 = class233.field3706 * arg1 / arg4;
        field4548++;
        class54.field911 = -1;
        class273.field4228 = -1;
        class265.field4119 = class313.field4863 * arg3 / arg2;
        if (arg0 == -11) {
            class17.method137(-28707);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZIIIII)V", line = 105)
    public static final void method2000(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4546++;
        if (!arg0) {
            for (int var6 = arg4; var6 <= arg5; var6++) {
                class272.method1876(class34.field525[var6], arg2, arg1, arg3, (byte) -29);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V", line = 151)
    public static final void method2001(int arg0, int arg1, int arg2) {
        field4545++;
        class54.field911 = arg2 - class84.field1311;
        class273.field4228 = class333.field5202 + class233.field3706 + arg0 - arg1;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILkh;Ljava/lang/String;)I", line = 165)
    public static final int method2002(int arg0, class166 arg1, String arg2) {
        field4551++;
        if (arg0 != -27723) {
            method1999((byte) -127, 116, 45, 62, -81);
        }
        int var3 = arg1.field2532;
        byte[] var4 = class264.method1806((byte) -128, arg2);
        arg1.method1139(var4.length, -1025);
        arg1.field2532 += class26.field398.method1037(arg1.field2532, (byte) 80, var4.length, arg1.field2500, var4, 0);
        return arg1.field2532 - var3;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 195)
    public static final void method2003(int arg0) {
        class241 var1 = (class241) class273.field4229.method636(-1);
        if (arg0 != 90) {
            field4556 = 125;
        }
        field4552++;
        while (var1 != null) {
            if (var1.field3847 == -1) {
                var1.field3860 = 0;
                class35.method291(0, var1);
            } else {
                var1.method403(arg0 ^ 0x5B);
            }
            var1 = (class241) class273.field4229.method638(arg0 ^ 0x14);
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V", line = 226)
    public static void method2004(int arg0) {
        if (arg0 < -92) {
            field4555 = (byte[][][]) null;
            field4553 = null;
            field4554 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ltb;IIIIBII)V", line = 249)
    public static final void method2005(class220 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field4547++;
        int var8 = arg1 * arg1 + (arg6 * arg6);
        if (var8 > arg3 || arg5 != -6) {
            return;
        }
        int var9 = Math.min(arg0.field3526 / 2, arg0.field3458 / 2);
        if (var8 <= var9 * var9) {
            class295.method2010(arg1, arg6, class39.field600[arg2], (byte) 22, arg7, arg0, arg4);
            return;
        }
        var9 -= 10;
        int var10 = (int) class259.field4063 + class345.field5354 & 0x7FF;
        int var11 = class15.field216[var10];
        int var12 = var11 * 256 / (class254.field3995 + 256);
        int var13 = class15.field204[var10];
        int var14 = var13 * 256 / (class254.field3995 + 256);
        int var15 = arg6 * var14 + (arg1 * var12) >> 16;
        int var16 = arg6 * var12 - arg1 * var14 >> 16;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var9);
        int var20 = (int) (Math.cos(var17) * (double) var9);
        if (class94.field1516) {
            ((class86) class193.field2886[arg2]).method619(240, 240, (arg4 + var19 + (arg0.field3526 / 2)) * 16, (arg0.field3458 / 2 + arg7 - var20) * 16, (int) (var17 * 10430.378D), 4096);
        } else {
            ((class249) class193.field2886[arg2]).method1727(arg0.field3526 / 2 + var19 + arg4 - 10, arg0.field3458 / 2 + arg7 + -10 + -var20, 20, 20, 15, 15, var17, 256);
        }
    }
}
