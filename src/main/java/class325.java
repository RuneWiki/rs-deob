import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class325 {

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public static int field5251 = 0;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "[I")
    public static int[] field5248 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field5246 = 0;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "Lek;")
    public static class206 field5247;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "Lek;")
    public static class206 field5249;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "[I")
    public static int[] field5245;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Loe;I)V", line = 10)
    public static final void method2327(class146 arg0, int arg1) {
        field5244++;
        int var2 = class38.field823 >> 1;
        int var3 = class38.field819 >> 2 << 10;
        byte[][] var4 = new byte[class38.field824][class38.field821];
        while (arg0.field2435 < arg0.field2496.length) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg0.method1005((byte) 122) == 1) {
                var5 = true;
                var7 = arg0.method1005((byte) 122);
                var6 = arg0.method1005((byte) 122);
            }
            int var8 = arg0.method1005((byte) 122);
            int var9 = arg0.method1005((byte) 122);
            int var10 = var8 * 64 - class38.field826;
            int var11 = class38.field821 - (var9 * 64 - class38.field820) - 1;
            if (var10 >= 0 && var11 - 63 >= 0 && class38.field824 > (var10 + 63) && var11 < class38.field821) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var12 >= (var7 * 8) && var12 < (var7 * 8 + 8) && (var6 * 8) <= var14 && (var6 * 8 + 8) > var14) {
                            var13[var11 - var14] = arg0.method1029(-2);
                        }
                    }
                }
            } else if (var5) {
                arg0.field2435 += 64;
            } else {
                arg0.field2435 += 4096;
            }
        }
        int var15 = class38.field824;
        int var16 = class38.field821;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        if (arg1 != 1) {
            field5247 = (class206) null;
        }
        for (int var22 = -5; var22 < var15; var22++) {
            if ((var22 & 0x1FF) == 0) {
                class155.method1102(-13402, true);
            }
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var15) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class129 var26 = class56.method478((byte) -11, var25 - 1);
                        var18[var23] += var26.field2249;
                        var17[var23] += var26.field2246;
                        var21[var23] += var26.field2241;
                        var19[var23] += var26.field2245;
                        var10002 = var20[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class129 var29 = class56.method478((byte) -11, var28 - 1);
                        var18[var23] -= var29.field2249;
                        var17[var23] -= var29.field2246;
                        var21[var23] -= var29.field2241;
                        var19[var23] -= var29.field2245;
                        var10002 = var20[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int var30 = 0;
                int[][] var31 = class38.field843[var22 >> 6];
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 + 5;
                    if (var37 < var16) {
                        var35 += var19[var37];
                        var34 += var20[var37];
                        var32 += var17[var37];
                        var30 += var18[var37];
                        var33 += var21[var37];
                    }
                    int var38 = var36 - 5;
                    if (var38 >= 0) {
                        var35 -= var19[var38];
                        var32 -= var17[var38];
                        var33 -= var21[var38];
                        var30 -= var18[var38];
                        var34 -= var20[var38];
                    }
                    if (var36 >= 0 && var34 > 0) {
                        int[] var39 = var31[var36 >> 6];
                        int var40 = var35 == 0 ? 0 : class136.method954(var30 * 256 / var35, -120, var32 / var34, var33 / var34);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var31[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var2;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var40 & 0x380) + ((var3 + var40 & 0xFC00) + var41);
                            var39[class83.method613(63, var22) + (class83.method613(var36, 63) << 6)] = class305.field4956[class68.method529(3, 96, var42)];
                        } else if (var39 != null) {
                            var39[class83.method613(63, var22) + class83.method613(var36 << 6, 4032)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 242)
    public static void method2328(int arg0) {
        if (arg0 != 1167582314) {
            field5246 = -48;
        }
        field5248 = null;
        field5249 = null;
        field5247 = null;
        field5245 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZI)V", line = 266)
    public static final void method2329(boolean arg0, int arg1) {
        class173.field2874.method896(arg1, (byte) -97);
        field5250++;
        if (arg0) {
            method2327((class146) null, -121);
        }
        class235.field3846.method896(arg1, (byte) -55);
    }
}
