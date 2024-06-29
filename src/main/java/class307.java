import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class307 {

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field4391 = 0;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "[I")
    public static int[] field4395 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field4396 = 0;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public static int field4398 = 0;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "Z")
    public static boolean field4399 = true;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(CI)Z")
    public static final boolean method1920(char arg0, int arg1) {
        if (arg1 >= -127) {
            return true;
        } else {
            field4394++;
            return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V")
    public static final void method1921(boolean arg0) {
        for (class389 var1 = (class389) class268.field3774.method1604((byte) 67); var1 != null; var1 = (class389) class268.field3774.method1612(-1)) {
            var1.method2487();
        }
        if (arg0) {
            method1920((char) 65518, 55);
        }
        field4397++;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
    public static void method1922(int arg0) {
        if (arg0 == -12243) {
            field4395 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
    public static final void method1923(int arg0) {
        class266.method1695(25, (byte) 122);
        field4393++;
        class105.method569(2659);
        if (arg0 > -90) {
            method1924(-46, -26, -8, 9, -66, 66, 6);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1924(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4390++;
        int var7 = arg6 - arg1;
        int var8 = arg1 + arg3;
        for (int var9 = arg3; var9 < var8; var9++) {
            class105.method564(arg0, arg2, 0, class318.field4522[var9], arg4);
        }
        int var10 = arg4 - arg1;
        for (int var11 = arg6; var11 > var7; var11--) {
            class105.method564(arg0, arg2, 0, class318.field4522[var11], arg4);
        }
        if (arg5 != 34) {
            return;
        }
        int var12 = arg1 + arg2;
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class318.field4522[var13];
            class105.method564(arg0, arg2, arg5 ^ 0x22, var14, var12);
            class105.method564(arg0, var10, 0, var14, arg4);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lra;ILra;)V")
    public static final void method1925(class57 arg0, int arg1, class57 arg2) {
        class349.field5105 = arg0;
        class327.field4667 = arg2;
        field4392++;
        if (arg1 != 95) {
            field4395 = null;
        }
        class327.field4667.method352(34, (byte) -75);
    }
}
