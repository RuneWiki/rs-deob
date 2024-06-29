import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class210 {

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Ljf;")
    private class227 field3331 = new class227(256);

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Ljf;")
    private class227 field3339 = new class227(256);

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lwf;")
    private class306 field3329;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lwf;")
    private class306 field3334;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3332 = "yellow:";

    @OriginalMember(owner = "client!w", name = "l", descriptor = "[I")
    public static int[] field3337 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Lva;")
    public static class121 field3333;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "[[S")
    public static short[][] field3338;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1403(boolean arg0) {
        if (!arg0) {
            field3337 = (int[]) null;
        }
        field3332 = null;
        field3333 = null;
        field3337 = null;
        field3338 = (short[][]) null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IB[I)Lb;", line = 29)
    public final class73 method1404(int arg0, byte arg1, int[] arg2) {
        field3328++;
        if (arg1 < 81) {
            return (class73) null;
        } else if (this.field3334.method2092(-1) == 1) {
            return this.method1408(0, arg0, arg2, (byte) 82);
        } else if (this.field3334.method2086(0, arg0) == 1) {
            return this.method1408(arg0, 0, arg2, (byte) 97);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IB[II)Lb;", line = 65)
    private final class73 method1405(int arg0, byte arg1, int[] arg2, int arg3) {
        field3327++;
        int var5 = ((arg0 & 0x30000FFF) << 4 | arg0 >>> 12) ^ arg3;
        if (arg1 >= -89) {
            method1407(80, -82, -26, -92, -28, 61, 29, -7);
        }
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class73 var9 = (class73) this.field3339.method1558(var7, false);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class202 var10 = (class202) this.field3331.method1558(var7, false);
            if (var10 == null) {
                var10 = class202.method1363(this.field3329, arg0, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field3331.method1550(var10, var7, (byte) 36);
            }
            class73 var11 = var10.method1354(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method1284(0);
                this.field3339.method1550(var11, var7, (byte) 45);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IZIB)V", line = 107)
    public static final void method1406(int arg0, boolean arg1, int arg2, byte arg3) {
        field3336++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        if (arg3 != 113) {
            method1406(91, true, -94, (byte) -118);
        }
        class278.field4290 = arg2;
        class282.field4337 = arg0;
        class162.field2508 = arg1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIII)Z", line = 127)
    public static final boolean method1407(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II[IB)Lb;", line = 154)
    private final class73 method1408(int arg0, int arg1, int[] arg2, byte arg3) {
        int var5 = arg1 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFFE);
        field3326++;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class73 var9 = (class73) this.field3339.method1558(var7, false);
        if (var9 != null) {
            return var9;
        }
        int var10 = 113 / ((arg3 - 15) / 48);
        if (arg2 != null && arg2[0] <= 0) {
            return null;
        }
        class300 var11 = class300.method1973(this.field3334, arg0, arg1);
        if (var11 == null) {
            return null;
        }
        class73 var12 = var11.method1974();
        this.field3339.method1550(var12, var7, (byte) 38);
        if (arg2 != null) {
            arg2[0] -= var12.field1091.length;
        }
        return var12;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IZ[I)Lb;", line = 192)
    public final class73 method1409(int arg0, boolean arg1, int[] arg2) {
        field3330++;
        if (!arg1) {
            this.field3339 = (class227) null;
        }
        if (this.field3329.method2092(-1) == 1) {
            return this.method1405(0, (byte) -112, arg2, arg0);
        } else if (this.field3329.method2086(0, arg0) == 1) {
            return this.method1405(arg0, (byte) -98, arg2, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lwf;Lwf;)V", line = 222)
    public class210(class306 arg0, class306 arg1) {
        this.field3329 = arg1;
        this.field3334 = arg0;
    }
}
