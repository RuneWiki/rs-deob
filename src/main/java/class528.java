import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class528 extends class495 {

    @OriginalMember(owner = "client!dw", name = "I", descriptor = "Ljm;")
    public static class395 field6864 = class205.method1324((byte) -111);

    @OriginalMember(owner = "client!dw", name = "M", descriptor = "Z")
    public static boolean field6868 = false;

    @OriginalMember(owner = "client!dw", name = "N", descriptor = "[Les;")
    public static class244[] field6869 = new class244[2048];

    @OriginalMember(owner = "client!dw", name = "D", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!dw", name = "K", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!dw", name = "L", descriptor = "I")
    public static int field6867;

    @OriginalMember(owner = "client!dw", name = "J", descriptor = "[B")
    private byte[] field6865;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(IIII)[B", line = 3)
    public final byte[] method2813(int arg0, int arg1, int arg2, int arg3) {
        this.field6865 = new byte[arg0 * arg1 * arg3 * 2];
        if (arg2 == -1672) {
            field6863++;
            this.method3734(arg0, arg3, 255, arg1);
            return this.field6865;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V", line = 23)
    public class528() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIB)V", line = 27)
    public final void method2061(int arg0, int arg1, byte arg2) {
        field6866++;
        if (arg0 >= -29) {
            return;
        }
        int var4 = arg1 * 2;
        int var5 = arg2 & 0xFF;
        int var6 = var4 + 1;
        this.field6865[var4] = -1;
        this.field6865[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)V", line = 43)
    public static void method2814(int arg0) {
        if (arg0 == 33) {
            field6864 = null;
            field6869 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(III)Z", line = 55)
    public static final boolean method2815(int arg0, int arg1, int arg2) {
        int var3 = 50 / ((arg0 + 42) / 59);
        field6867++;
        return (arg1 & 0x21) != 0;
    }
}
