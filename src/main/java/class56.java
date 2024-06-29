import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class56 {

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "[I")
    private int[] field782;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "[B")
    private byte[] field784;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "[I")
    private int[] field783;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lag;)V")
    public static final void method367(class641 arg0) {
        for (int var1 = arg0.field8611; var1 <= arg0.field8622; var1++) {
            for (int var2 = arg0.field8618; var2 <= arg0.field8610; var2++) {
                class24 var3 = class703.field9899[arg0.field8609][var1][var2];
                if (var3 != null) {
                    class684 var4 = var3.field409;
                    class684 var5 = null;
                    while (var4 != null) {
                        if (var4.field9619 == arg0) {
                            if (var5 == null) {
                                var3.field409 = var4.field9618;
                            } else {
                                var5.field9618 = var4.field9618;
                            }
                            var4.method3809(2048);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field9618;
                    }
                    var3.field414 = 0;
                    for (class684 var6 = var3.field409; var6 != null; var6 = var6.field9618) {
                        var3.field414 = (byte) (var3.field414 | var6.field9621);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[BIII[B)I")
    public final int method368(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field781++;
        int var7 = 0;
        int var8 = arg3 << 3;
        int var9 = arg0 + arg2;
        if (arg4 >= -78) {
            return -9;
        }
        while (var9 > arg2) {
            int var10 = arg5[arg2] & 0xFF;
            int var11 = this.field782[var10];
            byte var12 = this.field784[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var7 = class220.method1393(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg1[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg1[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg1[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg1[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg2++;
        }
        return (var8 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([BIII[BI)I")
    public final int method369(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field780++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg2 + arg3;
        int var8 = 0;
        if (arg5 <= 96) {
            return 66;
        }
        int var9 = arg1;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 < 0) {
                var8 = this.field783[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field783[var8]) < 0) {
                arg4[arg2++] = (byte) (~var11);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field783[var8];
            }
            int var12;
            if ((var12 = this.field783[var8]) < 0) {
                arg4[arg2++] = (byte) (~var12);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field783[var8];
            }
            int var13;
            if ((var13 = this.field783[var8]) < 0) {
                arg4[arg2++] = (byte) (~var13);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field783[var8];
            }
            int var14;
            if ((var14 = this.field783[var8]) < 0) {
                arg4[arg2++] = (byte) (~var14);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field783[var8];
            }
            int var15;
            if ((var15 = this.field783[var8]) < 0) {
                arg4[arg2++] = (byte) (~var15);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field783[var8];
            }
            int var16;
            if ((var16 = this.field783[var8]) < 0) {
                arg4[arg2++] = (byte) (~var16);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field783[var8];
            }
            int var17;
            if ((var17 = this.field783[var8]) < 0) {
                arg4[arg2++] = (byte) (~var17);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field783[var8];
            }
            int var18;
            if ((var18 = this.field783[var8]) < 0) {
                arg4[arg2++] = (byte) (~var18);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "([B)V")
    public class56(byte[] arg0) {
        int var2 = arg0.length;
        this.field782 = new int[var2];
        this.field784 = arg0;
        int[] var3 = new int[33];
        this.field783 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field782[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class220.method1393(var10, var11);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field783[var14] == 0) {
                            this.field783[var14] = var4;
                        }
                        var14 = this.field783[var14];
                    }
                    if (var14 >= this.field783.length) {
                        int[] var17 = new int[this.field783.length * 2];
                        for (int var18 = 0; var18 < this.field783.length; var18++) {
                            var17[var18] = this.field783[var18];
                        }
                        this.field783 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field783[var14] = ~var5;
            }
        }
    }
}
