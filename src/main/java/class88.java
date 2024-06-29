import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class88 {

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Lfaa;")
    public static class140 field1195 = null;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Lfc;")
    public static class235 field1193 = new class235(115, 2);

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 3)
    public static void method661(int arg0) {
        field1193 = null;
        field1195 = null;
        if (arg0 <= 7) {
            method661(111);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Loa;IIIIII)Lba;", line = 18)
    public static final class352 method662(class638 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1196++;
        long var7 = (long) arg5;
        class352 var9 = (class352) class528.field7233.method1986((byte) -98, var7);
        short var10 = 2055;
        if (var9 == null) {
            class661 var11 = class383.method2210(false, 0, class317.field4707, arg5);
            if (var11 == null) {
                return null;
            }
            if (var11.field9323 < 13) {
                var11.method3660((byte) 63, 2);
            }
            var9 = arg0.method379(var11, var10, class426.field5999, 64, 768);
            class528.field7233.method1985(var9, var7, (byte) -102);
        }
        if (arg4 != 2639) {
            method662(null, -16, -31, 10, -70, -35, -30);
        }
        class352 var12 = var9.method235((byte) 2, var10, true);
        if (arg2 != 0) {
            var12.method225(arg2);
        }
        if (arg6 != 0) {
            var12.method233(arg6);
        }
        if (arg1 != 0) {
            var12.method223(arg1);
        }
        if (arg3 != 0) {
            var12.method224(0, arg3, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/lang/Object;Ltt;Z)V", line = 72)
    public static final void method663(Object arg0, class79 arg1, boolean arg2) {
        field1194++;
        if (arg1.field1076 == null) {
            return;
        }
        if (!arg2) {
            field1193 = null;
        }
        for (int var3 = 0; var3 < 50 && arg1.field1076.peekEvent() != null; var3++) {
            class419.method2390(118, 1L);
        }
        try {
            if (arg0 != null) {
                arg1.field1076.postEvent(new ActionEvent(arg0, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }
}
