import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class31 {

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "[I")
    public static int[] field422 = new int[4096];

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V")
    public static final void method175(int arg0, int arg1) {
        if (arg0 != -22696) {
            field422 = null;
        }
        field424++;
        if (class190.field3070 == 0) {
            class67.field848.method1068((byte) -76, arg1);
        } else {
            class215.field3446 = arg1;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZIIIILwb;I)V")
    public static final void method176(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class123 arg6, int arg7) {
        if (!arg1) {
            method177(-120);
        }
        field423++;
        int var8 = arg3 * arg3 + arg7 * arg7;
        if (arg5 < var8) {
            return;
        }
        int var9 = Math.min(arg6.field1879 / 2, arg6.field1809 / 2);
        if (var9 * var9 >= var8) {
            class251.method1731(arg3, arg2, arg4, class164.field2608[arg0], arg6, false, arg7);
            return;
        }
        var9 -= 10;
        int var10 = (int) class226.field3639 + class84.field1045 & 0x7FF;
        int var11 = class174.field2759[var10];
        int var12 = class174.field2753[var10];
        int var13 = var11 * 256 / (class14.field185 + 256);
        int var14 = var12 * 256 / (class14.field185 + 256);
        int var15 = arg3 * var13 - (arg7 * var14) >> 16;
        int var16 = arg3 * var14 + (arg7 * var13) >> 16;
        double var17 = Math.atan2((double) var16, (double) var15);
        int var19 = (int) ((double) var9 * Math.sin(var17));
        int var20 = (int) ((double) var9 * Math.cos(var17));
        ((class227) class226.field3630[arg0]).method375(arg6.field1879 / 2 + arg2 + var19 - 10, arg4 - -(arg6.field1809 / 2) + -var20 + -10, 20, 20, 15, 15, var17, 256);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static void method177(int arg0) {
        if (arg0 >= -53) {
            method175(-76, 89);
        }
        field422 = null;
    }
}
