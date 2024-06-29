import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class239 {

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    private int field3606 = 0;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "Lhl;")
    private class375 field3607;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "Lha;")
    private class42 field3604;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lqa;Z)V")
    public static final void method1579(class167 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        if (class535.field7888) {
            class59.method506(arg0, 1);
        } else {
            class14.method76(31566, arg0);
        }
        field3603++;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)Lha;")
    public final class42 method1580(boolean arg0) {
        if (arg0) {
            method1581((byte) -54, -44);
        }
        this.field3606 = 0;
        field3605++;
        return this.method1582(true);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(BI)I")
    public static final int method1581(byte arg0, int arg1) {
        int var2 = 123 / ((68 - arg0) / 54);
        field3602++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(Z)Lha;")
    public final class42 method1582(boolean arg0) {
        field3601++;
        if (!arg0) {
            method1581((byte) 122, 1);
        }
        if (this.field3606 > 0 && this.field3607.field5390[this.field3606 - 1] != this.field3604) {
            class42 var2 = this.field3604;
            this.field3604 = var2.field857;
            return var2;
        }
        while (this.field3606 < this.field3607.field5395) {
            class42 var3 = this.field3607.field5390[this.field3606++].field857;
            if (this.field3607.field5390[this.field3606 - 1] != var3) {
                this.field3604 = var3.field857;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lhl;)V")
    public class239(class375 arg0) {
        this.field3607 = arg0;
    }
}
