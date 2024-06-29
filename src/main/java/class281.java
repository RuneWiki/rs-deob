import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class281 {

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "[I")
    private int[] field4318;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "[B")
    private byte[] field4308;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
    private int[] field4311;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "F")
    public static float field4313 = 128.0F;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field4314 = 0;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Ldb;")
    public static class39 field4309 = new class39(512);

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([B[BIIII)I")
    public final int method1865(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field4312++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = arg2 + arg4;
        int var8 = 0;
        int var9 = arg3;
        if (arg5 != 2) {
            return -108;
        }
        while (true) {
            byte var10 = arg0[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field4318[var8];
            }
            int var11;
            if ((var11 = this.field4318[var8]) < 0) {
                arg1[arg4++] = (byte) (~var11);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field4318[var8];
            }
            int var12;
            if ((var12 = this.field4318[var8]) < 0) {
                arg1[arg4++] = (byte) (~var12);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field4318[var8];
            }
            int var13;
            if ((var13 = this.field4318[var8]) < 0) {
                arg1[arg4++] = (byte) (~var13);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field4318[var8];
            }
            int var14;
            if ((var14 = this.field4318[var8]) < 0) {
                arg1[arg4++] = (byte) (~var14);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field4318[var8];
            }
            int var15;
            if ((var15 = this.field4318[var8]) < 0) {
                arg1[arg4++] = (byte) (~var15);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field4318[var8];
            }
            int var16;
            if ((var16 = this.field4318[var8]) < 0) {
                arg1[arg4++] = (byte) (~var16);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field4318[var8];
            }
            int var17;
            if ((var17 = this.field4318[var8]) < 0) {
                arg1[arg4++] = (byte) (~var17);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field4318[var8];
            }
            int var18;
            if ((var18 = this.field4318[var8]) < 0) {
                arg1[arg4++] = (byte) (~var18);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[BI[BB)I")
    public final int method1866(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, byte arg5) {
        if (arg5 < 81) {
            return -3;
        }
        field4316++;
        int var7 = 0;
        int var8 = arg0 + arg1;
        int var9 = arg3 << 3;
        while (arg1 < var8) {
            int var10 = arg4[arg1] & 0xFF;
            int var11 = this.field4311[var10];
            byte var12 = this.field4308[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var14 + var12 - 1 >> 3);
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var7 = class186.method1215(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg2[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg2[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg2[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
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

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1867(int arg0, int arg1, int arg2, int arg3) {
        if (!class179.method1179(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class166.field2451[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class251.field3892) {
                    if (!class7.method66(var4, var6, var5)) {
                        return false;
                    }
                    if (!class7.method66(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class7.method66(var4, var7, var5)) {
                        return false;
                    }
                    if (!class7.method66(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class7.method66(var4, var8, var5)) {
                    return false;
                }
                if (!class7.method66(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class135.field1979) {
                    if (!class7.method66(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class7.method66(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class7.method66(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class7.method66(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class7.method66(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class7.method66(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class251.field3892) {
                    if (!class7.method66(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class7.method66(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class7.method66(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class7.method66(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class7.method66(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class7.method66(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class135.field1979) {
                    if (!class7.method66(var4, var6, var5)) {
                        return false;
                    }
                    if (!class7.method66(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class7.method66(var4, var7, var5)) {
                        return false;
                    }
                    if (!class7.method66(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class7.method66(var4, var8, var5)) {
                    return false;
                }
                if (!class7.method66(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class7.method66(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class7.method66(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class7.method66(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class7.method66(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class7.method66(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)I")
    public static final int method1868(byte arg0) {
        if (arg0 < 58) {
            method1868((byte) 83);
        }
        field4315++;
        return class172.field2521 && class293.field4451[81] && class51.field826 > 2 ? class186.field2708[class51.field826 - 2] : class186.field2708[class51.field826 - 1];
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BZ)V")
    public static final void method1869(byte arg0, boolean arg1) {
        field4310++;
        byte[][] var2 = class165.field2429;
        if (arg0 < 20) {
            return;
        }
        byte var3 = 4;
        int[] var4 = null;
        for (int var5 = 0; var5 < var3; var5++) {
            class195.method1316(-47);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class195.field2952[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = var9 >> 24 & 0x3;
                        if (!arg1 || var10 == 0) {
                            int var11 = var9 >> 14 & 0x3FF;
                            int var12 = (var9 & 0x3FF8) >> 3;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            int var14 = var9 >> 1 & 0x3;
                            for (int var15 = 0; var15 < class18.field323.length; var15++) {
                                if (class18.field323[var15] == var13 && var2[var15] != null) {
                                    int[] var16 = class62.method513(-3, var5, var7 * 8, var12, var2[var15], var11, var6 * 8, var10, class243.field3763, var14, arg1);
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class55.method466(var6 * 8, 8, var7 * 8, 8, true, var5);
                    }
                }
            }
        }
        if (var4 == null) {
            class169.field2486 = -1;
            return;
        }
        class246.field3833 = var4[3];
        class169.field2486 = var4[0];
        class218.field3348 = var4[2];
        class184.field2679 = var4[1];
        class223.field3470 = var4[4];
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public static void method1870(boolean arg0) {
        field4309 = null;
        if (!arg0) {
            field4309 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "([B)V")
    public class281(byte[] arg0) {
        int var2 = arg0.length;
        int[] var3 = new int[33];
        this.field4318 = new int[8];
        this.field4308 = arg0;
        int var4 = 0;
        this.field4311 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4311[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class186.method1215(var11, var10);
                    }
                    var12 = var7 | var8;
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
                        if (this.field4318[var14] == 0) {
                            this.field4318[var14] = var4;
                        }
                        var14 = this.field4318[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field4318.length) {
                        int[] var18 = new int[this.field4318.length * 2];
                        for (int var19 = 0; var19 < this.field4318.length; var19++) {
                            var18[var19] = this.field4318[var19];
                        }
                        this.field4318 = var18;
                    }
                }
                this.field4318[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
