import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class172 extends class200 {

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "Z")
    public boolean field2992 = true;

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "I")
    public int field2994 = -1;

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
    public int field3001 = -1;

    @OriginalMember(owner = "client!qa", name = "bb", descriptor = "I")
    public int field3005 = 0;

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
    public static int field2995 = 0;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "[I")
    public static int[] field2999 = new int[100];

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "Ldj;")
    private static class44 field2989 = class89.method650(255, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "Ldj;")
    public static class44 field2997 = field2989;

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "Ldj;")
    public static class44 field3003 = class89.method650(255, "<img=0>");

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!qa", name = "ab", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg7 != 14944) {
            method1090(-7, -59, -122, 30, 120, 74, -15, -50, -103);
        }
        field2993++;
        int var9 = arg1 - arg0;
        int var10 = arg8 - arg6;
        int var11 = (arg3 - arg4 << 16) / var10;
        int var12 = (arg2 - arg5 << 16) / var9;
        boolean var13;
        if (class77.field1493 > 0 && class77.field1493 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        for (int var14 = 0; var14 < var9; var14++) {
            int var31 = (var14 + 1) * var12 >> 16;
            int var32 = var12 * var14 >> 16;
            int var33 = var31 - var32;
            if (var33 > 0) {
                int var34 = arg5 + var32;
                int var10000 = arg5 + var31;
                int[][] var36 = class72.field1378[arg0 + var14 >> 6];
                for (int var37 = 0; var37 < var10; var37++) {
                    int var38 = var11 * var37 >> 16;
                    int var39 = (var37 + 1) * var11 >> 16;
                    int var40 = var39 - var38;
                    if (var40 > 0) {
                        int var41 = arg4 + var38;
                        int var42 = arg6 + var37 >> 6;
                        var10000 = arg4 + var39;
                        if (var36[var42] != null) {
                            int var44 = ((arg6 + var37 & 0x3F) << 6) + (arg0 + var14 & 0x3F);
                            int var45 = var36[var42][var44];
                            if (var45 != 0) {
                                class39 var46 = class40.method281(true, var45 - 1);
                                if (var13 && class157.field2731 == var46.field696) {
                                    class210 var47 = new class210();
                                    var47.field3753 = var34;
                                    var47.field3746 = var41;
                                    var47.field3756 = var46.field696;
                                    class92.field1712.method1185(var47, (byte) -110);
                                }
                                class158.field2752[var46.field696].method1010(var34 - 7, var41 + -7);
                            }
                        }
                    }
                }
            }
        }
        if (class32.field565 == class202.field3601) {
            for (class35 var15 = (class35) class186.field3217.method1189(arg7 - 14944); var15 != null; var15 = (class35) class186.field3217.method1192((byte) -111)) {
                int var16 = var15.field622;
                int var17 = class214.field3851 + class136.field2431 - var16;
                int var18 = var15.field632;
                int var19 = (arg3 - arg4) * (var17 - arg6) / (arg8 - arg6) + arg4;
                int var20 = var15.field621;
                int var21 = var18 - class198.field3502;
                int var22 = (var21 - arg0) * (arg2 - arg5) / (arg1 - arg0) + arg5;
                int var23 = 16777215;
                class233 var24 = null;
                if (var20 == 0) {
                    if (class202.field3601 == 3.0D) {
                        var24 = class200.field3538;
                    }
                    if (class202.field3601 == 4.0D) {
                        var24 = class124.field2229;
                    }
                    if (class202.field3601 == 6.0D) {
                        var24 = class64.field1185;
                    }
                    if (class202.field3601 == 8.0D) {
                        var24 = class52.field937;
                    }
                }
                if (var20 == 1) {
                    if (class202.field3601 == 3.0D) {
                        var24 = class64.field1185;
                    }
                    if (class202.field3601 == 4.0D) {
                        var24 = class52.field937;
                    }
                    if (class202.field3601 == 6.0D) {
                        var24 = class73.field1391;
                    }
                    if (class202.field3601 == 8.0D) {
                        var24 = class5.field78;
                    }
                }
                if (var20 == 2) {
                    if (class202.field3601 == 3.0D) {
                        var24 = class73.field1391;
                    }
                    if (class202.field3601 == 4.0D) {
                        var24 = class5.field78;
                    }
                    var23 = 16755200;
                    if (class202.field3601 == 6.0D) {
                        var24 = class101.field1848;
                    }
                    if (class202.field3601 == 8.0D) {
                        var24 = class208.field3733;
                    }
                }
                if (var24 != null) {
                    class44[] var25 = var15.field618;
                    int var26 = var25.length;
                    int var27 = var19 - var24.method1525() * (var26 - 1) / 2;
                    int var28 = var27 + var24.method1524() / 2;
                    for (int var29 = 0; var29 < var26; var29++) {
                        var24.method1518(var25[var29], var22, var28, var23, true);
                        var28 += var24.method1525();
                    }
                }
            }
        }
        for (class210 var30 = (class210) class92.field1712.method1189(0); var30 != null; var30 = (class210) class92.field1712.method1192((byte) -88)) {
            class158.field2752[var30.field3756].method1010(var30.field3753 - 7, var30.field3746 - 7);
            class99.method690(var30.field3753, var30.field3746, 15, 16776960, 128);
            class99.method690(var30.field3753, var30.field3746, 7, 16777215, 256);
        }
        class92.field1712.method1193((byte) 26);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public static void method1091(boolean arg0) {
        field2999 = null;
        if (arg0) {
            field3003 = null;
        }
        field3003 = null;
        field2989 = null;
        field2997 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILvc;)I")
    public static final int method1092(int arg0, int arg1, class223 arg2) {
        field3002++;
        if (arg2.field4150 == null || arg0 >= arg2.field4150.length) {
            return -2;
        }
        try {
            int[] var3 = arg2.field4150[arg0];
            if (arg1 != 30364) {
                field2998 = 7;
            }
            int var4 = 0;
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var3[var6++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 1) {
                    var9 = class136.field2432[var3[var6++]];
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 2) {
                    var9 = class33.field584[var3[var6++]];
                }
                if (var7 == 3) {
                    var9 = class156.field2716[var3[var6++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var6++] << 16;
                    int var11 = var10 + var3[var6++];
                    class223 var12 = class213.method1379(var11, -10051);
                    int var13 = var3[var6++];
                    if (var13 != -1 && (!class192.method1227(-31700, var13).field3831 || class178.field3064)) {
                        for (int var14 = 0; var14 < var12.field4166.length; var14++) {
                            if (var13 + 1 == var12.field4166[var14]) {
                                var9 += var12.field4060[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class136.field2435[var3[var6++]];
                }
                if (var7 == 6) {
                    var9 = class222.field4013[class33.field584[var3[var6++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class136.field2435[var3[var6++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class96.field1774.field406;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class230.field4319[var15]) {
                            var9 += class33.field584[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var6++] << 16;
                    int var17 = var16 + var3[var6++];
                    class223 var18 = class213.method1379(var17, -10051);
                    int var19 = var3[var6++];
                    if (var19 != -1 && (!class192.method1227(arg1 - 62064, var19).field3831 || class178.field3064)) {
                        for (int var20 = 0; var20 < var18.field4166.length; var20++) {
                            if (var19 + 1 == var18.field4166[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class181.field3158;
                }
                if (var7 == 12) {
                    var9 = class72.field1373;
                }
                if (var7 == 13) {
                    int var21 = class136.field2435[var3[var6++]];
                    int var22 = var3[var6++];
                    var9 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var6++];
                    var9 = class47.method350(108, var23);
                }
                if (var7 == 18) {
                    var9 = (class96.field1774.field2260 >> 7) + class222.field4020;
                }
                if (var7 == 19) {
                    var9 = (class96.field1774.field2195 >> 7) + class143.field2550;
                }
                if (var7 == 20) {
                    var9 = var3[var6++];
                }
                if (var8 == 0) {
                    if (var5 == 0) {
                        var4 += var9;
                    }
                    if (var5 == 1) {
                        var4 -= var9;
                    }
                    if (var5 == 2 && var9 != 0) {
                        var4 /= var9;
                    }
                    if (var5 == 3) {
                        var4 *= var9;
                    }
                    var5 = 0;
                } else {
                    var5 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B[B)V")
    public static final void method1093(byte arg0, byte[] arg1) {
        class66 var2 = new class66(arg1);
        field3004++;
        var2.field1195 = arg1.length - 2;
        class106.field1942 = var2.method500(70);
        class88.field1684 = new int[class106.field1942];
        class58.field1082 = new byte[class106.field1942][];
        class38.field672 = new int[class106.field1942];
        class175.field3039 = new int[class106.field1942];
        class94.field1745 = new int[class106.field1942];
        var2.field1195 = arg1.length - class106.field1942 * 8 - 7;
        class92.field1725 = var2.method500(58);
        class227.field4275 = var2.method500(100);
        int var3 = (var2.method506(255) & 0xFF) + 1;
        for (int var4 = 0; var4 < class106.field1942; var4++) {
            class88.field1684[var4] = var2.method500(78);
        }
        if (arg0 != 123) {
            method1093((byte) -50, null);
        }
        for (int var5 = 0; var5 < class106.field1942; var5++) {
            class38.field672[var5] = var2.method500(54);
        }
        for (int var6 = 0; var6 < class106.field1942; var6++) {
            class94.field1745[var6] = var2.method500(48);
        }
        for (int var7 = 0; var7 < class106.field1942; var7++) {
            class175.field3039[var7] = var2.method500(class13.method116(arg0, 38));
        }
        var2.field1195 = arg1.length + 3 - class106.field1942 * 8 - var3 * 3 - 7;
        class170.field2933 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class170.field2933[var8] = var2.method480(65);
            if (class170.field2933[var8] == 0) {
                class170.field2933[var8] = 1;
            }
        }
        var2.field1195 = 0;
        for (int var9 = 0; var9 < class106.field1942; var9++) {
            int var10 = class94.field1745[var9];
            int var11 = class175.field3039[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class58.field1082[var9] = var13;
            int var14 = var2.method506(255);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method505(false);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var16 + var10 * var17] = var2.method505(false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lfj;III)V")
    private final void method1094(class66 arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field3005 = class7.method76(arg0.method480(arg2 ^ 0xFFFF86D9), (byte) -58);
        } else if (arg3 == 2) {
            this.field3001 = arg0.method506(arg2 + 31328);
        } else if (arg3 == 3) {
            this.field3001 = arg0.method500(80);
            if (this.field3001 == 65535) {
                this.field3001 = -1;
            }
        } else if (arg3 == 5) {
            this.field2992 = false;
        } else if (arg3 == 7) {
            this.field2994 = class7.method76(arg0.method480(93), (byte) -51);
        } else if (arg3 == 8) {
            class239.field4414 = arg1;
        } else if (arg3 == 9) {
            arg0.method500(109);
        }
        if (arg2 == -31073) {
            field3000++;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBIZ)V")
    public static final void method1095(int arg0, byte arg1, int arg2, boolean arg3) {
        field2990++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class118.field2099 = arg2;
        class158.field2748 = arg3;
        class170.field2935 = arg0;
        if (arg1 != 55) {
            method1091(true);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILfj;)V")
    public final void method1096(int arg0, int arg1, class66 arg2) {
        if (arg0 != 0) {
            return;
        }
        field2996++;
        while (true) {
            int var4 = arg2.method506(255);
            if (var4 == 0) {
                return;
            }
            this.method1094(arg2, arg1, -31073, var4);
        }
    }
}
