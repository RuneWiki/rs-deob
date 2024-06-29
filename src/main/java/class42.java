import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class42 {

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public int field623 = -1;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Lri;")
    public static class73 field632 = new class73(68, -2);

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    private int field630;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "J")
    private long field625;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "J")
    private long field626;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "Laa;")
    public static class335 field640;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Z")
    public boolean field620;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "[I")
    public int[] field627;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "[I")
    private int[] field634;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "[[I")
    private int[][] field618;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBI)I")
    public static final int method249(int arg0, int arg1, byte arg2, int arg3) {
        field637++;
        if (arg2 != -72) {
            method254(59);
        }
        if (arg0 > arg1) {
            return arg0;
        } else if (arg3 >= arg1) {
            return arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CB)Z")
    public static final boolean method250(char arg0, byte arg1) {
        if (arg1 >= -91) {
            method261(-67, -25);
        }
        field628++;
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BILqa;IIILej;Ltn;Lrh;Lnm;Ljt;Lbp;)Lc;")
    public final class121 method251(byte arg0, int arg1, class162 arg2, int arg3, int arg4, int arg5, class78 arg6, class58 arg7, class172 arg8, class329 arg9, class67 arg10, class261 arg11) {
        field639++;
        if (this.field623 != -1) {
            return arg11.method1733(true, this.field623).method2089(arg2, arg9, arg5, arg4, arg1, arg8, (byte) -80, arg7, arg3);
        }
        int var13 = -12 / ((-arg0 - 13) / 55);
        int var14 = arg1;
        if (arg9 != null) {
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = false;
            boolean var19 = true;
            boolean var20 = true;
            Object var21 = null;
            int var22 = arg9.field4670[arg5];
            Object var23 = null;
            var14 = arg1 | 0x20;
            int var24 = var22 >>> 16;
            int var25 = var22 & 0xFFFF;
            class528 var26 = arg8.method1184(-77, var24);
            if (var26 != null) {
                var16 |= var26.method3117(var25, 68);
                var15 |= var26.method3116(-123, var25);
                var18 |= var26.method3119(-1956869444, var25);
                var17 |= arg9.field4675;
            }
            if ((arg9.field4666 || class307.field4418) && arg3 != -1 && arg9.field4670.length > arg3) {
                int var27 = arg9.field4670[arg3];
                int var28 = var27 >>> 16;
                class528 var29 = var24 == var28 ? var26 : arg8.method1184(115, var28);
                int var30 = var27 & 0xFFFF;
                if (var29 != null) {
                    var16 |= var29.method3117(var30, 34);
                    var15 |= var29.method3116(-119, var30);
                    var18 |= var29.method3119(-1956869444, var30);
                }
            }
            if (var16) {
                var14 |= 0x80;
            }
            if (var15) {
                var14 |= 0x100;
            }
            if (var17) {
                var14 |= 0x200;
            }
            if (var18) {
                var14 |= 0x400;
            }
        }
        class226 var31 = class359.field5506;
        class121 var32;
        synchronized (class359.field5506) {
            var32 = (class121) class359.field5506.method1536(this.field626, 0);
        }
        if (var32 == null || arg2.method1122(var32.method738(), var14) != 0) {
            if (var32 != null) {
                var14 = arg2.method1051(var14, var32.method738());
            }
            boolean var34 = false;
            for (int var35 = 0; var35 < 12; var35++) {
                int var36 = this.field634[var35];
                if ((var36 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var36) != 0 && !arg10.method396(var36 & 0x3FFFFFFF, false).method933(-114)) {
                        var34 = true;
                    }
                } else if (!arg6.method453(0, var36 & 0x3FFFFFFF).method2070(this.field620, -1)) {
                    var34 = true;
                }
            }
            if (var34) {
                return null;
            }
            class521[] var37 = new class521[12];
            int var38 = 0;
            for (int var39 = 0; var39 < 12; var39++) {
                int var40 = this.field634[var39];
                if ((var40 & 0x40000000) != 0) {
                    class521 var41 = arg6.method453(0, var40 & 0x3FFFFFFF).method2072(this.field620, 0);
                    if (var41 != null) {
                        var37[var38++] = var41;
                    }
                } else if ((var40 & Integer.MIN_VALUE) != 0) {
                    class521 var42 = arg10.method396(var40 & 0x3FFFFFFF, false).method935((byte) 103);
                    if (var42 != null) {
                        var37[var38++] = var42;
                    }
                }
            }
            int var43 = var14 | 0x4000;
            class521 var44 = new class521(var37, var38);
            var32 = arg2.method1118(var44, var43, class518.field7542, 64, 768);
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field627[var45] < class68.field1041[var45].length) {
                    var32.method713(class263.field3856[var45], class68.field1041[var45][this.field627[var45]]);
                }
                if (this.field627[var45] < class4.field52[var45].length) {
                    var32.method713(class150.field2236[var45], class4.field52[var45][this.field627[var45]]);
                }
            }
            var32.method719(var14);
            class226 var46 = class359.field5506;
            synchronized (class359.field5506) {
                class359.field5506.method1542(var32, (byte) 112, this.field626);
            }
        }
        if (arg9 == null) {
            return var32;
        } else {
            var32.method723((byte) 4, var14, true);
            return arg9.method2018(arg1, arg4, var32, arg3, arg5, -2227);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z[IIII[I)V")
    public final void method252(boolean arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (this.field630 != arg3) {
            this.field618 = null;
            this.field630 = arg3;
        }
        this.field623 = arg2;
        this.field620 = arg0;
        this.field634 = arg1;
        field622++;
        this.field627 = arg5;
        this.method253(38541192);
        if (arg4 != 1073741824) {
            this.method256((byte) 104, 3, null, -6);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    private final void method253(int arg0) {
        field631++;
        long[] var2 = class279.field4025;
        if (arg0 != 38541192) {
            return;
        }
        this.field626 = -1L;
        this.field626 = var2[(int) (((long) (this.field630 >> 8) ^ this.field626) & 0xFFL)] ^ this.field626 >>> 8;
        this.field626 = var2[(int) (((long) this.field630 ^ this.field626) & 0xFFL)] ^ this.field626 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field626 = var2[(int) ((this.field626 ^ (long) (this.field634[var3] >> 24)) & 0xFFL)] ^ this.field626 >>> 8;
            this.field626 = var2[(int) ((this.field626 ^ (long) (this.field634[var3] >> 16)) & 0xFFL)] ^ this.field626 >>> 8;
            this.field626 = this.field626 >>> 8 ^ var2[(int) (((long) (this.field634[var3] >> 8) ^ this.field626) & 0xFFL)];
            this.field626 = var2[(int) ((this.field626 ^ (long) this.field634[var3]) & 0xFFL)] ^ this.field626 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field626 = this.field626 >>> 8 ^ var2[(int) (((long) this.field627[var4] ^ this.field626) & 0xFFL)];
        }
        this.field626 = this.field626 >>> 8 ^ var2[(int) ((this.field626 ^ (long) (this.field620 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public static final void method254(int arg0) {
        class356.field5471.field3037 = 0;
        field629++;
        class47.field765 = null;
        class5.field73 = 0;
        class248.field3645 = 0;
        class66.field1009.field3037 = 0;
        class471.field6941 = null;
        class80.field1218 = null;
        class352.field5395 = 0;
        class59.field883 = null;
        class203.method1377(false);
        class315.method1968(-128);
        for (int var1 = 0; var1 < 2048; var1++) {
            class44.field707[var1] = null;
        }
        class500.field7365 = null;
        for (int var2 = 0; var2 < class193.field2821.length; var2++) {
            class167 var4 = class193.field2821[var2];
            if (var4 != null) {
                var4.field1904 = -1;
            }
        }
        if (arg0 < 14) {
            method261(61, 30);
        }
        class357.method2227((byte) -86);
        class140.field2103 = 1;
        class11.method76(false, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class315.field4503[var3] = true;
        }
        class321.method1992(107);
        client.field2857 = null;
        class110.field1574 = 0L;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)V")
    public final void method255(boolean arg0, int arg1) {
        field624++;
        this.field620 = arg0;
        if (arg1 < 106) {
            this.method255(false, -16);
        }
        this.method253(38541192);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BILjt;I)V")
    public final void method256(byte arg0, int arg1, class67 arg2, int arg3) {
        field619++;
        int var5 = class28.field294[arg3];
        if (this.field634[var5] == 0 || arg2.method396(arg1, false) == null) {
            return;
        }
        this.field634[var5] = class18.method119(arg1, Integer.MIN_VALUE);
        if (arg0 >= -107) {
            this.method253(-111);
        }
        this.method253(38541192);
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    public static void method257(int arg0) {
        field640 = null;
        if (arg0 != 0) {
            field640 = null;
        }
        field632 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILqa;ILnm;IIZLrh;ILjt;)Lc;")
    public final class121 method258(int arg0, int arg1, int arg2, class162 arg3, int arg4, class329 arg5, int arg6, int arg7, boolean arg8, class172 arg9, int arg10, class67 arg11) {
        field633++;
        int var13 = arg4;
        if (arg5 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg5.field4670[arg10];
            Object var22 = null;
            var13 = arg4 | 0x20;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class528 var25 = arg9.method1184(118, var23);
            if (var25 != null) {
                var15 |= var25.method3117(var24, 99);
                var14 |= var25.method3116(-125, var24);
                var17 |= var25.method3119(-1956869444, var24);
                var16 |= arg5.field4675;
            }
            if ((arg5.field4666 || class307.field4418) && arg6 != -1 && arg5.field4670.length > arg6) {
                int var26 = arg5.field4670[arg6];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class528 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg9.method1184(117, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method3117(var28, 49);
                    var14 |= var29.method3116(-124, var28);
                    var17 |= var29.method3119(-1956869444, var28);
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
        long var30 = (long) arg7 | (long) (arg0 << 16) | (long) arg1 << 32;
        class226 var32 = class359.field5506;
        class121 var33;
        synchronized (class359.field5506) {
            var33 = (class121) class359.field5506.method1536(var30, 0);
        }
        if (var33 == null || arg3.method1122(var33.method738(), var13) != 0) {
            if (var33 != null) {
                var13 = arg3.method1051(var13, var33.method738());
            }
            class521[] var35 = new class521[3];
            int var36 = 0;
            if (!arg11.method396(arg7, false).method933(-119) || !arg11.method396(arg0, false).method933(-57) || !arg11.method396(arg1, false).method933(-102)) {
                return null;
            }
            class521 var37 = arg11.method396(arg7, !arg8).method935((byte) 120);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class521 var38 = arg11.method396(arg0, false).method935((byte) 35);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class521 var39 = arg11.method396(arg1, false).method935((byte) -119);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class521 var40 = new class521(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg3.method1118(var40, var41, class518.field7542, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (class68.field1041[var42].length > this.field627[var42]) {
                    var33.method713(class263.field3856[var42], class68.field1041[var42][this.field627[var42]]);
                }
                if (class4.field52[var42].length > this.field627[var42]) {
                    var33.method713(class150.field2236[var42], class4.field52[var42][this.field627[var42]]);
                }
            }
            var33.method719(var13);
            class226 var43 = class359.field5506;
            synchronized (class359.field5506) {
                class359.field5506.method1542(var33, (byte) 112, var30);
            }
        }
        if (arg5 == null) {
            return var33;
        } else {
            class121 var44 = var33.method723((byte) 4, var13, arg8);
            return arg5.method2018(arg4, arg2, var44, arg6, arg10, -2227);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
    public final void method259(int arg0, int arg1, int arg2) {
        field636++;
        this.field627[arg1] = arg2;
        this.method253(38541192);
        if (arg0 != 12) {
            method261(81, -57);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILrh;Lqa;Lej;[Lgt;Lbp;IZLjt;Lnm;Ltn;Lns;IIIILnm;I)Lc;")
    public final class121 method260(int arg0, int arg1, class172 arg2, class162 arg3, class78 arg4, class315[] arg5, class261 arg6, int arg7, boolean arg8, class67 arg9, class329 arg10, class58 arg11, class277 arg12, int arg13, int arg14, int arg15, int arg16, class329 arg17, int arg18) {
        field621++;
        if (this.field623 != -1) {
            return arg6.method1733(true, this.field623).method2084(arg13, arg1, 64, arg15, arg17, arg11, arg18, arg7, arg5, arg12, arg2, arg14, arg3, arg10, arg16);
        }
        int var20 = arg15;
        long var21 = this.field626;
        int[] var23 = this.field634;
        if (arg17 != null && (arg17.field4655 >= 0 || arg17.field4667 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field634[var24];
            }
            if (arg17.field4655 >= 0) {
                if (arg17.field4655 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class18.method119(1073741824, arg17.field4655);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg17.field4667 >= 0) {
                if (arg17.field4667 == 65535) {
                    var21 ^= 0xFFFFFFFFL;
                    var23[3] = 0;
                } else {
                    var23[3] = class18.method119(arg17.field4667, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg17 != null || arg10 != null;
        int var29 = arg5 == null ? 0 : arg5.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class231.field3449[var30] = null;
            if (arg5[var30] != null) {
                class329 var31 = arg2.method1182(arg5[var30].field4488, 8);
                if (var31.field4670 != null) {
                    var28 = true;
                    class118.field1785[var30] = var31;
                    int var32 = arg5[var30].field4498;
                    int var33 = arg5[var30].field4492;
                    int var34 = var31.field4670[var32];
                    class231.field3449[var30] = arg2.method1184(-57, var34 >>> 16);
                    int var35 = var34 & 0xFFFF;
                    class355.field5461[var30] = var35;
                    if (class231.field3449[var30] != null) {
                        var26 |= class231.field3449[var30].method3117(var35, 73);
                        var25 |= class231.field3449[var30].method3116(-120, var35);
                        var27 |= class231.field3449[var30].method3119(-1956869444, var35);
                    }
                    if ((var31.field4666 || class307.field4418) && var33 != -1 && var33 < var31.field4670.length) {
                        class500.field7362[var30] = var31.field4665[var32];
                        class251.field3736[var30] = arg5[var30].field4500;
                        int var36 = var31.field4670[var33];
                        class139.field2089[var30] = arg2.method1184(122, var36 >>> 16);
                        int var37 = var36 & 0xFFFF;
                        class137.field2069[var30] = var37;
                        if (class139.field2089[var30] != null) {
                            var26 |= class139.field2089[var30].method3117(var37, 116);
                            var25 |= class139.field2089[var30].method3116(-124, var37);
                            var27 |= class139.field2089[var30].method3119(-1956869444, var37);
                        }
                    } else {
                        class500.field7362[var30] = 0;
                        class251.field3736[var30] = 0;
                        class139.field2089[var30] = null;
                        class137.field2069[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class528 var41 = null;
        class528 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class528 var46 = null;
        class528 var47 = null;
        if (var28) {
            var20 = arg15 | 0x20;
            if (arg17 != null) {
                int var48 = arg17.field4670[arg7];
                int var49 = var48 >>> 16;
                var41 = arg2.method1184(110, var49);
                var38 = var48 & 0xFFFF;
                if (var41 != null) {
                    var26 |= var41.method3117(var38, 120);
                    var25 |= var41.method3116(-128, var38);
                    var27 |= var41.method3119(-1956869444, var38);
                }
                if ((arg17.field4666 || class307.field4418) && arg14 != -1 && arg14 < arg17.field4670.length) {
                    var40 = arg17.field4665[arg7];
                    int var50 = arg17.field4670[arg14];
                    int var51 = var50 >>> 16;
                    var42 = var49 == var51 ? var41 : arg2.method1184(123, var51);
                    var39 = var50 & 0xFFFF;
                    if (var42 != null) {
                        var26 |= var42.method3117(var39, 88);
                        var25 |= var42.method3116(-115, var39);
                        var27 |= var42.method3119(-1956869444, var39);
                    }
                }
            }
            if (arg10 != null) {
                int var52 = arg10.field4670[arg18];
                int var53 = var52 >>> 16;
                var46 = arg2.method1184(122, var53);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method3117(var43, 41);
                    var25 |= var46.method3116(-113, var43);
                    var27 |= var46.method3119(-1956869444, var43);
                }
                if ((arg10.field4666 || class307.field4418) && arg16 != -1 && arg10.field4670.length > arg16) {
                    int var54 = arg10.field4670[arg16];
                    var45 = arg10.field4665[arg18];
                    int var55 = var54 >>> 16;
                    var47 = var53 == var55 ? var46 : arg2.method1184(-106, var55);
                    var44 = var54 & 0xFFFF;
                    if (var47 != null) {
                        var26 |= var47.method3117(var44, 104);
                        var25 |= var47.method3116(-128, var44);
                        var27 |= var47.method3119(-1956869444, var44);
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
        class226 var56 = class111.field1596;
        class121 var57;
        synchronized (class111.field1596) {
            var57 = (class121) class111.field1596.method1536(var21, 0);
        }
        class82 var58 = null;
        if (this.field630 != -1) {
            var58 = arg12.method1810(this.field630, 13787);
        }
        if (var57 == null || arg3.method1122(var57.method738(), var20) != 0 || var58 != null && var58.field1275 != null && this.field618 == null) {
            if (var57 != null) {
                var20 = arg3.method1051(var20, var57.method738());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((var62 & Integer.MIN_VALUE) != 0 && !arg9.method396(var62 & 0x3FFFFFFF, false).method934((byte) -87)) {
                        var60 = true;
                    }
                } else if (!arg4.method453(0, var62 & 0x3FFFFFFF).method2076(this.field620, false)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field625 != -1L) {
                    class226 var63 = class111.field1596;
                    synchronized (class111.field1596) {
                        var57 = (class121) class111.field1596.method1536(this.field625, 0);
                    }
                }
                if (var57 == null || arg3.method1122(var57.method738(), var20) != 0 || var58 != null && var58.field1275 != null && this.field618 == null) {
                    return null;
                }
            } else {
                class521[] var64 = new class521[12];
                for (int var65 = 0; var65 < 12; var65++) {
                    int var66 = var23[var65];
                    if ((var66 & 0x40000000) != 0) {
                        class521 var68 = arg4.method453(0, var66 & 0x3FFFFFFF).method2067(0, this.field620);
                        if (var68 != null) {
                            var64[var65] = var68;
                        }
                    } else if ((var66 & Integer.MIN_VALUE) != 0) {
                        class521 var67 = arg9.method396(var66 & 0x3FFFFFFF, false).method927(true);
                        if (var67 != null) {
                            var64[var65] = var67;
                        }
                    }
                }
                if (var58 != null && var58.field1275 != null) {
                    for (int var69 = 0; var69 < var58.field1275.length; var69++) {
                        if (var58.field1275[var69] != null && var64[var69] != null) {
                            int var70 = var58.field1275[var69][0];
                            int var71 = var58.field1275[var69][1];
                            int var72 = var58.field1275[var69][2];
                            int var73 = var58.field1275[var69][3] << 3;
                            int var74 = var58.field1275[var69][4] << 3;
                            int var75 = var58.field1275[var69][5] << 3;
                            if (this.field618 == null) {
                                this.field618 = new int[var58.field1275.length][];
                            }
                            if (this.field618[var69] == null) {
                                int[] var76 = this.field618[var69] = new int[15];
                                if (var73 == 0 && var74 == 0 && var75 == 0) {
                                    var76[13] = -var71;
                                    var76[14] = -var72;
                                    var76[12] = -var70;
                                    var76[0] = var76[4] = var76[8] = 32768;
                                } else {
                                    int var77 = class457.field6759[var73];
                                    int var78 = class457.field6760[var73];
                                    int var79 = class457.field6759[var74];
                                    int var80 = class457.field6760[var74];
                                    int var81 = class457.field6759[var75];
                                    int var82 = class457.field6760[var75];
                                    int var83 = var78 * var81 + 16384 >> 15;
                                    int var84 = var78 * var82 + 16384 >> 15;
                                    var76[5] = -var78;
                                    var76[0] = var79 * var81 + var80 * var84 + 16384 >> 15;
                                    var76[4] = var77 * var81 + 16384 >> 15;
                                    var76[2] = var77 * var80 + 16384 >> 15;
                                    var76[6] = -var80 * var81 + var79 * var84 + 16384 >> 15;
                                    var76[7] = -var80 * -var82 + var79 * var83 + 16384 >> 15;
                                    var76[1] = var80 * var83 + (-var82 * var79 + 16384) >> 15;
                                    var76[8] = var77 * var79 + 16384 >> 15;
                                    var76[3] = var77 * var82 + 16384 >> 15;
                                    var76[12] = var76[6] * -var72 + var76[3] * -var71 + var76[0] * -var70 + 16384 >> 15;
                                    var76[13] = var76[1] * -var70 + var76[7] * -var72 + var76[4] * -var71 + 16384 >> 15;
                                    var76[14] = var76[8] * -var72 + var76[2] * -var70 + var76[5] * -var71 + 16384 >> 15;
                                }
                                var76[10] = var71;
                                var76[9] = var70;
                                var76[11] = var72;
                            }
                            if (var73 != 0 || var74 != 0 || var75 != 0) {
                                var64[var69].method3094(-123, var74, var73, var75);
                            }
                            if (var70 != 0 || var71 != 0 || var72 != 0) {
                                var64[var69].method3088(var70, var72, var71, false);
                            }
                        }
                    }
                }
                int var85 = var20 | 0x4000;
                class521 var86 = new class521(var64, var64.length);
                var57 = arg3.method1118(var86, var85, class518.field7542, 64, 850);
                for (int var87 = 0; var87 < 5; var87++) {
                    if (class68.field1041[var87].length > this.field627[var87]) {
                        var57.method713(class263.field3856[var87], class68.field1041[var87][this.field627[var87]]);
                    }
                    if (this.field627[var87] < class4.field52[var87].length) {
                        var57.method713(class150.field2236[var87], class4.field52[var87][this.field627[var87]]);
                    }
                }
                if (arg8) {
                    var57.method719(var20);
                    class226 var88 = class111.field1596;
                    synchronized (class111.field1596) {
                        class111.field1596.method1542(var57, (byte) 112, var21);
                    }
                    this.field625 = var21;
                }
            }
        }
        class121 var89 = var57.method723((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var29 > var90) {
            if (class231.field3449[var90] != null) {
                var89.method797(var91, -1, 0, false, class500.field7362[var90], class251.field3736[var90] - 1, class355.field5461[var90], class137.field2069[var90], this.field618 == null ? null : this.field618[var90], class231.field3449[var90], class139.field2089[var90]);
            }
            var91 <<= 0x1;
            var90++;
        }
        if (var41 != null && var46 != null) {
            var89.method798(arg1 - 1, var39, (byte) 27, false, var41, var40, var38, var47, var43, arg13 - 1, var42, arg17.field4671, var46, var44, var45);
        } else if (var41 != null) {
            var89.method795(var41, 0, false, arg1 - 1, var40, var42, (byte) -124, var38, var39);
        } else if (var46 != null) {
            var89.method795(var46, 0, false, arg13 - 1, var45, var47, (byte) -119, var43, var44);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class231.field3449[var92] = null;
            class139.field2089[var92] = null;
            class118.field1785[var92] = null;
        }
        if (arg0 > -18) {
            field632 = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
    public static final void method261(int arg0, int arg1) {
        field641++;
        class338 var2 = class230.method1580(arg0, -1332166328, arg1);
        var2.method2052(100);
    }

    static {
        new class475("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field635 = 0;
    }
}
