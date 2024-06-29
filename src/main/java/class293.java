import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class293 {

    @OriginalMember(owner = "client!t", name = "k", descriptor = "[I")
    private int[] field4494;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "[I")
    private int[] field4489;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "[B")
    private byte[] field4485;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field4484 = 0;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field4490 = 0;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lle;")
    public static class127 field4492;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "[Lpj;")
    public static class59[] field4493;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "[[Z")
    public static boolean[][] field4487;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lbj;I)V", line = 8)
    public static final void method2051(class98 arg0, int arg1) {
        if (class304.field4641 == arg0.field1537 || arg0.field1549 == -1 || arg0.field1538 != 0 || (arg0.field1487 + 1) > class72.method468(arg0.field1549, 56).field4184[arg0.field1486]) {
            int var2 = arg0.field1537 - arg0.field1547;
            int var3 = class304.field4641 - arg0.field1547;
            int var4 = arg0.field1525 * 128 + arg0.method696((byte) 117) * 64;
            int var5 = arg0.field1556 * 128 + arg0.method696((byte) 117) * 64;
            int var6 = arg0.field1493 * 128 + arg0.method696((byte) 117) * 64;
            int var7 = arg0.field1568 * 128 + (arg0.method696((byte) 117) * 64);
            arg0.field1566 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg0.field1505 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        field4486++;
        if (arg0.field1523 == 0) {
            arg0.field1474 = 1024;
        }
        if (arg0.field1523 == 1) {
            arg0.field1474 = 1536;
        }
        if (arg1 > -5) {
            return;
        }
        arg0.field1565 = 0;
        if (arg0.field1523 == 2) {
            arg0.field1474 = 0;
        }
        if (arg0.field1523 == 3) {
            arg0.field1474 = 512;
        }
        arg0.field1470 = arg0.field1474;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II[BI[BB)I", line = 56)
    public final int method2052(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, byte arg5) {
        int var7 = arg0 + arg3;
        if (arg5 != 120) {
            field4490 = -91;
        }
        field4491++;
        int var8 = 0;
        int var9 = arg1 << 3;
        while (arg0 < var7) {
            int var10 = arg2[arg0] & 0xFF;
            int var11 = this.field4489[var10];
            byte var12 = this.field4485[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var8 = class140.method1009(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg4[var13] = (byte) (var8 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg4[var13] = (byte) (var8 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg4[var13] = (byte) (var8 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg4[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var9 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V", line = 143)
    public static void method2053(byte arg0) {
        field4492 = null;
        field4493 = null;
        if (arg0 != 7) {
            method2051((class98) null, -50);
        }
        field4487 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[BI[BII)I", line = 156)
    public final int method2054(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field4488++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = 0;
        if (arg5 != -22213) {
            return 39;
        }
        int var8 = arg0 + arg2;
        int var9 = arg4;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var7 = this.field4494[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field4494[var7]) < 0) {
                arg3[arg2++] = (byte) (~var11);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field4494[var7];
            }
            int var12;
            if ((var12 = this.field4494[var7]) < 0) {
                arg3[arg2++] = (byte) (~var12);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field4494[var7];
            }
            int var13;
            if ((var13 = this.field4494[var7]) < 0) {
                arg3[arg2++] = (byte) (~var13);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field4494[var7];
            }
            int var14;
            if ((var14 = this.field4494[var7]) < 0) {
                arg3[arg2++] = (byte) (~var14);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field4494[var7];
            }
            int var15;
            if ((var15 = this.field4494[var7]) < 0) {
                arg3[arg2++] = (byte) (~var15);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field4494[var7];
            }
            int var16;
            if ((var16 = this.field4494[var7]) < 0) {
                arg3[arg2++] = (byte) (~var16);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field4494[var7];
            }
            int var17;
            if ((var17 = this.field4494[var7]) < 0) {
                arg3[arg2++] = (byte) (~var17);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field4494[var7];
            }
            int var18;
            if ((var18 = this.field4494[var7]) < 0) {
                arg3[arg2++] = (byte) (~var18);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "([B)V", line = 303)
    public class293(byte[] arg0) {
        int var2 = 0;
        int[] var3 = new int[33];
        int var4 = arg0.length;
        this.field4494 = new int[8];
        this.field4489 = new int[var4];
        this.field4485 = arg0;
        for (int var5 = 0; var5 < var4; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4489[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var3[var10] = class140.method1009(var12, var11);
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
                        if (this.field4494[var14] == 0) {
                            this.field4494[var14] = var2;
                        }
                        var14 = this.field4494[var14];
                    }
                    if (var14 >= this.field4494.length) {
                        int[] var17 = new int[this.field4494.length * 2];
                        for (int var18 = 0; var18 < this.field4494.length; var18++) {
                            var17[var18] = this.field4494[var18];
                        }
                        this.field4494 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var2 <= var14) {
                    var2 = var14 + 1;
                }
                this.field4494[var14] = ~var5;
            }
        }
    }
}
