import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class97 {

    @OriginalMember(owner = "client!eha", name = "i", descriptor = "I")
    public int field1356 = -1;

    @OriginalMember(owner = "client!eha", name = "f", descriptor = "Ljw;")
    public static class581 field1353 = new class581(98, 7);

    @OriginalMember(owner = "client!eha", name = "j", descriptor = "I")
    public static int field1357 = 0;

    @OriginalMember(owner = "client!eha", name = "l", descriptor = "[I")
    public static int[] field1359 = new int[14];

    @OriginalMember(owner = "client!eha", name = "h", descriptor = "Ljw;")
    public static class581 field1355 = new class581(126, -2);

    @OriginalMember(owner = "client!eha", name = "d", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!eha", name = "g", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!eha", name = "k", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "Ltg;")
    public class244 field1349;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "[I")
    public int[] field1348;

    @OriginalMember(owner = "client!eha", name = "e", descriptor = "[J")
    public long[] field1352;

    @OriginalMember(owner = "client!eha", name = "c", descriptor = "[Ljava/lang/String;")
    public String[] field1350;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(IIIZI)V")
    public static final void method760(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field1354++;
        class16 var5 = class94.method753(4, 13175, (long) arg1);
        var5.method119(-66);
        var5.field245 = arg2;
        var5.field244 = arg0;
        if (!arg3) {
            field1357 = -6;
        }
        var5.field237 = arg4;
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)V")
    public static void method761(int arg0) {
        field1359 = null;
        field1355 = null;
        if (arg0 == -1) {
            field1353 = null;
        }
    }

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "(I)V")
    public static final void method762(int arg0) {
        field1358++;
        class131.method1047((long) class100.field1401, class379.field5542, (byte) -2);
        if (class69.field968 != -1) {
            class586.method3253(arg0 ^ 0x135, class69.field968);
        }
        for (int var1 = 0; var1 < class131.field1940; var1++) {
            if (class627.field8773[var1]) {
                class756.field10500[var1] = true;
            }
            class555.field7488[var1] = class627.field8773[var1];
            class627.field8773[var1] = false;
        }
        class60.field823 = class100.field1401;
        if (class69.field968 != -1) {
            class131.field1940 = 0;
            class385.method2446(95);
        }
        class379.field5542.method543();
        class751.method4170(false, class379.field5542);
        int var2 = class581.method3235((byte) 1);
        if (var2 == -1) {
            var2 = class660.field9129;
        }
        if (arg0 != -343) {
            return;
        }
        if (var2 == -1) {
            var2 = class118.field1724;
        }
        class735.method4077(arg0 ^ 0x132, var2);
        class303.field4368 = 0;
    }

    @OriginalMember(owner = "client!eha", name = "c", descriptor = "(I)Ldm;")
    public static final class57 method763(int arg0) {
        field1351++;
        if (class375.field5423 == null || class458.field6349 == null) {
            return null;
        }
        if (arg0 != -10100) {
            field1359 = null;
        }
        for (class57 var1 = (class57) class458.field6349.method2255((byte) 17); var1 != null; var1 = (class57) class458.field6349.method2255((byte) 17)) {
            class680 var2 = class375.field5418.method2232(var1.field793, -113);
            if (var2 != null && var2.field9528 && var2.method3759((byte) -115, class375.field5419)) {
                return var1;
            }
        }
        return null;
    }
}
