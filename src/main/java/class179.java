import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class179 {

    @OriginalMember(owner = "client!up", name = "f", descriptor = "[I")
    private int[] field2581;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "[B")
    private byte[] field2578;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "[I")
    private int[] field2576;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "[[I")
    public static int[][] field2579 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1186(boolean arg0) {
        if (arg0) {
            field2579 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 16)
    public static final void method1187(int arg0, int arg1, int arg2, Class arg3) {
        class409 var4 = class497.field6886[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class165 var5 = var4.field5630; var5 != null; var5 = var5.field2400) {
            class37 var6 = var5.field2402;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field581 == arg1 && var6.field587 == arg2) {
                class191.method1231(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "([BII[BIZ)I", line = 50)
    public final int method1188(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, boolean arg5) {
        field2580++;
        if (arg2 == 0) {
            return 0;
        }
        if (!arg5) {
            this.method1188(null, 100, -100, null, -6, true);
        }
        int var7 = 0;
        int var8 = arg1 + arg2;
        int var9 = arg4;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field2576[var7];
            }
            int var11;
            if ((var11 = this.field2576[var7]) < 0) {
                arg0[arg1++] = (byte) (~var11);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field2576[var7];
            }
            int var12;
            if ((var12 = this.field2576[var7]) < 0) {
                arg0[arg1++] = (byte) (~var12);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field2576[var7];
            }
            int var13;
            if ((var13 = this.field2576[var7]) < 0) {
                arg0[arg1++] = (byte) (~var13);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field2576[var7];
            }
            int var14;
            if ((var14 = this.field2576[var7]) < 0) {
                arg0[arg1++] = (byte) (~var14);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field2576[var7];
            }
            int var15;
            if ((var15 = this.field2576[var7]) < 0) {
                arg0[arg1++] = (byte) (~var15);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field2576[var7];
            }
            int var16;
            if ((var16 = this.field2576[var7]) < 0) {
                arg0[arg1++] = (byte) (~var16);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field2576[var7];
            }
            int var17;
            if ((var17 = this.field2576[var7]) < 0) {
                arg0[arg1++] = (byte) (~var17);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field2576[var7];
            }
            int var18;
            if ((var18 = this.field2576[var7]) < 0) {
                arg0[arg1++] = (byte) (~var18);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIII)V", line = 211)
    public static final void method1189(int arg0, int arg1, int arg2, int arg3) {
        field2582++;
        class253 var4 = class332.method1911(arg0, (byte) -126, 11);
        var4.method1522(0);
        var4.field3356 = arg2;
        var4.field3355 = arg3;
        if (arg1 != -31829) {
            method1189(-72, 74, 93, 73);
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "([B)V", line = 225)
    public class179(byte[] arg0) {
        int var2 = arg0.length;
        this.field2581 = new int[var2];
        this.field2578 = arg0;
        this.field2576 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field2581[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
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
                        var3[var10] = class191.method1230(var12, var11);
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
                        if (this.field2576[var14] == 0) {
                            this.field2576[var14] = var4;
                        }
                        var14 = this.field2576[var14];
                    }
                    if (var14 >= this.field2576.length) {
                        int[] var17 = new int[this.field2576.length * 2];
                        for (int var18 = 0; var18 < this.field2576.length; var18++) {
                            var17[var18] = this.field2576[var18];
                        }
                        this.field2576 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field2576[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "([BII[BII)I", line = 354)
    public final int method1190(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field2577++;
        int var7 = 0;
        int var8 = arg4 << 3;
        int var9 = arg2 + arg5;
        while (arg5 < var9) {
            int var10 = arg0[arg5] & 0xFF;
            int var11 = this.field2581[var10];
            byte var12 = this.field2578[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var7 = class191.method1230(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg3[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg3[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg3[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg3[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg5++;
        }
        if (arg1 != 15936) {
            this.method1188(null, -57, 53, null, 33, true);
        }
        return (var8 + 7 >> 3) - arg4;
    }
}
