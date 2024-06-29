import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class569 extends class435 {

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "[I")
    public int[] field8313 = new int[1];

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "[I")
    public int[] field8318 = new int[] { -1 };

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public static int field8314 = -1;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "[B")
    public static byte[] field8317 = new byte[2048];

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field8315;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method3320(int arg0) {
        field8317 = null;
        if (arg0 != -1) {
            field8314 = -120;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BIZ[I[I)J")
    private final long method3321(byte arg0, int arg1, boolean arg2, int[] arg3, int[] arg4) {
        field8315++;
        long[] var6 = class507.field7528;
        long var7 = -1L;
        int var9 = -62 % ((arg0 + 26) / 43);
        long var10 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg1 >> 8)) & 0xFFL)];
        long var12 = var6[(int) (((long) arg1 ^ var10) & 0xFFL)] ^ var10 >>> 8;
        for (int var14 = 0; var14 < arg3.length; var14++) {
            long var18 = var6[(int) ((var12 ^ (long) (arg3[var14] >> 24)) & 0xFFL)] ^ var12 >>> 8;
            long var20 = var6[(int) (((long) (arg3[var14] >> 16) ^ var18) & 0xFFL)] ^ var18 >>> 8;
            long var22 = var20 >>> 8 ^ var6[(int) ((var20 ^ (long) (arg3[var14] >> 8)) & 0xFFL)];
            var12 = var22 >>> 8 ^ var6[(int) (((long) arg3[var14] ^ var22) & 0xFFL)];
        }
        if (arg4 != null) {
            for (int var15 = 0; var15 < 5; var15++) {
                var12 = var12 >>> 8 ^ var6[(int) ((var12 ^ (long) arg4[var15]) & 0xFFL)];
            }
        }
        return var12 >>> 8 ^ var6[(int) (((long) (arg2 ? 1 : 0) ^ var12) & 0xFFL)];
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Llw;Lfo;Lr;ZBIIIII)Lda;")
    public final class397 method3322(class188 arg0, class606 arg1, class98 arg2, boolean arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field8316++;
        class397 var11 = null;
        int var12 = arg9;
        class674 var13 = null;
        if (arg7 != -1) {
            var13 = class625.field8919.method975(32, arg7);
        }
        int[] var14 = this.field8318;
        if (var13 != null && var13.field9602 != null) {
            var14 = new int[var13.field9602.length];
            for (int var15 = 0; var15 < var13.field9602.length; var15++) {
                int var16 = var13.field9602[var15];
                if (var16 >= 0 && this.field8318.length > var16) {
                    var14[var15] = this.field8318[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class374 var24 = null;
        class374 var25 = null;
        if (arg1 != null) {
            var12 = arg9 | 0x20;
            int var26 = arg1.field8707[arg5];
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class480.field6871.method1421((byte) 47, var27);
            if (var24 != null) {
                var18 |= var24.method2238(1, var21);
                var17 |= var24.method2234(var21, (byte) 61);
                var20 |= var24.method2235(-29895, var21);
                var19 |= arg1.field8717;
            }
            if ((arg1.field8703 || class61.field888) && arg8 != -1 && arg8 < arg1.field8707.length) {
                var23 = arg1.field8699[arg5];
                int var28 = arg1.field8707[arg8];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class480.field6871.method1421((byte) 71, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method2238(1, var22);
                    var17 |= var25.method2234(var22, (byte) 61);
                    var20 |= var25.method2235(arg4 - 29953, var22);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        if (arg4 != 58) {
            return null;
        }
        long var30 = this.method3321((byte) -120, arg7, arg3, var14, arg0 == null ? null : arg0.field2937);
        if (class351.field4936 != null) {
            var11 = (class397) class351.field4936.method941(var30, 0);
        }
        if (var11 == null || arg2.method754(var11.method468(), var12) != 0) {
            if (var11 != null) {
                var12 = arg2.method738(var12, var11.method468());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class430.field6132.method42(var14[var34], false).method2525((byte) 64, arg3)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class163[] var35 = new class163[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class430.field6132.method42(var14[var36], false).method2535(0, arg3);
                }
            }
            if (var13 != null && var13.field9600 != null) {
                for (int var37 = 0; var37 < var13.field9600.length; var37++) {
                    if (var13.field9600[var37] != null && var35[var37] != null) {
                        int var38 = var13.field9600[var37][0];
                        int var39 = var13.field9600[var37][1];
                        int var40 = var13.field9600[var37][2];
                        int var41 = var13.field9600[var37][3];
                        int var42 = var13.field9600[var37][4];
                        int var43 = var13.field9600[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method1245(var43, var41, var42, arg4 - 58);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method1240((byte) 116, var39, var40, var38);
                        }
                    }
                }
            }
            class163 var44 = new class163(var35, var35.length);
            if (arg0 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg2.method795(var44, var32, class273.field3906, 64, 850);
            if (arg0 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class583.field8544.length; var46++) {
                        if (arg0.field2937[var45] < class583.field8544[var46][var45].length) {
                            var11.method464(class78.field1198[var46][var45], class583.field8544[var46][var45][arg0.field2937[var45]]);
                        }
                    }
                }
            }
            if (class351.field4936 != null) {
                var11.method438(var12);
                class351.field4936.method949(var30, true, var11);
            }
        }
        if (arg1 == null || var24 == null) {
            return var11;
        } else {
            class397 var47 = var11.method475((byte) 1, var12, true);
            var47.method2418(0, arg1.field8717, var23, var25, var22, arg6 - 1, -1, var21, var24);
            return var47;
        }
    }
}
