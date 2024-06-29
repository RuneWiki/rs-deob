import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class156 {

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "[B")
    private byte[] field2035;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "[I")
    private int[] field2033;

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "[I")
    private int[] field2034;

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "Lwp;")
    public static class453 field2037 = new class453(94, 6);

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!efa", name = "g", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!efa", name = "h", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!efa", name = "i", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(CII)I")
    public static final int method892(char arg0, int arg1, int arg2) {
        field2040++;
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            char var4 = Character.toLowerCase(arg0);
            var3 = (var4 << 4) + 1;
        }
        if (arg2 <= 85) {
            field2037 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILpl;IZ)Leg;")
    public static final class47 method893(int arg0, class612 arg1, int arg2, boolean arg3) {
        if (arg3) {
            return null;
        } else {
            field2038++;
            byte[] var4 = arg1.method3365(arg2, 84, arg0);
            return var4 == null ? null : new class47(var4);
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(II)Lkp;")
    public static final class507 method894(int arg0, int arg1) {
        if (arg0 != -1018745488) {
            return null;
        }
        field2039++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class103.field1390[var2] == null || class103.field1390[var2][var3] == null) {
            boolean var4 = class525.method2860((byte) 125, var2);
            if (!var4) {
                return null;
            }
        }
        return class103.field1390[var2][var3];
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(II[B[BII)I")
    public final int method895(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        if (arg4 != 8) {
            return -78;
        }
        field2036++;
        int var7 = 0;
        int var8 = arg0 + arg5;
        int var9 = arg1 << 3;
        while (arg5 < var8) {
            int var10 = arg3[arg5] & 0xFF;
            int var11 = this.field2033[var10];
            byte var12 = this.field2035[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var7 = class444.method2376(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg2[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg2[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg2[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg2[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg5++;
        }
        return (var9 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)V")
    public static void method896(byte arg0) {
        if (arg0 != -42) {
            field2037 = null;
        }
        field2037 = null;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "([BI[BIBI)I")
    public final int method897(byte[] arg0, int arg1, byte[] arg2, int arg3, byte arg4, int arg5) {
        field2041++;
        if (arg1 == 0) {
            return 0;
        } else if (arg4 == 92) {
            int var7 = arg1 + arg3;
            int var8 = 0;
            int var9 = arg5;
            while (true) {
                byte var10 = arg2[var9];
                if (var10 >= 0) {
                    var8++;
                } else {
                    var8 = this.field2034[var8];
                }
                int var11;
                if ((var11 = this.field2034[var8]) < 0) {
                    arg0[arg3++] = (byte) (~var11);
                    if (var7 <= arg3) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x40) == 0) {
                    var8++;
                } else {
                    var8 = this.field2034[var8];
                }
                int var12;
                if ((var12 = this.field2034[var8]) < 0) {
                    arg0[arg3++] = (byte) (~var12);
                    if (arg3 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x20) == 0) {
                    var8++;
                } else {
                    var8 = this.field2034[var8];
                }
                int var13;
                if ((var13 = this.field2034[var8]) < 0) {
                    arg0[arg3++] = (byte) (~var13);
                    if (var7 <= arg3) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x10) == 0) {
                    var8++;
                } else {
                    var8 = this.field2034[var8];
                }
                int var14;
                if ((var14 = this.field2034[var8]) < 0) {
                    arg0[arg3++] = (byte) (~var14);
                    if (arg3 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x8) == 0) {
                    var8++;
                } else {
                    var8 = this.field2034[var8];
                }
                int var15;
                if ((var15 = this.field2034[var8]) < 0) {
                    arg0[arg3++] = (byte) (~var15);
                    if (arg3 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x4) == 0) {
                    var8++;
                } else {
                    var8 = this.field2034[var8];
                }
                int var16;
                if ((var16 = this.field2034[var8]) < 0) {
                    arg0[arg3++] = (byte) (~var16);
                    if (var7 <= arg3) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x2) == 0) {
                    var8++;
                } else {
                    var8 = this.field2034[var8];
                }
                int var17;
                if ((var17 = this.field2034[var8]) < 0) {
                    arg0[arg3++] = (byte) (~var17);
                    if (var7 <= arg3) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x1) == 0) {
                    var8++;
                } else {
                    var8 = this.field2034[var8];
                }
                int var18;
                if ((var18 = this.field2034[var8]) < 0) {
                    arg0[arg3++] = (byte) (~var18);
                    if (arg3 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                var9++;
            }
            return var9 - (arg5 - 1);
        } else {
            return -34;
        }
    }

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "([B)V")
    public class156(byte[] arg0) {
        int var2 = arg0.length;
        this.field2035 = arg0;
        this.field2033 = new int[var2];
        int[] var3 = new int[33];
        this.field2034 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field2033[var5] = var8;
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
                        var3[var10] = class444.method2376(var11, var12);
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
                        if (this.field2034[var14] == 0) {
                            this.field2034[var14] = var4;
                        }
                        var14 = this.field2034[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field2034.length <= var14) {
                        int[] var18 = new int[this.field2034.length * 2];
                        for (int var19 = 0; var19 < this.field2034.length; var19++) {
                            var18[var19] = this.field2034[var19];
                        }
                        this.field2034 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field2034[var14] = ~var5;
            }
        }
    }
}
