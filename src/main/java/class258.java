import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class258 extends class381 {

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public int field3352;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "Lvea;")
    public static class305 field3348 = new class305();

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "F")
    public static float field3350;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "Lfn;")
    public static class617 field3346;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "[Lcaa;")
    public static class538[] field3351;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method1541(int arg0) {
        if (arg0 > -87) {
            field3350 = -0.61662185F;
        }
        field3351 = null;
        field3348 = null;
        field3346 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V")
    public static final void method1542(int arg0, int arg1) {
        field3344++;
        int var2 = class45.field685 - class306.field4534;
        if (var2 >= 100) {
            class684.field9659 = 1;
            class150.field2120 = -1;
            class250.field3280 = -1;
            return;
        }
        int var3 = (int) class528.field7602;
        if (var3 < class265.field3474 >> 8) {
            var3 = class265.field3474 >> 8;
        }
        if (class215.field2883[4] && class412.field6119[4] + 128 > var3) {
            var3 = class412.field6119[4] + 128;
        }
        int var4 = (int) class311.field4589 + class91.field1395 & 0x3FFF;
        class301.method1894((var3 >> 3) * 3 + 600 << 2, class502.field7101, class677.field9587, arg0, false, var4, var3, class504.method2870((byte) -116, class321.field4681.field7896, class321.field4681.field7895, class49.field779) - 200);
        int var5 = 39 % ((-arg1 - 26) / 46);
        float var6 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class306.field4529 = (int) ((float) (class306.field4529 - class441.field6408) * var6 + (float) class441.field6408);
        class603.field8702 = (int) ((float) (class603.field8702 - class630.field9126) * var6 + (float) class630.field9126);
        class533.field7839 = (int) ((float) (class533.field7839 - class56.field879) * var6 + (float) class56.field879);
        class246.field3255 = (int) ((float) (class246.field3255 - class269.field3522) * var6 + (float) class269.field3522);
        int var7 = class481.field6886 - class577.field8380;
        if (var7 > 8192) {
            var7 -= 16384;
        } else if (var7 < -8192) {
            var7 += 16384;
        }
        class481.field6886 = (int) ((float) var7 * var6 + (float) class577.field8380);
        class481.field6886 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public static final void method1543(int arg0) {
        field3349++;
        int var1 = -118 % ((arg0 - 71) / 36);
        if (class309.field4566 != -1) {
            class63.method390(-1, class309.field4566, false, (byte) 11, -1);
            class309.field4566 = -1;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILfa;Ljava/awt/Canvas;ILmv;)Lr;")
    public static final class98 method1544(int arg0, class615 arg1, Canvas arg2, int arg3, class295 arg4) {
        field3345++;
        if (!class638.method3645((byte) -75)) {
            throw new RuntimeException("");
        } else if (class436.method2588("jaggl", (byte) 39)) {
            if (arg3 != 100) {
                field3350 = -0.32549343F;
            }
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg2, 8, 8, 8, 24, 0, arg0);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class700 var8 = new class700(var5, arg2, var6, arg1, arg4, arg0);
            var8.method3010(-6343);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(CZ)Z")
    public static final boolean method1545(char arg0, boolean arg1) {
        if (!arg1) {
            method1541(110);
        }
        field3347++;
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class258() {
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(I)V")
    public class258(int arg0) {
        this.field3352 = arg0;
    }
}
