import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class13 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "[B")
    private byte[] field93;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "[I")
    private int[] field96;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "[I")
    private int[] field94;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "Lik;")
    public static class410 field98 = new class410(50);

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Z")
    public static boolean field103 = false;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "[I")
    public static int[] field101 = new int[5];

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "Lrk;")
    public static class427 field102;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public static void method62(byte arg0) {
        field102 = null;
        field101 = null;
        field98 = null;
        if (arg0 != -72) {
            field102 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)V")
    public static final void method63(byte arg0) {
        class97.field1402.method607(arg0 ^ 0xFFFFFFBE);
        field99++;
        class402.field5609.method607(arg0 ^ 0xFFFFFFBE);
        if (arg0 != -66) {
            field98 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([BI[BIII)I")
    public final int method64(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field95++;
        if (arg4 != 24177) {
            method63((byte) -125);
        }
        int var7 = 0;
        int var8 = arg1 + arg5;
        int var9 = arg3 << 3;
        while (arg1 < var8) {
            int var10 = arg0[arg1] & 0xFF;
            int var11 = this.field96[var10];
            byte var12 = this.field93[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var9 += var12;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var7 = class260.method1678(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg2[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg2[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg2[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg2[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([B[BIIII)I")
    public final int method65(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field97++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg2 + arg4;
        if (arg5 <= 19) {
            field98 = null;
        }
        int var9 = arg3;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var7 = this.field94[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field94[var7]) < 0) {
                arg0[arg4++] = (byte) (~var11);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field94[var7];
            }
            int var12;
            if ((var12 = this.field94[var7]) < 0) {
                arg0[arg4++] = (byte) (~var12);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field94[var7];
            }
            int var13;
            if ((var13 = this.field94[var7]) < 0) {
                arg0[arg4++] = (byte) (~var13);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field94[var7];
            }
            int var14;
            if ((var14 = this.field94[var7]) < 0) {
                arg0[arg4++] = (byte) (~var14);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field94[var7];
            }
            int var15;
            if ((var15 = this.field94[var7]) < 0) {
                arg0[arg4++] = (byte) (~var15);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field94[var7];
            }
            int var16;
            if ((var16 = this.field94[var7]) < 0) {
                arg0[arg4++] = (byte) (~var16);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field94[var7];
            }
            int var17;
            if ((var17 = this.field94[var7]) < 0) {
                arg0[arg4++] = (byte) (~var17);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field94[var7];
            }
            int var18;
            if ((var18 = this.field94[var7]) < 0) {
                arg0[arg4++] = (byte) (~var18);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "([B)V")
    public class13(byte[] arg0) {
        int var2 = arg0.length;
        this.field93 = arg0;
        this.field96 = new int[var2];
        int[] var3 = new int[33];
        this.field94 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field96[var5] = var8;
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
                        var3[var10] = class260.method1678(var11, var12);
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
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field94[var14] == 0) {
                            this.field94[var14] = var4;
                        }
                        var14 = this.field94[var14];
                    }
                    if (var14 >= this.field94.length) {
                        int[] var17 = new int[this.field94.length * 2];
                        for (int var18 = 0; var18 < this.field94.length; var18++) {
                            var17[var18] = this.field94[var18];
                        }
                        this.field94 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field94[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static final void method66(int arg0) {
        field100++;
        if (arg0 != -16) {
            method62((byte) 119);
        }
        if (class267.field3590) {
            return;
        }
        if (class100.field1443) {
            class47.field810 = (float) ((int) class47.field810 - 17 & 0xFFFFFFF0);
        } else {
            class150.field2292 += (-12.0F - class150.field2292) / 2.0F;
        }
        class287.field3847 = true;
        class267.field3590 = true;
    }
}
