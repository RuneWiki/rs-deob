import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class159 extends class7 {

    @OriginalMember(owner = "client!q", name = "T", descriptor = "Z")
    private boolean field3066 = true;

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "[B")
    private byte[] field3072 = new byte[512];

    @OriginalMember(owner = "client!q", name = "W", descriptor = "I")
    private int field3069 = 4;

    @OriginalMember(owner = "client!q", name = "bb", descriptor = "I")
    private int field3074 = 4;

    @OriginalMember(owner = "client!q", name = "kb", descriptor = "I")
    private int field3083 = 4;

    @OriginalMember(owner = "client!q", name = "hb", descriptor = "I")
    private int field3080 = 0;

    @OriginalMember(owner = "client!q", name = "lb", descriptor = "I")
    private int field3084 = 1638;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "Lob;")
    public static class141 field3068 = class175.method1195(40, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!q", name = "fb", descriptor = "I")
    public static int field3078 = 2;

    @OriginalMember(owner = "client!q", name = "jb", descriptor = "[I")
    public static int[] field3082 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!q", name = "R", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!q", name = "S", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!q", name = "X", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!q", name = "ab", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!q", name = "cb", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!q", name = "gb", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!q", name = "ib", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!q", name = "mb", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "Lca;")
    public static class22 field3067;

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "Lfa;")
    public static class52 field3071;

    @OriginalMember(owner = "client!q", name = "db", descriptor = "[S")
    private short[] field3076;

    @OriginalMember(owner = "client!q", name = "eb", descriptor = "[S")
    private short[] field3077;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "(I)Z")
    public static final boolean method1107(int arg0) {
        ++field3081;
        try {
            if (~class202.field3820 == -3) {
                if (class39.field788 == null) {
                    class39.field788 = class208.method1364(class119.field2322, class180.field3542, class53.field1006);
                    if (class39.field788 == null) {
                        return false;
                    }
                }
                if (class172.field3420 == null) {
                    class172.field3420 = new class144(class158.field3046, class34.field690);
                }
                if (class85.field1690.method487(class39.field788, class172.field3420, true, 22050, class6.field69)) {
                    class85.field1690.method475((byte) -116);
                    class85.field1690.method493(-124, class54.field1041);
                    class85.field1690.method491(class39.field788, class182.field3585, (byte) 78);
                    class202.field3820 = 0;
                    class172.field3420 = null;
                    class39.field788 = null;
                    class119.field2322 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class85.field1690.method472((byte) 64);
            class39.field788 = null;
            class119.field2322 = null;
            class172.field3420 = null;
            class202.field3820 = 0;
        }
        return arg0 < 38 ? false : false;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BIIIIII)I")
    private final int method1108(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3065;
        int var8 = arg1 + -4096;
        int var9 = arg6 >> 12;
        int var10 = var9 - -1;
        if (~var10 <= ~arg2) {
            var10 = 0;
        }
        int var11 = arg6 & 4095;
        int var12 = var9 & 255;
        int var13 = var10 & 255;
        int var14 = 3 & this.field3072[arg5 + var12];
        int var15 = var11 + -4096;
        int var16;
        if (var14 > 1) {
            var16 = ~var14 != -3 ? -arg1 + -var11 : -arg1 + var11;
        } else {
            var16 = ~var14 == -1 ? arg1 + var11 : -var11 + arg1;
        }
        int var17 = 3 & this.field3072[arg5 + var13];
        int var18 = class110.field2112[var11];
        int var19;
        if (var17 <= 1) {
            var19 = ~var17 == -1 ? arg1 + var15 : -var15 + arg1;
        } else {
            var19 = ~var17 != -3 ? -arg1 + -var15 : -arg1 + var15;
        }
        int var20 = ((-var16 + var19) * var18 >> 12) + var16;
        if (arg0 != -27) {
            method1111();
        }
        int var21 = 3 & this.field3072[var12 - -arg4];
        int var22;
        if (~var21 < -2) {
            var22 = ~var21 != -3 ? -var8 + -var11 : var11 - var8;
        } else {
            var22 = var21 == 0 ? var8 + var11 : var8 - var11;
        }
        int var23 = this.field3072[arg4 + var13] & 3;
        int var24;
        if (~var23 < -2) {
            var24 = var23 != 2 ? -var8 + -var15 : -var8 + var15;
        } else {
            var24 = ~var23 != -1 ? var8 - var15 : var8 + var15;
        }
        int var25 = ((-var22 + var24) * var18 >> 12) + var22;
        return var20 - -((-var20 + var25) * arg3 >> 12);
    }

    @OriginalMember(owner = "client!q", name = "j", descriptor = "(I)Z")
    public static final boolean method1109(int arg0) {
        ++field3070;
        class191 var1 = class150.field2889;
        synchronized (class150.field2889) {
            if (class83.field1650 == class132.field2513) {
                return false;
            } else {
                class81.field1631 = class46.field887[class132.field2513];
                class179.field3528 = class17.field309[class132.field2513];
                class132.field2513 = class132.field2513 + arg0 & 127;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)V")
    private final void method1110(byte arg0) {
        if (this.field3084 > 0) {
            this.field3077 = new short[this.field3074];
            this.field3076 = new short[this.field3074];
            for (int var2 = 0; var2 < this.field3074; ++var2) {
                this.field3076[var2] = (short) ((int) (Math.pow((double) ((float) this.field3084 / 4096.0F), (double) var2) * 4096.0D));
                this.field3077[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field3076 != null && ~this.field3076.length == ~this.field3074) {
            this.field3077 = new short[this.field3074];
            for (int var3 = 0; ~var3 > ~this.field3074; ++var3) {
                this.field3077[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 == -80) {
            ++field3085;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 <= 13) {
            this.method47(2);
        }
        ++field3073;
        int[] var3 = super.field100.method842(arg1, 12);
        if (super.field100.field2534) {
            int var4 = class177.field3503[arg1] * this.field3083;
            if (~this.field3074 == -2) {
                short var5 = this.field3076[0];
                int var6 = this.field3077[0] << 12;
                int var7 = this.field3083 * var6 >> 12;
                int var8 = this.field3069 * var6 >> 12;
                int var9 = var4 * var6 >> 12;
                int var10 = var9 >> 12;
                int var11 = 255 & this.field3072[var10 & 255];
                int var12 = var9 & 4095;
                int var13 = class110.field2112[var12];
                int var14 = var10 + 1;
                if (~var14 <= ~var7) {
                    var14 = 0;
                }
                int var15 = 255 & this.field3072[var14 & 255];
                if (!this.field3066) {
                    for (int var16 = 0; ~class117.field2272 < ~var16; ++var16) {
                        int var17 = class15.field272[var16] * this.field3069;
                        int var18 = this.method1108((byte) -27, var12, var8, var13, var15, var11, var6 * var17 >> 12);
                        var3[var16] = var5 * var18 >> 12;
                    }
                } else {
                    for (int var19 = 0; class117.field2272 > var19; ++var19) {
                        int var20 = class15.field272[var19] * this.field3069;
                        int var21 = this.method1108((byte) -27, var12, var8, var13, var15, var11, var6 * var20 >> 12);
                        int var22 = var5 * var21 >> 12;
                        var3[var19] = (var22 >> 1) + 2048;
                    }
                }
            } else {
                short var23 = this.field3076[0];
                if (var23 > 8 || var23 < -8) {
                    int var24 = this.field3077[0] << 12;
                    int var25 = var4 * var24 >> 12;
                    int var26 = var25 >> 12;
                    int var27 = 255 & this.field3072[var26 & 255];
                    int var28 = var25 & 4095;
                    int var29 = this.field3083 * var24 >> 12;
                    int var30 = class110.field2112[var28];
                    int var31 = var26 + 1;
                    int var32 = this.field3069 * var24 >> 12;
                    if (var31 >= var29) {
                        var31 = 0;
                    }
                    int var33 = 255 & this.field3072[255 & var31];
                    for (int var34 = 0; var34 < class117.field2272; ++var34) {
                        int var54 = class15.field272[var34] * this.field3069;
                        int var55 = this.method1108((byte) -27, var28, var32, var30, var33, var27, var24 * var54 >> 12);
                        var3[var34] = var23 * var55 >> 12;
                    }
                }
                for (int var35 = 1; var35 < this.field3074; ++var35) {
                    short var36 = this.field3076[var35];
                    if (var36 > 8 || ~var36 > 7) {
                        int var37 = this.field3077[var35] << 12;
                        int var38 = this.field3083 * var37 >> 12;
                        int var39 = var4 * var37 >> 12;
                        int var40 = this.field3069 * var37 >> 12;
                        int var41 = var39 >> 12;
                        int var42 = var39 & 4095;
                        int var43 = var41 + 1;
                        if (var38 <= var43) {
                            var43 = 0;
                        }
                        int var44 = class110.field2112[var42];
                        int var45 = this.field3072[var41 & 255] & 255;
                        int var46 = 255 & this.field3072[255 & var43];
                        if (this.field3066 && this.field3074 - 1 == var35) {
                            for (int var47 = 0; var47 < class117.field2272; ++var47) {
                                int var48 = class15.field272[var47] * this.field3069;
                                int var49 = this.method1108((byte) -27, var42, var40, var44, var46, var45, var37 * var48 >> 12);
                                int var50 = (var36 * var49 >> 12) + var3[var47];
                                var3[var47] = 2048 - -(var50 >> 1);
                            }
                        } else {
                            for (int var51 = 0; class117.field2272 > var51; ++var51) {
                                int var52 = class15.field272[var51] * this.field3069;
                                int var53 = this.method1108((byte) -27, var42, var40, var44, var46, var45, var37 * var52 >> 12);
                                var3[var51] += var36 * var53 >> 12;
                            }
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "f", descriptor = "(I)V")
    public final void method47(int arg0) {
        this.field3072 = class14.method87((byte) -43, this.field3080);
        ++field3064;
        if (arg0 == 1) {
            this.method1110((byte) -80);
            for (int var2 = this.field3074 + -1; ~var2 <= -2; --var2) {
                short var3 = this.field3076[var2];
                if (var3 > 8 || var3 < -8) {
                    return;
                }
                --this.field3074;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class159() {
        super(0, true);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()V")
    public static final void method1111() {
        int var0 = class160.field3089[class53.field1009];
        class87[] var1 = class160.field3093[class53.field1009];
        class225.field4246 = 0;
        for (int var2 = 0; var2 < var0; ++var2) {
            class87 var3 = var1[var2];
            if (var3.field1734 == 1) {
                int var4 = var3.field1727 - class213.field4066 + class12.field230;
                if (var4 >= 0 && var4 <= class12.field230 + class12.field230) {
                    int var5 = var3.field1732 - class77.field1567 + class12.field230;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = var3.field1733 - class77.field1567 + class12.field230;
                    if (var6 > class12.field230 + class12.field230) {
                        var6 = class12.field230 + class12.field230;
                    }
                    boolean var7 = false;
                    while (var5 <= var6) {
                        if (class34.field694[var4][var5++]) {
                            var7 = true;
                            break;
                        }
                    }
                    if (var7) {
                        int var8 = class18.field316 - var3.field1720;
                        if (var8 > 32) {
                            var3.field1743 = 1;
                        } else {
                            if (var8 >= -32) {
                                continue;
                            }
                            var3.field1743 = 2;
                            var8 = -var8;
                        }
                        var3.field1744 = (var3.field1719 - class35.field710 << 8) / var8;
                        var3.field1731 = (var3.field1740 - class35.field710 << 8) / var8;
                        var3.field1736 = (var3.field1718 - class162.field3145 << 8) / var8;
                        var3.field1746 = (var3.field1749 - class162.field3145 << 8) / var8;
                        class9.field159[class225.field4246++] = var3;
                    }
                }
            } else if (var3.field1734 == 2) {
                int var9 = var3.field1732 - class77.field1567 + class12.field230;
                if (var9 >= 0 && var9 <= class12.field230 + class12.field230) {
                    int var10 = var3.field1727 - class213.field4066 + class12.field230;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    int var11 = var3.field1723 - class213.field4066 + class12.field230;
                    if (var11 > class12.field230 + class12.field230) {
                        var11 = class12.field230 + class12.field230;
                    }
                    boolean var12 = false;
                    while (var10 <= var11) {
                        if (class34.field694[var10++][var9]) {
                            var12 = true;
                            break;
                        }
                    }
                    if (var12) {
                        int var13 = class35.field710 - var3.field1719;
                        if (var13 > 32) {
                            var3.field1743 = 3;
                        } else {
                            if (var13 >= -32) {
                                continue;
                            }
                            var3.field1743 = 4;
                            var13 = -var13;
                        }
                        var3.field1726 = (var3.field1720 - class18.field316 << 8) / var13;
                        var3.field1742 = (var3.field1728 - class18.field316 << 8) / var13;
                        var3.field1736 = (var3.field1718 - class162.field3145 << 8) / var13;
                        var3.field1746 = (var3.field1749 - class162.field3145 << 8) / var13;
                        class9.field159[class225.field4246++] = var3;
                    }
                }
            } else if (var3.field1734 == 4) {
                int var14 = var3.field1718 - class162.field3145;
                if (var14 > 128) {
                    int var15 = var3.field1732 - class77.field1567 + class12.field230;
                    if (var15 < 0) {
                        var15 = 0;
                    }
                    int var16 = var3.field1733 - class77.field1567 + class12.field230;
                    if (var16 > class12.field230 + class12.field230) {
                        var16 = class12.field230 + class12.field230;
                    }
                    if (var15 <= var16) {
                        int var17 = var3.field1727 - class213.field4066 + class12.field230;
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        int var18 = var3.field1723 - class213.field4066 + class12.field230;
                        if (var18 > class12.field230 + class12.field230) {
                            var18 = class12.field230 + class12.field230;
                        }
                        boolean var19 = false;
                        label145: for (int var20 = var17; var20 <= var18; ++var20) {
                            for (int var21 = var15; var21 <= var16; ++var21) {
                                if (class34.field694[var20][var21]) {
                                    var19 = true;
                                    break label145;
                                }
                            }
                        }
                        if (var19) {
                            var3.field1743 = 5;
                            var3.field1726 = (var3.field1720 - class18.field316 << 8) / var14;
                            var3.field1742 = (var3.field1728 - class18.field316 << 8) / var14;
                            var3.field1744 = (var3.field1719 - class35.field710 << 8) / var14;
                            var3.field1731 = (var3.field1740 - class35.field710 << 8) / var14;
                            class9.field159[class225.field4246++] = var3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        ++field3075;
        int var4 = 113 % ((arg1 - 66) / 57);
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field3074 = arg2.method991(255);
            } else {
                if (~arg0 != -3) {
                    if (~arg0 == -4) {
                        this.field3069 = this.field3083 = arg2.method991(255);
                        return;
                    }
                    if (~arg0 == -5) {
                        this.field3080 = arg2.method991(255);
                        return;
                    }
                    if (arg0 == 5) {
                        this.field3069 = arg2.method991(255);
                        return;
                    }
                    if (arg0 == 6) {
                        this.field3083 = arg2.method991(255);
                        return;
                    }
                } else {
                    this.field3084 = arg2.method992((byte) -67);
                    if (this.field3084 < 0) {
                        this.field3076 = new short[this.field3074];
                        for (int var6 = 0; this.field3074 > var6; ++var6) {
                            this.field3076[var6] = (short) arg2.method992((byte) -67);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field3066 = arg2.method991(255) == 1;
        }
    }

    @OriginalMember(owner = "client!q", name = "k", descriptor = "(I)V")
    public static void method1112(int arg0) {
        field3067 = null;
        field3082 = null;
        field3071 = null;
        field3068 = null;
        if (arg0 != 0) {
            method1109(-24);
        }
    }
}
