import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class201 {

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "[Z")
    public static boolean[] field3479 = new boolean[100];

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "Z")
    public static boolean field3481 = false;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Loh;")
    private static class258 field3484 = class153.method1046("Take", 112);

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "Loh;")
    public static class258 field3488 = field3484;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field3483 = 0;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field3478 = 1;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3486;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "[[[I")
    public static int[][][] field3482;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 5)
    public static final void method1331(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class23.field277 * 128) {
            arg0 = class23.field277 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class290.field4995 * 128) {
            arg2 = class290.field4995 * 128 - 1;
        }
        class203.field3516 = class266.field4642[arg3];
        class52.field841 = class266.field4636[arg3];
        class244.field4230 = class266.field4642[arg4];
        class310.field5249 = class266.field4636[arg4];
        class190.field3359 = arg0;
        class258.field4463 = arg1;
        class289.field4986 = arg2;
        class64.field1134 = arg0 / 128;
        class145.field2447 = arg2 / 128;
        class121.field2144 = class64.field1134 - class297.field5101;
        if (class121.field2144 < 0) {
            class121.field2144 = 0;
        }
        class30.field360 = class145.field2447 - class297.field5101;
        if (class30.field360 < 0) {
            class30.field360 = 0;
        }
        class171.field3009 = class64.field1134 + class297.field5101;
        if (class171.field3009 > class23.field277) {
            class171.field3009 = class23.field277;
        }
        class45.field688 = class297.field5101 + class145.field2447;
        if (class45.field688 > class290.field4995) {
            class45.field688 = class290.field4995;
        }
        short var15;
        if (class257.field4390) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class297.field5101 + class297.field5101 + 2; var16++) {
            for (int var17 = 0; var17 < class297.field5101 + class297.field5101 + 2; var17++) {
                int var18 = (var16 - class297.field5101 << 7) - (class190.field3359 & 0x7F);
                int var19 = (var17 - class297.field5101 << 7) - (class289.field4986 & 0x7F);
                int var20 = class64.field1134 + var16 - class297.field5101;
                int var21 = class145.field2447 + var17 - class297.field5101;
                if (var20 >= 0 && var21 >= 0 && var20 < class23.field277 && var21 < class290.field4995) {
                    int var22;
                    if (class144.field2424 == null) {
                        var22 = class134.field2317[0][var20][var21] + 128 - class258.field4463;
                    } else {
                        var22 = class144.field2424[0][var20][var21] + 128 - class258.field4463;
                    }
                    int var23 = class134.field2317[3][var20][var21] - class258.field4463 - 1000;
                    class155.field2658[var16][var17] = class70.method526(var18, var23, var22, var19, var15);
                } else {
                    class155.field2658[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class297.field5101 + class297.field5101 + 1; var24++) {
            for (int var25 = 0; var25 < class297.field5101 + class297.field5101 + 1; var25++) {
                class232.field4032[var24][var25] = class155.field2658[var24][var25] || class155.field2658[var24 + 1][var25] || class155.field2658[var24][var25 + 1] || class155.field2658[var24 + 1][var25 + 1];
            }
        }
        class73.field1288 = arg6;
        class119.field2105 = arg7;
        class90.field1590 = arg8;
        class146.field2479 = arg9;
        class208.field3581 = arg10;
        class154.method1053();
        if (class108.field1915 != null) {
            class75.method549(true);
            class11.method69(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class257.field4390) {
                class120.field2123 = false;
                class107.method795(0, 58, 0);
                class304.method2124((float[]) null);
                class267.method1893();
            }
            class75.method549(false);
        }
        class11.method69(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)Z", line = 135)
    public static final boolean method1332(int arg0) {
        field3487++;
        class122 var1 = class215.field3729;
        synchronized (class215.field3729) {
            if (class263.field4576 == class255.field4376) {
                return false;
            }
            class88.field1506 = class121.field2134[class255.field4376];
            class231.field3989 = class263.field4575[class255.field4376];
            class255.field4376 = class255.field4376 + 1 & 0x7F;
            if (arg0 != 22315) {
                field3478 = -59;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 161)
    public static void method1333(byte arg0) {
        field3482 = (int[][][]) null;
        if (arg0 >= -122) {
            method1335((class258) null, (class258) null, 81, (byte) -57, 57L, -117, (short) 67);
        }
        field3486 = null;
        field3488 = null;
        field3479 = null;
        field3484 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIZII)V", line = 183)
    public static final void method1334(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field3480++;
        if (class264.field4598 == arg1 && class165.field2797 == arg6 && class265.field4626 == arg2 || class110.method807(720049666)) {
            return;
        }
        class165.field2797 = arg6;
        class264.field4598 = arg1;
        class265.field4626 = arg2;
        if (class110.method807(720049666)) {
            class265.field4626 = 0;
        }
        if (arg4) {
            class106.method791((byte) 8, 28);
        } else {
            class106.method791((byte) 8, 25);
        }
        class251.method1704(class282.field4853, true, false);
        int var7 = -43 / ((arg5 + 46) / 53);
        int var8 = class311.field5271;
        int var9 = class229.field3955;
        class311.field5271 = (arg6 - 6) * 8;
        class229.field3955 = (arg1 - 6) * 8;
        class153.field2632 = class172.method1167(class264.field4598 * 8, 0, class165.field2797 * 8);
        int var10 = class229.field3955 - var9;
        int var11 = class229.field3955;
        int var12 = class311.field5271 - var8;
        class2.field22 = null;
        int var13 = class311.field5271;
        if (arg4) {
            class226.field3895 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class107 var18 = class16.field214[var17];
                if (var18 != null) {
                    var18.field912 -= var10 * 128;
                    var18.field934 -= var12 * 128;
                    if (var18.field912 >= 0 && var18.field912 <= 13184 && var18.field934 >= 0 && var18.field934 <= 13184) {
                        for (int var19 = 0; var19 < 10; var19++) {
                            var18.field975[var19] -= var10;
                            var18.field959[var19] -= var12;
                        }
                        class92.field1616[class226.field3895++] = var17;
                    } else {
                        class16.field214[var17].field1906 = null;
                        class16.field214[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class107 var15 = class16.field214[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field975[var16] -= var10;
                        var15.field959[var16] -= var12;
                    }
                    var15.field934 -= var12 * 128;
                    var15.field912 -= var10 * 128;
                }
            }
        }
        for (int var20 = 0; var20 < 2048; var20++) {
            class231 var21 = class38.field527[var20];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field975[var22] -= var10;
                    var21.field959[var22] -= var12;
                }
                var21.field912 -= var10 * 128;
                var21.field934 -= var12 * 128;
            }
        }
        byte var23 = 0;
        class272.field4704 = arg2;
        class152.field2606.method1546(true, arg0, false, arg3);
        byte var24 = 104;
        byte var25 = 1;
        byte var26 = 0;
        if (var10 < 0) {
            var25 = -1;
            var23 = 103;
            var24 = -1;
        }
        byte var27 = 104;
        byte var28 = 1;
        if (var12 < 0) {
            var28 = -1;
            var27 = -1;
            var26 = 103;
        }
        for (int var29 = var23; var29 != var24; var29 += var25) {
            for (int var30 = var26; var30 != var27; var30 += var28) {
                int var31 = var10 + var29;
                int var32 = var30 + var12;
                for (int var33 = 0; var33 < 4; var33++) {
                    if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                        class82.field1386[var33][var29][var30] = class82.field1386[var33][var31][var32];
                    } else {
                        class82.field1386[var33][var29][var30] = null;
                    }
                }
            }
        }
        for (class179 var34 = (class179) class169.field2857.method83(-93); var34 != null; var34 = (class179) class169.field2857.method87((byte) -80)) {
            var34.field3207 -= var12;
            var34.field3208 -= var10;
            if (var34.field3208 < 0 || var34.field3207 < 0 || var34.field3208 >= 104 || var34.field3207 >= 104) {
                var34.method1054((byte) 102);
            }
        }
        if (class10.field118 != 0) {
            class10.field118 -= var10;
            class6.field82 -= var12;
        }
        if (arg4) {
            class78.field1334 -= var10;
            class5.field69 -= var10;
            class303.field5174 -= var12;
            class236.field4126 -= var12;
        } else {
            class109.field1926 = 1;
        }
        class299.field5118 = 0;
        if (class257.field4390 && arg4 && (Math.abs(var10) > 104 || Math.abs(var12) > 104)) {
            class121.method883((byte) 80);
        }
        class50.field767 = -1;
        class277.field4769.method80(0);
        class294.field5050.method80(0);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Loh;Loh;IBJIS)V", line = 427)
    public static final void method1335(class258 arg0, class258 arg1, int arg2, byte arg3, long arg4, int arg5, short arg6) {
        if (arg3 > -102) {
            return;
        }
        field3485++;
        if (class252.field4342 || class69.field1195 >= 500) {
            return;
        }
        class242.field4205[class69.field1195] = arg0;
        class225.field3849[class69.field1195] = arg1;
        class227.field3910[class69.field1195] = arg6;
        class217.field3741[class69.field1195] = arg4;
        class225.field3863[class69.field1195] = arg5;
        class70.field1219[class69.field1195] = arg2;
        class69.field1195++;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 476)
    public static final void method1336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class26 var20 = new class26(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class178.field3180[var21][arg1][arg2] == null) {
                    class178.field3180[var21][arg1][arg2] = new class228(var21, arg1, arg2);
                }
            }
            class178.field3180[arg0][arg1][arg2].field3945 = var20;
        } else if (arg3 == 1) {
            class26 var22 = new class26(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class178.field3180[var23][arg1][arg2] == null) {
                    class178.field3180[var23][arg1][arg2] = new class228(var23, arg1, arg2);
                }
            }
            class178.field3180[arg0][arg1][arg2].field3945 = var22;
        } else {
            class67 var24 = new class67(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class178.field3180[var25][arg1][arg2] == null) {
                    class178.field3180[var25][arg1][arg2] = new class228(var25, arg1, arg2);
                }
            }
            class178.field3180[arg0][arg1][arg2].field3933 = var24;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V", line = 530)
    public static final void method1337(boolean arg0) {
        field3489++;
        if (!arg0) {
            method1333((byte) 67);
        }
        int var1 = class293.field5036.method881(8, (byte) -125);
        if (class14.field177 > var1) {
            for (int var2 = var1; var2 < class14.field177; var2++) {
                class152.field2615[class307.field5217++] = class140.field2390[var2];
            }
        }
        if (var1 > class14.field177) {
            throw new RuntimeException("gppov1");
        }
        class14.field177 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class140.field2390[var3];
            class231 var5 = class38.field527[var4];
            int var6 = class293.field5036.method881(1, (byte) -97);
            if (var6 == 0) {
                class140.field2390[class14.field177++] = var4;
                var5.field951 = class202.field3498;
            } else {
                int var7 = class293.field5036.method881(2, (byte) -124);
                if (var7 == 0) {
                    class140.field2390[class14.field177++] = var4;
                    var5.field951 = class202.field3498;
                    class225.field3857[class311.field5289++] = var4;
                } else if (var7 == 1) {
                    class140.field2390[class14.field177++] = var4;
                    var5.field951 = class202.field3498;
                    int var8 = class293.field5036.method881(3, (byte) -113);
                    var5.method450(var8, -12338, false);
                    int var9 = class293.field5036.method881(1, (byte) -113);
                    if (var9 == 1) {
                        class225.field3857[class311.field5289++] = var4;
                    }
                } else if (var7 == 2) {
                    class140.field2390[class14.field177++] = var4;
                    var5.field951 = class202.field3498;
                    int var10 = class293.field5036.method881(3, (byte) -115);
                    var5.method450(var10, -12338, true);
                    int var11 = class293.field5036.method881(3, (byte) -126);
                    var5.method450(var11, -12338, true);
                    int var12 = class293.field5036.method881(1, (byte) -107);
                    if (var12 == 1) {
                        class225.field3857[class311.field5289++] = var4;
                    }
                } else if (var7 == 3) {
                    class152.field2615[class307.field5217++] = var4;
                }
            }
        }
    }
}
