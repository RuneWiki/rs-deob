import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class24 {

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "[B")
    private byte[] field364;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "[I")
    private int[] field367;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "[I")
    private int[] field369;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "Lsf;")
    public static class108 field371 = class140.method973(255, "welle:");

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "Lsf;")
    private static class108 field372 = class140.method973(255, "flash2:");

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "Lsf;")
    public static class108 field368 = field372;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Lsf;")
    public static class108 field373 = field372;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "[I")
    public static int[] field365;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 4)
    public static void method163(int arg0) {
        field372 = null;
        if (arg0 != 17617) {
            method163(-106);
        }
        field368 = null;
        field371 = null;
        field365 = null;
        field373 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([BI[BIII)I", line = 22)
    public final int method164(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        int var7 = -61 % ((-arg5 - 7) / 45);
        field370++;
        int var8 = arg4 << 3;
        int var9 = 0;
        int var10 = arg1 + arg3;
        while (arg1 < var10) {
            int var11 = arg2[arg1] & 0xFF;
            byte var12 = this.field364[var11];
            int var13 = this.field367[var11];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var8 & 0x7;
            int var15 = var8 >> 3;
            int var16 = (var14 + var12 - 1 >> 3) + var15;
            int var17 = var9 & -var14 >> 31;
            int var18 = var14 + 24;
            arg0[var15] = (byte) (var9 = class242.method1674(var17, var13 >>> var18));
            if (var16 > var15) {
                var14 = var18 - 8;
                var15++;
                arg0[var15] = (byte) (var9 = var13 >>> var14);
                if (var15 < var16) {
                    var14 -= 8;
                    var15++;
                    arg0[var15] = (byte) (var9 = var13 >>> var14);
                    if (var15 < var16) {
                        var14 -= 8;
                        var15++;
                        arg0[var15] = (byte) (var9 = var13 >>> var14);
                        if (var16 > var15) {
                            var14 -= 8;
                            var15++;
                            arg0[var15] = (byte) (var9 = var13 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg1++;
        }
        return (var8 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([BIII[BI)I", line = 104)
    public final int method165(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field366++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = arg2 + arg3;
        int var8 = -7 % ((-arg5 - 64) / 60);
        int var9 = 0;
        int var10 = arg1;
        while (true) {
            byte var11 = arg4[var10];
            if (var11 < 0) {
                var9 = this.field369[var9];
            } else {
                var9++;
            }
            int var12;
            if ((var12 = this.field369[var9]) < 0) {
                arg0[arg3++] = (byte) (~var12);
                if (arg3 >= var7) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var9++;
            } else {
                var9 = this.field369[var9];
            }
            int var13;
            if ((var13 = this.field369[var9]) < 0) {
                arg0[arg3++] = (byte) (~var13);
                if (arg3 >= var7) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var9++;
            } else {
                var9 = this.field369[var9];
            }
            int var14;
            if ((var14 = this.field369[var9]) < 0) {
                arg0[arg3++] = (byte) (~var14);
                if (arg3 >= var7) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var9++;
            } else {
                var9 = this.field369[var9];
            }
            int var15;
            if ((var15 = this.field369[var9]) < 0) {
                arg0[arg3++] = (byte) (~var15);
                if (var7 <= arg3) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var9++;
            } else {
                var9 = this.field369[var9];
            }
            int var16;
            if ((var16 = this.field369[var9]) < 0) {
                arg0[arg3++] = (byte) (~var16);
                if (var7 <= arg3) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var9++;
            } else {
                var9 = this.field369[var9];
            }
            int var17;
            if ((var17 = this.field369[var9]) < 0) {
                arg0[arg3++] = (byte) (~var17);
                if (var7 <= arg3) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var9++;
            } else {
                var9 = this.field369[var9];
            }
            int var18;
            if ((var18 = this.field369[var9]) < 0) {
                arg0[arg3++] = (byte) (~var18);
                if (var7 <= arg3) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var9++;
            } else {
                var9 = this.field369[var9];
            }
            int var19;
            if ((var19 = this.field369[var9]) < 0) {
                arg0[arg3++] = (byte) (~var19);
                if (var7 <= arg3) {
                    break;
                }
                var9 = 0;
            }
            var10++;
        }
        return var10 - (arg1 - 1);
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "([B)V", line = 262)
    public class24(byte[] arg0) {
        int var2 = arg0.length;
        this.field364 = arg0;
        this.field367 = new int[var2];
        int[] var3 = new int[33];
        this.field369 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field367[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class242.method1674(var11, var10);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field369[var14] == 0) {
                            this.field369[var14] = var4;
                        }
                        var14 = this.field369[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field369.length <= var14) {
                        int[] var18 = new int[this.field369.length * 2];
                        for (int var19 = 0; var19 < this.field369.length; var19++) {
                            var18[var19] = this.field369[var19];
                        }
                        this.field369 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field369[var14] = ~var5;
            }
        }
    }
}
