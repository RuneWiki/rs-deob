import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class120 {

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "[I")
    private int[] field2990 = new int[256];

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "[I")
    private int[] field2991 = new int[256];

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lpd;")
    private static class94 field2984 = class28.method249(64, "Please reload this page)3");

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Lpd;")
    public static class94 field2980 = class28.method249(69, ": ");

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Lpd;")
    public static class94 field2998 = field2984;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Lvc;")
    public static class128 field2993 = new class128(100);

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "Lpd;")
    public static class94 field3004 = class28.method249(-84, "Angreifen");

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "[Lpd;")
    public static class94[] field3008 = new class94[200];

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "Lpd;")
    public static class94 field3007 = class28.method249(-60, "(Udns");

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public static volatile int field3006 = 0;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "Lpd;")
    public static class94 field3011 = class28.method249(-95, "null");

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "Lpd;")
    private static class94 field3010 = class28.method249(-114, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "Lpd;")
    public static class94 field3012 = field3010;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "Lpd;")
    public static class94 field3003 = class28.method249(114, "Spiel)2Engine wird gestartet)3)3)3");

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "Lpd;")
    private static class94 field3013 = class28.method249(-100, "Error loading your profile)3");

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "Lpd;")
    public static class94 field3005 = field3013;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "Lpd;")
    public static class94 field3009 = class28.method249(27, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    private int field2983;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    private int field2994;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    private int field2997;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    private int field3002;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Ls;")
    public static class111 field2982;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lea;")
    public static class25 field2987;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "Lmb;")
    public static class73 field3014;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V", line = 11)
    public static final void method898(int arg0, int arg1) {
        field2999++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class9.field237[arg1];
        int var3 = class134.field3273[arg1];
        int var4 = class38.field995[arg1];
        int var5 = class101.field2560[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        if (class110.field2741 != 0 && var4 != 1003) {
            class110.field2741 = 0;
            class73.field1781 = true;
        }
        if (var4 == 32 || var4 == 37 || var4 == 30 || var4 == 10) {
            class94 var6 = class39.field1008[arg1];
            int var7 = var6.method711(arg0 - 204, class43.field1088);
            if (var7 != -1) {
                long var8 = var6.method687(var7 + 5, arg0 ^ 0xFFFFFF2F).method718(11083).method709((byte) 122);
                if (var4 == 32) {
                    class127.method1006(64, var8);
                }
                if (var4 == 37) {
                    class86.method635(arg0 - 24324, var8);
                }
                if (var4 == 30) {
                    method901((byte) -106, var8);
                }
                if (var4 == 10) {
                    class128.method1014(var8, (byte) 114);
                }
            }
        }
        if (var4 == 13) {
            class79.method590(-1974, var3, var5, var2);
        }
        if (var4 == 51 && class111.field2809 == -1) {
            class85.method621(7, 0, var3);
            class111.field2809 = var3;
        }
        if (var4 == 18) {
            class89 var10 = class85.field2138[var5];
            if (var10 != null) {
                class123.method973(1, 0, (byte) -49, var10.field219[0], 1, var10.field165[0], false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
                class47.field1144 = class63.field1526;
                class126.field3170++;
                class30.field875 = 0;
                class19.field524 = class28.field788;
                class4.field87 = 2;
                class107.field2670.method326(212, -106);
                class107.field2670.method932(var5, -112);
                class107.field2670.method917(class17.field422, true);
                class107.field2670.method919(class46.field1132, 16711680);
                class107.field2670.method947(-154901368, class107.field2669);
            }
        }
        if (var4 == 33) {
            boolean var11 = class123.method973(0, 0, (byte) -57, var3, 0, var2, false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
            class134.field3270++;
            if (!var11) {
                class123.method973(1, 0, (byte) -124, var3, 1, var2, false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
            }
            class30.field875 = 0;
            class47.field1144 = class63.field1526;
            class19.field524 = class28.field788;
            class4.field87 = 2;
            class107.field2670.method326(151, arg0 - 272);
            class107.field2670.method944((byte) 38, var5);
            class107.field2670.method947(arg0 ^ 0xF6C46422, var2 + class31.field891);
            class107.field2670.method944((byte) 38, var3 + class45.field1117);
        }
        if (var4 == 19) {
            boolean var13 = class123.method973(0, 0, (byte) -103, var3, 0, var2, false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
            class57.field1456++;
            if (!var13) {
                class123.method973(1, 0, (byte) -74, var3, 1, var2, false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
            }
            class30.field875 = 0;
            class4.field87 = 2;
            class47.field1144 = class63.field1526;
            class19.field524 = class28.field788;
            class107.field2670.method326(188, -114);
            class107.field2670.method944((byte) 38, class45.field1117 + var3);
            class107.field2670.method944((byte) 38, var5);
            class107.field2670.method919(class31.field891 + var2, arg0 ^ 0xFF00AA);
        }
        if (var4 == 35) {
            class82.field2098++;
            class107.field2670.method326(236, arg0 - 294);
            class107.field2670.method929(var3, true);
            class107.field2670.method919(var5, 16711680);
            class107.field2670.method932(var2, 92);
            class23.field593 = var3;
            class134.field3297 = 2;
            if (var3 >> 16 == class103.field2603) {
                class134.field3297 = 1;
            }
            if (var3 >> 16 == class115.field2925) {
                class134.field3297 = 3;
            }
            class102.field2586 = 0;
            class77.field1957 = var2;
        }
        if (var4 == 23) {
            class89 var15 = class85.field2138[var5];
            if (var15 != null) {
                class73.field1801++;
                class123.method973(1, 0, (byte) -94, var15.field219[0], 1, var15.field165[0], false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
                class30.field875 = 0;
                class19.field524 = class28.field788;
                class4.field87 = 2;
                class47.field1144 = class63.field1526;
                class107.field2670.method326(122, arg0 ^ 0xFFFFFF2C);
                class107.field2670.method947(arg0 ^ 0xF6C46422, var5);
            }
        }
        if (var4 == 46) {
            boolean var16 = class123.method973(0, 0, (byte) -112, var3, 0, var2, false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
            class80.field2033++;
            if (!var16) {
                class123.method973(1, 0, (byte) -124, var3, 1, var2, false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
            }
            class4.field87 = 2;
            class30.field875 = 0;
            class19.field524 = class28.field788;
            class47.field1144 = class63.field1526;
            class107.field2670.method326(73, -109);
            class107.field2670.method964(class17.field422, 1526613544);
            class107.field2670.method947(-154901368, class107.field2669);
            class107.field2670.method919(class46.field1132, 16711680);
            class107.field2670.method947(-154901368, class45.field1117 + var3);
            class107.field2670.method947(-154901368, var5);
            class107.field2670.method947(-154901368, var2 + class31.field891);
        }
        if (var4 == 22) {
            class80 var18 = class28.field803[var5];
            if (var18 != null) {
                class115.field2901++;
                class123.method973(1, 0, (byte) -51, var18.field219[0], 1, var18.field165[0], false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
                class19.field524 = class28.field788;
                class30.field875 = 0;
                class4.field87 = 2;
                class47.field1144 = class63.field1526;
                class107.field2670.method326(235, arg0 - 280);
                class107.field2670.method940(arg0 - 170, class17.field422);
                class107.field2670.method919(class46.field1132, 16711680);
                class107.field2670.method919(class107.field2669, 16711680);
                class107.field2670.method947(-154901368, var5);
            }
        }
        if (var4 == 5) {
            class80 var19 = class28.field803[var5];
            if (var19 != null) {
                class123.method973(1, 0, (byte) -112, var19.field219[0], 1, var19.field165[0], false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
                class30.field875 = 0;
                class133.field3256++;
                class19.field524 = class28.field788;
                class47.field1144 = class63.field1526;
                class4.field87 = 2;
                class107.field2670.method326(161, -104);
                class107.field2670.method919(var5, 16711680);
            }
        }
        if (var4 == 26) {
            class21.field569++;
            class107.field2670.method326(20, arg0 ^ 0xFFFFFF28);
            class107.field2670.method932(var2, 67);
            class107.field2670.method917(var3, true);
            class107.field2670.method947(-154901368, var5);
            class134.field3297 = 2;
            class102.field2586 = 0;
            class23.field593 = var3;
            if (var3 >> 16 == class103.field2603) {
                class134.field3297 = 1;
            }
            if (var3 >> 16 == class115.field2925) {
                class134.field3297 = 3;
            }
            class77.field1957 = var2;
        }
        if (var4 == 56) {
            class47.field1147++;
            class115.method860(var3, 2607, var2, var5);
            class107.field2670.method326(77, -114);
            class107.field2670.method947(arg0 ^ 0xF6C46422, class31.field891 + var2);
            class107.field2670.method947(arg0 ^ 0xF6C46422, class45.field1117 + var3);
            class107.field2670.method932(var5 >> 14 & 0x7FFF, -68);
        }
        if (var4 == 1004) {
            class4.field87 = 2;
            class20.field529++;
            class19.field524 = class28.field788;
            class47.field1144 = class63.field1526;
            class30.field875 = 0;
            class107.field2670.method326(156, arg0 ^ 0xFFFFFF2D);
            class107.field2670.method947(-154901368, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 2) {
            class20.field541++;
            class107.field2670.method326(170, arg0 ^ 0xFFFFFF2A);
            class107.field2670.method917(var3, true);
            class77 var20 = class63.method466((byte) -38, var3);
            if (var20.field1937 != null && var20.field1937[0][0] == 5) {
                int var21 = var20.field1937[0][1];
                if (class37.field953[var21] != var20.field1952[0]) {
                    class37.field953[var21] = var20.field1952[0];
                    class50.method402(117, var21);
                    class135.field3323 = true;
                }
            }
        }
        if (var4 == 8) {
            class107.field2670.method326(21, -110);
            class40.field1027++;
            class107.field2670.method917(var3, true);
            class107.field2670.method919(var5, 16711680);
            class107.field2670.method944((byte) 38, var2);
            class23.field593 = var3;
            class102.field2586 = 0;
            class134.field3297 = 2;
            if (var3 >> 16 == class103.field2603) {
                class134.field3297 = 1;
            }
            class77.field1957 = var2;
            if (var3 >> 16 == class115.field2925) {
                class134.field3297 = 3;
            }
        }
        if (var4 == 3) {
            class107.field2670.method326(60, -110);
            class79.field1996++;
            class107.field2670.method940(arg0 ^ 0xAA, class17.field422);
            class107.field2670.method947(arg0 ^ 0xF6C46422, var5);
            class107.field2670.method932(var2, -58);
            class107.field2670.method932(class107.field2669, -75);
            class107.field2670.method932(class46.field1132, arg0 - 118);
            class107.field2670.method929(var3, true);
            class23.field593 = var3;
            class77.field1957 = var2;
            class134.field3297 = 2;
            class102.field2586 = 0;
            if (var3 >> 16 == class103.field2603) {
                class134.field3297 = 1;
            }
            if (var3 >> 16 == class115.field2925) {
                class134.field3297 = 3;
            }
        }
        if (var4 == 17) {
            class115.method860(var3, 2607, var2, var5);
            class74.field1807++;
            class107.field2670.method326(139, -101);
            class107.field2670.method932(class45.field1117 + var3, -106);
            class107.field2670.method919(class31.field891 + var2, arg0 ^ 0xFF00AA);
            class107.field2670.method932(var5 >> 14 & 0x7FFF, arg0 ^ 0xFFFFFF61);
        }
        if (var4 == 43) {
            class101.field2544++;
            class107.field2670.method326(126, -103);
            class107.field2670.method919(var2, 16711680);
            class107.field2670.method947(-154901368, var5);
            class107.field2670.method940(0, var3);
            class102.field2586 = 0;
            class77.field1957 = var2;
            class134.field3297 = 2;
            if (var3 >> 16 == class103.field2603) {
                class134.field3297 = 1;
            }
            class23.field593 = var3;
            if (var3 >> 16 == class115.field2925) {
                class134.field3297 = 3;
            }
        }
        if (var4 == 21) {
            boolean var22 = class123.method973(0, 0, (byte) -60, var3, 0, var2, false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
            if (!var22) {
                class123.method973(1, 0, (byte) -83, var3, 1, var2, false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
            }
            class47.field1144 = class63.field1526;
            class19.field524 = class28.field788;
            class79.field2000++;
            class30.field875 = 0;
            class4.field87 = 2;
            class107.field2670.method326(251, arg0 - 293);
            class107.field2670.method947(-154901368, class31.field891 + var2);
            class107.field2670.method947(arg0 - 154901538, var5);
            class107.field2670.method917(class99.field2514, true);
            class107.field2670.method947(-154901368, var3 + class45.field1117);
            class107.field2670.method932(class97.field2481, 46);
        }
        if (var4 == 1001) {
            class47.field1144 = class63.field1526;
            class4.field87 = 2;
            class19.field524 = class28.field788;
            class30.field875 = 0;
            class80 var24 = class28.field803[var5];
            if (var24 != null) {
                class113 var25 = var24.field2037;
                if (var25.field2850 != null) {
                    var25 = var25.method836(-124);
                }
                if (var25 != null) {
                    class107.field2670.method326(204, -126);
                    class107.field2670.method947(arg0 - 154901538, var25.field2840);
                    class26.field701++;
                }
            }
        }
        if (var4 == 14) {
            class94 var26 = class39.field1008[arg1];
            int var27 = var26.method711(arg0 ^ 0xFFFFFF74, class43.field1088);
            if (var27 != -1) {
                if (class103.field2603 == -1) {
                    class1.method1((byte) -124);
                    if (class73.field1796 != -1) {
                        class8.field236 = var26.method687(var27 + 5, -123).method718(11083);
                        class19.field506 = class103.field2603 = class73.field1796;
                        class122.field3100 = false;
                    }
                } else {
                    class41.method311(0, class8.field230, (byte) 73, class79.field2012);
                }
            }
        }
        if (var4 == 55) {
            if (class62.field1516) {
                class64.field1585.method194(var2 - 4, var3 - 4);
            } else {
                class64.field1585.method194(class28.field788 - 4, class63.field1526 - 4);
            }
        }
        if (var4 == 42) {
            class94 var28 = class39.field1008[arg1];
            int var29 = var28.method711(arg0 ^ 0xFFFFFF74, class43.field1088);
            if (var29 != -1) {
                long var30 = var28.method687(var29 + 5, -123).method718(arg0 ^ 0x2BE1).method709((byte) 93);
                int var32 = -1;
                for (int var33 = 0; var33 < class77.field1963; var33++) {
                    if (class10.field265[var33] == var30) {
                        var32 = var33;
                        break;
                    }
                }
                if (var32 != -1 && class72.field1723[var32] > 0) {
                    class79.field1995 = true;
                    class73.field1781 = true;
                    class90.field2328 = 3;
                    class8.field226 = class8.field230;
                    class110.field2741 = 0;
                    class119.field2975 = class10.field265[var32];
                    class8.field227 = class4.method20(new class94[] { class108.field2684, field3008[var32] }, true);
                }
            }
        }
        if (var4 == 52) {
            class28.field782++;
            boolean var34 = class123.method973(0, 0, (byte) -90, var3, 0, var2, false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
            if (!var34) {
                class123.method973(1, 0, (byte) -75, var3, 1, var2, false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
            }
            class47.field1144 = class63.field1526;
            class19.field524 = class28.field788;
            class30.field875 = 0;
            class4.field87 = 2;
            class107.field2670.method326(127, -118);
            class107.field2670.method944((byte) 38, class31.field891 + var2);
            class107.field2670.method919(var5, arg0 + 16711510);
            class107.field2670.method944((byte) 38, class45.field1117 + var3);
        }
        if (var4 == 4) {
            class77 var36 = class63.method466((byte) -38, var3);
            class113.method840((byte) -90);
            class67.field1647 = var36.field1923;
            class126.field3178 = 0;
            class135.field3323 = true;
            class99.field2514 = var3;
            class97.field2481 = -1;
            class31.field882 = 1;
            class19.field526 = var36.field1861;
            class66.field1632 = class4.method20(new class94[] { class7.field133, var36.field1874, class43.field1088 }, true);
            if (class67.field1647 == 16) {
                class135.field3323 = true;
                class121.field3033 = true;
                class92.field2361 = 3;
            }
            return;
        }
        if (var4 == 25 && class115.method860(var3, 2607, var2, var5)) {
            class107.field2670.method326(63, arg0 ^ 0xFFFFFF28);
            class107.field2670.method940(0, class17.field422);
            class102.field2574++;
            class107.field2670.method919(class46.field1132, 16711680);
            class107.field2670.method919(class45.field1117 + var3, arg0 ^ 0xFF00AA);
            class107.field2670.method947(-154901368, var5 >> 14 & 0x7FFF);
            class107.field2670.method919(class31.field891 + var2, 16711680);
            class107.field2670.method944((byte) 38, class107.field2669);
        }
        if (var4 == 24) {
            class45.field1107++;
            class107.field2670.method326(233, -110);
            class107.field2670.method932(var2, -127);
            class107.field2670.method940(0, var3);
            class107.field2670.method932(var5, -108);
            class77.field1957 = var2;
            class102.field2586 = 0;
            class134.field3297 = 2;
            class23.field593 = var3;
            if (var3 >> 16 == class103.field2603) {
                class134.field3297 = 1;
            }
            if (var3 >> 16 == class115.field2925) {
                class134.field3297 = 3;
            }
        }
        if (var4 == 48) {
            class115.method860(var3, 2607, var2, var5);
            class76.field1851++;
            class107.field2670.method326(187, arg0 - 282);
            class107.field2670.method947(arg0 ^ 0xF6C46422, var5 >> 14 & 0x7FFF);
            class107.field2670.method947(-154901368, class45.field1117 + var3);
            class107.field2670.method919(class31.field891 + var2, 16711680);
        }
        if (var4 == 38) {
            class89 var37 = class85.field2138[var5];
            if (var37 != null) {
                class123.method973(1, 0, (byte) -66, var37.field219[0], 1, var37.field165[0], false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
                class4.field87 = 2;
                class126.field3167++;
                class47.field1144 = class63.field1526;
                class30.field875 = 0;
                class19.field524 = class28.field788;
                class107.field2670.method326(56, -122);
                class107.field2670.method919(var5, 16711680);
            }
        }
        if (var4 == 39) {
            class110.field2714++;
            boolean var38 = class123.method973(0, 0, (byte) -89, var3, 0, var2, false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
            if (!var38) {
                class123.method973(1, 0, (byte) -88, var3, 1, var2, false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
            }
            class4.field87 = 2;
            class19.field524 = class28.field788;
            class47.field1144 = class63.field1526;
            class30.field875 = 0;
            class107.field2670.method326(105, -121);
            class107.field2670.method919(var5, arg0 ^ 0xFF00AA);
            class107.field2670.method947(arg0 ^ 0xF6C46422, var2 + class31.field891);
            class107.field2670.method919(class45.field1117 + var3, 16711680);
        }
        if (var4 == 7 && class115.method860(var3, 2607, var2, var5)) {
            class89.field2283++;
            class107.field2670.method326(155, -128);
            class107.field2670.method932(var5 >> 14 & 0x7FFF, 23);
            class107.field2670.method947(arg0 - 154901538, var3 - -class45.field1117);
            class107.field2670.method947(-154901368, class31.field891 + var2);
            class107.field2670.method932(class97.field2481, 34);
            class107.field2670.method940(0, class99.field2514);
        }
        if (var4 == 45) {
            class80 var40 = class28.field803[var5];
            if (var40 != null) {
                class123.method973(1, 0, (byte) -55, var40.field219[0], 1, var40.field165[0], false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
                class47.field1144 = class63.field1526;
                class19.field524 = class28.field788;
                class30.field875 = 0;
                class20.field544++;
                class4.field87 = 2;
                class107.field2670.method326(250, -101);
                class107.field2670.method944((byte) 38, var5);
                class107.field2670.method940(arg0 ^ 0xAA, class99.field2514);
                class107.field2670.method919(class97.field2481, 16711680);
            }
        }
        if (var4 == 40) {
            class107.field2670.method326(87, arg0 ^ 0xFFFFFF33);
            class107.field2670.method944((byte) 38, var5);
            class54.field1367++;
            class107.field2670.method919(var2, 16711680);
            class107.field2670.method929(var3, true);
            class23.field593 = var3;
            class134.field3297 = 2;
            if (var3 >> 16 == class103.field2603) {
                class134.field3297 = 1;
            }
            if (var3 >> 16 == class115.field2925) {
                class134.field3297 = 3;
            }
            class102.field2586 = 0;
            class77.field1957 = var2;
        }
        if (var4 == 11) {
            class23.field600++;
            class107.field2670.method326(196, -117);
            class107.field2670.method944((byte) 38, var2);
            class107.field2670.method944((byte) 38, var5);
            class107.field2670.method964(var3, 1526613544);
            class23.field593 = var3;
            class102.field2586 = 0;
            class134.field3297 = 2;
            if (var3 >> 16 == class103.field2603) {
                class134.field3297 = 1;
            }
            class77.field1957 = var2;
            if (var3 >> 16 == class115.field2925) {
                class134.field3297 = 3;
            }
        }
        if (var4 == 12) {
            class43.field1089++;
            class115.method860(var3, 2607, var2, var5);
            class107.field2670.method326(253, -104);
            class107.field2670.method947(arg0 - 154901538, class31.field891 + var2);
            class107.field2670.method932(var5 >> 14 & 0x7FFF, -108);
            class107.field2670.method947(-154901368, var3 + class45.field1117);
        }
        if (var4 == 34) {
            class30.field863++;
            class107.field2670.method326(2, -101);
            class107.field2670.method944((byte) 38, var2);
            class107.field2670.method932(var5, -84);
            class107.field2670.method940(0, var3);
            class134.field3297 = 2;
            class102.field2586 = 0;
            if (var3 >> 16 == class103.field2603) {
                class134.field3297 = 1;
            }
            class23.field593 = var3;
            if (var3 >> 16 == class115.field2925) {
                class134.field3297 = 3;
            }
            class77.field1957 = var2;
        }
        if (var4 == 20) {
            class107.field2670.method326(245, -116);
            class107.field2670.method919(var2, 16711680);
            class42.field1063++;
            class107.field2670.method964(class99.field2514, 1526613544);
            class107.field2670.method964(var3, 1526613544);
            class107.field2670.method919(class97.field2481, arg0 + 16711510);
        }
        if (var4 == 1005) {
            class115.method860(var3, 2607, var2, var5);
            class107.field2670.method326(150, -109);
            class89.field2314++;
            class107.field2670.method944((byte) 38, class31.field891 + var2);
            class107.field2670.method932(class45.field1117 + var3, -88);
            class107.field2670.method932(var5 >> 14 & 0x7FFF, arg0 - 75);
        }
        if (var4 == 1) {
            class80 var41 = class28.field803[var5];
            if (var41 != null) {
                class73.field1791++;
                class123.method973(1, 0, (byte) -61, var41.field219[0], 1, var41.field165[0], false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
                class30.field875 = 0;
                class4.field87 = 2;
                class47.field1144 = class63.field1526;
                class19.field524 = class28.field788;
                class107.field2670.method326(111, -115);
                class107.field2670.method944((byte) 38, var5);
            }
        }
        if (var4 == 49) {
            class89 var42 = class85.field2138[var5];
            if (var42 != null) {
                class123.method973(1, 0, (byte) -118, var42.field219[0], 1, var42.field165[0], false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
                class73.field1800++;
                class47.field1144 = class63.field1526;
                class30.field875 = 0;
                class4.field87 = 2;
                class19.field524 = class28.field788;
                class107.field2670.method326(160, -107);
                class107.field2670.method947(arg0 - 154901538, var5);
            }
        }
        if (var4 == 53) {
            class89 var43 = class85.field2138[var5];
            if (var43 != null) {
                class100.field2530++;
                class123.method973(1, 0, (byte) -65, var43.field219[0], 1, var43.field165[0], false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
                class19.field524 = class28.field788;
                class47.field1144 = class63.field1526;
                class4.field87 = 2;
                class30.field875 = 0;
                class107.field2670.method326(114, arg0 ^ 0xFFFFFF39);
                class107.field2670.method947(-154901368, var5);
            }
        }
        if (var4 == 6) {
            class89 var44 = class85.field2138[var5];
            if (var44 != null) {
                class123.method973(1, 0, (byte) -98, var44.field219[0], 1, var44.field165[0], false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
                class30.field875 = 0;
                class47.field1144 = class63.field1526;
                class19.field524 = class28.field788;
                class4.field87 = 2;
                class107.field2670.method326(62, -127);
                class107.field2658++;
                class107.field2670.method919(var5, 16711680);
            }
        }
        if (var4 == 1002) {
            class47.field1144 = class63.field1526;
            class30.field875 = 0;
            class4.field87 = 2;
            class19.field524 = class28.field788;
            class47.field1145++;
            class107.field2670.method326(128, arg0 ^ 0xFFFFFF26);
            class107.field2670.method919(var5, 16711680);
        }
        if (var4 == 1006) {
            class77 var45 = class63.method466((byte) -38, var3);
            if (var45 == null || var45.field1919[var2] < 100000) {
                class47.field1145++;
                class107.field2670.method326(128, -104);
                class107.field2670.method919(var5, arg0 ^ 0xFF00AA);
            } else {
                class41.method311(0, class8.field230, (byte) 120, class4.method20(new class94[] { class51.method403(var45.field1919[var2], true), class29.field833, class39.method295(var5, 1).field2713 }, true));
            }
            class77.field1957 = var2;
            class23.field593 = var3;
            class102.field2586 = 0;
            class134.field3297 = 2;
            if (var3 >> 16 == class103.field2603) {
                class134.field3297 = 1;
            }
            if (var3 >> 16 == class115.field2925) {
                class134.field3297 = 3;
            }
        }
        if (var4 == 44) {
            class80 var46 = class28.field803[var5];
            if (var46 != null) {
                class123.method973(1, 0, (byte) -110, var46.field219[0], 1, var46.field165[0], false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
                class4.field87 = 2;
                class30.field875 = 0;
                class12.field298++;
                class47.field1144 = class63.field1526;
                class19.field524 = class28.field788;
                class107.field2670.method326(180, -112);
                class107.field2670.method944((byte) 38, var5);
            }
        }
        if (var4 == 41) {
            class113.method840((byte) -90);
            class107.field2669 = var2;
            class135.field3323 = true;
            class17.field422 = var3;
            class46.field1132 = var5;
            class126.field3178 = 1;
            class113.field2848 = class4.method20(new class94[] { class51.field1275, class39.method295(var5, 1).field2713, class43.field1088 }, true);
            if (class113.field2848 == null) {
                class113.field2848 = class8.field175;
            }
            return;
        }
        if (var4 == 27) {
            class41.field1039++;
            class107.field2670.method326(81, arg0 - 297);
            class107.field2670.method947(-154901368, var2);
            class107.field2670.method929(var3, true);
            class107.field2670.method947(arg0 ^ 0xF6C46422, var5);
            class23.field593 = var3;
            class77.field1957 = var2;
            class134.field3297 = 2;
            class102.field2586 = 0;
            if (var3 >> 16 == class103.field2603) {
                class134.field3297 = 1;
            }
            if (var3 >> 16 == class115.field2925) {
                class134.field3297 = 3;
            }
        }
        if (var4 == 54) {
            class80 var47 = class28.field803[var5];
            if (var47 != null) {
                class57.field1455++;
                class123.method973(1, 0, (byte) -105, var47.field219[0], 1, var47.field165[0], false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
                class19.field524 = class28.field788;
                class4.field87 = 2;
                class47.field1144 = class63.field1526;
                class30.field875 = 0;
                class107.field2670.method326(164, -114);
                class107.field2670.method932(var5, arg0 - 295);
            }
        }
        if (var4 == 29) {
            class80 var48 = class28.field803[var5];
            if (var48 != null) {
                class123.method973(1, 0, (byte) -90, var48.field219[0], 1, var48.field165[0], false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
                class4.field87 = 2;
                class115.field2904++;
                class19.field524 = class28.field788;
                class30.field875 = 0;
                class47.field1144 = class63.field1526;
                class107.field2670.method326(119, -112);
                class107.field2670.method932(var5, arg0 ^ 0xD6);
            }
        }
        if (var4 == 15) {
            class66.field1615++;
            class107.field2670.method326(42, arg0 ^ 0xFFFFFF28);
            class107.field2670.method932(var5, arg0 ^ 0xFFFFFF30);
            class107.field2670.method947(arg0 - 154901538, var2);
            class107.field2670.method940(0, var3);
            class102.field2586 = 0;
            class23.field593 = var3;
            class134.field3297 = 2;
            class77.field1957 = var2;
            if (var3 >> 16 == class103.field2603) {
                class134.field3297 = 1;
            }
            if (var3 >> 16 == class115.field2925) {
                class134.field3297 = 3;
            }
        }
        if (var4 == 16) {
            class107.field2670.method326(170, arg0 - 276);
            class107.field2670.method917(var3, true);
            class77 var49 = class63.method466((byte) -38, var3);
            if (var49.field1937 != null && var49.field1937[0][0] == 5) {
                int var50 = var49.field1937[0][1];
                class37.field953[var50] = 1 - class37.field953[var50];
                class50.method402(123, var50);
                class135.field3323 = true;
            }
            class20.field541++;
        }
        if (var4 == 9) {
            class89 var51 = class85.field2138[var5];
            if (var51 != null) {
                class123.method973(1, 0, (byte) -59, var51.field219[0], 1, var51.field165[0], false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
                class4.field87 = 2;
                class19.field524 = class28.field788;
                class47.field1144 = class63.field1526;
                class97.field2468++;
                class30.field875 = 0;
                class107.field2670.method326(84, -105);
                class107.field2670.method947(-154901368, class97.field2481);
                class107.field2670.method944((byte) 38, var5);
                class107.field2670.method929(class99.field2514, true);
            }
        }
        if (var4 == 36) {
            class1.method1((byte) -127);
        }
        if (var4 == 28) {
            boolean var52 = class123.method973(0, 0, (byte) -59, var3, 0, var2, false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
            class133.field3253++;
            if (!var52) {
                class123.method973(1, 0, (byte) -58, var3, 1, var2, false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
            }
            class47.field1144 = class63.field1526;
            class30.field875 = 0;
            class19.field524 = class28.field788;
            class4.field87 = 2;
            class107.field2670.method326(26, -111);
            class107.field2670.method932(class45.field1117 + var3, -115);
            class107.field2670.method919(var5, 16711680);
            class107.field2670.method944((byte) 38, class31.field891 + var2);
        }
        if (var4 == 47) {
            class86.field2173++;
            class107.field2670.method326(162, -118);
            class107.field2670.method919(var2, 16711680);
            class107.field2670.method929(var3, true);
            class107.field2670.method917(class99.field2514, true);
            class107.field2670.method932(class97.field2481, arg0 - 125);
            class107.field2670.method919(var5, 16711680);
            class102.field2586 = 0;
            class23.field593 = var3;
            class134.field3297 = 2;
            if (var3 >> 16 == class103.field2603) {
                class134.field3297 = 1;
            }
            class77.field1957 = var2;
            if (var3 >> 16 == class115.field2925) {
                class134.field3297 = 3;
            }
        }
        if (arg0 != 170) {
            method908(-68, null, null, true);
        }
        if (var4 == 31) {
            class52.method412(class75.field1837, (byte) -22);
            class73.field1781 = true;
            class75.field1837 = -1;
        }
        if (var4 == 57 || var4 == 50) {
            class94 var54 = class39.field1008[arg1];
            int var55 = var54.method711(-34, class43.field1088);
            if (var55 != -1) {
                class94 var56 = var54.method687(var55 + 5, arg0 + -293).method718(11083);
                class94 var57 = var56.method717(16368).method707(-14211);
                boolean var58 = false;
                for (int var59 = 0; var59 < class113.field2886; var59++) {
                    class89 var60 = class85.field2138[class38.field985[var59]];
                    if (var60 != null && var60.field2295 != null && var60.field2295.method692(var57, (byte) -38)) {
                        class123.method973(1, 0, (byte) -77, var60.field219[0], 1, var60.field165[0], false, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], 0);
                        if (var4 == 57) {
                            class126.field3167++;
                            class107.field2670.method326(56, -110);
                            class107.field2670.method919(class38.field985[var59], 16711680);
                        }
                        if (var4 == 50) {
                            class107.field2670.method326(62, arg0 ^ 0xFFFFFF31);
                            class107.field2670.method919(class38.field985[var59], arg0 + 16711510);
                            class107.field2658++;
                        }
                        var58 = true;
                        break;
                    }
                }
                if (!var58) {
                    class41.method311(0, class8.field230, (byte) 80, class4.method20(new class94[] { class85.field2135, var57 }, true));
                }
            }
        }
        if (var4 == 58) {
            boolean var61 = true;
            class77 var62 = class63.method466((byte) -38, var3);
            if (var62.field1896 > 0) {
                var61 = class127.method1002(arg0 - 168, var62);
            }
            if (var61) {
                class20.field541++;
                class107.field2670.method326(170, -120);
                class107.field2670.method917(var3, true);
            }
        }
        if (class126.field3178 != 0) {
            class135.field3323 = true;
            class126.field3178 = 0;
        }
        if (class31.field882 != 0) {
            class113.method840((byte) -90);
            class135.field3323 = true;
        }
        if (var4 != 13) {
            return;
        }
        class77 var64 = class63.method466((byte) -38, var3);
        int var66 = var2;
        if (var64 != null && var64.field1918 != null && var2 != -1 && var64.field1918.length > var2) {
            var64 = var64.field1918[var2];
            var66 = -1;
        }
        if (var64 != null && var64.field1877 != null && var66 == -1) {
            class55.method433(var64.field1877, 0, 0, var5, 100, var64);
            return;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 1221)
    private final void method899(int arg0) {
        field2981++;
        if (arg0 != 1) {
            this.field2983 = 8;
        }
        this.field2997 += ++this.field3002;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2990[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2994 ^= this.field2994 << 13;
                } else {
                    this.field2994 ^= this.field2994 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2994 ^= this.field2994 << 2;
            } else {
                this.field2994 ^= this.field2994 >>> 16;
            }
            this.field2994 += this.field2990[var2 + 128 & 0xFF];
            int var4;
            this.field2990[var2] = var4 = this.field2997 + this.field2994 + this.field2990[class81.method605(var3 >> 2, 255)];
            this.field2991[var2] = this.field2997 = this.field2990[class81.method605(261231, var4) >> 8 >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(JI)Lpd;", line = 1263)
    public static final class94 method900(long arg0, int arg1) {
        field3000++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == (long) arg1) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class98.field2485[(int) (var8 - arg0 * 37L)];
            }
            class94 var7 = new class94();
            var7.field2382 = var6;
            var7.field2396 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BJ)V", line = 1303)
    public static final void method901(byte arg0, long arg1) {
        field2988++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 >= -100) {
            method901((byte) 116, -93L);
        }
        for (int var3 = 0; var3 < class77.field1963; var3++) {
            if (class10.field265[var3] == arg1) {
                class135.field3323 = true;
                class82.field2111++;
                class77.field1963--;
                for (int var4 = var3; var4 < class77.field1963; var4++) {
                    field3008[var4] = field3008[var4 + 1];
                    class72.field1723[var4] = class72.field1723[var4 + 1];
                    class10.field265[var4] = class10.field265[var4 + 1];
                }
                class107.field2670.method326(163, -105);
                class107.field2670.method965(-108, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 1352)
    public static void method902(byte arg0) {
        field3011 = null;
        field3004 = null;
        field3012 = null;
        field2980 = null;
        field3008 = null;
        field3005 = null;
        field3007 = null;
        field3014 = null;
        if (arg0 != 39) {
            method901((byte) 58, -16L);
        }
        field2982 = null;
        field3003 = null;
        field2998 = null;
        field3010 = null;
        field2984 = null;
        field2987 = null;
        field3013 = null;
        field2993 = null;
        field3009 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)I", line = 1380)
    public static final int method903(int arg0, int arg1, int arg2) {
        class75 var3 = (class75) class86.field2185.method19(25239, (long) arg1);
        field2985++;
        if (var3 == null) {
            return -1;
        } else if (~arg0 <= arg2 && arg0 < var3.field1831.length) {
            return var3.field1831[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)Z", line = 1402)
    public static final boolean method904(boolean arg0) {
        field2995++;
        if (!arg0) {
            field3004 = null;
        }
        return class39.field1017 != null;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)I", line = 1435)
    public final int method905(int arg0) {
        if (this.field2983-- == 0) {
            this.method899(1);
            this.field2983 = 255;
        }
        if (arg0 > -78) {
            method907(-67, 120, (byte) 65);
        }
        field2996++;
        return this.field2991[this.field2983];
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V", line = 1456)
    private final void method906(int arg0) {
        field2992++;
        if (arg0 <= 45) {
            method901((byte) -45, 12L);
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var7 + var63;
            int var66 = var65 ^ var63 << 8;
            int var67 = var5 + var64;
            int var68 = var4 + var66;
            int var69 = var63 + var67;
            var6 = var69 ^ var67 >>> 16;
            int var70 = var3 + var6;
            int var71 = var67 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var66;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2991[var11 + 6] + var3;
            int var38 = this.field2991[var11 + 1] + var8;
            int var39 = this.field2991[var11 + 4] + var5;
            int var40 = this.field2991[var11 + 5] + var4;
            int var41 = this.field2991[var11 + 3] + var6;
            int var42 = this.field2991[var11 + 2] + var7;
            int var43 = this.field2991[var11] + var9;
            int var44 = var43 ^ var38 << 11;
            int var45 = this.field2991[var11 + 7] + var2;
            int var46 = var38 + var42;
            int var47 = var41 + var44;
            int var48 = var46 ^ var42 >>> 2;
            int var49 = var42 + var47;
            int var50 = var49 ^ var47 << 8;
            int var51 = var39 + var48;
            int var52 = var40 + var50;
            int var53 = var47 + var51;
            var6 = var53 ^ var51 >>> 16;
            int var54 = var6 + var37;
            int var55 = var51 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            int var57 = var5 + var45;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var4 + var44;
            int var59 = var54 + var57;
            var3 = var59 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var50;
            var9 = var8 + var58;
            this.field2990[var11] = var9;
            this.field2990[var11 + 1] = var8;
            this.field2990[var11 + 2] = var7;
            this.field2990[var11 + 3] = var6;
            this.field2990[var11 + 4] = var5;
            this.field2990[var11 + 5] = var4;
            this.field2990[var11 + 6] = var3;
            this.field2990[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2990[var12 + 5] + var4;
            int var14 = this.field2990[var12 + 7] + var2;
            int var15 = this.field2990[var12 + 6] + var3;
            int var16 = this.field2990[var12 + 3] + var6;
            int var17 = this.field2990[var12 + 2] + var7;
            int var18 = this.field2990[var12] + var9;
            int var19 = this.field2990[var12 + 1] + var8;
            int var20 = this.field2990[var12 + 4] + var5;
            int var21 = var18 ^ var19 << 11;
            int var22 = var17 + var19;
            int var23 = var22 ^ var17 >>> 2;
            int var24 = var16 + var21;
            int var25 = var17 + var24;
            int var26 = var20 + var23;
            int var27 = var25 ^ var24 << 8;
            int var28 = var13 + var27;
            int var29 = var24 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var6 + var15;
            int var31 = var26 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var5 + var14;
            int var33 = var28 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var30 + var32;
            var3 = var34 ^ var32 << 8;
            int var35 = var4 + var21;
            int var36 = var32 + var35;
            var8 = var3 + var23;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field2990[var12] = var9;
            this.field2990[var12 + 1] = var8;
            this.field2990[var12 + 2] = var7;
            this.field2990[var12 + 3] = var6;
            this.field2990[var12 + 4] = var5;
            this.field2990[var12 + 5] = var4;
            this.field2990[var12 + 6] = var3;
            this.field2990[var12 + 7] = var2;
        }
        this.method899(1);
        this.field2983 = 256;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB)V", line = 1607)
    public static final void method907(int arg0, int arg1, byte arg2) {
        field2986++;
        if (class112.field2837 != 0 && arg1 != -1) {
            class123.method969(false, class115.field2919, arg1, 1, class112.field2837, true, 0);
            class103.field2595 = arg0;
        }
        if (arg2 <= 30) {
            method900(-96L, 8);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILmb;Lic;Z)V", line = 1625)
    public static final void method908(int arg0, class73 arg1, class50 arg2, boolean arg3) {
        field3001++;
        class33 var4 = new class33();
        var4.field3345 = arg0;
        var4.field901 = arg2;
        var4.field905 = arg1;
        var4.field902 = 1;
        class119 var5 = class128.field3225;
        synchronized (class128.field3225) {
            class128.field3225.method894(12800, var4);
        }
        if (arg3) {
            class100.method753(-111);
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "([I)V", line = 1649)
    public class120(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2991[var2] = arg0[var2];
        }
        this.method906(56);
    }
}
