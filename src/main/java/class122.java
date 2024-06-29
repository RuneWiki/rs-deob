import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class122 {

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lr;")
    public static class118 field2977 = new class118(500);

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "[I")
    public static int[] field2980 = new int[5];

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "Loc;")
    public static class99 field2983 = class48.method402((byte) -104, "null");

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Z")
    public static boolean field2982 = false;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Loc;")
    private static class99 field2978 = class48.method402((byte) -104, "glow1:");

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Loc;")
    public static class99 field2979 = field2978;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "[I")
    public static int[] field2985 = new int[128];

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Loc;")
    public static class99 field2986 = class48.method402((byte) -104, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "Loc;")
    public static class99 field2988 = class48.method402((byte) -104, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "Loc;")
    public static class99 field2984 = field2978;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "J")
    public static long field2987;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Lga;")
    public static class43 field2981;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2968;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILpc;I)Ldc;")
    public static final class24 method1012(int arg0, class105 arg1, int arg2) {
        field2973++;
        if (class55.method458(arg1, arg0, (byte) 108)) {
            if (arg2 != 32767) {
                method1012(-33, null, -28);
            }
            return class79.method687(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIBII)V")
    public static final void method1013(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2974++;
        int var6 = class68.field1757.method85(arg1, arg2, arg0);
        if (var6 != 0) {
            int var7 = class68.field1757.method50(arg1, arg2, arg0, var6);
            int var8 = var7 & 0x1F;
            int var9 = var7 >> 6 & 0x3;
            int[] var10 = class16.field429.field1686;
            int var11 = arg5;
            int var12 = (52736 - arg0 * 512) * 4 + arg2 * 4 + 24624;
            int var13 = var6 >> 14 & 0x7FFF;
            if (var6 > 0) {
                var11 = arg4;
            }
            class16 var14 = class83.method717(6, var13);
            if (var14.field394 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var9 == 0) {
                        var10[var12] = var11;
                        var10[var12 + 512] = var11;
                        var10[var12 + 1024] = var11;
                        var10[var12 + 1536] = var11;
                    } else if (var9 == 1) {
                        var10[var12] = var11;
                        var10[var12 + 1] = var11;
                        var10[var12 + 2] = var11;
                        var10[var12 + 3] = var11;
                    } else if (var9 == 2) {
                        var10[var12 + 3] = var11;
                        var10[var12 + 3 + 512] = var11;
                        var10[var12 + 1027] = var11;
                        var10[var12 + 1539] = var11;
                    } else if (var9 == 3) {
                        var10[var12 + 1536] = var11;
                        var10[var12 + 1536 + 1] = var11;
                        var10[var12 + 2 + 1536] = var11;
                        var10[var12 + 1536 + 3] = var11;
                    }
                }
                if (var8 == 3) {
                    if (var9 == 0) {
                        var10[var12] = var11;
                    } else if (var9 == 1) {
                        var10[var12 + 3] = var11;
                    } else if (var9 == 2) {
                        var10[var12 + 3 + 1536] = var11;
                    } else if (var9 == 3) {
                        var10[var12 + 1536] = var11;
                    }
                }
                if (var8 == 2) {
                    if (var9 == 3) {
                        var10[var12] = var11;
                        var10[var12 + 512] = var11;
                        var10[var12 + 1024] = var11;
                        var10[var12 + 1536] = var11;
                    } else if (var9 == 0) {
                        var10[var12] = var11;
                        var10[var12 + 1] = var11;
                        var10[var12 + 2] = var11;
                        var10[var12 + 3] = var11;
                    } else if (var9 == 1) {
                        var10[var12 + 3] = var11;
                        var10[var12 + 512 + 3] = var11;
                        var10[var12 + 3 + 1024] = var11;
                        var10[var12 + 3 + 1536] = var11;
                    } else if (var9 == 2) {
                        var10[var12 + 1536] = var11;
                        var10[var12 + 1536 + 1] = var11;
                        var10[var12 + 1536 + 2] = var11;
                        var10[var12 + 1536 + 3] = var11;
                    }
                }
            } else {
                class24 var15 = class57.field1487[var14.field394];
                if (var15 != null) {
                    int var16 = (var14.field376 * 4 - var15.field563) / 2;
                    int var17 = (var14.field425 * 4 - var15.field569) / 2;
                    var15.method216(arg2 * 4 + var17 + 48, 48 - (-((-arg0 + 104 - var14.field376) * 4) - var16));
                }
            }
        }
        int var18 = -68 / ((arg3 - 83) / 41);
        int var19 = class68.field1757.method39(arg1, arg2, arg0);
        if (var19 != 0) {
            int var20 = var19 >> 14 & 0x7FFF;
            int var21 = class68.field1757.method50(arg1, arg2, arg0, var19);
            int var22 = var21 >> 6 & 0x3;
            class16 var23 = class83.method717(6, var20);
            int var24 = var21 & 0x1F;
            if (var23.field394 != -1) {
                class24 var28 = class57.field1487[var23.field394];
                if (var28 != null) {
                    int var29 = (var23.field425 * 4 - var28.field569) / 2;
                    int var30 = (var23.field376 * 4 - var28.field563) / 2;
                    var28.method216(arg2 * 4 + var29 + 48, 48 - (-((104 - var23.field376 + -arg0) * 4) + -var30));
                }
            } else if (var24 == 9) {
                int var25 = 15658734;
                if (var19 > 0) {
                    var25 = 15597568;
                }
                int var26 = arg2 * 4 + (103 - arg0) * 2048 + 24624;
                int[] var27 = class16.field429.field1686;
                if (var22 == 0 || var22 == 2) {
                    var27[var26 + 1536] = var25;
                    var27[var26 + 1025] = var25;
                    var27[var26 + 2 + 512] = var25;
                    var27[var26 + 3] = var25;
                } else {
                    var27[var26] = var25;
                    var27[var26 + 512 + 1] = var25;
                    var27[var26 + 1024 + 2] = var25;
                    var27[var26 + 1536 + 3] = var25;
                }
            }
        }
        int var31 = class68.field1757.method76(arg1, arg2, arg0);
        if (var31 == 0) {
            return;
        }
        int var32 = var31 >> 14 & 0x7FFF;
        class16 var33 = class83.method717(6, var32);
        if (var33.field394 == -1) {
            return;
        }
        class24 var34 = class57.field1487[var33.field394];
        if (var34 != null) {
            int var35 = (var33.field425 * 4 - var34.field569) / 2;
            int var36 = (var33.field376 * 4 - var34.field563) / 2;
            var34.method216(arg2 * 4 + var35 + 48, (104 - arg0 - var33.field376) * 4 + (48 - -var36));
            return;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B")
    public static final byte[] method1014(Object arg0, int arg1, boolean arg2) {
        field2969++;
        if (arg1 != 0) {
            method1014(null, -3, false);
        }
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg2 ? class39.method325((byte) -72, var3) : var3;
        } else if (arg0 instanceof class11) {
            class11 var4 = (class11) arg0;
            return var4.method122((byte) -85);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static final void method1015(byte arg0) {
        field2976++;
        int var1 = class48.field1162.method974(class135.field3369);
        int var2 = -60 % ((34 - arg0) / 49);
        for (int var3 = 0; var3 < class144.field3601; var3++) {
            int var13 = class48.field1162.method970(class145.field3619[var3]);
            if (var1 < var13) {
                var1 = var13;
            }
        }
        int var4 = class144.field3601 * 15 + 21;
        var1 += 8;
        if (class119.field2923 != -1) {
            class21.field511 = class144.field3601 * 15 + 22;
            class55.field1432 = true;
            class99.field2365 = 0;
            class111.field2766 = var1;
            int var5 = class4.field75;
            int var6 = class23.field540 - var1 / 2;
            if (var4 + var5 > 503) {
                var5 = 503 - var4;
            }
            if (var1 + var6 > 765) {
                var6 = 765 - var1;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            class53.field1261 = var5;
            class132.field3227 = var6;
        } else if (class23.field540 > 4 && class4.field75 > 4 && class23.field540 < 516 && class4.field75 < 338) {
            class99.field2365 = 0;
            class111.field2766 = var1;
            class55.field1432 = true;
            class21.field511 = class144.field3601 * 15 + 22;
            int var7 = class4.field75 - 4;
            int var8 = class23.field540 - var1 / 2 - 4;
            if (var1 + var8 > 512) {
                var8 = 512 - var1;
            }
            if (var7 + var4 > 334) {
                var7 = 334 - var4;
            }
            if (var8 < 0) {
                var8 = 0;
            }
            class132.field3227 = var8;
            if (var7 < 0) {
                var7 = 0;
            }
            class53.field1261 = var7;
        } else if (class23.field540 > 553 && class4.field75 > 205 && class23.field540 < 743 && class4.field75 < 466) {
            class55.field1432 = true;
            int var9 = class23.field540 - var1 / 2 - 553;
            class111.field2766 = var1;
            class21.field511 = class144.field3601 * 15 + 22;
            if (var9 < 0) {
                var9 = 0;
            } else if (var1 + var9 > 190) {
                var9 = 190 - var1;
            }
            class99.field2365 = 1;
            int var10 = class4.field75 - 205;
            class132.field3227 = var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 261) {
                var10 = 261 - var4;
            }
            class53.field1261 = var10;
        } else if (class23.field540 > 17 && class4.field75 > 357 && class23.field540 < 496 && class4.field75 < 453) {
            class99.field2365 = 2;
            class55.field1432 = true;
            class21.field511 = class144.field3601 * 15 + 22;
            class111.field2766 = var1;
            int var11 = class4.field75 - 357;
            if (var11 < 0) {
                var11 = 0;
            } else if (var4 + var11 > 96) {
                var11 = 96 - var4;
            }
            class53.field1261 = var11;
            int var12 = class23.field540 - var1 / 2 - 17;
            if (var12 < 0) {
                var12 = 0;
            } else if (var1 + var12 > 479) {
                var12 = 479 - var1;
            }
            class132.field3227 = var12;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static final void method1016(int arg0) {
        field2967++;
        if (arg0 < 110) {
            field2988 = null;
        }
        class6.field146 = true;
        class27.field684 = true;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static final void method1017(int arg0) {
        field2975++;
        if (!class70.field1792) {
            return;
        }
        class5.field121 = null;
        class145.field3617 = null;
        class77.field1918 = null;
        class17.field453 = null;
        class118.field2909 = null;
        class102.field2484 = null;
        class114.field2850 = null;
        class20.field484 = null;
        class39.field974 = null;
        class95.field2314 = null;
        class9.field236 = null;
        class104.field2534 = null;
        class80.field1987 = null;
        class59.field1591 = null;
        class128.field3138 = null;
        class27.field676 = null;
        class126.field3055 = null;
        class111.field2757 = null;
        class67.field1739 = null;
        class105.field2607 = null;
        class70.field1792 = false;
        class91.field2220 = null;
        class32.field761 = null;
        class60.field1607 = null;
        class36.field926 = null;
        class4.field80 = null;
        if (arg0 != 4) {
            field2984 = null;
        }
        class87.field2170 = null;
        class81.field2019 = null;
        class110.field2738 = null;
        class108.field2654 = null;
        class2.field33 = null;
        class36.field924 = null;
        class61.field1647 = null;
        class61.field1623 = null;
        class59.field1578 = null;
        class57.field1493 = null;
        class111.field2787 = null;
        class114.field2845 = null;
        class130.field3200 = null;
        class128.field3139 = null;
        class32.field773 = null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
    public static void method1018(byte arg0) {
        field2983 = null;
        field2986 = null;
        field2980 = null;
        field2977 = null;
        field2984 = null;
        field2988 = null;
        field2985 = null;
        if (arg0 < 22) {
            field2983 = null;
        }
        field2979 = null;
        field2968 = null;
        field2981 = null;
        field2978 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method1019(KeyEvent arg0, int arg1) {
        field2971++;
        int var2 = arg0.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        int var3 = -5 % ((89 - arg1) / 33);
        return var2;
    }
}
