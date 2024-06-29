import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class53 {

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "[B")
    private byte[] field849;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "[I")
    private int[] field848;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "[I")
    private int[] field842;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field835 = 0;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "Z")
    public static volatile boolean field845 = true;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static volatile int field837 = 0;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "Z")
    public static boolean field840 = false;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IB)V")
    public static final void method447(int arg0, byte arg1) {
        class31.field532 = arg0;
        class105.field1644 = 3;
        if (arg1 > -103) {
            method447(2, (byte) -15);
        }
        class308.field4935 = 20;
        field839++;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIII)V")
    public static final void method448(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field836++;
        if (arg3 != -30985) {
            field840 = false;
        }
        if ((arg0 - arg2) >= class184.field2914 && class2.field42 >= (arg0 + arg2) && (arg4 - arg2) >= class112.field1727 && arg2 + arg4 <= class278.field4410) {
            class24.method215(arg0, (byte) 37, arg4, arg2, arg1);
        } else {
            class149.method1077((byte) 127, arg1, arg4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[BZI[BI)I")
    public final int method449(int arg0, byte[] arg1, boolean arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = arg0 + arg3;
        field844++;
        if (arg2) {
            method450(-27, -91, 0, -116);
        }
        int var8 = 0;
        int var9 = arg5 << 3;
        while (var7 > arg3) {
            int var10 = arg4[arg3] & 0xFF;
            int var11 = this.field842[var10];
            byte var12 = this.field849[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var8 & -var14 >> 31;
            var9 += var12;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var8 = class44.method377(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg1[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg1[var13] = (byte) (var8 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var8 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg1[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var9 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIII)I")
    public static final int method450(int arg0, int arg1, int arg2, int arg3) {
        field843++;
        int var4 = arg3 / arg2;
        int var5 = arg0 / arg2;
        int var6 = arg2 - 1 & arg0;
        int var7 = class149.method1079(var4, -1, var5);
        int var8 = class149.method1079(var4, -1, var5 + 1);
        int var9 = class149.method1079(var4 + 1, -1, var5);
        int var10 = class149.method1079(var4 + 1, -1, var5 - -1);
        int var11 = class52.method445(arg2, var8, var7, false, var6);
        int var12 = arg3 & arg2 - 1;
        int var13 = class52.method445(arg2, var10, var9, false, var6);
        int var14 = -91 / ((arg1 + 63) / 37);
        return class52.method445(arg2, var13, var11, false, var12);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II[BII[B)I")
    public final int method451(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        field846++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg0 + arg4;
        int var9 = arg3;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field848[var7];
            }
            int var11;
            if ((var11 = this.field848[var7]) < 0) {
                arg2[arg0++] = (byte) (~var11);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field848[var7];
            }
            int var12;
            if ((var12 = this.field848[var7]) < 0) {
                arg2[arg0++] = (byte) (~var12);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field848[var7];
            }
            int var13;
            if ((var13 = this.field848[var7]) < 0) {
                arg2[arg0++] = (byte) (~var13);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field848[var7];
            }
            int var14;
            if ((var14 = this.field848[var7]) < 0) {
                arg2[arg0++] = (byte) (~var14);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field848[var7];
            }
            int var15;
            if ((var15 = this.field848[var7]) < 0) {
                arg2[arg0++] = (byte) (~var15);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field848[var7];
            }
            int var16;
            if ((var16 = this.field848[var7]) < 0) {
                arg2[arg0++] = (byte) (~var16);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field848[var7];
            }
            int var17;
            if ((var17 = this.field848[var7]) < 0) {
                arg2[arg0++] = (byte) (~var17);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field848[var7];
            }
            int var18;
            if ((var18 = this.field848[var7]) < 0) {
                arg2[arg0++] = (byte) (~var18);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        if (arg1 > -92) {
            field835 = -119;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lkc;I)V")
    public static final void method452(class296 arg0, int arg1) {
        field834++;
        int var2 = arg0.field4714 - class41.field686;
        int var3 = arg0.field4683 * 128 + arg0.method1013(0) * 64;
        int var4 = arg0.field4682 * 128 + (arg0.method1013(0) * 64);
        arg0.field4709 += (var4 - arg0.field4709) / var2;
        if (arg0.field4757 == 0) {
            arg0.field4696 = 1024;
        }
        arg0.field4725 += (var3 - arg0.field4725) / var2;
        arg0.field4745 = 0;
        if (arg0.field4757 == 1) {
            arg0.field4696 = 1536;
        }
        if (arg0.field4757 == 2) {
            arg0.field4696 = 0;
        }
        if (arg1 != 12537) {
            method448(92, 43, -13, -124, 65);
        }
        if (arg0.field4757 == 3) {
            arg0.field4696 = 512;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method453(int arg0, int arg1, String arg2) {
        field841++;
        if (arg1 != 0) {
            method447(5, (byte) 100);
        }
        class69 var3 = class255.method1723((byte) 32, arg0, 2);
        var3.method556((byte) -108);
        var3.field1099 = arg2;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lnh;IIIII)V")
    public static final void method454(class55 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class57.field900 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class235.field3716) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class291.field4515 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class22 var14 = class149.field2210[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class233.field3684[var11][var12 + 1][var13] + class233.field3684[var11][var12][var13] + class233.field3684[var11][var12][var13 + 1] + class233.field3684[var11][var12 + 1][var13 + 1]) / 4 - (class233.field3684[arg1][arg2 + 1][arg3] + class233.field3684[arg1][arg2][arg3] + class233.field3684[arg1][arg2][arg3 + 1] + class233.field3684[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class163 var16 = var14.field375;
                                    if (var16 != null) {
                                        if (var16.field2456.method465()) {
                                            arg0.method462(var16.field2456, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2459 != null && var16.field2459.method465()) {
                                            arg0.method462(var16.field2459, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field371; var17++) {
                                        class19 var18 = var14.field355[var17];
                                        if (var18 != null && var18.field266.method465() && (var18.field255 == var12 || var7 == var12) && (var18.field258 == var13 || var9 == var13)) {
                                            int var19 = var18.field261 + 1 - var18.field255;
                                            int var20 = var18.field260 + 1 - var18.field258;
                                            arg0.method462(var18.field266, (var18.field255 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field258 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
    public static final void method455(boolean arg0) {
        field838++;
        if (arg0) {
            return;
        }
        for (int var1 = -1; var1 < class259.field4112; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class26.field455[var1];
            }
            class136 var3 = class233.field3682[var2];
            if (var3 != null) {
                class208.method1453(18964, var3.method1013(0), var3);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "([B)V")
    public class53(byte[] arg0) {
        int var2 = arg0.length;
        this.field849 = arg0;
        this.field848 = new int[8];
        this.field842 = new int[var2];
        int var3 = 0;
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field842[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class44.method377(var12, var11);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field848[var14] == 0) {
                            this.field848[var14] = var3;
                        }
                        var14 = this.field848[var14];
                    }
                    if (this.field848.length <= var14) {
                        int[] var17 = new int[this.field848.length * 2];
                        for (int var18 = 0; var18 < this.field848.length; var18++) {
                            var17[var18] = this.field848[var18];
                        }
                        this.field848 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
                this.field848[var14] = ~var5;
            }
        }
    }
}
