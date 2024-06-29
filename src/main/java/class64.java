import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class64 extends class62 {

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "[B")
    public byte[] field1340;

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
    public static int field1350 = 0;

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "Llc;")
    public static class69 field1343 = class69.method470((byte) -122, "This is a non)2members*6nworld)3 To enjoy your*6nmembers benefits we*6nrecommend you play on a*6nmembers world instead)3");

    @OriginalMember(owner = "client!kd", name = "gb", descriptor = "I")
    public static int field1351 = 0;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "Llc;")
    public static class69 field1344 = class69.method470((byte) -128, "Click to continue");

    @OriginalMember(owner = "client!kd", name = "kb", descriptor = "[I")
    public static int[] field1355 = new int[100];

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "I")
    public static int field1342 = 0;

    @OriginalMember(owner = "client!kd", name = "lb", descriptor = "[Llc;")
    public static class69[] field1356 = new class69[200];

    @OriginalMember(owner = "client!kd", name = "hb", descriptor = "Llc;")
    public static class69 field1352 = class69.method470((byte) -122, "wishes to duel with you)3");

    @OriginalMember(owner = "client!kd", name = "ib", descriptor = "Llc;")
    public static class69 field1353 = class69.method470((byte) -106, "headicons_prayer");

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!kd", name = "eb", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!kd", name = "mb", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!kd", name = "ob", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "Lna;")
    public static class79 field1347;

    @OriginalMember(owner = "client!kd", name = "jb", descriptor = "Loc;")
    public static class87 field1354;

    @OriginalMember(owner = "client!kd", name = "nb", descriptor = "Lqd;")
    public static class99 field1358;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "[Lcb;")
    public static class15[] field1339;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)V")
    public static final void method408(int arg0) {
        class6.method35((byte) -96);
        if (arg0 < 90) {
            field1358 = null;
        }
        field1346++;
        class9.method50(20081);
        class23.method152(-1);
        class36.method222(220);
        class16.method85(false);
        class39.method237((byte) 77);
        class47.method315(103);
        class46.method306(25685);
        class94.method672(11178);
        class67.method444(0);
        class2.method12(34);
        class94.method699((byte) 67);
        ((class91) class117.field2525).method645(15316);
        class106.field2303.method401((byte) 56);
        class77.field1728.method401((byte) 92);
        class42.field840.method401((byte) 119);
        class68.field1452.method401((byte) 102);
        class106.field2301.method401((byte) 95);
        class27.field570.method401((byte) 52);
        class81.field1833.method401((byte) 95);
        class16.field315.method401((byte) 59);
        class67.field1421.method401((byte) 81);
        class46.field958.method401((byte) 56);
        class35.field693.method401((byte) 109);
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)V")
    public static final void method409(int arg0) {
        field1345++;
        class17.method100(false);
        if (class10.field194 == 2) {
            int[] var1 = class95.field2115;
            byte[] var2 = class81.field1844.field273;
            int var3 = var2.length;
            for (int var4 = 0; var4 < var3; var4++) {
                if (var2[var4] == 0) {
                    var1[var4] = 0;
                }
            }
            class22.field463.method131(0, 0, 33, 33, 25, 25, class17.field342, 256, class76.field1701, class81.field1842);
            class77.method552((byte) 116, class24.field509);
            return;
        }
        int var5 = class17.field342 + class128.field2757 & 0x7FF;
        int var6 = class46.field974.field1058 / 32 + 48;
        int var7 = 464 - class46.field974.field1065 / 32;
        class121.field2612.method131(25, 5, 146, 151, var6, var7, var5, class70.field1558 + 256, class63.field1331, class24.field500);
        class22.field463.method131(0, 0, 33, 33, 25, 25, class17.field342, 256, class76.field1701, class81.field1842);
        for (int var8 = 0; var8 < class81.field1835; var8++) {
            int var38 = class16.field316[var8] * 4 + 2 - class46.field974.field1065 / 32;
            int var39 = class42.field834[var8] * 4 + 2 - class46.field974.field1058 / 32;
            class79.method563(10191, var39, class72.field1605[var8], var38);
        }
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var34 = 0; var34 < 104; var34++) {
                class80 var35 = class92.field2014[class71.field1588][var9][var34];
                if (var35 != null) {
                    int var36 = var9 * 4 + 2 - class46.field974.field1058 / 32;
                    int var37 = var34 * 4 + 2 - class46.field974.field1065 / 32;
                    class79.method563(10191, var36, class13.field265[0], var37);
                }
            }
        }
        int var10 = 0;
        if (arg0 != 4) {
            field1350 = 125;
        }
        while (class62.field1284 > var10) {
            class72 var30 = class112.field2434[class70.field1569[var10]];
            if (var30 != null && var30.method327(true)) {
                class68 var31 = var30.field1616;
                if (var31.field1462 != null) {
                    var31 = var31.method453(124);
                }
                if (var31 != null && var31.field1476 && var31.field1460) {
                    int var32 = var30.field1058 / 32 - class46.field974.field1058 / 32;
                    int var33 = var30.field1065 / 32 - class46.field974.field1065 / 32;
                    class79.method563(10191, var32, class13.field265[1], var33);
                }
            }
            var10++;
        }
        for (int var11 = 0; var11 < class27.field585; var11++) {
            class60 var22 = class123.field2682[class92.field2013[var11]];
            if (var22 != null && var22.method327(true)) {
                int var23 = var22.field1058 / 32 - class46.field974.field1058 / 32;
                int var24 = var22.field1065 / 32 - class46.field974.field1065 / 32;
                long var25 = var22.field1222.method465(1);
                boolean var27 = false;
                for (int var28 = 0; var28 < class43.field852; var28++) {
                    if (class56.field1186[var28] == var25 && class51.field1122[var28] != 0) {
                        var27 = true;
                        break;
                    }
                }
                boolean var29 = false;
                if (class46.field974.field1228 != 0 && var22.field1228 != 0 && class46.field974.field1228 == var22.field1228) {
                    var29 = true;
                }
                if (var27) {
                    class79.method563(10191, var23, class13.field265[3], var24);
                } else if (var29) {
                    class79.method563(10191, var23, class13.field265[4], var24);
                } else {
                    class79.method563(10191, var23, class13.field265[2], var24);
                }
            }
        }
        if (class75.field1694 != 0 && class62.field1282 % 20 < 10) {
            if (class75.field1694 == 1 && class74.field1663 >= 0 && class112.field2434.length > class74.field1663) {
                class72 var12 = class112.field2434[class74.field1663];
                if (var12 != null) {
                    int var13 = var12.field1065 / 32 - class46.field974.field1065 / 32;
                    int var14 = var12.field1058 / 32 - class46.field974.field1058 / 32;
                    class66.method430(class93.field2019[1], true, var13, var14);
                }
            }
            if (class75.field1694 == 2) {
                int var15 = (class78.field1771 - class33.field648) * 4 + 2 - class46.field974.field1058 / 32;
                int var16 = (class54.field1153 - class60.field1234) * 4 + 2 - class46.field974.field1065 / 32;
                class66.method430(class93.field2019[1], true, var16, var15);
            }
            if (class75.field1694 == 10 && field1351 >= 0 && field1351 < class123.field2682.length) {
                class60 var17 = class123.field2682[field1351];
                if (var17 != null) {
                    int var18 = var17.field1058 / 32 - class46.field974.field1058 / 32;
                    int var19 = var17.field1065 / 32 - class46.field974.field1065 / 32;
                    class66.method430(class93.field2019[1], true, var19, var18);
                }
            }
        }
        if (class101.field2196 != 0) {
            int var20 = class10.field215 * 4 + 2 - class46.field974.field1065 / 32;
            int var21 = class101.field2196 * 4 + 2 - class46.field974.field1058 / 32;
            class79.method563(arg0 + 10187, var21, class93.field2019[0], var20);
        }
        class95.method728(97, 78, 3, 3, 16777215);
        class77.method552((byte) 115, class24.field509);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)Llc;")
    public static final class69 method410(byte arg0, int arg1) {
        field1349++;
        if (arg0 != -30) {
            field1353 = null;
        }
        class69 var2 = class106.method791(arg1, (byte) -92);
        for (int var3 = var2.method487((byte) -113) - 3; var3 > 0; var3 -= 3) {
            var2 = class46.method305(20025, new class69[] { var2.method477(63, var3, 0), client.field407, var2.method486(var3, (byte) -102) });
        }
        if (var2.method487((byte) -90) > 8) {
            var2 = class46.method305(20025, new class69[] { class98.field2157, var2.method477(63, var2.method487((byte) -121) - 8, 0), class102.field2219, var2, class112.field2432 });
        } else if (var2.method487((byte) -78) > 4) {
            var2 = class46.method305(arg0 ^ 0xFFFFB1DB, new class69[] { class63.field1332, var2.method477(63, var2.method487((byte) -85) - 4, 0), class54.field1155, var2, class112.field2432 });
        }
        return class46.method305(20025, new class69[] { class43.field860, var2 });
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Z")
    public static final boolean method411(int arg0, int arg1) {
        field1341++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class76.field1700[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 9) {
            return true;
        } else {
            if (arg0 != 27516) {
                method409(23);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)V")
    public static void method412(int arg0) {
        field1352 = null;
        field1347 = null;
        field1354 = null;
        field1339 = null;
        field1343 = null;
        field1355 = null;
        field1353 = null;
        field1344 = null;
        if (arg0 == 100) {
            field1358 = null;
            field1356 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([B)V")
    public class64(byte[] arg0) {
        this.field1340 = arg0;
    }
}
