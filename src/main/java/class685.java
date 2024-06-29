import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public abstract class class685 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Lmq;")
    public static class472 field9782 = new class472(64);

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field9783 = 0;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field9784 = -1;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field9785;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 6)
    public static void method3882(int arg0) {
        if (arg0 != -25598) {
            field9784 = 97;
        }
        field9782 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V", line = 22)
    public static final void method3883(boolean arg0) {
        field9785++;
        if (!arg0) {
            method3882(-32);
        }
        class24.field576.method2776(!arg0);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)Z")
    public abstract boolean method1856(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([BIBI)I")
    public abstract int method1851(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public abstract void method1853(byte arg0);

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III[B)V")
    public abstract void method1855(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public abstract void method1852(int arg0);
}
