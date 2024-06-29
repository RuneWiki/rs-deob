import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class426 {

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
    public int field6265 = -1;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "Lbu;")
    public static class147 field6256 = new class147(1);

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "[I")
    public static int[] field6263 = new int[1];

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    private int field6262;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "J")
    private long field6252;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "J")
    private long field6255;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "Ljava/lang/Object;")
    public static Object field6264;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Z")
    public boolean field6244;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "[I")
    public int[] field6248;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "[I")
    public static int[] field6258;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "[I")
    private int[] field6260;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BZ)V")
    public final void method2653(byte arg0, boolean arg1) {
        this.field6244 = arg1;
        field6249++;
        this.method2659((byte) -77);
        if (arg0 != 49) {
            this.method2657(null, 66, -28, false);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public static void method2654(int arg0) {
        field6264 = null;
        field6256 = null;
        field6258 = null;
        field6263 = null;
        if (arg0 != -24752) {
            field6264 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)V")
    public final void method2655(int arg0, int arg1, int arg2) {
        this.field6248[arg1] = arg0;
        field6247++;
        this.method2659((byte) -77);
        if (arg2 != 12) {
            field6256 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILpp;I)V")
    public final void method2656(int arg0, int arg1, class83 arg2, int arg3) {
        if (arg3 != 1073741824) {
            this.field6265 = -88;
        }
        field6251++;
        if (arg1 == -1) {
            this.field6260[arg0] = 0;
        } else if (arg2.method741(116, arg1) != null) {
            this.field6260[arg0] = class112.method903(arg1, 1073741824);
            this.method2659((byte) -77);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lns;IIZ)V")
    public final void method2657(class128 arg0, int arg1, int arg2, boolean arg3) {
        field6245++;
        int var5 = class690.field9798[arg2];
        if (!arg3) {
            method2665(-33, -65, (byte) 61);
        }
        if (arg0.method992((byte) -93, arg1) != null) {
            this.field6260[var5] = class112.method903(arg1, Integer.MIN_VALUE);
            this.method2659((byte) -77);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBLrca;ILvga;ILha;Lns;ILek;Lpp;Lko;)Lka;")
    public final class282 method2658(int arg0, byte arg1, class368 arg2, int arg3, class82 arg4, int arg5, class544 arg6, class128 arg7, int arg8, class598 arg9, class83 arg10, class318 arg11) {
        field6261++;
        if (this.field6265 != -1) {
            return arg9.method3434((byte) -115, this.field6265).method3049(arg3, arg4, arg11, arg0, arg6, arg2, 0, arg5, arg8);
        }
        int var13 = arg0;
        if (arg4 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg4.field1197[arg8];
            Object var22 = null;
            var13 = arg0 | 0x20;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class249 var25 = arg2.method2350(var23, true);
            if (var25 != null) {
                var15 |= var25.method1713(arg1 - 166, var24);
                var14 |= var25.method1711(var24, arg1 ^ 0x50);
                var17 |= var25.method1709(var24, 4);
                var16 |= arg4.field1186;
            }
            if ((arg4.field1184 || class584.field8245) && arg5 != -1 && arg4.field1197.length > arg5) {
                int var26 = arg4.field1197[arg5];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class249 var29 = var23 == var27 ? var25 : arg2.method2350(var27, true);
                if (var29 != null) {
                    var15 |= var29.method1713(-115, var28);
                    var14 |= var29.method1711(var28, 0);
                    var17 |= var29.method1709(var28, 4);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        class14 var30 = class638.field8958;
        class282 var31;
        synchronized (class638.field8958) {
            if (arg1 != 80) {
                this.field6255 = -90L;
            }
            var31 = (class282) class638.field8958.method80((byte) -22, this.field6255);
        }
        if (var31 == null || arg6.method351(var31.method1044(), var13) != 0) {
            if (var31 != null) {
                var13 = arg6.method273(var13, var31.method1044());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field6260[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg7.method992((byte) -93, var35 & 0x3FFFFFFF).method945(arg1 ^ 0x1)) {
                        var33 = true;
                    }
                } else if (!arg10.method741(arg1 ^ 0xFFFFFFFC, var35 & 0x3FFFFFFF).method3833(this.field6244, 17276)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class352[] var36 = new class352[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field6260[var38];
                if ((var39 & 0x40000000) != 0) {
                    class352 var41 = arg10.method741(114, var39 & 0x3FFFFFFF).method3840(this.field6244, arg1 - 78);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class352 var40 = arg7.method992((byte) -93, var39 & 0x3FFFFFFF).method946(115);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class352 var43 = new class352(var36, var37);
            var31 = arg6.method301(var43, var42, class173.field2956, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class626.field8786.length; var45++) {
                    if (class626.field8786[var45][var44].length > this.field6248[var44]) {
                        var31.method1018(class494.field7155[var45][var44], class626.field8786[var45][var44][this.field6248[var44]]);
                    }
                }
            }
            var31.method1014(var13);
            class14 var46 = class638.field8958;
            synchronized (class638.field8958) {
                class638.field8958.method67(this.field6255, var31, -6772);
            }
        }
        if (arg4 == null) {
            return var31;
        } else {
            var31.method1025((byte) 4, var13, true);
            return arg4.method727(arg0, var31, arg8, true, arg3, arg5);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    private final void method2659(byte arg0) {
        field6266++;
        this.field6255 = -1L;
        long[] var2 = class285.field4388;
        this.field6255 = this.field6255 >>> 8 ^ var2[(int) ((this.field6255 ^ (long) (this.field6262 >> 8)) & 0xFFL)];
        this.field6255 = this.field6255 >>> 8 ^ var2[(int) (((long) this.field6262 ^ this.field6255) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field6255 = var2[(int) (((long) (this.field6260[var3] >> 24) ^ this.field6255) & 0xFFL)] ^ this.field6255 >>> 8;
            this.field6255 = this.field6255 >>> 8 ^ var2[(int) ((this.field6255 ^ (long) (this.field6260[var3] >> 16)) & 0xFFL)];
            this.field6255 = this.field6255 >>> 8 ^ var2[(int) (((long) (this.field6260[var3] >> 8) ^ this.field6255) & 0xFFL)];
            this.field6255 = var2[(int) (((long) this.field6260[var3] ^ this.field6255) & 0xFFL)] ^ this.field6255 >>> 8;
        }
        if (arg0 != -77) {
            this.field6248 = null;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field6255 = this.field6255 >>> 8 ^ var2[(int) (((long) this.field6248[var4] ^ this.field6255) & 0xFFL)];
        }
        this.field6255 = var2[(int) ((this.field6255 ^ (long) (this.field6244 ? 1 : 0)) & 0xFFL)] ^ this.field6255 >>> 8;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIBII)Lvm;")
    public static final class72 method2660(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field6257++;
        if (arg4 < 101) {
            return null;
        }
        long var7 = (long) arg3 * 67481L ^ (long) arg6 * 97549L ^ (long) arg1 * 475427L ^ (long) arg2 * 986053L ^ (long) arg5 * 32147369L ^ (long) arg0 * 76724863L;
        class72 var9 = (class72) class519.field7506.method80((byte) -75, var7);
        if (var9 == null) {
            class72 var10 = class565.field8015.method266(arg3, arg6, arg1, arg2, arg5, arg0);
            class519.field7506.method67(var7, var10, -6772);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I[II[IIZ)V")
    public final void method2661(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, boolean arg5) {
        this.field6265 = arg2;
        field6259++;
        this.field6244 = arg5;
        if (arg4 != -10552) {
            field6256 = null;
        }
        this.field6248 = arg1;
        if (this.field6262 != arg0) {
            this.field6262 = arg0;
        }
        this.field6260 = arg3;
        this.method2659((byte) -77);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lraa;ILraa;)V")
    public static final void method2662(class353 arg0, int arg1, class353 arg2) {
        field6246++;
        class490.field7075++;
        if (arg1 != 12) {
            field6263 = null;
        }
        class540 var3 = class257.method1732(true, class564.field7995, class655.field9332);
        var3.field7707.method1970((byte) 29, arg2.field5349);
        var3.field7707.method1982((byte) -113, arg2.field5328);
        var3.field7707.method1980(arg0.field5349, (byte) 53);
        var3.field7707.method1925(arg0.field5328, (byte) -34);
        var3.field7707.method1948(arg2.field5352, -3);
        var3.field7707.method1982((byte) -88, arg0.field5352);
        class756.method4211(var3, 125);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZLns;ILha;IIILvga;IILrca;)Lka;")
    public final class282 method2663(int arg0, boolean arg1, class128 arg2, int arg3, class544 arg4, int arg5, int arg6, int arg7, class82 arg8, int arg9, int arg10, class368 arg11) {
        field6253++;
        int var13 = arg5;
        if (arg8 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg5 | 0x20;
            int var22 = arg8.field1197[arg3];
            int var23 = var22 >>> 16;
            class249 var24 = arg11.method2350(var23, true);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method1713(-54, var25);
                var14 |= var24.method1711(var25, 0);
                var17 |= var24.method1709(var25, 4);
                var16 |= arg8.field1186;
            }
            if ((arg8.field1184 || class584.field8245) && arg10 != -1 && arg10 < arg8.field1197.length) {
                int var26 = arg8.field1197[arg10];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class249 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg11.method2350(var28 >>> 16, true);
                }
                if (var29 != null) {
                    var15 |= var29.method1713(-60, var28);
                    var14 |= var29.method1711(var28, 0);
                    var17 |= var29.method1709(var28, 4);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) (arg6 << 16) | (long) arg9 << 32 | (long) arg0;
        class14 var32 = class638.field8958;
        class282 var33;
        synchronized (class638.field8958) {
            var33 = (class282) class638.field8958.method80((byte) -51, var30);
        }
        if (var33 == null || arg4.method351(var33.method1044(), var13) != 0) {
            if (var33 != null) {
                var13 = arg4.method273(var13, var33.method1044());
            }
            class352[] var35 = new class352[3];
            int var36 = 0;
            if (!arg2.method992((byte) -93, arg0).method945(65) || !arg2.method992((byte) -93, arg6).method945(31) || !arg2.method992((byte) -93, arg9).method945(44)) {
                return null;
            }
            class352 var37 = arg2.method992((byte) -93, arg0).method946(122);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class352 var38 = arg2.method992((byte) -93, arg6).method946(99);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class352 var39 = arg2.method992((byte) -93, arg9).method946(126);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class352 var40 = new class352(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg4.method301(var40, var41, class173.field2956, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class626.field8786.length; var43++) {
                    if (this.field6248[var42] < class626.field8786[var43][var42].length) {
                        var33.method1018(class494.field7155[var43][var42], class626.field8786[var43][var42][this.field6248[var42]]);
                    }
                }
            }
            var33.method1014(var13);
            class14 var44 = class638.field8958;
            synchronized (class638.field8958) {
                class638.field8958.method67(var30, var33, -6772);
            }
        }
        if (arg8 == null) {
            return var33;
        } else {
            class282 var45 = var33.method1025((byte) 4, var13, arg1);
            return arg8.method727(arg5, var45, arg3, true, arg7, arg10);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lvga;Lha;Lns;ILko;IILek;I[Lmca;ILrca;Lpp;ZI[IILvga;IILmu;)Lka;")
    public final class282 method2664(class82 arg0, class544 arg1, class128 arg2, int arg3, class318 arg4, int arg5, int arg6, class598 arg7, int arg8, class253[] arg9, int arg10, class368 arg11, class83 arg12, boolean arg13, int arg14, int[] arg15, int arg16, class82 arg17, int arg18, int arg19, class215 arg20) {
        field6250++;
        if (this.field6265 != -1) {
            return arg7.method3434((byte) -115, this.field6265).method3048(arg4, 0, arg20, arg15, arg3, arg5, arg18, arg19, arg17, arg11, arg0, arg6, arg8, arg9, arg14, arg1, arg10);
        }
        int var22 = arg5;
        long var23 = this.field6255;
        int[] var25 = this.field6260;
        if (arg17 != null && (arg17.field1201 >= 0 || arg17.field1204 >= 0)) {
            var25 = new int[12];
            for (int var26 = 0; var26 < 12; var26++) {
                var25[var26] = this.field6260[var26];
            }
            if (arg17.field1201 >= 0) {
                if (arg17.field1201 == 65535) {
                    var23 ^= 0xFFFFFFFF00000000L;
                    var25[5] = 0;
                } else {
                    var25[5] = class112.method903(1073741824, arg17.field1201);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg17.field1204 >= 0) {
                if (arg17.field1204 == 65535) {
                    var25[3] = 0;
                    var23 ^= 0xFFFFFFFFL;
                } else {
                    var25[3] = class112.method903(1073741824, arg17.field1204);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var27 = false;
        boolean var28 = false;
        boolean var29 = false;
        boolean var30 = arg17 != null || arg0 != null;
        int var31 = arg9 == null ? 0 : arg9.length;
        for (int var32 = 0; var32 < var31; var32++) {
            class596.field8448[var32] = null;
            if (arg9[var32] != null) {
                class82 var33 = arg11.method2358((byte) -67, arg9[var32].field4013);
                if (var33.field1197 != null) {
                    var30 = true;
                    class560.field7943[var32] = var33;
                    int var34 = arg9[var32].field4018;
                    int var35 = arg9[var32].field4017;
                    int var36 = var33.field1197[var34];
                    class596.field8448[var32] = arg11.method2350(var36 >>> 16, true);
                    int var37 = var36 & 0xFFFF;
                    class338.field4953[var32] = var37;
                    if (class596.field8448[var32] != null) {
                        var28 |= class596.field8448[var32].method1713(-105, var37);
                        var27 |= class596.field8448[var32].method1711(var37, 0);
                        var29 |= class596.field8448[var32].method1709(var37, 4);
                    }
                    if ((var33.field1184 || class584.field8245) && var35 != -1 && var35 < var33.field1197.length) {
                        class336.field4918[var32] = var33.field1211[var34];
                        class383.field5747[var32] = arg9[var32].field4019;
                        int var38 = var33.field1197[var35];
                        class689.field9789[var32] = arg11.method2350(var38 >>> 16, true);
                        int var39 = var38 & 0xFFFF;
                        class395.field5897[var32] = var39;
                        if (class689.field9789[var32] != null) {
                            var28 |= class689.field9789[var32].method1713(-122, var39);
                            var27 |= class689.field9789[var32].method1711(var39, 0);
                            var29 |= class689.field9789[var32].method1709(var39, 4);
                        }
                    } else {
                        class336.field4918[var32] = 0;
                        class383.field5747[var32] = 0;
                        class689.field9789[var32] = null;
                        class395.field5897[var32] = -1;
                    }
                }
            }
        }
        int var40 = -1;
        int var41 = -1;
        int var42 = 0;
        class249 var43 = null;
        class249 var44 = null;
        int var45 = -1;
        int var46 = -1;
        int var47 = 0;
        class249 var48 = null;
        class249 var49 = null;
        if (var30) {
            var22 = arg5 | 0x20;
            if (arg17 != null) {
                int var50 = arg17.field1197[arg19];
                int var51 = var50 >>> 16;
                var40 = var50 & 0xFFFF;
                var43 = arg11.method2350(var51, true);
                if (var43 != null) {
                    var28 |= var43.method1713(-126, var40);
                    var27 |= var43.method1711(var40, 0);
                    var29 |= var43.method1709(var40, 4);
                }
                if ((arg17.field1184 || class584.field8245) && arg8 != -1 && arg17.field1197.length > arg8) {
                    var42 = arg17.field1211[arg19];
                    int var52 = arg17.field1197[arg8];
                    int var53 = var52 >>> 16;
                    var44 = var51 == var53 ? var43 : arg11.method2350(var53, true);
                    var41 = var52 & 0xFFFF;
                    if (var44 != null) {
                        var28 |= var44.method1713(-87, var41);
                        var27 |= var44.method1711(var41, 0);
                        var29 |= var44.method1709(var41, 4);
                    }
                }
            }
            if (arg0 != null) {
                int var54 = arg0.field1197[arg14];
                int var55 = var54 >>> 16;
                var48 = arg11.method2350(var55, true);
                var45 = var54 & 0xFFFF;
                if (var48 != null) {
                    var28 |= var48.method1713(-118, var45);
                    var27 |= var48.method1711(var45, 0);
                    var29 |= var48.method1709(var45, 4);
                }
                if ((arg0.field1184 || class584.field8245) && arg6 != -1 && arg0.field1197.length > arg6) {
                    var47 = arg0.field1211[arg14];
                    int var56 = arg0.field1197[arg6];
                    int var57 = var56 >>> 16;
                    var46 = var56 & 0xFFFF;
                    var49 = var55 == var57 ? var48 : arg11.method2350(var57, true);
                    if (var49 != null) {
                        var28 |= var49.method1713(-77, var46);
                        var27 |= var49.method1711(var46, 0);
                        var29 |= var49.method1709(var46, 4);
                    }
                }
            }
            if (var28) {
                var22 |= 0x80;
            }
            if (var27) {
                var22 |= 0x100;
            }
            if (var29) {
                var22 |= 0x400;
            }
        }
        class14 var58 = class364.field5565;
        class282 var59;
        synchronized (class364.field5565) {
            var59 = (class282) class364.field5565.method80((byte) -115, var23);
            if (arg16 <= 74) {
                field6256 = null;
            }
        }
        class228 var60 = null;
        if (this.field6262 != -1) {
            var60 = arg20.method1548(-110, this.field6262);
        }
        if (var59 == null || arg1.method351(var59.method1044(), var22) != 0) {
            if (var59 != null) {
                var22 = arg1.method273(var22, var59.method1044());
            }
            boolean var62 = false;
            int var63 = 0;
            while (true) {
                if (var63 >= 12) {
                    if (var62) {
                        if (this.field6252 != -1L) {
                            class14 var65 = class364.field5565;
                            synchronized (class364.field5565) {
                                var59 = (class282) class364.field5565.method80((byte) -62, this.field6252);
                            }
                        }
                        if (var59 == null || arg1.method351(var59.method1044(), var22) != 0) {
                            return null;
                        }
                    } else {
                        class352[] var66 = new class352[12];
                        for (int var67 = 0; var67 < 12; var67++) {
                            int var68 = var25[var67];
                            if ((var68 & 0x40000000) != 0) {
                                class352 var70 = arg12.method741(-115, var68 & 0x3FFFFFFF).method3834(this.field6244, false);
                                if (var70 != null) {
                                    var66[var67] = var70;
                                }
                            } else if ((var68 & Integer.MIN_VALUE) != 0) {
                                class352 var69 = arg2.method992((byte) -93, var68 & 0x3FFFFFFF).method948(-6570);
                                if (var69 != null) {
                                    var66[var67] = var69;
                                }
                            }
                        }
                        if (var60 != null && var60.field3646 != null) {
                            for (int var71 = 0; var71 < var60.field3646.length; var71++) {
                                if (var66[var71] != null) {
                                    int var72 = 0;
                                    int var73 = 0;
                                    int var74 = 0;
                                    int var75 = 0;
                                    int var76 = 0;
                                    int var77 = 0;
                                    if (var60.field3646[var71] != null) {
                                        var75 = var60.field3646[var71][3] << 3;
                                        var72 = var60.field3646[var71][0];
                                        var74 = var60.field3646[var71][2];
                                        var77 = var60.field3646[var71][5] << 3;
                                        var76 = var60.field3646[var71][4] << 3;
                                        var73 = var60.field3646[var71][1];
                                    }
                                    if (var75 != 0 || var76 != 0 || var77 != 0) {
                                        var66[var71].method2233(var77, var76, var75, 127);
                                    }
                                    if (var72 != 0 || var73 != 0 || var74 != 0) {
                                        var66[var71].method2236(var72, var73, (byte) 86, var74);
                                    }
                                }
                            }
                        }
                        class352 var78 = new class352(var66, var66.length);
                        int var79 = var22 | 0x4000;
                        var59 = arg1.method301(var78, var79, class173.field2956, 64, 850);
                        for (int var80 = 0; var80 < 5; var80++) {
                            for (int var81 = 0; var81 < class626.field8786.length; var81++) {
                                if (class626.field8786[var81][var80].length > this.field6248[var80]) {
                                    var59.method1018(class494.field7155[var81][var80], class626.field8786[var81][var80][this.field6248[var80]]);
                                }
                            }
                        }
                        if (arg13) {
                            var59.method1014(var22);
                            class14 var82 = class364.field5565;
                            synchronized (class364.field5565) {
                                class364.field5565.method67(var23, var59, -6772);
                            }
                            this.field6252 = var23;
                        }
                    }
                    break;
                }
                int var64 = var25[var63];
                if ((var64 & 0x40000000) == 0) {
                    if ((var64 & Integer.MIN_VALUE) != 0 && !arg2.method992((byte) -93, var64 & 0x3FFFFFFF).method942((byte) 116)) {
                        var62 = true;
                    }
                } else if (!arg12.method741(-7, var64 & 0x3FFFFFFF).method3829(this.field6244, true)) {
                    var62 = true;
                }
                var63++;
            }
        }
        class282 var83 = var59.method1025((byte) 4, var22, true);
        boolean var84 = false;
        if (arg15 != null) {
            for (int var85 = 0; var85 < 12; var85++) {
                if (arg15[var85] != -1) {
                    var84 = true;
                }
            }
        }
        if (!var30 && !var84) {
            return var83;
        }
        class73[] var86 = null;
        if (var60 != null) {
            var86 = var60.method1593(111, arg1);
        }
        if (var84 && var86 != null) {
            for (int var87 = 0; var87 < 12; var87++) {
                if (var86[var87] != null) {
                    var83.method1032(var86[var87], 0x1 << var87, true);
                }
            }
        }
        int var88 = 0;
        int var89 = 1;
        while (var31 > var88) {
            if (class596.field8448[var88] != null) {
                var83.method1856(false, 0, class383.field5747[var88] - 1, class395.field5897[var88], var89, class596.field8448[var88], class338.field4953[var88], class336.field4918[var88], 0, null, class689.field9789[var88]);
            }
            var89 <<= 0x1;
            var88++;
        }
        if (var84) {
            for (int var90 = 0; var90 < 12; var90++) {
                if (arg15[var90] != -1) {
                    int var91 = arg15[var90] - arg3;
                    int var92 = var91 & 0x3FFF;
                    class73 var93 = arg1.method414();
                    var93.method676(var92);
                    var83.method1032(var93, 0x1 << var90, false);
                }
            }
        }
        if (var84 && var86 != null) {
            for (int var94 = 0; var94 < 12; var94++) {
                if (var86[var94] != null) {
                    var83.method1032(var86[var94], 0x1 << var94, false);
                }
            }
        }
        if (var43 != null && var48 != null) {
            var83.method1857(var44, false, var40, arg17.field1212, var46, var48, var47, var49, (byte) 106, var41, var42, arg18 - 1, var43, var45, arg10 - 1);
        } else if (var43 != null) {
            var83.method1853(var41, var40, -32, var43, false, var44, 0, arg18 - 1, var42);
        } else if (var48 != null) {
            var83.method1853(var46, var45, -42, var48, false, var49, 0, arg10 - 1, var47);
        }
        for (int var95 = 0; var95 < var31; var95++) {
            class596.field8448[var95] = null;
            class689.field9789[var95] = null;
            class560.field7943[var95] = null;
        }
        return var83;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2665(int arg0, int arg1, byte arg2) {
        field6254++;
        if (arg2 <= 47) {
            method2660(87, 125, -50, 79, (byte) 114, -110, -12);
        }
        return (arg1 & 0x70000) != 0 | class411.method2534(arg0, false, arg1) || class312.method2057(arg1, arg0, -1);
    }
}
