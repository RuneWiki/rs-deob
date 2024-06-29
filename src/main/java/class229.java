import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class229 {

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "J")
    public long field4094 = 0L;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Lcf;")
    public static class93 field4098 = class147.method1066("Texturen geladen)3", -48);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public int field4095;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public int field4096;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public int field4099;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public int field4100;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public int field4102;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public int field4103;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public int field4106;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public int field4107;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public int field4108;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public int field4109;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public int field4110;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Lhg;")
    public static class177 field4097;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Lhg;")
    public static class177 field4105;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Lgl;")
    public class211 field4104;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static void method1574(int arg0) {
        if (arg0 == 5) {
            field4105 = null;
            field4098 = null;
            field4097 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 7) {
            method1575(-18, 99, -86, -77, 109, -12, -7, 113);
        }
        if (arg0 >= 0 && arg2 >= 0 && arg0 < 103 && arg2 < 103) {
            if (arg4 == 0) {
                class70 var8 = class128.method935(arg5, arg0, arg2);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field1276 >>> 32);
                    if (arg1 == 2) {
                        var8.field1269 = new class178(var9, 2, arg7 + 4, arg5, arg0, arg2, arg3, false, var8.field1269);
                        var8.field1274 = new class178(var9, 2, arg7 + 1 & 0x3, arg5, arg0, arg2, arg3, false, var8.field1274);
                    } else {
                        var8.field1269 = new class178(var9, arg1, arg7, arg5, arg0, arg2, arg3, false, var8.field1269);
                    }
                }
            }
            if (arg4 == 1) {
                class24 var10 = class136.method999(arg5, arg0, arg2);
                if (var10 != null) {
                    int var11 = (int) (var10.field303 >>> 32) & Integer.MAX_VALUE;
                    if (arg1 == 4 || arg1 == 5) {
                        var10.field295 = new class178(var11, 4, arg7, arg5, arg0, arg2, arg3, false, var10.field295);
                    } else if (arg1 == 6) {
                        var10.field295 = new class178(var11, 4, arg7 + 4, arg5, arg0, arg2, arg3, false, var10.field295);
                    } else if (arg1 == 7) {
                        var10.field295 = new class178(var11, 4, (arg7 + 2 & 0x3) + 4, arg5, arg0, arg2, arg3, false, var10.field295);
                    } else if (arg1 == 8) {
                        var10.field295 = new class178(var11, 4, arg7 + 4, arg5, arg0, arg2, arg3, false, var10.field295);
                        var10.field301 = new class178(var11, 4, (arg7 + 2 & 0x3) + 4, arg5, arg0, arg2, arg3, false, var10.field301);
                    }
                }
            }
            if (arg4 == 2) {
                if (arg1 == 11) {
                    arg1 = 10;
                }
                class229 var12 = class112.method803(arg5, arg0, arg2);
                if (var12 != null) {
                    var12.field4104 = new class178(Integer.MAX_VALUE & (int) (var12.field4094 >>> 32), arg1, arg7, arg5, arg0, arg2, arg3, false, var12.field4104);
                }
            }
            if (arg4 == 3) {
                class30 var13 = class136.method997(arg5, arg0, arg2);
                if (var13 != null) {
                    var13.field459 = new class178((int) (var13.field440 >>> 32) & Integer.MAX_VALUE, 22, arg7, arg5, arg0, arg2, arg3, false, var13.field459);
                }
            }
        }
        field4101++;
    }
}
