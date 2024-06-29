import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class359 extends class623 {

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "Ljava/lang/String;")
    public String field5119;

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "Lbj;")
    public class430 field5117;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
    public int field5121;

    @OriginalMember(owner = "client!jo", name = "y", descriptor = "[Lfba;")
    public static class600[] field5120;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)I")
    public final int method2201(byte arg0) {
        field5118++;
        if (this.field5117.field6099.field8705 == this.field5117.field6099) {
            int var2 = 74 / ((-arg0 - 18) / 38);
            return -1;
        } else {
            return ((class718) this.field5117.field6099.field8705).field10134;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILet;)Z")
    public final boolean method2202(int arg0, class718 arg1) {
        if (arg0 != -1) {
            return false;
        }
        field5114++;
        boolean var3 = true;
        arg1.method3409(-122);
        for (class718 var4 = (class718) this.field5117.method2565((byte) -62); var4 != null; var4 = (class718) this.field5117.method2568(-31355)) {
            if (class415.method2470(var4.field10134, arg1.field10134, 0)) {
                class736.method4130(arg1, 11, var4);
                this.field5121++;
                if (var3) {
                    return false;
                }
                return true;
            }
            var3 = false;
        }
        this.field5117.method2564(arg1, (byte) -123);
        this.field5121++;
        return var3;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
    public static void method2203(int arg0) {
        if (arg0 != -20633) {
            method2203(57);
        }
        field5120 = null;
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)[Lo;")
    public static final class197[] method2204(int arg0) {
        field5115++;
        return arg0 == 0 ? new class197[] { class283.field3597, class283.field3599, class283.field3600, class283.field3602, class283.field3603, class283.field3604, class283.field3605, class283.field3606, class283.field3607, class283.field3608, class283.field3609, class283.field3610, class283.field3611, class283.field3612 } : null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Let;I)Z")
    public final boolean method2205(class718 arg0, int arg1) {
        field5116++;
        int var3 = this.method2201((byte) -116);
        arg0.method3409(-119);
        this.field5121--;
        if (this.field5121 != arg1) {
            return this.method2201((byte) 41) != var3;
        }
        this.method3426((byte) -107);
        this.method3409(-123);
        class1.field1--;
        class131.field1569.method774(arg0.field10131, arg1 ^ 0xFFFFFFD3, this);
        return false;
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class359(String arg0) {
        this.field5119 = arg0;
        this.field5117 = new class430();
    }
}
