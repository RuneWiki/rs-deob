import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class81 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "[I")
    private int[] field1249;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "[I")
    private int[] field1258;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "[B")
    private byte[] field1256;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "[J")
    public static long[] field1253 = new long[100];

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field1251 = 0;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "Lud;")
    public static class247 field1257;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "[I")
    public static int[] field1252;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III[B[BI)I")
    public final int method539(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        int var7 = arg0 + arg2;
        int var8 = 0;
        field1254++;
        int var9 = arg1 << 3;
        while (arg0 < var7) {
            int var10 = arg3[arg0] & 0xFF;
            byte var11 = this.field1256[var10];
            int var12 = this.field1249[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = (var14 + var11 - 1 >> 3) + var13;
            int var16 = var8 & -var14 >> 31;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var8 = class163.method1093(var16, var12 >>> var17));
            if (var15 > var13) {
                var13++;
                var14 = var17 - 8;
                arg4[var13] = (byte) (var8 = var12 >>> var14);
                if (var15 > var13) {
                    var13++;
                    var14 -= 8;
                    arg4[var13] = (byte) (var8 = var12 >>> var14);
                    if (var15 > var13) {
                        var14 -= 8;
                        var13++;
                        arg4[var13] = (byte) (var8 = var12 >>> var14);
                        if (var13 < var15) {
                            var13++;
                            var14 -= 8;
                            arg4[var13] = (byte) (var8 = var12 << -var14);
                        }
                    }
                }
            }
            var9 += var11;
            arg0++;
        }
        if (arg5 != 24826) {
            this.method541((byte[]) null, -112, (byte[]) null, (byte) 13, 45, 12);
        }
        return (var9 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
    public static void method540(boolean arg0) {
        field1253 = null;
        field1252 = null;
        field1257 = null;
        if (arg0) {
            field1252 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([BI[BBII)I")
    public final int method541(byte[] arg0, int arg1, byte[] arg2, byte arg3, int arg4, int arg5) {
        field1250++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg4 + arg5;
        int var8 = 103 % ((arg3 - 53) / 33);
        int var9 = 0;
        int var10 = arg1;
        while (true) {
            byte var11 = arg2[var10];
            if (var11 < 0) {
                var9 = this.field1258[var9];
            } else {
                var9++;
            }
            int var12;
            if ((var12 = this.field1258[var9]) < 0) {
                arg0[arg5++] = (byte) (~var12);
                if (var7 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var9++;
            } else {
                var9 = this.field1258[var9];
            }
            int var13;
            if ((var13 = this.field1258[var9]) < 0) {
                arg0[arg5++] = (byte) (~var13);
                if (var7 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var9++;
            } else {
                var9 = this.field1258[var9];
            }
            int var14;
            if ((var14 = this.field1258[var9]) < 0) {
                arg0[arg5++] = (byte) (~var14);
                if (var7 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var9++;
            } else {
                var9 = this.field1258[var9];
            }
            int var15;
            if ((var15 = this.field1258[var9]) < 0) {
                arg0[arg5++] = (byte) (~var15);
                if (var7 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var9++;
            } else {
                var9 = this.field1258[var9];
            }
            int var16;
            if ((var16 = this.field1258[var9]) < 0) {
                arg0[arg5++] = (byte) (~var16);
                if (var7 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var9++;
            } else {
                var9 = this.field1258[var9];
            }
            int var17;
            if ((var17 = this.field1258[var9]) < 0) {
                arg0[arg5++] = (byte) (~var17);
                if (var7 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var9++;
            } else {
                var9 = this.field1258[var9];
            }
            int var18;
            if ((var18 = this.field1258[var9]) < 0) {
                arg0[arg5++] = (byte) (~var18);
                if (arg5 >= var7) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var9++;
            } else {
                var9 = this.field1258[var9];
            }
            int var19;
            if ((var19 = this.field1258[var9]) < 0) {
                arg0[arg5++] = (byte) (~var19);
                if (var7 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            var10++;
        }
        return var10 + 1 - arg1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)I")
    public static final int method542(int arg0, int arg1, int arg2, int arg3) {
        field1259++;
        if (class107.field1556 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg3 >> 7;
        if (arg1 < ~var4 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2;
        if (arg2 < 3 && (class189.field2684[1][var4][var5] & 0x2) == 2) {
            var6 = arg2 + 1;
        }
        int var7 = arg0 & 0x7F;
        int var8 = arg3 & 0x7F;
        int var9 = (128 - var7) * class107.field1556[var6][var4][var5] + class107.field1556[var6][var4 + 1][var5] * var7 >> 7;
        int var10 = (128 - var7) * class107.field1556[var6][var4][var5 + 1] + (class107.field1556[var6][var4 + 1][var5 + 1] * var7) >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIII)V")
    public static final void method543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 284879873) {
            field1257 = null;
        }
        field1255++;
        if (class93.field1412 <= arg3 && class142.field2061 >= arg0 && class93.field1418 <= arg5 && arg4 <= class254.field3857) {
            class119.method817(arg2, (byte) -83, arg3, arg5, arg4, arg0);
        } else {
            class55.method370(0, arg0, arg4, arg3, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "([B)V")
    public class81(byte[] arg0) {
        int var2 = arg0.length;
        this.field1249 = new int[var2];
        this.field1258 = new int[8];
        this.field1256 = arg0;
        int var3 = 0;
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field1249[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class163.method1093(var12, var11);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field1258[var14] == 0) {
                            this.field1258[var14] = var3;
                        }
                        var14 = this.field1258[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field1258.length) {
                        int[] var18 = new int[this.field1258.length * 2];
                        for (int var19 = 0; var19 < this.field1258.length; var19++) {
                            var18[var19] = this.field1258[var19];
                        }
                        this.field1258 = var18;
                    }
                }
                if (var14 >= var3) {
                    var3 = var14 + 1;
                }
                this.field1258[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static final void method544(int arg0) {
        if (class136.field1967 < 0) {
            class12.field191 = -1;
            class136.field1967 = 0;
            class140.field2028 = -1;
        }
        if (class136.field1967 > class99.field1482) {
            class136.field1967 = class99.field1482;
            class12.field191 = -1;
            class140.field2028 = -1;
        }
        if (class286.field4544 < 0) {
            class286.field4544 = 0;
            class12.field191 = -1;
            class140.field2028 = -1;
        }
        if (class286.field4544 > class63.field1009) {
            class140.field2028 = -1;
            class12.field191 = -1;
            class286.field4544 = class63.field1009;
        }
        int var1 = 121 % ((arg0 + 30) / 54);
        field1260++;
    }
}
