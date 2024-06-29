import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class175 extends class280 {

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "[B")
    public byte[] field2848;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2849 = "Close";

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field2850 = 0;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "Ljava/awt/Frame;")
    public static Frame field2847;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
    public static void method1314(byte arg0) {
        field2847 = null;
        field2849 = null;
        if (arg0 != 10) {
            field2849 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "([B)V")
    public class175(byte[] arg0) {
        this.field2848 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIILwg;JLwg;Lwg;)V")
    public static final void method1315(int arg0, int arg1, int arg2, int arg3, class178 arg4, long arg5, class178 arg6, class178 arg7) {
        class169 var9 = new class169();
        var9.field2715 = arg4;
        var9.field2717 = arg1 * 128 + 64;
        var9.field2716 = arg2 * 128 + 64;
        var9.field2719 = arg3;
        var9.field2727 = arg5;
        var9.field2733 = arg6;
        var9.field2732 = arg7;
        int var10 = 0;
        class286 var11 = class220.field3525[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field4541; var12++) {
                class166 var13 = var11.field4530[var12];
                if ((var13.field2683 & 0x400000L) == 4194304L) {
                    int var14 = var13.field2681.method3();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2718 = -var10;
        if (class220.field3525[arg0][arg1][arg2] == null) {
            class220.field3525[arg0][arg1][arg2] = new class286(arg0, arg1, arg2);
        }
        class220.field3525[arg0][arg1][arg2].field4525 = var9;
    }
}
