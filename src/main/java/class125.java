import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class125 extends class83 {

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "I")
    public int field1606 = 1638;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
    public int field1605 = 4;

    @OriginalMember(owner = "client!nc", name = "ab", descriptor = "Z")
    public boolean field1609 = true;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
    public int field1602 = 0;

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
    public int field1608 = 4;

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "[B")
    private byte[] field1607 = new byte[512];

    @OriginalMember(owner = "client!nc", name = "db", descriptor = "I")
    public int field1612 = 4;

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "F")
    public static float field1604 = 0.0F;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!nc", name = "bb", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!nc", name = "cb", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!nc", name = "eb", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!nc", name = "fb", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!nc", name = "gb", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!nc", name = "hb", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "Lam;")
    public static class286 field1599;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "[S")
    private short[] field1594;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "[S")
    private short[] field1596;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
    private final void method671(int arg0) {
        if (arg0 >= this.field1606) {
            if (this.field1596 != null && this.field1596.length == this.field1605) {
                this.field1594 = new short[this.field1605];
                for (int var2 = 0; ~var2 > ~this.field1605; ++var2) {
                    this.field1594[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field1596 = new short[this.field1605];
            this.field1594 = new short[this.field1605];
            for (int var3 = 0; ~var3 > ~this.field1605; ++var3) {
                this.field1596[var3] = (short) ((int) (Math.pow((double) ((float) this.field1606 / 4096.0F), (double) var3) * 4096.0D));
                this.field1594[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field1614;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBLtq;)V")
    public final void method35(int arg0, byte arg1, class250 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field1612 = arg2.method1350(31351);
                                }
                            } else {
                                this.field1608 = arg2.method1350(31351);
                            }
                        } else {
                            this.field1602 = arg2.method1350(31351);
                        }
                    } else {
                        this.field1608 = this.field1612 = arg2.method1350(31351);
                    }
                } else {
                    this.field1606 = arg2.method1366((byte) 36);
                    if (~this.field1606 > -1) {
                        this.field1596 = new short[this.field1605];
                        for (int var5 = 0; ~this.field1605 < ~var5; ++var5) {
                            this.field1596[var5] = (short) arg2.method1366((byte) 49);
                        }
                    }
                }
            } else {
                this.field1605 = arg2.method1350(31351);
            }
        } else {
            this.field1609 = ~arg2.method1350(31351) == -2;
        }
        int var6 = -83 / ((arg1 - -27) / 50);
        ++field1613;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)V")
    public final void method120(boolean arg0) {
        this.field1607 = class427.method2645((byte) -93, this.field1602);
        ++field1615;
        this.method671(0);
        for (int var2 = this.field1605 - 1; ~var2 <= -2; --var2) {
            short var3 = this.field1596[var2];
            if (var3 > 8 || ~var3 > 7) {
                break;
            }
            --this.field1605;
        }
        if (arg0) {
            this.field1596 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public static final boolean method672(boolean arg0, String arg1) {
        if (!arg0) {
            method674((class194) null, (class175) null, -36, 38, 79, -56, -47, -89, -11);
        }
        ++field1593;
        return class393.method2444(true, 10, (byte) -121, arg1);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIII)I")
    private final int method673(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1597;
        int var8 = arg4 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        if (var9 >= arg0) {
            var9 = 0;
        }
        int var11 = arg4 & 4095;
        int var12 = var11 + -4096;
        int var13 = arg1 + -4096;
        int var14 = var9 & 255;
        int var15 = class349.field4856[var11];
        int var16 = 3 & this.field1607[arg6 + var10];
        int var17;
        if (~var16 >= -2) {
            var17 = ~var16 != -1 ? arg1 - var11 : arg1 + var11;
        } else {
            var17 = ~var16 == -3 ? var11 - arg1 : -var11 - arg1;
        }
        int var18 = this.field1607[arg6 + var14] & 3;
        int var19;
        if (var18 > 1) {
            var19 = ~var18 != -3 ? -arg1 + -var12 : -arg1 + var12;
        } else {
            var19 = ~var18 == -1 ? arg1 + var12 : arg1 - var12;
        }
        int var20 = 3 & this.field1607[arg3 + var10];
        int var21 = ((var19 - var17) * var15 >> 12) + var17;
        if (arg5 < 30) {
            this.method35(-69, (byte) 92, (class250) null);
        }
        int var22;
        if (~var20 < -2) {
            var22 = ~var20 == -3 ? -var13 + var11 : -var11 + -var13;
        } else {
            var22 = ~var20 != -1 ? var13 - var11 : var11 + var13;
        }
        int var23 = this.field1607[arg3 + var14] & 3;
        int var24;
        if (var23 > 1) {
            var24 = ~var23 == -3 ? -var13 + var12 : -var12 - var13;
        } else {
            var24 = ~var23 == -1 ? var12 + var13 : -var12 + var13;
        }
        int var25 = ((var24 - var22) * var15 >> 12) + var22;
        return ((-var21 + var25) * arg2 >> 12) + var21;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lfd;Lgo;IIIIIII)V")
    public static final void method674(class194 arg0, class175 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1603;
        if (arg3 != -1) {
            field1610 = -62;
        }
        int var9 = arg2 * arg2 + arg6 * arg6;
        if (~arg4 <= ~var9) {
            int var10 = Math.min(arg0.field2501 / 2, arg0.field2460 / 2);
            if (~var9 >= ~(var10 * var10)) {
                class274.method1512(arg0, arg2, class131.field1696[arg7], false, arg8, arg5, arg1, arg6);
            } else {
                var10 -= 10;
                int var11;
                if (class294.field3993 == 4) {
                    var11 = 16383 & (int) class425.field6241;
                } else {
                    var11 = (int) class425.field6241 + class136.field1731 & 16383;
                }
                int var12 = class356.field5037[var11];
                int var13 = class356.field5025[var11];
                if (~class294.field3993 != -5) {
                    var12 = var12 * 256 / (class411.field5937 - -256);
                    var13 = var13 * 256 / (class411.field5937 - -256);
                }
                int var14 = arg2 * var12 - -(arg6 * var13) >> 15;
                int var15 = arg2 * var13 - arg6 * var12 >> 15;
                double var16 = Math.atan2((double) var14, (double) var15);
                int var18 = (int) (Math.sin(var16) * (double) var10);
                int var19 = (int) ((double) var10 * Math.cos(var16));
                class220.field2943[arg7].method103((float) arg0.field2501 / 2.0F + (float) arg8 + (float) var18, (float) arg0.field2460 / 2.0F + (float) arg5 + (float) (-var19), 4096, (int) (-var16 / 6.283185307179586D * 65535.0D));
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    public class125() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILfd;)I")
    public static final int method675(int arg0, int arg1, class194 arg2) {
        ++field1595;
        if (arg0 != 0) {
            field1604 = -1.5523051F;
        }
        if (!client.method1410(arg2).method1176(arg1, -113) && arg2.field2526 == null) {
            return -1;
        } else {
            return arg2.field2468 != null && ~arg2.field2468.length < ~arg1 ? arg2.field2468[arg1] : -1;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(Z)V")
    public static void method676(boolean arg0) {
        field1599 = null;
        if (arg0) {
            field1604 = -0.45020357F;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)V")
    public static final void method677(byte arg0, int arg1) {
        ++field1598;
        if (arg0 >= 118) {
            if (class427.field6263 == null || arg1 > class427.field6263.length) {
                class427.field6263 = new int[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field1611;
        if (arg0 != 2) {
            return null;
        } else {
            int[] var3 = super.field916.method1813(arg1, (byte) -115);
            if (super.field916.field4174) {
                this.method678(-7126, var3, arg1);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[II)V")
    public final void method678(int arg0, int[] arg1, int arg2) {
        ++field1601;
        int var4 = class225.field3036[arg2] * this.field1612;
        if (arg0 != -7126) {
            this.field1609 = true;
        }
        if (~this.field1605 != -2) {
            short var5 = this.field1596[0];
            if (~var5 < -9 || ~var5 > 7) {
                int var6 = this.field1594[0] << 12;
                int var7 = this.field1608 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = this.field1612 * var6 >> 12;
                int var10 = var8 >> 12;
                int var11 = var10 + 1;
                int var12 = var8 & 4095;
                if (~var9 >= ~var11) {
                    var11 = 0;
                }
                int var13 = this.field1607[255 & var10] & 255;
                int var14 = class349.field4856[var12];
                int var15 = this.field1607[255 & var11] & 255;
                for (int var16 = 0; class420.field6139 > var16; ++var16) {
                    int var36 = class402.field5863[var16] * this.field1608;
                    int var37 = this.method673(var7, var12, var14, var15, var6 * var36 >> 12, arg0 ^ -7101, var13);
                    arg1[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; ~this.field1605 < ~var17; ++var17) {
                short var18 = this.field1596[var17];
                if (~var18 < -9 || ~var18 > 7) {
                    int var19 = this.field1594[var17] << 12;
                    int var20 = this.field1612 * var19 >> 12;
                    int var21 = var4 * var19 >> 12;
                    int var22 = this.field1608 * var19 >> 12;
                    int var23 = var21 >> 12;
                    int var24 = var23 - -1;
                    int var25 = var21 & 4095;
                    if (var20 <= var24) {
                        var24 = 0;
                    }
                    int var26 = 255 & this.field1607[255 & var23];
                    int var27 = class349.field4856[var25];
                    int var28 = 255 & this.field1607[255 & var24];
                    if (this.field1609 && this.field1605 + -1 == var17) {
                        for (int var29 = 0; var29 < class420.field6139; ++var29) {
                            int var30 = class402.field5863[var29] * this.field1608;
                            int var31 = this.method673(var22, var25, var27, var28, var19 * var30 >> 12, arg0 ^ -7058, var26);
                            int var32 = (var18 * var31 >> 12) + arg1[var29];
                            arg1[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; var33 < class420.field6139; ++var33) {
                            int var34 = class402.field5863[var33] * this.field1608;
                            int var35 = this.method673(var22, var25, var27, var28, var19 * var34 >> 12, 80, var26);
                            arg1[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field1594[0] << 12;
            short var39 = this.field1596[0];
            int var40 = this.field1608 * var38 >> 12;
            int var41 = var4 * var38 >> 12;
            int var42 = this.field1612 * var38 >> 12;
            int var43 = var41 >> 12;
            int var44 = var43 + 1;
            if (var44 >= var42) {
                var44 = 0;
            }
            int var45 = var41 & 4095;
            int var46 = 255 & this.field1607[var44 & 255];
            int var47 = class349.field4856[var45];
            int var48 = this.field1607[255 & var43] & 255;
            if (!this.field1609) {
                for (int var49 = 0; ~var49 > ~class420.field6139; ++var49) {
                    int var50 = class402.field5863[var49] * this.field1608;
                    int var51 = this.method673(var40, var45, var47, var46, var38 * var50 >> 12, 63, var48);
                    arg1[var49] = var39 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; ~class420.field6139 < ~var52; ++var52) {
                    int var53 = class402.field5863[var52] * this.field1608;
                    int var54 = this.method673(var40, var45, var47, var46, var38 * var53 >> 12, 67, var48);
                    int var55 = var39 * var54 >> 12;
                    arg1[var52] = (var55 >> 1) + 2048;
                }
            }
        }
    }
}
