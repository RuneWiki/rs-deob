import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class327 extends class435 {

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "[I")
    public int[] field4346 = new int[1];

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "[I")
    public int[] field4350 = new int[] { -1 };

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "Lio;")
    public static class303 field4349 = null;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public static int field4351 = 0;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "F")
    public static float field4352;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([II[IZI)J")
    private final long method1924(int[] arg0, int arg1, int[] arg2, boolean arg3, int arg4) {
        field4344++;
        long[] var6 = class6.field77;
        long var7 = -1L;
        long var9 = var6[(int) ((var7 ^ (long) (arg4 >> 8)) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg4 ^ var9) & 0xFFL)];
        for (int var13 = arg1; var13 < arg0.length; var13++) {
            long var17 = var6[(int) ((var11 ^ (long) (arg0[var13] >> 24)) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var6[(int) (((long) (arg0[var13] >> 16) ^ var17) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var6[(int) ((var19 ^ (long) (arg0[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var6[(int) ((var21 ^ (long) arg0[var13]) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg2 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg2[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Loj;IIILza;ILoe;IIZ)Le;")
    public final class373 method1925(class260 arg0, int arg1, int arg2, int arg3, class287 arg4, int arg5, class136 arg6, int arg7, int arg8, boolean arg9) {
        field4348++;
        class373 var11 = null;
        int var12 = arg7;
        class306 var13 = null;
        if (arg1 != -1) {
            var13 = class254.field3381.method1921(arg1, (byte) 33);
        }
        int[] var14 = this.field4350;
        if (var13 != null && var13.field4078 != null) {
            var14 = new int[var13.field4078.length];
            for (int var15 = 0; var15 < var13.field4078.length; var15++) {
                int var16 = var13.field4078[var15];
                if (var16 >= 0 && var16 < this.field4350.length) {
                    var14[var15] = this.field4350[var16];
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
        class516 var24 = null;
        class516 var25 = null;
        if (arg0 != null) {
            int var26 = arg0.field3474[arg2];
            var12 = arg7 | 0x20;
            int var27 = var26 >>> 16;
            var24 = class7.field97.method2953(15, var27);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method3077(var21, (byte) 53);
                var17 |= var24.method3073(var21, true);
                var20 |= var24.method3072(var21, 2693);
                var19 |= arg0.field3493;
            }
            if ((arg0.field3470 || class134.field1761) && arg3 != -1 && arg0.field3474.length > arg3) {
                int var28 = arg0.field3474[arg3];
                var23 = arg0.field3489[arg2];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class7.field97.method2953(arg8 ^ 0x8F, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method3077(var22, (byte) 53);
                    var17 |= var25.method3073(var22, true);
                    var20 |= var25.method3072(var22, 2693);
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
        long var30 = this.method1924(var14, arg8 ^ arg8, arg6 == null ? null : arg6.field1809, arg9, arg1);
        if (class136.field1816 != null) {
            var11 = (class373) class136.field1816.method3032(arg8 ^ 0xE85, var30);
        }
        if (var11 == null || arg4.method1191(var11.method2025(), var12) != 0) {
            if (var11 != null) {
                var12 = arg4.method1211(var12, var11.method2025());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class237.field3158.method236(-18315, var14[var34]).method1268(30591, arg9)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class131[] var35 = new class131[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class237.field3158.method236(class335.method1958(arg8, -18187), var14[var36]).method1286(121, arg9);
                }
            }
            if (var13 != null && var13.field4069 != null) {
                for (int var37 = 0; var37 < var13.field4069.length; var37++) {
                    if (var13.field4069[var37] != null && var35[var37] != null) {
                        int var38 = var13.field4069[var37][0];
                        int var39 = var13.field4069[var37][1];
                        int var40 = var13.field4069[var37][2];
                        int var41 = var13.field4069[var37][3];
                        int var42 = var13.field4069[var37][4];
                        int var43 = var13.field4069[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method786(var41, false, var42, var43);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method795(var38, var40, true, var39);
                        }
                    }
                }
            }
            class131 var44 = new class131(var35, var35.length);
            if (arg6 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg4.method1213(var44, var32, class5.field52, 64, 850);
            if (arg6 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (class115.field1509[var45].length > arg6.field1809[var45]) {
                        var11.method2032(class109.field1463[var45], class115.field1509[var45][arg6.field1809[var45]]);
                    }
                    if (class29.field280[var45].length > arg6.field1809[var45]) {
                        var11.method2032(class495.field7232[var45], class29.field280[var45][arg6.field1809[var45]]);
                    }
                }
            }
            if (class136.field1816 != null) {
                var11.method2034(var12);
                class136.field1816.method3046(var30, var11, arg8 - 127);
            }
        }
        if (arg0 == null || var24 == null) {
            return var11;
        } else {
            class373 var46 = var11.method2027((byte) 1, var12, true);
            var46.method2208(var24, 0, var23, arg5 - 1, var22, var21, 1, arg0.field3493, var25);
            return var46;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[[BLsv;)V")
    public static final void method1926(int arg0, byte[][] arg1, class472 arg2) {
        field4347++;
        int var3 = class31.field318.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class467.field6937[var4] >> 8) * 64 - class357.field4867;
                int var7 = (class467.field6937[var4] & 0xFF) * 64 - class418.field6074;
                class466.method2847(false);
                arg2.method2880(var6, true, var7, class343.field4596, var5, class96.field1223);
            }
        }
        if (arg0 < 17) {
            method1926(-51, null, null);
        }
    }
}
