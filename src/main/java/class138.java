import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class138 {

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Z")
    public boolean field2573 = true;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public int field2572;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public int field2564;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public int field2566;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public int field2561;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public int field2563;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public int field2565;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lsg;")
    private static class169 field2570 = class165.method1060("Unexpected loginserver response)3", 1536);

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "Lsg;")
    public static class169 field2571 = field2570;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public static void method924(boolean arg0) {
        field2570 = null;
        field2571 = null;
        if (!arg0) {
            field2571 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lbf;")
    public static final class17 method925(int arg0, int arg1) {
        field2567++;
        class17 var2 = (class17) class68.field1284.method1206((long) arg1, arg0 ^ 0xFFFF9F5C);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class68.field1279.method552(arg1, arg0, 0);
        class17 var4 = new class17();
        var4.field362 = arg1;
        if (var3 != null) {
            var4.method101(new class127(var3), -74);
        }
        var4.method105(2);
        if (var4.field370) {
            var4.field360 = 0;
            var4.field399 = false;
        }
        class68.field1284.method1208((long) arg1, arg0 ^ 0x30, var4);
        return var4;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lma;Ljava/lang/Object;I)V")
    public static final void method926(class109 arg0, Object arg1, int arg2) {
        field2562++;
        if (arg0.field1990 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field1990.peekEvent() != null; var3++) {
            client.method203(1L, (byte) -102);
        }
        if (arg1 != null) {
            arg0.field1990.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
        if (arg2 != 1) {
            method926(null, null, 5);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILhe;)V")
    public static final void method927(int arg0, class69 arg1) {
        field2568++;
        class69.field1297 = arg1;
        if (arg0 != 50) {
            method926(null, null, 109);
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2573 = arg6;
        this.field2572 = arg3;
        this.field2564 = arg5;
        this.field2566 = arg2;
        this.field2561 = arg4;
        this.field2563 = arg1;
        this.field2565 = arg0;
    }
}
