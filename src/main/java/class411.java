import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class411 {

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "Ltb;")
    private class450 field5141 = new class450(64);

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "Lpl;")
    private class612 field5134;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public int field5142;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "[I")
    public static int[] field5136 = new int[4];

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field5135 = 0;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "Lah;")
    public static class258 field5140;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "Lrfa;")
    public static class419 field5139;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BI)Liga;", line = 5)
    public final class645 method2176(byte arg0, int arg1) {
        field5138++;
        class450 var3 = this.field5141;
        class645 var4;
        synchronized (this.field5141) {
            var4 = (class645) this.field5141.method2418((long) arg1, (byte) 100);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 > -126) {
            method2177(-5, null, -72, (byte) -69, 113, null, -59, 72L, 3);
        }
        class612 var5 = this.field5134;
        byte[] var6;
        synchronized (this.field5134) {
            var6 = this.field5134.method3365(arg1, 56, 19);
        }
        class645 var7 = new class645();
        if (var6 != null) {
            var7.method3602((byte) 98, new class630(var6));
        }
        class450 var8 = this.field5141;
        synchronized (this.field5141) {
            this.field5141.method2409((long) arg1, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILkp;IBILua;IJI)V", line = 36)
    public static final void method2177(int arg0, class507 arg1, int arg2, byte arg3, int arg4, class600 arg5, int arg6, long arg7, int arg8) {
        if (arg3 != -113) {
            method2178((byte) 32);
        }
        field5137++;
        int var10 = arg0 * arg0 + arg6 * arg6;
        if (arg7 < ((long) var10)) {
            return;
        }
        int var11 = Math.min(arg1.field6793 / 2, arg1.field6700 / 2);
        if (var10 <= var11 * var11) {
            class186.method1146(arg8, arg6, arg0, arg1, class27.field400[arg2], arg4, (byte) -108, arg5);
            return;
        }
        var11 -= 10;
        int var12;
        if (class296.field3661 == 4) {
            var12 = (int) class331.field4223 & 0x3FFF;
        } else {
            var12 = (int) class331.field4223 + field5135 & 0x3FFF;
        }
        int var13 = class453.field5810[var12];
        int var14 = class453.field5811[var12];
        if (class296.field3661 != 4) {
            var13 = var13 * 256 / (class354.field4510 + 256);
            var14 = var14 * 256 / (class354.field4510 + 256);
        }
        int var15 = arg6 * var13 + (arg0 * var14) >> 14;
        int var16 = arg6 * var14 - (arg0 * var13) >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var11);
        int var20 = (int) ((double) var11 * Math.cos(var17));
        class568.field7963[arg2].method2907((float) arg1.field6793 / 2.0F + (float) arg4 + (float) var19, (float) arg1.field6700 / 2.0F + (float) arg8 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V", line = 100)
    public static void method2178(byte arg0) {
        if (arg0 == -109) {
            field5136 = null;
            field5139 = null;
            field5140 = null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lqd;)V", line = 113)
    public static final void method2179(class378 arg0) {
        if (class574.field8008 >= 65535) {
            return;
        }
        class332 var1 = arg0.field4779;
        class352.field4498[class574.field8008] = arg0;
        class352.field4495[class574.field8008] = false;
        class574.field8008++;
        int var2 = arg0.field4781;
        if (arg0.field4771) {
            var2 = 0;
        }
        int var3 = arg0.field4781;
        if (arg0.field4768) {
            var3 = class391.field4927 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method1885((byte) 119) + class238.field2979 - var1.method1883((byte) -81) >> class52.field775;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method1885((byte) 119) + var1.method1883((byte) 105) - class238.field2979 >> class52.field775;
            if (var7 >= class37.field508) {
                var7 = class37.field508 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field4773[var5++];
                int var10 = (var1.method1886(true) + class238.field2979 - var1.method1883((byte) -88) >> class52.field775) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class429.field5383) {
                    var11 = class429.field5383 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class704.field9932[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class704.field9932[var4][var12][var8] = var13 | (long) class574.field8008;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class704.field9932[var4][var12][var8] = var13 | (long) class574.field8008 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class704.field9932[var4][var12][var8] = var13 | (long) class574.field8008 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class704.field9932[var4][var12][var8] = var13 | (long) class574.field8008 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lrf;ILpl;)V", line = 213)
    public class411(class112 arg0, int arg1, class612 arg2) {
        this.field5134 = arg2;
        this.field5142 = this.field5134.method3349(19, true);
    }
}
