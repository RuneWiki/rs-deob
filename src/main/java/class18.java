import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class18 {

    @OriginalMember(owner = "client!c", name = "f", descriptor = "[Lsc;")
    public static class181[] field321 = new class181[1000];

    @OriginalMember(owner = "client!c", name = "l", descriptor = "[Z")
    public static boolean[] field327 = new boolean[5];

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Ljb;")
    public static class11 field317;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Lpe;")
    public static class245 field316;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "[Ltg;")
    public static class107[] field318;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "[Ltg;")
    public static class107[] field320;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "[[[B")
    public static byte[][][] field328;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)V")
    public static final void method169(byte arg0, int arg1) {
        field325++;
        if (class80.field1291 == null || arg1 > class80.field1291.length) {
            class80.field1291 = new int[arg1];
        }
        if (arg0 != -125) {
            field328 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method170(byte[] arg0, boolean arg1) {
        field319++;
        if (!arg1) {
            field318 = null;
        }
        class230 var2 = new class230(arg0);
        int var3 = var2.method1516((byte) 82);
        int var4 = var2.method1529(-32494);
        if (var4 < 0 || !(class247.field4319 == 0 || var4 <= class247.field4319)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1530(0, 119, var5, var4);
            return var5;
        } else {
            int var6 = var2.method1529(-32494);
            if (var6 < 0 || !(class247.field4319 == 0 || class247.field4319 >= var6)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class130.method840(var7, var6, arg0, var4, 9);
            } else {
                class248.field4332.method56((byte) -87, var7, var2);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLsc;)V")
    public static final void method171(boolean arg0, class181 arg1) {
        field326++;
        if (class264.field4594 >= 2) {
            if (arg1.method1227(30093, class137.field2244)) {
                class69.method481(49);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class202.method1357(class175.method1164(new class181[] { class257.field4501, class169.method1119((byte) -106, var4), class21.field378 }, (byte) 124), 0, (byte) -125, (class181) null);
            }
            if (arg1.method1227(30093, class166.field2820)) {
                class124.method804(49);
            }
            if (arg1.method1227(30093, class225.field3880)) {
                class92.method612(25, 255);
            }
            if (arg1.method1227(30093, class90.field1429)) {
                class25.field436 = true;
            }
            if (arg1.method1227(30093, class242.field4215)) {
                class25.field436 = false;
            }
            if (arg1.method1227(30093, class211.field3619)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class109.field1784[var5].field142[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method1230(false, class1.field8) && class113.field1840 != 0) {
                class261.method1775(arg1.method1215(114, 6).method1234(false), (byte) -3);
            }
            if (arg1.method1227(30093, class108.field1773) && class113.field1840 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method1230(false, class12.field255)) {
                class239.field4161 = arg1.method1215(123, 12).method1232(123).method1234(arg0);
                class202.method1357(class175.method1164(new class181[] { class264.field4602, class169.method1119((byte) 31, class239.field4161) }, (byte) 123), 0, (byte) -123, (class181) null);
            }
            if (arg1.method1227(30093, class94.field1508)) {
                class166.field2826 = true;
            }
        }
        class141.field2275.method541(215, 66);
        class228.field3919++;
        if (!arg0) {
            class141.field2275.method1538(arg1.method1226(-458531486) - 1, (byte) 105);
            class141.field2275.method1550(arg1.method1215(114, 2), -116);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static void method172(boolean arg0) {
        field328 = null;
        field321 = null;
        field317 = null;
        field327 = null;
        if (arg0) {
            field320 = null;
            field318 = null;
            field316 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljb;BI)Z")
    public static final boolean method173(class11 arg0, byte arg1, int arg2) {
        field329++;
        if (arg1 <= 57) {
            field327 = null;
        }
        byte[] var3 = arg0.method106(arg2, -26899);
        if (var3 == null) {
            return false;
        } else {
            class218.method1455(true, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class86.field1365[arg0][var8][var14] == -class257.field4500) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class31.field505[arg0][arg1][arg3] + arg5;
            if (!class222.method1473(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class222.method1473(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class222.method1473(var9, var11, var13)) {
                return false;
            } else if (class222.method1473(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class5.method42(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class222.method1473(var6 + 1, class31.field505[arg0][arg1][arg3] + arg5, var7 + 1) && class222.method1473(var6 + 128 - 1, class31.field505[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class222.method1473(var6 + 128 - 1, class31.field505[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class222.method1473(var6 + 1, class31.field505[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }
}
