import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class676 {

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public int field9532 = 8;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public int field9533 = 16777215;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field9528 = -1;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public int field9523;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field9524;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public int field9525;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public int field9526;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public int field9529;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field9530;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field9531;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public int field9534;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Z")
    public boolean field9527;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILgk;)V")
    public final void method3790(int arg0, class540 arg1) {
        while (true) {
            int var3 = arg1.method3115(29871);
            if (var3 == 0) {
                if (arg0 != -10725) {
                    return;
                }
                field9531++;
                return;
            }
            this.method3792(var3, arg1, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)I")
    public static final int method3791(boolean arg0) {
        field9524++;
        class692 var1 = class449.field6502;
        synchronized (class449.field6502) {
            if (!arg0) {
                field9528 = -4;
            }
            return class449.field6502.method3892(0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILgk;B)V")
    private final void method3792(int arg0, class540 arg1, byte arg2) {
        if (arg2 != 111) {
            this.method3790(-104, null);
        }
        if (arg0 == 1) {
            this.field9532 = arg1.method3169(26488);
        } else if (arg0 == 2) {
            this.field9527 = true;
        } else if (arg0 == 3) {
            this.field9525 = arg1.method3129(72);
            this.field9534 = arg1.method3129(arg2 - 19);
            this.field9523 = arg1.method3129(72);
        } else if (arg0 == 4) {
            this.field9526 = arg1.method3115(29871);
        } else if (arg0 == 5) {
            this.field9529 = arg1.method3169(26488);
        } else if (arg0 == 6) {
            this.field9533 = arg1.method3154((byte) -68);
        }
        field9530++;
    }
}
