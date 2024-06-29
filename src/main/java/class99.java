import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class99 extends class318 {

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1419 = "";

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "Lhn;")
    public static class509 field1416 = new class509(55, 4);

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZ)V")
    public final void method722(int arg0, boolean arg1) {
        ++field1418;
        int var3 = 95 % ((arg0 - -23) / 46);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lav;IB)V")
    public final void method715(class454 arg0, int arg1, byte arg2) {
        super.field4800.method1289(-19391, arg0);
        ++field1417;
        super.field4800.method1248(arg1, true);
        if (arg2 >= -108) {
            field1419 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)V")
    public final void method719(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method718(false, true);
        }
        ++field1420;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)Z")
    public final boolean method721(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field1422;
            return true;
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
    public static void method805(int arg0) {
        field1416 = null;
        field1419 = null;
        if (arg0 != 4) {
            field1416 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)V")
    public final void method723(byte arg0) {
        if (arg0 <= 91) {
            this.method723((byte) -22);
        }
        super.field4800.method1313(97, false);
        ++field1423;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lkd;)V")
    public class99(class188 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZZ)V")
    public final void method718(boolean arg0, boolean arg1) {
        if (arg1) {
            this.method721(37);
        }
        ++field1421;
        super.field4800.method1313(93, true);
    }
}
