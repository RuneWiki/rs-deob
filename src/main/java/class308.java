import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class308 {

    @OriginalMember(owner = "client!qv", name = "r", descriptor = "I")
    public int field4441 = -1;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "[I")
    public static int[] field4429 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "[F")
    public static float[] field4430 = new float[4];

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "[S")
    public static short[] field4432 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!qv", name = "l", descriptor = "[I")
    public static int[] field4435 = new int[5];

    @OriginalMember(owner = "client!qv", name = "s", descriptor = "I")
    public static int field4442 = 500;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public int field4424;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public int field4425;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public int field4427;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public int field4428;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "I")
    public int field4431;

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
    public int field4434;

    @OriginalMember(owner = "client!qv", name = "m", descriptor = "I")
    public int field4436;

    @OriginalMember(owner = "client!qv", name = "n", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!qv", name = "o", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!qv", name = "p", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!qv", name = "q", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!qv", name = "t", descriptor = "I")
    public int field4443;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lm;ILjava/awt/Canvas;BLji;)Lqa;")
    public static final class162 method1938(class126 arg0, int arg1, Canvas arg2, byte arg3, class432 arg4) {
        field4440++;
        return arg3 < 123 ? null : new class469(arg1, arg2, arg0, arg4);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V")
    public static void method1939(byte arg0) {
        field4429 = null;
        field4432 = null;
        if (arg0 < 73) {
            method1940(null, (byte) 46, -98);
        }
        field4430 = null;
        field4435 = null;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lji;BI)I")
    public static final int method1940(class432 arg0, byte arg1, int arg2) {
        if (arg1 != -16) {
            field4432 = null;
        }
        field4437++;
        return -1;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
    public static final void method1941(int arg0) {
        field4426++;
        class382.method2332((byte) -9);
        if (arg0 != -10304) {
            field4432 = null;
        }
        class110.method675(19315);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIBII)V")
    public static final void method1942(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg4 >= arg0) {
            for (int var5 = arg0; var5 < arg4; var5++) {
                class339.field4800[var5][arg3] = arg1;
            }
        } else {
            for (int var6 = arg4; var6 < arg0; var6++) {
                class339.field4800[var6][arg3] = arg1;
            }
        }
        if (arg2 < -55) {
            field4438++;
        }
    }
}
