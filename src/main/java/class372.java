import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class372 {

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Lsl;")
    public static class318 field5528 = new class318(19, 2);

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Lbg;")
    public static class324 field5529 = new class324(18, 1);

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "[F")
    public static float[] field5531 = new float[16384];

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "[F")
    public static float[] field5530 = new float[16384];

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Lpk;")
    public static class133 field5532;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
    public static final void method2294(int arg0, int arg1) {
        if (field5534 == 0) {
            class77.field1041.method2798(true, arg0);
        } else {
            class498.field7403 = arg0;
        }
        if (arg1 < 68) {
            method2297(-26);
        }
        field5526++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)I")
    public static final int method2295(int arg0, byte arg1) {
        field5525++;
        if (arg1 != -98) {
            field5534 = -17;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!bf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5524++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5527++;
        if (arg3 != 255) {
            method2297(33);
        }
        if (arg1 < 1 || arg7 < 1 || (class397.field5828 - 2) < arg1 || arg7 > class457.field6713 - 2) {
            return;
        }
        int var9 = arg0;
        if (arg0 < 3 && class274.method1765(arg1, -29792, arg7)) {
            var9 = arg0 + 1;
        }
        if (!class478.field7044.method2072(class65.field802, 111) && !class389.method2392(arg1, class51.field575, (byte) 56, var9, arg7)) {
            return;
        }
        if (class422.field6240 == null) {
            return;
        }
        class283.field4116.method3025(class225.field3300, -4, class455.field6684[arg0], arg8, arg0, arg7, arg1);
        if (arg6 < 0) {
            return;
        }
        boolean var10 = class478.field7044.field3354;
        class478.field7044.field3354 = true;
        class283.field4116.method3029(arg1, arg0, arg5, arg4, arg6, class225.field3300, arg2, arg7, var9, (byte) 28, class455.field6684[arg0]);
        class478.field7044.field3354 = var10;
        return;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(II)V")
    public class372(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static void method2297(int arg0) {
        field5532 = null;
        field5528 = null;
        field5530 = null;
        field5529 = null;
        field5531 = null;
        if (arg0 != -22964) {
            method2294(52, -2);
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5530[var2] = (float) Math.sin((double) var2 * var0);
            field5531[var2] = (float) Math.cos((double) var2 * var0);
        }
        field5534 = 0;
        field5532 = new class133();
    }
}
