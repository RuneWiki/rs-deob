import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class637 {

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "[B")
    private byte[] field8813;

    @OriginalMember(owner = "client!ow", name = "h", descriptor = "[I")
    private int[] field8817;

    @OriginalMember(owner = "client!ow", name = "f", descriptor = "[I")
    private int[] field8815;

    @OriginalMember(owner = "client!ow", name = "g", descriptor = "I")
    public static int field8816 = 0;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
    public static int field8810;

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "[Lac;")
    public static class712[] field8811;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIIIII)I")
    public static final int method3455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8812++;
        if (arg0 != 8) {
            method3455(-21, 54, -22, -116, 59, 5);
        }
        if (class517.field7282 == null) {
            return 0;
        }
        if (arg5 < 3) {
            int var6 = arg3 >> 9;
            int var7 = arg1 >> 9;
            if (arg4 < 0 || arg2 < 0 || class613.field8591 - 1 < arg4 || arg2 > (class1.field3 - 1)) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || (class613.field8591 - 1) < var6 || var7 > class1.field3 - 1) {
                return 0;
            }
            boolean var8 = (class215.field2728[1][arg3 >> 9][arg1 >> 9] & 0x2) != 0;
            if ((arg3 & 0x1FF) == 0) {
                boolean var9 = (class215.field2728[1][var6 - 1][arg1 >> 9] & 0x2) != 0;
                boolean var10 = (class215.field2728[1][var6][arg1 >> 9] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class215.field2728[1][arg4][arg2] & 0x2) != 0;
                }
            }
            if ((arg1 & 0x1FF) == 0) {
                boolean var11 = (class215.field2728[1][arg3 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class215.field2728[1][arg3 >> 9][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class215.field2728[1][arg4][arg2] & 0x2) != 0;
                }
            }
            if (var8) {
                arg5++;
            }
        }
        return class517.field7282[arg5].method2382((byte) 19, arg1, arg3);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I[BII[BI)I")
    public final int method3456(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field8814++;
        int var7 = 0;
        int var8 = arg2 + arg5;
        int var9 = arg3 << 3;
        if (arg0 != 1) {
            this.method3458(null, 109, null, -5, 75, true);
        }
        while (arg5 < var8) {
            int var10 = arg4[arg5] & 0xFF;
            int var11 = this.field8817[var10];
            byte var12 = this.field8813[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var7 = class216.method1308(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg1[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg1[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg1[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg1[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg5++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V")
    public static void method3457(int arg0) {
        field8811 = null;
        if (arg0 < 40) {
            field8816 = -61;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "([BI[BIIZ)I")
    public final int method3458(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, boolean arg5) {
        field8810++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = arg1 + arg4;
        int var8 = 0;
        if (arg5) {
            this.method3458(null, -108, null, -76, 98, false);
        }
        int var9 = arg3;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 < 0) {
                var8 = this.field8815[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field8815[var8]) < 0) {
                arg2[arg4++] = (byte) (~var11);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field8815[var8];
            }
            int var12;
            if ((var12 = this.field8815[var8]) < 0) {
                arg2[arg4++] = (byte) (~var12);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field8815[var8];
            }
            int var13;
            if ((var13 = this.field8815[var8]) < 0) {
                arg2[arg4++] = (byte) (~var13);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field8815[var8];
            }
            int var14;
            if ((var14 = this.field8815[var8]) < 0) {
                arg2[arg4++] = (byte) (~var14);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field8815[var8];
            }
            int var15;
            if ((var15 = this.field8815[var8]) < 0) {
                arg2[arg4++] = (byte) (~var15);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field8815[var8];
            }
            int var16;
            if ((var16 = this.field8815[var8]) < 0) {
                arg2[arg4++] = (byte) (~var16);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field8815[var8];
            }
            int var17;
            if ((var17 = this.field8815[var8]) < 0) {
                arg2[arg4++] = (byte) (~var17);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field8815[var8];
            }
            int var18;
            if ((var18 = this.field8815[var8]) < 0) {
                arg2[arg4++] = (byte) (~var18);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "([B)V")
    public class637(byte[] arg0) {
        int var2 = arg0.length;
        this.field8813 = arg0;
        this.field8817 = new int[var2];
        this.field8815 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field8817[var5] = var8;
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
                        var3[var10] = class216.method1308(var11, var12);
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
                        if (this.field8815[var14] == 0) {
                            this.field8815[var14] = var4;
                        }
                        var14 = this.field8815[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field8815.length <= var14) {
                        int[] var18 = new int[this.field8815.length * 2];
                        for (int var19 = 0; var19 < this.field8815.length; var19++) {
                            var18[var19] = this.field8815[var19];
                        }
                        this.field8815 = var18;
                    }
                }
                this.field8815[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
