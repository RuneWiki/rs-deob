import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class class69 {

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Ljd;")
    public static class265 field1101 = new class265(64);

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Ljd;")
    public static class265 field1103 = new class265(64);

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "[I")
    public static int[] field1108 = new int[2];

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "Lsc;")
    public static class181 field1109 = class149.method967(255, "cookieprefix");

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "[Lbh;")
    public static class19[] field1112 = new class19[6];

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "Ljb;")
    public static class11 field1104;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "Ldg;")
    public static class90 field1111;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lgd;IZ)V")
    public static final void method479(class228 arg0, int arg1, boolean arg2) {
        field1099++;
        int var3 = arg0.field3913;
        int var4 = (int) arg0.field606;
        arg0.method290((byte) -48);
        if (arg2) {
            class247.method1692(var3, -24304);
        }
        if (arg1 != -9050) {
            field1101 = null;
        }
        class78.method546(var3, 0);
        class175 var5 = class52.method394(var4, false);
        if (var5 != null) {
            class218.method1453((byte) -90, var5);
        }
        class131.field2177 = 0;
        class33.field534 = false;
        class191.method1318(class64.field1002, class8.field154, class250.field4360, class265.field4621, -110);
        if (class243.field4227 != -1) {
            class51.method380(1, 1, class243.field4227);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZZ)V")
    public static final void method480(boolean arg0, boolean arg1) {
        class183.field3214 = arg0;
        field1106++;
        if (!arg1) {
            field1108 = null;
        }
        if (!class183.field3214) {
            int var2 = class76.field1223.method1554(0);
            int var3 = class76.field1223.method1548(-100001);
            int var4 = class76.field1223.method1554(0);
            int var5 = (class108.field1772 - class76.field1223.field3933) / 16;
            class162.field2767 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class162.field2767[var6][var14] = class76.field1223.method1531((byte) -43);
                }
            }
            int var7 = class76.field1223.method1539(-24286);
            int var8 = class76.field1223.method1548(-100001);
            class264.field4585 = null;
            class184.field3266 = new byte[var5][];
            class78.field1264 = new int[var5];
            boolean var9 = false;
            class120.field1955 = new int[var5];
            class129.field2128 = new int[var5];
            class47.field735 = null;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && var4 / 8 == 48) {
                var9 = true;
            }
            class121.field1989 = new byte[var5][];
            if ((var3 / 8) == 48 && var4 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var3 - 6) / 8; var11 <= ((var3 + 6) / 8); var11++) {
                for (int var12 = (var4 - 6) / 8; var12 <= ((var4 + 6) / 8); var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (var9 && var12 == 49 || var12 == 149 || var12 == 147 || var11 == 50 || !(var11 != 49 || var12 != 47)) {
                        class78.field1264[var10] = var13;
                        class120.field1955[var10] = -1;
                        class129.field2128[var10] = -1;
                    } else {
                        class78.field1264[var10] = var13;
                        class120.field1955[var10] = class90.field1435.method107(class175.method1164(new class181[] { client.field2694, class169.method1119((byte) -107, var11), class77.field1253, class169.method1119((byte) 42, var12) }, (byte) 126), 127);
                        class129.field2128[var10] = class90.field1435.method107(class175.method1164(new class181[] { class248.field4326, class169.method1119((byte) -113, var11), class77.field1253, class169.method1119((byte) -114, var12) }, (byte) 124), -57);
                    }
                    var10++;
                }
            }
            class74.method517(var4, var2, var7, (byte) 25, var3, false, var8);
            return;
        }
        int var15 = class76.field1223.method1535(2);
        int var16 = class76.field1223.method1535(2);
        int var17 = class76.field1223.method1558((byte) -98);
        int var18 = class76.field1223.method1539(-24286);
        int var19 = class76.field1223.method1554(0);
        class76.field1223.method545(true);
        for (int var20 = 0; var20 < 4; var20++) {
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = class76.field1223.method548(1, (byte) 67);
                    if (var37 == 1) {
                        class27.field466[var20][var35][var36] = class76.field1223.method548(26, (byte) 67);
                    } else {
                        class27.field466[var20][var35][var36] = -1;
                    }
                }
            }
        }
        class76.field1223.method542(108);
        int var21 = (class108.field1772 - class76.field1223.field3933) / 16;
        class162.field2767 = new int[var21][4];
        for (int var22 = 0; var22 < var21; var22++) {
            for (int var34 = 0; var34 < 4; var34++) {
                class162.field2767[var22][var34] = class76.field1223.method1566((byte) -68);
            }
        }
        class264.field4585 = null;
        class184.field3266 = new byte[var21][];
        class78.field1264 = new int[var21];
        class47.field735 = null;
        class129.field2128 = new int[var21];
        class121.field1989 = new byte[var21][];
        class120.field1955 = new int[var21];
        int var23 = 0;
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    int var27 = class27.field466[var24][var25][var26];
                    if (var27 != -1) {
                        int var28 = var27 >> 3 & 0x7FF;
                        int var29 = (var27 & 0xFFF58B) >> 14;
                        int var30 = (var29 / 8 << 8) + var28 / 8;
                        for (int var31 = 0; var31 < var23; var31++) {
                            if (class78.field1264[var31] == var30) {
                                var30 = -1;
                                break;
                            }
                        }
                        if (var30 != -1) {
                            class78.field1264[var23] = var30;
                            int var32 = (var30 & 0xFF55) >> 8;
                            int var33 = var30 & 0xFF;
                            class120.field1955[var23] = class90.field1435.method107(class175.method1164(new class181[] { client.field2694, class169.method1119((byte) -128, var32), class77.field1253, class169.method1119((byte) -112, var33) }, (byte) 127), 124);
                            class129.field2128[var23] = class90.field1435.method107(class175.method1164(new class181[] { class248.field4326, class169.method1119((byte) -112, var32), class77.field1253, class169.method1119((byte) 125, var33) }, (byte) 123), -71);
                            var23++;
                        }
                    }
                }
            }
        }
        class74.method517(var19, var17, var18, (byte) -54, var15, false, var16);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static final void method481(int arg0) {
        class41.method289(arg0 ^ 0x2374);
        class107.method721(true);
        class166.method1108((byte) -36);
        field1097++;
        class5.method45(50);
        class177.method1180(arg0 ^ 0x4E);
        if (arg0 != 49) {
            return;
        }
        class78.method543(65);
        class242.method1643(556);
        class91.method608(-10);
        class175.method1174(10359);
        class188.method1302((byte) 60);
        class235.method1612(true);
        class65.method464(0);
        class113.method748((byte) -118);
        class128.method825(0);
        class148.field2473.method1798(-72);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
    public abstract void method482(int arg0, int arg1);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
    public abstract void method483(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljb;ILjb;II)Lpe;")
    public static final class245 method484(class11 arg0, int arg1, class11 arg2, int arg3, int arg4) {
        field1107++;
        if (arg3 >= -70) {
            return null;
        } else if (class242.method1646(arg4, (byte) -64, arg2, arg1)) {
            return class262.method1780((byte) -124, arg0.method89(arg1, arg4, 103));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
    public static void method485(boolean arg0) {
        if (arg0) {
            return;
        }
        field1112 = null;
        field1103 = null;
        field1111 = null;
        field1104 = null;
        field1108 = null;
        field1109 = null;
        field1101 = null;
    }
}
