import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class20 extends class426 {

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "I")
    public int field271 = 1;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "Lwl;")
    public static class452 field270 = new class452(52, 3);

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "[I")
    public static int[] field272 = new int[50];

    @OriginalMember(owner = "client!tj", name = "S", descriptor = "Lwl;")
    public static class452 field273 = new class452(30, 4);

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "C")
    public char field265;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!tj", name = "T", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!tj", name = "U", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!tj", name = "V", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!tj", name = "W", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V")
    public static final void method124(int arg0, int arg1, int arg2) {
        field268++;
        class32 var3 = class136.method854(12, (byte) 97, arg1);
        var3.method194(false);
        if (arg2 <= -29) {
            var3.field404 = arg0;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Lfc;")
    public static final class228 method125(int arg0, int arg1) {
        field269++;
        class228 var2 = (class228) class251.field3762.method1491((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class236.field3543.method823(arg1, -20334, arg0);
        class228 var4 = new class228();
        var4.field3447 = arg0;
        if (var3 != null) {
            var4.method1378(0, new class385(var3));
        }
        var4.method1382((byte) -34);
        class251.field3762.method1488(arg1 ^ 0xA4, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILwg;)V")
    public static final void method126(int arg0, class37 arg1) {
        if (arg0 != -294) {
            method124(-38, -105, -57);
        }
        field275++;
        class196.field2966 = arg1;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLef;)V")
    public final void method127(byte arg0, class385 arg1) {
        while (true) {
            int var3 = arg1.method2343(255);
            if (var3 == 0) {
                field266++;
                if (arg0 <= 45) {
                    field270 = null;
                    return;
                }
                return;
            }
            this.method129(0, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V")
    public static final void method128(boolean arg0) {
        class437.field6425++;
        class177.method1082(class198.field3000, 0);
        if (arg0) {
            method125(115, -77);
        }
        field274++;
        class189.field2840.method2377(class28.field361, -35);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILef;)V")
    private final void method129(int arg0, int arg1, class385 arg2) {
        field267++;
        if (arg1 == 1) {
            this.field265 = class398.method2517(arg2.method2341((byte) 54), (byte) -106);
        } else if (arg1 == 2) {
            this.field271 = 0;
        }
        if (arg0 != 0) {
            this.field265 = '|';
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
    public static final void method130(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field276++;
        class145 var15;
        if (arg1 >= 0) {
            int var14 = arg1 - 1;
            var15 = class170.field2626[var14];
        } else {
            int var16 = -arg1 - 1;
            if (class386.field5703 == var16) {
                var15 = class113.field1500;
            } else {
                var15 = class140.field1883[var16];
            }
        }
        if (var15 == null) {
            return;
        }
        class85 var17 = class411.method2575(0, arg9);
        int var18;
        int var19;
        if (arg13 == 1 || arg13 == 3) {
            var19 = var17.field1122;
            var18 = var17.field1197;
        } else {
            var18 = var17.field1122;
            var19 = var17.field1197;
        }
        int var20 = (var19 >> 1) + arg12;
        int var21 = (var19 + 1 >> 1) + arg12;
        int var22 = (var18 >> 1) + arg11;
        int var23 = (var18 + 1 >> 1) + arg11;
        class143 var24 = class307.field4638[arg5];
        int var25 = var24.method92(var20, var22) - (-var24.method92(var21, var22) - var24.method92(var20, var23)) + var24.method92(var21, var23) >> 2;
        class38 var26 = new class38();
        if (arg2 <= 122) {
            field273 = null;
        }
        var26.field454 = arg13;
        var26.field472 = arg12;
        if (arg0 < arg3) {
            int var27 = arg3;
            arg3 = arg0;
            arg0 = var27;
        }
        var26.field461 = arg9;
        var26.field453 = arg11;
        var26.field470 = var15.field1902;
        var26.field455 = arg10;
        var26.field466 = class26.field332 + arg7;
        var26.field471 = class26.field332 + arg6;
        var26.field459 = arg3 + arg12;
        var26.field457 = arg0 + arg12;
        if (arg8 > arg4) {
            int var28 = arg8;
            arg8 = arg4;
            arg4 = var28;
        }
        var26.field463 = arg4 + arg11;
        var26.field465 = arg11 + arg8;
        var26.field464 = var26.field472 * 128 + var19 * 64;
        var26.field473 = var26.field453 * 128 + (var18 * 64);
        var26.field460 = var25;
        class362.field5331.method2504(42, var26);
        var15.field2016 = var26;
    }

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "(I)V")
    public static void method131(int arg0) {
        field272 = null;
        field270 = null;
        field273 = null;
        if (arg0 <= 90) {
            field270 = null;
        }
    }
}
