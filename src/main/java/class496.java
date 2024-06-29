import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class496 extends class108 {

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Luv;")
    public static class3 field6913 = new class3(60, -1);

    @OriginalMember(owner = "client!of", name = "p", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field6915 = new Hashtable();

    @OriginalMember(owner = "client!of", name = "r", descriptor = "Z")
    public static boolean field6917 = false;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Luv;")
    public static class3 field6918 = new class3(35, -1);

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field6910;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public int field6912;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public int field6914;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIBFFFII[FIIII)V")
    public static final void method2783(int arg0, int arg1, byte arg2, float arg3, float arg4, float arg5, int arg6, int arg7, float[] arg8, int arg9, int arg10, int arg11, int arg12) {
        int var13 = -2 / ((arg2 - 10) / 54);
        int var14 = arg12 - arg7;
        field6911++;
        int var15 = arg1 - arg6;
        int var16 = arg11 - arg10;
        float var17 = arg8[2] * (float) var16 + arg8[0] * (float) var15 + arg8[1] * (float) var14;
        float var18 = arg8[5] * (float) var16 + arg8[3] * (float) var15 + arg8[4] * (float) var14;
        float var19 = arg8[8] * (float) var16 + arg8[6] * (float) var15 + arg8[7] * (float) var14;
        float var20;
        float var21;
        if (arg0 == 0) {
            var21 = arg3 + var17 + 0.5F;
            var20 = arg4 + 0.5F - var19;
        } else if (arg0 == 1) {
            var21 = arg3 + var17 + 0.5F;
            var20 = arg4 + var19 + 0.5F;
        } else if (arg0 == 2) {
            var20 = arg5 + 0.5F - var18;
            var21 = arg3 + 0.5F - var17;
        } else if (arg0 == 3) {
            var21 = arg3 + var17 + 0.5F;
            var20 = arg5 + 0.5F - var18;
        } else if (arg0 == 4) {
            var20 = arg5 + 0.5F - var18;
            var21 = arg4 + var19 + 0.5F;
        } else {
            var21 = arg4 + 0.5F - var19;
            var20 = arg5 + 0.5F - var18;
        }
        if (arg9 == 1) {
            float var23 = var21;
            var21 = -var20;
            var20 = var23;
        } else if (arg9 == 2) {
            var20 = -var20;
            var21 = -var21;
        } else if (arg9 == 3) {
            float var22 = var21;
            var21 = var20;
            var20 = -var22;
        }
        class261.field3261 = var20;
        class248.field3121 = var21;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static void method2784(byte arg0) {
        field6913 = null;
        if (arg0 != -127) {
            field6916 = 29;
        }
        field6915 = null;
        field6918 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIILjc;)V")
    public static final void method2785(int arg0, int arg1, int arg2, class585 arg3) {
        if (arg3.field368 == arg1 && arg1 != -1) {
            class320 var4 = class609.field8754.method535(arg1, true);
            int var5 = var4.field4419;
            if (var5 == 1) {
                arg3.field328 = 0;
                arg3.field363 = 0;
                arg3.field356 = 1;
                arg3.field391 = arg0;
                arg3.field376 = 0;
                class627.method3629(arg3.field6368, false, var4, arg3.field376, arg3.field6358, (byte) -125, arg3.field6362);
            }
            if (var5 == 2) {
                arg3.field363 = 0;
            }
        } else if (arg1 == -1 || arg3.field368 == -1 || class609.field8754.method535(arg1, true).field4430 >= class609.field8754.method535(arg3.field368, true).field4430) {
            arg3.field424 = arg3.field421;
            arg3.field368 = arg1;
            arg3.field363 = 0;
            arg3.field356 = 1;
            arg3.field376 = 0;
            arg3.field391 = arg0;
            arg3.field328 = 0;
            if (arg3.field368 != -1) {
                class627.method3629(arg3.field6368, false, class609.field8754.method535(arg3.field368, true), arg3.field376, arg3.field6358, (byte) -121, arg3.field6362);
            }
        }
        if (arg2 != -3) {
            method2786(63);
        }
        field6910++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static final void method2786(int arg0) {
        if (arg0 != 24489) {
            method2785(38, 122, -124, null);
        }
        field6909++;
        class318.field4398.method315(1);
    }
}
