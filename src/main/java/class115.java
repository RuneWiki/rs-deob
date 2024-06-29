import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class115 extends class25 {

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "[I")
    public int[] field2109 = new int[] { -1 };

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "[I")
    public int[] field2112 = new int[] { 0 };

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "[S")
    public static short[] field2110 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "Lcd;")
    public static class64 field2107 = class44.method335((byte) 71, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "Lmf;")
    public static class43 field2114 = new class43(64);

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public static int field2116 = 0;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "Lke;")
    public static class106 field2115 = new class106();

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "Lcd;")
    public static class64 field2117 = class44.method335((byte) 71, "leuchten2:");

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIZIILja;)V", line = 5)
    public static final void method820(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class60 arg6) {
        if (arg3) {
            return;
        }
        field2113++;
        int var7 = arg0 * arg0 + arg4 * arg4;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg6.field1163 / 2, arg6.field1016 / 2);
        if ((var8 * var8) >= var7) {
            class118.method839(arg2, -118, arg4, arg6, class137.field2437[arg1], arg5, arg0);
            return;
        }
        var8 -= 10;
        int var9 = class241.field4157 + class154.field2734 & 0x7FF;
        int var10 = class50.field820[var9];
        int var11 = class50.field826[var9];
        int var12 = var11 * 256 / (class277.field4766 + 256);
        int var13 = var10 * 256 / (class277.field4766 + 256);
        int var14 = arg0 * var13 + arg4 * var12 >> 16;
        int var15 = arg4 * var13 - (arg0 * var12) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var8);
        int var19 = (int) ((double) var8 * Math.cos(var16));
        if (class123.field2216) {
            ((class136) class145.field2565[arg1]).method973(240, 240, (arg6.field1163 / 2 + arg2 + var18) * 16, (arg5 - (var19 - (arg6.field1016 / 2))) * 16, (int) (var16 * 10430.378D), 4096);
        } else {
            ((class127) class145.field2565[arg1]).method923(arg6.field1163 / 2 + arg2 + var18 - 10, arg5 - -(arg6.field1016 / 2) + -var19 + -10, 20, 20, 15, 15, var16, 256);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([Ljava/lang/Object;BII[J)V", line = 59)
    public static final void method821(Object[] arg0, byte arg1, int arg2, int arg3, long[] arg4) {
        if (arg3 > arg2) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg2;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var7;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var9;
            for (int var10 = arg2; var10 < arg3; var10++) {
                if (var7 + ((long) (var10 & 0x1)) > arg4[var10]) {
                    long var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    Object var13 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var13;
                }
            }
            arg4[arg3] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var9;
            method821(arg0, (byte) -89, arg2, var6 - 1, arg4);
            method821(arg0, (byte) -94, var6 + 1, arg3, arg4);
        }
        if (arg1 > -16) {
            field2117 = (class64) null;
        }
        field2108++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILqm;Z)Lua;", line = 114)
    public static final class83 method822(int arg0, class222 arg1, boolean arg2) {
        field2111++;
        byte[] var3 = arg1.method1588(true, arg0);
        if (var3 == null) {
            return null;
        } else if (arg2) {
            return (class83) null;
        } else {
            return new class83(var3);
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V", line = 152)
    public static void method823(int arg0) {
        field2117 = null;
        if (arg0 != 360000) {
            field2114 = (class43) null;
        }
        field2107 = null;
        field2110 = null;
        field2114 = null;
        field2115 = null;
    }
}
