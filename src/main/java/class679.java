import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class679 {

    @OriginalMember(owner = "client!aja", name = "f", descriptor = "Lrn;")
    public static class633 field8786 = new class633(31, 2);

    @OriginalMember(owner = "client!aja", name = "h", descriptor = "F")
    public static float field8788;

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "I")
    public static int field8782;

    @OriginalMember(owner = "client!aja", name = "c", descriptor = "I")
    public static int field8783;

    @OriginalMember(owner = "client!aja", name = "d", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!aja", name = "e", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!aja", name = "g", descriptor = "I")
    public static int field8787;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "Lnl;")
    public static class394 field8781;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(I)V", line = 5)
    public static final void method3652(int arg0) {
        if (arg0 != -1) {
            field8788 = -1.8091578F;
        }
        class699.field9263.method991(class384.field4802);
        field8784++;
        class699.field9263.method967(class369.field4522, class342.field4197, class482.field6222, class473.field6158);
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(IILaca;ZLaca;)I", line = 18)
    public static final int method3653(int arg0, int arg1, class230 arg2, boolean arg3, class230 arg4) {
        field8785++;
        if (arg1 == 1) {
            int var5 = arg4.field2468;
            int var6 = arg2.field2468;
            if (!arg3) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg1 == 2) {
            return class536.method2930(arg4.method1475((byte) 105).field5419, class496.field6338, arg2.method1475((byte) 78).field5419, arg0 - 4);
        } else if (arg1 == 3) {
            if (arg4.field3100.equals("-")) {
                if (arg2.field3100.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field3100.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class536.method2930(arg4.field3100, class496.field6338, arg2.field3100, 0);
            }
        } else if (arg0 == arg1) {
            if (arg4.method1212((byte) -45)) {
                return arg2.method1212((byte) -18) ? 0 : 1;
            } else if (arg2.method1212((byte) -74)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 5) {
            if (arg4.method1214(18979)) {
                return arg2.method1214(arg0 + 18975) ? 0 : 1;
            } else if (arg2.method1214(18979)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 6) {
            if (arg4.method1209(4)) {
                return arg2.method1209(4) ? 0 : 1;
            } else if (arg2.method1209(4)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 7) {
            if (arg4.method1211((byte) 104)) {
                return arg2.method1211((byte) 51) ? 0 : 1;
            } else if (arg2.method1211((byte) 107)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 8) {
            int var7 = arg4.field3099;
            int var8 = arg2.field3099;
            if (arg3) {
                if (var7 == 1000) {
                    var7 = -1;
                }
                if (var8 == 1000) {
                    var8 = -1;
                }
            } else {
                if (var8 == -1) {
                    var8 = 1000;
                }
                if (var7 == -1) {
                    var7 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg4.field3102 - arg2.field3102;
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(III)I", line = 115)
    public static final int method3654(int arg0, int arg1, int arg2) {
        field8782++;
        int var3 = arg1 - 1 & arg0 >> 31;
        if (arg2 != -4595) {
            field8788 = -0.33108342F;
        }
        return (arg0 + (arg0 >>> 31)) % arg1 + var3;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(Luaa;I)Luaa;", line = 129)
    public static final class391 method3655(class391 arg0, int arg1) {
        field8787++;
        if (arg0.field5136 != -1) {
            return class738.method4006(arg1 + 13, arg0.field5136);
        }
        int var2 = arg0.field5151 >>> 16;
        class555 var3 = new class555(class149.field1895);
        if (arg1 != 0) {
            return null;
        }
        for (class278 var4 = (class278) var3.method3015(-68); var4 != null; var4 = (class278) var3.method3017(-1)) {
            if (var4.field3617 == var2) {
                return class738.method4006(21, (int) var4.field4108);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "(I)V", line = 160)
    public static void method3656(int arg0) {
        if (arg0 == -9) {
            field8781 = null;
            field8786 = null;
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(IIZ)V", line = 171)
    public static final void method3657(int arg0, int arg1, boolean arg2) {
        class774.field10556 = arg1 - class402.field5347;
        class490.field6304 = arg0 - class402.field5357;
        field8783++;
        if (!arg2) {
            method3652(-110);
        }
    }
}
