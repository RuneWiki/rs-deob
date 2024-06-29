import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public abstract class class250 extends class307 {

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Luda;")
    public static class509 field3134 = new class509(2);

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field3136 = 0;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)Z")
    public static final boolean method1528(int arg0, int arg1, int arg2) {
        int var3 = class406.field5575[arg0][arg1][arg2];
        if (-class642.field9327 == var3) {
            return false;
        } else if (class642.field9327 == var3) {
            return true;
        } else {
            int var4 = arg1 << class400.field5480;
            int var5 = arg2 << class400.field5480;
            if (class155.method836(var4 + 1, class501.field6947[arg0].method1031(arg1, arg2), var5 + 1) && class155.method836(class456.field6523 + var4 - 1, class501.field6947[arg0].method1031(arg1 + 1, arg2), var5 + 1) && class155.method836(class456.field6523 + var4 - 1, class501.field6947[arg0].method1031(arg1 + 1, arg2 + 1), class456.field6523 + var5 - 1) && class155.method836(var4 + 1, class501.field6947[arg0].method1031(arg1, arg2 + 1), class456.field6523 + var5 - 1) && class155.method836(class337.field4699 + var4, class501.field6947[arg0].method1031(arg1, arg2), var5 + 1) && class155.method836(class456.field6523 + var4 - 1, class501.field6947[arg0].method1031(arg1 + 1, arg2), class337.field4699 + var5) && class155.method836(class337.field4699 + var4, class501.field6947[arg0].method1031(arg1, arg2 + 1), class456.field6523 + var5 - 1) && class155.method836(class456.field6523 + var4 - 1, class501.field6947[arg0].method1031(arg1, arg2), class337.field4699 + var5) && class155.method836(class337.field4699 + var4, class501.field6947[arg0].method1031(arg1, arg2), class337.field4699 + var5)) {
                class406.field5575[arg0][arg1][arg2] = class642.field9327;
                return true;
            } else {
                class406.field5575[arg0][arg1][arg2] = -class642.field9327;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)Lsk;")
    public abstract class415 method1414(int arg0);

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
    public static void method1529(byte arg0) {
        field3134 = null;
        if (arg0 != -57) {
            method1528(-104, 49, -87);
        }
    }
}
