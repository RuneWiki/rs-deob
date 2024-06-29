import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class570 {

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public static int field7877 = -1;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "I")
    public static int field7878;

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field7875;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)I")
    public static final int method3343(boolean arg0) {
        field7876++;
        if (class521.field7260 == 1) {
            return class239.field3574;
        } else if (arg0) {
            return class196.field2637;
        } else {
            return 106;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(FB)F")
    public static final float method3344(float arg0, byte arg1) {
        if (arg1 != 48) {
            field7875 = null;
        }
        field7878++;
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
    public static void method3345(int arg0) {
        if (arg0 != -30124) {
            method3345(4);
        }
        field7875 = null;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
    public static final void method3346(byte arg0) {
        class67.field1033.method2448(104);
        field7879++;
        int var1 = 0;
        if (arg0 != -56) {
            method3343(true);
        }
        while (var1 < 32) {
            class537.field7443[var1] = 0L;
            var1++;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class473.field6561[var2] = 0L;
        }
        class751.field10328 = 0;
    }
}
