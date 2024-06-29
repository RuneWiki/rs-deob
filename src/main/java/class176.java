import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class176 extends class184 {

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "[I")
    public static int[] field3204 = new int[200];

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "I")
    public static int field3205 = 0;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "Lhe;")
    public static class94 field3200 = new class94(30);

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
    public static int field3207 = 128;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public int field3199;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public int field3201;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
    public int field3208;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)Z", line = 24)
    public static final boolean method1243(byte arg0) {
        if (arg0 <= 41) {
            return true;
        }
        field3206++;
        try {
            return class92.method617(true);
        } catch (IOException var5) {
            class54.method377((byte) 125);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class191.field3457 + "," + class88.field1389 + "," + class290.field5080 + " - " + class191.field3471 + "," + (class95.field1513.field4498[0] + class305.field5295) + "," + (class95.field1513.field4482[0] + class137.field2421) + " - ";
            for (int var4 = 0; class191.field3471 > var4 && var4 < 50; var4++) {
                var3 = var3 + class293.field5127.field4338[var4] + ",";
            }
            class171.method1188(64, var3, var6);
            class298.method2106((byte) 95);
            return true;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lca;B)Lsf;", line = 64)
    public static final class108 method1244(class98 arg0, byte arg1) {
        field3203++;
        if (arg1 >= -104) {
            return (class108) null;
        } else if (class134.method917((byte) -37, client.method1815(arg0)) == 0) {
            return null;
        } else if (arg0.field1628 == null || arg0.field1628.method769(-8001).method776(0) == 0) {
            return class46.field673 ? class83.field1277 : null;
        } else {
            return arg0.field1628;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)V", line = 91)
    public static void method1245(byte arg0) {
        field3200 = null;
        field3204 = null;
        if (arg0 != -94) {
            field3204 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)Z", line = 103)
    public static final boolean method1246(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class227.field3986; var3++) {
            class92 var4 = class247.field4292[var3];
            if (var4.field1464 == 1) {
                int var5 = var4.field1458 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1467 * var5 >> 8) + var4.field1459;
                    int var7 = (var4.field1463 * var5 >> 8) + var4.field1455;
                    int var8 = (var4.field1471 * var5 >> 8) + var4.field1462;
                    int var9 = (var4.field1457 * var5 >> 8) + var4.field1473;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1464 == 2) {
                int var10 = arg0 - var4.field1458;
                if (var10 > 0) {
                    int var11 = (var4.field1467 * var10 >> 8) + var4.field1459;
                    int var12 = (var4.field1463 * var10 >> 8) + var4.field1455;
                    int var13 = (var4.field1471 * var10 >> 8) + var4.field1462;
                    int var14 = (var4.field1457 * var10 >> 8) + var4.field1473;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1464 == 3) {
                int var15 = var4.field1459 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1454 * var15 >> 8) + var4.field1458;
                    int var17 = (var4.field1452 * var15 >> 8) + var4.field1449;
                    int var18 = (var4.field1471 * var15 >> 8) + var4.field1462;
                    int var19 = (var4.field1457 * var15 >> 8) + var4.field1473;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1464 == 4) {
                int var20 = arg2 - var4.field1459;
                if (var20 > 0) {
                    int var21 = (var4.field1454 * var20 >> 8) + var4.field1458;
                    int var22 = (var4.field1452 * var20 >> 8) + var4.field1449;
                    int var23 = (var4.field1471 * var20 >> 8) + var4.field1462;
                    int var24 = (var4.field1457 * var20 >> 8) + var4.field1473;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1464 == 5) {
                int var25 = arg1 - var4.field1462;
                if (var25 > 0) {
                    int var26 = (var4.field1454 * var25 >> 8) + var4.field1458;
                    int var27 = (var4.field1452 * var25 >> 8) + var4.field1449;
                    int var28 = (var4.field1467 * var25 >> 8) + var4.field1459;
                    int var29 = (var4.field1463 * var25 >> 8) + var4.field1455;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
