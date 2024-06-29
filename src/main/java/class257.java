import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class257 extends class172 {

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "[Lck;")
    public class107[] field4310;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "Z")
    public static boolean field4304 = false;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "I")
    public static int field4311 = 0;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "Z")
    public static volatile boolean field4313 = true;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "Ljava/lang/String;")
    public static String field4314 = "wave2:";

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)Z", line = 5)
    public final boolean method1968(int arg0, byte arg1) {
        field4308++;
        int var3 = 4 / ((arg1 + 4) / 47);
        return this.field4310[arg0].field1769;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IC)Z", line = 23)
    public static final boolean method1969(int arg0, char arg1) {
        if (arg0 != -161) {
            method1974(-105, (byte) -62);
        }
        field4309++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class70.field1230;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIILwf;II)V", line = 61)
    public static final void method1970(int arg0, int arg1, int arg2, int arg3, class250 arg4, int arg5, int arg6) {
        field4306++;
        class213 var7 = class169.method1315(arg1, 58);
        if (arg6 != -1) {
            method1973(66, -126);
        }
        if (var7 == null || !var7.field3407 || !var7.method1610((byte) -99)) {
            return;
        }
        if (var7.field3395 != null) {
            int[] var8 = new int[var7.field3395.length];
            for (int var9 = 0; var9 < var8.length / 2; var9++) {
                int var10;
                if (class112.field1827 == 4) {
                    var10 = (int) class261.field4396 & 0x7FF;
                } else {
                    var10 = (int) class261.field4396 + class79.field1372 & 0x7FF;
                }
                int var11 = class153.field2438[var10];
                int var12 = class153.field2445[var10];
                if (class112.field1827 != 4) {
                    var11 = var11 * 256 / (class4.field41 + 256);
                    var12 = var12 * 256 / (class4.field41 + 256);
                }
                var8[var9 * 2] = ((arg2 + (var7.field3395[var9 * 2 + 1] * 4)) * var11 + (var7.field3395[var9 * 2] * 4 + arg0) * var12 >> 16) + (arg3 + (arg4.field4081 / 2));
                var8[var9 * 2 + 1] = arg5 + (arg4.field4157 / 2) - ((var7.field3395[var9 * 2 + 1] * 4 + arg2) * var12 + -((var7.field3395[var9 * 2] * 4 + arg0) * var11) >> 16);
            }
            if (class42.field607) {
                class202.method1550(var8, var7.field3422, var7.field3422 >>> 24, arg4.field4208, arg4.field4188);
            } else {
                class154.method1205(var8, var7.field3422, var7.field3422 >>> 24, arg4.field4208, arg4.field4188);
            }
            for (int var13 = 0; var13 < var8.length / 2 - 1; var13++) {
                if (class42.field607) {
                    class244.method1860(var8[var13 * 2], var8[var13 * 2 + 1], var8[(var13 + 1) * 2], var8[var13 * 2 + 1 + 2], var7.field3389, var7.field3389 >>> 24, (class58) arg4.method1940((byte) -108, false));
                } else {
                    class246.method1896(var8[var13 * 2], var8[var13 * 2 + 1], var8[(var13 + 1) * 2], var8[(var13 + 1) * 2 + 1], var7.field3389, var7.field3389 >>> 24, arg4.field4208, arg4.field4188);
                }
            }
            if (class42.field607) {
                class244.method1860(var8[var8.length - 2], var8[var8.length - 1], var8[0], var8[1], var7.field3389, var7.field3389 >>> 24, (class58) arg4.method1940((byte) -112, false));
            } else {
                class246.method1896(var8[var8.length - 2], var8[var8.length - 1], var8[0], var8[1], var7.field3389, var7.field3389 >>> 24, arg4.field4208, arg4.field4188);
            }
        }
        class285 var14 = null;
        if (var7.field3413 != -1) {
            var14 = var7.method1605(-23, false, false);
            if (var14 != null) {
                class63.method548(arg3, (byte) -128, arg4, arg2, arg0, var14, arg5);
            }
        }
        if (var7.field3401 == null) {
            return;
        }
        class171 var15 = class286.field4663;
        if (var7.field3417 == 1) {
            var15 = class343.field5466;
        }
        int var16 = 0;
        if (var14 != null) {
            var16 = var14.field4649;
        }
        if (var7.field3417 == 2) {
            var15 = class109.field1792;
        }
        class310.method2205(var15, 0, arg4, var7.field3401, arg3, arg2, var16, var7.field3399, arg0, arg5);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(Z)V", line = 164)
    public static void method1971(boolean arg0) {
        if (!arg0) {
            field4304 = true;
        }
        field4314 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)Z", line = 176)
    public final boolean method1972(int arg0, int arg1) {
        if (arg1 != -480) {
            method1971(false);
        }
        field4305++;
        return this.field4310[arg0].field1762;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)I", line = 193)
    public static final int method1973(int arg0, int arg1) {
        field4312++;
        if (arg0 != -5827) {
            method1969(84, (char) 65476);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lth;Lth;IZ)V", line = 206)
    public class257(class57 arg0, class57 arg1, int arg2, boolean arg3) {
        class327 var5 = new class327();
        int var6 = arg0.method482(27535, arg2);
        this.field4310 = new class107[var6];
        int[] var7 = arg0.method458(arg2, -98);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method472(var7[var8], 49, arg2);
            class264 var10 = null;
            int var11 = var9[0] & 0xFF << 8 | var9[1] & 0xFF;
            for (class264 var12 = (class264) var5.method2300((byte) 115); var12 != null; var12 = (class264) var5.method2306(-23)) {
                if (var12.field4430 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method465(0, var11, -17211);
                } else {
                    var13 = arg1.method465(var11, 0, -17211);
                }
                var10 = new class264(var11, var13);
                var5.method2302((byte) -62, var10);
            }
            this.field4310[var7[var8]] = new class107(var9, var10);
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(IB)V", line = 267)
    public static final void method1974(int arg0, byte arg1) {
        field4307++;
        if (arg0 == -1 || !class78.field1348[arg0]) {
            return;
        }
        class258.field4344.method461(arg0, (byte) 116);
        if (class163.field2587[arg0] == null || arg1 <= 92) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class163.field2587[arg0].length; var3++) {
            if (class163.field2587[arg0][var3] != null) {
                if (class163.field2587[arg0][var3].field4078 == 2) {
                    var2 = false;
                } else {
                    class163.field2587[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class163.field2587[arg0] = null;
        }
        class78.field1348[arg0] = false;
    }
}
