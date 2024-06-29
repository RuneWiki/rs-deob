import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public abstract class class318 {

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "Lcq;")
    public static class72 field4279 = new class72("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "[I")
    public static int[] field4285 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public int field4280;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public int field4281;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "[I")
    public int[] field4283;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "[I")
    public static int[] field4284;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
    public abstract void method1600(int arg0, int arg1, Graphics arg2, boolean arg3);

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
    public abstract void method1598(boolean arg0, Canvas arg1);

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
    public static void method1988(int arg0) {
        field4279 = null;
        field4285 = null;
        field4284 = null;
        int var1 = 76 % ((-arg0 - 1) / 53);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
    public static final void method1989(byte arg0) {
        field4286++;
        int var1 = -66 / ((arg0 + 32) / 55);
        if (class380.field5165) {
            return;
        }
        class380.field5165 = true;
        if (class244.field3246) {
            class434.field5929 = (float) ((int) class434.field5929 - 65 & 0xFFFFFF80);
        } else {
            class288.field3792 += (-24.0F - class288.field3792) / 2.0F;
        }
        class392.field5340 = true;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILip;)V")
    public static final void method1990(int arg0, class279 arg1) {
        class304.field4096[arg0] = arg1;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lnh;I)[Ltr;")
    public static final class215[] method1991(class441 arg0, int arg1) {
        field4282++;
        if (!arg0.method2720(false)) {
            return new class215[0];
        }
        class315 var2 = arg0.method2713(21);
        while (var2.field4244 == 0) {
            class219.method1330(10L, true);
        }
        if (var2.field4244 == 2) {
            return new class215[0];
        }
        if (arg1 != 29400) {
            field4285 = null;
        }
        int[] var3 = (int[]) var2.field4243;
        class215[] var4 = new class215[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class215 var6 = new class215();
            var4[var5] = var6;
            var6.field2656 = var3[var5 << 2];
            var6.field2657 = var3[(var5 << 2) + 1];
            var6.field2660 = var3[(var5 << 2) + 2];
            var6.field2653 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method1599(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)V")
    public static final void method1992(boolean arg0) {
        if (arg0) {
            class347.field4722 = class104.field1216;
            class304.field4096 = class75.field915;
        } else {
            class347.field4722 = class299.field4000;
            class304.field4096 = class219.field2709;
        }
        class238.field3149 = class347.field4722.length;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZZ)Z")
    public static boolean method1993(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }
}
