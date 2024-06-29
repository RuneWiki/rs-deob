import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class330 extends class21 {

    @OriginalMember(owner = "client!n", name = "X", descriptor = "I")
    private int field5064 = 32768;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "Ljava/lang/String;")
    public static String field5059 = "Choose Option";

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public static int field5056 = 0;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!n", name = "U", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!n", name = "V", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!n", name = "W", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!n", name = "Z", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "Lbm;")
    public static class307 field5054;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "Lr;")
    public static class48 field5055;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "[I")
    public static int[] field5058;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(IB)[[I", line = 5)
    public final int[][] method175(int arg0, byte arg1) {
        if (arg1 < 16) {
            field5058 = (int[]) null;
        }
        field5062++;
        int[][] var3 = this.field441.method220(arg0, 17433);
        if (this.field441.field532) {
            int[] var4 = this.method171(1, 85, arg0);
            int[] var5 = this.method171(2, -128, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class294.field4489; var9++) {
                int var10 = var4[var9] * 255 >> 12 & 0xFF;
                int var11 = var5[var9] * this.field5064 >> 12;
                int var12 = class122.field2117[var10] * var11 >> 12;
                int var13 = var9 + (var12 >> 12) & class4.field108;
                int var14 = class46.field953[var10] * var11 >> 12;
                int var15 = (var14 >> 12) + arg0 & class204.field3323;
                int[][] var16 = this.method173(0, var15, (byte) 73);
                var6[var9] = var16[0][var13];
                var7[var9] = var16[1][var13];
                var8[var9] = var16[2][var13];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)[I", line = 64)
    public final int[] method177(int arg0, int arg1) {
        int[] var3 = this.field443.method1040(arg1, false);
        field5066++;
        int var4 = 21 % ((33 - arg0) / 36);
        if (this.field443.field2637) {
            int[] var5 = this.method171(1, 115, arg1);
            int[] var6 = this.method171(2, -84, arg1);
            for (int var7 = 0; var7 < class294.field4489; var7++) {
                int var8 = var6[var7] * this.field5064 >> 12;
                int var9 = var5[var7] >> 4 & 0xFF;
                int var10 = class46.field953[var9] * var8 >> 12;
                int var11 = (var10 >> 12) + arg1 & class204.field3323;
                int var12 = class122.field2117[var9] * var8 >> 12;
                int var13 = (var12 >> 12) + var7 & class4.field108;
                int[] var14 = this.method171(0, -84, var11);
                var3[var7] = var14[var13];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)V", line = 112)
    public static final void method2284(int arg0, int arg1) {
        field5057++;
        if (arg0 < arg1) {
            return;
        }
        int var2 = class255.field3988[arg0];
        int var3 = class153.field2502[arg0];
        int var4 = class120.field2088[arg0];
        int var5 = (int) class11.field226[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var6 = class11.field226[arg0];
        if (var4 == 4) {
            class232.field3638 = class215.field3441;
            class337.field5181 = 2;
            class239.field3748++;
            class190.field3080 = class72.field1510;
            class147.field2422 = 0;
            class14.field263.method80(245, (byte) 126);
            class14.field263.method1313(class246.field3818 + var3, -376480);
            class14.field263.method1306(2120940680, var5);
            class14.field263.method1313(class101.field1769 + var2, arg1 + -376480);
            class14.field263.method1357(0, class342.field5317[82] ? 1 : 0);
        }
        if (var4 == 28) {
            class174.method1098(-1);
            class68 var8 = class319.method2196(-1351736944, var2);
            class224.field3530 = var3;
            class109.field1881 = var2;
            class21.field447 = 1;
            class325.field4967 = var5;
            class317.method2183((byte) -7, var8);
            class170.field2749 = "<col=ff9040>" + class95.method636(22111, var5).field5227 + "<col=ffffff>";
            if (class170.field2749 == null) {
                class170.field2749 = "null";
            }
            return;
        }
        if (var4 == 5) {
            class278 var9 = class97.field1715[var5];
            if (var9 != null) {
                class337.field5181 = 2;
                class147.field2422 = 0;
                class263.field4085++;
                class190.field3080 = class72.field1510;
                class232.field3638 = class215.field3441;
                class14.field263.method80(56, (byte) 104);
                class14.field263.method1293(var5, (byte) -71);
                class14.field263.method1359(16705, class333.field5113);
                class14.field263.method1311(class342.field5317[82] ? 1 : 0, 10964);
                class14.field263.method1293(class6.field135, (byte) -71);
            }
        }
        if (var4 == 3) {
            class147.field2422 = 0;
            class232.field3638 = class215.field3441;
            class101.field1773++;
            class190.field3080 = class72.field1510;
            class337.field5181 = 2;
            class14.field263.method80(132, (byte) 112);
            class14.field263.method1313(class246.field3818 + var3, -376480);
            class14.field263.method1349(class342.field5317[82] ? 1 : 0, 7701);
            class14.field263.method1306(2120940680, var5);
            class14.field263.method1324(class101.field1769 + var2, 1734336648);
        }
        if (var4 == 12) {
            class278 var10 = class97.field1715[var5];
            if (var10 != null) {
                class147.field2422 = 0;
                class190.field3080 = class72.field1510;
                class204.field3334++;
                class337.field5181 = 2;
                class232.field3638 = class215.field3441;
                class14.field263.method80(34, (byte) 114);
                class14.field263.method1357(0, class342.field5317[82] ? 1 : 0);
                class14.field263.method1313(var5, -376480);
            }
        }
        if (var4 == 10) {
            class68 var35 = class233.method1548((byte) 80, var2, var3);
            if (var35 != null) {
                class174.method1098(-1);
                class268 var36 = client.method359(var35);
                class119.method779(var2, var36.field4141, var3, var35.field1359, 0, var35.field1311, var36.method1783(-1));
                class21.field447 = 0;
                class281.field4323 = class8.method71(var35, true);
                if (class281.field4323 == null) {
                    class281.field4323 = "Null";
                }
                if (var35.field1429) {
                    class223.field3523 = var35.field1346 + "<col=ffffff>";
                } else {
                    class223.field3523 = "<col=00ff00>" + var35.field1450 + "<col=ffffff>";
                }
            }
            return;
        }
        if (var4 == 45) {
            class278 var11 = class97.field1715[var5];
            if (var11 != null) {
                class337.field5181 = 2;
                class190.field3080 = class72.field1510;
                class232.field3638 = class215.field3441;
                class199.field3182++;
                class147.field2422 = 0;
                class14.field263.method80(157, (byte) 123);
                class14.field263.method1311(class342.field5317[82] ? 1 : 0, 10964);
                class14.field263.method1324(var5, 1734336648);
            }
        }
        if (var4 == 1002) {
            class190.field3080 = class72.field1510;
            class232.field3638 = class215.field3441;
            class147.field2422 = 0;
            class337.field5181 = 2;
            class255 var12 = class8.field179[var5];
            if (var12 != null) {
                class44 var13 = var12.field3991;
                if (var13.field888 != null) {
                    var13 = var13.method338(17911);
                }
                if (var13 != null) {
                    class19.field343++;
                    class14.field263.method80(146, (byte) 103);
                    class14.field263.method1306(2120940680, var13.field895);
                }
            }
        }
        if (var4 == 23) {
            class278 var14 = class97.field1715[var5];
            if (var14 != null) {
                class232.field3638 = class215.field3441;
                class190.field3080 = class72.field1510;
                class337.field5181 = 2;
                class147.field2422 = 0;
                class149.field2446++;
                class14.field263.method80(151, (byte) 126);
                class14.field263.method1313(var5, -376480);
                class14.field263.method1349(class342.field5317[82] ? 1 : 0, 7701);
            }
        }
        if (var4 == 26) {
            class33.field678++;
            class14.field263.method80(162, (byte) 116);
            class14.field263.method1306(2120940680, var5);
            class14.field263.method1320(var2, (byte) 17);
            class14.field263.method1313(var3, -376480);
            class228.field3599 = 0;
            class4.field103 = class319.method2196(-1351736944, var2);
            class26.field516 = var3;
        }
        if (var4 == 46) {
            class227.field3593++;
            class14.field263.method80(195, (byte) 125);
            class14.field263.method1324(var3, 1734336648);
            class14.field263.method1324(var5, 1734336648);
            class14.field263.method1359(16705, var2);
            class228.field3599 = 0;
            class4.field103 = class319.method2196(arg1 - 1351736944, var2);
            class26.field516 = var3;
        }
        if (var4 == 43) {
            if (var5 == 0) {
                class225.field3555 = 1;
                method2287(class289.field4438, var3, var2);
            } else if (class29.field545 > 0 && class342.field5317[82] && class342.field5317[81]) {
                class54.method420(true, class246.field3818 + var3, class101.field1769 + var2, class289.field4438);
            } else {
                class127.field2180++;
                class14.field263.method80(9, (byte) 119);
                class14.field263.method1313(class246.field3818 + var3, -376480);
                class14.field263.method1293(class101.field1769 + var2, (byte) -71);
            }
        }
        if (var4 == 41) {
            class232.field3638 = class215.field3441;
            class282.field4339++;
            class147.field2422 = 0;
            class190.field3080 = class72.field1510;
            class337.field5181 = 2;
            class14.field263.method80(165, (byte) 126);
            class14.field263.method1349(class342.field5317[82] ? 1 : 0, 7701);
            class14.field263.method1293((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -71);
            class14.field263.method1324(class101.field1769 + var2, arg1 ^ 0x675FE088);
            class14.field263.method1306(2120940680, class246.field3818 + var3);
        }
        if (var4 == 32) {
            class24.field475++;
            class14.field263.method80(108, (byte) 126);
            class14.field263.method1359(16705, var2);
            class68 var15 = class319.method2196(arg1 - 1351736944, var2);
            if (var15.field1383 != null && var15.field1383[0][0] == 5) {
                int var16 = var15.field1383[0][1];
                class40.field771[var16] = 1 - class40.field771[var16];
                class170.method1082(var16, arg1 ^ 0x521F);
            }
        }
        if (var4 == 50) {
            class232.field3638 = class215.field3441;
            class147.field2422 = 0;
            class337.field5181 = 2;
            class199.field3186++;
            class190.field3080 = class72.field1510;
            class14.field263.method80(47, (byte) 121);
            class14.field263.method1359(16705, class333.field5113);
            class14.field263.method1313(class101.field1769 + var2, -376480);
            class14.field263.method1324(class6.field135, 1734336648);
            class14.field263.method1349(class342.field5317[82] ? 1 : 0, 7701);
            class14.field263.method1293(class246.field3818 + var3, (byte) -71);
            class14.field263.method1324(Integer.MAX_VALUE & (int) (var6 >>> 32), 1734336648);
        }
        if (var4 == 57) {
            class147.field2422 = 0;
            class337.field5181 = 2;
            class232.field3638 = class215.field3441;
            class342.field5321++;
            class190.field3080 = class72.field1510;
            class14.field263.method80(230, (byte) 106);
            class14.field263.method1293(var2 + class101.field1769, (byte) -71);
            class14.field263.method1349(class342.field5317[82] ? 1 : 0, 7701);
            class14.field263.method1324(var3 + class246.field3818, 1734336648);
            class14.field263.method1306(2120940680, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var4 == 8) {
            class255 var17 = class8.field179[var5];
            if (var17 != null) {
                class313.field4759++;
                class232.field3638 = class215.field3441;
                class337.field5181 = 2;
                class190.field3080 = class72.field1510;
                class147.field2422 = 0;
                class14.field263.method80(58, (byte) 126);
                class14.field263.method1293(var5, (byte) -71);
                class14.field263.method1349(class342.field5317[82] ? 1 : 0, arg1 + 7701);
            }
        }
        if (var4 == 18) {
            class147.field2422 = 0;
            class337.field5181 = 2;
            class232.field3638 = class215.field3441;
            class190.field3080 = class72.field1510;
            class14.field263.method80(125, (byte) 126);
            class14.field263.method1293(class101.field1769 + var2, (byte) -71);
            class14.field263.method1303(class342.field5317[82] ? 1 : 0, 97);
            class14.field263.method1306(2120940680, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class216.field3451++;
            class14.field263.method1324(class246.field3818 + var3, 1734336648);
        }
        if (var4 == 58) {
            if (var5 == 0) {
                class62.field1199 = 1;
                method2287(class289.field4438, var3, var2);
            } else if (var5 == 1) {
                class14.field263.method80(44, (byte) 124);
                class264.field4096++;
                class14.field263.method1293(class246.field3818 + var3, (byte) -71);
                class14.field263.method1324(class6.field135, 1734336648);
                class14.field263.method1313(class101.field1769 + var2, -376480);
                class14.field263.method1320(class333.field5113, (byte) 108);
            }
        }
        if (var4 == 17) {
            class147.field2422 = 0;
            class327.field5002++;
            class337.field5181 = 2;
            class232.field3638 = class215.field3441;
            class190.field3080 = class72.field1510;
            class14.field263.method80(67, (byte) 101);
            class14.field263.method1339(class109.field1881, (byte) 118);
            class14.field263.method1313(class224.field3530, -376480);
            class14.field263.method1293(class325.field4967, (byte) -71);
            class14.field263.method1293(var3 + class246.field3818, (byte) -71);
            class14.field263.method1313(var2 + class101.field1769, -376480);
            class14.field263.method1311(class342.field5317[82] ? 1 : 0, 10964);
            class14.field263.method1306(2120940680, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var4 == 1005) {
            class190.field3080 = class72.field1510;
            class147.field2422 = 0;
            class232.field3638 = class215.field3441;
            class166.field2683++;
            class337.field5181 = 2;
            class14.field263.method80(120, (byte) 113);
            class14.field263.method1313(var5, -376480);
        }
        if (var4 == 15) {
            class32.field647++;
            class14.field263.method80(131, (byte) 125);
            class14.field263.method1324(class325.field4967, 1734336648);
            class14.field263.method1320(var2, (byte) 122);
            class14.field263.method1306(2120940680, var5);
            class14.field263.method1306(2120940680, class224.field3530);
            class14.field263.method1320(class109.field1881, (byte) 33);
            class14.field263.method1324(var3, 1734336648);
            class228.field3599 = 0;
            class4.field103 = class319.method2196(-1351736944, var2);
            class26.field516 = var3;
        }
        if (var4 == 29) {
            class232.field3638 = class215.field3441;
            class190.field3080 = class72.field1510;
            class23.field461++;
            class337.field5181 = 2;
            class147.field2422 = 0;
            class14.field263.method80(251, (byte) 101);
            class14.field263.method1293(class224.field3530, (byte) -71);
            class14.field263.method1359(16705, class109.field1881);
            class14.field263.method1293(var5, (byte) -71);
            class14.field263.method1324(class325.field4967, 1734336648);
            class14.field263.method1306(2120940680, var3 + class246.field3818);
            class14.field263.method1311(class342.field5317[82] ? 1 : 0, 10964);
            class14.field263.method1306(2120940680, var2 + class101.field1769);
        }
        if (var4 == 1004) {
            class337.field5181 = 2;
            class147.field2422 = 0;
            class190.field3080 = class72.field1510;
            class204.field3320++;
            class232.field3638 = class215.field3441;
            class14.field263.method80(82, (byte) 126);
            class14.field263.method1313(var2 + class101.field1769, -376480);
            class14.field263.method1313((int) (var6 >>> 32) & Integer.MAX_VALUE, -376480);
            class14.field263.method1306(2120940680, class246.field3818 + var3);
            class14.field263.method1311(class342.field5317[82] ? 1 : 0, 10964);
        }
        if (var4 == 1001) {
            class232.field3638 = class215.field3441;
            class190.field3080 = class72.field1510;
            class147.field2422 = 0;
            class190.field3092++;
            class337.field5181 = 2;
            class14.field263.method80(237, (byte) 123);
            class14.field263.method1293(var5, (byte) -71);
        }
        if (var4 == 30 || var4 == 1006) {
            class2.method12(class296.field4515[arg0], arg1 + 122, var3, var5, var2);
        }
        if (var4 == 1007) {
            class68 var18 = class319.method2196(arg1 - 1351736944, var2);
            if (var18 == null || var18.field1327[var3] < 100000) {
                class190.field3092++;
                class14.field263.method80(237, (byte) 118);
                class14.field263.method1293(var5, (byte) -71);
            } else {
                class42.method321(var18.field1327[var3] + " x " + class95.method636(22111, var5).field5227, 0, 1, "");
            }
            class228.field3599 = 0;
            class4.field103 = class319.method2196(-1351736944, var2);
            class26.field516 = var3;
        }
        if (var4 == 38) {
            class79.field1559++;
            class14.field263.method80(103, (byte) 110);
            class14.field263.method1293(var3, (byte) -71);
            class14.field263.method1306(arg1 + 2120940680, var5);
            class14.field263.method1320(var2, (byte) 31);
            class228.field3599 = 0;
            class4.field103 = class319.method2196(-1351736944, var2);
            class26.field516 = var3;
        }
        if (var4 == 42) {
            class278 var19 = class97.field1715[var5];
            if (var19 != null) {
                class255.field3981++;
                class337.field5181 = 2;
                class147.field2422 = 0;
                class232.field3638 = class215.field3441;
                class190.field3080 = class72.field1510;
                class14.field263.method80(27, (byte) 123);
                class14.field263.method1313(var5, -376480);
                class14.field263.method1357(0, class342.field5317[82] ? 1 : 0);
            }
        }
        if (var4 == 9) {
            class255 var20 = class8.field179[var5];
            if (var20 != null) {
                class232.field3638 = class215.field3441;
                class47.field960++;
                class337.field5181 = 2;
                class190.field3080 = class72.field1510;
                class147.field2422 = 0;
                class14.field263.method80(200, (byte) 109);
                class14.field263.method1303(class342.field5317[82] ? 1 : 0, 114);
                class14.field263.method1324(var5, 1734336648);
            }
        }
        if (var4 == 7) {
            class59.field1156++;
            class14.field263.method80(227, (byte) 103);
            class14.field263.method1313(class6.field135, -376480);
            class14.field263.method1359(16705, var2);
            class14.field263.method1313(var3, -376480);
            class14.field263.method1339(class333.field5113, (byte) 118);
        }
        if (var4 == 34) {
            class14.field263.method80(28, (byte) 112);
            class334.field5127++;
            class14.field263.method1293(var3, (byte) -71);
            class14.field263.method1306(2120940680, var5);
            class14.field263.method1359(16705, var2);
            class228.field3599 = 0;
            class4.field103 = class319.method2196(-1351736944, var2);
            class26.field516 = var3;
        }
        if (var4 == 60) {
            class255 var21 = class8.field179[var5];
            if (var21 != null) {
                class232.field3638 = class215.field3441;
                class337.field5181 = 2;
                class56.field1114++;
                class147.field2422 = 0;
                class190.field3080 = class72.field1510;
                class14.field263.method80(98, (byte) 108);
                class14.field263.method1313(var5, -376480);
                class14.field263.method1349(class342.field5317[82] ? 1 : 0, 7701);
            }
        }
        if (var4 == 44) {
            boolean var22 = true;
            class68 var23 = class319.method2196(-1351736944, var2);
            if (var23.field1438 > 0) {
                var22 = class151.method986(true, var23);
            }
            if (var22) {
                class24.field475++;
                class14.field263.method80(108, (byte) 124);
                class14.field263.method1359(16705, var2);
            }
        }
        if (var4 == 1) {
            class14.field263.method80(108, (byte) 111);
            class24.field475++;
            class14.field263.method1359(16705, var2);
            class68 var24 = class319.method2196(-1351736944, var2);
            if (var24.field1383 != null && var24.field1383[0][0] == 5) {
                int var25 = var24.field1383[0][1];
                if (class40.field771[var25] != var24.field1410[0]) {
                    class40.field771[var25] = var24.field1410[0];
                    class170.method1082(var25, 21023);
                }
            }
        }
        if (var4 == 22) {
            class255 var26 = class8.field179[var5];
            if (var26 != null) {
                class337.field5181 = 2;
                class232.field3638 = class215.field3441;
                class147.field2422 = 0;
                class190.field3080 = class72.field1510;
                class234.field3674++;
                class14.field263.method80(153, (byte) 127);
                class14.field263.method1313(var5, -376480);
                class14.field263.method1303(class342.field5317[82] ? 1 : 0, 113);
            }
        }
        if (var4 == 48) {
            if (var5 == 0) {
                method2287(class289.field4438, var3, var2);
            } else if (var5 == 1) {
                if (class29.field545 > 0 && class342.field5317[82] && class342.field5317[81]) {
                    class54.method420(true, class246.field3818 + var3, class101.field1769 + var2, class289.field4438);
                } else {
                    class177.method1120(var2, 1, var3, (byte) -126);
                    class14.field263.method1311(class148.field2437, 10964);
                    class14.field263.method1311(class75.field1526, 10964);
                    class14.field263.method1313((int) class95.field1709, -376480);
                    class14.field263.method1311(57, 10964);
                    class14.field263.method1311(class41.field798, 10964);
                    class14.field263.method1311(class4.field101, 10964);
                    class14.field263.method1311(89, 10964);
                    class14.field263.method1313(class66.field1265.field1869, -376480);
                    class14.field263.method1313(class66.field1265.field1872, -376480);
                    class14.field263.method1311(class78.field1548, 10964);
                    class14.field263.method1311(63, 10964);
                }
            }
        }
        if (var4 == 14) {
            class255 var27 = class8.field179[var5];
            if (var27 != null) {
                class250.field3920++;
                class337.field5181 = 2;
                class232.field3638 = class215.field3441;
                class147.field2422 = 0;
                class190.field3080 = class72.field1510;
                class14.field263.method80(199, (byte) 126);
                class14.field263.method1320(class109.field1881, (byte) 71);
                class14.field263.method1324(class224.field3530, 1734336648);
                class14.field263.method1349(class342.field5317[82] ? 1 : 0, arg1 + 7701);
                class14.field263.method1313(var5, -376480);
                class14.field263.method1306(2120940680, class325.field4967);
            }
        }
        if (var4 == 11) {
            class324.field4947++;
            class14.field263.method80(109, (byte) 111);
            class14.field263.method1293(var5, (byte) -71);
            class14.field263.method1293(class6.field135, (byte) -71);
            class14.field263.method1359(arg1 ^ 0x4141, class333.field5113);
            class14.field263.method1293(var3, (byte) -71);
            class14.field263.method1339(var2, (byte) 118);
            class228.field3599 = 0;
            class4.field103 = class319.method2196(-1351736944, var2);
            class26.field516 = var3;
        }
        if (var4 == 39 && class317.field4795 == null) {
            class303.method2012(var3, false, var2);
            class317.field4795 = class233.method1548((byte) -124, var2, var3);
            class317.method2183((byte) -7, class317.field4795);
        }
        if (var4 == 24) {
            class278 var28 = class97.field1715[var5];
            if (var28 != null) {
                class190.field3080 = class72.field1510;
                class224.field3533++;
                class337.field5181 = 2;
                class232.field3638 = class215.field3441;
                class147.field2422 = 0;
                class14.field263.method80(241, (byte) 121);
                class14.field263.method1311(class342.field5317[82] ? 1 : 0, 10964);
                class14.field263.method1306(2120940680, var5);
            }
        }
        if (var4 == 19) {
            class133.field2242++;
            class14.field263.method80(181, (byte) 117);
            class14.field263.method1313(var3, -376480);
            class14.field263.method1339(var2, (byte) 118);
            class14.field263.method1313(var5, arg1 ^ 0xFFFA4160);
            class228.field3599 = 0;
            class4.field103 = class319.method2196(arg1 ^ 0xAF6E2190, var2);
            class26.field516 = var3;
        }
        if (var4 == 2) {
            class37.field727++;
            class14.field263.method80(234, (byte) 118);
            class14.field263.method1293(var5, (byte) -71);
            class14.field263.method1293(var3, (byte) -71);
            class14.field263.method1320(var2, (byte) 115);
            class228.field3599 = 0;
            class4.field103 = class319.method2196(-1351736944, var2);
            class26.field516 = var3;
        }
        if (var4 == 20) {
            class278 var29 = class97.field1715[var5];
            if (var29 != null) {
                class190.field3080 = class72.field1510;
                class49.field1004++;
                class337.field5181 = 2;
                class232.field3638 = class215.field3441;
                class147.field2422 = 0;
                class14.field263.method80(207, (byte) 115);
                class14.field263.method1324(var5, arg1 + 1734336648);
                class14.field263.method1357(0, class342.field5317[82] ? 1 : 0);
            }
        }
        if (var4 == 25) {
            class278 var30 = class97.field1715[var5];
            if (var30 != null) {
                class337.field5181 = 2;
                class147.field2422 = 0;
                class133.field2240++;
                class190.field3080 = class72.field1510;
                class232.field3638 = class215.field3441;
                class14.field263.method80(130, (byte) 111);
                class14.field263.method1303(class342.field5317[82] ? 1 : 0, 73);
                class14.field263.method1306(2120940680, var5);
                class14.field263.method1324(class325.field4967, 1734336648);
                class14.field263.method1293(class224.field3530, (byte) -71);
                class14.field263.method1288(class109.field1881, -32041);
            }
        }
        if (var4 == 49) {
            class232.field3638 = class215.field3441;
            class166.field2680++;
            class190.field3080 = class72.field1510;
            class147.field2422 = 0;
            class337.field5181 = 2;
            class14.field263.method80(70, (byte) 121);
            class14.field263.method1349(class342.field5317[82] ? 1 : 0, 7701);
            class14.field263.method1313(class246.field3818 + var3, -376480);
            class14.field263.method1320(class333.field5113, (byte) 38);
            class14.field263.method1324(var5, 1734336648);
            class14.field263.method1324(class6.field135, 1734336648);
            class14.field263.method1306(2120940680, class101.field1769 + var2);
        }
        if (var4 == 6) {
            class278 var31 = class97.field1715[var5];
            if (var31 != null) {
                class26.field515++;
                class232.field3638 = class215.field3441;
                class337.field5181 = 2;
                class147.field2422 = 0;
                class190.field3080 = class72.field1510;
                class14.field263.method80(184, (byte) 108);
                class14.field263.method1324(var5, 1734336648);
                class14.field263.method1303(class342.field5317[82] ? 1 : 0, 72);
            }
        }
        if (var4 == 59) {
            class147.field2422 = 0;
            class337.field5181 = 2;
            class94.field1689++;
            class190.field3080 = class72.field1510;
            class232.field3638 = class215.field3441;
            class14.field263.method80(194, (byte) 121);
            class14.field263.method1324(class246.field3818 + var3, 1734336648);
            class14.field263.method1313(class101.field1769 + var2, -376480);
            class14.field263.method1324(var5, arg1 ^ 0x675FE088);
            class14.field263.method1311(class342.field5317[82] ? 1 : 0, 10964);
        }
        if (var4 == 47) {
            class14.field263.method80(59, (byte) 110);
            class104.field1800++;
            class14.field263.method1313(var3, -376480);
            class14.field263.method1339(var2, (byte) 118);
            class14.field263.method1293(var5, (byte) -71);
            class228.field3599 = 0;
            class4.field103 = class319.method2196(-1351736944, var2);
            class26.field516 = var3;
        }
        if (var4 == 36) {
            class25.field490++;
            class14.field263.method80(212, (byte) 108);
            class14.field263.method1324(var5, 1734336648);
            class14.field263.method1288(var2, -32041);
            class14.field263.method1293(var3, (byte) -71);
            class228.field3599 = 0;
            class4.field103 = class319.method2196(-1351736944, var2);
            class26.field516 = var3;
        }
        if (var4 == 51) {
            class337.field5181 = 2;
            class232.field3638 = class215.field3441;
            class147.field2422 = 0;
            class6.field124++;
            class190.field3080 = class72.field1510;
            class14.field263.method80(225, (byte) 105);
            class14.field263.method1293((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -71);
            class14.field263.method1313(class246.field3818 + var3, -376480);
            class14.field263.method1311(class342.field5317[82] ? 1 : 0, arg1 ^ 0x2AD4);
            class14.field263.method1313(class101.field1769 + var2, arg1 ^ 0xFFFA4160);
        }
        if (var4 == 35) {
            class255 var32 = class8.field179[var5];
            if (var32 != null) {
                class318.field4804++;
                class190.field3080 = class72.field1510;
                class337.field5181 = 2;
                class147.field2422 = 0;
                class232.field3638 = class215.field3441;
                class14.field263.method80(159, (byte) 124);
                class14.field263.method1293(class6.field135, (byte) -71);
                class14.field263.method1293(var5, (byte) -71);
                class14.field263.method1303(class342.field5317[82] ? 1 : 0, 118);
                class14.field263.method1320(class333.field5113, (byte) 121);
            }
        }
        if (var4 == 13) {
            class14.field263.method80(29, (byte) 124);
            class14.field263.method1320(var2, (byte) 45);
            class14.field263.method1313(var5, -376480);
            class215.field3442++;
            class14.field263.method1324(var3, 1734336648);
            class228.field3599 = 0;
            class4.field103 = class319.method2196(-1351736944, var2);
            class26.field516 = var3;
        }
        if (var4 == 16) {
            class278 var33 = class97.field1715[var5];
            if (var33 != null) {
                class337.field5181 = 2;
                class232.field3638 = class215.field3441;
                class205.field3352++;
                class190.field3080 = class72.field1510;
                class147.field2422 = 0;
                class14.field263.method80(118, (byte) 107);
                class14.field263.method1357(0, class342.field5317[82] ? 1 : 0);
                class14.field263.method1306(2120940680, var5);
            }
        }
        if (var4 == 33) {
            class255 var34 = class8.field179[var5];
            if (var34 != null) {
                class190.field3080 = class72.field1510;
                class337.field5181 = 2;
                class214.field3435++;
                class147.field2422 = 0;
                class232.field3638 = class215.field3441;
                class14.field263.method80(42, (byte) 122);
                class14.field263.method1349(class342.field5317[82] ? 1 : 0, arg1 + 7701);
                class14.field263.method1293(var5, (byte) -71);
            }
        }
        if (var4 == 31) {
            class329.field5053++;
            class190.field3080 = class72.field1510;
            class232.field3638 = class215.field3441;
            class147.field2422 = 0;
            class337.field5181 = 2;
            class14.field263.method80(99, (byte) 123);
            class14.field263.method1293(class246.field3818 + var3, (byte) -71);
            class14.field263.method1313(class101.field1769 + var2, -376480);
            class14.field263.method1306(2120940680, var5);
            class14.field263.method1349(class342.field5317[82] ? 1 : 0, 7701);
        }
        if (var4 == 40) {
            class208.method1410((byte) 92);
        }
        if (var4 == 21) {
            class232.field3638 = class215.field3441;
            class147.field2422 = 0;
            class190.field3080 = class72.field1510;
            class337.field5181 = 2;
            class62.field1192++;
            class14.field263.method80(193, (byte) 117);
            class14.field263.method1324(class101.field1769 + var2, arg1 ^ 0x675FE088);
            class14.field263.method1357(0, class342.field5317[82] ? 1 : 0);
            class14.field263.method1306(2120940680, var5);
            class14.field263.method1293(var3 + class246.field3818, (byte) -71);
        }
        if (var4 == 37) {
            class79.field1563++;
            class14.field263.method80(158, (byte) 108);
            class14.field263.method1306(arg1 ^ 0x7E6AFC88, var3);
            class14.field263.method1320(var2, (byte) 94);
            class14.field263.method1324(var5, 1734336648);
            class228.field3599 = 0;
            class4.field103 = class319.method2196(-1351736944, var2);
            class26.field516 = var3;
        }
        if (class21.field447 != 0) {
            class21.field447 = 0;
            class317.method2183((byte) -7, class319.method2196(-1351736944, class109.field1881));
        }
        if (class86.field1617) {
            class174.method1098(-1);
        }
        if (class4.field103 != null && class228.field3599 == 0) {
            class317.method2183((byte) -7, class4.field103);
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V", line = 1140)
    public class330() {
        super(3, false);
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(B)Lfc;", line = 1151)
    public static final class274 method2285(byte arg0) {
        field5065++;
        try {
            return arg0 == -6 ? (class274) Class.forName("ah").getDeclaredConstructor().newInstance() : (class274) null;
        } catch (Throwable var2) {
            return new class324();
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V", line = 1167)
    public static void method2286(int arg0) {
        field5054 = null;
        field5059 = null;
        field5055 = null;
        int var1 = -83 / ((-arg0 - 64) / 58);
        field5058 = null;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(III)V", line = 1179)
    private static final void method2287(int arg0, int arg1, int arg2) {
        class70.field1477 = true;
        class100.field1757 = arg0;
        class150.field2456 = arg1;
        class8.field183 = arg2;
        class305.field4619 = -1;
        class4.field105 = -1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lag;I)Lwn;", line = 1189)
    public static final class250 method2288(class202 arg0, int arg1) {
        if (arg1 != 0) {
            field5059 = (String) null;
        }
        field5060++;
        return new class250(arg0.method1356(false), arg0.method1356(false), arg0.method1356(false), arg0.method1356(false), arg0.method1352((byte) -118), arg0.method1352((byte) -87), arg0.method1317((byte) -79));
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIII)V", line = 1208)
    public static final void method2289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class191 var7 = new class191();
        var7.field3103 = arg1 / 128;
        var7.field3100 = arg2 / 128;
        var7.field3096 = arg3 / 128;
        var7.field3101 = arg4 / 128;
        var7.field3119 = arg0;
        var7.field3105 = arg1;
        var7.field3099 = arg2;
        var7.field3120 = arg3;
        var7.field3097 = arg4;
        var7.field3113 = arg5;
        var7.field3121 = arg6;
        class274.field4204[class66.field1249++] = var7;
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(B)V", line = 1224)
    public final void method183(byte arg0) {
        field5061++;
        if (arg0 < 82) {
            this.method175(126, (byte) 70);
        }
        class233.method1546(17431);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILag;)V", line = 1235)
    public final void method178(int arg0, int arg1, class202 arg2) {
        field5063++;
        if (arg1 == 0) {
            this.field5064 = arg2.method1315(arg0 ^ 0xFFFFC913) << 4;
        } else if (arg1 == 1) {
            this.field444 = arg2.method1317((byte) -102) == 1;
        }
        if (arg0 != -318) {
            field5055 = (class48) null;
        }
    }
}
