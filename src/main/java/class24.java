import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class24 {

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Llc;")
    public static class69 field494 = class69.method470((byte) -127, "Use @lre@");

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field504 = 10;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Llc;")
    public static class69 field492 = class69.method470((byte) -114, "Enter name of friend to add to list");

    @OriginalMember(owner = "client!de", name = "n", descriptor = "Llc;")
    public static class69 field505 = class69.method470((byte) -112, "(U3");

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Llc;")
    public static class69 field499 = class69.method470((byte) -123, "You have ");

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Z")
    public static boolean field506 = false;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Llc;")
    public static class69 field503 = class69.method470((byte) -128, "Trade)4compete");

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field498 = 2;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Lua;")
    public static class116 field501;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Lkc;")
    public static class63 field497;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "Ljava/awt/Graphics;")
    public static Graphics field509;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[I")
    public static int[] field493;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "[I")
    public static int[] field500;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIZIILbb;III)V")
    public static final void method158(int arg0, int arg1, boolean arg2, int arg3, int arg4, class9 arg5, int arg6, int arg7, int arg8) {
        field502++;
        if (class128.field2761) {
            class13.field259 = 32;
        } else {
            class13.field259 = 0;
        }
        class128.field2761 = arg2;
        if (arg0 >= arg7 && arg0 < arg7 + 16 && arg4 >= arg1 && arg4 < arg1 + 16) {
            arg5.field153 -= class50.field1090 * 4;
            if (arg3 == 1) {
                class110.field2418 = true;
            }
            if (arg3 == 2 || arg3 == 3) {
                class35.field709 = true;
            }
        } else if (arg7 <= arg0 && arg0 < arg7 + 16 && arg4 >= arg1 + arg8 - 16 && arg1 + arg8 > arg4) {
            if (arg3 == 1) {
                class110.field2418 = true;
            }
            if (arg3 == 2 || arg3 == 3) {
                class35.field709 = true;
            }
            arg5.field153 += class50.field1090 * 4;
        } else if (arg7 - class13.field259 <= arg0 && arg0 < arg7 + class13.field259 + 16 && arg1 + 16 <= arg4 && arg4 < arg8 + arg1 - 16 && class50.field1090 > 0) {
            if (arg3 == 2 || arg3 == 3) {
                class35.field709 = true;
            }
            class128.field2761 = true;
            if (arg3 == 1) {
                class110.field2418 = true;
            }
            int var9 = (arg8 - 32) * arg8 / arg6;
            if (var9 < 8) {
                var9 = 8;
            }
            int var10 = arg8 - var9 - 32;
            int var11 = arg4 - arg1 - var9 / 2 - 16;
            arg5.field153 = (arg6 - arg8) * var11 / var10;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Z")
    public static final boolean method159(int arg0, int arg1) {
        field495++;
        if (arg0 != 14762) {
            method160((byte) 119);
        }
        if (!class50.method334((byte) 75, arg1)) {
            return false;
        }
        boolean var2 = false;
        class9[] var3 = class106.field2310[arg1];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class9 var5 = var3[var4];
            if (var5 != null && var5.field171 == 6) {
                if (var5.field130 != -1 || var5.field170 != -1) {
                    boolean var6 = class50.method333(1, var5);
                    int var7;
                    if (var6) {
                        var7 = var5.field170;
                    } else {
                        var7 = var5.field130;
                    }
                    if (var7 != -1) {
                        class74 var8 = class67.method435(82, var7);
                        var5.field162 += class69.field1534;
                        label55: while (true) {
                            do {
                                do {
                                    if (var8.field1658[var5.field147] >= var5.field162) {
                                        break label55;
                                    }
                                    var2 = true;
                                    var5.field162 -= var8.field1658[var5.field147];
                                    var5.field147++;
                                } while (var5.field147 < var8.field1646.length);
                                var5.field147 -= var8.field1656;
                            } while (var5.field147 >= 0 && var5.field147 < var8.field1646.length);
                            var5.field147 = 0;
                        }
                    }
                }
                if (var5.field121 != 0) {
                    var2 = true;
                    int var9 = var5.field121 >> 16;
                    int var10 = class69.field1534 * var9;
                    var5.field122 = var5.field122 + var10 & 0x7FF;
                    int var11 = var5.field121 << 16 >> 16;
                    int var12 = class69.field1534 * var11;
                    var5.field175 = var5.field175 + var12 & 0x7FF;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static void method160(byte arg0) {
        field501 = null;
        field499 = null;
        field492 = null;
        field505 = null;
        field494 = null;
        field493 = null;
        field503 = null;
        int var1 = -112 % ((arg0 + 65) / 56);
        field497 = null;
        field509 = null;
        field500 = null;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
    public static final void method161(byte arg0) {
        field508++;
        try {
            if (class110.field2423 == 0) {
                class74.field1676 = null;
                class56.field1179 = false;
                class106.field2298 = null;
                class110.field2423 = 1;
                class67.field1404 = 0;
            }
            if (class110.field2423 == 1) {
                if (class74.field1676 == null) {
                    class74.field1676 = class64.field1358.method755(class75.field1688, (byte) -63);
                }
                if (class74.field1676.field2504 == 2) {
                    throw new IOException();
                }
                if (class74.field1676.field2504 == 1) {
                    class106.field2298 = new class79((Socket) class74.field1676.field2505, class64.field1358);
                    class110.field2423 = 2;
                    class74.field1676 = null;
                }
            }
            if (class110.field2423 == 2) {
                long var1 = class72.field1609 = class71.field1585.method465(1);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class26.field557.field2061 = 0;
                class26.field557.method675((byte) -78, 14);
                class26.field557.method675((byte) -94, var3);
                class106.field2298.method562(2, 5000, class26.field557.field2077, 0);
                class3.field22.field2061 = 0;
                class110.field2423 = 3;
            }
            if (class110.field2423 == 3) {
                int var4 = class106.field2298.method566(-118);
                if (var4 != 0) {
                    class35.method214(-3, var4);
                    return;
                }
                class3.field22.field2061 = 0;
                class110.field2423 = 4;
            }
            if (class110.field2423 == 4) {
                if (class3.field22.field2061 < 8) {
                    int var5 = class106.field2298.method565(false);
                    if (8 - class3.field22.field2061 < var5) {
                        var5 = 8 - class3.field22.field2061;
                    }
                    if (var5 > 0) {
                        class106.field2298.method567(var5, class3.field22.field2061, (byte) -108, class3.field22.field2077);
                        class3.field22.field2061 += var5;
                    }
                }
                if (class3.field22.field2061 == 8) {
                    class3.field22.field2061 = 0;
                    class76.field1712 = class3.field22.method712(1092193376);
                    class110.field2423 = 5;
                }
            }
            if (class110.field2423 == 5) {
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class76.field1712 >> 32), (int) class76.field1712 };
                class26.field557.field2061 = 0;
                class26.field557.method675((byte) -97, 10);
                class26.field557.method704(var6[0], (byte) 117);
                class26.field557.method704(var6[1], (byte) 122);
                class26.field557.method704(var6[2], (byte) 123);
                class26.field557.method704(var6[3], (byte) 120);
                class26.field557.method704(class64.field1358.field2167, (byte) 121);
                class26.field557.method664(class71.field1585.method465(1), 104);
                class26.field557.method692(class71.field1592, (byte) 90);
                class26.field557.method707(class87.field1913, -1, class78.field1757);
                class68.field1482.field2061 = 0;
                if (class125.field2705 == 40) {
                    class68.field1482.method675((byte) -98, 18);
                } else {
                    class68.field1482.method675((byte) -125, 16);
                }
                class68.field1482.method675((byte) -95, class26.field557.field2061 + 53);
                class68.field1482.method704(403, (byte) 121);
                class68.field1482.method675((byte) -45, class13.field264 ? 1 : 0);
                class68.field1482.method704(class106.field2303.field1319, (byte) 125);
                class68.field1482.method704(class77.field1728.field1319, (byte) 117);
                class68.field1482.method704(class94.field2065.field1319, (byte) 125);
                class68.field1482.method704(class42.field840.field1319, (byte) 116);
                class68.field1482.method704(class68.field1452.field1319, (byte) 116);
                class68.field1482.method704(class106.field2301.field1319, (byte) 117);
                class68.field1482.method704(class27.field570.field1319, (byte) 119);
                class68.field1482.method704(class81.field1833.field1319, (byte) 121);
                class68.field1482.method704(class16.field315.field1319, (byte) 117);
                class68.field1482.method704(class67.field1421.field1319, (byte) 116);
                class68.field1482.method704(class46.field958.field1319, (byte) 119);
                class68.field1482.method704(class35.field693.field1319, (byte) 123);
                class68.field1482.method710(-90, class26.field557.field2061, 0, class26.field557.field2077);
                class106.field2298.method562(class68.field1482.field2061, 5000, class68.field1482.field2077, 0);
                class26.field557.method179(var6, 49);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class3.field22.method179(var6, 109);
                class110.field2423 = 6;
            }
            if (class110.field2423 == 6 && class106.field2298.method565(false) > 0) {
                int var8 = class106.field2298.method566(-55);
                if (var8 == 21 && class125.field2705 == 20) {
                    class110.field2423 = 7;
                } else if (var8 == 2) {
                    class110.field2423 = 9;
                } else if (var8 == 15 && class125.field2705 == 40) {
                    client.method120(false);
                    return;
                } else if (var8 == 23 && class19.field424 < 1) {
                    class110.field2423 = 0;
                    class19.field424++;
                } else {
                    class35.method214(-3, var8);
                    return;
                }
            }
            if (arg0 > -91) {
                field503 = null;
            }
            if (class110.field2423 == 7 && class106.field2298.method565(false) > 0) {
                class57.field1201 = class106.field2298.method566(-44) * 60 + 180;
                class110.field2423 = 8;
            }
            if (class110.field2423 == 8) {
                class67.field1404 = 0;
                class55.method347(class2.field4, -119, class46.method305(20025, new class69[] { class108.field2379, class106.method791(class57.field1201 / 60, (byte) -59) }));
                if (--class57.field1201 <= 0) {
                    class110.field2423 = 0;
                }
            } else {
                if (class110.field2423 == 9 && class106.field2298.method565(false) >= 8) {
                    class80.field1828 = class106.field2298.method566(-107);
                    class23.field478 = class106.field2298.method566(-114) == 1;
                    class2.field10 = class106.field2298.method566(-65);
                    class2.field10 <<= 0x8;
                    class2.field10 += class106.field2298.method566(-76);
                    class17.field339 = class106.field2298.method566(-52);
                    class106.field2298.method567(1, 0, (byte) -108, class3.field22.field2077);
                    class3.field22.field2061 = 0;
                    class90.field1960 = class3.field22.method180((byte) -117);
                    class106.field2298.method567(2, 0, (byte) -108, class3.field22.field2077);
                    class3.field22.field2061 = 0;
                    class103.field2224 = class3.field22.method665(8666);
                    class110.field2423 = 10;
                }
                if (class110.field2423 != 10) {
                    class67.field1404++;
                    if (class67.field1404 > 2000) {
                        if (class19.field424 < 1) {
                            class110.field2423 = 0;
                            if (class75.field1688 == class10.field199) {
                                class75.field1688 = class6.field107;
                            } else {
                                class75.field1688 = class10.field199;
                            }
                            class19.field424++;
                        } else {
                            class35.method214(-3, -3);
                        }
                    }
                } else if (class106.field2298.method565(false) >= class103.field2224) {
                    class3.field22.field2061 = 0;
                    class106.field2298.method567(class103.field2224, 0, (byte) -108, class3.field22.field2077);
                    class3.method15(true);
                    class125.field2694 = -1;
                    class69.method471(false, (byte) 117);
                    class90.field1960 = -1;
                }
            }
        } catch (IOException var9) {
            if (class19.field424 < 1) {
                if (class75.field1688 == class10.field199) {
                    class75.field1688 = class6.field107;
                } else {
                    class75.field1688 = class10.field199;
                }
                class19.field424++;
                class110.field2423 = 0;
            } else {
                class35.method214(-3, -2);
            }
        }
    }
}
