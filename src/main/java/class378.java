import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class378 extends class508 {

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "[I")
    public int[] field4901 = new int[] { -1 };

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "[I")
    public int[] field4905 = new int[1];

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "[I")
    public static int[] field4903 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I[Leo;B)V", line = 3)
    public static final void method2203(int arg0, class423[] arg1, byte arg2) {
        int var3 = 0;
        if (arg2 < 98) {
            method2203(-61, null, (byte) -74);
        }
        while (arg1.length > var3) {
            class423 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field5741 == 0) {
                    if (var4.field5679 != null) {
                        method2203(arg0, var4.field5679, (byte) 116);
                    }
                    class367 var5 = (class367) class381.field4963.method2085((long) var4.field5734, -5423);
                    if (var5 != null) {
                        class194.method1256(var5.field4719, 0, arg0);
                    }
                }
                if (arg0 == 0 && var4.field5798 != null) {
                    class195 var6 = new class195();
                    var6.field2523 = var4.field5798;
                    var6.field2516 = var4;
                    class490.method2928(var6);
                }
                if (arg0 == 1 && var4.field5806 != null) {
                    label62: {
                        if (var4.field5756 >= 0) {
                            class423 var7 = class497.method2965(0, var4.field5734);
                            if (var7 == null || var7.field5679 == null || var4.field5756 >= var7.field5679.length || var7.field5679[var4.field5756] != var4) {
                                break label62;
                            }
                        }
                        class195 var8 = new class195();
                        var8.field2516 = var4;
                        var8.field2523 = var4.field5806;
                        class490.method2928(var8);
                    }
                }
            }
            var3++;
        }
        field4904++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZIILai;IILqa;Lhi;II)Lc;", line = 79)
    public final class507 method2204(boolean arg0, int arg1, int arg2, class345 arg3, int arg4, int arg5, class129 arg6, class44 arg7, int arg8, int arg9) {
        field4906++;
        class507 var11 = null;
        int var12 = arg8;
        class371 var13 = null;
        if (arg9 != -1) {
            var13 = class331.field4255.method1881(arg9, (byte) 54);
        }
        int[] var14 = this.field4901;
        if (var13 != null && var13.field4780 != null) {
            var14 = new int[var13.field4780.length];
            for (int var15 = 0; var15 < var13.field4780.length; var15++) {
                int var16 = var13.field4780[var15];
                if (var16 >= 0 && this.field4901.length > var16) {
                    var14[var15] = this.field4901[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        if (arg4 != 65535) {
            this.field4901 = null;
        }
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class424 var24 = null;
        class424 var25 = null;
        if (arg7 != null) {
            var12 = arg8 | 0x20;
            int var26 = arg7.field640[arg5];
            int var27 = var26 >>> 16;
            var24 = class403.field5429.method1954(var27, -97);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method2513(var21, 3553);
                var17 |= var24.method2510(-1488416952, var21);
                var20 |= var24.method2511(255, var21);
                var19 |= arg7.field646;
            }
            if ((arg7.field660 || class310.field4004) && arg2 != -1 && arg7.field640.length > arg2) {
                var23 = arg7.field647[arg5];
                int var28 = arg7.field640[arg2];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class403.field5429.method1954(var22 >>> 16, -117);
                }
                if (var25 != null) {
                    var18 |= var25.method2513(var22, 3553);
                    var17 |= var25.method2510(-1488416952, var22);
                    var20 |= var25.method2511(255, var22);
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
        long var30 = this.method2207(var14, arg0, arg9, -77, arg3 == null ? null : arg3.field4400);
        if (class212.field2721 != null) {
            var11 = (class507) class212.field2721.method78(var30, (byte) -91);
        }
        if (var11 == null || arg6.method880(var11.method475(), var12) != 0) {
            if (var11 != null) {
                var12 = arg6.method885(var12, var11.method475());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class89.field1238.method111(var14[var34], arg4 - 65448).method2968(arg0, -1)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class420[] var35 = new class420[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class89.field1238.method111(var14[var36], arg4 - 65436).method2976(arg4 - 65535, arg0);
                }
            }
            if (var13 != null && var13.field4804 != null) {
                for (int var37 = 0; var37 < var13.field4804.length; var37++) {
                    if (var13.field4804[var37] != null && var35[var37] != null) {
                        int var38 = var13.field4804[var37][0];
                        int var39 = var13.field4804[var37][1];
                        int var40 = var13.field4804[var37][2];
                        int var41 = var13.field4804[var37][3];
                        int var42 = var13.field4804[var37][4];
                        int var43 = var13.field4804[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method2471(var41, (byte) -89, var42, var43);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method2474(var39, var38, true, var40);
                        }
                    }
                }
            }
            class420 var44 = new class420(var35, var35.length);
            if (arg3 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg6.method888(var44, var32, class4.field38, 64, 850);
            if (arg3 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (arg3.field4400[var45] < class331.field4252[var45].length) {
                        var11.method478(class352.field4501[var45], class331.field4252[var45][arg3.field4400[var45]]);
                    }
                    if (arg3.field4400[var45] < class133.field1814[var45].length) {
                        var11.method478(class233.field3027[var45], class133.field1814[var45][arg3.field4400[var45]]);
                    }
                }
            }
            if (class212.field2721 != null) {
                var11.method517(var12);
                class212.field2721.method88(var30, 66, var11);
            }
        }
        if (arg7 == null || var24 == null) {
            return var11;
        } else {
            class507 var46 = var11.method510((byte) 1, var12, true);
            var46.method3018(var21, var24, var23, arg1 - 1, 0, var22, var25, arg7.field646, (byte) 59);
            return var46;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 318)
    public static void method2205(int arg0) {
        field4903 = null;
        if (arg0 > -99) {
            method2205(85);
        }
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)I", line = 328)
    public static final int method2206(int arg0) {
        field4902++;
        if (arg0 != 20293) {
            field4903 = null;
        }
        return 16;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([IZII[I)J", line = 340)
    private final long method2207(int[] arg0, boolean arg1, int arg2, int arg3, int[] arg4) {
        field4907++;
        if (arg3 > -35) {
            this.method2204(true, -81, -73, null, 115, -90, null, null, 106, -75);
        }
        long[] var6 = class180.field2345;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg2 >> 8) ^ var7) & 0xFFL)];
        long var11 = var6[(int) ((var9 ^ (long) arg2) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg0.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg0[var13] >> 24)) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg0[var13] >> 16)) & 0xFFL)];
            long var21 = var6[(int) (((long) (arg0[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var6[(int) (((long) arg0[var13] ^ var21) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg4 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg4[var14]) & 0xFFL)];
            }
        }
        return var6[(int) (((long) (arg1 ? 1 : 0) ^ var11) & 0xFFL)] ^ var11 >>> 8;
    }
}
