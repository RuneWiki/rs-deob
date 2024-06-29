import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class491 {

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Lug;")
    public static class392 field7262 = new class392();

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Liv;")
    public static class64 field7265 = new class64(8, 0);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "[Lf;")
    public static class529[] field7266;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method2920(int arg0) {
        field7265 = null;
        field7262 = null;
        if (arg0 == 21973) {
            field7266 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static final void method2921(byte arg0) {
        field7261++;
        if (arg0 != 14) {
            method2921((byte) -102);
        }
        if (class443.field6623.method2836(class169.field2624, -2) != 2) {
            return;
        }
        byte var1 = (byte) (class173.field2664 - 4 & 0xFF);
        int var2 = class173.field2664 % class33.field662;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class121.field1966; var16++) {
                class413.field6171[var3][var2][var16] = var1;
            }
        }
        if (class163.field2525 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class400.field6024[var4] = -1000000;
            class382.field5785[var4] = 1000000;
            class414.field6181[var4] = 0;
            class378.field5720[var4] = 1000000;
            class32.field643[var4] = 0;
        }
        if (class85.field1473 != 1) {
            int var15 = class343.method2188(class163.field2525, class40.field732, (byte) -102, class405.field6075);
            if ((var15 - class222.field3184) >= 800 || (class260.field3784[class163.field2525][class40.field732 >> 7][class405.field6075 >> 7] & 0x4) == 0) {
                return;
            }
            class430.method2579(class40.field732 >> 7, class405.field6075 >> 7, 1, -1, false, class380.field5761);
            return;
        }
        if ((class260.field3784[class163.field2525][class139.field2224.field6228 >> 7][class139.field2224.field6233 >> 7] & 0x4) != 0) {
            class430.method2579(class139.field2224.field6228 >> 7, class139.field2224.field6233 >> 7, 0, arg0 ^ 0xFFFFFFF1, false, class380.field5761);
        }
        if (class122.field1982 >= 2560) {
            return;
        }
        int var5 = class40.field732 >> 7;
        int var6 = class405.field6075 >> 7;
        int var7 = class139.field2224.field6228 >> 7;
        int var8 = class139.field2224.field6233 >> 7;
        int var9;
        if (var5 < var7) {
            var9 = var7 - var5;
        } else {
            var9 = var5 - var7;
        }
        int var10;
        if (var8 <= var6) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        if ((var9 != 0 || var10 != 0) && var9 > (-class33.field662) && class33.field662 > var9 && -class121.field1966 < var10 && class121.field1966 > var10) {
            if (var9 > var10) {
                int var11 = var10 * 65536 / var9;
                int var12 = 32768;
                while (var5 != var7) {
                    if (var5 < var7) {
                        var5++;
                    } else if (var5 > var7) {
                        var5--;
                    }
                    if ((class260.field3784[class163.field2525][var5][var6] & 0x4) != 0) {
                        class430.method2579(var5, var6, 1, -1, false, class380.field5761);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var6 < var8) {
                            var6++;
                        } else if (var6 > var8) {
                            var6--;
                        }
                        if ((class260.field3784[class163.field2525][var5][var6] & 0x4) != 0) {
                            class430.method2579(var5, var6, 1, -1, false, class380.field5761);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var9 * 65536 / var10;
            int var14 = 32768;
            while (var6 != var8) {
                if (var8 > var6) {
                    var6++;
                } else if (var8 < var6) {
                    var6--;
                }
                if ((class260.field3784[class163.field2525][var5][var6] & 0x4) != 0) {
                    class430.method2579(var5, var6, 1, -1, false, class380.field5761);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var5 < var7) {
                        var5++;
                    } else if (var7 < var5) {
                        var5--;
                    }
                    if ((class260.field3784[class163.field2525][var5][var6] & 0x4) != 0) {
                        class430.method2579(var5, var6, 1, -1, false, class380.field5761);
                        return;
                    }
                }
            }
            return;
        }
        class320.method2087(arg0 ^ 0xE, null, "RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class200.field2931 + "," + class403.field6059);
        return;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Z")
    public static final boolean method2922(int arg0, byte arg1) {
        if (arg1 >= -122) {
            return false;
        } else {
            field7263++;
            return arg0 == 0 || arg0 == 1 || arg0 == 2;
        }
    }
}
