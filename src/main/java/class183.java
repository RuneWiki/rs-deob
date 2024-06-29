import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class183 {

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "Lpr;")
    public static class407 field2234 = new class407(46, 5);

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILjava/lang/Object;Lpe;)V")
    public static final void method1063(int arg0, Object arg1, class556 arg2) {
        field2233++;
        if (arg2.field7934 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field7934.peekEvent() != null; var3++) {
            class370.method2025(-1, 1L);
        }
        try {
            if (arg1 != null) {
                arg2.field7934.postEvent(new ActionEvent(arg1, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
        if (arg0 != -7901) {
            method1064(null, (byte) 64, null, null, null);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lco;BLjo;Ljo;Ljo;)Z")
    public static final boolean method1064(class106 arg0, byte arg1, class303 arg2, class303 arg3, class303 arg4) {
        class347.field4525 = arg3;
        class539.field7758 = arg2;
        if (arg1 != 96) {
            field2234 = null;
        }
        class496.field7167 = arg4;
        field2232++;
        class112.field1304 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)V")
    public static void method1065(byte arg0) {
        field2234 = null;
        if (arg0 != 93) {
            field2234 = null;
        }
    }
}
