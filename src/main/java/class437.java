import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public abstract class class437 extends class324 {

    @OriginalMember(owner = "client!bda", name = "n", descriptor = "Z")
    public static boolean field6502 = false;

    @OriginalMember(owner = "client!bda", name = "j", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!bda", name = "k", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!bda", name = "l", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!bda", name = "m", descriptor = "I")
    public int field6501;

    @OriginalMember(owner = "client!bda", name = "o", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!bda", name = "r", descriptor = "I")
    public int field6506;

    @OriginalMember(owner = "client!bda", name = "p", descriptor = "[I")
    public int[] field6504;

    @OriginalMember(owner = "client!bda", name = "q", descriptor = "[[Z")
    public static boolean[][] field6505;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
    public abstract void method823(int arg0, int arg1, Graphics arg2, boolean arg3);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIII)V")
    public static final void method2723(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6503++;
        float var5 = (float) class182.field2279 / (float) class182.field2261;
        int var6 = arg4;
        int var7 = arg1;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg4 * var5);
        } else {
            var6 = (int) ((float) arg1 / var5);
        }
        int var8 = arg0 - (arg4 - var6) / 2;
        int var9 = arg3 - (arg1 - var7) / 2;
        class75.field814 = class182.field2279 - (class182.field2279 * var9 / var7);
        class421.field6299 = class182.field2261 * var8 / var6;
        class212.field2909 = -1;
        class59.field682 = -1;
        int var10 = 13 / ((-arg2 - 43) / 39);
        class171.method986((byte) 31);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZIIIILjava/awt/Graphics;)V")
    public abstract void method821(boolean arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method822(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(III)Z")
    public static final boolean method2724(int arg0, int arg1, int arg2) {
        field6498++;
        if (arg0 == 262144) {
            return (arg2 & 0x40000) != 0 | class582.method3376(arg2, (byte) -124, arg1) || class626.method3595(arg2, (byte) 72, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)V")
    public static void method2725(byte arg0) {
        field6505 = null;
        if (arg0 != 87) {
            method2726(8, (byte) -34, null);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IBLkea;)Lcq;")
    public static final class402 method2726(int arg0, byte arg1, class203 arg2) {
        field6500++;
        byte[] var3 = arg2.method1308((byte) -127, arg0);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 <= 71) {
                field6505 = null;
            }
            return new class402(var3);
        }
    }
}
