import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class505 {

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "[I")
    private int[] field7706;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "[B")
    private byte[] field7708;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "[I")
    private int[] field7703;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "Liu;")
    public static class390 field7705 = new class390(107, 11);

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "[I")
    public static int[] field7712 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "I")
    public static int field7710;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "Ljava/lang/Object;")
    public static Object field7707;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "[B")
    public static byte[] field7702;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V", line = 4)
    public static void method3035(int arg0) {
        field7707 = null;
        field7712 = null;
        field7702 = null;
        if (arg0 == 28875) {
            field7705 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II[BI[BI)I", line = 17)
    public final int method3036(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field7710++;
        int var7 = 0;
        int var8 = arg5 << 3;
        if (arg3 != 19790) {
            return -3;
        }
        int var9 = arg0 + arg1;
        while (arg0 < var9) {
            int var10 = arg4[arg0] & 0xFF;
            int var11 = this.field7706[var10];
            byte var12 = this.field7708[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var8 += var12;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var7 = class51.method379(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg2[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg2[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg2[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg2[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var8 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "([BB[BIII)I", line = 90)
    public final int method3037(byte[] arg0, byte arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field7701++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg3 + arg5;
        int var8 = 0;
        int var9 = arg4;
        if (arg1 != -37) {
            return 102;
        }
        while (true) {
            byte var10 = arg2[var9];
            if (var10 < 0) {
                var8 = this.field7703[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field7703[var8]) < 0) {
                arg0[arg5++] = (byte) (~var11);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field7703[var8];
            }
            int var12;
            if ((var12 = this.field7703[var8]) < 0) {
                arg0[arg5++] = (byte) (~var12);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field7703[var8];
            }
            int var13;
            if ((var13 = this.field7703[var8]) < 0) {
                arg0[arg5++] = (byte) (~var13);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field7703[var8];
            }
            int var14;
            if ((var14 = this.field7703[var8]) < 0) {
                arg0[arg5++] = (byte) (~var14);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field7703[var8];
            }
            int var15;
            if ((var15 = this.field7703[var8]) < 0) {
                arg0[arg5++] = (byte) (~var15);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field7703[var8];
            }
            int var16;
            if ((var16 = this.field7703[var8]) < 0) {
                arg0[arg5++] = (byte) (~var16);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field7703[var8];
            }
            int var17;
            if ((var17 = this.field7703[var8]) < 0) {
                arg0[arg5++] = (byte) (~var17);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field7703[var8];
            }
            int var18;
            if ((var18 = this.field7703[var8]) < 0) {
                arg0[arg5++] = (byte) (~var18);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)Lqs;", line = 242)
    public static final class410 method3038(byte arg0) {
        field7713++;
        if (class249.field3582 == null || class282.field4025 == null) {
            return null;
        }
        class282.field4025.method1320(-45, class249.field3582);
        if (arg0 <= 24) {
            field7702 = null;
        }
        class410 var1 = (class410) class282.field4025.method1317((byte) -125);
        if (var1 == null) {
            return null;
        } else {
            class170 var2 = class249.field3573.method282(var1.field6017, 90);
            return var2 != null && var2.field2256 && var2.method1076(0, class249.field3571) ? var1 : class508.method3059((byte) 86);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILjava/lang/String;)V", line = 277)
    public static final void method3039(int arg0, String arg1) {
        field7709++;
        if (arg1.equals("")) {
            return;
        }
        class252.field3648++;
        int var2 = -102 % ((70 - arg0) / 49);
        class386.method2321(true, class96.field1285);
        class79.field1108.method947(-93, class100.method604((byte) 124, arg1));
        class79.field1108.method956(true, arg1);
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "([B)V", line = 300)
    public class505(byte[] arg0) {
        int var2 = arg0.length;
        this.field7706 = new int[var2];
        this.field7708 = arg0;
        this.field7703 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field7706[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
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
                        var3[var10] = class51.method379(var11, var12);
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
                        if (this.field7703[var14] == 0) {
                            this.field7703[var14] = var4;
                        }
                        var14 = this.field7703[var14];
                    }
                    if (this.field7703.length <= var14) {
                        int[] var17 = new int[this.field7703.length * 2];
                        for (int var18 = 0; var18 < this.field7703.length; var18++) {
                            var17[var18] = this.field7703[var18];
                        }
                        this.field7703 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field7703[var14] = ~var5;
            }
        }
    }
}
