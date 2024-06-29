import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class54 extends class108 {

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "[I")
    public int[] field1373 = new int[5];

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "[Lua;")
    public class120[] field1377 = new class120[5];

    @OriginalMember(owner = "client!ja", name = "gb", descriptor = "I")
    public int field1390 = 0;

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
    public int field1381;

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "I")
    public int field1384;

    @OriginalMember(owner = "client!ja", name = "lb", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "Z")
    public static boolean field1363 = false;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "J")
    public static long field1366 = 0L;

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "Lgd;")
    private static class40 field1364 = class14.method90(false, "Connecting to friendserver");

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "Lgd;")
    public static class40 field1367 = class14.method90(false, "headicons_prayer");

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "Lgd;")
    private static class40 field1362 = class14.method90(false, "glow3:");

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "Lgd;")
    public static class40 field1369 = field1364;

    @OriginalMember(owner = "client!ja", name = "cb", descriptor = "Lgd;")
    public static class40 field1386 = field1362;

    @OriginalMember(owner = "client!ja", name = "fb", descriptor = "Lgd;")
    private static class40 field1389 = class14.method90(false, "Your ignore list is full)3 Max of 100 hit");

    @OriginalMember(owner = "client!ja", name = "ib", descriptor = "[Lq;")
    public static class99[] field1392 = new class99[4];

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "Lgd;")
    public static class40 field1360 = field1389;

    @OriginalMember(owner = "client!ja", name = "nb", descriptor = "Lgd;")
    public static class40 field1397 = class14.method90(false, "headicons_pk");

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "I")
    public int field1368;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "I")
    public int field1375;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
    public int field1379;

    @OriginalMember(owner = "client!ja", name = "bb", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!ja", name = "eb", descriptor = "I")
    public int field1388;

    @OriginalMember(owner = "client!ja", name = "hb", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!ja", name = "jb", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!ja", name = "qb", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "Lbd;")
    public class11 field1374;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "Lab;")
    public class2 field1380;

    @OriginalMember(owner = "client!ja", name = "ob", descriptor = "Lhc;")
    public class44 field1398;

    @OriginalMember(owner = "client!ja", name = "db", descriptor = "Lid;")
    public class52 field1387;

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "Lja;")
    public class54 field1372;

    @OriginalMember(owner = "client!ja", name = "pb", descriptor = "Lkb;")
    public class61 field1399;

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "Loc;")
    public static class86 field1383;

    @OriginalMember(owner = "client!ja", name = "mb", descriptor = "Lpe;")
    public class95 field1396;

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "Z")
    public boolean field1371;

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "Z")
    public boolean field1376;

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "Z")
    public boolean field1382;

    @OriginalMember(owner = "client!ja", name = "kb", descriptor = "[Lmb;")
    public static class73[] field1394;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "[[[I")
    public static int[][][] field1370;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)V", line = 23)
    public static final void method409(int arg0, int arg1) {
        int[] var2 = class38.field937.field1167;
        if (arg0 != -26959) {
            field1370 = null;
        }
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class112.field2716[arg1][var21][var5] & 0x18) == 0) {
                    class21.field490.method976(var2, var20, 512, arg1, var21, var5);
                }
                if (arg1 < 3 && (class112.field2716[arg1 + 1][var21][var5] & 0x8) != 0) {
                    class21.field490.method976(var2, var20, 512, arg1 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        int var6 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
        field1365++;
        class38.field937.method330();
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class112.field2716[arg1][var19][var8] & 0x18) == 0) {
                    class52.method403(arg0 ^ 0xFFFFD508, var6, var8, var19, arg1, var7);
                }
                if (arg1 < 3 && (class112.field2716[arg1 + 1][var19][var8] & 0x8) != 0) {
                    class52.method403(17337, var6, var8, var19, arg1 + 1, var7);
                }
            }
        }
        class132.field3214 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class21.field490.method989(class99.field2361, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class114.method884(var12, (byte) -56).field406;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = field1392[class99.field2361].field2367;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var14 > var9 - 3 && (var16[var14 - 1][var15] & 0x1280108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var9 + 3 > var14 && (var16[var14 + 1][var15] & 0x1280180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var10 - 3 < var15 && (var16[var14][var15 - 1] & 0x1280102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var15 < var10 + 3 && (var16[var14][var15 + 1] & 0x1280120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class94.field2173[class132.field3214] = class83.field1880[var13];
                        class8.field212[class132.field3214] = var14;
                        class4.field130[class132.field3214] = var15;
                        class132.field3214++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(III)V", line = 169)
    public class54(int arg0, int arg1, int arg2) {
        this.field1378 = arg1;
        this.field1381 = arg2;
        this.field1395 = this.field1384 = arg0;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;", line = 181)
    public static final Class method410(boolean arg0, String arg1) throws ClassNotFoundException {
        field1393++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else {
            if (arg0) {
                field1397 = null;
            }
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 251)
    public static void method411(int arg0) {
        field1370 = null;
        field1362 = null;
        field1394 = null;
        if (arg0 != 536857562) {
            method409(-81, -106);
        }
        field1392 = null;
        field1383 = null;
        field1364 = null;
        field1386 = null;
        field1397 = null;
        field1369 = null;
        field1389 = null;
        field1360 = null;
        field1367 = null;
    }
}
