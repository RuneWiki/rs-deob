import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class10 extends class67 {

    @OriginalMember(owner = "client!b", name = "rb", descriptor = "[B")
    public byte[] field261;

    @OriginalMember(owner = "client!b", name = "db", descriptor = "[Lgd;")
    public static class40[] field247 = new class40[100];

    @OriginalMember(owner = "client!b", name = "cb", descriptor = "Lgd;")
    private static class40 field246 = class14.method90(false, "This computers address has been blocked");

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
    public static int field242 = 0;

    @OriginalMember(owner = "client!b", name = "gb", descriptor = "Lgd;")
    public static class40 field250 = class14.method90(false, "(U1");

    @OriginalMember(owner = "client!b", name = "ib", descriptor = "Lgd;")
    private static class40 field252 = class14.method90(false, "Click to continue");

    @OriginalMember(owner = "client!b", name = "jb", descriptor = "I")
    public static int field253 = 1;

    @OriginalMember(owner = "client!b", name = "hb", descriptor = "I")
    public static int field251 = 0;

    @OriginalMember(owner = "client!b", name = "fb", descriptor = "Lgd;")
    public static class40 field249 = field246;

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "Lgd;")
    public static class40 field245 = class14.method90(false, "::fpsoff");

    @OriginalMember(owner = "client!b", name = "qb", descriptor = "Lgd;")
    public static class40 field260 = class14.method90(false, "M");

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "Lgd;")
    public static class40 field243 = field252;

    @OriginalMember(owner = "client!b", name = "nb", descriptor = "Lgd;")
    public static class40 field257 = class14.method90(false, ": ");

    @OriginalMember(owner = "client!b", name = "sb", descriptor = "Lgd;")
    private static class40 field262 = class14.method90(false, "Connection lost");

    @OriginalMember(owner = "client!b", name = "mb", descriptor = "Lgd;")
    public static class40 field256 = field262;

    @OriginalMember(owner = "client!b", name = "ob", descriptor = "[I")
    public static int[] field258 = new int[50];

    @OriginalMember(owner = "client!b", name = "tb", descriptor = "Lgd;")
    public static class40 field263 = class14.method90(false, " x");

    @OriginalMember(owner = "client!b", name = "kb", descriptor = "Lgd;")
    public static class40 field254 = class14.method90(false, ",Zffentlicher Chat");

    @OriginalMember(owner = "client!b", name = "pb", descriptor = "Lde;")
    public static class24 field259 = new class24(32);

    @OriginalMember(owner = "client!b", name = "wb", descriptor = "Lgd;")
    private static class40 field266 = class14.method90(false, "No reply from loginserver)3");

    @OriginalMember(owner = "client!b", name = "xb", descriptor = "Lgd;")
    public static class40 field267 = field266;

    @OriginalMember(owner = "client!b", name = "vb", descriptor = "Lgd;")
    public static class40 field265 = class14.method90(false, "@gr2@");

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!b", name = "ub", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!b", name = "lb", descriptor = "Loc;")
    public static class86 field255;

    @OriginalMember(owner = "client!b", name = "yb", descriptor = "Loc;")
    public static class86 field268;

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "[Lhd;")
    public static class46[] field248;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([BI)V", line = 3)
    public static final void method55(byte[] arg0, int arg1) {
        field244++;
        class104 var2 = new class104(arg0);
        var2.field2563 = arg0.length - 2;
        class29.field629 = var2.method797(arg1 ^ 0xFFFFE11C);
        class122.field2860 = new int[class29.field629];
        class129.field3086 = new byte[class29.field629][];
        class30.field754 = new int[class29.field629];
        class134.field3271 = new int[class29.field629];
        class120.field2842 = new int[class29.field629];
        var2.field2563 = arg0.length - class29.field629 * 8 - 7;
        class16.field424 = var2.method797(-7916);
        class99.field2355 = var2.method797(-7916);
        int var3 = (var2.method798((byte) -46) & 0xFF) + 1;
        for (int var4 = 0; var4 < class29.field629; var4++) {
            class122.field2860[var4] = var2.method797(arg1 - 7924);
        }
        for (int var5 = 0; var5 < class29.field629; var5++) {
            class120.field2842[var5] = var2.method797(-7916);
        }
        for (int var6 = 0; var6 < class29.field629; var6++) {
            class134.field3271[var6] = var2.method797(-7916);
        }
        for (int var7 = 0; var7 < class29.field629; var7++) {
            class30.field754[var7] = var2.method797(class70.method486(arg1, -7908));
        }
        var2.field2563 = arg0.length - class29.field629 * arg1 - (var3 - 1) * 3 - 7;
        class96.field2229 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class96.field2229[var8] = var2.method770(-9409);
            if (class96.field2229[var8] == 0) {
                class96.field2229[var8] = 1;
            }
        }
        var2.field2563 = 0;
        for (int var9 = 0; var9 < class29.field629; var9++) {
            int var10 = class134.field3271[var9];
            int var11 = class30.field754[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class129.field3086[var9] = var13;
            int var14 = var2.method798((byte) -107);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method781(255);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var10 * var16 + var15] = var2.method781(255);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V", line = 130)
    public static void method56(byte arg0) {
        field265 = null;
        field268 = null;
        field250 = null;
        field266 = null;
        field260 = null;
        field259 = null;
        field255 = null;
        field252 = null;
        field249 = null;
        field245 = null;
        field262 = null;
        field248 = null;
        if (arg0 > -74) {
            return;
        }
        field267 = null;
        field257 = null;
        field254 = null;
        field256 = null;
        field246 = null;
        field243 = null;
        field247 = null;
        field258 = null;
        field263 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)V", line = 204)
    public static final void method57(int arg0, int arg1) {
        field264++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class22.field503[arg1];
        int var3 = class107.field2612[arg1];
        int var4 = class45.field1122[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = class13.field338[arg1];
        if (class53.field1347 != 0 && var4 != 1004) {
            class122.field2880 = true;
            class53.field1347 = 0;
        }
        if (var4 == 47 && class56.field1447 == -1) {
            class48.method372(var2, 0, 102);
            class56.field1447 = var2;
        }
        if (var4 == 18) {
            class50.method390((byte) -106);
        }
        if (var4 == 24) {
            class23.field529++;
            class92.field2094.method290((byte) 0, 177);
            class92.field2094.method776(var5, 114);
            class92.field2094.method801((byte) 65, var3);
            class92.field2094.method761(var2, -23644);
            class120.field2848 = var2;
            class7.field182 = var3;
            class35.field892 = 2;
            if (var2 >> 16 == class131.field3169) {
                class35.field892 = 1;
            }
            class88.field1995 = 0;
            if (var2 >> 16 == class108.field2624) {
                class35.field892 = 3;
            }
        }
        if (var4 == 37) {
            class44.field1106++;
            boolean var6 = class128.method1015(0, class13.field332.field803[0], var3, var2, class13.field332.field819[0], false, 0, 0, 0, 2, (byte) 60, 0);
            if (!var6) {
                class128.method1015(0, class13.field332.field803[0], var3, var2, class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 55, 0);
            }
            class92.field2096 = 0;
            class35.field895 = class90.field2041;
            class96.field2238 = 2;
            class30.field653 = class132.field3191;
            class92.field2094.method290((byte) 0, 74);
            class92.field2094.method771((byte) 121, class125.field2961 + var3);
            class92.field2094.method776(var5, -128);
            class92.field2094.method782((byte) 6, class126.field2990);
            class92.field2094.method768(class128.field3022 + var2, arg0 + 83);
            class92.field2094.method771((byte) 121, class58.field1477);
        }
        if (var4 == 2) {
            class42.field1035++;
            boolean var8 = class128.method1015(0, class13.field332.field803[0], var3, var2, class13.field332.field819[0], false, 0, 0, 0, 2, (byte) 68, 0);
            if (!var8) {
                class128.method1015(0, class13.field332.field803[0], var3, var2, class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 67, 0);
            }
            class96.field2238 = 2;
            class35.field895 = class90.field2041;
            class30.field653 = class132.field3191;
            class92.field2096 = 0;
            class92.field2094.method290((byte) 0, 83);
            class92.field2094.method768(var5, arg0 - 112);
            class92.field2094.method771((byte) 121, class128.field3022 + var2);
            class92.field2094.method771((byte) 121, class125.field2961 + var3);
        }
        if (var4 == 56) {
            class96 var10 = class90.field2044[var5];
            if (var10 != null) {
                class128.method1015(0, class13.field332.field803[0], var10.field803[0], var10.field819[0], class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 115, 0);
                class35.field895 = class90.field2041;
                class30.field653 = class132.field3191;
                class92.field2096 = 0;
                class74.field1732++;
                class96.field2238 = 2;
                class92.field2094.method290((byte) 0, 219);
                class92.field2094.method771((byte) 121, var5);
            }
        }
        if (var4 == 34) {
            class134.field3263++;
            class92.field2094.method290((byte) 0, 103);
            class92.field2094.method761(var2, -23644);
            class30 var11 = class14.method86(var2, false);
            if (var11.field689 != null && var11.field689[0][0] == 5) {
                int var12 = var11.field689[0][1];
                if (class48.field1209[var12] != var11.field695[0]) {
                    class48.field1209[var12] = var11.field695[0];
                    class22.method125((byte) -80, var12);
                    class45.field1124 = true;
                }
            }
        }
        if (var4 == 42) {
            class96 var13 = class90.field2044[var5];
            if (var13 != null) {
                class1.field16++;
                class128.method1015(0, class13.field332.field803[0], var13.field803[0], var13.field819[0], class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 100, 0);
                class92.field2096 = 0;
                class30.field653 = class132.field3191;
                class96.field2238 = 2;
                class35.field895 = class90.field2041;
                class92.field2094.method290((byte) 0, 41);
                class92.field2094.method761(class30.field748, arg0 ^ 0xFFFFA3A4);
                class92.field2094.method771((byte) 121, var5);
                class92.field2094.method776(class1.field24, 92);
                class92.field2094.method768(class107.field2606, arg0 ^ 0xFFFFFFDA);
            }
        }
        if (var4 == 13) {
            class30 var14 = class14.method86(var2, false);
            class91.method613(2);
            class107.field2618 = var14.field709;
            class126.field2990 = var2;
            class45.field1124 = true;
            class110.field2682 = 1;
            class137.field3344 = 0;
            class58.field1477 = -1;
            class2.field39 = var14.field733;
            class4.field76 = client.method114(true, new class40[] { class65.field1598, var14.field711, class112.field2720 });
            if (class107.field2618 == 16) {
                class126.field3014 = 3;
                class79.field1820 = true;
                class45.field1124 = true;
            }
            return;
        }
        if (var4 == 8) {
            class92.field2094.method290((byte) 0, 28);
            class42.field1056++;
            class92.field2094.method776(var3, -108);
            class92.field2094.method801((byte) 65, var5);
            class92.field2094.method761(var2, arg0 - 23644);
            class35.field892 = 2;
            class120.field2848 = var2;
            class88.field1995 = 0;
            if (var2 >> 16 == class131.field3169) {
                class35.field892 = 1;
            }
            if (var2 >> 16 == class108.field2624) {
                class35.field892 = 3;
            }
            class7.field182 = var3;
        }
        if (var4 == 7) {
            class53.field1337++;
            boolean var15 = class128.method1015(0, class13.field332.field803[0], var3, var2, class13.field332.field819[0], false, 0, 0, 0, 2, (byte) 78, 0);
            if (!var15) {
                class128.method1015(0, class13.field332.field803[0], var3, var2, class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 79, 0);
            }
            class92.field2096 = 0;
            class30.field653 = class132.field3191;
            class35.field895 = class90.field2041;
            class96.field2238 = 2;
            class92.field2094.method290((byte) 0, 169);
            class92.field2094.method776(var5, -42);
            class92.field2094.method776(class107.field2606, 88);
            class92.field2094.method768(var2 + class128.field3022, -38);
            class92.field2094.method782((byte) 19, class30.field748);
            class92.field2094.method771((byte) 121, var3 + class125.field2961);
            class92.field2094.method768(class1.field24, arg0 + 125);
        }
        if (var4 == 27 || var4 == 9 || var4 == 14 || var4 == 10) {
            class40 var17 = class131.field3178[arg1];
            int var18 = var17.method258(class112.field2720, (byte) -108);
            if (var18 != -1) {
                long var19 = var17.method240(-28427, var18 + 5).method259((byte) -81).method246(arg0 ^ 0xFFFFFFDD);
                if (var4 == 27) {
                    class82.method547(var19, -71);
                }
                if (var4 == 9) {
                    class24.method145((byte) 122, var19);
                }
                if (var4 == 14) {
                    class74.method506(-60, var19);
                }
                if (var4 == 10) {
                    class23.method136(var19, (byte) -73);
                }
            }
        }
        if (var4 == 30) {
            class42.field1049++;
            class92.field2094.method290((byte) 0, 229);
            class92.field2094.method776(var5, 105);
            class92.field2094.method777(var2, arg0 - 944783368);
            class92.field2094.method771((byte) 121, var3);
            class7.field182 = var3;
            class35.field892 = 2;
            class88.field1995 = 0;
            class120.field2848 = var2;
            if (var2 >> 16 == class131.field3169) {
                class35.field892 = 1;
            }
            if (var2 >> 16 == class108.field2624) {
                class35.field892 = 3;
            }
        }
        if (var4 == 15) {
            class134.method1050(var3, var2, arg0 ^ 0x800, var5);
            class92.field2094.method290((byte) 0, 39);
            class64.field1554++;
            class92.field2094.method801((byte) 65, var5 >> 14 & 0x7FFF);
            class92.field2094.method768(class128.field3022 + var2, 80);
            class92.field2094.method776(class125.field2961 + var3, -78);
        }
        if (var4 == 49) {
            class23 var21 = class130.field3142[var5];
            if (var21 != null) {
                class128.method1015(0, class13.field332.field803[0], var21.field803[0], var21.field819[0], class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 108, 0);
                class92.field2096 = 0;
                class96.field2238 = 2;
                class30.field653 = class132.field3191;
                class31.field773++;
                class35.field895 = class90.field2041;
                class92.field2094.method290((byte) 0, 97);
                class92.field2094.method771((byte) 121, var5);
            }
        }
        if (var4 == 52) {
            class48.field1202++;
            boolean var22 = class128.method1015(0, class13.field332.field803[0], var3, var2, class13.field332.field819[0], false, 0, 0, 0, 2, (byte) 73, 0);
            if (!var22) {
                class128.method1015(0, class13.field332.field803[0], var3, var2, class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 83, 0);
            }
            class92.field2096 = 0;
            class96.field2238 = 2;
            class35.field895 = class90.field2041;
            class30.field653 = class132.field3191;
            class92.field2094.method290((byte) 0, 208);
            class92.field2094.method776(var5, -81);
            class92.field2094.method801((byte) 65, class128.field3022 + var2);
            class92.field2094.method771((byte) 121, var3 + class125.field2961);
        }
        if (var4 == 53) {
            class23 var24 = class130.field3142[var5];
            if (var24 != null) {
                class104.field2511++;
                class128.method1015(0, class13.field332.field803[0], var24.field803[0], var24.field819[0], class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 107, 0);
                class96.field2238 = 2;
                class30.field653 = class132.field3191;
                class35.field895 = class90.field2041;
                class92.field2096 = 0;
                class92.field2094.method290((byte) 0, 71);
                class92.field2094.method768(class1.field24, -86);
                class92.field2094.method768(class107.field2606, 102);
                class92.field2094.method782((byte) -125, class30.field748);
                class92.field2094.method801((byte) 65, var5);
            }
        }
        if (var4 == 11) {
            class96 var25 = class90.field2044[var5];
            if (var25 != null) {
                class128.method1015(0, class13.field332.field803[0], var25.field803[0], var25.field819[0], class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 64, 0);
                class96.field2238 = 2;
                class92.field2086++;
                class92.field2096 = 0;
                class30.field653 = class132.field3191;
                class35.field895 = class90.field2041;
                class92.field2094.method290((byte) 0, 98);
                class92.field2094.method771((byte) 121, var5);
            }
        }
        if (var4 == 1) {
            class134.field3263++;
            class92.field2094.method290((byte) 0, 103);
            class92.field2094.method761(var2, -23644);
            class30 var26 = class14.method86(var2, false);
            if (var26.field689 != null && var26.field689[0][0] == 5) {
                int var27 = var26.field689[0][1];
                class48.field1209[var27] = 1 - class48.field1209[var27];
                class22.method125((byte) -80, var27);
                class45.field1124 = true;
            }
        }
        if (var4 == 32) {
            class18.field433++;
            class92.field2094.method290((byte) 0, 222);
            class92.field2094.method776(class58.field1477, arg0 ^ 0xFFFFFF82);
            class92.field2094.method768(var3, -70);
            class92.field2094.method777(var2, arg0 - 944783368);
            class92.field2094.method782((byte) -102, class126.field2990);
        }
        if (var4 == 19) {
            class44.field1113++;
            class92.field2094.method290((byte) 0, 162);
            class92.field2094.method768(var5, -56);
            class92.field2094.method761(var2, -23644);
            class92.field2094.method776(var3, 81);
            class7.field182 = var3;
            class35.field892 = 2;
            class88.field1995 = 0;
            if (var2 >> 16 == class131.field3169) {
                class35.field892 = 1;
            }
            class120.field2848 = var2;
            if (var2 >> 16 == class108.field2624) {
                class35.field892 = 3;
            }
        }
        if (var4 == 48) {
            class92.field2087++;
            class134.method1050(var3, var2, arg0 + 2048, var5);
            class92.field2094.method290((byte) 0, 112);
            class92.field2094.method801((byte) 65, class128.field3022 + var2);
            class92.field2094.method801((byte) 65, var5 >> 14 & 0x7FFF);
            class92.field2094.method768(class125.field2961 + var3, 98);
        }
        if (var4 == 1003) {
            class96.field2238 = 2;
            class35.field895 = class90.field2041;
            class92.field2096 = 0;
            class30.field653 = class132.field3191;
            class23 var28 = class130.field3142[var5];
            if (var28 != null) {
                class128 var29 = var28.field531;
                if (var29.field3023 != null) {
                    var29 = var29.method1009(4);
                }
                if (var29 != null) {
                    class92.field2094.method290((byte) 0, 190);
                    class92.field2094.method768(var29.field3028, -84);
                    class7.field184++;
                }
            }
        }
        if (var4 == 26) {
            class14.field358++;
            class92.field2094.method290((byte) 0, 24);
            class92.field2094.method782((byte) 31, var2);
            class92.field2094.method776(var5, -89);
            class92.field2094.method768(var3, arg0 - 42);
            class88.field1995 = 0;
            class120.field2848 = var2;
            class7.field182 = var3;
            class35.field892 = 2;
            if (var2 >> 16 == class131.field3169) {
                class35.field892 = 1;
            }
            if (var2 >> 16 == class108.field2624) {
                class35.field892 = 3;
            }
        }
        if (var4 == 1006) {
            class30 var30 = class14.method86(var2, false);
            if (var30 == null || var30.field708[var3] < 100000) {
                class131.field3176++;
                class92.field2094.method290((byte) 0, 95);
                class92.field2094.method801((byte) 65, var5);
            } else {
                class77.method521(class125.field2966, client.method114(true, new class40[] { class21.method121(23444, var30.field708[var3]), class52.field1332, class132.method1041(var5, 110).field114 }), false, 0);
            }
            class120.field2848 = var2;
            class7.field182 = var3;
            class35.field892 = 2;
            class88.field1995 = 0;
            if (var2 >> 16 == class131.field3169) {
                class35.field892 = 1;
            }
            if (var2 >> 16 == class108.field2624) {
                class35.field892 = 3;
            }
        }
        if (var4 == 21) {
            class30 var31 = class14.method86(var2, false);
            boolean var32 = true;
            if (var31.field734 > 0) {
                var32 = class76.method508(325, var31);
            }
            if (var32) {
                class92.field2094.method290((byte) 0, 103);
                class92.field2094.method761(var2, -23644);
                class134.field3263++;
            }
        }
        if (var4 == 33) {
            class92.field2094.method290((byte) 0, 234);
            class51.field1291++;
            class92.field2094.method776(var5, 70);
            class92.field2094.method776(var3, arg0 + 77);
            class92.field2094.method777(var2, -944783368);
            class35.field892 = 2;
            class7.field182 = var3;
            class120.field2848 = var2;
            if (var2 >> 16 == class131.field3169) {
                class35.field892 = 1;
            }
            if (var2 >> 16 == class108.field2624) {
                class35.field892 = 3;
            }
            class88.field1995 = 0;
        }
        if (var4 == 36) {
            class96 var33 = class90.field2044[var5];
            if (var33 != null) {
                class128.method1015(0, class13.field332.field803[0], var33.field803[0], var33.field819[0], class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 60, 0);
                class14.field364++;
                class30.field653 = class132.field3191;
                class35.field895 = class90.field2041;
                class96.field2238 = 2;
                class92.field2096 = 0;
                class92.field2094.method290((byte) 0, 134);
                class92.field2094.method768(var5, -57);
            }
        }
        if (var4 == 5) {
            class92.field2094.method290((byte) 0, 48);
            class58.field1472++;
            class92.field2094.method801((byte) 65, var5);
            class92.field2094.method776(var3, arg0 ^ 0xFFFFFF8E);
            class92.field2094.method790(-18058, var2);
            class35.field892 = 2;
            class88.field1995 = 0;
            class7.field182 = var3;
            class120.field2848 = var2;
            if (var2 >> 16 == class131.field3169) {
                class35.field892 = 1;
            }
            if (var2 >> 16 == class108.field2624) {
                class35.field892 = 3;
            }
        }
        if (var4 == 58) {
            class40 var34 = class131.field3178[arg1];
            int var35 = var34.method258(class112.field2720, (byte) -93);
            if (var35 != -1) {
                if (class131.field3169 == -1) {
                    class50.method390((byte) 44);
                    if (class136.field3331 != -1) {
                        class125.field2958 = var34.method240(-28427, var35 + 5).method259((byte) 7);
                        class40.field999 = false;
                        class66.field1627 = class131.field3169 = class136.field3331;
                    }
                } else {
                    class77.method521(class125.field2966, class67.field1648, false, 0);
                }
            }
        }
        if (var4 == 38 && class134.method1050(var3, var2, 2048, var5)) {
            class133.field3239++;
            class92.field2094.method290((byte) 0, 22);
            class92.field2094.method776(class125.field2961 + var3, arg0 ^ 0xFFFFFFBF);
            class92.field2094.method776(class128.field3022 + var2, arg0 ^ 0x57);
            class92.field2094.method801((byte) 65, class107.field2606);
            class92.field2094.method768(var5 >> 14 & 0x7FFF, -34);
            class92.field2094.method782((byte) -122, class30.field748);
            class92.field2094.method776(class1.field24, 122);
        }
        if (var4 == 28) {
            boolean var36 = class128.method1015(0, class13.field332.field803[0], var3, var2, class13.field332.field819[0], false, 0, 0, 0, 2, (byte) 101, 0);
            class106.field2591++;
            if (!var36) {
                class128.method1015(0, class13.field332.field803[0], var3, var2, class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 94, 0);
            }
            class96.field2238 = 2;
            class30.field653 = class132.field3191;
            class35.field895 = class90.field2041;
            class92.field2096 = 0;
            class92.field2094.method290((byte) 0, 179);
            class92.field2094.method771((byte) 121, var5);
            class92.field2094.method768(class125.field2961 + var3, 106);
            class92.field2094.method776(class128.field3022 + var2, 107);
        }
        if (var4 == 45) {
            if (class90.field2040) {
                class21.field490.method948(var3 - 4, var2 + -4);
            } else {
                class21.field490.method948(class132.field3191 - 4, class90.field2041 + -4);
            }
        }
        if (var4 == 1005) {
            class30.field653 = class132.field3191;
            class92.field2096 = 0;
            class35.field895 = class90.field2041;
            class96.field2238 = 2;
            class82.field1847++;
            class92.field2094.method290((byte) 0, 165);
            class92.field2094.method776(var5 >> 14 & 0x7FFF, 111);
        }
        if (var4 == 44 || var4 == 23) {
            class40 var38 = class131.field3178[arg1];
            int var39 = var38.method258(class112.field2720, (byte) -92);
            if (var39 != -1) {
                class40 var40 = var38.method240(-28427, var39 + 5).method259((byte) 123);
                class40 var41 = var40.method262((byte) 77).method244(0);
                boolean var42 = false;
                for (int var43 = 0; var43 < class1.field18; var43++) {
                    class96 var44 = class90.field2044[class77.field1787[var43]];
                    if (var44 != null && var44.field2210 != null && var44.field2210.method260(var41, (byte) 109)) {
                        class128.method1015(0, class13.field332.field803[0], var44.field803[0], var44.field819[0], class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 114, 0);
                        var42 = true;
                        if (var4 == 44) {
                            class74.field1732++;
                            class92.field2094.method290((byte) 0, 219);
                            class92.field2094.method771((byte) 121, class77.field1787[var43]);
                        }
                        if (var4 == 23) {
                            class14.field364++;
                            class92.field2094.method290((byte) 0, 134);
                            class92.field2094.method768(class77.field1787[var43], 91);
                        }
                        break;
                    }
                }
                if (!var42) {
                    class77.method521(class125.field2966, client.method114(true, new class40[] { class18.field438, var41 }), false, 0);
                }
            }
        }
        if (var4 == 6) {
            class60.field1510++;
            class92.field2094.method290((byte) 0, 168);
            class92.field2094.method801((byte) 65, class107.field2606);
            class92.field2094.method801((byte) 65, var5);
            class92.field2094.method776(class1.field24, arg0 + 65);
            class92.field2094.method782((byte) -85, var2);
            class92.field2094.method771((byte) 121, var3);
            class92.field2094.method782((byte) 116, class30.field748);
            class7.field182 = var3;
            class88.field1995 = 0;
            class120.field2848 = var2;
            class35.field892 = 2;
            if (var2 >> 16 == class131.field3169) {
                class35.field892 = 1;
            }
            if (var2 >> 16 == class108.field2624) {
                class35.field892 = 3;
            }
        }
        if (var4 == 40) {
            class92.field2094.method290((byte) 0, 73);
            class23.field535++;
            class92.field2094.method768(var3, 80);
            class92.field2094.method777(class126.field2990, arg0 ^ 0xC7AFBFF8);
            class92.field2094.method776(class58.field1477, 123);
            class92.field2094.method777(var2, -944783368);
            class92.field2094.method776(var5, 65);
            class35.field892 = 2;
            class88.field1995 = 0;
            class7.field182 = var3;
            class120.field2848 = var2;
            if (var2 >> 16 == class131.field3169) {
                class35.field892 = 1;
            }
            if (var2 >> 16 == class108.field2624) {
                class35.field892 = 3;
            }
        }
        if (var4 == 1002) {
            class35.field895 = class90.field2041;
            class131.field3176++;
            class30.field653 = class132.field3191;
            class92.field2096 = 0;
            class96.field2238 = 2;
            class92.field2094.method290((byte) 0, 95);
            class92.field2094.method801((byte) 65, var5);
        }
        if (var4 == 25) {
            class91.method613(2);
            class30.field748 = var2;
            class107.field2606 = var5;
            class1.field24 = var3;
            class137.field3344 = 1;
            class45.field1124 = true;
            class103.field2460 = client.method114(true, new class40[] { class79.field1817, class132.method1041(var5, 111).field114, class112.field2720 });
            if (class103.field2460 == null) {
                class103.field2460 = class61.field1530;
            }
            return;
        }
        if (var4 == 17) {
            class135.field3277++;
            class92.field2094.method290((byte) 0, 157);
            class92.field2094.method776(var3, -112);
            class92.field2094.method790(-18058, var2);
            class92.field2094.method771((byte) 121, var5);
            class120.field2848 = var2;
            class88.field1995 = 0;
            class7.field182 = var3;
            class35.field892 = 2;
            if (var2 >> 16 == class131.field3169) {
                class35.field892 = 1;
            }
            if (var2 >> 16 == class108.field2624) {
                class35.field892 = 3;
            }
        }
        if (var4 == 22) {
            class23 var45 = class130.field3142[var5];
            if (var45 != null) {
                class23.field527++;
                class128.method1015(0, class13.field332.field803[0], var45.field803[0], var45.field819[0], class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 107, 0);
                class35.field895 = class90.field2041;
                class96.field2238 = 2;
                class92.field2096 = 0;
                class30.field653 = class132.field3191;
                class92.field2094.method290((byte) 0, 217);
                class92.field2094.method801((byte) 65, var5);
            }
        }
        if (var4 == 43) {
            class23 var46 = class130.field3142[var5];
            if (var46 != null) {
                class128.method1015(0, class13.field332.field803[0], var46.field803[0], var46.field819[0], class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 62, 0);
                class92.field2096 = 0;
                class30.field653 = class132.field3191;
                class35.field895 = class90.field2041;
                class96.field2238 = 2;
                class92.field2094.method290((byte) 0, 120);
                class92.field2094.method776(var5, -43);
                class94.field2159++;
            }
        }
        if (var4 == 31) {
            class66.method477(true, var5, var3, var2);
        }
        if (var4 == 41) {
            class23 var47 = class130.field3142[var5];
            if (var47 != null) {
                class128.method1015(0, class13.field332.field803[0], var47.field803[0], var47.field819[0], class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 66, 0);
                class30.field653 = class132.field3191;
                class92.field2096 = 0;
                class35.field895 = class90.field2041;
                class96.field2238 = 2;
                class40.field975++;
                class92.field2094.method290((byte) 0, 108);
                class92.field2094.method768(var5, 125);
            }
        }
        if (var4 == 51 && class134.method1050(var3, var2, arg0 ^ 0x800, var5)) {
            class92.field2094.method290((byte) 0, 238);
            class92.field2094.method771((byte) 121, var5 >> 14 & 0x7FFF);
            class104.field2557++;
            class92.field2094.method801((byte) 65, class125.field2961 + var3);
            class92.field2094.method761(class126.field2990, -23644);
            class92.field2094.method776(class128.field3022 + var2, arg0 ^ 0x6A);
            class92.field2094.method776(class58.field1477, 106);
        }
        if (var4 == 1001) {
            class134.method1050(var3, var2, arg0 ^ 0x800, var5);
            class92.field2094.method290((byte) 0, 89);
            class92.field2094.method771((byte) 121, var2 + class128.field3022);
            class7.field168++;
            class92.field2094.method768(class125.field2961 + var3, -45);
            class92.field2094.method768(var5 >> 14 & 0x7FFF, 98);
        }
        if (var4 == 54) {
            class92.field2094.method290((byte) 0, 124);
            class54.field1385++;
            class92.field2094.method768(var3, 107);
            class92.field2094.method761(var2, arg0 - 23644);
            class92.field2094.method771((byte) 121, var5);
            class35.field892 = 2;
            class88.field1995 = 0;
            if (var2 >> 16 == class131.field3169) {
                class35.field892 = 1;
            }
            if (var2 >> 16 == class108.field2624) {
                class35.field892 = 3;
            }
            class120.field2848 = var2;
            class7.field182 = var3;
        }
        if (var4 == 55) {
            class96 var48 = class90.field2044[var5];
            if (var48 != null) {
                class128.method1015(0, class13.field332.field803[0], var48.field803[0], var48.field819[0], class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 94, 0);
                class35.field895 = class90.field2041;
                class112.field2711++;
                class92.field2096 = 0;
                class96.field2238 = 2;
                class30.field653 = class132.field3191;
                class92.field2094.method290((byte) 0, 3);
                class92.field2094.method801((byte) 65, class58.field1477);
                class92.field2094.method776(var5, -65);
                class92.field2094.method761(class126.field2990, -23644);
            }
        }
        if (var4 == 50) {
            class23 var49 = class130.field3142[var5];
            if (var49 != null) {
                class1.field2++;
                class128.method1015(0, class13.field332.field803[0], var49.field803[0], var49.field819[0], class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 66, 0);
                class35.field895 = class90.field2041;
                class96.field2238 = 2;
                class92.field2096 = 0;
                class30.field653 = class132.field3191;
                class92.field2094.method290((byte) 0, 246);
                class92.field2094.method801((byte) 65, var5);
            }
        }
        if (var4 == 46) {
            class130.method1030(class69.field1671, (byte) -54);
            class122.field2880 = true;
            class69.field1671 = -1;
        }
        if (var4 == 12) {
            class23 var50 = class130.field3142[var5];
            if (var50 != null) {
                class115.field2781++;
                class128.method1015(0, class13.field332.field803[0], var50.field803[0], var50.field819[0], class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 115, 0);
                class92.field2096 = 0;
                class30.field653 = class132.field3191;
                class96.field2238 = 2;
                class35.field895 = class90.field2041;
                class92.field2094.method290((byte) 0, 175);
                class92.field2094.method771((byte) 121, class58.field1477);
                class92.field2094.method776(var5, arg0 ^ 0xFFFFFFB2);
                class92.field2094.method777(class126.field2990, -944783368);
            }
        }
        if (var4 == 57) {
            class92.field2090++;
            class134.method1050(var3, var2, 2048, var5);
            class92.field2094.method290((byte) 0, 88);
            class92.field2094.method776(class125.field2961 + var3, arg0 + -69);
            class92.field2094.method801((byte) 65, var5 >> 14 & 0x7FFF);
            class92.field2094.method801((byte) 65, var2 + class128.field3022);
        }
        if (var4 == 3) {
            class134.method1050(var3, var2, 2048, var5);
            class92.field2094.method290((byte) 0, 147);
            class92.field2094.method776(var2 + class128.field3022, -65);
            class92.field2094.method768(var3 + class125.field2961, 109);
            class52.field1317++;
            class92.field2094.method801((byte) 65, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 29) {
            class40 var51 = class131.field3178[arg1];
            int var52 = var51.method258(class112.field2720, (byte) -84);
            if (var52 != -1) {
                long var53 = var51.method240(-28427, var52 + 5).method259((byte) -19).method246(arg0 + 77);
                int var55 = -1;
                for (int var56 = 0; var56 < class7.field181; var56++) {
                    if (class104.field2539[var56] == var53) {
                        var55 = var56;
                        break;
                    }
                }
                if (var55 != -1 && class77.field1771[var55] > 0) {
                    class122.field2880 = true;
                    class53.field1347 = 0;
                    class125.field2969 = class125.field2966;
                    client.field473 = 3;
                    class87.field1957 = true;
                    class83.field1874 = class104.field2539[var55];
                    class125.field2973 = client.method114(true, new class40[] { class126.field2997, class7.field178[var55] });
                }
            }
        }
        if (var4 == 39) {
            boolean var57 = class128.method1015(0, class13.field332.field803[0], var3, var2, class13.field332.field819[0], false, 0, 0, 0, 2, (byte) 77, 0);
            class88.field1990++;
            if (!var57) {
                class128.method1015(0, class13.field332.field803[0], var3, var2, class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 102, 0);
            }
            class96.field2238 = 2;
            class92.field2096 = 0;
            class30.field653 = class132.field3191;
            class35.field895 = class90.field2041;
            class92.field2094.method290((byte) 0, 19);
            class92.field2094.method771((byte) 121, var5);
            class92.field2094.method776(class125.field2961 + var3, -106);
            class92.field2094.method776(class128.field3022 + var2, -87);
        }
        if (var4 == 16) {
            class96 var59 = class90.field2044[var5];
            if (var59 != null) {
                class51.field1298++;
                class128.method1015(0, class13.field332.field803[0], var59.field803[0], var59.field819[0], class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 72, 0);
                class96.field2238 = 2;
                class92.field2096 = 0;
                class30.field653 = class132.field3191;
                class35.field895 = class90.field2041;
                class92.field2094.method290((byte) 0, 193);
                class92.field2094.method771((byte) 121, var5);
            }
        }
        if (var4 == 20) {
            class35.field890++;
            class92.field2094.method290((byte) 0, 139);
            class92.field2094.method761(var2, -23644);
            class92.field2094.method776(var3, 99);
            class92.field2094.method776(var5, arg0 + 87);
            class7.field182 = var3;
            class35.field892 = 2;
            if (var2 >> 16 == class131.field3169) {
                class35.field892 = 1;
            }
            class88.field1995 = 0;
            if (var2 >> 16 == class108.field2624) {
                class35.field892 = 3;
            }
            class120.field2848 = var2;
        }
        if (var4 == 35) {
            class96 var60 = class90.field2044[var5];
            if (var60 != null) {
                class128.method1015(0, class13.field332.field803[0], var60.field803[0], var60.field819[0], class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 76, 0);
                class35.field895 = class90.field2041;
                class92.field2096 = 0;
                class30.field653 = class132.field3191;
                class63.field1546++;
                class96.field2238 = 2;
                class92.field2094.method290((byte) 0, 227);
                class92.field2094.method801((byte) 65, var5);
            }
        }
        if (var4 == 4) {
            class41.field1010++;
            boolean var61 = class128.method1015(0, class13.field332.field803[0], var3, var2, class13.field332.field819[0], false, 0, 0, 0, 2, (byte) 61, 0);
            if (!var61) {
                class128.method1015(0, class13.field332.field803[0], var3, var2, class13.field332.field819[0], false, 1, 0, 1, 2, (byte) 107, 0);
            }
            class96.field2238 = 2;
            class92.field2096 = 0;
            class30.field653 = class132.field3191;
            class35.field895 = class90.field2041;
            class92.field2094.method290((byte) 0, 61);
            class92.field2094.method771((byte) 121, var3 + class125.field2961);
            class92.field2094.method776(class128.field3022 + var2, 101);
            class92.field2094.method776(var5, 120);
        }
        if (class137.field3344 != arg0) {
            class45.field1124 = true;
            class137.field3344 = 0;
        }
        if (class110.field2682 != 0) {
            class91.method613(arg0 ^ 0x2);
            class45.field1124 = true;
        }
        if (var4 != 31) {
            return;
        }
        int var65 = var3;
        class30 var66 = class14.method86(var2, false);
        if (var66 != null && var66.field745 != null && var3 != -1 && var66.field745.length > var3) {
            var66 = var66.field745[var3];
            var65 = -1;
        }
        if (var66 != null && var66.field735 != null && var65 == -1) {
            class45.method312(var66.field735, 0, 0, var66, 123, var5);
            return;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "([B)V", line = 1432)
    public class10(byte[] arg0) {
        this.field261 = arg0;
    }
}
