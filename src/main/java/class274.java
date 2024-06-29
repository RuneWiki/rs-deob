import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class274 {

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "[B")
    private byte[] field4300;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "[I")
    private int[] field4302;

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "[I")
    private int[] field4305;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
    public static int field4301 = 2;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "Lum;")
    public static class83 field4307;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4303;

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "[Lya;")
    public static class11[] field4306;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I[BII[BI)I")
    public final int method1873(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field4299++;
        if (~arg3 == arg2) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg0 + arg3;
        int var9 = arg5;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field4305[var7];
            }
            int var11;
            if ((var11 = this.field4305[var7]) < 0) {
                arg4[arg0++] = (byte) (~var11);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field4305[var7];
            }
            int var12;
            if ((var12 = this.field4305[var7]) < 0) {
                arg4[arg0++] = (byte) (~var12);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field4305[var7];
            }
            int var13;
            if ((var13 = this.field4305[var7]) < 0) {
                arg4[arg0++] = (byte) (~var13);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field4305[var7];
            }
            int var14;
            if ((var14 = this.field4305[var7]) < 0) {
                arg4[arg0++] = (byte) (~var14);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field4305[var7];
            }
            int var15;
            if ((var15 = this.field4305[var7]) < 0) {
                arg4[arg0++] = (byte) (~var15);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field4305[var7];
            }
            int var16;
            if ((var16 = this.field4305[var7]) < 0) {
                arg4[arg0++] = (byte) (~var16);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field4305[var7];
            }
            int var17;
            if ((var17 = this.field4305[var7]) < 0) {
                arg4[arg0++] = (byte) (~var17);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field4305[var7];
            }
            int var18;
            if ((var18 = this.field4305[var7]) < 0) {
                arg4[arg0++] = (byte) (~var18);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 - (arg5 - 1);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(II[BI[BI)I")
    public final int method1874(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field4308++;
        int var7 = arg1;
        int var8 = arg0 + arg5;
        int var9 = arg3 << 3;
        while (arg0 < var8) {
            int var10 = arg4[arg0] & 0xFF;
            int var11 = this.field4302[var10];
            byte var12 = this.field4300[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var9 += var12;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var7 = class19.method118(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg2[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg2[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg2[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg2[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILum;)I")
    public static final int method1875(int arg0, class83 arg1) {
        int var2 = -77 / ((arg0 - 72) / 43);
        field4304++;
        int var3 = 0;
        if (arg1.method739((byte) -52, class444.field6614)) {
            var3++;
        }
        if (arg1.method739((byte) -109, class264.field4223)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Z)V")
    public static void method1876(boolean arg0) {
        field4303 = null;
        field4307 = null;
        field4306 = null;
        if (!arg0) {
            field4307 = null;
        }
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "([B)V")
    public class274(byte[] arg0) {
        int var2 = arg0.length;
        this.field4300 = arg0;
        this.field4302 = new int[var2];
        int[] var3 = new int[33];
        this.field4305 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4302[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
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
                        var3[var9] = class19.method118(var10, var11);
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
                        if (this.field4305[var14] == 0) {
                            this.field4305[var14] = var4;
                        }
                        var14 = this.field4305[var14];
                    }
                    if (this.field4305.length <= var14) {
                        int[] var17 = new int[this.field4305.length * 2];
                        for (int var18 = 0; var18 < this.field4305.length; var18++) {
                            var17[var18] = this.field4305[var18];
                        }
                        this.field4305 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field4305[var14] = ~var5;
            }
        }
    }
}
