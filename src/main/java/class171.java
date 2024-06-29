import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class171 {

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "B")
    private byte field3056;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public int field3059;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public int field3048;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public int field3058;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public int field3050;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public int field3051;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "[Llf;")
    public static class106[] field3052 = new class106[4];

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Llc;")
    public static class143 field3057 = class66.method374(": ", -1);

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "Lng;")
    public static class139 field3053 = new class139(64);

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "Llc;")
    public static class143 field3062 = class66.method374("<img=1>", -1);

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "Llc;")
    public static class143 field3065 = class66.method374(")2", -1);

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "Llc;")
    public static class143 field3066 = class66.method374("Mem:", -1);

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Llc;")
    public static class143 field3064 = class66.method374("clignotant1:", -1);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "Lgf;")
    public static class7 field3063;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "[I")
    public static int[] field3060;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ldl;I)V")
    public static final void method1120(class32 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        field3054++;
        class124 var2 = (class124) class254.field4565.method1824(arg0.field518.method874(7), 0);
        if (var2 == null) {
            return;
        }
        if (var2.field2171 != null) {
            class86.field1578.method1000(var2.field2171);
            var2.field2171 = null;
        }
        var2.method349(0);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
    public final int method1121(int arg0) {
        if (arg0 == 4) {
            field3055++;
            return (this.field3056 & 0x8) == 8 ? 1 : 0;
        } else {
            return 9;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
    public static final void method1122(int arg0, int arg1) {
        if (arg1 == -27349) {
            class166 var2 = class262.method1746(arg1 ^ 0x6AB0, arg0, 2);
            field3049++;
            var2.method1098((byte) -122);
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class171() {
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)I")
    public final int method1123(int arg0) {
        field3061++;
        if (arg0 != -31317) {
            this.method1123(117);
        }
        return this.field3056 & 0x7;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lh;)V")
    public class171(class190 arg0) {
        this.field3056 = arg0.method1234(false);
        this.field3059 = arg0.method1275(128);
        this.field3048 = arg0.method1269(54);
        this.field3058 = arg0.method1269(88);
        this.field3050 = arg0.method1269(107);
        this.field3051 = arg0.method1269(107);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    public static void method1124(byte arg0) {
        field3060 = null;
        field3057 = null;
        int var1 = -45 / ((arg0 - 64) / 61);
        field3062 = null;
        field3066 = null;
        field3052 = null;
        field3053 = null;
        field3063 = null;
        field3064 = null;
        field3065 = null;
    }
}
