import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class33 {

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "[I")
    private int[] field592;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "[I")
    private int[] field593;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "[B")
    private byte[] field590;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lje;")
    public static class67 field589 = class85.method592(255, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Lje;")
    public static class67 field591 = class85.method592(255, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lje;")
    public static class67 field587 = class85.method592(255, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field594 = 0;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method205(int arg0) {
        if (arg0 == -1) {
            field591 = null;
            field587 = null;
            field589 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[BI[B)I")
    public final int method206(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        field595++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = arg1 + arg4;
        int var8 = 0;
        int var9 = arg2;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field593[var8];
            }
            int var11;
            if ((var11 = this.field593[var8]) < 0) {
                arg5[arg4++] = (byte) ~var11;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field593[var8];
            }
            int var12;
            if ((var12 = this.field593[var8]) < 0) {
                arg5[arg4++] = (byte) ~var12;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field593[var8];
            }
            int var13;
            if ((var13 = this.field593[var8]) < 0) {
                arg5[arg4++] = (byte) ~var13;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field593[var8];
            }
            int var14;
            if ((var14 = this.field593[var8]) < 0) {
                arg5[arg4++] = (byte) ~var14;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field593[var8];
            }
            int var15;
            if ((var15 = this.field593[var8]) < 0) {
                arg5[arg4++] = (byte) ~var15;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field593[var8];
            }
            int var16;
            if ((var16 = this.field593[var8]) < 0) {
                arg5[arg4++] = (byte) ~var16;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field593[var8];
            }
            int var17;
            if ((var17 = this.field593[var8]) < 0) {
                arg5[arg4++] = (byte) ~var17;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field593[var8];
            }
            int var18;
            if ((var18 = this.field593[var8]) < 0) {
                arg5[arg4++] = (byte) ~var18;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        if (arg0 > -52) {
            this.field592 = null;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([B)V")
    public class33(byte[] arg0) {
        int var2 = arg0.length;
        int[] var3 = new int[33];
        this.field592 = new int[var2];
        this.field593 = new int[8];
        this.field590 = arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field592[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var3[var10] = class82.method579(var11, var12);
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
                        if (this.field593[var14] == 0) {
                            this.field593[var14] = var4;
                        }
                        var14 = this.field593[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field593.length) {
                        int[] var18 = new int[this.field593.length * 2];
                        for (int var19 = 0; var19 < this.field593.length; var19++) {
                            var18[var19] = this.field593[var19];
                        }
                        this.field593 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field593[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[BIZ[BI)I")
    public final int method207(int arg0, byte[] arg1, int arg2, boolean arg3, byte[] arg4, int arg5) {
        int var7 = arg0 + arg5;
        int var8 = arg2 << 3;
        field586++;
        if (arg3) {
            this.method206(40, 100, 50, null, -85, null);
        }
        int var9 = 0;
        while (var7 > arg5) {
            int var10 = arg4[arg5] & 0xFF;
            byte var11 = this.field590[var10];
            int var12 = this.field592[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var9 & -var14 >> 31;
            var8 += var11;
            int var16 = (var14 + var11 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var9 = class82.method579(var15, var12 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var9 = var12 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg1[var13] = (byte) (var9 = var12 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var9 = var12 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg1[var13] = (byte) (var9 = var12 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var8 + 7 >> 3) - arg2;
    }
}
