import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class87 {

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public int field1212 = -1;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "Lth;")
    public static class168 field1217 = new class168();

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "Lqa;")
    public static class243 field1213;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "Loo;")
    public class384 field1211;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "[I")
    public int[] field1210;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "[Ljava/lang/String;")
    public String[] field1218;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "[Z")
    public static boolean[] field1215;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)Lbr;")
    public static final class349 method539(int arg0, int arg1, int arg2) {
        class10 var3 = class343.field5032[arg0][arg1][arg2];
        return var3 == null ? null : var3.field117;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
    public static final void method540(int arg0) {
        if (client.field3672 != null) {
            client.field3672.method1337(107);
        }
        field1216++;
        if (class188.field2556 != null) {
            class188.field2556.method1337(95);
        }
        int var1 = 121 / ((33 - arg0) / 62);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lqj;Z)V")
    public static final void method541(class238 arg0, boolean arg1) {
        class137.field1814 = arg0;
        field1214++;
        if (arg1) {
            field1217 = null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
    public static void method542(byte arg0) {
        field1217 = null;
        int var1 = 39 % ((arg0 - 30) / 55);
        field1215 = null;
        field1213 = null;
    }
}
