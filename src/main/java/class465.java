import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class465 {

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "[I")
    private int[] field6490;

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "[B")
    private byte[] field6486;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "[I")
    private int[] field6482;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "Lwo;")
    public static class690 field6485 = new class690(59, 8);

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "[Lqw;")
    public static class68[] field6487 = new class68[50];

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "[I")
    public static int[] field6489 = new int[13];

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II[BI[BI)I", line = 5)
    public final int method2728(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field6484++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg3;
        int var8 = 0;
        int var9 = arg5;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field6482[var8];
            }
            int var11;
            if ((var11 = this.field6482[var8]) < 0) {
                arg4[arg3++] = (byte) (~var11);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field6482[var8];
            }
            int var12;
            if ((var12 = this.field6482[var8]) < 0) {
                arg4[arg3++] = (byte) (~var12);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field6482[var8];
            }
            int var13;
            if ((var13 = this.field6482[var8]) < 0) {
                arg4[arg3++] = (byte) (~var13);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field6482[var8];
            }
            int var14;
            if ((var14 = this.field6482[var8]) < 0) {
                arg4[arg3++] = (byte) (~var14);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field6482[var8];
            }
            int var15;
            if ((var15 = this.field6482[var8]) < 0) {
                arg4[arg3++] = (byte) (~var15);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field6482[var8];
            }
            int var16;
            if ((var16 = this.field6482[var8]) < 0) {
                arg4[arg3++] = (byte) (~var16);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field6482[var8];
            }
            int var17;
            if ((var17 = this.field6482[var8]) < 0) {
                arg4[arg3++] = (byte) (~var17);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field6482[var8];
            }
            int var18;
            if ((var18 = this.field6482[var8]) < 0) {
                arg4[arg3++] = (byte) (~var18);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        if (arg1 != 8) {
            method2729((byte) 93);
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)V", line = 159)
    public static void method2729(byte arg0) {
        field6487 = null;
        if (arg0 != 60) {
            field6487 = null;
        }
        field6489 = null;
        field6485 = null;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIBZII)V", line = 175)
    public static final void method2730(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5) {
        field6488++;
        long var6 = (long) (arg4 | (arg3 ? Integer.MIN_VALUE : 0));
        class122 var8 = (class122) class115.field1492.method3678(var6, arg2 ^ 0xFFFFFFDE);
        if (var8 == null) {
            var8 = new class122();
            class115.field1492.method3670(var6, var8, (byte) 127);
        }
        if (var8.field1574.length <= arg1) {
            int[] var9 = new int[arg1 + 1];
            int[] var10 = new int[arg1 + 1];
            for (int var11 = 0; var11 < var8.field1574.length; var11++) {
                var9[var11] = var8.field1574[var11];
                var10[var11] = var8.field1572[var11];
            }
            for (int var12 = var8.field1574.length; var12 < arg1; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field1572 = var10;
            var8.field1574 = var9;
        }
        if (arg2 == 90) {
            var8.field1574[arg1] = arg5;
            var8.field1572[arg1] = arg0;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BI[BI[BI)I", line = 240)
    public final int method2731(byte arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field6483++;
        int var7 = 0;
        int var8 = arg1 + arg3;
        int var9 = arg5 << 3;
        if (arg0 >= -53) {
            method2730(82, -4, (byte) -105, false, 35, -126);
        }
        while (var8 > arg1) {
            int var10 = arg2[arg1] & 0xFF;
            int var11 = this.field6490[var10];
            byte var12 = this.field6486[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var12 + var14 - 1 >> 3);
            var9 += var12;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var7 = class242.method1474(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg4[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg4[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg4[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg4[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var9 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "([B)V", line = 312)
    public class465(byte[] arg0) {
        int var2 = arg0.length;
        this.field6490 = new int[var2];
        this.field6486 = arg0;
        this.field6482 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field6490[var5] = var8;
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
                        var3[var10] = class242.method1474(var12, var11);
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
                        if (this.field6482[var14] == 0) {
                            this.field6482[var14] = var4;
                        }
                        var14 = this.field6482[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field6482.length <= var14) {
                        int[] var18 = new int[this.field6482.length * 2];
                        for (int var19 = 0; var19 < this.field6482.length; var19++) {
                            var18[var19] = this.field6482[var19];
                        }
                        this.field6482 = var18;
                    }
                }
                this.field6482[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
