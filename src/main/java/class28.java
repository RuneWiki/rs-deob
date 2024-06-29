import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class28 extends class161 {

    @OriginalMember(owner = "client!be", name = "y", descriptor = "Lp;")
    public class280 field533;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "Lp;")
    public static class280 field532 = class18.method140((byte) -117, "M-Bmoire en cours d(Wattribution");

    @OriginalMember(owner = "client!be", name = "t", descriptor = "Z")
    public static boolean field528 = true;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field529 = -1;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "[B")
    public static byte[] field535 = new byte[520];

    @OriginalMember(owner = "client!be", name = "z", descriptor = "Lp;")
    private static class280 field534 = class18.method140((byte) -119, "Allocating memory");

    @OriginalMember(owner = "client!be", name = "w", descriptor = "Lp;")
    public static class280 field531 = field534;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "Lp;")
    public static class280 field530 = class18.method140((byte) -125, "Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3");

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
    public static final void method249(boolean arg0) {
        field525++;
        class242.method1642((byte) 73, class57.field927);
        class105.field1754++;
        if (class266.field4677 && class224.field3864) {
            int var1 = class154.field2673;
            int var2 = class229.field3957;
            int var3 = var1 - class109.field1797;
            int var4 = class57.field927.field1913;
            if (class12.field254 > var3) {
                var3 = class12.field254;
            }
            int var5 = var2 - class108.field1783;
            if (var3 + class57.field927.field1995 > class12.field254 + class264.field4657.field1995) {
                var3 = class12.field254 + class264.field4657.field1995 - class57.field927.field1995;
            }
            int var6 = var3 - class82.field1352;
            if (class283.field4974 > var5) {
                var5 = class283.field4974;
            }
            if ((class283.field4974 + class264.field4657.field1869) < (class57.field927.field1869 + var5)) {
                var5 = class264.field4657.field1869 + class283.field4974 - class57.field927.field1869;
            }
            int var7 = var5 + class264.field4657.field1877 - class283.field4974;
            int var8 = var5 - class8.field155;
            if (class57.field927.field1934 < class105.field1754 && (var4 < var8 || var8 < (-var4) || var4 < var6 || var6 < -var4)) {
                class164.field2883 = true;
            }
            int var9 = var3 + class264.field4657.field2025 - class12.field254;
            if (arg0) {
                method253(true);
            }
            if (class57.field927.field1985 != null && class164.field2883) {
                class178 var10 = new class178();
                var10.field3097 = var9;
                var10.field3098 = var7;
                var10.field3107 = class57.field927.field1985;
                var10.field3106 = class57.field927;
                class199.method1371(200000, var10);
            }
            if (class74.field1229 == 0) {
                if (class164.field2883) {
                    if (class57.field927.field2013 != null) {
                        class178 var11 = new class178();
                        var11.field3097 = var9;
                        var11.field3095 = class226.field3901;
                        var11.field3098 = var7;
                        var11.field3106 = class57.field927;
                        var11.field3107 = class57.field927.field2013;
                        class199.method1371(200000, var11);
                    }
                    if (class226.field3901 != null && client.method1095(class57.field927) != null) {
                        class178.field3093++;
                        class34.field627.method551(40, !arg0);
                        class34.field627.method225(class57.field927.field1964, -45);
                        class34.field627.method209(-97, class226.field3901.field1964);
                        class34.field627.method223(class57.field927.field1955, -3339);
                        class34.field627.method223(class226.field3901.field1955, -3339);
                    }
                } else if ((class13.field269 == 1 || class236.method1587(class157.field2745 - 1, (byte) 95)) && class157.field2745 > 2) {
                    class16.method126(0);
                } else if (class157.field2745 > 0) {
                    class169.method1176((byte) 54);
                }
                class57.field927 = null;
            }
        } else if (class105.field1754 > 1) {
            class57.field927 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static final void method250(byte arg0) {
        field527++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class157.field2745 - 1; var2++) {
                if (class275.field4765[var2] < 1000 && class275.field4765[var2 + 1] > 1000) {
                    var1 = false;
                    class280 var3 = class258.field4566[var2];
                    class258.field4566[var2] = class258.field4566[var2 + 1];
                    class258.field4566[var2 + 1] = var3;
                    class280 var4 = class197.field3441[var2];
                    class197.field3441[var2] = class197.field3441[var2 + 1];
                    class197.field3441[var2 + 1] = var4;
                    int var5 = class242.field4235[var2];
                    class242.field4235[var2] = class242.field4235[var2 + 1];
                    class242.field4235[var2 + 1] = var5;
                    int var6 = class227.field3917[var2];
                    class227.field3917[var2] = class227.field3917[var2 + 1];
                    class227.field3917[var2 + 1] = var6;
                    int var7 = class123.field2161[var2];
                    class123.field2161[var2] = class123.field2161[var2 + 1];
                    class123.field2161[var2 + 1] = var7;
                    short var8 = class275.field4765[var2];
                    class275.field4765[var2] = class275.field4765[var2 + 1];
                    class275.field4765[var2 + 1] = var8;
                    long var9 = class219.field3753[var2];
                    class219.field3753[var2] = class219.field3753[var2 + 1];
                    class219.field3753[var2 + 1] = var9;
                }
            }
        }
        if (arg0 != 127) {
            field528 = false;
        }
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)Z")
    public static final boolean method251(int arg0) {
        field536++;
        try {
            return arg0 == 9532 ? class260.method1758(0) : true;
        } catch (IOException var4) {
            class4.method56(8364);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class85.field1394 + "," + class125.field2193 + "," + class4.field117 + " - " + class23.field422 + "," + (class49.field806 + class262.field4631.field4837[0]) + "," + (class262.field4631.field4792[0] + class91.field1480) + " - ";
            for (int var3 = 0; var3 < class23.field422 && var3 < 50; var3++) {
                var2 = var2 + class20.field367.field475[var3] + ",";
            }
            class207.method1398(var2, 72, var5);
            class40.method313((byte) 71);
            return true;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BIII)V")
    public static final void method252(byte arg0, int arg1, int arg2, int arg3) {
        field526++;
        class157 var4 = class257.method1740(arg2, (byte) 85, 4);
        var4.method1112((byte) 106);
        if (arg0 > -78) {
            method251(-7);
        }
        var4.field2751 = arg1;
        var4.field2748 = arg3;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class28() {
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lp;I)V")
    public class28(class280 arg0, int arg1) {
        this.field533 = arg0;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)V")
    public static void method253(boolean arg0) {
        field534 = null;
        field535 = null;
        field532 = null;
        if (!arg0) {
            method249(true);
        }
        field531 = null;
        field530 = null;
    }
}
