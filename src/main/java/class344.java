import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class344 extends class513 {

    @OriginalMember(owner = "client!daa", name = "n", descriptor = "[I")
    public int[] field4391 = new int[1];

    @OriginalMember(owner = "client!daa", name = "o", descriptor = "[I")
    public int[] field4392 = new int[] { -1 };

    @OriginalMember(owner = "client!daa", name = "k", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!daa", name = "l", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!daa", name = "m", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(II[IZ[I)J", line = 6)
    private final long method1976(int arg0, int arg1, int[] arg2, boolean arg3, int[] arg4) {
        field4390++;
        long[] var6 = class696.field9710;
        long var7 = -1L;
        if (arg0 != -32725) {
            this.field4392 = null;
        }
        long var9 = var6[(int) (((long) (arg1 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var6[(int) ((var9 ^ (long) arg1) & 0xFFL)];
        for (int var13 = 0; var13 < arg4.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg4[var13] >> 24)) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg4[var13] >> 16)) & 0xFFL)];
            long var21 = var6[(int) ((var19 ^ (long) (arg4[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) (((long) arg4[var13] ^ var21) & 0xFFL)];
        }
        if (arg2 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) (((long) arg2[var14] ^ var11) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IB)I", line = 50)
    public static final int method1977(int arg0, byte arg1) {
        field4388++;
        if (arg0 == 16711935) {
            return -1;
        } else {
            if (arg1 != 88) {
                method1977(52, (byte) -13);
            }
            return class612.method3574((byte) -117, arg0);
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lha;IIIZLec;IIZLme;)Lka;", line = 69)
    public final class283 method1978(class545 arg0, int arg1, int arg2, int arg3, boolean arg4, class103 arg5, int arg6, int arg7, boolean arg8, class635 arg9) {
        field4389++;
        class283 var11 = null;
        int var12 = arg3;
        class591 var13 = null;
        if (arg1 != -1) {
            var13 = class544.field7653.method1644(arg1, (byte) 25);
        }
        int[] var14 = this.field4392;
        if (var13 != null && var13.field8512 != null) {
            var14 = new int[var13.field8512.length];
            for (int var15 = 0; var15 < var13.field8512.length; var15++) {
                int var16 = var13.field8512[var15];
                if (var16 >= 0 && var16 < this.field4392.length) {
                    var14[var15] = this.field4392[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = arg8;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class154 var24 = null;
        class154 var25 = null;
        if (arg5 != null) {
            int var26 = arg5.field1472[arg6];
            var12 = arg3 | 0x20;
            int var27 = var26 >>> 16;
            var24 = class274.field3684.method1883(-106, var27);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 = arg8 | var24.method980((byte) -49, var21);
                var17 |= var24.method979(var21, 120);
                var20 |= var24.method977(var21, 1);
                var19 |= arg5.field1489;
            }
            if ((arg5.field1480 || class729.field10218) && arg7 != -1 && arg5.field1472.length > arg7) {
                int var28 = arg5.field1472[arg7];
                var23 = arg5.field1493[arg6];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class274.field3684.method1883(-125, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method980((byte) -49, var22);
                    var17 |= var25.method979(var22, 102);
                    var20 |= var25.method977(var22, 1);
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
        long var30 = this.method1976(-32725, arg1, arg9 == null ? null : arg9.field9041, arg4, var14);
        if (class202.field2911 != null) {
            var11 = (class283) class202.field2911.method3200(var30, -19983);
        }
        if (var11 == null || arg0.method2105(var11.method1135(), var12) != 0) {
            if (var11 != null) {
                var12 = arg0.method2101(var12, var11.method1135());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class487.field6572.method3054(var14[var34], (byte) -99).method3250((byte) 121, arg4)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class64[] var35 = new class64[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class487.field6572.method3054(var14[var36], (byte) -99).method3233(arg4, 28887);
                }
            }
            if (var13 != null && var13.field8502 != null) {
                for (int var37 = 0; var37 < var13.field8502.length; var37++) {
                    if (var13.field8502[var37] != null && var35[var37] != null) {
                        int var38 = var13.field8502[var37][0];
                        int var39 = var13.field8502[var37][1];
                        int var40 = var13.field8502[var37][2];
                        int var41 = var13.field8502[var37][3];
                        int var42 = var13.field8502[var37][4];
                        int var43 = var13.field8502[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method422(-108, var43, var42, var41);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method425(-82, var38, var40, var39);
                        }
                    }
                }
            }
            class64 var44 = new class64(var35, var35.length);
            if (arg9 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg0.method2222(var44, var32, class76.field1040, 64, 850);
            if (arg9 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class5.field44.length; var46++) {
                        if (class5.field44[var46][var45].length > arg9.field9041[var45]) {
                            var11.method1134(class672.field9453[var46][var45], class5.field44[var46][var45][arg9.field9041[var45]]);
                        }
                    }
                }
            }
            if (class202.field2911 != null) {
                var11.method1118(var12);
                class202.field2911.method3199((byte) 78, var11, var30);
            }
        }
        if (arg5 == null || var24 == null) {
            return var11;
        } else {
            class283 var47 = var11.method1147((byte) 1, var12, true);
            var47.method1691(var24, arg2 - 1, var21, 0, var22, var25, 65535, arg5.field1489, var23);
            return var47;
        }
    }
}
