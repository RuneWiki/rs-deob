import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class61 {

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "[B")
    private byte[] field1056;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "[I")
    private int[] field1058;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "[I")
    private int[] field1050;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Z")
    public static boolean field1057 = false;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ltn;BI)I")
    public static final int method543(class58 arg0, byte arg1, int arg2) {
        field1055++;
        if (arg1 != -2) {
            return -96;
        } else if (!client.method1349(arg0).method782(arg2, 0) && arg0.field880 == null) {
            return -1;
        } else if (arg0.field874 == null || arg0.field874.length <= arg2) {
            return -1;
        } else {
            return arg0.field874[arg2];
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)B")
    public static final byte method544(int arg0, int arg1, int arg2) {
        field1059++;
        if (arg1 > -75) {
            return -14;
        } else if (arg0 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([B[BIIII)I")
    public final int method545(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field1052++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg2 + arg4;
        int var8 = 0;
        if (arg5 != -1) {
            return -116;
        }
        int var9 = arg3;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field1050[var8];
            }
            int var11;
            if ((var11 = this.field1050[var8]) < 0) {
                arg1[arg2++] = (byte) (~var11);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1050[var8];
            }
            int var12;
            if ((var12 = this.field1050[var8]) < 0) {
                arg1[arg2++] = (byte) (~var12);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1050[var8];
            }
            int var13;
            if ((var13 = this.field1050[var8]) < 0) {
                arg1[arg2++] = (byte) (~var13);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1050[var8];
            }
            int var14;
            if ((var14 = this.field1050[var8]) < 0) {
                arg1[arg2++] = (byte) (~var14);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1050[var8];
            }
            int var15;
            if ((var15 = this.field1050[var8]) < 0) {
                arg1[arg2++] = (byte) (~var15);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1050[var8];
            }
            int var16;
            if ((var16 = this.field1050[var8]) < 0) {
                arg1[arg2++] = (byte) (~var16);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1050[var8];
            }
            int var17;
            if ((var17 = this.field1050[var8]) < 0) {
                arg1[arg2++] = (byte) (~var17);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1050[var8];
            }
            int var18;
            if ((var18 = this.field1050[var8]) < 0) {
                arg1[arg2++] = (byte) (~var18);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static final void method546(int arg0) {
        field1053++;
        class524.field7704 = 0;
        int var1 = (class95.field1558.field5529 >> 7) + class483.field7082;
        int var2 = (class95.field1558.field5539 >> 7) + class465.field6840;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class524.field7704 = 1;
        }
        if (arg0 != -17909) {
            method546(75);
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class524.field7704 = 1;
        }
        if (class524.field7704 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class524.field7704 = 0;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z[BII[BI)I")
    public final int method547(boolean arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        if (!arg0) {
            this.field1058 = null;
        }
        field1054++;
        int var7 = 0;
        int var8 = arg5 << 3;
        int var9 = arg2 + arg3;
        while (var9 > arg2) {
            int var10 = arg1[arg2] & 0xFF;
            int var11 = this.field1058[var10];
            byte var12 = this.field1056[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var8 += var12;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var7 = class29.method239(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg4[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg4[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg4[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg4[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg2++;
        }
        return (var8 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "([B)V")
    public class61(byte[] arg0) {
        int var2 = arg0.length;
        this.field1056 = arg0;
        this.field1058 = new int[var2];
        int[] var3 = new int[33];
        this.field1050 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1058[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
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
                        var3[var10] = class29.method239(var12, var11);
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
                        if (this.field1050[var14] == 0) {
                            this.field1050[var14] = var4;
                        }
                        var14 = this.field1050[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field1050.length) {
                        int[] var18 = new int[this.field1050.length * 2];
                        for (int var19 = 0; var19 < this.field1050.length; var19++) {
                            var18[var19] = this.field1050[var19];
                        }
                        this.field1050 = var18;
                    }
                }
                this.field1050[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
