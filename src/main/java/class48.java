import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class48 {

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "Ljava/lang/String;")
    public static String field699 = "Allocating memory";

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field701 = 0;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "[I")
    public static int[] field703 = new int[32];

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "[Lmj;")
    public static class115[] field700;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "[Lsi;")
    public static class204[] field696;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)V")
    public static final void method370(int arg0, byte arg1) {
        field702++;
        if (arg0 == -1 || !class90.field1339[arg0]) {
            return;
        }
        class10.field110.method627(arg0, (byte) -61);
        if (class113.field1631[arg0] == null) {
            return;
        }
        boolean var2 = true;
        if (arg1 < 81) {
            field701 = -124;
        }
        for (int var3 = 0; var3 < class113.field1631[arg0].length; var3++) {
            if (class113.field1631[arg0][var3] != null) {
                if (class113.field1631[arg0][var3].field2150 == 2) {
                    var2 = false;
                } else {
                    class113.field1631[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class113.field1631[arg0] = null;
        }
        class90.field1339[arg0] = false;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method371(int arg0) {
        field696 = null;
        if (arg0 != 0) {
            method371(121);
        }
        field700 = null;
        field703 = null;
        field699 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILlc;)V")
    public static final void method372(int arg0, class86 arg1) {
        field697++;
        if (arg0 == 0) {
            class19.field212 = arg1.method619(~arg0, "titlebg");
            class6.field46 = arg1.method619(-1, "logo");
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)I")
    public static final int method373(byte arg0) {
        if (arg0 > -33) {
            return 13;
        } else {
            field698++;
            return 2;
        }
    }
}
