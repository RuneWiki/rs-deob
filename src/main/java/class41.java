import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class41 extends class166 {

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "[B")
    public static byte[] field879 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "Lcd;")
    public static class23 field884 = class54.method414("Bitte geben Sie Ihren Benutzenamen ein)3", -1);

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public int field862;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public int field863;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public int field864;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public int field865;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public int field866;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public int field867;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public int field868;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public int field870;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
    public int field871;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public int field872;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public int field873;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    public int field877;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public int field878;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    public int field881;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
    public int field888;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "Lqc;")
    public class146 field889;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "Lbd;")
    public class14 field883;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "Lta;")
    public class171 field876;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "Lvf;")
    public static class194 field874;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "Ldd;")
    public static class32 field890;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "Ljc;")
    public class83 field887;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
    public static void method333(int arg0) {
        field890 = null;
        field879 = null;
        if (arg0 != -23881) {
            field874 = null;
        }
        field874 = null;
        field884 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
    public static final void method334(int arg0, int arg1) {
        field886++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class202.field3986[arg1];
        int var3 = class177.field3524[arg1];
        int var4 = class28.field615[arg1];
        int var5 = class103.field2201[arg1];
        if (var5 >= 2000) {
            var5 -= 2000;
        }
        if (var5 == 46) {
            class57 var6 = class95.field2007[var4];
            if (var6 != null) {
                class186.method1147(0, (byte) 118, false, 0, class134.field2790.field219[0], 1, var6.field219[0], 0, 1, 2, var6.field230[0], class134.field2790.field230[0]);
                class57.field1330 = 2;
                class180.field3569 = class65.field1535;
                class100.field2112 = 0;
                class154.field3088 = class43.field912;
                class190.field3771++;
                class159.field3190.method631(195, -1);
                class159.field3190.method1215((byte) -90, var4);
            }
        }
        if (var5 == 15) {
            class179.field3541++;
            class110.method714(var2, var4, 108, var3);
            class159.field3190.method631(147, -1);
            class159.field3190.method1198(var4 >> 14 & 0x7FFF, -2053);
            class159.field3190.method1220((byte) 116, var2 + class155.field3099);
            class159.field3190.method1221(true, class94.field1989 + var3);
        }
        if (var5 == 12) {
            class146.method927((byte) 27);
            class47 var7 = class113.method725((byte) 109, var3);
            class129.field2674 = var4;
            class168.field3362 = var3;
            class79.field1725 = var2;
            class47.field1013 = 1;
            class3.method12(var7, false);
            class183.field3609 = class3.method14(true, new class23[] { class169.field3373, class85.method565(var4, (byte) -113).field1483, class202.field3998 });
            if (class183.field3609 == null) {
                class183.field3609 = class201.field3975;
            }
            return;
        }
        if (var5 == 39) {
            class205.field4041.method823(class59.field1385, var2, var3);
        }
        if (var5 == 44) {
            class42.field894++;
            boolean var8 = class186.method1147(0, (byte) -127, false, 0, class134.field2790.field219[0], 0, var2, 0, 0, 2, var3, class134.field2790.field230[0]);
            if (!var8) {
                class186.method1147(0, (byte) 111, false, 0, class134.field2790.field219[0], 1, var2, 0, 1, 2, var3, class134.field2790.field230[0]);
            }
            class154.field3088 = class43.field912;
            class100.field2112 = 0;
            class57.field1330 = 2;
            class180.field3569 = class65.field1535;
            class159.field3190.method631(70, -1);
            class159.field3190.method1198(var4, -2053);
            class159.field3190.method1198(class155.field3099 + var2, -2053);
            class159.field3190.method1220((byte) 88, class94.field1989 + var3);
        }
        if (var5 == 17) {
            class10.method57((byte) 113);
        }
        if (var5 == 11) {
            class57 var10 = class95.field2007[var4];
            if (var10 != null) {
                class44.field920++;
                class186.method1147(0, (byte) -116, false, 0, class134.field2790.field219[0], 1, var10.field219[0], 0, 1, 2, var10.field230[0], class134.field2790.field230[0]);
                class100.field2112 = 0;
                class154.field3088 = class43.field912;
                class180.field3569 = class65.field1535;
                class57.field1330 = 2;
                class159.field3190.method631(160, -1);
                class159.field3190.method1221(true, var4);
                class159.field3190.method1198(class167.field3331, -2053);
                class159.field3190.method1194(class191.field3789, (byte) 1);
            }
        }
        if (var5 == 1002) {
            class204.field4015++;
            class154.field3088 = class43.field912;
            class180.field3569 = class65.field1535;
            class57.field1330 = 2;
            class100.field2112 = 0;
            class159.field3190.method631(255, -1);
            class159.field3190.method1198(var4 >> 14 & 0x7FFF, -2053);
        }
        if (var5 == 28) {
            class151.field3015++;
            class159.field3190.method631(132, -1);
            class159.field3190.method1198(var2, -2053);
            class159.field3190.method1221(true, var4);
            class159.field3190.method1211(var3, 3);
            class172.field3421 = 0;
            class91.field1949 = class113.method725((byte) 91, var3);
            class121.field2515 = var2;
        }
        if (var5 == 42) {
            class174.field3440++;
            class110.method714(var2, var4, 75, var3);
            class159.field3190.method631(220, -1);
            class159.field3190.method1198(class155.field3099 + var2, -2053);
            class159.field3190.method1198(var4 >> 14 & 0x7FFF, -2053);
            class159.field3190.method1215((byte) -114, var3 + class94.field1989);
        }
        if (var5 == 21) {
            class57 var11 = class95.field2007[var4];
            if (var11 != null) {
                class186.method1147(0, (byte) 118, false, 0, class134.field2790.field219[0], 1, var11.field219[0], 0, 1, 2, var11.field230[0], class134.field2790.field230[0]);
                class134.field2761++;
                class57.field1330 = 2;
                class100.field2112 = 0;
                class180.field3569 = class65.field1535;
                class154.field3088 = class43.field912;
                class159.field3190.method631(122, -1);
                class159.field3190.method1215((byte) -90, class129.field2674);
                class159.field3190.method1226(class168.field3362, -10881704);
                class159.field3190.method1215((byte) -109, class79.field1725);
                class159.field3190.method1198(var4, -2053);
            }
        }
        if (var5 == 7) {
            class182 var12 = class91.field1944[var4];
            if (var12 != null) {
                class186.method1147(0, (byte) -111, false, 0, class134.field2790.field219[0], 1, var12.field219[0], 0, 1, 2, var12.field230[0], class134.field2790.field230[0]);
                class203.field4010++;
                class100.field2112 = 0;
                class57.field1330 = 2;
                class180.field3569 = class65.field1535;
                class154.field3088 = class43.field912;
                class159.field3190.method631(60, -1);
                class159.field3190.method1198(var4, -2053);
            }
        }
        if (var5 == 24) {
            class159.field3190.method631(240, -1);
            class159.field3190.method1215((byte) -102, var2);
            class159.field3190.method1194(var3, (byte) 125);
            class159.field3190.method1220((byte) 35, var4);
            class28.field593++;
            class172.field3421 = 0;
            class91.field1949 = class113.method725((byte) 113, var3);
            class121.field2515 = var2;
        }
        if (var5 == 37) {
            class39.field797++;
            boolean var13 = class186.method1147(0, (byte) -57, false, 0, class134.field2790.field219[0], 0, var2, 0, 0, 2, var3, class134.field2790.field230[0]);
            if (!var13) {
                class186.method1147(0, (byte) 110, false, 0, class134.field2790.field219[0], 1, var2, 0, 1, 2, var3, class134.field2790.field230[0]);
            }
            class57.field1330 = 2;
            class180.field3569 = class65.field1535;
            class154.field3088 = class43.field912;
            class100.field2112 = 0;
            class159.field3190.method631(24, -1);
            class159.field3190.method1194(class191.field3789, (byte) 126);
            class159.field3190.method1221(true, var4);
            class159.field3190.method1215((byte) -112, class94.field1989 + var3);
            class159.field3190.method1220((byte) 96, class167.field3331);
            class159.field3190.method1221(true, class155.field3099 + var2);
        }
        if (var5 == 13) {
            class101.field2160++;
            class159.field3190.method631(167, -1);
            class159.field3190.method1221(true, var2);
            class159.field3190.method1221(true, var4);
            class159.field3190.method1194(var3, (byte) -73);
            class172.field3421 = 0;
            class91.field1949 = class113.method725((byte) 123, var3);
            class121.field2515 = var2;
        }
        if (var5 == 30) {
            class193.field3818++;
            boolean var15 = class186.method1147(0, (byte) 110, false, 0, class134.field2790.field219[0], 0, var2, 0, 0, 2, var3, class134.field2790.field230[0]);
            if (!var15) {
                class186.method1147(0, (byte) -34, false, 0, class134.field2790.field219[0], 1, var2, 0, 1, 2, var3, class134.field2790.field230[0]);
            }
            class154.field3088 = class43.field912;
            class180.field3569 = class65.field1535;
            class57.field1330 = 2;
            class100.field2112 = 0;
            class159.field3190.method631(116, -1);
            class159.field3190.method1198(class155.field3099 + var2, -2053);
            class159.field3190.method1215((byte) -121, var4);
            class159.field3190.method1221(true, class94.field1989 + var3);
        }
        if (var5 == 51) {
            field861++;
            class159.field3190.method631(50, -1);
            class159.field3190.method1220((byte) 89, var2);
            class159.field3190.method1211(var3, -67);
            class159.field3190.method1220((byte) 69, var4);
            class172.field3421 = 0;
            class91.field1949 = class113.method725((byte) 102, var3);
            class121.field2515 = var2;
        }
        if (var5 == 22) {
            class57 var17 = class95.field2007[var4];
            if (var17 != null) {
                class186.method1147(0, (byte) -40, false, 0, class134.field2790.field219[0], 1, var17.field219[0], 0, 1, 2, var17.field230[0], class134.field2790.field230[0]);
                class57.field1330 = 2;
                class154.field3088 = class43.field912;
                class100.field2112 = 0;
                class180.field3569 = class65.field1535;
                class160.field3195++;
                class159.field3190.method631(40, -1);
                class159.field3190.method1215((byte) -123, var4);
            }
        }
        if (var5 == 26) {
            boolean var18 = class186.method1147(0, (byte) -68, false, 0, class134.field2790.field219[0], 0, var2, 0, 0, 2, var3, class134.field2790.field230[0]);
            class69.field1624++;
            if (!var18) {
                class186.method1147(0, (byte) 125, false, 0, class134.field2790.field219[0], 1, var2, 0, 1, 2, var3, class134.field2790.field230[0]);
            }
            class100.field2112 = 0;
            class180.field3569 = class65.field1535;
            class57.field1330 = 2;
            class154.field3088 = class43.field912;
            class159.field3190.method631(188, -1);
            class159.field3190.method1220((byte) 65, class155.field3099 + var2);
            class159.field3190.method1215((byte) -111, class94.field1989 + var3);
            class159.field3190.method1198(var4, -2053);
        }
        if (var5 == 14) {
            class159.field3190.method631(92, -1);
            class159.field3190.method1221(true, var2);
            class12.field240++;
            class159.field3190.method1186(var3, -12);
            class159.field3190.method1221(true, var4);
            class172.field3421 = 0;
            class91.field1949 = class113.method725((byte) 92, var3);
            class121.field2515 = var2;
        }
        if (var5 == 45) {
            class104.field2215++;
            boolean var20 = class186.method1147(0, (byte) -33, false, 0, class134.field2790.field219[0], 0, var2, 0, 0, 2, var3, class134.field2790.field230[0]);
            if (!var20) {
                class186.method1147(0, (byte) -12, false, 0, class134.field2790.field219[0], 1, var2, 0, 1, 2, var3, class134.field2790.field230[0]);
            }
            class180.field3569 = class65.field1535;
            class154.field3088 = class43.field912;
            class57.field1330 = 2;
            class100.field2112 = 0;
            class159.field3190.method631(236, -1);
            class159.field3190.method1186(class168.field3362, -12);
            class159.field3190.method1198(var4, -2053);
            class159.field3190.method1198(class94.field1989 + var3, -2053);
            class159.field3190.method1221(true, class79.field1725);
            class159.field3190.method1221(true, var2 + class155.field3099);
            class159.field3190.method1220((byte) 107, class129.field2674);
        }
        if (var5 == 34) {
            class182 var22 = class91.field1944[var4];
            if (var22 != null) {
                class186.method1147(0, (byte) 119, false, 0, class134.field2790.field219[0], 1, var22.field219[0], 0, 1, 2, var22.field230[0], class134.field2790.field230[0]);
                class100.field2112 = 0;
                class57.field1330 = 2;
                class154.field3088 = class43.field912;
                class60.field1394++;
                class180.field3569 = class65.field1535;
                class159.field3190.method631(250, -1);
                class159.field3190.method1221(true, class167.field3331);
                class159.field3190.method1194(class191.field3789, (byte) 125);
                class159.field3190.method1221(true, var4);
            }
        }
        if (var5 == 5) {
            class110.method714(var2, var4, 106, var3);
            class179.field3542++;
            class159.field3190.method631(55, -1);
            class159.field3190.method1221(true, var4 >> 14 & 0x7FFF);
            class159.field3190.method1215((byte) -118, class155.field3099 + var2);
            class159.field3190.method1220((byte) 62, class94.field1989 + var3);
        }
        if (var5 == 1) {
            class159.field3190.method631(157, -1);
            class159.field3190.method1186(var3, -12);
            class143.field2928++;
            class47 var23 = class113.method725((byte) 93, var3);
            if (var23.field1072 != null && var23.field1072[0][0] == 5) {
                int var24 = var23.field1072[0][1];
                if (class54.field1288[var24] != var23.field1063[0]) {
                    class54.field1288[var24] = var23.field1063[0];
                    class136.method867(var24, (byte) 108);
                }
            }
        }
        if (var5 == 33) {
            class159.field3171++;
            class159.field3190.method631(191, -1);
            class159.field3190.method1194(class191.field3789, (byte) 126);
            class159.field3190.method1215((byte) -114, var2);
            class159.field3190.method1215((byte) -99, class167.field3331);
            class159.field3190.method1186(var3, -12);
        }
        if (arg0 < 55) {
            return;
        }
        if (var5 == 9) {
            class182 var25 = class91.field1944[var4];
            if (var25 != null) {
                class186.method1147(0, (byte) -21, false, 0, class134.field2790.field219[0], 1, var25.field219[0], 0, 1, 2, var25.field230[0], class134.field2790.field230[0]);
                class57.field1330 = 2;
                class155.field3098++;
                class100.field2112 = 0;
                class180.field3569 = class65.field1535;
                class154.field3088 = class43.field912;
                class159.field3190.method631(228, -1);
                class159.field3190.method1198(class79.field1725, -2053);
                class159.field3190.method1220((byte) 82, var4);
                class159.field3190.method1198(class129.field2674, -2053);
                class159.field3190.method1226(class168.field3362, -10881704);
            }
        }
        if (var5 == 29) {
            class182 var26 = class91.field1944[var4];
            if (var26 != null) {
                class172.field3422++;
                class186.method1147(0, (byte) -48, false, 0, class134.field2790.field219[0], 1, var26.field219[0], 0, 1, 2, var26.field230[0], class134.field2790.field230[0]);
                class180.field3569 = class65.field1535;
                class57.field1330 = 2;
                class154.field3088 = class43.field912;
                class100.field2112 = 0;
                class159.field3190.method631(75, -1);
                class159.field3190.method1220((byte) 83, var4);
            }
        }
        if (var5 == 3) {
            class110.method714(var2, var4, 88, var3);
            class159.field3190.method631(20, -1);
            class159.field3190.method1221(true, class155.field3099 + var2);
            class170.field3387++;
            class159.field3190.method1220((byte) 41, class94.field1989 + var3);
            class159.field3190.method1220((byte) 40, var4 >> 14 & 0x7FFF);
        }
        if (var5 == 49) {
            boolean var27 = class186.method1147(0, (byte) -15, false, 0, class134.field2790.field219[0], 0, var2, 0, 0, 2, var3, class134.field2790.field230[0]);
            class174.field3452++;
            if (!var27) {
                class186.method1147(0, (byte) 101, false, 0, class134.field2790.field219[0], 1, var2, 0, 1, 2, var3, class134.field2790.field230[0]);
            }
            class57.field1330 = 2;
            class154.field3088 = class43.field912;
            class180.field3569 = class65.field1535;
            class100.field2112 = 0;
            class159.field3190.method631(81, -1);
            class159.field3190.method1221(true, var4);
            class159.field3190.method1220((byte) 102, class155.field3099 + var2);
            class159.field3190.method1215((byte) -98, class94.field1989 + var3);
        }
        if (var5 == 43) {
            class143.field2928++;
            class159.field3190.method631(157, -1);
            class159.field3190.method1186(var3, -12);
            class47 var29 = class113.method725((byte) 108, var3);
            if (var29.field1072 != null && var29.field1072[0][0] == 5) {
                int var30 = var29.field1072[0][1];
                class54.field1288[var30] = 1 - class54.field1288[var30];
                class136.method867(var30, (byte) 116);
            }
        }
        if (var5 == 4) {
            class159.field3190.method631(164, -1);
            class159.field3190.method1211(var3, 126);
            class159.field3190.method1220((byte) 98, var4);
            class175.field3482++;
            class159.field3190.method1221(true, var2);
            class172.field3421 = 0;
            class91.field1949 = class113.method725((byte) 118, var3);
            class121.field2515 = var2;
        }
        if (var5 == 40 || var5 == 1006) {
            class51.method393(var4, (byte) -100, class81.field1771[arg1], var3, var2);
        }
        if (var5 == 35) {
            class48.field1159++;
            class159.field3190.method631(25, -1);
            class159.field3190.method1211(class191.field3789, -58);
            class159.field3190.method1194(var3, (byte) -120);
            class159.field3190.method1220((byte) 60, var2);
            class159.field3190.method1221(true, var4);
            class159.field3190.method1220((byte) 42, class167.field3331);
            class172.field3421 = 0;
            class91.field1949 = class113.method725((byte) 105, var3);
            class121.field2515 = var2;
        }
        if (var5 == 50) {
            class57 var31 = class95.field2007[var4];
            if (var31 != null) {
                class145.field2963++;
                class186.method1147(0, (byte) -127, false, 0, class134.field2790.field219[0], 1, var31.field219[0], 0, 1, 2, var31.field230[0], class134.field2790.field230[0]);
                class100.field2112 = 0;
                class180.field3569 = class65.field1535;
                class154.field3088 = class43.field912;
                class57.field1330 = 2;
                class159.field3190.method631(77, -1);
                class159.field3190.method1215((byte) -103, var4);
            }
        }
        if (var5 == 8) {
            boolean var32 = true;
            class47 var33 = class113.method725((byte) 112, var3);
            if (var33.field1124 > 0) {
                var32 = class39.method320(var33, (byte) 126);
            }
            if (var32) {
                class159.field3190.method631(157, -1);
                class143.field2928++;
                class159.field3190.method1186(var3, -12);
            }
        }
        if (var5 == 48) {
            class57 var34 = class95.field2007[var4];
            if (var34 != null) {
                class9.field173++;
                class186.method1147(0, (byte) -58, false, 0, class134.field2790.field219[0], 1, var34.field219[0], 0, 1, 2, var34.field230[0], class134.field2790.field230[0]);
                class180.field3569 = class65.field1535;
                class57.field1330 = 2;
                class154.field3088 = class43.field912;
                class100.field2112 = 0;
                class159.field3190.method631(242, -1);
                class159.field3190.method1215((byte) -117, var4);
            }
        }
        if (var5 == 57) {
            class112.field2359++;
            boolean var35 = class186.method1147(0, (byte) 102, false, 0, class134.field2790.field219[0], 0, var2, 0, 0, 2, var3, class134.field2790.field230[0]);
            if (!var35) {
                class186.method1147(0, (byte) -30, false, 0, class134.field2790.field219[0], 1, var2, 0, 1, 2, var3, class134.field2790.field230[0]);
            }
            class57.field1330 = 2;
            class100.field2112 = 0;
            class180.field3569 = class65.field1535;
            class154.field3088 = class43.field912;
            class159.field3190.method631(173, -1);
            class159.field3190.method1215((byte) -90, class155.field3099 + var2);
            class159.field3190.method1198(var3 + class94.field1989, -2053);
            class159.field3190.method1215((byte) -110, var4);
        }
        if (var5 == 36 && class72.field1644 == null) {
            class133.method850(var2, (byte) 85, var3);
            class72.field1644 = class15.method79(var3, var2, -12910);
            class3.method12(class72.field1644, false);
        }
        if (var5 == 20) {
            class167.field3338++;
            class159.field3190.method631(53, -1);
            class159.field3190.method1220((byte) 37, var4);
            class159.field3190.method1220((byte) 38, var2);
            class159.field3190.method1226(var3, -10881704);
            class172.field3421 = 0;
            class91.field1949 = class113.method725((byte) 125, var3);
            class121.field2515 = var2;
        }
        if (var5 == 38 && class110.method714(var2, var4, 80, var3)) {
            class159.field3190.method631(114, -1);
            class80.field1746++;
            class159.field3190.method1220((byte) 111, class94.field1989 + var3);
            class159.field3190.method1215((byte) -125, class79.field1725);
            class159.field3190.method1198(class155.field3099 + var2, -2053);
            class159.field3190.method1186(class168.field3362, -12);
            class159.field3190.method1215((byte) -125, var4 >> 14 & 0x7FFF);
            class159.field3190.method1198(class129.field2674, -2053);
        }
        if (var5 == 31) {
            class29.field630++;
            class159.field3190.method631(66, -1);
            class159.field3190.method1186(var3, -12);
            class159.field3190.method1221(true, var4);
            class159.field3190.method1220((byte) 98, var2);
            class172.field3421 = 0;
            class91.field1949 = class113.method725((byte) 120, var3);
            class121.field2515 = var2;
        }
        if (var5 == 1001) {
            class47 var37 = class113.method725((byte) 111, var3);
            if (var37 == null || var37.field1024[var2] < 100000) {
                class201.field3969++;
                class159.field3190.method631(125, -1);
                class159.field3190.method1215((byte) -99, var4);
            } else {
                class107.method701(10945, class66.field1566, 0, class3.method14(true, new class23[] { class184.method1132(-1, var37.field1024[var2]), class2.field19, class85.method565(var4, (byte) 111).field1483 }));
            }
            class172.field3421 = 0;
            class91.field1949 = class113.method725((byte) 123, var3);
            class121.field2515 = var2;
        }
        if (var5 == 2) {
            class201.field3968++;
            class159.field3190.method631(11, -1);
            class159.field3190.method1215((byte) -112, var2);
            class159.field3190.method1194(var3, (byte) 126);
            class159.field3190.method1220((byte) 89, var4);
            class172.field3421 = 0;
            class91.field1949 = class113.method725((byte) 126, var3);
            class121.field2515 = var2;
        }
        if (var5 == 58) {
            class182 var38 = class91.field1944[var4];
            if (var38 != null) {
                class91.field1945++;
                class186.method1147(0, (byte) -108, false, 0, class134.field2790.field219[0], 1, var38.field219[0], 0, 1, 2, var38.field230[0], class134.field2790.field230[0]);
                class57.field1330 = 2;
                class100.field2112 = 0;
                class154.field3088 = class43.field912;
                class180.field3569 = class65.field1535;
                class159.field3190.method631(29, -1);
                class159.field3190.method1220((byte) 115, var4);
            }
        }
        if (var5 == 25) {
            class159.field3190.method631(47, -1);
            class159.field3190.method1198(var4, -2053);
            class159.field3190.method1186(var3, -12);
            class159.field3190.method1220((byte) 83, var2);
            class162.field3256++;
            class172.field3421 = 0;
            class91.field1949 = class113.method725((byte) 109, var3);
            class121.field2515 = var2;
        }
        if (var5 == 19) {
            class182 var39 = class91.field1944[var4];
            if (var39 != null) {
                class194.field3838++;
                class186.method1147(0, (byte) 117, false, 0, class134.field2790.field219[0], 1, var39.field219[0], 0, 1, 2, var39.field230[0], class134.field2790.field230[0]);
                class180.field3569 = class65.field1535;
                class154.field3088 = class43.field912;
                class100.field2112 = 0;
                class57.field1330 = 2;
                class159.field3190.method631(82, -1);
                class159.field3190.method1198(var4, -2053);
            }
        }
        if (var5 == 6) {
            class57 var40 = class95.field2007[var4];
            if (var40 != null) {
                class186.method1147(0, (byte) 104, false, 0, class134.field2790.field219[0], 1, var40.field219[0], 0, 1, 2, var40.field230[0], class134.field2790.field230[0]);
                class100.field2112 = 0;
                class57.field1330 = 2;
                class58.field1368++;
                class180.field3569 = class65.field1535;
                class154.field3088 = class43.field912;
                class159.field3190.method631(13, -1);
                class159.field3190.method1221(true, var4);
            }
        }
        if (var5 == 41) {
            class57 var41 = class95.field2007[var4];
            if (var41 != null) {
                class186.method1147(0, (byte) 114, false, 0, class134.field2790.field219[0], 1, var41.field219[0], 0, 1, 2, var41.field230[0], class134.field2790.field230[0]);
                class154.field3088 = class43.field912;
                class60.field1395++;
                class180.field3569 = class65.field1535;
                class57.field1330 = 2;
                class100.field2112 = 0;
                class159.field3190.method631(210, -1);
                class159.field3190.method1215((byte) -122, var4);
            }
        }
        if (var5 == 10) {
            class57 var42 = class95.field2007[var4];
            if (var42 != null) {
                class186.method1147(0, (byte) 121, false, 0, class134.field2790.field219[0], 1, var42.field219[0], 0, 1, 2, var42.field230[0], class134.field2790.field230[0]);
                class54.field1280++;
                class100.field2112 = 0;
                class57.field1330 = 2;
                class154.field3088 = class43.field912;
                class180.field3569 = class65.field1535;
                class159.field3190.method631(54, -1);
                class159.field3190.method1221(true, var4);
            }
        }
        if (var5 == 18) {
            class57 var43 = class95.field2007[var4];
            if (var43 != null) {
                class166.field3314++;
                class186.method1147(0, (byte) -18, false, 0, class134.field2790.field219[0], 1, var43.field219[0], 0, 1, 2, var43.field230[0], class134.field2790.field230[0]);
                class57.field1330 = 2;
                class154.field3088 = class43.field912;
                class180.field3569 = class65.field1535;
                class100.field2112 = 0;
                class159.field3190.method631(9, -1);
                class159.field3190.method1220((byte) 39, var4);
            }
        }
        if (var5 == 1004) {
            class154.field3088 = class43.field912;
            class180.field3569 = class65.field1535;
            class201.field3969++;
            class100.field2112 = 0;
            class57.field1330 = 2;
            class159.field3190.method631(125, -1);
            class159.field3190.method1215((byte) -114, var4);
        }
        if (var5 == 32) {
            class47 var44 = class15.method79(var3, var2, -12910);
            if (var44 != null) {
                class146.method927((byte) 27);
                class4.method20(var2, class67.method492(class141.method909(var44, 125), -1425314293), var3, (byte) 82);
                class47.field1013 = 0;
                class124.field2550 = class66.method490(var44, (byte) -122);
                if (class124.field2550 == null) {
                    class124.field2550 = class178.field3536;
                }
                if (!var44.field1027) {
                    class136.field2819 = class3.method14(true, new class23[] { class128.field2657, var44.field1104, class202.field3998 });
                    return;
                }
                class136.field2819 = class3.method14(true, new class23[] { var44.field1061, class202.field3998 });
            }
            return;
        }
        if (var5 == 23) {
            class159.field3190.method631(51, -1);
            class159.field3190.method1186(class168.field3362, -12);
            class7.field136++;
            class159.field3190.method1198(class79.field1725, -2053);
            class159.field3190.method1198(var4, -2053);
            class159.field3190.method1198(class129.field2674, -2053);
            class159.field3190.method1198(var2, -2053);
            class159.field3190.method1226(var3, -10881704);
            class172.field3421 = 0;
            class91.field1949 = class113.method725((byte) 106, var3);
            class121.field2515 = var2;
        }
        if (var5 == 16) {
            class182 var45 = class91.field1944[var4];
            if (var45 != null) {
                class31.field667++;
                class186.method1147(0, (byte) 104, false, 0, class134.field2790.field219[0], 1, var45.field219[0], 0, 1, 2, var45.field230[0], class134.field2790.field230[0]);
                class154.field3088 = class43.field912;
                class57.field1330 = 2;
                class100.field2112 = 0;
                class180.field3569 = class65.field1535;
                class159.field3190.method631(21, -1);
                class159.field3190.method1198(var4, -2053);
            }
        }
        if (var5 == 47 && class110.method714(var2, var4, 79, var3)) {
            class159.field3190.method631(22, -1);
            class159.field3190.method1220((byte) 76, class155.field3099 + var2);
            class159.field3190.method1220((byte) 116, class167.field3331);
            class9.field171++;
            class159.field3190.method1186(class191.field3789, -12);
            class159.field3190.method1220((byte) 93, class94.field1989 + var3);
            class159.field3190.method1220((byte) 105, var4 >> 14 & 0x7FFF);
        }
        if (var5 == 1005) {
            class154.field3088 = class43.field912;
            class180.field3569 = class65.field1535;
            class100.field2112 = 0;
            class57.field1330 = 2;
            class182 var46 = class91.field1944[var4];
            if (var46 != null) {
                class4 var47 = var46.field3595;
                if (var47.field59 != null) {
                    var47 = var47.method26((byte) 5);
                }
                if (var47 != null) {
                    class179.field3547++;
                    class159.field3190.method631(68, -1);
                    class159.field3190.method1221(true, var47.field49);
                }
            }
        }
        if (var5 == 1007) {
            class110.method714(var2, var4, 109, var3);
            class159.field3190.method631(123, -1);
            class121.field2507++;
            class159.field3190.method1220((byte) 71, class94.field1989 + var3);
            class159.field3190.method1198(var2 + class155.field3099, -2053);
            class159.field3190.method1220((byte) 77, var4 >> 14 & 0x7FFF);
        }
        if (class47.field1013 != 0) {
            class47.field1013 = 0;
            class3.method12(class113.method725((byte) 123, class168.field3362), false);
        }
        if (class73.field1660) {
            class146.method927((byte) 27);
        }
        if (class91.field1949 != null && class172.field3421 == 0) {
            class3.method12(class91.field1949, false);
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)Z")
    public static final boolean method335(int arg0, int arg1) {
        field882++;
        if (arg1 != -824315179) {
            field890 = null;
        }
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
    public final void method336(int arg0) {
        this.field889 = null;
        field880++;
        this.field887 = null;
        if (arg0 == 2120383246) {
            this.field883 = null;
            this.field876 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
    public static final void method337(byte arg0) {
        field869++;
        try {
            if (class190.field3775 == 1) {
                int var1 = class203.field4001.method1288(true);
                if (var1 > 0 && class203.field4001.method1294((byte) 126)) {
                    int var2 = var1 - class138.field2854;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class203.field4001.method1312(var2, arg0 - 7);
                    return;
                }
                class203.field4001.method1319(-6648);
                class203.field4001.method1292(-116);
                if (class124.field2540 == null) {
                    class190.field3775 = 0;
                } else {
                    class190.field3775 = 2;
                }
                class86.field1853 = null;
                class19.field399 = null;
            }
            if (arg0 != -117) {
                method337((byte) -105);
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class203.field4001.method1319(-6648);
            class86.field1853 = null;
            class190.field3775 = 0;
            class124.field2540 = null;
            class19.field399 = null;
        }
    }
}
