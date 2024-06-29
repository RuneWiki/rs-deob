import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class196 {

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static volatile int field2811 = 0;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2812 = "Connection lost.";

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field2807 = 0;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field2814 = 0;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field2817 = 0;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field2815 = 0;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "[I")
    public static int[] field2816;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIII)V", line = 17)
    public static final void method1355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2810++;
        class279.method1997(arg1 + arg2, -824384948, -arg1 + arg2, arg5, class206.field2886[arg4]);
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg3 * arg3;
        if (arg0 != 8828) {
            return;
        }
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = var8 - (var12 - 1) * var10;
        int var14 = var9 << 2;
        int var15 = (1 - var12) * var9 + var11;
        int var16 = var8 << 2;
        int var17 = ((var6 << 1) + 3) * var11;
        int var18 = (var6 + 1) * var16;
        int var19 = ((arg3 << 1) - 3) * var10;
        int var20 = (arg3 - 1) * var14;
        while (var7 > 0) {
            var7--;
            int var21 = arg4 - var7;
            int var22 = arg4 + var7;
            if (var15 < 0) {
                while (var15 < 0) {
                    var6++;
                    var13 += var18;
                    var15 += var17;
                    var17 += var16;
                    var18 += var16;
                }
            }
            if (var13 < 0) {
                var15 += var17;
                var13 += var18;
                var6++;
                var18 += var16;
                var17 += var16;
            }
            var15 += -var20;
            int var23 = arg2 + var6;
            var20 -= var14;
            var13 += -var19;
            var19 -= var14;
            int var24 = arg2 - var6;
            class279.method1997(var23, -824384948, var24, arg5, class206.field2886[var21]);
            class279.method1997(var23, -824384948, var24, arg5, class206.field2886[var22]);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 103)
    public static final void method1356(int arg0) {
        class172.field2479.method1241(arg0 + 119);
        field2809++;
        if (arg0 != 0) {
            method1359(38, (byte) 119, -120, (class263) null);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 114)
    public static void method1357(int arg0) {
        field2812 = null;
        field2816 = null;
        if (arg0 != 1) {
            method1358((class175) null, -107);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Llc;I)V", line = 136)
    public static final void method1358(class175 arg0, int arg1) {
        if (arg1 > -38) {
            method1359(13, (byte) -68, -59, (class263) null);
        }
        class231.field3374 = arg0;
        field2808++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBILcc;)V", line = 151)
    public static final void method1359(int arg0, byte arg1, int arg2, class263 arg3) {
        field2813++;
        if (class116.field1649 != null || class140.field1951 || arg3 == null || class63.method374(arg3, -120) == null) {
            return;
        }
        class116.field1649 = arg3;
        class110.field1540 = class63.method374(arg3, -125);
        int var4 = -123 % ((60 - arg1) / 35);
        class117.field1662 = false;
        class247.field3742 = arg0;
        class22.field303 = 0;
        class242.field3651 = arg2;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V", line = 200)
    public class196() {
        new class26();
    }
}
