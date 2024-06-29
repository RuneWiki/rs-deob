import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class137 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1787 = new String[100];

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "[S")
    public static short[] field1792 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "[I")
    public static int[] field1788 = new int[14];

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "Liu;")
    public static class390 field1794 = new class390(82, -1);

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "B")
    public byte field1791;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public int field1790;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Lni;")
    public static class345 field1797;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Ljava/lang/String;")
    public String field1786;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Ljava/lang/String;")
    public String field1793;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Ljava/lang/String;")
    public String field1795;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Ljava/lang/String;")
    public String field1796;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method866(int arg0) {
        field1787 = null;
        field1792 = null;
        field1797 = null;
        if (arg0 != 4) {
            method867(12);
        }
        field1794 = null;
        field1788 = null;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public static final void method867(int arg0) {
        field1798++;
        if (arg0 != 4) {
            field1792 = null;
        }
        if (class118.field1533.method2959(arg0 - 4, class293.field4174) != 2) {
            return;
        }
        byte var1 = (byte) (class287.field4103 - 4 & 0xFF);
        int var2 = class287.field4103 % class362.field5442;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class203.field2813; var16++) {
                class449.field6546[var3][var2][var16] = var1;
            }
        }
        if (class355.field5121 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class67.field1008[var4] = -1000000;
            class389.field5778[var4] = 1000000;
            class157.field2058[var4] = 0;
            class16.field233[var4] = 1000000;
            class498.field7586[var4] = 0;
        }
        if (class306.field4454 != 1) {
            int var15 = class103.method620(class355.field5121, class282.field4026, (byte) 20, class205.field2843);
            if (var15 - class432.field6338 >= 800 || (class379.field5661[class355.field5121][class205.field2843 >> 7][class282.field4026 >> 7] & 0x4) == 0) {
                return;
            }
            class426.method2542(false, class205.field2843 >> 7, (byte) 91, 1, class282.field4026 >> 7, class358.field5312);
            return;
        }
        if ((class379.field5661[class355.field5121][class415.field6145.field2959 >> 7][class415.field6145.field2966 >> 7] & 0x4) != 0) {
            class426.method2542(false, class415.field6145.field2959 >> 7, (byte) 105, 0, class415.field6145.field2966 >> 7, class358.field5312);
        }
        if (class317.field4653 >= 2560) {
            return;
        }
        int var5 = class205.field2843 >> 7;
        int var6 = class282.field4026 >> 7;
        int var7 = class415.field6145.field2959 >> 7;
        int var8 = class415.field6145.field2966 >> 7;
        int var9;
        if (var5 >= var7) {
            var9 = var5 - var7;
        } else {
            var9 = var7 - var5;
        }
        int var10;
        if (var8 <= var6) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        if ((var9 != 0 || var10 != 0) && (-class362.field5442) < var9 && class362.field5442 > var9 && (-class203.field2813) < var10 && var10 < class203.field2813) {
            if (var10 < var9) {
                int var11 = var10 * 65536 / var9;
                int var12 = 32768;
                while (var5 != var7) {
                    if (var5 < var7) {
                        var5++;
                    } else if (var7 < var5) {
                        var5--;
                    }
                    if ((class379.field5661[class355.field5121][var5][var6] & 0x4) != 0) {
                        class426.method2542(false, var5, (byte) 105, 1, var6, class358.field5312);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        if (var6 < var8) {
                            var6++;
                        } else if (var8 < var6) {
                            var6--;
                        }
                        var12 -= 65536;
                        if ((class379.field5661[class355.field5121][var5][var6] & 0x4) != 0) {
                            class426.method2542(false, var5, (byte) 61, 1, var6, class358.field5312);
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
                } else if (var6 > var8) {
                    var6--;
                }
                if ((class379.field5661[class355.field5121][var5][var6] & 0x4) != 0) {
                    class426.method2542(false, var5, (byte) 117, 1, var6, class358.field5312);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    if (var7 > var5) {
                        var5++;
                    } else if (var5 > var7) {
                        var5--;
                    }
                    var14 -= 65536;
                    if ((class379.field5661[class355.field5121][var5][var6] & 0x4) != 0) {
                        class426.method2542(false, var5, (byte) 89, 1, var6, class358.field5312);
                        return;
                    }
                }
            }
            return;
        }
        class356.method2169(null, "RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class455.field6637 + "," + class223.field3158, (byte) 34);
        return;
    }
}
