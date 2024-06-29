import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class306 {

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Lfe;")
    public static class248 field4660 = new class248(64);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "[I")
    public static int[] field4663 = new int[256];

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "F")
    public static float field4662;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z[Lf;I)V", line = 20)
    public static final void method2111(boolean arg0, class329[] arg1, int arg2) {
        if (!arg0) {
            return;
        }
        field4659++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class329 var4 = arg1[var3];
            if (var4 != null && var4.field5091 == arg2 && (!var4.field5022 || !client.method903(var4))) {
                if (var4.field5066 == 0) {
                    if (!var4.field5022 && client.method903(var4) && class38.field469 != var4) {
                        continue;
                    }
                    method2111(true, arg1, var4.field5086);
                    if (var4.field4964 != null) {
                        method2111(true, var4.field4964, var4.field5086);
                    }
                    class167 var5 = (class167) class295.field4522.method1320((long) var4.field5086, 13002);
                    if (var5 != null) {
                        class302.method2094(-70, var5.field2505);
                    }
                }
                if (var4.field5066 == 6) {
                    if (var4.field4958 != -1 || var4.field5033 != -1) {
                        boolean var6 = class298.method2078(true, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field5033;
                        } else {
                            var7 = var4.field4958;
                        }
                        if (var7 != -1) {
                            class272 var8 = class72.method468(var7, 98);
                            if (var8 != null) {
                                var4.field5059 += class288.field4352;
                                while (var8.field4184[var4.field4986] < var4.field5059) {
                                    var4.field5059 -= var8.field4184[var4.field4986];
                                    var4.field4986++;
                                    if (var8.field4160.length <= var4.field4986) {
                                        var4.field4986 -= var8.field4166;
                                        if (var4.field4986 < 0 || var8.field4160.length <= var4.field4986) {
                                            var4.field4986 = 0;
                                        }
                                    }
                                    var4.field4970 = var4.field4986 + 1;
                                    if (var4.field4970 >= var8.field4160.length) {
                                        var4.field4970 -= var8.field4166;
                                        if (var4.field4970 < 0 || var4.field4970 >= var8.field4160.length) {
                                            var4.field4970 = -1;
                                        }
                                    }
                                    class247.method1666(var4, -127);
                                }
                            }
                        }
                    }
                    if (var4.field4953 != 0 && !var4.field5022) {
                        int var9 = var4.field4953 >> 16;
                        int var10 = class288.field4352 * var9;
                        var4.field5097 = var4.field5097 + var10 & 0x7FF;
                        int var11 = var4.field4953 << 16 >> 16;
                        int var12 = class288.field4352 * var11;
                        var4.field4961 = var4.field4961 + var12 & 0x7FF;
                        class247.method1666(var4, -126);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 147)
    public static void method2112(int arg0) {
        if (arg0 != 3) {
            method2114(6, 96, -71, -59, -32, true, -86);
        }
        field4660 = null;
        field4663 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Llm;Llm;ILam;)V", line = 159)
    public static final void method2113(class210 arg0, class210 arg1, int arg2, class276 arg3) {
        field4667++;
        class130.field2011 = arg3;
        class218.field3319 = arg1;
        if (arg2 != 26081) {
            return;
        }
        class270.field4126 = arg0;
        if (class218.field3319 != null) {
            class130.field2020 = class218.field3319.method1464((byte) 44, 1);
        }
        if (class270.field4126 != null) {
            class51.field640 = class270.field4126.method1464((byte) 39, 1);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4663[var0] = var1;
        }
        field4668 = 0;
        field4669 = (int) (Math.random() * 33.0D) - 16;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIZI)V", line = 193)
    public static final void method2114(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field4665++;
        class88.field1314 = arg3;
        class214.field3253 = arg2;
        if (arg4 != -101) {
            field4669 = -116;
        }
        class230.field3481 = arg6;
        class181.field2701 = arg0;
        class16.field178 = arg1;
        if (arg5 && class88.field1314 >= 100) {
            class203.field3052 = class214.field3253 * 128 + 64;
            class302.field4612 = class230.field3481 * 128 + 64;
            class287.field4338 = class74.method473(class203.field3052, class302.field4612, arg4 ^ 0xFFFFFFDB, class180.field2697) - class181.field2701;
        }
        class56.field710 = 2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBIIIIIIII)V", line = 264)
    public static final void method2115(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 == arg4 && arg2 == arg8 && arg5 == arg9 && arg6 == arg7) {
            class116.method796(arg3, arg7, arg0, (byte) 10, arg2, arg5);
        } else {
            int var10 = arg3 * 3;
            int var11 = arg2;
            int var12 = arg3;
            int var13 = arg2 * 3;
            int var14 = arg8 * 3;
            int var15 = arg9 * 3;
            int var16 = arg4 * 3;
            int var17 = arg5 + var16 - (arg3 + var15);
            int var18 = arg6 * 3;
            int var19 = var15 - (var16 - var10) - var16;
            int var20 = var14 - var13;
            int var21 = var18 + var13 - var14 - var14;
            int var22 = arg7 + var14 - var18 - arg2;
            int var23 = var16 - var10;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var22 * var26;
                int var28 = var17 * var26;
                int var29 = var21 * var25;
                int var30 = var19 * var25;
                int var31 = var23 * var24;
                int var32 = var20 * var24;
                int var33 = (var27 + var29 + var32 >> 12) + arg2;
                int var34 = (var28 + var30 + var31 >> 12) + arg3;
                class116.method796(var12, var33, arg0, (byte) 69, var11, var34);
                var12 = var34;
                var11 = var33;
            }
        }
        if (arg1 == -17) {
            field4666++;
        }
    }
}
