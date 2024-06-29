import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class261 {

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Lmga;")
    private class666 field3586 = new class666(64);

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "Lmga;")
    public class666 field3591 = new class666(64);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "Lbi;")
    public class449 field3579;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "Lbi;")
    private class449 field3582;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Z")
    public static boolean field3587 = false;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field3589 = 0;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V", line = 3)
    public final void method1594(int arg0, byte arg1) {
        class666 var3 = this.field3586;
        synchronized (this.field3586) {
            int var4 = 9 % ((arg1 - 1) / 41);
            this.field3586.method3740((byte) 60, arg0);
        }
        field3585++;
        class666 var5 = this.field3591;
        synchronized (this.field3591) {
            this.field3591.method3740((byte) 60, arg0);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V", line = 19)
    public final void method1595(int arg0, int arg1, int arg2) {
        field3588++;
        this.field3586 = new class666(arg0);
        this.field3591 = new class666(arg1);
        if (arg2 != -3932) {
            method1602(null, (byte) -76, -124, -8);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 34)
    public static final int method1596(String arg0, int arg1) {
        field3590++;
        if (!class318.field4367.field6915) {
            return -1;
        } else if (class400.field5311.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class199.method1284(arg0, arg1 ^ 0x6E3E);
            if (var2 == null) {
                return -1;
            } else if (arg1 == -1) {
                String var3 = class166.field2585 + var2;
                if (!class103.field1540.method2553(0, "", var3)) {
                    return -1;
                } else if (class103.field1540.method2522(var3, (byte) -33)) {
                    byte[] var4 = class103.field1540.method2532(var3, "", arg1 ^ 0x5FC5);
                    File var5 = class598.method3295((byte) 13, var2);
                    if (var4 == null || var5 == null) {
                        return -1;
                    }
                    boolean var6 = true;
                    byte[] var7 = class262.method1605(true, var5);
                    if (var7 != null && var4.length == var7.length) {
                        for (int var8 = 0; var8 < var7.length; var8++) {
                            if (var4[var8] != var7[var8]) {
                                var6 = false;
                                break;
                            }
                        }
                    } else {
                        var6 = false;
                    }
                    try {
                        if (!var6) {
                            class318.field4367.method2908(false, var5, var4);
                        }
                    } catch (Throwable var9) {
                        return -1;
                    }
                    class425.method2434(0, var5, arg0);
                    return 100;
                } else {
                    return class103.field1540.method2546(-17877, var3);
                }
            } else {
                return 37;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V", line = 123)
    public final void method1597(byte arg0) {
        field3580++;
        class666 var2 = this.field3586;
        synchronized (this.field3586) {
            this.field3586.method3739(0);
        }
        class666 var3 = this.field3591;
        synchronized (this.field3591) {
            this.field3591.method3739(0);
        }
        if (arg0 < 111) {
            method1596(null, -115);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 142)
    public final void method1598(int arg0) {
        field3583++;
        class666 var2 = this.field3586;
        synchronized (this.field3586) {
            this.field3586.method3748(6);
        }
        class666 var3 = this.field3591;
        synchronized (this.field3591) {
            this.field3591.method3748(6);
            if (arg0 <= 4) {
                method1596(null, -112);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()V", line = 162)
    private static final void method1599() {
        class8.field188 = 0;
        label212: for (int var0 = 0; var0 < class90.field1369; var0++) {
            class112 var1 = class249.field3448[var0];
            if (class398.field5295 != null) {
                for (int var2 = 0; var2 < class398.field5295.length; var2++) {
                    if (class398.field5295[var2] != -1000000 && (var1.field1959 <= class398.field5295[var2] || var1.field1956 <= class398.field5295[var2]) && (var1.field1946 <= class634.field8536[var2] || var1.field1952 <= class634.field8536[var2]) && (var1.field1946 >= class406.field5475[var2] || var1.field1952 >= class406.field5475[var2]) && (var1.field1942 <= class281.field3995[var2] || var1.field1958 <= class281.field3995[var2]) && (var1.field1942 >= class433.field5912[var2] || var1.field1958 >= class433.field5912[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field1948 == 1) {
                int var3 = var1.field1960 + class364.field4927 - class350.field4797;
                if (var3 >= 0 && var3 <= class364.field4927 + class364.field4927) {
                    int var4 = var1.field1944 + class364.field4927 - class173.field2673;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class364.field4927 + class364.field4927) {
                        continue;
                    }
                    int var5 = var1.field1945 + class364.field4927 - class173.field2673;
                    if (var5 > class364.field4927 + class364.field4927) {
                        var5 = class364.field4927 + class364.field4927;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class516.field6888[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class548.field7315 - var1.field1946;
                        if (var7 > class621.field8240) {
                            var1.field1957 = 1;
                        } else {
                            if (var7 >= -class621.field8240) {
                                continue;
                            }
                            var1.field1957 = 2;
                            var7 = -var7;
                        }
                        var1.field1954 = (var1.field1942 - class418.field5723 << 8) / var7;
                        var1.field1950 = (var1.field1958 - class418.field5723 << 8) / var7;
                        var1.field1962 = (var1.field1959 - class597.field7936 << 8) / var7;
                        var1.field1947 = (var1.field1956 - class597.field7936 << 8) / var7;
                        class547.field7303[class8.field188++] = var1;
                    }
                }
            } else if (var1.field1948 == 2) {
                int var8 = var1.field1944 + class364.field4927 - class173.field2673;
                if (var8 >= 0 && var8 <= class364.field4927 + class364.field4927) {
                    int var9 = var1.field1960 + class364.field4927 - class350.field4797;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class364.field4927 + class364.field4927) {
                        continue;
                    }
                    int var10 = var1.field1953 + class364.field4927 - class350.field4797;
                    if (var10 > class364.field4927 + class364.field4927) {
                        var10 = class364.field4927 + class364.field4927;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class516.field6888[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class418.field5723 - var1.field1942;
                        if (var12 > class621.field8240) {
                            var1.field1957 = 3;
                        } else {
                            if (var12 >= -class621.field8240) {
                                continue;
                            }
                            var1.field1957 = 4;
                            var12 = -var12;
                        }
                        var1.field1961 = (var1.field1946 - class548.field7315 << 8) / var12;
                        var1.field1951 = (var1.field1952 - class548.field7315 << 8) / var12;
                        var1.field1962 = (var1.field1959 - class597.field7936 << 8) / var12;
                        var1.field1947 = (var1.field1956 - class597.field7936 << 8) / var12;
                        class547.field7303[class8.field188++] = var1;
                    }
                }
            } else if (var1.field1948 == 4) {
                int var13 = var1.field1959 - class597.field7936;
                if (var13 > class636.field8565) {
                    int var14 = var1.field1944 + class364.field4927 - class173.field2673;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class364.field4927 + class364.field4927) {
                        continue;
                    }
                    int var15 = var1.field1945 + class364.field4927 - class173.field2673;
                    if (var15 > class364.field4927 + class364.field4927) {
                        var15 = class364.field4927 + class364.field4927;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field1960 + class364.field4927 - class350.field4797;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class364.field4927 + class364.field4927) {
                        continue;
                    }
                    int var17 = var1.field1953 + class364.field4927 - class350.field4797;
                    if (var17 > class364.field4927 + class364.field4927) {
                        var17 = class364.field4927 + class364.field4927;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class516.field6888[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field1957 = 5;
                        var1.field1961 = (var1.field1946 - class548.field7315 << 8) / var13;
                        var1.field1951 = (var1.field1952 - class548.field7315 << 8) / var13;
                        var1.field1954 = (var1.field1942 - class418.field5723 << 8) / var13;
                        var1.field1950 = (var1.field1958 - class418.field5723 << 8) / var13;
                        class547.field7303[class8.field188++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IB)Lbn;", line = 413)
    public final class413 method1600(int arg0, byte arg1) {
        field3584++;
        class666 var3 = this.field3586;
        class413 var4;
        synchronized (this.field3586) {
            var4 = (class413) this.field3586.method3750((long) arg0, false);
        }
        if (var4 != null) {
            return var4;
        }
        class449 var5 = this.field3582;
        byte[] var6;
        synchronized (this.field3582) {
            var6 = this.field3582.method2537(false, 34, arg0);
        }
        class413 var7 = new class413();
        var7.field5668 = this;
        if (arg1 != 73) {
            method1596(null, 70);
        }
        if (var6 != null) {
            var7.method2368(new class335(var6), 78);
        }
        class666 var8 = this.field3586;
        synchronized (this.field3586) {
            this.field3586.method3745(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Loa;IILq;III[[[B[I[I[I[I[IIBIIZ)V", line = 452)
    public static final void method1601(class651 arg0, int arg1, int arg2, class397 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class269.field3751 = arg0;
        class107.field1583 = arg1;
        class491.field6629 = arg3;
        class131.field2159 = class269.field3751.method454() > 0;
        class350.field4797 = arg4 >> class348.field4782;
        class173.field2673 = arg6 >> class348.field4782;
        class548.field7315 = arg4;
        class418.field5723 = arg6;
        class597.field7936 = arg5;
        class253.field3500 = class350.field4797 - class364.field4927;
        if (class253.field3500 < 0) {
            class483.field6538 = -class253.field3500;
            class253.field3500 = 0;
        } else {
            class483.field6538 = 0;
        }
        class669.field9498 = class173.field2673 - class364.field4927;
        if (class669.field9498 < 0) {
            class371.field5006 = -class669.field9498;
            class669.field9498 = 0;
        } else {
            class371.field5006 = 0;
        }
        class149.field2388 = class364.field4927 + class350.field4797;
        if (class149.field2388 > class657.field8966) {
            class149.field2388 = class657.field8966;
        }
        class221.field3133 = class364.field4927 + class173.field2673;
        if (class221.field3133 > class227.field3196) {
            class221.field3133 = class227.field3196;
        }
        for (int var18 = 0; var18 < class364.field4927 + class364.field4927 + 2; var18++) {
            for (int var23 = 0; var23 < class364.field4927 + class364.field4927 + 2; var23++) {
                int var24 = class350.field4797 + var18 - class364.field4927;
                int var25 = class173.field2673 + var23 - class364.field4927;
                if (var24 >= 0 && var25 >= 0 && var24 < class657.field8966 && var25 < class227.field3196) {
                    int var26 = var24 << class348.field4782;
                    int var27 = var25 << class348.field4782;
                    int var28 = class684.field9625[class684.field9625.length - 1].method195(var24, var25) - (0x3E8 << class348.field4782 - 7);
                    int var29 = class467.field6283 == null ? class684.field9625[0].method195(var24, var25) + class587.field7787 : class467.field6283[0].method195(var24, var25) + class587.field7787;
                    class659.field9356[var18][var23] = class269.field3751.method410(var26, var28, var27, var26, var29, var27);
                } else {
                    class659.field9356[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class364.field4927 + class364.field4927 + 1; var19++) {
            for (int var22 = 0; var22 < class364.field4927 + class364.field4927 + 1; var22++) {
                class516.field6888[var19][var22] = class659.field9356[var19][var22] || class659.field9356[var19 + 1][var22] || class659.field9356[var19][var22 + 1] || class659.field9356[var19 + 1][var22 + 1];
            }
        }
        class398.field5295 = arg8;
        class406.field5475 = arg9;
        class634.field8536 = arg10;
        class281.field3995 = arg11;
        class433.field5912 = arg12;
        method1599();
        class97.method749(-32, class269.field3751);
        for (class571 var20 = (class571) class670.field9502.method328(0); var20 != null; var20 = (class571) class670.field9502.method331((byte) 123)) {
            var20.method2787(false);
            class559.method3080(var20, -1);
        }
        if (class131.field2159) {
            for (int var21 = 0; var21 < class697.field9777; var21++) {
                class350.field4791[var21].method1417(arg1, arg17, -979402837);
            }
        }
        if (arg2 > 1) {
            class269.field3751.method378(0);
            if (class692.field9746 == null || class692.field9746 instanceof class505) {
                class692.field9746 = new class224();
            }
        } else if (class692.field9746 == null || class692.field9746 instanceof class224) {
            class692.field9746 = new class505();
        }
        class692.field9746.method1408(arg2, (byte) 6);
        class692.field9746.method1407(true);
        if (class412.field5656 != null) {
            class229.method1427(true);
            class692.field9746.method1409(true, 22);
            class187.method1229(arg2, null, 0, (byte) 0, arg15, arg16);
            class692.field9746.method1407(true);
            class692.field9746.method1409(true, 23);
            class229.method1427(false);
        }
        class187.method1229(arg2, arg7, arg13, arg14, arg15, arg16);
        class692.field9746.method1407(true);
        class692.field9746.method1400(true);
        class692.field9746.method1407(true);
        if (arg2 > 1) {
            class269.field3751.method425(0);
        }
        class269.field3751.method400(0, null);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([BBII)I", line = 608)
    public static final int method1602(byte[] arg0, byte arg1, int arg2, int arg3) {
        field3581++;
        int var4 = -1;
        if (arg1 == -52) {
            for (int var5 = arg2; var5 < arg3; var5++) {
                var4 = class268.field3726[(arg0[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
            }
            return ~var4;
        } else {
            return -96;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lpca;ILbi;Lbi;)V", line = 646)
    public class261(class671 arg0, int arg1, class449 arg2, class449 arg3) {
        this.field3579 = arg3;
        this.field3582 = arg2;
        this.field3582.method2527(0, 34);
    }
}
