import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class339 extends class529 {

    @OriginalMember(owner = "client!go", name = "o", descriptor = "[I")
    public int[] field5287 = new int[] { -1 };

    @OriginalMember(owner = "client!go", name = "r", descriptor = "[I")
    public int[] field5290 = new int[1];

    @OriginalMember(owner = "client!go", name = "q", descriptor = "Lbi;")
    public static class104 field5289 = new class104(11, -2);

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!go", name = "s", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!go", name = "v", descriptor = "Lpb;")
    public static class2 field5294;

    @OriginalMember(owner = "client!go", name = "t", descriptor = "[I")
    public static int[] field5292;

    @OriginalMember(owner = "client!go", name = "u", descriptor = "[I")
    public static int[] field5293;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V")
    public static void method2244(boolean arg0) {
        field5289 = null;
        field5292 = null;
        field5294 = null;
        if (!arg0) {
            method2244(false);
        }
        field5293 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BIIII)I")
    public static final int method2245(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field5285++;
        if (arg0 == -53) {
            int var5 = 65536 - class147.field1986[arg3 * 8192 / arg4] >> 1;
            return ((65536 - var5) * arg1 >> 16) + (arg2 * var5 >> 16);
        } else {
            return 91;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lza;Lhg;ZIIILbk;III)Le;")
    public final class536 method2246(class497 arg0, class363 arg1, boolean arg2, int arg3, int arg4, int arg5, class78 arg6, int arg7, int arg8, int arg9) {
        field5284++;
        class536 var11 = null;
        int var12 = arg9;
        class289 var13 = null;
        if (arg5 != -1) {
            var13 = class19.field199.method2294(arg5, 1);
        }
        int[] var14 = this.field5287;
        if (var13 != null && var13.field4535 != null) {
            var14 = new int[var13.field4535.length];
            for (int var15 = 0; var15 < var13.field4535.length; var15++) {
                int var16 = var13.field4535[var15];
                if (var16 >= 0 && var16 < this.field5287.length) {
                    var14[var15] = this.field5287[var16];
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
        int var22 = -59 % ((38 - arg4) / 39);
        int var23 = -1;
        int var24 = 0;
        class249 var25 = null;
        class249 var26 = null;
        if (arg1 != null) {
            var12 = arg9 | 0x20;
            int var27 = arg1.field5623[arg8];
            int var28 = var27 >>> 16;
            var25 = class388.field5915.method1695(var28, true);
            var21 = var27 & 0xFFFF;
            if (var25 != null) {
                var18 |= var25.method1726(var21, 65280);
                var17 |= var25.method1721(var21, 122);
                var20 |= var25.method1720((byte) -66, var21);
                var19 |= arg1.field5614;
            }
            if ((arg1.field5598 || class84.field1230) && arg7 != -1 && arg1.field5623.length > arg7) {
                var24 = arg1.field5599[arg8];
                int var29 = arg1.field5623[arg7];
                int var30 = var29 >>> 16;
                var23 = var29 & 0xFFFF;
                if (var28 == var30) {
                    var26 = var25;
                } else {
                    var26 = class388.field5915.method1695(var23 >>> 16, true);
                }
                if (var26 != null) {
                    var18 |= var26.method1726(var23, 65280);
                    var17 |= var26.method1721(var23, -34);
                    var20 |= var26.method1720((byte) -83, var23);
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
        long var31 = this.method2248(var14, (byte) 83, arg2, arg5, arg6 == null ? null : arg6.field1172);
        if (class442.field6874 != null) {
            var11 = (class536) class442.field6874.method2191((byte) -73, var31);
        }
        if (var11 == null || arg0.method1299(var11.method308(), var12) != 0) {
            if (var11 != null) {
                var12 = arg0.method1294(var12, var11.method308());
            }
            int var33 = var12;
            boolean var34 = false;
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1 && !class337.field5262.method2077((byte) -65, var14[var35]).method1349(arg2, true)) {
                    var34 = true;
                }
            }
            if (var34) {
                return null;
            }
            class438[] var36 = new class438[var14.length];
            for (int var37 = 0; var37 < var14.length; var37++) {
                if (var14[var37] != -1) {
                    var36[var37] = class337.field5262.method2077((byte) -65, var14[var37]).method1348(-89, arg2);
                }
            }
            if (var13 != null && var13.field4520 != null) {
                for (int var38 = 0; var38 < var13.field4520.length; var38++) {
                    if (var13.field4520[var38] != null && var36[var38] != null) {
                        int var39 = var13.field4520[var38][0];
                        int var40 = var13.field4520[var38][1];
                        int var41 = var13.field4520[var38][2];
                        int var42 = var13.field4520[var38][3];
                        int var43 = var13.field4520[var38][4];
                        int var44 = var13.field4520[var38][5];
                        if (var42 != 0 || var43 != 0 || var44 != 0) {
                            var36[var38].method2769(var43, (byte) 123, var42, var44);
                        }
                        if (var39 != 0 || var40 != 0 || var41 != 0) {
                            var36[var38].method2785(var41, var39, -19721, var40);
                        }
                    }
                }
            }
            if (arg6 != null) {
                var33 = var12 | 0x4000;
            }
            class438 var45 = new class438(var36, var36.length);
            var11 = arg0.method1337(var45, var33, class188.field2742, 64, 850);
            if (arg6 != null) {
                for (int var46 = 0; var46 < 5; var46++) {
                    if (class284.field4477[var46].length > arg6.field1172[var46]) {
                        var11.method309(class295.field4661[var46], class284.field4477[var46][arg6.field1172[var46]]);
                    }
                    if (arg6.field1172[var46] < class187.field2725[var46].length) {
                        var11.method309(class81.field1200[var46], class187.field2725[var46][arg6.field1172[var46]]);
                    }
                }
            }
            if (class442.field6874 != null) {
                var11.method290(var12);
                class442.field6874.method2188(-125, var31, var11);
            }
        }
        if (arg1 == null || var25 == null) {
            return var11;
        } else {
            class536 var47 = var11.method329((byte) 1, var12, true);
            var47.method3181(0, var21, var23, 110, var26, var24, arg1.field5614, arg3 - 1, var25);
            return var47;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IBIII)V")
    public static final void method2247(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class201.field3059 = arg4;
        class398.field6014 = arg2;
        if (arg1 == -110) {
            class321.field4985 = arg3;
            field5286++;
            class346.field5391 = arg0;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "([IBZI[I)J")
    private final long method2248(int[] arg0, byte arg1, boolean arg2, int arg3, int[] arg4) {
        if (arg1 != 83) {
            return -3L;
        }
        field5288++;
        long[] var6 = class150.field2013;
        long var7 = -1L;
        long var9 = var6[(int) ((var7 ^ (long) (arg3 >> 8)) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var6[(int) ((var9 ^ (long) arg3) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg0.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) (((long) (arg0[var13] >> 24) ^ var11) & 0xFFL)];
            long var19 = var6[(int) (((long) (arg0[var13] >> 16) ^ var17) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var6[(int) ((var19 ^ (long) (arg0[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var6[(int) ((var21 ^ (long) arg0[var13]) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg4 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) (((long) arg4[var14] ^ var11) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var6[(int) ((var11 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
    public static final byte[] method2249(int arg0, int arg1, int arg2, Object arg3) {
        field5291++;
        if (arg3 == null) {
            return null;
        } else if (arg3 instanceof byte[]) {
            byte[] var4 = (byte[]) arg3;
            return class41.method249(0, arg2, arg1, var4);
        } else if (arg3 instanceof class474) {
            class474 var5 = (class474) arg3;
            return var5.method2955(arg2, -53, arg1);
        } else if (arg0 >= -127) {
            return null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    static {
        new class213("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }
}
