import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class37 {

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "[B")
    private byte[] field446;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "[I")
    private int[] field440;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "[I")
    private int[] field447;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Ljg;")
    public static class241 field449 = new class241(50);

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field451 = -1;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "Lof;")
    public static class360 field452;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "[I")
    public static int[] field450;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([BI[BIII)I")
    public final int method208(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field439++;
        int var7 = 0;
        int var8 = arg3 + arg5;
        int var9 = arg4 << 3;
        while (arg5 < var8) {
            int var10 = arg0[arg5] & 0xFF;
            int var11 = this.field440[var10];
            byte var12 = this.field446[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var12 + var14 - 1 >> 3);
            var9 += var12;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var7 = class276.method1712(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg2[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg2[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg2[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg2[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        if (arg1 != 255) {
            this.method215(117, (byte[]) null, 89, 71, 16, (byte[]) null);
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Liq;B)V")
    public static final void method209(class134 arg0, byte arg1) {
        if (arg1 < 67) {
            field449 = null;
        }
        field443++;
        class427.field6277 = arg0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BILjk;)Z")
    public static final boolean method210(byte arg0, int arg1, class119 arg2) {
        field442++;
        int var3 = arg2.method717(2, false);
        if (var3 == 0) {
            if (arg2.method717(1, false) != 0) {
                method210((byte) -86, arg1, arg2);
            }
            int var4 = arg2.method717(6, false);
            int var5 = arg2.method717(6, false);
            boolean var6 = arg2.method717(1, false) == 1;
            if (var6) {
                class133.field1729[class109.field1441++] = arg1;
            }
            if (class140.field1883[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class169 var7 = class140.field1883[arg1] = new class169();
            var7.field1929 = arg1;
            if (class359.field5309[arg1] != null) {
                var7.method1029((byte) -55, class359.field5309[arg1]);
            }
            var7.method909(class302.field4567[arg1], arg0 ^ 0xFFFFC055);
            var7.field1956 = class241.field3625[arg1];
            int var8 = class281.field4300[arg1];
            int var9 = var8 >> 28;
            int var10 = (var8 & 0x3FC3DA) >> 14;
            var7.field2020[0] = class339.field5060[arg1];
            int var11 = var8 & 0xFF;
            var7.field1902 = (byte) var9;
            var7.method1030(-22006, (var11 << 6) + var5 - class112.field1487, (var10 << 6) + var4 + -class17.field250);
            var7.field2433 = -1;
            return true;
        } else if (var3 == 1) {
            int var12 = arg2.method717(2, false);
            int var13 = class281.field4300[arg1];
            class281.field4300[arg1] = (class406.method2552(3, (var13 >> 28) + var12) << 28) + class406.method2552(268435455, var13);
            return false;
        } else if (var3 == 2) {
            int var14 = arg2.method717(5, false);
            int var15 = var14 >> 3;
            int var16 = var14 & 0x7;
            int var17 = class281.field4300[arg1];
            int var18 = (var17 >> 28) + var15 & 0x3;
            int var19 = var17 >> 14 & 0xFF;
            int var20 = var17 & 0xFF;
            if (var16 == 0) {
                var20--;
                var19--;
            }
            if (var16 == 1) {
                var20--;
            }
            if (var16 == 2) {
                var19++;
                var20--;
            }
            if (var16 == 3) {
                var19--;
            }
            if (var16 == 4) {
                var19++;
            }
            if (var16 == 5) {
                var20++;
                var19--;
            }
            if (var16 == 6) {
                var20++;
            }
            if (var16 == 7) {
                var20++;
                var19++;
            }
            class281.field4300[arg1] = (var18 << 28) + (var19 << 14) + var20;
            return false;
        } else {
            int var21 = arg2.method717(18, false);
            int var22 = var21 >> 16;
            int var23 = (var21 & 0xFFEC) >> 8;
            if (arg0 != -86) {
                field451 = -73;
            }
            int var24 = var21 & 0xFF;
            int var25 = class281.field4300[arg1];
            int var26 = (var25 >> 28) + var22 & 0x3;
            int var27 = (var25 >> 14) + var23 & 0xFF;
            int var28 = var24 + var25 & 0xFF;
            class281.field4300[arg1] = (var26 << 28) + (var27 << 14) + var28;
            return false;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)La;")
    public static final class233 method211(int arg0, int arg1, int arg2) {
        class13 var3 = class277.field4216[arg0][arg1][arg2];
        return var3 == null ? null : var3.field167;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method212(int arg0) {
        if (arg0 < -83) {
            field452 = null;
            field449 = null;
            field450 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(III)V")
    public static final void method213(int arg0, int arg1, int arg2) {
        class440.field6476 = new class241(arg1);
        field448++;
        class155.field2160 = new class241(arg0);
        if (arg2 > -110) {
            method211(57, 86, 74);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V")
    public static final void method214(int arg0, int arg1) {
        class241 var2 = class80.field1055;
        synchronized (class80.field1055) {
            class80.field1055.method1481(3, arg0);
        }
        if (arg1 == 8) {
            field441++;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "([B)V")
    public class37(byte[] arg0) {
        int var2 = arg0.length;
        this.field446 = arg0;
        this.field440 = new int[var2];
        this.field447 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field440[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class276.method1712(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field447[var14] == 0) {
                            this.field447[var14] = var4;
                        }
                        var14 = this.field447[var14];
                    }
                    if (var14 >= this.field447.length) {
                        int[] var17 = new int[this.field447.length * 2];
                        for (int var18 = 0; var18 < this.field447.length; var18++) {
                            var17[var18] = this.field447[var18];
                        }
                        this.field447 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field447[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[BIII[B)I")
    public final int method215(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field444++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = arg2 + arg3;
        if (arg4 != -28925) {
            method213(102, 23, 46);
        }
        int var8 = 0;
        int var9 = arg0;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field447[var8];
            }
            int var11;
            if ((var11 = this.field447[var8]) < 0) {
                arg5[arg3++] = (byte) (~var11);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field447[var8];
            }
            int var12;
            if ((var12 = this.field447[var8]) < 0) {
                arg5[arg3++] = (byte) (~var12);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field447[var8];
            }
            int var13;
            if ((var13 = this.field447[var8]) < 0) {
                arg5[arg3++] = (byte) (~var13);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field447[var8];
            }
            int var14;
            if ((var14 = this.field447[var8]) < 0) {
                arg5[arg3++] = (byte) (~var14);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field447[var8];
            }
            int var15;
            if ((var15 = this.field447[var8]) < 0) {
                arg5[arg3++] = (byte) (~var15);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field447[var8];
            }
            int var16;
            if ((var16 = this.field447[var8]) < 0) {
                arg5[arg3++] = (byte) (~var16);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field447[var8];
            }
            int var17;
            if ((var17 = this.field447[var8]) < 0) {
                arg5[arg3++] = (byte) (~var17);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field447[var8];
            }
            int var18;
            if ((var18 = this.field447[var8]) < 0) {
                arg5[arg3++] = (byte) (~var18);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZZ)V")
    public static final void method216(boolean arg0, boolean arg1) {
        field445++;
        if (arg0 && arg1 != class245.field3668) {
            class245.field3668 = arg1;
            class376.method2264(-1);
        }
    }
}
