import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class339 {

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public int field4589 = -1;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field4580 = 0;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "Lka;")
    public static class408 field4590 = new class408(2);

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    public static int field4592 = -1;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "[I")
    public static int[] field4593 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field4596 = 0;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    private int field4576;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "J")
    private long field4575;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "J")
    private long field4578;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Z")
    public boolean field4585;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "[I")
    private int[] field4579;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "[I")
    public int[] field4584;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "[[I")
    private int[][] field4591;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)V", line = 3)
    public final void method2063(int arg0, boolean arg1) {
        if (arg0 > -64) {
            this.method2064(79, -41, -109, (class58) null, 8, (class83) null, -122, -11, -56, -55);
        }
        this.field4585 = arg1;
        field4582++;
        this.method2071((byte) 38);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIILea;ILi;IIII)Lts;", line = 24)
    public final class116 method2064(int arg0, int arg1, int arg2, class58 arg3, int arg4, class83 arg5, int arg6, int arg7, int arg8, int arg9) {
        field4581++;
        int var11 = arg0;
        if (arg5 != null) {
            boolean var12 = false;
            boolean var13 = false;
            boolean var14 = false;
            boolean var15 = true;
            boolean var16 = true;
            Object var17 = null;
            var11 = arg0 | 0x20;
            int var18 = arg5.field1145[arg7];
            Object var19 = null;
            int var20 = var18 >>> 16;
            int var21 = var18 & 0xFFFF;
            class182 var22 = class25.method153(0, var20);
            if (var22 != null) {
                var13 |= var22.method1272((byte) 105, var21);
                var12 |= var22.method1271(var21, (byte) 93);
                var14 |= arg5.field1143;
            }
            if ((arg5.field1146 || class196.field2845) && arg8 != -1 && arg8 < arg5.field1145.length) {
                int var23 = arg5.field1145[arg8];
                int var24 = var23 >>> 16;
                int var25 = var23 & 0xFFFF;
                class182 var26;
                if (var20 == var24) {
                    var26 = var22;
                } else {
                    var26 = class25.method153(0, var25 >>> 16);
                }
                if (var26 != null) {
                    var13 |= var26.method1272((byte) 127, var25);
                    var12 |= var26.method1271(var25, (byte) 93);
                }
            }
            if (var13) {
                var11 |= 0x80;
            }
            if (var12) {
                var11 |= 0x100;
            }
            if (var14) {
                var11 |= 0x200;
            }
        }
        if (arg1 <= 2) {
            this.field4589 = -101;
        }
        long var27 = (long) (arg6 << 16) | (long) arg2 << 32 | (long) arg9;
        class408 var29 = class43.field571;
        class116 var30;
        synchronized (class43.field571) {
            var30 = (class116) class43.field571.method2529(0, var27);
        }
        if (var30 == null || arg3.method187(var30.method866(), var11) != 0) {
            if (var30 != null) {
                var11 = arg3.method213(var11, var30.method866());
            }
            class98[] var32 = new class98[3];
            int var33 = 0;
            if (!class452.method2821(3, arg9).method856(true) || !class452.method2821(3, arg6).method856(true) || !class452.method2821(3, arg2).method856(true)) {
                return null;
            }
            class98 var34 = class452.method2821(3, arg9).method847((byte) -86);
            if (var34 != null) {
                var32[var33++] = var34;
            }
            class98 var35 = class452.method2821(3, arg6).method847((byte) -88);
            if (var35 != null) {
                var32[var33++] = var35;
            }
            class98 var36 = class452.method2821(3, arg2).method847((byte) -119);
            if (var36 != null) {
                var32[var33++] = var36;
            }
            class98 var37 = new class98(var32, var33);
            int var38 = var11 | 0x2000;
            var30 = arg3.method254(var37, var38, class230.field3230, 64, 768);
            for (int var39 = 0; var39 < 5; var39++) {
                if (class215.field3017[var39].length > this.field4584[var39]) {
                    var30.method909(class194.field2808[var39], class215.field3017[var39][this.field4584[var39]]);
                }
                if (this.field4584[var39] < class101.field1391[var39].length) {
                    var30.method909(class419.field5820[var39], class101.field1391[var39][this.field4584[var39]]);
                }
            }
            var30.method897(var11);
            class408 var40 = class43.field571;
            synchronized (class43.field571) {
                class43.field571.method2527(-98, var27, var30);
            }
        }
        if (arg5 == null) {
            return var30;
        } else {
            class116 var41 = var30.method907((byte) 1, var11, true);
            return arg5.method664(arg4, arg0, (byte) -115, var41, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V", line = 170)
    public static void method2065(boolean arg0) {
        if (!arg0) {
            field4592 = -27;
        }
        field4593 = null;
        field4590 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 182)
    public static final void method2066(int arg0) {
        field4594++;
        class72.field1047.method2530((byte) -59);
        class442.field6208.method2530((byte) -70);
        int var1 = -101 / ((-arg0 - 18) / 51);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 193)
    public static final void method2067(int arg0) {
        if (arg0 != -2060154424) {
            method2065(true);
        }
        field4586++;
        class408 var1 = class219.field3072;
        synchronized (class219.field3072) {
            class219.field3072.method2530((byte) -61);
        }
        class408 var2 = class445.field6237;
        synchronized (class445.field6237) {
            class445.field6237.method2530((byte) -54);
        }
        class408 var3 = class218.field3060;
        synchronized (class218.field3060) {
            class218.field3060.method2530((byte) -57);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBI)V", line = 215)
    public final void method2068(int arg0, byte arg1, int arg2) {
        int var4 = 67 % ((arg1 + 3) / 59);
        field4573++;
        int var5 = class290.field3944[arg0];
        if (this.field4579[var5] != 0 && class452.method2821(3, arg2) != null) {
            this.field4579[var5] = class431.method2655(arg2, Integer.MIN_VALUE);
            this.method2071((byte) 56);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI[III[I)V", line = 238)
    public final void method2069(boolean arg0, int arg1, int[] arg2, int arg3, int arg4, int[] arg5) {
        if (this.field4576 != arg4) {
            this.field4576 = arg4;
            this.field4591 = null;
        }
        field4574++;
        if (arg3 != -4519) {
            this.method2072(28, -45, -20, -20, (class58) null, (class83) null, 35);
        }
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class24.field311; var8++) {
                    class111 var9 = class452.method2821(3, var8);
                    if (var9 != null && !var9.field1722 && (arg0 ? class369.field5114[var7] : class334.field4528[var7]) == var9.field1713) {
                        arg2[class290.field3944[var7]] = class431.method2655(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field4584 = arg5;
        this.field4585 = arg0;
        this.field4589 = arg1;
        this.field4579 = arg2;
        this.method2071((byte) 82);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V", line = 291)
    public final void method2070(int arg0, int arg1, int arg2) {
        this.field4584[arg0] = arg1;
        field4587++;
        this.method2071((byte) 38);
        int var4 = 66 / ((arg2 - 54) / 36);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 306)
    private final void method2071(byte arg0) {
        field4577++;
        long[] var2 = class451.field6494;
        if (arg0 <= 21) {
            return;
        }
        this.field4575 = -1L;
        this.field4575 = this.field4575 >>> 8 ^ var2[(int) ((this.field4575 ^ (long) (this.field4576 >> 8)) & 0xFFL)];
        this.field4575 = var2[(int) ((this.field4575 ^ (long) this.field4576) & 0xFFL)] ^ this.field4575 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field4575 = var2[(int) ((this.field4575 ^ (long) (this.field4579[var3] >> 24)) & 0xFFL)] ^ this.field4575 >>> 8;
            this.field4575 = this.field4575 >>> 8 ^ var2[(int) (((long) (this.field4579[var3] >> 16) ^ this.field4575) & 0xFFL)];
            this.field4575 = var2[(int) (((long) (this.field4579[var3] >> 8) ^ this.field4575) & 0xFFL)] ^ this.field4575 >>> 8;
            this.field4575 = this.field4575 >>> 8 ^ var2[(int) (((long) this.field4579[var3] ^ this.field4575) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field4575 = this.field4575 >>> 8 ^ var2[(int) (((long) this.field4584[var4] ^ this.field4575) & 0xFFL)];
        }
        this.field4575 = var2[(int) ((this.field4575 ^ (long) (this.field4585 ? 1 : 0)) & 0xFFL)] ^ this.field4575 >>> 8;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIILea;Li;I)Lts;", line = 357)
    public final class116 method2072(int arg0, int arg1, int arg2, int arg3, class58 arg4, class83 arg5, int arg6) {
        field4583++;
        if (this.field4589 != -1) {
            return class11.method57(-14758, this.field4589).method1525(arg1, arg6, arg5, arg3, arg0 - 328398959, arg2, arg4);
        }
        int var8 = arg1;
        if (arg5 != null) {
            boolean var9 = false;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = true;
            boolean var13 = true;
            Object var14 = null;
            int var15 = arg5.field1145[arg3];
            Object var16 = null;
            var8 = arg1 | 0x20;
            int var17 = var15 >>> 16;
            class182 var18 = class25.method153(0, var17);
            int var19 = var15 & 0xFFFF;
            if (var18 != null) {
                var10 |= var18.method1272((byte) 114, var19);
                var9 |= var18.method1271(var19, (byte) 93);
                var11 |= arg5.field1143;
            }
            if ((arg5.field1146 || class196.field2845) && arg6 != -1 && arg5.field1145.length > arg6) {
                int var20 = arg5.field1145[arg6];
                int var21 = var20 >>> 16;
                int var22 = var20 & 0xFFFF;
                class182 var23 = var17 == var21 ? var18 : class25.method153(0, var21);
                if (var23 != null) {
                    var10 |= var23.method1272((byte) 113, var22);
                    var9 |= var23.method1271(var22, (byte) 93);
                }
            }
            if (var10) {
                var8 |= 0x80;
            }
            if (var9) {
                var8 |= 0x100;
            }
            if (var11) {
                var8 |= 0x200;
            }
        }
        class408 var24 = class43.field571;
        class116 var25;
        synchronized (class43.field571) {
            var25 = (class116) class43.field571.method2529(0, this.field4575);
        }
        if (var25 == null || arg4.method187(var25.method866(), var8) != 0) {
            if (var25 != null) {
                var8 = arg4.method213(var8, var25.method866());
            }
            boolean var27 = false;
            for (int var28 = 0; var28 < 12; var28++) {
                int var29 = this.field4579[var28];
                if ((var29 & 0x40000000) == 0) {
                    if ((var29 & Integer.MIN_VALUE) != 0 && !class452.method2821(3, var29 & 0x3FFFFFFF).method856(true)) {
                        var27 = true;
                    }
                } else if (!class367.method2308(false, var29 & 0x3FFFFFFF).method84(this.field4585, (byte) -108)) {
                    var27 = true;
                }
            }
            if (var27) {
                return null;
            }
            class98[] var30 = new class98[12];
            int var31 = 0;
            for (int var32 = 0; var32 < 12; var32++) {
                int var33 = this.field4579[var32];
                if ((var33 & 0x40000000) != 0) {
                    class98 var34 = class367.method2308(false, var33 & 0x3FFFFFFF).method72(0, this.field4585);
                    if (var34 != null) {
                        var30[var31++] = var34;
                    }
                } else if ((var33 & Integer.MIN_VALUE) != 0) {
                    class98 var35 = class452.method2821(3, var33 & 0x3FFFFFFF).method847((byte) -127);
                    if (var35 != null) {
                        var30[var31++] = var35;
                    }
                }
            }
            int var36 = var8 | 0x2000;
            class98 var37 = new class98(var30, var31);
            var25 = arg4.method254(var37, var36, class230.field3230, 64, 768);
            for (int var38 = 0; var38 < 5; var38++) {
                if (this.field4584[var38] < class215.field3017[var38].length) {
                    var25.method909(class194.field2808[var38], class215.field3017[var38][this.field4584[var38]]);
                }
                if (this.field4584[var38] < class101.field1391[var38].length) {
                    var25.method909(class419.field5820[var38], class101.field1391[var38][this.field4584[var38]]);
                }
            }
            var25.method897(var8);
            class408 var39 = class43.field571;
            synchronized (class43.field571) {
                class43.field571.method2527(-79, this.field4575, var25);
            }
        }
        if (arg5 == null) {
            return var25;
        }
        var25.method907((byte) 1, var8, true);
        if (arg0 != 328413712) {
            method2065(false);
        }
        return arg5.method664(arg2, arg1, (byte) -108, var25, arg3, arg6);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[Lub;BIILi;ZIIILea;ILi;)Lts;", line = 546)
    public final class116 method2073(int arg0, class134[] arg1, byte arg2, int arg3, int arg4, class83 arg5, boolean arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, class83 arg12) {
        field4588++;
        if (this.field4589 != -1) {
            return class11.method57(-14758, this.field4589).method1529(arg4, arg5, arg10, arg7, arg1, (byte) 113, arg9, arg0, arg3, arg8, arg12, arg11);
        }
        int var14 = arg4;
        long var15 = this.field4575;
        int[] var17 = this.field4579;
        if (arg12 != null && (arg12.field1138 >= 0 || arg12.field1156 >= 0)) {
            var17 = new int[12];
            for (int var18 = 0; var18 < 12; var18++) {
                var17[var18] = this.field4579[var18];
            }
            if (arg12.field1138 >= 0) {
                if (arg12.field1138 == 65535) {
                    var17[5] = 0;
                    var15 ^= 0xFFFFFFFF00000000L;
                } else {
                    var17[5] = class431.method2655(arg12.field1138, 1073741824);
                    var15 ^= (long) var17[5] << 32;
                }
            }
            if (arg12.field1156 >= 0) {
                if (arg12.field1156 == 65535) {
                    var15 ^= 0xFFFFFFFFL;
                    var17[3] = 0;
                } else {
                    var17[3] = class431.method2655(arg12.field1156, 1073741824);
                    var15 ^= (long) var17[3];
                }
            }
        }
        boolean var19 = false;
        boolean var20 = false;
        boolean var21 = arg12 != null || arg5 != null;
        int var22 = arg1 == null ? 0 : arg1.length;
        if (arg2 != 12) {
            this.method2064(15, -26, 52, (class58) null, -54, (class83) null, -119, 53, 96, 31);
        }
        for (int var23 = 0; var23 < var22; var23++) {
            class123.field1854[var23] = null;
            if (arg1[var23] != null) {
                class83 var24 = class408.method2521((byte) -111, arg1[var23].field1998);
                if (var24.field1145 != null) {
                    class193.field2794[var23] = var24;
                    var21 = true;
                    int var25 = arg1[var23].field1995;
                    int var26 = arg1[var23].field1996;
                    int var27 = var24.field1145[var25];
                    class123.field1854[var23] = class25.method153(0, var27 >>> 16);
                    int var28 = var27 & 0xFFFF;
                    class117.field1777[var23] = var28;
                    if (class123.field1854[var23] != null) {
                        var20 |= class123.field1854[var23].method1272((byte) 126, var28);
                        var19 |= class123.field1854[var23].method1271(var28, (byte) 93);
                    }
                    if ((var24.field1146 || class196.field2845) && var26 != -1 && var26 < var24.field1145.length) {
                        class340.field4601[var23] = var24.field1144[var25];
                        class214.field2984[var23] = arg1[var23].field2002;
                        int var29 = var24.field1145[var26];
                        class58.field752[var23] = class25.method153(0, var29 >>> 16);
                        int var30 = var29 & 0xFFFF;
                        class383.field5265[var23] = var30;
                        if (class58.field752[var23] != null) {
                            var20 |= class58.field752[var23].method1272((byte) 109, var30);
                            var19 |= class58.field752[var23].method1271(var30, (byte) 93);
                        }
                    } else {
                        class340.field4601[var23] = 0;
                        class214.field2984[var23] = 0;
                        class58.field752[var23] = null;
                        class383.field5265[var23] = -1;
                    }
                }
            }
        }
        int var31 = -1;
        int var32 = -1;
        int var33 = 0;
        class182 var34 = null;
        class182 var35 = null;
        int var36 = -1;
        int var37 = -1;
        int var38 = 0;
        class182 var39 = null;
        class182 var40 = null;
        if (var21) {
            if (arg12 != null) {
                int var41 = arg12.field1145[arg9];
                int var42 = var41 >>> 16;
                var34 = class25.method153(0, var42);
                var31 = var41 & 0xFFFF;
                if (var34 != null) {
                    var20 |= var34.method1272((byte) 106, var31);
                    var19 |= var34.method1271(var31, (byte) 93);
                }
                if ((arg12.field1146 || class196.field2845) && arg8 != -1 && arg8 < arg12.field1145.length) {
                    var33 = arg12.field1144[arg9];
                    int var43 = arg12.field1145[arg8];
                    int var44 = var43 >>> 16;
                    var35 = var42 == var44 ? var34 : class25.method153(0, var44);
                    var32 = var43 & 0xFFFF;
                    if (var35 != null) {
                        var20 |= var35.method1272((byte) 121, var32);
                        var19 |= var35.method1271(var32, (byte) 93);
                    }
                }
            }
            var14 = arg4 | 0x20;
            if (arg5 != null) {
                int var45 = arg5.field1145[arg3];
                int var46 = var45 >>> 16;
                var39 = class25.method153(0, var46);
                var36 = var45 & 0xFFFF;
                if (var39 != null) {
                    var20 |= var39.method1272((byte) 113, var36);
                    var19 |= var39.method1271(var36, (byte) 93);
                }
                if ((arg5.field1146 || class196.field2845) && arg0 != -1 && arg5.field1145.length > arg0) {
                    int var47 = arg5.field1145[arg0];
                    var38 = arg5.field1144[arg3];
                    int var48 = var47 >>> 16;
                    var37 = var47 & 0xFFFF;
                    var40 = var46 == var48 ? var39 : class25.method153(arg2 ^ 0xC, var48);
                    if (var40 != null) {
                        var20 |= var40.method1272((byte) 117, var37);
                        var19 |= var40.method1271(var37, (byte) 93);
                    }
                }
            }
            if (var20) {
                var14 |= 0x80;
            }
            if (var19) {
                var14 |= 0x100;
            }
        }
        class408 var49 = class146.field2124;
        class116 var50;
        synchronized (class146.field2124) {
            var50 = (class116) class146.field2124.method2529(0, var15);
        }
        class60 var51 = null;
        if (this.field4576 != -1) {
            var51 = class323.method1972(82, this.field4576);
        }
        if (var50 == null || arg10.method187(var50.method866(), var14) != 0 || var51 != null && var51.field788 != null && this.field4591 == null) {
            if (var50 != null) {
                var14 = arg10.method213(var14, var50.method866());
            }
            boolean var53 = false;
            int var54 = 0;
            while (true) {
                if (var54 >= 12) {
                    if (var53) {
                        if (this.field4578 != -1L) {
                            class408 var81 = class146.field2124;
                            synchronized (class146.field2124) {
                                var50 = (class116) class146.field2124.method2529(0, this.field4578);
                            }
                        }
                        if (var50 == null || arg10.method187(var50.method866(), var14) != 0 || var51 != null && var51.field788 != null && this.field4591 == null) {
                            return null;
                        }
                    } else {
                        class98[] var56 = new class98[12];
                        for (int var57 = 0; var57 < 12; var57++) {
                            int var58 = var17[var57];
                            if ((var58 & 0x40000000) != 0) {
                                class98 var59 = class367.method2308(false, var58 & 0x3FFFFFFF).method83(this.field4585, (byte) -97);
                                if (var59 != null) {
                                    var56[var57] = var59;
                                }
                            } else if ((var58 & Integer.MIN_VALUE) != 0) {
                                class98 var60 = class452.method2821(3, var58 & 0x3FFFFFFF).method850((byte) -76);
                                if (var60 != null) {
                                    var56[var57] = var60;
                                }
                            }
                        }
                        if (var51 != null && var51.field788 != null) {
                            for (int var61 = 0; var61 < var51.field788.length; var61++) {
                                if (var51.field788[var61] != null && var56[var61] != null) {
                                    int var62 = var51.field788[var61][0];
                                    int var63 = var51.field788[var61][1];
                                    int var64 = var51.field788[var61][2];
                                    int var65 = var51.field788[var61][3] << 3;
                                    int var66 = var51.field788[var61][4] << 3;
                                    int var67 = var51.field788[var61][5] << 3;
                                    if (this.field4591 == null) {
                                        this.field4591 = new int[var51.field788.length][];
                                    }
                                    if (this.field4591[var61] == null) {
                                        int[] var68 = this.field4591[var61] = new int[15];
                                        if (var65 == 0 && var66 == 0 && var67 == 0) {
                                            var68[0] = var68[4] = var68[8] = 32768;
                                            var68[14] = -var64;
                                            var68[13] = -var63;
                                            var68[12] = -var62;
                                        } else {
                                            int var69 = class136.field2020[var65];
                                            int var70 = class136.field2021[var65];
                                            int var71 = class136.field2020[var66];
                                            int var72 = class136.field2021[var66];
                                            int var73 = class136.field2020[var67];
                                            int var74 = class136.field2021[var67];
                                            int var75 = var70 * var73 + 16384 >> 15;
                                            int var76 = var70 * var74 + 16384 >> 15;
                                            var68[2] = var69 * var72 + 16384 >> 15;
                                            var68[3] = var69 * var74 + 16384 >> 15;
                                            var68[8] = var69 * var71 + 16384 >> 15;
                                            var68[6] = var71 * var76 + -var72 * var73 + 16384 >> 15;
                                            var68[5] = -var70;
                                            var68[1] = -var74 * var71 + var72 * var75 + 16384 >> 15;
                                            var68[0] = var72 * var76 + (var71 * var73 + 16384) >> 15;
                                            var68[4] = var69 * var73 + 16384 >> 15;
                                            var68[7] = -var72 * -var74 + var71 * var75 + 16384 >> 15;
                                            var68[12] = var68[6] * -var64 + var68[3] * -var63 + var68[0] * -var62 + 16384 >> 15;
                                            var68[13] = var68[7] * -var64 + var68[1] * -var62 + var68[4] * -var63 + 16384 >> 15;
                                            var68[14] = var68[8] * -var64 + var68[2] * -var62 + var68[5] * -var63 + 16384 >> 15;
                                        }
                                        var68[9] = var62;
                                        var68[11] = var64;
                                        var68[10] = var63;
                                    }
                                    if (var65 != 0 || var66 != 0 || var67 != 0) {
                                        var56[var61].method756(var66, (byte) 60, var65, var67);
                                    }
                                    if (var62 != 0 || var63 != 0 || var64 != 0) {
                                        var56[var61].method762((byte) -73, var62, var64, var63);
                                    }
                                }
                            }
                        }
                        class98 var77 = new class98(var56, var56.length);
                        int var78 = var14 | 0x2000;
                        var50 = arg10.method254(var77, var78, class230.field3230, 64, 850);
                        for (int var79 = 0; var79 < 5; var79++) {
                            if (class215.field3017[var79].length > this.field4584[var79]) {
                                var50.method909(class194.field2808[var79], class215.field3017[var79][this.field4584[var79]]);
                            }
                            if (class101.field1391[var79].length > this.field4584[var79]) {
                                var50.method909(class419.field5820[var79], class101.field1391[var79][this.field4584[var79]]);
                            }
                        }
                        if (arg6) {
                            var50.method897(var14);
                            class408 var80 = class146.field2124;
                            synchronized (class146.field2124) {
                                class146.field2124.method2527(arg2 + 102, var15, var50);
                            }
                            this.field4578 = var15;
                        }
                    }
                    break;
                }
                int var55 = var17[var54];
                if ((var55 & 0x40000000) == 0) {
                    if ((var55 & Integer.MIN_VALUE) != 0 && !class452.method2821(3, var55 & 0x3FFFFFFF).method854(true)) {
                        var53 = true;
                    }
                } else if (!class367.method2308(false, var55 & 0x3FFFFFFF).method76(this.field4585, arg2 ^ 0xFFFFFF92)) {
                    var53 = true;
                }
                var54++;
            }
        }
        class116 var82 = var50.method907((byte) 1, var14, true);
        if (!var21) {
            return var82;
        }
        int var83 = 0;
        int var84 = 1;
        while (var83 < var22) {
            if (class123.field1854[var83] != null) {
                var82.method880(0, class58.field752[var83], false, class383.field5265[var83], class340.field4601[var83], class117.field1777[var83], class214.field2984[var83] - 1, class123.field1854[var83], this.field4591 == null ? null : this.field4591[var83], 18, var84);
            }
            var84 <<= 0x1;
            var83++;
        }
        if (var34 != null && var39 != null) {
            var82.method878(var38, var40, var36, var39, var37, var35, var32, var33, arg7 - 1, arg12.field1141, false, var31, var34, (byte) -90, arg11 - 1);
        } else if (var34 != null) {
            var82.method891(var33, false, 0, var31, var32, var34, var35, 0, arg7 - 1);
        } else if (var39 != null) {
            var82.method891(var38, false, 0, var36, var37, var39, var40, 0, arg11 - 1);
        }
        for (int var85 = 0; var85 < var22; var85++) {
            class123.field1854[var85] = null;
            class58.field752[var85] = null;
            class193.field2794[var85] = null;
        }
        return var82;
    }
}
