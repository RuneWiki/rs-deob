import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class180 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Z")
    public static boolean field3217 = false;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "S")
    public static short field3222 = 32767;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field3219 = 0;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field3213 = 0;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Loh;")
    public static class258 field3218 = class153.method1046("::replacecanvas", 109);

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Loh;")
    public static class258 field3223 = class153.method1046("scrollen:", 110);

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Loh;")
    public static class258 field3220 = class153.method1046("::fps ", 121);

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Loh;")
    public static class258 field3226 = class153.method1046("W-=hlen Sie eine Option", 86);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 27)
    public static void method1231(byte arg0) {
        field3220 = null;
        if (arg0 > -11) {
            field3218 = (class258) null;
        }
        field3226 = null;
        field3218 = null;
        field3223 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I", line = 42)
    public static final int method1232(int arg0, int arg1) {
        if (arg0 != -1762753753) {
            field3219 = 76;
        }
        field3225++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V", line = 89)
    public static final void method1233(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 24933) {
            method1232(56, 63);
        }
        field3224++;
        class286 var4 = class48.method389(arg2, 11, 10738);
        var4.method2017(-47);
        var4.field4926 = arg3;
        var4.field4932 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)[F", line = 118)
    public static final float[] method1234(int arg0, int arg1) {
        field3216++;
        float var2 = class304.method2130() + class304.method2131();
        int var3 = class304.method2128();
        class106.field1895[3] = 1.0F;
        float var4 = (float) ((var3 & 0xFFC8AC) >> 16) / 255.0F;
        float var5 = (float) (var3 & 0xFF) / 255.0F;
        float var6 = 0.58823526F;
        float var7 = (float) ((var3 & 0xFF8F) >> 8) / 255.0F;
        class106.field1895[2] = var2 * var5 * ((float) class2.method15(255, arg0) / 255.0F) * var6;
        class106.field1895[0] = var2 * var6 * (float) (class2.method15(arg0, 16735901) >> 16) / 255.0F * var4;
        if (arg1 == -1818424304) {
            class106.field1895[1] = var6 * (float) class2.method15(arg0 >> 8, 255) / 255.0F * var7 * var2;
            return class106.field1895;
        } else {
            return (float[]) null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLs;III)V", line = 145)
    public static final void method1235(boolean arg0, class171 arg1, int arg2, int arg3, int arg4) {
        class172.method1164(51);
        if (class257.field4390) {
            class296.method2085(arg3, arg2, arg3 + arg1.field3002, arg2 - -arg1.field3054);
        } else {
            class211.method1414(arg3, arg2, arg3 + arg1.field3002, arg1.field3054 + arg2);
        }
        field3212++;
        if (class91.field1610 != 2 && class91.field1610 != 5 && class139.field2368 != null) {
            int var5 = 464 - (class152.field2606.field934 / 32);
            int var6 = class68.field1177 + class271.field4702 & 0x7FF;
            int var7 = class152.field2606.field912 / 32 + 48;
            if (class257.field4390) {
                ((class221) class139.field2368).method1496(arg3, arg2, arg1.field3002, arg1.field3054, var7, var5, var6, class239.field4169 + 256, (class221) arg1.method1146((byte) -91, false));
            } else {
                ((class41) class139.field2368).method318(arg3, arg2, arg1.field3002, arg1.field3054, var7, var5, var6, class239.field4169 + 256, arg1.field2952, arg1.field2972);
            }
            if (class2.field22 != null) {
                for (int var8 = 0; var8 < class2.field22.field3856; var8++) {
                    if (class2.field22.method1512(var8, -6916)) {
                        int var9 = (class2.field22.field3853[var8] - class229.field3955) * 4 + 2 - (class152.field2606.field912 / 32);
                        int var10 = class266.field4642[var6];
                        int var11 = class266.field4636[var6];
                        int var12 = (class2.field22.field3854[var8] - class311.field5271) * 4 + 2 - (class152.field2606.field934 / 32);
                        int var13 = var10 * 256 / (class239.field4169 + 256);
                        int var14 = var11 * 256 / (class239.field4169 + 256);
                        class35 var15 = class79.field1355;
                        int var16 = var12 * var14 - (var9 * var13) >> 16;
                        int var17 = var9 * var14 + var12 * var13 >> 16;
                        if (class2.field22.method1514(var8, 500) == 1) {
                            var15 = class44.field662;
                        }
                        if (class2.field22.method1514(var8, 500) == 2) {
                            var15 = class123.field2180;
                        }
                        int var18 = var15.method257(class2.field22.field3851[var8], 100);
                        int var19 = var17 - var18 / 2;
                        if ((-arg1.field3002) <= var19 && var19 <= arg1.field3002 && (-arg1.field3054) <= var16 && arg1.field3054 >= var16) {
                            int var20 = 16777215;
                            if (class2.field22.field3858[var8] != -1) {
                                var20 = class2.field22.field3858[var8];
                            }
                            if (class257.field4390) {
                                class296.method2091((class221) arg1.method1146((byte) -112, false));
                            } else {
                                class211.method1403(arg1.field2952, arg1.field2972);
                            }
                            var15.method267(class2.field22.field3851[var8], arg1.field3002 / 2 + arg3 + var19, arg2 - (-(arg1.field3054 / 2) - -var16), var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class257.field4390) {
                                class296.method2083();
                            } else {
                                class211.method1401();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class88.field1493; var21++) {
                int var22 = class228.field3948[var21] * 4 + 2 - (class152.field2606.field912 / 32);
                int var23 = class294.field5052[var21] * 4 + 2 - (class152.field2606.field934 / 32);
                class101 var24 = class123.method898(-935, class103.field1879[var21]);
                if (var24.field1797 != null) {
                    var24 = var24.method768(-50);
                    if (var24 == null || var24.field1848 == -1) {
                        continue;
                    }
                }
                class182.method1243(arg3, 102, arg1, arg2, var22, class210.field3619[var24.field1848], var23);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class12 var27 = class82.field1386[class272.field4704][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - (class152.field2606.field912 / 32);
                        int var29 = var26 * 4 - ((class152.field2606.field934 / 32) - 2);
                        class182.method1243(arg3, 119, arg1, arg2, var28, class282.field4848[0], var29);
                    }
                }
            }
            for (int var30 = 0; var30 < class226.field3895; var30++) {
                class107 var31 = class16.field214[class92.field1616[var30]];
                if (var31 != null && var31.method453((byte) -67)) {
                    class151 var32 = var31.field1906;
                    if (var32 != null && var32.field2545 != null) {
                        var32 = var32.method1035(-6941);
                    }
                    if (var32 != null && var32.field2553 && var32.field2542) {
                        int var33 = var31.field912 / 32 - class152.field2606.field912 / 32;
                        int var34 = var31.field934 / 32 - (class152.field2606.field934 / 32);
                        class182.method1243(arg3, 94, arg1, arg2, var33, class282.field4848[1], var34);
                    }
                }
            }
            for (int var35 = 0; var35 < class14.field177; var35++) {
                class231 var36 = class38.field527[class140.field2390[var35]];
                if (var36 != null && var36.method453((byte) -67)) {
                    int var37 = var36.field912 / 32 - (class152.field2606.field912 / 32);
                    int var38 = var36.field934 / 32 - (class152.field2606.field934 / 32);
                    long var39 = var36.field4007.method1769(16);
                    boolean var41 = false;
                    for (int var42 = 0; var42 < class312.field5292; var42++) {
                        if (class99.field1766[var42] == var39 && class291.field5009[var42] != 0) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class98.field1743; var44++) {
                        if (class11.field149[var44].field2642 == var39) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class152.field2606.field3968 != 0 && var36.field3968 != 0 && class152.field2606.field3968 == var36.field3968) {
                        var45 = true;
                    }
                    if (var41) {
                        class182.method1243(arg3, 95, arg1, arg2, var37, class282.field4848[3], var38);
                    } else if (var43) {
                        class182.method1243(arg3, 118, arg1, arg2, var37, class282.field4848[5], var38);
                    } else if (var45) {
                        class182.method1243(arg3, 107, arg1, arg2, var37, class282.field4848[4], var38);
                    } else {
                        class182.method1243(arg3, 114, arg1, arg2, var37, class282.field4848[2], var38);
                    }
                }
            }
            class149[] var46 = class76.field1320;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class149 var48 = var46[var47];
                if (var48 != null && var48.field2524 != 0 && (class202.field3498 % 20) < 10) {
                    if (var48.field2524 == 1 && var48.field2532 >= 0 && class16.field214.length > var48.field2532) {
                        class107 var49 = class16.field214[var48.field2532];
                        if (var49 != null) {
                            int var50 = var49.field912 / 32 - (class152.field2606.field912 / 32);
                            int var51 = var49.field934 / 32 - (class152.field2606.field934 / 32);
                            class214.method1460(var50, var51, arg1, arg3, (byte) 100, var48.field2535, arg2);
                        }
                    }
                    if (var48.field2524 == 2) {
                        int var52 = (var48.field2531 - class229.field3955) * 4 + 2 - (class152.field2606.field912 / 32);
                        int var53 = (var48.field2525 - class311.field5271) * 4 + 2 - (class152.field2606.field934 / 32);
                        class214.method1460(var52, var53, arg1, arg3, (byte) 11, var48.field2535, arg2);
                    }
                    if (var48.field2524 == 10 && var48.field2532 >= 0 && class38.field527.length > var48.field2532) {
                        class231 var54 = class38.field527[var48.field2532];
                        if (var54 != null) {
                            int var55 = var54.field912 / 32 - (class152.field2606.field912 / 32);
                            int var56 = var54.field934 / 32 - (class152.field2606.field934 / 32);
                            class214.method1460(var55, var56, arg1, arg3, (byte) 122, var48.field2535, arg2);
                        }
                    }
                }
            }
            if (class10.field118 != 0) {
                int var57 = class10.field118 * 4 + 2 - (class152.field2606.field912 / 32);
                int var58 = class6.field82 * 4 + 2 - class152.field2606.field934 / 32;
                class182.method1243(arg3, 113, arg1, arg2, var57, class56.field887, var58);
            }
            if (class257.field4390) {
                class296.method2096(arg1.field3002 / 2 + arg3 - 1, arg2 - -(arg1.field3054 / 2) - 1, 3, 3, 16777215);
            } else {
                class211.method1398(arg1.field3002 / 2 + arg3 - 1, arg1.field3054 / 2 + (arg2 - 1), 3, 3, 16777215);
            }
        } else if (class257.field4390) {
            class65 var59 = arg1.method1146((byte) -58, false);
            if (var59 != null) {
                var59.method327(arg3, arg2);
            }
        } else {
            class211.method1409(arg3, arg2, 0, arg1.field2952, arg1.field2972);
        }
        class74.field1292[arg4] = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZZIZI)V", line = 485)
    public static final void method1236(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        field3214++;
        if (arg0 < arg4) {
            int var7 = (arg0 + arg4) / 2;
            int var8 = arg0;
            class98 var9 = class144.field2426[var7];
            class144.field2426[var7] = class144.field2426[arg4];
            class144.field2426[arg4] = var9;
            for (int var10 = arg0; var10 < arg4; var10++) {
                if (class36.method270((byte) -9, class144.field2426[var10], arg5, var9, arg2, arg1, arg6) <= 0) {
                    class98 var11 = class144.field2426[var10];
                    class144.field2426[var10] = class144.field2426[var8];
                    class144.field2426[var8++] = var11;
                }
            }
            class144.field2426[arg4] = class144.field2426[var8];
            class144.field2426[var8] = var9;
            method1236(arg0, arg1, arg2, arg3, var8 - 1, arg5, arg6);
            method1236(var8 + 1, arg1, arg2, false, arg4, arg5, arg6);
        }
        if (arg3) {
            field3223 = (class258) null;
        }
    }
}
