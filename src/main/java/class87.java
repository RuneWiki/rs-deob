import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class87 extends class252 {

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    private int field1623 = 16;

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
    private int field1632 = 0;

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "I")
    private int field1635 = 0;

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "I")
    private int field1631 = 2000;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
    private int field1629 = 4096;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILjd;III)V")
    public static final void method645(int arg0, class85 arg1, int arg2, int arg3, int arg4) {
        class255 var5 = class67.method449(arg2, (byte) 59, arg3);
        ++field1626;
        if (var5 != null) {
            if (var5.field4552 != null) {
                class5 var6 = new class5();
                var6.field67 = var5.field4552;
                var6.field51 = arg4;
                var6.field58 = var5;
                var6.field66 = arg1;
                class127.method863(46, var6);
            }
            boolean var7 = true;
            if (arg0 < var5.field4519) {
                var7 = class189.method1296((byte) 110, var5);
            }
            if (var7) {
                if (class184.method1268((byte) 10, client.method987(var5), arg4 + -1)) {
                    if (arg4 == 1) {
                        class207.field3618.method483(-24260, 199);
                        ++class161.field2777;
                        class207.field3618.method1715(arg3, (byte) 127);
                        class207.field3618.method1703(arg2, -128);
                    }
                    if (~arg4 == -3) {
                        class207.field3618.method483(arg0 ^ -24260, 159);
                        ++class15.field205;
                        class207.field3618.method1715(arg3, (byte) 11);
                        class207.field3618.method1703(arg2, -128);
                    }
                    if (~arg4 == -4) {
                        class207.field3618.method483(-24260, 172);
                        ++class195.field3345;
                        class207.field3618.method1715(arg3, (byte) 120);
                        class207.field3618.method1703(arg2, -121);
                    }
                    if (arg4 == 4) {
                        ++class33.field497;
                        class207.field3618.method483(-24260, 21);
                        class207.field3618.method1715(arg3, (byte) 125);
                        class207.field3618.method1703(arg2, -97);
                    }
                    if (arg4 == 5) {
                        ++class15.field206;
                        class207.field3618.method483(-24260, 207);
                        class207.field3618.method1715(arg3, (byte) -38);
                        class207.field3618.method1703(arg2, -122);
                    }
                    if (~arg4 == -7) {
                        class207.field3618.method483(-24260, 194);
                        ++class131.field2298;
                        class207.field3618.method1715(arg3, (byte) -77);
                        class207.field3618.method1703(arg2, -127);
                    }
                    if (~arg4 == -8) {
                        class207.field3618.method483(-24260, 87);
                        class207.field3618.method1715(arg3, (byte) -3);
                        class207.field3618.method1703(arg2, -97);
                        ++class78.field1443;
                    }
                    if (arg4 == 8) {
                        ++class25.field367;
                        class207.field3618.method483(-24260, 217);
                        class207.field3618.method1715(arg3, (byte) -53);
                        class207.field3618.method1703(arg2, -97);
                    }
                    if (~arg4 == -10) {
                        class207.field3618.method483(arg0 + -24260, 89);
                        ++class65.field1191;
                        class207.field3618.method1715(arg3, (byte) -115);
                        class207.field3618.method1703(arg2, -98);
                    }
                    if (~arg4 == -11) {
                        ++class231.field3992;
                        class207.field3618.method483(arg0 ^ -24260, 214);
                        class207.field3618.method1715(arg3, (byte) -33);
                        class207.field3618.method1703(arg2, -107);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        int[] var3 = super.field4356.method868(arg0, (byte) -124);
        if (arg1 != -55) {
            this.field1623 = -76;
        }
        if (super.field4356.field2258) {
            int var4 = this.field1629 >> 1;
            int[][] var5 = super.field4356.method864((byte) -98);
            Random var6 = new Random((long) this.field1632);
            for (int var7 = 0; this.field1631 > var7; ++var7) {
                int var8 = ~this.field1629 >= -1 ? this.field1635 : this.field1635 - (-class135.method901(Integer.MIN_VALUE, this.field1629, var6) - -var4);
                int var9 = class135.method901(Integer.MIN_VALUE, class5.field63, var6);
                int var10 = var8 >> 4 & 255;
                int var11 = class135.method901(Integer.MIN_VALUE, class140.field2422, var6);
                int var12 = (class97.field1757[var10] * this.field1623 >> 12) + var9;
                int var13 = (class38.field593[var10] * this.field1623 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = -var9 + var12;
                if (~var15 != -1 || ~var14 != -1) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var9;
                        var9 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var12 > ~var9) {
                        int var19 = var9;
                        var9 = var12;
                        var12 = var19;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var9 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var26 = 1024 - (class135.method901(Integer.MIN_VALUE, 4096, var6) >> 2);
                    int var27 = var11 < var13 ? 1 : -1;
                    for (int var28 = var9; var28 < var12; ++var28) {
                        int var29 = (-var9 + var28) * var25 + 1024 + var26;
                        var24 += var23;
                        int var30 = var21 & class25.field360;
                        if (~var24 < -1) {
                            var21 += var27;
                            var24 += -var22;
                        }
                        int var31 = class67.field1233 & var28;
                        if (var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                    }
                }
            }
        }
        ++field1633;
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        ++field1625;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 == 4) {
                            this.field1629 = arg0.method1694((byte) -100);
                        }
                    } else {
                        this.field1635 = arg0.method1694((byte) -100);
                    }
                } else {
                    this.field1623 = arg0.method1711((byte) -67);
                }
            } else {
                this.field1631 = arg0.method1694((byte) -100);
            }
        } else {
            this.field1632 = arg0.method1711((byte) -67);
        }
        if (arg2 != -99) {
            method646((byte) 29, -88);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(BI)V")
    public static final void method646(byte arg0, int arg1) {
        ++field1630;
        if (class99.field1782 == null) {
            class99.field1782 = new byte[4][104][104];
        }
        for (int var2 = 0; ~var2 > -5; ++var2) {
            for (int var3 = 0; ~var3 > -105; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    class99.field1782[var2][var3][var4] = arg0;
                }
            }
        }
        if (arg1 != -1) {
            field1622 = 104;
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
    public final void method230(int arg0) {
        ++field1634;
        class195.method1328(112);
        if (arg0 != 3906) {
            method646((byte) 42, 26);
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class87() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(BI)Lvg;")
    public static final class71 method647(byte arg0, int arg1) {
        ++field1627;
        class71 var2 = (class71) class18.field255.method1269((long) arg1, (byte) 67);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class11.field169.method464(-1, class115.method813(1000, arg1), class205.method1403((byte) 100, arg1));
            class71 var4 = new class71();
            var4.field1330 = arg1;
            if (arg0 < 11) {
                method648(66, -36);
            }
            if (var3 != null) {
                var4.method501(new class247(var3), 120);
            }
            class18.field255.method1271(-15561, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)V")
    public static final void method648(int arg0, int arg1) {
        class171 var2 = class85.method579(9, 0, arg0);
        ++field1628;
        if (arg1 != -32061) {
            method646((byte) 70, -113);
        }
        var2.method1141(-6456);
    }
}
