import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class681 {

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "[I")
    private int[] field9345;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "[B")
    private byte[] field9338;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "[I")
    private int[] field9336;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    public static int field9339 = 1337;

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "I")
    public static int field9340 = 1;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
    public static int field9332;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public static int field9334;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
    public static int field9335;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    public static int field9337;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
    public static int field9341;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    public static int field9342;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public static int field9343;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "I")
    public static int field9346;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "Lfp;")
    public static class323 field9333;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "Loia;")
    public static class88 field9344;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I[BIBI[B)I")
    public final int method3812(int arg0, byte[] arg1, int arg2, byte arg3, int arg4, byte[] arg5) {
        if (arg3 != 31) {
            method3817(-50, -112, true, null);
        }
        field9332++;
        int var7 = 0;
        int var8 = arg2 << 3;
        int var9 = arg0 + arg4;
        while (arg0 < var9) {
            int var10 = arg1[arg0] & 0xFF;
            int var11 = this.field9345[var10];
            byte var12 = this.field9338[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var12 + var14 - 1 >> 3);
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var7 = class325.method2116(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg5[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg5[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg5[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg5[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg0++;
        }
        return (var8 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIII)I")
    public static final int method3813(int arg0, int arg1, int arg2, int arg3) {
        field9342++;
        int var4 = arg0 & arg2;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public static void method3814(int arg0) {
        field9344 = null;
        if (arg0 == -1141) {
            field9333 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(BILeea;II)Lll;")
    public static final class364 method3815(byte arg0, int arg1, class131 arg2, int arg3, int arg4) {
        if (arg0 <= 49) {
            return null;
        }
        field9346++;
        if (!arg2.field1869 && (!class253.method1681(arg3, (byte) 92) || !class253.method1681(arg1, (byte) 121))) {
            return arg2.field1906 ? new class364(arg2, 34037, arg4, arg3, arg1) : new class364(arg2, arg4, arg3, arg1, class123.method837(115, arg3), class123.method837(125, arg1));
        } else {
            return new class364(arg2, 3553, arg4, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "([BII[BII)I")
    public final int method3816(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field9337++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg1;
        int var8 = arg4 + arg5;
        int var9 = arg2;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 < 0) {
                var7 = this.field9336[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field9336[var7]) < 0) {
                arg3[arg5++] = (byte) (~var11);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field9336[var7];
            }
            int var12;
            if ((var12 = this.field9336[var7]) < 0) {
                arg3[arg5++] = (byte) (~var12);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field9336[var7];
            }
            int var13;
            if ((var13 = this.field9336[var7]) < 0) {
                arg3[arg5++] = (byte) (~var13);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field9336[var7];
            }
            int var14;
            if ((var14 = this.field9336[var7]) < 0) {
                arg3[arg5++] = (byte) (~var14);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field9336[var7];
            }
            int var15;
            if ((var15 = this.field9336[var7]) < 0) {
                arg3[arg5++] = (byte) (~var15);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field9336[var7];
            }
            int var16;
            if ((var16 = this.field9336[var7]) < 0) {
                arg3[arg5++] = (byte) (~var16);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field9336[var7];
            }
            int var17;
            if ((var17 = this.field9336[var7]) < 0) {
                arg3[arg5++] = (byte) (~var17);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field9336[var7];
            }
            int var18;
            if ((var18 = this.field9336[var7]) < 0) {
                arg3[arg5++] = (byte) (~var18);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIZLjb;)V")
    public static final void method3817(int arg0, int arg1, boolean arg2, class493 arg3) {
        field9341++;
        if (class643.field8813 != null || class436.field6192 || arg3 == null || class530.method3091((byte) 51, arg3) == null) {
            return;
        }
        class643.field8813 = arg3;
        class76.field991 = class530.method3091((byte) 80, arg3);
        class76.field985 = 0;
        class390.field5517 = false;
        class481.field6800 = arg1;
        class640.field8791 = arg0;
        if (!arg2) {
            method3817(66, 120, false, null);
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "([B)V")
    public class681(byte[] arg0) {
        int var2 = arg0.length;
        this.field9345 = new int[var2];
        this.field9338 = arg0;
        this.field9336 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field9345[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class325.method2116(var12, var11);
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
                        if (this.field9336[var14] == 0) {
                            this.field9336[var14] = var4;
                        }
                        var14 = this.field9336[var14];
                    }
                    if (var14 >= this.field9336.length) {
                        int[] var17 = new int[this.field9336.length * 2];
                        for (int var18 = 0; var18 < this.field9336.length; var18++) {
                            var17[var18] = this.field9336[var18];
                        }
                        this.field9336 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field9336[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
