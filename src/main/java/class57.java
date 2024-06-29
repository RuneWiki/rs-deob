import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class57 extends class311 {

    @OriginalMember(owner = "client!f", name = "r", descriptor = "[I")
    public int[] field739 = new int[1];

    @OriginalMember(owner = "client!f", name = "t", descriptor = "[I")
    public int[] field741 = new int[] { -1 };

    @OriginalMember(owner = "client!f", name = "s", descriptor = "Lhc;")
    public static class368 field740 = new class368("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    public static void method445(int arg0) {
        field740 = null;
        if (arg0 != -18119) {
            field743 = 10;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI[I[II)J")
    private final long method446(boolean arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        field737++;
        long[] var6 = class451.field6494;
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg4 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var6[(int) (((long) arg4 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        if (arg1 != 2009478088) {
            method447(-116, false, 117, -53);
        }
        for (int var13 = 0; var13 < arg3.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) (((long) (arg3[var13] >> 24) ^ var11) & 0xFFL)];
            long var19 = var6[(int) (((long) (arg3[var13] >> 16) ^ var17) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var19 >>> 8 ^ var6[(int) ((var19 ^ (long) (arg3[var13] >> 8)) & 0xFFL)];
            var11 = var6[(int) (((long) arg3[var13] ^ var21) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg2 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) (((long) arg2[var14] ^ var11) & 0xFFL)];
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg0 ? 1 : 0) ^ var11) & 0xFFL)];
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZII)I")
    public static final int method447(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field742++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            if (!arg1) {
                field740 = null;
            }
            return 1023 - arg3;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILcc;ZZIILi;IILea;)Lts;")
    public final class116 method448(int arg0, class339 arg1, boolean arg2, boolean arg3, int arg4, int arg5, class83 arg6, int arg7, int arg8, class58 arg9) {
        field738++;
        class116 var11 = null;
        int var12 = arg5;
        class60 var13 = null;
        if (arg8 != -1) {
            var13 = class323.method1972(70, arg8);
        }
        int[] var14 = this.field741;
        if (var13 != null && var13.field768 != null) {
            var14 = new int[var13.field768.length];
            for (int var15 = 0; var15 < var13.field768.length; var15++) {
                int var16 = var13.field768[var15];
                if (var16 >= 0 && this.field741.length > var16) {
                    var14[var15] = this.field741[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = arg2;
        boolean var19 = false;
        int var20 = -1;
        int var21 = -1;
        int var22 = 0;
        class182 var23 = null;
        class182 var24 = null;
        if (arg6 != null) {
            var12 = arg5 | 0x20;
            int var25 = arg6.field1145[arg7];
            int var26 = var25 >>> 16;
            var20 = var25 & 0xFFFF;
            var23 = class25.method153(0, var26);
            if (var23 != null) {
                var18 = arg2 | var23.method1272((byte) 126, var20);
                var17 |= var23.method1271(var20, (byte) 93);
                var19 |= arg6.field1143;
            }
            if ((arg6.field1146 || class196.field2845) && arg0 != -1 && arg6.field1145.length > arg0) {
                int var27 = arg6.field1145[arg0];
                var22 = arg6.field1144[arg7];
                int var28 = var27 >>> 16;
                var21 = var27 & 0xFFFF;
                if (var26 == var28) {
                    var24 = var23;
                } else {
                    var24 = class25.method153(0, var21 >>> 16);
                }
                if (var24 != null) {
                    var18 |= var24.method1272((byte) 114, var21);
                    var17 |= var24.method1271(var21, (byte) 93);
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
        }
        long var29 = this.method446(arg3, 2009478088, arg1 == null ? null : arg1.field4584, var14, arg8);
        if (class447.field6315 != null) {
            var11 = (class116) class447.field6315.method2529(0, var29);
        }
        if (var11 == null || arg9.method187(var11.method866(), var12) != 0) {
            if (var11 != null) {
                var12 = arg9.method213(var12, var11.method866());
            }
            int var31 = var12;
            boolean var32 = false;
            for (int var33 = 0; var33 < var14.length; var33++) {
                if (var14[var33] != -1 && !class367.method2308(false, var14[var33]).method76(arg3, 103)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class98[] var34 = new class98[var14.length];
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1) {
                    var34[var35] = class367.method2308(false, var14[var35]).method83(arg3, (byte) 62);
                }
            }
            if (var13 != null && var13.field788 != null) {
                for (int var36 = 0; var36 < var13.field788.length; var36++) {
                    if (var13.field788[var36] != null && var34[var36] != null) {
                        int var37 = var13.field788[var36][0];
                        int var38 = var13.field788[var36][1];
                        int var39 = var13.field788[var36][2];
                        int var40 = var13.field788[var36][3];
                        int var41 = var13.field788[var36][4];
                        int var42 = var13.field788[var36][5];
                        if (var40 != 0 || var41 != 0 || var42 != 0) {
                            var34[var36].method756(var41, (byte) 126, var40, var42);
                        }
                        if (var37 != 0 || var38 != 0 || var39 != 0) {
                            var34[var36].method762((byte) -128, var37, var39, var38);
                        }
                    }
                }
            }
            class98 var43 = new class98(var34, var34.length);
            if (arg1 != null) {
                var31 = var12 | 0x2000;
            }
            var11 = arg9.method254(var43, var31, class217.field3053, 64, 850);
            if (arg1 != null) {
                for (int var44 = 0; var44 < 5; var44++) {
                    if (class215.field3017[var44].length > arg1.field4584[var44]) {
                        var11.method909(class194.field2808[var44], class215.field3017[var44][arg1.field4584[var44]]);
                    }
                    if (class101.field1391[var44].length > arg1.field4584[var44]) {
                        var11.method909(class419.field5820[var44], class101.field1391[var44][arg1.field4584[var44]]);
                    }
                }
            }
            if (class447.field6315 != null) {
                var11.method897(var12);
                class447.field6315.method2527(78, var29, var11);
            }
        }
        if (arg6 == null || var23 == null) {
            return var11;
        } else {
            class116 var45 = var11.method907((byte) 1, var12, true);
            var45.method891(var22, arg6.field1143, 0, var20, var21, var23, var24, 0, arg4 - 1);
            return var45;
        }
    }
}
