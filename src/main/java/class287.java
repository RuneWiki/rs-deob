import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class287 {

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field4934 = 0;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "[B")
    public static byte[] field4937 = new byte[520];

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "J")
    public long field4932;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Lhf;")
    public class287 field4939;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Lhf;")
    public class287 field4941;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Lme;")
    public static class295 field4940;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)Z", line = 11)
    public final boolean method1997(int arg0) {
        field4933++;
        if (arg0 <= 89) {
            method1998(52);
        }
        return this.field4941 != null;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)Llj;", line = 28)
    public static final class5 method1998(int arg0) {
        if (arg0 < 90) {
            return (class5) null;
        } else {
            class5 var1 = new class5(class300.field5123, class165.field2680, class243.field4061[0], class311.field5274[0], class41.field615[0], class236.field3925[0], class53.field794[0], class284.field4879);
            class133.method974((byte) 36);
            field4938++;
            return var1;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V", line = 41)
    public static void method1999(boolean arg0) {
        if (!arg0) {
            field4940 = null;
            field4937 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V", line = 52)
    public final void method2000(int arg0) {
        field4936++;
        int var2 = -83 / ((arg0 - 85) / 34);
        if (this.field4941 != null) {
            this.field4941.field4939 = this.field4939;
            this.field4939.field4941 = this.field4941;
            this.field4939 = null;
            this.field4941 = null;
        }
    }
}
