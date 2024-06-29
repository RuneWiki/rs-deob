import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class167 {

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "[I")
    private int[] field3396;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "[I")
    private int[] field3395;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "[B")
    private byte[] field3389;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Z")
    public static boolean field3387 = true;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field3390 = 0;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Lrf;")
    private static class163 field3397 = class53.method392(-44, "Examine");

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Lrf;")
    public static class163 field3391 = field3397;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Lrf;")
    private static class163 field3388 = class53.method392(-120, "Select");

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Lrf;")
    public static class163 field3394 = field3388;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Lue;")
    public static class189 field3398;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "[I")
    public static int[] field3393;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lmh;)V")
    public static final void method1135(class121 arg0) {
        for (int var1 = arg0.field2544; var1 <= arg0.field2548; var1++) {
            for (int var2 = arg0.field2542; var2 <= arg0.field2535; var2++) {
                class111 var3 = class97.field2054[arg0.field2550][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2359; var4++) {
                        if (var3.field2344[var4] == arg0) {
                            var3.field2359--;
                            for (int var5 = var4; var5 < var3.field2359; var5++) {
                                var3.field2344[var5] = var3.field2344[var5 + 1];
                                var3.field2358[var5] = var3.field2358[var5 + 1];
                            }
                            var3.field2344[var3.field2359] = null;
                            break;
                        }
                    }
                    var3.field2351 = 0;
                    for (int var6 = 0; var6 < var3.field2359; var6++) {
                        var3.field2351 |= var3.field2358[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([BIII[BI)I")
    public final int method1136(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        if (arg1 != 32) {
            return 47;
        }
        field3392++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg2 + arg5;
        int var8 = 0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 < 0) {
                var8 = this.field3395[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field3395[var8]) < 0) {
                arg4[arg2++] = (byte) ~var11;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3395[var8];
            }
            int var12;
            if ((var12 = this.field3395[var8]) < 0) {
                arg4[arg2++] = (byte) ~var12;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3395[var8];
            }
            int var13;
            if ((var13 = this.field3395[var8]) < 0) {
                arg4[arg2++] = (byte) ~var13;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3395[var8];
            }
            int var14;
            if ((var14 = this.field3395[var8]) < 0) {
                arg4[arg2++] = (byte) ~var14;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3395[var8];
            }
            int var15;
            if ((var15 = this.field3395[var8]) < 0) {
                arg4[arg2++] = (byte) ~var15;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3395[var8];
            }
            int var16;
            if ((var16 = this.field3395[var8]) < 0) {
                arg4[arg2++] = (byte) ~var16;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3395[var8];
            }
            int var17;
            if ((var17 = this.field3395[var8]) < 0) {
                arg4[arg2++] = (byte) ~var17;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3395[var8];
            }
            int var18;
            if ((var18 = this.field3395[var8]) < 0) {
                arg4[arg2++] = (byte) ~var18;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method1137(int arg0) {
        field3398 = null;
        field3388 = null;
        field3391 = null;
        field3394 = null;
        field3397 = null;
        if (arg0 >= -52) {
            method1137(-57);
        }
        field3393 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([BIIBI[B)I")
    public final int method1138(byte[] arg0, int arg1, int arg2, byte arg3, int arg4, byte[] arg5) {
        field3385++;
        if (arg3 <= 52) {
            this.method1136(null, 82, -128, 64, null, 122);
        }
        int var7 = arg1 + arg4;
        int var8 = 0;
        int var9 = arg2 << 3;
        while (arg1 < var7) {
            int var10 = arg5[arg1] & 0xFF;
            int var11 = this.field3396[var10];
            byte var12 = this.field3389[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = var13 + (var12 + var14 - 1 >> 3);
            int var16 = var8 & -var14 >> 31;
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var8 = class150.method971(var16, var11 >>> var17));
            if (var15 > var13) {
                var14 = var17 - 8;
                var13++;
                arg0[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var15) {
                    var13++;
                    var14 -= 8;
                    arg0[var13] = (byte) (var8 = var11 >>> var14);
                    if (var15 > var13) {
                        var14 -= 8;
                        var13++;
                        arg0[var13] = (byte) (var8 = var11 >>> var14);
                        if (var15 > var13) {
                            var13++;
                            var14 -= 8;
                            arg0[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var9 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "([B)V")
    public class167(byte[] arg0) {
        int var2 = arg0.length;
        this.field3396 = new int[var2];
        int[] var3 = new int[33];
        this.field3395 = new int[8];
        int var4 = 0;
        this.field3389 = arg0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3396[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var3[var10] = class150.method971(var11, var12);
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
                        if (this.field3395[var14] == 0) {
                            this.field3395[var14] = var4;
                        }
                        var14 = this.field3395[var14];
                    }
                    if (var14 >= this.field3395.length) {
                        int[] var17 = new int[this.field3395.length * 2];
                        for (int var18 = 0; var18 < this.field3395.length; var18++) {
                            var17[var18] = this.field3395[var18];
                        }
                        this.field3395 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field3395[var14] = ~var5;
            }
        }
    }
}
