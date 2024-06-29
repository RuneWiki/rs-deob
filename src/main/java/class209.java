import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class209 {

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "[B")
    private byte[] field2962;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "[I")
    private int[] field2968;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "[I")
    private int[] field2959;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field2958 = 0;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Z")
    public static boolean field2963 = false;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIZLjava/lang/String;)Z", line = 18)
    public static final boolean method1537(int arg0, int arg1, boolean arg2, String arg3) {
        field2957++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        if (arg1 != 55) {
            method1539(true, (byte) 55, false, 24, false);
        }
        int var6 = arg3.length();
        int var7 = 0;
        for (int var8 = 0; var8 < var6; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg0) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var7 + var11;
            if (var10 / arg0 != var7) {
                return false;
            }
            var5 = true;
            var7 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[B)[B", line = 102)
    public static final byte[] method1538(int arg0, byte[] arg1) {
        field2965++;
        if (arg1 == null) {
            return null;
        }
        byte[] var2 = new byte[arg1.length];
        if (arg0 != 64) {
            field2963 = true;
        }
        class87.method635(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZBZIZ)Lfh;", line = 125)
    public static final class140 method1539(boolean arg0, byte arg1, boolean arg2, int arg3, boolean arg4) {
        field2969++;
        class179 var5 = null;
        if (class287.field4154 != null) {
            var5 = new class179(arg3, class287.field4154, class283.field4039[arg3], 1000000);
        }
        class116.field1513[arg3] = class249.field3631.method1979(class192.field2658, var5, arg3, (byte) -105);
        if (arg4) {
            class116.field1513[arg3].method1683(-94271416);
        }
        if (arg1 >= -42) {
            method1537(122, -120, false, (String) null);
        }
        return new class140(class116.field1513[arg3], arg2, arg0);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III[B[BI)I", line = 147)
    public final int method1540(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        int var7 = arg1 + arg5;
        field2964++;
        int var8 = 15 % ((arg2 + 70) / 47);
        int var9 = 0;
        int var10 = arg0 << 3;
        while (arg1 < var7) {
            int var11 = arg4[arg1] & 0xFF;
            int var12 = this.field2959[var11];
            byte var13 = this.field2962[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var10 >> 3;
            int var15 = var10 & 0x7;
            var10 += var13;
            int var16 = var9 & -var15 >> 31;
            int var17 = (var15 + var13 - 1 >> 3) + var14;
            int var18 = var15 + 24;
            arg3[var14] = (byte) (var9 = class80.method568(var16, var12 >>> var18));
            if (var17 > var14) {
                var14++;
                var15 = var18 - 8;
                arg3[var14] = (byte) (var9 = var12 >>> var15);
                if (var17 > var14) {
                    var14++;
                    var15 -= 8;
                    arg3[var14] = (byte) (var9 = var12 >>> var15);
                    if (var17 > var14) {
                        var14++;
                        var15 -= 8;
                        arg3[var14] = (byte) (var9 = var12 >>> var15);
                        if (var14 < var17) {
                            var15 -= 8;
                            var14++;
                            arg3[var14] = (byte) (var9 = var12 << -var15);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var10 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(III[B[BI)I", line = 217)
    public final int method1541(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        int var7 = -27 % ((66 - arg2) / 34);
        field2960++;
        if (arg5 == 0) {
            return 0;
        }
        int var8 = arg0 + arg5;
        int var9 = 0;
        int var10 = arg1;
        while (true) {
            byte var11 = arg3[var10];
            if (var11 < 0) {
                var9 = this.field2968[var9];
            } else {
                var9++;
            }
            int var12;
            if ((var12 = this.field2968[var9]) < 0) {
                arg4[arg0++] = (byte) (~var12);
                if (arg0 >= var8) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var9++;
            } else {
                var9 = this.field2968[var9];
            }
            int var13;
            if ((var13 = this.field2968[var9]) < 0) {
                arg4[arg0++] = (byte) (~var13);
                if (arg0 >= var8) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var9++;
            } else {
                var9 = this.field2968[var9];
            }
            int var14;
            if ((var14 = this.field2968[var9]) < 0) {
                arg4[arg0++] = (byte) (~var14);
                if (var8 <= arg0) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var9++;
            } else {
                var9 = this.field2968[var9];
            }
            int var15;
            if ((var15 = this.field2968[var9]) < 0) {
                arg4[arg0++] = (byte) (~var15);
                if (var8 <= arg0) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var9++;
            } else {
                var9 = this.field2968[var9];
            }
            int var16;
            if ((var16 = this.field2968[var9]) < 0) {
                arg4[arg0++] = (byte) (~var16);
                if (var8 <= arg0) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var9++;
            } else {
                var9 = this.field2968[var9];
            }
            int var17;
            if ((var17 = this.field2968[var9]) < 0) {
                arg4[arg0++] = (byte) (~var17);
                if (var8 <= arg0) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var9++;
            } else {
                var9 = this.field2968[var9];
            }
            int var18;
            if ((var18 = this.field2968[var9]) < 0) {
                arg4[arg0++] = (byte) (~var18);
                if (var8 <= arg0) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var9++;
            } else {
                var9 = this.field2968[var9];
            }
            int var19;
            if ((var19 = this.field2968[var9]) < 0) {
                arg4[arg0++] = (byte) (~var19);
                if (var8 <= arg0) {
                    break;
                }
                var9 = 0;
            }
            var10++;
        }
        return var10 + 1 - arg1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIFIZ)[[I", line = 366)
    public static final int[][] method1542(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, int arg7, boolean arg8) {
        field2961++;
        int var9 = -103 / ((-arg1 - 18) / 62);
        int[][] var10 = new int[arg0][arg4];
        class214 var11 = new class214();
        var11.field3029 = arg2;
        var11.field3036 = arg7;
        var11.field3033 = arg5;
        var11.field3022 = (int) (arg6 * 4096.0F);
        var11.field3030 = arg8;
        var11.method189((byte) 124);
        class271.method1849(arg4, arg0, false);
        for (int var12 = 0; var12 < arg0; var12++) {
            var11.method1565(var10[var12], var12, -126);
        }
        return var10;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "([B)V", line = 394)
    public class209(byte[] arg0) {
        int var2 = arg0.length;
        this.field2962 = arg0;
        this.field2968 = new int[8];
        int var3 = 0;
        int[] var4 = new int[33];
        this.field2959 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field2959[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var4[var10] = class80.method568(var12, var11);
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
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field2968[var14] == 0) {
                            this.field2968[var14] = var3;
                        }
                        var14 = this.field2968[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field2968.length <= var14) {
                        int[] var18 = new int[this.field2968.length * 2];
                        for (int var19 = 0; var19 < this.field2968.length; var19++) {
                            var18[var19] = this.field2968[var19];
                        }
                        this.field2968 = var18;
                    }
                }
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
                this.field2968[var14] = ~var5;
            }
        }
    }
}
