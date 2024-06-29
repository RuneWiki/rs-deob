import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class288 extends InputStream {

    @OriginalMember(owner = "client!uea", name = "e", descriptor = "I")
    public static int field3883 = 100;

    @OriginalMember(owner = "client!uea", name = "f", descriptor = "Ljk;")
    public static class585 field3884 = new class585(34, -1);

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "Z")
    public static volatile boolean field3885 = true;

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "Lwo;")
    public static class690 field3886 = new class690(87, 3);

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!uea", name = "d", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)V", line = 4)
    public static void method1713(int arg0) {
        field3884 = null;
        if (arg0 < 26) {
            field3886 = null;
        }
        field3886 = null;
    }

    @OriginalMember(owner = "client!uea", name = "read", descriptor = "()I", line = 19)
    public final int read() {
        class151.method974((byte) -102, 30000L);
        field3880++;
        return -1;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(BLjava/lang/String;Z)V", line = 29)
    public static final void method1714(byte arg0, String arg1, boolean arg2) {
        field3882++;
        if (arg1 == null) {
            return;
        }
        if (class230.field3000 >= 100) {
            class175.method1103((byte) 38, 4, class424.field6077.method2561(class370.field4980, 0));
            return;
        }
        String var3 = class399.method2414(arg1, false);
        if (var3 == null) {
            return;
        }
        if (arg0 != -29) {
            method1713(-97);
        }
        for (int var4 = 0; var4 < class230.field3000; var4++) {
            String var9 = class399.method2414(class100.field1340[var4], false);
            if (var9 != null && var9.equals(var3)) {
                class175.method1103((byte) 38, 4, arg1 + class424.field6078.method2561(class370.field4980, 0));
                return;
            }
            if (class405.field5735[var4] != null) {
                String var10 = class399.method2414(class405.field5735[var4], false);
                if (var10 != null && var10.equals(var3)) {
                    class175.method1103((byte) 38, 4, arg1 + class424.field6078.method2561(class370.field4980, 0));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class700.field9897; var5++) {
            String var7 = class399.method2414(class529.field7730[var5], false);
            if (var7 != null && var7.equals(var3)) {
                class175.method1103((byte) 38, 4, class424.field6083.method2561(class370.field4980, 0) + arg1 + class424.field6084.method2561(class370.field4980, 0));
                return;
            }
            if (class173.field2125[var5] != null) {
                String var8 = class399.method2414(class173.field2125[var5], false);
                if (var8 != null && var8.equals(var3)) {
                    class175.method1103((byte) 38, 4, class424.field6083.method2561(class370.field4980, 0) + arg1 + class424.field6084.method2561(class370.field4980, 0));
                    return;
                }
            }
        }
        if (class399.method2414(class206.field2472.field8801, false).equals(var3)) {
            class175.method1103((byte) 38, 4, class424.field6080.method2561(class370.field4980, arg0 ^ 0xFFFFFFE3));
            return;
        }
        class630.field9017++;
        class543 var6 = class299.method1780(class84.field1196, class105.field1368, 103);
        var6.field7872.method2281((byte) 58, class251.method1534(arg1, (byte) 99) + 1);
        var6.field7872.method2269(arg1, -87);
        var6.field7872.method2281((byte) 58, arg2 ? 1 : 0);
        class511.method3028(7482, var6);
    }
}
