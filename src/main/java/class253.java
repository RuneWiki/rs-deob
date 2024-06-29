import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class253 {

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "[I")
    private int[] field3503;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "[B")
    private byte[] field3501;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "[I")
    private int[] field3505;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "Lcm;")
    public static class449 field3506 = new class449(27, 3);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "Ljava/lang/Object;")
    public static Object field3508;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "[I")
    public static int[] field3509;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "[I")
    public static int[] field3510;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1649(int arg0, byte arg1, int arg2) {
        field3507++;
        if (arg1 != 103) {
            method1653(110, -115, false);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([BII[BIB)I")
    public final int method1650(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, byte arg5) {
        field3504++;
        int var7 = 0;
        if (arg5 >= -78) {
            this.field3501 = null;
        }
        int var8 = arg1 + arg2;
        int var9 = arg4 << 3;
        while (var8 > arg1) {
            int var10 = arg3[arg1] & 0xFF;
            int var11 = this.field3503[var10];
            byte var12 = this.field3501[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var12 + var14 - 1 >> 3);
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var7 = class286.method1860(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg0[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg0[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg0[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg0[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg1++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
    public static void method1651(byte arg0) {
        field3506 = null;
        field3509 = null;
        field3508 = null;
        if (arg0 >= -115) {
            method1651((byte) 30);
        }
        field3510 = null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(III[BI[B)I")
    public final int method1652(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        field3502++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = arg0 + arg2;
        int var8 = arg1;
        int var9 = arg4;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field3505[var8];
            }
            int var11;
            if ((var11 = this.field3505[var8]) < 0) {
                arg3[arg0++] = (byte) (~var11);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3505[var8];
            }
            int var12;
            if ((var12 = this.field3505[var8]) < 0) {
                arg3[arg0++] = (byte) (~var12);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3505[var8];
            }
            int var13;
            if ((var13 = this.field3505[var8]) < 0) {
                arg3[arg0++] = (byte) (~var13);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3505[var8];
            }
            int var14;
            if ((var14 = this.field3505[var8]) < 0) {
                arg3[arg0++] = (byte) (~var14);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3505[var8];
            }
            int var15;
            if ((var15 = this.field3505[var8]) < 0) {
                arg3[arg0++] = (byte) (~var15);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3505[var8];
            }
            int var16;
            if ((var16 = this.field3505[var8]) < 0) {
                arg3[arg0++] = (byte) (~var16);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3505[var8];
            }
            int var17;
            if ((var17 = this.field3505[var8]) < 0) {
                arg3[arg0++] = (byte) (~var17);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3505[var8];
            }
            int var18;
            if ((var18 = this.field3505[var8]) < 0) {
                arg3[arg0++] = (byte) (~var18);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
    public static final String method1653(int arg0, int arg1, boolean arg2) {
        field3500++;
        if (arg0 == -1) {
            return arg2 && arg1 >= 0 ? class370.method2311(arg2, true, 10, arg1) : Integer.toString(arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "([B)V")
    public class253(byte[] arg0) {
        int var2 = arg0.length;
        this.field3503 = new int[var2];
        this.field3501 = arg0;
        this.field3505 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3503[var5] = var8;
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
                        var3[var10] = class286.method1860(var12, var11);
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
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field3505[var14] == 0) {
                            this.field3505[var14] = var4;
                        }
                        var14 = this.field3505[var14];
                    }
                    if (this.field3505.length <= var14) {
                        int[] var17 = new int[this.field3505.length * 2];
                        for (int var18 = 0; var18 < this.field3505.length; var18++) {
                            var17[var18] = this.field3505[var18];
                        }
                        this.field3505 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field3505[var14] = ~var5;
            }
        }
    }
}
