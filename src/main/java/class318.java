import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class318 {

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public int field4507 = 0;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field4513 = -1;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "Lvk;")
    public static class367 field4511;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILha;IB)V")
    public static final void method2044(int arg0, class58 arg1, int arg2, byte arg3) {
        class359.field5033 = new class154[arg0][arg2];
        field4510++;
        class532.field7530 = arg1;
        if (arg3 != 38) {
            field4511 = null;
        }
        if (class77.field1456 != null) {
            class618.field8927 = class459.method2802(class77.field1456[0], class77.field1456[3], class77.field1456[1], class77.field1456[5], 112, class77.field1456[4], class77.field1456[2]);
        }
        class692.field9743 = new class154();
        class183.method1310(3);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
    public static void method2045(int arg0) {
        field4511 = null;
        if (arg0 != 5) {
            field4511 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILud;B)V")
    private final void method2046(int arg0, class35 arg1, byte arg2) {
        if (arg2 != -28) {
            this.method2047(null, -76);
        }
        if (arg0 == 5) {
            this.field4507 = arg1.method253(-13900);
        }
        field4509++;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lud;I)V")
    public final void method2047(class35 arg0, int arg1) {
        field4508++;
        while (true) {
            int var3 = arg0.method273(255);
            if (var3 == 0) {
                if (arg1 >= -27) {
                    method2044(-80, null, -76, (byte) -6);
                    return;
                } else {
                    return;
                }
            }
            this.method2046(var3, arg0, (byte) -28);
        }
    }
}
