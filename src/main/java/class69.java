import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class69 {

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1257 = 0;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Ldc;")
    private static class37 field1255 = class185.method1233((byte) 86, "Service unavailable)3");

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Ldc;")
    public static class37 field1253 = field1255;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Ldj;")
    public static class44 field1254;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lmf;BIIIII)V")
    public static final void method505(class136 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 * arg3 + arg4 * arg4;
        field1258++;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg0.field2638 / 2, arg0.field2509 / 2);
        if (arg1 != -100) {
            return;
        }
        if (var8 * var8 >= var7) {
            class14.method88(arg0, arg2, arg3, 90, arg4, class18.field270[arg6], arg5);
            return;
        }
        var8 -= 10;
        int var9 = class91.field1571 + class82.field1454 & 0x7FF;
        int var10 = class169.field3211[var9];
        int var11 = var10 * 256 / (class123.field2208 + 256);
        int var12 = class169.field3220[var9];
        int var13 = var12 * 256 / (class123.field2208 + 256);
        int var14 = arg3 * var13 - arg4 * var11 >> 16;
        int var15 = arg3 * var11 + arg4 * var13 >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) ((double) var8 * Math.cos(var16));
        ((class182) class83.field1475[arg6]).method1205(arg0.field2638 / 2 + arg5 + var18 - 10, arg2 - -(arg0.field2509 / 2) + -var19 - 10, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLwa;Lfb;Lwa;)V")
    public static final void method506(byte arg0, class238 arg1, class57 arg2, class238 arg3) {
        int var4 = 93 / ((-arg0 - 15) / 61);
        class217.field4045 = arg2;
        field1251++;
        class32.field658 = arg3;
        class80.field1409 = arg1;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static final void method507(byte arg0) {
        class38.field801 = null;
        field1259++;
        class32.field660 = null;
        class246.field4497 = null;
        if (arg0 != 11) {
            method508(-108);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method508(int arg0) {
        field1253 = null;
        field1255 = null;
        if (arg0 == 2) {
            field1254 = null;
        }
    }
}
