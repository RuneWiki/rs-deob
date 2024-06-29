import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class120 extends class167 {

    @OriginalMember(owner = "client!l", name = "cb", descriptor = "I")
    private int field2273 = 32768;

    @OriginalMember(owner = "client!l", name = "Y", descriptor = "Lkh;")
    public static class117 field2269 = class224.method1450((byte) 111, "<col=ffffff>");

    @OriginalMember(owner = "client!l", name = "T", descriptor = "Lkh;")
    public static class117 field2264 = null;

    @OriginalMember(owner = "client!l", name = "bb", descriptor = "Lkh;")
    public static class117 field2272 = class224.method1450((byte) 121, "<col=ff3000>");

    @OriginalMember(owner = "client!l", name = "db", descriptor = "Lkh;")
    public static class117 field2274 = class224.method1450((byte) 126, "");

    @OriginalMember(owner = "client!l", name = "U", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!l", name = "V", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!l", name = "ab", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!l", name = "eb", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!l", name = "fb", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!l", name = "gb", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "[Lr;")
    public static class186[] field2267;

    @OriginalMember(owner = "client!l", name = "X", descriptor = "[[[B")
    public static byte[][][] field2268;

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class120() {
        super(3, false);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method844(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 != 127) {
            field2269 = null;
        }
        if (~arg1 <= -1 && arg7 >= 0 && ~arg1 > -104 && arg7 < 103) {
            if (~arg6 == -1) {
                class90 var8 = class34.method302(arg2, arg1, arg7);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field1670 >>> 32);
                    if (~arg3 != -3) {
                        var8.field1661 = new class45(var9, arg3, arg4, arg2, arg1, arg7, arg0, false, var8.field1661);
                    } else {
                        var8.field1661 = new class45(var9, 2, 4 - -arg4, arg2, arg1, arg7, arg0, false, var8.field1661);
                        var8.field1678 = new class45(var9, 2, 3 & arg4 + 1, arg2, arg1, arg7, arg0, false, var8.field1678);
                    }
                }
            }
            if (arg6 == 1) {
                class239 var10 = class5.method42(arg2, arg1, arg7);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field4326 >>> 32);
                    if (arg3 != 4 && arg3 != 5) {
                        if (~arg3 == -7) {
                            var10.field4320 = new class45(var11, 4, arg4 + 4, arg2, arg1, arg7, arg0, false, var10.field4320);
                        } else if (arg3 == 7) {
                            var10.field4320 = new class45(var11, 4, (3 & arg4 + 2) + 4, arg2, arg1, arg7, arg0, false, var10.field4320);
                        } else if (arg3 == 8) {
                            var10.field4320 = new class45(var11, 4, arg4 - -4, arg2, arg1, arg7, arg0, false, var10.field4320);
                            var10.field4331 = new class45(var11, 4, (arg4 - -2 & 3) + 4, arg2, arg1, arg7, arg0, false, var10.field4331);
                        }
                    } else {
                        var10.field4320 = new class45(var11, 4, arg4, arg2, arg1, arg7, arg0, false, var10.field4320);
                    }
                }
            }
            if (arg6 == 2) {
                if (arg3 == 11) {
                    arg3 = 10;
                }
                class57 var12 = class195.method1298(arg2, arg1, arg7);
                if (var12 != null) {
                    var12.field1182 = new class45(Integer.MAX_VALUE & (int) (var12.field1171 >>> 32), arg3, arg4, arg2, arg1, arg7, arg0, false, var12.field1182);
                }
            }
            if (arg6 == 3) {
                class28 var13 = class73.method513(arg2, arg1, arg7);
                if (var13 != null) {
                    var13.field683 = new class45(Integer.MAX_VALUE & (int) (var13.field687 >>> 32), 22, arg4, arg2, arg1, arg7, arg0, false, var13.field683);
                }
            }
        }
        ++field2277;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
    public final void method262(int arg0) {
        int var2 = 76 % ((-18 - arg0) / 59);
        ++field2265;
        class212.method1395((byte) 101);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILve;IIIII)V")
    public static final void method845(int arg0, class234 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2275;
        class90.method628(arg1.field4244, arg4, arg1.field4221, arg6 + -2147483647, arg5, arg0, arg3, arg2);
        if (arg6 != Integer.MAX_VALUE) {
            method844(30, 31, -25, 13, 1, (byte) -79, 97, 56);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            ++field2270;
            if (arg2 != 0) {
                if (~arg2 == -2) {
                    super.field3009 = ~arg0.method998(103) == -2;
                }
            } else {
                this.field2273 = arg0.method1049((byte) 110) << 4;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)[[I")
    public final int[][] method116(int arg0, int arg1) {
        ++field2271;
        if (arg1 != -9179) {
            method844(-90, -60, 16, 61, 91, (byte) 111, 92, 29);
        }
        int[][] var3 = super.field3022.method1148(arg0, 8708);
        if (super.field3022.field2957) {
            int[] var4 = this.method1186(arg0, 0, 1);
            int[] var5 = this.method1186(arg0, 0, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            for (int var9 = 0; class115.field2146 > var9; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field2273 >> 12;
                int var12 = class128.field2361[var10] * var11 >> 12;
                int var13 = class60.field1218[var10] * var11 >> 12;
                int var14 = (var13 >> 12) + var9 & class34.field801;
                int var15 = (var12 >> 12) + arg0 & class101.field1839;
                int[][] var16 = this.method1180(var15, 26851, 0);
                var6[var9] = var16[0][var14];
                var8[var9] = var16[1][var14];
                var7[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
    public static void method846(int arg0) {
        if (arg0 != -2009459284) {
            method845(-72, (class234) null, 118, -95, 79, 104, 115);
        }
        field2268 = null;
        field2264 = null;
        field2272 = null;
        field2269 = null;
        field2267 = null;
        field2274 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        ++field2276;
        if (arg0 != -96) {
            this.method116(-5, -12);
        }
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (super.field3013.field4085) {
            int[] var4 = this.method1186(arg1, arg0 + 96, 1);
            int[] var5 = this.method1186(arg1, arg0 ^ -96, 2);
            for (int var6 = 0; class115.field2146 > var6; ++var6) {
                int var7 = (var4[var6] & 4095) >> 4;
                int var8 = var5[var6] * this.field2273 >> 12;
                int var9 = class128.field2361[var7] * var8 >> 12;
                int var10 = class60.field1218[var7] * var8 >> 12;
                int var11 = class101.field1839 & (var9 >> 12) + arg1;
                int var12 = (var10 >> 12) + var6 & class34.field801;
                int[] var13 = this.method1186(var11, 0, 0);
                var3[var6] = var13[var12];
            }
        }
        return var3;
    }
}
