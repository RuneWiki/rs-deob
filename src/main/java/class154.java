import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class154 extends class399 {

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "[I")
    public static int[] field2624 = new int[6];

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field2629 = 0;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2630 = null;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "[B")
    private byte[] field2625;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZBI)V")
    public final void method1273(boolean arg0, byte arg1, int arg2) {
        field2628++;
        int var4 = arg2 * 2;
        if (!arg0) {
            field2624 = null;
        }
        int var5 = arg1 & 0xFF;
        this.field2625[var4++] = -1;
        this.field2625[var4] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class154() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(Z)V")
    public static void method1274(boolean arg0) {
        field2630 = null;
        if (!arg0) {
            method1277(-117, -61, -84, -16, -85);
        }
        field2624 = null;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(IIII)[B")
    public final byte[] method1275(int arg0, int arg1, int arg2, int arg3) {
        field2626++;
        this.field2625 = new byte[arg0 * arg2 * arg1 * 2];
        this.method1998(arg2, 4095, arg0, arg1);
        if (arg3 > -79) {
            this.method1273(false, (byte) 74, 27);
        }
        return this.field2625;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V")
    public static final void method1276(byte arg0) {
        field2627++;
        class192.field3180.method1901(0);
        if (arg0 < 35) {
            method1274(false);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V")
    public static final void method1277(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 105) {
            return;
        }
        for (int var5 = 0; var5 < class700.field9880; var5++) {
            Rectangle var6 = class462.field6896[var5];
            if (var6.x + var6.width > arg4 && arg1 + arg4 > var6.x && var6.y + var6.height > arg0 && (arg0 + arg2) > var6.y) {
                class185.field3111[var5] = true;
            }
        }
        field2623++;
    }
}
