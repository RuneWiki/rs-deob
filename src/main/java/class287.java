import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class287 {

    @OriginalMember(owner = "client!am", name = "d", descriptor = "Lih;")
    private class330 field4173;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "S")
    public short field4174;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "Lcj;")
    public class182 field4172;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "B")
    public byte field4171;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "B")
    public byte field4170;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 7)
    public final void method1814(int arg0) {
        int var2 = -84 / ((43 - arg0) / 56);
        this.field4173.method2035(this.field4172);
        this.field4172.method89(this);
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V", line = 17)
    public final void method1815(int arg0) {
        this.field4173.method2035(this.field4172);
        int var2 = 24 / ((arg0 + 57) / 51);
        this.field4172.method86(this);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V", line = 27)
    public final void method1816(boolean arg0) {
        this.field4173.method2035(this.field4172);
        if (!arg0) {
            this.method1816(true);
        }
        this.field4172.method85(this);
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V", line = 40)
    public final void method1817(int arg0) {
        this.field4173.method2035(this.field4172);
        if (arg0 == -28301) {
            this.field4172.method88(this);
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lih;Lcj;III)V", line = 50)
    public class287(class330 arg0, class182 arg1, int arg2, int arg3, int arg4) {
        this.field4173 = arg0;
        this.field4174 = (short) arg2;
        this.field4172 = arg1;
        this.field4171 = (byte) arg4;
        this.field4170 = (byte) arg3;
    }
}
