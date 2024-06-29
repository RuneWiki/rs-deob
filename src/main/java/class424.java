import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class424 extends class503 {

    @OriginalMember(owner = "client!je", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field6053 = new String[100];

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Ljw;")
    public static class581 field6048 = new class581(95, 3);

    @OriginalMember(owner = "client!je", name = "u", descriptor = "Ljw;")
    public static class581 field6054 = new class581(67, -2);

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "Lje;")
    public class424 field6051;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Lje;")
    public class424 field6052;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method2598(int arg0, int arg1, String arg2) {
        class249.field3695++;
        field6049++;
        if (arg1 != 1706) {
            field6053 = null;
        }
        class267 var3 = class545.method3099((byte) 101, class269.field3966, class446.field6252);
        var3.field3938.method2380(65280, class469.method2769(arg2, (byte) 121) + 1);
        var3.field3938.method2380(65280, arg0);
        var3.field3938.method2349(arg1 - 1592, arg2);
        class617.method3392(var3, true);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
    public final void method2599(byte arg0) {
        field6050++;
        if (this.field6052 == null) {
            return;
        }
        this.field6052.field6051 = this.field6051;
        this.field6051.field6052 = this.field6052;
        this.field6052 = null;
        this.field6051 = null;
        if (arg0 < 14) {
            this.method2599((byte) 82);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method2600(int arg0) {
        field6053 = null;
        if (arg0 != -3886) {
            method2600(-41);
        }
        field6054 = null;
        field6048 = null;
    }
}
