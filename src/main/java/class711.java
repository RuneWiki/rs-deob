import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class class711 {

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public static int field9945 = 0;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "[I")
    public static int[] field9944 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field9946 = 0;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)[B")
    public abstract byte[] method3065(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B[B)V")
    public abstract void method3067(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method3066(boolean arg0);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
    public static void method3911(byte arg0) {
        field9944 = null;
        if (arg0 > -6) {
            field9945 = -44;
        }
    }
}
