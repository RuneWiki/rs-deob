import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class28 {

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "[B")
    private byte[] field354;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "[I")
    private int[] field359;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "[I")
    private int[] field355;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "[S")
    public static short[] field351 = new short[256];

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "Lij;")
    public static class242 field357;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V", line = 12)
    public static void method151(byte arg0) {
        if (arg0 != -57) {
            method153(77, 104, 80, -9, 80, 98);
        }
        field351 = null;
        field357 = null;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)V", line = 27)
    public static final void method152(byte arg0) {
        field350++;
        class276 var1 = class264.method1816((byte) -127, 0, 15);
        var1.method1870((byte) 126);
        if (arg0 < 109) {
            field351 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIII)V", line = 41)
    public static final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field356++;
        if (class240.field3547 >= arg2 && class245.field3659 <= arg5) {
            boolean var6;
            if (class408.field5789 > arg3) {
                arg3 = class408.field5789;
                var6 = false;
            } else if (arg3 > class231.field3415) {
                var6 = false;
                arg3 = class231.field3415;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg0 < class408.field5789) {
                var7 = false;
                arg0 = class408.field5789;
            } else if (class231.field3415 >= arg0) {
                var7 = true;
            } else {
                var7 = false;
                arg0 = class231.field3415;
            }
            if (class245.field3659 <= arg2) {
                class5.method17(class440.field6288[arg2++], arg0, arg4, (byte) 116, arg3);
            } else {
                arg2 = class245.field3659;
            }
            if (class240.field3547 < arg5) {
                arg5 = class240.field3547;
            } else {
                class5.method17(class440.field6288[arg5--], arg0, arg4, (byte) 71, arg3);
            }
            if (var6 && var7) {
                for (int var8 = arg2; var8 <= arg5; var8++) {
                    int[] var9 = class440.field6288[var8];
                    var9[arg3] = var9[arg0] = arg4;
                }
            } else if (var6) {
                for (int var11 = arg2; var11 <= arg5; var11++) {
                    class440.field6288[var11][arg3] = arg4;
                }
            } else if (var7) {
                for (int var10 = arg2; var10 <= arg5; var10++) {
                    class440.field6288[var10][arg0] = arg4;
                }
            }
        }
        if (arg1 != 1) {
            field351 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "([BI[BIII)I", line = 152)
    public final int method154(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field358++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg5;
        int var8 = arg1 + arg4;
        int var9 = arg3;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 < 0) {
                var7 = this.field355[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field355[var7]) < 0) {
                arg0[arg1++] = (byte) (~var11);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field355[var7];
            }
            int var12;
            if ((var12 = this.field355[var7]) < 0) {
                arg0[arg1++] = (byte) (~var12);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field355[var7];
            }
            int var13;
            if ((var13 = this.field355[var7]) < 0) {
                arg0[arg1++] = (byte) (~var13);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field355[var7];
            }
            int var14;
            if ((var14 = this.field355[var7]) < 0) {
                arg0[arg1++] = (byte) (~var14);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field355[var7];
            }
            int var15;
            if ((var15 = this.field355[var7]) < 0) {
                arg0[arg1++] = (byte) (~var15);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field355[var7];
            }
            int var16;
            if ((var16 = this.field355[var7]) < 0) {
                arg0[arg1++] = (byte) (~var16);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field355[var7];
            }
            int var17;
            if ((var17 = this.field355[var7]) < 0) {
                arg0[arg1++] = (byte) (~var17);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field355[var7];
            }
            int var18;
            if ((var18 = this.field355[var7]) < 0) {
                arg0[arg1++] = (byte) (~var18);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IBI[BI[B)I", line = 297)
    public final int method155(int arg0, byte arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        field352++;
        int var7 = 0;
        if (arg1 != -123) {
            this.field354 = null;
        }
        int var8 = arg0 + arg2;
        int var9 = arg4 << 3;
        while (arg0 < var8) {
            int var10 = arg5[arg0] & 0xFF;
            int var11 = this.field359[var10];
            byte var12 = this.field354[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            var9 += var12;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var7 = class332.method2176(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg3[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg3[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg3[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg3[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "([B)V", line = 367)
    public class28(byte[] arg0) {
        int var2 = arg0.length;
        this.field354 = arg0;
        this.field359 = new int[var2];
        int[] var3 = new int[33];
        this.field355 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field359[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class332.method2176(var10, var11);
                    }
                    var12 = var8 | var7;
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
                        if (this.field355[var14] == 0) {
                            this.field355[var14] = var4;
                        }
                        var14 = this.field355[var14];
                    }
                    if (this.field355.length <= var14) {
                        int[] var17 = new int[this.field355.length * 2];
                        for (int var18 = 0; var18 < this.field355.length; var18++) {
                            var17[var18] = this.field355[var18];
                        }
                        this.field355 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field355[var14] = ~var5;
            }
        }
    }
}
