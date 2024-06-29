import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class11 extends class261 {

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "[I")
    public int[] field149 = new int[1];

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "[I")
    public int[] field151 = new int[] { -1 };

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "Lbj;")
    public static class162 field146 = new class162(59, 15);

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "Lqm;")
    public static class99 field150;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
    public static int field148;

    static {
        new class309(null, "der Spieler ist momentan nicht verfügbar.", null, null);
        field150 = new class99(0, -1);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIBLjv;ZLza;IIILfd;)Le;", line = 5)
    public final class374 method61(int arg0, int arg1, byte arg2, class57 arg3, boolean arg4, class288 arg5, int arg6, int arg7, int arg8, class370 arg9) {
        field145++;
        class374 var11 = null;
        int var12 = arg6;
        class166 var13 = null;
        if (arg8 != -1) {
            var13 = class452.field6708.method2457(arg8, -111);
        }
        int[] var14 = this.field151;
        if (var13 != null && var13.field2670 != null) {
            var14 = new int[var13.field2670.length];
            for (int var15 = 0; var15 < var13.field2670.length; var15++) {
                int var16 = var13.field2670[var15];
                if (var16 >= 0 && var16 < this.field151.length) {
                    var14[var15] = this.field151[var16];
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
        class119 var24 = null;
        class119 var25 = null;
        if (arg3 != null) {
            var12 = arg6 | 0x20;
            int var26 = arg3.field1202[arg0];
            int var27 = var26 >>> 16;
            var24 = class422.field6355.method240(var27, 31706);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method958(59, var21);
                var17 |= var24.method963(true, var21);
                var20 |= var24.method961(-5269, var21);
                var19 |= arg3.field1212;
            }
            if ((arg3.field1211 || class424.field6376) && arg1 != -1 && arg1 < arg3.field1202.length) {
                var23 = arg3.field1210[arg0];
                int var28 = arg3.field1202[arg1];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class422.field6355.method240(var22 >>> 16, 31706);
                }
                if (var25 != null) {
                    var18 |= var25.method958(-127, var22);
                    var17 |= var25.method963(true, var22);
                    var20 |= var25.method961(arg2 ^ 0xFFFFEB32, var22);
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
        long var30 = this.method63(arg2 ^ 0x62, var14, arg4, arg9 == null ? null : arg9.field5427, arg8);
        if (class199.field3241 != null) {
            var11 = (class374) class199.field3241.method2478(1, var30);
        }
        if (var11 == null || arg5.method394(var11.method768(), var12) != 0) {
            if (var11 != null) {
                var12 = arg5.method271(var12, var11.method768());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class135.field2271.method1636(var14[var34], -117).method67(arg4, -23553)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class528[] var35 = new class528[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class135.field2271.method1636(var14[var36], -117).method84((byte) 80, arg4);
                }
            }
            if (var13 != null && var13.field2642 != null) {
                for (int var37 = 0; var37 < var13.field2642.length; var37++) {
                    if (var13.field2642[var37] != null && var35[var37] != null) {
                        int var38 = var13.field2642[var37][0];
                        int var39 = var13.field2642[var37][1];
                        int var40 = var13.field2642[var37][2];
                        int var41 = var13.field2642[var37][3];
                        int var42 = var13.field2642[var37][4];
                        int var43 = var13.field2642[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method3125(var42, var43, var41, (byte) -61);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method3132(var40, var39, 127, var38);
                        }
                    }
                }
            }
            if (arg9 != null) {
                var32 = var12 | 0x4000;
            }
            class528 var44 = new class528(var35, var35.length);
            var11 = arg5.method297(var44, var32, class299.field4524, 64, 850);
            if (arg9 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (class494.field7241[var45].length > arg9.field5427[var45]) {
                        var11.method755(class435.field6474[var45], class494.field7241[var45][arg9.field5427[var45]]);
                    }
                    if (arg9.field5427[var45] < class439.field6525[var45].length) {
                        var11.method755(class111.field2023[var45], class439.field6525[var45][arg9.field5427[var45]]);
                    }
                }
            }
            if (class199.field3241 != null) {
                var11.method732(var12);
                class199.field3241.method2472(-83, var11, var30);
            }
        }
        if (arg3 == null || var24 == null) {
            return var11;
        }
        class374 var46 = var11.method746((byte) 1, var12, true);
        if (arg2 == 89) {
            var46.method2296(arg3.field1212, 0, var23, arg7 - 1, var24, var22, var25, 16383, var21);
            return var46;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 249)
    public static void method62(int arg0) {
        if (arg0 < 119) {
            method62(113);
        }
        field150 = null;
        field146 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[IZ[II)J", line = 264)
    private final long method63(int arg0, int[] arg1, boolean arg2, int[] arg3, int arg4) {
        field148++;
        long[] var6 = class186.field2992;
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg4 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg4 ^ var9) & 0xFFL)];
        int var13 = 0;
        if (arg0 <= 33) {
            this.field151 = null;
        }
        while (var13 < arg1.length) {
            long var17 = var11 >>> 8 ^ var6[(int) (((long) (arg1[var13] >> 24) ^ var11) & 0xFFL)];
            long var19 = var6[(int) ((var17 ^ (long) (arg1[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var6[(int) (((long) (arg1[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) (((long) arg1[var13] ^ var21) & 0xFFL)];
            var13++;
        }
        if (arg3 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg3[var14]) & 0xFFL)];
            }
        }
        return var6[(int) (((long) (arg2 ? 1 : 0) ^ var11) & 0xFFL)] ^ var11 >>> 8;
    }
}
