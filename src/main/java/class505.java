import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class505 extends class417 {

    @OriginalMember(owner = "client!eba", name = "n", descriptor = "Lica;")
    public class571 field7148;

    @OriginalMember(owner = "client!eba", name = "i", descriptor = "I")
    public static int field7143 = -1;

    @OriginalMember(owner = "client!eba", name = "l", descriptor = "Lada;")
    public static class144 field7146 = new class144(56, 4);

    @OriginalMember(owner = "client!eba", name = "j", descriptor = "F")
    public static float field7144;

    @OriginalMember(owner = "client!eba", name = "k", descriptor = "I")
    public static int field7145;

    @OriginalMember(owner = "client!eba", name = "m", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZLcu;Lcu;II)I", line = 3)
    public static final int method2998(boolean arg0, class187 arg1, class187 arg2, int arg3, int arg4) {
        field7145++;
        if (arg4 == 1) {
            int var5 = arg1.field5525;
            int var6 = arg2.field5525;
            if (!arg0) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return class502.method2990(arg2.method1290(-22585).field4263, class63.field795, arg1.method1290(-22585).field4263, 5168);
        } else if (arg4 == 3) {
            if (arg1.field2789.equals("-")) {
                if (arg2.field2789.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field2789.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class502.method2990(arg2.field2789, class63.field795, arg1.field2789, 5168);
            }
        } else if (arg4 == 4) {
            if (arg1.method2376((byte) -92)) {
                return arg2.method2376((byte) -92) ? 0 : 1;
            } else if (arg2.method2376((byte) -92)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 5) {
            if (arg1.method2379((byte) 122)) {
                return arg2.method2379((byte) 126) ? 0 : 1;
            } else if (arg2.method2379((byte) 120)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 6) {
            if (arg1.method2373(508065)) {
                return arg2.method2373(508065) ? 0 : 1;
            } else if (arg2.method2373(508065)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 >= -32) {
            return 56;
        } else if (arg4 == 7) {
            if (arg1.method2377(0)) {
                return arg2.method2377(0) ? 0 : 1;
            } else if (arg2.method2377(0)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 8) {
            int var7 = arg1.field2787;
            int var8 = arg2.field2787;
            if (arg0) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg1.field2784 - arg2.field2784;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Ljava/lang/String;Llp;ZZI)V", line = 107)
    public static final void method2999(String arg0, class331 arg1, boolean arg2, boolean arg3, int arg4) {
        field7147++;
        if (arg4 != -1) {
            field7144 = -0.90589905F;
        }
        if (!arg2) {
            class586.method3484(3, arg1, 0, arg0);
            return;
        }
        if (class331.field4577.startsWith("win") && class331.field4576 != 3) {
            String var5 = null;
            if (arg1.field4568 != null) {
                var5 = arg1.field4568.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class21 var6 = class586.method3484(0, arg1, 0, arg0);
                class397.field5459 = var6;
                class99.field1449 = arg0;
                class623.field9178 = arg1;
                return;
            }
        }
        if (class331.field4577.startsWith("mac")) {
            String var7 = null;
            if (arg1.field4568 != null) {
                var7 = arg1.field4568.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg3) {
                class586.method3484(1, arg1, 0, arg0);
                return;
            }
        }
        class586.method3484(2, arg1, 0, arg0);
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lica;)V", line = 180)
    public class505(class571 arg0) {
        this.field7148 = arg0;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V", line = 192)
    public static void method3000(int arg0) {
        int var1 = -96 % ((arg0 - 3) / 49);
        field7146 = null;
    }
}
