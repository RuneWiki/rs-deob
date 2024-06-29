import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class89 {

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[B")
    private byte[] field1723;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "[I")
    private int[] field1724;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "[I")
    private int[] field1720;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "[I")
    public static int[] field1726 = new int[2000];

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lr;")
    public static class66 field1728 = class93.method641(43, "<col=c0ff00>");

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Z")
    public static volatile boolean field1721 = true;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Lr;")
    public static class66 field1730 = class93.method641(43, "showVideoAd");

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "[Lha;")
    public static class63[] field1722;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[B[BIII)I")
    public final int method628(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        if (arg3 != Integer.MIN_VALUE) {
            field1727 = -125;
        }
        int var7 = arg0 + arg5;
        field1719++;
        int var8 = 0;
        int var9 = arg4 << 3;
        while (var7 > arg5) {
            int var10 = arg2[arg5] & 0xFF;
            int var11 = this.field1720[var10];
            byte var12 = this.field1723[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var8 & -var13 >> 31;
            int var15 = var9 >> 3;
            var9 += var12;
            int var16 = (var13 + var12 - 1 >> 3) + var15;
            int var17 = var13 + 24;
            arg1[var15] = (byte) (var8 = class73.method521(var14, var11 >>> var17));
            if (var15 < var16) {
                var15++;
                var13 = var17 - 8;
                arg1[var15] = (byte) (var8 = var11 >>> var13);
                if (var15 < var16) {
                    var13 -= 8;
                    var15++;
                    arg1[var15] = (byte) (var8 = var11 >>> var13);
                    if (var16 > var15) {
                        var13 -= 8;
                        var15++;
                        arg1[var15] = (byte) (var8 = var11 >>> var13);
                        if (var15 < var16) {
                            var13 -= 8;
                            var15++;
                            arg1[var15] = (byte) (var8 = var11 << -var13);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIBLnd;)V")
    public static final void method629(int arg0, int arg1, int arg2, byte arg3, class206 arg4) {
        field1733++;
        if (class176.field3105 >= 400) {
            return;
        }
        if (arg4.field3541 != null) {
            arg4 = arg4.method1339(-94);
        }
        if (arg4 == null || !arg4.field3543) {
            return;
        }
        class66 var5 = arg4.field3576;
        int var6 = 3 / ((50 - arg3) / 35);
        if (arg4.field3554 != 0) {
            var5 = class212.method1372(2, new class66[] { var5, class41.method267(arg4.field3554, true, class207.field3595.field816), class56.field953, class183.field3207, class144.method989(arg4.field3554, 0), class254.field4461 });
        }
        if (class188.field3259 == 1) {
            class75.method536(arg2, arg1, (byte) -102, class212.method1372(2, new class66[] { class103.field2004, class196.field3398, var5 }), (short) 15, class127.field2373, (long) arg0);
            class257.field4513++;
        } else if (!class247.field4308) {
            class16.field210++;
            class66[] var7 = arg4.field3542;
            if (class29.field432) {
                var7 = class119.method811((byte) -117, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class163.field2921 != 0 || !var7[var8].method470(false, class264.field4625))) {
                        class7.field66++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 12;
                        }
                        if (var8 == 1) {
                            var9 = 29;
                        }
                        if (var8 == 2) {
                            var9 = 48;
                        }
                        if (var8 == 3) {
                            var9 = 21;
                        }
                        if (var8 == 4) {
                            var9 = 11;
                        }
                        class75.method536(arg2, arg1, (byte) -91, class212.method1372(2, new class66[] { class83.field1610, var5 }), var9, var7[var8], (long) arg0);
                    }
                }
            }
            if (class163.field2921 == 0 && var7 != null) {
                for (int var10 = 4; var10 >= 0; var10--) {
                    if (var7[var10] != null && var7[var10].method470(false, class264.field4625)) {
                        short var11 = 0;
                        class32.field478++;
                        short var12 = 0;
                        if (var10 == 0) {
                            var12 = 12;
                        }
                        if (arg4.field3554 > class207.field3595.field816) {
                            var11 = 2000;
                        }
                        if (var10 == 1) {
                            var12 = 29;
                        }
                        if (var10 == 2) {
                            var12 = 48;
                        }
                        if (var10 == 3) {
                            var12 = 21;
                        }
                        if (var10 == 4) {
                            var12 = 11;
                        }
                        if (var12 != 0) {
                            var12 += var11;
                        }
                        class75.method536(arg2, arg1, (byte) -86, class212.method1372(2, new class66[] { class83.field1610, var5 }), var12, var7[var10], (long) arg0);
                    }
                }
            }
            class75.method536(arg2, arg1, (byte) -126, class212.method1372(2, new class66[] { class83.field1610, var5 }), (short) 1002, class202.field3466, (long) arg0);
        } else if ((class9.field103 & 0x2) == 2) {
            class95.field1830++;
            class75.method536(arg2, arg1, (byte) -70, class212.method1372(2, new class66[] { class195.field3366, class196.field3398, var5 }), (short) 44, class162.field2895, (long) arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lcj;I)Z")
    public static final boolean method630(class28 arg0, int arg1) {
        if (arg1 != -1) {
            method632(11);
        }
        field1729++;
        return arg0.method157(class54.field947, 0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([BIIII[B)I")
    public final int method631(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field1725++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg3 + arg4;
        int var8 = 0;
        if (arg1 != 8) {
            this.method631((byte[]) null, -18, 64, 32, 16, (byte[]) null);
        }
        int var9 = arg2;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var8 = this.field1724[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field1724[var8]) < 0) {
                arg0[arg4++] = (byte) (~var11);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1724[var8];
            }
            int var12;
            if ((var12 = this.field1724[var8]) < 0) {
                arg0[arg4++] = (byte) (~var12);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1724[var8];
            }
            int var13;
            if ((var13 = this.field1724[var8]) < 0) {
                arg0[arg4++] = (byte) (~var13);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1724[var8];
            }
            int var14;
            if ((var14 = this.field1724[var8]) < 0) {
                arg0[arg4++] = (byte) (~var14);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1724[var8];
            }
            int var15;
            if ((var15 = this.field1724[var8]) < 0) {
                arg0[arg4++] = (byte) (~var15);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1724[var8];
            }
            int var16;
            if ((var16 = this.field1724[var8]) < 0) {
                arg0[arg4++] = (byte) (~var16);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1724[var8];
            }
            int var17;
            if ((var17 = this.field1724[var8]) < 0) {
                arg0[arg4++] = (byte) (~var17);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1724[var8];
            }
            int var18;
            if ((var18 = this.field1724[var8]) < 0) {
                arg0[arg4++] = (byte) (~var18);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "([B)V")
    public class89(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = 0;
        int var4 = arg0.length;
        this.field1723 = arg0;
        this.field1724 = new int[8];
        this.field1720 = new int[var4];
        for (int var5 = 0; var5 < var4; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field1720[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var2[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var2[var10] = var2[var10 - 1];
                            break;
                        }
                        var2[var10] = class73.method521(var11, var12);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var2[var6 - 1];
                }
                var2[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field1724[var14] == 0) {
                            this.field1724[var14] = var3;
                        }
                        var14 = this.field1724[var14];
                    }
                    if (var14 >= this.field1724.length) {
                        int[] var17 = new int[this.field1724.length * 2];
                        for (int var18 = 0; var18 < this.field1724.length; var18++) {
                            var17[var18] = this.field1724[var18];
                        }
                        this.field1724 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field1724[var14] = ~var5;
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method632(int arg0) {
        field1726 = null;
        field1730 = null;
        int var1 = -70 / ((arg0 + 71) / 48);
        field1728 = null;
        field1722 = null;
    }
}
