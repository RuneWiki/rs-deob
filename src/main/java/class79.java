import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class79 extends class657 {

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "F")
    private float field1408 = 0.0F;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "Lur;")
    private class537 field1411;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "S")
    public static short field1413 = 1;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "Lfh;")
    public static class652 field1419 = new class652("WTRC", 1);

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
    public static int field1423 = 0;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "Lmu;")
    public static class303 field1421 = new class303(103, 8);

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "Lin;")
    public static class91 field1420;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 4)
    public static final String method725(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field1407;
        char[] var4 = new char[arg2];
        int var5 = 0;
        for (int var6 = arg1; ~arg2 < ~var6; ++var6) {
            int var7 = 255 & arg0[arg3 + var6];
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class211.field3001[var7 - 128];
                    if (var8 == 0) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I", line = 45)
    public static final int method726(int arg0, int arg1) {
        return class755.field10550 != null ? class755.field10550[arg0][arg1] & 16777215 : 0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILff;[I[I[I)V", line = 49)
    public static final void method727(int arg0, class9 arg1, int[] arg2, int[] arg3, int[] arg4) {
        if (arg0 != -7387) {
            method732((byte) 10);
        }
        for (int var5 = 0; arg3.length > var5; ++var5) {
            int var6 = arg3[var5];
            int var7 = arg2[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var7 != 0 && ~var9 > ~arg1.field5734.length; ++var9) {
                if ((1 & var7) != 0) {
                    if (~var6 != 0) {
                        class691 var10 = class456.field6436.method1021(var6, arg0 + 7394);
                        int var11 = var10.field9338;
                        class117 var12 = arg1.field5734[var9];
                        if (var12 != null) {
                            if (~var12.field1997 != ~var6) {
                                if (~var10.field9329 <= ~class456.field6436.method1021(var12.field1997, 7).field9329) {
                                    var12 = arg1.field5734[var9] = null;
                                }
                            } else if (var11 == 0) {
                                var12 = arg1.field5734[var9] = null;
                            } else if (~var11 != -2) {
                                if (var11 == 2) {
                                    var12.field1988 = 0;
                                }
                            } else {
                                var12.field1991 = var8;
                                var12.field1999 = 0;
                                var12.field1998 = 1;
                                var12.field1994 = 0;
                                var12.field1988 = 0;
                                if (!arg1.field5735) {
                                    class190.method1366(arg1, 0, var10, -75);
                                }
                            }
                        }
                        if (var12 == null) {
                            class117 var13 = arg1.field5734[var9] = new class117();
                            var13.field1998 = 1;
                            var13.field1997 = var6;
                            var13.field1999 = 0;
                            var13.field1988 = 0;
                            var13.field1994 = 0;
                            var13.field1991 = var8;
                            if (!arg1.field5735) {
                                class190.method1366(arg1, 0, var10, -19);
                            }
                        }
                    } else {
                        arg1.field5734[var9] = null;
                    }
                }
                var7 >>>= 1;
            }
        }
        ++field1417;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lwga;Lur;)V", line = 175)
    public class79(class745 arg0, class537 arg1) {
        super(arg0);
        this.field1411 = arg1;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V", line = 156)
    public final void method728(byte arg0) {
        super.field9010.method4126(1, -4382);
        if (arg0 != 87) {
            method729(-29, (byte) -5);
        }
        ++field1422;
        super.field9010.method4112(class534.field7355, 120, class534.field7355);
        super.field9010.method4096((byte) 47, 0, class755.field10544);
        super.field9010.method4117(0, true, class755.field10544);
        super.field9010.method2259((byte) -26, 1);
        super.field9010.method4097((byte) 86, (class357) null);
        super.field9010.method4126(0, -4382);
        super.field9010.method4117(0, true, class755.field10544);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IB)Z", line = 188)
    public static final boolean method729(int arg0, byte arg1) {
        ++field1409;
        int var2 = -72 / ((37 - arg1) / 48);
        if (arg0 != 25 && arg0 != 20 && arg0 != 44 && arg0 != 46 && ~arg0 != -61) {
            return ~arg0 == -31 || arg0 == 1008;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V", line = 205)
    public final void method730(int arg0, int arg1, int arg2) {
        super.field9010.method4126(1, -4382);
        ++field1412;
        if (arg0 != 10756) {
            this.method736(-26, (class357) null, 111);
        }
        if (~(128 & arg1) == -1) {
            if ((1 & arg2) != 1) {
                if (this.field1411.field7428) {
                    super.field9010.method4097((byte) 108, this.field1411.field7422);
                } else {
                    super.field9010.method4097((byte) 126, this.field1411.field7429[0]);
                }
            } else if (this.field1411.field7428) {
                this.field1408 = (float) (super.field9010.field10260 % 4000) / 4000.0F;
                super.field9010.method4097((byte) -112, this.field1411.field7422);
            } else {
                int var4 = super.field9010.field10260 % 4000 * 16 / 4000;
                super.field9010.method4097((byte) -114, this.field1411.field7429[var4]);
            }
        } else {
            super.field9010.method4097((byte) 85, (class357) null);
        }
        super.field9010.method4126(0, -4382);
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)Z", line = 251)
    public final boolean method731(int arg0) {
        if (arg0 > -57) {
            return false;
        } else {
            ++field1418;
            return this.field1411.method3090(116);
        }
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(B)V", line = 262)
    public static void method732(byte arg0) {
        field1421 = null;
        field1420 = null;
        int var1 = -90 % ((-54 - arg0) / 60);
        field1419 = null;
    }

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)V", line = 275)
    public final void method733(int arg0) {
        if (~super.field9010.method4114((byte) -126) == -1) {
            class81 var2 = super.field9010.method4095(5);
            super.field9010.method4126(1, arg0 ^ -14757);
            class81 var3 = super.field9010.method4077(false);
            var3.method778(var2);
            var3.method743(0.125F, 1.0F, 0, 0.125F);
            var3.method757(0.0F, false, this.field1408, 0.0F);
            super.field9010.method4099(-32, class556.field7682);
            super.field9010.method4126(0, -4382);
        }
        ++field1410;
        if (arg0 != 10425) {
            this.method731(16);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZB)V", line = 299)
    public final void method734(boolean arg0, byte arg1) {
        if (arg1 != -103) {
            field1423 = 86;
        }
        super.field9010.method4112(class720.field9793, arg1 ^ -24, class534.field7355);
        ++field1415;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZ)V", line = 313)
    public final void method735(int arg0, boolean arg1) {
        ++field1414;
        super.field9010.method4126(1, arg0 ^ -10822);
        super.field9010.method4112(class720.field9793, 111, class72.field1302);
        super.field9010.method2248(true, false, 0, class755.field10544, false);
        super.field9010.method4117(0, true, class380.field5528);
        super.field9010.method2259((byte) -26, 0);
        super.field9010.method4126(0, -4382);
        super.field9010.method4123(-28186, -16777216);
        super.field9010.method4117(0, true, class4.field31);
        this.method733(10425);
        if (arg0 != 15192) {
            field1413 = 106;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILdu;I)V", line = 332)
    public final void method736(int arg0, class357 arg1, int arg2) {
        super.field9010.method4097((byte) 103, arg1);
        ++field1416;
        if (arg2 != -16776) {
            this.method728((byte) -127);
        }
    }
}
