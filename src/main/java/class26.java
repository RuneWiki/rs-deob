import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class26 extends class376 {

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "Ltc;")
    public class196 field423 = new class196();

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Lng;")
    public static class190 field422 = new class190(64);

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "Lng;")
    public static class190 field424 = new class190(4);

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V", line = 5)
    public static final void method213(int arg0) {
        int var1 = 63 % ((arg0 - 29) / 34);
        field421++;
        if (class79.field1220 == 10) {
            class312.method1977(28, (byte) -77);
        }
        if (class79.field1220 == 30) {
            class312.method1977(25, (byte) 78);
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V", line = 22)
    public static void method214(int arg0) {
        if (arg0 != -15392) {
            method214(-11);
        }
        field424 = null;
        field422 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 46)
    public static final void method215(int arg0, int arg1) {
        field426++;
        class190 var2 = class414.field6007;
        synchronized (class414.field6007) {
            class414.field6007.method1254(arg0, -5);
        }
        class190 var3 = class188.field2607;
        synchronized (class188.field2607) {
            class188.field2607.method1254(arg0, -88);
            if (arg1 != 1097) {
                field420 = -50;
            }
        }
    }
}
