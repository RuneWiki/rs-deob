import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class133 {

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "[I")
    private int[] field2415;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "[I")
    private int[] field2414;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "[B")
    private byte[] field2418;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field2412 = 0;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field2425 = -1;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "Lid;")
    public static class149 field2428 = class60.method382("Impossible de trouver ", (byte) 51);

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field2429 = 0;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lid;")
    private static class149 field2417 = class60.method382("Cancel", (byte) 111);

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Lid;")
    private static class149 field2427 = class60.method382("purple:", (byte) 81);

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Lid;")
    public static class149 field2421 = field2427;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Lid;")
    public static class149 field2419 = field2427;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field2432 = 127;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Lid;")
    public static class149 field2413 = field2417;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Ldj;")
    public static class187 field2416;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Lvc;")
    public static class190 field2420;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Lal;")
    public static class230 field2423;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[BI[BI)I")
    public final int method929(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        if (arg5 > -115) {
            method932(-82);
        }
        int var7 = arg0 + arg1;
        field2430++;
        int var8 = 0;
        int var9 = arg3 << 3;
        while (arg0 < var7) {
            int var10 = arg4[arg0] & 0xFF;
            byte var11 = this.field2418[var10];
            int var12 = this.field2414[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var9 >> 3;
            int var15 = (var13 + var11 - 1 >> 3) + var14;
            int var16 = var8 & -var13 >> 31;
            var9 += var11;
            int var17 = var13 + 24;
            arg2[var14] = (byte) (var8 = class40.method238(var16, var12 >>> var17));
            if (var15 > var14) {
                var13 = var17 - 8;
                var14++;
                arg2[var14] = (byte) (var8 = var12 >>> var13);
                if (var15 > var14) {
                    var14++;
                    var13 -= 8;
                    arg2[var14] = (byte) (var8 = var12 >>> var13);
                    if (var15 > var14) {
                        var13 -= 8;
                        var14++;
                        arg2[var14] = (byte) (var8 = var12 >>> var13);
                        if (var14 < var15) {
                            var13 -= 8;
                            var14++;
                            arg2[var14] = (byte) (var8 = var12 << -var13);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static final void method930(int arg0) {
        class287.field5096.method1290((byte) -106);
        if (arg0 != 1) {
            field2427 = null;
        }
        field2422++;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "([B)V")
    public class133(byte[] arg0) {
        int var2 = arg0.length;
        this.field2415 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        this.field2414 = new int[var2];
        this.field2418 = arg0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field2414[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var8 | var7;
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
                        var3[var10] = class40.method238(var12, var11);
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
                        if (this.field2415[var14] == 0) {
                            this.field2415[var14] = var4;
                        }
                        var14 = this.field2415[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field2415.length <= var14) {
                        int[] var18 = new int[this.field2415.length * 2];
                        for (int var19 = 0; var19 < this.field2415.length; var19++) {
                            var18[var19] = this.field2415[var19];
                        }
                        this.field2415 = var18;
                    }
                }
                this.field2415[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)J")
    public static final long method931(int arg0, int arg1, int arg2) {
        class231 var3 = class261.field4664[arg0][arg1][arg2];
        return var3 == null || var3.field4048 == null ? 0L : var3.field4048.field1765;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)I")
    public static final int method932(int arg0) {
        field2424++;
        if (class168.field3120 == null) {
            return -1;
        }
        while (class168.field3120.field4965 > class43.field666) {
            if (class168.field3120.method1918(class43.field666, true)) {
                return class43.field666++;
            }
            class43.field666++;
        }
        int var1 = 116 % ((arg0 + 2) / 41);
        return -1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([BB[BIII)I")
    public final int method933(byte[] arg0, byte arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field2426++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg4 + arg5;
        int var8 = 0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field2415[var8];
            }
            int var11;
            if ((var11 = this.field2415[var8]) < 0) {
                arg2[arg5++] = (byte) (~var11);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field2415[var8];
            }
            int var12;
            if ((var12 = this.field2415[var8]) < 0) {
                arg2[arg5++] = (byte) (~var12);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field2415[var8];
            }
            int var13;
            if ((var13 = this.field2415[var8]) < 0) {
                arg2[arg5++] = (byte) (~var13);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field2415[var8];
            }
            int var14;
            if ((var14 = this.field2415[var8]) < 0) {
                arg2[arg5++] = (byte) (~var14);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field2415[var8];
            }
            int var15;
            if ((var15 = this.field2415[var8]) < 0) {
                arg2[arg5++] = (byte) (~var15);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field2415[var8];
            }
            int var16;
            if ((var16 = this.field2415[var8]) < 0) {
                arg2[arg5++] = (byte) (~var16);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field2415[var8];
            }
            int var17;
            if ((var17 = this.field2415[var8]) < 0) {
                arg2[arg5++] = (byte) (~var17);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field2415[var8];
            }
            int var18;
            if ((var18 = this.field2415[var8]) < 0) {
                arg2[arg5++] = (byte) (~var18);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        if (arg1 != -19) {
            field2419 = null;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method934(byte arg0) {
        field2417 = null;
        field2413 = null;
        field2428 = null;
        field2420 = null;
        field2416 = null;
        field2421 = null;
        field2423 = null;
        int var1 = 99 % ((arg0 - 4) / 39);
        field2419 = null;
        field2427 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method935(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field2431++;
        int var8 = -21 / ((arg4 - 38) / 54);
        if (class104.method735(arg5, false)) {
            client.method1105(class14.field206[arg5], -1, arg6, arg7, arg2, arg0, arg3, arg1);
        }
    }
}
