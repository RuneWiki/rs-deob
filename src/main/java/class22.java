import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class22 {

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "Ltl;")
    public static class222 field329 = new class222(4);

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field330 = 0;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ISIIILjava/lang/String;Ljava/lang/String;J)V", line = 5)
    public static final void method142(int arg0, short arg1, int arg2, int arg3, int arg4, String arg5, String arg6, long arg7) {
        int var9 = -91 / ((-arg3 - 54) / 43);
        field328++;
        if (class19.field274 || class126.field1887 >= 500) {
            return;
        }
        class284.field4478[class126.field1887] = arg6;
        class147.field2199[class126.field1887] = arg5;
        class56.field746[class126.field1887] = arg0 == -1 ? class239.field3778 : arg0;
        class50.field686[class126.field1887] = arg1;
        class214.field3464[class126.field1887] = arg7;
        class19.field270[class126.field1887] = arg2;
        class300.field4675[class126.field1887] = arg4;
        class126.field1887++;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 29)
    public static final void method143(byte arg0) {
        if (arg0 != -87) {
            field329 = (class222) null;
        }
        class56.field737.method1615(arg0 + 133);
        field331++;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V", line = 53)
    public static void method144(boolean arg0) {
        field329 = null;
        if (arg0) {
            method143((byte) 41);
        }
    }
}
