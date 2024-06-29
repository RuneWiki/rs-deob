import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class107 extends class569 {

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
    public int field1427;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "Ljava/lang/String;")
    public String field1430;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 9)
    public static final void method605(String arg0, boolean arg1) {
        field1421++;
        if (!class664.field9377 || (class639.field8984 & 0x18) == 0) {
            return;
        }
        boolean var2 = false;
        int var3 = class596.field8384;
        int[] var4 = class354.field4521;
        for (int var5 = 0; var5 < var3; var5++) {
            class514 var6 = class351.field4490[var4[var5]];
            if (var6.field7017 != null && var6.field7017.equalsIgnoreCase(arg0) && (class376.field4748 == var6 && (class639.field8984 & 0x10) != 0 || var6 != null && (class639.field8984 & 0x8) != 0)) {
                class465.field5929++;
                class704 var7 = class314.method1820(class422.field5309, class400.field5014, (byte) -126);
                var7.field9929.method3509(0, (byte) -109);
                var7.field9929.method3506(128, class172.field2252);
                var7.field9929.method3492(class529.field7156, 123);
                var7.field9929.method3506(128, class286.field3557);
                var7.field9929.method3506(128, var4[var5]);
                class122.method654(var7, (byte) -36);
                var2 = true;
                class413.method2202(1, 0, -2, var6.method2785(-1), 0, true, var6.field9758[0], var6.field9754[0], var6.method2785(-1));
                break;
            }
        }
        if (!arg1) {
            field1429 = 43;
        }
        if (!var2) {
            class250.method1468(4, false, class83.field1129.method476((byte) 126, class250.field3068) + arg0);
        }
        if (class664.field9377) {
            class476.method2518((byte) 31);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIFIIIFIFI[F)V", line = 63)
    public static final void method606(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7, float arg8, int arg9, float arg10, int arg11, float[] arg12) {
        int var13 = arg7 - arg11;
        int var14 = 105 / ((arg6 - 6) / 53);
        int var15 = arg5 - arg9;
        field1424++;
        int var16 = arg2 - arg1;
        float var17 = arg12[2] * (float) var16 + arg12[0] * (float) var15 + arg12[1] * (float) var13;
        float var18 = arg12[5] * (float) var16 + arg12[4] * (float) var13 + arg12[3] * (float) var15;
        float var19 = arg12[8] * (float) var16 + arg12[7] * (float) var13 + arg12[6] * (float) var15;
        float var20;
        float var21;
        if (arg0 == 0) {
            var21 = arg4 + 0.5F - var19;
            var20 = arg10 + var17 + 0.5F;
        } else if (arg0 == 1) {
            var20 = arg10 + var17 + 0.5F;
            var21 = arg4 + var19 + 0.5F;
        } else if (arg0 == 2) {
            var20 = arg10 + 0.5F - var17;
            var21 = arg8 + 0.5F - var18;
        } else if (arg0 == 3) {
            var21 = arg8 + 0.5F - var18;
            var20 = arg10 + var17 + 0.5F;
        } else if (arg0 == 4) {
            var20 = arg4 + var19 + 0.5F;
            var21 = arg8 + 0.5F - var18;
        } else {
            var20 = arg4 + 0.5F - var19;
            var21 = arg8 + 0.5F - var18;
        }
        if (arg3 == 1) {
            float var22 = var20;
            var20 = -var21;
            var21 = var22;
        } else if (arg3 == 2) {
            var20 = -var20;
            var21 = -var21;
        } else if (arg3 == 3) {
            float var23 = var20;
            var20 = var21;
            var21 = -var23;
        }
        class348.field4458 = var21;
        class652.field9207 = var20;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZ)V", line = 150)
    public static final void method607(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15) {
        class167.field2199 = class590.field8291.method997() > 0;
        class608.field8535 = arg15;
        class516.field7041 = arg1 >> class52.field775;
        class204.field2599 = arg3 >> class52.field775;
        class115.field1488 = arg1;
        class11.field197 = arg3;
        class3.field24 = arg2;
        class575.field8022 = class516.field7041 - class479.field6372;
        if (class575.field8022 < 0) {
            class126.field1571 = -class575.field8022;
            class575.field8022 = 0;
        } else {
            class126.field1571 = 0;
        }
        class468.field5953 = class204.field2599 - class479.field6372;
        if (class468.field5953 < 0) {
            class360.field4589 = -class468.field5953;
            class468.field5953 = 0;
        } else {
            class360.field4589 = 0;
        }
        class121.field1539 = class516.field7041 + class479.field6372;
        if (class121.field1539 > class429.field5383) {
            class121.field1539 = class429.field5383;
        }
        class350.field4468 = class479.field6372 + class204.field2599;
        if (class350.field4468 > class37.field508) {
            class350.field4468 = class37.field508;
        }
        boolean[][] var16 = class354.field4511;
        boolean[][] var17 = class512.field6954;
        if (class608.field8535) {
            for (int var18 = 0; var18 < class479.field6372 + class479.field6372 + 2; var18++) {
                for (int var21 = 0; var21 < class479.field6372 + class479.field6372 + 2; var21++) {
                    int var22 = class516.field7041 + var18 - class479.field6372;
                    int var23 = class204.field2599 + var21 - class479.field6372;
                    if (var22 >= 0 && var23 >= 0 && var22 < class429.field5383 && var23 < class37.field508) {
                        int var24 = var22 << class52.field775;
                        int var25 = var23 << class52.field775;
                        int var26 = class256.field3127[class256.field3127.length - 1].method1562(var23, (byte) 51, var22) - (0x3E8 << class52.field775 - 7);
                        int var27 = class699.field9887 == null ? class256.field3127[0].method1562(var23, (byte) 51, var22) + class702.field9928 : class699.field9887[0].method1562(var23, (byte) 51, var22) + class702.field9928;
                        class512.field6954[var18][var21] = class590.field8291.method982(var24, var26, var25, var24, var27, var25);
                    } else {
                        class512.field6954[var18][var21] = false;
                    }
                }
            }
            for (int var19 = 0; var19 < class479.field6372 + class479.field6372 + 1; var19++) {
                for (int var20 = 0; var20 < class479.field6372 + class479.field6372 + 1; var20++) {
                    class354.field4511[var19][var20] = class512.field6954[var19][var20] || class512.field6954[var19 + 1][var20] || class512.field6954[var19][var20 + 1] || class512.field6954[var19 + 1][var20 + 1];
                }
            }
            class402.field5040 = arg5;
            class636.field8926 = arg6;
            class287.field3570 = arg7;
            class286.field3559 = arg8;
            class343.field4400 = arg9;
            class561.method3082(arg10, 26871, class590.field8291);
        } else {
            if (class81.field1089 == null) {
                class81.field1089 = new boolean[class429.field5383 + class429.field5383 + 1][class429.field5383 + class37.field508 + 1];
                for (int var28 = 0; var28 < class81.field1089.length; var28++) {
                    for (int var29 = 0; var29 < class81.field1089[0].length; var29++) {
                        class81.field1089[var28][var29] = true;
                    }
                }
            }
            class512.field6954 = class81.field1089;
            class354.field4511 = class81.field1089;
            class575.field8022 = 0;
            class468.field5953 = 0;
            class121.field1539 = class429.field5383;
            class350.field4468 = class37.field508;
            class145.field1881 = 0;
        }
        class70.method417(class590.field8291, 5);
        for (class101 var30 = (class101) class632.field8878.method802((byte) 72); var30 != null; var30 = (class101) class632.field8878.method800((byte) -106)) {
            var30.method3146(2);
            class480.method2611(var30, 0);
        }
        if (class167.field2199) {
            for (int var31 = 0; var31 < class574.field8008; var31++) {
                class352.field4498[var31].method2054(false, arg0, arg14);
            }
        }
        if (class184.field2345) {
            class244.field3024 = class590.field8291.method1016();
            class590.field8291.method1060(class262.field3232);
            int var32 = (class262.field3232[2] - class262.field3232[0]) / class257.field3128;
            for (int var33 = 0; var33 < class257.field3128 - 1; var33++) {
                class678.field9517[var33] = (var33 + 1) * var32 + class204.field2596[var33];
            }
            for (int var34 = 0; var34 < class455.field5825.length; var34++) {
                class455.field5825[var34].method1469();
            }
        }
        if (class173.field2260 != null) {
            if (class184.field2345) {
                class691.method3884(0);
            }
            class68.method405(true);
            class590.field8291.method1000(-1, 1583160, 40, 127);
            class677.method3796(true, arg4, arg10, arg11);
            if (class184.field2345) {
                class192.method1161();
            }
            class590.field8291.method1039();
            class68.method405(false);
        }
        class677.method3796(false, arg4, arg10, arg11);
        if (class184.field2345) {
            for (int var35 = 0; var35 < class391.field4927; var35++) {
                class560.field7787[var35] = class396.field4999[var35];
            }
            class691.method3884(0);
            for (int var36 = 0; var36 < class455.field5825.length; var36++) {
                class455.field5825[var36].method1469();
            }
        }
        if (class184.field2345) {
            class192.method1161();
            for (int var37 = 0; var37 < class391.field4927; var37++) {
                class396.field4999[var37] = class560.field7787[var37];
            }
            if (class378.field4788 == 2) {
                int var10002;
                if (class67.field907[0] < class67.field907[1]) {
                    if (class678.field9517[0] + class204.field2596[0] > class262.field3232[0]) {
                        var10002 = class204.field2596[0]++;
                    }
                } else if (class67.field907[0] > class67.field907[1] && class678.field9517[0] + class204.field2596[0] < class262.field3232[2]) {
                    var10002 = class204.field2596[0]--;
                }
            }
        }
        if (!class608.field8535) {
            class354.field4511 = var16;
            class512.field6954 = var17;
        }
        class122.method652();
    }
}
