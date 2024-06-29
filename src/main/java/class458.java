import java.awt.Color;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class458 extends class147 {

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "[I")
    public int[] field6447 = new int[] { -1 };

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "[I")
    public int[] field6454 = new int[1];

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6450 = new Rectangle[100];

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "F")
    public static float field6449;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "Lfc;")
    public static class209 field6455;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "[Lep;")
    public static class159[] field6446;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "[[B")
    public static byte[][] field6451;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)V", line = 3)
    public static void method2694(byte arg0) {
        field6455 = null;
        field6450 = null;
        field6451 = null;
        field6446 = null;
        int var1 = 62 % ((arg0 + 72) / 54);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z[IZI[I)J", line = 16)
    private final long method2695(boolean arg0, int[] arg1, boolean arg2, int arg3, int[] arg4) {
        field6456++;
        long[] var6 = class274.field3906;
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg3 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var6[(int) (((long) arg3 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg1.length; var13++) {
            long var17 = var6[(int) (((long) (arg1[var13] >> 24) ^ var11) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var6[(int) ((var17 ^ (long) (arg1[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var6[(int) (((long) (arg1[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg1[var13]) & 0xFFL)];
        }
        if (arg4 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) (((long) arg4[var14] ^ var11) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        long var15 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)];
        return arg0 ? 70L : var15;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)[Lud;", line = 66)
    public static final class2[] method2696(int arg0) {
        if (arg0 >= -118) {
            return null;
        } else {
            field6452++;
            return new class2[] { class193.field2655, class160.field1921, class158.field1891 };
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)V", line = 77)
    public static final void method2697(byte arg0) {
        class308.field4529.method1688((byte) 102);
        field6453++;
        class278.field3966.method836((byte) 113);
        if (class117.field1446 != null) {
            class117.field1446.method1106(class126.field1542, 2);
        }
        class310.field4546.method1796((byte) 7);
        class126.field1542.setBackground(Color.black);
        class366.field5237 = -1;
        class308.field4529 = class233.method1283(false, class126.field1542);
        class278.field3966 = class342.method2074(true, -90, class126.field1542);
        if (arg0 > -10) {
            field6449 = -0.08819471F;
        }
        if (class117.field1446 != null) {
            class117.field1446.method1107(class126.field1542, true);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Loj;IZIILhu;IIILnd;)Lqh;", line = 105)
    public final class352 method2698(class280 arg0, int arg1, boolean arg2, int arg3, int arg4, class207 arg5, int arg6, int arg7, int arg8, class448 arg9) {
        field6448++;
        class352 var11 = null;
        int var12 = arg8;
        class349 var13 = null;
        if (arg1 != arg4) {
            var13 = class415.field6001.method1930(982820868, arg4);
        }
        int[] var14 = this.field6447;
        if (var13 != null && var13.field4998 != null) {
            var14 = new int[var13.field4998.length];
            for (int var15 = 0; var15 < var13.field4998.length; var15++) {
                int var16 = var13.field4998[var15];
                if (var16 >= 0 && var16 < this.field6447.length) {
                    var14[var15] = this.field6447[var16];
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
        class170 var23 = null;
        class170 var24 = null;
        if (arg5 != null) {
            var12 = arg8 | 0x20;
            int var25 = arg5.field2853[arg6];
            int var26 = var25 >>> 16;
            var23 = class175.field2103.method1265(var26, -8990);
            var20 = var25 & 0xFFFF;
            if (var23 != null) {
                var18 |= var23.method826(var20, (byte) -97);
                var17 |= var23.method831(var20, (byte) 93);
                var19 |= arg5.field2846;
            }
            if ((arg5.field2867 || class445.field6334) && arg7 != -1 && arg5.field2853.length > arg7) {
                int var27 = arg5.field2853[arg7];
                var22 = arg5.field2843[arg6];
                int var28 = var27 >>> 16;
                var21 = var27 & 0xFFFF;
                if (var26 == var28) {
                    var24 = var23;
                } else {
                    var24 = class175.field2103.method1265(var21 >>> 16, arg1 - 8989);
                }
                if (var24 != null) {
                    var18 |= var24.method826(var21, (byte) -97);
                    var17 |= var24.method831(var21, (byte) 93);
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
        long var29 = this.method2695(false, var14, arg2, arg4, arg9 == null ? null : arg9.field6368);
        if (class77.field924 != null) {
            var11 = (class352) class77.field924.method1163((byte) 126, var29);
        }
        if (var11 == null || arg0.method1473(var11.method1719(), var12) != 0) {
            if (var11 != null) {
                var12 = arg0.method1443(var12, var11.method1719());
            }
            int var31 = var12;
            boolean var32 = false;
            for (int var33 = 0; var33 < var14.length; var33++) {
                if (var14[var33] != -1 && !class422.field6096.method121(var14[var33], -1).method2321(arg2, arg1 - 105)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class10[] var34 = new class10[var14.length];
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1) {
                    var34[var35] = class422.field6096.method121(var14[var35], -1).method2317(arg2, 124);
                }
            }
            if (var13 != null && var13.field4965 != null) {
                for (int var36 = 0; var36 < var13.field4965.length; var36++) {
                    if (var13.field4965[var36] != null && var34[var36] != null) {
                        int var37 = var13.field4965[var36][0];
                        int var38 = var13.field4965[var36][1];
                        int var39 = var13.field4965[var36][2];
                        int var40 = var13.field4965[var36][3];
                        int var41 = var13.field4965[var36][4];
                        int var42 = var13.field4965[var36][5];
                        if (var40 != 0 || var41 != 0 || var42 != 0) {
                            var34[var36].method78(25101, var40, var41, var42);
                        }
                        if (var37 != 0 || var38 != 0 || var39 != 0) {
                            var34[var36].method75(false, var39, var37, var38);
                        }
                    }
                }
            }
            class10 var43 = new class10(var34, var34.length);
            if (arg9 != null) {
                var31 = var12 | 0x2000;
            }
            var11 = arg0.method1346(var43, var31, class218.field3067, 64, 850);
            if (arg9 != null) {
                for (int var44 = 0; var44 < 5; var44++) {
                    if (arg9.field6368[var44] < class178.field2155[var44].length) {
                        var11.method1747(class368.field5265[var44], class178.field2155[var44][arg9.field6368[var44]]);
                    }
                    if (class78.field935[var44].length > arg9.field6368[var44]) {
                        var11.method1747(class422.field6094[var44], class78.field935[var44][arg9.field6368[var44]]);
                    }
                }
            }
            if (class77.field924 != null) {
                var11.method1732(var12);
                class77.field924.method1172(var29, 1, var11);
            }
        }
        if (arg5 == null || var23 == null) {
            return var11;
        } else {
            class352 var45 = var11.method1749((byte) 1, var12, true);
            var45.method2136(0, (byte) -92, var21, arg5.field2846, var22, var24, arg3 - 1, var20, var23);
            return var45;
        }
    }
}
