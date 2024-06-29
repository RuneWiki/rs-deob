import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class class240 extends class225 {

    @OriginalMember(owner = "client!id", name = "y", descriptor = "Lkb;")
    public class80 field3214;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field3212 = 0;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "Lcr;")
    public static class189 field3217 = new class189(64);

    @OriginalMember(owner = "client!id", name = "D", descriptor = "[I")
    public static int[] field3218 = new int[50];

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V", line = 3)
    public static void method1442(int arg0) {
        if (arg0 < 10) {
            field3212 = 65;
        }
        field3217 = null;
        field3218 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILii;)V", line = 15)
    public static final void method1443(int arg0, class405 arg1) {
        field3213++;
        if (arg0 != 16) {
            field3218 = null;
        }
        int var2 = class99.field1385;
        int var3 = class435.field6395;
        int var4 = class390.field5616;
        int var5 = class183.field2485 - 3;
        byte var6 = 20;
        if (class115.field1606 == null || class300.field4397 == null) {
            if (class362.field5227.method2257(true, class167.field2257) && class362.field5227.method2257(true, class181.field2399)) {
                class115.field1606 = arg1.method1710(class441.method2778(class362.field5227, class167.field2257, 0), true);
                class441 var7 = class441.method2778(class362.field5227, class181.field2399, 0);
                class300.field4397 = arg1.method1710(var7, true);
                var7.method2773();
                class422.field6218 = arg1.method1710(var7, true);
            } else {
                arg1.method1632(var2, var3, var4, var6, 255 - class105.field1526 << 24 | class413.field6083, 1);
            }
        }
        if (class115.field1606 != null && class300.field4397 != null) {
            int var8 = (var4 - (class300.field4397.method408() * 2)) / class115.field1606.method408();
            for (int var9 = 0; var9 < var8; var9++) {
                class115.field1606.method454(var2 + class300.field4397.method408() + var9 * class115.field1606.method408(), var3);
            }
            class300.field4397.method454(var2, var3);
            class422.field6218.method454(var2 + var4 - class422.field6218.method408(), var3);
        }
        class422.field6227.method1878(var3 + 14, -1, -16777216 | class260.field3790, class435.field6401, (byte) -64, var2 + 3);
        arg1.method1632(var2, var3 + var6, var4, var5 - var6, -class105.field1526 + 255 << 24 | class413.field6083, 1);
        int var10 = class124.field1728;
        int var11 = class323.field4747;
        for (int var12 = 0; var12 < class212.field2844; var12++) {
            int var26 = ((class212.field2844 - var12 - 1) * 16) + var3 + var6 + 13;
            if (var2 < var10 && (var2 + var4) > var10 && var11 > (var26 - 13) && var11 < (var26 + 3)) {
                arg1.method1632(var2, var26 - 12, var4, 16, class237.field3170 | 255 - class338.field4882 << 24, 1);
            }
        }
        if ((class61.field802 == null || class229.field3066 == null || class447.field6559 == null) && class362.field5227.method2257(true, class328.field4779) && class362.field5227.method2257(true, class75.field1068) && class362.field5227.method2257(true, class397.field5913)) {
            class441 var13 = class441.method2778(class362.field5227, class75.field1068, 0);
            class229.field3066 = arg1.method1710(var13, true);
            var13.method2773();
            class313.field4582 = arg1.method1710(var13, true);
            class61.field802 = arg1.method1710(class441.method2778(class362.field5227, class328.field4779, 0), true);
            class441 var14 = class441.method2778(class362.field5227, class397.field5913, 0);
            class447.field6559 = arg1.method1710(var14, true);
            var14.method2773();
            class169.field2269 = arg1.method1710(var14, true);
        }
        if (class61.field802 != null && class229.field3066 != null && class447.field6559 != null) {
            int var15 = (var4 - class447.field6559.method408() * 2) / class61.field802.method408();
            for (int var16 = 0; var16 < var15; var16++) {
                class61.field802.method454(class447.field6559.method408() + var2 + class61.field802.method408() * var16, -class61.field802.method398() + var5 + var3);
            }
            int var17 = (var5 - class447.field6559.method398() - var6) / class229.field3066.method398();
            for (int var18 = 0; var18 < var17; var18++) {
                class229.field3066.method454(var2, var18 * class229.field3066.method398() + var3 + var6);
                class313.field4582.method454(var4 + var2 - class313.field4582.method408(), var18 * class229.field3066.method398() + var3 + var6);
            }
            class447.field6559.method454(var2, var3 + var5 - class447.field6559.method398());
            class169.field2269.method454(var4 + var2 - class447.field6559.method408(), var3 + var5 - class447.field6559.method398());
        }
        int var19 = 0;
        for (class212 var20 = (class212) class321.field4726.method332(-2130841184); var20 != null; var20 = (class212) class321.field4726.method343((byte) -94)) {
            int var21 = (class212.field2844 - var19 - 1) * 16 + var3 + var6 + 13;
            int var22 = class260.field3790 | 0xFF000000;
            if (var10 > var2 && (var2 + var4) > var10 && var11 > (var21 - 13) && var11 < (var21 + 3)) {
                var22 = class129.field1786 | 0xFF000000;
            }
            int[] var23 = null;
            if (class355.method2331(-126, var20.field2836)) {
                var23 = class9.method74((int) var20.field2830, (byte) -54).field1140;
            } else if (class56.method386(var20.field2836, (byte) -56)) {
                class43 var24 = class306.field4496[(int) var20.field2830];
                if (var24 != null) {
                    var23 = var24.field606.field3388;
                }
            } else if (class379.method2462(var20.field2836, (byte) 44)) {
                if (var20.field2836 == 1008) {
                    var23 = class329.method2190((byte) 63, (int) var20.field2830).field1484;
                } else {
                    var23 = class329.method2190((byte) 63, (int) (var20.field2830 >>> 32 & 0x7FFFFFFFL)).field1484;
                }
            }
            String var25 = class397.method2556((byte) 124, var20);
            if (var23 != null) {
                var25 = var25 + class110.method727(false, var23);
            }
            class422.field6227.method1889(var22, var2 + 3, -125, var21, class223.field2948, var25, class363.field5240, 0);
            var19++;
        }
        class162.method996((byte) -80, class183.field2485, class99.field1385, class435.field6395, class390.field5616);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BII)V", line = 190)
    public static final void method1444(byte arg0, int arg1, int arg2) {
        field3216++;
        if (!class263.field3821) {
            return;
        }
        if (arg0 != 3) {
            field3217 = null;
        }
        class368.field5311++;
        class185.field2507.method5(-6445, 178);
        class185.field2507.method1330(arg1, -118);
        class185.field2507.method1324(arg2, (byte) 98);
        class185.field2507.method1366(class442.field6471, (byte) 96);
        class185.field2507.method1326(class306.field4506, arg0 - 80);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lkb;)V", line = 216)
    public class240(class80 arg0) {
        this.field3214 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method347(int arg0);

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(B)Z")
    public abstract boolean method349(byte arg0);
}
