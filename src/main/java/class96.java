import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class96 extends class33 {

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
    public static int field1764 = 0;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    public static int field1769 = 0;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public static int field1766 = 100;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
    public static int field1770 = 0;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "Lqf;")
    public static class165 field1768;

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class96() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)V")
    public static void method595(int arg0) {
        field1768 = null;
        if (arg0 >= -42) {
            field1769 = 25;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        int var3 = 68 % ((-65 - arg1) / 60);
        int[] var4 = super.field718.method514(arg0, -7);
        if (super.field718.field1615) {
            class85.method554(var4, 0, class117.field2173, class105.field1937[arg0]);
        }
        ++field1767;
        return var4;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIBIIILqf;)V")
    public static final void method596(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, class165 arg7) {
        if (!class199.field3879) {
            class138.field2589 = 0;
        } else {
            class138.field2589 = 32;
        }
        ++field1765;
        class199.field3879 = false;
        if (~class144.field2685 != -1) {
            if (~arg1 <= ~arg0 && ~(arg0 + 16) < ~arg1 && ~arg5 <= ~arg6 && arg6 + 16 > arg5) {
                arg7.field3087 -= 4;
                class209.method1379(1, arg7);
            } else if (arg0 <= arg1 && arg1 < arg0 + 16 && ~arg5 <= ~(arg4 + arg6 + -16) && arg5 < arg4 + arg6) {
                arg7.field3087 += 4;
                class209.method1379(arg3 + 33, arg7);
            } else if (~(-class138.field2589 + arg0) >= ~arg1 && ~(class138.field2589 + arg0 + 16) < ~arg1 && ~(arg6 - -16) >= ~arg5 && arg6 + -16 + arg4 > arg5) {
                int var8 = (arg4 - 32) * arg4 / arg2;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = -(var8 / 2) + arg5 - (arg6 + 16);
                int var10 = arg4 + -32 - var8;
                arg7.field3087 = (arg2 - arg4) * var9 / var10;
                class209.method1379(arg3 + 33, arg7);
                class199.field3879 = true;
            }
        }
        if (~class166.field3202 != -1) {
            int var11 = arg7.field3156;
            if (arg0 - var11 <= arg1 && ~arg5 <= ~arg6 && ~(arg0 + 16) < ~arg1 && arg4 + arg6 >= arg5) {
                arg7.field3087 += class166.field3202 * 45;
                class209.method1379(1, arg7);
            }
        }
        if (arg3 != -32) {
            method595(-69);
        }
    }
}
