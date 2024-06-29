import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class70 {

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "[B")
    private byte[] field1531;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "[I")
    private int[] field1549;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "[I")
    private int[] field1540;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lrd;")
    private static class114 field1534 = class84.method656(" is already on your ignore list", (byte) 125);

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "Lrd;")
    private static class114 field1547 = class84.method656("From", (byte) 119);

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Lrd;")
    public static class114 field1537 = field1547;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "Lrd;")
    public static class114 field1548 = field1534;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "[[I")
    public static int[][] field1535 = new int[5][5000];

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lpc;")
    public static class101 field1532 = new class101(4096);

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "Lrd;")
    private static class114 field1551 = class84.method656("Please check your message)2centre for details)3", (byte) 114);

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "Lrd;")
    public static class114 field1550 = field1551;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Ljd;")
    public static class66 field1539;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "[Loa;")
    public static class93[] field1538;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static final void method553(int arg0) {
        field1530++;
        class11.field204.method7(-2982);
        for (int var1 = 0; var1 < 32; var1++) {
            class32.field659[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class24.field467[var2] = 0L;
        }
        class79.field1800 = 0;
        if (arg0 < 54) {
            method559(114);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)Z")
    public static final boolean method554(byte arg0, int arg1) {
        if (arg0 > -14) {
            field1532 = null;
        }
        field1546++;
        return (arg1 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lgb;Lpb;IZLpb;)V")
    public static final void method555(class45 arg0, class100 arg1, int arg2, boolean arg3, class100 arg4) {
        class24.field464 = arg4;
        class120.field2813 = arg1;
        class89.field1980 = arg3;
        if (arg2 != 64) {
            field1539 = null;
        }
        class7.field105 = class120.field2813.method768(10, false);
        field1536++;
        class109.field2529 = arg0;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(BI)La;")
    public static final class1 method556(byte arg0, int arg1) {
        field1544++;
        class1 var2 = (class1) class84.field1861.method194((byte) -84, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        class1 var3 = class85.method658(arg1, class120.field2804, false, class24.field487, 0);
        if (arg0 != 118) {
            field1539 = null;
        }
        if (var3 != null) {
            class84.field1861.method193(arg0 - 203, var3, (long) arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method557(byte arg0) {
        field1548 = null;
        field1534 = null;
        field1547 = null;
        if (arg0 > -11) {
            method560(-7);
        }
        field1538 = null;
        field1537 = null;
        field1539 = null;
        field1550 = null;
        field1532 = null;
        field1551 = null;
        field1535 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ld;IILke;)V")
    public static final void method558(class22 arg0, int arg1, int arg2, class73 arg3) {
        field1543++;
        byte[] var4 = null;
        class84 var5 = class118.field2761;
        synchronized (class118.field2761) {
            if (arg2 != 0) {
                return;
            }
            for (class125 var6 = (class125) class118.field2761.method654((byte) 94); var6 != null; var6 = (class125) class118.field2761.method644((byte) -68)) {
                if ((long) arg1 == var6.field1448 && var6.field2980 == arg0 && var6.field2968 == 0) {
                    var4 = var6.field2978;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg0.method162((byte) -119, arg1);
            arg3.method596(arg1, arg2 - 87, var7, arg0, true);
        } else {
            arg3.method596(arg1, -105, var4, arg0, true);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static final void method559(int arg0) {
        if (arg0 < -91) {
            class64.field1370 = false;
            field1541++;
            class129.field3100 = false;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
    public static final void method560(int arg0) {
        if (class11.field190 != null) {
            class11.field190.method229();
            class11.field190 = null;
        }
        if (arg0 >= -76) {
            method557((byte) -65);
        }
        class52.field1106 = 0;
        field1542++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[BI[BI)I")
    public final int method561(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field1545++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg3 + arg5;
        if (arg1 != -1) {
            return -85;
        }
        int var8 = 0;
        int var9 = arg0;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 < 0) {
                var8 = this.field1549[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field1549[var8]) < 0) {
                arg4[arg3++] = (byte) ~var11;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1549[var8];
            }
            int var12;
            if ((var12 = this.field1549[var8]) < 0) {
                arg4[arg3++] = (byte) ~var12;
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1549[var8];
            }
            int var13;
            if ((var13 = this.field1549[var8]) < 0) {
                arg4[arg3++] = (byte) ~var13;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1549[var8];
            }
            int var14;
            if ((var14 = this.field1549[var8]) < 0) {
                arg4[arg3++] = (byte) ~var14;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1549[var8];
            }
            int var15;
            if ((var15 = this.field1549[var8]) < 0) {
                arg4[arg3++] = (byte) ~var15;
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1549[var8];
            }
            int var16;
            if ((var16 = this.field1549[var8]) < 0) {
                arg4[arg3++] = (byte) ~var16;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1549[var8];
            }
            int var17;
            if ((var17 = this.field1549[var8]) < 0) {
                arg4[arg3++] = (byte) ~var17;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1549[var8];
            }
            int var18;
            if ((var18 = this.field1549[var8]) < 0) {
                arg4[arg3++] = (byte) ~var18;
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BII[BI)I")
    public final int method562(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = arg0 + arg5;
        if (arg3 < 114) {
            return -87;
        }
        int var8 = 0;
        int var9 = arg2 << 3;
        field1533++;
        while (arg0 < var7) {
            int var10 = arg4[arg0] & 0xFF;
            byte var11 = this.field1531[var10];
            int var12 = this.field1540[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var8 & -var14 >> 31;
            var9 += var11;
            int var16 = (var11 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var8 = class38.method271(var15, var12 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg1[var13] = (byte) (var8 = var12 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg1[var13] = (byte) (var8 = var12 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg1[var13] = (byte) (var8 = var12 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg1[var13] = (byte) (var8 = var12 << -var14);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var9 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([B)V")
    public class70(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = 0;
        int var4 = arg0.length;
        this.field1531 = arg0;
        this.field1549 = new int[8];
        this.field1540 = new int[var4];
        for (int var5 = 0; var5 < var4; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field1540[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var2[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var2[var10] = var2[var10 - 1];
                            break;
                        }
                        var2[var10] = class38.method271(var12, var11);
                    }
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
                        if (this.field1549[var14] == 0) {
                            this.field1549[var14] = var3;
                        }
                        var14 = this.field1549[var14];
                    }
                    if (this.field1549.length <= var14) {
                        int[] var17 = new int[this.field1549.length * 2];
                        for (int var18 = 0; var18 < this.field1549.length; var18++) {
                            var17[var18] = this.field1549[var18];
                        }
                        this.field1549 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var3) {
                    var3 = var14 + 1;
                }
                this.field1549[var14] = ~var5;
            }
        }
    }
}
