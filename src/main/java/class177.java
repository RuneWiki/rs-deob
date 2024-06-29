import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class177 extends class219 {

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    private int field2767 = -32768;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
    public static int field2768 = 0;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public int field2761;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "[[[I")
    public static int[][][] field2759;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "()V")
    public static final void method1234() {
        class272.field4328 = 0;
        label191: for (int var0 = 0; var0 < class270.field4299; var0++) {
            class13 var1 = class17.field199[var0];
            if (class241.field3860 != null) {
                for (int var2 = 0; var2 < class241.field3860.length; var2++) {
                    if (class241.field3860[var2] != -1000000 && (var1.field164 <= class241.field3860[var2] || var1.field170 <= class241.field3860[var2]) && (var1.field160 <= class16.field195[var2] || var1.field161 <= class16.field195[var2]) && (var1.field160 >= class78.field1097[var2] || var1.field161 >= class78.field1097[var2]) && (var1.field171 <= class115.field1698[var2] || var1.field156 <= class115.field1698[var2]) && (var1.field171 >= class6.field80[var2] || var1.field156 >= class6.field80[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field174 == 1) {
                int var3 = var1.field166 + class33.field429 - class72.field1010;
                if (var3 >= 0 && var3 <= class33.field429 + class33.field429) {
                    int var4 = var1.field167 + class33.field429 - class173.field2721;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field154 + class33.field429 - class173.field2721;
                    if (var5 > class33.field429 + class33.field429) {
                        var5 = class33.field429 + class33.field429;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class17.field197[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class172.field2696 - var1.field160;
                        if (var7 > 32) {
                            var1.field158 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field158 = 2;
                            var7 = -var7;
                        }
                        var1.field163 = (var1.field171 - class82.field1285 << 8) / var7;
                        var1.field177 = (var1.field156 - class82.field1285 << 8) / var7;
                        var1.field159 = (var1.field164 - client.field2328 << 8) / var7;
                        var1.field155 = (var1.field170 - client.field2328 << 8) / var7;
                        class229.field3700[class272.field4328++] = var1;
                    }
                }
            } else if (var1.field174 == 2) {
                int var8 = var1.field167 + class33.field429 - class173.field2721;
                if (var8 >= 0 && var8 <= class33.field429 + class33.field429) {
                    int var9 = var1.field166 + class33.field429 - class72.field1010;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field162 + class33.field429 - class72.field1010;
                    if (var10 > class33.field429 + class33.field429) {
                        var10 = class33.field429 + class33.field429;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class17.field197[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class82.field1285 - var1.field171;
                        if (var12 > 32) {
                            var1.field158 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field158 = 4;
                            var12 = -var12;
                        }
                        var1.field175 = (var1.field160 - class172.field2696 << 8) / var12;
                        var1.field173 = (var1.field161 - class172.field2696 << 8) / var12;
                        var1.field159 = (var1.field164 - client.field2328 << 8) / var12;
                        var1.field155 = (var1.field170 - client.field2328 << 8) / var12;
                        class229.field3700[class272.field4328++] = var1;
                    }
                }
            } else if (var1.field174 == 4) {
                int var13 = var1.field164 - client.field2328;
                if (var13 > 128) {
                    int var14 = var1.field167 + class33.field429 - class173.field2721;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field154 + class33.field429 - class173.field2721;
                    if (var15 > class33.field429 + class33.field429) {
                        var15 = class33.field429 + class33.field429;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field166 + class33.field429 - class72.field1010;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field162 + class33.field429 - class72.field1010;
                        if (var17 > class33.field429 + class33.field429) {
                            var17 = class33.field429 + class33.field429;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class17.field197[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field158 = 5;
                            var1.field175 = (var1.field160 - class172.field2696 << 8) / var13;
                            var1.field173 = (var1.field161 - class172.field2696 << 8) / var13;
                            var1.field163 = (var1.field171 - class82.field1285 << 8) / var13;
                            var1.field177 = (var1.field156 - class82.field1285 << 8) / var13;
                            class229.field3700[class272.field4328++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIIIJILql;)V")
    public final void method373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class217 arg10) {
        field2764++;
        class114 var13 = class162.method1112(this.field2761, (byte) 94).method1703(this.field2765, 0, 0, -1, (class198) null, (byte) -123);
        if (var13 != null) {
            var13.method373(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field2767 = var13.method363();
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
    public static final void method1235(boolean arg0) {
        field2762++;
        if (class111.field1680 == 0 || class111.field1680 == 5) {
            return;
        }
        try {
            if ((++class254.field4115) > 2000) {
                if (class240.field3833 != null) {
                    class240.field3833.method1842(false);
                    class240.field3833 = null;
                }
                if (class104.field1602 >= 1) {
                    class149.field2208 = -5;
                    class111.field1680 = 0;
                    return;
                }
                if (class198.field3109 == field2760) {
                    field2760 = class104.field1607;
                } else {
                    field2760 = class198.field3109;
                }
                class104.field1602++;
                class254.field4115 = 0;
                class111.field1680 = 1;
            }
            if (class111.field1680 == 1) {
                class286.field4541 = class2.field23.method140(-6412, class34.field442, field2760);
                class111.field1680 = 2;
            }
            if (class111.field1680 == 2) {
                if (class286.field4541.field3247 == 2) {
                    throw new IOException();
                }
                if (class286.field4541.field3247 != 1) {
                    return;
                }
                class240.field3833 = new class273((Socket) class286.field4541.field3249, class2.field23);
                class286.field4541 = null;
                long var1 = class17.field211 = class162.method1116(class158.field2432, (byte) 88);
                class13.field165.field349 = 0;
                class13.field165.method184(14, 121);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class13.field165.method184(var3, 115);
                class240.field3833.method1843(-123, class13.field165.field339, 2, 0);
                if (class239.field3821 != null) {
                    class239.field3821.method402(24);
                }
                if (class54.field739 != null) {
                    class54.field739.method402(35);
                }
                int var4 = class240.field3833.method1839((byte) -110);
                if (class239.field3821 != null) {
                    class239.field3821.method402(112);
                }
                if (class54.field739 != null) {
                    class54.field739.method402(111);
                }
                if (var4 != 0) {
                    class111.field1680 = 0;
                    class149.field2208 = var4;
                    class240.field3833.method1842(false);
                    class240.field3833 = null;
                    return;
                }
                class111.field1680 = 3;
            }
            if (class111.field1680 == 3) {
                if (class240.field3833.method1840((byte) 120) < 8) {
                    return;
                }
                class240.field3833.method1841(-1, class235.field3766.field339, 8, 0);
                int[] var5 = new int[4];
                class235.field3766.field349 = 0;
                class5.field65 = class235.field3766.method218(1728901472);
                var5[2] = (int) (class5.field65 >> 32);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class5.field65;
                class13.field165.field349 = 0;
                class13.field165.method184(10, 117);
                class13.field165.method166(var5[0], -3);
                class13.field165.method166(var5[1], -3);
                class13.field165.method166(var5[2], -3);
                class13.field165.method166(var5[3], -3);
                class13.field165.method206(-5061, class162.method1116(class158.field2432, (byte) 6));
                class13.field165.method199(0, class280.field4436);
                class13.field165.method165(class249.field3974, (byte) 115, class148.field2196);
                class164.field2551.field349 = 0;
                if (class203.field3182 == 40) {
                    class164.field2551.method184(18, 122);
                } else {
                    class164.field2551.method184(16, 82);
                }
                class164.field2551.method223(-1720191288, class13.field165.field349 + class268.method1822(126, class167.field2574) + 159);
                class164.field2551.method166(532, -3);
                class164.field2551.method184(class57.field806, 113);
                class164.field2551.method184(class236.field3776 ? 1 : 0, 96);
                class164.field2551.method184(0, 113);
                class164.field2551.method184(class277.method1859(-98), 84);
                class164.field2551.method223(-1720191288, class135.field1960);
                class164.field2551.method223(-1720191288, class98.field1510);
                class164.field2551.method184(class229.field3703, 99);
                class95.method635(-13589, class164.field2551);
                class164.field2551.method199(0, class167.field2574);
                class164.field2551.method166(class266.field4268, -3);
                class164.field2551.method166(class153.method1015(113), -3);
                class21.field256 = true;
                class164.field2551.method223(-1720191288, class246.field3949);
                class164.field2551.method166(class13.field179.method809(-1), -3);
                class164.field2551.method166(class118.field1738.method809(-1), -3);
                class164.field2551.method166(class154.field2292.method809(-1), -3);
                class164.field2551.method166(class170.field2668.method809(-1), -3);
                class164.field2551.method166(class49.field633.method809(-1), -3);
                class164.field2551.method166(class102.field1582.method809(-1), -3);
                class164.field2551.method166(class98.field1509.method809(-1), -3);
                class164.field2551.method166(class282.field4462.method809(-1), -3);
                class164.field2551.method166(class237.field3802.method809(-1), -3);
                class164.field2551.method166(class271.field4315.method809(-1), -3);
                class164.field2551.method166(class16.field186.method809(-1), -3);
                class164.field2551.method166(class261.field4209.method809(-1), -3);
                class164.field2551.method166(class63.field892.method809(-1), -3);
                class164.field2551.method166(client.field2331.method809(-1), -3);
                class164.field2551.method166(class8.field123.method809(-1), -3);
                class164.field2551.method166(class244.field3913.method809(-1), -3);
                class164.field2551.method166(class199.field3124.method809(-1), -3);
                class164.field2551.method166(class21.field259.method809(-1), -3);
                class164.field2551.method166(class37.field487.method809(-1), -3);
                class164.field2551.method166(class163.field2536.method809(-1), -3);
                class164.field2551.method166(class192.field3024.method809(-1), -3);
                class164.field2551.method166(class243.field3892.method809(-1), -3);
                class164.field2551.method166(class284.field4501.method809(-1), -3);
                class164.field2551.method166(class252.field4030.method809(-1), -3);
                class164.field2551.method166(class123.field1838.method809(-1), -3);
                class164.field2551.method166(class30.field397.method809(-1), -3);
                class164.field2551.method166(class204.field3204.method809(-1), -3);
                class164.field2551.method166(class228.field3695.method809(-1), -3);
                class164.field2551.method213(0, class13.field165.field339, class13.field165.field349, -127);
                class240.field3833.method1843(-127, class164.field2551.field339, class164.field2551.field349, 0);
                class13.field165.method891(-9777, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class235.field3766.method891(-9777, var5);
                class111.field1680 = 4;
            }
            if (class111.field1680 == 4) {
                if (class240.field3833.method1840((byte) 123) < 1) {
                    return;
                }
                int var7 = class240.field3833.method1839((byte) -54);
                if (var7 == 21) {
                    class111.field1680 = 7;
                } else if (var7 == 29) {
                    class111.field1680 = 10;
                } else if (var7 == 1) {
                    class111.field1680 = 5;
                    class149.field2208 = var7;
                    return;
                } else if (var7 == 2) {
                    class111.field1680 = 8;
                } else if (var7 == 15) {
                    class111.field1680 = 0;
                    class149.field2208 = var7;
                    return;
                } else if (var7 == 23 && class104.field1602 < 1) {
                    class111.field1680 = 1;
                    class104.field1602++;
                    class254.field4115 = 0;
                    class240.field3833.method1842(arg0);
                    class240.field3833 = null;
                    return;
                } else {
                    class111.field1680 = 0;
                    class149.field2208 = var7;
                    class240.field3833.method1842(arg0);
                    class240.field3833 = null;
                    return;
                }
            }
            if (class111.field1680 == 6) {
                class13.field165.field349 = 0;
                class13.field165.method892(17, (byte) -72);
                class240.field3833.method1843(-107, class13.field165.field339, class13.field165.field349, 0);
                class111.field1680 = 4;
                return;
            }
            if (class111.field1680 == 7) {
                if (class240.field3833.method1840((byte) 118) < 1) {
                    return;
                }
                class234.field3760 = (class240.field3833.method1839((byte) -116) + 3) * 60;
                class149.field2208 = 21;
                class111.field1680 = 0;
                class240.field3833.method1842(arg0);
                class240.field3833 = null;
                return;
            }
            if (class111.field1680 == 10) {
                if (class240.field3833.method1840((byte) 116) < 1) {
                    return;
                }
                class94.field1454 = class240.field3833.method1839((byte) -66);
                class149.field2208 = 29;
                class111.field1680 = 0;
                class240.field3833.method1842(false);
                class240.field3833 = null;
                return;
            }
            if (class111.field1680 == 8) {
                if (class240.field3833.method1840((byte) 118) < 14) {
                    return;
                }
                class240.field3833.method1841(-1, class235.field3766.field339, 14, 0);
                class235.field3766.field349 = 0;
                class280.field4438 = class235.field3766.method201(255);
                class11.field149 = class235.field3766.method201(255);
                class172.field2700 = class235.field3766.method201(255) == 1;
                class121.field1763 = class235.field3766.method201(255) == 1;
                class46.field586 = class235.field3766.method201(255) == 1;
                class50.field666 = class235.field3766.method201(255) == 1;
                class161.field2500 = class235.field3766.method201(255) == 1;
                class45.field574 = class235.field3766.method190(-3);
                class237.field3794 = class235.field3766.method201(255) == 1;
                class257.field4155 = class235.field3766.method201(255) == 1;
                class52.method379(class257.field4155, true);
                class239.method1622(108, class257.field4155);
                if (!class236.field3776) {
                    if ((!class172.field2700 || class46.field586) && !class237.field3794) {
                        try {
                            class113.method730(class2.field23.field237, 188, "unzap");
                        } catch (Throwable var8) {
                        }
                    } else {
                        try {
                            class113.method730(class2.field23.field237, 188, "zap");
                        } catch (Throwable var9) {
                        }
                    }
                }
                class262.field4233 = class235.field3766.method897(255);
                class179.field2793 = class235.field3766.method190(-3);
                class111.field1680 = 9;
            }
            if (class111.field1680 == 9) {
                if (class240.field3833.method1840((byte) 116) < class179.field2793) {
                    return;
                }
                class235.field3766.field349 = 0;
                class240.field3833.method1841(-1, class235.field3766.field339, class179.field2793, 0);
                class111.field1680 = 0;
                class149.field2208 = 2;
                class185.method1285(95);
                class179.field2794 = -1;
                class19.method128(true, false);
                class262.field4233 = -1;
                return;
            }
        } catch (IOException var10) {
            if (class240.field3833 != null) {
                class240.field3833.method1842(false);
                class240.field3833 = null;
            }
            if (class104.field1602 >= 1) {
                class149.field2208 = -4;
                class111.field1680 = 0;
            } else {
                if (class198.field3109 == field2760) {
                    field2760 = class104.field1607;
                } else {
                    field2760 = class198.field3109;
                }
                class254.field4115 = 0;
                class111.field1680 = 1;
                class104.field1602++;
            }
        }
        if (arg0) {
            method1234();
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    public static void method1236(int arg0) {
        int var1 = -126 / ((52 - arg0) / 60);
        field2759 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIII)V")
    public final void method370(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2766++;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
    public static final void method1237(byte arg0) {
        field2763++;
        class229.field3706.method1420(-1);
        if (arg0 < 10) {
            field2760 = 61;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "()I")
    public final int method363() {
        field2758++;
        return this.field2767;
    }
}
