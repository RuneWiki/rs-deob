import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class584 {

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "J")
    public long field8163;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "Lbi;")
    private class483 field8167;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field8166 = -1;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field8168;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field8169;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "Liea;")
    public static class481 field8165;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Liea;")
    public static class481 field8170;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Lpda;")
    public static class631 field8164;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static void method3322(byte arg0) {
        field8165 = null;
        int var1 = 101 % ((arg0 + 33) / 44);
        field8170 = null;
        field8164 = null;
    }

    @OriginalMember(owner = "client!pf", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field8169++;
        this.field8167.method2818((byte) -106, this.field8163);
        super.finalize();
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lrea;II)V")
    public static final void method3323(class210 arg0, int arg1, int arg2) {
        int var3 = 90 / ((-arg2 - 57) / 36);
        field8168++;
        if (class344.field4356) {
            class344.field4356 = false;
            arg1 = 0;
        }
        if (class174.field2432 != null && class174.field2432.method1354(arg0, false)) {
            return;
        }
        class174.field2432 = arg0;
        class379.field4840 = class446.method2525(500);
        class669.field9386 = arg1;
        class383.field4857 = arg1;
        if (class383.field4857 == 0) {
            class730.method4073(120);
            return;
        }
        class182.field2547 = class546.field7612;
        class336.field4261 = class383.field4858;
        class136.field1951 = class318.field4113;
        class83.field1137 = class762.field10628;
        class721.field10036 = class563.field7923;
        class300.field3940 = class637.field8786;
        class271.field3407 = class621.field8562;
        class575.field8086 = class102.field1412;
        class440.field5867 = class349.field4507;
        class525.field7338 = class372.field4780;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lbi;JI)V")
    public class584(class483 arg0, long arg1, int arg2) {
        this.field8163 = arg1;
        this.field8167 = arg0;
    }
}
