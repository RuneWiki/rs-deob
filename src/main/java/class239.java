import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class239 extends class82 {

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public int field3592;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    public int field3597;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public static volatile int field3598 = 0;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "Lgk;")
    public static class159 field3595 = new class159();

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "Lpf;")
    public static class294 field3596;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "[[[B")
    public static byte[][][] field3600;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lsk;IIIII)V")
    public static final void method1513(class114 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class114.field1743 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class197.field2997) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class92.field1448 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class270 var14 = class33.field487[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class67.field1072[var11][var12 + 1][var13] + class67.field1072[var11][var12][var13] + class67.field1072[var11][var12][var13 + 1] + class67.field1072[var11][var12 + 1][var13 + 1]) / 4 - (class67.field1072[arg1][arg2 + 1][arg3] + class67.field1072[arg1][arg2][arg3] + class67.field1072[arg1][arg2][arg3 + 1] + class67.field1072[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class162 var16 = var14.field4084;
                                    if (var16 != null) {
                                        if (var16.field2489.method738()) {
                                            arg0.method736(var16.field2489, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2478 != null && var16.field2478.method738()) {
                                            arg0.method736(var16.field2478, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field4071; var17++) {
                                        class2 var18 = var14.field4069[var17];
                                        if (var18 != null && var18.field31.method738() && (var18.field26 == var12 || var7 == var12) && (var18.field23 == var13 || var9 == var13)) {
                                            int var19 = var18.field25 + 1 - var18.field26;
                                            int var20 = var18.field34 + 1 - var18.field23;
                                            arg0.method736(var18.field31, (var18.field26 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field23 - arg3) * 128 + (var20 - arg5) * 64, var6);
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

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1514(int arg0, String arg1) {
        field3599++;
        if (arg0 != -8970) {
            field3595 = null;
        }
        String var2 = class200.method1255(class94.method604((byte) -111, arg1), false);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)V")
    public static final void method1515(int arg0) {
        field3591++;
        int var1 = class186.field2826.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class186.field2826[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class214.field3210; var4++) {
                    if (class48.field767[var2] == class161.field2474[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                int var5 = 0;
                if (var3 == -1) {
                    class161.field2474[class214.field3210] = class48.field767[var2];
                    var3 = class214.field3210++;
                }
                class248 var6 = new class248(class186.field2826[var2]);
                while (class186.field2826[var2].length > var6.field3748 && var5 < 511) {
                    int var7 = var3 | var5++ << 6;
                    int var8 = var6.method1575(false);
                    int var9 = (var8 & 0x1F81) >> 7;
                    int var10 = var8 >> 14;
                    int var11 = var8 & 0x3F;
                    int var12 = (class48.field767[var2] & 0xFF) * 64 + var11 - class147.field2141;
                    int var13 = (class48.field767[var2] >> 8) * 64 + var9 - class81.field1303;
                    class72 var14 = class267.method1783((byte) 87, var6.method1575(false));
                    if (class18.field220[var7] == null && (var14.field1191 & 0x1) > 0 && class79.field1273 == var10 && var13 >= 0 && (var14.field1148 + var13) < 104 && var12 >= 0 && (var12 + var14.field1148) < 104) {
                        class18.field220[var7] = new class61();
                        class61 var15 = class18.field220[var7];
                        class169.field2586[class24.field295++] = var7;
                        var15.field2278 = class270.field4058;
                        var15.method405(var14, (byte) 123);
                        var15.method930(94, var15.field959.field1148);
                        var15.field2233 = var15.field2273 = class248.field3760[var15.field959.field1164];
                        var15.field2269 = var15.field959.field1194;
                        var15.field2287 = var15.field959.field1176;
                        if (var15.field2269 == 0) {
                            var15.field2273 = 0;
                        }
                        var15.method929(var15.method676(-30217), true, var12, -1, var13);
                    }
                }
            }
        }
        if (arg0 <= 101) {
            field3593 = -91;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V")
    public static void method1516(boolean arg0) {
        field3595 = null;
        if (!arg0) {
            field3596 = null;
            field3600 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "(I)V")
    public static final void method1517(int arg0) {
        int var1 = -107 / ((arg0 + 5) / 63);
        field3594++;
        class86.field1383.method264((byte) 18);
        class110.field1705 = null;
        class282.field4211 = 1;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(II)V")
    public class239(int arg0, int arg1) {
        this.field3592 = arg1;
        this.field3597 = arg0;
    }
}
