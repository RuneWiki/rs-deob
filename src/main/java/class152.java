import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class152 extends class396 {

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
    private int field2140;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "Z")
    public static boolean field2133 = false;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
    public static int field2142 = 0;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field2132 = 0;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field2138 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "[Lpb;")
    public class394[] field2131;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "[[B")
    private byte[][] field2137;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)Lc;")
    public static final class100 method906(byte arg0, int arg1) {
        field2141++;
        class331 var2 = class424.field6079;
        class100 var3;
        synchronized (class424.field6079) {
            var3 = (class100) class424.field6079.method2049(-54, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class51.field587.method361(class189.method1213((byte) -101, arg1), 61, class351.method2241(108, arg1));
        class100 var5 = new class100();
        if (var4 != null) {
            var5.method539(new class211(var4), 4);
        }
        int var6 = -10 / ((11 - arg0) / 46);
        class331 var7 = class424.field6079;
        synchronized (class424.field6079) {
            class424.field6079.method2046((long) arg1, 0, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIZIBZ)V")
    public static final void method907(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5, boolean arg6) {
        field2135++;
        if (arg1 < arg2) {
            int var7 = (arg1 + arg2) / 2;
            int var8 = arg1;
            class175 var9 = class426.field6192[var7];
            class426.field6192[var7] = class426.field6192[arg2];
            class426.field6192[arg2] = var9;
            for (int var10 = arg1; var10 < arg2; var10++) {
                if (class26.method155(arg3, arg6, var9, arg0, arg4, (byte) -86, class426.field6192[var10]) <= 0) {
                    class175 var11 = class426.field6192[var10];
                    class426.field6192[var10] = class426.field6192[var8];
                    class426.field6192[var8++] = var11;
                }
            }
            class426.field6192[arg2] = class426.field6192[var8];
            class426.field6192[var8] = var9;
            method907(arg0, arg1, var8 - 1, arg3, arg4, (byte) -42, arg6);
            method907(arg0, var8 + 1, arg2, arg3, arg4, (byte) -30, arg6);
        }
        if (arg5 > -16) {
            method910((class378) null, 67);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)Z")
    public final boolean method908(int arg0, byte arg1) {
        if (arg1 >= -89) {
            this.field2137 = null;
        }
        field2134++;
        return this.field2131[arg0].field5765;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZII)I")
    public static final int method909(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            return -122;
        }
        field2144++;
        if (arg3 > 243) {
            arg0 >>= 0x4;
        } else if (arg3 > 217) {
            arg0 >>= 0x3;
        } else if (arg3 > 192) {
            arg0 >>= 0x2;
        } else if (arg3 > 179) {
            arg0 >>= 0x1;
        }
        return ((arg2 >> 2 & 0x3F) << 10) + ((arg0 >> 5 << 7) + (arg3 >> 1));
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lam;I)V")
    public static final void method910(class378 arg0, int arg1) {
        field2136++;
        class287.field4044 = 3;
        class246.method1553(arg1 ^ 0x36, true);
        class307.field4399 = true;
        class166.field2336 = 0;
        class351.field5129 = 127;
        class373.field5445 = 0;
        class341.field5022 = 2;
        class40.field424 = true;
        class159.field2255 = true;
        class384.field5630 = 0;
        class78.field885 = true;
        class308.field4405 = 127;
        class420.field6046 = true;
        class216.field2943 = true;
        class318.field4509 = 1;
        class75.field834 = 255;
        class25.field245 = true;
        class430.field6235 = 0;
        class41.field487 = true;
        class281.field3945 = true;
        class67.field763 = true;
        if (class343.field5053 < 96) {
            class119.method680(0, 2);
        } else {
            class119.method680(2, 2);
        }
        class291.field4173 = false;
        class73.field820 = false;
        class169.field2373 = 0;
        class288.field4081 = 2;
        class436.field6388 = true;
        class264.field3709 = 2;
        class8.field97 = true;
        field2133 = false;
        class21.field221 = 0;
        class167 var2 = null;
        try {
            class241 var3 = arg0.method2398((byte) -17);
            if (arg1 != 73) {
                field2132 = 32;
            }
            while (var3.field3268 == 0) {
                class278.method1757(1L, 0);
            }
            if (var3.field3268 == 1) {
                var2 = (class167) var3.field3270;
                byte[] var4 = new byte[(int) var2.method1106(0)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1108(var4, (byte) -51, var5, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class337.method2170(1000000, new class211(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1107((byte) -109);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(I)V")
    public class152(int arg0) {
        this.field2140 = arg0;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public static final void method911(int arg0) {
        class331 var1 = class437.field6410;
        synchronized (class437.field6410) {
            class437.field6410.method2052(0);
        }
        field2143++;
        if (arg0 < 108) {
            field2133 = true;
        }
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)Z")
    public final boolean method912(int arg0) {
        field2145++;
        if (this.field2131 != null) {
            return true;
        }
        if (this.field2137 == null) {
            if (!class362.field5276.method339(this.field2140, false)) {
                return false;
            }
            int[] var2 = class362.field5276.method350(this.field2140, (byte) -91);
            this.field2137 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field2137[var3] = class362.field5276.method361(this.field2140, 123, var2[var3]);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field2137.length; var5++) {
            byte[] var14 = this.field2137[var5];
            int var15 = var14[1] & 0xFF | (var14[0] & 0xFF) << 8;
            var4 &= class59.field712.method345(arg0 - 14337, var15);
        }
        if (!var4) {
            return false;
        }
        if (arg0 != 14338) {
            this.field2137 = null;
        }
        class169 var6 = new class169();
        int var7 = class362.field5276.method352(this.field2140, (byte) -75);
        this.field2131 = new class394[var7];
        int[] var8 = class362.field5276.method350(this.field2140, (byte) -91);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field2137[var9];
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            class88 var12 = null;
            for (class88 var13 = (class88) var6.method1124(-1); var13 != null; var13 = (class88) var6.method1119(false)) {
                if (var13.field985 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class88(var11, class59.field712.method348(var11, arg0 - 14338));
                var6.method1125(-1, var12);
            }
            this.field2131[var8[var9]] = new class394(var10, var12);
        }
        this.field2137 = null;
        return true;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
    public static final void method913(byte arg0) {
        if (class378.field5556.toLowerCase().indexOf("microsoft") == -1) {
            class402.field5836[91] = 42;
            class402.field5836[93] = 43;
            class402.field5836[92] = 74;
            if (class378.field5563 == null) {
                class402.field5836[222] = 59;
                class402.field5836[192] = 58;
            } else {
                class402.field5836[222] = 58;
                class402.field5836[192] = 28;
                class402.field5836[520] = 59;
            }
            class402.field5836[47] = 73;
            class402.field5836[45] = 26;
            class402.field5836[46] = 72;
            class402.field5836[61] = 27;
            class402.field5836[44] = 71;
            class402.field5836[59] = 57;
        } else {
            class402.field5836[186] = 57;
            class402.field5836[221] = 43;
            class402.field5836[191] = 73;
            class402.field5836[223] = 28;
            class402.field5836[222] = 59;
            class402.field5836[188] = 71;
            class402.field5836[190] = 72;
            class402.field5836[220] = 74;
            class402.field5836[219] = 42;
            class402.field5836[189] = 26;
            class402.field5836[187] = 27;
            class402.field5836[192] = 58;
        }
        field2147++;
        if (arg0 != 123) {
            field2139 = -123;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Z")
    public final boolean method914(int arg0, int arg1) {
        field2146++;
        if (arg1 != -1) {
            field2142 = -11;
        }
        return this.field2131[arg0].field5756;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILdl;IIIIIIII)Z")
    public static final boolean method915(int arg0, int arg1, class39 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2130++;
        int var11 = arg0;
        int var12 = arg1;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg0 - var13;
        int var16 = arg1 - var14;
        class237.field3232[var13][var14] = 99;
        if (arg3 != 1) {
            return false;
        }
        class119.field1540[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class112.field1293[var17] = arg0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class366.field5353[var10001] = arg1;
        int[][] var19 = arg2.field394;
        while (var26 != var18) {
            var11 = class112.field1293[var18];
            var12 = class366.field5353[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            int var22 = var11 - arg2.field413;
            int var23 = var12 - arg2.field398;
            if (arg7 == -4) {
                if (arg5 == var11 && arg6 == var12) {
                    class356.field5222 = var12;
                    class297.field4243 = var11;
                    return true;
                }
            } else if (arg7 == -3) {
                if (class150.method898(2, arg9, var12, arg5, arg4, var11, 21212, arg6, 2)) {
                    class297.field4243 = var11;
                    class356.field5222 = var12;
                    return true;
                }
            } else if (arg7 == -2) {
                if (arg2.method247(2, var12, arg4, false, arg9, var11, arg6, arg10, 2, arg5)) {
                    class297.field4243 = var11;
                    class356.field5222 = var12;
                    return true;
                }
            } else if (arg7 == -1) {
                if (arg2.method246(arg6, var11, arg5, arg10, var12, arg9, (byte) -7, 2, arg4)) {
                    class356.field5222 = var12;
                    class297.field4243 = var11;
                    return true;
                }
            } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                if (arg2.method243(2, arg6, arg5, var11, var12, arg8, arg3 + 16383, arg7)) {
                    class297.field4243 = var11;
                    class356.field5222 = var12;
                    return true;
                }
            } else if (arg2.method237(true, var12, arg6, var11, arg8, arg5, arg7, 2)) {
                class356.field5222 = var12;
                class297.field4243 = var11;
                return true;
            }
            int var25 = class119.field1540[var20][var21] + 1;
            if (var20 > 0 && class237.field3232[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class112.field1293[var26] = var11 - 1;
                class366.field5353[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class237.field3232[var20 - 1][var21] = 2;
                class119.field1540[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class237.field3232[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class112.field1293[var26] = var11 + 1;
                class366.field5353[var26] = var12;
                class237.field3232[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class119.field1540[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class237.field3232[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class112.field1293[var26] = var11;
                class366.field5353[var26] = var12 - 1;
                class237.field3232[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class119.field1540[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class237.field3232[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class112.field1293[var26] = var11;
                class366.field5353[var26] = var12 + 1;
                class237.field3232[var20][var21 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class119.field1540[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class237.field3232[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class112.field1293[var26] = var11 - 1;
                class366.field5353[var26] = var12 - 1;
                class237.field3232[var20 - 1][var21 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class119.field1540[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class237.field3232[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class112.field1293[var26] = var11 + 1;
                class366.field5353[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class237.field3232[var20 + 1][var21 - 1] = 9;
                class119.field1540[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class237.field3232[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class112.field1293[var26] = var11 - 1;
                class366.field5353[var26] = var12 + 1;
                class237.field3232[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class119.field1540[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class237.field3232[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class112.field1293[var26] = var11 + 1;
                class366.field5353[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class237.field3232[var20 + 1][var21 + 1] = 12;
                class119.field1540[var20 + 1][var21 + 1] = var25;
            }
        }
        class356.field5222 = var12;
        class297.field4243 = var11;
        return false;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(Z)V")
    public static void method916(boolean arg0) {
        if (!arg0) {
            field2139 = -7;
        }
        field2138 = null;
    }
}
