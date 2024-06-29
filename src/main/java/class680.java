import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class680 {

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field9440;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field9442;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field9443;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field9444;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field9445;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "Ltga;")
    public static class63 field9439;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "[I")
    public static int[] field9441;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIBJ)V")
    public static final void method3852(int arg0, int arg1, byte arg2, long arg3) {
        field9444++;
        int var5 = (int) arg3 >> 14 & 0x1F;
        int var6 = ((int) arg3 & 0x3701EE) >> 20;
        if (arg2 <= 101) {
            method3852(-46, -123, (byte) -78, 119L);
        }
        int var7 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class394.method2436(0, var5, 0, arg0, true, arg1, var6, 0, 0);
            return;
        }
        class282 var8 = class277.field4038.method3919(true, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field4125;
            var10 = var8.field4188;
        } else {
            var9 = var8.field4188;
            var10 = var8.field4125;
        }
        int var11 = var8.field4165;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class394.method2436(var9, 0, var10, arg0, true, arg1, 0, 0, var11);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public static void method3853(int arg0) {
        field9439 = null;
        field9441 = null;
        if (arg0 != -1) {
            method3854(false, null);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLfb;)I")
    public static final int method3854(boolean arg0, class702 arg1) {
        field9440++;
        int var2 = arg1.field9766;
        if (arg0) {
            field9441 = null;
        }
        class539 var3 = arg1.method2096(0);
        if (arg1.field4659 == -1 || arg1.field4615) {
            var2 = arg1.field9790;
        } else if (arg1.field4659 == var3.field7770 || arg1.field4659 == var3.field7776 || arg1.field4659 == var3.field7765 || arg1.field4659 == var3.field7777) {
            var2 = arg1.field9752;
        } else if (arg1.field4659 == var3.field7783 || arg1.field4659 == var3.field7740 || arg1.field4659 == var3.field7753 || arg1.field4659 == var3.field7769) {
            var2 = arg1.field9755;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[Ljava/awt/Rectangle;I)V")
    public static final void method3855(int arg0, Rectangle[] arg1, int arg2) throws class736 {
        if (class763.field10520 == 1) {
            class571.field8060.method498(arg1, arg0, class387.field5362, class631.field8874);
        } else {
            class571.field8060.method498(arg1, arg0, 0, 0);
        }
        field9443++;
        if (arg2 >= -19) {
            method3852(124, -117, (byte) 7, -95L);
        }
    }
}
