import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class39 {

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public int field604 = -1;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public int field598 = -1;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field601 = 4;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "[F")
    public static float[] field603 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "D")
    public static double field602;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "[I")
    public static int[] field599;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "[I")
    public int[] field600;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLsl;)V")
    public final void method236(byte arg0, class461 arg1) {
        while (true) {
            int var3 = arg1.method2600((byte) -127);
            if (var3 == 0) {
                if (arg0 != -40) {
                    method238(127);
                }
                field608++;
                return;
            }
            this.method239(arg1, (byte) -60, var3);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIILbi;)Lbaa;")
    public static final class525 method237(int arg0, int arg1, int arg2, int arg3, int arg4, class483 arg5) {
        field607++;
        if (arg2 != 34037) {
            field601 = -13;
        }
        if (!arg5.field6875 && (!class54.method400(5533, arg4) || !class54.method400(5533, arg0))) {
            return arg5.field6880 ? new class525(arg5, 34037, arg3, arg1, arg4, arg0, true) : new class525(arg5, arg3, arg1, arg4, arg0, class565.method3253(86, arg4), class565.method3253(-82, arg0), true);
        } else {
            return new class525(arg5, 3553, arg3, arg1, arg4, arg0, true);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method238(int arg0) {
        field599 = null;
        field603 = null;
        if (arg0 > -122) {
            field602 = -0.3693840474394969D;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lsl;BI)V")
    private final void method239(class461 arg0, byte arg1, int arg2) {
        field596++;
        if (arg2 == 1) {
            this.field598 = arg0.method2566(-2);
        } else if (arg2 == 2) {
            this.field600 = new int[arg0.method2600((byte) -128)];
            for (int var4 = 0; var4 < this.field600.length; var4++) {
                this.field600[var4] = arg0.method2566(-2);
            }
        } else if (arg2 == 3) {
            this.field604 = arg0.method2600((byte) -126);
        }
        if (arg1 >= -36) {
            this.field604 = -52;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZIII)Lkp;")
    public static final class491 method240(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg4 <= 101) {
            method238(-56);
        }
        field606++;
        class491 var5 = new class491();
        var5.field6978 = arg2;
        var5.field6976 = arg3;
        class290.field3804.method1153(var5, (long) arg0, -1);
        class423.method2354(arg2, (byte) -58);
        class288 var6 = class501.method2936(-77, arg0);
        if (var6 != null) {
            class207.method1332((byte) -122, var6);
        }
        if (class345.field4361 != null) {
            class207.method1332((byte) -102, class345.field4361);
            class345.field4361 = null;
        }
        class533.method3063(4);
        if (var6 != null) {
            class236.method1483(var6, -1, !arg1);
        }
        if (!arg1) {
            class188.method1270(arg2);
        }
        if (!arg1 && class540.field7482 != -1) {
            class1.method1(1, class540.field7482, (byte) 13);
        }
        return var5;
    }
}
