import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class62 extends class128 {

    @OriginalMember(owner = "client!j", name = "F", descriptor = "I")
    public int field1558;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "Lid;")
    public static class60 field1549 = class11.method72("gelb:", (byte) -2);

    @OriginalMember(owner = "client!j", name = "z", descriptor = "Lid;")
    private static class60 field1554 = class11.method72("Your friend list is full)3 Max of 100 for free users)1 and 200 for members", (byte) -122);

    @OriginalMember(owner = "client!j", name = "x", descriptor = "Lid;")
    public static class60 field1552 = field1554;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "Lqd;")
    public static class115 field1556 = new class115(64);

    @OriginalMember(owner = "client!j", name = "H", descriptor = "Lid;")
    public static class60 field1560 = class11.method72("Unerwartete Antwort vom Anmelde)2Server)3", (byte) -30);

    @OriginalMember(owner = "client!j", name = "J", descriptor = "Lid;")
    public static class60 field1562 = class11.method72("Regeln versto-8en hat)3", (byte) -25);

    @OriginalMember(owner = "client!j", name = "K", descriptor = "Lid;")
    private static class60 field1563 = class11.method72("glow2:", (byte) -122);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "Lid;")
    public static class60 field1565 = field1563;

    @OriginalMember(owner = "client!j", name = "I", descriptor = "Lid;")
    public static class60 field1561 = field1563;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "[I")
    public static int[] field1553;

    @OriginalMember(owner = "client!j", name = "L", descriptor = "[[B")
    public static byte[][] field1564;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZII)V")
    public static final void method483(boolean arg0, int arg1, int arg2) {
        field1550++;
        if (arg0) {
            method487((byte) -42);
        }
        class7 var3 = class124.method980(-78, arg2);
        int var4 = var3.field97;
        int var5 = var3.field113;
        int var6 = var3.field94;
        int var7 = class74.field1776[var6 - var5];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class43.field1158[var4] = class97.method769(class80.method680(arg1 << var5, var8), class80.method680(~var8, class43.field1158[var4]));
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
    public static final void method484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1551++;
        class75.field1813[0].method224(arg3, arg1);
        class75.field1813[arg5].method224(arg3, arg1 + arg0 - 16);
        class130.method1015(arg3, arg1 + 16, 16, arg0 - 32, class158.field3624);
        int var6 = (arg0 - 32) * arg0 / arg2;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg0 - var6 - 32) * arg4 / (arg2 - arg0);
        class130.method1015(arg3, arg1 + var7 + 16, 16, var6, class121.field2789);
        class130.method1022(arg3, arg1 + var7 + 16, var6, class102.field2471);
        class130.method1022(arg3 + 1, arg1 + 16 + var7, var6, class102.field2471);
        class130.method1025(arg3, arg1 + var7 + 16, 16, class102.field2471);
        class130.method1025(arg3, arg1 + var7 + 17, 16, class102.field2471);
        class130.method1022(arg3 + 15, arg1 + 16 + var7, var6, class87.field2180);
        class130.method1022(arg3 + 14, arg1 + 17 - -var7, var6 - 1, class87.field2180);
        class130.method1025(arg3, arg1 + var6 + var7 + 15, 16, class87.field2180);
        class130.method1025(arg3 + 1, arg1 + 14 + var7 + var6, 15, class87.field2180);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
    public static final void method485(boolean arg0) {
        field1555++;
        try {
            if (class106.field2626 == 1) {
                int var1 = class23.field567.method106((byte) 85);
                if (var1 > 0 && class23.field567.method110(7695)) {
                    int var2 = var1 - class87.field2183;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class23.field567.method122(var2, !arg0);
                    return;
                }
                class23.field567.method118(-15881);
                class23.field567.method119(20634);
                class50.field1289 = null;
                if (class113.field2710 == null) {
                    class106.field2626 = 0;
                } else {
                    class106.field2626 = 2;
                }
                class17.field418 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class23.field567.method118(-15881);
            class50.field1289 = null;
            class17.field418 = null;
            class113.field2710 = null;
            class106.field2626 = 0;
        }
        if (!arg0) {
            field1554 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
    public static final void method486(int arg0) {
        class89.field2222 = new int[151];
        class124.field2840 = new int[33];
        class61.field1548 = new int[33];
        field1553 = new int[151];
        for (int var1 = 0; var1 < 33; var1++) {
            int var7 = 999;
            int var8 = 0;
            for (int var9 = 0; var9 < 34; var9++) {
                if (class50.field1274.field693[class50.field1274.field698 * var1 + var9] == 0) {
                    if (var7 == 999) {
                        var7 = var9;
                    }
                } else if (var7 != 999) {
                    var8 = var9;
                    break;
                }
            }
            class124.field2840[var1] = var7;
            class61.field1548[var1] = var8 - var7;
        }
        int var2 = -108 / ((73 - arg0) / 32);
        for (int var3 = 5; var3 < 156; var3++) {
            int var4 = 999;
            int var5 = 0;
            for (int var6 = 25; var6 < 172; var6++) {
                if (class50.field1274.field693[class50.field1274.field698 * var3 + var6] == 0 && (var6 > 34 || var3 > 34)) {
                    if (var4 == 999) {
                        var4 = var6;
                    }
                } else if (var4 != 999) {
                    var5 = var6;
                    break;
                }
            }
            field1553[var3 - 5] = var4 - 25;
            class89.field2222[var3 - 5] = var5 - var4;
        }
        field1559++;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V")
    public static void method487(byte arg0) {
        field1562 = null;
        field1564 = null;
        field1565 = null;
        field1560 = null;
        field1554 = null;
        field1563 = null;
        int var1 = -38 / ((arg0 + 34) / 32);
        field1549 = null;
        field1553 = null;
        field1556 = null;
        field1561 = null;
        field1552 = null;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
    public class62() {
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(I)V")
    public class62(int arg0) {
        this.field1558 = arg0;
    }
}
