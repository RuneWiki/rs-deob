import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class400 {

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "B")
    public byte field5828;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "Leo;")
    public class186 field5831;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "S")
    public short field5824;

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "B")
    public byte field5833;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "Lft;")
    public static class4 field5829 = new class4();

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "[Z")
    public static boolean[] field5832 = new boolean[100];

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIIIIIILea;)Z", line = 5)
    public static final boolean method2375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class367 arg10) {
        field5835++;
        int var11 = arg4;
        int var12 = arg6;
        byte var13 = 64;
        if (arg8 != 8) {
            return true;
        }
        byte var14 = 64;
        int var15 = arg4 - var13;
        int var16 = arg6 - var14;
        class397.field5789[var13][var14] = 99;
        class88.field1530[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class165.field2566[var17] = arg4;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class230.field3499[var10001] = arg6;
        int[][] var19 = arg10.field5398;
        while (var26 != var18) {
            var12 = class230.field3499[var18];
            var11 = class165.field2566[var18];
            int var20 = var12 - arg10.field5384;
            int var21 = var11 - arg10.field5389;
            int var22 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var23 = var11 - var15;
            if (arg0 == -4) {
                if (arg7 == var11 && arg9 == var12) {
                    class324.field4869 = var12;
                    class47.field717 = var11;
                    return true;
                }
            } else if (arg0 == -3) {
                if (class169.method1062(arg1, 21264, 1, var12, arg5, arg7, arg9, var11, 1)) {
                    class47.field717 = var11;
                    class324.field4869 = var12;
                    return true;
                }
            } else if (arg0 == -2) {
                if (arg10.method2222(arg5, var11, arg2, var12, 1, arg7, arg1, arg9, 1, 89)) {
                    class47.field717 = var11;
                    class324.field4869 = var12;
                    return true;
                }
            } else if (arg0 == -1) {
                if (arg10.method2226(var11, var12, arg7, arg5, arg2, arg1, 1, arg9, (byte) 78)) {
                    class324.field4869 = var12;
                    class47.field717 = var11;
                    return true;
                }
            } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                if (arg10.method2229(arg7, var11, arg9, arg3, var12, 1, arg0, 2883872)) {
                    class47.field717 = var11;
                    class324.field4869 = var12;
                    return true;
                }
            } else if (arg10.method2216(arg9, arg3, var12, var11, 1, arg0, arg7, -1)) {
                class47.field717 = var11;
                class324.field4869 = var12;
                return true;
            }
            int var25 = class88.field1530[var23][var22] + 1;
            if (var23 > 0 && class397.field5789[var23 - 1][var22] == 0 && (var19[var21 - 1][var20] & 0x42240000) == 0) {
                class165.field2566[var26] = var11 - 1;
                class230.field3499[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class397.field5789[var23 - 1][var22] = 2;
                class88.field1530[var23 - 1][var22] = var25;
            }
            if (var23 < 127 && class397.field5789[var23 + 1][var22] == 0 && (var19[var21 + 1][var20] & 0x60240000) == 0) {
                class165.field2566[var26] = var11 + 1;
                class230.field3499[var26] = var12;
                class397.field5789[var23 + 1][var22] = 8;
                var26 = var26 + 1 & 0xFFF;
                class88.field1530[var23 + 1][var22] = var25;
            }
            if (var22 > 0 && class397.field5789[var23][var22 - 1] == 0 && (var19[var21][var20 - 1] & 0x40A40000) == 0) {
                class165.field2566[var26] = var11;
                class230.field3499[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class397.field5789[var23][var22 - 1] = 1;
                class88.field1530[var23][var22 - 1] = var25;
            }
            if (var22 < 127 && class397.field5789[var23][var22 + 1] == 0 && (var19[var21][var20 + 1] & 0x48240000) == 0) {
                class165.field2566[var26] = var11;
                class230.field3499[var26] = var12 + 1;
                class397.field5789[var23][var22 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class88.field1530[var23][var22 + 1] = var25;
            }
            if (var23 > 0 && var22 > 0 && class397.field5789[var23 - 1][var22 - 1] == 0 && (var19[var21 - 1][var20 - 1] & 0x43A40000) == 0 && (var19[var21 - 1][var20] & 0x42240000) == 0 && (var19[var21][var20 - 1] & 0x40A40000) == 0) {
                class165.field2566[var26] = var11 - 1;
                class230.field3499[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class397.field5789[var23 - 1][var22 - 1] = 3;
                class88.field1530[var23 - 1][var22 - 1] = var25;
            }
            if (var23 < 127 && var22 > 0 && class397.field5789[var23 + 1][var22 - 1] == 0 && (var19[var21 + 1][var20 - 1] & 0x60E40000) == 0 && (var19[var21 + 1][var20] & 0x60240000) == 0 && (var19[var21][var20 - 1] & 0x40A40000) == 0) {
                class165.field2566[var26] = var11 + 1;
                class230.field3499[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class397.field5789[var23 + 1][var22 - 1] = 9;
                class88.field1530[var23 + 1][var22 - 1] = var25;
            }
            if (var23 > 0 && var22 < 127 && class397.field5789[var23 - 1][var22 + 1] == 0 && (var19[var21 - 1][var20 + 1] & 0x4E240000) == 0 && (var19[var21 - 1][var20] & 0x42240000) == 0 && (var19[var21][var20 + 1] & 0x48240000) == 0) {
                class165.field2566[var26] = var11 - 1;
                class230.field3499[var26] = var12 + 1;
                class397.field5789[var23 - 1][var22 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class88.field1530[var23 - 1][var22 + 1] = var25;
            }
            if (var23 < 127 && var22 < 127 && class397.field5789[var23 + 1][var22 + 1] == 0 && (var19[var21 + 1][var20 + 1] & 0x78240000) == 0 && (var19[var21 + 1][var20] & 0x60240000) == 0 && (var19[var21][var20 + 1] & 0x48240000) == 0) {
                class165.field2566[var26] = var11 + 1;
                class230.field3499[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class397.field5789[var23 + 1][var22 + 1] = 12;
                class88.field1530[var23 + 1][var22 + 1] = var25;
            }
        }
        class47.field717 = var11;
        class324.field4869 = var12;
        return false;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(III)I", line = 253)
    public static final int method2376(int arg0, int arg1, int arg2) {
        field5830++;
        if (arg0 != 2) {
            field5829 = null;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZI)I", line = 272)
    public static final int method2377(boolean arg0, int arg1) {
        field5827++;
        if (!arg0) {
            return -43;
        }
        int var2 = (arg1 & 0x55555555) + ((arg1 & 0xAAAAAAAA) >>> 1);
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCF) >>> 2);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V", line = 291)
    public static void method2378(int arg0) {
        int var1 = 78 % ((-arg0 - 25) / 40);
        field5829 = null;
        field5832 = null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(BLbg;)V", line = 311)
    public static final void method2379(byte arg0, class310 arg1) {
        field5825++;
        class230.field3508.method2365(arg1.method1856(7), (byte) -120);
        if (arg0 != -75) {
            method2379((byte) -30, null);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)I", line = 323)
    public static final int method2380(int arg0, int arg1) {
        field5834++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < arg0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return ((var20 >> 2 & 0x3F) << 10) + (var21 >> 5 << 7) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lbl;Leo;III)V", line = 427)
    public class400(class442 arg0, class186 arg1, int arg2, int arg3, int arg4) {
        this.field5828 = (byte) arg4;
        this.field5831 = arg1;
        this.field5824 = (short) arg2;
        this.field5833 = (byte) arg3;
    }
}
