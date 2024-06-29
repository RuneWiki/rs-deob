import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class class175 {

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Z")
    public static boolean field3376 = false;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Ljd;")
    public static class92 field3373 = class202.method1325((byte) 90, ")4lang)4de");

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field3381 = 0;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Ljd;")
    private static class92 field3382 = class202.method1325((byte) 90, "Unexpected server response)3");

    @OriginalMember(owner = "client!se", name = "k", descriptor = "[Ltf;")
    public static class185[] field3383 = new class185[100];

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Ljd;")
    public static class92 field3374 = field3382;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "Ljb;")
    public static class90 field3385;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "[[B")
    public static byte[][] field3384;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static final void method1150(byte arg0) {
        field3377++;
        class65 var1 = class66.field1340;
        synchronized (class66.field1340) {
            class202.field3923 = class162.field3174;
            class29.field641 = class107.field2160;
            class192.field3756 = class116.field2354;
            if (arg0 == 81) {
                class74.field1559 = class162.field3182;
                class31.field705 = class48.field1039;
                class81.field1645 = class116.field2355;
                class88.field1738 = class188.field3566;
                class162.field3182 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public abstract void method329(int arg0);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    public static void method1152(boolean arg0) {
        field3382 = null;
        field3384 = null;
        field3374 = null;
        field3385 = null;
        field3373 = null;
        field3383 = null;
        if (arg0) {
            method1150((byte) 31);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lnh;BLei;ZLnh;)V")
    public static final void method1153(class133 arg0, byte arg1, class50 arg2, boolean arg3, class133 arg4) {
        if (arg1 < 15) {
            return;
        }
        class139.field2778 = arg3;
        field3375++;
        class147.field2923 = arg0;
        class27.field611 = arg4;
        int var5 = class27.field611.method884((byte) -35) - 1;
        class104.field2144 = class27.field611.method886(106, var5) + var5 * 256;
        class25.field579 = arg2;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(La;IIII)V")
    public static final void method1154(class1 arg0, int arg1, int arg2, int arg3, int arg4) {
        class6.method42((byte) -64);
        class163.method1040(arg1, arg4, arg1 + arg0.field96, arg0.field28 + arg4);
        if (arg2 != -14619) {
            method1154(null, -62, 117, -71, 110);
        }
        field3379++;
        if (class137.field2750 == 2 || class137.field2750 == 5) {
            class163.method1042(arg1, arg4, 0, arg0.field115, arg0.field26);
        } else {
            int var5 = class9.field327 + class172.field3338 & 0x7FF;
            int var6 = class15.field423.field246 / 32 + 48;
            int var7 = 464 - class15.field423.field208 / 32;
            class139.field2784.method1103(arg1, arg4, arg0.field96, arg0.field28, var6, var7, var5, class127.field2565 + 256, arg0.field115, arg0.field26);
            for (int var8 = 0; var8 < class91.field1803; var8++) {
                int var41 = class156.field3095[var8] * 4 + 2 - class15.field423.field246 / 32;
                int var42 = class212.field4099[var8] * 4 + 2 - class15.field423.field208 / 32;
                class124.method830(arg0, class100.field2065[var8], var41, arg4, 17911, var42, arg1);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var37 = 0; var37 < 104; var37++) {
                    class18 var38 = class136.field2725[class81.field1639][var9][var37];
                    if (var38 != null) {
                        int var39 = var9 * 4 + 2 - class15.field423.field246 / 32;
                        int var40 = var37 * 4 + 2 - class15.field423.field208 / 32;
                        class124.method830(arg0, class36.field835[0], var39, arg4, 17911, var40, arg1);
                    }
                }
            }
            for (int var10 = 0; var10 < class96.field1928; var10++) {
                class129 var33 = class107.field2187[class39.field893[var10]];
                if (var33 != null && var33.method24(100)) {
                    class97 var34 = var33.field2592;
                    if (var34 != null && var34.field1940 != null) {
                        var34 = var34.method674((byte) -99);
                    }
                    if (var34 != null && var34.field1973 && var34.field1941) {
                        int var35 = var33.field246 / 32 - class15.field423.field246 / 32;
                        int var36 = var33.field208 / 32 - class15.field423.field208 / 32;
                        class124.method830(arg0, class36.field835[1], var35, arg4, 17911, var36, arg1);
                    }
                }
            }
            for (int var11 = 0; var11 < class140.field2811; var11++) {
                class91 var25 = class172.field3347[class190.field3678[var11]];
                if (var25 != null && var25.method24(100)) {
                    int var26 = var25.field246 / 32 - class15.field423.field246 / 32;
                    int var27 = var25.field208 / 32 - class15.field423.field208 / 32;
                    boolean var28 = false;
                    long var29 = var25.field1805.method609(10354);
                    for (int var31 = 0; var31 < class166.field3273; var31++) {
                        if (class93.field1878[var31] == var29 && class148.field2936[var31] != 0) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var32 = false;
                    if (class15.field423.field1801 != 0 && var25.field1801 != 0 && class15.field423.field1801 == var25.field1801) {
                        var32 = true;
                    }
                    if (var28) {
                        class124.method830(arg0, class36.field835[3], var26, arg4, 17911, var27, arg1);
                    } else if (var32) {
                        class124.method830(arg0, class36.field835[4], var26, arg4, 17911, var27, arg1);
                    } else {
                        class124.method830(arg0, class36.field835[2], var26, arg4, arg2 + 32530, var27, arg1);
                    }
                }
            }
            class205[] var12 = class135.field2711;
            for (int var13 = 0; var13 < var12.length; var13++) {
                class205 var16 = var12[var13];
                if (var16 != null && var16.field3956 != 0 && class158.field3150 % 20 < 10) {
                    if (var16.field3956 == 1 && var16.field3958 >= 0 && class107.field2187.length > var16.field3958) {
                        class129 var17 = class107.field2187[var16.field3958];
                        if (var17 != null) {
                            int var18 = var17.field246 / 32 - class15.field423.field246 / 32;
                            int var19 = var17.field208 / 32 - class15.field423.field208 / 32;
                            class130.method862(arg2 + 14875, arg1, var16.field3951, var19, arg4, arg0, var18);
                        }
                    }
                    if (var16.field3956 == 2) {
                        int var20 = (var16.field3955 - class210.field4077) * 4 + 2 - class15.field423.field208 / 32;
                        int var21 = (var16.field3944 - class115.field2343) * 4 + 2 - class15.field423.field246 / 32;
                        class130.method862(256, arg1, var16.field3951, var20, arg4, arg0, var21);
                    }
                    if (var16.field3956 == 10 && var16.field3958 >= 0 && var16.field3958 < class172.field3347.length) {
                        class91 var22 = class172.field3347[var16.field3958];
                        if (var22 != null) {
                            int var23 = var22.field208 / 32 - class15.field423.field208 / 32;
                            int var24 = var22.field246 / 32 - class15.field423.field246 / 32;
                            class130.method862(256, arg1, var16.field3951, var23, arg4, arg0, var24);
                        }
                    }
                }
            }
            if (class4.field262 != 0) {
                int var14 = class193.field3765 * 4 + 2 - class15.field423.field208 / 32;
                int var15 = class4.field262 * 4 + 2 - class15.field423.field246 / 32;
                class124.method830(arg0, class211.field4086, var15, arg4, 17911, var14, arg1);
            }
            class163.method1049(arg0.field96 / 2 + arg1 - 1, arg0.field28 / 2 + arg4 + -1, 3, 3, 16777215);
        }
        class42.field942[arg3] = true;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZII)I")
    public abstract int method328(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)La;")
    public static final class1 method1155(int arg0, byte arg1) {
        int var2 = -58 % ((-arg1 - 23) / 52);
        int var3 = arg0 >> 16;
        field3380++;
        int var4 = arg0 & 0xFFFF;
        if (class60.field1256[var3] == null || class60.field1256[var3][var4] == null) {
            boolean var5 = class188.method1210(-18040, var3);
            if (!var5) {
                return null;
            }
        }
        return class60.field1256[var3][var4];
    }
}
