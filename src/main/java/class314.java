import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class314 {

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "[I")
    private int[] field4870;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "[B")
    private byte[] field4868;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "[I")
    private int[] field4864;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field4863 = 0;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field4873 = 0;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Lta;")
    public static class197 field4862 = new class197(64);

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "Z")
    public static boolean field4875 = false;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field4865;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4866;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "[[[B")
    public static byte[][][] field4872;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "[[[Lp;")
    public static class99[][][] field4874;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([BIIII[B)I", line = 11)
    public final int method2163(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field4867++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg3 + arg4;
        int var8 = 0;
        int var9 = arg2;
        if (arg1 >= -25) {
            field4866 = (String[]) null;
        }
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var8 = this.field4864[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field4864[var8]) < 0) {
                arg0[arg3++] = (byte) (~var11);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field4864[var8];
            }
            int var12;
            if ((var12 = this.field4864[var8]) < 0) {
                arg0[arg3++] = (byte) (~var12);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field4864[var8];
            }
            int var13;
            if ((var13 = this.field4864[var8]) < 0) {
                arg0[arg3++] = (byte) (~var13);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field4864[var8];
            }
            int var14;
            if ((var14 = this.field4864[var8]) < 0) {
                arg0[arg3++] = (byte) (~var14);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field4864[var8];
            }
            int var15;
            if ((var15 = this.field4864[var8]) < 0) {
                arg0[arg3++] = (byte) (~var15);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field4864[var8];
            }
            int var16;
            if ((var16 = this.field4864[var8]) < 0) {
                arg0[arg3++] = (byte) (~var16);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field4864[var8];
            }
            int var17;
            if ((var17 = this.field4864[var8]) < 0) {
                arg0[arg3++] = (byte) (~var17);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field4864[var8];
            }
            int var18;
            if ((var18 = this.field4864[var8]) < 0) {
                arg0[arg3++] = (byte) (~var18);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 162)
    public static final void method2164(int arg0) {
        field4871++;
        class22.field242.method1428(10935);
        if (arg0 < 30) {
            field4873 = 115;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V", line = 175)
    public static void method2165(boolean arg0) {
        field4874 = (class99[][][]) null;
        field4866 = null;
        if (arg0) {
            field4865 = null;
            field4862 = null;
            field4872 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([BIII[BI)I", line = 190)
    public final int method2166(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = arg2 + arg5;
        if (arg3 != -13861) {
            return -32;
        }
        field4869++;
        int var8 = 0;
        int var9 = arg1 << 3;
        while (var7 > arg5) {
            int var10 = arg0[arg5] & 0xFF;
            int var11 = this.field4870[var10];
            byte var12 = this.field4868[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var13 + (var12 + var14 - 1 >> 3);
            int var16 = var8 & -var14 >> 31;
            var9 += var12;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var8 = class147.method1098(var16, var11 >>> var17));
            if (var15 > var13) {
                var13++;
                var14 = var17 - 8;
                arg4[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var15) {
                    var13++;
                    var14 -= 8;
                    arg4[var13] = (byte) (var8 = var11 >>> var14);
                    if (var13 < var15) {
                        var14 -= 8;
                        var13++;
                        arg4[var13] = (byte) (var8 = var11 >>> var14);
                        if (var13 < var15) {
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

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "([B)V", line = 265)
    public class314(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = 0;
        this.field4870 = new int[var2];
        this.field4868 = arg0;
        int[] var4 = new int[33];
        this.field4864 = new int[8];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field4870[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
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
                        var4[var10] = class147.method1098(var12, var11);
                    }
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
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field4864[var14] == 0) {
                            this.field4864[var14] = var3;
                        }
                        var14 = this.field4864[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field4864.length <= var14) {
                        int[] var18 = new int[this.field4864.length * 2];
                        for (int var19 = 0; var19 < this.field4864.length; var19++) {
                            var18[var19] = this.field4864[var19];
                        }
                        this.field4864 = var18;
                    }
                }
                this.field4864[var14] = ~var5;
                if (var14 >= var3) {
                    var3 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Lek;", line = 392)
    public static final class184 method2167(int arg0, int arg1, int arg2) {
        if (arg2 != -2421) {
            return (class184) null;
        }
        field4861++;
        class184 var3 = class100.method781((byte) 48, arg1);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field2946 == null || var3.field2946.length <= arg0) {
            return null;
        } else {
            return var3.field2946[arg0];
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILlb;Llb;)I", line = 414)
    public static final int method2168(int arg0, class211 arg1, class211 arg2) {
        field4860++;
        int var3 = arg0;
        if (arg1.method1531(92, class181.field2719)) {
            var3 = arg0 + 1;
        }
        if (arg1.method1531(124, class72.field1045)) {
            var3++;
        }
        if (arg1.method1531(80, class197.field3123)) {
            var3++;
        }
        if (arg2.method1531(92, class181.field2719)) {
            var3++;
        }
        if (arg2.method1531(arg0 ^ 0x63, class72.field1045)) {
            var3++;
        }
        if (arg2.method1531(89, class197.field3123)) {
            var3++;
        }
        return var3;
    }
}
