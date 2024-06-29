import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class250 extends class228 {

    @OriginalMember(owner = "client!sc", name = "bb", descriptor = "I")
    private int field4307 = 4;

    @OriginalMember(owner = "client!sc", name = "cb", descriptor = "I")
    private int field4308 = 1638;

    @OriginalMember(owner = "client!sc", name = "ab", descriptor = "I")
    private int field4306 = 4;

    @OriginalMember(owner = "client!sc", name = "ib", descriptor = "I")
    private int field4314 = 4;

    @OriginalMember(owner = "client!sc", name = "lb", descriptor = "I")
    private int field4317 = 0;

    @OriginalMember(owner = "client!sc", name = "kb", descriptor = "[B")
    private byte[] field4316 = new byte[512];

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "Z")
    private boolean field4301 = true;

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "Loa;")
    public static class99 field4305 = class221.method1463(2844, "rot:");

    @OriginalMember(owner = "client!sc", name = "jb", descriptor = "Lwk;")
    public static class273 field4315 = new class273(64);

    @OriginalMember(owner = "client!sc", name = "nb", descriptor = "Loa;")
    private static class99 field4319 = class221.method1463(2844, " is already on your ignore list)3");

    @OriginalMember(owner = "client!sc", name = "rb", descriptor = "Loa;")
    public static class99 field4323 = field4319;

    @OriginalMember(owner = "client!sc", name = "pb", descriptor = "Z")
    public static boolean field4321 = false;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!sc", name = "db", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!sc", name = "fb", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!sc", name = "hb", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!sc", name = "ob", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!sc", name = "qb", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!sc", name = "eb", descriptor = "[S")
    private short[] field4310;

    @OriginalMember(owner = "client!sc", name = "mb", descriptor = "[S")
    private short[] field4318;

    @OriginalMember(owner = "client!sc", name = "gb", descriptor = "[Z")
    public static boolean[] field4312;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(B)V")
    public static void method1616(byte arg0) {
        field4312 = null;
        field4323 = null;
        field4319 = null;
        field4315 = null;
        field4305 = null;
        if (arg0 != 32) {
            field4315 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(BI)V")
    public static final void method1617(byte arg0, int arg1) {
        class189.field3336.method1809(arg1, (byte) 98);
        ++field4313;
        if (arg0 < 123) {
            field4319 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        if (arg1 != -3) {
            method1617((byte) -57, 16);
        }
        ++field4320;
        int[] var3 = super.field3952.method1262(arg0, 7492);
        if (super.field3952.field3276) {
            this.method1619(arg0, var3, arg1 ^ -254);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "(B)V")
    public static final void method1618(byte arg0) {
        class201.field3489.method1812(-118);
        ++field4322;
        if (arg0 != 104) {
            method1618((byte) -65);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[II)V")
    private final void method1619(int arg0, int[] arg1, int arg2) {
        ++field4300;
        int var4 = class54.field879[arg0] * this.field4314;
        if (arg2 == 255) {
            if (this.field4306 != 1) {
                short var5 = this.field4318[0];
                if (~var5 < -9 || var5 < -8) {
                    int var6 = this.field4310[0] << 12;
                    int var7 = this.field4314 * var6 >> 12;
                    int var8 = this.field4307 * var6 >> 12;
                    int var9 = var4 * var6 >> 12;
                    int var10 = var9 >> 12;
                    int var11 = var9 & 4095;
                    int var12 = 255 & this.field4316[var10 & 255];
                    int var13 = class42.field710[var11];
                    int var14 = var10 + 1;
                    if (~var7 >= ~var14) {
                        var14 = 0;
                    }
                    int var15 = this.field4316[var14 & 255] & 255;
                    for (int var16 = 0; ~class234.field4046 < ~var16; ++var16) {
                        int var36 = class281.field4923[var16] * this.field4307;
                        int var37 = this.method1623(var13, var6 * var36 >> 12, var15, (byte) 127, var8, var12, var11);
                        arg1[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; this.field4306 > var17; ++var17) {
                    short var18 = this.field4318[var17];
                    if (~var18 < -9 || ~var18 > 7) {
                        int var19 = this.field4310[var17] << 12;
                        int var20 = this.field4307 * var19 >> 12;
                        int var21 = var4 * var19 >> 12;
                        int var22 = var21 >> 12;
                        int var23 = var22 + 1;
                        int var24 = var21 & 4095;
                        int var25 = class42.field710[var24];
                        int var26 = this.field4314 * var19 >> 12;
                        if (var26 <= var23) {
                            var23 = 0;
                        }
                        int var27 = 255 & this.field4316[255 & var22];
                        int var28 = 255 & this.field4316[255 & var23];
                        if (this.field4301 && ~(this.field4306 + -1) == ~var17) {
                            for (int var29 = 0; ~var29 > ~class234.field4046; ++var29) {
                                int var30 = class281.field4923[var29] * this.field4307;
                                int var31 = this.method1623(var25, var19 * var30 >> 12, var28, (byte) 126, var20, var27, var24);
                                int var32 = (var18 * var31 >> 12) + arg1[var29];
                                arg1[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; var33 < class234.field4046; ++var33) {
                                int var34 = class281.field4923[var33] * this.field4307;
                                int var35 = this.method1623(var25, var19 * var34 >> 12, var28, (byte) 127, var20, var27, var24);
                                arg1[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                short var38 = this.field4318[0];
                int var39 = this.field4310[0] << 12;
                int var40 = this.field4307 * var39 >> 12;
                int var41 = var4 * var39 >> 12;
                int var42 = this.field4314 * var39 >> 12;
                int var43 = var41 >> 12;
                int var44 = var43 - -1;
                if (~var42 >= ~var44) {
                    var44 = 0;
                }
                int var45 = var41 & 4095;
                int var46 = class42.field710[var45];
                int var47 = this.field4316[var44 & 255] & 255;
                int var48 = 255 & this.field4316[255 & var43];
                if (this.field4301) {
                    for (int var49 = 0; ~class234.field4046 < ~var49; ++var49) {
                        int var50 = class281.field4923[var49] * this.field4307;
                        int var51 = this.method1623(var46, var39 * var50 >> 12, var47, (byte) 125, var40, var48, var45);
                        int var52 = var38 * var51 >> 12;
                        arg1[var49] = 2048 - -(var52 >> 1);
                    }
                } else {
                    for (int var53 = 0; var53 < class234.field4046; ++var53) {
                        int var54 = class281.field4923[var53] * this.field4307;
                        int var55 = this.method1623(var46, var39 * var54 >> 12, var47, (byte) 126, var40, var48, var45);
                        arg1[var53] = var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1620(byte arg0, byte[] arg1) {
        ++field4298;
        class261 var2 = new class261(arg1);
        int var3 = var2.method1693((byte) 122);
        int var4 = var2.method1712(-4);
        if (~var4 <= -1 && (~class193.field3391 == -1 || var4 <= class193.field3391)) {
            int var5 = -59 / ((arg0 - -12) / 47);
            if (~var3 == -1) {
                byte[] var6 = new byte[var4];
                var2.method1698(var6, var4, -6215, 0);
                return var6;
            } else {
                int var7 = var2.method1712(-4);
                if (~var7 > -1 || ~class193.field3391 != -1 && class193.field3391 < var7) {
                    throw new RuntimeException();
                } else {
                    byte[] var8 = new byte[var7];
                    if (~var3 == -2) {
                        class246.method1594(var8, var7, arg1, var4, 9);
                    } else {
                        class247.field4239.method1774((byte) 88, var2, var8);
                    }
                    return var8;
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIZLjb;)V")
    public static final void method1621(int arg0, int arg1, int arg2, int arg3, boolean arg4, class270 arg5) {
        ++field4303;
        if (~class179.field3110 > -51) {
            if (arg5.field4752 != null && ~arg1 > ~arg5.field4752.length && arg5.field4752[arg1] != null) {
                if (arg3 <= 12) {
                    method1620((byte) 35, (byte[]) null);
                }
                int var6 = arg5.field4752[arg1][0];
                int var7 = var6 >> 8;
                int var8 = (var6 & 112) >> 4;
                int var9 = 15 & var6;
                if (arg5.field4752[arg1].length > 1) {
                    int var10 = (int) ((double) arg5.field4752[arg1].length * Math.random());
                    if (var10 > 0) {
                        var7 = arg5.field4752[arg1][var10];
                    }
                }
                if (~var9 == -1) {
                    if (arg4) {
                        class169.method1145(0, 25112, var8, var7);
                    }
                } else if (class92.field1550 != 0) {
                    class267.field4711[class179.field3110] = var7;
                    class166.field2960[class179.field3110] = var8;
                    class171.field3044[class179.field3110] = 0;
                    class118.field2083[class179.field3110] = null;
                    int var11 = (arg0 + -64) / 128;
                    int var12 = (arg2 - 64) / 128;
                    class227.field3926[class179.field3110] = (var11 << 16) + var9 - -(var12 << 8);
                    ++class179.field3110;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
    public final void method278(int arg0) {
        if (arg0 != -8) {
            method1617((byte) -23, -72);
        }
        this.field4316 = class131.method869(255, this.field4317);
        this.method1622(arg0 + 83);
        for (int var2 = this.field4306 - 1; ~var2 <= -2; --var2) {
            short var3 = this.field4318[var2];
            if (~var3 < -9 || var3 < -8) {
                break;
            }
            --this.field4306;
        }
        ++field4299;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
    private final void method1622(int arg0) {
        ++field4302;
        if (arg0 < 45) {
            this.field4301 = true;
        }
        if (this.field4308 <= 0) {
            if (this.field4318 != null && this.field4318.length == this.field4306) {
                this.field4310 = new short[this.field4306];
                for (int var2 = 0; ~var2 > ~this.field4306; ++var2) {
                    this.field4310[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field4318 = new short[this.field4306];
            this.field4310 = new short[this.field4306];
            for (int var3 = 0; this.field4306 > var3; ++var3) {
                this.field4318[var3] = (short) ((int) (Math.pow((double) ((float) this.field4308 / 4096.0F), (double) var3) * 4096.0D));
                this.field4310[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIBIII)I")
    private final int method1623(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field4304;
        int var8 = arg6 + -4096;
        int var9 = arg1 >> 12;
        int var10 = arg1 & 4095;
        int var11 = var9 + 1;
        if (var11 >= arg4) {
            var11 = 0;
        }
        int var12 = var9 & 255;
        int var13 = var11 & 255;
        int var14 = class42.field710[var10];
        if (arg3 < 124) {
            this.field4306 = 9;
        }
        int var15 = this.field4316[arg5 + var12] & 3;
        int var16 = var10 - 4096;
        int var17;
        if (var15 <= 1) {
            var17 = ~var15 != -1 ? arg6 - var10 : arg6 + var10;
        } else {
            var17 = var15 != 2 ? -var10 - arg6 : -arg6 + var10;
        }
        int var18 = 3 & this.field4316[var13 - -arg5];
        int var19;
        if (~var18 >= -2) {
            var19 = var18 == 0 ? arg6 + var16 : -var16 + arg6;
        } else {
            var19 = var18 != 2 ? -arg6 + -var16 : -arg6 + var16;
        }
        int var20 = 3 & this.field4316[arg2 + var12];
        int var21 = ((var19 - var17) * var14 >> 12) + var17;
        int var22;
        if (~var20 >= -2) {
            var22 = ~var20 != -1 ? -var10 + var8 : var8 + var10;
        } else {
            var22 = ~var20 != -3 ? -var8 + -var10 : -var8 + var10;
        }
        int var23 = this.field4316[arg2 + var13] & 3;
        int var24;
        if (~var23 < -2) {
            var24 = ~var23 != -3 ? -var16 - var8 : -var8 + var16;
        } else {
            var24 = var23 != 0 ? -var16 + var8 : var8 + var16;
        }
        int var25 = var22 - -((-var22 + var24) * var14 >> 12);
        return ((-var21 + var25) * arg0 >> 12) + var21;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class250() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        ++field4311;
        if (arg2 == -7618) {
            if (arg0 != 0) {
                if (~arg0 == -2) {
                    this.field4306 = arg1.method1693((byte) 48);
                } else {
                    if (arg0 != 2) {
                        if (arg0 == 3) {
                            this.field4307 = this.field4314 = arg1.method1693((byte) -104);
                            return;
                        }
                        if (arg0 == 4) {
                            this.field4317 = arg1.method1693((byte) -116);
                            return;
                        }
                        if (~arg0 == -6) {
                            this.field4307 = arg1.method1693((byte) 29);
                            return;
                        }
                        if (~arg0 == -7) {
                            this.field4314 = arg1.method1693((byte) -80);
                            return;
                        }
                    } else {
                        this.field4308 = arg1.method1751(arg2 ^ -7490);
                        if (this.field4308 < 0) {
                            this.field4318 = new short[this.field4306];
                            for (int var5 = 0; ~var5 > ~this.field4306; ++var5) {
                                this.field4318[var5] = (short) arg1.method1751(128);
                            }
                            return;
                        }
                    }
                }
            } else {
                this.field4301 = arg1.method1693((byte) 44) == 1;
            }
        }
    }
}
