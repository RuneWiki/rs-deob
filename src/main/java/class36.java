import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class36 extends class263 {

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "[I")
    public int[] field536 = new int[1];

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "[I")
    public int[] field541 = new int[] { -1 };

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Z")
    public static boolean field537 = false;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "Lub;")
    public static class20 field540;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method236(int arg0) {
        field540 = null;
        if (arg0 > -28) {
            field540 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)[Ljd;")
    public static final class216[] method237(int arg0) {
        if (arg0 != 22938) {
            method237(55);
        }
        field539++;
        return new class216[] { class653.field8904, class256.field3285, class89.field1148, class146.field1748, class435.field5476, class45.field613, class300.field3807, class677.field9226, class340.field4342, class613.field8335 };
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([I[IZIZ)J")
    private final long method238(int[] arg0, int[] arg1, boolean arg2, int arg3, boolean arg4) {
        field535++;
        long[] var6 = class225.field2913;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg3 >> 8) ^ var7) & 0xFFL)];
        long var11 = var6[(int) ((var9 ^ (long) arg3) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg0.length; var13++) {
            long var17 = var6[(int) (((long) (arg0[var13] >> 24) ^ var11) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var17 >>> 8 ^ var6[(int) (((long) (arg0[var13] >> 16) ^ var17) & 0xFFL)];
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg0[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var21 >>> 8 ^ var6[(int) (((long) arg0[var13] ^ var21) & 0xFFL)];
        }
        if (arg1 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg1[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        long var15 = var6[(int) ((var11 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)] ^ var11 >>> 8;
        return arg4 ? var15 : 110L;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILh;Loa;IIIIILcu;Z)Lba;")
    public final class359 method239(int arg0, class621 arg1, class650 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class207 arg8, boolean arg9) {
        field533++;
        class359 var11 = null;
        int var12 = arg3;
        class403 var13 = null;
        if (arg5 != -1) {
            var13 = class510.field6389.method2907(arg5, -85);
        }
        int[] var14 = this.field541;
        if (var13 != null && var13.field5199 != null) {
            var14 = new int[var13.field5199.length];
            for (int var15 = 0; var15 < var13.field5199.length; var15++) {
                int var16 = var13.field5199[var15];
                if (var16 >= 0 && var16 < this.field541.length) {
                    var14[var15] = this.field541[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        if (arg4 != -28254) {
            field540 = null;
        }
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class81 var24 = null;
        class81 var25 = null;
        if (arg8 != null) {
            var12 = arg3 | 0x20;
            int var26 = arg8.field2441[arg6];
            int var27 = var26 >>> 16;
            var24 = class11.field110.method1137(125, var27);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method619(arg4 + 28326, var21);
                var17 |= var24.method623(arg4 + 28379, var21);
                var20 |= var24.method624(1, var21);
                var19 |= arg8.field2433;
            }
            if ((arg8.field2434 || class493.field6139) && arg7 != -1 && arg7 < arg8.field2441.length) {
                int var28 = arg8.field2441[arg7];
                var23 = arg8.field2436[arg6];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class11.field110.method1137(127, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method619(70, var22);
                    var17 |= var25.method623(96, var22);
                    var20 |= var25.method624(1, var22);
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
        long var30 = this.method238(var14, arg1 == null ? null : arg1.field8431, arg9, arg5, true);
        if (class131.field1588 != null) {
            var11 = (class359) class131.field1588.method1221(var30, true);
        }
        if (var11 == null || arg2.method493(var11.method2075(), var12) != 0) {
            if (var11 != null) {
                var12 = arg2.method469(var12, var11.method2075());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class504.field6287.method1628(var14[var34], (byte) -123).method537((byte) 88, arg9)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class229[] var35 = new class229[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class504.field6287.method1628(var14[var36], (byte) -125).method538((byte) -118, arg9);
                }
            }
            if (var13 != null && var13.field5180 != null) {
                for (int var37 = 0; var37 < var13.field5180.length; var37++) {
                    if (var13.field5180[var37] != null && var35[var37] != null) {
                        int var38 = var13.field5180[var37][0];
                        int var39 = var13.field5180[var37][1];
                        int var40 = var13.field5180[var37][2];
                        int var41 = var13.field5180[var37][3];
                        int var42 = var13.field5180[var37][4];
                        int var43 = var13.field5180[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method1388(var43, 97, var42, var41);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method1394(var40, var39, var38, 256);
                        }
                    }
                }
            }
            if (arg1 != null) {
                var32 = var12 | 0x4000;
            }
            class229 var44 = new class229(var35, var35.length);
            var11 = arg2.method408(var44, var32, class583.field7840, 64, 850);
            if (arg1 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class540.field6821.length; var46++) {
                        if (arg1.field8431[var45] < class540.field6821[var46][var45].length) {
                            var11.method2080(class51.field654[var46][var45], class540.field6821[var46][var45][arg1.field8431[var45]]);
                        }
                    }
                }
            }
            if (class131.field1588 != null) {
                var11.method2069(var12);
                class131.field1588.method1230((byte) 113, var30, var11);
            }
        }
        if (arg8 == null || var24 == null) {
            return var11;
        } else {
            class359 var47 = var11.method951((byte) 1, var12, true);
            var47.method2065(var24, arg8.field2433, var22, var23, var21, var25, arg0 - 1, 0, arg4 + 28148);
            return var47;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)I")
    public static final int method240(int arg0, int arg1, int arg2) {
        field534++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg1 != 126) {
            method237(-100);
        }
        return (arg0 & 0xFF80) + var3;
    }
}
