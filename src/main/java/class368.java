import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class368 extends class66 {

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public int field5764;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public int field5761;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "Z")
    public static boolean field5762 = false;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field5763 = -1;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIFIIZII)[I")
    public static final int[] method2435(int arg0, int arg1, float arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field5766++;
        int[] var8 = new int[arg3];
        if (arg7 >= -14) {
            return null;
        }
        class331 var9 = new class331();
        var9.field5124 = arg6;
        var9.field5123 = arg4;
        var9.field5127 = (int) (arg2 * 4096.0F);
        var9.field5128 = arg0;
        var9.field5130 = arg5;
        var9.field5112 = arg1;
        var9.method3((byte) -15);
        class556.method3323(1, 0, arg3);
        var9.method2221(85, var8, 0);
        return var8;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(II)V")
    public class368(int arg0, int arg1) {
        this.field5764 = arg0;
        this.field5761 = arg1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method2436(int arg0, byte[] arg1) {
        field5765++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class398.method2566(arg1, arg0, var3, 0, var2);
        return var3;
    }
}
