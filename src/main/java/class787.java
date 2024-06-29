import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class787 extends class577 {

    @OriginalMember(owner = "client!sw", name = "l", descriptor = "[I")
    public int[] field10805 = new int[1];

    @OriginalMember(owner = "client!sw", name = "p", descriptor = "[I")
    public int[] field10809 = new int[] { -1 };

    @OriginalMember(owner = "client!sw", name = "m", descriptor = "I")
    public static int field10806 = 0;

    @OriginalMember(owner = "client!sw", name = "t", descriptor = "J")
    public static long field10813 = 0L;

    @OriginalMember(owner = "client!sw", name = "n", descriptor = "I")
    public static int field10807;

    @OriginalMember(owner = "client!sw", name = "o", descriptor = "I")
    public static int field10808;

    @OriginalMember(owner = "client!sw", name = "q", descriptor = "I")
    public static int field10810;

    @OriginalMember(owner = "client!sw", name = "r", descriptor = "I")
    public static int field10811;

    @OriginalMember(owner = "client!sw", name = "s", descriptor = "[[Lmea;")
    public static class451[][] field10812;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lpf;Lha;Lsq;IIZIIII)Lka;", line = 3)
    public final class496 method4309(class607 arg0, class65 arg1, class190 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        field10810++;
        if (arg9 > -9) {
            this.method4310(true, null, null, 38, -111);
        }
        class496 var11 = null;
        int var12 = arg7;
        class539 var13 = null;
        if (arg4 != -1) {
            var13 = class541.field7792.method1719(arg4, 32);
        }
        int[] var14 = this.field10809;
        if (var13 != null && var13.field7762 != null) {
            var14 = new int[var13.field7762.length];
            for (int var15 = 0; var15 < var13.field7762.length; var15++) {
                int var16 = var13.field7762[var15];
                if (var16 >= 0 && this.field10809.length > var16) {
                    var14[var15] = this.field10809[var16];
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
        class369 var24 = null;
        class369 var25 = null;
        if (arg0 != null) {
            int var26 = arg0.field8492[arg8];
            var12 = arg7 | 0x20;
            int var27 = var26 >>> 16;
            var24 = class563.field7993.method648((byte) 68, var27);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method2303(-1, var21);
                var17 |= var24.method2304(-755, var21);
                var20 |= var24.method2300((byte) -116, var21);
                var19 |= arg0.field8516;
            }
            if ((arg0.field8504 || class778.field10685) && arg6 != -1 && arg6 < arg0.field8492.length) {
                int var28 = arg0.field8492[arg6];
                var23 = arg0.field8494[arg8];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class563.field7993.method648((byte) 101, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method2303(-1, var22);
                    var17 |= var25.method2304(-755, var22);
                    var20 |= var25.method2300((byte) -120, var22);
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
        long var30 = this.method4310(arg5, arg2 == null ? null : arg2.field2930, var14, 84, arg4);
        if (class474.field6644 != null) {
            var11 = (class496) class474.field6644.method3742((byte) 67, var30);
        }
        if (var11 == null || arg1.method512(var11.method68(), var12) != 0) {
            if (var11 != null) {
                var12 = arg1.method542(var12, var11.method68());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class313.field4456.method1681(var14[var34], 110).method3893(arg5, -1, null)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class100[] var35 = new class100[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class313.field4456.method1681(var14[var36], 98).method3888((byte) 71, arg5, null);
                }
            }
            if (var13 != null && var13.field7785 != null) {
                for (int var37 = 0; var37 < var13.field7785.length; var37++) {
                    if (var13.field7785[var37] != null && var35[var37] != null) {
                        int var38 = var13.field7785[var37][0];
                        int var39 = var13.field7785[var37][1];
                        int var40 = var13.field7785[var37][2];
                        int var41 = var13.field7785[var37][3];
                        int var42 = var13.field7785[var37][4];
                        int var43 = var13.field7785[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method719(0, var42, var43, var41);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method722((byte) -76, var40, var39, var38);
                        }
                    }
                }
            }
            class100 var44 = new class100(var35, var35.length);
            if (arg2 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg1.method480(var44, var32, class680.field9442, 64, 850);
            if (arg2 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class668.field9301.length; var46++) {
                        if (arg2.field2930[var45] < class668.field9301[var46][var45].length) {
                            var11.method91(class8.field78[var46][var45], class668.field9301[var46][var45][arg2.field2930[var45]]);
                        }
                    }
                }
            }
            if (class474.field6644 != null) {
                var11.method111(var12);
                class474.field6644.method3739(var30, (byte) 69, var11);
            }
        }
        if (arg0 == null || var24 == null) {
            return var11;
        } else {
            class496 var47 = var11.method93((byte) 1, var12, true);
            var47.method3014(var25, var21, arg3 - 1, var22, var23, arg0.field8516, (byte) -109, var24, 0);
            return var47;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Z[I[III)J", line = 248)
    private final long method4310(boolean arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        field10807++;
        long[] var6 = class556.field7929;
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg4 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var6[(int) (((long) arg4 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg2.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) (((long) (arg2[var13] >> 24) ^ var11) & 0xFFL)];
            long var19 = var6[(int) ((var17 ^ (long) (arg2[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var19 >>> 8 ^ var6[(int) ((var19 ^ (long) (arg2[var13] >> 8)) & 0xFFL)];
            var11 = var21 >>> 8 ^ var6[(int) (((long) arg2[var13] ^ var21) & 0xFFL)];
        }
        if (arg3 < 35) {
            method4311(-124);
        }
        if (arg1 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) (((long) arg1[var14] ^ var11) & 0xFFL)];
            }
        }
        return var6[(int) (((long) (arg0 ? 1 : 0) ^ var11) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)V", line = 293)
    public static void method4311(int arg0) {
        field10812 = null;
        if (arg0 != -2008) {
            method4312(110);
        }
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)V", line = 306)
    public static final void method4312(int arg0) {
        field10811++;
        class23 var1 = null;
        try {
            var1 = class477.method2847(9, "2");
            class494 var2 = new class494(class202.field3150 * 6 + 3);
            var2.method2952(arg0 + 30475, 1);
            var2.method2957(class202.field3150, 1267307848);
            for (int var3 = 0; var3 < class672.field9369.length; var3++) {
                if (class433.field5868[var3]) {
                    var2.method2957(var3, 1267307848);
                    var2.method2959(class672.field9369[var3], (byte) 124);
                }
            }
            var1.method236(var2.field7042, 0, 1, var2.field7050);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method230((byte) 92);
            }
        } catch (Exception var4) {
        }
        if (arg0 != -30475) {
            field10808 = -83;
        }
        class561.field7978 = class459.method2731(100);
        class274.field3955 = false;
    }
}
