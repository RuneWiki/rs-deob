import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class335 {

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public int field4454 = -1;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "F")
    public static float field4460 = 0.0F;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field4462 = 0;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4466 = "Loading sprites - ";

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field4449 = 0;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    private int field4455;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "J")
    private long field4452;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "J")
    private long field4457;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "Ljava/awt/Image;")
    public static Image field4451;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ol", name = "z", descriptor = "Ljava/lang/Class;")
    public static Class field4471;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "Z")
    public boolean field4447;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "[I")
    public int[] field4450;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "[I")
    private int[] field4456;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "[Llg;")
    public static class20[] field4469;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "[[I")
    private int[][] field4446;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1919(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIILvm;Llb;IB)Ljn;", line = 3)
    public final class396 method1907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class322 arg6, class208 arg7, int arg8, byte arg9) {
        field4448++;
        int var11 = arg1;
        if (arg7 != null) {
            boolean var12 = false;
            boolean var13 = false;
            boolean var14 = false;
            boolean var15 = true;
            boolean var16 = true;
            Object var17 = null;
            var11 = arg1 | 0x20;
            int var18 = arg7.field2823[arg4];
            Object var19 = null;
            int var20 = var18 >>> 16;
            int var21 = var18 & 0xFFFF;
            class127 var22 = class451.method2800(var20, arg9 ^ 0xFFFFFF84);
            if (var22 != null) {
                var13 |= var22.method685(var21, arg9 + 123);
                var12 |= var22.method686(var21, true);
                var14 |= arg7.field2811;
            }
            if ((arg7.field2803 || class83.field926) && arg2 != -1 && arg2 < arg7.field2823.length) {
                int var23 = arg7.field2823[arg2];
                int var24 = var23 >>> 16;
                int var25 = var23 & 0xFFFF;
                class127 var26;
                if (var20 == var24) {
                    var26 = var22;
                } else {
                    var26 = class451.method2800(var25 >>> 16, 0);
                }
                if (var26 != null) {
                    var13 |= var26.method685(var25, -1);
                    var12 |= var26.method686(var25, true);
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
        long var27 = (long) (arg5 << 16) | (long) arg0 << 32 | (long) arg3;
        class114 var29 = class131.field1689;
        class396 var30;
        synchronized (class131.field1689) {
            var30 = (class396) class131.field1689.method616(arg9 + 32, var27);
        }
        if (var30 == null || arg6.method1620(var30.method2312(), var11) != 0) {
            if (var30 != null) {
                var11 = arg6.method1634(var11, var30.method2312());
            }
            class390[] var32 = new class390[3];
            int var33 = 0;
            if (!class65.method370(arg3, 4096).method2412(arg9 + 124) || !class65.method370(arg5, 4096).method2412(arg9 ^ 0xFFFFFF84) || !class65.method370(arg0, 4096).method2412(0)) {
                return null;
            }
            class390 var34 = class65.method370(arg3, 4096).method2418(arg9 ^ 0xFFFFFF84);
            if (var34 != null) {
                var32[var33++] = var34;
            }
            class390 var35 = class65.method370(arg5, 4096).method2418(0);
            if (var35 != null) {
                var32[var33++] = var35;
            }
            class390 var36 = class65.method370(arg0, 4096).method2418(0);
            if (var36 != null) {
                var32[var33++] = var36;
            }
            class390 var37 = new class390(var32, var33);
            int var38 = var11 | 0x2000;
            var30 = arg6.method1651(var37, var38, class67.field697, 64, 768);
            for (int var39 = 0; var39 < 5; var39++) {
                if (this.field4450[var39] < class309.field4178[var39].length) {
                    var30.method2307(class392.field5647[var39], class309.field4178[var39][this.field4450[var39]]);
                }
                if (class38.field395[var39].length > this.field4450[var39]) {
                    var30.method2307(class188.field2368[var39], class38.field395[var39][this.field4450[var39]]);
                }
            }
            var30.method2267(var11);
            class114 var40 = class131.field1689;
            synchronized (class131.field1689) {
                class131.field1689.method615((byte) -127, var27, var30);
            }
        }
        if (arg7 == null) {
            return var30;
        } else {
            class396 var41 = var30.method2297((byte) 1, var11, true);
            class396 var42 = arg7.method1124(var41, arg1, -291065264, arg2, arg4, arg8);
            return arg9 == -124 ? var42 : null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V", line = 144)
    public final void method1908(int arg0, int arg1, int arg2) {
        field4468++;
        this.field4450[arg2] = arg1;
        if (arg0 == 1) {
            this.method1914(true);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lvm;IIIILlb;I)Ljn;", line = 159)
    public final class396 method1909(class322 arg0, int arg1, int arg2, int arg3, int arg4, class208 arg5, int arg6) {
        field4463++;
        if (this.field4454 != -1) {
            return class6.method30((byte) -111, this.field4454).method2015(arg4, arg0, arg1, arg3, arg2, -7, arg5);
        }
        int var8 = arg4;
        if (arg5 != null) {
            boolean var9 = false;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = true;
            boolean var13 = true;
            Object var14 = null;
            Object var15 = null;
            int var16 = arg5.field2823[arg1];
            var8 = arg4 | 0x20;
            int var17 = var16 >>> 16;
            int var18 = var16 & 0xFFFF;
            class127 var19 = class451.method2800(var17, 0);
            if (var19 != null) {
                var10 |= var19.method685(var18, -1);
                var9 |= var19.method686(var18, true);
                var11 |= arg5.field2811;
            }
            if ((arg5.field2803 || class83.field926) && arg2 != -1 && arg2 < arg5.field2823.length) {
                int var20 = arg5.field2823[arg2];
                int var21 = var20 >>> 16;
                int var22 = var20 & 0xFFFF;
                class127 var23;
                if (var17 == var21) {
                    var23 = var19;
                } else {
                    var23 = class451.method2800(var22 >>> 16, 0);
                }
                if (var23 != null) {
                    var10 |= var23.method685(var22, -1);
                    var9 |= var23.method686(var22, true);
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
        class114 var24 = class131.field1689;
        class396 var26;
        synchronized (class131.field1689) {
            int var25 = -38 % ((arg6 + 43) / 55);
            var26 = (class396) class131.field1689.method616(124, this.field4457);
        }
        if (var26 == null || arg0.method1620(var26.method2312(), var8) != 0) {
            if (var26 != null) {
                var8 = arg0.method1634(var8, var26.method2312());
            }
            boolean var28 = false;
            for (int var29 = 0; var29 < 12; var29++) {
                int var30 = this.field4456[var29];
                if ((var30 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var30) != 0 && !class65.method370(var30 & 0x3FFFFFFF, 4096).method2412(0)) {
                        var28 = true;
                    }
                } else if (!class65.method368(var30 & 0x3FFFFFFF, -112).method664(0, this.field4447)) {
                    var28 = true;
                }
            }
            if (var28) {
                return null;
            }
            class390[] var31 = new class390[12];
            int var32 = 0;
            for (int var33 = 0; var33 < 12; var33++) {
                int var34 = this.field4456[var33];
                if ((var34 & 0x40000000) != 0) {
                    class390 var35 = class65.method368(var34 & 0x3FFFFFFF, -122).method653(this.field4447, -28344);
                    if (var35 != null) {
                        var31[var32++] = var35;
                    }
                } else if ((Integer.MIN_VALUE & var34) != 0) {
                    class390 var36 = class65.method370(var34 & 0x3FFFFFFF, 4096).method2418(0);
                    if (var36 != null) {
                        var31[var32++] = var36;
                    }
                }
            }
            class390 var37 = new class390(var31, var32);
            int var38 = var8 | 0x2000;
            var26 = arg0.method1651(var37, var38, class67.field697, 64, 768);
            for (int var39 = 0; var39 < 5; var39++) {
                if (this.field4450[var39] < class309.field4178[var39].length) {
                    var26.method2307(class392.field5647[var39], class309.field4178[var39][this.field4450[var39]]);
                }
                if (this.field4450[var39] < class38.field395[var39].length) {
                    var26.method2307(class188.field2368[var39], class38.field395[var39][this.field4450[var39]]);
                }
            }
            var26.method2267(var8);
            class114 var40 = class131.field1689;
            synchronized (class131.field1689) {
                class131.field1689.method615((byte) -119, this.field4457, var26);
            }
        }
        if (arg5 == null) {
            return var26;
        } else {
            var26.method2297((byte) 1, var8, true);
            return arg5.method1124(var26, arg4, -291065264, arg2, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII)Z", line = 348)
    public static final boolean method1910(int arg0, int arg1, int arg2, int arg3) {
        field4453++;
        boolean var4 = true;
        if (arg3 != 5) {
            return false;
        }
        class285 var5 = (class285) class173.method906(arg2, arg1, arg0);
        if (var5 != null) {
            var4 &= class7.method34(var5, (byte) 116);
        }
        class285 var6 = (class285) class165.method878(arg2, arg1, arg0, field4471 == null ? (field4471 = method1919("io")) : field4471);
        if (var6 != null) {
            var4 &= class7.method34(var6, (byte) 116);
        }
        class285 var7 = (class285) class275.method1514(arg2, arg1, arg0);
        if (var7 != null) {
            var4 &= class7.method34(var7, (byte) 116);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 374)
    public static void method1911(int arg0) {
        field4469 = null;
        field4466 = null;
        if (arg0 == 9) {
            field4451 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZLlb;IIILvm;Llb;[Lsc;IIII)Ljn;", line = 387)
    public final class396 method1912(int arg0, boolean arg1, class208 arg2, int arg3, int arg4, int arg5, class322 arg6, class208 arg7, class395[] arg8, int arg9, int arg10, int arg11, int arg12) {
        field4458++;
        if (~this.field4454 != arg11) {
            return class6.method30((byte) -127, this.field4454).method2023(arg3, 8, arg12, arg6, arg2, arg9, arg4, arg10, arg0, arg5, arg8, arg7);
        }
        int var14 = arg12;
        long var15 = this.field4457;
        int[] var17 = this.field4456;
        if (arg2 != null && (arg2.field2825 >= 0 || arg2.field2824 >= 0)) {
            var17 = new int[12];
            for (int var18 = 0; var18 < 12; var18++) {
                var17[var18] = this.field4456[var18];
            }
            if (arg2.field2825 >= 0) {
                if (arg2.field2825 == 65535) {
                    var15 ^= 0xFFFFFFFF00000000L;
                    var17[5] = 0;
                } else {
                    var17[5] = class392.method2441(1073741824, arg2.field2825);
                    var15 ^= (long) var17[5] << 32;
                }
            }
            if (arg2.field2824 >= 0) {
                if (arg2.field2824 == 65535) {
                    var17[3] = 0;
                    var15 ^= 0xFFFFFFFFL;
                } else {
                    var17[3] = class392.method2441(1073741824, arg2.field2824);
                    var15 ^= (long) var17[3];
                }
            }
        }
        boolean var19 = false;
        boolean var20 = false;
        boolean var21 = arg2 != null || arg7 != null;
        int var22 = arg8 == null ? 0 : arg8.length;
        for (int var23 = 0; var23 < var22; var23++) {
            class153.field1934[var23] = null;
            if (arg8[var23] != null) {
                class208 var24 = class193.method1037(114, arg8[var23].field5685);
                if (var24.field2823 != null) {
                    var21 = true;
                    class339.field4533[var23] = var24;
                    int var25 = arg8[var23].field5684;
                    int var26 = arg8[var23].field5683;
                    int var27 = var24.field2823[var25];
                    class153.field1934[var23] = class451.method2800(var27 >>> 16, 0);
                    int var28 = var27 & 0xFFFF;
                    class310.field4187[var23] = var28;
                    if (class153.field1934[var23] != null) {
                        var20 |= class153.field1934[var23].method685(var28, -1);
                        var19 |= class153.field1934[var23].method686(var28, true);
                    }
                    if ((var24.field2803 || class83.field926) && var26 != -1 && var24.field2823.length > var26) {
                        class30.field295[var23] = var24.field2818[var25];
                        class349.field4857[var23] = arg8[var23].field5691;
                        int var29 = var24.field2823[var26];
                        class345.field4622[var23] = class451.method2800(var29 >>> 16, 0);
                        int var30 = var29 & 0xFFFF;
                        class388.field5536[var23] = var30;
                        if (class345.field4622[var23] != null) {
                            var20 |= class345.field4622[var23].method685(var30, -1);
                            var19 |= class345.field4622[var23].method686(var30, true);
                        }
                    } else {
                        class30.field295[var23] = 0;
                        class349.field4857[var23] = 0;
                        class345.field4622[var23] = null;
                        class388.field5536[var23] = -1;
                    }
                }
            }
        }
        int var31 = -1;
        int var32 = -1;
        int var33 = 0;
        class127 var34 = null;
        class127 var35 = null;
        int var36 = -1;
        int var37 = -1;
        int var38 = 0;
        class127 var39 = null;
        class127 var40 = null;
        if (var21) {
            if (arg2 != null) {
                int var41 = arg2.field2823[arg0];
                int var42 = var41 >>> 16;
                var31 = var41 & 0xFFFF;
                var34 = class451.method2800(var42, 0);
                if (var34 != null) {
                    var20 |= var34.method685(var31, -1);
                    var19 |= var34.method686(var31, true);
                }
                if ((arg2.field2803 || class83.field926) && arg5 != -1 && arg5 < arg2.field2823.length) {
                    int var43 = arg2.field2823[arg5];
                    var33 = arg2.field2818[arg0];
                    int var44 = var43 >>> 16;
                    var32 = var43 & 0xFFFF;
                    if (var42 == var44) {
                        var35 = var34;
                    } else {
                        var35 = class451.method2800(var32 >>> 16, 0);
                    }
                    if (var35 != null) {
                        var20 |= var35.method685(var32, arg11 - 1);
                        var19 |= var35.method686(var32, true);
                    }
                }
            }
            var14 = arg12 | 0x20;
            if (arg7 != null) {
                int var45 = arg7.field2823[arg4];
                int var46 = var45 >>> 16;
                var39 = class451.method2800(var46, 0);
                var36 = var45 & 0xFFFF;
                if (var39 != null) {
                    var20 |= var39.method685(var36, -1);
                    var19 |= var39.method686(var36, true);
                }
                if ((arg7.field2803 || class83.field926) && arg3 != -1 && arg3 < arg7.field2823.length) {
                    int var47 = arg7.field2823[arg3];
                    var38 = arg7.field2818[arg4];
                    int var48 = var47 >>> 16;
                    var37 = var47 & 0xFFFF;
                    if (var46 == var48) {
                        var40 = var39;
                    } else {
                        var40 = class451.method2800(var37 >>> 16, 0);
                    }
                    if (var40 != null) {
                        var20 |= var40.method685(var37, ~arg11);
                        var19 |= var40.method686(var37, true);
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
        class114 var49 = class333.field4426;
        class396 var50;
        synchronized (class333.field4426) {
            var50 = (class396) class333.field4426.method616(8, var15);
        }
        class70 var51 = null;
        if (this.field4455 != -1) {
            var51 = class298.method1761(this.field4455, arg11 ^ 0x734A);
        }
        if (var50 == null || arg6.method1620(var50.method2312(), var14) != 0 || var51 != null && var51.field760 != null && this.field4446 == null) {
            if (var50 != null) {
                var14 = arg6.method1634(var14, var50.method2312());
            }
            boolean var53 = false;
            int var54 = 0;
            while (true) {
                if (var54 >= 12) {
                    if (var53) {
                        if (this.field4452 != -1L) {
                            class114 var81 = class333.field4426;
                            synchronized (class333.field4426) {
                                var50 = (class396) class333.field4426.method616(127, this.field4452);
                            }
                        }
                        if (var50 == null || arg6.method1620(var50.method2312(), var14) != 0 || var51 != null && var51.field760 != null && this.field4446 == null) {
                            return null;
                        }
                    } else {
                        class390[] var56 = new class390[12];
                        for (int var57 = 0; var57 < 12; var57++) {
                            int var58 = var17[var57];
                            if ((var58 & 0x40000000) != 0) {
                                class390 var60 = class65.method368(var58 & 0x3FFFFFFF, -122).method659((byte) -69, this.field4447);
                                if (var60 != null) {
                                    var56[var57] = var60;
                                }
                            } else if ((Integer.MIN_VALUE & var58) != 0) {
                                class390 var59 = class65.method370(var58 & 0x3FFFFFFF, arg11 ^ 0x1000).method2416(-1);
                                if (var59 != null) {
                                    var56[var57] = var59;
                                }
                            }
                        }
                        if (var51 != null && var51.field760 != null) {
                            for (int var61 = 0; var61 < var51.field760.length; var61++) {
                                if (var51.field760[var61] != null && var56[var61] != null) {
                                    int var62 = var51.field760[var61][0];
                                    int var63 = var51.field760[var61][1];
                                    int var64 = var51.field760[var61][2];
                                    int var65 = var51.field760[var61][3] << 3;
                                    int var66 = var51.field760[var61][4] << 3;
                                    int var67 = var51.field760[var61][5] << 3;
                                    if (this.field4446 == null) {
                                        this.field4446 = new int[var51.field760.length][];
                                    }
                                    if (this.field4446[var61] == null) {
                                        int[] var68 = this.field4446[var61] = new int[15];
                                        if (var65 == 0 && var66 == 0 && var67 == 0) {
                                            var68[13] = -var63;
                                            var68[0] = var68[4] = var68[8] = 32768;
                                            var68[14] = -var64;
                                            var68[12] = -var62;
                                        } else {
                                            int var69 = class356.field5025[var65];
                                            int var70 = class356.field5037[var65];
                                            int var71 = class356.field5025[var66];
                                            int var72 = class356.field5037[var66];
                                            int var73 = class356.field5025[var67];
                                            int var74 = class356.field5037[var67];
                                            int var75 = var70 * var73 + 16384 >> 15;
                                            int var76 = var70 * var74 + 16384 >> 15;
                                            var68[5] = -var70;
                                            var68[6] = -var72 * var73 - (-(var71 * var76) - 16384) >> 15;
                                            var68[7] = -var72 * -var74 + var71 * var75 + 16384 >> 15;
                                            var68[0] = var71 * var73 + var72 * var76 + 16384 >> 15;
                                            var68[8] = var69 * var71 + 16384 >> 15;
                                            var68[1] = -var74 * var71 + var72 * var75 + 16384 >> 15;
                                            var68[3] = var69 * var74 + 16384 >> 15;
                                            var68[4] = var69 * var73 + 16384 >> 15;
                                            var68[2] = var69 * var72 + 16384 >> 15;
                                            var68[14] = var68[2] * -var62 + 16384 - (-(var68[5] * -var63) - (var68[8] * -var64)) >> 15;
                                            var68[13] = var68[4] * -var63 + var68[1] * -var62 + (var68[7] * -var64) + 16384 >> 15;
                                            var68[12] = var68[3] * -var63 + var68[0] * -var62 + var68[6] * -var64 + 16384 >> 15;
                                        }
                                        var68[10] = var63;
                                        var68[9] = var62;
                                        var68[11] = var64;
                                    }
                                    if (var65 != 0 || var66 != 0 || var67 != 0) {
                                        var56[var61].method2426(var65, var67, (byte) -113, var66);
                                    }
                                    if (var62 != 0 || var63 != 0 || var64 != 0) {
                                        var56[var61].method2422(var64, var63, var62, arg11 ^ 0x5A);
                                    }
                                }
                            }
                        }
                        int var77 = var14 | 0x2000;
                        class390 var78 = new class390(var56, var56.length);
                        var50 = arg6.method1651(var78, var77, class67.field697, 64, 850);
                        for (int var79 = 0; var79 < 5; var79++) {
                            if (this.field4450[var79] < class309.field4178[var79].length) {
                                var50.method2307(class392.field5647[var79], class309.field4178[var79][this.field4450[var79]]);
                            }
                            if (class38.field395[var79].length > this.field4450[var79]) {
                                var50.method2307(class188.field2368[var79], class38.field395[var79][this.field4450[var79]]);
                            }
                        }
                        if (arg1) {
                            var50.method2267(var14);
                            class114 var80 = class333.field4426;
                            synchronized (class333.field4426) {
                                class333.field4426.method615((byte) -105, var15, var50);
                            }
                            this.field4452 = var15;
                        }
                    }
                    break;
                }
                int var55 = var17[var54];
                if ((var55 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var55) != 0 && !class65.method370(var55 & 0x3FFFFFFF, 4096).method2419(true)) {
                        var53 = true;
                    }
                } else if (!class65.method368(var55 & 0x3FFFFFFF, -117).method670(0, this.field4447)) {
                    var53 = true;
                }
                var54++;
            }
        }
        class396 var82 = var50.method2297((byte) 1, var14, true);
        if (!var21) {
            return var82;
        }
        int var83 = 0;
        int var84 = 1;
        while (var83 < var22) {
            if (class153.field1934[var83] != null) {
                var82.method2475(0, (byte) -42, class153.field1934[var83], false, class310.field4187[var83], class345.field4622[var83], class30.field295[var83], var84, class349.field4857[var83] - 1, class388.field5536[var83], this.field4446 == null ? null : this.field4446[var83]);
            }
            var83++;
            var84 <<= 0x1;
        }
        if (var34 != null && var39 != null) {
            var82.method2472(var34, var31, var32, var38, var40, arg10 - 1, var39, var33, var35, false, false, var36, var37, arg9 - 1, arg2.field2827);
        } else if (var34 != null) {
            var82.method2474(var35, arg10 - 1, var34, 0, 65535, false, var31, var33, var32);
        } else if (var39 != null) {
            var82.method2474(var40, arg9 - 1, var39, 0, 65535, false, var36, var38, var37);
        }
        for (int var85 = 0; var85 < var22; var85++) {
            class153.field1934[var85] = null;
            class345.field4622[var85] = null;
            class339.field4533[var85] = null;
        }
        return var82;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(III)V", line = 883)
    public final void method1913(int arg0, int arg1, int arg2) {
        field4464++;
        int var4 = class279.field3792[arg1];
        if (this.field4456[var4] != arg0 && class65.method370(arg2, 4096) != null) {
            this.field4456[var4] = class392.method2441(Integer.MIN_VALUE, arg2);
            this.method1914(true);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V", line = 903)
    private final void method1914(boolean arg0) {
        field4470++;
        long[] var2 = class149.field1897;
        this.field4457 = -1L;
        this.field4457 = this.field4457 >>> 8 ^ var2[(int) (((long) (this.field4455 >> 8) ^ this.field4457) & 0xFFL)];
        this.field4457 = var2[(int) ((this.field4457 ^ (long) this.field4455) & 0xFFL)] ^ this.field4457 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field4457 = this.field4457 >>> 8 ^ var2[(int) (((long) (this.field4456[var3] >> 24) ^ this.field4457) & 0xFFL)];
            this.field4457 = var2[(int) (((long) (this.field4456[var3] >> 16) ^ this.field4457) & 0xFFL)] ^ this.field4457 >>> 8;
            this.field4457 = this.field4457 >>> 8 ^ var2[(int) (((long) (this.field4456[var3] >> 8) ^ this.field4457) & 0xFFL)];
            this.field4457 = this.field4457 >>> 8 ^ var2[(int) ((this.field4457 ^ (long) this.field4456[var3]) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field4457 = var2[(int) ((this.field4457 ^ (long) this.field4450[var4]) & 0xFFL)] ^ this.field4457 >>> 8;
        }
        this.field4457 = this.field4457 >>> 8 ^ var2[(int) (((long) (this.field4447 ? 1 : 0) ^ this.field4457) & 0xFFL)];
        if (!arg0) {
            this.field4446 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BLjava/lang/String;)J", line = 954)
    public static final long method1915(byte arg0, String arg1) {
        field4459++;
        int var2 = arg1.length();
        long var3 = 0L;
        if (arg0 < 19) {
            return 43L;
        } else {
            for (int var5 = 0; var5 < var2; var5++) {
                var3 = (var3 << 5) + (long) arg1.charAt(var5) - var3;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZB)V", line = 978)
    public final void method1916(boolean arg0, byte arg1) {
        int var3 = -15 % ((arg1 - 40) / 37);
        field4465++;
        this.field4447 = arg0;
        this.method1914(true);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([I[IZBII)V", line = 1011)
    public final void method1917(int[] arg0, int[] arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        if (this.field4455 != arg5) {
            this.field4455 = arg5;
            this.field4446 = null;
        }
        field4467++;
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class357.field5057; var8++) {
                    class389 var9 = class65.method370(var8, 4096);
                    if (var9 != null && !var9.field5564 && (arg2 ? class419.field6088[var7] : class308.field4172[var7]) == var9.field5556) {
                        arg1[class279.field3792[var7]] = class392.method2441(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field4450 = arg0;
        this.field4456 = arg1;
        this.field4454 = arg4;
        if (arg3 > -16) {
            field4466 = null;
        }
        this.field4447 = arg2;
        this.method1914(true);
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(Z)V", line = 1066)
    public static final void method1918(boolean arg0) {
        if (arg0) {
            class176.field2209 = class341.field4571;
            class98.field1161 = class275.field3707;
        } else {
            class176.field2209 = class234.field3225;
            class98.field1161 = class272.field3682;
        }
        class366.field5129 = class176.field2209.length;
    }
}
