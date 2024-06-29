import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class101 extends class264 {

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
    private int field1753 = 4096;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "Lcf;")
    public static class93 field1760 = class147.method1066("null", -48);

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "Lcf;")
    public static class93 field1754 = class147.method1066("<br>", -48);

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "[I")
    public static int[] field1759 = new int[4096];

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
    public static int field1762 = 0;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "Lcf;")
    private static class93 field1749 = class147.method1066("Walk here", -48);

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "Lcf;")
    public static class93 field1756 = field1749;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "Ldh;")
    public static class120 field1752;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "Ldh;")
    public static class120 field1755;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IBIII)V")
    public static final void method726(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 125) {
            method731(41);
        }
        if (~class26.field342 >= ~arg0 && ~class271.field4820 <= ~arg0) {
            int var5 = class141.method1027(class277.field4967, arg3, false, class147.field2593);
            int var6 = class141.method1027(class277.field4967, arg4, false, class147.field2593);
            class143.method1038(var5, arg2, var6, false, arg0);
        }
        ++field1751;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
    public class101() {
        super(1, true);
    }

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "(I)V")
    public static void method727(int arg0) {
        field1752 = null;
        if (arg0 >= -101) {
            field1759 = null;
        }
        field1759 = null;
        field1756 = null;
        field1755 = null;
        field1760 = null;
        field1749 = null;
        field1754 = null;
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(B)I")
    public static final int method728(byte arg0) {
        if (arg0 > -116) {
            return -85;
        } else {
            ++field1750;
            return 2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([BB)[B")
    public static final byte[] method729(byte[] arg0, byte arg1) {
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        ++field1748;
        if (arg1 <= 70) {
            field1755 = null;
        }
        class107.method770(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        if (arg1 >= -83) {
            return null;
        } else {
            ++field1763;
            int[] var3 = super.field4716.method532((byte) 70, arg0);
            if (super.field4716.field1424) {
                int[] var4 = this.method1767(0, class53.field881 & arg0 + -1, 21654);
                int[] var5 = this.method1767(0, arg0, 21654);
                int[] var6 = this.method1767(0, arg0 + 1 & class53.field881, 21654);
                for (int var7 = 0; var7 < class176.field3060; ++var7) {
                    int var8 = (var6[var7] - var4[var7]) * this.field1753;
                    int var9 = (var5[var7 - -1 & class55.field910] + -var5[var7 + -1 & class55.field910]) * this.field1753;
                    int var10 = var9 >> 12;
                    int var11 = var10 * var10 >> 12;
                    int var12 = var8 >> 12;
                    int var13 = var12 * var12 >> 12;
                    int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var11 - -4096 + var13) / 4096.0F)));
                    int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                    var3[var7] = 4096 - var15;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIIIBI)V")
    public static final void method730(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (arg8 <= 109) {
            method729((byte[]) null, (byte) -62);
        }
        ++field1757;
        if (~class277.field4967 >= ~arg5 && ~class147.field2593 <= ~arg5 && ~arg4 <= ~class277.field4967 && arg4 <= class147.field2593 && ~class277.field4967 >= ~arg2 && arg2 <= class147.field2593 && class277.field4967 <= arg6 && arg6 <= class147.field2593 && ~class26.field342 >= ~arg7 && class271.field4820 >= arg7 && arg0 >= class26.field342 && ~class271.field4820 <= ~arg0 && arg9 >= class26.field342 && arg9 <= class271.field4820 && ~arg3 <= ~class26.field342 && ~class271.field4820 <= ~arg3) {
            class85.method587(arg5, arg3, arg9, arg6, arg0, arg7, arg4, arg1, false, arg2);
        } else {
            class176.method1256(arg9, arg1, arg6, arg4, arg5, arg0, arg3, arg2, -26138, arg7);
        }
    }

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)V")
    public static final void method731(int arg0) {
        if (arg0 != -1206350292) {
            field1752 = null;
        }
        Container var1;
        if (class126.field2236 == null) {
            if (class246.field4432 != null) {
                var1 = class246.field4432;
            } else {
                var1 = class169.field2967.field5113;
            }
        } else {
            var1 = class126.field2236;
        }
        class189.field3465 = var1.getSize().width;
        ++field1758;
        class47.field756 = var1.getSize().height;
        if (class246.field4432 == var1) {
            Insets var2 = class246.field4432.getInsets();
            class47.field756 -= var2.top + var2.bottom;
            class189.field3465 -= var2.left - -var2.right;
        }
        if (class55.method311(false) < 2) {
            class169.field2968 = 503;
            class112.field1920 = (class189.field3465 + -765) / 2;
            class150.field2629 = 765;
            class34.field537 = 0;
        } else {
            class169.field2968 = class47.field756;
            class112.field1920 = 0;
            class34.field537 = 0;
            class150.field2629 = class189.field3465;
        }
        class190.field3481.setSize(class150.field2629, class169.field2968);
        if (class246.field4432 != var1) {
            class190.field3481.setLocation(class112.field1920, class34.field537);
        } else {
            Insets var3 = class246.field4432.getInsets();
            class190.field3481.setLocation(class112.field1920 + var3.left, var3.top - -class34.field537);
        }
        if (~class69.field1262 != 0) {
            class171.method1229(true, arg0 + 1206350389);
        }
        class24.method126((byte) -70);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (arg0 <= 11) {
            field1752 = null;
        }
        ++field1761;
        if (~arg1 == -1) {
            this.field1753 = arg2.method1891(-113);
        }
    }
}
