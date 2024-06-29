import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class34 extends class199 {

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Lah;")
    public class325 field388;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Z")
    public static boolean field386 = false;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field389 = 0;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Lrd;")
    public static class285 field387;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Lgh;")
    public static class476 field391;

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lad;II[B)V")
    public class34(class362 arg0, int arg1, int arg2, byte[] arg3) {
        this.field388 = class108.method677(arg0, arg3, 6406, 6406, arg1, 19124, arg2, false);
        this.field388.method1867(false, 2203, false);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIILmf;Lmf;)V")
    public static final void method190(int arg0, int arg1, int arg2, class356 arg3, class356 arg4) {
        class99 var5 = class290.method1876(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field1175 = arg3;
            var5.field1161 = arg4;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method191(int arg0) {
        field391 = null;
        field387 = null;
        if (arg0 != 6406) {
            field386 = false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
    public static final void method192(int arg0, int arg1, int arg2) {
        class99 var3 = class431.field6408[arg0][arg1][arg2];
        if (var3 != null && var3.field1174 != null) {
            var3.field1174 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IFLqp;FIZIFIFF)[B")
    public static final byte[] method193(int arg0, float arg1, class573 arg2, float arg3, int arg4, boolean arg5, int arg6, float arg7, int arg8, float arg9, float arg10) {
        field392++;
        byte[] var11 = new byte[arg0 * arg6 * arg4];
        if (!arg5) {
            field391 = null;
        }
        class141.method844(arg4, arg9, arg3, arg0, arg7, arg8, arg10, arg1, arg2, 0, var11, (byte) -115, arg6);
        return var11;
    }
}
