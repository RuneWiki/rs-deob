import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RWIDPYKY")
public class class50 extends class55 {

    @OriginalMember(owner = "client!RWIDPYKY", name = "j", descriptor = "Z")
    private boolean field1210 = false;

    @OriginalMember(owner = "client!RWIDPYKY", name = "l", descriptor = "I")
    public int field1212 = 1000;

    @OriginalMember(owner = "client!RWIDPYKY", name = "m", descriptor = "Z")
    public static boolean field1213;

    @OriginalMember(owner = "client!RWIDPYKY", name = "k", descriptor = "[LQHWKYEXN;")
    public class44[] field1211;

    @OriginalMember(owner = "client!RWIDPYKY", name = "a", descriptor = "(IIIIIIIII)V")
    public void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var10 = this.method167(697);
        if (var10 != null) {
            this.field1212 = var10.field1212;
            var10.method234(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!RWIDPYKY", name = "a", descriptor = "(I)LJUQSYEMB;")
    public class22 method167(int arg0) {
        if (arg0 <= 0) {
            this.field1210 = !this.field1210;
        }
        return null;
    }
}
