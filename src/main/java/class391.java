import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class391 {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Ljg;")
    public static class241 field5767 = new class241(100);

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field5769 = -1;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static void method2410(byte arg0) {
        field5767 = null;
        if (arg0 > -40) {
            method2412(53, -124);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static final void method2411(int arg0) {
        if (arg0 != -1) {
            method2411(17);
        }
        field5768++;
        class241 var1 = class17.field231;
        synchronized (class17.field231) {
            class17.field231.method1482((byte) -89);
        }
        class241 var2 = class358.field5281;
        synchronized (class358.field5281) {
            class358.field5281.method1482((byte) 75);
        }
        class241 var3 = class316.field4776;
        synchronized (class316.field4776) {
            class316.field4776.method1482((byte) -80);
        }
        class241 var4 = class37.field449;
        synchronized (class37.field449) {
            class37.field449.method1482((byte) -97);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
    public static final void method2412(int arg0, int arg1) {
        class440.field6476.method1481(3, arg0);
        field5765++;
        class155.field2160.method1481(3, arg0);
        if (arg1 <= 34) {
            method2412(45, -114);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static final void method2413(int arg0) {
        class238.field3569 = arg0;
        class399.field5961 = arg0;
        class217.field3298 = arg0;
        class241.field3631 = arg0;
        field5766++;
    }
}
