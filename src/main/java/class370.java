import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class370 implements class695 {

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Ljava/lang/String;")
    public String field5273;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public int field5277;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "Lfw;")
    public class52 field5275;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public int field5270;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public int field5274;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Ldg;")
    public class377 field5272;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public int field5271;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "Lpj;")
    public static class132 field5276;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
    public static void method2167(int arg0) {
        field5276 = null;
        if (arg0 != -11570) {
            field5276 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)Lhs;")
    public final class295 method52(int arg0) {
        if (arg0 != -14151) {
            this.field5275 = null;
        }
        field5269++;
        return class539.field7316;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Ljava/lang/String;Lfw;Ldg;IIII)V")
    public class370(String arg0, class52 arg1, class377 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5273 = arg0;
        this.field5277 = arg4;
        this.field5275 = arg1;
        this.field5270 = arg3;
        this.field5274 = arg6;
        this.field5272 = arg2;
        this.field5271 = arg5;
    }
}
