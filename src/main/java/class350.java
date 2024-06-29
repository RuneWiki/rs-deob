import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class350 {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public int field4360 = 443;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public int field4361 = 43594;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Z")
    private boolean field4364 = true;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "Z")
    private boolean field4368 = false;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public int field4365;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Ljava/lang/String;")
    public String field4362;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Llc;Z)Lpga;")
    public final class561 method2071(class675 arg0, boolean arg1) {
        if (arg1) {
            this.field4362 = null;
        }
        field4369++;
        return arg0.method3790(this.field4362, 27007, this.field4364 ? this.field4360 : this.field4361, this.field4368);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(JIB)Ljca;")
    public static final class714 method2072(long arg0, int arg1, byte arg2) {
        field4363++;
        class714 var4 = (class714) class231.field2758.method2121(90, arg0 | (long) arg1 << 56);
        if (var4 == null) {
            var4 = new class714(arg1, arg0);
            class231.field2758.method2112(var4, (byte) 6, var4.field4809);
        }
        if (arg2 <= 106) {
            method2072(-46L, -28, (byte) -92);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public final void method2073(byte arg0) {
        if (arg0 != 35) {
            this.field4365 = 82;
        }
        field4359++;
        if (!this.field4364) {
            this.field4364 = true;
            this.field4368 = true;
        } else if (this.field4368) {
            this.field4368 = false;
        } else {
            this.field4364 = false;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILwb;)Z")
    public final boolean method2074(int arg0, class350 arg1) {
        field4367++;
        if (arg0 != 107381432) {
            this.field4361 = 113;
        }
        if (arg1 == null) {
            return false;
        } else {
            return this.field4365 == arg1.field4365 && this.field4362.equals(arg1.field4362);
        }
    }
}
