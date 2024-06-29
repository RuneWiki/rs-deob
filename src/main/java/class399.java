import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class399 extends class342 {

    @OriginalMember(owner = "client!io", name = "s", descriptor = "I")
    public int field5337 = (int) (class641.method3604(false) / 1000L);

    @OriginalMember(owner = "client!io", name = "m", descriptor = "S")
    public short field5331;

    @OriginalMember(owner = "client!io", name = "l", descriptor = "Ljava/lang/String;")
    public String field5330;

    @OriginalMember(owner = "client!io", name = "o", descriptor = "Lbca;")
    public static class604 field5333 = new class604("", 14);

    @OriginalMember(owner = "client!io", name = "t", descriptor = "I")
    public static int field5338 = 104;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!io", name = "p", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!io", name = "r", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIZ)V")
    public static final void method2184(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg3 < arg1) {
            class445.method2463(arg3, 110, arg1, arg0, class156.field1755[arg2]);
        } else {
            class445.method2463(arg1, 113, arg3, arg0, class156.field1755[arg2]);
        }
        if (!arg4) {
            field5338 = 49;
        }
        field5334++;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method2185(String arg0, byte arg1) {
        if (arg1 != -34) {
            field5333 = null;
        }
        field5332++;
        return class655.method3698(true, 0, 10, arg0);
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V")
    public static void method2186(byte arg0) {
        field5333 = null;
        if (arg0 < 52) {
            method2184(2, -69, -49, 114, true);
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class399(String arg0, int arg1) {
        this.field5331 = (short) arg1;
        this.field5330 = arg0;
    }
}
