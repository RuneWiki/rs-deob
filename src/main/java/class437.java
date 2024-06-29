import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class437 {

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "[I")
    private int[] field6381;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "[B")
    private byte[] field6379;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "[I")
    private int[] field6375;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public static int field6377 = -50;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "Lct;")
    public static class104 field6380;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "Lfc;")
    public static class199 field6371;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I[BIBI[B)I")
    public final int method2688(int arg0, byte[] arg1, int arg2, byte arg3, int arg4, byte[] arg5) {
        field6382++;
        int var7 = 0;
        int var8 = arg2 + arg4;
        int var9 = arg0 << 3;
        while (var8 > arg2) {
            int var11 = arg1[arg2] & 0xFF;
            int var12 = this.field6381[var11];
            byte var13 = this.field6379[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var9 >> 3;
            int var15 = var9 & 0x7;
            int var16 = var7 & -var15 >> 31;
            int var17 = var14 + (var13 + var15 - 1 >> 3);
            int var18 = var15 + 24;
            arg5[var14] = (byte) (var7 = class259.method1785(var16, var12 >>> var18));
            if (var14 < var17) {
                var15 = var18 - 8;
                var14++;
                arg5[var14] = (byte) (var7 = var12 >>> var15);
                if (var17 > var14) {
                    var14++;
                    var15 -= 8;
                    arg5[var14] = (byte) (var7 = var12 >>> var15);
                    if (var14 < var17) {
                        var14++;
                        var15 -= 8;
                        arg5[var14] = (byte) (var7 = var12 >>> var15);
                        if (var17 > var14) {
                            var15 -= 8;
                            var14++;
                            arg5[var14] = (byte) (var7 = var12 << -var15);
                        }
                    }
                }
            }
            var9 += var13;
            arg2++;
        }
        int var10 = 39 / ((arg3 + 13) / 57);
        return (var9 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)Lmd;")
    public static final class370 method2689(byte arg0, int arg1) {
        if (arg0 > -109) {
            method2689((byte) -21, -92);
        }
        field6372++;
        class370 var2 = (class370) class109.field1480.method2310((byte) -126, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class5.field86.method715(arg1, (byte) 70, 0);
        class370 var4 = new class370();
        if (var3 != null) {
            var4.method2357((byte) -101, new class256(var3));
        }
        var4.method2351(65389);
        class109.field1480.method2299(true, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "([BBIII[B)I")
    public final int method2690(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field6378++;
        if (arg3 == 0) {
            return 0;
        } else if (arg1 == 127) {
            int var7 = arg3 + arg4;
            int var8 = 0;
            int var9 = arg2;
            while (true) {
                byte var10 = arg5[var9];
                if (var10 >= 0) {
                    var8++;
                } else {
                    var8 = this.field6375[var8];
                }
                int var11;
                if ((var11 = this.field6375[var8]) < 0) {
                    arg0[arg4++] = (byte) (~var11);
                    if (var7 <= arg4) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x40) == 0) {
                    var8++;
                } else {
                    var8 = this.field6375[var8];
                }
                int var12;
                if ((var12 = this.field6375[var8]) < 0) {
                    arg0[arg4++] = (byte) (~var12);
                    if (var7 <= arg4) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x20) == 0) {
                    var8++;
                } else {
                    var8 = this.field6375[var8];
                }
                int var13;
                if ((var13 = this.field6375[var8]) < 0) {
                    arg0[arg4++] = (byte) (~var13);
                    if (arg4 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x10) == 0) {
                    var8++;
                } else {
                    var8 = this.field6375[var8];
                }
                int var14;
                if ((var14 = this.field6375[var8]) < 0) {
                    arg0[arg4++] = (byte) (~var14);
                    if (arg4 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x8) == 0) {
                    var8++;
                } else {
                    var8 = this.field6375[var8];
                }
                int var15;
                if ((var15 = this.field6375[var8]) < 0) {
                    arg0[arg4++] = (byte) (~var15);
                    if (arg4 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x4) == 0) {
                    var8++;
                } else {
                    var8 = this.field6375[var8];
                }
                int var16;
                if ((var16 = this.field6375[var8]) < 0) {
                    arg0[arg4++] = (byte) (~var16);
                    if (var7 <= arg4) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x2) == 0) {
                    var8++;
                } else {
                    var8 = this.field6375[var8];
                }
                int var17;
                if ((var17 = this.field6375[var8]) < 0) {
                    arg0[arg4++] = (byte) (~var17);
                    if (arg4 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x1) == 0) {
                    var8++;
                } else {
                    var8 = this.field6375[var8];
                }
                int var18;
                if ((var18 = this.field6375[var8]) < 0) {
                    arg0[arg4++] = (byte) (~var18);
                    if (arg4 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                var9++;
            }
            return var9 + 1 - arg2;
        } else {
            return -8;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public static final void method2691(int arg0) {
        if (class120.field1610 == 10) {
            client.method1796(28, 86);
        }
        field6374++;
        if (class120.field1610 == 30) {
            client.method1796(25, arg0 + 65);
        }
        if (arg0 != -1) {
            method2693(false, -25, -4, false, (byte) -61);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
    public static void method2692(byte arg0) {
        field6371 = null;
        field6380 = null;
        if (arg0 <= 93) {
            field6377 = -2;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZIIZB)I")
    public static final int method2693(boolean arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        field6376++;
        class243 var5 = class46.method378(arg1, arg3, false);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field3599.length; var7++) {
            if (var5.field3599[var7] >= 0 && var5.field3599[var7] < class157.field2119.field154) {
                class427 var8 = class157.field2119.method176((byte) -43, var5.field3599[var7]);
                int var9 = var8.method2627(class320.method2109(arg2, (byte) -108).field4270, arg4 + 137, arg2);
                if (arg0) {
                    var6 += var5.field3607[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        if (arg4 != -9) {
            field6371 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "([B)V")
    public class437(byte[] arg0) {
        int var2 = arg0.length;
        this.field6381 = new int[var2];
        this.field6379 = arg0;
        int[] var3 = new int[33];
        this.field6375 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field6381[var5] = var8;
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
                        var3[var10] = class259.method1785(var11, var12);
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
                        if (this.field6375[var14] == 0) {
                            this.field6375[var14] = var4;
                        }
                        var14 = this.field6375[var14];
                    }
                    if (this.field6375.length <= var14) {
                        int[] var17 = new int[this.field6375.length * 2];
                        for (int var18 = 0; var18 < this.field6375.length; var18++) {
                            var17[var18] = this.field6375[var18];
                        }
                        this.field6375 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field6375[var14] = ~var5;
            }
        }
    }
}
