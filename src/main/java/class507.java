import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class507 {

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "[I")
    private int[] field6664;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "[B")
    private byte[] field6656;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "[I")
    private int[] field6655;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "[I")
    public static int[] field6659 = new int[13];

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "F")
    public static float field6661 = 0.0F;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "Ltc;")
    public static class477 field6662 = null;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "Lnj;")
    public static class415 field6660 = new class415(54, -1);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "Lcj;")
    public static class279 field6665;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([B[BIIII)I", line = 4)
    public final int method2738(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field6657++;
        if (arg5 != -1) {
            method2740(-100);
        }
        int var7 = 0;
        int var8 = arg4 << 3;
        int var9 = arg2 + arg3;
        while (var9 > arg3) {
            int var10 = arg0[arg3] & 0xFF;
            int var11 = this.field6664[var10];
            byte var12 = this.field6656[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var8 += var12;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var7 = class131.method954(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg1[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg1[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg1[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var8 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[BI[BII)I", line = 80)
    public final int method2739(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field6658++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = 0;
        if (arg2 > -49) {
            return 42;
        }
        int var8 = arg0 + arg5;
        int var9 = arg4;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 < 0) {
                var7 = this.field6655[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field6655[var7]) < 0) {
                arg1[arg5++] = (byte) (~var11);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field6655[var7];
            }
            int var12;
            if ((var12 = this.field6655[var7]) < 0) {
                arg1[arg5++] = (byte) (~var12);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field6655[var7];
            }
            int var13;
            if ((var13 = this.field6655[var7]) < 0) {
                arg1[arg5++] = (byte) (~var13);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field6655[var7];
            }
            int var14;
            if ((var14 = this.field6655[var7]) < 0) {
                arg1[arg5++] = (byte) (~var14);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field6655[var7];
            }
            int var15;
            if ((var15 = this.field6655[var7]) < 0) {
                arg1[arg5++] = (byte) (~var15);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field6655[var7];
            }
            int var16;
            if ((var16 = this.field6655[var7]) < 0) {
                arg1[arg5++] = (byte) (~var16);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field6655[var7];
            }
            int var17;
            if ((var17 = this.field6655[var7]) < 0) {
                arg1[arg5++] = (byte) (~var17);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field6655[var7];
            }
            int var18;
            if ((var18 = this.field6655[var7]) < 0) {
                arg1[arg5++] = (byte) (~var18);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 241)
    public static void method2740(int arg0) {
        if (arg0 != 54) {
            method2740(-48);
        }
        field6660 = null;
        field6662 = null;
        field6665 = null;
        field6659 = null;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([B)V", line = 264)
    public class507(byte[] arg0) {
        int var2 = arg0.length;
        this.field6664 = new int[var2];
        this.field6656 = arg0;
        int[] var3 = new int[33];
        this.field6655 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field6664[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
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
                        var3[var9] = class131.method954(var10, var11);
                    }
                    var12 = var8 | var7;
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
                        if (this.field6655[var14] == 0) {
                            this.field6655[var14] = var4;
                        }
                        var14 = this.field6655[var14];
                    }
                    if (var14 >= this.field6655.length) {
                        int[] var17 = new int[this.field6655.length * 2];
                        for (int var18 = 0; var18 < this.field6655.length; var18++) {
                            var17[var18] = this.field6655[var18];
                        }
                        this.field6655 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field6655[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
