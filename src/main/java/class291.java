import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class291 {

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "[I")
    public static int[] field4475 = new int[2048];

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field4476 = 0;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "[I")
    public static int[] field4479 = new int[1000];

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4480 = new String[1000];

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "[I")
    public static int[] field4474;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIILth;)V", line = 15)
    public static final void method2007(int arg0, int arg1, int arg2, class270 arg3) {
        if (arg3.field4707 == arg0 && arg0 != -1) {
            class28 var4 = client.method1010(arg0, (byte) 127);
            int var5 = var4.field335;
            if (var5 == 1) {
                arg3.field4724 = 0;
                arg3.field4727 = 0;
                arg3.field4699 = 0;
                arg3.field4685 = 1;
                arg3.field4684 = arg1;
                class146.method1105(arg3.field4727, class39.field575 == arg3, 6924, arg3.field4731, var4, arg3.field4713);
            }
            if (var5 == 2) {
                arg3.field4724 = 0;
            }
        } else if (arg0 == -1 || arg3.field4707 == -1 || client.method1010(arg0, (byte) 106).field314 >= client.method1010(arg3.field4707, (byte) 121).field314) {
            arg3.field4694 = arg3.field4716;
            arg3.field4724 = 0;
            arg3.field4707 = arg0;
            arg3.field4685 = 1;
            arg3.field4684 = arg1;
            arg3.field4699 = 0;
            arg3.field4727 = 0;
            if (arg3.field4707 != -1) {
                class146.method1105(arg3.field4727, class39.field575 == arg3, 6924, arg3.field4731, client.method1010(arg3.field4707, (byte) 114), arg3.field4713);
            }
        }
        if (arg2 > 0) {
            field4480 = (String[]) null;
        }
        field4478++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIII)V", line = 71)
    public static final void method2008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4477++;
        class279[] var7 = class118.field1837;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class279 var9 = var7[var8];
            if (var9 != null && var9.field4338 == 2) {
                class206.method1484((var9.field4331 - class327.field5054 << 7) + var9.field4339, arg2 >> 1, (var9.field4334 - class293.field4522 << 7) + var9.field4332, arg3, -28, var9.field4326 * 2, arg1 >> 1, arg0);
                if (class335.field5220 > -1 && class233.field3542 % 20 < 10) {
                    class320.field4949[var9.field4337].method124(arg5 + class335.field5220 - 12, arg4 + -28 + class205.field3138);
                }
            }
        }
        if (arg6 != -28) {
            field4479 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 101)
    public static void method2009(int arg0) {
        if (arg0 >= 79) {
            field4475 = null;
            field4474 = null;
            field4480 = null;
            field4479 = null;
        }
    }
}
