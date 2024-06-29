import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class111 extends class665 {

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public int field1683;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "Lwba;")
    public static class46 field1685 = new class46();

    @OriginalMember(owner = "client!di", name = "o", descriptor = "Lnea;")
    public static class664 field1686 = new class664(83, 7);

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "Ljava/lang/Object;")
    public static Object field1688;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lr;I)V", line = 4)
    public static final void method862(class166 arg0, int arg1) {
        if (arg1 != -1011) {
            return;
        }
        field1682++;
        for (class29 var2 = (class29) class448.field6482.method2417(false); var2 != null; var2 = (class29) class448.field6482.method2414(true)) {
            if (var2.field446) {
                var2.method341(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)Z", line = 28)
    public static final boolean method863(byte arg0) {
        field1684++;
        if (arg0 < 15) {
            field1688 = null;
        }
        class665 var1 = class663.field9367.field716.field9384;
        if (var1 == null || class663.field9367.field716 == var1) {
            return false;
        }
        class279 var2 = (class279) var1;
        if (var2.field4213 >= 2000) {
            var2.field4213 -= 2000;
        }
        return var2.field4213 == 1010;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 54)
    public static void method864(int arg0) {
        field1686 = null;
        field1685 = null;
        field1688 = null;
        if (arg0 > -1) {
            method863((byte) -108);
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V", line = 66)
    public class111() {
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(I)V", line = 72)
    public class111(int arg0) {
        this.field1683 = arg0;
    }
}
