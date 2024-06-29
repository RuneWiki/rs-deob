import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class640 {

    @OriginalMember(owner = "client!dia", name = "j", descriptor = "Lut;")
    private class719 field8175 = new class719();

    @OriginalMember(owner = "client!dia", name = "k", descriptor = "I")
    private int field8176;

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "I")
    private int field8167;

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "Lrda;")
    private class467 field8168;

    @OriginalMember(owner = "client!dia", name = "r", descriptor = "[I")
    public static int[] field8183 = new int[13];

    @OriginalMember(owner = "client!dia", name = "p", descriptor = "I")
    public static int field8181 = 0;

    @OriginalMember(owner = "client!dia", name = "e", descriptor = "Lgh;")
    public static class54 field8170 = new class54(1, 2, 2, 0);

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "I")
    public static int field8166;

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "I")
    public static int field8169;

    @OriginalMember(owner = "client!dia", name = "f", descriptor = "I")
    public static int field8171;

    @OriginalMember(owner = "client!dia", name = "g", descriptor = "I")
    public static int field8172;

    @OriginalMember(owner = "client!dia", name = "h", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!dia", name = "i", descriptor = "I")
    public static int field8174;

    @OriginalMember(owner = "client!dia", name = "l", descriptor = "I")
    public static int field8177;

    @OriginalMember(owner = "client!dia", name = "m", descriptor = "I")
    public static int field8178;

    @OriginalMember(owner = "client!dia", name = "n", descriptor = "I")
    public static int field8179;

    @OriginalMember(owner = "client!dia", name = "o", descriptor = "I")
    public static int field8180;

    @OriginalMember(owner = "client!dia", name = "q", descriptor = "I")
    public static int field8182;

    @OriginalMember(owner = "client!dia", name = "s", descriptor = "I")
    public static int field8184;

    @OriginalMember(owner = "client!dia", name = "t", descriptor = "I")
    public static int field8185;

    @OriginalMember(owner = "client!dia", name = "u", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!dia", name = "w", descriptor = "I")
    public static int field8188;

    @OriginalMember(owner = "client!dia", name = "x", descriptor = "Len;")
    public static class117 field8189;

    @OriginalMember(owner = "client!dia", name = "v", descriptor = "[Llq;")
    public static class210[] field8187;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Z)V")
    public static void method3451(boolean arg0) {
        field8187 = null;
        field8170 = null;
        if (!arg0) {
            method3462(null, false);
        }
        field8189 = null;
        field8183 = null;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Ljava/lang/Object;Lofa;Z)V")
    public final void method3452(Object arg0, class320 arg1, boolean arg2) {
        field8184++;
        this.method3460(120, 1, arg0, arg1);
        if (!arg2) {
            field8183 = null;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)I")
    public final int method3453(int arg0) {
        field8179++;
        if (arg0 != 9653) {
            this.field8167 = 18;
        }
        return this.field8167;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIC)C")
    public static final char method3454(int arg0, int arg1, char arg2) {
        field8185++;
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 == 'Œ') {
            return 'O';
        }
        if (arg1 != 204) {
            method3461(23, null);
        }
        if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(Z)V")
    public static final void method3455(boolean arg0) {
        int var1 = 0;
        if (arg0) {
            field8170 = null;
        }
        while (class303.field3823 > var1) {
            label161: {
                class327 var3 = class718.field9426[var1];
                boolean var4 = false;
                if (var3.field4014 == null) {
                    var3.field4012--;
                    if (var3.field4012 < (var3.method1903(102) ? -1500 : -10)) {
                        var4 = true;
                    } else {
                        if (var3.field4011 == 1 && var3.field4019 == null) {
                            var3.field4019 = class543.method2949(class664.field8660, var3.field4017, 0);
                            if (var3.field4019 == null) {
                                break label161;
                            }
                            var3.field4012 += var3.field4019.method2950();
                        } else if (var3.method1903(108) && (var3.field4021 == null || var3.field4018 == null)) {
                            if (var3.field4021 == null) {
                                var3.field4021 = class74.method435(class681.field8795, var3.field4017);
                            }
                            if (var3.field4021 == null) {
                                break label161;
                            }
                            if (var3.field4018 == null) {
                                var3.field4018 = var3.field4021.method444(new int[] { 22050 });
                                if (var3.field4018 == null) {
                                    break label161;
                                }
                            }
                        }
                        if (var3.field4012 < 0) {
                            int var5 = 8192;
                            int var6;
                            if (var3.field4008 == 0) {
                                var6 = var3.field4022 * (var3.field4011 == 3 ? class485.field6252.field6928.method1340(false) : class485.field6252.field6946.method1340(false)) >> 2;
                            } else {
                                int var7 = (var3.field4008 & 0x3B26BF2) >> 24;
                                if (class422.field5564.field2895 == var7) {
                                    int var8 = (var3.field4008 & 0xFF) << 9;
                                    int var9 = class422.field5564.method190((byte) -80) << 8;
                                    int var10 = var3.field4008 >> 16 & 0xFF;
                                    int var11 = (var10 << 9) + var9 + 256 - class422.field5564.field2896;
                                    int var12 = var3.field4008 >> 8 & 0xFF;
                                    int var13 = (var12 << 9) + var9 + 256 - class422.field5564.field2900;
                                    int var14 = Math.abs(var11) + Math.abs(var13) - 512;
                                    if (var14 > var8) {
                                        var3.field4012 = -99999;
                                        break label161;
                                    }
                                    if (var14 < 0) {
                                        var14 = 0;
                                    }
                                    var6 = (var8 - var14) * class485.field6252.field6956.method1340(false) * var3.field4022 / var8 >> 2;
                                    if (var3.field4016 != null && var3.field4016 instanceof class620) {
                                        class620 var15 = (class620) var3.field4016;
                                        short var16 = var15.field7852;
                                        short var17 = var15.field7844;
                                    }
                                    if (var11 != 0 || var13 != 0) {
                                        int var18 = -class232.field3122 - ((int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D) + 4096) & 0x3FFF;
                                        if (var18 > 8192) {
                                            var18 = 16384 - var18;
                                        }
                                        int var19;
                                        if (var14 <= 0) {
                                            var19 = 8192;
                                        } else if (var14 >= 4096) {
                                            var19 = 16384;
                                        } else {
                                            var19 = (8192 - var14) / 4096 + 8192;
                                        }
                                        var5 = var18 * var19 / 8192 + (16384 - var19 >> 1);
                                    }
                                } else {
                                    var6 = 0;
                                }
                            }
                            if (var6 > 0) {
                                class701 var20 = null;
                                if (var3.field4011 == 1) {
                                    var20 = var3.field4019.method2952().method3801(class738.field9993);
                                } else if (var3.method1903(111)) {
                                    var20 = var3.field4018;
                                }
                                class635 var21 = var3.field4014 = class635.method3411(var20, var3.field4015, var6, var5);
                                var21.method3428(var3.field4009 - 1);
                                class1.field10.method41(var21);
                            }
                        }
                    }
                } else if (!var3.field4014.method1942(27475)) {
                    var4 = true;
                }
                if (var4) {
                    class303.field3823--;
                    for (int var22 = var1; var22 < class303.field3823; var22++) {
                        class718.field9426[var22] = class718.field9426[var22 + 1];
                    }
                    var1--;
                }
            }
            var1++;
        }
        field8180++;
        if (class718.field9436 && !class412.method2390(-6858)) {
            if (class485.field6252.field6905.method1340(false) != 0 && class136.field1797 != -1) {
                if (class118.field1597 == null) {
                    class636.method3433(0, class788.field10798, class485.field6252.field6905.method1340(false), 0, false, class136.field1797);
                } else {
                    class70.method420(false, class136.field1797, 0, class788.field10798, class485.field6252.field6905.method1340(false), class118.field1597, (byte) -109);
                }
            }
            class118.field1597 = null;
            class718.field9436 = false;
        } else if (class485.field6252.field6905.method1340(false) != 0 && class136.field1797 != -1 && !class412.method2390(-6858)) {
            class370.field4535++;
            class13 var2 = class659.method3587(class68.field909, 98, class384.field4797);
            var2.field130.method1496(class136.field1797, (byte) -125);
            class116.method679(var2, 0);
            class136.field1797 = -1;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lofa;I)Ljava/lang/Object;")
    public final Object method3456(class320 arg0, int arg1) {
        field8169++;
        int var3 = -82 / ((53 - arg1) / 62);
        long var4 = arg0.method1863(-8671);
        for (class728 var6 = (class728) this.field8168.method2616(var4, (byte) 53); var6 != null; var6 = (class728) this.field8168.method2615(8)) {
            if (var6.field9559.method1864((byte) -126, arg0)) {
                Object var7 = var6.method828((byte) -114);
                if (var7 != null) {
                    if (var6.method825((byte) -117)) {
                        class143 var8 = new class143(arg0, var7, var6.field9561);
                        this.field8168.method2619(var8, var6.field4108, -1);
                        this.field8175.method3862(var8, false);
                        var8.field2278 = 0L;
                        var6.method1946(-10364);
                        var6.method1084((byte) -99);
                    } else {
                        this.field8175.method3862(var6, false);
                        var6.field2278 = 0L;
                    }
                    return var7;
                }
                var6.method1946(-10364);
                var6.method1084((byte) -118);
                this.field8176 += var6.field9561;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(III)I")
    public static final int method3457(int arg0, int arg1, int arg2) {
        if (arg1 != -24562) {
            return 49;
        }
        field8172++;
        int var3 = arg2 + (arg0 * 57);
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (var5 & 0x7F8235D) >> 19;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(BLhfa;)V")
    private final void method3458(byte arg0, class728 arg1) {
        field8166++;
        if (arg0 != -56) {
            this.method3464(-122);
        }
        if (arg1 != null) {
            arg1.method1946(-10364);
            arg1.method1084((byte) -119);
            this.field8176 += arg1.field9561;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lofa;B)V")
    private final void method3459(class320 arg0, byte arg1) {
        field8177++;
        int var3 = 87 / ((45 - arg1) / 48);
        long var4 = arg0.method1863(-8671);
        for (class728 var6 = (class728) this.field8168.method2616(var4, (byte) -112); var6 != null; var6 = (class728) this.field8168.method2615(8)) {
            if (var6.field9559.method1864((byte) -121, arg0)) {
                this.method3458((byte) -56, var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IILjava/lang/Object;Lofa;)V")
    private final void method3460(int arg0, int arg1, Object arg2, class320 arg3) {
        field8178++;
        if (arg0 <= 102) {
            return;
        }
        if (this.field8167 < arg1) {
            throw new IllegalStateException("s>cs");
        }
        this.method3459(arg3, (byte) 113);
        this.field8176 -= arg1;
        while (this.field8176 < 0) {
            class728 var6 = (class728) this.field8175.method3859(0);
            this.method3458((byte) -56, var6);
        }
        class143 var5 = new class143(arg3, arg2, arg1);
        this.field8168.method2619(var5, arg3.method1863(-8671), -1);
        this.field8175.method3862(var5, false);
        var5.field2278 = 0L;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(ILmc;)Lqh;")
    public static final class164 method3461(int arg0, class234 arg1) {
        if (arg0 == -1464641040) {
            field8186++;
            return new class164(arg1.method1542(arg0 + 1464668107), arg1.method1542(arg0 + 1464668107), arg1.method1542(27067), arg1.method1542(arg0 ^ 0xA8B3304B), arg1.method1500((byte) -66), arg1.method1500((byte) -94), arg1.method1509(true));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "([[IZ)V")
    public static final void method3462(int[][] arg0, boolean arg1) {
        field8188++;
        if (arg1) {
            field8170 = null;
        }
        class207.field2840 = arg0;
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(I)V")
    public final void method3463(int arg0) {
        if (arg0 != 200) {
            method3457(-68, -25, -50);
        }
        this.field8175.method3860((byte) -125);
        field8174++;
        this.field8168.method2617(arg0 ^ 0x7044);
        this.field8176 = this.field8167;
    }

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "(I)I")
    public final int method3464(int arg0) {
        if (arg0 >= -122) {
            field8187 = null;
        }
        field8182++;
        return this.field8176;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(BI)V")
    public final void method3465(byte arg0, int arg1) {
        if (arg0 != -86) {
            method3461(-125, null);
        }
        field8171++;
        if (class270.field3559 == null) {
            return;
        }
        for (class728 var3 = (class728) this.field8175.method3855(0); var3 != null; var3 = (class728) this.field8175.method3861(true)) {
            if (var3.method825((byte) -117)) {
                if (var3.method828((byte) -111) == null) {
                    var3.method1946(-10364);
                    var3.method1084((byte) -102);
                    this.field8176 += var3.field9561;
                }
            } else if ((long) arg1 < ++var3.field2278) {
                class728 var4 = class270.field3559.method1608(var3, (byte) -119);
                this.field8168.method2619(var4, var3.field4108, arg0 + 85);
                class1.method4(-2, var4, var3);
                var3.method1946(-10364);
                var3.method1084((byte) -103);
            }
        }
    }

    @OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(I)V")
    public class640(int arg0) {
        this.field8176 = arg0;
        this.field8167 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field8168 = new class467(var2);
    }

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "(Z)V")
    public final void method3466(boolean arg0) {
        if (!arg0) {
            this.method3453(-88);
        }
        field8173++;
        for (class728 var2 = (class728) this.field8175.method3855(0); var2 != null; var2 = (class728) this.field8175.method3861(true)) {
            if (var2.method825((byte) -117)) {
                var2.method1946(-10364);
                var2.method1084((byte) -127);
                this.field8176 += var2.field9561;
            }
        }
    }
}
