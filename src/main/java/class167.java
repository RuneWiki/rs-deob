import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class167 {

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "[I")
    private int[] field2544;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "[I")
    private int[] field2542;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "[B")
    private byte[] field2547;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Z")
    public static boolean field2540 = false;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field2549 = 0;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "[J")
    public static long[] field2548 = new long[32];

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Lwj;")
    public static class153 field2543 = new class153(64);

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lma;")
    public static class5 field2550 = class12.method119("floorshadows", (byte) 91);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "J")
    public static long field2539;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Lsj;")
    public static class181 field2546;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "Lpg;")
    public static class295 field2551;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)I", line = 6)
    public static final int method1110(int arg0, int arg1) {
        field2541++;
        return arg0 == 948275 ? (arg1 & 0xE7833) >> 17 : -79;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([BIIII[B)I", line = 17)
    public final int method1111(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field2545++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = arg1 + arg2;
        if (arg4 <= 12) {
            this.field2547 = (byte[]) null;
        }
        int var8 = 0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field2544[var8];
            }
            int var11;
            if ((var11 = this.field2544[var8]) < 0) {
                arg0[arg2++] = (byte) (~var11);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field2544[var8];
            }
            int var12;
            if ((var12 = this.field2544[var8]) < 0) {
                arg0[arg2++] = (byte) (~var12);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field2544[var8];
            }
            int var13;
            if ((var13 = this.field2544[var8]) < 0) {
                arg0[arg2++] = (byte) (~var13);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field2544[var8];
            }
            int var14;
            if ((var14 = this.field2544[var8]) < 0) {
                arg0[arg2++] = (byte) (~var14);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field2544[var8];
            }
            int var15;
            if ((var15 = this.field2544[var8]) < 0) {
                arg0[arg2++] = (byte) (~var15);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field2544[var8];
            }
            int var16;
            if ((var16 = this.field2544[var8]) < 0) {
                arg0[arg2++] = (byte) (~var16);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field2544[var8];
            }
            int var17;
            if ((var17 = this.field2544[var8]) < 0) {
                arg0[arg2++] = (byte) (~var17);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field2544[var8];
            }
            int var18;
            if ((var18 = this.field2544[var8]) < 0) {
                arg0[arg2++] = (byte) (~var18);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZII[BI[B)I", line = 168)
    public final int method1112(boolean arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        if (!arg0) {
            return -44;
        }
        int var7 = 0;
        int var8 = arg1 + arg4;
        field2537++;
        int var9 = arg2 << 3;
        while (var8 > arg4) {
            int var10 = arg5[arg4] & 0xFF;
            int var11 = this.field2542[var10];
            byte var12 = this.field2547[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var13 + (var12 + var14 - 1 >> 3);
            int var16 = var7 & -var14 >> 31;
            var9 += var12;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var7 = class264.method1820(var16, var11 >>> var17));
            if (var15 > var13) {
                var13++;
                var14 = var17 - 8;
                arg3[var13] = (byte) (var7 = var11 >>> var14);
                if (var15 > var13) {
                    var14 -= 8;
                    var13++;
                    arg3[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var15) {
                        var13++;
                        var14 -= 8;
                        arg3[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var15) {
                            var14 -= 8;
                            var13++;
                            arg3[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        return (var9 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 258)
    public static void method1113(byte arg0) {
        field2550 = null;
        field2548 = null;
        int var1 = 101 / ((30 - arg0) / 40);
        field2546 = null;
        field2543 = null;
        field2551 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILeb;II)V", line = 274)
    public static final void method1114(int arg0, class253 arg1, int arg2, int arg3) {
        if (arg1.field4218 == 0) {
            arg1.field4235 = arg1.field4280;
        } else if (arg1.field4218 == 1) {
            arg1.field4235 = (arg3 - arg1.field4228) / 2 + arg1.field4280;
        } else if (arg1.field4218 == 2) {
            arg1.field4235 = arg3 - arg1.field4228 - arg1.field4280;
        } else if (arg1.field4218 == 3) {
            arg1.field4235 = arg1.field4280 * arg3 >> 14;
        } else if (arg1.field4218 == 4) {
            arg1.field4235 = (arg1.field4280 * arg3 >> 14) + (arg3 - arg1.field4228) / 2;
        } else {
            arg1.field4235 = arg3 - (arg1.field4280 * arg3 >> 14) - arg1.field4228;
        }
        field2538++;
        if (arg0 != 1) {
            return;
        }
        if (arg1.field4229 == 0) {
            arg1.field4322 = arg1.field4268;
        } else if (arg1.field4229 == 1) {
            arg1.field4322 = (arg2 - arg1.field4190) / 2 + arg1.field4268;
        } else if (arg1.field4229 == 2) {
            arg1.field4322 = arg2 - arg1.field4268 - arg1.field4190;
        } else if (arg1.field4229 == 3) {
            arg1.field4322 = arg1.field4268 * arg2 >> 14;
        } else if (arg1.field4229 == 4) {
            arg1.field4322 = (arg1.field4268 * arg2 >> 14) + (arg2 - arg1.field4190) / 2;
        } else {
            arg1.field4322 = arg2 - ((arg1.field4268 * arg2 >> 14) + arg1.field4190);
        }
        if (!class184.field2833 || !(client.method767(arg1) != 0 || arg1.field4216 == 0)) {
            return;
        }
        if (arg1.field4235 < 0) {
            arg1.field4235 = 0;
        } else if ((arg1.field4235 + arg1.field4228) > arg3) {
            arg1.field4235 = arg3 - arg1.field4228;
        }
        if (arg1.field4322 < 0) {
            arg1.field4322 = 0;
        } else if (arg2 < (arg1.field4322 + arg1.field4190)) {
            arg1.field4322 = arg2 - arg1.field4190;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "([B)V", line = 354)
    public class167(byte[] arg0) {
        int var2 = arg0.length;
        this.field2544 = new int[8];
        this.field2542 = new int[var2];
        this.field2547 = arg0;
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field2542[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var3[var10] = class264.method1820(var11, var12);
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
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field2544[var14] == 0) {
                            this.field2544[var14] = var4;
                        }
                        var14 = this.field2544[var14];
                    }
                    if (this.field2544.length <= var14) {
                        int[] var17 = new int[this.field2544.length * 2];
                        for (int var18 = 0; var18 < this.field2544.length; var18++) {
                            var17[var18] = this.field2544[var18];
                        }
                        this.field2544 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field2544[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
