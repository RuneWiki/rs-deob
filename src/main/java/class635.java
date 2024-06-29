import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class635 extends class449 {

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "Ljb;")
    public static class519 field8575 = new class519(4, 17);

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field8578 = new Rectangle[100];

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "Z")
    public static boolean field8577 = true;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
    public static int field8574;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "I")
    public static int field8576;

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "I")
    public static int field8579;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(Z)V")
    public static final void method3502(boolean arg0) {
        ++field8576;
        if (!arg0) {
            class282.field4078.method3113(-127);
            class338.field4739.method3113(-127);
            class647.field8730.method3113(-128);
            class98.field1408.method3113(-128);
        }
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)V")
    public static void method3503(int arg0) {
        field8578 = null;
        field8575 = null;
        if (arg0 <= 38) {
            field8579 = 72;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IB)[[I")
    public final int[][] method238(int arg0, byte arg1) {
        ++field8574;
        if (arg1 > -47) {
            method3502(false);
        }
        int[][] var3 = super.field2316.method3602(arg0, (byte) -74);
        if (super.field2316.field8746 && this.method2672((byte) 71)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field6459 * super.field6459;
            for (int var8 = 0; ~var8 > ~class598.field8136; ++var8) {
                int var9 = super.field6457[var7 - -(var8 % super.field6458)];
                var6[var8] = class519.method3018(255, var9) << 4;
                var5[var8] = class519.method3018(4080, var9 >> 4);
                var4[var8] = class519.method3018(var9, 16711680) >> 12;
            }
        }
        return var3;
    }
}
