import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class180 {

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "[I")
    private int[] field2974;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "[I")
    private int[] field2977;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "[B")
    private byte[] field2973;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "J")
    public static long field2975 = 0L;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[S[Ljava/lang/String;II)V")
    public static final void method1262(int arg0, short[] arg1, String[] arg2, int arg3, int arg4) {
        field2968++;
        if (arg0 != 893325155) {
            method1267(-128, 45, 16, -64, (byte) 76);
        }
        if (arg3 <= arg4) {
            return;
        }
        int var5 = (arg4 + arg3) / 2;
        String var6 = arg2[var5];
        arg2[var5] = arg2[arg3];
        int var7 = arg4;
        arg2[arg3] = var6;
        short var8 = arg1[var5];
        arg1[var5] = arg1[arg3];
        arg1[arg3] = var8;
        for (int var9 = arg4; var9 < arg3; var9++) {
            if (var6 == null || arg2[var9] != null && arg2[var9].compareTo(var6) < (var9 & 0x1)) {
                String var10 = arg2[var9];
                arg2[var9] = arg2[var7];
                arg2[var7] = var10;
                short var11 = arg1[var9];
                arg1[var9] = arg1[var7];
                arg1[var7++] = var11;
            }
        }
        arg2[arg3] = arg2[var7];
        arg2[var7] = var6;
        arg1[arg3] = arg1[var7];
        arg1[var7] = var8;
        method1262(893325155, arg1, arg2, var7 - 1, arg4);
        method1262(arg0, arg1, arg2, arg3, var7 + 1);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[BI[BII)I")
    public final int method1263(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        int var7 = -88 / ((-arg4 - 35) / 55);
        int var8 = arg0 + arg5;
        field2972++;
        int var9 = 0;
        int var10 = arg2 << 3;
        while (arg5 < var8) {
            int var11 = arg1[arg5] & 0xFF;
            int var12 = this.field2974[var11];
            byte var13 = this.field2973[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var10 & 0x7;
            int var15 = var10 >> 3;
            var10 += var13;
            int var16 = var9 & -var14 >> 31;
            int var17 = (var14 + var13 - 1 >> 3) + var15;
            int var18 = var14 + 24;
            arg3[var15] = (byte) (var9 = class76.method555(var16, var12 >>> var18));
            if (var15 < var17) {
                var14 = var18 - 8;
                var15++;
                arg3[var15] = (byte) (var9 = var12 >>> var14);
                if (var17 > var15) {
                    var14 -= 8;
                    var15++;
                    arg3[var15] = (byte) (var9 = var12 >>> var14);
                    if (var15 < var17) {
                        var14 -= 8;
                        var15++;
                        arg3[var15] = (byte) (var9 = var12 >>> var14);
                        if (var17 > var15) {
                            var15++;
                            var14 -= 8;
                            arg3[var15] = (byte) (var9 = var12 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var10 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[BII[BI)I")
    public final int method1264(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field2978++;
        if (~arg0 == arg5) {
            return 0;
        }
        int var7 = arg0 + arg3;
        int var8 = 0;
        int var9 = arg2;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 < 0) {
                var8 = this.field2977[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field2977[var8]) < 0) {
                arg1[arg3++] = (byte) (~var11);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field2977[var8];
            }
            int var12;
            if ((var12 = this.field2977[var8]) < 0) {
                arg1[arg3++] = (byte) (~var12);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field2977[var8];
            }
            int var13;
            if ((var13 = this.field2977[var8]) < 0) {
                arg1[arg3++] = (byte) (~var13);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field2977[var8];
            }
            int var14;
            if ((var14 = this.field2977[var8]) < 0) {
                arg1[arg3++] = (byte) (~var14);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field2977[var8];
            }
            int var15;
            if ((var15 = this.field2977[var8]) < 0) {
                arg1[arg3++] = (byte) (~var15);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field2977[var8];
            }
            int var16;
            if ((var16 = this.field2977[var8]) < 0) {
                arg1[arg3++] = (byte) (~var16);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field2977[var8];
            }
            int var17;
            if ((var17 = this.field2977[var8]) < 0) {
                arg1[arg3++] = (byte) (~var17);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field2977[var8];
            }
            int var18;
            if ((var18 = this.field2977[var8]) < 0) {
                arg1[arg3++] = (byte) (~var18);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static final void method1265(int arg0) {
        class211.field3364 = null;
        if (arg0 <= 3) {
            field2976 = 108;
        }
        class140.field2284 = null;
        class217.field3413 = null;
        field2970++;
        class80.field1286 = null;
        class310.field5024 = null;
        class232.field3635 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)J")
    public static final long method1266(int arg0, int arg1, int arg2) {
        class116 var3 = class307.field4991[arg0][arg1][arg2];
        return var3 == null || var3.field1775 == null ? 0L : var3.field1775.field2230;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIB)V")
    public static final void method1267(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 48) {
            return;
        }
        field2971++;
        class291 var5 = class61.method389(arg1, 8, arg4 ^ 0x30);
        var5.method2009(-84);
        var5.field4768 = arg2;
        var5.field4773 = arg3;
        var5.field4763 = arg0;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "([B)V")
    public class180(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = arg0.length;
        this.field2974 = new int[var3];
        this.field2977 = new int[8];
        this.field2973 = arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field2974[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var2[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var2[var10] = var2[var10 - 1];
                            break;
                        }
                        var2[var10] = class76.method555(var12, var11);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var2[var6 - 1];
                }
                var2[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field2977[var14] == 0) {
                            this.field2977[var14] = var4;
                        }
                        var14 = this.field2977[var14];
                    }
                    if (this.field2977.length <= var14) {
                        int[] var17 = new int[this.field2977.length * 2];
                        for (int var18 = 0; var18 < this.field2977.length; var18++) {
                            var17[var18] = this.field2977[var18];
                        }
                        this.field2977 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field2977[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
