import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class124 extends class376 {

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "[I")
    public int[] field1740 = new int[1];

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "[I")
    public int[] field1744 = new int[] { -1 };

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1737 = "wave:";

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "F")
    public static float field1743;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "Lmq;")
    public static class295 field1735;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lqj;I)V", line = 9)
    public static final void method826(class296 arg0, int arg1) {
        class65.field1029 = arg0;
        if (arg1 == 31666) {
            field1738++;
            class435.field6240 = class65.field1029.method1911(0, 16);
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)V", line = 23)
    public static void method827(byte arg0) {
        field1737 = null;
        if (arg0 <= -48) {
            field1735 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)I", line = 35)
    public static final int method828(int arg0) {
        field1736++;
        class281 var1 = class408.field5920;
        boolean var2 = false;
        if (class16.field205 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class281.method1786(0, 0, var3, (class351) null, (byte) 62, (class136) null);
            var2 = true;
        }
        long var4 = class224.method1425(-26805);
        int var6 = 0;
        int var7 = -14 / ((arg0 + 16) / 59);
        while (var6 < 10000) {
            var1.method1800(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
            var6++;
        }
        int var8 = (int) (class224.method1425(-26805) - var4);
        var1.method1762(0, 100, 0, -16777216, 100, -1);
        if (var2) {
            var1.method1809((byte) 44);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V", line = 79)
    public static final void method829(int arg0) {
        field1742++;
        class197.field2735.method1249(1);
        if (arg0 >= -7) {
            method829(-106);
        }
        class410.field5951.method1249(1);
        class337.field4590.method1249(1);
        class144.field2088.method1249(1);
        class120.field1697.method1249(1);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z[I[IIB)J", line = 97)
    private final long method830(boolean arg0, int[] arg1, int[] arg2, int arg3, byte arg4) {
        field1739++;
        long[] var6 = class32.field493;
        if (arg4 != -21) {
            field1743 = -0.4669087F;
        }
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg3 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var6[(int) ((var9 ^ (long) arg3) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg1.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) (((long) (arg1[var13] >> 24) ^ var11) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) (((long) (arg1[var13] >> 16) ^ var17) & 0xFFL)];
            long var21 = var6[(int) (((long) (arg1[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg1[var13]) & 0xFFL)];
        }
        if (arg2 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) (((long) arg2[var14] ^ var11) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg0 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILlo;IIBLaa;IZLcj;)Lhc;", line = 145)
    public final class75 method831(int arg0, int arg1, class449 arg2, int arg3, int arg4, byte arg5, class281 arg6, int arg7, boolean arg8, class412 arg9) {
        field1734++;
        class75 var11 = null;
        int var12 = arg0;
        class312 var13 = null;
        if (arg4 != -1) {
            var13 = class310.method1964((byte) 119, arg4);
        }
        int[] var14 = this.field1744;
        if (var13 != null && var13.field4277 != null) {
            var14 = new int[var13.field4277.length];
            for (int var15 = 0; var15 < var13.field4277.length; var15++) {
                int var16 = var13.field4277[var15];
                if (var16 >= 0 && var16 < this.field1744.length) {
                    var14[var15] = this.field1744[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        if (arg5 != -44) {
            return null;
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        int var20 = -1;
        int var21 = -1;
        int var22 = 0;
        class387 var23 = null;
        class387 var24 = null;
        if (arg2 != null) {
            var12 = arg0 | 0x20;
            int var25 = arg2.field6521[arg7];
            int var26 = var25 >>> 16;
            var23 = class326.method2051(121, var26);
            var20 = var25 & 0xFFFF;
            if (var23 != null) {
                var18 |= var23.method2527(false, var20);
                var17 |= var23.method2533(var20, arg5 + 299);
                var19 |= arg2.field6495;
            }
            if ((arg2.field6520 || class169.field2408) && arg1 != -1 && arg1 < arg2.field6521.length) {
                int var27 = arg2.field6521[arg1];
                var22 = arg2.field6506[arg7];
                int var28 = var27 >>> 16;
                var21 = var27 & 0xFFFF;
                if (var26 == var28) {
                    var24 = var23;
                } else {
                    var24 = class326.method2051(arg5 + 159, var21 >>> 16);
                }
                if (var24 != null) {
                    var18 |= var24.method2527(false, var21);
                    var17 |= var24.method2533(var21, 255);
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
        long var29 = this.method830(arg8, var14, arg9 == null ? null : arg9.field5974, arg4, (byte) -21);
        if (class376.field5360 != null) {
            var11 = (class75) class376.field5360.method1246((byte) -48, var29);
        }
        if (var11 == null || arg6.method1732(var11.method533(), var12) != 0) {
            if (var11 != null) {
                var12 = arg6.method1777(var12, var11.method533());
            }
            int var31 = var12;
            boolean var32 = false;
            for (int var33 = 0; var33 < var14.length; var33++) {
                if (var14[var33] != -1 && !class347.method2222(var14[var33], arg5 ^ 0xFFFFB72E).method2550((byte) -114, arg8)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class279[] var34 = new class279[var14.length];
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1) {
                    var34[var35] = class347.method2222(var14[var35], 18682).method2539(arg8, false);
                }
            }
            if (var13 != null && var13.field4289 != null) {
                for (int var36 = 0; var36 < var13.field4289.length; var36++) {
                    if (var13.field4289[var36] != null && var34[var36] != null) {
                        int var37 = var13.field4289[var36][0];
                        int var38 = var13.field4289[var36][1];
                        int var39 = var13.field4289[var36][2];
                        int var40 = var13.field4289[var36][3];
                        int var41 = var13.field4289[var36][4];
                        int var42 = var13.field4289[var36][5];
                        if (var40 != 0 || var41 != 0 || var42 != 0) {
                            var34[var36].method1715(var42, var41, (byte) 103, var40);
                        }
                        if (var37 != 0 || var38 != 0 || var39 != 0) {
                            var34[var36].method1707(var38, (byte) 92, var37, var39);
                        }
                    }
                }
            }
            if (arg9 != null) {
                var31 = var12 | 0x2000;
            }
            class279 var43 = new class279(var34, var34.length);
            var11 = arg6.method1736(var43, var31, class279.field3796, 64, 850);
            if (arg9 != null) {
                for (int var44 = 0; var44 < 5; var44++) {
                    if (arg9.field5974[var44] < class262.field3579[var44].length) {
                        var11.method509(class173.field2465[var44], class262.field3579[var44][arg9.field5974[var44]]);
                    }
                    if (arg9.field5974[var44] < class450.field6535[var44].length) {
                        var11.method509(class333.field4512[var44], class450.field6535[var44][arg9.field5974[var44]]);
                    }
                }
            }
            if (class376.field5360 != null) {
                var11.method508(var12);
                class376.field5360.method1247(var29, (byte) 121, var11);
            }
        }
        if (arg2 == null || var23 == null) {
            return var11;
        } else {
            class75 var45 = var11.method529((byte) 1, var12, true);
            var45.method517(var21, var20, var22, arg2.field6495, var23, 0, arg3 - 1, var24, (byte) 116);
            return var45;
        }
    }
}
