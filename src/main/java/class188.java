import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class188 {

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "S")
    public static short field3194 = 256;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field3203 = 0;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lub;")
    public static class227 field3197 = class257.method1749(" )2> <col=ff9040>", 17263);

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Lub;")
    private static class227 field3207 = class257.method1749("Loaded sprites", 17263);

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lub;")
    public static class227 field3196 = field3207;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public int field3201;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public int field3210;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lnh;")
    public static class57 field3198;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field3199;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "[I")
    public int[] field3202;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "[I")
    public static int[] field3205;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/awt/Component;BI)V")
    public abstract void method717(int arg0, Component arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ln;BLn;Z)V")
    public static final void method1196(class138 arg0, byte arg1, class138 arg2, boolean arg3) {
        class22.field385 = arg3;
        if (arg1 < 100) {
            method1199((byte) 93);
        }
        field3208++;
        class143.field2459 = arg2;
        class253.field4375 = arg0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZLld;)V")
    public static final void method1197(boolean arg0, class195 arg1) {
        if (arg0) {
            field3207 = null;
        }
        field3206++;
        for (class238 var2 = (class238) class185.field3140.method1277(99); var2 != null; var2 = (class238) class185.field3140.method1271(250)) {
            if (var2.field4124 == arg1) {
                if (var2.field4129 != null) {
                    class94.field1627.method479(var2.field4129);
                    var2.field4129 = null;
                }
                var2.method369(-113);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static final void method1198(int arg0) {
        field3200++;
        if (arg0 != -5288) {
            method1200(32, (byte) -126, 40, 112, -15, -112, -80, 124, -40);
        }
        for (int var1 = 0; var1 < class144.field2478; var1++) {
            int var10002 = class236.field4101[var1]--;
            if (class236.field4101[var1] >= -10) {
                class39 var3 = class22.field384[var1];
                if (var3 == null) {
                    var3 = class39.method208(class95.field1648, class130.field2281[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class236.field4101[var1] += var3.method205();
                    class22.field384[var1] = var3;
                }
                if (class236.field4101[var1] < 0) {
                    int var4;
                    if (class34.field585[var1] == 0) {
                        var4 = class193.field3294;
                    } else {
                        int var5 = class34.field585[var1] >> 16 & 0xFF;
                        int var6 = (class34.field585[var1] & 0xFF) * 128;
                        int var7 = var5 * 128 + (64 - class216.field3639.field50);
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = class34.field585[var1] >> 8 & 0xFF;
                        int var9 = var8 * 128 + 64 - class216.field3639.field99;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var10 > var6) {
                            class236.field4101[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var6 - var10) * class248.field4311 / var6;
                    }
                    if (var4 > 0) {
                        class150 var11 = var3.method207().method950(class216.field3645);
                        class170 var12 = class170.method1063(var11, 100, var4);
                        var12.method1076(class221.field3747[var1] - 1);
                        class94.field1627.method480(var12);
                    }
                    class236.field4101[var1] = -100;
                }
            } else {
                class144.field2478--;
                for (int var2 = var1; var2 < class144.field2478; var2++) {
                    class130.field2281[var2] = class130.field2281[var2 + 1];
                    class22.field384[var2] = class22.field384[var2 + 1];
                    class221.field3747[var2] = class221.field3747[var2 + 1];
                    class236.field4101[var2] = class236.field4101[var2 + 1];
                    class34.field585[var2] = class34.field585[var2 + 1];
                }
                var1--;
            }
        }
        if (class171.field2869 && !class40.method212(-128)) {
            if (class179.field3072 != 0 && class13.field248 != -1) {
                class205.method1312(class13.field248, class14.field270, (byte) 66, 0, class179.field3072, false);
            }
            class171.field2869 = false;
        } else if (class179.field3072 != 0 && class13.field248 != -1 && !class40.method212(-121)) {
            class176.field2935.method664((byte) -123, 196);
            class176.field2935.method1427(class13.field248, (byte) 60);
            class116.field2114++;
            class13.field248 = -1;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static void method1199(byte arg0) {
        field3197 = null;
        field3198 = null;
        field3205 = null;
        if (arg0 != -111) {
            method1199((byte) -71);
        }
        field3207 = null;
        field3196 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method719(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBIIIIIII)V")
    public static final void method1200(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3195++;
        int var9 = arg7 - arg4;
        int var10 = -27 / ((-arg1 - 82) / 39);
        int var11 = arg3 - arg8;
        int var12 = (arg6 - arg2 << 16) / var9;
        int var13 = (arg5 - arg0 << 16) / var11;
        if (arg3 < class45.field753) {
            var11++;
        }
        if (class249.field4322 > arg7) {
            var9++;
        }
        for (int var14 = 0; var14 < var9; var14++) {
            int var31 = var12 * var14 >> 16;
            int var32 = (var14 + 1) * var12 >> 16;
            int var33 = var32 - var31;
            if (var33 > 0) {
                int var34 = arg2 + var31;
                int var35 = arg2 + var32;
                int var36 = arg4 + var14 >> 6;
                int[][] var37 = class75.field1306[var36];
                byte[][] var38 = class25.field417[var36];
                byte[][] var39 = class255.field4478[var36];
                byte[][] var40 = class64.field1167[var36];
                byte[][] var41 = class25.field424[var36];
                byte[][] var42 = class73.field1272[var36];
                for (int var43 = 0; var43 < var11; var43++) {
                    int var44 = var13 * var43 >> 16;
                    int var45 = (var43 + 1) * var13 >> 16;
                    int var46 = var45 - var44;
                    if (var46 > 0) {
                        int var47 = arg0 + var45;
                        int var48 = arg0 + var44;
                        int var49 = var43 + arg8 >> 6;
                        int var50 = arg8 + var43 & 0x3F;
                        int var51 = arg4 + var14 & 0x3F;
                        int var52 = (var50 << 6) + var51;
                        int var55;
                        if (var37[var49] == null) {
                            int var53 = arg8 + var43 & 0x4;
                            int var54 = arg4 + var14 & 0x4;
                            if ((var54 >= 2 || var53 <= 2) && (var54 <= 2 || var53 >= 2)) {
                                var55 = class9.field166[class254.field4456 + 1];
                            } else {
                                var55 = 4936552;
                            }
                        } else {
                            var55 = var37[var49][var52];
                        }
                        int var56 = var38[var49] == null ? 0 : class9.field166[var38[var49][var52] & 0xFF];
                        if (var55 == 0) {
                            var55 = 1;
                        }
                        int var57 = var40[var49] == null ? 0 : class9.field166[var40[var49][var52] & 0xFF];
                        if (var56 == 0 && var57 == 0) {
                            class111.method694(var34, var48, var33, var46, var55);
                        } else {
                            if (var56 != 0) {
                                byte var58 = var39[var49] == null ? 0 : var39[var49][var52];
                                if (var56 == -1) {
                                    var56 = 1;
                                }
                                int var59 = var58 & 0xFC;
                                if (var59 == 0 || var33 <= 1 || var46 <= 1) {
                                    class111.method694(var34, var48, var33, var46, var56);
                                } else {
                                    class151.method952(var55, var58 & 0x3, var48, var34, var33, -23737, var56, var46, class111.field2069, true, var59 >> 2);
                                }
                            }
                            if (var57 != 0) {
                                if (var57 == -1) {
                                    var57 = var55;
                                }
                                byte var60 = var41[var49][var52];
                                int var61 = var60 & 0xFC;
                                if (var61 == 0 || var33 <= 1 || var46 <= 1) {
                                    class111.method694(var34, var48, var33, var46, var57);
                                }
                                class151.method952(0, var60 & 0x3, var48, var34, var33, -23737, var57, var46, class111.field2069, var56 == 0, var61 >> 2);
                            }
                        }
                        if (var42[var49] != null) {
                            int var62 = var42[var49][var52] & 0xFF;
                            if (var62 != 0) {
                                int var63;
                                if (var33 == 1) {
                                    var63 = var34;
                                } else {
                                    var63 = var35 - 1;
                                }
                                int var64;
                                if (var46 == 1) {
                                    var64 = var48;
                                } else {
                                    var64 = var47 - 1;
                                }
                                int var65 = 13421772;
                                if (var62 >= 5 && var62 <= 8 || var62 >= 13 && var62 <= 16 || var62 >= 21 && var62 <= 24 || var62 == 27 || var62 == 28) {
                                    var65 = 13369344;
                                    var62 -= 4;
                                }
                                if (var62 == 1) {
                                    class111.method701(var34, var48, var46, var65);
                                } else if (var62 == 2) {
                                    class111.method696(var34, var48, var33, var65);
                                } else if (var62 == 3) {
                                    class111.method701(var63, var48, var46, var65);
                                } else if (var62 == 4) {
                                    class111.method696(var34, var64, var33, var65);
                                } else if (var62 == 9) {
                                    class111.method701(var34, var48, var46, 16777215);
                                    class111.method696(var34, var48, var33, var65);
                                } else if (var62 == 10) {
                                    class111.method701(var63, var48, var46, 16777215);
                                    class111.method696(var34, var48, var33, var65);
                                } else if (var62 == 11) {
                                    class111.method701(var63, var48, var46, 16777215);
                                    class111.method696(var34, var64, var33, var65);
                                } else if (var62 == 12) {
                                    class111.method701(var34, var48, var46, 16777215);
                                    class111.method696(var34, var64, var33, var65);
                                } else if (var62 == 17) {
                                    class111.method696(var34, var48, 1, var65);
                                } else if (var62 == 18) {
                                    class111.method696(var63, var48, 1, var65);
                                } else if (var62 == 19) {
                                    class111.method696(var63, var64, 1, var65);
                                } else if (var62 == 20) {
                                    class111.method696(var34, var64, 1, var65);
                                } else if (var62 == 25) {
                                    for (int var67 = 0; var67 < var46; var67++) {
                                        class111.method696(var34 + var67, var64 - var67, 1, var65);
                                    }
                                } else if (var62 == 26) {
                                    for (int var66 = 0; var66 < var46; var66++) {
                                        class111.method696(var34 + var66, var48 + var66, 1, var65);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var15 = 0; var15 < var9; var15++) {
            int var16 = var12 * var15 >> 16;
            int var17 = (var15 + 1) * var12 >> 16;
            int var18 = var17 - var16;
            if (var18 > 0) {
                int var19 = arg2 + var16;
                byte[][] var20 = class197.field3383[arg4 + var15 >> 6];
                int var10000 = arg2 + var17;
                for (int var22 = 0; var22 < var11; var22++) {
                    int var23 = (var22 + 1) * var13 >> 16;
                    int var24 = var13 * var22 >> 16;
                    int var25 = var23 - var24;
                    if (var25 > 0) {
                        int var26 = arg0 + var24;
                        var10000 = arg0 + var23;
                        int var28 = arg8 + var22 >> 6;
                        int var29 = (arg8 + var22 & 0x3F << 6) + (arg4 + var15 & 0x3F);
                        if (var20[var28] != null) {
                            int var30 = var20[var28][var29] & 0xFF;
                            if (var30 != 0) {
                                if (var30 == 47 || var30 == 53) {
                                    class168.field2807[var30 - 1].method1337(var19, var26, var18 * 2 + 1, var25 * 2 + 1);
                                } else {
                                    class168.field2807[var30 - 1].method1337(var19 - var18 / 2, -(var25 / 2) + var26, var18 * 2, var25 * 2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/awt/Graphics;BIII)V")
    public abstract void method718(int arg0, Graphics arg1, byte arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)Lac;")
    public static final class133 method1201(int arg0, int arg1, int arg2) {
        class108 var3 = class261.field4539[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class133 var4 = var3.field2039;
            var3.field2039 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    public static final void method1202(boolean arg0) {
        if (class9.field172 != null) {
            class9.field172.method97(0);
            class9.field172 = null;
        }
        field3204++;
        class211.method1343((byte) 102);
        class83.method508();
        for (int var1 = 0; var1 < 4; var1++) {
            class78.field1370[var1].method835(-44);
        }
        class184.method1176(1);
        System.gc();
        class225.method1416(0, 2);
        class13.field248 = -1;
        class171.field2869 = false;
        class212.method1352(arg0, (byte) -21);
        class192.field3267 = 0;
        class78.field1367 = 0;
        class83.field1454 = false;
        for (int var2 = 0; var2 < class229.field3994.length; var2++) {
            class229.field3994[var2] = null;
        }
        class146.field2512 = 0;
        class71.field1254 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class27.field446[var3] = null;
            class42.field684[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class220.field3715[var4] = null;
        }
        class83.method506(127);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    protected class188() {
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public final void method1203(int arg0) {
        class111.method699(this.field3202, this.field3201, this.field3210);
        field3209++;
        if (arg0 != -1) {
            field3198 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ln;ILn;Ln;)V")
    public static final void method1204(class138 arg0, int arg1, class138 arg2, class138 arg3) {
        field3193++;
        class249.field4326 = arg0;
        class86.field1486 = arg3;
        if (arg1 != 16777215) {
            field3194 = -115;
        }
        class91.field1560 = arg2;
    }
}
