import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class295 extends class121 {

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "[I")
    public int[] field4222;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "[I")
    public int[] field4221;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field4220 = 0;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "C")
    public static char field4219;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IILnj;B)V", line = 10)
    public static final void method1871(int arg0, int arg1, class133 arg2, byte arg3) {
        field4218++;
        if (arg3 < 67) {
            field4220 = -65;
        }
        if (arg2.field6312 == arg0 && arg0 != -1) {
            class182 var4 = class437.method2717(arg0, (byte) -103);
            int var5 = var4.field2487;
            if (var5 == 1) {
                arg2.field6314 = 0;
                arg2.field6322 = 0;
                arg2.field6272 = 1;
                arg2.field6250 = arg1;
                arg2.field6277 = 0;
                class424.method2628(arg2.field6277, arg2.field1304, var4, 0, arg2.field1311, class390.field5715 == arg2);
            }
            if (var5 == 2) {
                arg2.field6314 = 0;
                return;
            }
        } else if (arg0 == -1 || arg2.field6312 == -1 || class437.method2717(arg0, (byte) -103).field2489 >= class437.method2717(arg2.field6312, (byte) -103).field2489) {
            arg2.field6277 = 0;
            arg2.field6314 = 0;
            arg2.field6312 = arg0;
            arg2.field6250 = arg1;
            arg2.field6272 = 1;
            arg2.field6353 = arg2.field6345;
            arg2.field6322 = 0;
            if (arg2.field6312 == -1) {
                return;
            }
            class424.method2628(arg2.field6277, arg2.field1304, class437.method2717(arg2.field6312, (byte) -103), 0, arg2.field1311, class390.field5715 == arg2);
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(II[I[I)V", line = 65)
    public class295(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field4222 = arg3;
        this.field4221 = arg2;
    }
}
