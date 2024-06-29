import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class321 {

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "Lsl;")
    private class427 field4703 = new class427(256);

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "Lsl;")
    private class427 field4712 = new class427(256);

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "Lom;")
    private class344 field4704;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "Lom;")
    private class344 field4708;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "Lom;")
    public static class344 field4705;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "([IIB)Lee;")
    public final class630 method2059(int[] arg0, int arg1, byte arg2) {
        if (arg2 != -85) {
            method2065(null, 99, 28, -16, -116, -24);
        }
        field4707++;
        if (this.field4708.method2245(0) == 1) {
            return this.method2060((byte) -91, arg1, 0, arg0);
        } else if (this.field4708.method2236(arg1, 0) == 1) {
            return this.method2060((byte) -91, 0, arg1, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BII[I)Lee;")
    private final class630 method2060(byte arg0, int arg1, int arg2, int[] arg3) {
        field4711++;
        int var5 = (arg2 >>> 12 | (arg2 & 0x20000FFF) << 4) ^ arg1;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class630 var9 = (class630) this.field4712.method2596(var7, 114);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class429 var10 = (class429) this.field4703.method2596(var7, arg0 ^ 0xFFFFFFD6);
            if (var10 == null) {
                var10 = class429.method2615(this.field4708, arg2, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field4703.method2598(var10, var7, (byte) 8);
            }
            class630 var11 = var10.method2607(arg3);
            if (arg0 != -91) {
                method2063(-89);
            }
            if (var11 == null) {
                return null;
            } else {
                var10.method2588(300);
                this.field4712.method2598(var11, var7, (byte) 8);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIII)I")
    public static final int method2061(int arg0, int arg1, int arg2, int arg3) {
        field4710++;
        int var4 = arg3 / arg1;
        int var5 = arg3 & arg1 - 1;
        int var6 = arg0 / arg1;
        int var7 = arg0 & arg1 - 1;
        int var8 = class446.method2684(127, var6, var4);
        int var9 = class446.method2684(arg2 ^ 0x17, var6, var4 + 1);
        int var10 = class446.method2684(arg2 - 124, var6 - -1, var4);
        int var11 = class446.method2684(99, var6 + 1, var4 + 1);
        int var12 = class132.method1102(var8, false, var5, var9, arg1);
        if (arg2 != -1) {
            method2061(-95, -83, -41, -6);
        }
        int var13 = class132.method1102(var10, false, var5, var11, arg1);
        return class132.method1102(var12, false, var7, var13, arg1);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II[IB)Lee;")
    private final class630 method2062(int arg0, int arg1, int[] arg2, byte arg3) {
        field4706++;
        int var5 = arg1 ^ ((arg0 & 0xE0000FFF) << 4 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        if (arg3 != -77) {
            this.field4703 = null;
        }
        long var7 = (long) var6;
        class630 var9 = (class630) this.field4712.method2596(var7, 78);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class60 var10 = class60.method682(this.field4704, arg0, arg1);
            if (var10 == null) {
                return null;
            }
            class630 var11 = var10.method683();
            this.field4712.method2598(var11, var7, (byte) 8);
            if (arg2 != null) {
                arg2[0] -= var11.field9079.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
    public static void method2063(int arg0) {
        field4705 = null;
        if (arg0 != 0) {
            method2063(123);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I[II)Lee;")
    public final class630 method2064(int arg0, int[] arg1, int arg2) {
        field4709++;
        if (this.field4704.method2245(0) == 1) {
            return this.method2062(0, arg2, arg1, (byte) -77);
        } else if (this.field4704.method2236(arg2, 0) == 1) {
            return this.method2062(arg2, 0, arg1, (byte) -77);
        } else {
            if (arg0 != 765854796) {
                method2063(63);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lom;Lom;)V")
    public class321(class344 arg0, class344 arg1) {
        this.field4704 = arg0;
        this.field4708 = arg1;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lgfa;IIIII)V")
    public static final void method2065(class697 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class148.field2557 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class520.field7369) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class107.field1852 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class370 var14 = class257.field3792[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class485.field6947[var11].method551(var12, var13, (byte) -109) + class485.field6947[var11].method551(var12 + 1, var13, (byte) -113) + class485.field6947[var11].method551(var12, var13 + 1, (byte) -117) + class485.field6947[var11].method551(var12 + 1, var13 + 1, (byte) -128)) / 4 - (class485.field6947[arg1].method551(arg2, arg3, (byte) -106) + class485.field6947[arg1].method551(arg2 + 1, arg3, (byte) -110) + class485.field6947[arg1].method551(arg2, arg3 + 1, (byte) -93) + class485.field6947[arg1].method551(arg2 + 1, arg3 + 1, (byte) -101)) / 4;
                                    class624 var16 = var14.field5491;
                                    class624 var17 = var14.field5493;
                                    if (var16 != null && var16.method447(-41)) {
                                        arg0.method455((var12 - arg2) * class576.field8369 + (1 - arg4) * class271.field4068, -1008, var16, (var13 - arg3) * class576.field8369 + (1 - arg5) * class271.field4068, var15, class521.field7381, var6);
                                    }
                                    if (var17 != null && var17.method447(-42)) {
                                        arg0.method455((var12 - arg2) * class576.field8369 + (1 - arg4) * class271.field4068, -1008, var17, (var13 - arg3) * class576.field8369 + (1 - arg5) * class271.field4068, var15, class521.field7381, var6);
                                    }
                                    for (class636 var18 = var14.field5497; var18 != null; var18 = var18.field9171) {
                                        class122 var19 = var18.field9172;
                                        if (var19 != null && var19.method447(-79) && (var19.field2220 == var12 || var7 == var12) && (var19.field2230 == var13 || var9 == var13)) {
                                            int var20 = var19.field2227 + 1 - var19.field2220;
                                            int var21 = var19.field2222 + 1 - var19.field2230;
                                            arg0.method455((var19.field2220 - arg2) * class576.field8369 + (var20 - arg4) * class271.field4068, -1008, var19, (var19.field2230 - arg3) * class576.field8369 + (var21 - arg5) * class271.field4068, var15, class521.field7381, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }
}
