import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class475 {

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "[I")
    private int[] field6934;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "[B")
    private byte[] field6935;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "[I")
    private int[] field6933;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "[[[B")
    public static byte[][][] field6931;

    static {
        new class466(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZIIZI)I", line = 6)
    public static final int method2789(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field6936++;
        if (arg4 != 15267) {
            field6931 = null;
        }
        class128 var5 = class507.method3024(arg2, arg3, Integer.MIN_VALUE);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field1893.length; var7++) {
            if (var5.field1893[var7] >= 0 && class328.field4480.field7676 > var5.field1893[var7]) {
                class508 var8 = class328.field4480.method3091(46, var5.field1893[var7]);
                int var9 = var8.method3044(arg1, -29012, class177.field2622.method2033((byte) -128, arg1).field2615);
                if (arg0) {
                    var6 += var5.field1902[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V", line = 48)
    public static void method2790(int arg0) {
        field6931 = null;
        if (arg0 != -1) {
            field6931 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(III[B[BB)I", line = 60)
    public final int method2791(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, byte arg5) {
        field6937++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = arg1 + arg2;
        int var8 = 0;
        if (arg5 >= -88) {
            this.field6934 = null;
        }
        int var9 = arg0;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field6933[var8];
            }
            int var11;
            if ((var11 = this.field6933[var8]) < 0) {
                arg3[arg1++] = (byte) (~var11);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field6933[var8];
            }
            int var12;
            if ((var12 = this.field6933[var8]) < 0) {
                arg3[arg1++] = (byte) (~var12);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field6933[var8];
            }
            int var13;
            if ((var13 = this.field6933[var8]) < 0) {
                arg3[arg1++] = (byte) (~var13);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field6933[var8];
            }
            int var14;
            if ((var14 = this.field6933[var8]) < 0) {
                arg3[arg1++] = (byte) (~var14);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field6933[var8];
            }
            int var15;
            if ((var15 = this.field6933[var8]) < 0) {
                arg3[arg1++] = (byte) (~var15);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field6933[var8];
            }
            int var16;
            if ((var16 = this.field6933[var8]) < 0) {
                arg3[arg1++] = (byte) (~var16);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field6933[var8];
            }
            int var17;
            if ((var17 = this.field6933[var8]) < 0) {
                arg3[arg1++] = (byte) (~var17);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field6933[var8];
            }
            int var18;
            if ((var18 = this.field6933[var8]) < 0) {
                arg3[arg1++] = (byte) (~var18);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "([B)V", line = 220)
    public class475(byte[] arg0) {
        int var2 = arg0.length;
        this.field6934 = new int[var2];
        this.field6935 = arg0;
        int[] var3 = new int[33];
        this.field6933 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field6934[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
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
                        var3[var10] = class255.method1532(var12, var11);
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
                        if (this.field6933[var14] == 0) {
                            this.field6933[var14] = var4;
                        }
                        var14 = this.field6933[var14];
                    }
                    if (var14 >= this.field6933.length) {
                        int[] var17 = new int[this.field6933.length * 2];
                        for (int var18 = 0; var18 < this.field6933.length; var18++) {
                            var17[var18] = this.field6933[var18];
                        }
                        this.field6933 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field6933[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "([BIZII[B)I", line = 343)
    public final int method2792(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4, byte[] arg5) {
        if (arg2) {
            return 93;
        }
        field6932++;
        int var7 = 0;
        int var8 = arg1 << 3;
        int var9 = arg3 + arg4;
        while (var9 > arg3) {
            int var10 = arg5[arg3] & 0xFF;
            int var11 = this.field6934[var10];
            byte var12 = this.field6935[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var7 = class255.method1532(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg0[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg0[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg0[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg0[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg3++;
        }
        return (var8 + 7 >> 3) - arg1;
    }
}
