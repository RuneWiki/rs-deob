import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class14 {

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    private int field293 = 65000;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "Lob;")
    private class90 field312 = null;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "Lob;")
    private class90 field311 = null;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "[Lad;")
    public static class5[] field295 = new class5[4];

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field296 = 0;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "Lkc;")
    public static class67 field307 = class19.method144("Sie haben gerade eine andere Welt verlassen)3", 85);

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "Lkc;")
    public static class67 field310 = class19.method144("Sprites geladen)3", 110);

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "Lkc;")
    private static class67 field288 = class19.method144("RuneScape is loading )2 please wait)3)3)3", 97);

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Lkc;")
    private static class67 field290 = class19.method144("Loading sprites )2 ", 92);

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "Lkc;")
    public static class67 field303 = field288;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "Lkc;")
    public static class67 field298 = field290;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "Ldf;")
    public static class28 field301;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "Ldf;")
    public static class28 field306;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "Lac;")
    public static class4 field299;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "Z")
    public static boolean field302;

    @OriginalMember(owner = "client!bf", name = "toString", descriptor = "()Ljava/lang/String;", line = 13)
    public final String toString() {
        field289++;
        return "Cache:" + this.field297;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 26)
    public static final void method113(int arg0) {
        field287++;
        class54.field1295.method713(503, 243);
        class116.field2733++;
        if (class114.field2671 != -1) {
            class88.method686((byte) 2, class114.field2671);
            class98.field2218 = -1;
            class114.field2671 = -1;
            class96.field2165 = true;
            class121.field2849 = true;
        }
        if (class63.field1487 != -1) {
            class88.method686((byte) 2, class63.field1487);
            class138.field3304 = true;
            class63.field1487 = -1;
            class98.field2218 = -1;
        }
        if (class59.field1387 != -1) {
            class88.method686((byte) 2, class59.field1387);
            class59.field1387 = -1;
            class126.method981(30, (byte) -120);
        }
        if (class11.field246 != -1) {
            class88.method686((byte) 2, class11.field246);
            class11.field246 = -1;
        }
        if (class96.field2163 != arg0) {
            class88.method686((byte) 2, class96.field2163);
            class98.field2218 = -1;
            class96.field2163 = -1;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(JB)V", line = 87)
    public static final void method114(long arg0, byte arg1) {
        field300++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class128.field3003; var3++) {
            if (class5.field112[var3] == arg0) {
                class55.field1332++;
                class128.field3003--;
                class121.field2849 = true;
                for (int var4 = var3; var4 < class128.field3003; var4++) {
                    class5.field112[var4] = class5.field112[var4 + 1];
                }
                class54.field1295.method713(503, 106);
                class54.field1295.method1083((byte) -128, arg0);
                break;
            }
        }
        if (arg1 <= 121) {
            field290 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIILqc;)V", line = 128)
    public static final void method115(int arg0, int arg1, int arg2, class103 arg3) {
        if (arg3.field1216 == arg2 && arg2 != -1) {
            int var4 = class70.method576(12, arg2).field2580;
            if (var4 == 1) {
                arg3.field1207 = arg0;
                arg3.field1188 = 0;
                arg3.field1252 = 0;
                arg3.field1250 = 0;
            }
            if (var4 == 2) {
                arg3.field1252 = 0;
            }
        } else if (arg2 == -1 || arg3.field1216 == -1 || class70.method576(12, arg2).field2567 >= class70.method576(12, arg3.field1216).field2567) {
            arg3.field1246 = arg3.field1201;
            arg3.field1250 = 0;
            arg3.field1207 = arg0;
            arg3.field1216 = arg2;
            arg3.field1252 = 0;
            arg3.field1188 = 0;
        }
        if (arg1 >= -126) {
            method113(-39);
        }
        field313++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([BI)V", line = 172)
    public static final void method116(byte[] arg0, int arg1) {
        field304++;
        class140 var2 = new class140(arg0);
        var2.field3347 = arg0.length - 2;
        class97.field2207 = var2.method1072(17);
        class112.field2596 = new int[class97.field2207];
        class80.field1906 = new int[class97.field2207];
        class54.field1310 = new byte[class97.field2207][];
        class46.field1121 = new int[class97.field2207];
        class34.field829 = new int[class97.field2207];
        var2.field3347 = arg0.length - class97.field2207 * 8 - 7;
        class116.field2735 = var2.method1072(18);
        class12.field266 = var2.method1072(20);
        int var3 = (var2.method1105(arg1 ^ 0xFFFFADF6) & 0xFF) + 1;
        for (int var4 = 0; var4 < class97.field2207; var4++) {
            class34.field829[var4] = var2.method1072(3);
        }
        if (arg1 != -21239) {
            field290 = null;
        }
        for (int var5 = 0; var5 < class97.field2207; var5++) {
            class80.field1906[var5] = var2.method1072(class63.method487(arg1, -21124));
        }
        for (int var6 = 0; var6 < class97.field2207; var6++) {
            class112.field2596[var6] = var2.method1072(12);
        }
        for (int var7 = 0; var7 < class97.field2207; var7++) {
            class46.field1121[var7] = var2.method1072(26);
        }
        var2.field3347 = arg0.length - class97.field2207 * 8 - (var3 - 1) * 3 - 7;
        class55.field1345 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class55.field1345[var8] = var2.method1114(false);
            if (class55.field1345[var8] == 0) {
                class55.field1345[var8] = 1;
            }
        }
        var2.field3347 = 0;
        for (int var9 = 0; var9 < class97.field2207; var9++) {
            int var10 = class112.field2596[var9];
            int var11 = class46.field1121[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class54.field1310[var9] = var13;
            int var14 = var2.method1105(arg1 ^ 0xFFFFADF6);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method1112((byte) 125);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var10 * var16 + var15] = var2.method1112((byte) 127);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)[B", line = 298)
    public final byte[] method117(boolean arg0, int arg1) {
        field305++;
        class90 var3 = this.field312;
        synchronized (this.field312) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field311.method697(78)) {
                    return null;
                }
                this.field311.method700(0, (long) (arg1 * 6));
                this.field311.method694((byte) 119, 0, class20.field420, 6);
                int var5 = (class20.field420[5] & 0xFF) + ((class20.field420[4] & 0xFF) << 8) + ((class20.field420[3] & 0xFF) << 16);
                if (arg0) {
                    return null;
                }
                int var7 = ((class20.field420[1] & 0xFF) << 8) + ((class20.field420[0] & 0xFF) << 16) + (class20.field420[2] & 0xFF);
                if (var7 < 0 || var7 > this.field293) {
                    return null;
                } else if (var5 > 0 && (long) var5 <= this.field312.method697(95) / 520L) {
                    int var10 = 0;
                    byte[] var11 = new byte[var7];
                    int var12 = 0;
                    while (var10 < var7) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field312.method700(0, (long) (var5 * 520));
                        int var14 = var7 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field312.method694((byte) 107, 0, class20.field420, var14 + 8);
                        int var15 = ((class20.field420[2] & 0xFF) << 8) + (class20.field420[3] & 0xFF);
                        int var16 = ((class20.field420[5] & 0xFF) << 8) + ((class20.field420[4] & 0xFF) << 16) + (class20.field420[6] & 0xFF);
                        int var17 = ((class20.field420[0] & 0xFF) << 8) + (class20.field420[1] & 0xFF);
                        int var18 = class20.field420[7] & 0xFF;
                        if (arg1 == var17 && var12 == var15 && this.field297 == var18) {
                            if (var16 >= 0 && (long) var16 <= this.field312.method697(117) / 520L) {
                                var5 = var16;
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var11[var10++] = class20.field420[var21 + 8];
                                }
                                var12++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var11;
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(ILob;Lob;I)V", line = 1463)
    public class14(int arg0, class90 arg1, class90 arg2, int arg3) {
        this.field311 = arg2;
        this.field312 = arg1;
        this.field297 = arg0;
        this.field293 = arg3;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V", line = 385)
    public static void method118(boolean arg0) {
        field298 = null;
        field288 = null;
        field299 = null;
        field306 = null;
        field301 = null;
        if (!arg0) {
            field301 = null;
        }
        field310 = null;
        field303 = null;
        field295 = null;
        field307 = null;
        field290 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([BIIZI)Z", line = 409)
    private final boolean method119(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field309++;
        class90 var6 = this.field312;
        synchronized (this.field312) {
            try {
                int var7;
                if (arg3) {
                    if (this.field311.method697(78) < (long) (arg4 * 6 + 6)) {
                        return false;
                    }
                    this.field311.method700(0, (long) (arg4 * 6));
                    this.field311.method694((byte) 118, 0, class20.field420, 6);
                    var7 = (class20.field420[5] & 0xFF) + (((class20.field420[3] & 0xFF) << 16) + ((class20.field420[4] & 0xFF) << 8));
                    if (var7 <= 0 || (long) var7 > this.field312.method697(117) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field312.method697(126) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class20.field420[0] = (byte) (arg1 >> 16);
                class20.field420[5] = (byte) var7;
                class20.field420[3] = (byte) (var7 >> 16);
                class20.field420[1] = (byte) (arg1 >> 8);
                class20.field420[4] = (byte) (var7 >> 8);
                if (arg2 >= -28) {
                    return true;
                }
                int var11 = 0;
                class20.field420[2] = (byte) arg1;
                this.field311.method700(0, (long) (arg4 * 6));
                this.field311.method703(6, 0, (byte) -73, class20.field420);
                int var12 = 0;
                while (arg1 > var11) {
                    int var13 = 0;
                    if (arg3) {
                        label110: {
                            this.field312.method700(0, (long) (var7 * 520));
                            try {
                                this.field312.method694((byte) 118, 0, class20.field420, 8);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = ((class20.field420[0] & 0xFF) << 8) + (class20.field420[1] & 0xFF);
                            var13 = ((class20.field420[4] & 0xFF) << 16) + (class20.field420[6] & 0xFF) + ((class20.field420[5] & 0xFF) << 8);
                            int var15 = class20.field420[7] & 0xFF;
                            int var16 = ((class20.field420[2] & 0xFF) << 8) + (class20.field420[3] & 0xFF);
                            if (arg4 == var14 && var12 == var16 && this.field297 == var15) {
                                if (var13 >= 0 && this.field312.method697(74) / 520L >= (long) var13) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg3 = false;
                        var13 = (int) ((this.field312.method697(94) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class20.field420[0] = (byte) (arg4 >> 8);
                    int var19 = arg1 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class20.field420[7] = (byte) this.field297;
                    class20.field420[1] = (byte) arg4;
                    class20.field420[2] = (byte) (var12 >> 8);
                    if (arg1 - var11 <= 512) {
                        var13 = 0;
                    }
                    class20.field420[6] = (byte) var13;
                    class20.field420[4] = (byte) (var13 >> 16);
                    class20.field420[5] = (byte) (var13 >> 8);
                    class20.field420[3] = (byte) var12;
                    var12++;
                    this.field312.method700(0, (long) (var7 * 520));
                    this.field312.method703(8, 0, (byte) -39, class20.field420);
                    this.field312.method703(var19, var11, (byte) 106, arg0);
                    var7 = var13;
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([Led;IIIIIIIII)Z", line = 529)
    public static final boolean method120(class33[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field291++;
        class68.method555(arg6, arg3, arg7, arg5);
        boolean var10 = true;
        for (int var11 = arg2; var11 < arg0.length; var11++) {
            class33 var12 = arg0[var11];
            if (var12 != null && var12.field719 == arg4) {
                if (var12.field764 > 0) {
                    class33.method281(var12, (byte) 15);
                }
                int var13 = var12.field813 + arg6 - arg8;
                int var14 = arg3 + var12.field750 - arg1;
                int var15 = var12.field792;
                if (class31.field654 == var12) {
                    class33 var16 = class11.method98((byte) 80, var12);
                    if (var16 == null) {
                        class31.field654 = null;
                    } else {
                        int[] var17 = class38.method310(false, var16);
                        int[] var18 = class38.method310(false, var12);
                        if (!var12.field798) {
                            var15 = 128;
                        }
                        int var19 = class138.field3298 - class129.field3031;
                        int var20 = class80.field1889 - class75.field1800;
                        if (var12.field799 >= var19 && -var12.field799 <= var19 && var12.field799 >= var20 && -var12.field799 <= var20 && !class88.field2034) {
                            var19 = 0;
                            var20 = 0;
                        } else if (var12.field795 < class63.field1480 || class88.field2034) {
                            class88.field2034 = true;
                        } else {
                            var19 = 0;
                            var20 = 0;
                        }
                        int var21 = var18[1] + var20 - var17[1];
                        if (var21 < 0) {
                            var21 = 0;
                        }
                        int var22 = var19 + var18[0] - var17[0];
                        if (var16.field704 < var12.field704 + var21) {
                            var21 = var16.field704 - var12.field704;
                        }
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        if (var16.field733 < var22 + var12.field733) {
                            var22 = var16.field733 - var12.field733;
                        }
                        var13 = var17[0] + var22;
                        var14 = var17[1] + var21;
                    }
                }
                if ((!var12.field722 || class68.field1626 >= var13 && var14 <= class68.field1624 && class68.field1627 <= var12.field733 + var13 && class68.field1629 <= var12.field704 + var14) && (!var12.field722 || !class99.method760(arg2 + 18547, var12))) {
                    if (var12.field729 == 0) {
                        if (!var12.field722 && class99.method760(18547, var12) && !class58.method459(var11, (byte) -45, arg9)) {
                            continue;
                        }
                        if (!var12.field722) {
                            if (var12.field806 > var12.field752 - var12.field704) {
                                var12.field806 = var12.field752 - var12.field704;
                            }
                            if (var12.field806 < 0) {
                                var12.field806 = 0;
                            }
                        }
                        var10 &= method120(arg0, var12.field806, 0, var14, var12.field740, var12.field704 + var14, var13, var12.field733 + var13, var12.field728, arg9);
                        if (var12.field700 != null) {
                            var10 &= method120(var12.field700, var12.field806, arg2, var14, var12.field740, var12.field704 + var14, var13, var12.field733 + var13, var12.field728, arg9);
                        }
                        class68.method555(arg6, arg3, arg7, arg5);
                        if (var12.field704 < var12.field752 && !var12.field722) {
                            class112.method852(var12.field806, (byte) -4, var14, var12.field752, var12.field704, var12.field733 + var13);
                        }
                    }
                    if (var12.field729 != 1) {
                        if (var12.field729 == 2) {
                            int var23 = 0;
                            for (int var24 = 0; var24 < var12.field704; var24++) {
                                for (int var25 = 0; var25 < var12.field733; var25++) {
                                    int var26 = (var12.field760 + 32) * var25 + var13;
                                    int var27 = (var12.field796 + 32) * var24 + var14;
                                    if (var23 < 20) {
                                        var26 += var12.field716[var23];
                                        var27 += var12.field734[var23];
                                    }
                                    if (var12.field778[var23] > 0) {
                                        boolean var28 = false;
                                        boolean var29 = false;
                                        int var30 = var12.field778[var23] - 1;
                                        if (class68.field1627 - 32 < var26 && class68.field1626 > var26 && var27 > class68.field1629 - 32 && var27 < class68.field1624 || class75.field1796 != 0 && class94.field2158 == var23) {
                                            class86 var31;
                                            if (class25.field535 == 1 && class134.field3192 == var23 && class99.field2225 == var12.field740) {
                                                var31 = class134.method1040(0, var30, arg2 + 1, var12.field738[var23], false, 2);
                                            } else {
                                                var31 = class134.method1040(3153952, var30, arg2 ^ 0x1, var12.field738[var23], false, 1);
                                            }
                                            if (var31 == null) {
                                                var10 = false;
                                            } else if (class75.field1796 != 0 && class94.field2158 == var23 && class122.field2864 == var12.field740) {
                                                int var32 = class80.field1889 - class18.field352;
                                                if (var32 < 5 && var32 > -5) {
                                                    var32 = 0;
                                                }
                                                int var33 = class138.field3298 - class119.field2811;
                                                if (var33 < 5 && var33 > -5) {
                                                    var33 = 0;
                                                }
                                                if (class81.field1942 < 5) {
                                                    var33 = 0;
                                                    var32 = 0;
                                                }
                                                var31.method663(var26 + var33, var27 - -var32, 128);
                                                if (arg4 != -1) {
                                                    class33 var34 = arg0[arg4 & 0xFFFF];
                                                    if (var27 + var32 < class68.field1629 && var34.field806 > 0) {
                                                        int var35 = (class68.field1629 - var32 - var27) * class121.field2830 / 3;
                                                        if (class121.field2830 * 10 < var35) {
                                                            var35 = class121.field2830 * 10;
                                                        }
                                                        if (var34.field806 < var35) {
                                                            var35 = var34.field806;
                                                        }
                                                        var34.field806 -= var35;
                                                        class18.field352 += var35;
                                                    }
                                                    if (var27 + var32 + 32 > class68.field1624 && var34.field752 - var34.field704 > var34.field806) {
                                                        int var36 = (var27 + var32 + 32 - class68.field1624) * class121.field2830 / 3;
                                                        if (var36 > class121.field2830 * 10) {
                                                            var36 = class121.field2830 * 10;
                                                        }
                                                        if (var34.field752 - var34.field704 - var34.field806 < var36) {
                                                            var36 = var34.field752 - var34.field806 - var34.field704;
                                                        }
                                                        var34.field806 += var36;
                                                        class18.field352 -= var36;
                                                    }
                                                }
                                            } else if (class25.field533 != 0 && class126.field2936 == var23 && class85.field2002 == var12.field740) {
                                                var31.method663(var26, var27, 128);
                                            } else {
                                                var31.method661(var26, var27);
                                            }
                                        }
                                    } else if (var12.field718 != null && var23 < 20) {
                                        class86 var37 = var12.method282(var23, false);
                                        if (var37 != null) {
                                            var37.method661(var26, var27);
                                        } else if (class82.field1958) {
                                            var10 = false;
                                        }
                                    }
                                    var23++;
                                }
                            }
                        } else if (var12.field729 == 3) {
                            int var38;
                            if (class48.method400(var12, (byte) -55)) {
                                var38 = var12.field735;
                                if (class58.method459(var11, (byte) 111, arg9) && var12.field805 != 0) {
                                    var38 = var12.field805;
                                }
                            } else {
                                var38 = var12.field754;
                                if (class58.method459(var11, (byte) -123, arg9) && var12.field763 != 0) {
                                    var38 = var12.field763;
                                }
                            }
                            if (var15 == 0) {
                                if (var12.field773) {
                                    class68.method569(var13, var14, var12.field733, var12.field704, var38);
                                } else {
                                    class68.method561(var13, var14, var12.field733, var12.field704, var38);
                                }
                            } else if (var12.field773) {
                                class68.method570(var13, var14, var12.field733, var12.field704, var38, 256 - (var15 & 0xFF));
                            } else {
                                class68.method568(var13, var14, var12.field733, var12.field704, var38, 256 - (var15 & 0xFF));
                            }
                        } else if (var12.field729 == 4) {
                            class28 var39 = var12.method278(-1524);
                            if (var39 != null) {
                                class67 var40 = var12.field737;
                                int var41;
                                if (class48.method400(var12, (byte) -55)) {
                                    var41 = var12.field735;
                                    if (class58.method459(var11, (byte) -71, arg9) && var12.field805 != 0) {
                                        var41 = var12.field805;
                                    }
                                    if (var12.field723.method539(2618) > 0) {
                                        var40 = var12.field723;
                                    }
                                } else {
                                    var41 = var12.field754;
                                    if (class58.method459(var11, (byte) -87, arg9) && var12.field763 != 0) {
                                        var41 = var12.field763;
                                    }
                                }
                                if (var12.field722 && var12.field783 != -1) {
                                    class131 var42 = class55.method440(var12.field783, 21467);
                                    var40 = var42.field3103;
                                    if (var40 == null) {
                                        var40 = class141.field3403;
                                    }
                                    if ((var42.field3104 == 1 || var12.field762 != 1) && var12.field762 != -1) {
                                        var40 = class63.method479(new class67[] { var40, class126.field2952, class64.method495(var12.field762, 120) }, 0);
                                    }
                                }
                                if (class98.field2218 == var12.field740 && class127.field2972 == var12.field800) {
                                    var41 = var12.field754;
                                    var40 = class133.field3156;
                                }
                                if (class68.field1628 == 479) {
                                    if (var41 == 16776960) {
                                        var41 = 255;
                                    }
                                    if (var41 == 49152) {
                                        var41 = 16777215;
                                    }
                                }
                                class67 var43 = class61.method477(arg2, var40, var12);
                                var39.method238(var43, var13, var14, var12.field733, var12.field704, var41, var12.field712, var12.field714, var12.field808, var12.field755);
                            } else if (class82.field1958) {
                                var10 = false;
                            }
                        } else if (var12.field729 == 5) {
                            if (var12.field722) {
                                class86 var44;
                                if (var12.field783 == -1) {
                                    var44 = var12.method280(false, arg2 ^ 0x6D);
                                } else {
                                    var44 = class134.method1040(var12.field790, var12.field783, 1, var12.field762, false, var12.field758);
                                }
                                if (var44 != null) {
                                    int var45 = var44.field2018;
                                    int var46 = var44.field2019;
                                    if (var12.field705) {
                                        int var48 = var13;
                                        int var49 = var14;
                                        int[] var50 = new int[4];
                                        class68.method560(var50);
                                        int var51 = var12.field704 + var14;
                                        if (var50[0] > var13) {
                                            var48 = var50[0];
                                        }
                                        if (var51 > var50[3]) {
                                            var51 = var50[3];
                                        }
                                        if (var50[1] > var14) {
                                            var49 = var50[1];
                                        }
                                        int var52 = var13 + var12.field733;
                                        if (var50[2] < var52) {
                                            var52 = var50[2];
                                        }
                                        class68.method555(var48, var49, var52, var51);
                                        int var53 = (var12.field704 + var46 - 1) / var46;
                                        int var54 = (var12.field733 + var45 - 1) / var45;
                                        for (int var55 = 0; var55 < var54; var55++) {
                                            for (int var56 = 0; var56 < var53; var56++) {
                                                if (var12.field699 != 0) {
                                                    var44.method664(var45 * var55 + var45 / 2 + var13, var46 / 2 + var46 * var56 + var14, var12.field699, 4096);
                                                } else if (var15 == 0) {
                                                    var44.method661(var45 * var55 + var13, var14 - -(var46 * var56));
                                                } else {
                                                    var44.method663(var45 * var55 + var13, var46 * var56 + var14, 256 - (var15 & 0xFF));
                                                }
                                            }
                                        }
                                        class68.method564(var50);
                                    } else {
                                        int var47 = var12.field733 * 4096 / var45;
                                        if (var12.field699 != 0) {
                                            var44.method664(var12.field733 / 2 + var13, var14 - -(var12.field704 / 2), var12.field699, var47);
                                        } else if (var15 != 0) {
                                            var44.method681(var13, var14, var12.field733, var12.field704, 256 - (var15 & 0xFF));
                                        } else if (var12.field733 == var45 && var12.field704 == var46) {
                                            var44.method661(var13, var14);
                                        } else {
                                            var44.method667(var13, var14, var12.field733, var12.field704);
                                        }
                                    }
                                } else if (class82.field1958) {
                                    var10 = false;
                                }
                            } else {
                                class86 var57 = var12.method280(class48.method400(var12, (byte) -55), arg2 + 118);
                                if (var57 != null) {
                                    var57.method661(var13, var14);
                                } else if (class82.field1958) {
                                    var10 = false;
                                }
                            }
                        } else if (var12.field729 == 6) {
                            boolean var58 = class48.method400(var12, (byte) -55);
                            int var59;
                            if (var58) {
                                var59 = var12.field717;
                            } else {
                                var59 = var12.field715;
                            }
                            Object var60 = null;
                            class39 var61;
                            if (var12.field779 == 5) {
                                if (var12.field696 == 0) {
                                    var61 = class60.field1428.method1022(null, null, true, -1, -1);
                                } else {
                                    var61 = class69.field1640.method190((byte) -93);
                                }
                            } else if (var59 == -1) {
                                var61 = var12.method285(126, class69.field1640.field2334, -1, var58, null);
                                if (var61 == null && class82.field1958) {
                                    var10 = false;
                                }
                            } else {
                                class112 var62 = class70.method576(arg2 + 12, var59);
                                var61 = var12.method285(127, class69.field1640.field2334, var12.field747, var58, var62);
                                if (var61 == null && class82.field1958) {
                                    var10 = false;
                                }
                            }
                            int var63 = 0;
                            if (var12.field783 != -1) {
                                class131 var64 = class55.method440(var12.field783, arg2 + 21467);
                                if (var64 != null) {
                                    class131 var65 = var64.method1014(var12.field762, (byte) 28);
                                    var61 = var65.method1010(true, 20915, 1);
                                    if (var61 != null) {
                                        var63 = var61.field510 / 2;
                                    }
                                }
                            }
                            class105.method802(var12.field733 / 2 + var13, var14 - -(var12.field704 / 2));
                            int var66 = class105.field2354[var12.field724] * var12.field761 >> 16;
                            int var67 = class105.field2365[var12.field724] * var12.field761 >> 16;
                            if (var61 != null) {
                                if (var12.field722) {
                                    var61.method325();
                                    if (var12.field780) {
                                        var61.method316(0, var12.field742, var12.field812, var12.field724, var12.field768, var67 + var12.field739 + var63, var12.field739 + var66, var12.field761);
                                    } else {
                                        var61.method330(0, var12.field742, var12.field812, var12.field724, var12.field768, var63 + var67 + var12.field739, var12.field739 + var66);
                                    }
                                } else {
                                    var61.method330(0, var12.field742, 0, var12.field724, 0, var67, var66);
                                }
                            }
                            class105.method806();
                        } else {
                            if (var12.field729 == 7) {
                                class28 var68 = var12.method278(arg2 ^ 0xFFFFFA0C);
                                if (var68 == null) {
                                    if (class82.field1958) {
                                        var10 = false;
                                    }
                                    continue;
                                }
                                int var69 = 0;
                                for (int var70 = 0; var70 < var12.field704; var70++) {
                                    for (int var71 = 0; var71 < var12.field733; var71++) {
                                        if (var12.field778[var69] > 0) {
                                            class131 var72 = class55.method440(var12.field778[var69] - 1, 21467);
                                            class67 var73 = var72.field3103;
                                            if (var73 == null) {
                                                var73 = class141.field3403;
                                            }
                                            if (var72.field3104 == 1 || var12.field738[var69] != 1) {
                                                var73 = class63.method479(new class67[] { var73, class126.field2952, class64.method495(var12.field738[var69], 123) }, 0);
                                            }
                                            int var74 = (var12.field796 + 12) * var70 + var14;
                                            int var75 = (var12.field760 + 115) * var71 + var13;
                                            if (var12.field714 == 0) {
                                                var68.method248(var73, var75, var74, var12.field754, var12.field712);
                                            } else if (var12.field714 == 1) {
                                                var68.method230(var73, var75 + var12.field733 / 2, var74, var12.field754, var12.field712);
                                            } else {
                                                var68.method245(var73, var75 + var12.field733 - 1, var74, var12.field754, var12.field712);
                                            }
                                        }
                                        var69++;
                                    }
                                }
                            }
                            if (var12.field729 == 8 && class94.method739(var11, 3, arg9) && class42.field1024 == class21.field435) {
                                int var76 = 0;
                                int var77 = 0;
                                class67 var78 = var12.field737;
                                class28 var79 = field301;
                                class67 var80 = class61.method477(arg2, var78, var12);
                                while (var80.method539(2618) > 0) {
                                    int var88 = var80.method520(class101.field2264, -10874);
                                    class67 var89;
                                    if (var88 == -1) {
                                        var89 = var80;
                                        var80 = class127.field2976;
                                    } else {
                                        var89 = var80.method529(0, var88, 17804);
                                        var80 = var80.method531(arg2 + 13401, var88 - -2);
                                    }
                                    int var90 = var79.method235(var89);
                                    if (var77 < var90) {
                                        var77 = var90;
                                    }
                                    var76 += var79.field592 + 1;
                                }
                                var76 += 7;
                                var77 += 6;
                                int var81 = var12.field733 + var13 - var77 - 5;
                                if (var81 < var13 + 5) {
                                    var81 = var13 + 5;
                                }
                                int var82 = var12.field704 + var14 + 5;
                                if (arg5 < var76 + var82) {
                                    var82 = arg5 - var76;
                                }
                                if (var77 + var81 > arg7) {
                                    var81 = arg7 - var77;
                                }
                                class68.method569(var81, var82, var77, var76, 16777120);
                                class68.method561(var81, var82, var77, var76, 0);
                                int var83 = var82 + var79.field592 + 2;
                                class67 var84 = var12.field737;
                                class67 var85 = class61.method477(0, var84, var12);
                                while (var85.method539(2618) > 0) {
                                    int var86 = var85.method520(class101.field2264, arg2 ^ 0xFFFFD586);
                                    class67 var87;
                                    if (var86 == -1) {
                                        var87 = var85;
                                        var85 = class127.field2976;
                                    } else {
                                        var87 = var85.method529(0, var86, 17804);
                                        var85 = var85.method531(13401, var86 + 2);
                                    }
                                    var79.method248(var87, var81 + 3, var83, 0, false);
                                    var83 += var79.field592 + 1;
                                }
                            }
                            if (var12.field729 == 9) {
                                if (var12.field793 == 1) {
                                    class68.method566(var13, var14, var12.field733 + var13, var12.field704 + var14, var12.field754);
                                } else {
                                    int var91 = var12.field733 >= 0 ? var12.field733 : -var12.field733;
                                    int var92 = var12.field704 < 0 ? -var12.field704 : var12.field704;
                                    int var93 = var91;
                                    if (var92 > var91) {
                                        var93 = var92;
                                    }
                                    if (var93 != 0) {
                                        int var94 = (var12.field733 << 16) / var93;
                                        int var95 = (var12.field704 << 16) / var93;
                                        if (var95 > var94) {
                                            var95 = -var95;
                                        } else {
                                            var94 = -var94;
                                        }
                                        int var96 = var12.field793 * var95 >> 17;
                                        int var97 = var13 + var96;
                                        int var98 = var12.field793 * var94 >> 17;
                                        int var99 = var12.field793 * var94 + 1 >> 17;
                                        int var100 = var12.field793 * var95 + 1 >> 17;
                                        int var101 = var13 - var100;
                                        int var102 = var14 + var98;
                                        int var103 = var12.field704 + var14 + var98;
                                        int var104 = var13 + var96 + var12.field733;
                                        int var105 = var12.field733 + var13 - var100;
                                        int var106 = var12.field704 + var14 - var99;
                                        int var107 = var14 - var99;
                                        class105.method794(var97, var101, var105);
                                        class105.method792(var102, var107, var106, var97, var101, var105, var12.field754);
                                        class105.method794(var97, var105, var104);
                                        class105.method792(var102, var106, var103, var97, var105, var104, var12.field754);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return var10;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[BI)Z", line = 1338)
    public final boolean method121(int arg0, int arg1, byte[] arg2, int arg3) {
        field285++;
        class90 var5 = this.field312;
        synchronized (this.field312) {
            if (arg1 < 0 || this.field293 < arg1) {
                throw new IllegalArgumentException();
            } else if (arg3 <= 91) {
                return false;
            } else {
                boolean var7 = this.method119(arg2, arg1, -43, true, arg0);
                if (!var7) {
                    var7 = this.method119(arg2, arg1, -63, false, arg0);
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII)V", line = 1398)
    public static final void method122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field286++;
        int var7 = 0;
        int var8 = 2048 - arg2 & 0x7FF;
        int var9 = 0;
        int var10 = 2048 - arg3 & 0x7FF;
        if (arg1 != 1300942544) {
            field290 = null;
        }
        int var11 = arg4;
        if (var10 != 0) {
            int var12 = class39.field951[var10];
            int var13 = class39.field941[var10];
            int var14 = var9 * var13 - arg4 * var12 >> 16;
            var11 = var9 * var12 + arg4 * var13 >> 16;
            var9 = var14;
        }
        if (var8 != 0) {
            int var15 = class39.field951[var8];
            int var16 = class39.field941[var8];
            int var17 = var7 * var16 + var11 * var15 >> 16;
            var11 = var11 * var16 - var7 * var15 >> 16;
            var7 = var17;
        }
        class116.field2737 = arg3;
        class74.field1776 = arg0 - var11;
        class65.field1535 = arg2;
        class133.field3164 = arg6 - var9;
        class127.field2980 = arg5 - var7;
    }
}
