import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class82 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "[I")
    private int[] field1206;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "[I")
    private int[] field1214;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "[B")
    private byte[] field1209;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lgi;")
    public static class310 field1205;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "[I")
    public static int[] field1212;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([BB[BIII)I", line = 5)
    public final int method630(byte[] arg0, byte arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field1211++;
        int var7 = -25 % ((-arg1 - 9) / 41);
        if (arg4 == 0) {
            return 0;
        }
        int var8 = arg4 + arg5;
        int var9 = 0;
        int var10 = arg3;
        while (true) {
            byte var11 = arg2[var10];
            if (var11 >= 0) {
                var9++;
            } else {
                var9 = this.field1206[var9];
            }
            int var12;
            if ((var12 = this.field1206[var9]) < 0) {
                arg0[arg5++] = (byte) (~var12);
                if (arg5 >= var8) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var9++;
            } else {
                var9 = this.field1206[var9];
            }
            int var13;
            if ((var13 = this.field1206[var9]) < 0) {
                arg0[arg5++] = (byte) (~var13);
                if (arg5 >= var8) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var9++;
            } else {
                var9 = this.field1206[var9];
            }
            int var14;
            if ((var14 = this.field1206[var9]) < 0) {
                arg0[arg5++] = (byte) (~var14);
                if (arg5 >= var8) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var9++;
            } else {
                var9 = this.field1206[var9];
            }
            int var15;
            if ((var15 = this.field1206[var9]) < 0) {
                arg0[arg5++] = (byte) (~var15);
                if (var8 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var9++;
            } else {
                var9 = this.field1206[var9];
            }
            int var16;
            if ((var16 = this.field1206[var9]) < 0) {
                arg0[arg5++] = (byte) (~var16);
                if (arg5 >= var8) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var9++;
            } else {
                var9 = this.field1206[var9];
            }
            int var17;
            if ((var17 = this.field1206[var9]) < 0) {
                arg0[arg5++] = (byte) (~var17);
                if (var8 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var9++;
            } else {
                var9 = this.field1206[var9];
            }
            int var18;
            if ((var18 = this.field1206[var9]) < 0) {
                arg0[arg5++] = (byte) (~var18);
                if (arg5 >= var8) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var9++;
            } else {
                var9 = this.field1206[var9];
            }
            int var19;
            if ((var19 = this.field1206[var9]) < 0) {
                arg0[arg5++] = (byte) (~var19);
                if (var8 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            var10++;
        }
        return var10 + 1 - arg3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V", line = 154)
    public static void method631(byte arg0) {
        field1212 = null;
        field1205 = null;
        if (arg0 != -20) {
            field1205 = (class310) null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[B[BBI)I", line = 173)
    public final int method632(int arg0, int arg1, byte[] arg2, byte[] arg3, byte arg4, int arg5) {
        int var7 = arg0 + arg1;
        int var8 = arg5 << 3;
        field1207++;
        int var9 = 0;
        if (arg4 < 114) {
            return -57;
        }
        while (arg1 < var7) {
            int var10 = arg3[arg1] & 0xFF;
            byte var11 = this.field1209[var10];
            int var12 = this.field1214[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var9 & -var14 >> 31;
            int var16 = var13 + (var11 + var14 - 1 >> 3);
            var8 += var11;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var9 = class261.method1835(var15, var12 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg2[var13] = (byte) (var9 = var12 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg2[var13] = (byte) (var9 = var12 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg2[var13] = (byte) (var9 = var12 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg2[var13] = (byte) (var9 = var12 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var8 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 245)
    public static final void method633(int arg0) {
        if (arg0 != -1) {
            field1205 = (class310) null;
        }
        field1213++;
        class298.field4586.method752(false);
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "([B)V", line = 258)
    public class82(byte[] arg0) {
        int var2 = arg0.length;
        this.field1206 = new int[8];
        this.field1214 = new int[var2];
        this.field1209 = arg0;
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1214[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class261.method1835(var10, var11);
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
                        if (this.field1206[var14] == 0) {
                            this.field1206[var14] = var4;
                        }
                        var14 = this.field1206[var14];
                    }
                    if (var14 >= this.field1206.length) {
                        int[] var17 = new int[this.field1206.length * 2];
                        for (int var18 = 0; var18 < this.field1206.length; var18++) {
                            var17[var18] = this.field1206[var18];
                        }
                        this.field1206 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field1206[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
