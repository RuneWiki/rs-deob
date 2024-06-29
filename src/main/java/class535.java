import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class535 extends class311 {

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    private int field7834 = 0;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field7836 = 0;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field7833;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "J")
    public static long field7835;

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lri;Lcb;)V", line = 31)
    public class535(class97 arg0, class481 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)V", line = 15)
    public final void method1066(boolean arg0, int arg1) {
        if (arg1 == -5506) {
            ++field7833;
            int var3 = super.field4904.field9566.method1799(arg1 ^ -5540, super.field4898.method1076(), class585.field8333) + super.field4904.field9561;
            int var4 = super.field4904.field9572.method2550(super.field4898.method1079(), true, class95.field1487) - -super.field4904.field9562;
            super.field4898.method3963((float) (var3 - -(super.field4898.method1076() / 2)), (float) (var4 - -(super.field4898.method1079() / 2)), 4096, this.field7834);
            this.field7834 += ((class481) super.field4904).field7086;
        }
    }
}
