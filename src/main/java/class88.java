import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class88 {

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "Z")
    public static boolean field1594 = true;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Llc;")
    public static class143 field1595 = class66.method374("p12_full", -1);

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "Llc;")
    private static class143 field1597 = class66.method374("cyan:", -1);

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field1598 = 0;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public static int field1605 = 0;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "Llc;")
    public static class143 field1604 = class66.method374("<col=40ff00>", -1);

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field1596 = 0;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "Llc;")
    public static class143 field1602 = field1597;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "Llc;")
    private static class143 field1606 = class66.method374("Loading)3)3)3", -1);

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "Llc;")
    public static class143 field1603 = field1597;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "Llc;")
    public static class143 field1600 = field1606;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "Lgf;")
    public static class7 field1601;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public static void method504(byte arg0) {
        field1602 = null;
        if (arg0 > -99) {
            method505((class51) null, 97, -48, 12, -75, -63);
        }
        field1606 = null;
        field1604 = null;
        field1603 = null;
        field1600 = null;
        field1595 = null;
        field1597 = null;
        field1601 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lqk;IIIII)V")
    public static final void method505(class51 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class176.field3159 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class36.field621) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class56.field1091 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class120 var14 = class7.field122[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class192.field3535[var11][var12 + 1][var13] + class192.field3535[var11][var12][var13] + class192.field3535[var11][var12][var13 + 1] + class192.field3535[var11][var12 + 1][var13 + 1]) / 4 - (class192.field3535[arg1][arg2 + 1][arg3] + class192.field3535[arg1][arg2][arg3] + class192.field3535[arg1][arg2][arg3 + 1] + class192.field3535[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class57 var16 = var14.field2131;
                                    if (var16 != null) {
                                        if (var16.field1105.method315()) {
                                            arg0.method311(var16.field1105, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field1099 != null && var16.field1099.method315()) {
                                            arg0.method311(var16.field1099, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field2134; var17++) {
                                        class211 var18 = var14.field2144[var17];
                                        if (var18 != null && var18.field3916.method315() && (var18.field3931 == var12 || var7 == var12) && (var18.field3919 == var13 || var9 == var13)) {
                                            int var19 = var18.field3933 + 1 - var18.field3931;
                                            int var20 = var18.field3918 + 1 - var18.field3919;
                                            arg0.method311(var18.field3916, (var18.field3931 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field3919 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IJ)V")
    public static final void method506(int arg0, long arg1) {
        if (arg0 != 26335) {
            return;
        }
        field1593++;
        class285.field5010.field3487 = 0;
        class285.field5010.method1276(844519173, 84);
        class285.field5010.method1243(arg1, 68);
        class83.field1504 = 1;
        class262.field4678 = -3;
        class249.field4488 = 0;
        class4.field63 = 0;
    }
}
