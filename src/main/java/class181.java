import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class181 extends class134 {

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
    public int field2139;

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "I")
    public int field2138;

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "Ljt;")
    public static class104 field2140 = new class104("", 14);

    @OriginalMember(owner = "client!vda", name = "o", descriptor = "I")
    public static int field2143 = 503;

    @OriginalMember(owner = "client!vda", name = "n", descriptor = "Lof;")
    public static class620 field2142 = new class620(20);

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!vda", name = "p", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(JJ)J")
    public static long method1122(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
    public static void method1123(int arg0) {
        if (arg0 >= -113) {
            field2144 = -14;
        }
        field2142 = null;
        field2140 = null;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Llha;Llha;I)V")
    public static final void method1124(class623 arg0, class623 arg1, int arg2) {
        if (arg0.field8927 != null) {
            arg0.method3562((byte) -128);
        }
        field2141++;
        arg0.field8927 = arg1.field8927;
        arg0.field8923 = arg1;
        arg0.field8927.field8923 = arg0;
        if (arg2 < -20) {
            arg0.field8923.field8927 = arg0;
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(II)V")
    public class181(int arg0, int arg1) {
        this.field2139 = arg0;
        this.field2138 = arg1;
    }
}
