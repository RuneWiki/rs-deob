import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class162 {

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Lbr;")
    private class223 field2274 = new class223(256);

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Lbr;")
    private class223 field2279 = new class223(256);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lqj;")
    private class296 field2264;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "Lqj;")
    private class296 field2271;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "[I")
    public static int[] field2270 = new int[256];

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field2273 = 20;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field2269 = 0;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2278 = "flash1:";

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Ljm;")
    public static final class409 method1070(int arg0) {
        field2268++;
        try {
            return new class121();
        } catch (Throwable var2) {
            try {
                return (class409) Class.forName("ls").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                if (arg0 < 114) {
                    field2278 = null;
                }
                return new class175();
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Z")
    public static final boolean method1071(int arg0, int arg1) {
        field2276++;
        if (arg0 == 34 || arg0 == 10 || arg0 == 4 || arg0 == 47 || arg0 == 42) {
            return true;
        } else if (arg0 == 35 || arg0 == 44 || arg0 == 1002) {
            return true;
        } else if (arg0 == 26 || arg0 == 37 || arg0 == 41 || arg0 == 45 || arg0 == 9) {
            return true;
        } else if (arg0 == 46 || arg0 == 15 || arg0 == 1004 || arg0 == 43) {
            return true;
        } else {
            int var2 = -85 % ((10 - arg1) / 33);
            return false;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I[II)Leg;")
    public final class56 method1072(int arg0, int[] arg1, int arg2) {
        field2267++;
        if (this.field2271.method1915(127) == 1) {
            return this.method1073(arg0, 0, arg1, false);
        } else if (this.field2271.method1911(0, arg0) == 1) {
            return this.method1073(0, arg0, arg1, false);
        } else {
            int var4 = -109 / ((-arg2 - 8) / 50);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[IZ)Leg;")
    private final class56 method1073(int arg0, int arg1, int[] arg2, boolean arg3) {
        field2272++;
        int var5 = (arg1 >>> 12 | arg1 << 4 & 0xFFFE) ^ arg0;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class56 var9 = (class56) this.field2279.method1412((byte) -54, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class17 var10 = (class17) this.field2274.method1412((byte) -54, var7);
            if (var10 == null) {
                var10 = class17.method99(this.field2271, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field2274.method1419(var7, 101, var10);
            }
            class56 var11 = var10.method105(arg2);
            if (arg3) {
                this.method1078(66, 67, -14, (int[]) null);
            }
            if (var11 == null) {
                return null;
            } else {
                var10.method2459(198);
                this.field2279.method1419(var7, 35, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I[II)Leg;")
    public final class56 method1074(int arg0, int[] arg1, int arg2) {
        field2266++;
        if (this.field2264.method1915(111) == 1) {
            return this.method1078(0, arg0, 8, arg1);
        } else if (this.field2264.method1911(arg2 + 42, arg0) == 1) {
            return this.method1078(arg0, 0, arg2 + 50, arg1);
        } else if (arg2 == -42) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)I")
    public static final int method1075(int arg0) {
        field2265++;
        if (arg0 != -45) {
            method1077(-24);
        }
        if (class227.field3044 == null) {
            return class113.field1654 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLpn;)V")
    public static final void method1076(byte arg0, class444 arg1) {
        if (arg1.field6417 != null) {
            arg1.field6417.field2763 = 0;
        }
        if (arg0 >= -71) {
            field2278 = null;
        }
        field2277++;
        arg1.field6414 = false;
        for (class444 var2 = arg1.method180(); var2 != null; var2 = arg1.method179()) {
            method1076((byte) -95, var2);
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
    public static final void method1077(int arg0) {
        class223.field3011 = arg0;
        for (int var1 = 0; var1 < class386.field5629; var1++) {
            for (int var2 = 0; var2 < class371.field5311; var2++) {
                if (class5.field79[arg0][var1][var2] == null) {
                    class5.field79[arg0][var1][var2] = new class142(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III[I)Leg;")
    private final class56 method1078(int arg0, int arg1, int arg2, int[] arg3) {
        field2275++;
        int var5 = arg1 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFF2);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class56 var9 = (class56) this.field2279.method1412((byte) -54, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 != 8) {
            return null;
        } else if (arg3 == null || arg3[0] > 0) {
            class114 var10 = class114.method752(this.field2264, arg0, arg1);
            if (var10 == null) {
                return null;
            }
            class56 var11 = var10.method755();
            this.field2279.method1419(var7, arg2 + 111, var11);
            if (arg3 != null) {
                arg3[0] -= var11.field812.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)V")
    public static void method1079(int arg0) {
        field2278 = null;
        field2270 = null;
        if (arg0 != 1) {
            method1070(52);
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lqj;Lqj;)V")
    public class162(class296 arg0, class296 arg1) {
        this.field2264 = arg0;
        this.field2271 = arg1;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2270[var0] = var1;
        }
    }
}
