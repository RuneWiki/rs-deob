import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class85 extends class497 {

    @OriginalMember(owner = "client!qfa", name = "o", descriptor = "I")
    public int field1252;

    @OriginalMember(owner = "client!qfa", name = "p", descriptor = "I")
    public int field1253;

    @OriginalMember(owner = "client!qfa", name = "r", descriptor = "[I")
    public static int[] field1255 = new int[250];

    @OriginalMember(owner = "client!qfa", name = "q", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!qfa", name = "s", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!qfa", name = "n", descriptor = "Ltq;")
    public static class582 field1251;

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)I")
    public static final int method638(int arg0) {
        field1254++;
        if (arg0 != 5395) {
            field1251 = null;
        }
        return class61.field698;
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lor;Lma;IIIIIIIII)V")
    public class85(class594 arg0, class12 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field1252 = arg10;
        this.field1253 = arg9;
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(B)V")
    public static void method639(byte arg0) {
        field1251 = null;
        if (arg0 > -55) {
            method638(74);
        }
        field1255 = null;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)Loh;")
    public final class370 method640(int arg0) {
        if (arg0 == 58) {
            field1256++;
            return class543.field7377;
        } else {
            return null;
        }
    }
}
