import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class358 extends class159 {

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "[I")
    public int[] field5213 = new int[1];

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "[I")
    public int[] field5210 = new int[] { -1 };

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Ljb;")
    public static class519 field5211 = new class519(36, -1);

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 8)
    public static void method2269(int arg0) {
        field5211 = null;
        if (arg0 >= -76) {
            field5218 = 46;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZIIII)V", line = 18)
    public static final void method2270(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class233.field3099 >= arg3 && arg4 >= class291.field4156) {
            boolean var6;
            if (arg5 < class297.field4199) {
                var6 = false;
                arg5 = class297.field4199;
            } else if (class45.field472 < arg5) {
                arg5 = class45.field472;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class297.field4199 > arg2) {
                var7 = false;
                arg2 = class297.field4199;
            } else if (class45.field472 < arg2) {
                var7 = false;
                arg2 = class45.field472;
            } else {
                var7 = true;
            }
            if (arg3 < class291.field4156) {
                arg3 = class291.field4156;
            } else {
                class464.method2733(arg0, arg5, arg2, -22816, class228.field2951[arg3++]);
            }
            if (class233.field3099 < arg4) {
                arg4 = class233.field3099;
            } else {
                class464.method2733(arg0, arg5, arg2, -22816, class228.field2951[arg4--]);
            }
            if (var6 && var7) {
                for (int var8 = arg3; var8 <= arg4; var8++) {
                    int[] var9 = class228.field2951[var8];
                    var9[arg5] = var9[arg2] = arg0;
                }
            } else if (var6) {
                for (int var10 = arg3; var10 <= arg4; var10++) {
                    class228.field2951[var10][arg5] = arg0;
                }
            } else if (var7) {
                for (int var11 = arg3; var11 <= arg4; var11++) {
                    class228.field2951[var11][arg2] = arg0;
                }
            }
        }
        if (arg1) {
            field5211 = null;
        }
        field5214++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lmu;ZILha;IIIILvp;I)Lka;", line = 127)
    public final class497 method2271(class317 arg0, boolean arg1, int arg2, class66 arg3, int arg4, int arg5, int arg6, int arg7, class201 arg8, int arg9) {
        field5215++;
        class497 var11 = null;
        int var12 = arg5;
        class588 var13 = null;
        if (arg7 != -1) {
            var13 = class175.field2314.method2629(arg7, (byte) -41);
        }
        int[] var14 = this.field5210;
        if (var13 != null && var13.field7999 != null) {
            var14 = new int[var13.field7999.length];
            for (int var15 = 0; var15 < var13.field7999.length; var15++) {
                int var16 = var13.field7999[var15];
                if (var16 >= 0 && var16 < this.field5210.length) {
                    var14[var15] = this.field5210[var16];
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
        class236 var24 = null;
        class236 var25 = null;
        if (arg0 != null) {
            int var26 = arg0.field4493[arg9];
            var12 = arg5 | 0x20;
            int var27 = var26 >>> 16;
            var24 = class693.field9223.method2381((byte) 113, var27);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method1496(var21, -3);
                var17 |= var24.method1500(var21, -3);
                var20 |= var24.method1497(var21, (byte) -101);
                var19 |= arg0.field4477;
            }
            if ((arg0.field4474 || class779.field10699) && arg4 != -1 && arg0.field4493.length > arg4) {
                int var28 = arg0.field4493[arg4];
                var23 = arg0.field4485[arg9];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class693.field9223.method2381((byte) 117, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method1496(var22, arg2 - 3);
                    var17 |= var25.method1500(var22, -3);
                    var20 |= var25.method1497(var22, (byte) 98);
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
        long var30 = this.method2274(arg7, (byte) -23, var14, arg8 == null ? null : arg8.field2612, arg1);
        if (class685.field9165 != null) {
            var11 = (class497) class685.field9165.method3109((byte) 126, var30);
        }
        if (var11 == null || arg3.method520(var11.method260(), var12) != 0) {
            if (var11 != null) {
                var12 = arg3.method473(var12, var11.method260());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class16.field156.method2121(var14[var34], 25928).method2315(arg1, (byte) -37, null)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class625[] var35 = new class625[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class16.field156.method2121(var14[var36], 25928).method2310(class250.method1635(arg2, 0), arg1, null);
                }
            }
            if (var13 != null && var13.field8019 != null) {
                for (int var37 = 0; var37 < var13.field8019.length; var37++) {
                    if (var13.field8019[var37] != null && var35[var37] != null) {
                        int var38 = var13.field8019[var37][0];
                        int var39 = var13.field8019[var37][1];
                        int var40 = var13.field8019[var37][2];
                        int var41 = var13.field8019[var37][3];
                        int var42 = var13.field8019[var37][4];
                        int var43 = var13.field8019[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method3450(var43, var42, var41, 1);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method3453(0, var40, var39, var38);
                        }
                    }
                }
            }
            class625 var44 = new class625(var35, var35.length);
            if (arg8 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg3.method484(var44, var32, class550.field7586, 64, 850);
            if (arg8 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class511.field7120.length; var46++) {
                        if (arg8.field2612[var45] < class511.field7120[var46][var45].length) {
                            var11.method295(class448.field6453[var46][var45], class511.field7120[var46][var45][arg8.field2612[var45]]);
                        }
                    }
                }
            }
            if (class685.field9165 != null) {
                var11.method270(var12);
                class685.field9165.method3108(var30, 16337, var11);
            }
        }
        if (arg0 == null || var24 == null) {
            return var11;
        } else {
            class497 var47 = var11.method271((byte) 1, var12, true);
            var47.method2919(arg2, var21, var23, var22, var25, arg0.field4477, arg6 - 1, var24, 10);
            return var47;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([Lofa;ZBIII)V", line = 369)
    public static final void method2272(class347[] arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5) {
        field5216++;
        for (int var6 = 0; var6 < arg0.length; var6++) {
            class347 var7 = arg0[var6];
            if (var7 != null && var7.field4921 == arg4) {
                class454.method2699(arg1, arg5, arg3, var7, -109);
                class687.method3765(61, arg5, var7, arg3);
                if ((var7.field4946 - var7.field4986) < var7.field5004) {
                    var7.field5004 = var7.field4946 - var7.field4986;
                }
                if (var7.field4949 > (var7.field4978 - var7.field4940)) {
                    var7.field4949 = var7.field4978 - var7.field4940;
                }
                if (var7.field5004 < 0) {
                    var7.field5004 = 0;
                }
                if (var7.field4949 < 0) {
                    var7.field4949 = 0;
                }
                if (var7.field4884 == 0) {
                    class104.method799(arg1, var7, -1);
                }
            }
        }
        if (arg2 != -79) {
            field5218 = 106;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V", line = 413)
    public static final void method2273(int arg0) {
        if (arg0 != 0) {
            return;
        }
        for (class478 var1 = (class478) class645.field8695.method679((byte) -86); var1 != null; var1 = (class478) class645.field8695.method681(-17)) {
            if (class341.method2166(var1.field6718, 17)) {
                class189.method1262(var1, 7);
            }
        }
        field5219++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB[I[IZ)J", line = 442)
    private final long method2274(int arg0, byte arg1, int[] arg2, int[] arg3, boolean arg4) {
        field5212++;
        long[] var6 = class377.field5509;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg0 >> 8)) & 0xFFL)];
        if (arg1 != -23) {
            this.field5210 = null;
        }
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg0 ^ var9) & 0xFFL)];
        for (int var13 = 0; var13 < arg2.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg2[var13] >> 24)) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg2[var13] >> 16)) & 0xFFL)];
            long var21 = var6[(int) (((long) (arg2[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) (((long) arg2[var13] ^ var21) & 0xFFL)];
        }
        if (arg3 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg3[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var6[(int) (((long) (arg4 ? 1 : 0) ^ var11) & 0xFFL)] ^ var11 >>> 8;
    }
}
