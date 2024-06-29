import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class11 extends class134 {

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "[S")
    private short[] field252 = new short[6];

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "[S")
    private short[] field262 = new short[6];

    @OriginalMember(owner = "client!bc", name = "cb", descriptor = "I")
    public int field265 = -1;

    @OriginalMember(owner = "client!bc", name = "eb", descriptor = "Z")
    public boolean field267 = false;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "[I")
    private int[] field260 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "Lwd;")
    public static class150 field257 = class2.method9(true, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "Lwd;")
    public static class150 field253 = class2.method9(true, " weitere Optionen");

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "[Z")
    public static boolean[] field259 = new boolean[112];

    @OriginalMember(owner = "client!bc", name = "hb", descriptor = "Lwd;")
    public static class150 field270 = class2.method9(true, "Mem:");

    @OriginalMember(owner = "client!bc", name = "ob", descriptor = "I")
    public static int field277 = 0;

    @OriginalMember(owner = "client!bc", name = "ab", descriptor = "Lwd;")
    private static class150 field263 = class2.method9(true, "Hide");

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "Lwd;")
    public static class150 field261 = field263;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "Li;")
    public static class56 field258 = new class56(64);

    @OriginalMember(owner = "client!bc", name = "qb", descriptor = "[Lwd;")
    public static class150[] field279 = new class150[20];

    @OriginalMember(owner = "client!bc", name = "vb", descriptor = "Lwd;")
    public static class150 field284 = class2.method9(true, "redstone2");

    @OriginalMember(owner = "client!bc", name = "tb", descriptor = "[I")
    public static int[] field282 = new int[5];

    @OriginalMember(owner = "client!bc", name = "rb", descriptor = "I")
    public static int field280 = 0;

    @OriginalMember(owner = "client!bc", name = "ub", descriptor = "Lwd;")
    public static class150 field283 = class2.method9(true, "Art");

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!bc", name = "bb", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!bc", name = "fb", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!bc", name = "gb", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!bc", name = "jb", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!bc", name = "kb", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!bc", name = "lb", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!bc", name = "mb", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!bc", name = "nb", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!bc", name = "pb", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!bc", name = "ib", descriptor = "Lcb;")
    public static class17 field271;

    @OriginalMember(owner = "client!bc", name = "db", descriptor = "[I")
    private int[] field266;

    @OriginalMember(owner = "client!bc", name = "sb", descriptor = "[[[B")
    public static byte[][][] field281;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lwb;B)V")
    public final void method64(class148 arg0, byte arg1) {
        field275++;
        if (arg1 != 51) {
            this.method70((byte) -13);
        }
        while (true) {
            int var3 = arg0.method1137(arg1 ^ 0xCC);
            if (var3 == 0) {
                return;
            }
            this.method74(var3, arg0, (byte) 23);
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V")
    public static void method65(boolean arg0) {
        field263 = null;
        if (arg0) {
            field280 = 54;
        }
        field270 = null;
        field257 = null;
        field271 = null;
        field261 = null;
        field253 = null;
        field281 = null;
        field283 = null;
        field279 = null;
        field284 = null;
        field282 = null;
        field259 = null;
        field258 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)V")
    public static final void method66(int arg0, boolean arg1) {
        field256++;
        if (class137.field3209 == arg0) {
            return;
        }
        if (class137.field3209 == 0) {
            class42.method305(-27411);
        }
        if (arg1) {
            method65(true);
        }
        if (arg0 == 20 || arg0 == 40) {
            class6.field147 = 0;
            class88.field2074 = 0;
            class98.field2242 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class141.field3401 != null) {
            class141.field3401.method121((byte) 127);
            class141.field3401 = null;
        }
        if (class137.field3209 == 25 || class137.field3209 == 40) {
            client.method179(-27652);
            class120.method878();
        }
        if (class137.field3209 == 25) {
            class88.field2076 = 1;
            class24.field715 = 1;
            class10.field239 = 0;
            class144.field3468 = 0;
            class127.field2997 = 0;
        }
        if (arg0 == 0 || arg0 == 35) {
            class125.method949((byte) 94);
            class124.method943(0);
            if (class41.field1071 == null) {
                class41.field1071 = class82.method591((byte) -124, class142.field3439, 503, 765);
            }
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class41.field1071 = null;
            class125.method949((byte) 67);
            class69.method526(class66.field1677, 192, class142.field3439, class43.field1202);
        }
        if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
            class41.field1071 = null;
            class124.method943(0);
            class42.method303((byte) 57, class142.field3439, class66.field1677);
        }
        class137.field3209 = arg0;
        class97.field2225 = true;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)V")
    public static final void method67(byte arg0, int arg1) {
        field273++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class91.field2115[arg1];
        int var3 = class116.field2663[arg1];
        int var4 = class66.field1687[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        if (arg0 > -60) {
            field282 = null;
        }
        int var5 = class9.field205[arg1];
        if (class46.field1251 != 0 && var4 != 1005) {
            class46.field1251 = 0;
            class40.field1067 = true;
        }
        if (var4 == 5 && class30.method243(var3, 0, var5, var2)) {
            class143.field3451.method965(true, 75);
            class9.field204++;
            class143.field3451.method1102((byte) -86, class42.field1114);
            class143.field3451.method1133(var5 >> 14 & 0x7FFF, -127);
            class143.field3451.method1133(class49.field1299, -108);
            class143.field3451.method1131(class34.field956, 2014062376);
            class143.field3451.method1131(class66.field1686 + var2, 2014062376);
            class143.field3451.method1142(255, class77.field1905 + var3);
        }
        if (var4 == 19) {
            class30.method243(var3, 0, var5, var2);
            class130.field3065++;
            class143.field3451.method965(true, 88);
            class143.field3451.method1133(class77.field1905 + var3, -116);
            class143.field3451.method1131(class66.field1686 + var2, 2014062376);
            class143.field3451.method1133(var5 >> 14 & 0x7FFF, -89);
        }
        if (var4 == 48) {
            class18.method126(3);
            class42.field1114 = var3;
            class82.field1972 = true;
            class49.field1299 = var2;
            class130.field3060 = 1;
            class34.field956 = var5;
            class78.field1923 = class111.method786((byte) 79, new class150[] { class56.field1463, class4.method26((byte) 86, var5).field558, class3.field59 });
            if (class78.field1923 == null) {
                class78.field1923 = class49.field1320;
            }
            return;
        }
        if (var4 == 31) {
            class50.field1329++;
            class143.field3451.method965(true, 77);
            class143.field3451.method1131(var5, 2014062376);
            class143.field3451.method1114((byte) -84, var2);
            class143.field3451.method1102((byte) -86, var3);
            class103.field2328 = var2;
            class41.field1092 = var3;
            class103.field2330 = 2;
            if (var3 >> 16 == class107.field2436) {
                class103.field2330 = 1;
            }
            class86.field2036 = 0;
            if (var3 >> 16 == class66.field1688) {
                class103.field2330 = 3;
            }
        }
        if (var4 == 44) {
            class18 var6 = class37.field1013[var5];
            if (var6 != null) {
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 124, 1, 1, var6.field2934[0], var6.field2963[0], false, class46.field1244.field2963[0]);
                class90.field2094 = 2;
                class76.field1892 = 0;
                class3.field64 = class14.field370;
                class63.field1635 = class131.field3098;
                class22.field642++;
                class143.field3451.method965(true, 54);
                class143.field3451.method1131(var5, 2014062376);
            }
        }
        if (var4 == 10) {
            class112.field2581++;
            class143.field3451.method965(true, 231);
            class143.field3451.method1142(255, var5);
            class143.field3451.method1122((byte) 32, var3);
            class143.field3451.method1142(255, var2);
            class103.field2330 = 2;
            if (var3 >> 16 == class107.field2436) {
                class103.field2330 = 1;
            }
            class41.field1092 = var3;
            class86.field2036 = 0;
            if (var3 >> 16 == class66.field1688) {
                class103.field2330 = 3;
            }
            class103.field2328 = var2;
        }
        if (var4 == 39) {
            class127.method958(-95, var5, var3, var2);
        }
        if (var4 == 50) {
            class18 var7 = class37.field1013[var5];
            if (var7 != null) {
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 123, 1, 1, var7.field2934[0], var7.field2963[0], false, class46.field1244.field2963[0]);
                class23.field671++;
                class3.field64 = class14.field370;
                class90.field2094 = 2;
                class63.field1635 = class131.field3098;
                class76.field1892 = 0;
                class143.field3451.method965(true, 47);
                class143.field3451.method1133(var5, -113);
            }
        }
        if (var4 == 30) {
            boolean var8 = class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 127, 0, 0, var3, var2, false, class46.field1244.field2963[0]);
            class95.field2205++;
            if (!var8) {
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 124, 1, 1, var3, var2, false, class46.field1244.field2963[0]);
            }
            class63.field1635 = class131.field3098;
            class3.field64 = class14.field370;
            class76.field1892 = 0;
            class90.field2094 = 2;
            class143.field3451.method965(true, 70);
            class143.field3451.method1131(class77.field1905 + var3, 2014062376);
            class143.field3451.method1133(var5, -92);
            class143.field3451.method1114((byte) -91, class66.field1686 + var2);
        }
        if (var4 == 36) {
            class111 var10 = class137.field3217[var5];
            if (var10 != null) {
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 125, 1, 1, var10.field2934[0], var10.field2963[0], false, class46.field1244.field2963[0]);
                class105.field2372++;
                class90.field2094 = 2;
                class3.field64 = class14.field370;
                class76.field1892 = 0;
                class63.field1635 = class131.field3098;
                class143.field3451.method965(true, 142);
                class143.field3451.method1114((byte) -117, var5);
            }
        }
        if (var4 == 6) {
            class99.field2254++;
            class143.field3451.method965(true, 190);
            class143.field3451.method1114((byte) -105, var5);
            class143.field3451.method1133(var2, -121);
            class143.field3451.method1122((byte) 32, var3);
            class86.field2036 = 0;
            class41.field1092 = var3;
            class103.field2330 = 2;
            if (var3 >> 16 == class107.field2436) {
                class103.field2330 = 1;
            }
            if (var3 >> 16 == class66.field1688) {
                class103.field2330 = 3;
            }
            class103.field2328 = var2;
        }
        if (var4 == 28) {
            class18 var11 = class37.field1013[var5];
            if (var11 != null) {
                class43.field1164++;
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 123, 1, 1, var11.field2934[0], var11.field2963[0], false, class46.field1244.field2963[0]);
                class63.field1635 = class131.field3098;
                class3.field64 = class14.field370;
                class76.field1892 = 0;
                class90.field2094 = 2;
                class143.field3451.method965(true, 74);
                class143.field3451.method1142(255, var5);
                class143.field3451.method1142(255, class88.field2059);
                class143.field3451.method1155(class47.field1260, 24);
            }
        }
        if (var4 == 16) {
            class68.field1704++;
            class143.field3451.method965(true, 208);
            class143.field3451.method1122((byte) 32, var3);
            class141 var12 = class146.method1097(var3, true);
            if (var12.field3346 != null && var12.field3346[0][0] == 5) {
                int var13 = var12.field3346[0][1];
                if (class16.field423[var13] != var12.field3310[0]) {
                    class16.field423[var13] = var12.field3310[0];
                    class107.method740(var13, -85);
                    class82.field1972 = true;
                }
            }
        }
        if (var4 == 17) {
            class133.field3137++;
            class143.field3451.method965(true, 237);
            class143.field3451.method1142(255, var5);
            class143.field3451.method1150(-1375755280, var3);
            class143.field3451.method1131(var2, 2014062376);
            class103.field2330 = 2;
            if (var3 >> 16 == class107.field2436) {
                class103.field2330 = 1;
            }
            if (var3 >> 16 == class66.field1688) {
                class103.field2330 = 3;
            }
            class103.field2328 = var2;
            class86.field2036 = 0;
            class41.field1092 = var3;
        }
        if (var4 == 47) {
            class97.field2223++;
            class143.field3451.method965(true, 72);
            class143.field3451.method1114((byte) -124, class88.field2059);
            class143.field3451.method1150(-1375755280, class47.field1260);
            class143.field3451.method1114((byte) -74, var2);
            class143.field3451.method1122((byte) 32, var3);
        }
        if (var4 == 33) {
            class150 var14 = class2.field50[arg1];
            int var15 = var14.method1200(class3.field59, 29903);
            if (var15 != -1) {
                long var16 = var14.method1196(var15 + 5, -31851).method1201(true).method1198(1);
                int var18 = -1;
                for (int var19 = 0; var19 < class50.field1347; var19++) {
                    if (class3.field61[var19] == var16) {
                        var18 = var19;
                        break;
                    }
                }
                if (var18 != -1 && class30.field893[var18] > 0) {
                    class61.field1551 = true;
                    class46.field1251 = 0;
                    class70.field1775 = 3;
                    class40.field1067 = true;
                    class43.field1188 = class43.field1167;
                    class6.field160 = class3.field61[var18];
                    class43.field1180 = class111.method786((byte) -120, new class150[] { class66.field1673, class146.field3537[var18] });
                }
            }
        }
        if (var4 == 9) {
            class111 var20 = class137.field3217[var5];
            if (var20 != null) {
                class35.field963++;
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 123, 1, 1, var20.field2934[0], var20.field2963[0], false, class46.field1244.field2963[0]);
                class76.field1892 = 0;
                class90.field2094 = 2;
                class3.field64 = class14.field370;
                class63.field1635 = class131.field3098;
                class143.field3451.method965(true, 192);
                class143.field3451.method1131(class34.field956, 2014062376);
                class143.field3451.method1131(var5, 2014062376);
                class143.field3451.method1142(255, class49.field1299);
                class143.field3451.method1155(class42.field1114, 43);
            }
        }
        if (var4 == 2) {
            class101.field2293++;
            boolean var21 = class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 124, 0, 0, var3, var2, false, class46.field1244.field2963[0]);
            if (!var21) {
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 122, 1, 1, var3, var2, false, class46.field1244.field2963[0]);
            }
            class3.field64 = class14.field370;
            class90.field2094 = 2;
            class76.field1892 = 0;
            class63.field1635 = class131.field3098;
            class143.field3451.method965(true, 203);
            class143.field3451.method1142(255, class77.field1905 + var3);
            class143.field3451.method1131(var2 + class66.field1686, 2014062376);
            class143.field3451.method1133(var5, -106);
        }
        if (var4 == 54) {
            class143.field3451.method965(true, 61);
            class32.field929++;
            class143.field3451.method1150(-1375755280, var3);
            class143.field3451.method1131(var2, 2014062376);
            class143.field3451.method1142(255, var5);
            class86.field2036 = 0;
            class103.field2328 = var2;
            class41.field1092 = var3;
            class103.field2330 = 2;
            if (var3 >> 16 == class107.field2436) {
                class103.field2330 = 1;
            }
            if (var3 >> 16 == class66.field1688) {
                class103.field2330 = 3;
            }
        }
        if (var4 == 43 && class30.method243(var3, 0, var5, var2)) {
            class143.field3451.method965(true, 43);
            class143.field3451.method1142(255, class88.field2059);
            class128.field3044++;
            class143.field3451.method1142(255, var2 + class66.field1686);
            class143.field3451.method1131(var5 >> 14 & 0x7FFF, 2014062376);
            class143.field3451.method1133(class77.field1905 + var3, -106);
            class143.field3451.method1155(class47.field1260, 102);
        }
        if (var4 == 1003) {
            class30.method243(var3, 0, var5, var2);
            class131.field3083++;
            class143.field3451.method965(true, 165);
            class143.field3451.method1133(class66.field1686 + var2, -103);
            class143.field3451.method1114((byte) -93, var5 >> 14 & 0x7FFF);
            class143.field3451.method1142(255, class77.field1905 + var3);
        }
        if (var4 == 55) {
            if (class145.field3517) {
                class111.field2548.method930(class17.field466, var2 - 4, var3 - 4);
            } else {
                class111.field2548.method930(class17.field466, class14.field370 - 4, class131.field3098 - 4);
            }
        }
        if (var4 == 58) {
            class111 var23 = class137.field3217[var5];
            if (var23 != null) {
                class9.field207++;
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 125, 1, 1, var23.field2934[0], var23.field2963[0], false, class46.field1244.field2963[0]);
                class90.field2094 = 2;
                class3.field64 = class14.field370;
                class76.field1892 = 0;
                class63.field1635 = class131.field3098;
                class143.field3451.method965(true, 42);
                class143.field3451.method1114((byte) -81, var5);
            }
        }
        if (var4 == 25) {
            class18 var24 = class37.field1013[var5];
            if (var24 != null) {
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 120, 1, 1, var24.field2934[0], var24.field2963[0], false, class46.field1244.field2963[0]);
                class3.field64 = class14.field370;
                class90.field2094 = 2;
                class76.field1892 = 0;
                class35.field960++;
                class63.field1635 = class131.field3098;
                class143.field3451.method965(true, 210);
                class143.field3451.method1142(255, var5);
            }
        }
        if (var4 == 12) {
            boolean var25 = class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 123, 0, 0, var3, var2, false, class46.field1244.field2963[0]);
            class4.field82++;
            if (!var25) {
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 122, 1, 1, var3, var2, false, class46.field1244.field2963[0]);
            }
            class90.field2094 = 2;
            class63.field1635 = class131.field3098;
            class76.field1892 = 0;
            class3.field64 = class14.field370;
            class143.field3451.method965(true, 241);
            class143.field3451.method1133(class66.field1686 + var2, -98);
            class143.field3451.method1133(var5, -95);
            class143.field3451.method1131(class77.field1905 + var3, 2014062376);
        }
        if (var4 == 27) {
            class18 var27 = class37.field1013[var5];
            if (var27 != null) {
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 122, 1, 1, var27.field2934[0], var27.field2963[0], false, class46.field1244.field2963[0]);
                class90.field2094 = 2;
                class3.field64 = class14.field370;
                class76.field1892 = 0;
                class17.field439++;
                class63.field1635 = class131.field3098;
                class143.field3451.method965(true, 222);
                class143.field3451.method1133(var5, -97);
            }
        }
        if (var4 == 37) {
            class111 var28 = class137.field3217[var5];
            if (var28 != null) {
                class43.field1196++;
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 125, 1, 1, var28.field2934[0], var28.field2963[0], false, class46.field1244.field2963[0]);
                class3.field64 = class14.field370;
                class76.field1892 = 0;
                class63.field1635 = class131.field3098;
                class90.field2094 = 2;
                class143.field3451.method965(true, 82);
                class143.field3451.method1142(255, var5);
            }
        }
        if (var4 == 7) {
            class127.field3008++;
            class143.field3451.method965(true, 130);
            class143.field3451.method1150(-1375755280, var3);
            class143.field3451.method1131(var2, 2014062376);
            class143.field3451.method1114((byte) -88, var5);
            class103.field2330 = 2;
            class86.field2036 = 0;
            if (var3 >> 16 == class107.field2436) {
                class103.field2330 = 1;
            }
            if (var3 >> 16 == class66.field1688) {
                class103.field2330 = 3;
            }
            class103.field2328 = var2;
            class41.field1092 = var3;
        }
        if (var4 == 38) {
            class141 var29 = class70.method535(var2, -64, var3);
            if (var29 != null) {
                class18.method126(3);
                class56.method435(var2, 1, class70.method531((byte) -110, class124.method942(var29, true)), var3);
                class82.field1972 = true;
                class130.field3060 = 0;
                class80.field1937 = class104.method713(118, var29);
                if (class80.field1937 == null) {
                    class80.field1937 = class107.field2418;
                }
                if (var29.field3370) {
                    class68.field1727 = class111.method786((byte) 33, new class150[] { var29.field3411, class3.field59 });
                } else {
                    class68.field1727 = class111.method786((byte) -122, new class150[] { class99.field2280, var29.field3402, class3.field59 });
                }
                if (class56.field1466 == 16 && !var29.field3370) {
                    class82.field1972 = true;
                    class24.field695 = 3;
                    class66.field1685 = true;
                }
            }
            return;
        }
        if (var4 == 8) {
            class148.field3628++;
            boolean var30 = class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 120, 0, 0, var3, var2, false, class46.field1244.field2963[0]);
            if (!var30) {
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 124, 1, 1, var3, var2, false, class46.field1244.field2963[0]);
            }
            class76.field1892 = 0;
            class3.field64 = class14.field370;
            class63.field1635 = class131.field3098;
            class90.field2094 = 2;
            class143.field3451.method965(true, 146);
            class143.field3451.method1131(var3 + class77.field1905, 2014062376);
            class143.field3451.method1114((byte) -80, var5);
            class143.field3451.method1133(var2 + class66.field1686, -102);
        }
        if (var4 == 41) {
            class6.field156++;
            boolean var32 = class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 121, 0, 0, var3, var2, false, class46.field1244.field2963[0]);
            if (!var32) {
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 123, 1, 1, var3, var2, false, class46.field1244.field2963[0]);
            }
            class76.field1892 = 0;
            class3.field64 = class14.field370;
            class90.field2094 = 2;
            class63.field1635 = class131.field3098;
            class143.field3451.method965(true, 124);
            class143.field3451.method1142(255, var3 + class77.field1905);
            class143.field3451.method1131(class66.field1686 + var2, 2014062376);
            class143.field3451.method1142(255, var5);
        }
        if (var4 == 20) {
            class68.field1704++;
            class143.field3451.method965(true, 208);
            class143.field3451.method1122((byte) 32, var3);
            class141 var34 = class146.method1097(var3, true);
            if (var34.field3346 != null && var34.field3346[0][0] == 5) {
                int var35 = var34.field3346[0][1];
                class16.field423[var35] = 1 - class16.field423[var35];
                class107.method740(var35, -66);
                class82.field1972 = true;
            }
        }
        if (var4 == 21 || var4 == 3 || var4 == 53 || var4 == 32) {
            class150 var36 = class2.field50[arg1];
            int var37 = var36.method1200(class3.field59, 29903);
            if (var37 != -1) {
                long var38 = var36.method1196(var37 + 5, -31851).method1201(true).method1198(1);
                if (var4 == 21) {
                    class54.method427(var38, (byte) 17);
                }
                if (var4 == 3) {
                    class1.method4(var38, (byte) -101);
                }
                if (var4 == 53) {
                    class76.method565(65, var38);
                }
                if (var4 == 32) {
                    class125.method946((byte) 108, var38);
                }
            }
        }
        if (var4 == 1002) {
            class141 var40 = class146.method1097(var3, true);
            if (var40 == null || var40.field3334[var2] < 100000) {
                class46.field1239++;
                class143.field3451.method965(true, 152);
                class143.field3451.method1142(255, var5);
            } else {
                class3.method16(99, 0, class111.method786((byte) -106, new class150[] { class29.method239(1000, var40.field3334[var2]), class126.field2911, class4.method26((byte) 120, var5).field558 }), class43.field1167);
            }
            class103.field2328 = var2;
            class86.field2036 = 0;
            class103.field2330 = 2;
            class41.field1092 = var3;
            if (var3 >> 16 == class107.field2436) {
                class103.field2330 = 1;
            }
            if (var3 >> 16 == class66.field1688) {
                class103.field2330 = 3;
            }
        }
        if (var4 == 34) {
            class111 var41 = class137.field3217[var5];
            if (var41 != null) {
                class24.field692++;
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 124, 1, 1, var41.field2934[0], var41.field2963[0], false, class46.field1244.field2963[0]);
                class63.field1635 = class131.field3098;
                class3.field64 = class14.field370;
                class90.field2094 = 2;
                class76.field1892 = 0;
                class143.field3451.method965(true, 91);
                class143.field3451.method1133(var5, -95);
            }
        }
        if (var4 == 18 || var4 == 45) {
            class150 var42 = class2.field50[arg1];
            int var43 = var42.method1200(class3.field59, 29903);
            if (var43 != -1) {
                class150 var44 = var42.method1196(var43 + 5, -31851).method1201(true);
                class150 var45 = var44.method1179(-37).method1175((byte) 71);
                boolean var46 = false;
                for (int var47 = 0; var47 < class109.field2533; var47++) {
                    class111 var48 = class137.field3217[class61.field1574[var47]];
                    if (var48 != null && var48.field2555 != null && var48.field2555.method1181(true, var45)) {
                        class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 122, 1, 1, var48.field2934[0], var48.field2963[0], false, class46.field1244.field2963[0]);
                        var46 = true;
                        if (var4 == 18) {
                            class143.field3451.method965(true, 91);
                            class143.field3451.method1133(class61.field1574[var47], -88);
                            class24.field692++;
                        }
                        if (var4 == 45) {
                            class43.field1196++;
                            class143.field3451.method965(true, 82);
                            class143.field3451.method1142(255, class61.field1574[var47]);
                        }
                        break;
                    }
                }
                if (!var46) {
                    class3.method16(99, 0, class111.method786((byte) -120, new class150[] { class113.field2617, var45 }), class43.field1167);
                }
            }
        }
        if (var4 == 14) {
            class18 var49 = class37.field1013[var5];
            if (var49 != null) {
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 122, 1, 1, var49.field2934[0], var49.field2963[0], false, class46.field1244.field2963[0]);
                class131.field3088++;
                class90.field2094 = 2;
                class3.field64 = class14.field370;
                class76.field1892 = 0;
                class63.field1635 = class131.field3098;
                class143.field3451.method965(true, 132);
                class143.field3451.method1133(class34.field956, -108);
                class143.field3451.method1142(255, var5);
                class143.field3451.method1133(class49.field1299, -84);
                class143.field3451.method1102((byte) -86, class42.field1114);
            }
        }
        if (var4 == 46) {
            class141 var50 = class146.method1097(var3, true);
            boolean var51 = true;
            if (var50.field3338 > 0) {
                var51 = class56.method439(var50, -90);
            }
            if (var51) {
                class68.field1704++;
                class143.field3451.method965(true, 208);
                class143.field3451.method1122((byte) 32, var3);
            }
        }
        if (var4 == 52 && class147.field3559 == -1) {
            class47.method353(var3, 12, var2);
            class147.field3559 = var3;
            class49.field1323 = var2;
        }
        if (var4 == 4) {
            class68.method520(class29.field882, 2);
            class29.field882 = -1;
            class40.field1067 = true;
        }
        if (var4 == 56) {
            class128.field3049++;
            class143.field3451.method965(true, 139);
            class143.field3451.method1122((byte) 32, var3);
            class143.field3451.method1133(var5, -84);
            class143.field3451.method1114((byte) -89, var2);
            class41.field1092 = var3;
            class103.field2330 = 2;
            if (var3 >> 16 == class107.field2436) {
                class103.field2330 = 1;
            }
            if (var3 >> 16 == class66.field1688) {
                class103.field2330 = 3;
            }
            class103.field2328 = var2;
            class86.field2036 = 0;
        }
        if (var4 == 40) {
            class30.method243(var3, 0, var5, var2);
            class143.field3451.method965(true, 32);
            class28.field857++;
            class143.field3451.method1114((byte) -70, class66.field1686 + var2);
            class143.field3451.method1142(255, var5 >> 14 & 0x7FFF);
            class143.field3451.method1133(class77.field1905 + var3, -114);
        }
        if (var4 == 49) {
            class111 var52 = class137.field3217[var5];
            if (var52 != null) {
                class37.field1019++;
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 121, 1, 1, var52.field2934[0], var52.field2963[0], false, class46.field1244.field2963[0]);
                class90.field2094 = 2;
                class76.field1892 = 0;
                class3.field64 = class14.field370;
                class63.field1635 = class131.field3098;
                class143.field3451.method965(true, 228);
                class143.field3451.method1142(255, var5);
            }
        }
        if (var4 == 1) {
            class18 var53 = class37.field1013[var5];
            if (var53 != null) {
                class1.field7++;
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 120, 1, 1, var53.field2934[0], var53.field2963[0], false, class46.field1244.field2963[0]);
                class3.field64 = class14.field370;
                class63.field1635 = class131.field3098;
                class76.field1892 = 0;
                class90.field2094 = 2;
                class143.field3451.method965(true, 216);
                class143.field3451.method1142(255, var5);
            }
        }
        if (var4 == 35) {
            class54.field1428++;
            boolean var54 = class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 122, 0, 0, var3, var2, false, class46.field1244.field2963[0]);
            if (!var54) {
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 120, 1, 1, var3, var2, false, class46.field1244.field2963[0]);
            }
            class76.field1892 = 0;
            class90.field2094 = 2;
            class63.field1635 = class131.field3098;
            class3.field64 = class14.field370;
            class143.field3451.method965(true, 28);
            class143.field3451.method1142(255, class34.field956);
            class143.field3451.method1142(255, var5);
            class143.field3451.method1155(class42.field1114, 107);
            class143.field3451.method1131(var3 + class77.field1905, 2014062376);
            class143.field3451.method1142(255, class49.field1299);
            class143.field3451.method1131(class66.field1686 + var2, 2014062376);
        }
        if (var4 == 42) {
            class70.method540((byte) -106);
        }
        if (var4 == 15) {
            class83.field2002++;
            class143.field3451.method965(true, 181);
            class143.field3451.method1131(var2, 2014062376);
            class143.field3451.method1131(var5, 2014062376);
            class143.field3451.method1122((byte) 32, var3);
            class86.field2036 = 0;
            class103.field2330 = 2;
            class103.field2328 = var2;
            if (var3 >> 16 == class107.field2436) {
                class103.field2330 = 1;
            }
            if (var3 >> 16 == class66.field1688) {
                class103.field2330 = 3;
            }
            class41.field1092 = var3;
        }
        if (var4 == 29) {
            class143.field3451.method965(true, 126);
            class143.field3451.method1131(var5, 2014062376);
            class143.field3451.method1155(var3, 111);
            class5.field139++;
            class143.field3451.method1142(255, var2);
            class41.field1092 = var3;
            class103.field2328 = var2;
            class86.field2036 = 0;
            class103.field2330 = 2;
            if (var3 >> 16 == class107.field2436) {
                class103.field2330 = 1;
            }
            if (var3 >> 16 == class66.field1688) {
                class103.field2330 = 3;
            }
        }
        if (var4 == 24) {
            class130.field3068++;
            class30.method243(var3, 0, var5, var2);
            class143.field3451.method965(true, 92);
            class143.field3451.method1131(var5 >> 14 & 0x7FFF, 2014062376);
            class143.field3451.method1131(class66.field1686 + var2, 2014062376);
            class143.field3451.method1142(255, class77.field1905 + var3);
        }
        if (var4 == 1001) {
            class90.field2094 = 2;
            class3.field64 = class14.field370;
            class63.field1635 = class131.field3098;
            class76.field1892 = 0;
            class18 var56 = class37.field1013[var5];
            if (var56 != null) {
                class118 var57 = var56.field478;
                if (var57.field2714 != null) {
                    var57 = var57.method858(29);
                }
                if (var57 != null) {
                    class143.field3451.method965(true, 167);
                    class50.field1341++;
                    class143.field3451.method1133(var57.field2722, -127);
                }
            }
        }
        if (var4 == 22) {
            class143.field3451.method965(true, 56);
            class127.field2953++;
            class143.field3451.method1131(class88.field2059, 2014062376);
            class143.field3451.method1102((byte) -86, class47.field1260);
            class143.field3451.method1122((byte) 32, var3);
            class143.field3451.method1142(255, var2);
            class143.field3451.method1131(var5, 2014062376);
            class41.field1092 = var3;
            class86.field2036 = 0;
            class103.field2328 = var2;
            class103.field2330 = 2;
            if (var3 >> 16 == class107.field2436) {
                class103.field2330 = 1;
            }
            if (var3 >> 16 == class66.field1688) {
                class103.field2330 = 3;
            }
        }
        if (var4 == 23) {
            class150 var58 = class2.field50[arg1];
            int var59 = var58.method1200(class3.field59, 29903);
            if (var59 != -1) {
                if (class107.field2436 == -1) {
                    class70.method540((byte) 25);
                    if (class134.field3156 != -1) {
                        class43.field1191 = var58.method1196(var59 + 5, -31851).method1201(true);
                        class133.field3126 = class107.field2436 = class134.field3156;
                        class20.field504 = false;
                    }
                } else {
                    class3.method16(99, 0, class147.field3564, class43.field1167);
                    if (class116.field2665 != null) {
                        class3.method16(99, 0, class116.field2665, class43.field1167);
                    }
                }
            }
        }
        if (var4 == 13) {
            class112.field2582++;
            boolean var60 = class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 122, 0, 0, var3, var2, false, class46.field1244.field2963[0]);
            if (!var60) {
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 125, 1, 1, var3, var2, false, class46.field1244.field2963[0]);
            }
            class76.field1892 = 0;
            class90.field2094 = 2;
            class63.field1635 = class131.field3098;
            class3.field64 = class14.field370;
            class143.field3451.method965(true, 26);
            class143.field3451.method1114((byte) -112, class77.field1905 + var3);
            class143.field3451.method1131(class66.field1686 + var2, 2014062376);
            class143.field3451.method1155(class47.field1260, 12);
            class143.field3451.method1133(var5, -126);
            class143.field3451.method1133(class88.field2059, -91);
        }
        if (var4 == 11) {
            class30.method243(var3, 0, var5, var2);
            class142.field3430++;
            class143.field3451.method965(true, 66);
            class143.field3451.method1114((byte) -90, class77.field1905 + var3);
            class143.field3451.method1133(class66.field1686 + var2, -111);
            class143.field3451.method1133(var5 >> 14 & 0x7FFF, -126);
        }
        if (var4 == 51) {
            class135.field3172++;
            class143.field3451.method965(true, 195);
            class143.field3451.method1114((byte) -120, var2);
            class143.field3451.method1142(255, var5);
            class143.field3451.method1155(var3, 52);
            class103.field2330 = 2;
            class86.field2036 = 0;
            class103.field2328 = var2;
            class41.field1092 = var3;
            if (var3 >> 16 == class107.field2436) {
                class103.field2330 = 1;
            }
            if (var3 >> 16 == class66.field1688) {
                class103.field2330 = 3;
            }
        }
        if (var4 == 1006) {
            class90.field2094 = 2;
            class3.field64 = class14.field370;
            class46.field1239++;
            class63.field1635 = class131.field3098;
            class76.field1892 = 0;
            class143.field3451.method965(true, 152);
            class143.field3451.method1142(255, var5);
        }
        if (var4 == 1004) {
            class90.field2094 = 2;
            class63.field1635 = class131.field3098;
            class77.field1914++;
            class3.field64 = class14.field370;
            class76.field1892 = 0;
            class143.field3451.method965(true, 246);
            class143.field3451.method1142(255, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 57) {
            class143.field3451.method965(true, 128);
            class5.field105++;
            class143.field3451.method1131(class34.field956, 2014062376);
            class143.field3451.method1131(var2, 2014062376);
            class143.field3451.method1142(255, var5);
            class143.field3451.method1102((byte) -86, class42.field1114);
            class143.field3451.method1155(var3, 12);
            class143.field3451.method1114((byte) -90, class49.field1299);
            class103.field2330 = 2;
            class41.field1092 = var3;
            class103.field2328 = var2;
            if (var3 >> 16 == class107.field2436) {
                class103.field2330 = 1;
            }
            class86.field2036 = 0;
            if (var3 >> 16 == class66.field1688) {
                class103.field2330 = 3;
            }
        }
        if (var4 == 26) {
            class111 var62 = class137.field3217[var5];
            if (var62 != null) {
                class22.field644++;
                class17.method124(class46.field1244.field2934[0], 0, 2, 0, 0, 121, 1, 1, var62.field2934[0], var62.field2963[0], false, class46.field1244.field2963[0]);
                class76.field1892 = 0;
                class63.field1635 = class131.field3098;
                class90.field2094 = 2;
                class3.field64 = class14.field370;
                class143.field3451.method965(true, 103);
                class143.field3451.method1142(255, class88.field2059);
                class143.field3451.method1131(var5, 2014062376);
                class143.field3451.method1122((byte) 32, class47.field1260);
            }
        }
        if (class130.field3060 != 0) {
            class130.field3060 = 0;
            class82.field1972 = true;
        }
        if (class90.field2095) {
            class18.method126(3);
            class82.field1972 = true;
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(Z)Lde;")
    public final class27 method68(boolean arg0) {
        field278++;
        int var2 = 0;
        class27[] var3 = new class27[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field260[var4] != -1) {
                var3[var2++] = class27.method215(class38.field1046, this.field260[var4], 0);
            }
        }
        if (arg0) {
            field258 = null;
        }
        class27 var5 = new class27(var3, var2);
        for (int var6 = 0; var6 < 6 && this.field252[var6] != 0; var6++) {
            var5.method234(this.field252[var6], this.field262[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
    public static int method69(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(B)Z")
    public final boolean method70(byte arg0) {
        field255++;
        boolean var2 = true;
        int var3 = 0;
        if (arg0 != 27) {
            return false;
        }
        while (var3 < 5) {
            if (this.field260[var3] != -1 && !class38.field1046.method316(0, 0, this.field260[var3])) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)Lde;")
    public final class27 method71(int arg0) {
        field254++;
        if (this.field266 == null) {
            return null;
        }
        class27[] var2 = new class27[this.field266.length];
        for (int var3 = arg0; var3 < this.field266.length; var3++) {
            var2[var3] = class27.method215(class38.field1046, this.field266[var3], 0);
        }
        class27 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class27(var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field252[var5] != 0; var5++) {
            var4.method234(this.field252[var5], this.field262[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
    public static final void method72(int arg0) {
        class121.field2794.method546(-96);
        if (arg0 != -32) {
            method66(99, false);
        }
        field276++;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(BI)V")
    public static final void method73(byte arg0, int arg1) {
        field268++;
        if (arg0 <= 120) {
            field284 = null;
        }
        for (class86 var2 = (class86) class2.field25.method539((byte) -42); var2 != null; var2 = (class86) class2.field25.method536((byte) -110)) {
            if ((long) arg1 == (var2.field2228 >> 48 & 0xFFFFL)) {
                var2.method678((byte) -26);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILwb;B)V")
    private final void method74(int arg0, class148 arg1, byte arg2) {
        field269++;
        if (arg0 == 1) {
            this.field265 = arg1.method1137(255);
        } else if (arg0 == 2) {
            int var4 = arg1.method1137(arg2 + 232);
            this.field266 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field266[var5] = arg1.method1140(method69(arg2, -24));
            }
        } else if (arg0 == 3) {
            this.field267 = true;
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field252[arg0 - 40] = (short) arg1.method1140(-1);
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field262[arg0 - 50] = (short) arg1.method1140(-1);
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field260[arg0 - 60] = arg1.method1140(-1);
        }
        if (arg2 != 23) {
            this.method70((byte) 113);
        }
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)Z")
    public final boolean method75(int arg0) {
        field274++;
        if (this.field266 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 1) {
            return false;
        }
        for (int var3 = 0; var3 < this.field266.length; var3++) {
            if (!class38.field1046.method316(0, 0, this.field266[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[Ln;[II[II)V")
    public static final void method76(int arg0, class90[] arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        if (arg5 >= -31) {
            return;
        }
        field264++;
        if (arg3 <= arg0) {
            return;
        }
        int var6 = arg0 - 1;
        int var7 = arg3 + 1;
        int var8 = (arg0 + arg3) / 2;
        class90 var9 = arg1[var8];
        arg1[var8] = arg1[arg0];
        arg1[arg0] = var9;
        while (var6 < var7) {
            boolean var10 = true;
            do {
                var7--;
                for (int var11 = 0; var11 < 4; var11++) {
                    int var12;
                    int var13;
                    if (arg2[var11] == 2) {
                        var12 = arg1[var7].field2104;
                        var13 = var9.field2104;
                    } else if (arg2[var11] == 1) {
                        var12 = arg1[var7].field2091;
                        var13 = var9.field2091;
                        if (var13 == -1 && arg4[var11] == 1) {
                            var13 = 2001;
                        }
                        if (var12 == -1 && arg4[var11] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg2[var11] == 3) {
                        var13 = var9.field2087 ? 1 : 0;
                        var12 = arg1[var7].field2087 ? 1 : 0;
                    } else {
                        var12 = arg1[var7].field2086;
                        var13 = var9.field2086;
                    }
                    if (var12 != var13) {
                        if ((arg4[var11] != 1 || var12 <= var13) && (arg4[var11] != 0 || var13 <= var12)) {
                            var10 = false;
                        }
                        break;
                    }
                    if (var11 == 3) {
                        var10 = false;
                    }
                }
            } while (var10);
            boolean var14 = true;
            do {
                var6++;
                for (int var15 = 0; var15 < 4; var15++) {
                    int var16;
                    int var17;
                    if (arg2[var15] == 2) {
                        var17 = var9.field2104;
                        var16 = arg1[var6].field2104;
                    } else if (arg2[var15] == 1) {
                        var16 = arg1[var6].field2091;
                        var17 = var9.field2091;
                        if (var16 == -1 && arg4[var15] == 1) {
                            var16 = 2001;
                        }
                        if (var17 == -1 && arg4[var15] == 1) {
                            var17 = 2001;
                        }
                    } else if (arg2[var15] == 3) {
                        var17 = var9.field2087 ? 1 : 0;
                        var16 = arg1[var6].field2087 ? 1 : 0;
                    } else {
                        var17 = var9.field2086;
                        var16 = arg1[var6].field2086;
                    }
                    if (var16 != var17) {
                        if ((arg4[var15] != 1 || var17 <= var16) && (arg4[var15] != 0 || var16 <= var17)) {
                            var14 = false;
                        }
                        break;
                    }
                    if (var15 == 3) {
                        var14 = false;
                    }
                }
            } while (var14);
            if (var7 > var6) {
                class90 var18 = arg1[var6];
                arg1[var6] = arg1[var7];
                arg1[var7] = var18;
            }
        }
        method76(arg0, arg1, arg2, var7, arg4, -105);
        method76(var7 + 1, arg1, arg2, arg3, arg4, -51);
    }
}
