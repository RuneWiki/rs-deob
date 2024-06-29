import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public abstract class class190 {

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Ljw;")
    public static class581 field2526 = new class581(131, 10);

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 7)
    public static final void method1312(int arg0) {
        field2527++;
        if (arg0 != 17381) {
            method1314(-115);
        }
        try {
            if (class99.field1374 == 1) {
                int var1 = class207.field2705.method4179(33);
                if (var1 > 0 && class207.field2705.method4165((byte) 122)) {
                    int var2 = var1 - class311.field4478;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class207.field2705.method4153((byte) 67, var2);
                    return;
                }
                class207.field2705.method4180(10293);
                class207.field2705.method4154((byte) 20);
                if (class549.field7445 == null) {
                    class99.field1374 = 0;
                } else {
                    class99.field1374 = 2;
                }
                class326.field4753 = null;
                class545.field7392 = null;
            }
            if (class99.field1374 == 3) {
                int var3 = class207.field2705.method4179(45);
                if (var3 < class300.field4348 && class207.field2705.method4165((byte) 122)) {
                    int var4 = class752.field10420 + var3;
                    if (class300.field4348 < var4) {
                        var4 = class300.field4348;
                    }
                    class207.field2705.method4153((byte) -30, var4);
                } else {
                    class752.field10420 = 0;
                    class99.field1374 = 0;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class207.field2705.method4180(arg0 - 7088);
            class99.field1374 = 0;
            class326.field4753 = null;
            class545.field7392 = null;
            class633.field8849 = null;
            class549.field7445 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V", line = 83)
    public static void method1314(int arg0) {
        field2526 = null;
        if (arg0 != 0) {
            method1312(43);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)J")
    public abstract long method1313(byte arg0);
}
