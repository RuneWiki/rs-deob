import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class692 {

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "[B")
    private byte[] field9562;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "[I")
    private int[] field9565;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "[I")
    private int[] field9561;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lqe;")
    public static class469 field9559 = new class469(102, 3);

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field9564 = 0;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field9558;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field9560;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field9563;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII[B[B)I")
    public final int method3928(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        field9560++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg2;
        if (arg3 != 1) {
            return -123;
        }
        int var8 = 0;
        int var9 = arg1;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field9561[var8];
            }
            int var11;
            if ((var11 = this.field9561[var8]) < 0) {
                arg4[arg2++] = (byte) (~var11);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field9561[var8];
            }
            int var12;
            if ((var12 = this.field9561[var8]) < 0) {
                arg4[arg2++] = (byte) (~var12);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field9561[var8];
            }
            int var13;
            if ((var13 = this.field9561[var8]) < 0) {
                arg4[arg2++] = (byte) (~var13);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field9561[var8];
            }
            int var14;
            if ((var14 = this.field9561[var8]) < 0) {
                arg4[arg2++] = (byte) (~var14);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field9561[var8];
            }
            int var15;
            if ((var15 = this.field9561[var8]) < 0) {
                arg4[arg2++] = (byte) (~var15);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field9561[var8];
            }
            int var16;
            if ((var16 = this.field9561[var8]) < 0) {
                arg4[arg2++] = (byte) (~var16);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field9561[var8];
            }
            int var17;
            if ((var17 = this.field9561[var8]) < 0) {
                arg4[arg2++] = (byte) (~var17);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field9561[var8];
            }
            int var18;
            if ((var18 = this.field9561[var8]) < 0) {
                arg4[arg2++] = (byte) (~var18);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method3929(boolean arg0, String arg1) {
        field9558++;
        if (arg1 == null) {
            return -1;
        } else if (arg0) {
            return 3;
        } else {
            for (int var2 = 0; var2 < class690.field9544; var2++) {
                if (arg1.equalsIgnoreCase(class133.field1790[var2])) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBI[BI[B)I")
    public final int method3930(int arg0, byte arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        field9563++;
        int var7 = 0;
        int var8 = arg0 + arg2;
        int var9 = arg4 << 3;
        while (arg0 < var8) {
            int var10 = arg5[arg0] & 0xFF;
            int var11 = this.field9565[var10];
            byte var12 = this.field9562[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var7 = class625.method3600(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg3[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg3[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg3[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg3[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg0++;
        }
        if (arg1 < 44) {
            field9559 = null;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static void method3931(int arg0) {
        field9559 = null;
        if (arg0 < 6) {
            method3931(-37);
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([B)V")
    public class692(byte[] arg0) {
        int var2 = arg0.length;
        this.field9562 = arg0;
        this.field9565 = new int[var2];
        this.field9561 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field9565[var5] = var8;
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
                        var3[var10] = class625.method3600(var11, var12);
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
                        if (this.field9561[var14] == 0) {
                            this.field9561[var14] = var4;
                        }
                        var14 = this.field9561[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field9561.length) {
                        int[] var18 = new int[this.field9561.length * 2];
                        for (int var19 = 0; var19 < this.field9561.length; var19++) {
                            var18[var19] = this.field9561[var19];
                        }
                        this.field9561 = var18;
                    }
                }
                this.field9561[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
