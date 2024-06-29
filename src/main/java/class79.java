import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class79 {

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "[Lah;")
    public static class263[] field1518 = new class263[4];

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "Lhj;")
    public static class69 field1523 = class181.method1318("gr-Un:", (byte) -108);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Lhj;")
    public static class69 field1517 = class181.method1318("(U2", (byte) -112);

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field1520 = 1;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Lhj;")
    public static class69 field1522 = class181.method1318("www", (byte) -105);

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Lhj;")
    public static class69 field1524 = class181.method1318(")3", (byte) -115);

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "B")
    public static byte field1527;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)V")
    public static final void method563(int arg0, byte arg1) {
        class59.field1072.method1708(-1009973721, arg0);
        if (arg1 < 28) {
            field1524 = null;
        }
        field1519++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method564(int arg0) {
        field1523 = null;
        field1517 = null;
        field1518 = null;
        field1522 = null;
        field1524 = null;
        if (arg0 != 5) {
            method564(94);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IBLtk;Ld;IILd;I)V")
    public static final void method565(int arg0, byte arg1, class50 arg2, class225 arg3, int arg4, int arg5, class225 arg6, int arg7) {
        class82.field1568 = arg2;
        class114.field2180 = arg7;
        class180.field3265 = arg5;
        class9.field68 = arg4;
        class132.field2449 = arg0;
        field1521++;
        if (class34.field473 != null) {
            return;
        }
        class213.field3869 = true;
        if (class82.field1573 == null) {
            class82.field1573 = class200.method1457(class141.field2640, class98.field1859, 0, 1);
        }
        if (class142.field2651 == null) {
            class142.field2651 = class221.method1564(class23.field324, 5, 0, class98.field1859);
        }
        if (class68.field1291 == null) {
            class68.field1291 = class221.method1564(class151.field2792, 5, 0, class98.field1859);
        }
        if (class144.field2676 == null) {
            class144.field2676 = class221.method1564(class210.field3817, 5, 0, class98.field1859);
        }
        int var8 = class114.field2180 / 5 * 4;
        int var9 = class114.field2180 / 5;
        class15.method95(class9.field68, class132.field2449, class114.field2180, class180.field3265, 0, 168);
        class15.method78(class9.field68, class132.field2449, var9, 23, 12425273, 9135624);
        class15.method78(class9.field68 + var9, class132.field2449, var8, 23, 5197647, 2697513);
        arg6.method1598(class151.field2798, var9 / 2 + class9.field68, class132.field2449 + 15, 0, -1);
        if (class144.field2676 != null) {
            class144.field2676[1].method270(class9.field68 + var9 + 2, class132.field2449 + 1);
            arg3.method1616(class231.field4223, class9.field68 + var9 + 12, class132.field2449 + 10, 16777215, -1);
            class144.field2676[0].method270(class9.field68 + var9 + 2, class132.field2449 + 12);
            arg3.method1616(class262.field4670, var9 + class9.field68 + 12, class132.field2449 + 21, 16777215, -1);
        }
        int var10 = 8 / ((-arg1 - 44) / 52);
        if (class68.field1291 != null) {
            int var11 = class9.field68 + var9 + 140;
            if (class106.field2003[0] == 0 && class43.field621[0] == 0) {
                class68.field1291[2].method270(var11, class132.field2449 + 4);
            } else {
                class68.field1291[0].method270(var11, class132.field2449 + 4);
            }
            if (class106.field2003[0] == 0 && class43.field621[0] == 1) {
                class68.field1291[3].method270(var11 + 15, class132.field2449 + 4);
            } else {
                class68.field1291[1].method270(var11 + 15, class132.field2449 + 4);
            }
            arg6.method1616(class202.field3653, var11 + 32, class132.field2449 + 17, 16777215, -1);
            int var12 = class9.field68 + var9 + 250;
            if (class106.field2003[0] == 1 && class43.field621[0] == 0) {
                class68.field1291[2].method270(var12, class132.field2449 + 4);
            } else {
                class68.field1291[0].method270(var12, class132.field2449 + 4);
            }
            if (class106.field2003[0] == 1 && class43.field621[0] == 1) {
                class68.field1291[3].method270(var12 + 15, class132.field2449 + 4);
            } else {
                class68.field1291[1].method270(var12 + 15, class132.field2449 - -4);
            }
            arg6.method1616(class245.field4482, var12 + 32, class132.field2449 - -17, 16777215, -1);
            int var13 = class9.field68 + var9 + 360;
            if (class106.field2003[0] == 2 && class43.field621[0] == 0) {
                class68.field1291[2].method270(var13, class132.field2449 + 4);
            } else {
                class68.field1291[0].method270(var13, class132.field2449 + 4);
            }
            if (class106.field2003[0] == 2 && class43.field621[0] == 1) {
                class68.field1291[3].method270(var13 + 15, class132.field2449 + 4);
            } else {
                class68.field1291[1].method270(var13 + 15, class132.field2449 - -4);
            }
            arg6.method1616(class97.field1804, var13 + 32, class132.field2449 + 17, 16777215, -1);
            int var14 = class9.field68 + var9 + 470;
            if (class106.field2003[0] == 3 && class43.field621[0] == 0) {
                class68.field1291[2].method270(var14, class132.field2449 + 4);
            } else {
                class68.field1291[0].method270(var14, class132.field2449 + 4);
            }
            if (class106.field2003[0] == 3 && class43.field621[0] == 1) {
                class68.field1291[3].method270(var14 + 15, class132.field2449 - -4);
            } else {
                class68.field1291[1].method270(var14 + 15, class132.field2449 + 4);
            }
            arg6.method1616(class80.field1535, var14 + 32, class132.field2449 + 17, 16777215, -1);
        }
        class15.method77(class114.field2180 - 68, class132.field2449 + 4, 58, 16, 0);
        class104.field1947 = -1;
        if (class82.field1573 == null) {
            return;
        }
        byte var15 = 19;
        byte var16 = 88;
        int var17 = (class180.field3265 - 23) / (var15 + 1);
        int var18 = class114.field2180 / (var16 + 1);
        int var19;
        int var20;
        do {
            var19 = var18;
            if (((var18 - 1) * var17) >= class46.field660) {
                var18--;
            }
            var20 = var17;
            if (((var17 - 1) * var18) >= class46.field660) {
                var17--;
            }
            if (class46.field660 <= (var17 - 1) * var18) {
                var17--;
            }
        } while (var17 != var20 || var18 != var19);
        int var21 = (class114.field2180 - (var16 * var18)) / (var18 + 1);
        if (var21 > 5) {
            var21 = 5;
        }
        int var22 = (class180.field3265 - (var15 * var17) - 23) / (var17 + 1);
        if (var22 > 5) {
            var22 = 5;
        }
        int var23 = (class114.field2180 - ((var18 - 1) * var21) - (var16 * var18)) / 2;
        int var24 = (class180.field3265 - (var15 * var17) - ((var17 - 1) * var22) - 23) / 2;
        int var25 = var24 + 23;
        int var26 = var23;
        int var27 = 0;
        for (int var28 = 0; var28 < class46.field660; var28++) {
            boolean var29 = true;
            class152 var30 = class3.field8[var28];
            class69 var31 = class98.method727(-229, var30.field2839);
            if (var30.field2839 == -1) {
                var29 = false;
                var31 = class94.field1760;
            } else if (var30.field2839 > 1980) {
                var31 = class127.field2332;
                var29 = false;
            }
            if (class205.field3681 >= var26 && class72.field1398 >= var25 && class205.field3681 < var26 + var16 && var15 + var25 > class72.field1398 && var29) {
                class104.field1947 = var28;
                class82.field1573[var30.field2838 ? 1 : 0].method335(class9.field68 + var26, class132.field2449 + var25, 128, 16777215);
            } else {
                class82.field1573[var30.field2838 ? 1 : 0].method341(class9.field68 + var26, class132.field2449 + var25);
            }
            if (class142.field2651 != null) {
                class142.field2651[var30.field2829 + (var30.field2838 ? class142.field2651.length / 2 : 0)].method270(class9.field68 + var26 + 29, class132.field2449 + var25);
            }
            arg6.method1598(class98.method727(-229, var30.field2832), class9.field68 - (-var26 - 15), class132.field2449 + var25 + 5 - -(var15 / 2), 0, -1);
            arg3.method1598(var31, class9.field68 + var26 + 60, class132.field2449 - -(var15 / 2) + var25 + 5, 268435455, -1);
            var25 += var22 + var15;
            var27++;
            if (var27 >= var17) {
                var26 += var16 + var21;
                var27 = 0;
                var25 = var24 + 23;
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
    public static final void method566(int arg0) {
        class182.field3318 = arg0;
        for (int var1 = 0; var1 < class109.field2091; var1++) {
            for (int var2 = 0; var2 < class146.field2694; var2++) {
                if (class158.field2935[arg0][var1][var2] == null) {
                    class158.field2935[arg0][var1][var2] = new class217(arg0, var1, var2);
                }
            }
        }
    }
}
