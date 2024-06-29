import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class33 extends class161 {

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "[I")
    public int[] field412 = new int[1];

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "[I")
    public int[] field417 = new int[] { -1 };

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "[I")
    public static int[] field413 = new int[50];

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "Lmo;")
    public static class447 field407;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)V", line = 4)
    public static final void method218(int arg0) {
        class52 var1 = class381.field5758;
        synchronized (class381.field5758) {
            class381.field5758.method336(94);
        }
        field410++;
        class52 var2 = class37.field464;
        synchronized (class37.field464) {
            class37.field464.method336(arg0 + 1086263208);
            if (arg0 != -1086263102) {
                method220(37, -121);
            }
        }
        class52 var3 = class269.field4310;
        synchronized (class269.field4310) {
            class269.field4310.method336(69);
        }
        class52 var4 = class43.field533;
        synchronized (class43.field533) {
            class43.field533.method336(90);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lne;Le;IIB)V", line = 27)
    public static final void method219(class172 arg0, class312 arg1, int arg2, int arg3, byte arg4) {
        field416++;
        class245 var5 = arg0.method1197(arg1, arg4 + 18);
        if (var5 == null) {
            return;
        }
        arg1.method671(arg3, arg2, arg0.field2705 + arg3, arg0.field2834 + arg2);
        if (class193.field3143 == 2 || class193.field3143 == 5 || class104.field1466 == null) {
            arg1.method632(-16777216, var5, arg3, arg2);
        } else {
            int var6;
            int var7;
            int var8;
            int var9;
            if (class13.field194 == 4) {
                var6 = class144.field2269;
                var7 = class290.field4639;
                var8 = 4096;
                var9 = (int) (-class329.field5153) & 0x3FFF;
            } else {
                var8 = 4096 - (class367.field5561 * 16);
                var7 = class261.field4201.field722;
                var6 = class261.field4201.field724;
                var9 = (int) (-class329.field5153) + class52.field650 & 0x3FFF;
            }
            int var10 = var6 / 32 + 48 - (class80.field1003 + -104) * 2;
            int var11 = class380.field5751 * 4 + 48 + 208 - (var7 / 32) - (class380.field5751 * 2);
            class104.field1466.method2319((float) arg0.field2705 / 2.0F + (float) arg3, (float) arg0.field2834 / 2.0F + (float) arg2, (float) var10, (float) var11, var8, var9 << 2, var5, arg3, arg2);
            for (class160 var12 = (class160) class315.field4951.method253((byte) -6); var12 != null; var12 = (class160) class315.field4951.method247((byte) 5)) {
                int var50 = var12.field2527;
                int var51 = ((class396.field5932.field5523[var50] & 0xFFFCDAE) >> 14) - class409.field6048;
                int var52 = (class396.field5932.field5523[var50] & 0x3FFF) - class444.field6481;
                int var53 = var51 * 4 + 2 - (var6 / 32);
                int var54 = var52 * 4 + 2 - (var7 / 32);
                class450.method2806(var53, arg3, -120, arg1, arg0, var54, arg2, var5, class396.field5932.field5522[var50]);
            }
            for (int var13 = 0; var13 < class243.field4020; var13++) {
                int var47 = class330.field5165[var13] * 4 + 2 - var6 / 32;
                int var48 = class222.field3688[var13] * 4 + 2 - (var7 / 32);
                class127 var49 = class137.method1003(class173.field2875[var13], -30796);
                if (var49.field1984 != null) {
                    var49 = var49.method948((byte) -118);
                    if (var49 == null || var49.field2003 == -1) {
                        continue;
                    }
                }
                class450.method2806(var47, arg3, -111, arg1, arg0, var48, arg2, var5, var49.field2003);
            }
            for (class9 var14 = (class9) class312.field4924.method1776(true); var14 != null; var14 = (class9) class312.field4924.method1773(-1)) {
                int var44 = (int) (var14.field2539 >> 28 & 0x3L);
                if (class413.field6116 == var44) {
                    int var45 = (int) (var14.field2539 & 0x3FFFL) * 4 + 2 - var6 / 32;
                    int var46 = (int) (var14.field2539 >> 14 & 0x3FFFL) * 4 + 2 - (var7 / 32);
                    class258.method1787((byte) -110, arg2, var45, arg3, var5, arg0, class329.field5157[0], var46);
                }
            }
            for (int var15 = 0; var15 < class397.field5940; var15++) {
                class50 var40 = class39.field499[class423.field6253[var15]];
                if (var40 != null && var40.method320(false)) {
                    class226 var41 = var40.field615;
                    if (var41 != null && var41.field3771 != null) {
                        var41 = var41.method1619(-90);
                    }
                    if (var41 != null && var41.field3760 && var41.field3762) {
                        int var42 = var40.field724 / 32 - (var6 / 32);
                        int var43 = var40.field722 / 32 - var7 / 32;
                        if (var41.field3784 == -1) {
                            class258.method1787((byte) -110, arg2, var42, arg3, var5, arg0, class329.field5157[1], var43);
                        } else {
                            class450.method2806(var42, arg3, -113, arg1, arg0, var43, arg2, var5, var41.field3784);
                        }
                    }
                }
            }
            for (int var16 = 0; var16 < class107.field1500; var16++) {
                class219 var32 = class216.field3517[class132.field2063[var16]];
                if (var32 != null && var32.method1567(false)) {
                    int var33 = var32.field724 / 32 - (var6 / 32);
                    int var34 = var32.field722 / 32 - (var7 / 32);
                    boolean var35 = false;
                    for (int var36 = 0; var36 < class262.field4215; var36++) {
                        if (var32.field3588.equals(class338.field5248[var36]) && class236.field3948[var36] != 0) {
                            var35 = true;
                            break;
                        }
                    }
                    boolean var37 = false;
                    for (int var38 = 0; var38 < class108.field1507; var38++) {
                        if (var32.field3588.equals(class392.field5890[var38].field5445)) {
                            var37 = true;
                            break;
                        }
                    }
                    boolean var39 = false;
                    if (class261.field4201.field3586 != 0 && var32.field3586 != 0 && class261.field4201.field3586 == var32.field3586) {
                        var39 = true;
                    }
                    if (var35) {
                        class258.method1787((byte) -110, arg2, var33, arg3, var5, arg0, class329.field5157[3], var34);
                    } else if (var37) {
                        class258.method1787((byte) -110, arg2, var33, arg3, var5, arg0, class329.field5157[5], var34);
                    } else if (var39) {
                        class258.method1787((byte) -110, arg2, var33, arg3, var5, arg0, class329.field5157[4], var34);
                    } else {
                        class258.method1787((byte) -110, arg2, var33, arg3, var5, arg0, class329.field5157[2], var34);
                    }
                }
            }
            class136[] var17 = class256.field4144;
            for (int var18 = 0; var18 < var17.length; var18++) {
                class136 var21 = var17[var18];
                if (var21 != null && var21.field2124 != 0 && (class183.field2987 % 20) < 10) {
                    if (var21.field2124 == 1 && var21.field2121 >= 0 && class39.field499.length > var21.field2121) {
                        class50 var22 = class39.field499[var21.field2121];
                        if (var22 != null) {
                            int var23 = var22.field724 / 32 - var6 / 32;
                            int var24 = var22.field722 / 32 - (var7 / 32);
                            class267.method1823(arg2, arg3, -125, var21.field2132, arg0, var23, var24, var5, 360000);
                        }
                    }
                    if (var21.field2124 == 2) {
                        int var25 = (var21.field2126 - class409.field6048) * 4 + 2 - (var6 / 32);
                        int var26 = (var21.field2131 - class444.field6481) * 4 + 2 - (var7 / 32);
                        int var27 = var21.field2125 * 4;
                        int var28 = var27 * var27;
                        class267.method1823(arg2, arg3, -125, var21.field2132, arg0, var25, var26, var5, var28);
                    }
                    if (var21.field2124 == 10 && var21.field2121 >= 0 && class216.field3517.length > var21.field2121) {
                        class219 var29 = class216.field3517[var21.field2121];
                        if (var29 != null) {
                            int var30 = var29.field724 / 32 - (var6 / 32);
                            int var31 = var29.field722 / 32 - (var7 / 32);
                            class267.method1823(arg2, arg3, -125, var21.field2132, arg0, var30, var31, var5, 360000);
                        }
                    }
                }
            }
            if (class13.field194 != 4) {
                if (class19.field254 != 0) {
                    int var19 = class19.field254 * 4 + (class261.field4201.method903(arg4 + -103) + -1) * 2 + 2 - (var6 / 32);
                    int var20 = (class132.field2062 * 4 + ((class261.field4201.method903(-69) + -1) * 2) - (var7 / 32)) + 2;
                    class258.method1787((byte) -110, arg2, var19, arg3, var5, arg0, class269.field4321[class357.field5460 ? 1 : 0], var20);
                }
                arg1.method2086(3, arg0.field2705 / 2 + arg3 - 1, 3, -1, -765, arg0.field2834 / 2 + arg2 - 1);
            }
        }
        if (arg4 != -22) {
            field413 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I", line = 314)
    public static final int method220(int arg0, int arg1) {
        if (arg1 != 24173) {
            method218(17);
        }
        field411++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([I[IZIB)J", line = 328)
    private final long method221(int[] arg0, int[] arg1, boolean arg2, int arg3, byte arg4) {
        field408++;
        long[] var6 = class84.field1045;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg3 >> 8)) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var6[(int) ((var9 ^ (long) arg3) & 0xFFL)];
        for (int var13 = 0; var13 < arg1.length; var13++) {
            long var17 = var6[(int) ((var11 ^ (long) (arg1[var13] >> 24)) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var6[(int) ((var17 ^ (long) (arg1[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg1[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var21 >>> 8 ^ var6[(int) (((long) arg1[var13] ^ var21) & 0xFFL)];
        }
        if (arg0 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg0[var14]) & 0xFFL)];
            }
        }
        if (arg4 != 123) {
            this.field417 = null;
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)[B", line = 373)
    public static final byte[] method222(int arg0, int arg1) {
        field409++;
        class225 var2 = (class225) class11.field149.method1660(2, (long) arg1);
        int var3 = -42 % ((arg0 - 3) / 60);
        if (var2 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg1);
            for (int var6 = 0; var6 < 255; var6++) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; var7 < 255; var7++) {
                int var8 = 255 - var7;
                int var9 = class105.method797(var5, -84, var8);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[511 - var7] = var10;
            }
            var2 = new class225(var4);
            class11.field149.method1655(false, var2, (long) arg1);
        }
        return var2.field3738;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V", line = 424)
    public static void method223(byte arg0) {
        field407 = null;
        if (arg0 == 6) {
            field413 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILhe;ILe;BIZILgn;)Lid;", line = 455)
    public final class348 method224(int arg0, int arg1, class208 arg2, int arg3, class312 arg4, byte arg5, int arg6, boolean arg7, int arg8, class417 arg9) {
        field415++;
        class348 var11 = null;
        int var12 = arg8;
        class349 var13 = null;
        if (arg6 != -1) {
            var13 = class436.method2686(53, arg6);
        }
        int[] var14 = this.field417;
        if (arg5 != -34) {
            return null;
        }
        if (var13 != null && var13.field5401 != null) {
            var14 = new int[var13.field5401.length];
            for (int var15 = 0; var15 < var13.field5401.length; var15++) {
                int var16 = var13.field5401[var15];
                if (var16 >= 0 && var16 < this.field417.length) {
                    var14[var15] = this.field417[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        int var20 = -1;
        int var21 = -1;
        int var22 = 0;
        class209 var23 = null;
        class209 var24 = null;
        if (arg9 != null) {
            var12 = arg8 | 0x20;
            int var25 = arg9.field6177[arg3];
            int var26 = var25 >>> 16;
            var23 = class452.method2825(var26, -30741);
            var20 = var25 & 0xFFFF;
            if (var23 != null) {
                var18 |= var23.method1481(var20, 35);
                var17 |= var23.method1477(var20, 0);
                var19 |= arg9.field6179;
            }
            if ((arg9.field6156 || class191.field3120) && arg0 != -1 && arg0 < arg9.field6177.length) {
                var22 = arg9.field6171[arg3];
                int var27 = arg9.field6177[arg0];
                int var28 = var27 >>> 16;
                var21 = var27 & 0xFFFF;
                if (var26 == var28) {
                    var24 = var23;
                } else {
                    var24 = class452.method2825(var21 >>> 16, arg5 ^ 0x7835);
                }
                if (var24 != null) {
                    var18 |= var24.method1481(var21, 35);
                    var17 |= var24.method1477(var21, 0);
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
        }
        long var29 = this.method221(arg2 == null ? null : arg2.field3342, var14, arg7, arg6, (byte) 123);
        if (class115.field1590 != null) {
            var11 = (class348) class115.field1590.method331((byte) 69, var29);
        }
        if (var11 == null || arg4.method579(var11.method44(), var12) != 0) {
            if (var11 != null) {
                var12 = arg4.method720(var12, var11.method44());
            }
            int var31 = var12;
            boolean var32 = false;
            for (int var33 = 0; var33 < var14.length; var33++) {
                if (var14[var33] != -1 && !class155.method1092(true, var14[var33]).method732(arg7, 19745)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class86[] var34 = new class86[var14.length];
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1) {
                    var34[var35] = class155.method1092(true, var14[var35]).method734(27251, arg7);
                }
            }
            if (var13 != null && var13.field5392 != null) {
                for (int var36 = 0; var36 < var13.field5392.length; var36++) {
                    if (var13.field5392[var36] != null && var34[var36] != null) {
                        int var37 = var13.field5392[var36][0];
                        int var38 = var13.field5392[var36][1];
                        int var39 = var13.field5392[var36][2];
                        int var40 = var13.field5392[var36][3];
                        int var41 = var13.field5392[var36][4];
                        int var42 = var13.field5392[var36][5];
                        if (var40 != 0 || var41 != 0 || var42 != 0) {
                            var34[var36].method531(var41, var42, -24205, var40);
                        }
                        if (var37 != 0 || var38 != 0 || var39 != 0) {
                            var34[var36].method530(var37, (byte) 127, var39, var38);
                        }
                    }
                }
            }
            class86 var43 = new class86(var34, var34.length);
            if (arg2 != null) {
                var31 = var12 | 0x2000;
            }
            var11 = arg4.method639(var43, var31, class430.field6335, 64, 850);
            if (arg2 != null) {
                for (int var44 = 0; var44 < 5; var44++) {
                    if (class343.field5287[var44].length > arg2.field3342[var44]) {
                        var11.method38(class128.field2030[var44], class343.field5287[var44][arg2.field3342[var44]]);
                    }
                    if (class245.field4028[var44].length > arg2.field3342[var44]) {
                        var11.method38(class140.field2179[var44], class245.field4028[var44][arg2.field3342[var44]]);
                    }
                }
            }
            if (class115.field1590 != null) {
                var11.method9(var12);
                class115.field1590.method341(59, var29, var11);
            }
        }
        if (arg9 == null || var23 == null) {
            return var11;
        } else {
            class348 var45 = var11.method15((byte) 1, var12, true);
            var45.method2274(0, var23, var22, arg9.field6179, var24, (byte) -91, var20, var21, arg1 - 1);
            return var45;
        }
    }
}
