import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class451 {

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "[I")
    private int[] field6452;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "[B")
    private byte[] field6449;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "[I")
    private int[] field6447;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lmr;")
    public static class611 field6446 = new class611();

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Lqk;")
    public static class146 field6455 = null;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field6456 = 1400;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Laea;")
    public static class258 field6457;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "[I")
    public static int[] field6454;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)I", line = 3)
    public static final int method2759(int arg0, int arg1) {
        return class609.field8690 == null ? 0 : class609.field8690[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 6)
    public static void method2760(int arg0) {
        field6457 = null;
        field6446 = null;
        field6455 = null;
        field6454 = null;
        if (arg0 != -1) {
            field6456 = 30;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III[B[BI)I", line = 21)
    public final int method2761(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        field6453++;
        int var7 = 0;
        int var8 = arg0 + arg2;
        int var9 = arg5 << 3;
        while (var8 > arg0) {
            int var10 = arg3[arg0] & 0xFF;
            int var11 = this.field6452[var10];
            byte var12 = this.field6449[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var7 = class430.method2658(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg4[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
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
            var9 += var12;
            arg0++;
        }
        if (arg1 >= -67) {
            this.method2761(-14, 8, 111, null, null, -35);
        }
        return (var9 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(III[B[BI)I", line = 95)
    public final int method2762(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        field6450++;
        if (arg5 != -19956) {
            return -56;
        } else if (arg0 == 0) {
            return 0;
        } else {
            int var7 = 0;
            int var8 = arg0 + arg2;
            int var9 = arg1;
            while (true) {
                byte var10 = arg4[var9];
                if (var10 >= 0) {
                    var7++;
                } else {
                    var7 = this.field6447[var7];
                }
                int var11;
                if ((var11 = this.field6447[var7]) < 0) {
                    arg3[arg2++] = (byte) (~var11);
                    if (var8 <= arg2) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x40) == 0) {
                    var7++;
                } else {
                    var7 = this.field6447[var7];
                }
                int var12;
                if ((var12 = this.field6447[var7]) < 0) {
                    arg3[arg2++] = (byte) (~var12);
                    if (arg2 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x20) == 0) {
                    var7++;
                } else {
                    var7 = this.field6447[var7];
                }
                int var13;
                if ((var13 = this.field6447[var7]) < 0) {
                    arg3[arg2++] = (byte) (~var13);
                    if (arg2 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x10) == 0) {
                    var7++;
                } else {
                    var7 = this.field6447[var7];
                }
                int var14;
                if ((var14 = this.field6447[var7]) < 0) {
                    arg3[arg2++] = (byte) (~var14);
                    if (arg2 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x8) == 0) {
                    var7++;
                } else {
                    var7 = this.field6447[var7];
                }
                int var15;
                if ((var15 = this.field6447[var7]) < 0) {
                    arg3[arg2++] = (byte) (~var15);
                    if (arg2 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x4) == 0) {
                    var7++;
                } else {
                    var7 = this.field6447[var7];
                }
                int var16;
                if ((var16 = this.field6447[var7]) < 0) {
                    arg3[arg2++] = (byte) (~var16);
                    if (var8 <= arg2) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x2) == 0) {
                    var7++;
                } else {
                    var7 = this.field6447[var7];
                }
                int var17;
                if ((var17 = this.field6447[var7]) < 0) {
                    arg3[arg2++] = (byte) (~var17);
                    if (arg2 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x1) == 0) {
                    var7++;
                } else {
                    var7 = this.field6447[var7];
                }
                int var18;
                if ((var18 = this.field6447[var7]) < 0) {
                    arg3[arg2++] = (byte) (~var18);
                    if (var8 <= arg2) {
                        break;
                    }
                    var7 = 0;
                }
                var9++;
            }
            return var9 + 1 - arg1;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V", line = 248)
    public static final void method2763(int arg0, boolean arg1) {
        field6451++;
        int var2 = class524.field7614;
        int var3 = class148.field2159;
        if (arg1 && class100.field1447) {
            var2 <<= 0x1;
            var3 = -var2;
        }
        class211.field3164.method281(var3, var2);
        if (arg0 > -30) {
            field6454 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "([B)V", line = 270)
    public class451(byte[] arg0) {
        int var2 = arg0.length;
        this.field6452 = new int[var2];
        this.field6449 = arg0;
        this.field6447 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field6452[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var3[var10] = class430.method2658(var12, var11);
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
                        if (this.field6447[var14] == 0) {
                            this.field6447[var14] = var4;
                        }
                        var14 = this.field6447[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field6447.length <= var14) {
                        int[] var18 = new int[this.field6447.length * 2];
                        for (int var19 = 0; var19 < this.field6447.length; var19++) {
                            var18[var19] = this.field6447[var19];
                        }
                        this.field6447 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field6447[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lsl;I)Lpia;", line = 393)
    public static final class56 method2764(class479 arg0, int arg1) {
        field6445++;
        class548 var2 = class744.method4153(arg0, (byte) -127);
        int var3 = arg0.method2908(-94);
        if (arg1 != -1) {
            field6454 = null;
        }
        return new class56(var2.field7957, var2.field7959, var2.field7955, var2.field7961, var2.field7956, var3);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V", line = 411)
    public static final void method2765(int arg0) {
        if (arg0 != 8) {
            method2760(-32);
        }
        if (class624.field8880 == null || class195.field2853 == null) {
            class195.field2853 = new int[256];
            class624.field8880 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class624.field8880[var1] = (int) (Math.sin(var2) * 4096.0D);
                class195.field2853[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field6448++;
    }
}
