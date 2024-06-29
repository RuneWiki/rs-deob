import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class268 extends class338 {

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Lmk;")
    public class154 field3647 = new class154();

    @OriginalMember(owner = "client!j", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3651 = "Loading world list data";

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public static int field3650 = 0;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZIIILvm;)V")
    public static final void method1491(int arg0, boolean arg1, int arg2, int arg3, int arg4, class322 arg5) {
        arg5.method1648(arg0, arg3, arg0 + arg4, arg2 + arg3);
        field3649++;
        arg5.method1860(arg3, -3272, arg4, arg0, arg2, -16777216);
        if (class337.field4497 < 100) {
            return;
        }
        float var6 = (float) class443.field6465 / (float) class443.field6472;
        int var7 = arg4;
        int var8 = arg2;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg4 * var6);
        } else {
            var7 = (int) ((float) arg2 / var6);
        }
        int var9 = (arg2 - var8) / 2 + arg3;
        int var10 = (arg4 - var7) / 2 + arg0;
        if (class185.field2353 == null || class185.field2353.method97() != arg4 || arg2 != class185.field2353.method105()) {
            class443.method2731(class443.field6479, class443.field6469 + class443.field6465, class443.field6479 + class443.field6472, class443.field6469, var10, var9, var7 + var10, var8 + var9);
            class443.method2746(arg5);
            class185.field2353 = arg5.method1569(var10, var9, var7, var8, false);
        }
        class185.field2353.method93(var10, var9);
        int var11 = class272.field3681 * var7 / class443.field6472;
        int var12 = class262.field3573 * var8 / class443.field6465;
        int var13 = class98.field1162 * var7 / class443.field6472 + var10;
        int var14 = var8 + var9 - var12 - class384.field5482 * var8 / class443.field6465;
        int var15 = -1996554240;
        if (class62.field636 == 1) {
            var15 = -1996488705;
        }
        arg5.method1614(var13, var14, var11, var12, var15, 1);
        arg5.method1575(var13, var14, var11, var12, var15, 0);
        if (class435.field6352 > 0) {
            int var16;
            if (class340.field4550 > 50) {
                var16 = 500 - (class340.field4550 * 5);
            } else {
                var16 = class340.field4550 * 5;
            }
            for (class216 var17 = (class216) class443.field6455.method814((byte) 90); var17 != null; var17 = (class216) class443.field6455.method827(121)) {
                class228 var18 = class283.method1668(-76, var17.field2903);
                if (class342.method2005(var18, true)) {
                    if (class230.field3169 == var17.field2903) {
                        int var19 = var17.field2908 * var7 / class443.field6472 + var10;
                        int var20 = (class443.field6465 - var17.field2896) * var8 / class443.field6465 + var9;
                        arg5.method1860(var20 - 2, -3272, 4, var19 - 2, 4, var16 << 24 | 0xFFFF00);
                    } else if (class205.field2768 != -1 && class205.field2768 == var18.field3133) {
                        int var21 = var17.field2908 * var7 / class443.field6472 + var10;
                        int var22 = (class443.field6465 - var17.field2896) * var8 / class443.field6465 + var9;
                        arg5.method1860(var22 - 2, -3272, 4, var21 - 2, 4, var16 << 24 | 0xFFFF00);
                    }
                }
            }
        }
        if (arg1) {
            field3650 = 125;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
    public static final void method1492(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3648++;
        int var5 = 0;
        int var6 = arg4;
        if (arg1 >= -65) {
            field3651 = null;
        }
        int var7 = -arg4;
        int var8 = -1;
        class296.method1740(arg0 - arg4, class153.field1932[arg3], (byte) 81, arg2, arg0 + arg4);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class153.field1932[arg3 + var6];
                int[] var10 = class153.field1932[arg3 - var6];
                int var11 = arg0 + var5;
                int var12 = arg0 - var5;
                class296.method1740(var12, var9, (byte) 81, arg2, var11);
                class296.method1740(var12, var10, (byte) 81, arg2, var11);
            }
            int var13 = arg0 + var6;
            int var14 = arg0 - var6;
            int[] var15 = class153.field1932[arg3 + var5];
            int[] var16 = class153.field1932[arg3 - var5];
            class296.method1740(var14, var15, (byte) 81, arg2, var13);
            class296.method1740(var14, var16, (byte) 81, arg2, var13);
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V")
    public static final void method1493(int arg0) {
        field3652++;
        if (class264.field3605 != null) {
            class264.field3605.method1538((byte) 5);
            class264.field3605 = null;
        }
        class80.method443(23574);
        class380.method2330();
        for (int var1 = 0; var1 < 4; var1++) {
            class36.field352[var1].method2704(0);
        }
        class208.method1127(false, -104);
        System.gc();
        class303.method1786(2, (byte) -81);
        class200.field2668 = -1;
        class41.field431 = false;
        class291.method1717(-101, true);
        class398.field5748 = false;
        class296.field4016 = 0;
        class291.field3961 = 0;
        class242.field3289 = 0;
        class70.field767 = 0;
        for (int var2 = 0; var2 < class416.field5982.length; var2++) {
            class416.field5982[var2] = null;
        }
        class244.field3320 = 0;
        class293.field3991 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class85.field957[var3] = null;
            class312.field4194[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class38.field397[var4] = null;
        }
        class419.field6102.method307((byte) 115);
        class298.method1753(-88);
        class243.field3305 = 0;
        class158.method858(255);
        class162.method873(1282152096);
        if (arg0 < 2) {
            return;
        }
        class380.method2347(77);
        class293.method1727(true, -107);
        try {
            class245.method1313(class159.field2055.field6532, (byte) -123, "loggedout");
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V")
    public static void method1494(int arg0) {
        if (arg0 == -2) {
            field3651 = null;
        }
    }
}
