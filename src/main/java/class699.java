import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class699 {

    @OriginalMember(owner = "client!mha", name = "g", descriptor = "I")
    public int field9865 = -1;

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "Lvi;")
    public static class368 field9862 = new class368(64);

    @OriginalMember(owner = "client!mha", name = "h", descriptor = "F")
    public static float field9866;

    @OriginalMember(owner = "client!mha", name = "j", descriptor = "F")
    public static float field9868;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "I")
    public static int field9859;

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "I")
    public static int field9861;

    @OriginalMember(owner = "client!mha", name = "e", descriptor = "I")
    public static int field9863;

    @OriginalMember(owner = "client!mha", name = "f", descriptor = "Ljj;")
    public class657 field9864;

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "[I")
    public int[] field9860;

    @OriginalMember(owner = "client!mha", name = "i", descriptor = "[Ljava/lang/String;")
    public String[] field9867;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V")
    public static void method3925(int arg0) {
        if (arg0 < 66) {
            method3925(33);
        }
        field9862 = null;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(III)Z")
    public static final boolean method3926(int arg0, int arg1, int arg2) {
        field9861++;
        return arg1 == -4 ? false : false;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IB)Z")
    public static final boolean method3927(int arg0, byte arg1) {
        if (arg1 != 20) {
            field9868 = -0.38667247F;
        }
        field9863++;
        return arg0 == 2 || arg0 == 3;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(B)V")
    public static final void method3928(byte arg0) {
        field9859++;
        for (class137 var1 = (class137) class23.field214.method3565(127); var1 != null; var1 = (class137) class23.field214.method3561((byte) 122)) {
            class124 var2 = var1.field1879;
            if (var2.field1705) {
                var1.method2656((byte) 126);
                var2.method872(arg0 + 62);
            } else if (var2.field1707 <= class703.field9918) {
                var2.method873(class731.field10244, arg0 + 12);
                if (var2.field1705) {
                    var1.method2656((byte) 120);
                } else {
                    class262.method1734(var2, true);
                }
            }
        }
        if (arg0 != -13) {
            method3926(-15, -107, -79);
        }
    }
}
