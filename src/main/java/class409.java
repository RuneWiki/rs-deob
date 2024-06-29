import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class409 implements class245 {

    @OriginalMember(owner = "client!qba", name = "r", descriptor = "Ltba;")
    private class165 field5197 = new class165(128);

    @OriginalMember(owner = "client!qba", name = "k", descriptor = "[I")
    public int[] field5190 = new int[class115.field1703.field1207];

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "[I")
    private int[] field5182 = new int[class115.field1703.field1207];

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "I")
    public static int field5183 = 104;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!qba", name = "e", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!qba", name = "f", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!qba", name = "g", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!qba", name = "h", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!qba", name = "j", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!qba", name = "l", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!qba", name = "m", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!qba", name = "n", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!qba", name = "o", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!qba", name = "p", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!qba", name = "q", descriptor = "I")
    public static int field5196;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qba", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field5198;

    @OriginalMember(owner = "client!qba", name = "i", descriptor = "[I")
    public static int[] field5188;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2288(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZB)I", line = 4)
    public final int method2278(boolean arg0, byte arg1) {
        field5180++;
        long var3 = class446.method2525(500);
        if (arg1 >= -75) {
            method2287(-7, (byte) 106, -101, 17);
        }
        for (class706 var5 = arg0 ? (class706) this.field5197.method1156(0) : (class706) this.field5197.method1158(22706); var5 != null; var5 = (class706) this.field5197.method1158(22706)) {
            if (var3 > (var5.field9780 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field9780 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field2333;
                    this.field5190[var6] = this.field5182[var6];
                    var5.method1175(-2);
                    return var6;
                }
                var5.method1175(-2);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIB)V", line = 43)
    public final void method2279(int arg0, int arg1, byte arg2) {
        field5186++;
        class378 var4 = class33.field550.method3398(-28718, arg0);
        int var5 = var4.field4834;
        int var6 = var4.field4829;
        int var7 = var4.field4828;
        if (arg2 > -125) {
            this.field5190 = null;
        }
        int var8 = class317.field4109[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method2281(11870, ~var9 & this.field5182[var5] | arg1 << var6 & var9, var5);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V", line = 74)
    public static void method2280(int arg0) {
        field5188 = null;
        if (arg0 != 0) {
            field5196 = 51;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)V", line = 84)
    public final void method2281(int arg0, int arg1, int arg2) {
        field5184++;
        this.field5182[arg2] = arg1;
        if (arg0 != 11870) {
            return;
        }
        class706 var4 = (class706) this.field5197.method1160((long) arg2, 119);
        if (var4 == null) {
            class706 var5 = new class706(4611686018427387905L);
            this.field5197.method1153(var5, (long) arg2, arg0 ^ 0xFFFFD1A1);
        } else if (var4.field9780 != 4611686018427387905L) {
            var4.field9780 = class446.method2525(500) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(IIB)V", line = 112)
    public final void method2282(int arg0, int arg1, byte arg2) {
        if (arg2 != -32) {
            this.method1524(-115, 59);
        }
        this.field5190[arg0] = arg1;
        field5191++;
        class706 var4 = (class706) this.field5197.method1160((long) arg0, 124);
        if (var4 == null) {
            class706 var5 = new class706(class446.method2525(arg2 ^ 0xFFFFFE14) + 500L);
            this.field5197.method1153(var5, (long) arg0, -1);
        } else {
            var4.field9780 = class446.method2525(arg2 + 532) + 500L;
        }
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(III)V", line = 141)
    public final void method2283(int arg0, int arg1, int arg2) {
        field5195++;
        class378 var4 = class33.field550.method3398(-28718, arg2);
        int var5 = var4.field4834;
        int var6 = var4.field4829;
        int var7 = var4.field4828;
        int var8 = class317.field4109[var7 - var6];
        if (arg0 < arg1 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method2282(var5, ~var9 & this.field5190[var5] | var9 & arg0 << var6, (byte) -32);
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)V", line = 168)
    public final void method2284(int arg0) {
        if (arg0 != 207) {
            this.method2278(true, (byte) 85);
        }
        for (int var2 = 0; var2 < class115.field1703.field1207; var2++) {
            class358 var3 = class115.field1703.method720(var2, 16);
            if (var3 != null && var3.field4621 == 0) {
                this.field5182[var2] = 0;
                this.field5190[var2] = 0;
            }
        }
        field5187++;
        this.field5197 = new class165(128);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "()V", line = 198)
    public static final void method2285() {
        for (int var0 = 0; var0 < class433.field5776.length; var0++) {
            class433.field5776[var0].method4173();
        }
        class433.field5776 = null;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(BI)Lkt;", line = 212)
    public static final class160 method2286(byte arg0, int arg1) {
        if (arg0 > -84) {
            field5194 = -39;
        }
        field5193++;
        class160 var2 = (class160) class205.field2726.method3079((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class282.field3548.method3153(arg1, 0, 1);
        class160 var4 = new class160();
        var4.field2206 = arg1;
        if (var3 != null) {
            var4.method1121(79, new class461(var3));
        }
        var4.method1122(true);
        if (var4.field2205 == 2 && class599.field8345.method1160((long) arg1, 120) == null) {
            class599.field8345.method1153(new class393(class603.field8398), (long) arg1, -1);
            class667.field9379[class603.field8398++] = var4;
        }
        class205.field2726.method3077((byte) -112, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZI)I", line = 251)
    public final int method1525(boolean arg0, int arg1) {
        if (arg0) {
            field5181++;
            return this.field5190[arg1];
        } else {
            return 104;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(II)I", line = 264)
    public final int method1524(int arg0, int arg1) {
        field5189++;
        class378 var3 = class33.field550.method3398(-28718, arg1);
        if (arg0 != 0) {
            return -96;
        }
        int var4 = var3.field4834;
        int var5 = var3.field4829;
        int var6 = var3.field4828;
        int var7 = class317.field4109[var6 - var5];
        return var7 & this.field5190[var4] >> var5;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IBII)Z", line = 285)
    public static final boolean method2287(int arg0, byte arg1, int arg2, int arg3) {
        field5192++;
        boolean var4 = true;
        class457 var5 = (class457) class527.method3046(arg3, arg2, arg0);
        if (var5 != null) {
            var4 &= class608.method3421((byte) 90, var5);
        }
        class457 var6 = (class457) class290.method1735(arg3, arg2, arg0, field5198 == null ? (field5198 = method2288("rca")) : field5198);
        if (var6 != null) {
            var4 &= class608.method3421((byte) 90, var6);
        }
        class457 var7 = (class457) class146.method1046(arg3, arg2, arg0);
        if (var7 != null) {
            var4 &= class608.method3421((byte) 90, var7);
        }
        return arg1 == -83 ? var4 : true;
    }
}
