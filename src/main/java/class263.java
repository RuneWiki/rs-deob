import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class263 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "[I")
    private int[] field4163;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "[I")
    private int[] field4177;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "[B")
    private byte[] field4175;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field4167 = 0;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field4172 = 0;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field4176 = 500;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Lwj;")
    public static class130 field4173;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
    public static final void method1766(int arg0, int arg1) {
        class52.field938.method1163(arg1, false);
        class276.field4397.method1163(arg1, false);
        if (arg0 == 1) {
            field4174++;
            class293.field4651.method1163(arg1, false);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lsb;II)Lwf;")
    public static final class17 method1767(class124 arg0, int arg1, int arg2) {
        field4165++;
        if (class146.method1077(true, arg1, arg0)) {
            int var3 = -7 % ((70 - arg2) / 36);
            return class233.method1544(112);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static final void method1768(byte arg0) {
        field4164++;
        if (class97.field1510 == 0) {
            return;
        }
        try {
            if (++class94.field1466 > 1500) {
                if (class23.field360 != null) {
                    class23.field360.method294((byte) 105);
                    class23.field360 = null;
                }
                if (class27.field466 >= 1) {
                    class97.field1510 = 0;
                    class106.field1615 = -5;
                    return;
                }
                class94.field1466 = 0;
                class97.field1510 = 1;
                class27.field466++;
                if (class25.field437 == class213.field3423) {
                    class213.field3423 = class277.field4404;
                } else {
                    class213.field3423 = class25.field437;
                }
            }
            if (class97.field1510 == 1) {
                class239.field3767 = class205.field3294.method637(class136.field2276, class213.field3423, (byte) 122);
                class97.field1510 = 2;
            }
            if (class97.field1510 == 2) {
                if (class239.field3767.field1937 == 2) {
                    throw new IOException();
                }
                if (class239.field3767.field1937 != 1) {
                    return;
                }
                class23.field360 = new class35((Socket) class239.field3767.field1936, class205.field3294);
                class239.field3767 = null;
                class23.field360.method301(class87.field1405.field2231, 0, class87.field1405.field2263, (byte) 95);
                if (class165.field2709 != null) {
                    class165.field2709.method1600(-3624);
                }
                if (class212.field3396 != null) {
                    class212.field3396.method1600(-3624);
                }
                int var1 = class23.field360.method295(-8922);
                if (class165.field2709 != null) {
                    class165.field2709.method1600(-3624);
                }
                if (class212.field3396 != null) {
                    class212.field3396.method1600(arg0 - 3586);
                }
                if (var1 != 101) {
                    class106.field1615 = var1;
                    class97.field1510 = 0;
                    class23.field360.method294((byte) -68);
                    class23.field360 = null;
                    return;
                }
                class97.field1510 = 3;
            }
            if (class97.field1510 == 3) {
                if (class23.field360.method296(arg0 ^ 0xFFFFFF88) < 2) {
                    return;
                }
                int var2 = class23.field360.method295(-8922) << 8 | class23.field360.method295(-8922);
                class189.method1301(100, var2);
                if (class295.field4680 == -1) {
                    class106.field1615 = 6;
                    class97.field1510 = 0;
                    class23.field360.method294((byte) 108);
                    class23.field360 = null;
                    return;
                }
                class97.field1510 = 0;
                class23.field360.method294((byte) 113);
                class23.field360 = null;
                class199.method1350((byte) -65);
                return;
            }
        } catch (IOException var3) {
            if (class23.field360 != null) {
                class23.field360.method294((byte) -14);
                class23.field360 = null;
            }
            if (class27.field466 < 1) {
                class94.field1466 = 0;
                class27.field466++;
                class97.field1510 = 1;
                if (class25.field437 == class213.field3423) {
                    class213.field3423 = class277.field4404;
                } else {
                    class213.field3423 = class25.field437;
                }
            } else {
                class97.field1510 = 0;
                class106.field1615 = -4;
            }
        }
        if (arg0 != -38) {
            method1766(-56, -95);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([BIB[BII)I")
    public final int method1769(byte[] arg0, int arg1, byte arg2, byte[] arg3, int arg4, int arg5) {
        field4168++;
        if (arg1 == 0) {
            return 0;
        }
        if (arg2 != 44) {
            this.field4175 = null;
        }
        int var7 = 0;
        int var8 = arg1 + arg4;
        int var9 = arg5;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field4163[var7];
            }
            int var11;
            if ((var11 = this.field4163[var7]) < 0) {
                arg3[arg4++] = (byte) (~var11);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field4163[var7];
            }
            int var12;
            if ((var12 = this.field4163[var7]) < 0) {
                arg3[arg4++] = (byte) (~var12);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field4163[var7];
            }
            int var13;
            if ((var13 = this.field4163[var7]) < 0) {
                arg3[arg4++] = (byte) (~var13);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field4163[var7];
            }
            int var14;
            if ((var14 = this.field4163[var7]) < 0) {
                arg3[arg4++] = (byte) (~var14);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field4163[var7];
            }
            int var15;
            if ((var15 = this.field4163[var7]) < 0) {
                arg3[arg4++] = (byte) (~var15);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field4163[var7];
            }
            int var16;
            if ((var16 = this.field4163[var7]) < 0) {
                arg3[arg4++] = (byte) (~var16);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field4163[var7];
            }
            int var17;
            if ((var17 = this.field4163[var7]) < 0) {
                arg3[arg4++] = (byte) (~var17);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field4163[var7];
            }
            int var18;
            if ((var18 = this.field4163[var7]) < 0) {
                arg3[arg4++] = (byte) (~var18);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILig;)Lam;")
    public static final class297 method1770(int arg0, class136 arg1) {
        field4169++;
        class297 var2 = new class297();
        var2.field4693 = arg1.method996(65280);
        if (arg0 != 675) {
            method1770(24, (class136) null);
        }
        var2.field4702 = class84.method672(var2.field4693, -2);
        return var2;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([BIIII[B)I")
    public final int method1771(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field4166++;
        int var7 = arg3 + arg4;
        int var8 = arg1;
        int var9 = arg2 << 3;
        while (var7 > arg3) {
            int var10 = arg5[arg3] & 0xFF;
            int var11 = this.field4177[var10];
            byte var12 = this.field4175[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var8 & -var14 >> 31;
            int var16 = var13 + (var12 + var14 - 1 >> 3);
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var8 = class140.method1045(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg0[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg0[var13] = (byte) (var8 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg0[var13] = (byte) (var8 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg0[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg3++;
        }
        return (var9 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method1772(int arg0) {
        field4173 = null;
        if (arg0 != -10812) {
            field4167 = -44;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V")
    public static final void method1773(int arg0, int arg1) {
        field4170++;
        class154 var2 = class210.field3374;
        synchronized (class210.field3374) {
            if (arg1 < 9) {
                method1766(118, 89);
            }
            class165.field2689 = arg0;
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "([B)V")
    public class263(byte[] arg0) {
        int var2 = 0;
        int[] var3 = new int[33];
        int var4 = arg0.length;
        this.field4163 = new int[8];
        this.field4177 = new int[var4];
        this.field4175 = arg0;
        for (int var5 = 0; var5 < var4; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4177[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
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
                        var3[var9] = class140.method1045(var11, var10);
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
                        if (this.field4163[var14] == 0) {
                            this.field4163[var14] = var2;
                        }
                        var14 = this.field4163[var14];
                    }
                    if (this.field4163.length <= var14) {
                        int[] var17 = new int[this.field4163.length * 2];
                        for (int var18 = 0; var18 < this.field4163.length; var18++) {
                            var17[var18] = this.field4163[var18];
                        }
                        this.field4163 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var2 <= var14) {
                    var2 = var14 + 1;
                }
                this.field4163[var14] = ~var5;
            }
        }
    }
}
