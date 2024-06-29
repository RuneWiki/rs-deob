import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class285 extends class559 {

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    public static int field3542 = 0;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    public int field3540;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "Llf;")
    public class676 field3538;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "[B")
    public byte[] field3544;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(B)[B", line = 5)
    public final byte[] method232(byte arg0) {
        if (arg0 < 104) {
            this.field3538 = null;
        }
        ++field3547;
        if (super.field7755) {
            throw new RuntimeException();
        } else {
            return this.field3544;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)I", line = 27)
    public final int method229(byte arg0) {
        if (arg0 != -69) {
            this.field3538 = null;
        }
        ++field3543;
        return super.field7755 ? 0 : 100;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B[B)V", line = 43)
    public static final void method1599(byte arg0, byte[] arg1) {
        if (arg0 >= -95) {
            field3539 = -5;
        }
        ++field3545;
        class630 var2 = new class630(arg1);
        while (true) {
            int var3;
            label49: do {
                while (true) {
                    while (true) {
                        var3 = var2.method3501(-9268);
                        if (var3 == 0) {
                            return;
                        }
                        if (var3 != 1) {
                            if (var3 != 4) {
                                continue label49;
                            }
                            int var6 = var2.method3501(-9268);
                            class68.field928 = new int[var6];
                            for (int var7 = 0; var6 > var7; ++var7) {
                                class68.field928[var7] = var2.method3470(13111);
                                if (class68.field928[var7] == 65535) {
                                    class68.field928[var7] = -1;
                                }
                            }
                        } else {
                            int[] var8 = class572.field7992 = new int[6];
                            var8[0] = var2.method3470(13111);
                            var8[1] = var2.method3470(13111);
                            var8[2] = var2.method3470(13111);
                            var8[3] = var2.method3470(13111);
                            var8[4] = var2.method3470(13111);
                            var8[5] = var2.method3470(13111);
                        }
                    }
                }
            } while (var3 != 5);
            int var4 = var2.method3501(-9268);
            class360.field4590 = new int[var4];
            for (int var5 = 0; ~var4 < ~var5; ++var5) {
                class360.field4590[var5] = var2.method3470(13111);
                if (class360.field4590[var5] == 65535) {
                    class360.field4590[var5] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 121)
    public static final void method1600(int arg0) {
        if (class133.field1739 < 1024.0F) {
            class133.field1739 = 1024.0F;
        }
        ++field3533;
        if (class133.field1739 > 3072.0F) {
            class133.field1739 = 3072.0F;
        }
        while (class331.field4223 >= 16384.0F) {
            class331.field4223 -= 16384.0F;
        }
        while (class331.field4223 < 0.0F) {
            class331.field4223 += 16384.0F;
        }
        int var1 = class263.field3256 >> 9;
        int var2 = class91.field1278 >> 9;
        int var3 = class467.method2469(class263.field3256, class476.field6039, -20214, class91.field1278);
        int var4 = 0;
        if (~var1 < -4 && var2 > 3 && var1 < class431.field5395 + -4 && ~var2 > ~(class452.field5802 + -4)) {
            for (int var5 = var1 + -4; ~var5 >= ~(var1 + 4); ++var5) {
                for (int var6 = var2 + -4; ~(var2 + 4) <= ~var6; ++var6) {
                    int var7 = class476.field6039;
                    if (~var7 > -4 && class3.method22(var6, var5, 5706)) {
                        ++var7;
                    }
                    int var8 = 0;
                    if (class392.field4940.field1259 != null && class392.field4940.field1259[var7] != null) {
                        var8 = (class392.field4940.field1259[var7][var5][var6] & 255) * 8;
                    }
                    if (class491.field6485 != null && class491.field6485[var7] != null) {
                        int var9 = var8 + -class491.field6485[var7].method1562(var6, (byte) 51, var5) + var3;
                        if (var4 < var9) {
                            var4 = var9;
                        }
                    }
                }
            }
        }
        if (arg0 != 5126) {
            field3539 = -37;
        }
        int var10 = (var4 >> 2) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (~var10 > -262145) {
            var10 = 262144;
        }
        if (class551.field7678 >= var10) {
            if (~class551.field7678 < ~var10) {
                class551.field7678 += (var10 - class551.field7678) / 80;
                return;
            }
        } else {
            class551.field7678 += (var10 - class551.field7678) / 24;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lgb;B)I", line = 213)
    public static final int method1601(class162 arg0, byte arg1) {
        ++field3535;
        if (class5.field119 != arg0) {
            if (class563.field7825 == arg0) {
                return 34167;
            } else if (class141.field1830 != arg0) {
                if (class700.field9903 == arg0) {
                    return 34166;
                } else {
                    if (arg1 < 6) {
                        field3532 = 2;
                    }
                    throw new IllegalArgumentException();
                }
            } else {
                return 34168;
            }
        } else {
            return 5890;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)Z", line = 245)
    public static final boolean method1602(byte arg0, int arg1, int arg2) {
        if (arg0 != 71) {
            method1604(-123, -63, -54);
        }
        ++field3541;
        return ~(arg2 & 32768) != -1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lbt;I)I", line = 258)
    public static final int method1603(class117 arg0, int arg1) {
        ++field3534;
        if (class117.field1503 == arg0) {
            return 5120;
        } else if (class117.field1506 == arg0) {
            return 5122;
        } else if (class117.field1508 != arg0) {
            if (class117.field1509 == arg0) {
                return 5121;
            } else if (class117.field1510 == arg0) {
                return 5123;
            } else if (class117.field1511 != arg0) {
                if (class117.field1512 == arg0) {
                    return 5131;
                } else if (class117.field1513 == arg0) {
                    return 5126;
                } else {
                    if (arg1 < 8) {
                        method1603((class117) null, -12);
                    }
                    throw new IllegalArgumentException("");
                }
            } else {
                return 5125;
            }
        } else {
            return 5124;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I", line = 306)
    public static final int method1604(int arg0, int arg1, int arg2) {
        ++field3546;
        if (arg1 < 48) {
            return 33;
        } else {
            int var3 = arg0 >>> 31;
            return (arg0 + var3) / arg2 + -var3;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lkp;ZZ)V", line = 319)
    public static final void method1605(class507 arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            field3532 = -21;
        }
        ++field3536;
        int var3 = ~arg0.field6816 != -1 ? arg0.field6816 : arg0.field6793;
        int var4 = arg0.field6852 != 0 ? arg0.field6852 : arg0.field6700;
        class237.method1423(var4, var3, class103.field1390[arg0.field6764 >> 16], arg0.field6764, arg2, -115);
        if (arg0.field6707 != null) {
            class237.method1423(var4, var3, arg0.field6707, arg0.field6764, arg2, -116);
        }
        class340 var5 = (class340) class138.field1797.method399(-32748, (long) arg0.field6764);
        if (var5 != null) {
            class311.method1798(4, var3, arg2, var5.field4392, var4);
        }
    }
}
