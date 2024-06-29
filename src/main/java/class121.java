import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class121 {

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "Z")
    public static volatile boolean field2232 = true;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Lsg;")
    public static class169 field2230 = class165.method1060("", 1536);

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Lsg;")
    public static class169 field2231 = class165.method1060("Zu viele Verbindungen von Ihrer Adresse)3", 1536);

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Lsg;")
    private static class169 field2235 = class165.method1060(" is already on your friend list)3", 1536);

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "Lsg;")
    private static class169 field2234 = class165.method1060("Malformed login packet)3", 1536);

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field2229 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Lsg;")
    public static class169 field2223 = field2235;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field2224 = 0;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Lsg;")
    public static class169 field2227 = field2234;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "[[I")
    public static int[][] field2238 = new int[104][104];

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "B")
    public static byte field2226;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(JI)V")
    public static final void method752(long arg0, int arg1) {
        if (arg1 != 1) {
            field2224 = -63;
        }
        field2237++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class57.field1064; var3++) {
            if (class142.field2640[var3] == arg0) {
                class129.field2401++;
                class57.field1064--;
                for (int var4 = var3; var4 < class57.field1064; var4++) {
                    class137.field2553[var4] = class137.field2553[var4 + 1];
                    class11.field273[var4] = class11.field273[var4 + 1];
                    class142.field2640[var4] = class142.field2640[var4 + 1];
                    class192.field3801[var4] = class192.field3801[var4 + 1];
                }
                class8.field215 = class58.field1078;
                class141.field2621.method1024(12, (byte) -94);
                class141.field2621.method816(arg0, -16701);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZB)V")
    public static final void method753(boolean arg0, byte arg1) {
        field2236++;
        class180.field3519 = arg0;
        int var2 = 5 / ((arg1 - 28) / 63);
        if (!class180.field3519) {
            int var3 = (class27.field553 - class85.field1559.field2346) / 16;
            class41.field771 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var15 = 0; var15 < 4; var15++) {
                    class41.field771[var4][var15] = class85.field1559.method791(106);
                }
            }
            int var5 = class85.field1559.method795((byte) 26);
            int var6 = class85.field1559.method785(true);
            int var7 = class85.field1559.method806(1645316808);
            int var8 = class85.field1559.method827((byte) 77);
            int var9 = class85.field1559.method785(true);
            class57.field1063 = new byte[var3][];
            class134.field2515 = new byte[var3][];
            class128.field2393 = new int[var3];
            boolean var10 = false;
            if ((var8 / 8 == 48 || var8 / 8 == 49) && (var9 / 8) == 48) {
                var10 = true;
            }
            class181.field3532 = new int[var3];
            class67.field1267 = new int[var3];
            if (var8 / 8 == 48 && var9 / 8 == 148) {
                var10 = true;
            }
            int var11 = 0;
            for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                for (int var13 = (var9 - 6) / 8; var13 <= (var9 + 6) / 8; var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (!var10 || var13 != 49 && var13 != 149 && var13 != 147 && var12 != 50 && (var12 != 49 || var13 != 47)) {
                        class67.field1267[var11] = var14;
                        class128.field2393[var11] = class137.field2555.method553(-62, class165.method1058(0, new class169[] { class112.field2049, class2.method18((byte) -62, var12), class135.field2529, class2.method18((byte) -62, var13) }));
                        class181.field3532[var11] = class137.field2555.method553(-16, class165.method1058(0, new class169[] { class65.field1208, class2.method18((byte) -62, var12), class135.field2529, class2.method18((byte) -62, var13) }));
                        var11++;
                    }
                }
            }
            class81.method494(var7, var9, var8, var6, -22725, var5);
            return;
        }
        int var16 = class85.field1559.method785(true);
        int var17 = class85.field1559.method806(1645316808);
        int var18 = class85.field1559.method827((byte) 120);
        class85.field1559.method1033(true);
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var36 = 0; var36 < 13; var36++) {
                for (int var37 = 0; var37 < 13; var37++) {
                    int var38 = class85.field1559.method1031(1, (byte) 61);
                    if (var38 == 1) {
                        class206.field4043[var19][var36][var37] = class85.field1559.method1031(26, (byte) 93);
                    } else {
                        class206.field4043[var19][var36][var37] = -1;
                    }
                }
            }
        }
        class85.field1559.method1029(7);
        int var20 = (class27.field553 - class85.field1559.field2346) / 16;
        class41.field771 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var35 = 0; var35 < 4; var35++) {
                class41.field771[var21][var35] = class85.field1559.method791(81);
            }
        }
        int var22 = class85.field1559.method795((byte) 26);
        int var23 = class85.field1559.method795((byte) 26);
        class57.field1063 = new byte[var20][];
        class181.field3532 = new int[var20];
        class67.field1267 = new int[var20];
        class128.field2393 = new int[var20];
        class134.field2515 = new byte[var20][];
        int var24 = 0;
        for (int var25 = 0; var25 < 4; var25++) {
            for (int var26 = 0; var26 < 13; var26++) {
                for (int var27 = 0; var27 < 13; var27++) {
                    int var28 = class206.field4043[var25][var26][var27];
                    if (var28 != -1) {
                        int var29 = var28 >> 14 & 0x3FF;
                        int var30 = var28 >> 3 & 0x7FF;
                        int var31 = (var29 / 8 << 8) + var30 / 8;
                        for (int var32 = 0; var32 < var24; var32++) {
                            if (class67.field1267[var32] == var31) {
                                var31 = -1;
                                break;
                            }
                        }
                        if (var31 != -1) {
                            class67.field1267[var24] = var31;
                            int var33 = var31 >> 8 & 0xFF;
                            int var34 = var31 & 0xFF;
                            class128.field2393[var24] = class137.field2555.method553(-82, class165.method1058(0, new class169[] { class112.field2049, class2.method18((byte) -62, var33), class135.field2529, class2.method18((byte) -62, var34) }));
                            class181.field3532[var24] = class137.field2555.method553(-114, class165.method1058(0, new class169[] { class65.field1208, class2.method18((byte) -62, var33), class135.field2529, class2.method18((byte) -62, var34) }));
                            var24++;
                        }
                    }
                }
            }
        }
        class81.method494(var17, var23, var18, var22, -22725, var16);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method754(int arg0) {
        field2231 = null;
        field2238 = null;
        int var1 = -36 / ((44 - arg0) / 57);
        field2223 = null;
        field2227 = null;
        field2234 = null;
        field2230 = null;
        field2235 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Lqf;")
    public static final class150 method755(int arg0, int arg1, int arg2) {
        field2228++;
        class150 var3 = class62.method385((byte) 41, arg0);
        if (arg2 == -1) {
            return var3;
        } else {
            if (arg1 != -5207) {
                method755(100, 64, -43);
            }
            return var3 == null || var3.field2784 == null || var3.field2784.length <= arg2 ? null : var3.field2784[arg2];
        }
    }
}
