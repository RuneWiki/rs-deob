import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class180 {

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "[B")
    private byte[] field3440;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "[I")
    private int[] field3441;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "[I")
    private int[] field3447;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "Ljd;")
    public static class92 field3442 = class202.method1325((byte) 90, "<)4col>");

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Ljd;")
    public static class92 field3445 = class202.method1325((byte) 90, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Ljd;")
    public static class92 field3446 = class202.method1325((byte) 90, "null");

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "[I")
    public static int[] field3448 = new int[4000];

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "J")
    public static long field3443;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Z")
    public static final boolean method1179(int arg0, int arg1) {
        if (arg0 != 0) {
            field3445 = null;
        }
        field3437++;
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILnh;)V")
    public static final void method1180(int arg0, class133 arg1) {
        if (arg0 != 1468) {
            field3448 = null;
        }
        class152.field3016 = arg1;
        field3439++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([BII[BII)I")
    public final int method1181(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        int var7 = arg2 + arg5;
        field3438++;
        int var8 = 0;
        int var9 = arg4 << 3;
        if (arg1 >= -74) {
            this.method1184(null, (byte) -32, 95, -34, 71, null);
        }
        while (var7 > arg5) {
            int var10 = arg0[arg5] & 0xFF;
            int var11 = this.field3441[var10];
            byte var12 = this.field3440[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var8 = class67.method396(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg3[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg3[var13] = (byte) (var8 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg3[var13] = (byte) (var8 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg3[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static void method1182(int arg0) {
        field3446 = null;
        field3445 = null;
        field3442 = null;
        if (arg0 != 22968) {
            field3443 = -46L;
        }
        field3448 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1183(byte arg0, byte[] arg1) {
        if (arg0 >= -62) {
            return null;
        }
        field3449++;
        class70 var2 = new class70(arg1);
        int var3 = var2.method443(255);
        int var4 = var2.method453(126);
        if (var4 < 0 || class151.field2994 != 0 && class151.field2994 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method416(-2, var4, 0, var5);
            return var5;
        } else {
            int var6 = var2.method453(114);
            if (var6 < 0 || class151.field2994 != 0 && var6 > class151.field2994) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class78.method537(var7, var6, arg1, var4, 9);
            } else {
                class214.field4146.method1372((byte) -19, var7, var2);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([BBIII[B)I")
    public final int method1184(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field3444++;
        if (arg4 == 0) {
            return 0;
        }
        if (arg1 > -95) {
            method1180(-117, null);
        }
        int var7 = arg3 + arg4;
        int var8 = 0;
        int var9 = arg2;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var8 = this.field3447[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field3447[var8]) < 0) {
                arg0[arg3++] = (byte) ~var11;
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3447[var8];
            }
            int var12;
            if ((var12 = this.field3447[var8]) < 0) {
                arg0[arg3++] = (byte) ~var12;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3447[var8];
            }
            int var13;
            if ((var13 = this.field3447[var8]) < 0) {
                arg0[arg3++] = (byte) ~var13;
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3447[var8];
            }
            int var14;
            if ((var14 = this.field3447[var8]) < 0) {
                arg0[arg3++] = (byte) ~var14;
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3447[var8];
            }
            int var15;
            if ((var15 = this.field3447[var8]) < 0) {
                arg0[arg3++] = (byte) ~var15;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3447[var8];
            }
            int var16;
            if ((var16 = this.field3447[var8]) < 0) {
                arg0[arg3++] = (byte) ~var16;
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3447[var8];
            }
            int var17;
            if ((var17 = this.field3447[var8]) < 0) {
                arg0[arg3++] = (byte) ~var17;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3447[var8];
            }
            int var18;
            if ((var18 = this.field3447[var8]) < 0) {
                arg0[arg3++] = (byte) ~var18;
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "([B)V")
    public class180(byte[] arg0) {
        int var2 = arg0.length;
        this.field3440 = arg0;
        int var3 = 0;
        int[] var4 = new int[33];
        this.field3441 = new int[var2];
        this.field3447 = new int[8];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field3441[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var4[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var4[var9] = var4[var9 - 1];
                            break;
                        }
                        var4[var9] = class67.method396(var11, var10);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var4[var6 - 1];
                }
                var4[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field3447[var14] == 0) {
                            this.field3447[var14] = var3;
                        }
                        var14 = this.field3447[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field3447.length <= var14) {
                        int[] var18 = new int[this.field3447.length * 2];
                        for (int var19 = 0; var19 < this.field3447.length; var19++) {
                            var18[var19] = this.field3447[var19];
                        }
                        this.field3447 = var18;
                    }
                }
                this.field3447[var14] = ~var5;
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
            }
        }
    }
}
