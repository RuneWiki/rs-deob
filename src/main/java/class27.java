import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class27 extends class281 {

    @OriginalMember(owner = "client!fba", name = "H", descriptor = "Lmt;")
    public static class419 field401 = new class419(6, 0, 4, 2);

    @OriginalMember(owner = "client!fba", name = "x", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!fba", name = "A", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!fba", name = "B", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!fba", name = "D", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!fba", name = "F", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!fba", name = "G", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!fba", name = "I", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!fba", name = "K", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!fba", name = "L", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!fba", name = "P", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!fba", name = "M", descriptor = "Laj;")
    public static class333 field406;

    @OriginalMember(owner = "client!fba", name = "C", descriptor = "Ljava/lang/String;")
    public String field396;

    @OriginalMember(owner = "client!fba", name = "N", descriptor = "Z")
    public static boolean field407;

    @OriginalMember(owner = "client!fba", name = "z", descriptor = "[C")
    public char[] field393;

    @OriginalMember(owner = "client!fba", name = "E", descriptor = "[C")
    public char[] field398;

    @OriginalMember(owner = "client!fba", name = "y", descriptor = "[I")
    public int[] field392;

    @OriginalMember(owner = "client!fba", name = "J", descriptor = "[I")
    public int[] field403;

    @OriginalMember(owner = "client!fba", name = "O", descriptor = "[I")
    public static int[] field408;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method201(int arg0, int arg1, int arg2, int arg3) {
        field400++;
        int var4 = class121.field1765 + arg3;
        int var5 = class230.field3147 + arg1;
        if (class626.field8501 == null || arg3 < 0 || arg1 < 0 || arg3 >= class597.field8132 || arg1 >= class628.field8800 || class712.field9959.field1320.method4251(107) == 0 && class551.field7456.field2250 != arg2 || arg0 <= 116) {
            return;
        }
        long var6 = (long) (var4 | arg2 << 28 | var5 << 14);
        class193 var8 = (class193) class558.field7516.method3953(var6, 14);
        if (var8 == null) {
            class515.method2991(arg2, arg3, arg1);
            return;
        }
        class309 var9 = (class309) var8.field2590.method2551((byte) -108);
        if (var9 == null) {
            class515.method2991(arg2, arg3, arg1);
            return;
        }
        class428 var10 = (class428) class515.method2991(arg2, arg3, arg1);
        if (var10 == null) {
            var10 = new class428(arg3 << 9, class528.field7227[arg2].method1880(arg3, false, arg1), arg1 << 9, arg2, arg2);
        } else {
            var10.field6080 = var10.field6089 = -1;
        }
        var10.field6082 = var9.field4453;
        var10.field6078 = var9.field4455;
        label61: while (true) {
            class309 var11 = (class309) var8.field2590.method2542(-99);
            if (var11 == null) {
                break;
            }
            if (var10.field6082 != var11.field4453) {
                var10.field6084 = var11.field4455;
                var10.field6080 = var11.field4453;
                while (true) {
                    class309 var12 = (class309) var8.field2590.method2542(-98);
                    if (var12 == null) {
                        break label61;
                    }
                    if (var10.field6082 != var12.field4453 && var10.field6080 != var12.field4453) {
                        var10.field6086 = var12.field4455;
                        var10.field6089 = var12.field4453;
                    }
                }
            }
        }
        int var13 = class783.method4338(arg2, (arg3 << 9) + 256, -12040, (arg1 << 9) + 256);
        var10.field2259 = arg1 << 9;
        var10.field6093 = 0;
        var10.field2244 = (byte) arg2;
        var10.field2257 = arg3 << 9;
        var10.field2250 = (byte) arg2;
        var10.field2246 = var13;
        if (class74.method661(arg3, arg1, 1)) {
            var10.field2244++;
        }
        class104.method801(arg2, arg3, arg1, var13, var10);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(CI)I", line = 103)
    public final int method202(char arg0, int arg1) {
        field405++;
        if (this.field403 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg1 < 90) {
            this.method211(null, -111, (byte) -87);
        }
        while (var3 < this.field403.length) {
            if (this.field398[var3] == arg0) {
                return this.field403[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(JJ)J", line = 134)
    public static long method203(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(BII)Z", line = 143)
    public static final boolean method204(byte arg0, int arg1, int arg2) {
        int var3 = -47 / ((arg0 + 18) / 53);
        field402++;
        return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILjp;)V", line = 153)
    public final void method205(int arg0, class376 arg1) {
        if (arg0 != -21575) {
            return;
        }
        field395++;
        while (true) {
            int var3 = arg1.method2398(-1372747256);
            if (var3 == 0) {
                return;
            }
            this.method211(arg1, var3, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(III)Z", line = 174)
    public static final boolean method206(int arg0, int arg1, int arg2) {
        if (arg0 > -85) {
            return false;
        } else {
            field404++;
            return class524.method3021(arg1, arg2, -72) | (arg2 & 0x70000) != 0 || class5.method35(arg2, (byte) -125, arg1);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIBIII)V", line = 185)
    public static final void method207(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field399++;
        int var8 = arg0 + 1;
        class138.method1069(class785.field10808[arg0], (byte) 121, arg1, arg3, arg4);
        int var9 = arg5 - 1;
        class138.method1069(class785.field10808[arg5], (byte) 119, arg1, arg3, arg4);
        int var6 = var8;
        if (arg2 != -11) {
            return;
        }
        while (var6 <= var9) {
            int[] var7 = class785.field10808[var6];
            var7[arg1] = var7[arg3] = arg4;
            var6++;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IC)I", line = 209)
    public final int method208(int arg0, char arg1) {
        field394++;
        if (this.field392 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field392.length; var3++) {
            if (this.field393[var3] == arg1) {
                return this.field392[var3];
            }
        }
        if (arg0 != -29329) {
            field407 = false;
        }
        return -1;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V", line = 234)
    public final void method209(int arg0) {
        field391++;
        if (arg0 >= -89) {
            return;
        }
        if (this.field403 != null) {
            for (int var2 = 0; var2 < this.field403.length; var2++) {
                this.field403[var2] = class213.method1409(this.field403[var2], 32768);
            }
        }
        if (this.field392 != null) {
            for (int var3 = 0; var3 < this.field392.length; var3++) {
                this.field392[var3] = class213.method1409(this.field392[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "(B)V", line = 265)
    public static void method210(byte arg0) {
        if (arg0 != 12) {
            field401 = null;
        }
        field401 = null;
        field408 = null;
        field406 = null;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Ljp;IB)V", line = 291)
    private final void method211(class376 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field396 = arg0.method2379((byte) 85);
        } else if (arg1 == 2) {
            int var4 = arg0.method2398(-1372747256);
            this.field393 = new char[var4];
            this.field392 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field392[var5] = arg0.method2359(-1);
                byte var6 = arg0.method2387((byte) -72);
                this.field393[var5] = var6 == 0 ? 0 : class682.method3796((byte) 42, var6);
            }
        } else if (arg1 == 3) {
            int var7 = arg0.method2398(-1372747256);
            this.field403 = new int[var7];
            this.field398 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field403[var8] = arg0.method2359(-1);
                byte var9 = arg0.method2387((byte) 116);
                this.field398[var8] = var9 == 0 ? 0 : class682.method3796((byte) 42, var9);
            }
        }
        field397++;
        int var10 = 44 % ((-arg2 - 30) / 49);
    }
}
