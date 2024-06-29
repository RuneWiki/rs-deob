import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class316 {

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "[B")
    private byte[] field4732;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "[I")
    private int[] field4738;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "[I")
    private int[] field4731;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "[I")
    public static int[] field4729 = new int[1];

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Lqc;")
    public static class325 field4733 = new class325(4);

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 8)
    public static void method1987(int arg0) {
        field4733 = null;
        if (arg0 != 0) {
            method1991(-106, 97, 99);
        }
        field4729 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZ[BI[BI)I", line = 22)
    public final int method1988(int arg0, boolean arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field4734++;
        int var7 = 0;
        if (!arg1) {
            return 52;
        }
        int var8 = arg0 << 3;
        int var9 = arg3 + arg5;
        while (var9 > arg5) {
            int var10 = arg4[arg5] & 0xFF;
            int var11 = this.field4738[var10];
            byte var12 = this.field4732[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var12 + var14 - 1 >> 3);
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var7 = class313.method1926(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg2[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg2[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg2[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg2[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg5++;
        }
        return (var8 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[B[BII)I", line = 96)
    public final int method1989(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        field4736++;
        if (~arg5 == arg4) {
            return 0;
        }
        int var7 = arg1 + arg5;
        int var8 = 0;
        int var9 = arg0;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 < 0) {
                var8 = this.field4731[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field4731[var8]) < 0) {
                arg3[arg1++] = (byte) (~var11);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field4731[var8];
            }
            int var12;
            if ((var12 = this.field4731[var8]) < 0) {
                arg3[arg1++] = (byte) (~var12);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field4731[var8];
            }
            int var13;
            if ((var13 = this.field4731[var8]) < 0) {
                arg3[arg1++] = (byte) (~var13);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field4731[var8];
            }
            int var14;
            if ((var14 = this.field4731[var8]) < 0) {
                arg3[arg1++] = (byte) (~var14);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field4731[var8];
            }
            int var15;
            if ((var15 = this.field4731[var8]) < 0) {
                arg3[arg1++] = (byte) (~var15);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field4731[var8];
            }
            int var16;
            if ((var16 = this.field4731[var8]) < 0) {
                arg3[arg1++] = (byte) (~var16);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field4731[var8];
            }
            int var17;
            if ((var17 = this.field4731[var8]) < 0) {
                arg3[arg1++] = (byte) (~var17);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field4731[var8];
            }
            int var18;
            if ((var18 = this.field4731[var8]) < 0) {
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

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V", line = 245)
    public static final void method1990(int arg0, int arg1, int arg2) {
        int var3 = -33 / ((arg2 + 36) / 53);
        class17.field147 = arg1 - class113.field1434;
        field4737++;
        class53.field639 = arg0 - class113.field1445;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(III)Z", line = 267)
    public static final boolean method1991(int arg0, int arg1, int arg2) {
        field4735++;
        if (arg0 > -124) {
            method1987(112);
        }
        boolean var3 = (arg2 & 0x37) == 0 ? class82.method474(arg1, arg2, (byte) 108) : class62.method394((byte) 122, arg2, arg1);
        return var3 | (arg1 & 0x10000) != 0 | class174.method1126(arg2, 544, arg1);
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "([B)V", line = 279)
    public class316(byte[] arg0) {
        int var2 = arg0.length;
        this.field4732 = arg0;
        this.field4738 = new int[var2];
        this.field4731 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4738[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
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
                        var3[var10] = class313.method1926(var12, var11);
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
                        if (this.field4731[var14] == 0) {
                            this.field4731[var14] = var4;
                        }
                        var14 = this.field4731[var14];
                    }
                    if (this.field4731.length <= var14) {
                        int[] var17 = new int[this.field4731.length * 2];
                        for (int var18 = 0; var18 < this.field4731.length; var18++) {
                            var17[var18] = this.field4731[var18];
                        }
                        this.field4731 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field4731[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 404)
    public static final void method1992(String arg0, byte arg1) {
        System.exit(1);
        field4730++;
        int var2 = 17 / ((arg1 - 33) / 49);
    }
}
