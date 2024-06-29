import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class250 {

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field4201 = 0;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "Lwa;")
    public static class75 field4206 = class66.method560("(U5", false);

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "Lwa;")
    public static class75 field4202 = class66.method560("", false);

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field4208 = 0;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field4205 = 0;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lja;I)Lbd;", line = 64)
    public static final class291 method1798(class60 arg0, int arg1) {
        if (arg1 == 0) {
            field4209++;
            return new class291(arg0.method487((byte) -63), arg0.method487((byte) -85), arg0.method487((byte) -89), arg0.method487((byte) -72), arg0.method489(-122), arg0.method489(-107), arg0.method501(0));
        } else {
            return (class291) null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 75)
    public static void method1799(byte arg0) {
        field4202 = null;
        if (arg0 != 96) {
            field4206 = (class75) null;
        }
        field4206 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIII)V", line = 102)
    public static final void method1800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class202 var7 = new class202();
        var7.field3409 = arg1 / 128;
        var7.field3403 = arg2 / 128;
        var7.field3407 = arg3 / 128;
        var7.field3402 = arg4 / 128;
        var7.field3401 = arg0;
        var7.field3400 = arg1;
        var7.field3428 = arg2;
        var7.field3413 = arg3;
        var7.field3424 = arg4;
        var7.field3416 = arg5;
        var7.field3419 = arg6;
        class273.field4721[class89.field1466++] = var7;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)V", line = 156)
    public static final void method1801(int arg0, int arg1, int arg2) {
        field4200++;
        class156 var3 = class206.method1525(13, -32701, arg1);
        var3.method1183(true);
        var3.field2665 = arg2;
        if (arg0 != 4056) {
            field4202 = (class75) null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lcb;Lcb;BZ)V", line = 181)
    public static final void method1802(class267 arg0, class267 arg1, byte arg2, boolean arg3) {
        field4207++;
        class233.field3950 = arg0;
        class16.field207 = arg1;
        class221.field3770 = arg3;
        if (arg2 != -65) {
            method1800(105, 86, -72, -85, 83, -64, -41);
        }
    }
}
