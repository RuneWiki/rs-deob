import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class184 extends class107 {

    @OriginalMember(owner = "client!hga", name = "z", descriptor = "Ljr;")
    public class120 field2825;

    @OriginalMember(owner = "client!hga", name = "A", descriptor = "Lfba;")
    public static class27 field2826 = new class27(46, 1);

    @OriginalMember(owner = "client!hga", name = "B", descriptor = "I")
    public static int field2827 = 0;

    @OriginalMember(owner = "client!hga", name = "D", descriptor = "Lmca;")
    public static class33 field2829 = new class33(0, -1);

    @OriginalMember(owner = "client!hga", name = "y", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!hga", name = "F", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!hga", name = "C", descriptor = "Lnr;")
    public static class64 field2828;

    @OriginalMember(owner = "client!hga", name = "G", descriptor = "Lega;")
    public static class739 field2832;

    @OriginalMember(owner = "client!hga", name = "E", descriptor = "[Lit;")
    public static class672[] field2830;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 > -69) {
            return;
        }
        if (arg3 != 8 && arg3 != 16) {
            class46 var7 = class767.field10562[arg6][arg1][arg2];
            if (var7 == null) {
                var7 = new class46(arg6);
            }
            if (arg3 == 1) {
                var7.field588 = (short) arg4;
                var7.field579 = (short) arg0;
            } else if (arg3 == 2) {
                var7.field593 = (short) arg4;
                var7.field584 = (short) arg0;
            }
            if (class479.field6739) {
                class260.method1694(9016);
            }
        } else if (arg3 == 8) {
            int var14 = arg1 << class645.field9018;
            int var15 = class109.field1611 + var14;
            int var16 = arg2 << class645.field9018;
            int var17 = class109.field1611 + var16;
            int var18 = class411.field5572[arg6].method1904(arg2, (byte) 70, arg1);
            int var19 = class411.field5572[arg6].method1904(arg2 + 1, (byte) 35, arg1 + 1);
            class626.field8776[class296.field4300++] = new class478(arg3, arg6, var14, var15, var15, var14, var18, var19, var19 - arg4, -arg4 + var18, var16, var17, var17, var16);
        } else {
            int var8 = (arg1 << class645.field9018) + class109.field1611;
            int var9 = var8 - class109.field1611;
            int var10 = arg2 << class645.field9018;
            int var11 = class109.field1611 + var10;
            int var12 = class411.field5572[arg6].method1904(arg2, (byte) -122, arg1 + 1);
            int var13 = class411.field5572[arg6].method1904(arg2 + 1, (byte) 114, arg1);
            class626.field8776[class296.field4300++] = new class478(arg3, arg6, var8, var9, var9, var8, var12, var13, var13 - arg4, var12 - arg4, var10, var11, var11, var10);
        }
        field2824++;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V")
    public static void method1303(int arg0) {
        field2832 = null;
        field2830 = null;
        field2826 = null;
        if (arg0 <= 17) {
            method1303(15);
        }
        field2829 = null;
        field2828 = null;
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Ljr;)V")
    public class184(class120 arg0) {
        this.field2825 = arg0;
    }
}
