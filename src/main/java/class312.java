import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class312 {

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Ljf;")
    private static class229 field5245 = class212.method1457((byte) 96, "M");

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Z")
    public static boolean field5250 = false;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Ljf;")
    public static class229 field5240 = field5245;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Ljf;")
    public static class229 field5252 = field5245;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Ljf;")
    public static class229 field5248 = class212.method1457((byte) 68, "zap");

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field5253 = 0;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public int field5239;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public int field5241;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public int field5251;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public int field5255;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Lnf;")
    public static class67 field5244;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "[[[Llf;")
    public static class125[][][] field5246;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lek;Z)V", line = 5)
    public static final void method2112(class185 arg0, boolean arg1) {
        field5254++;
        class70.field1335 = arg0;
        if (!arg1) {
            field5246 = (class125[][][]) ((class125[][][]) null);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 16)
    public static void method2113(int arg0) {
        field5245 = null;
        if (arg0 != 21768) {
            method2114(18, (Component) null);
        }
        field5252 = null;
        field5248 = null;
        field5244 = null;
        field5246 = (class125[][][]) null;
        field5240 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 44)
    public static final void method2114(int arg0, Component arg1) {
        field5243++;
        arg1.addMouseListener(class301.field5117);
        if (arg0 != -7767) {
            method2112((class185) null, true);
        }
        arg1.addMouseMotionListener(class301.field5117);
        arg1.addFocusListener(class301.field5117);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIII)V", line = 70)
    public static final void method2115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5249++;
        if (arg2 >= 0 && arg3 >= 0 && arg2 < 103 && arg3 < 103) {
            if (arg4 == 0) {
                class167 var8 = class20.method196(arg7, arg2, arg3);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field2860 >>> 32);
                    if (arg1 == 2) {
                        var8.field2865 = new class20(var9, 2, arg0 + 4, arg7, arg2, arg3, arg5, false, var8.field2865);
                        var8.field2874 = new class20(var9, 2, arg0 + 1 & 0x3, arg7, arg2, arg3, arg5, false, var8.field2874);
                    } else {
                        var8.field2865 = new class20(var9, arg1, arg0, arg7, arg2, arg3, arg5, false, var8.field2865);
                    }
                }
            }
            if (arg4 == 1) {
                class232 var10 = class185.method1283(arg7, arg2, arg3);
                if (var10 != null) {
                    int var11 = (int) (var10.field4027 >>> 32) & Integer.MAX_VALUE;
                    if (arg1 == 4 || arg1 == 5) {
                        var10.field4016 = new class20(var11, 4, arg0, arg7, arg2, arg3, arg5, false, var10.field4016);
                    } else if (arg1 == 6) {
                        var10.field4016 = new class20(var11, 4, arg0 + 4, arg7, arg2, arg3, arg5, false, var10.field4016);
                    } else if (arg1 == 7) {
                        var10.field4016 = new class20(var11, 4, (arg0 + 2 & 0x3) + 4, arg7, arg2, arg3, arg5, false, var10.field4016);
                    } else if (arg1 == 8) {
                        var10.field4016 = new class20(var11, 4, arg0 + 4, arg7, arg2, arg3, arg5, false, var10.field4016);
                        var10.field4028 = new class20(var11, 4, (arg0 + 2 & 0x3) + 4, arg7, arg2, arg3, arg5, false, var10.field4028);
                    }
                }
            }
            if (arg4 == 2) {
                if (arg1 == 11) {
                    arg1 = 10;
                }
                class104 var12 = class282.method1983(arg7, arg2, arg3);
                if (var12 != null) {
                    var12.field1806 = new class20((int) (var12.field1814 >>> 32) & Integer.MAX_VALUE, arg1, arg0, arg7, arg2, arg3, arg5, false, var12.field1806);
                }
            }
            if (arg4 == 3) {
                class143 var13 = class267.method1880(arg7, arg2, arg3);
                if (var13 != null) {
                    var13.field2480 = new class20((int) (var13.field2493 >>> 32) & Integer.MAX_VALUE, 22, arg0, arg7, arg2, arg3, arg5, false, var13.field2480);
                }
            }
        }
        if (arg6 != Integer.MAX_VALUE) {
            field5245 = (class229) null;
        }
    }
}
