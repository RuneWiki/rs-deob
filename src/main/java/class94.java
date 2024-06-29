import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class94 extends OutputStream {

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field1655 = 100;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Lid;")
    public static class149 field1662 = class60.method382("Connect-B au serveur de mise -9 jour", (byte) 4);

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "[Z")
    public static boolean[] field1664 = new boolean[100];

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "[I")
    public static int[] field1656 = new int[200];

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "[I")
    public static int[] field1661 = new int[2];

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Lvj;")
    public static class115 field1658 = new class115(128);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Lal;")
    public static class230 field1653;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIILaj;)V")
    public static final void method683(int arg0, int arg1, int arg2, class47 arg3) {
        field1652++;
        if (arg2 != -1) {
            method685((byte) -36);
        }
        if (arg3.field699 == 1) {
            class69.method434((byte) 125, class171.field3158, (short) 46, arg3.field803, 0, arg3.field834, 0L, -1);
            class61.field1098++;
        }
        if (arg3.field699 == 2 && !class40.field621) {
            class149 var4 = class156.method1123(320, arg3);
            if (var4 != null) {
                class128.field2265++;
                class69.method434((byte) 120, class237.method1603(new class149[] { class128.field2251, arg3.field791 }, arg2 - 123), (short) 6, var4, -1, arg3.field834, 0L, -1);
            }
        }
        if (arg3.field699 == 3) {
            class69.method434((byte) 122, class171.field3158, (short) 3, class216.field3816, 0, arg3.field834, 0L, -1);
            class69.field1217++;
        }
        if (arg3.field699 == 4) {
            class191.field3429++;
            class69.method434((byte) 119, class171.field3158, (short) 13, arg3.field803, 0, arg3.field834, 0L, -1);
        }
        if (arg3.field699 == 5) {
            class255.field4463++;
            class69.method434((byte) 118, class171.field3158, (short) 10, arg3.field803, 0, arg3.field834, 0L, -1);
        }
        if (arg3.field699 == 6 && class263.field4677 == null) {
            class69.method434((byte) 124, class171.field3158, (short) 38, arg3.field803, -1, arg3.field834, 0L, -1);
            class199.field3612++;
        }
        if (arg3.field760 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field732; var6++) {
                for (int var7 = 0; var7 < arg3.field726; var7++) {
                    int var8 = (arg3.field859 + 32) * var7;
                    int var9 = (arg3.field746 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg3.field770[var5];
                        var9 += arg3.field778[var5];
                    }
                    if (var8 <= arg1 && arg0 >= var9 && var8 + 32 > arg1 && (var9 + 32) > arg0) {
                        class177.field3236 = arg3;
                        class159.field2925 = var5;
                        if (arg3.field797[var5] > 0) {
                            class161 var10 = client.method1104(arg3);
                            class261 var11 = class226.method1516(arg3.field797[var5] - 1, -28322);
                            if (class43.field657 == 1 && var10.method1183(3867171)) {
                                if (class5.field60 != arg3.field834 || class78.field1459 != var5) {
                                    class176.field3225++;
                                    class69.method434((byte) 123, class237.method1603(new class149[] { class70.field1237, class60.field1090, var11.field4604 }, arg2 - 110), (short) 39, class43.field660, var5, arg3.field834, (long) var11.field4620, -1);
                                }
                            } else if (class40.field621 && var10.method1183(arg2 + 3867172)) {
                                class49 var12 = class273.field4901 == -1 ? null : class138.method964(-107, class273.field4901);
                                if ((class247.field4332 & 0x10) != 0 && (var12 == null || var11.method1808(var12.field882, class273.field4901, (byte) -123) != var12.field882)) {
                                    class93.field1648++;
                                    class69.method434((byte) 120, class237.method1603(new class149[] { class230.field4017, class60.field1090, var11.field4604 }, arg2 ^ 0x6C), (short) 15, class197.field3581, var5, arg3.field834, (long) var11.field4620, class216.field3805);
                                }
                            } else {
                                class45.field681++;
                                class149[] var13 = var11.field4658;
                                if (class261.field4601) {
                                    var13 = class240.method1650(var13, 0);
                                }
                                if (var10.method1183(3867171)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 26;
                                            } else {
                                                var15 = 23;
                                            }
                                            class69.method434((byte) 126, class237.method1603(new class149[] { class36.field541, var11.field4604 }, -114), var15, var13[var14], var5, arg3.field834, (long) var11.field4620, -1);
                                            class167.field3093++;
                                        }
                                    }
                                }
                                if (var10.method1179(3867171)) {
                                    class69.method434((byte) 118, class237.method1603(new class149[] { class36.field541, var11.field4604 }, arg2 ^ 0x5B), (short) 12, class43.field660, var5, arg3.field834, (long) var11.field4620, class210.field3751);
                                    class191.field3418++;
                                }
                                if (var10.method1183(3867171) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class38.field564++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 30;
                                            }
                                            if (var16 == 1) {
                                                var17 = 18;
                                            }
                                            if (var16 == 2) {
                                                var17 = 44;
                                            }
                                            class69.method434((byte) 117, class237.method1603(new class149[] { class36.field541, var11.field4604 }, -97), var17, var13[var16], var5, arg3.field834, (long) var11.field4620, -1);
                                        }
                                    }
                                }
                                class149[] var18 = arg3.field703;
                                if (class261.field4601) {
                                    var18 = class240.method1650(var18, arg2 + 1);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class125.field2201++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 42;
                                            }
                                            if (var19 == 1) {
                                                var20 = 50;
                                            }
                                            if (var19 == 2) {
                                                var20 = 37;
                                            }
                                            if (var19 == 3) {
                                                var20 = 1;
                                            }
                                            if (var19 == 4) {
                                                var20 = 2;
                                            }
                                            class69.method434((byte) 115, class237.method1603(new class149[] { class36.field541, var11.field4604 }, -124), var20, var18[var19], var5, arg3.field834, (long) var11.field4620, -1);
                                        }
                                    }
                                }
                                class69.method434((byte) 126, class237.method1603(new class149[] { class36.field541, var11.field4604 }, arg2 - 111), (short) 1005, class278.field4968, var5, arg3.field834, (long) var11.field4620, class222.field3919);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg3.field718) {
            return;
        }
        if (!class40.field621) {
            for (int var21 = 9; var21 >= 5; var21--) {
                class149 var25 = class226.method1519(var21, 0, arg3);
                if (var25 != null) {
                    class69.method434((byte) 124, arg3.field711, (short) 1001, var25, arg3.field799, arg3.field834, (long) (var21 + 1), class242.method1687((byte) -121, arg3, var21));
                    class254.field4451++;
                }
            }
            class149 var22 = class156.method1123(320, arg3);
            if (var22 != null) {
                class128.field2265++;
                class69.method434((byte) 121, arg3.field711, (short) 6, var22, arg3.field799, arg3.field834, 0L, -1);
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                class149 var24 = class226.method1519(var23, 0, arg3);
                if (var24 != null) {
                    class69.method434((byte) 115, arg3.field711, (short) 59, var24, arg3.field799, arg3.field834, (long) (var23 + 1), class242.method1687((byte) -98, arg3, var23));
                    class254.field4451++;
                }
            }
            if (client.method1104(arg3).method1185((byte) -103)) {
                class69.method434((byte) 110, class171.field3158, (short) 38, class37.field551, arg3.field799, arg3.field834, 0L, -1);
                class199.field3612++;
                return;
            }
            return;
        }
        if (client.method1104(arg3).method1184(arg2 ^ 0xFFFFCD7F) && (class247.field4332 & 0x20) != 0) {
            class69.method434((byte) 122, class237.method1603(new class149[] { class230.field4017, class14.field193, arg3.field711 }, -108), (short) 22, class197.field3581, arg3.field799, arg3.field834, 0L, class216.field3805);
            class54.field978++;
            return;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lpb;Z)V")
    public static final void method684(class127 arg0, boolean arg1) {
        field1660++;
        class259 var2 = (class259) class252.field4419.method639((byte) -14, arg0.field2243.method1023((byte) -16));
        if (arg1) {
            return;
        }
        if (var2 == null) {
            class185.method1275(arg0.field2400[0], (class268) null, 128, class277.field4948, arg0, arg0.field2333[0], (class20) null, 0);
        } else {
            var2.method1784(-121);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static final void method685(byte arg0) {
        int var1 = class77.field1449.field2347 + client.field2857;
        field1663++;
        int var2 = class192.field3443 + class77.field1449.field2340;
        if ((class75.field1351 - var1) < -500 || (class75.field1351 - var1) > 500 || (class86.field1569 - var2) < -500 || class86.field1569 - var2 > 500) {
            class86.field1569 = var2;
            class75.field1351 = var1;
        }
        if (class86.field1569 != var2) {
            class86.field1569 += (var2 - class86.field1569) / 16;
        }
        if (class75.field1351 != var1) {
            class75.field1351 += (var1 - class75.field1351) / 16;
        }
        if (arg0 < 109) {
            return;
        }
        if (class228.field3987) {
            for (int var3 = 0; var3 < class40.field633; var3++) {
                int var4 = class248.field4353[var3];
                if (var4 == 98) {
                    class57.field1004 = class57.field1004 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class57.field1004 = class57.field1004 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class55.field985 = class55.field985 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class55.field985 = class55.field985 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class131.field2312[96]) {
                class40.field630 += (-class40.field630 - 24) / 2;
            } else if (class131.field2312[97]) {
                class40.field630 += (24 - class40.field630) / 2;
            } else {
                class40.field630 /= 2;
            }
            if (class131.field2312[98]) {
                class93.field1637 += (12 - class93.field1637) / 2;
            } else if (class131.field2312[99]) {
                class93.field1637 += (-class93.field1637 - 12) / 2;
            } else {
                class93.field1637 /= 2;
            }
            class55.field985 += class40.field630 / 2;
            class57.field1004 += class93.field1637 / 2;
        }
        class139.method973(0);
    }

    @OriginalMember(owner = "client!sf", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field1654++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lek;IIIZI)V")
    public static final void method686(class164 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1657++;
        if (class184.field3327 >= 50) {
            return;
        }
        if (arg2 >= -104) {
            field1661 = null;
        }
        if (arg0.field3062 == null || arg0.field3062.length <= arg5 || arg0.field3062[arg5] == null) {
            return;
        }
        int var6 = arg0.field3062[arg5][0];
        int var7 = var6 >> 8;
        int var8 = var6 & 0x1F;
        if (arg0.field3062[arg5].length > 1) {
            int var9 = (int) (Math.random() * (double) arg0.field3062[arg5].length);
            if (var9 > 0) {
                var7 = arg0.field3062[arg5][var9];
            }
        }
        int var10 = var6 >> 5 & 0x7;
        if (var8 == 0) {
            if (arg4) {
                class279.method1926(true, var10, 0, var7);
            }
        } else if (class133.field2432 != 0) {
            int var11 = (arg1 - 64) / 128;
            int var12 = (arg3 - 64) / 128;
            class18.field276[class184.field3327] = var7;
            class101.field1776[class184.field3327] = var10;
            class119.field2048[class184.field3327] = 0;
            class139.field2542[class184.field3327] = null;
            class157.field2883[class184.field3327] = (var11 << 8) + (var12 << 16) + var8;
            class184.field3327++;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)I")
    public static final int method687(int arg0) {
        field1659++;
        if (class180.field3252) {
            return 0;
        } else if (arg0 != 0) {
            return 64;
        } else if (class123.method869(true)) {
            return class80.field1489 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
    public static void method688(byte arg0) {
        if (arg0 != 62) {
            field1662 = null;
        }
        field1656 = null;
        field1662 = null;
        field1653 = null;
        field1664 = null;
        field1661 = null;
        field1658 = null;
    }
}
