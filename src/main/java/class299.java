import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class299 {

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field4462 = 0;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)V")
    public static final void method1927(int arg0, int arg1) {
        class312.field4618 = arg0;
        field4463++;
        class382 var2 = class622.field8668;
        synchronized (class622.field8668) {
            class622.field8668.method2285((byte) -97);
        }
        class382 var3 = class341.field5007;
        synchronized (class341.field5007) {
            class341.field5007.method2285((byte) -113);
        }
        if (arg1 != 4) {
            method1927(8, 27);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIBI)V")
    public static final void method1928(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4461++;
        class191 var5 = class6.method38(4, -100, arg1);
        if (arg3 == 15) {
            var5.method1285((byte) -1);
            var5.field2754 = arg0;
            var5.field2755 = arg4;
            var5.field2760 = arg2;
        }
    }
}
