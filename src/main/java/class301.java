import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class301 {

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field4350 = 0;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BIILjava/lang/Object;)[B", line = 3)
    public static final byte[] method1902(byte arg0, int arg1, int arg2, Object arg3) {
        field4349++;
        if (arg3 == null) {
            return null;
        } else if (arg3 instanceof byte[]) {
            byte[] var4 = (byte[]) arg3;
            return class302.method1906(19691, var4, arg1, arg2);
        } else if (arg3 instanceof class168) {
            class168 var5 = (class168) arg3;
            return var5.method766(arg1, arg2, 127);
        } else {
            if (arg0 <= 59) {
                field4350 = 49;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILbba;)V", line = 44)
    public static final void method1903(int arg0, class124 arg1) {
        if (arg1 instanceof class192) {
            class192 var2 = (class192) arg1;
            if (var2.field2577 != null) {
                class652.method3632(class551.field7456.field2250 != var2.field2250, var2, (byte) 16);
            }
        } else if (arg1 instanceof class73) {
            class73 var3 = (class73) arg1;
            class378.method2416((byte) 77, var3, class551.field7456.field2250 != var3.field2250);
        }
        field4352++;
        int var4 = 30 % ((arg0 + 10) / 36);
    }
}
