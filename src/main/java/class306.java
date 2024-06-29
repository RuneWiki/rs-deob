import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class306 {

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4582 = "flash2:";

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Lol;")
    public static class199 field4580 = new class199(0, -1);

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field4584 = 0;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "S")
    public static short field4587 = 32767;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4585;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 5)
    public static void method2152(byte arg0) {
        field4582 = null;
        field4580 = null;
        field4585 = null;
        if (arg0 > -31) {
            field4584 = -69;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)Lln;", line = 35)
    public static final class118 method2153(int arg0) {
        int var1 = 127 / ((58 - arg0) / 36);
        field4588++;
        byte[] var2 = class225.field3385[0];
        int var3 = class59.field871[0] * class225.field3397[0];
        class118 var7;
        if (class30.field421[0]) {
            int[] var4 = new int[var3];
            byte[] var5 = class41.field605[0];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class81.method666(class287.method2076(var5[var6] << 24, -16777216), class206.field3015[class287.method2076(255, var2[var6])]);
            }
            var7 = new class79(class255.field3816, class22.field336, class199.field2896[0], class160.field2319[0], class59.field871[0], class225.field3397[0], var4);
        } else {
            int[] var8 = new int[var3];
            for (int var9 = 0; var9 < var3; var9++) {
                var8[var9] = class206.field3015[class287.method2076(255, var2[var9])];
            }
            var7 = new class118(class255.field3816, class22.field336, class199.field2896[0], class160.field2319[0], class59.field871[0], class225.field3397[0], var8);
        }
        class321.method2235(-2182);
        return var7;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIB)V", line = 77)
    public static final void method2154(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field4581++;
        int var6 = arg0 - arg2;
        int var7 = arg1 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class3.method24(-30302, arg1, arg2, arg3, arg4);
            }
        } else if (var7 == 0) {
            class4.method32(false, arg3, arg2, arg4, arg0);
        } else if (arg5 >= 111) {
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (class355.field5452 > arg0) {
                var10 = class355.field5452;
                var11 = (class355.field5452 * var8 >> 12) + var9;
            } else if (arg0 <= class348.field5378) {
                var10 = arg0;
                var11 = arg1;
            } else {
                var11 = (class348.field5378 * var8 >> 12) + var9;
                var10 = class348.field5378;
            }
            int var12;
            int var13;
            if (class355.field5452 > arg2) {
                var12 = class355.field5452;
                var13 = (class355.field5452 * var8 >> 12) + var9;
            } else if (class348.field5378 < arg2) {
                var12 = class348.field5378;
                var13 = var9 + (class348.field5378 * var8 >> 12);
            } else {
                var13 = arg3;
                var12 = arg2;
            }
            if (var13 < class326.field4901) {
                var13 = class326.field4901;
                var12 = (class326.field4901 - var9 << 12) / var8;
            } else if (class261.field3911 < var13) {
                var13 = class261.field3911;
                var12 = (class261.field3911 - var9 << 12) / var8;
            }
            if (class326.field4901 > var11) {
                var10 = (class326.field4901 - var9 << 12) / var8;
                var11 = class326.field4901;
            } else if (class261.field3911 < var11) {
                var11 = class261.field3911;
                var10 = (class261.field3911 - var9 << 12) / var8;
            }
            class236.method1756(var12, var10, arg4, var13, -1, var11);
        }
    }
}
