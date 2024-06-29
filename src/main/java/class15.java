import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class15 {

    @OriginalMember(owner = "client!we", name = "h", descriptor = "[I")
    public static int[] field443 = new int[128];

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "[I")
    public static int[] field439;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILqk;)Ljc;")
    public static final class229 method107(int arg0, class200 arg1) {
        field437++;
        if (arg0 != -58) {
            method109((class151) null, (byte) -107);
        }
        return new class229(arg1.method1421((byte) -50), arg1.method1421((byte) 118), arg1.method1421((byte) 126), arg1.method1421((byte) -52), arg1.method1421((byte) 117), arg1.method1421((byte) -72), arg1.method1421((byte) 102), arg1.method1421((byte) 125), arg1.method1405(-3), arg1.method1408((byte) -123));
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)Ljd;")
    public static final class86 method108(boolean arg0, int arg1) {
        field436++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException();
        }
        class86 var2 = new class86();
        var2.field1704 = 1;
        var2.field1670 = new byte[1];
        if (arg0) {
            return null;
        } else {
            var2.field1670[0] = (byte) arg1;
            return var2;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lbj;B)Z")
    public static final boolean method109(class151 arg0, byte arg1) {
        if (arg1 < 12) {
            field439 = null;
        }
        field438++;
        return arg0.method1096(-106, class22.field557);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)Z")
    public static final boolean method110(int arg0, byte arg1) {
        field441++;
        if (arg1 == -119) {
            return arg0 >= 48 && arg0 <= 57;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
    public static final void method111(int arg0, int arg1) {
        class81.field1592.method693(6, arg0);
        field440++;
        if (arg1 != -256) {
            method108(true, 126);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method112(int arg0) {
        if (arg0 != -1) {
            method108(true, -90);
        }
        field443 = null;
        field439 = null;
    }
}
