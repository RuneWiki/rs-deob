import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class490 {

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "[I")
    private int[] field6826;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "[B")
    private byte[] field6833;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "[I")
    private int[] field6827;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "Lh;")
    public static class434 field6828 = new class434(83, 7);

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "Ls;")
    public static class169 field6831 = new class169(7, 4);

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "Lur;")
    public static class345 field6832;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method2852(int arg0, char arg1, String arg2) {
        field6822++;
        int var3 = class369.method2279(false, arg1, arg2);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = arg0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1 != arg2.charAt(var8); var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
    public static final void method2853(int arg0) {
        if (arg0 == -1) {
            field6824++;
            if (class241.field3211 != 3) {
                class33.field506 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lnk;B)V")
    public static final void method2854(class464 arg0, byte arg1) {
        if (arg1 <= 31) {
            method2856((String) null, (byte) -41, (String) null, (String) null);
        }
        if (class59.field794 == arg0.field6349) {
            class102.field1468[arg0.field6329] = true;
        }
        field6825++;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIBII)V")
    public static final void method2855(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field6829++;
        float var5 = (float) class55.field750 / (float) class55.field756;
        int var6 = arg1;
        int var7 = arg4;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg4 / var5);
        }
        if (arg2 > -49) {
            method2852(-9, ')', (String) null);
        }
        int var8 = arg3 - (arg1 - var6) / 2;
        int var9 = arg0 - (arg4 - var7) / 2;
        class222.field2959 = -1;
        class370.field5065 = class55.field756 * var8 / var6;
        class432.field5889 = class55.field750 - class55.field750 * var9 / var7;
        class304.field4034 = -1;
        class346.method2132(0);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method2856(String arg0, byte arg1, String arg2, String arg3) {
        field6820++;
        for (int var4 = arg0.indexOf(arg3); var4 != -1; var4 = arg0.indexOf(arg3, var4 + arg2.length())) {
            arg0 = arg0.substring(0, var4) + arg2 + arg0.substring(var4 + arg3.length());
        }
        if (arg1 > -43) {
            field6834 = -19;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "([B[BIIII)I")
    public final int method2857(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field6823++;
        int var7 = 0;
        int var8 = arg3 + arg5;
        int var9 = arg4 << 3;
        while (arg3 < var8) {
            int var10 = arg1[arg3] & 0xFF;
            int var11 = this.field6826[var10];
            byte var12 = this.field6833[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var7 = class21.method133(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg0[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg0[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg0[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg0[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg3++;
        }
        if (arg2 > -79) {
            method2858(58);
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V")
    public static void method2858(int arg0) {
        field6831 = null;
        field6828 = null;
        if (arg0 != 3) {
            field6828 = null;
        }
        field6832 = null;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)Ljava/lang/String;")
    public static final String method2859(byte arg0) {
        field6821++;
        String var1 = "www";
        if (class84.field1101 == class377.field5197) {
            var1 = "www-wtrc";
        } else if (class377.field5197 == class231.field3073) {
            var1 = "www-wtqa";
        } else if (client.field2455 == class377.field5197) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class441.field5949 != null) {
            var2 = "/p=" + class441.field5949;
        }
        if (arg0 != -10) {
            method2856((String) null, (byte) 68, (String) null, (String) null);
        }
        return "http://" + var1 + "." + class343.field4601.field4374 + ".com/l=" + class110.field1676 + "/a=" + class448.field6099 + var2 + "/";
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I[BIII[B)I")
    public final int method2860(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field6830++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg2;
        int var8 = 0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field6827[var8];
            }
            int var11;
            if ((var11 = this.field6827[var8]) < 0) {
                arg1[arg2++] = (byte) (~var11);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field6827[var8];
            }
            int var12;
            if ((var12 = this.field6827[var8]) < 0) {
                arg1[arg2++] = (byte) (~var12);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field6827[var8];
            }
            int var13;
            if ((var13 = this.field6827[var8]) < 0) {
                arg1[arg2++] = (byte) (~var13);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field6827[var8];
            }
            int var14;
            if ((var14 = this.field6827[var8]) < 0) {
                arg1[arg2++] = (byte) (~var14);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field6827[var8];
            }
            int var15;
            if ((var15 = this.field6827[var8]) < 0) {
                arg1[arg2++] = (byte) (~var15);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field6827[var8];
            }
            int var16;
            if ((var16 = this.field6827[var8]) < 0) {
                arg1[arg2++] = (byte) (~var16);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field6827[var8];
            }
            int var17;
            if ((var17 = this.field6827[var8]) < 0) {
                arg1[arg2++] = (byte) (~var17);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field6827[var8];
            }
            int var18;
            if ((var18 = this.field6827[var8]) < 0) {
                arg1[arg2++] = (byte) (~var18);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        int var19 = -14 % ((arg4 - 10) / 41);
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "([B)V")
    public class490(byte[] arg0) {
        int var2 = arg0.length;
        this.field6826 = new int[var2];
        this.field6833 = arg0;
        int[] var3 = new int[33];
        this.field6827 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field6826[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
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
                        var3[var10] = class21.method133(var11, var12);
                    }
                    var9 = var8 | var7;
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
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field6827[var14] == 0) {
                            this.field6827[var14] = var4;
                        }
                        var14 = this.field6827[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field6827.length <= var14) {
                        int[] var18 = new int[this.field6827.length * 2];
                        for (int var19 = 0; var19 < this.field6827.length; var19++) {
                            var18[var19] = this.field6827[var19];
                        }
                        this.field6827 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field6827[var14] = ~var5;
            }
        }
    }
}
