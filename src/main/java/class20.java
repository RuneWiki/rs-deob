import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class20 {

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "Leh;")
    private static class47 field383 = class195.method1282((byte) -4, " has logged out)3");

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field385 = 0;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Leh;")
    public static class47 field384 = field383;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "Lhd;")
    public static class68 field382 = new class68(new byte[5000]);

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lgf;B)V")
    public static final void method204(class61 arg0, byte arg1) {
        if (class190.field3683 == arg0.field1223) {
            class158.field3077[arg0.field1182] = true;
        }
        field386++;
        if (arg1 != -5) {
            method208(-39);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "()V")
    public static final void method205() {
        int var0 = class119.field2412[class161.field3128];
        class142[] var1 = class119.field2414[class161.field3128];
        class115.field2349 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            class142 var3 = var1[var2];
            if (var3.field2798 == 1) {
                int var4 = var3.field2793 + class200.field3897 - class166.field3221;
                if (var4 >= 0 && var4 <= class200.field3897 + class200.field3897) {
                    int var5 = var3.field2787 + class200.field3897 - class55.field1056;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = var3.field2779 + class200.field3897 - class55.field1056;
                    if (var6 > class200.field3897 + class200.field3897) {
                        var6 = class200.field3897 + class200.field3897;
                    }
                    boolean var7 = false;
                    while (var5 <= var6) {
                        if (class19.field373[var4][var5++]) {
                            var7 = true;
                            break;
                        }
                    }
                    if (var7) {
                        int var8 = class40.field790 - var3.field2783;
                        if (var8 > 32) {
                            var3.field2791 = 1;
                        } else {
                            if (var8 >= -32) {
                                continue;
                            }
                            var3.field2791 = 2;
                            var8 = -var8;
                        }
                        var3.field2799 = (var3.field2786 - class87.field1866 << 8) / var8;
                        var3.field2784 = (var3.field2797 - class87.field1866 << 8) / var8;
                        var3.field2804 = (var3.field2802 - class144.field2828 << 8) / var8;
                        var3.field2789 = (var3.field2803 - class144.field2828 << 8) / var8;
                        class149.field2921[class115.field2349++] = var3;
                    }
                }
            } else if (var3.field2798 == 2) {
                int var9 = var3.field2787 + class200.field3897 - class55.field1056;
                if (var9 >= 0 && var9 <= class200.field3897 + class200.field3897) {
                    int var10 = var3.field2793 + class200.field3897 - class166.field3221;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    int var11 = var3.field2794 + class200.field3897 - class166.field3221;
                    if (var11 > class200.field3897 + class200.field3897) {
                        var11 = class200.field3897 + class200.field3897;
                    }
                    boolean var12 = false;
                    while (var10 <= var11) {
                        if (class19.field373[var10++][var9]) {
                            var12 = true;
                            break;
                        }
                    }
                    if (var12) {
                        int var13 = class87.field1866 - var3.field2786;
                        if (var13 > 32) {
                            var3.field2791 = 3;
                        } else {
                            if (var13 >= -32) {
                                continue;
                            }
                            var3.field2791 = 4;
                            var13 = -var13;
                        }
                        var3.field2785 = (var3.field2783 - class40.field790 << 8) / var13;
                        var3.field2796 = (var3.field2788 - class40.field790 << 8) / var13;
                        var3.field2804 = (var3.field2802 - class144.field2828 << 8) / var13;
                        var3.field2789 = (var3.field2803 - class144.field2828 << 8) / var13;
                        class149.field2921[class115.field2349++] = var3;
                    }
                }
            } else if (var3.field2798 == 4) {
                int var14 = var3.field2802 - class144.field2828;
                if (var14 > 128) {
                    int var15 = var3.field2787 + class200.field3897 - class55.field1056;
                    if (var15 < 0) {
                        var15 = 0;
                    }
                    int var16 = var3.field2779 + class200.field3897 - class55.field1056;
                    if (var16 > class200.field3897 + class200.field3897) {
                        var16 = class200.field3897 + class200.field3897;
                    }
                    if (var15 <= var16) {
                        int var17 = var3.field2793 + class200.field3897 - class166.field3221;
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        int var18 = var3.field2794 + class200.field3897 - class166.field3221;
                        if (var18 > class200.field3897 + class200.field3897) {
                            var18 = class200.field3897 + class200.field3897;
                        }
                        boolean var19 = false;
                        label145: for (int var20 = var17; var20 <= var18; var20++) {
                            for (int var21 = var15; var21 <= var16; var21++) {
                                if (class19.field373[var20][var21]) {
                                    var19 = true;
                                    break label145;
                                }
                            }
                        }
                        if (var19) {
                            var3.field2791 = 5;
                            var3.field2785 = (var3.field2783 - class40.field790 << 8) / var14;
                            var3.field2796 = (var3.field2788 - class40.field790 << 8) / var14;
                            var3.field2799 = (var3.field2786 - class87.field1866 << 8) / var14;
                            var3.field2784 = (var3.field2797 - class87.field1866 << 8) / var14;
                            class149.field2921[class115.field2349++] = var3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public static void method206(byte arg0) {
        field383 = null;
        if (arg0 != 117) {
            method207(109, (byte) 102, -99, 108, 104);
        }
        field382 = null;
        field384 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBIII)V")
    public static final void method207(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (class109.field2268 == 0 && !class78.field1688) {
            class76.field1646++;
            class81.method686(class196.field3817, arg0 - arg4, -arg3 + arg2, class181.field3472, (byte) 107, (short) 14, 0L);
        }
        field389++;
        long var5 = -1L;
        if (arg1 <= 34) {
            field384 = null;
        }
        for (int var7 = 0; var7 < class30.field579; var7++) {
            long var8 = class30.field564[var7];
            int var10 = (int) var8 & 0x7F;
            int var11 = (int) var8 >> 7 & 0x7F;
            int var12 = (int) var8 >> 29 & 0x3;
            int var13 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            if (var5 != var8) {
                var5 = var8;
                if (var12 == 2 && class149.method1048(class196.field3827, var10, var11, var8)) {
                    class202 var14 = class99.method806(0, var13);
                    if (var14.field3945 != null) {
                        var14 = var14.method1326(-83);
                    }
                    if (var14 == null) {
                        continue;
                    }
                    if (class109.field2268 == 1) {
                        class163.field3169++;
                        class81.method686(class98.field2082, var11, var10, class5.method24(new class47[] { class179.field3435, class9.field176, var14.field3920 }, (byte) 79), (byte) -59, (short) 49, var8);
                    } else if (!class78.field1688) {
                        class47[] var15 = var14.field3966;
                        class56.field1083++;
                        if (class61.field1224) {
                            var15 = class193.method1269((byte) 31, var15);
                        }
                        if (var15 != null) {
                            for (int var16 = 4; var16 >= 0; var16--) {
                                if (var15[var16] != null) {
                                    class122.field2473++;
                                    short var17 = 0;
                                    if (var16 == 0) {
                                        var17 = 42;
                                    }
                                    if (var16 == 1) {
                                        var17 = 6;
                                    }
                                    if (var16 == 2) {
                                        var17 = 20;
                                    }
                                    if (var16 == 3) {
                                        var17 = 10;
                                    }
                                    if (var16 == 4) {
                                        var17 = 1002;
                                    }
                                    class81.method686(var15[var16], var11, var10, class5.method24(new class47[] { class106.field2222, var14.field3920 }, (byte) 59), (byte) 123, var17, var8);
                                }
                            }
                        }
                        class81.method686(class126.field2530, var11, var10, class5.method24(new class47[] { class106.field2222, var14.field3920 }, (byte) 113), (byte) -109, (short) 1006, (long) var14.field3972);
                    } else if ((class196.field3811 & 0x4) == 4) {
                        class81.method686(class35.field686, var11, var10, class5.method24(new class47[] { class117.field2371, class9.field176, var14.field3920 }, (byte) 80), (byte) -124, (short) 45, var8);
                        class80.field1729++;
                    }
                }
                if (var12 == 1) {
                    class72 var18 = class133.field2626[var13];
                    if (var18.field1547.field1111 == 1 && (var18.field3291 & 0x7F) == 64 && (var18.field3281 & 0x7F) == 64) {
                        for (int var19 = 0; var19 < class80.field1727; var19++) {
                            class72 var22 = class133.field2626[class136.field2666[var19]];
                            if (var22 != null && var18 != var22 && var22.field1547.field1111 == 1 && var18.field3291 == var22.field3291 && var18.field3281 == var22.field3281) {
                                class138.method1006(29, class136.field2666[var19], var22.field1547, var10, var11);
                            }
                        }
                        for (int var20 = 0; var20 < class130.field2575; var20++) {
                            class32 var21 = class40.field795[class146.field2853[var20]];
                            if (var21 != null && var18.field3291 == var21.field3291 && var18.field3281 == var21.field3281) {
                                class154.method1071((byte) -117, var21, var11, class146.field2853[var20], var10);
                            }
                        }
                    }
                    class138.method1006(-121, var13, var18.field1547, var10, var11);
                }
                if (var12 == 0) {
                    class32 var23 = class40.field795[var13];
                    if ((var23.field3291 & 0x7F) == 64 && (var23.field3281 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < class80.field1727; var24++) {
                            class72 var27 = class133.field2626[class136.field2666[var24]];
                            if (var27 != null && var27.field1547.field1111 == 1 && var23.field3291 == var27.field3291 && var23.field3281 == var27.field3281) {
                                class138.method1006(-122, class136.field2666[var24], var27.field1547, var10, var11);
                            }
                        }
                        for (int var25 = 0; var25 < class130.field2575; var25++) {
                            class32 var26 = class40.field795[class146.field2853[var25]];
                            if (var26 != null && var23 != var26 && var23.field3291 == var26.field3291 && var23.field3281 == var26.field3281) {
                                class154.method1071((byte) -117, var26, var11, class146.field2853[var25], var10);
                            }
                        }
                    }
                    class154.method1071((byte) -117, var23, var11, var13, var10);
                }
                if (var12 == 3) {
                    class40 var28 = class31.field597[class196.field3827][var10][var11];
                    if (var28 != null) {
                        for (class156 var29 = (class156) var28.method344(-28880); var29 != null; var29 = (class156) var28.method340(false)) {
                            class73 var30 = class87.method713(126, var29.field3057);
                            if (class109.field2268 == 1) {
                                class81.method686(class98.field2082, var11, var10, class5.method24(new class47[] { class179.field3435, class8.field156, var30.field1563 }, (byte) 94), (byte) 68, (short) 46, (long) var29.field3057);
                                class191.field3698++;
                            } else if (!class78.field1688) {
                                class47[] var31 = var30.field1584;
                                if (class61.field1224) {
                                    var31 = class193.method1269((byte) 31, var31);
                                }
                                class119.field2402++;
                                for (int var32 = 4; var32 >= 0; var32--) {
                                    if (var31 != null && var31[var32] != null) {
                                        byte var33 = 0;
                                        if (var32 == 0) {
                                            var33 = 16;
                                        }
                                        class97.field2069++;
                                        if (var32 == 1) {
                                            var33 = 36;
                                        }
                                        if (var32 == 2) {
                                            var33 = 26;
                                        }
                                        if (var32 == 3) {
                                            var33 = 39;
                                        }
                                        if (var32 == 4) {
                                            var33 = 28;
                                        }
                                        class81.method686(var31[var32], var11, var10, class5.method24(new class47[] { class34.field667, var30.field1563 }, (byte) 94), (byte) 62, var33, (long) var29.field3057);
                                    } else if (var32 == 2) {
                                        class81.method686(class6.field103, var11, var10, class5.method24(new class47[] { class34.field667, var30.field1563 }, (byte) 65), (byte) -119, (short) 26, (long) var29.field3057);
                                        class141.field2763++;
                                    }
                                }
                                class81.method686(class126.field2530, var11, var10, class5.method24(new class47[] { class34.field667, var30.field1563 }, (byte) 65), (byte) 64, (short) 1004, (long) var29.field3057);
                            } else if ((class196.field3811 & 0x1) == 1) {
                                class133.field2641++;
                                class81.method686(class35.field686, var11, var10, class5.method24(new class47[] { class117.field2371, class8.field156, var30.field1563 }, (byte) 62), (byte) 60, (short) 48, (long) var29.field3057);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static final void method208(int arg0) {
        if (class155.field3027 > 1) {
            class155.field3027--;
        }
        if (class41.field811 > 0) {
            class41.field811--;
        }
        field388++;
        if (class186.field3556) {
            class186.field3556 = false;
            class56.method482(arg0 ^ 0xFFFFFFC3);
            return;
        }
        for (int var1 = 0; var1 < 100 && class116.method909(false); var1++) {
        }
        if (class158.field3078 != 30) {
            return;
        }
        class91.method728(148, class60.field1174, (byte) -48);
        Object var2 = class16.field324.field812;
        synchronized (class16.field324.field812) {
            if (!class155.field3044) {
                class16.field324.field819 = 0;
            } else if (class100.field2105 != 0 || class16.field324.field819 >= 40) {
                class60.field1174.method657(28182, 248);
                class119.field2404++;
                class60.field1174.method609(0, (byte) -121);
                int var3 = class60.field1174.field1454;
                int var4 = 0;
                for (int var5 = 0; var5 < class16.field324.field819 && class60.field1174.field1454 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class16.field324.field820[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var7 = class16.field324.field823[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class16.field324.field820[var5] == -1 && class16.field324.field823[var5] == -1) {
                        var6 = -1;
                        var8 = 524287;
                        var7 = -1;
                    }
                    if (class57.field1128 != var7 || class96.field2036 != var6) {
                        int var9 = var7 - class57.field1128;
                        class57.field1128 = var7;
                        int var10 = var6 - class96.field2036;
                        class96.field2036 = var6;
                        if (class153.field3012 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class60.field1174.method590((class153.field3012 << 12) + (var9 << 6) + var10, -1848441912);
                            class153.field3012 = 0;
                        } else if (class153.field3012 < 8) {
                            class60.field1174.method585((class153.field3012 << 19) + var8 + 8388608, -224823824);
                            class153.field3012 = 0;
                        } else {
                            class60.field1174.method606((class153.field3012 << 19) + var8 - 1073741824, -1424429928);
                            class153.field3012 = 0;
                        }
                    } else if (class153.field3012 < 2047) {
                        class153.field3012++;
                    }
                }
                class60.field1174.method581(-1, class60.field1174.field1454 - var3);
                if (var4 < class16.field324.field819) {
                    class16.field324.field819 -= var4;
                    for (int var11 = 0; var11 < class16.field324.field819; var11++) {
                        class16.field324.field823[var11] = class16.field324.field823[var11 + var4];
                        class16.field324.field820[var11] = class16.field324.field820[var4 + var11];
                    }
                } else {
                    class16.field324.field819 = 0;
                }
            }
        }
        if (class100.field2105 != 0) {
            class176.field3373++;
            long var12 = (class193.field3752 - class117.field2385) / 50L;
            int var14 = class185.field3546;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            int var15 = class3.field29;
            class117.field2385 = class193.field3752;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var16 = (int) var12;
            int var17 = var14 * 765 + var15;
            byte var18 = 0;
            if (class100.field2105 == 2) {
                var18 = 1;
            }
            class60.field1174.method657(28182, 61);
            class60.field1174.method606((var18 << 19) + ((var16 << 20) + var17), -1424429928);
        }
        if (class90.field1892[96] || class90.field1892[97] || class90.field1892[98] || class90.field1892[99]) {
            class185.field3534 = true;
        }
        if (class162.field3163 > 0) {
            class162.field3163--;
        }
        if (class185.field3534 && class162.field3163 <= 0) {
            class51.field994++;
            class162.field3163 = 20;
            class185.field3534 = false;
            class60.field1174.method657(28182, 213);
            class60.field1174.method583(-68041368, class160.field3116);
            class60.field1174.method562(class146.field2854, arg0 + 47);
        }
        if (class61.field1278 && !class22.field435) {
            class22.field435 = true;
            class60.field1174.method657(arg0 ^ 0x6E24, 30);
            class36.field705++;
            class60.field1174.method609(1, (byte) -100);
        }
        if (!class61.field1278 && class22.field435) {
            class22.field435 = false;
            class36.field705++;
            class60.field1174.method657(28182, 30);
            class60.field1174.method609(0, (byte) -112);
        }
        class105.method859(-122);
        if (class158.field3078 != 30) {
            return;
        }
        class191.method1257((byte) 125);
        class41.method352((byte) -125);
        class107.field2234++;
        if (class107.field2234 > 750) {
            class56.method482(117);
            return;
        }
        class23.method229(41);
        class41.method353(128);
        class197.method1294(-1);
        class190.field3677++;
        if (class90.field1898 != 0) {
            class201.field3907 += 20;
            if (class201.field3907 >= 400) {
                class90.field1898 = 0;
            }
        }
        if (class184.field3523 != null) {
            class178.field3417++;
            if (class178.field3417 >= 15) {
                method204(class184.field3523, (byte) -5);
                class184.field3523 = null;
            }
        }
        if (class190.field3684 != null) {
            method204(class190.field3684, (byte) -5);
            class44.field892++;
            if (class91.field1914 + 5 < class84.field1788 || class84.field1788 < class91.field1914 - 5 || class19.field371 + 5 < class41.field814 || class41.field814 < class19.field371 - 5) {
                class185.field3544 = true;
            }
            if (class156.field3054 == 0) {
                if (class185.field3544 && class44.field892 >= 5) {
                    if (class190.field3684 == class19.field375 && class80.field1730 != class170.field3296) {
                        byte var19 = 0;
                        class61 var20 = class190.field3684;
                        if (class8.field154 == 1 && var20.field1225 == 206) {
                            var19 = 1;
                        }
                        if (var20.field1264[class170.field3296] <= 0) {
                            var19 = 0;
                        }
                        if (class109.method877(class5.method25(var20, (byte) 108), -1)) {
                            int var21 = class170.field3296;
                            int var22 = class80.field1730;
                            var20.field1264[var21] = var20.field1264[var22];
                            var20.field1310[var21] = var20.field1310[var22];
                            var20.field1264[var22] = -1;
                            var20.field1310[var22] = 0;
                        } else if (var19 == 1) {
                            int var23 = class80.field1730;
                            int var24 = class170.field3296;
                            while (var23 != var24) {
                                if (var23 > var24) {
                                    var20.method519(var23, -31413, var23 - 1);
                                    var23--;
                                } else if (var24 > var23) {
                                    var20.method519(var23, -31413, var23 + 1);
                                    var23++;
                                }
                            }
                        } else {
                            var20.method519(class80.field1730, -31413, class170.field3296);
                        }
                        class16.field321++;
                        class60.field1174.method657(28182, 229);
                        class60.field1174.method590(class170.field3296, -1848441912);
                        class60.field1174.method563(var19, -37);
                        class60.field1174.method590(class80.field1730, arg0 ^ 0x91D303FA);
                        class60.field1174.method606(class190.field3684.field1211, -1424429928);
                    }
                } else if ((class6.field95 == 1 || class44.method367(0, class95.field1971 - 1)) && class95.field1971 > 2) {
                    class84.method697((byte) 118);
                } else if (class95.field1971 > 0) {
                    class151.method1062(class95.field1971 - 1, arg0 + -2416);
                }
                class178.field3417 = 10;
                class100.field2105 = 0;
                class190.field3684 = null;
            }
        }
        class201.field3908 = false;
        class170.field3321 = 0;
        class124.field2492 = false;
        class86.field1830 = null;
        class61 var25 = class67.field1431;
        class61 var26 = class60.field1177;
        class67.field1431 = null;
        class60.field1177 = null;
        while (class55.method476((byte) -110) && class170.field3321 < 128) {
            class70.field1533[class170.field3321] = class14.field302;
            class192.field3730[class170.field3321] = class194.field3777;
            class170.field3321++;
        }
        if (class202.field3924 != -1) {
            class183.method1222((byte) -87, 0, 503, 0, 0, 0, 765, class202.field3924);
        }
        class103.field2162++;
        while (true) {
            class43 var27;
            class61 var28;
            class61 var29;
            do {
                var27 = (class43) class39.field764.method342(8292);
                if (var27 == null) {
                    while (true) {
                        class43 var30;
                        class61 var31;
                        class61 var32;
                        do {
                            var30 = (class43) client.field542.method342(8292);
                            if (var30 == null) {
                                while (true) {
                                    class43 var33;
                                    class61 var34;
                                    class61 var35;
                                    do {
                                        var33 = (class43) class126.field2531.method342(8292);
                                        if (var33 == null) {
                                            if (class26.field511 != null) {
                                                class120.method927(true);
                                            }
                                            if (class108.field2237 != -1) {
                                                int var36 = class21.field396;
                                                int var37 = class108.field2237;
                                                boolean var38 = class204.method1337(0, class123.field2489.field3310[0], 0, 0, true, var37, class123.field2489.field3317[0], 0, 0, var36, (byte) 48, 0);
                                                class108.field2237 = -1;
                                                if (var38) {
                                                    class90.field1898 = 1;
                                                    class148.field2907 = class185.field3546;
                                                    class201.field3907 = 0;
                                                    class167.field3231 = class3.field29;
                                                }
                                            }
                                            class139.method1009(-105);
                                            if (class67.field1431 != var25) {
                                                if (var25 != null) {
                                                    method204(var25, (byte) -5);
                                                }
                                                if (class67.field1431 != null) {
                                                    method204(class67.field1431, (byte) -5);
                                                }
                                            }
                                            if (class60.field1177 != var26 && class63.field1351 == class130.field2572) {
                                                if (var26 != null) {
                                                    method204(var26, (byte) -5);
                                                }
                                                if (class60.field1177 != null) {
                                                    method204(class60.field1177, (byte) -5);
                                                }
                                            }
                                            if (class60.field1177 == null) {
                                                if (class130.field2572 > 0) {
                                                    class130.field2572--;
                                                }
                                            } else if (class130.field2572 < class63.field1351) {
                                                class130.field2572++;
                                                if (class63.field1351 == class130.field2572) {
                                                    method204(class60.field1177, (byte) -5);
                                                }
                                            }
                                            class33.method288(10689);
                                            if (class152.field2992) {
                                                class154.method1069(false);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class198.field3848[var39]++;
                                            }
                                            int var40 = class138.method1004(28041);
                                            int var41 = class176.method1177(-124);
                                            if (var40 > 4500 && var41 > 4500) {
                                                class152.field2965++;
                                                class41.field811 = 250;
                                                class54.method475(105, 4000);
                                                class60.field1174.method657(28182, 146);
                                            }
                                            class109.field2258++;
                                            class206.field4056++;
                                            class39.field774++;
                                            if (class206.field4056 > 500) {
                                                int var42 = (int) (Math.random() * 8.0D);
                                                if ((var42 & 0x4) == 4) {
                                                    class196.field3826 += class61.field1270;
                                                }
                                                if ((var42 & 0x1) == 1) {
                                                    class44.field891 += class151.field2958;
                                                }
                                                class206.field4056 = 0;
                                                if ((var42 & 0x2) == 2) {
                                                    class35.field687 += class43.field865;
                                                }
                                            }
                                            if (class196.field3826 < -40) {
                                                class61.field1270 = 1;
                                            }
                                            if (class44.field891 < -50) {
                                                class151.field2958 = 2;
                                            }
                                            if (class196.field3826 > 40) {
                                                class61.field1270 = -1;
                                            }
                                            if (class39.field774 > 500) {
                                                class39.field774 = 0;
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x2) == 2) {
                                                    class60.field1167 += class31.field596;
                                                }
                                                if ((var43 & 0x1) == 1) {
                                                    class195.field3793 += class26.field493;
                                                }
                                            }
                                            if (class60.field1167 < -20) {
                                                class31.field596 = 1;
                                            }
                                            if (class44.field891 > 50) {
                                                class151.field2958 = -2;
                                            }
                                            if (class60.field1167 > 10) {
                                                class31.field596 = -1;
                                            }
                                            if (class35.field687 < -55) {
                                                class43.field865 = 2;
                                            }
                                            if (class35.field687 > 55) {
                                                class43.field865 = -2;
                                            }
                                            if (class195.field3793 < -60) {
                                                class26.field493 = 2;
                                            }
                                            if (class195.field3793 > 60) {
                                                class26.field493 = -2;
                                            }
                                            if (arg0 < class109.field2258) {
                                                class198.field3854++;
                                                class60.field1174.method657(28182, 219);
                                            }
                                            try {
                                                if (class61.field1323 != null && class60.field1174.field1454 > 0) {
                                                    class61.field1323.method679(class60.field1174.field1454, (byte) 112, class60.field1174.field1495, 0);
                                                    class60.field1174.field1454 = 0;
                                                    class109.field2258 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class56.method482(84);
                                                return;
                                            }
                                        }
                                        var34 = var33.field859;
                                        if (var34.field1263 < 0) {
                                            break;
                                        }
                                        var35 = class23.method224(var34.field1245, arg0 ^ 0x1CDAF302);
                                    } while (var35 == null || var35.field1227 == null || var34.field1263 >= var35.field1227.length || var35.field1227[var34.field1263] != var34);
                                    class188.method1242(var33, 116);
                                }
                            }
                            var31 = var30.field859;
                            if (var31.field1263 < 0) {
                                break;
                            }
                            var32 = class23.method224(var31.field1245, 484111152);
                        } while (var32 == null || var32.field1227 == null || var32.field1227.length <= var31.field1263 || var32.field1227[var31.field1263] != var31);
                        class188.method1242(var30, arg0 ^ 0x58);
                    }
                }
                var28 = var27.field859;
                if (var28.field1263 < 0) {
                    break;
                }
                var29 = class23.method224(var28.field1245, 484111152);
            } while (var29 == null || var29.field1227 == null || var29.field1227.length <= var28.field1263 || var29.field1227[var28.field1263] != var28);
            class188.method1242(var27, 97);
        }
    }
}
