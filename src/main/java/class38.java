import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class class38 {

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "S")
    public static short field661 = 320;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Llc;")
    private static class143 field662 = class66.method374("yellow:", -1);

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field660 = 0;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Llc;")
    public static class143 field659 = class66.method374("sch-Utteln:", -1);

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Llc;")
    public static class143 field663 = field662;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Llc;")
    public static class143 field664 = field662;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)I")
    public abstract int method137(int arg0);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method139(byte arg0, Component arg1);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([IIIIII)V")
    public static final void method248(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class120 var6 = class7.field122[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class117 var7 = var6.field2138;
        if (var7 != null) {
            int var8 = var7.field2088;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class93 var10 = var6.field2127;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1673;
        int var12 = var10.field1677;
        int var13 = var10.field1675;
        int var14 = var10.field1680;
        int[] var15 = class114.field2013[var11];
        int[] var16 = class289.field5062[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method138(int arg0, Component arg1);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
    public static void method249(boolean arg0) {
        if (arg0) {
            method249(false);
        }
        field663 = null;
        field664 = null;
        field659 = null;
        field662 = null;
    }
}
