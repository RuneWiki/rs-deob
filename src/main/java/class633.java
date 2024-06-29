import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public abstract class class633 extends class578 {

    @OriginalMember(owner = "client!ufa", name = "y", descriptor = "Z")
    public volatile boolean field8762 = true;

    @OriginalMember(owner = "client!ufa", name = "C", descriptor = "[I")
    public static int[] field8766;

    @OriginalMember(owner = "client!ufa", name = "D", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!ufa", name = "A", descriptor = "[Z")
    public static boolean[] field8764;

    @OriginalMember(owner = "client!ufa", name = "x", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!ufa", name = "z", descriptor = "Z")
    public boolean field8763;

    @OriginalMember(owner = "client!ufa", name = "B", descriptor = "Z")
    public boolean field8765;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)I")
    public abstract int method569(byte arg0);

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "(I)V")
    public static void method3541(int arg0) {
        if (arg0 != 15) {
            field8766 = null;
        }
        field8766 = null;
        field8764 = null;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IILhb;I)V")
    public static final void method3542(int arg0, int arg1, class677 arg2, int arg3) {
        if (arg1 != 10) {
            method3542(-80, -23, null, -101);
        }
        field8761++;
        int[] var4 = new int[4];
        class359.method2051(var4, 0, var4.length, arg3);
        class651.method3668(arg1 + 109, var4, arg0, arg2);
    }

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "(I)[B")
    public abstract byte[] method572(int arg0);

    static {
        new class290("", 76);
        field8766 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };
        field8767 = 0;
        field8764 = new boolean[100];
    }
}
