import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class279 {

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "[B")
    private byte[] field4929;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "[I")
    private int[] field4935;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "[I")
    private int[] field4931;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Leg;")
    public static class37 field4927 = class174.method1167("brillant1:", -118);

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field4933 = 0;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field4936 = 50;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Luh;")
    public static class59 field4928;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "[Lrk;")
    public static class14[] field4932;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[BI[BI)I")
    public final int method1876(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = arg3 + arg5;
        if (arg0 != 4732) {
            this.method1878(-16, 55, (byte[]) null, 40, (byte[]) null, -86);
        }
        int var8 = 0;
        field4934++;
        int var9 = arg1 << 3;
        while (var7 > arg5) {
            int var10 = arg2[arg5] & 0xFF;
            int var11 = this.field4935[var10];
            byte var12 = this.field4929[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var8 & -var14 >> 31;
            var9 += var12;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var8 = class94.method617(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg4[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg4[var13] = (byte) (var8 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg4[var13] = (byte) (var8 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg4[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var9 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method1877(int arg0) {
        field4928 = null;
        if (arg0 != 1) {
            method1877(-56);
        }
        field4927 = null;
        field4932 = null;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II[BI[BI)I")
    public final int method1878(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field4930++;
        if (arg5 == 0) {
            return 0;
        }
        if (arg1 != 27493) {
            this.method1878(-56, 116, (byte[]) null, 81, (byte[]) null, 7);
        }
        int var7 = arg0 + arg5;
        int var8 = 0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field4931[var8];
            }
            int var11;
            if ((var11 = this.field4931[var8]) < 0) {
                arg4[arg0++] = (byte) (~var11);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field4931[var8];
            }
            int var12;
            if ((var12 = this.field4931[var8]) < 0) {
                arg4[arg0++] = (byte) (~var12);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field4931[var8];
            }
            int var13;
            if ((var13 = this.field4931[var8]) < 0) {
                arg4[arg0++] = (byte) (~var13);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field4931[var8];
            }
            int var14;
            if ((var14 = this.field4931[var8]) < 0) {
                arg4[arg0++] = (byte) (~var14);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field4931[var8];
            }
            int var15;
            if ((var15 = this.field4931[var8]) < 0) {
                arg4[arg0++] = (byte) (~var15);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field4931[var8];
            }
            int var16;
            if ((var16 = this.field4931[var8]) < 0) {
                arg4[arg0++] = (byte) (~var16);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field4931[var8];
            }
            int var17;
            if ((var17 = this.field4931[var8]) < 0) {
                arg4[arg0++] = (byte) (~var17);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field4931[var8];
            }
            int var18;
            if ((var18 = this.field4931[var8]) < 0) {
                arg4[arg0++] = (byte) (~var18);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "([B)V")
    public class279(byte[] arg0) {
        int var2 = arg0.length;
        this.field4929 = arg0;
        this.field4935 = new int[var2];
        int[] var3 = new int[33];
        this.field4931 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4935[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var8 | var7;
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
                        var3[var10] = class94.method617(var11, var12);
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
                        if (this.field4931[var14] == 0) {
                            this.field4931[var14] = var4;
                        }
                        var14 = this.field4931[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field4931.length) {
                        int[] var18 = new int[this.field4931.length * 2];
                        for (int var19 = 0; var19 < this.field4931.length; var19++) {
                            var18[var19] = this.field4931[var19];
                        }
                        this.field4931 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field4931[var14] = ~var5;
            }
        }
    }
}
