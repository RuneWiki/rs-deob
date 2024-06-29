import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public abstract class class641 {

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
    public static int field9191 = 0;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "Liba;")
    public static class211 field9190 = new class211(49, 6);

    @OriginalMember(owner = "client!fca", name = "h", descriptor = "I")
    public static int field9197 = 0;

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "[F")
    public static float[] field9193 = new float[4];

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "I")
    public static int field9192;

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "I")
    public static int field9194;

    @OriginalMember(owner = "client!fca", name = "f", descriptor = "Ldj;")
    public static class453 field9195;

    @OriginalMember(owner = "client!fca", name = "g", descriptor = "[I")
    public static int[] field9196;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIIIIIIIIZ)V")
    public static final void method3651(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        field9194++;
        if (!class233.method1442(arg9, arg2)) {
            return;
        }
        if (class379.field5710[arg2] == null) {
            client.method565(class220.field2917[arg2], -1, arg6, arg1, arg8, arg3, arg0, arg5, arg4, arg7);
        } else {
            client.method565(class379.field5710[arg2], -1, arg6, arg1, arg8, arg3, arg0, arg5, arg4, arg7);
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(BI)V")
    public abstract void method3505(byte arg0, int arg1);

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IB)I")
    public abstract int method3490(int arg0, byte arg1);

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(II)[B")
    public abstract byte[] method3498(int arg0, int arg1);

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)Lgr;")
    public abstract class608 method3504(int arg0);

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(BI)V")
    public static final void method3652(byte arg0, int arg1) {
        field9192++;
        class489 var2 = class704.method3942(arg1, 5, 0);
        var2.method2799(-100);
        if (arg0 >= -30) {
            method3654();
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)V")
    public static void method3653(byte arg0) {
        field9193 = null;
        int var1 = 63 % ((52 - arg0) / 62);
        field9190 = null;
        field9195 = null;
        field9196 = null;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "()V")
    public static final void method3654() {
        byte var0 = 10;
        byte var1 = 30;
        if (class338.field4915 == 0 || class125.field1832 == null) {
            return;
        }
        class503.field7110.method628(class70.field1092);
        for (int var2 = 0; var2 < class347.field5150.length; var2++) {
            class503.field7110.method644(-256, class70.field1092[3] - class70.field1092[1], class70.field1092[1], class6.field207[var2] + class347.field5150[var2], true);
        }
        for (int var3 = 0; var3 < class231.field3064; var3++) {
            class203 var11 = class619.field8969[var3];
            class503.field7110.method620(var11.field2770[0], var11.field2780[0], var11.field2772[0], class145.field2085);
            class503.field7110.method620(var11.field2770[1], var11.field2780[1], var11.field2772[1], class132.field1921);
            class503.field7110.method620(var11.field2770[2], var11.field2780[2], var11.field2772[2], class561.field8218);
            class503.field7110.method620(var11.field2770[3], var11.field2780[3], var11.field2772[3], class188.field2540);
            if (class145.field2085[2] != -1 && class132.field1921[2] != -1 && class561.field8218[2] != -1 && class188.field2540[2] != -1) {
                int var12 = -65536;
                if (var11.field2779 == 4) {
                    var12 = -16776961;
                }
                class503.field7110.method664(class145.field2085[0], class132.field1921[1], 1, class145.field2085[1], class132.field1921[0], var12);
                class503.field7110.method664(class132.field1921[0], class561.field8218[1], 1, class132.field1921[1], class561.field8218[0], var12);
                class503.field7110.method664(class561.field8218[0], class188.field2540[1], 1, class561.field8218[1], class188.field2540[0], var12);
                class503.field7110.method664(class188.field2540[0], class145.field2085[1], 1, class188.field2540[1], class145.field2085[0], var12);
                class503.field7110.method664(class145.field2085[0], class561.field8218[1], 1, class145.field2085[1], class561.field8218[0], var12);
            }
        }
        class125.field1832.method2447(var0, "Static Opaque: OW: " + class311.field4576[0] + "/" + class141.field2037[0] + " UW: " + class311.field4576[1] + "/" + class141.field2037[1], -256, 2, var1, -16777216);
        class125.field1832.method2447(var0, "Static Trans: OW: " + class48.field760[0] + "/" + class589.field8576[0] + " UW: " + class48.field760[1] + "/" + class589.field8576[1], -256, 2, var1 + 15, -16777216);
        class125.field1832.method2447(var0, "Static Anim: OW: " + class464.field6700[0] + "/" + class314.field4601[0] + " UW: " + class464.field6700[1] + "/" + class314.field4601[1], -256, 2, var1 + 30, -16777216);
        class125.field1832.method2447(var0, "Dynamic: " + class296.field4366 + "/" + 5000, -256, 2, var1 + 45, -16777216);
        class125.field1832.method2447(var0, "Total Opaque Onscreen: " + class129.field1862 + "/" + 10000, -256, 2, var1 + 60, -16777216);
        class125.field1832.method2447(var0, "Total Trans Onscreen: " + class141.field2035 + "/" + 5000, -256, 2, var1 + 75, -16777216);
        class125.field1832.method2447(var0, "Occluders: " + (class264.field3450 + class218.field2907) + " Active: " + class231.field3064, -256, 2, var1 + 90, -16777216);
        class125.field1832.method2447(var0, "Occluded: Ground:" + class541.field8022 + " Walls: " + class90.field1369 + " CPs: " + class607.field8766 + " Pixels: " + class56.field890, -256, 2, var1 + 105, -16777216);
        class125.field1832.method2447(var0, "Occlude Calc Took: " + class348.field5159 / 1000L + "us", -256, 2, var1 + 120, -16777216);
        if (class338.field4915 != 2 || class351.field5202 == null) {
            return;
        }
        for (int var4 = 0; var4 < class351.field5202.length; var4++) {
            float var6 = (float) class351.field5202[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class351.field5202[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class256 var5 = class503.field7110.method704(class351.field5202, 0, class76.field1228, class76.field1228, class645.field9297);
        var5.method49(var0, 170, 1, 0, 0);
    }
}
