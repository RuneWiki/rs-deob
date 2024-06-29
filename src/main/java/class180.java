import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class180 {

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "F")
    public static float field2734 = 0.25F;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public static int field2735 = -1;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "Lkda;")
    public static class328 field2737;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)V")
    public static void method1262(boolean arg0) {
        if (arg0) {
            field2737 = null;
        }
        field2737 = null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
    public static final void method1263(int arg0) {
        field2736++;
        if (class56.field668.method1477(class526.field7533, 1) != 2) {
            return;
        }
        if (arg0 < 89) {
            method1262(true);
        }
        byte var1 = (byte) (class84.field1205 - 4 & 0xFF);
        int var2 = class84.field1205 % class146.field2125;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class410.field5609; var16++) {
                class383.field5270[var3][var2][var16] = var1;
            }
        }
        if (class89.field1339 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class25.field240[var4] = -1000000;
            class168.field2631[var4] = 1000000;
            class144.field2013[var4] = 0;
            class513.field7337[var4] = 1000000;
            class149.field2208[var4] = 0;
        }
        if (class531.field7929 != 1) {
            int var5 = class132.method919(class89.field1339, class214.field3161, class125.field1760, (byte) -82);
            if (var5 - class118.field1665 < 800 && (class146.field2114[class89.field1339][class125.field1760 >> 7][class214.field3161 >> 7] & 0x4) != 0) {
                class177.method1248(false, 1, class420.field5697, false, class214.field3161 >> 7, class125.field1760 >> 7);
                return;
            }
            return;
        }
        if ((class146.field2114[class89.field1339][class541.field8119.field8496 >> 7][class541.field8119.field8500 >> 7] & 0x4) != 0) {
            class177.method1248(false, 0, class420.field5697, false, class541.field8119.field8500 >> 7, class541.field8119.field8496 >> 7);
        }
        if (class517.field7371 >= 2560) {
            return;
        }
        int var6 = class125.field1760 >> 7;
        int var7 = class214.field3161 >> 7;
        int var8 = class541.field8119.field8496 >> 7;
        int var9 = class541.field8119.field8500 >> 7;
        int var10;
        if (var8 > var6) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        int var11;
        if (var9 > var7) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        if (var10 == 0 && var11 == 0 || -class146.field2125 >= var10 || class146.field2125 <= var10 || -class410.field5609 >= var11 || var11 >= class410.field5609) {
            class378.method2255(null, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class473.field6687 + "," + class38.field463, -70);
            return;
        }
        if (var11 >= var10) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var7 != var9) {
                if (var9 > var7) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class146.field2114[class89.field1339][var6][var7] & 0x4) != 0) {
                    class177.method1248(false, 1, class420.field5697, false, var7, var6);
                    return;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    if (var8 > var6) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    var13 -= 65536;
                    if ((class146.field2114[class89.field1339][var6][var7] & 0x4) != 0) {
                        class177.method1248(false, 1, class420.field5697, false, var7, var6);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var11 * 65536 / var10;
        int var15 = 32768;
        while (var6 != var8) {
            if (var8 > var6) {
                var6++;
            } else if (var8 < var6) {
                var6--;
            }
            if ((class146.field2114[class89.field1339][var6][var7] & 0x4) != 0) {
                class177.method1248(false, 1, class420.field5697, false, var7, var6);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                var15 -= 65536;
                if (var9 > var7) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class146.field2114[class89.field1339][var6][var7] & 0x4) != 0) {
                    class177.method1248(false, 1, class420.field5697, false, var7, var6);
                    return;
                }
            }
        }
    }
}
