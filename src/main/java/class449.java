import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class449 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "[I")
    private int[] field6180;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "[B")
    private byte[] field6182;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "[I")
    private int[] field6188;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Z")
    public static boolean field6183 = false;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Lbd;")
    public static class464 field6185 = new class464(12, 7);

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Z")
    public static boolean field6189 = false;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Ljava/lang/String;")
    public static String field6181;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([BIBII[B)I")
    public final int method2604(byte[] arg0, int arg1, byte arg2, int arg3, int arg4, byte[] arg5) {
        field6186++;
        if (arg3 == 0) {
            return 0;
        }
        if (arg2 <= 97) {
            this.method2604((byte[]) null, -30, (byte) -22, -84, 24, (byte[]) null);
        }
        int var7 = 0;
        int var8 = arg1 + arg3;
        int var9 = arg4;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var7 = this.field6188[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field6188[var7]) < 0) {
                arg0[arg1++] = (byte) (~var11);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field6188[var7];
            }
            int var12;
            if ((var12 = this.field6188[var7]) < 0) {
                arg0[arg1++] = (byte) (~var12);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field6188[var7];
            }
            int var13;
            if ((var13 = this.field6188[var7]) < 0) {
                arg0[arg1++] = (byte) (~var13);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field6188[var7];
            }
            int var14;
            if ((var14 = this.field6188[var7]) < 0) {
                arg0[arg1++] = (byte) (~var14);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field6188[var7];
            }
            int var15;
            if ((var15 = this.field6188[var7]) < 0) {
                arg0[arg1++] = (byte) (~var15);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field6188[var7];
            }
            int var16;
            if ((var16 = this.field6188[var7]) < 0) {
                arg0[arg1++] = (byte) (~var16);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field6188[var7];
            }
            int var17;
            if ((var17 = this.field6188[var7]) < 0) {
                arg0[arg1++] = (byte) (~var17);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field6188[var7];
            }
            int var18;
            if ((var18 = this.field6188[var7]) < 0) {
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

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([BI[BIIB)I")
    public final int method2605(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, byte arg5) {
        field6187++;
        if (arg5 < 91) {
            field6183 = true;
        }
        int var7 = 0;
        int var8 = arg3 << 3;
        int var9 = arg1 + arg4;
        while (arg1 < var9) {
            int var10 = arg0[arg1] & 0xFF;
            int var11 = this.field6180[var10];
            byte var12 = this.field6182[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var7 = class366.method2215(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg2[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg2[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
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
            var8 += var12;
            arg1++;
        }
        return (var8 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lbc;Lfc;I)V")
    public static final void method2606(class187 arg0, class343 arg1, int arg2) {
        class172.field2552 = arg1;
        class81.field1222 = arg0;
        field6184++;
        if (arg2 != -1) {
            method2607(-27);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method2607(int arg0) {
        field6181 = null;
        if (arg0 == -1) {
            field6185 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([B)V")
    public class449(byte[] arg0) {
        int var2 = arg0.length;
        this.field6180 = new int[var2];
        this.field6182 = arg0;
        this.field6188 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field6180[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var3[var10] = class366.method2215(var12, var11);
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
                        if (this.field6188[var14] == 0) {
                            this.field6188[var14] = var4;
                        }
                        var14 = this.field6188[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field6188.length <= var14) {
                        int[] var18 = new int[this.field6188.length * 2];
                        for (int var19 = 0; var19 < this.field6188.length; var19++) {
                            var18[var19] = this.field6188[var19];
                        }
                        this.field6188 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field6188[var14] = ~var5;
            }
        }
    }
}
