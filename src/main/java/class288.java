import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class288 {

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "[I")
    public static int[] field3991;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V", line = 5)
    public static void method1860(byte arg0) {
        if (arg0 >= 67) {
            field3991 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIILrg;I)V", line = 15)
    public static final void method1861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class383 arg6, int arg7) {
        field3992++;
        if (class232.field3139) {
            class199.field2752 = 32;
        } else {
            class199.field2752 = 0;
        }
        class232.field3139 = false;
        if (arg0 != 16) {
            field3991 = null;
        }
        if (class409.field5938 != 0) {
            if (arg5 >= arg3 && (arg3 + 16) > arg5 && arg7 <= arg4 && (arg7 + 16) > arg4) {
                arg6.field5434 -= 4;
                class86.method596(arg0 + 14443, arg6);
            } else if (arg5 >= arg3 && arg5 < (arg3 + 16) && (arg7 + arg2 - 16) <= arg4 && arg4 < (arg2 + arg7)) {
                arg6.field5434 += 4;
                class86.method596(14459, arg6);
            } else if (arg5 >= arg3 - class199.field2752 && arg3 + class199.field2752 + 16 > arg5 && arg7 + 16 <= arg4 && (arg2 + arg7 - 16) > arg4) {
                int var8 = (arg2 - 32) * arg2 / arg1;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg4 - (var8 / 2 + arg7) - 16;
                int var10 = arg2 - var8 - 32;
                arg6.field5434 = (arg1 - arg2) * var9 / var10;
                class86.method596(14459, arg6);
                class232.field3139 = true;
            }
        }
        if (class107.field1586 == 0) {
            return;
        }
        int var11 = arg6.field5431;
        if (arg5 >= arg3 - var11 && arg4 >= arg7 && (arg3 + 16) > arg5 && arg7 + arg2 >= arg4) {
            arg6.field5434 += class107.field1586 * 45;
            class86.method596(arg0 + 14443, arg6);
            return;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/Object;Lkq;B)V", line = 83)
    public static final void method1862(Object arg0, class351 arg1, byte arg2) {
        field3990++;
        if (arg1.field4901 == null || arg2 != 24) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field4901.peekEvent() != null; var3++) {
            class4.method28(1L, -89);
        }
        if (arg0 != null) {
            arg1.field4901.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }
}
