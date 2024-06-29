import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class360 {

    @OriginalMember(owner = "client!me", name = "g", descriptor = "[I")
    private int[] field5104;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "[B")
    private byte[] field5103;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "[I")
    private int[] field5101;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "[I")
    public static int[] field5102 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ltq;I)V")
    public static final void method2201(class250 arg0, int arg1) {
        field5099++;
        byte[] var2 = new byte[24];
        if (class435.field6364 != null) {
            try {
                class435.field6364.method2381(23397, 0L);
                class435.field6364.method2373(false, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1368(24, -2008, 0, var2);
        int var5 = -45 / ((arg1 - 1) / 37);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lvm;IIIILds;)V")
    public static final void method2202(class322 arg0, int arg1, int arg2, int arg3, int arg4, class225 arg5) {
        field5106++;
        class339 var6 = class315.method1827(arg5.field2986, (byte) 125);
        if (var6.field4527 == -1) {
            return;
        }
        int var7;
        if (arg5.field3046) {
            int var8 = arg5.field3026 + arg2;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class20 var9 = var6.method1979(var7, arg5.field3030, arg0, (byte) 106);
        if (var9 == null) {
            return;
        }
        int var10 = arg5.field2995;
        int var11 = arg5.field3019;
        if ((arg4 & var7) == 1) {
            var10 = arg5.field3019;
            var11 = arg5.field2995;
        }
        int var12 = var9.method101();
        int var13 = var9.method109();
        if (var6.field4518) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field4525 == 0) {
            var9.method106(arg1, arg3 - (var11 * 4 - 4), var12, var13);
        } else {
            var9.method110(arg1, arg3 + 4 - (var11 * 4), var12, var13, 1, var6.field4525 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([BIIII[B)I")
    public final int method2203(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field5098++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg2 + arg4;
        int var9 = arg1;
        if (arg3 != 12077) {
            this.method2203((byte[]) null, -6, 4, -27, 93, (byte[]) null);
        }
        while (true) {
            byte var10 = arg0[var9];
            if (var10 < 0) {
                var7 = this.field5101[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field5101[var7]) < 0) {
                arg5[arg2++] = (byte) (~var11);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field5101[var7];
            }
            int var12;
            if ((var12 = this.field5101[var7]) < 0) {
                arg5[arg2++] = (byte) (~var12);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field5101[var7];
            }
            int var13;
            if ((var13 = this.field5101[var7]) < 0) {
                arg5[arg2++] = (byte) (~var13);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field5101[var7];
            }
            int var14;
            if ((var14 = this.field5101[var7]) < 0) {
                arg5[arg2++] = (byte) (~var14);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field5101[var7];
            }
            int var15;
            if ((var15 = this.field5101[var7]) < 0) {
                arg5[arg2++] = (byte) (~var15);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field5101[var7];
            }
            int var16;
            if ((var16 = this.field5101[var7]) < 0) {
                arg5[arg2++] = (byte) (~var16);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field5101[var7];
            }
            int var17;
            if ((var17 = this.field5101[var7]) < 0) {
                arg5[arg2++] = (byte) (~var17);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field5101[var7];
            }
            int var18;
            if ((var18 = this.field5101[var7]) < 0) {
                arg5[arg2++] = (byte) (~var18);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static final void method2204(int arg0) {
        if (arg0 != 0) {
            field5102 = null;
        }
        field5107++;
        class55 var1 = null;
        try {
            class304 var2 = class159.field2055.method2779(12178);
            while (var2.field4123 == 0) {
                class370.method2235(1L, 10);
            }
            if (var2.field4123 == 1) {
                var1 = (class55) var2.field4126;
                class250 var3 = new class250((class374.field5259 * 6) + 3);
                var3.method1386(arg0 ^ 0xF2B7B8D0, 1);
                var3.method1346(arg0 + 117, class374.field5259);
                for (int var4 = 0; var4 < class142.field1810.length; var4++) {
                    if (class279.field3799[var4]) {
                        var3.method1346(121, var4);
                        var3.method1357(class142.field1810[var4], arg0 ^ 0x6CE35638);
                    }
                }
                var1.method282(0, var3.field3389, var3.field3406, -77);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method285(0);
            }
        } catch (Exception var5) {
        }
        class128.field1650 = class442.method2730(25207);
        class293.field3988 = false;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "([B)V")
    public class360(byte[] arg0) {
        int var2 = arg0.length;
        this.field5104 = new int[var2];
        this.field5103 = arg0;
        int[] var3 = new int[33];
        this.field5101 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field5104[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var3[var10] = class392.method2441(var12, var11);
                    }
                    var9 = var7 | var8;
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
                        if (this.field5101[var14] == 0) {
                            this.field5101[var14] = var4;
                        }
                        var14 = this.field5101[var14];
                    }
                    if (this.field5101.length <= var14) {
                        int[] var17 = new int[this.field5101.length * 2];
                        for (int var18 = 0; var18 < this.field5101.length; var18++) {
                            var17[var18] = this.field5101[var18];
                        }
                        this.field5101 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field5101[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIZ[B[BI)I")
    public final int method2205(int arg0, int arg1, boolean arg2, byte[] arg3, byte[] arg4, int arg5) {
        field5100++;
        int var7 = 0;
        int var8 = arg5 << 3;
        int var9 = arg0 + arg1;
        if (!arg2) {
            return -63;
        }
        while (var9 > arg1) {
            int var10 = arg4[arg1] & 0xFF;
            int var11 = this.field5104[var10];
            byte var12 = this.field5103[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var14 + var12 - 1 >> 3);
            var8 += var12;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var7 = class392.method2441(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg3[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg3[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg3[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg3[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var8 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public static void method2206(byte arg0) {
        field5102 = null;
        if (arg0 >= -86) {
            method2206((byte) -119);
        }
    }
}
