import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public abstract class class222 extends class285 {

    @OriginalMember(owner = "client!kk", name = "Q", descriptor = "Z")
    public volatile boolean field3742 = true;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "[I")
    public static int[] field3738 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "Lve;")
    public static class255 field3732 = class87.method607(76, ")4a=");

    @OriginalMember(owner = "client!kk", name = "R", descriptor = "Lve;")
    public static class255 field3743 = class87.method607(127, ")3)3)3");

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!kk", name = "S", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "Z")
    public boolean field3739;

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "Z")
    public boolean field3740;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "[[B")
    public static byte[][] field3737;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)I", line = 5)
    public static final int method1554(int arg0, int arg1) {
        int var2 = (arg1 >>> 1 & 0xD5555555) + (arg1 & 0x55555555);
        field3730++;
        if (arg0 < 23) {
            return -24;
        }
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCF) >>> 2);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V", line = 21)
    public static final void method1555(int arg0) {
        field3735++;
        int var1 = 0;
        if (arg0 != 4) {
            field3732 = (class255) null;
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class221.method1553(true, class118.field1984, var2, arg0 ^ 0xFFFFFF88, var3, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILtl;I)V", line = 56)
    public static final void method1556(int arg0, int arg1, class197 arg2, int arg3) {
        field3736++;
        if (arg2.field3369 == 1) {
            class284.field4885++;
            class186.method1298((short) 37, class49.field728, 0, (byte) 67, 0L, arg2.field3374, arg2.field3256);
        }
        if (arg3 >= -71) {
            field3732 = (class255) null;
        }
        if (arg2.field3369 == 2 && !class42.field653) {
            class255 var4 = class314.method2168(-1, arg2);
            if (var4 != null) {
                class186.method1298((short) 45, class3.method14(new class255[] { class216.field3675, arg2.field3301 }, (byte) -115), -1, (byte) 67, 0L, var4, arg2.field3256);
                class162.field2716++;
            }
        }
        if (arg2.field3369 == 3) {
            class230.field3811++;
            class186.method1298((short) 51, class49.field728, 0, (byte) 67, 0L, class313.field5306, arg2.field3256);
        }
        if (arg2.field3369 == 4) {
            class284.field4893++;
            class186.method1298((short) 49, class49.field728, 0, (byte) 67, 0L, arg2.field3374, arg2.field3256);
        }
        if (arg2.field3369 == 5) {
            class186.method1298((short) 18, class49.field728, 0, (byte) 67, 0L, arg2.field3374, arg2.field3256);
            class82.field1339++;
        }
        if (arg2.field3369 == 6 && class68.field1009 == null) {
            class19.field315++;
            class186.method1298((short) 12, class49.field728, -1, (byte) 67, 0L, arg2.field3374, arg2.field3256);
        }
        if (arg2.field3281 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field3303; var6++) {
                for (int var7 = 0; var7 < arg2.field3343; var7++) {
                    int var8 = (arg2.field3362 + 32) * var7;
                    int var9 = (arg2.field3267 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg2.field3388[var5];
                        var9 += arg2.field3244[var5];
                    }
                    if (arg1 >= var8 && var9 <= arg0 && arg1 < var8 + 32 && arg0 < (var9 + 32)) {
                        class102.field1713 = arg2;
                        class18.field295 = var5;
                        if (arg2.field3352[var5] > 0) {
                            class192 var10 = class132.method990((byte) -119, arg2.field3352[var5] - 1);
                            if (class72.field1182 == 1 && class72.method522(-98, client.method1673(arg2))) {
                                if (class77.field1262 != arg2.field3256 || class131.field2170 != var5) {
                                    class19.field313++;
                                    class186.method1298((short) 58, class3.method14(new class255[] { class123.field2044, class10.field139, var10.field3112 }, (byte) -63), var5, (byte) 67, (long) var10.field3094, class33.field527, arg2.field3256);
                                }
                            } else if (!class42.field653 || !class72.method522(-85, client.method1673(arg2))) {
                                class223.field3750++;
                                class255[] var11 = var10.field3090;
                                if (class212.field3618) {
                                    var11 = class248.method1713(false, var11);
                                }
                                if (class72.method522(-113, client.method1673(arg2))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class107.field1798++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 28;
                                            } else {
                                                var13 = 20;
                                            }
                                            class186.method1298(var13, class3.method14(new class255[] { class293.field5038, var10.field3112 }, (byte) -53), var5, (byte) 67, (long) var10.field3094, var11[var12], arg2.field3256);
                                        } else if (var12 == 4) {
                                            class186.method1298((short) 20, class3.method14(new class255[] { class293.field5038, var10.field3112 }, (byte) -69), var5, (byte) 67, (long) var10.field3094, class60.field937, arg2.field3256);
                                            class255.field4325++;
                                        }
                                    }
                                }
                                if (class150.method1109(client.method1673(arg2), (byte) 89)) {
                                    class186.method1298((short) 29, class3.method14(new class255[] { class293.field5038, var10.field3112 }, (byte) -83), var5, (byte) 67, (long) var10.field3094, class33.field527, arg2.field3256);
                                    class14.field194++;
                                }
                                if (class72.method522(86, client.method1673(arg2)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            byte var15 = 0;
                                            class102.field1715++;
                                            if (var14 == 0) {
                                                var15 = 9;
                                            }
                                            if (var14 == 1) {
                                                var15 = 22;
                                            }
                                            if (var14 == 2) {
                                                var15 = 39;
                                            }
                                            class186.method1298(var15, class3.method14(new class255[] { class293.field5038, var10.field3112 }, (byte) -117), var5, (byte) 67, (long) var10.field3094, var11[var14], arg2.field3256);
                                        }
                                    }
                                }
                                class255[] var16 = arg2.field3367;
                                if (class212.field3618) {
                                    var16 = class248.method1713(false, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class213.field3629++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 13;
                                            }
                                            if (var17 == 1) {
                                                var18 = 36;
                                            }
                                            if (var17 == 2) {
                                                var18 = 32;
                                            }
                                            if (var17 == 3) {
                                                var18 = 5;
                                            }
                                            if (var17 == 4) {
                                                var18 = 44;
                                            }
                                            class186.method1298(var18, class3.method14(new class255[] { class293.field5038, var10.field3112 }, (byte) -120), var5, (byte) 67, (long) var10.field3094, var16[var17], arg2.field3256);
                                        }
                                    }
                                }
                                class186.method1298((short) 1003, class3.method14(new class255[] { class293.field5038, var10.field3112 }, (byte) -80), var5, (byte) 67, (long) var10.field3094, class196.field3226, arg2.field3256);
                            } else if ((class41.field645 & 0x10) == 16) {
                                class186.method1298((short) 43, class3.method14(new class255[] { class254.field4285, class10.field139, var10.field3112 }, (byte) -87), var5, (byte) 67, (long) var10.field3094, class82.field1342, arg2.field3256);
                                class205.field3525++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field3365) {
            return;
        }
        if (!class42.field653) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class255 var20 = class260.method1812(arg2, 92, var19);
                if (var20 != null) {
                    class186.method1298((short) 1002, arg2.field3335, arg2.field3273, (byte) 67, (long) (var19 + 1), var20, arg2.field3256);
                    class22.field343++;
                }
            }
            class255 var21 = class314.method2168(-1, arg2);
            if (var21 != null) {
                class162.field2716++;
                class186.method1298((short) 45, arg2.field3335, arg2.field3273, (byte) 67, 0L, var21, arg2.field3256);
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class255 var23 = class260.method1812(arg2, 110, var22);
                if (var23 != null) {
                    class186.method1298((short) 19, arg2.field3335, arg2.field3273, (byte) 67, (long) (var22 + 1), var23, arg2.field3256);
                    class22.field343++;
                }
            }
            if (class167.method1215((byte) -128, client.method1673(arg2))) {
                class19.field315++;
                class186.method1298((short) 12, class49.field728, arg2.field3273, (byte) 67, 0L, class43.field673, arg2.field3256);
            }
        } else if (class50.method293(client.method1673(arg2), (byte) 120) && (class41.field645 & 0x20) == 32) {
            class186.method1298((short) 57, class3.method14(new class255[] { class254.field4285, class254.field4282, arg2.field3335 }, (byte) -67), arg2.field3273, (byte) 67, 0L, class82.field1342, arg2.field3256);
            class199.field3423++;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)Z", line = 370)
    public static final boolean method1557(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class276.field4736; var3++) {
            class253 var4 = class132.field2198[var3];
            if (var4.field4269 == 1) {
                int var5 = var4.field4272 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field4255 * var5 >> 8) + var4.field4275;
                    int var7 = (var4.field4273 * var5 >> 8) + var4.field4259;
                    int var8 = (var4.field4264 * var5 >> 8) + var4.field4251;
                    int var9 = (var4.field4270 * var5 >> 8) + var4.field4268;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field4269 == 2) {
                int var10 = arg0 - var4.field4272;
                if (var10 > 0) {
                    int var11 = (var4.field4255 * var10 >> 8) + var4.field4275;
                    int var12 = (var4.field4273 * var10 >> 8) + var4.field4259;
                    int var13 = (var4.field4264 * var10 >> 8) + var4.field4251;
                    int var14 = (var4.field4270 * var10 >> 8) + var4.field4268;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field4269 == 3) {
                int var15 = var4.field4275 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field4257 * var15 >> 8) + var4.field4272;
                    int var17 = (var4.field4256 * var15 >> 8) + var4.field4253;
                    int var18 = (var4.field4264 * var15 >> 8) + var4.field4251;
                    int var19 = (var4.field4270 * var15 >> 8) + var4.field4268;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field4269 == 4) {
                int var20 = arg2 - var4.field4275;
                if (var20 > 0) {
                    int var21 = (var4.field4257 * var20 >> 8) + var4.field4272;
                    int var22 = (var4.field4256 * var20 >> 8) + var4.field4253;
                    int var23 = (var4.field4264 * var20 >> 8) + var4.field4251;
                    int var24 = (var4.field4270 * var20 >> 8) + var4.field4268;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field4269 == 5) {
                int var25 = arg1 - var4.field4251;
                if (var25 > 0) {
                    int var26 = (var4.field4257 * var25 >> 8) + var4.field4272;
                    int var27 = (var4.field4256 * var25 >> 8) + var4.field4253;
                    int var28 = (var4.field4255 * var25 >> 8) + var4.field4275;
                    int var29 = (var4.field4273 * var25 >> 8) + var4.field4259;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "()V", line = 506)
    public static final void method1558() {
        class276.field4736 = 0;
        label194: for (int var0 = 0; var0 < class137.field2303; var0++) {
            class253 var1 = class298.field5099[var0];
            if (class230.field3804 != null) {
                for (int var2 = 0; var2 < class230.field3804.length; var2++) {
                    if (class230.field3804[var2] != -1000000 && (var1.field4251 <= class230.field3804[var2] || var1.field4268 <= class230.field3804[var2]) && (var1.field4272 <= class192.field3084[var2] || var1.field4253 <= class192.field3084[var2]) && (var1.field4272 >= class96.field1641[var2] || var1.field4253 >= class96.field1641[var2]) && (var1.field4275 <= class238.field3952[var2] || var1.field4259 <= class238.field3952[var2]) && (var1.field4275 >= class220.field3716[var2] || var1.field4259 >= class220.field3716[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field4265 == 1) {
                int var3 = var1.field4271 + class76.field1249 - class77.field1264;
                if (var3 >= 0 && var3 <= class76.field1249 + class76.field1249) {
                    int var4 = var1.field4252 + class76.field1249 - class81.field1305;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field4261 + class76.field1249 - class81.field1305;
                    if (var5 > class76.field1249 + class76.field1249) {
                        var5 = class76.field1249 + class76.field1249;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class218.field3698[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class210.field3580 - var1.field4272;
                        if (var7 > 32) {
                            var1.field4269 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field4269 = 2;
                            var7 = -var7;
                        }
                        var1.field4255 = (var1.field4275 - class59.field912 << 8) / var7;
                        var1.field4273 = (var1.field4259 - class59.field912 << 8) / var7;
                        var1.field4264 = (var1.field4251 - class274.field4718 << 8) / var7;
                        var1.field4270 = (var1.field4268 - class274.field4718 << 8) / var7;
                        class132.field2198[class276.field4736++] = var1;
                    }
                }
            } else if (var1.field4265 == 2) {
                int var8 = var1.field4252 + class76.field1249 - class81.field1305;
                if (var8 >= 0 && var8 <= class76.field1249 + class76.field1249) {
                    int var9 = var1.field4271 + class76.field1249 - class77.field1264;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field4276 + class76.field1249 - class77.field1264;
                    if (var10 > class76.field1249 + class76.field1249) {
                        var10 = class76.field1249 + class76.field1249;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class218.field3698[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class59.field912 - var1.field4275;
                        if (var12 > 32) {
                            var1.field4269 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field4269 = 4;
                            var12 = -var12;
                        }
                        var1.field4257 = (var1.field4272 - class210.field3580 << 8) / var12;
                        var1.field4256 = (var1.field4253 - class210.field3580 << 8) / var12;
                        var1.field4264 = (var1.field4251 - class274.field4718 << 8) / var12;
                        var1.field4270 = (var1.field4268 - class274.field4718 << 8) / var12;
                        class132.field2198[class276.field4736++] = var1;
                    }
                }
            } else if (var1.field4265 == 4) {
                int var13 = var1.field4251 - class274.field4718;
                if (var13 > 128) {
                    int var14 = var1.field4252 + class76.field1249 - class81.field1305;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field4261 + class76.field1249 - class81.field1305;
                    if (var15 > class76.field1249 + class76.field1249) {
                        var15 = class76.field1249 + class76.field1249;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field4271 + class76.field1249 - class77.field1264;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field4276 + class76.field1249 - class77.field1264;
                        if (var17 > class76.field1249 + class76.field1249) {
                            var17 = class76.field1249 + class76.field1249;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class218.field3698[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field4269 = 5;
                            var1.field4257 = (var1.field4272 - class210.field3580 << 8) / var13;
                            var1.field4256 = (var1.field4253 - class210.field3580 << 8) / var13;
                            var1.field4255 = (var1.field4275 - class59.field912 << 8) / var13;
                            var1.field4273 = (var1.field4259 - class59.field912 << 8) / var13;
                            class132.field2198[class276.field4736++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)V", line = 732)
    public static void method1559(int arg0) {
        field3737 = (byte[][]) null;
        if (arg0 >= 118) {
            field3732 = null;
            field3743 = null;
            field3738 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lpb;Z)Lwd;", line = 748)
    public static final class73 method1560(class70 arg0, boolean arg1) {
        if (arg1) {
            field3738 = (int[]) null;
        }
        field3744++;
        return new class73(arg0.method454((byte) 84), arg0.method454((byte) 84), arg0.method454((byte) 84), arg0.method454((byte) 84), arg0.method465(true), arg0.method465(true), arg0.method481(0));
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)I", line = 767)
    public static final int method1561(int arg0, int arg1) {
        field3741++;
        if (arg1 != 127) {
            method1556(42, -67, (class197) null, 65);
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(II)I", line = 791)
    public static final int method1562(int arg0, int arg1) {
        int var2 = 116 / ((52 - arg0) / 40);
        field3734++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(B)I")
    public abstract int method80(byte arg0);

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(B)[B")
    public abstract byte[] method82(byte arg0);
}
