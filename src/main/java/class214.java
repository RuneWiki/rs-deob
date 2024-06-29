import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class214 {

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "[I")
    private int[] field4037;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "[I")
    private int[] field4039;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "[B")
    private byte[] field4038;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "D")
    public static double field4043 = -1.0D;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "Li;")
    private static class88 field4044 = class208.method1425(105, "Loaded config");

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Li;")
    public static class88 field4042 = field4044;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Lmf;")
    public static class137 field4035;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILnb;I)Llj;")
    public static final class130 method1456(int arg0, int arg1, class144 arg2, int arg3) {
        field4036++;
        if (arg0 < 109) {
            return null;
        } else if (class47.method358(854010832, arg2, arg1, arg3)) {
            return class27.method170((byte) 125);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method1457(int arg0) {
        field4042 = null;
        field4044 = null;
        field4035 = null;
        if (arg0 > -60) {
            field4035 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([BIII[BZ)I")
    public final int method1458(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, boolean arg5) {
        field4041++;
        if (!arg5) {
            this.field4039 = null;
        }
        int var7 = 0;
        int var8 = arg2 + arg3;
        int var9 = arg1 << 3;
        while (arg3 < var8) {
            int var10 = arg0[arg3] & 0xFF;
            byte var11 = this.field4038[var10];
            int var12 = this.field4039[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var11;
            int var15 = var13 + (var14 + var11 - 1 >> 3);
            int var16 = var7 & -var14 >> 31;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var7 = class204.method1405(var16, var12 >>> var17));
            if (var15 > var13) {
                var13++;
                var14 = var17 - 8;
                arg4[var13] = (byte) (var7 = var12 >>> var14);
                if (var15 > var13) {
                    var14 -= 8;
                    var13++;
                    arg4[var13] = (byte) (var7 = var12 >>> var14);
                    if (var15 > var13) {
                        var13++;
                        var14 -= 8;
                        arg4[var13] = (byte) (var7 = var12 >>> var14);
                        if (var13 < var15) {
                            var14 -= 8;
                            var13++;
                            arg4[var13] = (byte) (var7 = var12 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var9 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "([B)V")
    public class214(byte[] arg0) {
        int var2 = arg0.length;
        this.field4037 = new int[8];
        this.field4039 = new int[var2];
        this.field4038 = arg0;
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4039[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
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
                        var3[var10] = class204.method1405(var12, var11);
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
                        if (this.field4037[var14] == 0) {
                            this.field4037[var14] = var4;
                        }
                        var14 = this.field4037[var14];
                    }
                    if (this.field4037.length <= var14) {
                        int[] var17 = new int[this.field4037.length * 2];
                        for (int var18 = 0; var18 < this.field4037.length; var18++) {
                            var17[var18] = this.field4037[var18];
                        }
                        this.field4037 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field4037[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II[B[BII)I")
    public final int method1459(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        field4040++;
        if (arg0 > -122) {
            return 45;
        } else if (arg4 == 0) {
            return 0;
        } else {
            int var7 = 0;
            int var8 = arg1 + arg4;
            int var9 = arg5;
            while (true) {
                byte var10 = arg3[var9];
                if (var10 >= 0) {
                    var7++;
                } else {
                    var7 = this.field4037[var7];
                }
                int var11;
                if ((var11 = this.field4037[var7]) < 0) {
                    arg2[arg1++] = (byte) ~var11;
                    if (var8 <= arg1) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x40) == 0) {
                    var7++;
                } else {
                    var7 = this.field4037[var7];
                }
                int var12;
                if ((var12 = this.field4037[var7]) < 0) {
                    arg2[arg1++] = (byte) ~var12;
                    if (var8 <= arg1) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x20) == 0) {
                    var7++;
                } else {
                    var7 = this.field4037[var7];
                }
                int var13;
                if ((var13 = this.field4037[var7]) < 0) {
                    arg2[arg1++] = (byte) ~var13;
                    if (var8 <= arg1) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x10) == 0) {
                    var7++;
                } else {
                    var7 = this.field4037[var7];
                }
                int var14;
                if ((var14 = this.field4037[var7]) < 0) {
                    arg2[arg1++] = (byte) ~var14;
                    if (arg1 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x8) == 0) {
                    var7++;
                } else {
                    var7 = this.field4037[var7];
                }
                int var15;
                if ((var15 = this.field4037[var7]) < 0) {
                    arg2[arg1++] = (byte) ~var15;
                    if (arg1 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x4) == 0) {
                    var7++;
                } else {
                    var7 = this.field4037[var7];
                }
                int var16;
                if ((var16 = this.field4037[var7]) < 0) {
                    arg2[arg1++] = (byte) ~var16;
                    if (arg1 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x2) == 0) {
                    var7++;
                } else {
                    var7 = this.field4037[var7];
                }
                int var17;
                if ((var17 = this.field4037[var7]) < 0) {
                    arg2[arg1++] = (byte) ~var17;
                    if (arg1 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x1) == 0) {
                    var7++;
                } else {
                    var7 = this.field4037[var7];
                }
                int var18;
                if ((var18 = this.field4037[var7]) < 0) {
                    arg2[arg1++] = (byte) ~var18;
                    if (var8 <= arg1) {
                        break;
                    }
                    var7 = 0;
                }
                var9++;
            }
            return var9 + 1 - arg5;
        }
    }
}
