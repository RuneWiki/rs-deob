import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class105 {

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    private int field1581 = 0;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "Lmn;")
    private class247 field1583;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "Luj;")
    private class260 field1585;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method773(byte arg0, int arg1) {
        class173.field2569.method1065((byte) -95, arg1);
        field1587++;
        if (arg0 > -120) {
            method774((byte) 26);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)I", line = 14)
    public static final int method774(byte arg0) {
        if (arg0 <= 25) {
            return -126;
        } else {
            field1580++;
            return 2;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)Luj;", line = 27)
    public final class260 method775(boolean arg0) {
        this.field1581 = 0;
        field1582++;
        if (arg0) {
            this.method778(95);
        }
        return this.method778(99);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZI)V", line = 40)
    public static final void method776(boolean arg0, int arg1) {
        class358.method2144((byte) 107);
        field1579++;
        int var2 = -100 % ((arg1 + 56) / 61);
        if (class492.field7178 != 30 && class492.field7178 != 25) {
            return;
        }
        class59.field722++;
        if (class59.field722 < 50 && !arg0) {
            return;
        }
        class59.field722 = 0;
        if (!class10.field151 && class33.field438 != null) {
            class131.field1919++;
            class491.method2878((byte) 92, class9.field140);
            try {
                class33.field438.method2835((byte) 126, class481.field7027.field5719, class481.field7027.field5678, 0);
                class481.field7027.field5719 = 0;
            } catch (IOException var3) {
                class10.field151 = true;
            }
        }
        class358.method2144((byte) -128);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IZI)Z", line = 74)
    public static final boolean method777(int arg0, boolean arg1, int arg2) {
        field1584++;
        if (arg1) {
            return (arg0 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lmn;)V", line = 127)
    public class105(class247 arg0) {
        this.field1583 = arg0;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)Luj;", line = 89)
    public final class260 method778(int arg0) {
        field1588++;
        if (this.field1581 > 0 && this.field1583.field3424[this.field1581 - 1] != this.field1585) {
            class260 var2 = this.field1585;
            this.field1585 = var2.field3612;
            return var2;
        } else if (arg0 <= 69) {
            return null;
        } else {
            while (this.field1581 < this.field1583.field3435) {
                class260 var3 = this.field1583.field3424[this.field1581++].field3612;
                if (this.field1583.field3424[this.field1581 - 1] != var3) {
                    this.field1585 = var3.field3612;
                    return var3;
                }
            }
            return null;
        }
    }
}
