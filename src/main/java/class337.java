import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class337 {

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "Lfs;")
    public static class552 field4760 = new class552(64);

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
    public static final void method2145(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4759++;
        class391 var8 = new class391();
        var8.field5467 = arg4;
        var8.field5458 = arg0;
        var8.field5457 = arg5;
        var8.field5462 = class605.field8787 + arg2;
        var8.field5461 = arg7;
        var8.field5465 = arg1;
        if (arg6 != -24463) {
            method2148(-69, -53, null, -59);
        }
        var8.field5463 = arg3;
        class99.field1678.method4152(var8, 0);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZLeq;IIIII)V")
    public static final void method2146(boolean arg0, class209 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 < arg4) {
            class432.field6038 = null;
            class577.field8167 = arg1;
            class731.field10231 = 1;
            class382.field5353 = arg2;
            class407.field5673 = arg0;
            class463.field6664 = arg3;
            class107.field1766 = arg5;
            class241.field3390 = class284.field4029.method1695(-61) / arg4;
            if (class241.field3390 < 1) {
                class241.field3390 = 1;
            }
        } else {
            class348.method2182(arg2, arg3, arg0, arg1, arg5, false);
        }
        field4761++;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
    public static void method2147(byte arg0) {
        field4760 = null;
        if (arg0 >= -67) {
            method2148(-77, -66, null, 78);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IILeq;I)Lww;")
    public static final class729 method2148(int arg0, int arg1, class209 arg2, int arg3) {
        field4758++;
        if (arg0 != -14907) {
            method2145(null, 121, -87, -27, -91, -92, -82, 54);
        }
        byte[] var4 = arg2.method1453(arg3, -124, arg1);
        return var4 == null ? null : new class729(var4);
    }
}
