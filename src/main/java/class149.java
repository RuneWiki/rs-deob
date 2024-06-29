import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class149 {

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "[I")
    private int[] field3027;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "[B")
    private byte[] field3028;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "[I")
    private int[] field3030;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field3026 = 0;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Led;Led;IIIII)V")
    public static final void method926(class43 arg0, class43 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3032++;
        int var7 = 94 % ((arg2 + 73) / 43);
        if (class186.field3665 || class41.field799 >= 500) {
            return;
        }
        class112.field2141[class41.field799] = arg1;
        class115.field2237[class41.field799] = arg0;
        class40.field756[class41.field799] = arg4;
        class203.field3961[class41.field799] = arg5;
        class115.field2243[class41.field799] = arg3;
        class171.field3405[class41.field799] = arg6;
        class41.field799++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([B[BIIII)I")
    public final int method927(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field3031++;
        int var7 = arg4 + arg5;
        int var8 = arg3 << 3;
        int var9 = 0;
        while (arg5 < var7) {
            int var10 = arg0[arg5] & 0xFF;
            byte var11 = this.field3028[var10];
            int var12 = this.field3027[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 & 0x7;
            int var14 = var8 >> 3;
            int var15 = (var11 + var13 - 1 >> 3) + var14;
            var8 += var11;
            int var16 = var9 & -var13 >> 31;
            int var17 = var13 + 24;
            arg1[var14] = (byte) (var9 = class33.method189(var16, var12 >>> var17));
            if (var15 > var14) {
                var14++;
                var13 = var17 - 8;
                arg1[var14] = (byte) (var9 = var12 >>> var13);
                if (var14 < var15) {
                    var13 -= 8;
                    var14++;
                    arg1[var14] = (byte) (var9 = var12 >>> var13);
                    if (var15 > var14) {
                        var14++;
                        var13 -= 8;
                        arg1[var14] = (byte) (var9 = var12 >>> var13);
                        if (var15 > var14) {
                            var14++;
                            var13 -= 8;
                            arg1[var14] = (byte) (var9 = var12 << -var13);
                        }
                    }
                }
            }
            arg5++;
        }
        if (arg2 < 100) {
            this.method928(null, 15, (byte) 88, -88, -23, null);
        }
        return (var8 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([BIBII[B)I")
    public final int method928(byte[] arg0, int arg1, byte arg2, int arg3, int arg4, byte[] arg5) {
        field3029++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg3 + arg4;
        int var9 = arg1;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field3030[var7];
            }
            int var11;
            if ((var11 = this.field3030[var7]) < 0) {
                arg0[arg3++] = (byte) ~var11;
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field3030[var7];
            }
            int var12;
            if ((var12 = this.field3030[var7]) < 0) {
                arg0[arg3++] = (byte) ~var12;
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field3030[var7];
            }
            int var13;
            if ((var13 = this.field3030[var7]) < 0) {
                arg0[arg3++] = (byte) ~var13;
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field3030[var7];
            }
            int var14;
            if ((var14 = this.field3030[var7]) < 0) {
                arg0[arg3++] = (byte) ~var14;
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field3030[var7];
            }
            int var15;
            if ((var15 = this.field3030[var7]) < 0) {
                arg0[arg3++] = (byte) ~var15;
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field3030[var7];
            }
            int var16;
            if ((var16 = this.field3030[var7]) < 0) {
                arg0[arg3++] = (byte) ~var16;
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field3030[var7];
            }
            int var17;
            if ((var17 = this.field3030[var7]) < 0) {
                arg0[arg3++] = (byte) ~var17;
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field3030[var7];
            }
            int var18;
            if ((var18 = this.field3030[var7]) < 0) {
                arg0[arg3++] = (byte) ~var18;
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        if (arg2 != -115) {
            this.field3028 = null;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([B)V")
    public class149(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = arg0.length;
        int var4 = 0;
        this.field3027 = new int[var3];
        this.field3028 = arg0;
        this.field3030 = new int[8];
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field3027[var5] = var8;
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
                        var2[var10] = class33.method189(var12, var11);
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
                        if (this.field3030[var14] == 0) {
                            this.field3030[var14] = var4;
                        }
                        var14 = this.field3030[var14];
                    }
                    if (this.field3030.length <= var14) {
                        int[] var17 = new int[this.field3030.length * 2];
                        for (int var18 = 0; var18 < this.field3030.length; var18++) {
                            var17[var18] = this.field3030[var18];
                        }
                        this.field3030 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field3030[var14] = ~var5;
            }
        }
    }
}
