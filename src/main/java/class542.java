import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class542 {

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public int field7357;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "Lig;")
    private class258 field7362;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    private int field7361;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    public int field7355;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "Lgq;")
    public static class542 field7354 = new class542(0, 3, class258.field3851);

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "Lgq;")
    public static class542 field7358 = new class542(1, 3, class258.field3851);

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "Lgq;")
    public static class542 field7363 = new class542(2, 4, class258.field3847);

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "Lgq;")
    public static class542 field7364 = new class542(3, 1, class258.field3851);

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "Lgq;")
    public static class542 field7365 = new class542(4, 2, class258.field3851);

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "Lgq;")
    public static class542 field7366 = new class542(5, 3, class258.field3851);

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "Lgq;")
    public static class542 field7367 = new class542(6, 4, class258.field3851);

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
    public static int field7368 = class485.method2812(9761, 16);

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "Lmga;")
    public static class739 field7369 = new class739(36, 8);

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    public static int field7356;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "([I[II[ILwc;)V")
    public static final void method3087(int[] arg0, int[] arg1, int arg2, int[] arg3, class73 arg4) {
        if (arg2 != 6) {
            field7367 = null;
        }
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg0[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg4.field1859.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field1859[var9] = null;
                    } else {
                        class489 var10 = class6.field65.method1034(var6, 0);
                        int var11 = var10.field6786;
                        class545 var12 = arg4.field1859[var9];
                        if (var12 != null) {
                            if (var12.field7394 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field1859[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field7388 = 1;
                                    var12.field7391 = 0;
                                    var12.field7390 = var8;
                                    var12.field7385 = 0;
                                    var12.field7386 = 0;
                                    if (!arg4.field1823) {
                                        class586.method3259(arg4, arg2 - 6, var10, 0);
                                    }
                                } else if (var11 == 2) {
                                    var12.field7386 = 0;
                                }
                            } else if (var10.field6778 >= class6.field65.method1034(var12.field7394, 0).field6778) {
                                var12 = arg4.field1859[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class545 var13 = arg4.field1859[var9] = new class545();
                            var13.field7388 = 1;
                            var13.field7390 = var8;
                            var13.field7391 = 0;
                            var13.field7385 = 0;
                            var13.field7386 = 0;
                            var13.field7394 = var6;
                            if (!arg4.field1823) {
                                class586.method3259(arg4, arg2 - 6, var10, 0);
                            }
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field7360++;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BI)Lgq;")
    public static final class542 method3088(byte arg0, int arg1) {
        field7359++;
        if (arg1 == 0) {
            return field7354;
        } else if (arg1 == 1) {
            return field7358;
        } else if (arg1 == 2) {
            return field7363;
        } else if (arg1 == 3) {
            return field7364;
        } else if (arg1 == 4) {
            return field7365;
        } else if (arg1 == 5) {
            return field7366;
        } else if (arg1 == 6) {
            return field7367;
        } else {
            int var3 = 11 / ((42 - arg0) / 35);
            return null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7356++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
    public static void method3089(byte arg0) {
        field7365 = null;
        field7354 = null;
        field7367 = null;
        field7369 = null;
        field7366 = null;
        if (arg0 <= -124) {
            field7358 = null;
            field7363 = null;
            field7364 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(IILig;)V")
    private class542(int arg0, int arg1, class258 arg2) {
        this.field7357 = arg0;
        this.field7362 = arg2;
        this.field7361 = arg1;
        this.field7355 = this.field7362.field3842 * this.field7361;
        if (this.field7357 >= 16) {
            throw new RuntimeException();
        }
    }
}
