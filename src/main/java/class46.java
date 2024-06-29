import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class46 {

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "Lfha;")
    private class522 field668;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field674 = new String[100];

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field672 = new Hashtable();

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "Ltq;")
    private class513 field671;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method310(int arg0, int arg1, int arg2) {
        int var3 = 70 % ((arg2 - 35) / 47);
        field673++;
        if (arg0 >= 1000 && arg1 < 1000) {
            return true;
        } else if (arg0 >= 1000 || arg1 >= 1000) {
            return arg0 >= 1000 && arg1 >= 1000;
        } else if (class669.method3833(128, arg0)) {
            return false;
        } else {
            return class669.method3833(128, arg1);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILfha;)V", line = 34)
    public final void method311(int arg0, class522 arg1) {
        this.field668 = arg1;
        field667++;
        if (arg0 >= -85) {
            this.field671 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 46)
    public static void method312(int arg0) {
        field674 = null;
        int var1 = 117 / ((arg0 + 50) / 51);
        field672 = null;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)Ltq;", line = 62)
    public final class513 method313(int arg0) {
        field669++;
        if (arg0 != 1000) {
            field674 = null;
        }
        class513 var2 = this.field671;
        if (this.field668.field7324 == var2) {
            this.field671 = null;
            return null;
        } else {
            this.field671 = var2.field7165;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V", line = 83)
    public class46() {
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lfha;)V", line = 85)
    public class46(class522 arg0) {
        this.field668 = arg0;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)Ltq;", line = 98)
    public final class513 method314(byte arg0) {
        field670++;
        class513 var2 = this.field668.field7324.field7165;
        if (arg0 != 79) {
            this.method314((byte) 107);
        }
        if (this.field668.field7324 == var2) {
            this.field671 = null;
            return null;
        } else {
            this.field671 = var2.field7165;
            return var2;
        }
    }
}
