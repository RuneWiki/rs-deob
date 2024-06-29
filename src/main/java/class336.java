import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class336 {

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    private int field5238 = 0;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Ls;")
    private class196 field5236;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field5235 = -1;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "Lmg;")
    private class117 field5234;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)Lmg;", line = 9)
    public final class117 method2369(boolean arg0) {
        field5233++;
        if (this.field5238 > 0 && this.field5236.field2846[this.field5238 - 1] != this.field5234) {
            class117 var2 = this.field5234;
            this.field5234 = var2.field1659;
            return var2;
        }
        if (arg0) {
            this.field5238 = 44;
        }
        class117 var3;
        do {
            if (this.field5238 >= this.field5236.field2845) {
                return null;
            }
            var3 = this.field5236.field2846[this.field5238++].field1659;
        } while (this.field5236.field2846[this.field5238 - 1] == var3);
        this.field5234 = var3.field1659;
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Ls;)V", line = 48)
    public class336(class196 arg0) {
        this.field5236 = arg0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)Lmg;", line = 57)
    public final class117 method2370(int arg0) {
        if (arg0 >= -77) {
            this.method2370(-87);
        }
        field5237++;
        this.field5238 = 0;
        return this.method2369(false);
    }
}
