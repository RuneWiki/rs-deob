import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class173 {

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    private int field2623 = 0;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "Lgd;")
    private class170 field2618;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "[I")
    public static int[] field2619 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field2626 = 0;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "Lsm;")
    private class46 field2627;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BZ)V", line = 4)
    public static final void method1243(byte arg0, boolean arg1) {
        field2625++;
        if (arg0 > -9) {
            method1244((String) null, 126, true);
        }
        if (class201.field3025 != arg1) {
            class201.field3025 = arg1;
            class187.method1335(-86);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 20)
    public static final void method1244(String arg0, int arg1, boolean arg2) {
        field2621++;
        byte var3 = 4;
        if (arg1 != 17) {
            field2619 = (int[]) null;
        }
        int var4 = var3 + 6;
        int var5 = class233.field3723.method2238(arg0, 250);
        int var6 = var3 + 6;
        int var7 = class233.field3723.method2248(arg0, 250) * 13;
        if (class94.field1516) {
            class167.method1186(var4 - var3, -var3 + var6, var3 + var5 + var3, var3 + var7 + var3, 0);
            class167.method1189(var4 - var3, -var3 + var6, var3 + var5 + var3, var3 - -var3 + var7, 16777215);
        } else {
            class109.method812(var4 - var3, -var3 + var6, var3 + var3 + var5, var7 - -var3 + var3, 0);
            class109.method801(var4 - var3, -var3 + var6, var3 + var5 + var3, var3 + var7 + var3, 16777215);
        }
        class233.field3723.method2247(arg0, var4, var6, var5, var7, 16777215, -1, 1, 1, 0);
        class55.method450(var4 - var3, var6 - var3, true, var3 + var5 + var3, var3 + var7 + var3);
        if (!arg2) {
            class285.method1978(var7, var6, arg1 ^ 0x11, var4, var5);
        } else if (class94.field1516) {
            class94.method708();
        } else {
            try {
                Graphics var8 = class238.field3782.getGraphics();
                class175.field2644.method867(32722, 0, 0, var8);
            } catch (Exception var10) {
                class238.field3782.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Lsm;", line = 94)
    public final class46 method1245(int arg0) {
        field2617++;
        if (arg0 < this.field2623 && this.field2618.field2573[this.field2623 - 1] != this.field2627) {
            class46 var2 = this.field2627;
            this.field2627 = var2.field754;
            return var2;
        }
        class46 var3;
        do {
            if (this.field2618.field2575 <= this.field2623) {
                return null;
            }
            var3 = this.field2618.field2573[this.field2623++].field754;
        } while (this.field2618.field2573[this.field2623 - 1] == var3);
        this.field2627 = var3.field754;
        return var3;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lgd;)V", line = 186)
    public class173(class170 arg0) {
        this.field2618 = arg0;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIII)V", line = 126)
    public static final void method1246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = (arg5 - 32) * arg5 / arg2;
        if (var6 < 8) {
            var6 = 8;
        }
        field2628++;
        class240.field3842[0].method1210(arg1, arg3);
        int var7 = -94 % ((34 - arg0) / 55);
        class240.field3842[1].method1210(arg1, arg3 + arg5 - 16);
        int var8 = (arg5 - var6 - 32) * arg4 / (arg2 - arg5);
        if (!class94.field1516) {
            class109.method812(arg1, arg3 + 16, 16, arg5 - 32, class89.field1433);
            class109.method812(arg1, arg3 + var8 + 16, 16, var6, class240.field3830);
            class109.method813(arg1, var8 + arg3 + 16, var6, class171.field2608);
            class109.method813(arg1 + 1, var8 + 16 + arg3, var6, class171.field2608);
            class109.method805(arg1, arg3 + var8 + 16, 16, class171.field2608);
            class109.method805(arg1, arg3 + var8 + 17, 16, class171.field2608);
            class109.method813(arg1 + 15, arg3 + 16 + var8, var6, class165.field2470);
            class109.method813(arg1 + 14, arg3 + 17 - -var8, var6 - 1, class165.field2470);
            class109.method805(arg1, var8 + var6 + arg3 + 15, 16, class165.field2470);
            class109.method805(arg1 + 1, arg3 + 14 + var6 + var8, 15, class165.field2470);
            return;
        }
        class167.method1186(arg1, arg3 + 16, 16, arg5 - 32, class89.field1433);
        class167.method1186(arg1, arg3 + var8 + 16, 16, var6, class240.field3830);
        class167.method1197(arg1, arg3 + var8 + 16, var6, class171.field2608);
        class167.method1197(arg1 + 1, arg3 + 16 + var8, var6, class171.field2608);
        class167.method1196(arg1, var8 + arg3 + 16, 16, class171.field2608);
        class167.method1196(arg1, arg3 + var8 + 17, 16, class171.field2608);
        class167.method1197(arg1 + 15, var8 + 16 + arg3, var6, class165.field2470);
        class167.method1197(arg1 + 14, var8 + 17 + arg3, var6 - 1, class165.field2470);
        class167.method1196(arg1, arg3 + 15 - (-var8 - var6), 16, class165.field2470);
        class167.method1196(arg1 + 1, var8 + 14 + var6 + arg3, 15, class165.field2470);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)Lsm;", line = 174)
    public final class46 method1247(int arg0) {
        field2622++;
        if (arg0 > -93) {
            method1243((byte) -47, false);
        }
        this.field2623 = 0;
        return this.method1245(0);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Lnf;", line = 198)
    public static final class59 method1248(int arg0, int arg1) {
        field2624++;
        class59 var2 = (class59) class251.field3956.method443(-2, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class333.field5204.method980(1, arg0 & 0x7FFF, 5);
        } else {
            var3 = class161.field2425.method980(1, arg0, 5);
        }
        class59 var4 = new class59();
        if (var3 != null) {
            var4.method471(new class166(var3), -87);
        }
        if (arg0 >= 32768) {
            var4.method464(0);
        }
        class251.field3956.method439(var4, (long) arg0, (byte) 18);
        int var5 = 44 % ((arg1 - 70) / 44);
        return var4;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V", line = 227)
    public static void method1249(byte arg0) {
        field2619 = null;
        if (arg0 != 49) {
            method1244((String) null, 6, false);
        }
    }
}
