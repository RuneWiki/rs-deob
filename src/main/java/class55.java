import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class55 extends class124 {

    @OriginalMember(owner = "client!hf", name = "ab", descriptor = "I")
    public int field1127 = 0;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public static int field1111 = 0;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field1118 = 0;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "Lpe;")
    public static class109 field1115 = class141.method1120("null", 0);

    @OriginalMember(owner = "client!hf", name = "db", descriptor = "[I")
    public static int[] field1130 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "[I")
    public static int[] field1123 = new int[4000];

    @OriginalMember(owner = "client!hf", name = "cb", descriptor = "Lpe;")
    public static class109 field1129 = class141.method1120("Untersuchen", 0);

    @OriginalMember(owner = "client!hf", name = "eb", descriptor = "Lpe;")
    public static class109 field1131 = class141.method1120("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", 0);

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    public static int field1120 = 128;

    @OriginalMember(owner = "client!hf", name = "bb", descriptor = "[[S")
    public static short[][] field1128 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "I")
    public static int field1125 = 1;

    @OriginalMember(owner = "client!hf", name = "hb", descriptor = "Lpe;")
    private static class109 field1134 = class141.method1120("Type", 0);

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "Lpe;")
    public static class109 field1113 = field1134;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!hf", name = "fb", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "[I")
    public static int[] field1121;

    @OriginalMember(owner = "client!hf", name = "gb", descriptor = "[I")
    public static int[] field1133;

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "[Lue;")
    public static class144[] field1126;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)I")
    public static final int method437(int arg0, int arg1, int arg2, int arg3) {
        field1122++;
        if (arg0 > 179) {
            arg3 /= 2;
        }
        if (arg0 > 192) {
            arg3 /= 2;
        }
        if (arg0 > 217) {
            arg3 /= 2;
        }
        if (arg0 > 243) {
            arg3 /= 2;
        }
        return (arg2 / 4 << 10) + (arg3 / 32 << 7) + arg0 / arg1;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZLbe;)V")
    private final void method438(int arg0, boolean arg1, class13 arg2) {
        if (!arg1) {
            method443(59, 98, 101);
        }
        field1132++;
        if (arg0 == 2) {
            this.field1127 = arg2.method105(1375221240);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZIII)V")
    public static final void method439(boolean arg0, int arg1, int arg2, int arg3) {
        class147.method1148(arg0);
        field1124++;
        class140.method1110(arg2, arg3, class84.field1789.field1386 + arg2, class84.field1789.field1382 + arg3);
        if (class149.field3306 == 2 || class149.field3306 == 5) {
            class140.method1116(arg2 + 25, arg3 + 5, 0, client.field525, class85.field1793);
        } else {
            int var4 = class136.field2975.field3094 / 32 + 48;
            int var5 = 464 - class136.field2975.field3106 / 32;
            int var6 = class100.field2104 + class139.field3030 & 0x7FF;
            class136.field2969.method269(arg2 + 25, arg3 + 5, 146, 151, var4, var5, var6, class68.field1368 + 256, client.field525, class85.field1793);
            for (int var7 = 0; var7 < class7.field171; var7++) {
                int var37 = class144.field3160[var7] * 4 + 2 - class136.field2975.field3094 / 32;
                int var38 = class3.field73[var7] * 4 + 2 - class136.field2975.field3106 / 32;
                class124.method1011(arg3, arg2, var37, var38, false, class125.field2757[var7]);
            }
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var33 = 0; var33 < 104; var33++) {
                    class19 var34 = class92.field1987[class75.field1513][var8][var33];
                    if (var34 != null) {
                        int var35 = var8 * 4 + 2 - class136.field2975.field3094 / 32;
                        int var36 = var33 * 4 + 2 - class136.field2975.field3106 / 32;
                        class124.method1011(arg3, arg2, var35, var36, arg0, class43.field904[0]);
                    }
                }
            }
            for (int var9 = 0; var9 < class131.field2885; var9++) {
                class108 var29 = class52.field1067[class139.field3035[var9]];
                if (var29 != null && var29.method426(false)) {
                    class113 var30 = var29.field2265;
                    if (var30 != null && var30.field2470 != null) {
                        var30 = var30.method932(true);
                    }
                    if (var30 != null && var30.field2480 && var30.field2465) {
                        int var31 = var29.field3094 / 32 - class136.field2975.field3094 / 32;
                        int var32 = var29.field3106 / 32 - class136.field2975.field3106 / 32;
                        class124.method1011(arg3, arg2, var31, var32, false, class43.field904[1]);
                    }
                }
            }
            for (int var10 = 0; var10 < class44.field927; var10++) {
                class50 var21 = class104.field2194[class92.field1973[var10]];
                if (var21 != null && var21.method426(arg0)) {
                    int var22 = var21.field3094 / 32 - class136.field2975.field3094 / 32;
                    int var23 = var21.field3106 / 32 - class136.field2975.field3106 / 32;
                    boolean var24 = false;
                    long var25 = var21.field1051.method889(true);
                    for (int var27 = 0; var27 < class110.field2330; var27++) {
                        if (class112.field2415[var27] == var25 && class77.field1623[var27] != 0) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (class136.field2975.field1057 != 0 && var21.field1057 != 0 && class136.field2975.field1057 == var21.field1057) {
                        var28 = true;
                    }
                    if (var24) {
                        class124.method1011(arg3, arg2, var22, var23, false, class43.field904[3]);
                    } else if (var28) {
                        class124.method1011(arg3, arg2, var22, var23, false, class43.field904[4]);
                    } else {
                        class124.method1011(arg3, arg2, var22, var23, arg0, class43.field904[2]);
                    }
                }
            }
            if (class32.field696 != 0 && class12.field264 % 20 < 10) {
                if (class32.field696 == 1 && class125.field2769 >= 0 && class52.field1067.length > class125.field2769) {
                    class108 var11 = class52.field1067[class125.field2769];
                    if (var11 != null) {
                        int var12 = var11.field3094 / 32 - class136.field2975.field3094 / 32;
                        int var13 = var11.field3106 / 32 - class136.field2975.field3106 / 32;
                        class110.method911(-124, arg2, arg3, class18.field452[1], var13, var12);
                    }
                }
                if (class32.field696 == 2) {
                    int var14 = (class92.field1990 - class43.field917) * 4 + 2 - class136.field2975.field3094 / 32;
                    int var15 = (class32.field694 - class82.field1736) * 4 + 2 - class136.field2975.field3106 / 32;
                    class110.method911(-116, arg2, arg3, class18.field452[1], var15, var14);
                }
                if (class32.field696 == 10 && class18.field458 >= 0 && class18.field458 < class104.field2194.length) {
                    class50 var16 = class104.field2194[class18.field458];
                    if (var16 != null) {
                        int var17 = var16.field3094 / 32 - class136.field2975.field3094 / 32;
                        int var18 = var16.field3106 / 32 - class136.field2975.field3106 / 32;
                        class110.method911(-120, arg2, arg3, class18.field452[1], var18, var17);
                    }
                }
            }
            if (class88.field1865 != 0) {
                int var19 = class88.field1865 * 4 + 2 - class136.field2975.field3094 / 32;
                int var20 = class143.field3145 * 4 + 2 - class136.field2975.field3106 / 32;
                class124.method1011(arg3, arg2, var19, var20, arg0, class18.field452[0]);
            }
            class140.method1118(arg2 + 93 + 4, arg3 + -4 - -82, 3, 3, 16777215);
        }
        if (class149.field3306 < 3) {
            class25.field617.method269(arg2, arg3, 33, 33, 25, 25, class100.field2104, 256, field1121, class2.field32);
        } else {
            class140.method1116(arg2, arg3, 0, field1121, class2.field32);
        }
        if (class83.field1770[arg1]) {
            class84.field1789.method539(arg2, arg3);
        }
        class11.field249[arg1] = true;
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(B)V")
    public static void method440(byte arg0) {
        field1133 = null;
        field1134 = null;
        field1129 = null;
        field1121 = null;
        field1131 = null;
        field1113 = null;
        field1130 = null;
        field1115 = null;
        field1123 = null;
        field1128 = null;
        field1126 = null;
        if (arg0 <= 70) {
            field1123 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lbe;I)V")
    public final void method441(class13 arg0, int arg1) {
        field1114++;
        if (arg1 != -1) {
            field1133 = null;
        }
        while (true) {
            int var3 = arg0.method142(arg1 ^ 0xFFFF94B4);
            if (var3 == 0) {
                return;
            }
            this.method438(var3, true, arg0);
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
    public static final void method442(int arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        field1119++;
        System.exit(1);
        if (arg0 != 26451) {
            method439(true, -85, -37, 114);
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(III)V")
    public static final void method443(int arg0, int arg1, int arg2) {
        field1112++;
        if (class149.field3306 != 0 && class149.field3306 != 3) {
            return;
        }
        if (arg2 < 100) {
            field1129 = null;
        }
        if (class19.field484 != 1) {
            return;
        }
        int var3 = class115.field2538 - arg1 - 25;
        int var4 = class120.field2671 - arg0 - 5;
        if (var3 < 0 || var4 < 0 || var3 >= 146 || var4 >= 151) {
            return;
        }
        var4 -= 75;
        var3 -= 73;
        int var5 = class139.field3030 + class100.field2104 & 0x7FF;
        int var6 = class105.field2210[var5];
        int var7 = class105.field2221[var5];
        int var8 = (class68.field1368 + 256) * var6 >> 8;
        int var9 = (class68.field1368 + 256) * var7 >> 8;
        int var10 = var4 * var8 - var3 * var9 >> 11;
        int var11 = var3 * var8 + var4 * var9 >> 11;
        int var12 = class136.field2975.field3106 - var10 >> 7;
        int var13 = class136.field2975.field3094 + var11 >> 7;
        boolean var14 = class86.method722(var12, 0, 127, 0, 0, class136.field2975.field3120[0], 0, 1, 0, class136.field2975.field3121[0], var13, true);
        if (!var14) {
            return;
        }
        class63.field1299.method135(var3, (byte) -50);
        class63.field1299.method135(var4, (byte) -50);
        class63.field1299.method134(class100.field2104, (byte) -123);
        class63.field1299.method135(57, (byte) -50);
        class63.field1299.method135(class139.field3030, (byte) -50);
        class63.field1299.method135(class68.field1368, (byte) -50);
        class63.field1299.method135(89, (byte) -50);
        class63.field1299.method134(class136.field2975.field3094, (byte) -100);
        class63.field1299.method134(class136.field2975.field3106, (byte) 33);
        class63.field1299.method135(class75.field1500, (byte) -50);
        class63.field1299.method135(63, (byte) -50);
        return;
    }
}
