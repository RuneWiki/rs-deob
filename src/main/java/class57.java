import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class57 extends class141 {

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "Lkd;")
    private static class73 field1510 = class126.method1070((byte) -66, "To create a new account you need to");

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "Lkd;")
    public static class73 field1513 = class126.method1070((byte) -66, "sideicons");

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
    public static int field1512 = 0;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    public static int field1519 = 2;

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "Lkd;")
    public static class73 field1520 = class126.method1070((byte) -66, "(U2");

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "Lkd;")
    public static class73 field1511 = null;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "Lkd;")
    public static class73 field1527 = class126.method1070((byte) -66, "(U1");

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
    public static int field1529 = -1;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "Lkd;")
    public static class73 field1521 = field1510;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    public int field1523;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public int field1524;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "Lq;")
    public static class111 field1514;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "Lbc;")
    public static class11 field1516;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "[I")
    public int[] field1509;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "[I")
    private static int[] field1517;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "[I")
    public int[] field1518;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "[I")
    public int[] field1522;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "[Lde;")
    public static class27[] field1531;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "[Ljc;")
    public class65[] field1515;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "[Ljc;")
    public class65[] field1528;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "[[[B")
    public byte[][][] field1526;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([Ljava/lang/Object;IBLa;ILa;I)V")
    public static final void method490(Object[] arg0, int arg1, byte arg2, class1 arg3, int arg4, class1 arg5, int arg6) {
        field1530++;
        int var7 = (Integer) arg0[0];
        class60 var8 = class43.method323(var7, false);
        if (var8 == null) {
            return;
        }
        int var9 = 0;
        int var10 = -1;
        int var11 = 0;
        int[] var12 = var8.field1564;
        int[] var13 = var8.field1571;
        byte var14 = -1;
        try {
            field1517 = new int[var8.field1586];
            class114.field2868 = new class73[var8.field1577];
            if (arg2 != 78) {
                field1527 = null;
            }
            int var15 = 0;
            int var16 = 0;
            for (int var17 = 1; var17 < arg0.length; var17++) {
                if (arg0[var17] instanceof Integer) {
                    int var18 = (Integer) arg0[var17];
                    if (var18 == -2147483647) {
                        var18 = arg6;
                    }
                    if (var18 == -2147483646) {
                        var18 = arg4;
                    }
                    if (var18 == -2147483645) {
                        var18 = arg5 == null ? -1 : arg5.field45;
                    }
                    if (var18 == -2147483644) {
                        var18 = arg1;
                    }
                    if (var18 == -2147483643) {
                        var18 = arg5 == null ? -1 : arg5.field1;
                    }
                    if (var18 == -2147483642) {
                        var18 = arg3 == null ? -1 : arg3.field45;
                    }
                    if (var18 == -2147483641) {
                        var18 = arg3 == null ? -1 : arg3.field1;
                    }
                    field1517[var16++] = var18;
                } else if (arg0[var17] instanceof class73) {
                    class114.field2868[var15++] = (class73) arg0[var17];
                }
            }
            int var19 = 0;
            label1414: while (true) {
                var19++;
                if (var19 > 200000) {
                    throw new RuntimeException("slow");
                }
                var10++;
                int var201 = var12[var10];
                if (var201 < 100) {
                    if (var201 == 0) {
                        class36.field970[var9++] = var13[var10];
                        continue;
                    }
                    if (var201 == 1) {
                        int var20 = var13[var10];
                        class36.field970[var9++] = class48.field1299[var20];
                        continue;
                    }
                    if (var201 == 2) {
                        int var21 = var13[var10];
                        var9--;
                        class48.field1299[var21] = class36.field970[var9];
                        continue;
                    }
                    if (var201 == 3) {
                        class61.field1611[var11++] = var8.field1587[var10];
                        continue;
                    }
                    if (var201 == 6) {
                        var10 += var13[var10];
                        continue;
                    }
                    if (var201 == 7) {
                        var9 -= 2;
                        if (class36.field970[var9 + 1] != class36.field970[var9]) {
                            var10 += var13[var10];
                        }
                        continue;
                    }
                    if (var201 == 8) {
                        var9 -= 2;
                        if (class36.field970[var9 + 1] == class36.field970[var9]) {
                            var10 += var13[var10];
                        }
                        continue;
                    }
                    if (var201 == 9) {
                        var9 -= 2;
                        if (class36.field970[var9 + 1] > class36.field970[var9]) {
                            var10 += var13[var10];
                        }
                        continue;
                    }
                    if (var201 == 10) {
                        var9 -= 2;
                        if (class36.field970[var9 + 1] < class36.field970[var9]) {
                            var10 += var13[var10];
                        }
                        continue;
                    }
                    if (var201 == 21) {
                        if (class63.field1662 == 0) {
                            return;
                        }
                        class125 var22 = class62.field1619[--class63.field1662];
                        var10 = var22.field3170;
                        field1517 = var22.field3178;
                        class114.field2868 = var22.field3163;
                        var8 = var22.field3167;
                        var13 = var8.field1571;
                        var12 = var8.field1564;
                        continue;
                    }
                    if (var201 == 25) {
                        int var23 = var13[var10];
                        class36.field970[var9++] = class20.method166(var23, (byte) 1);
                        continue;
                    }
                    if (var201 == 27) {
                        int var24 = var13[var10];
                        var9--;
                        class146.method1166((byte) -97, var24, class36.field970[var9]);
                        continue;
                    }
                    if (var201 == 31) {
                        var9 -= 2;
                        if (class36.field970[var9] <= class36.field970[var9 + 1]) {
                            var10 += var13[var10];
                        }
                        continue;
                    }
                    if (var201 == 32) {
                        var9 -= 2;
                        if (class36.field970[var9] >= class36.field970[var9 + 1]) {
                            var10 += var13[var10];
                        }
                        continue;
                    }
                    if (var201 == 33) {
                        class36.field970[var9++] = field1517[var13[var10]];
                        continue;
                    }
                    int var10001;
                    if (var201 == 34) {
                        var10001 = var13[var10];
                        var9--;
                        field1517[var10001] = class36.field970[var9];
                        continue;
                    }
                    if (var201 == 35) {
                        class61.field1611[var11++] = class114.field2868[var13[var10]];
                        continue;
                    }
                    if (var201 == 36) {
                        var10001 = var13[var10];
                        var11--;
                        class114.field2868[var10001] = class61.field1611[var11];
                        continue;
                    }
                    if (var201 == 37) {
                        int var25 = var13[var10];
                        var11 -= var25;
                        class73 var26 = class19.method157(class61.field1611, var25, (byte) -68, var11);
                        class61.field1611[var11++] = var26;
                        continue;
                    }
                    if (var201 == 38) {
                        var9--;
                        continue;
                    }
                    if (var201 == 39) {
                        var11--;
                        continue;
                    }
                    if (var201 == 40) {
                        int var27 = var13[var10];
                        class60 var28 = class43.method323(var27, false);
                        int[] var29 = new int[var28.field1586];
                        class73[] var30 = new class73[var28.field1577];
                        for (int var31 = 0; var31 < var28.field1590; var31++) {
                            var29[var31] = class36.field970[var9 + var31 - var28.field1590];
                        }
                        for (int var32 = 0; var32 < var28.field1568; var32++) {
                            var30[var32] = class61.field1611[var32 + var11 - var28.field1568];
                        }
                        var11 -= var28.field1568;
                        var9 -= var28.field1590;
                        class125 var33 = new class125();
                        var33.field3163 = class114.field2868;
                        var33.field3167 = var8;
                        var33.field3170 = var10;
                        var10 = -1;
                        var33.field3178 = field1517;
                        var8 = var28;
                        class62.field1619[class63.field1662++] = var33;
                        field1517 = var29;
                        var13 = var28.field1571;
                        var12 = var28.field1564;
                        class114.field2868 = var30;
                        continue;
                    }
                    if (var201 == 42) {
                        class36.field970[var9++] = class115.field2909[var13[var10]];
                        continue;
                    }
                    if (var201 == 43) {
                        var10001 = var13[var10];
                        var9--;
                        class115.field2909[var10001] = class36.field970[var9];
                        continue;
                    }
                    if (var201 == 44) {
                        int var34 = var13[var10] >> 16;
                        int var35 = var13[var10] & 0xFFFF;
                        var9--;
                        int var36 = class36.field970[var9];
                        if (var36 >= 0 && var36 <= 5000) {
                            class109.field2685[var34] = var36;
                            byte var37 = -1;
                            if (var35 == 105) {
                                var37 = 0;
                            }
                            int var38 = 0;
                            while (true) {
                                if (var36 <= var38) {
                                    continue label1414;
                                }
                                class60.field1580[var34][var38] = var37;
                                var38++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var201 == 45) {
                        var9--;
                        int var39 = class36.field970[var9];
                        int var40 = var13[var10];
                        if (var39 >= 0 && var39 < class109.field2685[var40]) {
                            class36.field970[var9++] = class60.field1580[var40][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var201 == 46) {
                        var9 -= 2;
                        int var41 = var13[var10];
                        int var42 = class36.field970[var9];
                        if (var42 >= 0 && class109.field2685[var41] > var42) {
                            class60.field1580[var41][var42] = class36.field970[var9 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                }
                boolean var43;
                if (var13[var10] == 1) {
                    var43 = true;
                } else {
                    var43 = false;
                }
                if (var201 < 1000) {
                    if (var201 == 100) {
                        var9 -= 3;
                        int var44 = class36.field970[var9];
                        int var45 = class36.field970[var9 + 1];
                        int var46 = class36.field970[var9 + 2];
                        if (var45 == 0) {
                            throw new RuntimeException();
                        }
                        class1 var47 = class45.method335(var44, arg2 - 141);
                        if (var47.field126 == null) {
                            var47.field126 = new class1[var46 + 1];
                        }
                        if (var47.field126.length <= var46) {
                            class1[] var48 = new class1[var46 + 1];
                            for (int var49 = 0; var49 < var47.field126.length; var49++) {
                                var48[var49] = var47.field126[var49];
                            }
                            var47.field126 = var48;
                        }
                        if (var46 > 0 && var47.field126[var46 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var46 - 1));
                        }
                        class1 var50 = new class1();
                        var50.field101 = var50.field45 = var47.field45;
                        var50.field81 = var45;
                        var50.field1 = var46;
                        var50.field98 = true;
                        var47.field126[var46] = var50;
                        if (var43) {
                            class145.field3588 = var50;
                        } else {
                            class39.field1066 = var50;
                        }
                        class1.method14(var47, 1856980336);
                        continue;
                    }
                    if (var201 == 101) {
                        class1 var51 = var43 ? class145.field3588 : class39.field1066;
                        class1 var52 = class45.method335(var51.field45, arg2 - 185);
                        var52.field126[var51.field1] = null;
                        class1.method14(var52, 1856980336);
                        continue;
                    }
                    if (var201 == 102) {
                        var9--;
                        class1 var53 = class45.method335(class36.field970[var9], -59);
                        var53.field126 = null;
                        class1.method14(var53, 1856980336);
                        continue;
                    }
                    if (var201 == 200) {
                        var9 -= 2;
                        int var54 = class36.field970[var9];
                        int var55 = class36.field970[var9 + 1];
                        class1 var56 = class34.method269(var54, false, var55);
                        if (var56 != null && var55 != -1) {
                            class36.field970[var9++] = 1;
                            if (var43) {
                                class145.field3588 = var56;
                            } else {
                                class39.field1066 = var56;
                            }
                            continue;
                        }
                        class36.field970[var9++] = 0;
                        continue;
                    }
                } else if (var201 >= 1000 && var201 < 1100 || var201 >= 2000 && var201 < 2100) {
                    class1 var57;
                    if (var201 < 2000) {
                        var57 = var43 ? class145.field3588 : class39.field1066;
                    } else {
                        var201 -= 1000;
                        var9--;
                        var57 = class45.method335(class36.field970[var9], -71);
                    }
                    class1.method14(var57, 1856980336);
                    if (var201 == 1000) {
                        var9 -= 2;
                        var57.field60 = class36.field970[var9];
                        var57.field115 = class36.field970[var9 + 1];
                        continue;
                    }
                    if (var201 == 1001) {
                        var9 -= 2;
                        var57.field96 = class36.field970[var9];
                        var57.field63 = class36.field970[var9 + 1];
                        continue;
                    }
                    if (var201 == 1003) {
                        var9--;
                        var57.field23 = class36.field970[var9] == 1;
                        continue;
                    }
                } else if (var201 >= 1100 && var201 < 1200 || var201 >= 2100 && var201 < 2200) {
                    class1 var58;
                    if (var201 >= 2000) {
                        var201 -= 1000;
                        var9--;
                        var58 = class45.method335(class36.field970[var9], arg2 - 139);
                    } else {
                        var58 = var43 ? class145.field3588 : class39.field1066;
                    }
                    class1.method14(var58, 1856980336);
                    if (var201 == 1100) {
                        var9 -= 2;
                        var58.field73 = class36.field970[var9];
                        if (var58.field73 > var58.field116 - var58.field96) {
                            var58.field73 = var58.field116 - var58.field96;
                        }
                        if (var58.field73 < 0) {
                            var58.field73 = 0;
                        }
                        var58.field86 = class36.field970[var9 + 1];
                        if (var58.field86 > var58.field93 - var58.field63) {
                            var58.field86 = var58.field93 - var58.field63;
                        }
                        if (var58.field86 < 0) {
                            var58.field86 = 0;
                        }
                        continue;
                    }
                    if (var201 == 1101) {
                        var9--;
                        var58.field111 = class36.field970[var9];
                        continue;
                    }
                    if (var201 == 1102) {
                        var9--;
                        var58.field32 = class36.field970[var9] == 1;
                        continue;
                    }
                    if (var201 == 1103) {
                        var9--;
                        var58.field89 = class36.field970[var9];
                        continue;
                    }
                    if (var201 == 1104) {
                        var9--;
                        var58.field53 = class36.field970[var9];
                        continue;
                    }
                    if (var201 == 1105) {
                        var9--;
                        var58.field44 = class36.field970[var9];
                        continue;
                    }
                    if (var201 == 1106) {
                        var9--;
                        var58.field119 = class36.field970[var9];
                        continue;
                    }
                    if (var201 == 1107) {
                        var9--;
                        var58.field123 = class36.field970[var9] == 1;
                        continue;
                    }
                    if (var201 == 1108) {
                        var58.field95 = 1;
                        var9--;
                        var58.field39 = class36.field970[var9];
                        continue;
                    }
                    if (var201 == 1109) {
                        var9 -= 6;
                        var58.field121 = class36.field970[var9];
                        var58.field42 = class36.field970[var9 + 1];
                        var58.field19 = class36.field970[var9 + 2];
                        var58.field78 = class36.field970[var9 + 3];
                        var58.field40 = class36.field970[var9 + 4];
                        var58.field77 = class36.field970[var9 + 5];
                        continue;
                    }
                    if (var201 == 1110) {
                        var9--;
                        var58.field51 = class36.field970[var9];
                        continue;
                    }
                    if (var201 == 1111) {
                        var9--;
                        var58.field129 = class36.field970[var9] == 1;
                        continue;
                    }
                    if (var201 == 1112) {
                        var11--;
                        var58.field29 = class61.field1611[var11];
                        continue;
                    }
                    if (var201 == 1113) {
                        var9--;
                        var58.field5 = class36.field970[var9];
                        continue;
                    }
                    if (var201 == 1114) {
                        var9 -= 3;
                        var58.field22 = class36.field970[var9];
                        var58.field127 = class36.field970[var9 + 1];
                        var58.field21 = class36.field970[var9 + 2];
                        continue;
                    }
                    if (var201 == 1115) {
                        var9--;
                        var58.field94 = class36.field970[var9] == 1;
                        continue;
                    }
                    if (var201 == 1116) {
                        var9--;
                        var58.field33 = class36.field970[var9];
                        continue;
                    }
                    if (var201 == 1117) {
                        var9--;
                        var58.field103 = class36.field970[var9];
                        continue;
                    }
                    if (var201 == 1118) {
                        var9--;
                        var58.field110 = class36.field970[var9] == 1;
                        continue;
                    }
                    if (var201 == 1119) {
                        var9--;
                        var58.field83 = class36.field970[var9] == 1;
                        continue;
                    }
                    if (var201 == 1120) {
                        var9 -= 2;
                        var58.field116 = class36.field970[var9];
                        var58.field93 = class36.field970[var9 + 1];
                        continue;
                    }
                } else if (var201 >= 1200 && var201 < 1300 || !(var201 < 2200 || var201 >= 2300)) {
                    class1 var195;
                    if (var201 >= 2000) {
                        var201 -= 1000;
                        var9--;
                        var195 = class45.method335(class36.field970[var9], -112);
                    } else {
                        var195 = var43 ? class145.field3588 : class39.field1066;
                    }
                    class1.method14(var195, 1856980336);
                    if (var201 == 1200) {
                        var9 -= 2;
                        int var196 = class36.field970[var9];
                        int var197 = class36.field970[var9 + 1];
                        var195.field90 = var196;
                        var195.field3 = var197;
                        class126 var198 = class9.method86(var196, (byte) -126);
                        var195.field121 = var198.field3208;
                        var195.field77 = var198.field3199;
                        var195.field78 = var198.field3219;
                        var195.field42 = var198.field3224;
                        var195.field19 = var198.field3196;
                        var195.field40 = var198.field3215;
                        if (var195.field96 > 0) {
                            var195.field77 = var195.field77 * 32 / var195.field96;
                        }
                        continue;
                    }
                    if (var201 == 1201) {
                        var195.field95 = 2;
                        var9--;
                        var195.field39 = class36.field970[var9];
                        continue;
                    }
                    if (var201 == 1202) {
                        var195.field95 = 3;
                        var195.field39 = class73.field1901.field3014.method430((byte) -52);
                        continue;
                    }
                } else if (var201 >= 1300 && var201 < 1400 || var201 >= 2300 && var201 < 2400) {
                    class1 var191;
                    if (var201 >= 2000) {
                        var9--;
                        var191 = class45.method335(class36.field970[var9], -105);
                        var201 -= 1000;
                    } else {
                        var191 = var43 ? class145.field3588 : class39.field1066;
                    }
                    if (var201 == 1300) {
                        var9--;
                        int var192 = class36.field970[var9] - 1;
                        if (var192 >= 0 && var192 <= 9) {
                            var11--;
                            var191.method3((byte) -57, class61.field1611[var11], var192);
                            continue;
                        }
                        var11--;
                        continue;
                    }
                    if (var201 == 1301) {
                        var9 -= 2;
                        int var193 = class36.field970[var9];
                        int var194 = class36.field970[var9 + 1];
                        var191.field9 = class34.method269(var193, false, var194);
                        continue;
                    }
                    if (var201 == 1302) {
                        var9--;
                        var191.field64 = class36.field970[var9] == 1;
                        continue;
                    }
                    if (var201 == 1303) {
                        var9--;
                        var191.field41 = class36.field970[var9];
                        continue;
                    }
                    if (var201 == 1304) {
                        var9--;
                        var191.field38 = class36.field970[var9];
                        continue;
                    }
                    if (var201 == 1305) {
                        var11--;
                        var191.field99 = class61.field1611[var11];
                        continue;
                    }
                    if (var201 == 1306) {
                        var11--;
                        var191.field113 = class61.field1611[var11];
                        continue;
                    }
                } else {
                    if (var201 >= 1400 && var201 < 1500 || var201 >= 2400 && var201 < 2500) {
                        class1 var186;
                        if (var201 >= 2000) {
                            var9--;
                            var186 = class45.method335(class36.field970[var9], -120);
                            var201 -= 1000;
                        } else {
                            var186 = var43 ? class145.field3588 : class39.field1066;
                        }
                        var11--;
                        class73 var187 = class61.field1611[var11];
                        Object[] var188 = new Object[var187.method632((byte) -74) + 1];
                        for (int var189 = var188.length - 1; var189 >= 1; var189--) {
                            if (var187.method624(var189 - 1, false) == 115) {
                                var11--;
                                var188[var189] = class61.field1611[var11];
                            } else {
                                var9--;
                                var188[var189] = Integer.valueOf(class36.field970[var9]);
                            }
                        }
                        var9--;
                        int var190 = class36.field970[var9];
                        if (var190 == -1) {
                            var188 = null;
                        } else {
                            var188[0] = Integer.valueOf(var190);
                        }
                        if (var201 == 1410) {
                            var186.field76 = var188;
                        }
                        if (var201 == 1400) {
                            var186.field46 = var188;
                        }
                        if (var201 == 1401) {
                            var186.field12 = var188;
                        }
                        if (var201 == 1407) {
                            var186.field66 = var188;
                        }
                        if (var201 == 1413) {
                            var186.field57 = var188;
                        }
                        if (var201 == 1403) {
                            var186.field55 = var188;
                        }
                        if (var201 == 1406) {
                            var186.field117 = var188;
                        }
                        var186.field112 = true;
                        if (var201 == 1415) {
                            var186.field52 = var188;
                        }
                        if (var201 == 1414) {
                            var186.field7 = var188;
                        }
                        if (var201 == 1411) {
                            var186.field2 = var188;
                        }
                        if (var201 == 1408) {
                            var186.field14 = var188;
                        }
                        if (var201 == 1409) {
                            var186.field87 = var188;
                        }
                        if (var201 == 1405) {
                            var186.field18 = var188;
                        }
                        if (var201 == 1404) {
                            var186.field49 = var188;
                        }
                        if (var201 == 1417) {
                            var186.field118 = var188;
                        }
                        if (var201 == 1402) {
                            var186.field131 = var188;
                        }
                        if (var201 == 1416) {
                            var186.field75 = var188;
                        }
                        if (var201 == 1412) {
                            var186.field69 = var188;
                        }
                        continue;
                    }
                    if (var201 < 1600) {
                        class1 var59 = var43 ? class145.field3588 : class39.field1066;
                        if (var201 == 1500) {
                            class36.field970[var9++] = var59.field60;
                            continue;
                        }
                        if (var201 == 1501) {
                            class36.field970[var9++] = var59.field115;
                            continue;
                        }
                        if (var201 == 1502) {
                            class36.field970[var9++] = var59.field96;
                            continue;
                        }
                        if (var201 == 1503) {
                            class36.field970[var9++] = var59.field63;
                            continue;
                        }
                        if (var201 == 1504) {
                            class36.field970[var9++] = var59.field23 ? 1 : 0;
                            continue;
                        }
                        if (var201 == 1505) {
                            class36.field970[var9++] = var59.field101;
                            continue;
                        }
                    } else if (var201 < 1700) {
                        class1 var185 = var43 ? class145.field3588 : class39.field1066;
                        if (var201 == 1600) {
                            class36.field970[var9++] = var185.field73;
                            continue;
                        }
                        if (var201 == 1601) {
                            class36.field970[var9++] = var185.field86;
                            continue;
                        }
                        if (var201 == 1602) {
                            class61.field1611[var11++] = var185.field29;
                            continue;
                        }
                        if (var201 == 1603) {
                            class36.field970[var9++] = var185.field116;
                            continue;
                        }
                        if (var201 == 1604) {
                            class36.field970[var9++] = var185.field93;
                            continue;
                        }
                        if (var201 == 1605) {
                            class36.field970[var9++] = var185.field77;
                            continue;
                        }
                        if (var201 == 1606) {
                            class36.field970[var9++] = var185.field19;
                            continue;
                        }
                        if (var201 == 1607) {
                            class36.field970[var9++] = var185.field40;
                            continue;
                        }
                        if (var201 == 1608) {
                            class36.field970[var9++] = var185.field78;
                            continue;
                        }
                    } else if (var201 < 1800) {
                        class1 var184 = var43 ? class145.field3588 : class39.field1066;
                        if (var201 == 1700) {
                            class36.field970[var9++] = var184.field90;
                            continue;
                        }
                        if (var201 == 1701) {
                            if (var184.field90 == -1) {
                                class36.field970[var9++] = 0;
                            } else {
                                class36.field970[var9++] = var184.field3;
                            }
                            continue;
                        }
                        if (var201 == 1702) {
                            class36.field970[var9++] = var184.field1;
                            continue;
                        }
                    } else if (var201 < 1900) {
                        class1 var182 = var43 ? class145.field3588 : class39.field1066;
                        if (var201 == 1800) {
                            class36.field970[var9++] = class60.method503(class153.method1225(var182, class79.method679(arg2, -52)), (byte) 32);
                            continue;
                        }
                        if (var201 == 1801) {
                            var9--;
                            int var183 = class36.field970[var9];
                            if (var182.field134 != null && var182.field134.length > var183 && var182.field134[var183] != null) {
                                class61.field1611[var11++] = var182.field134[var183];
                                continue;
                            }
                            class61.field1611[var11++] = class145.field3595;
                            continue;
                        }
                        if (var201 == 1802) {
                            if (var182.field99 == null) {
                                class61.field1611[var11++] = class145.field3595;
                            } else {
                                class61.field1611[var11++] = var182.field99;
                            }
                            continue;
                        }
                    } else if (var201 < 2600) {
                        var9--;
                        class1 var181 = class45.method335(class36.field970[var9], -77);
                        if (var201 == 2500) {
                            class36.field970[var9++] = var181.field60;
                            continue;
                        }
                        if (var201 == 2501) {
                            class36.field970[var9++] = var181.field115;
                            continue;
                        }
                        if (var201 == 2502) {
                            class36.field970[var9++] = var181.field96;
                            continue;
                        }
                        if (var201 == 2503) {
                            class36.field970[var9++] = var181.field63;
                            continue;
                        }
                        if (var201 == 2504) {
                            class36.field970[var9++] = var181.field23 ? 1 : 0;
                            continue;
                        }
                        if (var201 == 2505) {
                            class36.field970[var9++] = var181.field101;
                            continue;
                        }
                    } else if (var201 < 2700) {
                        var9--;
                        class1 var60 = class45.method335(class36.field970[var9], -69);
                        if (var201 == 2600) {
                            class36.field970[var9++] = var60.field73;
                            continue;
                        }
                        if (var201 == 2601) {
                            class36.field970[var9++] = var60.field86;
                            continue;
                        }
                        if (var201 == 2602) {
                            class61.field1611[var11++] = var60.field29;
                            continue;
                        }
                        if (var201 == 2603) {
                            class36.field970[var9++] = var60.field116;
                            continue;
                        }
                        if (var201 == 2604) {
                            class36.field970[var9++] = var60.field93;
                            continue;
                        }
                        if (var201 == 2605) {
                            class36.field970[var9++] = var60.field77;
                            continue;
                        }
                        if (var201 == 2606) {
                            class36.field970[var9++] = var60.field19;
                            continue;
                        }
                        if (var201 == 2607) {
                            class36.field970[var9++] = var60.field40;
                            continue;
                        }
                        if (var201 == 2608) {
                            class36.field970[var9++] = var60.field78;
                            continue;
                        }
                    } else if (var201 < 2800) {
                        var9--;
                        class1 var61 = class45.method335(class36.field970[var9], -69);
                        if (var201 == 2700) {
                            class36.field970[var9++] = var61.field90;
                            continue;
                        }
                        if (var201 == 2701) {
                            if (var61.field90 == -1) {
                                class36.field970[var9++] = 0;
                            } else {
                                class36.field970[var9++] = var61.field3;
                            }
                            continue;
                        }
                    } else if (var201 < 2900) {
                        var9--;
                        class1 var179 = class45.method335(class36.field970[var9], -121);
                        if (var201 == 2800) {
                            class36.field970[var9++] = class60.method503(class153.method1225(var179, -128), (byte) 32);
                            continue;
                        }
                        if (var201 == 2801) {
                            var9--;
                            int var180 = class36.field970[var9];
                            if (var179.field134 != null && var180 < var179.field134.length && var179.field134[var180] != null) {
                                class61.field1611[var11++] = var179.field134[var180];
                                continue;
                            }
                            class61.field1611[var11++] = class145.field3595;
                            continue;
                        }
                        if (var201 == 2802) {
                            if (var179.field99 == null) {
                                class61.field1611[var11++] = class145.field3595;
                            } else {
                                class61.field1611[var11++] = var179.field99;
                            }
                            continue;
                        }
                    } else if (var201 < 3200) {
                        if (var201 == 3100) {
                            var11--;
                            class73 var177 = class61.field1611[var11];
                            class74.method647((byte) 18, class145.field3595, var177, 0);
                            continue;
                        }
                        if (var201 == 3101) {
                            var9 -= 2;
                            class123.method1046(class73.field1901, class36.field970[var9], arg2 ^ 0x37, class36.field970[var9 + 1]);
                            continue;
                        }
                        if (var201 == 3102) {
                            var9--;
                            int var178 = class36.field970[var9];
                            if (var178 >= 0 && class24.field683.length > var178 && class24.field683[var178] != -1) {
                                class149.field3666 = true;
                                class38.field1028 = true;
                                class141.field3523 = var178;
                            }
                            continue;
                        }
                        if (var201 == 3103) {
                            client.method181((byte) 3);
                            continue;
                        }
                    } else if (var201 < 3300) {
                        if (var201 == 3200) {
                            var9 -= 3;
                            class74.method649(class36.field970[var9], class36.field970[var9 + 1], class36.field970[var9 + 2], -116);
                            continue;
                        }
                        if (var201 == 3201) {
                            var9--;
                            class153.method1221(class36.field970[var9], -64);
                            continue;
                        }
                        if (var201 == 3202) {
                            var9 -= 2;
                            class53.method427(class36.field970[var9 + 1], 0, class36.field970[var9]);
                            continue;
                        }
                    } else if (var201 < 3400) {
                        if (var201 == 3300) {
                            class36.field970[var9++] = class49.field1308;
                            continue;
                        }
                        if (var201 == 3301) {
                            var9 -= 2;
                            int var155 = class36.field970[var9];
                            int var156 = class36.field970[var9 + 1];
                            class36.field970[var9++] = class21.method172(-26, var156, var155);
                            continue;
                        }
                        if (var201 == 3302) {
                            var9 -= 2;
                            int var157 = class36.field970[var9];
                            int var158 = class36.field970[var9 + 1];
                            class36.field970[var9++] = client.method178(var158, (byte) -109, var157);
                            continue;
                        }
                        if (var201 == 3303) {
                            var9 -= 2;
                            int var159 = class36.field970[var9 + 1];
                            int var160 = class36.field970[var9];
                            class36.field970[var9++] = class25.method199(class79.method679(arg2, -39), var160, var159);
                            continue;
                        }
                        if (var201 == 3304) {
                            var9--;
                            int var161 = class36.field970[var9];
                            class36.field970[var9++] = class76.method660(-10861, var161).field899;
                            continue;
                        }
                        if (var201 == 3305) {
                            var9--;
                            int var162 = class36.field970[var9];
                            class36.field970[var9++] = class1.field28[var162];
                            continue;
                        }
                        if (var201 == 3306) {
                            var9--;
                            int var163 = class36.field970[var9];
                            class36.field970[var9++] = class39.field1062[var163];
                            continue;
                        }
                        if (var201 == 3307) {
                            var9--;
                            int var164 = class36.field970[var9];
                            class36.field970[var9++] = class110.field2711[var164];
                            continue;
                        }
                        if (var201 == 3308) {
                            int var165 = (class73.field1901.field2264 >> 7) + class121.field3093;
                            int var166 = (class73.field1901.field2277 >> 7) + class80.field2029;
                            int var167 = class11.field320;
                            class36.field970[var9++] = (var167 << 28) - (-(var166 << 14) - var165);
                            continue;
                        }
                        if (var201 == 3309) {
                            var9--;
                            int var168 = class36.field970[var9];
                            class36.field970[var9++] = class149.method1189(16383, var168 >> 14);
                            continue;
                        }
                        if (var201 == 3310) {
                            var9--;
                            int var169 = class36.field970[var9];
                            class36.field970[var9++] = var169 >> 28;
                            continue;
                        }
                        if (var201 == 3311) {
                            var9--;
                            int var170 = class36.field970[var9];
                            class36.field970[var9++] = class149.method1189(16383, var170);
                            continue;
                        }
                        if (var201 == 3312) {
                            class36.field970[var9++] = class50.field1362 ? 1 : 0;
                            continue;
                        }
                        if (var201 == 3313) {
                            var9 -= 2;
                            int var171 = class36.field970[var9 + 1];
                            int var172 = class36.field970[var9] + 32768;
                            class36.field970[var9++] = class21.method172(-46, var171, var172);
                            continue;
                        }
                        if (var201 == 3314) {
                            var9 -= 2;
                            int var173 = class36.field970[var9] + 32768;
                            int var174 = class36.field970[var9 + 1];
                            class36.field970[var9++] = client.method178(var174, (byte) -109, var173);
                            continue;
                        }
                        if (var201 == 3315) {
                            var9 -= 2;
                            int var175 = class36.field970[var9] + 32768;
                            int var176 = class36.field970[var9 + 1];
                            class36.field970[var9++] = class25.method199(-118, var175, var176);
                            continue;
                        }
                    } else if (var201 < 3500) {
                        if (var201 == 3400) {
                            var9 -= 2;
                            int var145 = class36.field970[var9];
                            int var146 = class36.field970[var9 + 1];
                            class42 var147 = class150.method1202(var145, (byte) 115);
                            for (int var148 = 0; var148 < var147.field1109; var148++) {
                                if (var147.field1121[var148] == var146) {
                                    class61.field1611[var11++] = var147.field1116[var148];
                                    var147 = null;
                                    break;
                                }
                            }
                            if (var147 != null) {
                                class61.field1611[var11++] = var147.field1113;
                            }
                            continue;
                        }
                        if (var201 == 3408) {
                            var9 -= 4;
                            int var149 = class36.field970[var9];
                            int var150 = class36.field970[var9 + 2];
                            int var151 = class36.field970[var9 + 1];
                            int var152 = class36.field970[var9 + 3];
                            class42 var153 = class150.method1202(var150, (byte) -100);
                            if (var153.field1119 == var149 && var153.field1108 == var151) {
                                for (int var154 = 0; var154 < var153.field1109; var154++) {
                                    if (var153.field1121[var154] == var152) {
                                        if (var151 == 115) {
                                            class61.field1611[var11++] = var153.field1116[var154];
                                        } else {
                                            class36.field970[var9++] = var153.field1114[var154];
                                        }
                                        var153 = null;
                                        break;
                                    }
                                }
                                if (var153 != null) {
                                    if (var151 == 115) {
                                        class61.field1611[var11++] = var153.field1113;
                                    } else {
                                        class36.field970[var9++] = var153.field1115;
                                    }
                                }
                                continue;
                            }
                            if (var151 == 115) {
                                class61.field1611[var11++] = class99.field2496;
                            } else {
                                class36.field970[var9++] = 0;
                            }
                            continue;
                        }
                    } else if (var201 < 3700) {
                        if (var201 == 3600) {
                            if (class132.field3303 == 0) {
                                class36.field970[var9++] = -2;
                            } else if (class132.field3303 == 1) {
                                class36.field970[var9++] = -1;
                            } else {
                                class36.field970[var9++] = class14.field431;
                            }
                            continue;
                        }
                        if (var201 == 3601) {
                            var9--;
                            int var137 = class36.field970[var9];
                            if (class132.field3303 == 2 && class14.field431 > var137) {
                                class61.field1611[var11++] = class137.field3424[var137];
                                continue;
                            }
                            class61.field1611[var11++] = class145.field3595;
                            continue;
                        }
                        if (var201 == 3602) {
                            var9--;
                            int var138 = class36.field970[var9];
                            if (class132.field3303 == 2 && var138 < class14.field431) {
                                class36.field970[var9++] = class16.field497[var138];
                                continue;
                            }
                            class36.field970[var9++] = 0;
                            continue;
                        }
                        if (var201 == 3603) {
                            var9--;
                            int var139 = class36.field970[var9];
                            if (class132.field3303 == 2 && var139 < class14.field431) {
                                class36.field970[var9++] = class102.field2549[var139];
                                continue;
                            }
                            class36.field970[var9++] = 0;
                            continue;
                        }
                        if (var201 == 3604) {
                            var11--;
                            class73 var140 = class61.field1611[var11];
                            var9--;
                            int var141 = class36.field970[var9];
                            class41.method307(var141, (byte) 117, var140);
                            continue;
                        }
                        if (var201 == 3611) {
                            if (class89.field2298 == null) {
                                class61.field1611[var11++] = class145.field3595;
                            } else {
                                class61.field1611[var11++] = class89.field2298;
                            }
                            continue;
                        }
                        if (var201 == 3612) {
                            if (class89.field2298 == null) {
                                class36.field970[var9++] = 0;
                            } else {
                                class36.field970[var9++] = class51.field1370;
                            }
                            continue;
                        }
                        if (var201 == 3613) {
                            var9--;
                            int var142 = class36.field970[var9];
                            if (class89.field2298 != null && class51.field1370 > var142) {
                                class61.field1611[var11++] = class13.field417[var142].field2015;
                                continue;
                            }
                            class61.field1611[var11++] = class145.field3595;
                            continue;
                        }
                        if (var201 == 3614) {
                            var9--;
                            int var143 = class36.field970[var9];
                            if (class89.field2298 != null && var143 < class51.field1370) {
                                class36.field970[var9++] = class13.field417[var143].field2018;
                                continue;
                            }
                            class36.field970[var9++] = 0;
                            continue;
                        }
                        if (var201 == 3615) {
                            var9--;
                            int var144 = class36.field970[var9];
                            if (class89.field2298 != null && var144 < class51.field1370) {
                                class36.field970[var9++] = class13.field417[var144].field2021;
                                continue;
                            }
                            class36.field970[var9++] = 0;
                            continue;
                        }
                    } else if (var201 < 4100) {
                        if (var201 == 4000) {
                            var9 -= 2;
                            int var62 = class36.field970[var9 + 1];
                            int var63 = class36.field970[var9];
                            class36.field970[var9++] = var62 + var63;
                            continue;
                        }
                        if (var201 == 4001) {
                            var9 -= 2;
                            int var64 = class36.field970[var9];
                            int var65 = class36.field970[var9 + 1];
                            class36.field970[var9++] = var64 - var65;
                            continue;
                        }
                        if (var201 == 4002) {
                            var9 -= 2;
                            int var66 = class36.field970[var9];
                            int var67 = class36.field970[var9 + 1];
                            class36.field970[var9++] = var66 * var67;
                            continue;
                        }
                        if (var201 == 4003) {
                            var9 -= 2;
                            int var68 = class36.field970[var9];
                            int var69 = class36.field970[var9 + 1];
                            class36.field970[var9++] = var68 / var69;
                            continue;
                        }
                        if (var201 == 4004) {
                            var9--;
                            int var70 = class36.field970[var9];
                            class36.field970[var9++] = (int) ((double) var70 * Math.random());
                            continue;
                        }
                        if (var201 == 4005) {
                            var9--;
                            int var71 = class36.field970[var9];
                            class36.field970[var9++] = (int) (Math.random() * (double) (var71 + 1));
                            continue;
                        }
                        if (var201 == 4006) {
                            var9 -= 5;
                            int var72 = class36.field970[var9];
                            int var73 = class36.field970[var9 + 1];
                            int var74 = class36.field970[var9 + 3];
                            int var75 = class36.field970[var9 + 2];
                            int var76 = class36.field970[var9 + 4];
                            class36.field970[var9++] = (var76 - var75) * (-var72 + var73) / (var74 - var75) + var72;
                            continue;
                        }
                        if (var201 == 4007) {
                            var9 -= 2;
                            int var77 = class36.field970[var9];
                            int var78 = class36.field970[var9 + 1];
                            class36.field970[var9++] = var77 + var77 * var78 / 100;
                            continue;
                        }
                        if (var201 == 4008) {
                            var9 -= 2;
                            int var79 = class36.field970[var9];
                            int var80 = class36.field970[var9 + 1];
                            class36.field970[var9++] = class84.method713(0x1 << var80, var79);
                            continue;
                        }
                        if (var201 == 4009) {
                            var9 -= 2;
                            int var81 = class36.field970[var9];
                            int var82 = class36.field970[var9 + 1];
                            class36.field970[var9++] = class149.method1189(var81, -(0x1 << var82) - 1);
                            continue;
                        }
                        if (var201 == 4010) {
                            var9 -= 2;
                            int var83 = class36.field970[var9];
                            int var84 = class36.field970[var9 + 1];
                            class36.field970[var9++] = class149.method1189(0x1 << var84, var83) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var201 == 4011) {
                            var9 -= 2;
                            int var85 = class36.field970[var9];
                            int var86 = class36.field970[var9 + 1];
                            class36.field970[var9++] = var85 % var86;
                            continue;
                        }
                        if (var201 == 4012) {
                            var9 -= 2;
                            int var87 = class36.field970[var9];
                            int var88 = class36.field970[var9 + 1];
                            if (var87 == 0) {
                                class36.field970[var9++] = 0;
                            } else {
                                class36.field970[var9++] = (int) Math.pow((double) var87, (double) var88);
                            }
                            continue;
                        }
                        if (var201 == 4013) {
                            var9 -= 2;
                            int var89 = class36.field970[var9];
                            int var90 = class36.field970[var9 + 1];
                            if (var89 == 0) {
                                class36.field970[var9++] = 0;
                            } else if (var90 == 0) {
                                class36.field970[var9++] = Integer.MAX_VALUE;
                            } else {
                                class36.field970[var9++] = (int) Math.pow((double) var89, 1.0D / (double) var90);
                            }
                            continue;
                        }
                        if (var201 == 4014) {
                            var9 -= 2;
                            int var91 = class36.field970[var9 + 1];
                            int var92 = class36.field970[var9];
                            class36.field970[var9++] = class149.method1189(var91, var92);
                            continue;
                        }
                        if (var201 == 4015) {
                            var9 -= 2;
                            int var93 = class36.field970[var9 + 1];
                            int var94 = class36.field970[var9];
                            class36.field970[var9++] = class84.method713(var94, var93);
                            continue;
                        }
                    } else if (var201 < 4200) {
                        if (var201 == 4100) {
                            var11--;
                            class73 var95 = class61.field1611[var11];
                            var9--;
                            int var96 = class36.field970[var9];
                            class61.field1611[var11++] = class32.method258(-94, new class73[] { var95, class78.method676(var96, class79.method679(arg2, -113)) });
                            continue;
                        }
                        if (var201 == 4101) {
                            var11 -= 2;
                            class73 var97 = class61.field1611[var11];
                            class73 var98 = class61.field1611[var11 + 1];
                            class61.field1611[var11++] = class32.method258(-82, new class73[] { var97, var98 });
                            continue;
                        }
                        if (var201 == 4102) {
                            var11--;
                            class73 var99 = class61.field1611[var11];
                            var9--;
                            int var100 = class36.field970[var9];
                            class61.field1611[var11++] = class32.method258(-116, new class73[] { var99, class141.method1148(var100, true, true) });
                            continue;
                        }
                        if (var201 == 4103) {
                            var11--;
                            class73 var101 = class61.field1611[var11];
                            class61.field1611[var11++] = var101.method608(-24240);
                            continue;
                        }
                        if (var201 == 4104) {
                            var9--;
                            int var102 = class36.field970[var9];
                            long var103 = (long) var102 * 86400000L + 1014768000000L;
                            class55.field1466.setTime(new Date(var103));
                            int var105 = class55.field1466.get(5);
                            int var106 = class55.field1466.get(2);
                            int var107 = class55.field1466.get(1);
                            class61.field1611[var11++] = class32.method258(-88, new class73[] { class78.method676(var105, -26), class64.field1690, class71.field1809[var106], class64.field1690, class78.method676(var107, -123) });
                            continue;
                        }
                        if (var201 == 4105) {
                            var11 -= 2;
                            class73 var108 = class61.field1611[var11 + 1];
                            class73 var109 = class61.field1611[var11];
                            if (class73.field1901.field3014 != null && class73.field1901.field3014.field1438) {
                                class61.field1611[var11++] = var108;
                                continue;
                            }
                            class61.field1611[var11++] = var109;
                            continue;
                        }
                        if (var201 == 4106) {
                            var9--;
                            int var110 = class36.field970[var9];
                            class61.field1611[var11++] = class78.method676(var110, -97);
                            continue;
                        }
                        if (var201 == 4107) {
                            var11 -= 2;
                            class36.field970[var9++] = class61.field1611[var11].method639(121, class61.field1611[var11 + 1]);
                            continue;
                        }
                        if (var201 == 4108) {
                            var9 -= 2;
                            var11--;
                            class73 var111 = class61.field1611[var11];
                            int var112 = class36.field970[var9];
                            int var113 = class36.field970[var9 + 1];
                            byte[] var114 = class77.field1973.method898((byte) -25, 0, var113);
                            class46 var115 = new class46(var114);
                            class36.field970[var9++] = var115.method345(var111, var112);
                            continue;
                        }
                        if (var201 == 4109) {
                            var9 -= 2;
                            int var116 = class36.field970[var9];
                            var11--;
                            class73 var117 = class61.field1611[var11];
                            int var118 = class36.field970[var9 + 1];
                            byte[] var119 = class77.field1973.method898((byte) -57, 0, var118);
                            class46 var120 = new class46(var119);
                            class36.field970[var9++] = var120.method351(var117, var116);
                            continue;
                        }
                        if (var201 == 4110) {
                            var11 -= 2;
                            class73 var121 = class61.field1611[var11];
                            class73 var122 = class61.field1611[var11 + 1];
                            var9--;
                            if (class36.field970[var9] == 1) {
                                class61.field1611[var11++] = var121;
                            } else {
                                class61.field1611[var11++] = var122;
                            }
                            continue;
                        }
                    } else if (var201 < 4300) {
                        if (var201 == 4200) {
                            var9--;
                            int var123 = class36.field970[var9];
                            class61.field1611[var11++] = class9.method86(var123, (byte) -12).field3220;
                            continue;
                        }
                        if (var201 == 4201) {
                            var9 -= 2;
                            int var124 = class36.field970[var9];
                            int var125 = class36.field970[var9 + 1];
                            class126 var126 = class9.method86(var124, (byte) 107);
                            if (var125 >= 1 && var125 <= 5 && var126.field3216[var125 - 1] != null) {
                                class61.field1611[var11++] = var126.field3216[var125 - 1];
                                continue;
                            }
                            class61.field1611[var11++] = class145.field3595;
                            continue;
                        }
                        if (var201 == 4202) {
                            var9 -= 2;
                            int var127 = class36.field970[var9];
                            int var128 = class36.field970[var9 + 1];
                            class126 var129 = class9.method86(var127, (byte) -13);
                            if (var128 >= 1 && var128 <= 5 && var129.field3200[var128 - 1] != null) {
                                class61.field1611[var11++] = var129.field3200[var128 - 1];
                                continue;
                            }
                            class61.field1611[var11++] = class145.field3595;
                            continue;
                        }
                        if (var201 == 4203) {
                            var9--;
                            int var130 = class36.field970[var9];
                            class36.field970[var9++] = class9.method86(var130, (byte) 96).field3222;
                            continue;
                        }
                        if (var201 == 4204) {
                            var9--;
                            int var131 = class36.field970[var9];
                            class36.field970[var9++] = class9.method86(var131, (byte) -118).field3238 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var201 == 4205) {
                            var9--;
                            int var132 = class36.field970[var9];
                            class126 var133 = class9.method86(var132, (byte) -90);
                            if (var133.field3229 == -1 && var133.field3207 >= 0) {
                                class36.field970[var9++] = var133.field3207;
                                continue;
                            }
                            class36.field970[var9++] = var132;
                            continue;
                        }
                        if (var201 == 4206) {
                            var9--;
                            int var134 = class36.field970[var9];
                            class126 var135 = class9.method86(var134, (byte) -42);
                            if (var135.field3229 >= 0 && var135.field3207 >= 0) {
                                class36.field970[var9++] = var135.field3207;
                                continue;
                            }
                            class36.field970[var9++] = var134;
                            continue;
                        }
                        if (var201 == 4207) {
                            var9--;
                            int var136 = class36.field970[var9];
                            class36.field970[var9++] = class9.method86(var136, (byte) 78).field3201 ? 1 : 0;
                            continue;
                        }
                    }
                }
                class111.method894("CS2 - nosuchop:" + var201, null, (byte) 2);
                return;
            }
        } catch (Exception var200) {
            class111.method894("CS2 - scr:" + var8.field3522 + " op:" + var14, var200, (byte) 2);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)V")
    public static void method491(boolean arg0) {
        field1514 = null;
        field1531 = null;
        field1521 = null;
        field1520 = null;
        field1510 = null;
        field1511 = null;
        field1517 = null;
        field1513 = null;
        field1527 = null;
        if (!arg0) {
            field1516 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static final void method492(int arg0) {
        class92.field2382 = null;
        class22.field641 = null;
        class24.field682 = null;
        class132.field3315 = null;
        field1532++;
        class2.field150 = null;
        if (arg0 != -4202) {
            field1519 = 30;
        }
        class72.field1819 = null;
    }
}
