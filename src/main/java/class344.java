import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class class344 extends class130 {

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    private int field5133;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    private int field5138;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public int field5136;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public int field5128;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public int field5134;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "F")
    public float field5123;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "[I")
    public static int[] field5137 = new int[4];

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIIIILuh;)Z")
    public static final boolean method2210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class407 arg10) {
        field5127++;
        int var11 = arg6;
        int var12 = arg1;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg6 - var13;
        if (arg7 < 85) {
            return false;
        }
        int var16 = arg1 - var14;
        class454.field6755[var13][var14] = 99;
        class125.field1878[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class63.field996[var17] = arg6;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class200.field3104[var10001] = arg1;
        int[][] var19 = arg10.field6004;
        while (var26 != var18) {
            var11 = class63.field996[var18];
            var12 = class200.field3104[var18];
            int var20 = var11 - arg10.field6019;
            int var21 = var12 - arg10.field6015;
            int var22 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var23 = var11 - var15;
            if (arg0 == -4) {
                if (arg9 == var11 && arg5 == var12) {
                    class128.field1916 = var12;
                    class57.field880 = var11;
                    return true;
                }
            } else if (arg0 == -3) {
                if (class342.method2204(var11, (byte) 65, 1, arg9, arg5, var12, arg4, arg3, 1)) {
                    class128.field1916 = var12;
                    class57.field880 = var11;
                    return true;
                }
            } else if (arg0 == -2) {
                if (arg10.method2570(var12, 1, arg3, arg9, 1, var11, -6197, arg5, arg8, arg4)) {
                    class128.field1916 = var12;
                    class57.field880 = var11;
                    return true;
                }
            } else if (arg0 == -1) {
                if (arg10.method2573(arg8, var12, 1, 8, arg3, arg4, arg5, arg9, var11)) {
                    class57.field880 = var11;
                    class128.field1916 = var12;
                    return true;
                }
            } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                if (arg10.method2572(var11, arg0, var12, arg2, 1, arg5, arg9, (byte) 67)) {
                    class57.field880 = var11;
                    class128.field1916 = var12;
                    return true;
                }
            } else if (arg10.method2562(arg0, var12, arg5, -2, arg2, arg9, 1, var11)) {
                class128.field1916 = var12;
                class57.field880 = var11;
                return true;
            }
            int var25 = class125.field1878[var23][var22] + 1;
            if (var23 > 0 && class454.field6755[var23 - 1][var22] == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0) {
                class63.field996[var26] = var11 - 1;
                class200.field3104[var26] = var12;
                class454.field6755[var23 - 1][var22] = 2;
                var26 = var26 + 1 & 0xFFF;
                class125.field1878[var23 - 1][var22] = var25;
            }
            if (var23 < 127 && class454.field6755[var23 + 1][var22] == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0) {
                class63.field996[var26] = var11 + 1;
                class200.field3104[var26] = var12;
                class454.field6755[var23 + 1][var22] = 8;
                var26 = var26 + 1 & 0xFFF;
                class125.field1878[var23 + 1][var22] = var25;
            }
            if (var22 > 0 && class454.field6755[var23][var22 - 1] == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class63.field996[var26] = var11;
                class200.field3104[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class454.field6755[var23][var22 - 1] = 1;
                class125.field1878[var23][var22 - 1] = var25;
            }
            if (var22 < 127 && class454.field6755[var23][var22 + 1] == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class63.field996[var26] = var11;
                class200.field3104[var26] = var12 + 1;
                class454.field6755[var23][var22 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class125.field1878[var23][var22 + 1] = var25;
            }
            if (var23 > 0 && var22 > 0 && class454.field6755[var23 - 1][var22 - 1] == 0 && (var19[var20 - 1][var21 - 1] & 0x43A40000) == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class63.field996[var26] = var11 - 1;
                class200.field3104[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class454.field6755[var23 - 1][var22 - 1] = 3;
                class125.field1878[var23 - 1][var22 - 1] = var25;
            }
            if (var23 < 127 && var22 > 0 && class454.field6755[var23 + 1][var22 - 1] == 0 && (var19[var20 + 1][var21 - 1] & 0x60E40000) == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class63.field996[var26] = var11 + 1;
                class200.field3104[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class454.field6755[var23 + 1][var22 - 1] = 9;
                class125.field1878[var23 + 1][var22 - 1] = var25;
            }
            if (var23 > 0 && var22 < 127 && class454.field6755[var23 - 1][var22 + 1] == 0 && (var19[var20 - 1][var21 + 1] & 0x4E240000) == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class63.field996[var26] = var11 - 1;
                class200.field3104[var26] = var12 + 1;
                class454.field6755[var23 - 1][var22 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class125.field1878[var23 - 1][var22 + 1] = var25;
            }
            if (var23 < 127 && var22 < 127 && class454.field6755[var23 + 1][var22 + 1] == 0 && (var19[var20 + 1][var21 + 1] & 0x78240000) == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class63.field996[var26] = var11 + 1;
                class200.field3104[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class454.field6755[var23 + 1][var22 + 1] = 12;
                class125.field1878[var23 + 1][var22 + 1] = var25;
            }
        }
        class128.field1916 = var12;
        class57.field880 = var11;
        return false;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)F")
    public final float method2211(int arg0) {
        if (arg0 > -43) {
            method2213(false);
        }
        field5125++;
        return this.field5123;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)I")
    public final int method2212(int arg0) {
        field5135++;
        if (arg0 != -1) {
            method2215((byte) 71);
        }
        return this.field5133;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
    public static final void method2213(boolean arg0) {
        if (!arg0) {
            field5137 = null;
        }
        field5131++;
        if (class231.field3483 != null) {
            class231.field3483.method1988((byte) -48);
            class231.field3483 = null;
            class410.field6067 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)I")
    public final int method2214(byte arg0) {
        if (arg0 < 106) {
            return 101;
        } else {
            field5124++;
            return this.field5128;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)V")
    public static void method2215(byte arg0) {
        if (arg0 != 7) {
            method2213(false);
        }
        field5137 = null;
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)I")
    public final int method2216(int arg0) {
        if (arg0 != -1) {
            this.method835(29, -92, 86, -16);
        }
        field5122++;
        return this.field5136;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BF)V")
    public abstract void method836(byte arg0, float arg1);

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)I")
    public final int method2217(boolean arg0) {
        field5129++;
        if (!arg0) {
            this.method2218(-41);
        }
        return this.field5134;
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)I")
    public final int method2218(int arg0) {
        if (arg0 != 921) {
            this.method2212(-64);
        }
        field5130++;
        return this.field5138;
    }

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)V")
    public static final void method2219(int arg0) {
        field5126++;
        try {
            if (class386.field5678 == 1) {
                int var1 = class192.field2954.method2385((byte) 62);
                if (var1 > 0 && class192.field2954.method2365(arg0 - 4093)) {
                    int var2 = var1 - class439.field6547;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class192.field2954.method2388(var2, -93);
                    return;
                }
                class192.field2954.method2373(-28708);
                class192.field2954.method2355(-60);
                if (class134.field1992 == null) {
                    class386.field5678 = 0;
                } else {
                    class386.field5678 = 2;
                }
                class424.field6225 = null;
                class281.field4368 = null;
            }
            if (arg0 != 4095) {
                field5137 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class192.field2954.method2373(-28708);
            class134.field1992 = null;
            class281.field4368 = null;
            class386.field5678 = 0;
            class424.field6225 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)V")
    public abstract void method835(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(IIIIIF)V")
    public class344(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field5133 = arg4;
        this.field5138 = arg3;
        this.field5136 = arg2;
        this.field5128 = arg0;
        this.field5134 = arg1;
        this.field5123 = arg5;
    }
}
