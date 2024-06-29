import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class186 {

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field3074 = 1;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field3079 = 0;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V", line = 6)
    public static final void method1391(int arg0, int arg1, int arg2) {
        field3077++;
        class70.field991[arg0] = arg2;
        class253 var3 = (class253) class182.field3004.method451((long) arg0, (byte) 100);
        if (arg1 > -16) {
            return;
        }
        if (var3 == null) {
            class253 var4 = new class253(class283.method2038((byte) 123) + 500L);
            class182.field3004.method461(-102, (long) arg0, var4);
        } else {
            var3.field4039 = class283.method2038((byte) 125) + 500L;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)I", line = 34)
    public static final int method1392(byte arg0, int arg1) {
        if (arg0 == 114) {
            field3078++;
            return arg1 >>> 8;
        } else {
            return 9;
        }
    }
}
