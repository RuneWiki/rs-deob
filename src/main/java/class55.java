import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class55 extends class295 {

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public int field886 = 0;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "[Lbi;")
    public static class139[] field889;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)V")
    private static final void method514(boolean arg0, int arg1) {
        if (!arg0) {
            field889 = null;
        }
        class410 var2 = class63.field963;
        synchronized (class63.field963) {
            class63.field963.method2534(0, arg1);
        }
        field896++;
        class410 var3 = class443.field6386;
        synchronized (class443.field6386) {
            class443.field6386.method2534(0, arg1);
        }
        class410 var4 = class431.field6128;
        synchronized (class431.field6128) {
            class431.field6128.method2534(0, arg1);
        }
        class410 var5 = class68.field1026;
        synchronized (class68.field1026) {
            class68.field1026.method2534(0, arg1);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BLap;)V")
    public final void method515(byte arg0, class289 arg1) {
        field890++;
        if (arg0 != -121) {
            return;
        }
        while (true) {
            int var3 = arg1.method1861((byte) -72);
            if (var3 == 0) {
                return;
            }
            this.method516(var3, arg0 + 126, arg1);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILap;)V")
    private final void method516(int arg0, int arg1, class289 arg2) {
        if (arg0 == 2) {
            this.field886 = arg2.method1853(103);
        }
        if (arg1 != 5) {
            method519(-29, 44, 20, -105, -60, 106, 36);
        }
        field895++;
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V")
    public static void method517(int arg0) {
        field889 = null;
        if (arg0 != 5) {
            method519(-105, 118, 124, -116, 90, -38, 39);
        }
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)V")
    public static final void method518(int arg0) {
        field891++;
        if (class199.field2834 && class234.field3242[81] && class415.field5808 > 2) {
            class37.method370((class63) class268.field3613.field2454.field5348.field5348, 0);
        } else {
            class37.method370((class63) class268.field3613.field2454.field5348, 0);
        }
        if (arg0 != 11580) {
            field887 = 81;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIII)V")
    public static final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field892++;
        int var7 = class359.method2251(class134.field1917, arg1, 105, class39.field595);
        int var8 = class359.method2251(class134.field1917, arg3, arg0 ^ 0x72, class39.field595);
        int var9 = class359.method2251(class69.field1047, arg5, -106, class433.field6144);
        int var10 = class359.method2251(class69.field1047, arg4, -101, class433.field6144);
        int var11 = class359.method2251(class134.field1917, arg1 + arg6, 105, class39.field595);
        int var12 = class359.method2251(class134.field1917, arg3 - arg6, -72, class39.field595);
        for (int var13 = var7; var13 < var11; var13++) {
            class396.method2436(arg0 - 1075, arg2, var9, class186.field2697[var13], var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class396.method2436(arg0 ^ 0xFFFFFBD7, arg2, var9, class186.field2697[var14], var10);
        }
        if (arg0 != 5) {
            field887 = -3;
        }
        int var15 = class359.method2251(class69.field1047, arg5 + arg6, arg0 + 106, class433.field6144);
        int var16 = class359.method2251(class69.field1047, arg4 - arg6, -54, class433.field6144);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class186.field2697[var17];
            class396.method2436(arg0 - 1075, arg2, var9, var18, var15);
            class396.method2436(-1070, arg2, var16, var18, var10);
        }
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(B)V")
    public static final void method520(byte arg0) {
        field894++;
        class87.method780(20, 5);
        class424.method2605(5, -102);
        class334.method2117(-115, 5);
        method514(true, 5);
        class419.method2588(-8298, 5);
        class64.method567(0, 5);
        class228.method1535(5, 1057);
        class169.method1268(5, (byte) -7);
        class232.method1549(true, 5);
        class291.method1888(5, (byte) -77);
        class95.method813(5, 0);
        class428.method2661(5, (byte) 94);
        class89.method789(5, 1);
        class241.method1596(5, (byte) 64);
        class363.method2286(false, 5);
        class100.method853((byte) 126, 5);
        class96.method817(5, false);
        int var1 = 33 / ((arg0 + 28) / 46);
        class123.method964(0, 5);
        class419.method2590(60, 5);
        class52.method498(5, 102);
        class289.method1858(50, -612096720);
        class122.method962((byte) 18, 5);
        class400.method2454(5, -66);
        class213.field2964.method2534(0, 5);
        class127.field1798.method2534(0, 5);
        class372.field5188.method2534(0, 5);
        class415.field5801.method2534(0, 5);
        class18.field368.method2534(0, 5);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BII)I")
    public static final int method521(byte arg0, int arg1, int arg2) {
        field888++;
        class329 var3 = (class329) class19.field374.method614(-128, (long) arg2);
        if (arg0 != 37) {
            method517(48);
        }
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field4473.length; var5++) {
                if (var3.field4472[var5] == arg1) {
                    var4 += var3.field4473[var5];
                }
            }
            return var4;
        }
    }
}
