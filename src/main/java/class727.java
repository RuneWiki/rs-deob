import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class727 implements Runnable {

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "Lnk;")
    private class715 field10162 = new class198();

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "Lnk;")
    private class715 field10166 = null;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field10157;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field10158;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field10159;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public static int field10163;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field10164;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field10165;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
    private int field10168;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public static int field10170;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
    public static int field10172;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
    public static int field10173;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
    public static int field10174;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "I")
    private int field10175;

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
    public static int field10176;

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "I")
    public static int field10177;

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "I")
    public static int field10178;

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "I")
    public static int field10179;

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "I")
    public static int field10180;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "J")
    private long field10171;

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "J")
    private long field10182;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "Lrj;")
    private class593 field10167;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "Ljava/lang/String;")
    private String field10169;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "Z")
    private volatile boolean field10160;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "Z")
    private boolean field10161;

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "[Lot;")
    public static class588[] field10181;

    @OriginalMember(owner = "client!bo", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field10160) {
            long var1 = class652.method3700(-1);
            synchronized (this) {
                try {
                    this.field10175++;
                    if (this.field10162 instanceof class198) {
                        this.field10162.method1193(this.field10161, 23552);
                    } else {
                        long var4 = class652.method3700(-1);
                        if (class275.field3370 == null || this.field10166 == null || this.field10166.method1196((byte) 125) == 0 || this.field10171 < var4 - ((long) this.field10166.method1196((byte) 86))) {
                            if (this.field10166 != null) {
                                this.field10161 = true;
                                this.field10166.method1190(4046);
                                this.field10166 = null;
                            }
                            if (this.field10161) {
                                class161.method997(0);
                                if (class275.field3370 != null) {
                                    class275.field3370.method378(0);
                                }
                            }
                            this.field10162.method1193(this.field10161 || class275.field3370 != null && class275.field3370.method328(), 23552);
                        } else {
                            int var6 = (int) ((var4 - this.field10171) * 255L / (long) this.field10166.method1196((byte) 27));
                            int var7 = 255 - var6;
                            int var8 = var7 << 24 | 0xFFFFFF;
                            class161.method997(0);
                            int var9 = var6 << 24 | 0xFFFFFF;
                            class275.field3370.method378(0);
                            class131 var10 = class275.field3370.method332(class705.field9926, class476.field6777, true);
                            class275.field3370.method335((byte) -128, var10);
                            this.field10166.method1193(true, 23552);
                            class275.field3370.method426();
                            var10.method512(0, 0, 0, var8, 1);
                            class275.field3370.method335((byte) -128, var10);
                            class275.field3370.method378(0);
                            this.field10162.method1193(true, 23552);
                            class275.field3370.method426();
                            var10.method512(0, 0, 0, var9, 1);
                        }
                        try {
                            if (class275.field3370 != null && !(this.field10162 instanceof class198)) {
                                class275.field3370.method388((byte) -110);
                            }
                        } catch (class266 var18) {
                            class151.method936(var18.getMessage() + " (Recovered) " + class30.field343.method1797((byte) 25), var18, 89);
                            class627.method3597(true, 0, -31618);
                        }
                    }
                    Container var12;
                    if (class537.field7761 != null) {
                        var12 = class537.field7761;
                    } else if (class255.field3123 == null) {
                        var12 = class471.field6735;
                    } else {
                        var12 = class255.field3123;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class537.field7761 == var12) {
                        class537.field7761.getInsets();
                    }
                    this.field10161 = false;
                    if (class275.field3370 != null && !(this.field10162 instanceof class198) && this.field10167.method3390(75) < class593.field8379.method3390(-127)) {
                        class390.method2404(-2);
                    }
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class652.method3700(-1);
            int var15 = (int) (20L - (var13 - var1));
            if (var15 > 0) {
                class524.method3076(1, (long) var15);
            }
        }
        field10174++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)I")
    public final int method4041(int arg0) {
        field10180++;
        if (this.field10167 == null) {
            return 0;
        }
        int var2 = this.field10167.method3390(arg0 ^ 0x57);
        if (this.field10167.field8353 && this.field10167.field8351 > this.field10168) {
            return this.field10168 + 1;
        } else if (var2 >= 0 && var2 < (client.field3743.length - 1)) {
            if (arg0 != 100) {
                this.field10171 = -44L;
            }
            return this.field10167.field8349 == this.field10168 ? this.field10167.field8351 : this.field10167.field8349;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(CBI)C")
    public static final char method4042(char arg0, byte arg1, int arg2) {
        field10159++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else {
            if (arg1 >= -105) {
                field10181 = null;
            }
            if (arg0 == 'Ÿ') {
                return 'Y';
            } else {
                return arg0;
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
    public final synchronized void method4043(int arg0) {
        this.field10161 = true;
        field10163++;
        if (arg0 != 235) {
            this.field10166 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
    public static final void method4044(int arg0) {
        field10170++;
        if (arg0 != 5) {
            field10181 = null;
        }
        while (class248.field3008.method1101((byte) -126, class741.field10364) >= 15) {
            int var1 = class248.field3008.method1102(255, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            class151 var3 = (class151) class253.field3052.method1754(false, (long) var1);
            if (var3 == null) {
                class197 var4 = new class197();
                var4.field7107 = var1;
                var3 = new class151(var4);
                class253.field3052.method1751(var3, 3970, (long) var1);
                var2 = true;
                class452.field6509[class529.field7533++] = var3;
            }
            class197 var5 = var3.field1661;
            class272.field3359[class302.field3784++] = var1;
            var5.field7127 = class698.field9818;
            if (var5.field2293 != null && var5.field2293.method1947(127)) {
                class153.method938(8, var5);
            }
            int var6 = class248.field3008.method1102(255, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class248.field3008.method1102(255, 1);
            int var8 = class248.field3008.method1102(arg0 + 250, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = class248.field3008.method1102(arg0 + 250, 2);
            var5.method1176(52, class451.field6506.method136(245, class248.field3008.method1102(255, 14)));
            int var10 = (class248.field3008.method1102(255, 3) + 4 & 0x8F200007) << 11;
            int var11 = class248.field3008.method1102(255, 1);
            if (var11 == 1) {
                class128.field1347[class702.field9897++] = var1;
            }
            var5.method2996(var5.field2293.field4227, -125);
            var5.field7135 = var5.field2293.field4201 << 3;
            if (var2) {
                var5.method2990(var10, 67, true);
            }
            var5.method1179(66, var5.method1128(-1), var9, class90.field937.field7187[0] + var8, var7 == 1, class90.field937.field7193[0] + var6);
            if (var5.field2293.method1947(127)) {
                class416.method2543(var5, var5.field7193[0], 0, null, var5.field4628, null, (byte) -91, var5.field7187[0]);
            }
        }
        class248.field3008.method1106(-112);
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)I")
    public final int method4045(int arg0) {
        field10164++;
        return arg0 <= 31 ? 55 : this.field10168;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lnk;I)V")
    public final synchronized void method4046(class715 arg0, int arg1) {
        this.field10166 = this.field10162;
        field10165++;
        this.field10162 = arg0;
        if (arg1 > -117) {
            this.field10162 = null;
        }
        this.field10171 = class652.method3700(-1);
    }

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)Z")
    public final synchronized boolean method4047(int arg0) {
        field10179++;
        return arg0 <= 98 ? true : this.field10162.method1192(this.field10171, -3762);
    }

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "(I)I")
    public final int method4048(int arg0) {
        field10158++;
        if (arg0 != -1) {
            method4042((char) 65441, (byte) 56, 36);
        }
        return this.field10175;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)J")
    public final long method4049(byte arg0) {
        if (arg0 >= -124) {
            this.field10169 = null;
        }
        field10157++;
        return this.field10182;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIBIIIILcaa;III)Z")
    public static final boolean method4050(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, class302 arg7, int arg8, int arg9, int arg10) {
        field10178++;
        int var11 = arg5;
        int var12 = arg4;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg5 - var13;
        class652.field9308[var13][var14] = 99;
        int var16 = arg4 - var14;
        class180.field2121[var13][var14] = 0;
        byte var17 = 0;
        class98.field1030[var17] = arg5;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class523.field7459[var10001] = arg4;
        int[][] var19 = arg7.field3770;
        if (arg2 != -50) {
            method4050(125, 14, (byte) 32, 20, -80, 76, 51, null, 26, 24, -40);
        }
        while (var26 != var18) {
            var12 = class523.field7459[var18];
            var11 = class98.field1030[var18];
            int var20 = var12 - arg7.field3761;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var11 - var15;
            int var22 = var12 - var16;
            int var23 = var11 - arg7.field3759;
            if (arg6 == -4) {
                if (arg1 == var11 && arg8 == var12) {
                    class215.field2500 = var11;
                    class237.field2826 = var12;
                    return true;
                }
            } else if (arg6 == -3) {
                if (class377.method2303(var12, 1, 1, arg10, arg1, 4, arg8, var11, arg3)) {
                    class215.field2500 = var11;
                    class237.field2826 = var12;
                    return true;
                }
            } else if (arg6 == -2) {
                if (arg7.method1807((byte) 88, arg8, var11, arg10, var12, arg1, arg3, arg0, 1, 1)) {
                    class215.field2500 = var11;
                    class237.field2826 = var12;
                    return true;
                }
            } else if (arg6 == -1) {
                if (arg7.method1805(arg8, var11, (byte) 53, arg3, arg1, var12, 1, arg10, arg0)) {
                    class237.field2826 = var12;
                    class215.field2500 = var11;
                    return true;
                }
            } else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
                if (arg7.method1819(var12, arg1, 2883848, arg8, var11, arg9, arg6, 1)) {
                    class215.field2500 = var11;
                    class237.field2826 = var12;
                    return true;
                }
            } else if (arg7.method1817(arg6, var12, 1, 128, arg9, var11, arg8, arg1)) {
                class215.field2500 = var11;
                class237.field2826 = var12;
                return true;
            }
            int var25 = class180.field2121[var21][var22] + 1;
            if (var21 > 0 && class652.field9308[var21 - 1][var22] == 0 && (var19[var23 - 1][var20] & 0x42240000) == 0) {
                class98.field1030[var26] = var11 - 1;
                class523.field7459[var26] = var12;
                class652.field9308[var21 - 1][var22] = 2;
                var26 = var26 + 1 & 0xFFF;
                class180.field2121[var21 - 1][var22] = var25;
            }
            if (var21 < 127 && class652.field9308[var21 + 1][var22] == 0 && (var19[var23 + 1][var20] & 0x60240000) == 0) {
                class98.field1030[var26] = var11 + 1;
                class523.field7459[var26] = var12;
                class652.field9308[var21 + 1][var22] = 8;
                var26 = var26 + 1 & 0xFFF;
                class180.field2121[var21 + 1][var22] = var25;
            }
            if (var22 > 0 && class652.field9308[var21][var22 - 1] == 0 && (var19[var23][var20 - 1] & 0x40A40000) == 0) {
                class98.field1030[var26] = var11;
                class523.field7459[var26] = var12 - 1;
                class652.field9308[var21][var22 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class180.field2121[var21][var22 - 1] = var25;
            }
            if (var22 < 127 && class652.field9308[var21][var22 + 1] == 0 && (var19[var23][var20 + 1] & 0x48240000) == 0) {
                class98.field1030[var26] = var11;
                class523.field7459[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class652.field9308[var21][var22 + 1] = 4;
                class180.field2121[var21][var22 + 1] = var25;
            }
            if (var21 > 0 && var22 > 0 && class652.field9308[var21 - 1][var22 - 1] == 0 && (var19[var23 - 1][var20 - 1] & 0x43A40000) == 0 && (var19[var23 - 1][var20] & 0x42240000) == 0 && (var19[var23][var20 - 1] & 0x40A40000) == 0) {
                class98.field1030[var26] = var11 - 1;
                class523.field7459[var26] = var12 - 1;
                class652.field9308[var21 - 1][var22 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class180.field2121[var21 - 1][var22 - 1] = var25;
            }
            if (var21 < 127 && var22 > 0 && class652.field9308[var21 + 1][var22 - 1] == 0 && (var19[var23 + 1][var20 - 1] & 0x60E40000) == 0 && (var19[var23 + 1][var20] & 0x60240000) == 0 && (var19[var23][var20 - 1] & 0x40A40000) == 0) {
                class98.field1030[var26] = var11 + 1;
                class523.field7459[var26] = var12 - 1;
                class652.field9308[var21 + 1][var22 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class180.field2121[var21 + 1][var22 - 1] = var25;
            }
            if (var21 > 0 && var22 < 127 && class652.field9308[var21 - 1][var22 + 1] == 0 && (var19[var23 - 1][var20 + 1] & 0x4E240000) == 0 && (var19[var23 - 1][var20] & 0x42240000) == 0 && (var19[var23][var20 + 1] & 0x48240000) == 0) {
                class98.field1030[var26] = var11 - 1;
                class523.field7459[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class652.field9308[var21 - 1][var22 + 1] = 6;
                class180.field2121[var21 - 1][var22 + 1] = var25;
            }
            if (var21 < 127 && var22 < 127 && class652.field9308[var21 + 1][var22 + 1] == 0 && (var19[var23 + 1][var20 + 1] & 0x78240000) == 0 && (var19[var23 + 1][var20] & 0x60240000) == 0 && (var19[var23][var20 + 1] & 0x48240000) == 0) {
                class98.field1030[var26] = var11 + 1;
                class523.field7459[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class652.field9308[var21 + 1][var22 + 1] = 12;
                class180.field2121[var21 + 1][var22 + 1] = var25;
            }
        }
        class215.field2500 = var11;
        class237.field2826 = var12;
        return false;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lrj;IJBLjava/lang/String;)V")
    public final synchronized void method4051(class593 arg0, int arg1, long arg2, byte arg3, String arg4) {
        this.field10168 = arg1;
        if (arg3 == -41) {
            this.field10169 = arg4;
            this.field10167 = arg0;
            this.field10182 = arg2;
            field10176++;
        }
    }

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "(I)Ljava/lang/String;")
    public final String method4052(int arg0) {
        field10177++;
        return arg0 == 99 ? this.field10169 : null;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)V")
    public static void method4053(byte arg0) {
        field10181 = null;
        if (arg0 > -124) {
            method4053((byte) 36);
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)Lrj;")
    public final class593 method4054(byte arg0) {
        field10172++;
        if (arg0 != 104) {
            this.field10166 = null;
        }
        return this.field10167;
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(B)V")
    public final void method4055(byte arg0) {
        this.field10160 = true;
        if (arg0 <= -121) {
            field10173++;
        }
    }
}
