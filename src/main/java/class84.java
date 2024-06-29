import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class84 {

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1595 = 0;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1593 = 0;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Lbm;")
    public static class307 field1592;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "Lbm;")
    public static class307 field1596;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIILkl;II)V", line = 12)
    public static final void method591(int arg0, int arg1, int arg2, int arg3, int arg4, class68 arg5, int arg6, int arg7) {
        field1594++;
        if (arg1 != -26195) {
            field1592 = (class307) null;
        }
        int var8 = arg6 * arg6 + (arg0 * arg0);
        if (var8 > arg4) {
            return;
        }
        int var9 = Math.min(arg5.field1416 / 2, arg5.field1414 / 2);
        if ((var9 * var9) >= var8) {
            class51.method382(arg2, arg5, class62.field1197[arg7], false, arg3, arg6, arg0);
            return;
        }
        var9 -= 10;
        int var10 = (int) class95.field1709 + class41.field798 & 0x7FF;
        int var11 = class284.field4398[var10];
        int var12 = var11 * 256 / (class4.field101 + 256);
        int var13 = class284.field4395[var10];
        int var14 = var13 * 256 / (class4.field101 + 256);
        int var15 = arg0 * var14 + arg6 * var12 >> 16;
        int var16 = arg0 * var12 - (arg6 * var14) >> 16;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var9);
        int var20 = (int) (Math.cos(var17) * (double) var9);
        if (class249.field3893) {
            ((class137) class200.field3199[arg7]).method895(240, 240, (arg5.field1416 / 2 + arg2 + var19) * 16, (arg5.field1414 / 2 + arg3 - var20) * 16, (int) (var17 * 10430.378D), 4096);
        } else {
            ((class206) class200.field3199[arg7]).method1397(arg5.field1416 / 2 + arg2 + var19 - 10, arg5.field1414 / 2 + arg3 + -10 + -var20, 20, 20, 15, 15, var17, 256);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 75)
    public static void method592(int arg0) {
        field1596 = null;
        if (arg0 > 77) {
            field1592 = null;
        }
    }
}
