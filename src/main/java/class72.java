import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class72 {

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "Lje;")
    public class424 field1011 = new class424();

    @OriginalMember(owner = "client!hia", name = "d", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!hia", name = "e", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!hia", name = "f", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!hia", name = "g", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!hia", name = "i", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!hia", name = "h", descriptor = "Lje;")
    private class424 field1017;

    @OriginalMember(owner = "client!hia", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field1012;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "[[I")
    public static int[][] field1010;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(BLje;)V")
    public final void method633(byte arg0, class424 arg1) {
        if (arg1.field6052 != null) {
            arg1.method2599((byte) 112);
        }
        field1014++;
        arg1.field6052 = this.field1011.field6052;
        arg1.field6051 = this.field1011;
        arg1.field6052.field6051 = arg1;
        if (arg0 != 45) {
            method637(101);
        }
        arg1.field6051.field6052 = arg1;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(B)I")
    public final int method634(byte arg0) {
        field1018++;
        if (arg0 <= 47) {
            field1010 = null;
        }
        int var2 = 0;
        for (class424 var3 = this.field1011.field6051; var3 != this.field1011; var3 = var3.field6051) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(Z)Lje;")
    public final class424 method635(boolean arg0) {
        field1015++;
        class424 var2 = this.field1017;
        if (this.field1011 == var2) {
            this.field1017 = null;
            return null;
        }
        this.field1017 = var2.field6051;
        if (arg0) {
            this.field1017 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)V")
    public final void method636(int arg0) {
        field1013++;
        if (arg0 != 32362) {
            field1010 = null;
        }
        while (true) {
            class424 var2 = this.field1011.field6051;
            if (this.field1011 == var2) {
                this.field1017 = null;
                return;
            }
            var2.method2599((byte) 54);
        }
    }

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "(I)V")
    public static void method637(int arg0) {
        field1010 = null;
        field1012 = null;
        if (arg0 != 0) {
            method637(-119);
        }
    }

    @OriginalMember(owner = "client!hia", name = "c", descriptor = "(I)Lje;")
    public final class424 method638(int arg0) {
        field1016++;
        class424 var2 = this.field1011.field6051;
        if (this.field1011 == var2) {
            this.field1017 = null;
            return null;
        } else if (arg0 >= -80) {
            return null;
        } else {
            this.field1017 = var2.field6051;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "()V")
    public class72() {
        this.field1011.field6052 = this.field1011;
        this.field1011.field6051 = this.field1011;
    }
}
