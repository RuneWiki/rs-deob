import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class219 {

    @OriginalMember(owner = "client!so", name = "e", descriptor = "Z")
    public static boolean field3371 = false;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3372 = " is already on your friend list.";

    @OriginalMember(owner = "client!so", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3370 = null;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IB)V", line = 8)
    public static final void method1478(int arg0, byte arg1) {
        if (arg1 != 16) {
            method1480(-36);
        }
        class261.field4115.method645(arg0, (byte) -84);
        field3369++;
        class346.field5540.method645(arg0, (byte) -32);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Luo;Ljava/awt/Frame;I)V", line = 27)
    public static final void method1479(class274 arg0, Frame arg1, int arg2) {
        field3373++;
        while (true) {
            class158 var3 = arg0.method1947(-83, arg1);
            while (var3.field2542 == 0) {
                class177.method1246(10L, -32644);
            }
            if (var3.field2542 == 1) {
                int var4 = 116 / ((arg2 + 65) / 48);
                arg1.setVisible(false);
                arg1.dispose();
                return;
            }
            class177.method1246(100L, -32644);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V", line = 52)
    public static void method1480(int arg0) {
        field3372 = null;
        field3370 = null;
        if (arg0 != 1) {
            method1479((class274) null, (Frame) null, 81);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIII)Z", line = 75)
    public static final boolean method1481(int arg0, int arg1, int arg2, int arg3) {
        if (class148.method1054(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class353.method2467(var4 + 1, class101.field1457[arg0][arg1][arg2] + arg3, var5 + 1) && class353.method2467(var4 + 128 - 1, class101.field1457[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class353.method2467(var4 + 128 - 1, class101.field1457[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class353.method2467(var4 + 1, class101.field1457[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }
}
