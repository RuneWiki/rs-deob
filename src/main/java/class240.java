import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class240 {

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "[B")
    private byte[] field3749;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "[I")
    private int[] field3746;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "[I")
    private int[] field3753;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3740 = "Loaded title screen";

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "[I")
    public static int[] field3745 = new int[14];

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "[S")
    public static short[] field3741;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method1711(boolean arg0) {
        class111.field1544.method1941(128);
        int var1 = class111.field1544.method1950((byte) 123, 8);
        if (class79.field1083 > var1) {
            for (int var2 = var1; var2 < class79.field1083; var2++) {
                class263.field4121[class9.field171++] = class85.field1157[var2];
            }
        }
        field3750++;
        if (arg0) {
            return;
        }
        if (class79.field1083 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class79.field1083 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class85.field1157[var3];
            class212 var5 = class59.field870[var4];
            int var6 = class111.field1544.method1950((byte) 94, 1);
            if (var6 == 0) {
                class85.field1157[class79.field1083++] = var4;
                var5.field4718 = class229.field3595;
            } else {
                int var7 = class111.field1544.method1950((byte) 77, 2);
                if (var7 == 0) {
                    class85.field1157[class79.field1083++] = var4;
                    var5.field4718 = class229.field3595;
                    class36.field526[class277.field4285++] = var4;
                } else if (var7 == 1) {
                    class85.field1157[class79.field1083++] = var4;
                    var5.field4718 = class229.field3595;
                    int var8 = class111.field1544.method1950((byte) 87, 3);
                    var5.method2095(1, -1, var8);
                    int var9 = class111.field1544.method1950((byte) 118, 1);
                    if (var9 == 1) {
                        class36.field526[class277.field4285++] = var4;
                    }
                } else if (var7 == 2) {
                    class85.field1157[class79.field1083++] = var4;
                    var5.field4718 = class229.field3595;
                    if (class111.field1544.method1950((byte) -111, 1) == 1) {
                        int var10 = class111.field1544.method1950((byte) -50, 3);
                        var5.method2095(2, -1, var10);
                        int var11 = class111.field1544.method1950((byte) 113, 3);
                        var5.method2095(2, -1, var11);
                    } else {
                        int var12 = class111.field1544.method1950((byte) 92, 3);
                        var5.method2095(0, -1, var12);
                    }
                    int var13 = class111.field1544.method1950((byte) 110, 1);
                    if (var13 == 1) {
                        class36.field526[class277.field4285++] = var4;
                    }
                } else if (var7 == 3) {
                    class263.field4121[class9.field171++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([BIIB[BI)I", line = 119)
    public final int method1712(byte[] arg0, int arg1, int arg2, byte arg3, byte[] arg4, int arg5) {
        int var7 = arg1 + arg5;
        field3747++;
        int var8 = arg2 << 3;
        int var9 = 0;
        while (var7 > arg1) {
            int var10 = arg0[arg1] & 0xFF;
            int var11 = this.field3746[var10];
            byte var12 = this.field3749[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var9 & -var14 >> 31;
            var8 += var12;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var9 = class214.method1562(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg4[var13] = (byte) (var9 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg4[var13] = (byte) (var9 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg4[var13] = (byte) (var9 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg4[var13] = (byte) (var9 = var11 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        if (arg3 <= 18) {
            return 80;
        } else {
            return (var8 + 7 >> 3) - arg2;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBII[B[B)I", line = 203)
    public final int method1713(int arg0, byte arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        field3742++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = -121 % ((-arg1 - 6) / 45);
        int var8 = arg0 + arg3;
        int var9 = 0;
        int var10 = arg2;
        while (true) {
            byte var11 = arg4[var10];
            if (var11 >= 0) {
                var9++;
            } else {
                var9 = this.field3753[var9];
            }
            int var12;
            if ((var12 = this.field3753[var9]) < 0) {
                arg5[arg3++] = (byte) (~var12);
                if (arg3 >= var8) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var9++;
            } else {
                var9 = this.field3753[var9];
            }
            int var13;
            if ((var13 = this.field3753[var9]) < 0) {
                arg5[arg3++] = (byte) (~var13);
                if (var8 <= arg3) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var9++;
            } else {
                var9 = this.field3753[var9];
            }
            int var14;
            if ((var14 = this.field3753[var9]) < 0) {
                arg5[arg3++] = (byte) (~var14);
                if (arg3 >= var8) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var9++;
            } else {
                var9 = this.field3753[var9];
            }
            int var15;
            if ((var15 = this.field3753[var9]) < 0) {
                arg5[arg3++] = (byte) (~var15);
                if (arg3 >= var8) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var9++;
            } else {
                var9 = this.field3753[var9];
            }
            int var16;
            if ((var16 = this.field3753[var9]) < 0) {
                arg5[arg3++] = (byte) (~var16);
                if (arg3 >= var8) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var9++;
            } else {
                var9 = this.field3753[var9];
            }
            int var17;
            if ((var17 = this.field3753[var9]) < 0) {
                arg5[arg3++] = (byte) (~var17);
                if (arg3 >= var8) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var9++;
            } else {
                var9 = this.field3753[var9];
            }
            int var18;
            if ((var18 = this.field3753[var9]) < 0) {
                arg5[arg3++] = (byte) (~var18);
                if (arg3 >= var8) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var9++;
            } else {
                var9 = this.field3753[var9];
            }
            int var19;
            if ((var19 = this.field3753[var9]) < 0) {
                arg5[arg3++] = (byte) (~var19);
                if (arg3 >= var8) {
                    break;
                }
                var9 = 0;
            }
            var10++;
        }
        return var10 + 1 - arg2;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI[[FI[IIZ[[IIZZIB[[FBLel;[[III[[F[ZI)V", line = 351)
    public static final void method1714(boolean arg0, int arg1, float[][] arg2, int arg3, int[] arg4, int arg5, boolean arg6, int[][] arg7, int arg8, boolean arg9, boolean arg10, int arg11, byte arg12, float[][] arg13, byte arg14, class247 arg15, int[][] arg16, int arg17, int arg18, float[][] arg19, boolean[] arg20, int arg21) {
        field3744++;
        int var22 = (arg10 ? 255 : 0) + (arg21 << 8);
        int var23 = (arg17 << 8) + (arg9 ? 255 : 0);
        int var24 = (arg18 << 8) + (arg0 ? 255 : 0);
        if (arg14 <= 118) {
            method1716(-84);
        }
        int var25 = (arg5 << 8) + (arg6 ? 255 : 0);
        int[] var26 = new int[arg4.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg4[var27 + var27];
            int var29 = arg4[var27 + var27 + 1];
            int[][] var30 = arg16 == null || arg20 == null || !arg20[var27] ? arg7 : arg16;
            var26[var27] = class121.method875(var25, var30, var22, false, arg12, var28, var29, arg13, (float) arg1, arg3, var23, arg2, arg19, arg15, arg16, arg11, var24, (byte) -70);
        }
        arg15.method1779(arg8, arg3, arg11, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V", line = 388)
    public static final void method1715(byte arg0) {
        field3752++;
        if (class5.field58 != null) {
            class304 var1 = class5.field58;
            synchronized (class5.field58) {
                class5.field58 = null;
            }
        }
        if (arg0 != 10) {
            field3745 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 409)
    public static void method1716(int arg0) {
        field3741 = null;
        field3745 = null;
        field3740 = null;
        if (arg0 < 72) {
            method1711(true);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)V", line = 424)
    public static final void method1717(int arg0, int arg1, int arg2) {
        field3743++;
        class287.field4433++;
        class183.field2965.method1947((byte) 125, arg1);
        class183.field2965.method82(357447400, arg2);
        class183.field2965.method30(arg0, (byte) -49);
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "([B)V", line = 439)
    public class240(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = arg0.length;
        this.field3749 = arg0;
        this.field3746 = new int[var3];
        int var4 = 0;
        this.field3753 = new int[8];
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field3746[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
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
                        var2[var10] = class214.method1562(var12, var11);
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
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field3753[var14] == 0) {
                            this.field3753[var14] = var4;
                        }
                        var14 = this.field3753[var14];
                    }
                    if (var14 >= this.field3753.length) {
                        int[] var17 = new int[this.field3753.length * 2];
                        for (int var18 = 0; var18 < this.field3753.length; var18++) {
                            var17[var18] = this.field3753[var18];
                        }
                        this.field3753 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field3753[var14] = ~var5;
            }
        }
    }
}
