import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class332 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public int field5161 = 0;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "[I")
    public static int[] field5167 = new int[14];

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field5173 = null;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5163 = "Cancel";

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Ll;")
    public static class133 field5166;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Ll;")
    public static class133 field5169;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "[Lil;")
    public static class282[] field5162;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lkh;I)V", line = 7)
    public final void method2301(class166 arg0, int arg1) {
        if (arg1 != 0) {
            this.method2305((byte) 79, (class166) null, -15);
        }
        while (true) {
            int var3 = arg0.method1178(0);
            if (var3 == 0) {
                field5165++;
                return;
            }
            this.method2305((byte) 114, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V", line = 29)
    public static final void method2302(int arg0, boolean arg1) {
        field5168++;
        if (!class321.method2189(arg0, (byte) 79) || arg1) {
            return;
        }
        class220[] var2 = class163.field2463[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class220 var4 = var2[var3];
            if (var4 != null) {
                var4.field3349 = 1;
                var4.field3469 = 0;
                var4.field3500 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ll;I)V", line = 65)
    public static final void method2303(class133 arg0, int arg1) {
        client.field736 = arg0.method970("runes", (byte) -10);
        if (arg1 != 23) {
            field5167 = (int[]) null;
        }
        field5176++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)V", line = 77)
    public static final void method2304(int arg0, byte arg1) {
        field5177++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class307.field4774[arg0];
        int var3 = class95.field1528[arg0];
        long var4 = class224.field3566[arg0];
        int var6 = class233.field3689[arg0];
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        int var7 = (int) class224.field3566[arg0];
        if (var6 == 39) {
            class185.field2772++;
            class313.field4865 = 0;
            class233.field3691 = class205.field3084;
            class222.field3535 = 2;
            class317.field4950 = class47.field776;
            class106.field1642.method753(-67, 29);
            class106.field1642.method1177(-18147, class53.field902[82] ? 1 : 0);
            class106.field1642.method1130(-120, var2 + class213.field3249);
            class106.field1642.method1150(var7, arg1 ^ 0x25771B4E);
            class106.field1642.method1150(class342.field5328 + var3, arg1 + -628562622);
        }
        if (var6 == 44) {
            class33 var8 = class254.field3992[var7];
            if (var8 != null) {
                class17.field240++;
                class233.field3691 = class205.field3084;
                class317.field4950 = class47.field776;
                class313.field4865 = 0;
                class222.field3535 = 2;
                class106.field1642.method753(arg1 ^ 0x1B, 197);
                class106.field1642.method1135(true, class53.field902[82] ? 1 : 0);
                class106.field1642.method1161(var7, 128);
            }
        }
        if (var6 == 22) {
            if (var7 == 0) {
                class251.field3964 = 1;
                class263.method1793(class205.field3101, var2, var3);
            } else if (class52.field853 > 0 && class53.field902[82] && class53.field902[81]) {
                class110.method822(class213.field3249 + var2, class205.field3101, class342.field5328 + var3, false);
            } else {
                class224.field3558++;
                class106.field1642.method753(-99, 133);
                class106.field1642.method1130(-118, class213.field3249 + var2);
                class106.field1642.method1149(class342.field5328 + var3, (byte) -103);
            }
        }
        if (var6 == 10) {
            class33 var9 = class254.field3992[var7];
            if (var9 != null) {
                class120.field1833++;
                class313.field4865 = 0;
                class233.field3691 = class205.field3084;
                class317.field4950 = class47.field776;
                class222.field3535 = 2;
                class106.field1642.method753(14, 144);
                class106.field1642.method1149(class60.field978, (byte) -38);
                class106.field1642.method1130(-121, class315.field4913);
                class106.field1642.method1171(class53.field892, -126);
                class106.field1642.method1132((byte) 29, class53.field902[82] ? 1 : 0);
                class106.field1642.method1161(var7, 128);
            }
        }
        if (var6 == 2) {
            class317.field4950 = class47.field776;
            class222.field3535 = 2;
            class187.field2803++;
            class313.field4865 = 0;
            class233.field3691 = class205.field3084;
            class106.field1642.method753(-48, 212);
            class106.field1642.method1130(-123, var7);
            class106.field1642.method1161(var3 + class342.field5328, 128);
            class106.field1642.method1159(class53.field902[82] ? 1 : 0, arg1 ^ 0x5);
            class106.field1642.method1130(-127, class213.field3249 + var2);
        }
        if (var6 == 18) {
            class244.field3898++;
            class106.field1642.method753(arg1 + 244, 188);
            class106.field1642.method1161(class52.field868, arg1 + 250);
            class106.field1642.method1155(arg1 ^ 0x8BC64816, class224.field3573);
            class106.field1642.method1130(-119, var2);
            class106.field1642.method1171(var3, arg1 + 4);
        }
        if (var6 == 36) {
            class222.field3535 = 2;
            class317.field4950 = class47.field776;
            class313.field4865 = 0;
            class300.field4686++;
            class233.field3691 = class205.field3084;
            class106.field1642.method753(-114, 120);
            class106.field1642.method1149(class213.field3249 + var2, (byte) 121);
            class106.field1642.method1161(var7, 128);
            class106.field1642.method1132((byte) 29, class53.field902[82] ? 1 : 0);
            class106.field1642.method1149(class342.field5328 + var3, (byte) -82);
            class106.field1642.method1174((byte) -32, class224.field3573);
            class106.field1642.method1150(class52.field868, -628562744);
        }
        if (var6 == 46) {
            class313 var10 = class254.field3989[var7];
            if (var10 != null) {
                class233.field3700++;
                class317.field4950 = class47.field776;
                class222.field3535 = 2;
                class313.field4865 = 0;
                class233.field3691 = class205.field3084;
                class106.field1642.method753(4, 50);
                class106.field1642.method1150(var7, -628562744);
                class106.field1642.method1135(true, class53.field902[82] ? 1 : 0);
            }
        }
        if (var6 == 40) {
            class33 var11 = class254.field3992[var7];
            if (var11 != null) {
                class222.field3535 = 2;
                class317.field4950 = class47.field776;
                class313.field4865 = 0;
                class233.field3691 = class205.field3084;
                class106.field1642.method753(arg1 ^ 0xFFFFFFF8, 158);
                class106.field1642.method1135(true, class53.field902[82] ? 1 : 0);
                class131.field2048++;
                class106.field1642.method1161(var7, 128);
            }
        }
        if (var6 == 37) {
            class313 var12 = class254.field3989[var7];
            if (var12 != null) {
                class222.field3535 = 2;
                class317.field4950 = class47.field776;
                class233.field3691 = class205.field3084;
                class201.field3022++;
                class313.field4865 = 0;
                class106.field1642.method753(122, 103);
                class106.field1642.method1132((byte) 29, class53.field902[82] ? 1 : 0);
                class106.field1642.method1149(var7, (byte) 117);
            }
        }
        if (var6 == 19) {
            class33 var13 = class254.field3992[var7];
            if (var13 != null) {
                class313.field4865 = 0;
                class233.field3691 = class205.field3084;
                class317.field4950 = class47.field776;
                class222.field3535 = 2;
                class106.field1642.method753(126, 230);
                class282.field4368++;
                class106.field1642.method1161(var7, 128);
                class106.field1642.method1135(true, class53.field902[82] ? 1 : 0);
            }
        }
        if (var6 == 43) {
            class201.field3017++;
            class106.field1642.method753(arg1 + 247, 177);
            class106.field1642.method1150(var7, -628562744);
            class106.field1642.method1150(var2, -628562744);
            class106.field1642.method1174((byte) -32, var3);
            class68.field1130 = 0;
            class132.field2083 = class68.method524((byte) -109, var3);
            class51.field833 = var2;
        }
        if (var6 == 21) {
            class220 var14 = class177.method1263(var3, -124, var2);
            if (var14 != null) {
                class216.method1530(-20640);
                class160 var15 = client.method393(var14);
                class218.method1539(var2, var14.field3348, var3, var15.method1088((byte) -73), 0, var14.field3412, var15.field2402);
                class313.field4858 = 0;
                field5173 = class171.method1234(21, var14);
                if (var14.field3445) {
                    class254.field3997 = var14.field3358 + "<col=ffffff>";
                } else {
                    class254.field3997 = "<col=00ff00>" + var14.field3382 + "<col=ffffff>";
                }
                if (field5173 == null) {
                    field5173 = "Null";
                }
            }
            return;
        }
        if (var6 == 24) {
            if (var7 == 0) {
                class263.method1793(class205.field3101, var2, var3);
            } else if (var7 == 1) {
                if (class52.field853 > 0 && class53.field902[82] && class53.field902[81]) {
                    class110.method822(class213.field3249 + var2, class205.field3101, class342.field5328 + var3, false);
                } else {
                    class34.method282(82, var2, 1, var3);
                    class106.field1642.method1132((byte) 29, class105.field1629);
                    class106.field1642.method1132((byte) 29, class169.field2562);
                    class106.field1642.method1150((int) class259.field4063, -628562744);
                    class106.field1642.method1132((byte) 29, 57);
                    class106.field1642.method1132((byte) 29, class345.field5354);
                    class106.field1642.method1132((byte) 29, class254.field3995);
                    class106.field1642.method1132((byte) 29, 89);
                    class106.field1642.method1150(class98.field1566.field1905, -628562744);
                    class106.field1642.method1150(class98.field1566.field1868, arg1 - 628562622);
                    class106.field1642.method1132((byte) 29, class318.field4971);
                    class106.field1642.method1132((byte) 29, 63);
                }
            }
        }
        if (var6 == 32) {
            class106.field1642.method753(arg1 + 8, 105);
            class120.field1830++;
            class106.field1642.method1149(var2, (byte) -49);
            class106.field1642.method1174((byte) -32, var3);
            class106.field1642.method1150(var7, -628562744);
            class68.field1130 = 0;
            class132.field2083 = class68.method524((byte) -95, var3);
            class51.field833 = var2;
        }
        if (var6 == 20) {
            class106.field1642.method753(127, 7);
            class202.field3030++;
            class106.field1642.method1155(1949939600, class53.field892);
            class106.field1642.method1130(-120, class60.field978);
            class106.field1642.method1182((byte) 126, var3);
            class106.field1642.method1149(class315.field4913, (byte) -71);
            class106.field1642.method1130(arg1 + 2, var7);
            class106.field1642.method1161(var2, 128);
            class68.field1130 = 0;
            class132.field2083 = class68.method524((byte) -91, var3);
            class51.field833 = var2;
        }
        if (var6 == 49) {
            class106.field1642.method753(arg1 ^ 0xFFFFFFF9, 196);
            class195.field2915++;
            class106.field1642.method1130(-128, var7);
            class106.field1642.method1182((byte) 85, var3);
            class106.field1642.method1130(arg1 ^ 0x6, var2);
            class68.field1130 = 0;
            class132.field2083 = class68.method524((byte) -102, var3);
            class51.field833 = var2;
        }
        if (var6 == 15) {
            class335.field5247++;
            class106.field1642.method753(arg1 + 248, 123);
            class106.field1642.method1149(var2, (byte) 80);
            class106.field1642.method1174((byte) -32, var3);
            class106.field1642.method1149(var7, (byte) -38);
            class68.field1130 = 0;
            class132.field2083 = class68.method524((byte) -118, var3);
            class51.field833 = var2;
        }
        if (var6 == 60) {
            class313 var16 = class254.field3989[var7];
            if (var16 != null) {
                class233.field3691 = class205.field3084;
                class77.field1236++;
                class222.field3535 = 2;
                class313.field4865 = 0;
                class317.field4950 = class47.field776;
                class106.field1642.method753(-27, 61);
                class106.field1642.method1132((byte) 29, class53.field902[82] ? 1 : 0);
                class106.field1642.method1161(var7, arg1 ^ 0xFFFFFF06);
            }
        }
        if (var6 == 12) {
            class317.field4950 = class47.field776;
            class222.field3535 = 2;
            class131.field2053++;
            class233.field3691 = class205.field3084;
            class313.field4865 = 0;
            class106.field1642.method753(-77, 128);
            class106.field1642.method1161(Integer.MAX_VALUE & (int) (var4 >>> 32), 128);
            class106.field1642.method1161(class60.field978, 128);
            class106.field1642.method1150(class213.field3249 + var2, -628562744);
            class106.field1642.method1135(true, class53.field902[82] ? 1 : 0);
            class106.field1642.method1171(class53.field892, -95);
            class106.field1642.method1150(class342.field5328 + var3, -628562744);
            class106.field1642.method1130(-118, class315.field4913);
        }
        if (var6 == 35) {
            class316.field4930++;
            class222.field3535 = 2;
            class313.field4865 = 0;
            class317.field4950 = class47.field776;
            class233.field3691 = class205.field3084;
            class106.field1642.method753(-96, 183);
            class106.field1642.method1132((byte) 29, class53.field902[82] ? 1 : 0);
            class106.field1642.method1150(class213.field3249 + var2, -628562744);
            class106.field1642.method1161(class342.field5328 + var3, 128);
            class106.field1642.method1130(arg1 ^ 0x6, (int) (var4 >>> 32) & Integer.MAX_VALUE);
        }
        if (var6 == 47) {
            class313 var17 = class254.field3989[var7];
            if (var17 != null) {
                class233.field3691 = class205.field3084;
                class313.field4865 = 0;
                class222.field3535 = 2;
                class317.field4950 = class47.field776;
                class280.field4311++;
                class106.field1642.method753(arg1 + 88, 59);
                class106.field1642.method1161(var7, 128);
                class106.field1642.method1177(-18147, class53.field902[82] ? 1 : 0);
            }
        }
        if (var6 == 59) {
            class40.field606++;
            class106.field1642.method753(arg1 ^ 0xFFFFFFF8, 216);
            class106.field1642.method1171(var3, arg1 ^ 0x23);
            class106.field1642.method1161(var7, 128);
            class106.field1642.method1155(1949939600, class224.field3573);
            class106.field1642.method1161(class52.field868, 128);
            class106.field1642.method1149(var2, (byte) 96);
            class68.field1130 = 0;
            class132.field2083 = class68.method524((byte) -95, var3);
            class51.field833 = var2;
        }
        if (var6 == 58) {
            if (var7 == 0) {
                class81.field1274 = 1;
                class263.method1793(class205.field3101, var2, var3);
            } else if (var7 == 1) {
                class106.field1642.method753(-12, 47);
                class106.field1642.method1149(class342.field5328 + var3, (byte) 121);
                class106.field1642.method1161(class52.field868, 128);
                class106.field1642.method1174((byte) -32, class224.field3573);
                class106.field1642.method1149(class213.field3249 + var2, (byte) -80);
                class161.field2428++;
            }
        }
        if (var6 == 30) {
            class194.method1384((byte) -93);
        }
        if (var6 == 4) {
            class106.field1642.method753(arg1 ^ 0xFFFFFFF8, 190);
            class106.field1642.method1182((byte) 124, var3);
            class212.field3220++;
            class106.field1642.method1130(-122, var7);
            class106.field1642.method1150(var2, -628562744);
            class68.field1130 = 0;
            class132.field2083 = class68.method524((byte) -127, var3);
            class51.field833 = var2;
        }
        if (var6 == 41) {
            class317.field4950 = class47.field776;
            class313.field4865 = 0;
            class233.field3691 = class205.field3084;
            class222.field3535 = 2;
            class106.field1642.method753(-68, 45);
            class187.field2796++;
            class106.field1642.method1161(var2 + class213.field3249, 128);
            class106.field1642.method1149(class342.field5328 + var3, (byte) -104);
            class106.field1642.method1132((byte) 29, class53.field902[82] ? 1 : 0);
            class106.field1642.method1149(var7, (byte) -106);
        }
        if (var6 == 1) {
            class313 var18 = class254.field3989[var7];
            if (var18 != null) {
                class232.field3677++;
                class233.field3691 = class205.field3084;
                class222.field3535 = 2;
                class317.field4950 = class47.field776;
                class313.field4865 = 0;
                class106.field1642.method753(125, 74);
                class106.field1642.method1149(class52.field868, (byte) -67);
                class106.field1642.method1177(-18147, class53.field902[82] ? 1 : 0);
                class106.field1642.method1174((byte) -32, class224.field3573);
                class106.field1642.method1150(var7, -628562744);
            }
        }
        if (var6 == 31) {
            class258.field4054++;
            class106.field1642.method753(arg1 ^ 0xFFFFFFFD, 43);
            class106.field1642.method1161(var2, 128);
            class106.field1642.method1155(1949939600, var3);
            class106.field1642.method1161(var7, 128);
            class68.field1130 = 0;
            class132.field2083 = class68.method524((byte) -110, var3);
            class51.field833 = var2;
        }
        if (var6 == 6) {
            class33 var19 = class254.field3992[var7];
            if (var19 != null) {
                class134.field2137++;
                class222.field3535 = 2;
                class313.field4865 = 0;
                class233.field3691 = class205.field3084;
                class317.field4950 = class47.field776;
                class106.field1642.method753(arg1 + 248, 218);
                class106.field1642.method1132((byte) 29, class53.field902[82] ? 1 : 0);
                class106.field1642.method1149(var7, (byte) -36);
            }
        }
        if (var6 == 48) {
            class222.field3535 = 2;
            class233.field3691 = class205.field3084;
            class313.field4865 = 0;
            class89.field1428++;
            class317.field4950 = class47.field776;
            class106.field1642.method753(arg1 + 54, 174);
            class106.field1642.method1150(class342.field5328 + var3, -628562744);
            class106.field1642.method1150(var7, -628562744);
            class106.field1642.method1149(class213.field3249 + var2, (byte) 118);
            class106.field1642.method1159(class53.field902[82] ? 1 : 0, 106);
        }
        if (var6 == 50) {
            class33 var20 = class254.field3992[var7];
            if (var20 != null) {
                class2.field27++;
                class317.field4950 = class47.field776;
                class222.field3535 = 2;
                class233.field3691 = class205.field3084;
                class313.field4865 = 0;
                class106.field1642.method753(-53, 114);
                class106.field1642.method1149(var7, (byte) -23);
                class106.field1642.method1159(class53.field902[82] ? 1 : 0, -87);
            }
        }
        if (var6 == 23) {
            class313 var21 = class254.field3989[var7];
            if (var21 != null) {
                class313.field4865 = 0;
                class222.field3535 = 2;
                class317.field4950 = class47.field776;
                class233.field3691 = class205.field3084;
                class106.field1642.method753(arg1 + 244, 135);
                class123.field1924++;
                class106.field1642.method1161(var7, 128);
                class106.field1642.method1182((byte) 110, class53.field892);
                class106.field1642.method1159(class53.field902[82] ? 1 : 0, arg1);
                class106.field1642.method1130(-119, class315.field4913);
                class106.field1642.method1150(class60.field978, arg1 ^ 0x25771B4E);
            }
        }
        if (var6 == 17) {
            class106.field1642.method753(-82, 90);
            class106.field1642.method1130(-119, var7);
            class189.field2833++;
            class106.field1642.method1155(arg1 ^ 0x8BC64816, var3);
            class106.field1642.method1150(var2, -628562744);
            class68.field1130 = 0;
            class132.field2083 = class68.method524((byte) -125, var3);
            class51.field833 = var2;
        }
        if (var6 == 7) {
            class220 var22 = class68.method524((byte) -101, var3);
            boolean var23 = true;
            if (var22.field3427 > 0) {
                var23 = class105.method765(250, var22);
            }
            if (var23) {
                class106.field1642.method753(123, 75);
                class106.field1642.method1174((byte) -32, var3);
                class242.field3874++;
            }
        }
        if (var6 == 33) {
            class33 var24 = class254.field3992[var7];
            if (var24 != null) {
                class317.field4950 = class47.field776;
                class106.field1641++;
                class233.field3691 = class205.field3084;
                class222.field3535 = 2;
                class313.field4865 = 0;
                class106.field1642.method753(122, 199);
                class106.field1642.method1155(1949939600, class224.field3573);
                class106.field1642.method1150(var7, -628562744);
                class106.field1642.method1132((byte) 29, class53.field902[82] ? 1 : 0);
                class106.field1642.method1149(class52.field868, (byte) -57);
            }
        }
        if (var6 == 1005) {
            class220 var25 = class68.method524((byte) -81, var3);
            if (var25 == null || var25.field3409[var2] < 100000) {
                class272.field4220++;
                class106.field1642.method753(9, 226);
                class106.field1642.method1150(var7, arg1 - 628562622);
            } else {
                class29.method252(var25.field3409[var2] + " x " + class237.method1657(2, var7).field4650, "", true, 0);
            }
            class68.field1130 = 0;
            class132.field2083 = class68.method524((byte) -124, var3);
            class51.field833 = var2;
        }
        if (var6 == 28) {
            class87.field1413++;
            class313.field4865 = 0;
            class317.field4950 = class47.field776;
            class233.field3691 = class205.field3084;
            class222.field3535 = 2;
            class106.field1642.method753(arg1 ^ 0xFFFFFFF9, 244);
            class106.field1642.method1132((byte) 29, class53.field902[82] ? 1 : 0);
            class106.field1642.method1150(var3 + class342.field5328, -628562744);
            class106.field1642.method1149(var2 + class213.field3249, (byte) 119);
            class106.field1642.method1149(var7, (byte) -36);
        }
        if (var6 == 51) {
            class106.field1642.method753(124, 75);
            class242.field3874++;
            class106.field1642.method1174((byte) -32, var3);
            class220 var26 = class68.method524((byte) -80, var3);
            if (var26.field3470 != null && var26.field3470[0][0] == 5) {
                int var27 = var26.field3470[0][1];
                if (class285.field4461[var27] != var26.field3388[0]) {
                    class285.field4461[var27] = var26.field3388[0];
                    class137.method992(true, var27);
                }
            }
        }
        if (var6 == 26) {
            class300.field4692++;
            class106.field1642.method753(0, 148);
            class106.field1642.method1161(var2, 128);
            class106.field1642.method1161(var7, 128);
            class106.field1642.method1182((byte) 54, var3);
            class68.field1130 = 0;
            class132.field2083 = class68.method524((byte) -122, var3);
            class51.field833 = var2;
        }
        if (var6 == 29) {
            class217.field3297++;
            class317.field4950 = class47.field776;
            class233.field3691 = class205.field3084;
            class313.field4865 = 0;
            class222.field3535 = 2;
            class106.field1642.method753(arg1 + 247, 108);
            class106.field1642.method1149((int) (var4 >>> 32) & Integer.MAX_VALUE, (byte) 121);
            class106.field1642.method1161(class342.field5328 + var3, 128);
            class106.field1642.method1161(var2 + class213.field3249, arg1 ^ 0xFFFFFF06);
            class106.field1642.method1132((byte) 29, class53.field902[82] ? 1 : 0);
        }
        if (var6 == 34 || var6 == 1003) {
            class89.method647(true, class275.field4252[arg0], var2, var3, var7);
        }
        if (var6 == 14) {
            class33 var28 = class254.field3992[var7];
            if (var28 != null) {
                class98.field1565++;
                class233.field3691 = class205.field3084;
                class313.field4865 = 0;
                class317.field4950 = class47.field776;
                class222.field3535 = 2;
                class106.field1642.method753(-58, 221);
                class106.field1642.method1135(true, class53.field902[82] ? 1 : 0);
                class106.field1642.method1161(var7, arg1 + 250);
            }
        }
        if (var6 == 13) {
            class313 var29 = class254.field3989[var7];
            if (var29 != null) {
                class222.field3535 = 2;
                class317.field4950 = class47.field776;
                class313.field4865 = 0;
                class233.field3691 = class205.field3084;
                class106.field1642.method753(arg1 + 80, 101);
                class106.field1642.method1177(-18147, class53.field902[82] ? 1 : 0);
                class207.field3178++;
                class106.field1642.method1149(var7, (byte) 84);
            }
        }
        if (var6 == 38) {
            class313.field4865 = 0;
            class233.field3691 = class205.field3084;
            class222.field3535 = 2;
            class70.field1155++;
            class317.field4950 = class47.field776;
            class106.field1642.method753(-4, 4);
            class106.field1642.method1149(class60.field978, (byte) 122);
            class106.field1642.method1150(var7, arg1 - 628562622);
            class106.field1642.method1132((byte) 29, class53.field902[82] ? 1 : 0);
            class106.field1642.method1149(class342.field5328 + var3, (byte) -33);
            class106.field1642.method1171(class53.field892, -79);
            class106.field1642.method1150(var2 + class213.field3249, -628562744);
            class106.field1642.method1161(class315.field4913, 128);
        }
        if (var6 == 8) {
            class313.field4865 = 0;
            class317.field4950 = class47.field776;
            class222.field3535 = 2;
            class233.field3691 = class205.field3084;
            class230.field3652++;
            class106.field1642.method753(126, 41);
            class106.field1642.method1159(class53.field902[82] ? 1 : 0, 61);
            class106.field1642.method1161(var3 + class342.field5328, 128);
            class106.field1642.method1130(-125, class213.field3249 + var2);
            class106.field1642.method1149((int) (var4 >>> 32) & Integer.MAX_VALUE, (byte) -92);
        }
        if (var6 == 57) {
            class33 var30 = class254.field3992[var7];
            if (var30 != null) {
                class222.field3535 = 2;
                class226.field3594++;
                class233.field3691 = class205.field3084;
                class317.field4950 = class47.field776;
                class313.field4865 = 0;
                class106.field1642.method753(-32, 19);
                class106.field1642.method1130(-128, var7);
                class106.field1642.method1177(-18147, class53.field902[82] ? 1 : 0);
            }
        }
        if (var6 == 45) {
            class285.field4464++;
            class106.field1642.method753(0, 118);
            class106.field1642.method1130(-125, var2);
            class106.field1642.method1161(var7, 128);
            class106.field1642.method1171(var3, -51);
            class68.field1130 = 0;
            class132.field2083 = class68.method524((byte) -122, var3);
            class51.field833 = var2;
        }
        if (var6 == 11) {
            class242.field3874++;
            class106.field1642.method753(124, 75);
            class106.field1642.method1174((byte) -32, var3);
            class220 var31 = class68.method524((byte) -115, var3);
            if (var31.field3470 != null && var31.field3470[0][0] == 5) {
                int var32 = var31.field3470[0][1];
                class285.field4461[var32] = 1 - class285.field4461[var32];
                class137.method992(true, var32);
            }
        }
        if (var6 == 25) {
            class33 var33 = class254.field3992[var7];
            if (var33 != null) {
                class313.field4865 = 0;
                class233.field3691 = class205.field3084;
                class222.field3535 = 2;
                class317.field4950 = class47.field776;
                class63.field1008++;
                class106.field1642.method753(124, 71);
                class106.field1642.method1135(true, class53.field902[82] ? 1 : 0);
                class106.field1642.method1130(-122, var7);
            }
        }
        if (var6 == 1006) {
            class313.field4865 = 0;
            class233.field3691 = class205.field3084;
            class317.field4950 = class47.field776;
            class222.field3535 = 2;
            class274.field4240++;
            class106.field1642.method753(-78, 117);
            class106.field1642.method1150(var7, -628562744);
        }
        if (var6 == 5) {
            class106.field1642.method753(-12, 44);
            class335.field5239++;
            class106.field1642.method1149(var2, (byte) -86);
            class106.field1642.method1182((byte) 77, var3);
            class106.field1642.method1161(var7, arg1 ^ 0xFFFFFF06);
            class68.field1130 = 0;
            class132.field2083 = class68.method524((byte) -106, var3);
            class51.field833 = var2;
        }
        if (var6 == 1007) {
            class233.field3691 = class205.field3084;
            class238.field3789++;
            class313.field4865 = 0;
            class317.field4950 = class47.field776;
            class222.field3535 = 2;
            class106.field1642.method753(-113, 33);
            class106.field1642.method1130(-127, var2 + class213.field3249);
            class106.field1642.method1150(class342.field5328 + var3, -628562744);
            class106.field1642.method1161((int) (var4 >>> 32) & Integer.MAX_VALUE, 128);
            class106.field1642.method1177(-18147, class53.field902[82] ? 1 : 0);
        }
        if (var6 == 3 && class303.field4728 == null) {
            class20.method157(var3, var2, arg1 + 74);
            class303.field4728 = class177.method1263(var3, -107, var2);
            class26.method241(3095, class303.field4728);
        }
        if (arg1 != -122) {
            method2309(true, false, (class220) null, -81, -30);
        }
        if (var6 == 16) {
            class53.field894++;
            class317.field4950 = class47.field776;
            class313.field4865 = 0;
            class233.field3691 = class205.field3084;
            class222.field3535 = 2;
            class106.field1642.method753(3, 127);
            class106.field1642.method1161(class52.field868, arg1 + 250);
            class106.field1642.method1132((byte) 29, class53.field902[82] ? 1 : 0);
            class106.field1642.method1161(var2 + class213.field3249, 128);
            class106.field1642.method1155(1949939600, class224.field3573);
            class106.field1642.method1150(Integer.MAX_VALUE & (int) (var4 >>> 32), arg1 - 628562622);
            class106.field1642.method1130(arg1 - 5, class342.field5328 + var3);
        }
        if (var6 == 42) {
            class313.field4865 = 0;
            class222.field3535 = 2;
            class317.field4950 = class47.field776;
            class233.field3691 = class205.field3084;
            class303.field4730++;
            class106.field1642.method753(125, 229);
            class106.field1642.method1130(arg1 - 5, class342.field5328 + var3);
            class106.field1642.method1132((byte) 29, class53.field902[82] ? 1 : 0);
            class106.field1642.method1150(Integer.MAX_VALUE & (int) (var4 >>> 32), arg1 ^ 0x25771B4E);
            class106.field1642.method1130(-121, var2 + class213.field3249);
        }
        if (var6 == 1001) {
            class233.field3691 = class205.field3084;
            class317.field4950 = class47.field776;
            class313.field4865 = 0;
            class222.field3535 = 2;
            class106.field1642.method753(122, 226);
            class106.field1642.method1150(var7, -628562744);
            class272.field4220++;
        }
        if (var6 == 1002) {
            class222.field3535 = 2;
            class313.field4865 = 0;
            class317.field4950 = class47.field776;
            class233.field3691 = class205.field3084;
            class313 var34 = class254.field3989[var7];
            if (var34 != null) {
                class206 var35 = var34.field4859;
                if (var35.field3120 != null) {
                    var35 = var35.method1465(arg1 ^ 0xFFFFFFCB);
                }
                if (var35 != null) {
                    class106.field1642.method753(-128, 198);
                    class112.field1734++;
                    class106.field1642.method1149(var35.field3146, (byte) 90);
                }
            }
        }
        if (var6 != 9) {
            if (class313.field4858 != 0) {
                class313.field4858 = 0;
                class26.method241(3095, class68.method524((byte) -118, class53.field892));
            }
            if (class35.field545) {
                class216.method1530(arg1 ^ 0x50E6);
            }
            if (class132.field2083 != null && class68.field1130 == 0) {
                class26.method241(3095, class132.field2083);
            }
            return;
        }
        class216.method1530(-20640);
        class220 var36 = class68.method524((byte) -108, var3);
        class60.field978 = var7;
        class53.field892 = var3;
        class313.field4858 = 1;
        class315.field4913 = var2;
        class26.method241(arg1 + 3217, var36);
        class136.field2149 = "<col=ff9040>" + class237.method1657(2, var7).field4650 + "<col=ffffff>";
        if (class136.field2149 == null) {
            class136.field2149 = "null";
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLkh;I)V", line = 1122)
    private final void method2305(byte arg0, class166 arg1, int arg2) {
        if (arg2 == 5) {
            this.field5161 = arg1.method1151(-94);
        }
        field5174++;
        if (arg0 <= 39) {
            method2310(53);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 1138)
    public static void method2306(int arg0) {
        field5169 = null;
        field5162 = null;
        field5166 = null;
        if (arg0 != 230) {
            method2306(86);
        }
        field5163 = null;
        field5167 = null;
        field5173 = null;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V", line = 1153)
    public static final void method2307(int arg0) {
        field5172++;
        class200.field3001.method2174(-10385);
        if (arg0 == -7703) {
            class130.field2035.method2174(arg0 ^ 0x3686);
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)Lpb;", line = 1165)
    public static final class2 method2308(int arg0) {
        field5164++;
        if (arg0 != 0) {
            method2308(-92);
        }
        return class214.field3256;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZZLtb;II)V", line = 1183)
    public static final void method2309(boolean arg0, boolean arg1, class220 arg2, int arg3, int arg4) {
        if (!arg1) {
            method2310(-4);
        }
        int var5 = arg2.field3526;
        if (arg2.field3417 == 0) {
            arg2.field3526 = arg2.field3405;
        } else if (arg2.field3417 == 1) {
            arg2.field3526 = arg3 - arg2.field3405;
        } else if (arg2.field3417 == 2) {
            arg2.field3526 = arg2.field3405 * arg3 >> 14;
        } else if (arg2.field3417 == 3) {
            if (arg2.field3468 == 2) {
                arg2.field3526 = (arg2.field3405 - 1) * arg2.field3494 + arg2.field3405 * 32;
            } else if (arg2.field3468 == 7) {
                arg2.field3526 = arg2.field3405 * 115 + ((arg2.field3405 - 1) * arg2.field3494);
            }
        }
        field5170++;
        int var6 = arg2.field3458;
        if (arg2.field3431 == 0) {
            arg2.field3458 = arg2.field3360;
        } else if (arg2.field3431 == 1) {
            arg2.field3458 = arg4 - arg2.field3360;
        } else if (arg2.field3431 == 2) {
            arg2.field3458 = arg2.field3360 * arg4 >> 14;
        } else if (arg2.field3431 == 3) {
            if (arg2.field3468 == 2) {
                arg2.field3458 = (arg2.field3360 - 1) * arg2.field3411 + arg2.field3360 * 32;
            } else if (arg2.field3468 == 7) {
                arg2.field3458 = (arg2.field3360 - 1) * arg2.field3411 + arg2.field3360 * 12;
            }
        }
        if (arg2.field3417 == 4) {
            arg2.field3526 = arg2.field3481 * arg2.field3458 / arg2.field3379;
        }
        if (arg2.field3431 == 4) {
            arg2.field3458 = arg2.field3526 * arg2.field3379 / arg2.field3481;
        }
        if (class175.field2653 && (client.method393(arg2).field2403 != 0 || arg2.field3468 == 0)) {
            if (arg2.field3458 < 5 && arg2.field3526 < 5) {
                arg2.field3526 = 5;
                arg2.field3458 = 5;
            } else {
                if (arg2.field3458 <= 0) {
                    arg2.field3458 = 5;
                }
                if (arg2.field3526 <= 0) {
                    arg2.field3526 = 5;
                }
            }
        }
        if (arg2.field3427 == 1337) {
            class107.field1675 = arg2;
        }
        if (arg0 && arg2.field3519 != null && (arg2.field3526 != var5 || arg2.field3458 != var6)) {
            class240 var7 = new class240();
            var7.field3826 = arg2.field3519;
            var7.field3834 = arg2;
            class26.field403.method632(-78, var7);
        }
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V", line = 1286)
    public static final void method2310(int arg0) {
        if (class98.field1568 != null) {
            class51 var1 = new class51();
            for (int var2 = 0; var2 < 13; var2++) {
                for (int var3 = 0; var3 < 13; var3++) {
                    class98.field1568[var2][var3] = var1;
                }
            }
        }
        field5175++;
        if (arg0 != 0) {
            field5163 = (String) null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ICI)C", line = 1323)
    public static final char method2311(int arg0, char arg1, int arg2) {
        field5171++;
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else {
            if (arg0 <= 92) {
                method2304(115, (byte) -92);
            }
            if (arg1 == 'Ÿ') {
                return 'Y';
            } else {
                return arg1;
            }
        }
    }
}
