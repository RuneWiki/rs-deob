import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class244 {

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "[Lvc;")
    public static class185[] field4359 = new class185[50];

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field4357 = -1;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "S")
    public static short field4364 = 205;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field4362 = 0;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "Leh;")
    public class80 field4358;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBIIII)V")
    public static final void method1662(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field4361++;
        class56.method412(arg2, (byte) -103, arg0 + arg5, class249.field4420[arg4], arg0 - arg5);
        if (arg1 != -36) {
            return;
        }
        int var6 = 0;
        int var7 = arg5 * arg5;
        int var8 = arg3;
        int var9 = arg3 * arg3;
        int var10 = arg3 << 1;
        int var11 = var9 << 1;
        int var12 = (1 - var10) * var7 + var11;
        int var13 = var7 << 1;
        int var14 = var9 - ((var10 - 1) * var13);
        int var15 = var7 << 2;
        int var16 = ((var6 << 1) + 3) * var11;
        int var17 = var9 << 2;
        int var18 = ((arg3 << 1) - 3) * var13;
        int var19 = (var6 + 1) * var17;
        int var20 = (arg3 - 1) * var15;
        while (var8 > 0) {
            if (var12 < 0) {
                while (var12 < 0) {
                    var12 += var16;
                    var16 += var17;
                    var6++;
                    var14 += var19;
                    var19 += var17;
                }
            }
            var8--;
            if (var14 < 0) {
                var12 += var16;
                var6++;
                var16 += var17;
                var14 += var19;
                var19 += var17;
            }
            var14 += -var18;
            var12 += -var20;
            var18 -= var15;
            int var21 = arg4 - var8;
            int var22 = arg4 + var8;
            var20 -= var15;
            int var23 = arg0 + var6;
            int var24 = arg0 - var6;
            class56.method412(arg2, (byte) -103, var23, class249.field4420[var21], var24);
            class56.method412(arg2, (byte) -117, var23, class249.field4420[var22], var24);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZI)V")
    public static final void method1663(boolean arg0, int arg1) {
        field4356++;
        if (arg1 == -1) {
            return;
        }
        if (arg0) {
            method1664(-34, -88, -96);
        }
        if (!class179.method1258(arg1, (byte) -36)) {
            return;
        }
        class6[] var2 = class108.field2070[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class6 var4 = var2[var3];
            if (var4.field180 != null) {
                class55 var5 = new class55();
                var5.field1114 = var4;
                var5.field1128 = var4.field180;
                class113.method796(2000000, -6118, var5);
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)I")
    public static final int method1664(int arg0, int arg1, int arg2) {
        int var3 = class98.method709(true, arg1 - 1, arg2 - 1) - (-class98.method709(true, arg1 - 1, arg2 + 1) - class98.method709(true, arg1 + 1, arg2 + -1) - class98.method709(true, arg1 + 1, arg2 + 1));
        int var4 = class98.method709(true, arg1, arg2 - 1) - (-class98.method709(true, arg1, arg2 + 1) - class98.method709(true, arg1 - 1, arg2)) + class98.method709(true, arg1 - -1, arg2);
        if (arg0 > -13) {
            field4359 = null;
        }
        field4363++;
        int var5 = class98.method709(true, arg1, arg2);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[BI)I")
    public static final int method1665(int arg0, byte[] arg1, int arg2) {
        field4360++;
        int var3 = -124 % ((arg0 + 20) / 53);
        return class241.method1653(arg1, -55, arg2, 0);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    public static void method1666(byte arg0) {
        if (arg0 >= -55) {
            method1664(-13, 55, -49);
        }
        field4359 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljd;I)V")
    public static final void method1667(class86 arg0, int arg1) {
        field4365++;
        if (arg1 != 1) {
            method1662(-106, (byte) 67, -75, 112, -20, -4);
        }
        for (class210 var2 = (class210) class3.field33.method1737((byte) 74); var2 != null; var2 = (class210) class3.field33.method1740(arg1 - 8844)) {
            if (var2.field3795.method625((byte) 117, arg0)) {
                class46.field1024 = var2;
                return;
            }
        }
    }
}
