import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class121 extends class352 {

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
    public static int field1490 = -1;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    public static int field1484 = 0;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "Log;")
    public static class388 field1495 = null;

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "B")
    public byte field1494;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    public int field1485;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!qb", name = "bb", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "Ldg;")
    public class236 field1493;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)V", line = 15)
    public static final void method767(int arg0) {
        ++field1492;
        if (arg0 != 14262) {
            method767(125);
        }
        for (class248 var1 = (class248) class151.field1872.method506((byte) -128); var1 != null; var1 = (class248) class151.field1872.method514(true)) {
            if (~var1.field3543 < -1) {
                --var1.field3543;
            }
            if (~var1.field3543 == -1) {
                if (~var1.field3534 > -1 || class359.method2299(var1.field3549, arg0 + 1262012382, var1.field3534)) {
                    class93.method518(var1.field3534, var1.field3538, var1.field3549, (byte) -122, var1.field3536, var1.field3540, -1, var1.field3545, var1.field3537);
                    var1.method2594((byte) -22);
                }
            } else {
                if (var1.field3541 > 0) {
                    --var1.field3541;
                }
                if (~var1.field3541 == -1 && ~var1.field3540 <= -2 && ~var1.field3545 <= -2 && class176.field2403 + -2 >= var1.field3540 && ~var1.field3545 >= ~(class383.field5395 + -2) && (var1.field3539 < 0 || class359.method2299(var1.field3535, 1262026644, var1.field3539))) {
                    class93.method518(var1.field3539, var1.field3538, var1.field3535, (byte) -98, var1.field3542, var1.field3540, -1, var1.field3545, var1.field3537);
                    var1.field3541 = -1;
                    if (~var1.field3539 == ~var1.field3534 && var1.field3534 == -1) {
                        var1.method2594((byte) -22);
                    } else if (var1.field3539 == var1.field3534 && ~var1.field3542 == ~var1.field3536 && var1.field3549 == var1.field3535) {
                        var1.method2594((byte) -22);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lae;Ltq;B)V", line = 73)
    public static final void method768(class134 arg0, class376 arg1, byte arg2) {
        ++field1489;
        class375[] var3 = class375.method2401(arg1, class235.field3296, 0);
        class313.field4421 = new class381[var3.length];
        for (int var4 = 0; ~var3.length < ~var4; ++var4) {
            class313.field4421[var4] = arg0.method596(var3[var4], true);
        }
        class375[] var5 = class375.method2401(arg1, class383.field5413, 0);
        class100.field1215 = new class381[var5.length];
        if (arg2 != -54) {
            field1490 = -28;
        }
        for (int var6 = 0; var5.length > var6; ++var6) {
            class100.field1215[var6] = arg0.method596(var5[var6], true);
        }
        class375[] var7 = class375.method2401(arg1, class261.field3739, 0);
        class18.field215 = new class381[var7.length];
        for (int var8 = 0; ~var8 > ~var7.length; ++var8) {
            class18.field215[var8] = arg0.method596(var7[var8], true);
        }
        class375[] var9 = class375.method2401(arg1, class75.field889, 0);
        class405.field5851 = new class381[var9.length];
        for (int var10 = 0; ~var9.length < ~var10; ++var10) {
            class405.field5851[var10] = arg0.method596(var9[var10], true);
        }
        class375[] var11 = class375.method2401(arg1, class413.field5942, 0);
        class362.field5167 = new class381[var11.length];
        for (int var12 = 0; ~var11.length < ~var12; ++var12) {
            class362.field5167[var12] = arg0.method596(var11[var12], true);
        }
        class375[] var13 = class375.method2401(arg1, class296.field4122, 0);
        class46.field550 = new class381[var13.length];
        for (int var14 = 0; ~var14 > ~var13.length; ++var14) {
            class46.field550[var14] = arg0.method596(var13[var14], true);
        }
        class375[] var15 = class375.method2401(arg1, class450.field6452, 0);
        class7.field98 = new class381[var15.length];
        for (int var16 = 0; ~var16 > ~var15.length; ++var16) {
            class7.field98[var16] = arg0.method596(var15[var16], true);
        }
        class375[] var17 = class375.method2401(arg1, class182.field2486, 0);
        class71.field818 = new class381[var17.length];
        for (int var18 = 0; ~var18 > ~var17.length; ++var18) {
            class71.field818[var18] = arg0.method596(var17[var18], true);
        }
        class375[] var19 = class375.method2401(arg1, class217.field3064, 0);
        class97.field1167 = new class381[var19.length];
        for (int var20 = 0; ~var19.length < ~var20; ++var20) {
            class97.field1167[var20] = arg0.method596(var19[var20], true);
        }
        class375[] var21 = class375.method2401(arg1, class236.field3301, 0);
        class286.field4017 = new class381[var21.length];
        for (int var22 = 0; ~var21.length < ~var22; ++var22) {
            class286.field4017[var22] = arg0.method596(var21[var22], true);
        }
        class375[] var23 = class375.method2401(arg1, class261.field3736, 0);
        class178.field2446 = new class381[var23.length];
        for (int var24 = 0; ~var24 > ~var23.length; ++var24) {
            class178.field2446[var24] = arg0.method596(var23[var24], true);
        }
        class375[] var25 = class375.method2401(arg1, class167.field2340, 0);
        class347.field4907 = new class381[var25.length];
        for (int var26 = 0; ~var26 > ~var25.length; ++var26) {
            class347.field4907[var26] = arg0.method596(var25[var26], true);
        }
        class375[] var27 = class375.method2401(arg1, class284.field3995, 0);
        class279.field3953 = new class381[var27.length];
        for (int var28 = 0; ~var27.length < ~var28; ++var28) {
            class279.field3953[var28] = arg0.method596(var27[var28], true);
        }
        class406.field5864 = arg0.method596(class375.method2402(arg1, class313.field4483, 0), true);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLjava/lang/String;ZIILjava/lang/String;ZZIJI)V", line = 205)
    public static final void method769(boolean arg0, String arg1, boolean arg2, int arg3, int arg4, String arg5, boolean arg6, boolean arg7, int arg8, long arg9, int arg10) {
        ++field1488;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; ++var13) {
            var12[var13] = (int) (9.9999999E7D * Math.random());
        }
        class236 var14 = new class236(128);
        var14.method1583(10, (byte) -128);
        var14.method1605((arg2 ? 4 : 0) | (!arg0 ? 0 : 1) | (arg6 ? 2 : 0), arg7);
        var14.method1615(arg9, 100);
        var14.method1603(var12[0], 871);
        var14.method1596(arg5, false);
        var14.method1603(var12[1], 871);
        var14.method1605(class303.field4269, false);
        var14.method1583(arg4, (byte) -45);
        var14.method1583(arg8, (byte) -83);
        var14.method1603(var12[2], 871);
        var14.method1605(arg10, false);
        var14.method1605(arg3, false);
        var14.method1603(var12[3], 871);
        var14.method1558(!arg7, class125.field1530, class158.field2063);
        class236 var15 = new class236(350);
        var15.method1596(arg1, arg7);
        int var16 = 8 + -(class81.method457(arg1, (byte) -49) % 8);
        for (int var17 = 0; ~var17 > ~var16; ++var17) {
            var15.method1583((int) (Math.random() * 255.0D), (byte) -91);
        }
        var15.method1559(0, var12);
        class62.field718.field3320 = 0;
        class62.field718.method1583(22, (byte) -77);
        class62.field718.method1605(var14.field3320 + 2 + var15.field3320, false);
        class62.field718.method1605(569, arg7);
        class62.field718.method1571(var14.field3364, 125, var14.field3320, 0);
        class62.field718.method1571(var15.field3364, 69, var15.field3320, 0);
        class222.field3109 = -3;
        class298.field4171 = 0;
        class69.field803 = 1;
        class366.field5192 = 0;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)I", line = 264)
    public final int method770(byte arg0) {
        ++field1491;
        if (arg0 >= -122) {
            method771((Object[]) null, (long[]) null, (byte) 107, -118, 34);
        }
        return this.field1493 == null ? 0 : this.field1493.field3320 * 100 / (this.field1493.field3364.length + -this.field1494);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([Ljava/lang/Object;[JBII)V", line = 278)
    public static final void method771(Object[] arg0, long[] arg1, byte arg2, int arg3, int arg4) {
        if (~arg3 > ~arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var7;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var9;
            for (int var10 = arg3; var10 < arg4; ++var10) {
                if (~arg1[var10] > ~((long) (var10 & 1) + var7)) {
                    long var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    Object var13 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var13;
                }
            }
            arg1[arg4] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg4] = arg0[var6];
            arg0[var6] = var9;
            method771(arg0, arg1, (byte) -125, arg3, var6 + -1);
            method771(arg0, arg1, (byte) -116, var6 + 1, arg4);
        }
        if (arg2 > -100) {
            method768((class134) null, (class376) null, (byte) -8);
        }
        ++field1483;
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)[B", line = 334)
    public final byte[] method772(int arg0) {
        ++field1487;
        if (!super.field4971 && ~(this.field1493.field3364.length + -this.field1494) >= ~this.field1493.field3320) {
            if (arg0 != 1) {
                method769(false, (String) null, false, -26, 116, (String) null, true, false, 115, 77L, 67);
            }
            return this.field1493.field3364;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)V", line = 352)
    public static final void method773(int arg0, byte arg1) {
        class20.method150(101);
        ++field1496;
        int var2 = class237.method1630(arg0, 0).field5227;
        if (~var2 != -1) {
            int var3 = 11 / ((arg1 - 39) / 39);
            int var4 = class4.field61[arg0];
            if (~var2 == -7) {
                class125.field1531 = var4;
            }
            if (~var2 == -6) {
                class392.field5516 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V", line = 386)
    public static final void method774(byte arg0) {
        class335.method2166(-29082, 5);
        ++field1486;
        class345.method2201(34, 5);
        class441.method2753((byte) -99, 5);
        class235.method1550(-31261, 5);
        class122.method777(false, 5);
        class191.method1298((byte) -42, 5);
        class119.method748(5, (byte) 110);
        class168.method1134((byte) -51, 5);
        class322.method2098((byte) 75, 5);
        class92.method516(5, (byte) 113);
        class146.method886(5, 1);
        class214.method1443((byte) -52, 5);
        class72.method408(5, (byte) -127);
        class318.method2082(5, 0);
        class79.method441((byte) -113, 5);
        class401.method2557(5, (byte) -110);
        class10.method73(true, 5);
        if (arg0 <= 95) {
            field1495 = null;
        }
        class399.method2542(512, 5);
        class281.method1859(5, (byte) -58);
        class85.method464((byte) 47, 5);
        class300.method1978(50, 2716);
        class41.method252(5, -26941);
        class241.method1649(5, (byte) -128);
        class28.field349.method1629(5, 46);
        class36.field413.method1629(5, 50);
        class340.field4820.method1629(5, 56);
        class118.field1442.method1629(5, 118);
        class201.field2881.method1629(5, 63);
    }
}
