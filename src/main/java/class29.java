import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class29 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    private int field542 = 0;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    private int field551 = -1;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Lb;")
    private class48 field549 = new class48();

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "Z")
    public boolean field564 = false;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    private int field545;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "[Lvi;")
    private class5[] field560;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "[[[I")
    private int[][][] field547;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Lsg;")
    public static class30 field544 = null;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "Lb;")
    public static class48 field553 = new class48();

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "[I")
    public static int[] field557 = new int[25];

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    public static int field566 = 0;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "F")
    public static float field562;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "Lgh;")
    public static class190 field556;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "[I")
    public static int[] field558;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "[Lsg;")
    public static class30[] field563;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public final void method239(int arg0) {
        for (int var2 = 0; var2 < this.field555; var2++) {
            this.field547[var2][0] = null;
            this.field547[var2][1] = null;
            this.field547[var2][2] = null;
            this.field547[var2] = null;
        }
        if (arg0 != -16195) {
            field566 = -75;
        }
        this.field547 = null;
        this.field560 = null;
        field546++;
        this.field549.method480(94);
        this.field549 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method240(byte arg0) {
        field558 = null;
        field557 = null;
        if (arg0 == 81) {
            field563 = null;
            field553 = null;
            field556 = null;
            field544 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)[[I")
    public final int[][] method241(int arg0, int arg1) {
        int var3 = -75 % ((-arg0 - 35) / 34);
        field552++;
        if (this.field555 == this.field545) {
            this.field564 = this.field560[arg1] == null;
            this.field560[arg1] = class141.field2734;
            return this.field547[arg1];
        } else if (this.field555 == 1) {
            this.field564 = this.field551 != arg1;
            this.field551 = arg1;
            return this.field547[0];
        } else {
            class5 var4 = this.field560[arg1];
            if (var4 == null) {
                this.field564 = true;
                if (this.field555 > this.field542) {
                    var4 = new class5(arg1, this.field542);
                    this.field542++;
                } else {
                    class5 var5 = (class5) this.field549.method472((byte) -43);
                    var4 = new class5(arg1, var5.field70);
                    this.field560[var5.field67] = null;
                    var5.method1681(false);
                }
                this.field560[arg1] = var4;
            } else {
                this.field564 = false;
            }
            this.field549.method475(var4, true);
            return this.field547[var4.field70];
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIII)V")
    public static final void method242(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class242.field4331 = class98.field1979 * arg2 / arg3;
        class32.field811 = -1;
        class41.field1014 = -1;
        class241.field4304 = class53.field1179 * arg1 / arg4;
        field565++;
        class154.method1151((byte) -122);
        int var5 = 30 / ((arg0 - 42) / 44);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V")
    public static final void method243(int arg0, int arg1) {
        class25.field486 = -1;
        class262.field4622 = 0;
        class215.field3939 = null;
        if (arg1 != 24583) {
            return;
        }
        field559++;
        class241.field4266 = -1;
        class205.field3675 = false;
        class149.field2845 = arg0;
        class269.field4739 = 1;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(II)V")
    public static final void method244(int arg0, int arg1) {
        field561++;
        class152 var2;
        if (class222.field3994 == null) {
            var2 = new class152(512, 512);
        } else {
            var2 = (class152) class222.field3994;
        }
        if (arg0 > -108) {
            method243(27, -19);
        }
        int[] var3 = var2.field2904;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var24 = (103 - var6) * 2048 + 24628;
            for (int var25 = 1; var25 < 103; var25++) {
                if ((class272.field4771[arg1][var25][var6] & 0x18) == 0) {
                    class270.method1850(var3, var24, 512, arg1, var25, var6);
                }
                if (arg1 < 3 && (class272.field4771[arg1 + 1][var25][var6] & 0x8) != 0) {
                    class270.method1850(var3, var24, 512, arg1 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        var2.method1144();
        int var7 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 228;
        int var8 = 238 - (10 - ((int) (Math.random() * 20.0D))) << 16;
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var23 = 1; var23 < 103; var23++) {
                if ((class272.field4771[arg1][var23][var9] & 0x18) == 0) {
                    class157.method1167(arg1, var8, -127, var7, var23, var9);
                }
                if (arg1 < 3 && (class272.field4771[arg1 + 1][var23][var9] & 0x8) != 0) {
                    class157.method1167(arg1 + 1, var8, -119, var7, var23, var9);
                }
            }
        }
        class245.field4374 = 0;
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var11 = 0; var11 < 104; var11++) {
                long var12 = class275.method1868(class159.field2998, var10, var11);
                if (var12 != 0L) {
                    class40 var14 = class195.method1415(-111, (int) (var12 >>> 32) & Integer.MAX_VALUE);
                    int var15 = var14.field1000;
                    if (var14.field997 != null) {
                        for (int var16 = 0; var16 < var14.field997.length; var16++) {
                            if (var14.field997[var16] != -1) {
                                class40 var17 = class195.method1415(124, var14.field997[var16]);
                                if (var17.field1000 >= 0) {
                                    var15 = var17.field1000;
                                    break;
                                }
                            }
                        }
                    }
                    if (var15 >= 0) {
                        int var18 = var10;
                        int var19 = var11;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var20 = class100.field2032[class159.field2998].field258;
                            for (int var21 = 0; var21 < 10; var21++) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (var22 == 0 && var18 > 0 && var10 - 3 < var18 && (var20[var18 - 1][var19] & 0x12C0108) == 0) {
                                    var18--;
                                }
                                if (var22 == 1 && var18 < 103 && (var10 + 3) > var18 && (var20[var18 + 1][var19] & 0x12C0180) == 0) {
                                    var18++;
                                }
                                if (var22 == 2 && var19 > 0 && var19 > (var11 - 3) && (var20[var18][var19 - 1] & 0x12C0102) == 0) {
                                    var19--;
                                }
                                if (var22 == 3 && var19 < 103 && (var11 + 3) > var19 && (var20[var18][var19 + 1] & 0x12C0120) == 0) {
                                    var19++;
                                }
                            }
                        }
                        class249.field4410[class245.field4374] = var14.field989;
                        class257.field4546[class245.field4374] = var18;
                        class61.field1310[class245.field4374] = var19;
                        class245.field4374++;
                    }
                }
            }
        }
        class222.field3994 = var2;
        class149.field2838.method1068(false);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ldl;IIII)V")
    public static final void method245(class31 arg0, int arg1, int arg2, int arg3, int arg4) {
        class67.method603((byte) -59);
        if (arg3 != -4274) {
            return;
        }
        class188.method1355(arg2, arg4, arg0.field728 + arg2, arg4 - -arg0.field670);
        field550++;
        if (class219.field3957 == 2 || class219.field3957 == 5 || class222.field3994 == null) {
            class188.method1362(arg2, arg4, 0, arg0.field697, arg0.field760);
        } else {
            int var5 = class147.field2811 + class110.field2202 & 0x7FF;
            int var6 = 464 - class247.field4394.field1336 / 32;
            int var7 = class247.field4394.field1360 / 32 + 48;
            ((class152) class222.field3994).method1146(arg2, arg4, arg0.field728, arg0.field670, var7, var6, var5, class50.field1139 + 256, arg0.field697, arg0.field760);
            if (class113.field2247 != null) {
                for (int var8 = 0; var8 < class113.field2247.field3467; var8++) {
                    if (class113.field2247.method1381(var8, (byte) 47)) {
                        int var9 = (class113.field2247.field3465[var8] - class22.field421) * 4 + 2 - (class247.field4394.field1360 / 32);
                        int var10 = (class113.field2247.field3459[var8] - class196.field3547) * 4 + 2 - (class247.field4394.field1336 / 32);
                        int var11 = class213.field3849[var5];
                        int var12 = var11 * 256 / (class50.field1139 + 256);
                        int var13 = class213.field3846[var5];
                        int var14 = var13 * 256 / (class50.field1139 + 256);
                        class206 var15 = class191.field3476;
                        int var16 = var10 * var14 - (var9 * var12) >> 16;
                        if (class113.field2247.method1380(var8, -72) == 1) {
                            var15 = class232.field4126;
                        }
                        int var17 = var10 * var12 + (var9 * var14) >> 16;
                        if (class113.field2247.method1380(var8, -115) == 2) {
                            var15 = class223.field4000;
                        }
                        int var18 = var15.method1455(class113.field2247.field3457[var8], 100);
                        int var19 = var17 - var18 / 2;
                        if (var19 >= (-arg0.field728) && var19 <= arg0.field728 && var16 >= (-arg0.field670) && arg0.field670 >= var16) {
                            int var20 = 16777215;
                            if (class113.field2247.field3462[var8] != -1) {
                                var20 = class113.field2247.field3462[var8];
                            }
                            class188.method1357(arg0.field697, arg0.field760);
                            var15.method1457(class113.field2247.field3457[var8], arg2 + var19 + (arg0.field728 / 2), arg0.field670 / 2 + arg4 + -var16, var18, 50, var20, 0, 256, 1, 0, 0);
                            class188.method1351();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class245.field4374; var21++) {
                int var56 = class257.field4546[var21] * 4 + 2 - (class247.field4394.field1360 / 32);
                int var57 = class61.field1310[var21] * 4 + 2 - (class247.field4394.field1336 / 32);
                class40 var58 = class195.method1415(-107, class249.field4410[var21]);
                if (var58.field997 != null) {
                    var58 = var58.method418((byte) 114);
                    if (var58 == null || var58.field1000 == -1) {
                        continue;
                    }
                }
                class115.method897(var57, arg2, class110.field2207[var58.field1000], var56, arg4, (byte) 36, arg0);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var52 = 0; var52 < 104; var52++) {
                    class48 var53 = class103.field2078[class159.field2998][var22][var52];
                    if (var53 != null) {
                        int var54 = var22 * 4 + 2 - class247.field4394.field1360 / 32;
                        int var55 = var52 * 4 + 2 - (class247.field4394.field1336 / 32);
                        class115.method897(var55, arg2, class14.field281[0], var54, arg4, (byte) 36, arg0);
                    }
                }
            }
            for (int var23 = 0; var23 < class221.field3985; var23++) {
                class275 var48 = class125.field2443[class4.field55[var23]];
                if (var48 != null && var48.method568((byte) -124)) {
                    class241 var49 = var48.field4805;
                    if (var49 != null && var49.field4295 != null) {
                        var49 = var49.method1700((byte) 59);
                    }
                    if (var49 != null && var49.field4311 && var49.field4291) {
                        int var50 = var48.field1360 / 32 - class247.field4394.field1360 / 32;
                        int var51 = var48.field1336 / 32 - (class247.field4394.field1336 / 32);
                        class115.method897(var51, arg2, class14.field281[1], var50, arg4, (byte) 36, arg0);
                    }
                }
            }
            for (int var24 = 0; var24 < class28.field528; var24++) {
                class120 var38 = class75.field1670[class183.field3378[var24]];
                if (var38 != null && var38.method568((byte) 109)) {
                    int var39 = var38.field1360 / 32 - (class247.field4394.field1360 / 32);
                    int var40 = var38.field1336 / 32 - (class247.field4394.field1336 / 32);
                    long var41 = var38.field2349.method297((byte) -112);
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class117.field2307; var44++) {
                        if (class103.field2083[var44] == var41 && class90.field1807[var44] != 0) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    for (int var46 = 0; var46 < class122.field2405; var46++) {
                        if (class244.field4366[var46].field4215 == var41) {
                            var45 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    if (class247.field4394.field2354 != 0 && var38.field2354 != 0 && class247.field4394.field2354 == var38.field2354) {
                        var47 = true;
                    }
                    if (var43) {
                        class115.method897(var40, arg2, class14.field281[3], var39, arg4, (byte) 36, arg0);
                    } else if (var45) {
                        class115.method897(var40, arg2, class14.field281[5], var39, arg4, (byte) 36, arg0);
                    } else if (var47) {
                        class115.method897(var40, arg2, class14.field281[4], var39, arg4, (byte) 36, arg0);
                    } else {
                        class115.method897(var40, arg2, class14.field281[2], var39, arg4, (byte) 36, arg0);
                    }
                }
            }
            class143[] var25 = class262.field4620;
            for (int var26 = 0; var26 < var25.length; var26++) {
                class143 var29 = var25[var26];
                if (var29 != null && var29.field2754 != 0 && (class133.field2617 % 20) < 10) {
                    if (var29.field2754 == 1 && var29.field2755 >= 0 && var29.field2755 < class125.field2443.length) {
                        class275 var30 = class125.field2443[var29.field2755];
                        if (var30 != null) {
                            int var31 = var30.field1360 / 32 - (class247.field4394.field1360 / 32);
                            int var32 = var30.field1336 / 32 - class247.field4394.field1336 / 32;
                            class257.method1780(var32, var31, arg4, arg2, arg0, (byte) -110, var29.field2758);
                        }
                    }
                    if (var29.field2754 == 2) {
                        int var33 = (var29.field2760 - class22.field421) * 4 + 2 - (class247.field4394.field1360 / 32);
                        int var34 = (var29.field2763 - class196.field3547) * 4 + 2 - (class247.field4394.field1336 / 32);
                        class257.method1780(var34, var33, arg4, arg2, arg0, (byte) -113, var29.field2758);
                    }
                    if (var29.field2754 == 10 && var29.field2755 >= 0 && var29.field2755 < class75.field1670.length) {
                        class120 var35 = class75.field1670[var29.field2755];
                        if (var35 != null) {
                            int var36 = var35.field1360 / 32 - (class247.field4394.field1360 / 32);
                            int var37 = var35.field1336 / 32 - class247.field4394.field1336 / 32;
                            class257.method1780(var37, var36, arg4, arg2, arg0, (byte) -117, var29.field2758);
                        }
                    }
                }
            }
            if (class210.field3771 != 0) {
                int var27 = class173.field3239 * 4 + 2 - (class247.field4394.field1336 / 32);
                int var28 = class210.field3771 * 4 + 2 - (class247.field4394.field1360 / 32);
                class115.method897(var27, arg2, class201.field3589, var28, arg4, (byte) 36, arg0);
            }
            class188.method1361(arg0.field728 / 2 + (arg2 - 1), arg4 - -(arg0.field670 / 2) + -1, 3, 3, 16777215);
        }
        class210.field3769[arg1] = true;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(II)Lff;")
    public static final class41 method246(int arg0, int arg1) {
        field543++;
        class41 var2 = (class41) class151.field2892.method174((long) arg0, (byte) -51);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class207.field3724.method1115(arg0, (byte) -125, 26);
        class41 var4 = new class41();
        if (arg1 >= -97) {
            field562 = -0.035160925F;
        }
        if (var3 != null) {
            var4.method429(0, new class8(var3));
        }
        class151.field2892.method169(var4, -69, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)[[[I")
    public final int[][][] method247(byte arg0) {
        field554++;
        if (this.field555 != this.field545) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field555; var2++) {
            this.field560[var2] = class141.field2734;
        }
        return arg0 == 19 ? this.field547 : null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field548++;
        int var8 = arg6;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg6 - arg0;
        int var12 = arg6 * arg6;
        int var13 = arg1 - arg0;
        int var14 = var13 * var13;
        int var15 = arg1 * arg1;
        int var16 = var11 * var11;
        int var17 = var15 << 1;
        int var18 = var12 << 1;
        int var19 = var16 << 1;
        int var20 = var14 << 1;
        int var21 = arg6 << 1;
        int var22 = (1 - var21) * var15 + var18;
        int var23 = var11 << 1;
        int var24 = (1 - var23) * var14 + var19;
        int var25 = var12 - ((var21 - 1) * var17);
        int var26 = var16 - ((var23 - 1) * var20);
        int var27 = var15 << 2;
        int var28 = var12 << 2;
        int var29 = var14 << 2;
        int var30 = var18 * 3;
        int var31 = var16 << 2;
        int var32 = (var21 - arg5) * var17;
        int var33 = var19 * 3;
        int var34 = var28;
        int var35 = (var23 - 3) * var20;
        int var36 = (arg6 - 1) * var27;
        if (class275.field4804 <= arg3 && arg3 <= class167.field3064) {
            int[] var37 = class121.field2390[arg3];
            int var38 = class68.method609(class48.field1096, 22050, class252.field4458, arg4 - arg1);
            int var39 = class68.method609(class48.field1096, 22050, class252.field4458, arg1 + arg4);
            int var40 = class68.method609(class48.field1096, arg5 ^ 0x5621, class252.field4458, arg4 - var13);
            int var41 = class68.method609(class48.field1096, 22050, class252.field4458, arg4 + var13);
            class194.method1405(true, var37, var40, var38, arg2);
            class194.method1405(true, var37, var41, var40, arg7);
            class194.method1405(true, var37, var39, var41, arg2);
        }
        int var42 = (var11 - 1) * var29;
        int var43 = var31;
        while (var8 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var22 += var30;
                    var30 += var28;
                    var25 += var34;
                    var34 += var28;
                    var9++;
                }
            }
            if (var25 < 0) {
                var9++;
                var25 += var34;
                var34 += var28;
                var22 += var30;
                var30 += var28;
            }
            var22 += -var36;
            var25 += -var32;
            boolean var44 = var11 >= var8;
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var26 += var43;
                        var24 += var33;
                        var33 += var31;
                        var10++;
                        var43 += var31;
                    }
                }
                if (var26 < 0) {
                    var26 += var43;
                    var24 += var33;
                    var10++;
                    var43 += var31;
                    var33 += var31;
                }
                var26 += -var35;
                var24 += -var42;
                var35 -= var29;
                var42 -= var29;
            }
            var32 -= var27;
            var36 -= var27;
            var8--;
            int var45 = arg3 - var8;
            int var46 = arg3 + var8;
            if (class275.field4804 <= var46 && var45 <= class167.field3064) {
                int var47 = class68.method609(class48.field1096, arg5 + 22047, class252.field4458, arg4 + var9);
                int var48 = class68.method609(class48.field1096, 22050, class252.field4458, arg4 - var9);
                if (var44) {
                    int var49 = class68.method609(class48.field1096, 22050, class252.field4458, arg4 + var10);
                    int var50 = class68.method609(class48.field1096, 22050, class252.field4458, arg4 - var10);
                    if (var45 >= class275.field4804) {
                        int[] var51 = class121.field2390[var45];
                        class194.method1405(true, var51, var50, var48, arg2);
                        class194.method1405(true, var51, var49, var50, arg7);
                        class194.method1405(true, var51, var47, var49, arg2);
                    }
                    if (class167.field3064 >= var46) {
                        int[] var52 = class121.field2390[var46];
                        class194.method1405(true, var52, var50, var48, arg2);
                        class194.method1405(true, var52, var49, var50, arg7);
                        class194.method1405(true, var52, var47, var49, arg2);
                    }
                } else {
                    if (class275.field4804 <= var45) {
                        class194.method1405(true, class121.field2390[var45], var47, var48, arg2);
                    }
                    if (var46 <= class167.field3064) {
                        class194.method1405(true, class121.field2390[var46], var47, var48, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(III)V")
    public class29(int arg0, int arg1, int arg2) {
        this.field555 = arg0;
        this.field545 = arg1;
        this.field560 = new class5[this.field545];
        this.field547 = new int[this.field555][3][arg2];
    }
}
