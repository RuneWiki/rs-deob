import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class82 extends class129 implements class324 {

    @OriginalMember(owner = "client!ji", name = "ab", descriptor = "S")
    private short field1175;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "Z")
    private boolean field1153;

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "B")
    private byte field1165;

    @OriginalMember(owner = "client!ji", name = "db", descriptor = "B")
    private byte field1178;

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "Z")
    private boolean field1172;

    @OriginalMember(owner = "client!ji", name = "Z", descriptor = "Z")
    private boolean field1174;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "Lka;")
    private class282 field1158;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "Lr;")
    private class704 field1163;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!ji", name = "Y", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!ji", name = "bb", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!ji", name = "cb", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!ji", name = "eb", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!ji", name = "fb", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!ji", name = "gb", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!ji", name = "hb", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "Lgm;")
    public static class208 field1154;

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "Lro;")
    private class522 field1161;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(JJ)J", line = 3)
    public static long method659(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(B)Z", line = 10)
    public final boolean method614(byte arg0) {
        ++field1156;
        int var2 = 90 % ((arg0 - -38) / 63);
        return this.field1158 == null ? false : this.field1158.method497();
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lha;Lrq;IIIIIZIIII)V", line = 29)
    public class82(class543 arg0, class482 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field1175 = (short) arg1.field6965;
        this.field1153 = arg1.field6903 != 0 && !arg7;
        this.field1165 = (byte) arg11;
        this.field1178 = (byte) arg10;
        super.field3923 = arg4;
        this.field1172 = arg7;
        super.field3916 = arg6;
        this.field1174 = arg0.method365() && arg1.field6892 && !this.field1172 && class243.field3580.field8007.method435(false) != 0;
        class495 var13 = this.method662(this.field1174, arg0, 4, 2048);
        if (var13 != null) {
            this.field1158 = var13.field7119;
            this.field1163 = var13.field7117;
        }
    }

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "(B)V", line = 53)
    public static final void method660(byte arg0) {
        ++field1166;
        boolean var1 = class352.field5213.method2904(68) == 1;
        int var2 = class352.field5213.method2904(60);
        int var3 = class352.field5213.method2892((byte) 51);
        int var4 = class352.field5213.method2897(65280);
        class445.field6361 = class352.field5213.method2886(true);
        class734.method4084(false);
        class247.method1681(var2, 1541132643);
        class352.field5213.method1203(-26008);
        for (int var5 = 0; var5 < 4; ++var5) {
            for (int var20 = 0; var20 < class184.field2546 >> 3; ++var20) {
                for (int var21 = 0; class240.field3555 >> 3 > var21; ++var21) {
                    int var22 = class352.field5213.method1206(1, (byte) -90);
                    if (~var22 != -2) {
                        class742.field10347[var5][var20][var21] = -1;
                    } else {
                        class742.field10347[var5][var20][var21] = class352.field5213.method1206(26, (byte) -90);
                    }
                }
            }
        }
        if (arg0 <= 84) {
            field1154 = null;
        }
        class352.field5213.method1208((byte) 75);
        int var6 = (-class352.field5213.field6864 + class322.field4395) / 16;
        class491.field7065 = new int[var6][4];
        for (int var7 = 0; ~var7 > ~var6; ++var7) {
            for (int var19 = 0; ~var19 > -5; ++var19) {
                class491.field7065[var7][var19] = class352.field5213.method2868(-50);
            }
        }
        class132.field1823 = null;
        class284.field3961 = new int[var6];
        class397.field5685 = new byte[var6][];
        class667.field9528 = new byte[var6][];
        class658.field9419 = null;
        class429.field6176 = new byte[var6][];
        class269.field3822 = new int[var6];
        class645.field9289 = new byte[var6][];
        class672.field9577 = new int[var6];
        class629.field8917 = new int[var6];
        class236.field3543 = new int[var6];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; ++var9) {
            for (int var10 = 0; class184.field2546 >> 3 > var10; ++var10) {
                for (int var11 = 0; class240.field3555 >> 3 > var11; ++var11) {
                    int var12 = class742.field10347[var9][var10][var11];
                    if (~var12 != 0) {
                        int var13 = (16773003 & var12) >> 14;
                        int var14 = 2047 & var12 >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var8 > var16; ++var16) {
                            if (class284.field3961[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class284.field3961[var8] = var15;
                            int var17 = (65285 & var15) >> 8;
                            int var18 = var15 & 255;
                            class269.field3822[var8] = class275.field3876.method2602((byte) -126, "m" + var17 + "_" + var18);
                            class629.field8917[var8] = class275.field3876.method2602((byte) -123, "l" + var17 + "_" + var18);
                            class236.field3543[var8] = class275.field3876.method2602((byte) -119, "um" + var17 + "_" + var18);
                            class672.field9577[var8] = class275.field3876.method2602((byte) -118, "ul" + var17 + "_" + var18);
                            ++var8;
                        }
                    }
                }
            }
        }
        class426.method2648(var3, 11, -1070116028, var4, var1);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lha;Z)V", line = 205)
    public final void method597(class543 arg0, boolean arg1) {
        if (arg1) {
            this.method662(false, (class543) null, -110, -102);
        }
        ++field1157;
        Object var3 = null;
        class704 var5;
        if (this.field1163 == null && this.field1174) {
            class495 var4 = this.method662(true, arg0, 4, 262144);
            var5 = var4 != null ? var4.field7117 : null;
        } else {
            var5 = this.field1163;
            this.field1163 = null;
        }
        if (var5 != null) {
            class659.method3762(var5, super.field3924, super.field3923, super.field3916, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILha;)Z", line = 236)
    public final boolean method594(int arg0, int arg1, int arg2, class543 arg3) {
        ++field1159;
        class282 var5 = this.method664(0, arg3, 131072);
        if (arg2 != 1) {
            return false;
        } else if (var5 != null) {
            class121 var6 = arg3.method342();
            var6.method845(super.field3923, super.field3922, super.field3916);
            return class100.field1447 ? var5.method538(arg1, arg0, var6, false, 0, class680.field9660) : var5.method496(arg1, arg0, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V", line = 258)
    public static final void method661(int arg0, int arg1) {
        if (arg0 == 65535) {
            class346.field4930 = 1000000000L / (long) arg1;
            ++field1160;
        }
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(B)I", line = 270)
    public final int method599(byte arg0) {
        if (arg0 > -4) {
            method660((byte) 103);
        }
        ++field1176;
        return this.field1158 != null ? this.field1158.method507() : 0;
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(B)Z", line = 281)
    public final boolean method607(byte arg0) {
        ++field1170;
        int var2 = -75 / ((arg0 - 27) / 62);
        if (this.field1158 == null) {
            return true;
        } else {
            return !this.field1158.method504();
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(BLha;)V", line = 295)
    public final void method610(byte arg0, class543 arg1) {
        ++field1168;
        if (arg0 <= 51) {
            this.method611(82);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lha;I)V", line = 306)
    public final void method608(class543 arg0, int arg1) {
        int var3 = 46 % ((68 - arg1) / 32);
        ++field1167;
        Object var4 = null;
        class704 var6;
        if (this.field1163 == null && this.field1174) {
            class495 var5 = this.method662(true, arg0, 4, 262144);
            var6 = var5 == null ? null : var5.field7117;
        } else {
            var6 = this.field1163;
            this.field1163 = null;
        }
        if (var6 != null) {
            class667.method3808(var6, super.field3924, super.field3923, super.field3916, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)I", line = 332)
    public final int method601(byte arg0) {
        if (arg0 <= 86) {
            this.method610((byte) 92, (class543) null);
        }
        ++field1155;
        return 65535 & this.field1175;
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(BLha;)Lro;", line = 347)
    public final class522 method602(byte arg0, class543 arg1) {
        ++field1179;
        if (arg0 >= -114) {
            return null;
        } else {
            if (this.field1161 == null) {
                this.field1161 = class222.method1551(this.method664(0, arg1, 0), super.field3923, super.field3922, super.field3916, 34);
            }
            return this.field1161;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)I", line = 362)
    public final int method606(int arg0) {
        if (arg0 > -32) {
            this.method601((byte) -97);
        }
        ++field1181;
        return this.field1165;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLha;II)Lmg;", line = 373)
    private final class495 method662(boolean arg0, class543 arg1, int arg2, int arg3) {
        ++field1169;
        class482 var5 = class375.field5421.method2680(65535 & this.field1175, (byte) 122);
        if (arg2 != 4) {
            return null;
        } else {
            class339 var6;
            class339 var7;
            if (!this.field1172) {
                var6 = class491.field7079[super.field3924];
                if (~super.field3924 <= -4) {
                    var7 = null;
                } else {
                    var7 = class491.field7079[super.field3924 + 1];
                }
            } else {
                var6 = class25.field221[super.field3924];
                var7 = class491.field7079[0];
            }
            return var5.method2942(super.field3923, this.field1165, arg0, super.field3916, this.field1178, arg3, arg1, super.field3922, (byte) 95, var6, var7);
        }
    }

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "(I)V", line = 406)
    public static void method663(int arg0) {
        field1154 = null;
        if (arg0 != 4) {
            field1154 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)I", line = 417)
    public final int method604(byte arg0) {
        if (arg0 != 94) {
            this.field1172 = true;
        }
        ++field1173;
        return this.field1178;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLha;)Lqs;", line = 430)
    public final class603 method613(byte arg0, class543 arg1) {
        ++field1171;
        if (this.field1158 == null) {
            return null;
        } else if (arg0 < 76) {
            return null;
        } else {
            class121 var3 = arg1.method342();
            var3.method845(super.field3923 - -super.field1778, super.field3922, super.field1779 + super.field3916);
            class603 var4 = class6.method26(this.field1153, 112, 1);
            if (!class100.field1447) {
                this.field1158.method533(var3, var4.field8543[0], 0);
            } else {
                this.field1158.method503(var3, var4.field8543[0], class680.field9660, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)Z", line = 459)
    public final boolean method611(int arg0) {
        ++field1180;
        if (arg0 != 15795) {
            this.field1178 = 57;
        }
        return this.field1174;
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)V", line = 472)
    public final void method598(byte arg0) {
        if (arg0 <= -9) {
            if (this.field1158 != null) {
                this.field1158.method499();
            }
            ++field1182;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILha;I)Lka;", line = 487)
    private final class282 method664(int arg0, class543 arg1, int arg2) {
        ++field1164;
        if (arg0 != 0) {
            return null;
        } else if (this.field1158 != null && arg1.method300(this.field1158.method528(), arg2) == 0) {
            return this.field1158;
        } else {
            class495 var4 = this.method662(false, arg1, 4, arg2);
            return var4 != null ? var4.field7119 : null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(Z)V", line = 509)
    public static final void method665(boolean arg0) {
        class172.field2412.method2220(false);
        if (arg0) {
            ++field1162;
            class207.field3137.method2220(false);
            class445.field6357.method2220(false);
            class56.field960.method2220(false);
        }
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)I", line = 523)
    public final int method595(int arg0) {
        ++field1177;
        if (arg0 != 32767) {
            this.method608((class543) null, -48);
        }
        return this.field1158 == null ? 0 : this.field1158.method511();
    }
}
