import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class111 extends class770 implements class466 {

    @OriginalMember(owner = "client!sm", name = "vb", descriptor = "S")
    private short field1357;

    @OriginalMember(owner = "client!sm", name = "sb", descriptor = "Z")
    private boolean field1354;

    @OriginalMember(owner = "client!sm", name = "ob", descriptor = "B")
    private byte field1350;

    @OriginalMember(owner = "client!sm", name = "rb", descriptor = "Z")
    private boolean field1353;

    @OriginalMember(owner = "client!sm", name = "db", descriptor = "B")
    private byte field1339;

    @OriginalMember(owner = "client!sm", name = "qb", descriptor = "Z")
    private boolean field1352;

    @OriginalMember(owner = "client!sm", name = "bb", descriptor = "Lr;")
    private class113 field1337;

    @OriginalMember(owner = "client!sm", name = "nb", descriptor = "Lka;")
    private class231 field1349;

    @OriginalMember(owner = "client!sm", name = "lb", descriptor = "[C")
    private static char[] field1347 = new char[64];

    @OriginalMember(owner = "client!sm", name = "xb", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!sm", name = "S", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!sm", name = "T", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!sm", name = "U", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!sm", name = "V", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!sm", name = "X", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!sm", name = "Y", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!sm", name = "Z", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!sm", name = "ab", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!sm", name = "cb", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!sm", name = "eb", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!sm", name = "fb", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!sm", name = "gb", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!sm", name = "hb", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!sm", name = "ib", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!sm", name = "jb", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!sm", name = "kb", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!sm", name = "mb", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!sm", name = "pb", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!sm", name = "tb", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!sm", name = "ub", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!sm", name = "W", descriptor = "Lha;")
    public static class473 field1332;

    @OriginalMember(owner = "client!sm", name = "wb", descriptor = "Ltja;")
    private class491 field1358;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lns;IILns;BIIIII)V")
    public static final void method805(class654 arg0, int arg1, int arg2, class654 arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1330;
        int var10 = arg3.method2255(-10144);
        if (arg4 != 43) {
            method809(-27, -50, -31);
        }
        if (~var10 != 0) {
            Object var11 = null;
            class318 var12 = (class318) class170.field2167.method312(0, (long) var10);
            if (var12 == null) {
                class279[] var13 = class279.method1817(class149.field1968, var10, 0);
                if (var13 == null) {
                    return;
                }
                var12 = field1332.method192(var13[0], true);
                class170.field2167.method305(var12, (long) var10, arg4 ^ 18363);
            }
            class236.method1613(arg0.field3467, arg5, 0, arg0.field3460, arg8 >> 1, (byte) -124, arg7 >> 1, arg0.method3744(1) * 256, arg6, arg0.field3470);
            int var14 = class491.field6769[0] + arg9 + -18;
            int var15 = class491.field6769[1] + arg1 + -54 + -16;
            int var16 = arg2 / 4 * 18 + var14;
            int var17 = arg2 % 4 * 18 + var15;
            var12.method2025(var16, var17);
            if (arg0 == arg3) {
                field1332.method2818(-256, 18, var16 + -1, (byte) -60, var17 + -1, 18);
            }
            class338.method2144((byte) -113, var16 - -18, var17 + -1, var17 + 18, var16 + -1);
            class154 var18 = class338.method2140((byte) 120);
            var18.field2016 = var16 - -16;
            var18.field2012 = var17;
            var18.field2014 = var16;
            var18.field2017 = var17 - -16;
            var18.field2015 = arg3;
            class580.field8153.method3100(var18, true);
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lha;Lro;IIIIIZIIII)V")
    public class111(class473 arg0, class286 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field1357 = (short) arg1.field4124;
        super.field3470 = arg4;
        super.field3460 = arg6;
        this.field1354 = arg1.field4137 != 0 && !arg7;
        this.field1350 = (byte) arg11;
        this.field1353 = arg7;
        this.field1339 = (byte) arg10;
        this.field1352 = arg0.method206() && arg1.field4122 && !this.field1353 && class688.field9602.field8538.method2315((byte) -98) != 0;
        class452 var13 = this.method807(this.field1352, (byte) -117, arg0, 2048);
        if (var13 != null) {
            this.field1337 = var13.field6302;
            this.field1349 = var13.field6304;
        }
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(B)I")
    public final int method78(byte arg0) {
        ++field1334;
        if (arg0 > -31) {
            field1347 = null;
        }
        return this.field1349 == null ? 0 : this.field1349.method1576();
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lha;I)V")
    public final void method757(class473 arg0, int arg1) {
        ++field1335;
        int var3 = -14 % ((13 - arg1) / 37);
        Object var4 = null;
        class113 var6;
        if (this.field1337 == null && this.field1352) {
            class452 var5 = this.method807(true, (byte) -83, arg0, 262144);
            var6 = var5 == null ? null : var5.field6302;
        } else {
            var6 = this.field1337;
            this.field1337 = null;
        }
        if (var6 != null) {
            class604.method3491(var6, super.field3469, super.field3470, super.field3460, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(Z)V")
    public final void method754(boolean arg0) {
        if (!arg0) {
            ++field1344;
            if (this.field1349 != null) {
                this.field1349.method1589();
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)Z")
    public final boolean method755(byte arg0) {
        ++field1345;
        return arg0 != -111 ? false : this.field1352;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILha;)Lrk;")
    public final class289 method74(int arg0, class473 arg1) {
        ++field1328;
        if (this.field1349 == null) {
            return null;
        } else {
            if (arg0 < 75) {
                this.field1349 = null;
            }
            class12 var3 = arg1.method153();
            var3.method50(super.field3470 - -super.field10593, super.field3464, super.field10592 + super.field3460);
            class289 var4 = class122.method863(1, (byte) 111, this.field1354);
            if (!class529.field7284) {
                this.field1349.method1586(var3, var4.field4255[0], 0);
            } else {
                this.field1349.method1580(var3, var4.field4255[0], class775.field10662, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lha;Z)V")
    public final void method763(class473 arg0, boolean arg1) {
        if (!arg1) {
            ++field1338;
            Object var3 = null;
            class113 var5;
            if (this.field1337 == null && this.field1352) {
                class452 var4 = this.method807(true, (byte) -43, arg0, 262144);
                var5 = var4 == null ? null : var4.field6302;
            } else {
                var5 = this.field1337;
                this.field1337 = null;
            }
            if (var5 != null) {
                class516.method3071(var5, super.field3469, super.field3470, super.field3460, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BII)I")
    public static final int method806(byte arg0, int arg1, int arg2) {
        ++field1348;
        if (arg0 != -124) {
            field1332 = null;
        }
        int var3 = arg2 >>> 24;
        int var4 = (16711680 & (arg2 & 65280) * var3 | -16711936 & (16711935 & arg2) * var3) >>> 8;
        int var5 = -var3 + 255;
        return (((16711935 & arg1) * var5 & -16711936 | (arg1 & 65280) * var5 & 16711680) >>> 8) - -var4;
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)I")
    public final int method89(int arg0) {
        ++field1351;
        int var2 = 15 / ((arg0 - 69) / 48);
        return this.field1349 != null ? this.field1349.method1539() : 0;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)I")
    public final int method762(boolean arg0) {
        ++field1356;
        if (!arg0) {
            this.field1352 = false;
        }
        return this.field1350;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZBLha;I)Luaa;")
    private final class452 method807(boolean arg0, byte arg1, class473 arg2, int arg3) {
        if (arg1 > -39) {
            return null;
        } else {
            ++field1336;
            class286 var5 = class390.field5558.method3065(-125, 65535 & this.field1357);
            class418 var6;
            class418 var7;
            if (this.field1353) {
                var6 = class594.field8355[super.field3469];
                var7 = class95.field1115[0];
            } else {
                var6 = class95.field1115[super.field3469];
                if (super.field3469 >= 3) {
                    var7 = null;
                } else {
                    var7 = class95.field1115[super.field3469 + 1];
                }
            }
            return var5.method1898(arg2, this.field1339, var7, super.field3460, arg0, false, super.field3470, super.field3464, this.field1350, arg3, (class413) null, var6);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILha;II)Z")
    public final boolean method88(int arg0, class473 arg1, int arg2, int arg3) {
        ++field1341;
        class231 var5 = this.method808(arg1, (byte) -61, 131072);
        if (var5 != null) {
            class12 var6 = arg1.method153();
            var6.method50(super.field3470, super.field3464, super.field3460);
            return !class529.field7284 ? var5.method1578(arg0, arg3, var6, false, 0) : var5.method1570(arg0, arg3, var6, false, 0, class775.field10662);
        } else {
            if (arg2 != -31634) {
                this.method89(-91);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "(I)Z")
    public final boolean method77(int arg0) {
        ++field1343;
        if (arg0 != 25833) {
            this.method89(-26);
        }
        if (this.field1349 == null) {
            return true;
        } else {
            return !this.field1349.method1563();
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lha;BI)Lka;")
    private final class231 method808(class473 arg0, byte arg1, int arg2) {
        ++field1331;
        if (arg1 >= -40) {
            return null;
        } else if (this.field1349 != null && arg0.method188(this.field1349.method1587(), arg2) == 0) {
            return this.field1349;
        } else {
            class452 var4 = this.method807(false, (byte) -49, arg0, arg2);
            return var4 != null ? var4.field6304 : null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)I")
    public final int method760(int arg0) {
        if (arg0 != -27640) {
            this.method756((byte) 26);
        }
        ++field1355;
        return 65535 & this.field1357;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)I")
    public final int method756(byte arg0) {
        ++field1329;
        int var2 = -101 / ((48 - arg0) / 51);
        return this.field1339;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)I")
    public static final int method809(int arg0, int arg1, int arg2) {
        ++field1340;
        if (arg1 != 2050419935) {
            method811(10);
        }
        int var3 = arg0 >>> 31;
        return (arg0 + var3) / arg2 + -var3;
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)Z")
    public final boolean method80(int arg0) {
        ++field1333;
        if (arg0 < 63) {
            field1332 = null;
        }
        return this.field1349 != null ? this.field1349.method1575() : false;
    }

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "(Z)V")
    public static final void method810(boolean arg0) {
        if (arg0) {
            class59.field688 = class530.field7302;
            class661.field9303 = class594.field8355;
        } else {
            class59.field688 = class545.field7583;
            class661.field9303 = class95.field1115;
        }
        class266.field3869 = class59.field688.length;
    }

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "(I)V")
    public static void method811(int arg0) {
        int var1 = 43 / ((arg0 - 50) / 47);
        field1332 = null;
        field1347 = null;
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(Lha;I)Ltja;")
    public final class491 method72(class473 arg0, int arg1) {
        if (this.field1358 == null) {
            this.field1358 = class486.method2885(super.field3470, super.field3464, this.method808(arg0, (byte) -79, 0), super.field3460, 29289);
        }
        ++field1346;
        if (arg1 != -5047) {
            this.field1358 = null;
        }
        return this.field1358;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(Lha;I)V")
    public final void method76(class473 arg0, int arg1) {
        int var3 = -63 % ((arg1 - -30) / 42);
        ++field1342;
    }

    static {
        for (int var0 = 0; ~var0 > -27; ++var0) {
            field1347[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; ++var1) {
            field1347[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; ++var2) {
            field1347[var2] = (char) (var2 + 48 - 52);
        }
        field1347[62] = '+';
        field1347[63] = '/';
        field1359 = 0;
    }
}
