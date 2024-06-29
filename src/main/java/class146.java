import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class146 {

    @OriginalMember(owner = "client!na", name = "d", descriptor = "[I")
    private int[] field2487;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "[I")
    private int[] field2486;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "[B")
    private byte[] field2485;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field2484 = 0;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field2489 = -1;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field2491 = -1;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field2493 = 0;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field2494 = 0;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Lvh;")
    public static class108 field2492;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)I")
    public static final int method1008(int arg0) {
        if (arg0 < 74) {
            method1008(-86);
        }
        field2488++;
        return 6;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public static void method1009(byte arg0) {
        field2492 = null;
        if (arg0 != 100) {
            field2492 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "([B)V")
    public class146(byte[] arg0) {
        int var2 = arg0.length;
        this.field2487 = new int[var2];
        int[] var3 = new int[33];
        this.field2486 = new int[8];
        this.field2485 = arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field2487[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var3[var10] = class112.method789(var12, var11);
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
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field2486[var14] == 0) {
                            this.field2486[var14] = var4;
                        }
                        var14 = this.field2486[var14];
                    }
                    if (this.field2486.length <= var14) {
                        int[] var17 = new int[this.field2486.length * 2];
                        for (int var18 = 0; var18 < this.field2486.length; var18++) {
                            var17[var18] = this.field2486[var18];
                        }
                        this.field2486 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field2486[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IB[BII[B)I")
    public final int method1010(int arg0, byte arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        int var7 = arg0 + arg3;
        int var8 = 0;
        field2495++;
        int var9 = arg4 << 3;
        int var10 = -111 % ((59 - arg1) / 52);
        while (arg3 < var7) {
            int var11 = arg5[arg3] & 0xFF;
            byte var12 = this.field2485[var11];
            int var13 = this.field2487[var11];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var9 >> 3;
            int var15 = var9 & 0x7;
            int var16 = (var12 + var15 - 1 >> 3) + var14;
            int var17 = var8 & -var15 >> 31;
            int var18 = var15 + 24;
            arg2[var14] = (byte) (var8 = class112.method789(var17, var13 >>> var18));
            if (var14 < var16) {
                var14++;
                var15 = var18 - 8;
                arg2[var14] = (byte) (var8 = var13 >>> var15);
                if (var14 < var16) {
                    var14++;
                    var15 -= 8;
                    arg2[var14] = (byte) (var8 = var13 >>> var15);
                    if (var16 > var14) {
                        var14++;
                        var15 -= 8;
                        arg2[var14] = (byte) (var8 = var13 >>> var15);
                        if (var14 < var16) {
                            var15 -= 8;
                            var14++;
                            arg2[var14] = (byte) (var8 = var13 << -var15);
                        }
                    }
                }
            }
            var9 += var12;
            arg3++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III[B[BB)I")
    public final int method1011(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, byte arg5) {
        field2490++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg0 + arg1;
        int var9 = 0 % ((arg5 + 19) / 62);
        int var10 = arg2;
        while (true) {
            byte var11 = arg4[var10];
            if (var11 >= 0) {
                var7++;
            } else {
                var7 = this.field2486[var7];
            }
            int var12;
            if ((var12 = this.field2486[var7]) < 0) {
                arg3[arg0++] = (byte) (~var12);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field2486[var7];
            }
            int var13;
            if ((var13 = this.field2486[var7]) < 0) {
                arg3[arg0++] = (byte) (~var13);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field2486[var7];
            }
            int var14;
            if ((var14 = this.field2486[var7]) < 0) {
                arg3[arg0++] = (byte) (~var14);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field2486[var7];
            }
            int var15;
            if ((var15 = this.field2486[var7]) < 0) {
                arg3[arg0++] = (byte) (~var15);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field2486[var7];
            }
            int var16;
            if ((var16 = this.field2486[var7]) < 0) {
                arg3[arg0++] = (byte) (~var16);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field2486[var7];
            }
            int var17;
            if ((var17 = this.field2486[var7]) < 0) {
                arg3[arg0++] = (byte) (~var17);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field2486[var7];
            }
            int var18;
            if ((var18 = this.field2486[var7]) < 0) {
                arg3[arg0++] = (byte) (~var18);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field2486[var7];
            }
            int var19;
            if ((var19 = this.field2486[var7]) < 0) {
                arg3[arg0++] = (byte) (~var19);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            var10++;
        }
        return var10 + 1 - arg2;
    }
}
