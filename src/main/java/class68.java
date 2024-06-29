import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class68 extends class179 {

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    private int field1021 = -32768;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "[J")
    public static long[] field1022 = new long[256];

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field1030 = 0;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "Lwn;")
    public static class30 field1032;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1033;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public int field1028;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public int field1029;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "()I", line = 6)
    public final int method137() {
        field1023++;
        return this.field1021;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1022[var0] = var1;
        }
        field1032 = new class30();
        field1033 = "Attack";
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIIIJILrb;)V", line = 22)
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class236 arg10) {
        class94 var13 = class188.method1361(true, this.field1029).method1043(0, (byte) -70, -1, (class270) null, (class38) null, 0, this.field1028);
        field1026++;
        if (var13 != null) {
            var13.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field1021 = var13.method137();
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Leh;IIIII)V", line = 36)
    public static final void method538(class179 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class343.field5331 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class91.field1449) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class327.field5110 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class42 var14 = class34.field521[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class85.field1374[var11][var12 + 1][var13] + class85.field1374[var11][var12][var13] + class85.field1374[var11][var12][var13 + 1] + class85.field1374[var11][var12 + 1][var13 + 1]) / 4 - (class85.field1374[arg1][arg2 + 1][arg3] + class85.field1374[arg1][arg2][arg3] + class85.field1374[arg1][arg2][arg3 + 1] + class85.field1374[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class105 var16 = var14.field665;
                                    if (var16 != null) {
                                        if (var16.field1723.method115()) {
                                            arg0.method104(var16.field1723, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field1724 != null && var16.field1724.method115()) {
                                            arg0.method104(var16.field1724, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field672; var17++) {
                                        class144 var18 = var14.field659[var17];
                                        if (var18 != null && var18.field2346.method115() && (var18.field2345 == var12 || var7 == var12) && (var18.field2339 == var13 || var9 == var13)) {
                                            int var19 = var18.field2334 + 1 - var18.field2345;
                                            int var20 = var18.field2337 + 1 - var18.field2339;
                                            arg0.method104(var18.field2346, (var18.field2345 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2339 - arg3) * 128 + (var20 - arg5) * 64, var6);
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

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 138)
    public static void method539(int arg0) {
        field1033 = null;
        if (arg0 >= 66) {
            field1032 = null;
            field1022 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 151)
    public static final void method540(String arg0, int arg1, boolean arg2) {
        field1027++;
        if (arg2) {
            field1030 = 117;
        }
        class170 var3 = class221.method1613(2, arg1, -8410);
        var3.method1269(arg2);
        var3.field2729 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V", line = 165)
    public static final void method541(boolean arg0) {
        field1024++;
        if (!arg0) {
            method539(101);
        }
        class274.field4284.method2283((byte) 77);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII)V", line = 177)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1025++;
    }
}
