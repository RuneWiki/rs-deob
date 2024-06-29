import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class135 extends class313 {

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "[I")
    public static int[] field2115 = new int[32];

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "Lsr;")
    public class135 field2114;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "Lsr;")
    public class135 field2120;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "[[[B")
    public static byte[][][] field2117;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V")
    public static void method991(int arg0) {
        field2117 = null;
        if (arg0 != -3) {
            field2115 = null;
        }
        field2115 = null;
    }

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "(I)V")
    public final void method992(int arg0) {
        field2119++;
        if (this.field2120 == null) {
            return;
        }
        if (arg0 != 3) {
            method991(9);
        }
        this.field2120.field2114 = this.field2114;
        this.field2114.field2120 = this.field2120;
        this.field2114 = null;
        this.field2120 = null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IBII)I")
    public static final int method993(int arg0, byte arg1, int arg2, int arg3) {
        field2118++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg0;
        }
        int var5 = -52 / ((47 - arg1) / 37);
        if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return 1023 - arg3;
        }
    }
}
