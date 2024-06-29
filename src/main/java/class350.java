import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class350 {

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "[I")
    private int[] field4480;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "[B")
    private byte[] field4475;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "[I")
    private int[] field4478;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "Loi;")
    public static class169 field4481 = new class169("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "[Lf;")
    public static class404[] field4482;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(JI)V")
    public static final void method2057(long arg0, int arg1) {
        field4476++;
        if (arg1 != -1) {
            field4481 = null;
        }
        int var3 = class481.field7006 + class37.field573.field6239;
        int var4 = class225.field2920 + class37.field573.field6241;
        if ((class73.field926 - var3) < -500 || class73.field926 - var3 > 500 || (class293.field3801 - var4) < -500 || (class293.field3801 - var4) > 500) {
            class293.field3801 = var4;
            class73.field926 = var3;
        }
        if (class73.field926 != var3) {
            int var5 = var3 - class73.field926;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class73.field926 += var6;
        }
        if (!class421.field5647.field7707) {
            class163.field2110 += (float) arg0 * class183.field2409 / 6.0F;
            class244.field3138 += (float) arg0 * class36.field553 / 6.0F;
        }
        if (class293.field3801 != var4) {
            int var7 = var4 - class293.field3801;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class293.field3801 += var8;
        }
        class21.method153(true);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "([B[BIIII)I")
    public final int method2058(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field4477++;
        if (arg4 <= 39) {
            this.method2060(null, 91, 43, null, 11, 87);
        }
        if (arg3 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg2 + arg3;
        int var9 = arg5;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var7 = this.field4478[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field4478[var7]) < 0) {
                arg0[arg2++] = (byte) (~var11);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field4478[var7];
            }
            int var12;
            if ((var12 = this.field4478[var7]) < 0) {
                arg0[arg2++] = (byte) (~var12);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field4478[var7];
            }
            int var13;
            if ((var13 = this.field4478[var7]) < 0) {
                arg0[arg2++] = (byte) (~var13);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field4478[var7];
            }
            int var14;
            if ((var14 = this.field4478[var7]) < 0) {
                arg0[arg2++] = (byte) (~var14);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field4478[var7];
            }
            int var15;
            if ((var15 = this.field4478[var7]) < 0) {
                arg0[arg2++] = (byte) (~var15);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field4478[var7];
            }
            int var16;
            if ((var16 = this.field4478[var7]) < 0) {
                arg0[arg2++] = (byte) (~var16);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field4478[var7];
            }
            int var17;
            if ((var17 = this.field4478[var7]) < 0) {
                arg0[arg2++] = (byte) (~var17);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field4478[var7];
            }
            int var18;
            if ((var18 = this.field4478[var7]) < 0) {
                arg0[arg2++] = (byte) (~var18);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
    public static void method2059(byte arg0) {
        field4481 = null;
        int var1 = -95 / ((arg0 - 59) / 45);
        field4482 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "([BII[BII)I")
    public final int method2060(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field4479++;
        int var7 = arg5;
        int var8 = arg4 << 3;
        int var9 = arg1 + arg2;
        while (arg2 < var9) {
            int var10 = arg3[arg2] & 0xFF;
            int var11 = this.field4480[var10];
            byte var12 = this.field4475[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var7 = class31.method213(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg0[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg0[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg0[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg0[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg2++;
        }
        return (var8 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "([B)V")
    public class350(byte[] arg0) {
        int var2 = arg0.length;
        this.field4480 = new int[var2];
        this.field4475 = arg0;
        int[] var3 = new int[33];
        this.field4478 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4480[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var3[var10] = class31.method213(var12, var11);
                    }
                    var9 = var7 | var8;
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
                        if (this.field4478[var14] == 0) {
                            this.field4478[var14] = var4;
                        }
                        var14 = this.field4478[var14];
                    }
                    if (this.field4478.length <= var14) {
                        int[] var17 = new int[this.field4478.length * 2];
                        for (int var18 = 0; var18 < this.field4478.length; var18++) {
                            var17[var18] = this.field4478[var18];
                        }
                        this.field4478 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field4478[var14] = ~var5;
            }
        }
    }
}
