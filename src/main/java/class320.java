import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class320 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "[I")
    private int[] field4738;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "[B")
    private byte[] field4744;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "[I")
    private int[] field4743;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field4739 = -60;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "F")
    public static float field4741;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II[BII[B)I", line = 18)
    public final int method1951(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        field4742++;
        int var7 = arg0;
        int var8 = arg4 << 3;
        int var9 = arg1 + arg3;
        while (var9 > arg1) {
            int var10 = arg2[arg1] & 0xFF;
            int var11 = this.field4738[var10];
            byte var12 = this.field4744[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var8 += var12;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var7 = class266.method1624(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg5[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg5[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg5[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg5[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var8 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "([B)V", line = 88)
    public class320(byte[] arg0) {
        int var2 = arg0.length;
        this.field4738 = new int[var2];
        this.field4744 = arg0;
        this.field4743 = new int[8];
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
                        var3[var10] = class266.method1624(var12, var11);
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
                        if (this.field4743[var14] == 0) {
                            this.field4743[var14] = var4;
                        }
                        var14 = this.field4743[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field4743.length <= var14) {
                        int[] var18 = new int[this.field4743.length * 2];
                        for (int var19 = 0; var19 < this.field4743.length; var19++) {
                            var18[var19] = this.field4743[var19];
                        }
                        this.field4743 = var18;
                    }
                }
                this.field4743[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B[BI[BII)I", line = 212)
    public final int method1952(byte arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        if (arg0 <= 74) {
            this.method1951(-18, -103, null, 68, -38, null);
        }
        field4740++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg2 + arg4;
        int var9 = arg5;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field4743[var7];
            }
            int var11;
            if ((var11 = this.field4743[var7]) < 0) {
                arg1[arg4++] = (byte) (~var11);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field4743[var7];
            }
            int var12;
            if ((var12 = this.field4743[var7]) < 0) {
                arg1[arg4++] = (byte) (~var12);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field4743[var7];
            }
            int var13;
            if ((var13 = this.field4743[var7]) < 0) {
                arg1[arg4++] = (byte) (~var13);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field4743[var7];
            }
            int var14;
            if ((var14 = this.field4743[var7]) < 0) {
                arg1[arg4++] = (byte) (~var14);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field4743[var7];
            }
            int var15;
            if ((var15 = this.field4743[var7]) < 0) {
                arg1[arg4++] = (byte) (~var15);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field4743[var7];
            }
            int var16;
            if ((var16 = this.field4743[var7]) < 0) {
                arg1[arg4++] = (byte) (~var16);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field4743[var7];
            }
            int var17;
            if ((var17 = this.field4743[var7]) < 0) {
                arg1[arg4++] = (byte) (~var17);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field4743[var7];
            }
            int var18;
            if ((var18 = this.field4743[var7]) < 0) {
                arg1[arg4++] = (byte) (~var18);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }
}
