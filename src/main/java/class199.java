import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class199 {

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Ltk;")
    private class51 field3485 = new class51();

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    private int field3483;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    private int field3495;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "Ldk;")
    private class275 field3502;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Z")
    public static boolean field3481 = false;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "Z")
    public static boolean field3493 = false;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "Lqk;")
    public static class207 field3488 = class24.method212(255, ":clanreq:");

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field3484 = 0;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "Lqk;")
    public static class207 field3498 = class24.method212(255, ")1o");

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Lqk;")
    private static class207 field3478 = class24.method212(255, "yellow:");

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "Lqk;")
    public static class207 field3479 = field3478;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "[I")
    public static int[] field3505 = new int[500];

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "Lqk;")
    public static class207 field3489 = field3478;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "Lpk;")
    public static class99 field3499;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)I")
    public final int method1376(byte arg0) {
        if (arg0 < 74) {
            return -90;
        }
        field3490++;
        int var2 = 0;
        for (class111 var3 = (class111) this.field3485.method391(65535); var3 != null; var3 = (class111) this.field3485.method399(1048575)) {
            if (!var3.method795(4)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)[B")
    public static final byte[] method1377(int arg0, byte arg1) {
        field3494++;
        if (arg1 != -22) {
            method1386(5L, 118);
        }
        class236 var2 = (class236) class43.field854.method758(false, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class93.method667(var7, 15901, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class236(var3);
            class43.field854.method759((long) arg0, 2, var2);
        }
        return var2.field4357;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IJ)V")
    public final void method1378(int arg0, long arg1) {
        field3480++;
        class111 var4 = (class111) this.field3502.method1867(arg1, true);
        if (var4 != null) {
            var4.method1346((byte) -16);
            var4.method244(-10368);
            this.field3483++;
        }
        if (arg0 != 19666) {
            this.field3483 = -74;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I")
    public static final int method1379(int arg0, int arg1) {
        field3501++;
        if (arg0 != -1016344952) {
            method1386(-91L, -121);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Llh;B)V")
    public static final void method1380(class286 arg0, byte arg1) {
        arg0.field5037 = false;
        if (arg0.field5039 != -1) {
            class65 var2 = class16.method101((byte) -78, arg0.field5039);
            if (var2 == null || var2.field1180 == null) {
                arg0.field5039 = -1;
            } else {
                arg0.field5076++;
                if (var2.field1180.length > arg0.field5077 && var2.field1150[arg0.field5077] < arg0.field5076) {
                    arg0.field5077++;
                    arg0.field5026++;
                    arg0.field5076 = 1;
                    class69.method497(arg0.field5104, class202.field3565 == arg0, arg0.field5077, -60, arg0.field5072, var2);
                }
                if (arg0.field5077 >= var2.field1180.length) {
                    arg0.field5076 = 0;
                    arg0.field5077 = 0;
                    class69.method497(arg0.field5104, class202.field3565 == arg0, arg0.field5077, -72, arg0.field5072, var2);
                }
                arg0.field5026 = arg0.field5077 + 1;
                if (var2.field1180.length <= arg0.field5026) {
                    arg0.field5026 = 0;
                }
            }
        }
        if (arg0.field5105 != -1 && arg0.field5059 <= class160.field2844) {
            int var3 = class165.method1192(arg0.field5105, -115).field4332;
            if (var3 == -1) {
                arg0.field5105 = -1;
            } else {
                class65 var4 = class16.method101((byte) -94, var3);
                if (var4 == null || var4.field1180 == null) {
                    arg0.field5105 = -1;
                } else {
                    if (arg0.field5080 < 0) {
                        arg0.field5080 = 0;
                        class69.method497(arg0.field5104, class202.field3565 == arg0, 0, -30, arg0.field5072, var4);
                    }
                    arg0.field5088++;
                    if (arg0.field5080 < var4.field1180.length && arg0.field5088 > var4.field1150[arg0.field5080]) {
                        arg0.field5088 = 1;
                        arg0.field5080++;
                        class69.method497(arg0.field5104, class202.field3565 == arg0, arg0.field5080, -88, arg0.field5072, var4);
                    }
                    if (var4.field1180.length <= arg0.field5080) {
                        arg0.field5105 = -1;
                    }
                    arg0.field5012 = arg0.field5080 + 1;
                    if (arg0.field5012 >= var4.field1180.length) {
                        arg0.field5012 = -1;
                    }
                }
            }
        }
        field3492++;
        if (arg0.field5052 != -1 && arg0.field5103 <= 1) {
            class65 var5 = class16.method101((byte) 68, arg0.field5052);
            if (var5.field1170 == 1 && arg0.field5011 > 0 && arg0.field5038 <= class160.field2844 && arg0.field5086 < class160.field2844) {
                arg0.field5103 = 1;
                return;
            }
        }
        if (arg0.field5052 != -1 && arg0.field5103 == 0) {
            class65 var6 = class16.method101((byte) 115, arg0.field5052);
            if (var6 == null || var6.field1180 == null) {
                arg0.field5052 = -1;
            } else {
                arg0.field5047++;
                if (arg0.field5069 < var6.field1180.length && arg0.field5047 > var6.field1150[arg0.field5069]) {
                    arg0.field5047 = 1;
                    arg0.field5069++;
                    class69.method497(arg0.field5104, class202.field3565 == arg0, arg0.field5069, -102, arg0.field5072, var6);
                }
                if (arg0.field5069 >= var6.field1180.length) {
                    arg0.field5069 -= var6.field1158;
                    arg0.field5048++;
                    if (var6.field1166 <= arg0.field5048) {
                        arg0.field5052 = -1;
                    } else if (arg0.field5069 >= 0 && var6.field1180.length > arg0.field5069) {
                        class69.method497(arg0.field5104, class202.field3565 == arg0, arg0.field5069, -29, arg0.field5072, var6);
                    } else {
                        arg0.field5052 = -1;
                    }
                }
                arg0.field5081 = arg0.field5069 + 1;
                if (arg0.field5081 >= var6.field1180.length) {
                    arg0.field5081 -= var6.field1158;
                    if (var6.field1166 <= arg0.field5048 + 1) {
                        arg0.field5081 = -1;
                    } else if (arg0.field5081 < 0 || var6.field1180.length <= arg0.field5081) {
                        arg0.field5081 = -1;
                    }
                }
                arg0.field5037 = var6.field1161;
            }
        }
        if (arg0.field5103 > 0) {
            arg0.field5103--;
        }
        for (int var7 = 0; var7 < arg0.field5065.length; var7++) {
            class195 var8 = arg0.field5065[var7];
            if (var8 != null) {
                if (var8.field3427 > 0) {
                    var8.field3427--;
                } else {
                    class65 var9 = class16.method101((byte) -106, var8.field3424);
                    if (var9 == null || var9.field1180 == null) {
                        arg0.field5065[var7] = null;
                    } else {
                        var8.field3433++;
                        if (var9.field1180.length > var8.field3421 && var8.field3433 > var9.field1150[var8.field3421]) {
                            var8.field3421++;
                            var8.field3433 = 1;
                            class69.method497(arg0.field5104, class202.field3565 == arg0, var8.field3421, -64, arg0.field5072, var9);
                        }
                        if (var8.field3421 >= var9.field1180.length) {
                            var8.field3426++;
                            var8.field3421 -= var9.field1158;
                            if (var8.field3426 >= var9.field1166) {
                                arg0.field5065[var7] = null;
                            } else if (var8.field3421 >= 0 && var8.field3421 < var9.field1180.length) {
                                class69.method497(arg0.field5104, class202.field3565 == arg0, var8.field3421, -99, arg0.field5072, var9);
                            } else {
                                arg0.field5065[var7] = null;
                            }
                        }
                        var8.field3429 = var8.field3421 + 1;
                        if (var9.field1180.length <= var8.field3429) {
                            var8.field3429 -= var9.field1158;
                            if (var8.field3426 + 1 >= var9.field1166) {
                                var8.field3429 = -1;
                            } else if (var8.field3429 < 0 || var8.field3429 >= var9.field1180.length) {
                                var8.field3429 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != 47) {
            method1377(66, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3496++;
        if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
            class125.field2179 = -1;
            class234.field4334 = -1;
            return;
        }
        int var8 = class22.method139(arg2, arg1, arg5 - 1480397822, class93.field1645) - arg4;
        int var9 = arg1 - class111.field1939;
        int var10 = arg2 - class209.field3702;
        int var11 = class257.field4598[class228.field4186];
        int var12 = class257.field4597[class228.field4186];
        int var13 = class257.field4598[class101.field1819];
        int var14 = var8 - class196.field3443;
        int var15 = class257.field4597[class101.field1819];
        int var16 = var9 * var13 + var10 * var15 >> 16;
        int var17 = var9 * var15 - var10 * var13 >> 16;
        if (arg5 != 1480421801) {
            field3478 = null;
        }
        int var19 = var12 * var14 - (var11 * var17) >> 16;
        int var20 = var11 * var14 + var12 * var17 >> 16;
        if (var20 < 50) {
            class125.field2179 = -1;
            class234.field4334 = -1;
        } else {
            class125.field2179 = (var16 << 9) / var20 + arg6;
            class234.field4334 = (var19 << 9) / var20 + arg3;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public final void method1382(int arg0) {
        for (class111 var2 = (class111) this.field3485.method391(65535); var2 != null; var2 = (class111) this.field3485.method399(1048575)) {
            if (var2.method795(arg0 - 31342)) {
                var2.method1346((byte) -16);
                var2.method244(-10368);
                this.field3483++;
            }
        }
        field3477++;
        if (arg0 != 31346) {
            field3500 = 60;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)V")
    public final void method1383(int arg0, int arg1) {
        if (class170.field3014 != null) {
            for (class111 var3 = (class111) this.field3485.method391(arg0 ^ 0xFFFF1F73); var3 != null; var3 = (class111) this.field3485.method399(1048575)) {
                if (var3.method795(4)) {
                    if (var3.method792((byte) 116) == null) {
                        var3.method1346((byte) -16);
                        var3.method244(-10368);
                        this.field3483++;
                    }
                } else if ((++var3.field643) > ((long) arg1)) {
                    class111 var4 = class170.field3014.method645(0, var3);
                    this.field3502.method1863((byte) -98, var4, var3.field3407);
                    class147.method1023(0, var3, var4);
                    var3.method1346((byte) -16);
                    var3.method244(arg0 ^ 0x370C);
                }
            }
        }
        if (arg0 == -8052) {
            field3487++;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V")
    public static void method1384(byte arg0) {
        field3505 = null;
        field3479 = null;
        field3498 = null;
        field3488 = null;
        field3499 = null;
        field3489 = null;
        if (arg0 != 23) {
            field3500 = -109;
        }
        field3478 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(JLjava/lang/Object;B)V")
    public final void method1385(long arg0, Object arg1, byte arg2) {
        field3476++;
        this.method1378(19666, arg0);
        if (this.field3483 == 0) {
            class111 var5 = (class111) this.field3485.method397(524287);
            var5.method1346((byte) -16);
            var5.method244(-10368);
        } else {
            this.field3483--;
        }
        class180 var6 = new class180(arg1);
        this.field3502.method1863((byte) -85, var6, arg0);
        this.field3485.method389(false, var6);
        var6.field643 = 0L;
        if (arg2 > -109) {
            method1384((byte) 35);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(JI)V")
    public static final void method1386(long arg0, int arg1) {
        field3503++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class25.field534 < 100 || class204.field3587) || class25.field534 >= 200) {
            class71.method511(23692, class100.field1800, 0, class235.field4340);
            return;
        }
        class207 var3 = class21.method125(90, arg0).method1423(arg1 + 28960);
        for (int var4 = 0; var4 < class25.field534; var4++) {
            if (class150.field2640[var4] == arg0) {
                class71.method511(arg1 + 52528, class100.field1800, 0, class105.method757(false, new class207[] { var3, class13.field179 }));
                return;
            }
        }
        for (int var5 = 0; var5 < class54.field1013; var5++) {
            if (class282.field4963[var5] == arg0) {
                class71.method511(23692, class100.field1800, 0, class105.method757(false, new class207[] { class15.field244, var3, class73.field1345 }));
                return;
            }
        }
        if (var3.method1436(class202.field3565.field209, (byte) -94)) {
            class71.method511(23692, class100.field1800, 0, class36.field697);
            return;
        }
        class129.field2240[class25.field534] = var3;
        class150.field2640[class25.field534] = arg0;
        class34.field679[class25.field534] = 0;
        class278.field4878++;
        class118.field2042[class25.field534] = class100.field1800;
        class275.field4811[class25.field534] = 0;
        class31.field630[class25.field534] = false;
        class25.field534++;
        if (arg1 != -28836) {
            method1377(-5, (byte) -101);
        }
        class177.field3201 = class193.field3395;
        class261.field4645.method767(101, (byte) 119);
        class261.field4645.method1048((byte) 104, arg0);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method1387(long arg0, int arg1) {
        field3486++;
        class111 var4 = (class111) this.field3502.method1867(arg0, true);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method792((byte) 127);
        if (var5 == null) {
            var4.method1346((byte) -16);
            var4.method244(-10368);
            this.field3483++;
            return null;
        }
        if (var4.method795(4)) {
            class180 var6 = new class180(var5);
            this.field3502.method1863((byte) -106, var6, var4.field3407);
            this.field3485.method389(false, var6);
            var6.field643 = 0L;
            var4.method1346((byte) -16);
            var4.method244(-10368);
        } else {
            this.field3485.method389(false, var4);
            var4.field643 = 0L;
        }
        if (arg1 < 119) {
            method1377(-116, (byte) 36);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Llh;B)V")
    public static final void method1388(class286 arg0, byte arg1) {
        field3482++;
        if (arg0.field5097 == 0) {
            return;
        }
        class200 var2 = arg0.method1947(9);
        if (arg0.field5079 != -1 && arg0.field5079 < 32768) {
            class256 var3 = class79.field1449[arg0.field5079];
            if (var3 != null) {
                int var4 = arg0.field5104 - var3.field5104;
                int var5 = arg0.field5072 - var3.field5072;
                if (var4 != 0 || var5 != 0) {
                    arg0.field5098 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field5079 >= 32768) {
            int var6 = arg0.field5079 - 32768;
            if (class19.field313 == var6) {
                var6 = 2047;
            }
            class14 var7 = class169.field2953[var6];
            if (var7 != null) {
                int var8 = arg0.field5104 - var7.field5104;
                int var9 = arg0.field5072 - var7.field5072;
                if (var8 != 0 || var9 != 0) {
                    arg0.field5098 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field5045 != 0 || arg0.field5023 != 0) && (arg0.field5061 == 0 || arg0.field5015 > 0)) {
            int var10 = arg0.field5104 - (arg0.field5045 - class21.field349 - class21.field349) * 64;
            int var11 = arg0.field5072 - ((arg0.field5023 - class180.field3231 - class180.field3231) * 64);
            if (var10 != 0 || var11 != 0) {
                arg0.field5098 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg0.field5045 = 0;
            arg0.field5023 = 0;
        }
        int var12 = -122 / ((-arg1 - 20) / 54);
        int var13 = arg0.field5098 - arg0.field5062 & 0x7FF;
        if (var13 == 0) {
            arg0.field5082 = 0;
            arg0.field5016 = 0;
        } else if (var2.field3524 == 0) {
            arg0.field5082++;
            if (var13 <= 1024) {
                arg0.field5062 += arg0.field5097;
                boolean var14 = true;
                if (arg0.field5097 > var13 || 2048 - arg0.field5097 < var13) {
                    arg0.field5062 = arg0.field5098;
                    var14 = false;
                }
                if (arg0.field5039 == var2.field3539 && (arg0.field5082 > 25 || var14)) {
                    if (var2.field3511 == -1) {
                        arg0.field5039 = var2.field3522;
                    } else {
                        arg0.field5039 = var2.field3511;
                    }
                }
            } else {
                arg0.field5062 -= arg0.field5097;
                boolean var15 = true;
                if (var13 < arg0.field5097 || var13 > 2048 - arg0.field5097) {
                    arg0.field5062 = arg0.field5098;
                    var15 = false;
                }
                if (arg0.field5039 == var2.field3539 && (arg0.field5082 > 25 || var15)) {
                    if (var2.field3533 == -1) {
                        arg0.field5039 = var2.field3522;
                    } else {
                        arg0.field5039 = var2.field3533;
                    }
                }
            }
            arg0.field5062 &= 0x7FF;
        } else {
            if (arg0.field5039 == var2.field3539 && arg0.field5082 > 25) {
                if (var2.field3511 == -1) {
                    arg0.field5039 = var2.field3522;
                } else {
                    arg0.field5039 = var2.field3511;
                }
            }
            int var16 = arg0.field5098 << 5;
            if (arg0.field5030 != var16) {
                arg0.field5071 = 0;
                int var17 = var16 - arg0.field5090 & 0xFFFF;
                int var18 = arg0.field5016 * arg0.field5016 / (var2.field3524 * 2);
                if (arg0.field5016 > 0 && var18 <= var17 && var17 - var18 < 32768) {
                    arg0.field5089 = true;
                    arg0.field5109 = var17 / 2;
                    int var19 = var2.field3529 * var2.field3529 / (var2.field3524 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (arg0.field5109 > var19) {
                        arg0.field5109 = var17 - var19;
                    }
                } else if (arg0.field5016 < 0 && var18 <= 65536 - var17 && (65536 - var17 - var18) < 32768) {
                    arg0.field5109 = (65536 - var17) / 2;
                    arg0.field5089 = true;
                    int var20 = var2.field3529 * var2.field3529 / (var2.field3524 * 2);
                    if (var20 > 32767) {
                        var20 = 32767;
                    }
                    if (var20 < arg0.field5109) {
                        arg0.field5109 = 65536 - var17 - var20;
                    }
                } else {
                    arg0.field5089 = false;
                }
                arg0.field5030 = var16;
            }
            if (arg0.field5016 == 0) {
                int var21 = arg0.field5030 - arg0.field5090 & 0xFFFF;
                if (var21 >= var2.field3524) {
                    int var22 = var2.field3529 * var2.field3529 / (var2.field3524 * 2);
                    arg0.field5089 = true;
                    if (var22 > 32767) {
                        var22 = 32767;
                    }
                    if (var21 >= 32768) {
                        arg0.field5016 = -var2.field3524;
                        arg0.field5109 = (65536 - var21) / 2;
                        if (var22 < arg0.field5109) {
                            arg0.field5109 = 65536 - var21 - var22;
                        }
                    } else {
                        arg0.field5016 = var2.field3524;
                        arg0.field5109 = var21 / 2;
                        if (arg0.field5109 > var22) {
                            arg0.field5109 = var21 - var22;
                        }
                    }
                    arg0.field5071 = 0;
                } else {
                    arg0.field5090 = arg0.field5030;
                }
            } else if (arg0.field5016 > 0) {
                if (arg0.field5109 <= arg0.field5071) {
                    arg0.field5089 = false;
                }
                if (!arg0.field5089) {
                    arg0.field5016 -= var2.field3524;
                    if (arg0.field5016 < 0) {
                        arg0.field5016 = 0;
                    }
                } else if (arg0.field5016 < var2.field3529) {
                    arg0.field5016 += var2.field3524;
                }
            } else {
                if (arg0.field5071 >= arg0.field5109) {
                    arg0.field5089 = false;
                }
                if (!arg0.field5089) {
                    arg0.field5016 += var2.field3524;
                    if (arg0.field5016 > 0) {
                        arg0.field5016 = 0;
                    }
                } else if ((-var2.field3529) < arg0.field5016) {
                    arg0.field5016 -= var2.field3524;
                }
            }
            arg0.field5090 += arg0.field5016;
            if (arg0.field5016 > 0) {
                arg0.field5071 += arg0.field5016;
            } else {
                arg0.field5071 -= arg0.field5016;
            }
            arg0.field5090 &= 0xFFFF;
            arg0.field5062 = arg0.field5090 >> 5;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public static final void method1389(boolean arg0) {
        field3497++;
        try {
            if (class221.field4065 == 1) {
                int var1 = class195.field3437.method177((byte) -94);
                if (var1 > 0 && class195.field3437.method205((byte) -85)) {
                    int var2 = var1 - class165.field2924;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class195.field3437.method188(var2, (byte) -66);
                    return;
                }
                class195.field3437.method209((byte) 122);
                class195.field3437.method178(119);
                class159.field2821 = null;
                if (class88.field1597 == null) {
                    class221.field4065 = 0;
                } else {
                    class221.field4065 = 2;
                }
                class286.field5110 = null;
            }
            if (!arg0) {
                method1381(-60, 99, -73, 34, 10, -10, 44, -109);
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class195.field3437.method209((byte) 122);
            class221.field4065 = 0;
            class88.field1597 = null;
            class159.field2821 = null;
            class286.field5110 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)V")
    public final void method1390(byte arg0) {
        if (arg0 > 107) {
            this.field3485.method394(true);
            this.field3502.method1870((byte) -100);
            field3504++;
            this.field3483 = this.field3495;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(I)V")
    public class199(int arg0) {
        this.field3483 = arg0;
        this.field3495 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field3502 = new class275(var2);
    }
}
