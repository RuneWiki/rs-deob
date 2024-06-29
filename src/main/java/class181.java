import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class181 extends class56 {

    @OriginalMember(owner = "client!cfa", name = "G", descriptor = "I")
    private int field2209 = 4096;

    @OriginalMember(owner = "client!cfa", name = "E", descriptor = "I")
    private int field2207 = 0;

    @OriginalMember(owner = "client!cfa", name = "F", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!cfa", name = "H", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!cfa", name = "J", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!cfa", name = "I", descriptor = "Lhu;")
    public static class143 field2211;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field2209 = arg2.method2390((byte) 67);
            }
        } else {
            this.field2207 = arg2.method2390((byte) -105);
        }
        if (arg0 >= -44) {
            this.method145(14, -88);
        }
        ++field2208;
    }

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "(Z)V")
    public static void method1213(boolean arg0) {
        field2211 = null;
        if (arg0) {
            field2211 = null;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIII)V")
    public static final void method1214(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 2740) {
            method1214(-43, 60, -22, 2, -101);
        }
        for (int var5 = 0; ~var5 > ~class104.field1332; ++var5) {
            Rectangle var6 = class483.field6743[var5];
            if (~arg2 > ~(var6.x + var6.width) && ~(arg2 - -arg4) < ~var6.x && ~(var6.y + var6.height) < ~arg3 && var6.y < arg1 + arg3) {
                class255.field2977[var5] = true;
            }
        }
        ++field2212;
        class326.method1945(arg3, arg2 + arg4, arg2, arg1 + arg3, false);
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "()V")
    public class181() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field2209 = -75;
        }
        ++field2210;
        int[] var3 = super.field752.method1308(false, arg1);
        if (super.field752.field2441) {
            int[] var4 = this.method492(0, arg1, (byte) 76);
            for (int var5 = 0; class642.field8759 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field2207 && ~this.field2209 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }
}
