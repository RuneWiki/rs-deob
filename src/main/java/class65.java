import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class65 extends class69 {

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public int field1100 = -1;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    public int field1105 = 0;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public static int field1099 = 0;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "Z")
    public static boolean field1102 = true;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field1101 = 3353893;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "I")
    public static int field1111 = 3;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public int field1091;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public int field1092;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public int field1094;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    public int field1109;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "I")
    public int field1112;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Z")
    public static boolean field1089;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(BI)V")
    public static final void method450(byte arg0, int arg1) {
        if (arg0 > -90) {
            field1111 = 118;
        }
        field1106++;
        class146 var2 = class6.method22((byte) 16, 4, arg1);
        var2.method1082((byte) -120);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lha;I)V")
    public static final void method451(class46 arg0, int arg1) {
        field1104++;
        if (arg1 != -23885) {
            return;
        }
        int var2 = class178.method1273((byte) 55, arg0);
        if (var2 == -1) {
            return;
        }
        class26.field521 = class163.field2914.field4234[var2] - class194.field3493;
        int var3 = class26.field521 - (int) ((float) class188.field3350.field468 / class45.field746);
        class146.field2644 = class49.field836 + class232.field4039 - class163.field2914.field4237[var2] - 1;
        int var4 = class146.field2644 - ((int) ((float) class188.field3350.field341 / class45.field746));
        int var5 = class146.field2644 + ((int) ((float) class188.field3350.field341 / class45.field746));
        int var6 = (int) ((float) class188.field3350.field468 / class45.field746) + class26.field521;
        if (var3 < 0) {
            class26.field521 = (int) ((float) class188.field3350.field468 / class45.field746);
        }
        if (var4 < 0) {
            class146.field2644 = (int) ((float) class188.field3350.field341 / class45.field746);
        }
        if (var6 > class137.field2474) {
            class26.field521 = class137.field2474 - ((int) ((float) class188.field3350.field468 / class45.field746));
        }
        if (var5 > class49.field836) {
            class146.field2644 = class49.field836 - (int) ((float) class188.field3350.field341 / class45.field746);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method452(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1107++;
        int var8 = -21 / ((arg1 - 41) / 36);
        if (arg6 < 1 || arg4 < 1 || arg6 > 102 || arg4 > 102) {
            return;
        }
        if (!class180.method1291(2047) && (class111.field2081[0][arg6][arg4] & 0x2) == 0) {
            int var9 = arg2;
            if ((class111.field2081[arg2][arg6][arg4] & 0x8) != 0) {
                var9 = 0;
            }
            if (class243.field4321 != var9) {
                return;
            }
        }
        int var10 = arg2;
        if (arg2 < 3 && (class111.field2081[1][arg6][arg4] & 0x2) == 2) {
            var10 = arg2 + 1;
        }
        class277.method1866(class183.field3282[arg2], 2, arg2, var10, arg6, arg4, arg3);
        if (arg7 < 0) {
            return;
        }
        boolean var11 = class268.field4631;
        class268.field4631 = true;
        class261.method1748(arg6, arg5, arg0, arg2, var10, class183.field3282[arg2], arg7, arg4, false, 22, false);
        class268.field4631 = var11;
        return;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[B)Lwg;")
    public static final class22 method453(int arg0, byte[] arg1) {
        field1110++;
        if (arg0 != -31) {
            field1101 = 22;
        }
        if (arg1 == null) {
            return null;
        } else {
            class256 var2 = new class256(arg1, class56.field939, class215.field3816, class219.field3858, class118.field2209, class273.field4765);
            class242.method1661(arg0 + 29751);
            return var2;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public static final void method454(int arg0) {
        if (arg0 >= -73) {
            return;
        }
        field1095++;
        if (class144.field2622 != null || class259.field4517 != null) {
            return;
        }
        int var1 = class71.field1270;
        if (class222.field3910) {
            if (var1 != 1) {
                int var2 = class208.field3735;
                int var3 = class7.field116;
                if (var3 < (class187.field3345 - 10) || var3 > class248.field4378 + class187.field3345 + 10 || var2 < (class109.field2062 - 10) || class109.field2062 + class270.field4707 + 10 < var2) {
                    class222.field3910 = false;
                    class109.method861(0, class187.field3345, class270.field4707, class109.field2062, class248.field4378);
                }
            }
            if (var1 == 1) {
                int var4 = class187.field3345;
                int var5 = class109.field2062;
                int var6 = class248.field4378;
                int var7 = class100.field1850;
                int var8 = class143.field2607;
                int var9 = -1;
                for (int var10 = 0; var10 < class242.field4290; var10++) {
                    int var11 = (class242.field4290 - var10 - 1) * 15 + var5 + 31;
                    if (var7 > var4 && var4 + var6 > var7 && var11 - 13 < var8 && var8 < var11 + 3) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class202.method1434(var9, true);
                }
                class222.field3910 = false;
                class109.method861(0, class187.field3345, class270.field4707, class109.field2062, class248.field4378);
                return;
            }
            return;
        }
        if (var1 == 1 && class242.field4290 > 0) {
            short var12 = class215.field3807[class242.field4290 - 1];
            if (var12 == 2 || var12 == 50 || var12 == 59 || var12 == 20 || var12 == 39 || var12 == 16 || var12 == 38 || var12 == 22 || var12 == 30 || var12 == 5 || var12 == 8 || var12 == 1007) {
                int var13 = class270.field4706[class242.field4290 - 1];
                int var14 = class4.field69[class242.field4290 - 1];
                class24 var15 = class13.method73(1506528624, var14);
                if (class239.method1644(client.method1811(var15), false) || class107.method835(0, client.method1811(var15))) {
                    class16.field244 = false;
                    class196.field3505 = 0;
                    if (class144.field2622 != null) {
                        class226.method1549(false, class144.field2622);
                    }
                    class144.field2622 = class13.method73(1506528624, var14);
                    class4.field76 = var13;
                    class57.field957 = class143.field2607;
                    class43.field733 = class100.field1850;
                    class226.method1549(false, class144.field2622);
                    return;
                }
            }
        }
        if (var1 == 1 && (class257.field4476 == 1 && class242.field4290 > 2 || class43.method290(8, class242.field4290 - 1))) {
            var1 = 2;
        }
        if (var1 == 2 && class242.field4290 > 0 || class20.field267 == 1) {
            class150.method1104(2);
        }
        if ((var1 != 1 || class242.field4290 <= 0) && class20.field267 != 2) {
            return;
        }
        class221.method1529(0);
    }
}
