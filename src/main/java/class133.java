import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class133 {

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "[B")
    private byte[] field1687;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "[I")
    private int[] field1683;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "[I")
    private int[] field1690;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    public static int field1688 = -1;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIII[B[B)I")
    public final int method866(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        field1689++;
        if (arg3 != 2068802211) {
            this.field1683 = null;
        }
        int var7 = 0;
        int var8 = arg0 + arg1;
        int var9 = arg2 << 3;
        while (var8 > arg0) {
            int var10 = arg4[arg0] & 0xFF;
            int var11 = this.field1683[var10];
            byte var12 = this.field1687[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            var9 += var12;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var7 = class288.method1722(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg5[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg5[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg5[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg5[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var9 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(III[B[BI)I")
    public final int method867(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        field1686++;
        if (arg5 == 0) {
            return 0;
        }
        if (arg2 != 4880) {
            this.field1683 = null;
        }
        int var7 = 0;
        int var8 = arg0 + arg5;
        int var9 = arg1;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 < 0) {
                var7 = this.field1690[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field1690[var7]) < 0) {
                arg4[arg0++] = (byte) (~var11);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field1690[var7];
            }
            int var12;
            if ((var12 = this.field1690[var7]) < 0) {
                arg4[arg0++] = (byte) (~var12);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field1690[var7];
            }
            int var13;
            if ((var13 = this.field1690[var7]) < 0) {
                arg4[arg0++] = (byte) (~var13);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field1690[var7];
            }
            int var14;
            if ((var14 = this.field1690[var7]) < 0) {
                arg4[arg0++] = (byte) (~var14);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field1690[var7];
            }
            int var15;
            if ((var15 = this.field1690[var7]) < 0) {
                arg4[arg0++] = (byte) (~var15);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field1690[var7];
            }
            int var16;
            if ((var16 = this.field1690[var7]) < 0) {
                arg4[arg0++] = (byte) (~var16);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field1690[var7];
            }
            int var17;
            if ((var17 = this.field1690[var7]) < 0) {
                arg4[arg0++] = (byte) (~var17);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field1690[var7];
            }
            int var18;
            if ((var18 = this.field1690[var7]) < 0) {
                arg4[arg0++] = (byte) (~var18);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)V")
    public static final void method868(int arg0, int arg1) {
        field1685++;
        class19 var2 = class364.method2236(1248116640, arg1, 7);
        var2.method104(10);
        if (arg0 != -22839) {
            method869(-12, true, null, 63, null, true, 50);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZLjava/lang/String;ILjava/lang/String;ZI)V")
    public static final void method869(int arg0, boolean arg1, String arg2, int arg3, String arg4, boolean arg5, int arg6) {
        field1684++;
        class560.field7636.field1989 = 1;
        String var7 = arg2.toLowerCase();
        short[] var8 = new short[16];
        int var9 = arg6;
        String var10 = null;
        if (arg0 != -1) {
            class579 var11 = class191.field2486.method1256(arg0, -3934);
            if (var11 == null || arg5 != var11.method3259(arg6 - 116)) {
                return;
            }
            if (var11.method3259(arg6 - 114)) {
                var10 = var11.field7997;
            } else {
                var9 = var11.field7999;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class237.field3088.field2832; var13++) {
            class660 var16 = class237.field3088.method1349(-1, var13);
            if ((!arg1 || var16.field9338) && var16.field9375 == -1 && var16.field9306 == -1 && var16.field9318 == 0 && var16.field9309.toLowerCase().indexOf(var7) != -1) {
                if (arg0 != -1) {
                    if (arg5) {
                        if (!arg4.equals(var16.method3655(arg6 - 40, arg0, var10))) {
                            continue;
                        }
                    } else if (var16.method3658(arg0, -107, var9) != arg3) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class168.field2103 = null;
                    class651.field9216 = -1;
                    return;
                }
                if (var8.length <= var12) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class589.field8084 = 0;
        class651.field9216 = var12;
        class168.field2103 = var8;
        String[] var14 = new String[class651.field9216];
        for (int var15 = 0; var15 < class651.field9216; var15++) {
            var14[var15] = class237.field3088.method1349(-1, var8[var15]).field9309;
        }
        class290.method1725(class168.field2103, 0, var14);
        class560.field7636.method1060(-119);
        class560.field7636.field1989 = 2;
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "([B)V")
    public class133(byte[] arg0) {
        int var2 = arg0.length;
        this.field1687 = arg0;
        this.field1683 = new int[var2];
        int[] var3 = new int[33];
        this.field1690 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1683[var5] = var8;
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
                        var3[var10] = class288.method1722(var11, var12);
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
                        if (this.field1690[var14] == 0) {
                            this.field1690[var14] = var4;
                        }
                        var14 = this.field1690[var14];
                    }
                    if (this.field1690.length <= var14) {
                        int[] var17 = new int[this.field1690.length * 2];
                        for (int var18 = 0; var18 < this.field1690.length; var18++) {
                            var17[var18] = this.field1690[var18];
                        }
                        this.field1690 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field1690[var14] = ~var5;
            }
        }
    }
}
