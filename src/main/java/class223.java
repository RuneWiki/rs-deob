import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class223 {

    @OriginalMember(owner = "client!br", name = "m", descriptor = "I")
    private int field3002 = 0;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "[Lmh;")
    public class376[] field2992;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public int field2994;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "S")
    public static short field2995 = 205;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "[I")
    public static int[] field2991 = new int[100];

    @OriginalMember(owner = "client!br", name = "u", descriptor = "Z")
    public static boolean field3010 = false;

    @OriginalMember(owner = "client!br", name = "w", descriptor = "I")
    public static int field3012 = -1;

    @OriginalMember(owner = "client!br", name = "v", descriptor = "I")
    public static int field3011 = 0;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!br", name = "k", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!br", name = "s", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!br", name = "t", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!br", name = "x", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!br", name = "y", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "J")
    private long field2998;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "Lqj;")
    public static class296 field3006;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "Lmh;")
    private class376 field2997;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "Lmh;")
    private class376 field3007;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BJ)Lmh;", line = 7)
    public final class376 method1412(byte arg0, long arg1) {
        field3009++;
        this.field2998 = arg1;
        class376 var4 = this.field2992[(int) (arg1 & (long) (this.field2994 - 1))];
        for (this.field2997 = var4.field5365; this.field2997 != var4; this.field2997 = this.field2997.field5365) {
            if (this.field2997.field5363 == arg1) {
                class376 var5 = this.field2997;
                this.field2997 = this.field2997.field5365;
                return var5;
            }
        }
        if (arg0 != -54) {
            field3003 = -56;
        }
        this.field2997 = null;
        return null;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)Lmh;", line = 37)
    public final class376 method1413(int arg0) {
        field2999++;
        if (arg0 == 30381) {
            this.field3002 = 0;
            return this.method1420((byte) 95);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V", line = 50)
    public static void method1414(byte arg0) {
        field2991 = null;
        if (arg0 > 88) {
            field3006 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IB)Laj;", line = 65)
    public static final class170 method1415(int arg0, byte arg1) {
        field3000++;
        if (arg1 != -88) {
            field3012 = -14;
        }
        class170 var2 = (class170) class181.field2524.method1246((byte) -26, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class432.field6223.method1920(arg0, false, 1);
        class170 var4 = new class170();
        if (var3 != null) {
            var4.method1151(arg0, -96, new class371(var3));
        }
        class181.field2524.method1247((long) arg0, (byte) -90, var4);
        return var4;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(I)V", line = 96)
    public class223(int arg0) {
        this.field2992 = new class376[arg0];
        this.field2994 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class376 var3 = this.field2992[var2] = new class376();
            var3.field5369 = var3;
            var3.field5365 = var3;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "([Lmh;B)I", line = 122)
    public final int method1416(class376[] arg0, byte arg1) {
        field2996++;
        if (arg1 != -22) {
            this.method1413(-24);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2994; var4++) {
            class376 var5 = this.field2992[var4];
            for (class376 var6 = var5.field5365; var6 != var5; var6 = var6.field5365) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)I", line = 154)
    public final int method1417(int arg0) {
        field2993++;
        int var2 = 0;
        if (arg0 <= 105) {
            return 86;
        }
        for (int var3 = 0; var3 < this.field2994; var3++) {
            class376 var4 = this.field2992[var3];
            for (class376 var5 = var4.field5365; var5 != var4; var5 = var5.field5365) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(B)V", line = 198)
    public final void method1418(byte arg0) {
        field3001++;
        int var2 = 0;
        if (arg0 >= -41) {
            this.method1413(59);
        }
        while (var2 < this.field2994) {
            class376 var3 = this.field2992[var2];
            while (true) {
                class376 var4 = var3.field5365;
                if (var3 == var4) {
                    var2++;
                    break;
                }
                var4.method2459(198);
            }
        }
        this.field3007 = null;
        this.field2997 = null;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(JILmh;)V", line = 230)
    public final void method1419(long arg0, int arg1, class376 arg2) {
        if (arg2.field5369 != null) {
            arg2.method2459(198);
        }
        field3008++;
        class376 var5 = this.field2992[(int) (arg0 & (long) (this.field2994 - 1))];
        arg2.field5369 = var5.field5369;
        arg2.field5365 = var5;
        arg2.field5369.field5365 = arg2;
        arg2.field5363 = arg0;
        arg2.field5365.field5369 = arg2;
        if (arg1 <= 14) {
            this.method1418((byte) -30);
        }
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(B)Lmh;", line = 253)
    public final class376 method1420(byte arg0) {
        int var2 = -112 / ((15 - arg0) / 41);
        field3014++;
        if (this.field3002 > 0 && this.field2992[this.field3002 - 1] != this.field3007) {
            class376 var3 = this.field3007;
            this.field3007 = var3.field5365;
            return var3;
        }
        while (this.field3002 < this.field2994) {
            class376 var4 = this.field2992[this.field3002++].field5365;
            if (this.field2992[this.field3002 - 1] != var4) {
                this.field3007 = var4.field5365;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(I)Lmh;", line = 286)
    public final class376 method1421(int arg0) {
        field3005++;
        if (this.field2997 == null) {
            return null;
        }
        class376 var2 = this.field2992[(int) (this.field2998 & (long) (this.field2994 - arg0))];
        while (this.field2997 != var2) {
            if (this.field2997.field5363 == this.field2998) {
                class376 var3 = this.field2997;
                this.field2997 = this.field2997.field5365;
                return var3;
            }
            this.field2997 = this.field2997.field5365;
        }
        this.field2997 = null;
        return null;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIII)Z", line = 316)
    public static final boolean method1422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2990++;
        int var6 = arg0;
        int var7 = -15 % ((arg4 - 55) / 63);
        while (var6 <= arg5) {
            for (int var8 = arg1; var8 <= arg3; var8++) {
                if (class262.field3580[var6][var8] == arg2 && class14.field170[var6][var8] <= 1) {
                    return true;
                }
            }
            var6++;
        }
        return false;
    }

    @OriginalMember(owner = "client!br", name = "d", descriptor = "(I)I", line = 345)
    public final int method1423(int arg0) {
        field3004++;
        if (arg0 != 8458) {
            field3010 = false;
        }
        return this.field2994;
    }

    @OriginalMember(owner = "client!br", name = "d", descriptor = "(B)I", line = 363)
    public static final int method1424(byte arg0) {
        field3013++;
        return arg0 == -101 ? ((class406.field5895 == 0 ? 0 : 1) << 22) + ((class406.field5904 ? 1 : 0) << 15) + ((class410.field5956 & 0x3) << 11) + ((class427.field6127 ? 1 : 0) << 9) + ((class366.field5126 ? 1 : 0) << 8) + ((class313.field4316 ? 1 : 0) << 6) + (((class21.field280 ? 1 : 0) << 5) + (class326.field4453 & 0x7) + ((class60.field845 ? 1 : 0) << 3) + (((class231.field3098 ? 1 : 0) << 4) - -((class57.field813 ? 1 : 0) << 10)) + (((class412.field5977 ? 1 : 0) << 13) + ((class72.field1114 ? 1 : 0) << 16) - -(class129.field1800 << 17)) - -((class267.field3639 ? 1 : 0) << 19)) + ((~class396.field5788 == -1 ? 0 : 1) << 20) + ((class276.field3750 == 0 ? 0 : 1) << 21) + (class143.method974(-114) << 23) + ((class207.field2795 << 25) + ((class10.field147 ? 1 : 0) << 27) - -(class28.field448 << 28)) : -34;
    }
}
