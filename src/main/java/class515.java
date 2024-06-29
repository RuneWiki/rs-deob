import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class515 extends class168 {

    @OriginalMember(owner = "client!uca", name = "o", descriptor = "[I")
    public int[] field7226 = new int[] { -1 };

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "[I")
    public int[] field7228 = new int[1];

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "Lde;")
    public static class534 field7222 = new class534(10);

    @OriginalMember(owner = "client!uca", name = "j", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IILha;Lqe;ZZIIILmk;)Lka;")
    public final class474 method2995(int arg0, int arg1, class60 arg2, class470 arg3, boolean arg4, boolean arg5, int arg6, int arg7, int arg8, class56 arg9) {
        field7223++;
        class474 var11 = null;
        int var12 = arg0;
        class738 var13 = null;
        if (arg8 != -1) {
            var13 = class729.field10151.method1210(32, arg8);
        }
        int[] var14 = this.field7226;
        if (var13 != null && var13.field10248 != null) {
            var14 = new int[var13.field10248.length];
            for (int var15 = 0; var15 < var13.field10248.length; var15++) {
                int var16 = var13.field10248[var15];
                if (var16 >= 0 && this.field7226.length > var16) {
                    var14[var15] = this.field7226[var16];
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
        class701 var24 = null;
        class701 var25 = null;
        if (arg9 != null) {
            int var26 = arg9.field771[arg6];
            var12 = arg0 | 0x20;
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class66.field941.method1298(var27, -80);
            if (var24 != null) {
                var18 |= var24.method3947(var21, (byte) 85);
                var17 |= var24.method3943(var21, (byte) -110);
                var20 |= var24.method3942(var21, (byte) -43);
                var19 |= arg9.field792;
            }
            if ((arg9.field777 || class130.field1838) && arg1 != -1 && arg1 < arg9.field771.length) {
                int var28 = arg9.field771[arg1];
                var23 = arg9.field773[arg6];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class66.field941.method1298(var22 >>> 16, -99);
                }
                if (var25 != null) {
                    var18 |= var25.method3947(var22, (byte) 117);
                    var17 |= var25.method3943(var22, (byte) 3);
                    var20 |= var25.method3942(var22, (byte) -122);
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
        long var30 = this.method2999(arg3 == null ? null : arg3.field6297, arg8, arg4, -24823, var14);
        if (field7222 != null) {
            var11 = (class474) field7222.method3079(var30, 0);
        }
        if (var11 == null || arg2.method542(var11.method272(), var12) != 0) {
            if (var11 != null) {
                var12 = arg2.method484(var12, var11.method272());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class21.field381.method1583(-122, var14[var34]).method3597((byte) 62, arg4)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class714[] var35 = new class714[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class21.field381.method1583(-70, var14[var36]).method3587(-5522, arg4);
                }
            }
            if (var13 != null && var13.field10290 != null) {
                for (int var37 = 0; var37 < var13.field10290.length; var37++) {
                    if (var13.field10290[var37] != null && var35[var37] != null) {
                        int var38 = var13.field10290[var37][0];
                        int var39 = var13.field10290[var37][1];
                        int var40 = var13.field10290[var37][2];
                        int var41 = var13.field10290[var37][3];
                        int var42 = var13.field10290[var37][4];
                        int var43 = var13.field10290[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method3985(51217582, var42, var43, var41);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method3986(0, var40, var39, var38);
                        }
                    }
                }
            }
            if (arg3 != null) {
                var32 = var12 | 0x4000;
            }
            class714 var44 = new class714(var35, var35.length);
            var11 = arg2.method540(var44, var32, class433.field5780, 64, 850);
            if (arg3 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class453.field5994.length; var46++) {
                        if (class453.field5994[var46][var45].length > arg3.field6297[var45]) {
                            var11.method251(class404.field5109[var46][var45], class453.field5994[var46][var45][arg3.field6297[var45]]);
                        }
                    }
                }
            }
            if (field7222 != null) {
                var11.method266(var12);
                field7222.method3077((byte) 110, var30, var11);
            }
        }
        if (arg9 == null || var24 == null) {
            return var11;
        } else {
            class474 var47 = var11.method273((byte) 1, var12, arg5);
            var47.method2707(arg9.field792, var25, 0, var21, var24, var22, 34, var23, arg7 - 1);
            return var47;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IILria;I)V")
    public static final void method2996(int arg0, int arg1, class288 arg2, int arg3) {
        field7224++;
        if (class8.field103) {
            class242 var4 = class599.field8349 == -1 ? null : class513.field7206.method791((byte) 88, class599.field8349);
            if (client.method1833(arg2).method1569(-1) && (class565.field7935 & 0x20) != 0 && (var4 == null || arg2.method1720(var4.field3137, -688386672, class599.field8349) != var4.field3137)) {
                class92.method740(0L, (long) (arg2.field3740 << 0 | arg2.field3696), false, true, class731.field10176 + " -> " + arg2.field3699, arg2.field3700, class702.field9767, 6, arg2.field3696, class551.field7704, false, arg2.field3740, false);
                class472.field6334++;
            }
        }
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class210.method1348((byte) 9, var5, arg2);
            if (var9 != null) {
                class407.field5151++;
                class92.method740((long) (var5 + 1), (long) (arg2.field3740 << 0 | arg2.field3696), false, true, arg2.field3699, arg2.field3700, class707.method3961((byte) -51, var5, arg2), 1007, arg2.field3696, var9, false, arg2.field3740, false);
            }
        }
        String var6 = class635.method3559(-124, arg2);
        if (arg3 > -106) {
            method2997(-100, -56);
        }
        if (var6 != null) {
            class92.method740(0L, (long) (arg2.field3696 | arg2.field3740 << 0), false, true, arg2.field3699, arg2.field3700, arg2.field3762, 51, arg2.field3696, var6, false, arg2.field3740, false);
            class424.field5477++;
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class210.method1348((byte) 9, var7, arg2);
            if (var8 != null) {
                class92.method740((long) (var7 + 1), (long) (arg2.field3696 | arg2.field3740 << 0), false, true, arg2.field3699, arg2.field3700, class707.method3961((byte) -51, var7, arg2), 23, arg2.field3696, var8, false, arg2.field3740, false);
                class407.field5151++;
            }
        }
        if (!client.method1833(arg2).method1575(true)) {
            return;
        }
        if (arg2.field3618 == null) {
            class92.method740(0L, (long) (arg2.field3740 << 0 | arg2.field3696), false, true, "", arg2.field3700, -1, 3, arg2.field3696, class454.field6012.method2547(-87, class243.field3143), false, arg2.field3740, false);
        } else {
            class92.method740(0L, (long) (arg2.field3740 << 0 | arg2.field3696), false, true, "", arg2.field3700, -1, 3, arg2.field3696, arg2.field3618, false, arg2.field3740, false);
        }
        class65.field930++;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(II)V")
    public static final void method2997(int arg0, int arg1) {
        if (arg1 != 14128) {
            method2996(-62, 90, null, 3);
        }
        field7225++;
        class37 var2 = class636.method3571(6, arg0, arg1 ^ 0xFFFFC8B2);
        var2.method230(126);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)V")
    public static void method2998(byte arg0) {
        field7222 = null;
        if (arg0 != 8) {
            field7222 = null;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "([IIZI[I)J")
    private final long method2999(int[] arg0, int arg1, boolean arg2, int arg3, int[] arg4) {
        if (arg3 != -24823) {
            field7222 = null;
        }
        field7221++;
        long[] var6 = class18.field329;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg1 >> 8) ^ var7) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var6[(int) ((var9 ^ (long) arg1) & 0xFFL)];
        for (int var13 = 0; var13 < arg4.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg4[var13] >> 24)) & 0xFFL)];
            long var19 = var6[(int) (((long) (arg4[var13] >> 16) ^ var17) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg4[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var6[(int) ((var21 ^ (long) arg4[var13]) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg0 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg0[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)];
    }
}
