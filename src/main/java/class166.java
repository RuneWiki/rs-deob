import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class166 {

    @OriginalMember(owner = "client!pha", name = "c", descriptor = "Z")
    public static boolean field2074 = false;

    @OriginalMember(owner = "client!pha", name = "f", descriptor = "I")
    public static int field2077 = 0;

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!pha", name = "d", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!pha", name = "e", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!pha", name = "g", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!pha", name = "h", descriptor = "Lpha;")
    public class166 field2079;

    @OriginalMember(owner = "client!pha", name = "i", descriptor = "Lpha;")
    public class166 field2080;

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "[S")
    public static short[] field2072;

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "(Z)V")
    public static final void method972(boolean arg0) {
        field2078++;
        class603.field8409 = null;
        class527.field7074 = null;
        class689.field9653 = -1;
        if (arg0) {
            return;
        }
        class582.field8158 = -1;
        class392.field5553 = -1;
        class173.field2147 = null;
        class381.field5338 = null;
        class725.field10127 = null;
        class581.field8134 = -1;
        class545.field7704 = null;
        class624.field8731 = null;
        class736.field10272.method3675(0);
    }

    @OriginalMember(owner = "client!pha", name = "c", descriptor = "(I)V")
    public static void method973(int arg0) {
        if (arg0 != -1) {
            field2074 = true;
        }
        field2072 = null;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(ZI)V")
    public static final void method974(boolean arg0, int arg1) {
        field2075++;
        if (arg1 != -1 && class534.field7246[arg1]) {
            class751.field10420.method2894(-53, arg1);
            class357.field4742[arg1] = null;
            class607.field8483[arg1] = null;
            class534.field7246[arg1] = arg0;
        }
    }

    @OriginalMember(owner = "client!pha", name = "c", descriptor = "(B)V")
    public final void method975(byte arg0) {
        field2073++;
        if (this.field2079 == null) {
            return;
        }
        this.field2079.field2080 = this.field2080;
        this.field2080.field2079 = this.field2079;
        this.field2080 = null;
        this.field2079 = null;
        int var2 = 77 % ((89 - arg0) / 32);
    }
}
