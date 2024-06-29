import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class62 extends class314 {

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public int field1276;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public int field1282;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public int field1277;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "Lud;")
    public static class279 field1273 = class130.method1024("Module texte charg-B", 255);

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Lud;")
    public static class279 field1279 = class130.method1024("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 255);

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Lvd;")
    public static class133 field1274;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "[I")
    public static int[] field1270;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "[[[B")
    public static byte[][][] field1280;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 10)
    public static void method544(int arg0) {
        field1274 = null;
        if (arg0 != -4566) {
            method547(72, 32, (byte) 31, (class279) null, -67, -82, 17L);
        }
        field1279 = null;
        field1280 = (byte[][][]) null;
        field1270 = null;
        field1273 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)Z", line = 28)
    public final boolean method545(int arg0, int arg1, int arg2) {
        field1281++;
        if (arg0 == 1) {
            return arg2 >= this.field1282 && arg2 <= this.field1272 && this.field1277 <= arg1 && this.field1276 >= arg1;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lvh;Z)V", line = 43)
    public static final void method546(class53 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field1275++;
        if (class287.field5126 != null) {
            try {
                class287.field5126.method1874(true, 0L);
                class287.field5126.method1883(arg0.field1168, arg0.field1142, 24, true);
            } catch (Exception var3) {
            }
        }
        arg0.field1142 += 24;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIBLud;IIJ)V", line = 63)
    public static final void method547(int arg0, int arg1, byte arg2, class279 arg3, int arg4, int arg5, long arg6) {
        field1283++;
        class53 var8 = new class53(128);
        var8.method464(10, false);
        var8.method505((int) (Math.random() * 99999.0D), (byte) 7);
        var8.method505(529, (byte) 7);
        var8.method490(arg6, 14886);
        var8.method444((byte) 46, (int) (Math.random() * 9.9999999E7D));
        var8.method481(arg3, (byte) 109);
        if (arg2 < 32) {
            return;
        }
        var8.method444((byte) 46, (int) (Math.random() * 9.9999999E7D));
        var8.method505(class52.field1077, (byte) 7);
        var8.method464(arg4, false);
        var8.method464(arg0, false);
        var8.method444((byte) 46, (int) (Math.random() * 9.9999999E7D));
        var8.method505(arg5, (byte) 7);
        var8.method505(arg1, (byte) 7);
        var8.method444((byte) 46, (int) (Math.random() * 9.9999999E7D));
        var8.method458(class17.field529, -118, class162.field2924);
        class314.field5534.field1142 = 0;
        class314.field5534.method464(81, false);
        class314.field5534.method464(var8.field1142, false);
        class314.field5534.method471(0, var8.field1142, (byte) -81, var8.field1168);
        class182.field3332 = 0;
        class73.field1435 = -3;
        class180.field3280 = 0;
        class139.field2516 = 1;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lpl;Z)V", line = 112)
    public static final void method548(class191 arg0, boolean arg1) {
        class7.field130.method2246(true, arg0);
        while (true) {
            class191 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class191[][] var7;
            class191 var78;
            do {
                class191 var77;
                do {
                    class191 var76;
                    do {
                        class191 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class191) class7.field130.method2247(49);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3448);
                                            var3 = var2.field3453;
                                            var4 = var2.field3441;
                                            var5 = var2.field3458;
                                            var6 = var2.field3449;
                                            var7 = class24.field619[var5];
                                            float var8 = 0.0F;
                                            if (class97.field1824) {
                                                if (class165.field2970 == class14.field432) {
                                                    int var9 = class222.field3931[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class8.field337 != var10) {
                                                        class8.field337 = var10;
                                                        class223.method1637(var10, true);
                                                        class219.method1606(class294.method2090((byte) -96));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class191.field3435 != var11) {
                                                        class191.field3435 = var11;
                                                        class11.method84(var11, (byte) -99);
                                                    }
                                                    int var12 = class255.field4550[0][var3 + 1][var4] + class255.field4550[0][var3][var4] + class255.field4550[0][var3][var4 + 1] + class255.field4550[0][var3 + 1][var4 + 1] >> 2;
                                                    class162.method1279(0, -var12, 3);
                                                    var8 = 201.5F;
                                                    class97.method838(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class97.method838(var8);
                                                }
                                            }
                                            if (!var2.field3461) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class191 var13 = class24.field619[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field3448) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class223.field3956 && var3 > class195.field3529) {
                                                    class191 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field3448 && (var14.field3461 || (var2.field3443 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class223.field3956 && var3 < class183.field3363 - 1) {
                                                    class191 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field3448 && (var15.field3461 || (var2.field3443 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class45.field951 && var4 > class272.field4848) {
                                                    class191 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field3448 && (var16.field3461 || (var2.field3443 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class45.field951 && var4 < class302.field5369 - 1) {
                                                    class191 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field3448 && (var17.field3461 || (var2.field3443 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3461 = false;
                                            if (var2.field3464 != null) {
                                                class191 var18 = var2.field3464;
                                                if (class97.field1824) {
                                                    class97.method838(201.5F - (float) (var18.field3449 + 1) * 50.0F);
                                                }
                                                if (var18.field3457 == null) {
                                                    if (var18.field3447 != null) {
                                                        if (class42.method361(0, var3, var4)) {
                                                            class214.method1573(var18.field3447, class29.field684, class204.field3628, class199.field3555, class108.field2006, var3, var4, true);
                                                        } else {
                                                            class214.method1573(var18.field3447, class29.field684, class204.field3628, class199.field3555, class108.field2006, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class42.method361(0, var3, var4)) {
                                                    class154.method1215(var18.field3457, 0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var3, var4, true);
                                                } else {
                                                    class154.method1215(var18.field3457, 0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var3, var4, false);
                                                }
                                                class17 var19 = var18.field3439;
                                                if (var19 != null) {
                                                    if (class97.field1824) {
                                                        if ((var19.field533 & var2.field3444) == 0) {
                                                            class30.method271(class306.field5430, class318.field5581, class233.field4083, var5, var3, var4);
                                                        } else {
                                                            class30.method285(var19.field533, class306.field5430, class318.field5581, class233.field4083, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field522.method186(0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var19.field528 - class306.field5430, var19.field527 - class318.field5581, var19.field531 - class233.field4083, var19.field530, var5, (class208) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field3451; var20++) {
                                                    class18 var21 = var18.field3455[var20];
                                                    if (var21 != null) {
                                                        if (class97.field1824) {
                                                            class30.method271(class306.field5430, class318.field5581, class233.field4083, var5, var3, var4);
                                                        }
                                                        var21.field563.method186(var21.field559, class29.field684, class204.field3628, class199.field3555, class108.field2006, var21.field550 - class306.field5430, var21.field561 - class318.field5581, var21.field544 - class233.field4083, var21.field546, var5, (class208) null);
                                                    }
                                                }
                                                if (class97.field1824) {
                                                    class97.method838(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field3457 == null) {
                                                if (var2.field3447 != null) {
                                                    if (class42.method361(var6, var3, var4)) {
                                                        class214.method1573(var2.field3447, class29.field684, class204.field3628, class199.field3555, class108.field2006, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class214.method1573(var2.field3447, class29.field684, class204.field3628, class199.field3555, class108.field2006, var3, var4, false);
                                                    }
                                                }
                                            } else if (class42.method361(var6, var3, var4)) {
                                                class154.method1215(var2.field3457, var6, class29.field684, class204.field3628, class199.field3555, class108.field2006, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field3457.field5386 != 12345678 || class322.field5625 && var5 <= class150.field2748) {
                                                    class154.method1215(var2.field3457, var6, class29.field684, class204.field3628, class199.field3555, class108.field2006, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class243 var23 = var2.field3440;
                                                if (var23 != null && (var23.field4325 & 0x80000000L) != 0L) {
                                                    if (class97.field1824 && var23.field4319) {
                                                        class97.method838(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class97.field1824) {
                                                        class30.method271(class306.field5430, class318.field5581, class233.field4083, var5, var3, var4);
                                                    }
                                                    var23.field4316.method186(0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var23.field4326 - class306.field5430, var23.field4313 - class318.field5581, var23.field4318 - class233.field4083, var23.field4325, var5, (class208) null);
                                                    if (class97.field1824 && var23.field4319) {
                                                        class97.method838(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class17 var26 = var2.field3439;
                                            class235 var27 = var2.field3454;
                                            if (var26 != null || var27 != null) {
                                                if (class223.field3956 == var3) {
                                                    var24++;
                                                } else if (class223.field3956 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class45.field951 == var4) {
                                                    var24 += 3;
                                                } else if (class45.field951 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class81.field1563[var24];
                                                var2.field3444 = class59.field1247[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field533 & class317.field5577[var24]) == 0) {
                                                    var2.field3450 = 0;
                                                } else if (var26.field533 == 16) {
                                                    var2.field3450 = 3;
                                                    var2.field3460 = class94.field1768[var24];
                                                    var2.field3452 = 3 - var2.field3460;
                                                } else if (var26.field533 == 32) {
                                                    var2.field3450 = 6;
                                                    var2.field3460 = class194.field3485[var24];
                                                    var2.field3452 = 6 - var2.field3460;
                                                } else if (var26.field533 == 64) {
                                                    var2.field3450 = 12;
                                                    var2.field3460 = class144.field2619[var24];
                                                    var2.field3452 = 12 - var2.field3460;
                                                } else {
                                                    var2.field3450 = 9;
                                                    var2.field3460 = class111.field2039[var24];
                                                    var2.field3452 = 9 - var2.field3460;
                                                }
                                                if ((var26.field533 & var25) != 0 && !class150.method1196(var6, var3, var4, var26.field533)) {
                                                    if (class97.field1824) {
                                                        class30.method271(class306.field5430, class318.field5581, class233.field4083, var5, var3, var4);
                                                    }
                                                    var26.field522.method186(0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var26.field528 - class306.field5430, var26.field527 - class318.field5581, var26.field531 - class233.field4083, var26.field530, var5, (class208) null);
                                                }
                                                if ((var26.field521 & var25) != 0 && !class150.method1196(var6, var3, var4, var26.field521)) {
                                                    if (class97.field1824) {
                                                        class30.method271(class306.field5430, class318.field5581, class233.field4083, var5, var3, var4);
                                                    }
                                                    var26.field525.method186(0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var26.field528 - class306.field5430, var26.field527 - class318.field5581, var26.field531 - class233.field4083, var26.field530, var5, (class208) null);
                                                }
                                            }
                                            if (var27 != null && !class166.method1303(var6, var3, var4, var27.field4091.method184())) {
                                                if (class97.field1824) {
                                                    class97.method838(var8 - 0.5F);
                                                }
                                                if ((var27.field4102 & var25) != 0) {
                                                    if (class97.field1824) {
                                                        class30.method271(class306.field5430, class318.field5581, class233.field4083, var5, var3, var4);
                                                    }
                                                    var27.field4091.method186(0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var27.field4100 + var27.field4106 - class306.field5430, var27.field4092 - class318.field5581, var27.field4104 + var27.field4101 - class233.field4083, var27.field4095, var5, (class208) null);
                                                } else if (var27.field4102 == 256) {
                                                    int var28 = var27.field4100 - class306.field5430;
                                                    int var29 = var27.field4092 - class318.field5581;
                                                    int var30 = var27.field4104 - class233.field4083;
                                                    int var31 = var27.field4093;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class97.field1824) {
                                                            class30.method271(class306.field5430, class318.field5581, class233.field4083, var5, var3, var4);
                                                        }
                                                        var27.field4091.method186(0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var27.field4106 + var28, var29, var27.field4101 + var30, var27.field4095, var5, (class208) null);
                                                    } else if (var27.field4099 != null) {
                                                        if (class97.field1824) {
                                                            class30.method271(class306.field5430, class318.field5581, class233.field4083, var5, var3, var4);
                                                        }
                                                        var27.field4099.method186(0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var28, var29, var30, var27.field4095, var5, (class208) null);
                                                    }
                                                }
                                                if (class97.field1824) {
                                                    class97.method838(var8);
                                                }
                                            }
                                            if (var22) {
                                                class243 var34 = var2.field3440;
                                                if (var34 != null && (var34.field4325 & 0x80000000L) == 0L) {
                                                    if (class97.field1824 && var34.field4319) {
                                                        class97.method838(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class97.field1824) {
                                                        class30.method271(class306.field5430, class318.field5581, class233.field4083, var5, var3, var4);
                                                    }
                                                    var34.field4316.method186(0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var34.field4326 - class306.field5430, var34.field4313 - class318.field5581, var34.field4318 - class233.field4083, var34.field4325, var5, (class208) null);
                                                    if (class97.field1824 && var34.field4319) {
                                                        class97.method838(var8);
                                                    }
                                                }
                                                class153 var35 = var2.field3442;
                                                if (var35 != null && var35.field2774 == 0) {
                                                    if (class97.field1824) {
                                                        class30.method271(class306.field5430, class318.field5581, class233.field4083, var5, var3, var4);
                                                    }
                                                    if (var35.field2778 != null) {
                                                        var35.field2778.method186(0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var35.field2775 - class306.field5430, var35.field2777 - class318.field5581, var35.field2770 - class233.field4083, var35.field2780, var5, (class208) null);
                                                    }
                                                    if (var35.field2779 != null) {
                                                        var35.field2779.method186(0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var35.field2775 - class306.field5430, var35.field2777 - class318.field5581, var35.field2770 - class233.field4083, var35.field2780, var5, (class208) null);
                                                    }
                                                    if (var35.field2782 != null) {
                                                        var35.field2782.method186(0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var35.field2775 - class306.field5430, var35.field2777 - class318.field5581, var35.field2770 - class233.field4083, var35.field2780, var5, (class208) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field3443;
                                            if (var36 != 0) {
                                                if (var3 < class223.field3956 && (var36 & 0x4) != 0) {
                                                    class191 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field3448) {
                                                        class7.field130.method2246(true, var37);
                                                    }
                                                }
                                                if (var4 < class45.field951 && (var36 & 0x2) != 0) {
                                                    class191 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field3448) {
                                                        class7.field130.method2246(true, var38);
                                                    }
                                                }
                                                if (var3 > class223.field3956 && (var36 & 0x1) != 0) {
                                                    class191 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field3448) {
                                                        class7.field130.method2246(true, var39);
                                                    }
                                                }
                                                if (var4 > class45.field951 && (var36 & 0x8) != 0) {
                                                    class191 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field3448) {
                                                        class7.field130.method2246(true, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3450 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field3451; var42++) {
                                                if (class182.field3328 != var2.field3455[var42].field558 && (var2.field3459[var42] & var2.field3450) == var2.field3460) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class17 var43 = var2.field3439;
                                                if (!class150.method1196(var6, var3, var4, var43.field533)) {
                                                    if (class97.field1824) {
                                                        label882: {
                                                            if ((var43.field530 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field528 - class306.field5430;
                                                                int var45 = var43.field531 - class233.field4083;
                                                                int var46 = (int) (var43.field530 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class54.field1193 - 1) {
                                                                        class30.method271(class306.field5430, class318.field5581, class233.field4083, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class207.field3668 - 1 && var4 < class54.field1193 - 1) {
                                                                        class30.method271(class306.field5430, class318.field5581, class233.field4083, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class207.field3668 - 1 && var4 > 0) {
                                                                        class30.method271(class306.field5430, class318.field5581, class233.field4083, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class30.method271(class306.field5430, class318.field5581, class233.field4083, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class30.method271(class306.field5430, class318.field5581, class233.field4083, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field522.method186(0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var43.field528 - class306.field5430, var43.field527 - class318.field5581, var43.field531 - class233.field4083, var43.field530, var5, (class208) null);
                                                }
                                                var2.field3450 = 0;
                                            }
                                        }
                                        if (!var2.field3446) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field3451;
                                            var2.field3446 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class18 var50 = var2.field3455[var49];
                                                if (class182.field3328 != var50.field558) {
                                                    for (int var51 = var50.field560; var51 <= var50.field562; var51++) {
                                                        for (int var52 = var50.field564; var52 <= var50.field556; var52++) {
                                                            class191 var53 = var7[var51][var52];
                                                            if (var53.field3461) {
                                                                var2.field3446 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field3450 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field560) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field562) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field564) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field556) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field3450) == var2.field3452) {
                                                                    var2.field3446 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class51.field1066[var48++] = var50;
                                                    int var55 = class223.field3956 - var50.field560;
                                                    int var56 = var50.field562 - class223.field3956;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class45.field951 - var50.field564;
                                                    int var58 = var50.field556 - class45.field951;
                                                    if (var58 > var57) {
                                                        var50.field555 = var55 + var58;
                                                    } else {
                                                        var50.field555 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class18 var62 = class51.field1066[var61];
                                                    if (class182.field3328 != var62.field558) {
                                                        if (var62.field555 > var59) {
                                                            var59 = var62.field555;
                                                            var60 = var61;
                                                        } else if (var62.field555 == var59) {
                                                            int var63 = var62.field550 - class306.field5430;
                                                            int var64 = var62.field544 - class233.field4083;
                                                            int var65 = class51.field1066[var60].field550 - class306.field5430;
                                                            int var66 = class51.field1066[var60].field544 - class233.field4083;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class18 var67 = class51.field1066[var60];
                                                var67.field558 = class182.field3328;
                                                if (!class237.method1708(var6, var67.field560, var67.field562, var67.field564, var67.field556, var67.field563.method184())) {
                                                    if (class97.field1824) {
                                                        if ((var67.field546 & 0xFC000L) == 147456L) {
                                                            class30.method271(class306.field5430, class318.field5581, class233.field4083, var5, var3, var4);
                                                            int var68 = var67.field550 - class306.field5430;
                                                            int var69 = var67.field544 - class233.field4083;
                                                            int var70 = (int) (var67.field546 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class30.method277(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class30.method277(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class30.method277(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class30.method277(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class30.method280(class306.field5430, class318.field5581, class233.field4083, var5, var67.field560, var67.field564, var67.field562, var67.field556);
                                                        }
                                                    }
                                                    var67.field563.method186(var67.field559, class29.field684, class204.field3628, class199.field3555, class108.field2006, var67.field550 - class306.field5430, var67.field561 - class318.field5581, var67.field544 - class233.field4083, var67.field546, var5, (class208) null);
                                                }
                                                for (int var71 = var67.field560; var71 <= var67.field562; var71++) {
                                                    for (int var72 = var67.field564; var72 <= var67.field556; var72++) {
                                                        class191 var73 = var7[var71][var72];
                                                        if (var73.field3450 != 0) {
                                                            class7.field130.method2246(true, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field3448) {
                                                            class7.field130.method2246(true, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3446) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field3446 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3448);
                            } while (var2.field3450 != 0);
                            if (var3 > class223.field3956 || var3 <= class195.field3529) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field3448);
                        if (var3 < class223.field3956 || var3 >= class183.field3363 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field3448);
                    if (var4 > class45.field951 || var4 <= class272.field4848) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field3448);
                if (var4 < class45.field951 || var4 >= class302.field5369 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field3448);
            var2.field3448 = false;
            class182.field3334--;
            class153 var79 = var2.field3442;
            if (var79 != null && var79.field2774 != 0) {
                if (class97.field1824) {
                    class30.method271(class306.field5430, class318.field5581, class233.field4083, var5, var3, var4);
                }
                if (var79.field2778 != null) {
                    var79.field2778.method186(0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var79.field2775 - class306.field5430, var79.field2777 - class318.field5581 - var79.field2774, var79.field2770 - class233.field4083, var79.field2780, var5, (class208) null);
                }
                if (var79.field2779 != null) {
                    var79.field2779.method186(0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var79.field2775 - class306.field5430, var79.field2777 - class318.field5581 - var79.field2774, var79.field2770 - class233.field4083, var79.field2780, var5, (class208) null);
                }
                if (var79.field2782 != null) {
                    var79.field2782.method186(0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var79.field2775 - class306.field5430, var79.field2777 - class318.field5581 - var79.field2774, var79.field2770 - class233.field4083, var79.field2780, var5, (class208) null);
                }
            }
            if (var2.field3444 != 0) {
                class235 var80 = var2.field3454;
                if (var80 != null && !class166.method1303(var6, var3, var4, var80.field4091.method184())) {
                    if ((var80.field4102 & var2.field3444) != 0) {
                        if (class97.field1824) {
                            class30.method271(class306.field5430, class318.field5581, class233.field4083, var5, var3, var4);
                        }
                        var80.field4091.method186(0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var80.field4100 + var80.field4106 - class306.field5430, var80.field4092 - class318.field5581, var80.field4104 + var80.field4101 - class233.field4083, var80.field4095, var5, (class208) null);
                    } else if (var80.field4102 == 256) {
                        int var81 = var80.field4100 - class306.field5430;
                        int var82 = var80.field4092 - class318.field5581;
                        int var83 = var80.field4104 - class233.field4083;
                        int var84 = var80.field4093;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class97.field1824) {
                                class30.method271(class306.field5430, class318.field5581, class233.field4083, var5, var3, var4);
                            }
                            var80.field4091.method186(0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var80.field4106 + var81, var82, var80.field4101 + var83, var80.field4095, var5, (class208) null);
                        } else if (var80.field4099 != null) {
                            if (class97.field1824) {
                                class30.method271(class306.field5430, class318.field5581, class233.field4083, var5, var3, var4);
                            }
                            var80.field4099.method186(0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var81, var82, var83, var80.field4095, var5, (class208) null);
                        }
                    }
                }
                class17 var87 = var2.field3439;
                if (var87 != null) {
                    if ((var87.field521 & var2.field3444) != 0 && !class150.method1196(var6, var3, var4, var87.field521)) {
                        if (class97.field1824) {
                            class30.method285(var87.field521, class306.field5430, class318.field5581, class233.field4083, var6, var3, var4);
                        }
                        var87.field525.method186(0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var87.field528 - class306.field5430, var87.field527 - class318.field5581, var87.field531 - class233.field4083, var87.field530, var5, (class208) null);
                    }
                    if ((var87.field533 & var2.field3444) != 0 && !class150.method1196(var6, var3, var4, var87.field533)) {
                        if (class97.field1824) {
                            class30.method285(var87.field533, class306.field5430, class318.field5581, class233.field4083, var6, var3, var4);
                        }
                        var87.field522.method186(0, class29.field684, class204.field3628, class199.field3555, class108.field2006, var87.field528 - class306.field5430, var87.field527 - class318.field5581, var87.field531 - class233.field4083, var87.field530, var5, (class208) null);
                    }
                }
            }
            if (var5 < class69.field1363 - 1) {
                class191 var88 = class24.field619[var5 + 1][var3][var4];
                if (var88 != null && var88.field3448) {
                    class7.field130.method2246(true, var88);
                }
            }
            if (var3 < class223.field3956) {
                class191 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field3448) {
                    class7.field130.method2246(true, var89);
                }
            }
            if (var4 < class45.field951) {
                class191 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field3448) {
                    class7.field130.method2246(true, var90);
                }
            }
            if (var3 > class223.field3956) {
                class191 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field3448) {
                    class7.field130.method2246(true, var91);
                }
            }
            if (var4 > class45.field951) {
                class191 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field3448) {
                    class7.field130.method2246(true, var92);
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(IIII)V", line = 1108)
    public class62(int arg0, int arg1, int arg2, int arg3) {
        this.field1276 = arg3;
        this.field1282 = arg0;
        this.field1272 = arg2;
        this.field1277 = arg1;
    }
}
