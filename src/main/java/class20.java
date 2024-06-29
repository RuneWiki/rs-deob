import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class20 extends class171 {

    @OriginalMember(owner = "client!he", name = "q", descriptor = "[B")
    public byte[] field283;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "[I")
    public static int[] field290 = new int[1000];

    @OriginalMember(owner = "client!he", name = "y", descriptor = "Z")
    public static boolean field291 = true;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field284 = 0;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "[I")
    public static int[] field288 = new int[256];

    @OriginalMember(owner = "client!he", name = "t", descriptor = "Lab;")
    public static class148 field286 = new class148();

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "Lo;")
    public static class254 field285;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V")
    public static final void method148(byte arg0) {
        class165.field2281 = null;
        field292++;
        if (arg0 < 126) {
            method148((byte) -106);
        }
        class41.field615 = null;
        class177.field2484 = null;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "([B)V")
    public class20(byte[] arg0) {
        this.field283 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I[III[Ljava/lang/Object;)V")
    public static final void method149(int arg0, int[] arg1, int arg2, int arg3, Object[] arg4) {
        if (arg0 < arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg1[var5];
            int var7 = arg0;
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var6;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var8;
            for (int var9 = arg0; var9 < arg2; var9++) {
                if ((var9 & 0x1) + var6 > arg1[var9]) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var7];
                    arg1[var7] = var10;
                    Object var11 = arg4[var9];
                    arg4[var9] = arg4[var7];
                    arg4[var7++] = var11;
                }
            }
            arg1[arg2] = arg1[var7];
            arg1[var7] = var6;
            arg4[arg2] = arg4[var7];
            arg4[var7] = var8;
            method149(arg0, arg1, var7 - 1, -1, arg4);
            method149(var7 + 1, arg1, arg2, -1, arg4);
        }
        if (arg3 != -1) {
            field288 = null;
        }
        field287++;
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V")
    public static void method150(int arg0) {
        if (arg0 != -28475) {
            method151((class224) null, -5);
        }
        field290 = null;
        field285 = null;
        field286 = null;
        field288 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lql;I)V")
    public static final void method151(class224 arg0, int arg1) {
        if (arg1 != 12995) {
            return;
        }
        field289++;
        while (true) {
            while (arg0.field3336.length > arg0.field3402) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1453((byte) -128) == 1) {
                    var4 = arg0.method1453((byte) -127);
                    var3 = arg0.method1453((byte) -127);
                    var2 = true;
                }
                int var5 = arg0.method1453((byte) -128);
                int var6 = arg0.method1453((byte) -127);
                int var7 = var5 * 64 - class164.field2273;
                int var8 = class41.field605 + class142.field1972 - var6 * 64 - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && var7 + 63 < class138.field1929 && class41.field605 > var8) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var4 * 8 && (var4 * 8 + 8) > var11 && var12 >= var3 * 8 && var12 < (var3 * 8 + 8)) {
                                byte var13 = arg0.method1437((byte) -86);
                                if (var13 != 0) {
                                    if (class253.field3877[var10][var9] == null) {
                                        class253.field3877[var10][var9] = new byte[4096];
                                    }
                                    class253.field3877[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method1437((byte) -86);
                                    if (class251.field3836[var10][var9] == null) {
                                        class251.field3836[var10][var9] = new byte[4096];
                                    }
                                    class251.field3836[var10][var9][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method1437((byte) -125);
                        if (var16 != 0) {
                            arg0.field3402++;
                        }
                    }
                }
            }
            return;
        }
    }
}
