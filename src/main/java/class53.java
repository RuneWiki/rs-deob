import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class53 extends class629 {

    @OriginalMember(owner = "client!cba", name = "B", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "client!cba", name = "D", descriptor = "Llc;")
    public static class435 field834 = null;

    @OriginalMember(owner = "client!cba", name = "A", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!cba", name = "C", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!cba", name = "E", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)Lhr;")
    public final class57 method478(int arg0) {
        if (arg0 <= 30) {
            return null;
        } else {
            field833++;
            return class556.field8079;
        }
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Leda;Lcga;IIIIIIIIIIIIII)V")
    public class53(class14 arg0, class141 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field832 = arg15;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)V")
    public static void method479(byte arg0) {
        field834 = null;
        if (arg0 <= 42) {
            method479((byte) 17);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(BZ)V")
    public static final void method480(byte arg0, boolean arg1) {
        for (class654 var2 = (class654) class451.field6446.method3565(125); var2 != null; var2 = (class654) class451.field6446.method3561((byte) 57)) {
            if (var2.field9375 != null) {
                class593.field8429.method3652(var2.field9375);
                var2.field9375 = null;
            }
            if (var2.field9385 != null) {
                class593.field8429.method3652(var2.field9385);
                var2.field9385 = null;
            }
            var2.method2656((byte) 125);
        }
        field831++;
        if (arg1) {
            for (class654 var3 = (class654) class337.field4661.method3565(118); var3 != null; var3 = (class654) class337.field4661.method3561((byte) 123)) {
                if (var3.field9375 != null) {
                    class593.field8429.method3652(var3.field9375);
                    var3.field9375 = null;
                }
                var3.method2656((byte) 126);
            }
            for (class654 var4 = (class654) class675.field9602.method4023((byte) -66); var4 != null; var4 = (class654) class675.field9602.method4021((byte) 80)) {
                if (var4.field9375 != null) {
                    class593.field8429.method3652(var4.field9375);
                    var4.field9375 = null;
                }
                var4.method2656((byte) 125);
            }
        }
        int var5 = -127 / ((arg0 - 25) / 61);
    }
}
