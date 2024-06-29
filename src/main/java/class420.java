import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class420 extends class320 {

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "S")
    public short field6282;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "Z")
    public static boolean field6277 = false;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "[I")
    public static int[] field6280 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "Ljv;")
    public static class55 field6276 = new class55(8);

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZI)Z")
    public static final boolean method2538(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field6277 = false;
        }
        field6281++;
        return (arg2 & 0x70000) != 0 | class315.method2052((byte) -43, arg2, arg0) || class33.method350((byte) 68, arg0, arg2);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2539(int arg0, byte arg1, int arg2) {
        if (arg1 > -89) {
            field6277 = true;
        }
        field6279++;
        return ((arg2 & 0x2000) != 0 | class105.method795((byte) -127, arg2, arg0) | class200.method1380(arg0, arg2, (byte) 40)) & class19.method153(arg2, arg0, -1);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
    public static void method2540(boolean arg0) {
        field6280 = null;
        field6276 = null;
        if (arg0) {
            field6277 = true;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)V")
    public static final void method2541(int arg0, int arg1, int arg2, int arg3) {
        class260.field3784 = new byte[arg0][arg3][arg1];
        if (arg2 != 64) {
            field6283 = -42;
        }
        field6278++;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
    public class420() {
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(S)V")
    public class420(short arg0) {
        this.field6282 = arg0;
    }
}
