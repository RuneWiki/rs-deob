import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class42 {

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lo;")
    public static class84 field854 = class15.method124("Malformed login packet)3", 255);

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Lo;")
    public static class84 field855 = class15.method124("go back to the main RuneScape webpage", 255);

    @OriginalMember(owner = "client!h", name = "l", descriptor = "[I")
    public static int[] field860 = new int[4000];

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Lo;")
    public static class84 field853 = class15.method124("backhmid2", 255);

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Lba;")
    public static class8 field852 = new class8(4096);

    @OriginalMember(owner = "client!h", name = "q", descriptor = "[I")
    public static int[] field865 = new int[100];

    @OriginalMember(owner = "client!h", name = "o", descriptor = "[I")
    public static int[] field863 = new int[5];

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Z")
    public static boolean field866 = false;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "[I")
    public static int[] field864 = new int[500];

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "Lhc;")
    public static class45 field862;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Lad;")
    public static class5 field867;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "[I")
    public static int[] field857;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BZ)V", line = 6)
    public static final void method362(byte arg0, boolean arg1) {
        if (arg0 >= -99) {
            field857 = null;
        }
        field849++;
        for (int var2 = 0; var2 < class85.field1933; var2++) {
            class115 var3 = class3.field30[class75.field1571[var2]];
            int var4 = (class75.field1571[var2] << 14) + 536870912;
            if (var3 != null && var3.method496(28738) && var3.field2501.field777 == arg1 && var3.field2501.method342((byte) 80)) {
                int var5 = var3.field1380 >> 7;
                int var6 = var3.field1391 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field1384 == 1 && (var3.field1380 & 0x7F) == 64 && (var3.field1391 & 0x7F) == 64) {
                        if (class16.field290[var5][var6] == class27.field530) {
                            continue;
                        }
                        class16.field290[var5][var6] = class27.field530;
                    }
                    if (!var3.field2501.field786) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class112.field2427.method811(class1.field11, var3.field1380, var3.field1391, class105.method778(class1.field11, var3.field1380, 3, var3.field1391), var3.field1384 * 64 + 60 - 64, var3, var3.field1421, var4, var3.field1439);
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V", line = 56)
    public static final void method363(byte arg0) {
        field850++;
        for (int var1 = 0; var1 < class5.field80; var1++) {
            int var10002 = class6.field116[var1]--;
            if (class6.field116[var1] >= -10) {
                class87 var3 = class88.field1994[var1];
                if (var3 == null) {
                    var3 = class87.method685(class41.field831, class115.field2497[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class6.field116[var1] += var3.method686();
                    class88.field1994[var1] = var3;
                }
                if (class6.field116[var1] < 0) {
                    class29 var4 = var3.method687().method263(class12.field239);
                    class72 var5 = class72.method541(var4, 100, class117.field2569);
                    var5.method536(class15.field261[var1] - 1);
                    class107.field2284.method723(var5);
                    class6.field116[var1] = -100;
                }
            } else {
                class5.field80--;
                for (int var2 = var1; var2 < class5.field80; var2++) {
                    class115.field2497[var2] = class115.field2497[var2 + 1];
                    class88.field1994[var2] = class88.field1994[var2 + 1];
                    class15.field261[var2] = class15.field261[var2 + 1];
                    class6.field116[var2] = class6.field116[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 >= -119) {
            method362((byte) -42, false);
        }
        if (class25.field422 <= 0) {
            return;
        }
        class25.field422 -= 20;
        if (class25.field422 < 0) {
            class25.field422 = 0;
        }
        if (class25.field422 == 0 && class8.field155 != 0 && class103.field2174 != -1) {
            class113.method878(0, 0, class103.field2174, 100, class104.field2197, class8.field155, false);
            return;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILud;Lo;Lo;)[Lvb;", line = 155)
    public static final class121[] method364(int arg0, class118 arg1, class84 arg2, class84 arg3) {
        field859++;
        if (arg0 == 0) {
            int var4 = arg1.method921((byte) -18, arg2);
            int var5 = arg1.method913(false, arg3, var4);
            return class118.method920(arg1, var5, 0, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lmc;I)Z", line = 173)
    public static final boolean method365(class75 arg0, int arg1) {
        field858++;
        int var2 = arg0.field1624;
        if (class49.field1033 == 2) {
            if (var2 == 201) {
                class73.field1541 = class14.field249;
                class120.field2654 = 0;
                class112.field2430 = 1;
                class85.field1927 = true;
                class73.field1526 = class73.field1524;
                class86.field1961 = true;
            }
            if (var2 == 202) {
                class112.field2430 = 2;
                class86.field1961 = true;
                class73.field1526 = class73.field1524;
                class73.field1541 = class24.field396;
                class120.field2654 = 0;
                class85.field1927 = true;
            }
        }
        if (var2 == 205) {
            class79.field1686 = 250;
            return true;
        }
        if (var2 == 501) {
            class120.field2654 = 0;
            class112.field2430 = 4;
            class73.field1541 = class19.field344;
            class86.field1961 = true;
            class73.field1526 = class73.field1524;
            class85.field1927 = true;
        }
        if (var2 == 502) {
            class120.field2654 = 0;
            class85.field1927 = true;
            class73.field1526 = class73.field1524;
            class86.field1961 = true;
            class73.field1541 = class15.field265;
            class112.field2430 = 5;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = var2 & 0x1;
            int var4 = (var2 - 300) / 2;
            class45.field947.method529(var3 == 1, var4, 108);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class45.field947.method534(0, var5, var6 == 1);
        }
        if (var2 == 324) {
            class45.field947.method527(false, false);
        }
        if (var2 == 325) {
            class45.field947.method527(true, false);
        }
        if (var2 == 326) {
            class97.field2070.method979(1, 12);
            class45.field947.method532(class97.field2070, -1);
            class61.field1278++;
            return true;
        } else if (arg1 <= 12) {
            return false;
        } else {
            if (var2 == 620) {
                class63.field1321 = !class63.field1321;
            }
            if (var2 >= 601 && var2 <= 613) {
                class71.method523(-125);
                if (class73.field1528.method639(124) > 0) {
                    class85.field1946++;
                    class97.field2070.method979(1, 72);
                    class97.field2070.method203(-24628, class73.field1528.method649((byte) -125));
                    class97.field2070.method226(-9646, var2 - 601);
                    class97.field2070.method226(-9646, class63.field1321 ? 1 : 0);
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lgb;", line = 295)
    public static final class39 method366(int arg0, int arg1) {
        field861++;
        int var2 = -93 / ((arg0 - 41) / 43);
        class39 var3 = (class39) class73.field1538.method737((long) arg1, (byte) -75);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class40.field813.method909((byte) -118, arg1, 9);
        class39 var5 = new class39();
        var5.field759 = arg1;
        if (var4 != null) {
            var5.method344(false, new class27(var4));
        }
        var5.method348((byte) 13);
        class73.field1538.method744(-124, (long) arg1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)V", line = 323)
    public static final void method367(int arg0, int arg1) {
        field856++;
        if (!class82.method597(true)) {
            return;
        }
        if (arg0 != -14399) {
            method364(44, null, null, null);
        }
        if (class17.field309) {
            class82.field1769 = arg1;
        } else {
            class41.method358(382, arg1);
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V", line = 349)
    public static void method368(byte arg0) {
        if (arg0 != -66) {
            method364(-75, null, null, null);
        }
        field862 = null;
        field855 = null;
        field867 = null;
        field853 = null;
        field857 = null;
        field863 = null;
        field865 = null;
        field854 = null;
        field852 = null;
        field860 = null;
        field864 = null;
    }
}
