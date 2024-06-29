import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class209 extends class124 {

    @OriginalMember(owner = "client!hj", name = "cb", descriptor = "I")
    private int field3710 = 0;

    @OriginalMember(owner = "client!hj", name = "X", descriptor = "I")
    private int field3705 = 0;

    @OriginalMember(owner = "client!hj", name = "hb", descriptor = "I")
    private int field3715 = 0;

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "[Le;")
    public static class191[] field3702 = new class191[200];

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "I")
    public static int field3703 = 0;

    @OriginalMember(owner = "client!hj", name = "fb", descriptor = "I")
    public static int field3713 = -1;

    @OriginalMember(owner = "client!hj", name = "ib", descriptor = "I")
    public static int field3716 = 0;

    @OriginalMember(owner = "client!hj", name = "nb", descriptor = "Z")
    public static boolean field3721 = true;

    @OriginalMember(owner = "client!hj", name = "gb", descriptor = "I")
    public static int field3714 = 0;

    @OriginalMember(owner = "client!hj", name = "pb", descriptor = "Lef;")
    public static class175 field3723 = new class175();

    @OriginalMember(owner = "client!hj", name = "tb", descriptor = "[J")
    public static long[] field3727 = new long[500];

    @OriginalMember(owner = "client!hj", name = "sb", descriptor = "Le;")
    public static class191 field3726 = class54.method368(" loggt sich aus)3", 2047);

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
    private int field3697;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "I")
    private int field3699;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
    private int field3701;

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "I")
    private int field3704;

    @OriginalMember(owner = "client!hj", name = "Y", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!hj", name = "Z", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!hj", name = "ab", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!hj", name = "bb", descriptor = "I")
    private int field3709;

    @OriginalMember(owner = "client!hj", name = "db", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!hj", name = "eb", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!hj", name = "jb", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!hj", name = "kb", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!hj", name = "lb", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!hj", name = "mb", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!hj", name = "ob", descriptor = "I")
    private int field3722;

    @OriginalMember(owner = "client!hj", name = "qb", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!hj", name = "rb", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "(I)V")
    public static final void method1436(int arg0) {
        for (int var1 = -1; class260.field4586 > var1; ++var1) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class73.field1271[var1];
            }
            class76 var3 = class245.field4357[var2];
            if (var3 != null) {
                class133.method897(var3.method490((byte) -4), 0, var3);
            }
        }
        ++field3711;
        if (arg0 != 3) {
            method1441(60, -14);
        }
    }

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "(I)V")
    public static void method1437(int arg0) {
        field3727 = null;
        field3726 = null;
        field3702 = null;
        if (arg0 != 26508) {
            method1437(-6);
        }
        field3723 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method137(int arg0, byte arg1) {
        ++field3698;
        if (arg1 != -7) {
            this.method1442(-98, 1, -63, -2);
        }
        int[][] var3 = super.field2053.method1775((byte) -104, arg0);
        if (super.field2053.field4558) {
            int[][] var4 = this.method843((byte) -100, arg0, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class64.field1132 < ~var11; ++var11) {
                this.method1444(var5[var11], var6[var11], var7[var11], (byte) 27);
                this.field3722 += this.field3710;
                if (this.field3722 < 0) {
                    this.field3722 = 0;
                }
                if (this.field3722 > 4096) {
                    this.field3722 = 4096;
                }
                this.field3699 += this.field3715;
                this.field3701 += this.field3705;
                if (this.field3701 < 0) {
                    this.field3701 = 0;
                }
                while (this.field3699 < 0) {
                    this.field3699 += 4096;
                }
                if (this.field3701 > 4096) {
                    this.field3701 = 4096;
                }
                while (this.field3699 > 4096) {
                    this.field3699 -= 4096;
                }
                this.method1442(this.field3701, 127, this.field3722, this.field3699);
                var8[var11] = this.field3709;
                var9[var11] = this.field3697;
                var10[var11] = this.field3704;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(III)Z")
    public static final boolean method1438(int arg0, int arg1, int arg2) {
        if (~arg2 == -12) {
            arg2 = 10;
        }
        if (~arg2 <= -6 && arg2 <= 8) {
            arg2 = 4;
        }
        int var3 = -61 / ((-39 - arg1) / 63);
        ++field3720;
        class102 var4 = class31.method216(arg0, (byte) 125);
        return var4.method636(-17085, arg2);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lji;B)Lvb;")
    public static final class64 method1439(class225 arg0, byte arg1) {
        if (arg1 >= -32) {
            method1437(-52);
        }
        ++field3712;
        class64 var2 = new class64();
        var2.field1130 = arg0.method1593(true);
        var2.field1129 = class39.method263(var2.field1130, (byte) -121);
        return var2;
    }

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "(I)V")
    public static final void method1440(int arg0) {
        ++field3718;
        if (~class126.field2081 != -1) {
            try {
                if (~(++class239.field4224) < -2001) {
                    if (class263.field4670 != null) {
                        class263.field4670.method174(arg0 ^ 119);
                        class263.field4670 = null;
                    }
                    if (class173.field2902 >= 1) {
                        class24.field345 = -5;
                        class126.field2081 = 0;
                        return;
                    }
                    class239.field4224 = 0;
                    class126.field2081 = 1;
                    if (~class261.field4624 != ~class205.field3640) {
                        class205.field3640 = class261.field4624;
                    } else {
                        class205.field3640 = class181.field3123;
                    }
                    ++class173.field2902;
                }
                if (~class126.field2081 == -2) {
                    class143.field2386 = class167.field2820.method1721((byte) -96, class95.field1548, class205.field3640);
                    class126.field2081 = 2;
                }
                if (arg0 != 2) {
                    field3721 = true;
                }
                if (~class126.field2081 == -3) {
                    if (~class143.field2386.field1356 == -3) {
                        throw new IOException();
                    }
                    if (class143.field2386.field1356 != 1) {
                        return;
                    }
                    class263.field4670 = new class24((Socket) class143.field2386.field1360, class167.field2820);
                    class143.field2386 = null;
                    class263.field4670.method173((byte) -120, class53.field963.field3996, class53.field963.field3995, 0);
                    if (class199.field3539 != null) {
                        class199.field3539.method337((byte) -107);
                    }
                    if (class93.field1527 != null) {
                        class93.field1527.method337((byte) -107);
                    }
                    int var1 = class263.field4670.method171(arg0 + -27107);
                    if (class199.field3539 != null) {
                        class199.field3539.method337((byte) -107);
                    }
                    if (class93.field1527 != null) {
                        class93.field1527.method337((byte) -107);
                    }
                    if (var1 != 21) {
                        class24.field345 = var1;
                        class126.field2081 = 0;
                        class263.field4670.method174(111);
                        class263.field4670 = null;
                        return;
                    }
                    class126.field2081 = 3;
                }
                if (~class126.field2081 == -4) {
                    if (class263.field4670.method177((byte) 124) < 1) {
                        return;
                    }
                    class131.field2187 = new class191[class263.field4670.method171(-27105)];
                    class126.field2081 = 4;
                }
                if (~class126.field2081 == -5) {
                    if (~class263.field4670.method177((byte) 124) <= ~(class131.field2187.length * 8)) {
                        class107.field1776.field3996 = 0;
                        class263.field4670.method175(class131.field2187.length * 8, class107.field1776.field3995, (byte) 76, 0);
                        for (int var2 = 0; ~var2 > ~class131.field2187.length; ++var2) {
                            class131.field2187[var2] = class33.method225(class107.field1776.method1605(class62.method416(arg0, -2033532382)), false);
                        }
                        class126.field2081 = 0;
                        class24.field345 = 21;
                        class263.field4670.method174(100);
                        class263.field4670 = null;
                    }
                }
            } catch (IOException var3) {
                if (class263.field4670 != null) {
                    class263.field4670.method174(-38);
                    class263.field4670 = null;
                }
                if (class173.field2902 >= 1) {
                    class126.field2081 = 0;
                    class24.field345 = -4;
                } else {
                    class126.field2081 = 1;
                    if (~class261.field4624 == ~class205.field3640) {
                        class205.field3640 = class181.field3123;
                    } else {
                        class205.field3640 = class261.field4624;
                    }
                    ++class173.field2902;
                    class239.field4224 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        ++field3700;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field3705 = (arg1.method1575(false) << 12) / 100;
                }
            } else {
                this.field3710 = (arg1.method1575(false) << 12) / 100;
            }
        } else {
            this.field3715 = arg1.method1568(120);
        }
        if (!arg2) {
            this.method1442(-2, -20, -54, -47);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V")
    public static final void method1441(int arg0, int arg1) {
        ++field3717;
        if (~arg0 != 0) {
            if (class127.method858(arg0, arg1 ^ 4120)) {
                class33[] var2 = class242.field4325[arg0];
                if (arg1 != 4096) {
                    field3723 = null;
                }
                for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
                    class33 var4 = var2[var3];
                    if (var4.field533 != null) {
                        class61 var5 = new class61();
                        var5.field1101 = var4.field533;
                        var5.field1089 = var4;
                        class26.method193(arg1 ^ 4099, var5, 2000000);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(IIII)V")
    private final void method1442(int arg0, int arg1, int arg2, int arg3) {
        ++field3724;
        if (arg1 <= 124) {
            field3726 = null;
        }
        int var5 = arg0 > 2048 ? arg0 + arg2 + -(arg0 * arg2 >> 12) : (4096 - -arg2) * arg0 >> 12;
        if (~var5 >= -1) {
            this.field3709 = this.field3697 = this.field3704 = arg0;
        } else {
            int var6 = arg3 * 6;
            int var7 = arg0 - -arg0 + -var5;
            int var8 = var6 >> 12;
            int var9 = (-var7 + var5 << 12) / var5;
            int var10 = -(var8 << 12) + var6;
            int var12 = var9 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 - -var13;
            int var15 = -var13 + var5;
            if (var8 != 0) {
                if (~var8 != -2) {
                    if (var8 != 2) {
                        if (~var8 != -4) {
                            if (var8 != 4) {
                                if (var8 == 5) {
                                    this.field3709 = var5;
                                    this.field3697 = var7;
                                    this.field3704 = var15;
                                }
                            } else {
                                this.field3709 = var14;
                                this.field3697 = var7;
                                this.field3704 = var5;
                            }
                        } else {
                            this.field3704 = var5;
                            this.field3709 = var7;
                            this.field3697 = var15;
                        }
                    } else {
                        this.field3709 = var7;
                        this.field3704 = var14;
                        this.field3697 = var5;
                    }
                } else {
                    this.field3697 = var5;
                    this.field3704 = var7;
                    this.field3709 = var15;
                }
            } else {
                this.field3704 = var7;
                this.field3697 = var14;
                this.field3709 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "(I)V")
    public static final void method1443(int arg0) {
        class267 var1 = (class267) class73.field1259.method609(false);
        if (arg0 != 21954) {
            field3713 = -38;
        }
        while (var1 != null) {
            int var2 = var1.field4721;
            if (class127.method858(var2, -127)) {
                boolean var3 = true;
                class33[] var4 = class242.field4325[var2];
                for (int var5 = 0; var4.length > var5; ++var5) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field591;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1713;
                    class33 var7 = class233.method1646(5877, var6);
                    if (var7 != null) {
                        class184.method1238(var7, (byte) -74);
                    }
                }
            }
            var1 = (class267) class73.field1259.method610(-87);
        }
        ++field3708;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIB)V")
    private final void method1444(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = arg1 > arg0 ? arg1 : arg0;
        int var6 = ~var5 <= ~arg2 ? var5 : arg2;
        if (arg3 != 27) {
            method1443(6);
        }
        int var7 = arg0 > arg1 ? arg1 : arg0;
        int var8 = var7 > arg2 ? arg2 : var7;
        ++field3707;
        this.field3701 = (var8 - -var6) / 2;
        int var9 = -var8 + var6;
        if (this.field3701 > 0 && ~this.field3701 > -4097) {
            this.field3722 = (var9 << 12) / (~this.field3701 >= -2049 ? this.field3701 * 2 : 8192 - this.field3701 * 2);
        } else {
            this.field3722 = 0;
        }
        if (~var9 >= -1) {
            this.field3699 = 0;
        } else {
            int var10 = (-arg1 + var6 << 12) / var9;
            int var11 = (-arg0 + var6 << 12) / var9;
            int var12 = (-arg2 + var6 << 12) / var9;
            if (arg1 != var6) {
                if (~arg0 != ~var6) {
                    this.field3699 = ~arg1 != ~var8 ? -var10 + 20480 : var11 + 12288;
                } else {
                    this.field3699 = arg2 != var8 ? 12288 - var12 : 4096 - -var10;
                }
            } else {
                this.field3699 = ~arg0 != ~var8 ? -var11 + 4096 : var12 + 20480;
            }
            this.field3699 /= 6;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lt;ZZ)V")
    public static final void method1445(class247 arg0, boolean arg1, boolean arg2) {
        ++field3719;
        if (!arg2) {
            class171 var3 = null;
            class87.field1421 = 3;
            class168.method1135(true, -106);
            class213.field3772 = true;
            class127.field2111 = true;
            class255.field4532 = 255;
            class75.field1289 = true;
            class50.field898 = true;
            class252.field4472 = true;
            class225.field4029 = true;
            class273.field4836 = 0;
            class126.field2088 = true;
            class27.field398 = 0;
            class41.field729 = true;
            class173.field2904 = 127;
            class183.field3154 = true;
            class226.field4074 = true;
            class61.field1105 = true;
            class56.field1036 = 0;
            class102.field1660 = 2;
            class30.field425 = 127;
            field3721 = true;
            try {
                class80 var4 = arg0.method1725("runescape", -93);
                while (~var4.field1356 == -1) {
                    class18.method142(true, 1L);
                }
                if (var4.field1356 == 1) {
                    var3 = (class171) var4.field1360;
                    int var5 = 0;
                    byte[] var6 = new byte[(int) var3.method1153(0)];
                    while (var6.length > var5) {
                        int var7 = var3.method1152(var6.length - var5, var6, (byte) -6, var5);
                        if (var7 == -1) {
                            throw new IOException("EOF");
                        }
                        var5 += var7;
                    }
                    class90.method544(-3, new class225(var6));
                }
            } catch (Exception var9) {
            }
            try {
                if (var3 != null) {
                    var3.method1149(-9424);
                }
            } catch (Exception var8) {
            }
        } else {
            class87.field1421 = 3;
            class168.method1135(false, 85);
            class183.field3154 = false;
            class126.field2088 = false;
            class27.field398 = 0;
            class30.field425 = 127;
            class255.field4532 = 255;
            class127.field2111 = false;
            class252.field4472 = false;
            class41.field729 = false;
            class273.field4836 = 0;
            class61.field1105 = false;
            class225.field4029 = false;
            class75.field1289 = false;
            class102.field1660 = 0;
            class213.field3772 = false;
            class50.field898 = false;
            field3721 = false;
            class56.field1036 = 0;
            class226.field4074 = false;
            class173.field2904 = 127;
            class243.method1703(10367, arg0);
        }
        if (arg1) {
            field3727 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
    public class209() {
        super(1, false);
    }
}
