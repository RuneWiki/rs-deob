import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AKUDQPZE")
public class class1 {

    @OriginalMember(owner = "AKUDQPZE", name = "a", descriptor = "Z")
    private boolean field1 = true;

    @OriginalMember(owner = "AKUDQPZE", name = "b", descriptor = "I")
    private int field2 = -5592;

    @OriginalMember(owner = "AKUDQPZE", name = "e", descriptor = "LCYIKEZWP;")
    private class10 field5 = new class10();

    @OriginalMember(owner = "AKUDQPZE", name = "i", descriptor = "LFEBLELGD;")
    private class19 field9 = new class19((byte) 3);

    @OriginalMember(owner = "AKUDQPZE", name = "f", descriptor = "I")
    private int field6;

    @OriginalMember(owner = "AKUDQPZE", name = "g", descriptor = "I")
    private int field7;

    @OriginalMember(owner = "AKUDQPZE", name = "h", descriptor = "LHSZHZJQR;")
    private class29 field8;

    @OriginalMember(owner = "AKUDQPZE", name = "c", descriptor = "I")
    private int field3;

    @OriginalMember(owner = "AKUDQPZE", name = "d", descriptor = "I")
    private int field4;

    @OriginalMember(owner = "AKUDQPZE", name = "<init>", descriptor = "(BI)V")
    public class1(byte arg0, int arg1) {
        this.field6 = arg1;
        this.field7 = arg1;
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        this.field8 = new class29(false, 1024);
    }

    @OriginalMember(owner = "AKUDQPZE", name = "a", descriptor = "(J)LCYIKEZWP;")
    public class10 method1(long arg0) {
        class10 var3 = (class10) this.field8.method343(arg0);
        if (var3 == null) {
            this.field3++;
        } else {
            this.field9.method302(var3);
            this.field4++;
        }
        return var3;
    }

    @OriginalMember(owner = "AKUDQPZE", name = "a", descriptor = "(LCYIKEZWP;ZJ)V")
    public void method2(class10 arg0, boolean arg1, long arg2) {
        if (this.field7 == 0) {
            class10 var5 = this.field9.method303();
            var5.method379();
            var5.method177();
            if (this.field5 == var5) {
                class10 var6 = this.field9.method303();
                var6.method379();
                var6.method177();
            }
        } else {
            this.field7--;
        }
        this.field8.method344((byte) 117, arg2, arg0);
        this.field9.method302(arg0);
        if (arg1) {
            this.field2 = -337;
        }
    }

    @OriginalMember(owner = "AKUDQPZE", name = "a", descriptor = "()V")
    public void method3() {
        while (true) {
            class10 var1 = this.field9.method303();
            if (var1 == null) {
                this.field7 = this.field6;
                return;
            }
            var1.method379();
            var1.method177();
        }
    }
}
