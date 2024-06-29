import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class209 {

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public int field3493 = 0;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public int field3494 = 0;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
    public int field3498 = 2048;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
    public int field3495 = 2048;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "Z")
    public static boolean field3497 = false;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "F")
    public static float field3499;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLie;)V")
    public final void method1593(byte arg0, class6 arg1) {
        while (true) {
            int var3 = arg1.method70(-9059);
            if (var3 == 0) {
                field3491++;
                if (arg0 != -119) {
                    method1594(-27, 117, (byte) 41, false);
                    return;
                }
                return;
            }
            this.method1595(2048, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIBZ)I")
    public static final int method1594(int arg0, int arg1, byte arg2, boolean arg3) {
        field3496++;
        if (arg2 > -43) {
            return 11;
        }
        class527 var4 = class605.method3523(arg3, (byte) 120, arg0);
        if (var4 == null) {
            return 0;
        } else if (arg1 >= 0 && var4.field7697.length > arg1) {
            return var4.field7697[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILie;I)V")
    private final void method1595(int arg0, class6 arg1, int arg2) {
        if (arg2 == 1) {
            this.field3494 = arg1.method70(-9059);
        } else if (arg2 == 2) {
            this.field3498 = arg1.method67(12021);
        } else if (arg2 == 3) {
            this.field3495 = arg1.method67(12021);
        } else if (arg2 == 4) {
            this.field3493 = arg1.method45(-8652);
        }
        field3492++;
        if (arg0 != 2048) {
            this.method1593((byte) -106, null);
        }
    }
}
