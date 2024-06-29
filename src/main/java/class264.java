import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class264 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "[I")
    private int[] field3741;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "[B")
    private byte[] field3742;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "[I")
    private int[] field3746;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Lkca;")
    public static class73 field3745 = new class73(28, 3);

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "[I")
    public static int[] field3747;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([BIIII[B)I", line = 3)
    public final int method1743(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field3744++;
        int var7 = 0;
        int var8 = arg1 + arg2;
        int var9 = arg3 << 3;
        if (arg4 != 7) {
            method1744(-4);
        }
        while (arg2 < var8) {
            int var10 = arg5[arg2] & 0xFF;
            int var11 = this.field3741[var10];
            byte var12 = this.field3742[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var14 + var12 - 1 >> 3);
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var7 = class283.method1834(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg0[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg0[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg0[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg0[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg2++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 82)
    public static final void method1744(int arg0) {
        if (arg0 != -13979) {
            method1746((byte) 93);
        }
        field3743++;
        if (!class657.method3755((byte) -103)) {
            return;
        }
        if (class236.field3378 == null) {
            class160.method924(2);
        }
        class169.field2059 = 0;
        class290.field4016 = true;
        try {
            class446.field6666 = class254.field3624.getToolkit().getSystemClipboard();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([BIII[BI)I", line = 112)
    public final int method1745(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field3749++;
        if (arg2 == 0) {
            return 0;
        }
        if (arg3 != 2) {
            this.method1743(null, -84, 74, -64, 85, null);
        }
        int var7 = arg2 + arg5;
        int var8 = 0;
        int var9 = arg1;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field3746[var8];
            }
            int var11;
            if ((var11 = this.field3746[var8]) < 0) {
                arg4[arg5++] = (byte) (~var11);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3746[var8];
            }
            int var12;
            if ((var12 = this.field3746[var8]) < 0) {
                arg4[arg5++] = (byte) (~var12);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3746[var8];
            }
            int var13;
            if ((var13 = this.field3746[var8]) < 0) {
                arg4[arg5++] = (byte) (~var13);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3746[var8];
            }
            int var14;
            if ((var14 = this.field3746[var8]) < 0) {
                arg4[arg5++] = (byte) (~var14);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3746[var8];
            }
            int var15;
            if ((var15 = this.field3746[var8]) < 0) {
                arg4[arg5++] = (byte) (~var15);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3746[var8];
            }
            int var16;
            if ((var16 = this.field3746[var8]) < 0) {
                arg4[arg5++] = (byte) (~var16);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3746[var8];
            }
            int var17;
            if ((var17 = this.field3746[var8]) < 0) {
                arg4[arg5++] = (byte) (~var17);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3746[var8];
            }
            int var18;
            if ((var18 = this.field3746[var8]) < 0) {
                arg4[arg5++] = (byte) (~var18);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)Z", line = 260)
    public static final boolean method1746(byte arg0) {
        field3748++;
        class324 var1 = class436.field6487.field1413.field4677;
        int var2 = -28 % ((arg0 - 91) / 35);
        if (var1 == null || class436.field6487.field1413 == var1) {
            return false;
        }
        class631 var3 = (class631) var1;
        if (var3.field9100 >= 2000) {
            var3.field9100 -= 2000;
        }
        return var3.field9100 == 1003;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V", line = 288)
    public static void method1747(int arg0) {
        field3747 = null;
        if (arg0 != -22971) {
            field3747 = null;
        }
        field3745 = null;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "([B)V", line = 298)
    public class264(byte[] arg0) {
        int var2 = arg0.length;
        this.field3741 = new int[var2];
        this.field3742 = arg0;
        this.field3746 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3741[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
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
                        var3[var10] = class283.method1834(var12, var11);
                    }
                    var9 = var8 | var7;
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
                        if (this.field3746[var14] == 0) {
                            this.field3746[var14] = var4;
                        }
                        var14 = this.field3746[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field3746.length <= var14) {
                        int[] var18 = new int[this.field3746.length * 2];
                        for (int var19 = 0; var19 < this.field3746.length; var19++) {
                            var18[var19] = this.field3746[var19];
                        }
                        this.field3746 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field3746[var14] = ~var5;
            }
        }
    }
}
