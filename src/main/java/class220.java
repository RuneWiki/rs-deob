import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class220 extends class253 {

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public int field3866;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public int field3868;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public static int field3865 = 0;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Ljd;")
    public static class85 field3867 = class221.method1499(" (X", (byte) 95);

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
    public static void method1497(int arg0) {
        if (arg0 != 1736) {
            method1498(22, 20, 87, 48, -124, -91, (class255) null);
        }
        field3867 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIILjb;)V")
    public static final void method1498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class255 arg6) {
        if (arg2 <= 78) {
            field3867 = null;
        }
        field3864++;
        int var7 = arg5 * arg5 + (arg1 * arg1);
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg6.field4513 / 2, arg6.field4482 / 2);
        if (var8 * var8 >= var7) {
            class36.method245(true, arg6, arg3, arg5, arg1, arg4, class144.field2473[arg0]);
            return;
        }
        var8 -= 10;
        int var9 = class30.field450 + class64.field1185 & 0x7FF;
        int var10 = class173.field2984[var9];
        int var11 = var10 * 256 / (class226.field3930 + 256);
        int var12 = class173.field2995[var9];
        int var13 = var12 * 256 / (class226.field3930 + 256);
        int var14 = arg1 * var13 - arg5 * var11 >> 16;
        int var15 = arg1 * var11 + (arg5 * var13) >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) (Math.sin(var16) * (double) var8);
        int var19 = (int) ((double) var8 * Math.cos(var16));
        ((class266) class94.field1732[arg0]).method49(arg6.field4513 / 2 + var18 + arg4 - 10, arg3 - -(arg6.field4482 / 2) + -var19 + -10, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(II)V")
    public class220(int arg0, int arg1) {
        this.field3866 = arg0;
        this.field3868 = arg1;
    }
}
