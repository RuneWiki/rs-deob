import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class20 {

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "[I")
    private int[] field369;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "[B")
    private byte[] field366;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "[I")
    private int[] field361;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "Z")
    public static boolean field364 = false;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "Lpk;")
    public static class120 field363;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "Lka;")
    public static class201 field370;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[B[BIIB)I", line = 4)
    public final int method207(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != -59) {
            field363 = (class120) null;
        }
        field365++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg3 + arg4;
        int var8 = 0;
        int var9 = arg0;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 < 0) {
                var8 = this.field361[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field361[var8]) < 0) {
                arg1[arg4++] = (byte) (~var11);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field361[var8];
            }
            int var12;
            if ((var12 = this.field361[var8]) < 0) {
                arg1[arg4++] = (byte) (~var12);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field361[var8];
            }
            int var13;
            if ((var13 = this.field361[var8]) < 0) {
                arg1[arg4++] = (byte) (~var13);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field361[var8];
            }
            int var14;
            if ((var14 = this.field361[var8]) < 0) {
                arg1[arg4++] = (byte) (~var14);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field361[var8];
            }
            int var15;
            if ((var15 = this.field361[var8]) < 0) {
                arg1[arg4++] = (byte) (~var15);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field361[var8];
            }
            int var16;
            if ((var16 = this.field361[var8]) < 0) {
                arg1[arg4++] = (byte) (~var16);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field361[var8];
            }
            int var17;
            if ((var17 = this.field361[var8]) < 0) {
                arg1[arg4++] = (byte) (~var17);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field361[var8];
            }
            int var18;
            if ((var18 = this.field361[var8]) < 0) {
                arg1[arg4++] = (byte) (~var18);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 152)
    public static void method208(int arg0) {
        if (arg0 != 1) {
            method210(-93);
        }
        field363 = null;
        field370 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILpf;)V", line = 165)
    public static final void method209(int arg0, class92 arg1) {
        if (arg0 != 0) {
            method208(-4);
        }
        field368++;
        class71 var2 = (class71) class107.field1754.method79(class106.method851(arg1.field1486, -89), (byte) 0);
        if (var2 == null) {
            class158.method1167(arg1.field4619[0], 0, (class86) null, arg1, (class101) null, 93, arg1.field4643[0], class75.field1153);
        } else {
            var2.method570(-5106);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V", line = 191)
    public static final void method210(int arg0) {
        field362++;
        class146.field2395.method2282((byte) -120);
        class179.field2847.method2282((byte) -127);
        class89.field1429.method2282((byte) -123);
        class14.field306.method2282((byte) -123);
        if (arg0 != -1) {
            field364 = true;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "([B)V", line = 215)
    public class20(byte[] arg0) {
        int var2 = arg0.length;
        this.field369 = new int[var2];
        this.field366 = arg0;
        int var3 = 0;
        int[] var4 = new int[33];
        this.field361 = new int[8];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field369[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class251.method1740(var11, var12);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field361[var14] == 0) {
                            this.field361[var14] = var3;
                        }
                        var14 = this.field361[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field361.length) {
                        int[] var18 = new int[this.field361.length * 2];
                        for (int var19 = 0; var19 < this.field361.length; var19++) {
                            var18[var19] = this.field361[var19];
                        }
                        this.field361 = var18;
                    }
                }
                if (var14 >= var3) {
                    var3 = var14 + 1;
                }
                this.field361[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "([BII[BII)I", line = 343)
    public final int method211(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        if (arg2 > -102) {
            field370 = (class201) null;
        }
        int var7 = arg4 + arg5;
        field372++;
        int var8 = 0;
        int var9 = arg1 << 3;
        while (var7 > arg4) {
            int var10 = arg3[arg4] & 0xFF;
            int var11 = this.field369[var10];
            byte var12 = this.field366[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = (var14 + var12 - 1 >> 3) + var13;
            var9 += var12;
            int var16 = var8 & -var14 >> 31;
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var8 = class251.method1740(var16, var11 >>> var17));
            if (var13 < var15) {
                var14 = var17 - 8;
                var13++;
                arg0[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var15) {
                    var14 -= 8;
                    var13++;
                    arg0[var13] = (byte) (var8 = var11 >>> var14);
                    if (var13 < var15) {
                        var14 -= 8;
                        var13++;
                        arg0[var13] = (byte) (var8 = var11 >>> var14);
                        if (var15 > var13) {
                            var14 -= 8;
                            var13++;
                            arg0[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        return (var9 + 7 >> 3) - arg1;
    }
}
