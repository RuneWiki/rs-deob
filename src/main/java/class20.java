import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class20 {

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "[I")
    private int[] field195;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "[B")
    private byte[] field197;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "[I")
    private int[] field196;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "[Ltn;")
    public static class721[] field198 = new class721[2048];

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Lql;")
    public static class109 field192;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Lcu;")
    public static class203 field194;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[BBI[BI)I", line = 9)
    public final int method102(int arg0, byte[] arg1, byte arg2, int arg3, byte[] arg4, int arg5) {
        field199++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg0 + arg3;
        int var9 = arg5;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var7 = this.field196[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field196[var7]) < 0) {
                arg4[arg3++] = (byte) (~var11);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field196[var7];
            }
            int var12;
            if ((var12 = this.field196[var7]) < 0) {
                arg4[arg3++] = (byte) (~var12);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field196[var7];
            }
            int var13;
            if ((var13 = this.field196[var7]) < 0) {
                arg4[arg3++] = (byte) (~var13);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field196[var7];
            }
            int var14;
            if ((var14 = this.field196[var7]) < 0) {
                arg4[arg3++] = (byte) (~var14);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field196[var7];
            }
            int var15;
            if ((var15 = this.field196[var7]) < 0) {
                arg4[arg3++] = (byte) (~var15);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field196[var7];
            }
            int var16;
            if ((var16 = this.field196[var7]) < 0) {
                arg4[arg3++] = (byte) (~var16);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field196[var7];
            }
            int var17;
            if ((var17 = this.field196[var7]) < 0) {
                arg4[arg3++] = (byte) (~var17);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field196[var7];
            }
            int var18;
            if ((var18 = this.field196[var7]) < 0) {
                arg4[arg3++] = (byte) (~var18);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        if (arg2 > -120) {
            this.method102(58, null, (byte) 125, 37, null, -16);
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[BB[BI)I", line = 157)
    public final int method103(int arg0, int arg1, byte[] arg2, byte arg3, byte[] arg4, int arg5) {
        if (arg3 < 56) {
            field198 = null;
        }
        field193++;
        int var7 = 0;
        int var8 = arg1 << 3;
        int var9 = arg0 + arg5;
        while (arg5 < var9) {
            int var10 = arg2[arg5] & 0xFF;
            int var11 = this.field195[var10];
            byte var12 = this.field197[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var7 = class678.method3817(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg4[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg4[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg4[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg4[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg5++;
        }
        return (var8 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V", line = 227)
    public static final void method104(int arg0, int arg1) {
        field191++;
        class248.field3650 = arg0;
        class690 var2 = class63.field980;
        synchronized (class63.field980) {
            class63.field980.method3906(-104);
        }
        if (arg1 != 0) {
            method105(-116);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 244)
    public static final void method105(int arg0) {
        class453.field6283.method1474(class523.field7273, class332.field4707.field4765.method3375(0) == 1 ? class605.field8176 + 256 << 2 : -1, 0);
        field200++;
        if (arg0 < 115) {
            method106(4);
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V", line = 258)
    public static void method106(int arg0) {
        int var1 = -85 / ((42 - arg0) / 50);
        field194 = null;
        field198 = null;
        field192 = null;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([B)V", line = 272)
    public class20(byte[] arg0) {
        int var2 = arg0.length;
        this.field195 = new int[var2];
        this.field197 = arg0;
        this.field196 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field195[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var8 | var7;
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
                        var3[var10] = class678.method3817(var11, var12);
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
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field196[var14] == 0) {
                            this.field196[var14] = var4;
                        }
                        var14 = this.field196[var14];
                    }
                    if (var14 >= this.field196.length) {
                        int[] var17 = new int[this.field196.length * 2];
                        for (int var18 = 0; var18 < this.field196.length; var18++) {
                            var17[var18] = this.field196[var18];
                        }
                        this.field196 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field196[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
