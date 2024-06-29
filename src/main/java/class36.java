import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class36 extends class324 {

    @OriginalMember(owner = "client!vba", name = "j", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!vba", name = "l", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!vba", name = "o", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!vba", name = "m", descriptor = "J")
    public long field401;

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "Lvba;")
    public class36 field399;

    @OriginalMember(owner = "client!vba", name = "n", descriptor = "Lvba;")
    public class36 field402;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)I")
    public static final int method197(int arg0, int arg1) {
        return class136.field1696 == null ? 0 : class136.field1696[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;IZIIZIJ)V")
    public static final void method198(boolean arg0, String arg1, int arg2, String arg3, int arg4, boolean arg5, int arg6, int arg7, boolean arg8, int arg9, long arg10) {
        field400++;
        if (!class600.field8764 && class111.field1359 < 500) {
            int var12 = arg4 == -1 ? class595.field8697 : arg4;
            class631 var13 = new class631(arg3, arg1, var12, arg9, arg2, arg10, arg7, arg6, arg0, arg8);
            class436.field6487.method706(var13, arg5);
            class111.field1359++;
        }
    }

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "(I)V")
    public final void method199(int arg0) {
        field398++;
        if (this.field402 == null) {
            return;
        }
        this.field402.field399 = this.field399;
        this.field399.field402 = this.field402;
        this.field402 = null;
        if (arg0 > -28) {
            this.field402 = null;
        }
        this.field399 = null;
    }

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "(I)Z")
    public final boolean method200(int arg0) {
        field403++;
        if (arg0 != 0) {
            this.method199(61);
        }
        return this.field402 != null;
    }
}
