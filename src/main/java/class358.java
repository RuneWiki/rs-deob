import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class358 {

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "Ljq;")
    private class361 field5128 = new class361();

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field5129 = 0;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "Ljq;")
    private class361 field5134;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)Ljq;")
    public final class361 method2115(byte arg0) {
        field5130++;
        class361 var2 = this.field5128.field5158;
        if (this.field5128 == var2) {
            return null;
        }
        var2.method2132(12);
        if (arg0 != -103) {
            this.method2115((byte) -91);
        }
        return var2;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)Ljq;")
    public final class361 method2116(byte arg0) {
        if (arg0 != 44) {
            field5133 = -112;
        }
        field5135++;
        class361 var2 = this.field5134;
        if (this.field5128 == var2) {
            this.field5134 = null;
            return null;
        } else {
            this.field5134 = var2.field5158;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)I")
    public final int method2117(int arg0) {
        field5127++;
        int var2 = 0;
        if (arg0 == 7025) {
            for (class361 var3 = this.field5128.field5158; var3 != this.field5128; var3 = var3.field5158) {
                var2++;
            }
            return var2;
        } else {
            return -85;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljq;Z)V")
    public final void method2118(class361 arg0, boolean arg1) {
        if (arg0.field5159 != null) {
            arg0.method2132(12);
        }
        field5136++;
        arg0.field5158 = this.field5128;
        arg0.field5159 = this.field5128.field5159;
        if (!arg1) {
            field5133 = -13;
        }
        arg0.field5159.field5158 = arg0;
        arg0.field5158.field5159 = arg0;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)Ljq;")
    public final class361 method2119(int arg0) {
        field5131++;
        class361 var2 = this.field5128.field5158;
        if (arg0 != 0) {
            this.field5134 = null;
        }
        if (this.field5128 == var2) {
            this.field5134 = null;
            return null;
        } else {
            this.field5134 = var2.field5158;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)V")
    public final void method2120(byte arg0) {
        field5132++;
        if (arg0 <= 56) {
            return;
        }
        while (true) {
            class361 var2 = this.field5128.field5158;
            if (this.field5128 == var2) {
                this.field5134 = null;
                return;
            }
            var2.method2132(12);
        }
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
    public class358() {
        this.field5128.field5159 = this.field5128;
        this.field5128.field5158 = this.field5128;
    }
}
