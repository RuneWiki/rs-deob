import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class731 extends class651 {

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
    public int field10137;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
    public int field10134;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
    public int field10132;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
    public int field10135;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
    public int field10136;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "I")
    public int field10138;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "Lmga;")
    public static class739 field10130 = new class739(47, 3);

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
    public static int field10140 = -1;

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "Lml;")
    public static class410 field10142 = new class410("", 11);

    @OriginalMember(owner = "client!gn", name = "A", descriptor = "I")
    public static int field10143 = 0;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
    public static int field10131;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
    public static int field10133;

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
    public static int field10139;

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "Lib;")
    public static class164 field10141;

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lur;Lcf;IIIIIIIIIIIII)V")
    public class731(class564 arg0, class631 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field10137 = arg11;
        this.field10134 = arg9;
        this.field10132 = arg10;
        this.field10135 = arg12;
        this.field10136 = arg14;
        this.field10138 = arg13;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
    public static void method4056(int arg0) {
        field10142 = null;
        field10141 = null;
        field10130 = null;
        if (arg0 < 54) {
            method4057((byte) 2, null);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLha;)V")
    public static final void method4057(byte arg0, class65 arg1) {
        for (class663 var2 = (class663) class270.field3980.method109(0); var2 != null; var2 = (class663) class270.field3980.method115((byte) 50)) {
            if (var2.field9171) {
                var2.method3663(arg1);
            }
        }
        if (arg0 >= 63) {
            field10133++;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)Lhv;")
    public class546 method1557(byte arg0) {
        field10139++;
        return arg0 >= -35 ? null : class10.field159;
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)Lkf;")
    public static final class267 method4058(int arg0) {
        field10131++;
        class267 var1 = class47.method366(-2);
        var1.field3933 = 0;
        var1.field3937 = null;
        var1.field3938 = new class315(5000);
        int var2 = -99 % ((6 - arg0) / 32);
        return var1;
    }
}
