import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class11 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Lsi;")
    public static class769 field139 = new class769(32);

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "Lbc;")
    public class11 field145;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lkm;")
    public class208 field143;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "[[B")
    public static byte[][] field142;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)V")
    public static final void method152(byte arg0, int arg1) {
        field144++;
        class766 var2 = class114.field1802.method4254((byte) 8);
        if (arg0 <= 64) {
            field142 = null;
        }
        while (var2 != null) {
            if ((var2.field10592 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method4237(-1);
            }
            var2 = class114.field1802.method4251(-126);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Z")
    public static final boolean method153(int arg0, int arg1) {
        field140++;
        if (arg1 == -2) {
            return arg0 == 0 || arg0 == 1 || arg0 == 2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static void method154(byte arg0) {
        field139 = null;
        field142 = null;
        if (arg0 != 93) {
            method153(-63, 45);
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
    public final void method155(byte arg0) {
        field141++;
        if (class60.field913 >= 500) {
            return;
        }
        this.field143 = null;
        int var2 = -77 / ((55 - arg0) / 50);
        this.field145 = class668.field9391;
        class60.field913++;
        class668.field9391 = this;
    }
}
