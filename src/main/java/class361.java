import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class361 extends class498 {

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "Ltn;")
    public static class60 field5161 = new class60(12, -1);

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
    public static int field5165 = 0;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "J")
    public long field5164;

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "Ltf;")
    public static class197 field5163;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "Ljq;")
    public class361 field5158;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "Ljq;")
    public class361 field5159;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "(I)Z", line = 4)
    public final boolean method2129(int arg0) {
        field5157++;
        if (arg0 < 10) {
            method2131(-30, 24, -91);
        }
        return this.field5159 != null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V", line = 21)
    public static void method2130(boolean arg0) {
        field5163 = null;
        field5161 = null;
        if (arg0) {
            method2130(true);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)V", line = 33)
    public static final void method2131(int arg0, int arg1, int arg2) {
        field5160++;
        class97.field1278 = arg0 - class245.field3574;
        class409.field5787 = arg1 - class245.field3586;
        if (arg2 <= 21) {
            method2131(14, -85, -90);
        }
    }

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "(I)V", line = 46)
    public final void method2132(int arg0) {
        field5162++;
        if (this.field5159 == null) {
            return;
        }
        this.field5159.field5158 = this.field5158;
        this.field5158.field5159 = this.field5159;
        this.field5159 = null;
        if (arg0 != 12) {
            field5161 = null;
        }
        this.field5158 = null;
    }
}
