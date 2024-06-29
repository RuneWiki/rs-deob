import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class621 {

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public int field8426 = -1;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Luc;")
    public static class27 field8428 = new class27(3, 16);

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field8436 = -1;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "[I")
    public static int[] field8437 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field8417;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    private int field8418;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field8419;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field8420;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field8423;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field8425;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field8427;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field8430;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field8432;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field8433;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "J")
    private long field8424;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "J")
    private long field8435;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Lkaa;")
    public static class44 field8434;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "Z")
    public boolean field8429;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "[I")
    private int[] field8422;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "[I")
    public int[] field8431;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "[[I")
    private int[][] field8421;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V", line = 7)
    public static void method3463(byte arg0) {
        field8428 = null;
        field8437 = null;
        int var1 = -79 % (-arg0 / 48);
        field8434 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BIILufa;)V", line = 18)
    public final void method3464(byte arg0, int arg1, int arg2, class637 arg3) {
        field8419++;
        int var5 = class228.field2949[arg2];
        if (arg0 > 2 && arg3.method3571(3, arg1) != null) {
            this.field8422[var5] = class364.method2113(arg1, Integer.MIN_VALUE);
            this.method3467(-120);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BII)V", line = 38)
    public final void method3465(byte arg0, int arg1, int arg2) {
        this.field8431[arg2] = arg1;
        field8433++;
        if (arg0 < -101) {
            this.method3467(-124);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIZI[I[I)V", line = 53)
    public final void method3466(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int[] arg5) {
        this.field8426 = arg1;
        this.field8429 = arg2;
        this.field8431 = arg5;
        this.field8422 = arg4;
        field8420++;
        if (this.field8418 != arg3) {
            this.field8421 = null;
            this.field8418 = arg3;
        }
        if (arg0 <= 85) {
            field8428 = null;
        }
        this.method3467(-125);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 74)
    private final void method3467(int arg0) {
        field8432++;
        long[] var2 = class225.field2913;
        this.field8424 = -1L;
        this.field8424 = this.field8424 >>> 8 ^ var2[(int) (((long) (this.field8418 >> 8) ^ this.field8424) & 0xFFL)];
        this.field8424 = var2[(int) ((this.field8424 ^ (long) this.field8418) & 0xFFL)] ^ this.field8424 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field8424 = var2[(int) ((this.field8424 ^ (long) (this.field8422[var3] >> 24)) & 0xFFL)] ^ this.field8424 >>> 8;
            this.field8424 = this.field8424 >>> 8 ^ var2[(int) (((long) (this.field8422[var3] >> 16) ^ this.field8424) & 0xFFL)];
            this.field8424 = var2[(int) ((this.field8424 ^ (long) (this.field8422[var3] >> 8)) & 0xFFL)] ^ this.field8424 >>> 8;
            this.field8424 = this.field8424 >>> 8 ^ var2[(int) (((long) this.field8422[var3] ^ this.field8424) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field8424 = this.field8424 >>> 8 ^ var2[(int) ((this.field8424 ^ (long) this.field8431[var4]) & 0xFFL)];
        }
        this.field8424 = this.field8424 >>> 8 ^ var2[(int) ((this.field8424 ^ (long) (this.field8429 ? 1 : 0)) & 0xFFL)];
        if (arg0 > -117) {
            this.method3471(-56, 78, null, 126);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lufa;IILcu;IIIILsa;ILoa;I)Lba;", line = 111)
    public final class359 method3468(class637 arg0, int arg1, int arg2, class207 arg3, int arg4, int arg5, int arg6, int arg7, class193 arg8, int arg9, class650 arg10, int arg11) {
        if (arg11 != 0) {
            this.method3470(null, null, 76, null, null, null, null, -48, null, -76, -121, -51);
        }
        field8423++;
        int var13 = arg4;
        if (arg3 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg3.field2441[arg9];
            Object var22 = null;
            var13 = arg4 | 0x20;
            int var23 = var21 >>> 16;
            class81 var24 = arg8.method1137(arg11 ^ 0x7E, var23);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method619(58, var25);
                var14 |= var24.method623(-104, var25);
                var17 |= var24.method624(1, var25);
                var16 |= arg3.field2433;
            }
            if ((arg3.field2434 || class493.field6139) && arg2 != -1 && arg2 < arg3.field2441.length) {
                int var26 = arg3.field2441[arg2];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class81 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg8.method1137(127, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method619(arg11 + 115, var28);
                    var14 |= var29.method623(-68, var28);
                    var17 |= var29.method624(1, var28);
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
        long var30 = (long) arg5 | (long) (arg6 << 16) | (long) arg7 << 32;
        class208 var32 = class392.field5012;
        class359 var33;
        synchronized (class392.field5012) {
            var33 = (class359) class392.field5012.method1221(var30, true);
        }
        if (var33 == null || arg10.method493(var33.method2075(), var13) != 0) {
            if (var33 != null) {
                var13 = arg10.method469(var13, var33.method2075());
            }
            class229[] var35 = new class229[3];
            int var36 = 0;
            if (!arg0.method3571(3, arg5).method1032((byte) -105) || !arg0.method3571(3, arg6).method1032((byte) -105) || !arg0.method3571(3, arg7).method1032((byte) -105)) {
                return null;
            }
            class229 var37 = arg0.method3571(3, arg5).method1033((byte) 115);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class229 var38 = arg0.method3571(3, arg6).method1033((byte) 58);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class229 var39 = arg0.method3571(3, arg7).method1033((byte) 112);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class229 var40 = new class229(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg10.method408(var40, var41, class397.field5042, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class540.field6821.length; var43++) {
                    if (class540.field6821[var43][var42].length > this.field8431[var42]) {
                        var33.method2080(class51.field654[var43][var42], class540.field6821[var43][var42][this.field8431[var42]]);
                    }
                }
            }
            var33.method2069(var13);
            class208 var44 = class392.field5012;
            synchronized (class392.field5012) {
                class392.field5012.method1230((byte) -107, var30, var33);
            }
        }
        if (arg3 == null) {
            return var33;
        } else {
            class359 var45 = var33.method951((byte) 4, var13, true);
            return arg3.method1214(arg4, true, arg9, var45, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)V", line = 270)
    public final void method3469(boolean arg0, int arg1) {
        this.field8429 = arg0;
        field8427++;
        int var3 = 92 % ((50 - arg1) / 44);
        this.method3467(-120);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lhb;Lsa;ILoa;Ltr;Lcu;Lufa;ILada;III)Lba;", line = 282)
    public final class359 method3470(class681 arg0, class193 arg1, int arg2, class650 arg3, class273 arg4, class207 arg5, class637 arg6, int arg7, class153 arg8, int arg9, int arg10, int arg11) {
        field8425++;
        if (this.field8426 != -1) {
            return arg0.method3763(this.field8426, -2).method3808(arg3, arg10, arg5, arg8, arg1, arg9, arg11, (byte) 116, arg2);
        }
        int var13 = arg2;
        if (arg5 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg2 | 0x20;
            int var21 = arg5.field2441[arg11];
            Object var22 = null;
            int var23 = var21 >>> 16;
            class81 var24 = arg1.method1137(126, var23);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method619(119, var25);
                var14 |= var24.method623(-16, var25);
                var17 |= var24.method624(1, var25);
                var16 |= arg5.field2433;
            }
            if ((arg5.field2434 || class493.field6139) && arg10 != -1 && arg5.field2441.length > arg10) {
                int var26 = arg5.field2441[arg10];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class81 var29 = var23 == var27 ? var24 : arg1.method1137(arg7 ^ 0x78, var27);
                if (var29 != null) {
                    var15 |= var29.method619(80, var28);
                    var14 |= var29.method623(99, var28);
                    var17 |= var29.method624(1, var28);
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
        class208 var30 = class392.field5012;
        class359 var31;
        synchronized (class392.field5012) {
            var31 = (class359) class392.field5012.method1221(this.field8424, true);
            if (arg7 != 5) {
                field8436 = 64;
            }
        }
        if (var31 == null || arg3.method493(var31.method2075(), var13) != 0) {
            if (var31 != null) {
                var13 = arg3.method469(var13, var31.method2075());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field8422[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg6.method3571(3, var35 & 0x3FFFFFFF).method1032((byte) -105)) {
                        var33 = true;
                    }
                } else if (!arg4.method1628(var35 & 0x3FFFFFFF, (byte) -93).method544(this.field8429, -9532)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class229[] var36 = new class229[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field8422[var38];
                if ((var39 & 0x40000000) != 0) {
                    class229 var41 = arg4.method1628(var39 & 0x3FFFFFFF, (byte) -88).method533((byte) 62, this.field8429);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class229 var40 = arg6.method3571(3, var39 & 0x3FFFFFFF).method1033((byte) 69);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            class229 var42 = new class229(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg3.method408(var42, var43, class397.field5042, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class540.field6821.length; var45++) {
                    if (class540.field6821[var45][var44].length > this.field8431[var44]) {
                        var31.method2080(class51.field654[var45][var44], class540.field6821[var45][var44][this.field8431[var44]]);
                    }
                }
            }
            var31.method2069(var13);
            class208 var46 = class392.field5012;
            synchronized (class392.field5012) {
                class392.field5012.method1230((byte) -116, this.field8424, var31);
            }
        }
        if (arg5 == null) {
            return var31;
        } else {
            var31.method951((byte) 4, var13, true);
            return arg5.method1214(arg2, true, arg11, var31, arg9, arg10);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILtr;I)V", line = 481)
    public final void method3471(int arg0, int arg1, class273 arg2, int arg3) {
        if (arg0 != -1) {
            this.field8422 = null;
        }
        field8417++;
        if (arg1 == -1) {
            this.field8422[arg3] = 0;
        } else if (arg2.method1628(arg1, (byte) -92) != null) {
            this.field8422[arg3] = class364.method2113(1073741824, arg1);
            this.method3467(-124);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BILtr;ILufa;IILcu;Lsa;Lhb;ILada;Liu;[Lrf;ZILcu;ILoa;)Lba;", line = 521)
    public final class359 method3472(byte arg0, int arg1, class273 arg2, int arg3, class637 arg4, int arg5, int arg6, class207 arg7, class193 arg8, class681 arg9, int arg10, class153 arg11, class541 arg12, class78[] arg13, boolean arg14, int arg15, class207 arg16, int arg17, class650 arg18) {
        field8430++;
        if (this.field8426 != -1) {
            return arg9.method3763(this.field8426, -2).method3813(arg8, arg10, arg12, arg17, arg13, arg6, arg7, arg16, arg1, 127, arg11, arg5, arg18, arg3, arg15);
        }
        int var20 = arg1;
        long var21 = this.field8424;
        int[] var23 = this.field8422;
        if (arg7 != null && (arg7.field2442 >= 0 || arg7.field2440 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field8422[var24];
            }
            if (arg7.field2442 >= 0) {
                if (arg7.field2442 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class364.method2113(1073741824, arg7.field2442);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg7.field2440 >= 0) {
                if (arg7.field2440 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class364.method2113(arg7.field2440, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg7 != null || arg16 != null;
        int var29 = arg13 == null ? 0 : arg13.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class458.field5710[var30] = null;
            if (arg13[var30] != null) {
                class207 var31 = arg8.method1141(arg13[var30].field1014, (byte) 110);
                if (var31.field2441 != null) {
                    class377.field4841[var30] = var31;
                    var28 = true;
                    int var32 = arg13[var30].field1009;
                    int var33 = arg13[var30].field1016;
                    int var34 = var31.field2441[var32];
                    class458.field5710[var30] = arg8.method1137(126, var34 >>> 16);
                    int var35 = var34 & 0xFFFF;
                    class125.field1525[var30] = var35;
                    if (class458.field5710[var30] != null) {
                        var26 |= class458.field5710[var30].method619(125, var35);
                        var25 |= class458.field5710[var30].method623(-79, var35);
                        var27 |= class458.field5710[var30].method624(1, var35);
                    }
                    if ((var31.field2434 || class493.field6139) && var33 != -1 && var33 < var31.field2441.length) {
                        class331.field4103[var30] = var31.field2436[var32];
                        class237.field3062[var30] = arg13[var30].field1015;
                        int var36 = var31.field2441[var33];
                        class223.field2642[var30] = arg8.method1137(126, var36 >>> 16);
                        int var37 = var36 & 0xFFFF;
                        class670.field9109[var30] = var37;
                        if (class223.field2642[var30] != null) {
                            var26 |= class223.field2642[var30].method619(89, var37);
                            var25 |= class223.field2642[var30].method623(127, var37);
                            var27 |= class223.field2642[var30].method624(1, var37);
                        }
                    } else {
                        class331.field4103[var30] = 0;
                        class237.field3062[var30] = 0;
                        class223.field2642[var30] = null;
                        class670.field9109[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class81 var41 = null;
        class81 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class81 var46 = null;
        class81 var47 = null;
        if (var28) {
            var20 = arg1 | 0x20;
            if (arg7 != null) {
                int var48 = arg7.field2441[arg5];
                int var49 = var48 >>> 16;
                var41 = arg8.method1137(126, var49);
                var38 = var48 & 0xFFFF;
                if (var41 != null) {
                    var26 |= var41.method619(98, var38);
                    var25 |= var41.method623(-75, var38);
                    var27 |= var41.method624(1, var38);
                }
                if ((arg7.field2434 || class493.field6139) && arg17 != -1 && arg7.field2441.length > arg17) {
                    int var50 = arg7.field2441[arg17];
                    var40 = arg7.field2436[arg5];
                    int var51 = var50 >>> 16;
                    var39 = var50 & 0xFFFF;
                    var42 = var49 == var51 ? var41 : arg8.method1137(127, var51);
                    if (var42 != null) {
                        var26 |= var42.method619(65, var39);
                        var25 |= var42.method623(119, var39);
                        var27 |= var42.method624(1, var39);
                    }
                }
            }
            if (arg16 != null) {
                int var52 = arg16.field2441[arg15];
                int var53 = var52 >>> 16;
                var43 = var52 & 0xFFFF;
                var46 = arg8.method1137(125, var53);
                if (var46 != null) {
                    var26 |= var46.method619(48, var43);
                    var25 |= var46.method623(126, var43);
                    var27 |= var46.method624(1, var43);
                }
                if ((arg16.field2434 || class493.field6139) && arg3 != -1 && arg16.field2441.length > arg3) {
                    int var54 = arg16.field2441[arg3];
                    var45 = arg16.field2436[arg15];
                    int var55 = var54 >>> 16;
                    var47 = var53 == var55 ? var46 : arg8.method1137(125, var55);
                    var44 = var54 & 0xFFFF;
                    if (var47 != null) {
                        var26 |= var47.method619(108, var44);
                        var25 |= var47.method623(-20, var44);
                        var27 |= var47.method624(1, var44);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
            if (var27) {
                var20 |= 0x400;
            }
        }
        class208 var56 = class442.field5559;
        class359 var58;
        synchronized (class442.field5559) {
            int var57 = -95 / ((41 - arg0) / 62);
            var58 = (class359) class442.field5559.method1221(var21, true);
        }
        class403 var59 = null;
        if (this.field8418 != -1) {
            var59 = arg12.method2907(this.field8418, 38);
        }
        if (var58 == null || arg18.method493(var58.method2075(), var20) != 0 || var59 != null && var59.field5180 != null && this.field8421 == null) {
            if (var58 != null) {
                var20 = arg18.method469(var20, var58.method2075());
            }
            boolean var61 = false;
            int var62 = 0;
            while (true) {
                if (var62 >= 12) {
                    if (var61) {
                        if (this.field8435 != -1L) {
                            class208 var90 = class442.field5559;
                            synchronized (class442.field5559) {
                                var58 = (class359) class442.field5559.method1221(this.field8435, true);
                            }
                        }
                        if (var58 == null || arg18.method493(var58.method2075(), var20) != 0 || var59 != null && var59.field5180 != null && this.field8421 == null) {
                            return null;
                        }
                    } else {
                        class229[] var64 = new class229[12];
                        for (int var65 = 0; var65 < 12; var65++) {
                            int var66 = var23[var65];
                            if ((var66 & 0x40000000) != 0) {
                                class229 var68 = arg2.method1628(var66 & 0x3FFFFFFF, (byte) -123).method538((byte) -119, this.field8429);
                                if (var68 != null) {
                                    var64[var65] = var68;
                                }
                            } else if ((var66 & Integer.MIN_VALUE) != 0) {
                                class229 var67 = arg4.method3571(3, var66 & 0x3FFFFFFF).method1028(9);
                                if (var67 != null) {
                                    var64[var65] = var67;
                                }
                            }
                        }
                        if (var59 != null && var59.field5180 != null) {
                            for (int var69 = 0; var69 < var59.field5180.length; var69++) {
                                if (var59.field5180[var69] != null && var64[var69] != null) {
                                    int var70 = var59.field5180[var69][0];
                                    int var71 = var59.field5180[var69][1];
                                    int var72 = var59.field5180[var69][2];
                                    int var73 = var59.field5180[var69][3] << 3;
                                    int var74 = var59.field5180[var69][4] << 3;
                                    int var75 = var59.field5180[var69][5] << 3;
                                    if (this.field8421 == null) {
                                        this.field8421 = new int[var59.field5180.length][];
                                    }
                                    if (this.field8421[var69] == null) {
                                        int[] var76 = this.field8421[var69] = new int[15];
                                        if (var73 == 0 && var74 == 0 && var75 == 0) {
                                            var76[12] = -var70;
                                            var76[0] = var76[4] = var76[8] = 32768;
                                            var76[13] = -var71;
                                            var76[14] = -var72;
                                        } else {
                                            int var77 = class243.field3128[var73];
                                            int var78 = class243.field3129[var73];
                                            int var79 = class243.field3128[var74];
                                            int var80 = class243.field3129[var74];
                                            int var81 = class243.field3128[var75];
                                            int var82 = class243.field3129[var75];
                                            int var83 = var78 * var81 + 8192 >> 14;
                                            int var84 = var78 * var82 + 8192 >> 14;
                                            var76[3] = var77 * var82 + 8192 >> 14;
                                            var76[7] = -var80 * -var82 + var79 * var83 + 8192 >> 14;
                                            var76[5] = -var78;
                                            var76[6] = -var80 * var81 + var79 * var84 + 8192 >> 14;
                                            var76[1] = var80 * var83 + (-var82 * var79 + 8192) >> 14;
                                            var76[8] = var77 * var79 + 8192 >> 14;
                                            var76[0] = var79 * var81 + var80 * var84 + 8192 >> 14;
                                            var76[4] = var77 * var81 + 8192 >> 14;
                                            var76[2] = var77 * var80 + 8192 >> 14;
                                            var76[13] = var76[1] * -var70 + var76[7] * -var72 + var76[4] * -var71 + 8192 >> 14;
                                            var76[12] = var76[3] * -var71 + (var76[0] * -var70 + (var76[6] * -var72)) + 8192 >> 14;
                                            var76[14] = var76[5] * -var71 + (var76[2] * -var70 + (var76[8] * -var72) + 8192) >> 14;
                                        }
                                        var76[9] = var70;
                                        var76[11] = var72;
                                        var76[10] = var71;
                                    }
                                    if (var73 != 0 || var74 != 0 || var75 != 0) {
                                        var64[var69].method1388(var75, 92, var74, var73);
                                    }
                                    if (var70 != 0 || var71 != 0 || var72 != 0) {
                                        var64[var69].method1394(var72, var71, var70, 256);
                                    }
                                }
                            }
                        }
                        class229 var85 = new class229(var64, var64.length);
                        int var86 = var20 | 0x4000;
                        var58 = arg18.method408(var85, var86, class397.field5042, 64, 850);
                        for (int var87 = 0; var87 < 5; var87++) {
                            for (int var88 = 0; var88 < class540.field6821.length; var88++) {
                                if (this.field8431[var87] < class540.field6821[var88][var87].length) {
                                    var58.method2080(class51.field654[var88][var87], class540.field6821[var88][var87][this.field8431[var87]]);
                                }
                            }
                        }
                        if (arg14) {
                            var58.method2069(var20);
                            class208 var89 = class442.field5559;
                            synchronized (class442.field5559) {
                                class442.field5559.method1230((byte) 7, var21, var58);
                            }
                            this.field8435 = var21;
                        }
                    }
                    break;
                }
                int var63 = var23[var62];
                if ((var63 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var63) != 0 && !arg4.method3571(3, var63 & 0x3FFFFFFF).method1026((byte) -98)) {
                        var61 = true;
                    }
                } else if (!arg2.method1628(var63 & 0x3FFFFFFF, (byte) -84).method537((byte) 126, this.field8429)) {
                    var61 = true;
                }
                var62++;
            }
        }
        class359 var91 = var58.method951((byte) 4, var20, true);
        if (!var28) {
            return var91;
        }
        int var92 = 0;
        int var93 = 1;
        while (var29 > var92) {
            if (class458.field5710[var92] != null) {
                var91.method2078(this.field8421 == null ? null : this.field8421[var92], class458.field5710[var92], class125.field1525[var92], var93, 0, class331.field4103[var92], class237.field3062[var92] - 1, false, class223.field2642[var92], -77, class670.field9109[var92]);
            }
            var93 <<= 0x1;
            var92++;
        }
        if (var41 != null && var46 != null) {
            var91.method2073(var41, false, var47, var42, var39, false, var40, var43, arg7.field2430, arg6 - 1, arg10 + -1, var38, var44, var45, var46);
        } else if (var41 != null) {
            var91.method2065(var41, false, var39, var40, var38, var42, arg6 - 1, 0, -122);
        } else if (var46 != null) {
            var91.method2065(var46, false, var44, var45, var43, var47, arg10 - 1, 0, -106);
        }
        for (int var94 = 0; var94 < var29; var94++) {
            class458.field5710[var94] = null;
            class223.field2642[var94] = null;
            class377.field4841[var94] = null;
        }
        return var91;
    }
}
