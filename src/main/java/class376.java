import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class376 {

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "Ljn;")
    private class117 field5205 = new class117(64);

    @OriginalMember(owner = "client!vba", name = "l", descriptor = "Ljn;")
    public class117 field5215 = new class117(2);

    @OriginalMember(owner = "client!vba", name = "j", descriptor = "Lvo;")
    private class345 field5213;

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "Lvo;")
    public class345 field5210;

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "Lsj;")
    public static class373 field5209 = new class373(7500);

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "[I")
    public static int[] field5211 = new int[14];

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "S")
    public static short field5214 = 1;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!vba", name = "i", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZI)Ljm;", line = 4)
    public final class396 method2241(boolean arg0, int arg1) {
        field5208++;
        class117 var3 = this.field5205;
        class396 var4;
        synchronized (this.field5205) {
            var4 = (class396) this.field5205.method941((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0) {
            method2244(-127, -3, -93, 68, -128, -7, -31, -16, -32, 22, null);
        }
        class345 var5 = this.field5213;
        byte[] var6;
        synchronized (this.field5213) {
            var6 = this.field5213.method2081(-128, arg1, 33);
        }
        class396 var7 = new class396();
        var7.field5730 = this;
        if (var6 != null) {
            var7.method2406(new class465(var6), (byte) -62);
        }
        class117 var8 = this.field5205;
        synchronized (this.field5205) {
            this.field5205.method949((long) arg1, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V", line = 38)
    public final void method2242(int arg0) {
        class117 var2 = this.field5205;
        synchronized (this.field5205) {
            this.field5205.method950((byte) 78);
        }
        field5204++;
        class117 var3 = this.field5215;
        synchronized (this.field5215) {
            this.field5215.method950((byte) 13);
        }
        if (arg0 != -2) {
            this.field5213 = null;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)V", line = 57)
    public final void method2243(int arg0, int arg1) {
        class117 var3 = this.field5205;
        synchronized (this.field5205) {
            this.field5205.method939(28093, arg0);
        }
        field5207++;
        class117 var4 = this.field5215;
        synchronized (this.field5215) {
            this.field5215.method939(28093, arg0);
        }
        int var5 = 49 % ((-arg1 - 68) / 41);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIIIIIIIILnea;)Z", line = 81)
    public static final boolean method2244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class538 arg10) {
        field5206++;
        int var11 = arg1;
        int var12 = arg9;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg1 - var13;
        int var16 = arg9 - var14;
        class83.field1265[var13][var14] = 99;
        if (arg7 != 8321) {
            return false;
        }
        class259.field3714[var13][var14] = 0;
        byte var17 = 0;
        class340.field4721[var17] = arg1;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class25.field345[var10001] = arg9;
        int[][] var19 = arg10.field7893;
        while (var26 != var18) {
            var12 = class25.field345[var18];
            var11 = class340.field4721[var18];
            int var20 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var12 - var16;
            int var22 = var11 - arg10.field7891;
            int var23 = var12 - arg10.field7908;
            if (arg3 == -4) {
                if (arg0 == var11 && arg4 == var12) {
                    class642.field9125 = var12;
                    class372.field5164 = var11;
                    return true;
                }
            } else if (arg3 == -3) {
                if (class550.method3231(100, 2, var11, arg0, 2, var12, arg8, arg5, arg4)) {
                    class642.field9125 = var12;
                    class372.field5164 = var11;
                    return true;
                }
            } else if (arg3 == -2) {
                if (arg10.method3168(-115, arg4, var11, arg6, var12, arg5, 2, 2, arg0, arg8)) {
                    class642.field9125 = var12;
                    class372.field5164 = var11;
                    return true;
                }
            } else if (arg3 == -1) {
                if (arg10.method3166(var12, var11, arg5, arg8, true, arg0, arg6, arg4, 2)) {
                    class372.field5164 = var11;
                    class642.field9125 = var12;
                    return true;
                }
            } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                if (arg10.method3156(var12, 2, arg3, arg2, arg0, var11, arg4, arg7 - 8322)) {
                    class372.field5164 = var11;
                    class642.field9125 = var12;
                    return true;
                }
            } else if (arg10.method3154(100, arg4, 2, arg3, arg0, var12, arg2, var11)) {
                class372.field5164 = var11;
                class642.field9125 = var12;
                return true;
            }
            int var25 = class259.field3714[var20][var21] + 1;
            if (var20 > 0 && class83.field1265[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class340.field4721[var26] = var11 - 1;
                class25.field345[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class83.field1265[var20 - 1][var21] = 2;
                class259.field3714[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class83.field1265[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class340.field4721[var26] = var11 + 1;
                class25.field345[var26] = var12;
                class83.field1265[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class259.field3714[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class83.field1265[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class340.field4721[var26] = var11;
                class25.field345[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class83.field1265[var20][var21 - 1] = 1;
                class259.field3714[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class83.field1265[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class340.field4721[var26] = var11;
                class25.field345[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class83.field1265[var20][var21 + 1] = 4;
                class259.field3714[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class83.field1265[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class340.field4721[var26] = var11 - 1;
                class25.field345[var26] = var12 - 1;
                class83.field1265[var20 - 1][var21 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class259.field3714[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class83.field1265[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class340.field4721[var26] = var11 + 1;
                class25.field345[var26] = var12 - 1;
                class83.field1265[var20 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class259.field3714[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class83.field1265[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class340.field4721[var26] = var11 - 1;
                class25.field345[var26] = var12 + 1;
                class83.field1265[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class259.field3714[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class83.field1265[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class340.field4721[var26] = var11 + 1;
                class25.field345[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class83.field1265[var20 + 1][var21 + 1] = 12;
                class259.field3714[var20 + 1][var21 + 1] = var25;
            }
        }
        class372.field5164 = var11;
        class642.field9125 = var12;
        return false;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)V", line = 442)
    public static void method2245(byte arg0) {
        field5209 = null;
        if (arg0 == 49) {
            field5211 = null;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Z)V", line = 453)
    public final void method2246(boolean arg0) {
        class117 var2 = this.field5205;
        synchronized (this.field5205) {
            this.field5205.method936(-51);
        }
        field5212++;
        if (arg0) {
            method2245((byte) -80);
        }
        class117 var3 = this.field5215;
        synchronized (this.field5215) {
            this.field5215.method936(-124);
        }
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lgn;ILvo;Lvo;)V", line = 479)
    public class376(class529 arg0, int arg1, class345 arg2, class345 arg3) {
        this.field5213 = arg2;
        this.field5210 = arg3;
        this.field5213.method2098(0, 33);
    }
}
