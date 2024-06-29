import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class139 {

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "[I")
    public static int[] field2479 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field2477 = 0;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Lbd;")
    public static class162 field2482 = class17.method142(0, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lbd;")
    public static class162 field2485 = class17.method142(0, "Ablegen");

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Lbd;")
    public static class162 field2486 = class17.method142(0, "blaugr-Un:");

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Lbd;")
    public static class162 field2487 = class17.method142(0, "Mem:");

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "Lmf;")
    public static class154 field2483 = new class154(0, 0);

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field2488 = 0;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Lpj;")
    public static class86 field2484;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBI)I", line = 9)
    public static final int method1081(int arg0, byte arg1, int arg2) {
        field2476++;
        if (arg1 < 125) {
            return -80;
        } else {
            int var3 = class239.method1686(arg2 - 1, 7229, arg0 - 1) + class239.method1686(arg2 + 1, 7229, arg0 - 1) + class239.method1686(arg2 + -1, 7229, arg0 + 1) + class239.method1686(arg2 + 1, 7229, arg0 + 1);
            int var4 = class239.method1686(arg2 - 1, 7229, arg0) + class239.method1686(arg2 + 1, 7229, arg0) + (class239.method1686(arg2, 7229, arg0 + -1) - -class239.method1686(arg2, 7229, arg0 + 1));
            int var5 = class239.method1686(arg2, 7229, arg0);
            return var5 / 4 + var3 / 16 + var4 / 8;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V", line = 31)
    public static void method1082(byte arg0) {
        field2487 = null;
        field2482 = null;
        field2486 = null;
        field2484 = null;
        if (arg0 < 107) {
            method1086();
        }
        field2479 = null;
        field2485 = null;
        field2483 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILb;IIIIIIZ)V", line = 59)
    public static final void method1083(int arg0, class94 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        if (arg2 >= 0 && arg2 < 104 && arg0 >= 0 && arg0 < 104) {
            if (!arg8) {
                class213.field3580[arg6][arg2][arg0] = 0;
            }
            while (true) {
                int var9 = arg1.method756(arg4 ^ 0xC968629E);
                if (var9 == 0) {
                    if (arg8) {
                        class206.field3473[0][arg2][arg0] = class73.field1166[0][arg2][arg0];
                    } else if (arg6 == 0) {
                        class206.field3473[0][arg2][arg0] = -class80.method616(arg7 + arg2 + 932731, arg0 + 556238 + arg3, (byte) -97) * 8;
                    } else {
                        class206.field3473[arg6][arg2][arg0] = class206.field3473[arg6 - 1][arg2][arg0] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg1.method756(arg4 ^ 0xC968629E);
                    if (arg8) {
                        class206.field3473[0][arg2][arg0] = var10 * 8 + class73.field1166[0][arg2][arg0];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg6 == 0) {
                            class206.field3473[0][arg2][arg0] = -var10 * 8;
                        } else {
                            class206.field3473[arg6][arg2][arg0] = class206.field3473[arg6 - 1][arg2][arg0] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class311.field5211[arg6][arg2][arg0] = arg1.method719((byte) -42);
                    class274.field4559[arg6][arg2][arg0] = (byte) ((var9 - 2) / 4);
                    class135.field2418[arg6][arg2][arg0] = (byte) class92.method695(3, var9 + arg5 - 2);
                } else if (var9 > 81) {
                    class302.field5075[arg6][arg2][arg0] = (byte) (var9 - 81);
                } else if (!arg8) {
                    class213.field3580[arg6][arg2][arg0] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg1.method756(915905888);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg1.method756(915905888);
                    break;
                }
                if (var11 <= 49) {
                    arg1.method756(915905888);
                }
            }
        }
        field2480++;
        if (arg4 != -2) {
            method1087(false);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Leg;", line = 165)
    public static final class142 method1084(int arg0, int arg1) {
        field2475++;
        class142 var2 = (class142) class133.field2377.method1536((long) arg1, -105);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class158.field2786.method1128(class62.method420((byte) 100, arg1), 0, class154.method1202(arg1, false));
        class142 var4 = new class142();
        if (arg0 > -48) {
            field2479 = (int[]) null;
        }
        if (var3 != null) {
            var4.method1111((byte) -125, new class94(var3));
        }
        var4.method1105(-118);
        class133.field2377.method1532((long) arg1, -60, var4);
        return var4;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIB)V", line = 192)
    public static final void method1085(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 > -95) {
            field2482 = (class162) null;
        }
        int var6 = arg4 - arg3;
        field2481++;
        int var7 = arg2 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class67.method478(arg1, arg3, arg0, 29436, arg4);
            }
        } else if (var6 == 0) {
            class268.method1837(arg2, arg1, arg0, true, arg3);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg1;
                arg1 = arg3;
                arg3 = var9;
                int var10 = arg2;
                arg2 = arg4;
                arg4 = var10;
            }
            if (arg1 > arg2) {
                int var11 = arg1;
                arg1 = arg2;
                int var12 = arg3;
                arg2 = var11;
                arg3 = arg4;
                arg4 = var12;
            }
            int var13 = arg3;
            int var14 = arg4 - arg3;
            int var15 = arg2 - arg1;
            int var16 = -(var15 >> 1);
            if (var14 < 0) {
                var14 = -var14;
            }
            int var17 = arg4 > arg3 ? 1 : -1;
            if (var8) {
                for (int var19 = arg1; var19 <= arg2; var19++) {
                    var16 += var14;
                    class184.field3180[var19][var13] = arg0;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var15;
                    }
                }
            } else {
                for (int var18 = arg1; var18 <= arg2; var18++) {
                    class184.field3180[var13][var18] = arg0;
                    var16 += var14;
                    if (var16 > 0) {
                        var16 -= var15;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()V", line = 309)
    public static final void method1086() {
        class204.field3457 = 0;
        label194: for (int var0 = 0; var0 < class127.field2314; var0++) {
            class22 var1 = class129.field2335[var0];
            if (class70.field1124 != null) {
                for (int var2 = 0; var2 < class70.field1124.length; var2++) {
                    if (class70.field1124[var2] != -1000000 && (var1.field338 <= class70.field1124[var2] || var1.field353 <= class70.field1124[var2]) && (var1.field345 <= class314.field5293[var2] || var1.field355 <= class314.field5293[var2]) && (var1.field345 >= class228.field3792[var2] || var1.field355 >= class228.field3792[var2]) && (var1.field350 <= class255.field4225[var2] || var1.field340 <= class255.field4225[var2]) && (var1.field350 >= client.field1902[var2] || var1.field340 >= client.field1902[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field336 == 1) {
                int var3 = var1.field346 + class138.field2456 - class96.field1757;
                if (var3 >= 0 && var3 <= class138.field2456 + class138.field2456) {
                    int var4 = var1.field356 + class138.field2456 - class29.field496;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field352 + class138.field2456 - class29.field496;
                    if (var5 > class138.field2456 + class138.field2456) {
                        var5 = class138.field2456 + class138.field2456;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class89.field1582[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class201.field3418 - var1.field345;
                        if (var7 > 32) {
                            var1.field335 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field335 = 2;
                            var7 = -var7;
                        }
                        var1.field334 = (var1.field350 - class156.field2748 << 8) / var7;
                        var1.field341 = (var1.field340 - class156.field2748 << 8) / var7;
                        var1.field342 = (var1.field338 - class31.field523 << 8) / var7;
                        var1.field343 = (var1.field353 - class31.field523 << 8) / var7;
                        class3.field23[class204.field3457++] = var1;
                    }
                }
            } else if (var1.field336 == 2) {
                int var8 = var1.field356 + class138.field2456 - class29.field496;
                if (var8 >= 0 && var8 <= class138.field2456 + class138.field2456) {
                    int var9 = var1.field346 + class138.field2456 - class96.field1757;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field347 + class138.field2456 - class96.field1757;
                    if (var10 > class138.field2456 + class138.field2456) {
                        var10 = class138.field2456 + class138.field2456;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class89.field1582[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class156.field2748 - var1.field350;
                        if (var12 > 32) {
                            var1.field335 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field335 = 4;
                            var12 = -var12;
                        }
                        var1.field354 = (var1.field345 - class201.field3418 << 8) / var12;
                        var1.field349 = (var1.field355 - class201.field3418 << 8) / var12;
                        var1.field342 = (var1.field338 - class31.field523 << 8) / var12;
                        var1.field343 = (var1.field353 - class31.field523 << 8) / var12;
                        class3.field23[class204.field3457++] = var1;
                    }
                }
            } else if (var1.field336 == 4) {
                int var13 = var1.field338 - class31.field523;
                if (var13 > 128) {
                    int var14 = var1.field356 + class138.field2456 - class29.field496;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field352 + class138.field2456 - class29.field496;
                    if (var15 > class138.field2456 + class138.field2456) {
                        var15 = class138.field2456 + class138.field2456;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field346 + class138.field2456 - class96.field1757;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field347 + class138.field2456 - class96.field1757;
                        if (var17 > class138.field2456 + class138.field2456) {
                            var17 = class138.field2456 + class138.field2456;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class89.field1582[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field335 = 5;
                            var1.field354 = (var1.field345 - class201.field3418 << 8) / var13;
                            var1.field349 = (var1.field355 - class201.field3418 << 8) / var13;
                            var1.field334 = (var1.field350 - class156.field2748 << 8) / var13;
                            var1.field341 = (var1.field340 - class156.field2748 << 8) / var13;
                            class3.field23[class204.field3457++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V", line = 531)
    public static final void method1087(boolean arg0) {
        if (arg0) {
            class288.field4856 = class86.field1528;
            class206.field3473 = class31.field517;
            class123.field2219 = class315.field5316;
        } else {
            class288.field4856 = class57.field896;
            class206.field3473 = class73.field1166;
            class123.field2219 = class274.field4545;
        }
        class53.field850 = class288.field4856.length;
    }
}
