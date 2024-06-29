import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class619 {

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "[I")
    private int[] field8346;

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "[B")
    private byte[] field8343;

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "[I")
    private int[] field8345;

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "I")
    public static int field8341 = 0;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "I")
    public static int field8340;

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "I")
    public static int field8342;

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "I")
    public static int field8344;

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "I")
    public static int field8347;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIII[B[B)I")
    public final int method3399(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        field8342++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = 69 / ((arg1 - 38) / 63);
        int var9 = arg0 + arg2;
        int var10 = arg3;
        while (true) {
            byte var11 = arg5[var10];
            if (var11 < 0) {
                var7 = this.field8345[var7];
            } else {
                var7++;
            }
            int var12;
            if ((var12 = this.field8345[var7]) < 0) {
                arg4[arg2++] = (byte) (~var12);
                if (var9 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field8345[var7];
            }
            int var13;
            if ((var13 = this.field8345[var7]) < 0) {
                arg4[arg2++] = (byte) (~var13);
                if (var9 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field8345[var7];
            }
            int var14;
            if ((var14 = this.field8345[var7]) < 0) {
                arg4[arg2++] = (byte) (~var14);
                if (var9 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field8345[var7];
            }
            int var15;
            if ((var15 = this.field8345[var7]) < 0) {
                arg4[arg2++] = (byte) (~var15);
                if (var9 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field8345[var7];
            }
            int var16;
            if ((var16 = this.field8345[var7]) < 0) {
                arg4[arg2++] = (byte) (~var16);
                if (arg2 >= var9) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field8345[var7];
            }
            int var17;
            if ((var17 = this.field8345[var7]) < 0) {
                arg4[arg2++] = (byte) (~var17);
                if (var9 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field8345[var7];
            }
            int var18;
            if ((var18 = this.field8345[var7]) < 0) {
                arg4[arg2++] = (byte) (~var18);
                if (var9 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field8345[var7];
            }
            int var19;
            if ((var19 = this.field8345[var7]) < 0) {
                arg4[arg2++] = (byte) (~var19);
                if (var9 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            var10++;
        }
        return var10 + 1 - arg3;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIZZI)V")
    public static final void method3400(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        int var5 = -29 / ((1 - arg0) / 58);
        field8344++;
        class408.method2532(0, arg4, arg3, class791.field10877.length - 1, arg1, 14, arg2);
        class356.field5221 = 0;
        class290.field4251 = null;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)Z")
    public static final boolean method3401(int arg0, int arg1, int arg2) {
        if (arg1 == 9209) {
            field8347++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I[B[BIII)I")
    public final int method3402(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field8340++;
        int var7 = arg0;
        int var8 = arg5 << 3;
        int var9 = arg3 + arg4;
        while (var9 > arg4) {
            int var10 = arg2[arg4] & 0xFF;
            int var11 = this.field8346[var10];
            byte var12 = this.field8343[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var7 = class213.method1409(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg1[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg1[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg4++;
        }
        return (var8 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "([B)V")
    public class619(byte[] arg0) {
        int var2 = arg0.length;
        this.field8346 = new int[var2];
        this.field8343 = arg0;
        this.field8345 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field8346[var5] = var8;
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
                        var3[var9] = class213.method1409(var11, var10);
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
                        if (this.field8345[var14] == 0) {
                            this.field8345[var14] = var4;
                        }
                        var14 = this.field8345[var14];
                    }
                    if (this.field8345.length <= var14) {
                        int[] var17 = new int[this.field8345.length * 2];
                        for (int var18 = 0; var18 < this.field8345.length; var18++) {
                            var17[var18] = this.field8345[var18];
                        }
                        this.field8345 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field8345[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
