import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class80 extends class33 {

    @OriginalMember(owner = "client!i", name = "P", descriptor = "Lrd;")
    public static class173 field1575 = class133.method843(")1", -110);

    @OriginalMember(owner = "client!i", name = "R", descriptor = "[I")
    public static int[] field1577 = new int[500];

    @OriginalMember(owner = "client!i", name = "T", descriptor = "Lrd;")
    public static class173 field1579 = class133.method843("null", -123);

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "Lrd;")
    public static class173 field1584 = class133.method843("Unerwartete Antwort vom Anmelde)2Server)3", 77);

    @OriginalMember(owner = "client!i", name = "M", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "Lgf;")
    public static class66 field1583;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "[Lwe;")
    private class221[] field1582;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILbc;I)Z")
    public static final boolean method497(int arg0, class14 arg1, int arg2) {
        ++field1585;
        byte[] var3 = arg1.method125(26796, arg2);
        if (arg0 <= 21) {
            field1577 = null;
        }
        if (var3 == null) {
            return false;
        } else {
            class78.method477((byte) -105, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([[IB)V")
    private final void method498(int[][] arg0, byte arg1) {
        int var3 = 115 % ((arg1 - 11) / 36);
        ++field1573;
        int var4 = class117.field2173;
        int var5 = class99.field1802;
        class56.method359(arg0, true);
        class169.method1087(1693, class125.field2347, 0, 0, class26.field545);
        if (this.field1582 != null) {
            for (int var6 = 0; ~this.field1582.length < ~var6; ++var6) {
                class221 var7 = this.field1582[var6];
                int var8 = var7.field4248;
                int var9 = var7.field4246;
                if (~var8 > -1) {
                    if (~var9 <= -1) {
                        var7.method393(var5, var4, 0);
                    }
                } else if (~var9 <= -1) {
                    var7.method399(var4, var5, (byte) -118);
                } else {
                    var7.method394(0, var5, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILqf;I)Lrd;")
    public static final class173 method499(int arg0, class165 arg1, int arg2) {
        ++field1574;
        if (!class177.method1176(class78.method474(arg1, arg2 + -153), true, arg0) && arg1.field3137 == null) {
            return null;
        } else {
            if (arg2 != 255) {
                field1583 = null;
            }
            if (arg1.field3139 != null && ~arg1.field3139.length < ~arg0 && arg1.field3139[arg0] != null && ~arg1.field3139[arg0].method1122(105).method1153((byte) -127) != -1) {
                return arg1.field3139[arg0];
            } else {
                return class119.field2189 ? class173.method1158(-3, new class173[] { class117.field2169, class93.method588(arg0, true) }) : null;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class80() {
        super(0, true);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        ++field1576;
        int[] var3 = super.field718.method514(arg0, 124);
        if (super.field718.field1615) {
            this.method498(super.field718.method515(-29296), (byte) 92);
        }
        int var4 = -78 / ((-65 - arg1) / 60);
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V")
    public static void method500(byte arg0) {
        if (arg0 < -101) {
            field1579 = null;
            field1583 = null;
            field1575 = null;
            field1584 = null;
            field1577 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(II)Z")
    public static final boolean method501(int arg0, int arg1) {
        ++field1580;
        if (arg1 < 32) {
            return false;
        } else if (~arg1 == -128) {
            return false;
        } else {
            if (arg0 > -68) {
                method501(42, -23);
            }
            return ~arg1 > -130 || ~arg1 < -160;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field729 = arg2.method751((byte) -95) == 1;
            }
        } else {
            this.field1582 = new class221[arg2.method751((byte) -105)];
            for (int var4 = 0; ~this.field1582.length < ~var4; ++var4) {
                int var5 = arg2.method751((byte) 114);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field1582[var4] = class54.method355(7, arg2);
                            }
                        } else {
                            this.field1582[var4] = class91.method583(arg2, -116);
                        }
                    } else {
                        this.field1582[var4] = class24.method189(arg2, 116);
                    }
                } else {
                    this.field1582[var4] = class105.method646(arg2, 22337);
                }
            }
        }
        if (arg1 <= -99) {
            ++field1572;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)[[I")
    public final int[][] method178(int arg0, int arg1) {
        ++field1578;
        if (arg0 < 112) {
            method497(65, (class14) null, 66);
        }
        int[][] var3 = super.field731.method1340(38, arg1);
        if (super.field731.field3925) {
            int var4 = class117.field2173;
            int var5 = class99.field1802;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field731.method1342(97);
            this.method498(var6, (byte) 68);
            for (int var8 = 0; ~var8 > ~class99.field1802; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class117.field2173 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class209.method1383(4080, var15 << 4);
                    var12[var14] = class209.method1383(var15, 65280) >> 4;
                    var11[var14] = class209.method1383(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }
}
