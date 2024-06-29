import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class110 extends class223 {

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "[I")
    public int[] field1558 = new int[] { -1 };

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "[I")
    public int[] field1555 = new int[1];

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "Lqq;")
    public static class332 field1554;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "Lid;")
    public static class412 field1553;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZBILlp;IILcj;ILya;)Lt;")
    public final class471 method900(int arg0, boolean arg1, byte arg2, int arg3, class267 arg4, int arg5, int arg6, class488 arg7, int arg8, class38 arg9) {
        field1559++;
        class471 var11 = null;
        int var12 = arg0;
        class531 var13 = null;
        if (arg6 != -1) {
            var13 = class284.field4134.method2499(false, arg6);
        }
        int[] var14 = this.field1558;
        if (var13 != null && var13.field7810 != null) {
            var14 = new int[var13.field7810.length];
            for (int var15 = 0; var15 < var13.field7810.length; var15++) {
                int var16 = var13.field7810[var15];
                if (var16 >= 0 && var16 < this.field1558.length) {
                    var14[var15] = this.field1558[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        if (arg2 != 117) {
            return null;
        }
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class367 var24 = null;
        class367 var25 = null;
        if (arg4 != null) {
            var12 = arg0 | 0x20;
            int var26 = arg4.field3919[arg8];
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class153.field2169.method1579(var27, 1);
            if (var24 != null) {
                var18 |= var24.method2265((byte) -50, var21);
                var17 |= var24.method2272(arg2 ^ 0xFFFFE7CB, var21);
                var20 |= var24.method2273(var21, (byte) 110);
                var19 |= arg4.field3938;
            }
            if ((arg4.field3927 || class447.field6599) && arg3 != -1 && arg4.field3919.length > arg3) {
                int var28 = arg4.field3919[arg3];
                var23 = arg4.field3940[arg8];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class153.field2169.method1579(var22 >>> 16, 1);
                }
                if (var25 != null) {
                    var18 |= var25.method2265((byte) -107, var22);
                    var17 |= var25.method2272(arg2 ^ 0xFFFFE7CB, var22);
                    var20 |= var25.method2273(var22, (byte) 114);
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
        long var30 = this.method902(var14, arg6, arg1, -1511670520, arg7 == null ? null : arg7.field7175);
        if (class429.field6321 != null) {
            var11 = (class471) class429.field6321.method1115(var30, (byte) 58);
        }
        if (var11 == null || arg9.method335(var11.method459(), var12) != 0) {
            if (var11 != null) {
                var12 = arg9.method351(var12, var11.method459());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class270.field3995.method6(arg2 + 22766, var14[var34]).method682(arg2 ^ 0xFFFFFF8A, arg1)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class353[] var35 = new class353[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class270.field3995.method6(class429.method2613(arg2, 22806), var14[var36]).method681(arg1, 0);
                }
            }
            if (var13 != null && var13.field7796 != null) {
                for (int var37 = 0; var37 < var13.field7796.length; var37++) {
                    if (var13.field7796[var37] != null && var35[var37] != null) {
                        int var38 = var13.field7796[var37][0];
                        int var39 = var13.field7796[var37][1];
                        int var40 = var13.field7796[var37][2];
                        int var41 = var13.field7796[var37][3];
                        int var42 = var13.field7796[var37][4];
                        int var43 = var13.field7796[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method2136(var41, var42, var43, (byte) 123);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method2124(var39, var38, var40, -38);
                        }
                    }
                }
            }
            class353 var44 = new class353(var35, var35.length);
            if (arg7 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg9.method314(var44, var32, class2.field12, 64, 850);
            if (arg7 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (class29.field363[var45].length > arg7.field7175[var45]) {
                        var11.method467(class473.field6981[var45], class29.field363[var45][arg7.field7175[var45]]);
                    }
                    if (class20.field229[var45].length > arg7.field7175[var45]) {
                        var11.method467(class223.field3270[var45], class20.field229[var45][arg7.field7175[var45]]);
                    }
                }
            }
            if (class429.field6321 != null) {
                var11.method465(var12);
                class429.field6321.method1107(1, var30, var11);
            }
        }
        if (arg4 == null || var24 == null) {
            return var11;
        } else {
            class471 var46 = var11.method458((byte) 1, var12, true);
            var46.method2849(0, var23, arg4.field3938, var21, var22, var24, var25, arg5 - 1, arg2 + -117);
            return var46;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public static void method901(boolean arg0) {
        field1554 = null;
        field1553 = null;
        if (arg0) {
            field1552 = -95;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([IIZI[I)J")
    private final long method902(int[] arg0, int arg1, boolean arg2, int arg3, int[] arg4) {
        field1556++;
        long[] var6 = class503.field7463;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg1 >> 8) ^ var7) & 0xFFL)];
        long var11 = var6[(int) ((var9 ^ (long) arg1) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg0.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) (((long) (arg0[var13] >> 24) ^ var11) & 0xFFL)];
            long var19 = var6[(int) (((long) (arg0[var13] >> 16) ^ var17) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var6[(int) ((var19 ^ (long) (arg0[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var6[(int) (((long) arg0[var13] ^ var21) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg4 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg4[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        long var15 = var11 >>> 8 ^ var6[(int) (((long) (arg2 ? 1 : 0) ^ var11) & 0xFFL)];
        return arg3 == -1511670520 ? var15 : 125L;
    }

    static {
        new class331("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        field1552 = 1401;
        field1557 = 0;
    }
}
