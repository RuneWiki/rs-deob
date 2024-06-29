import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public abstract class class694 {

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field9822;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Z")
    public static boolean field9824;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "[[[I")
    public static int[][][] field9823;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 4)
    public static void method3914(int arg0) {
        field9823 = null;
        int var1 = -13 % ((-arg0 - 59) / 48);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
    public abstract void method1576(boolean arg0);

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)V")
    public abstract void method1581(boolean arg0);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z[BII)I")
    public abstract int method1577(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([BIII)V")
    public abstract void method1580(byte[] arg0, int arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)Z")
    public abstract boolean method1579(int arg0, int arg1) throws IOException;
}
