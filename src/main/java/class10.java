import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class10 extends class244 {

    @OriginalMember(owner = "client!nc", name = "ub", descriptor = "[Lv;")
    public static class215[] field168 = new class215[50];

    @OriginalMember(owner = "client!nc", name = "Ab", descriptor = "Z")
    public static boolean field174 = false;

    @OriginalMember(owner = "client!nc", name = "xb", descriptor = "Lmb;")
    private static class96 field171 = class243.method1708("wave2:", (byte) 109);

    @OriginalMember(owner = "client!nc", name = "zb", descriptor = "Lmb;")
    public static class96 field173 = field171;

    @OriginalMember(owner = "client!nc", name = "Db", descriptor = "Lmb;")
    public static class96 field177 = field171;

    @OriginalMember(owner = "client!nc", name = "sb", descriptor = "Luc;")
    public static class11 field166 = new class11(64);

    @OriginalMember(owner = "client!nc", name = "tb", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!nc", name = "vb", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!nc", name = "wb", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!nc", name = "yb", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!nc", name = "Cb", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!nc", name = "Bb", descriptor = "[I")
    public static int[] field175;

    @OriginalMember(owner = "client!nc", name = "Eb", descriptor = "[Lmj;")
    public static class246[] field178;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field169;
        if (~arg3 <= -1 && arg2 >= 0 && ~arg3 > -104 && ~arg2 > -104) {
            if (arg1 == 0) {
                class19 var8 = class95.method665(arg5, arg3, arg2);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field309 >>> 32);
                    if (~arg6 != -3) {
                        var8.field311 = new class144(var9, arg6, arg0, arg5, arg3, arg2, arg4, false, var8.field311);
                    } else {
                        var8.field311 = new class144(var9, 2, 4 - -arg0, arg5, arg3, arg2, arg4, false, var8.field311);
                        var8.field303 = new class144(var9, 2, arg0 + 1 & 3, arg5, arg3, arg2, arg4, false, var8.field303);
                    }
                }
            }
            if (arg1 == 1) {
                class105 var10 = class139.method1036(arg5, arg3, arg2);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field1766 >>> 32);
                    if (arg6 != 4 && arg6 != 5) {
                        if (arg6 != 6) {
                            if (arg6 == 7) {
                                var10.field1754 = new class144(var11, 4, (arg0 + 2 & 3) + 4, arg5, arg3, arg2, arg4, false, var10.field1754);
                            } else if (arg6 == 8) {
                                var10.field1754 = new class144(var11, 4, arg0 + 4, arg5, arg3, arg2, arg4, false, var10.field1754);
                                var10.field1757 = new class144(var11, 4, (3 & arg0 - -2) + 4, arg5, arg3, arg2, arg4, false, var10.field1757);
                            }
                        } else {
                            var10.field1754 = new class144(var11, 4, arg0 + 4, arg5, arg3, arg2, arg4, false, var10.field1754);
                        }
                    } else {
                        var10.field1754 = new class144(var11, 4, arg0, arg5, arg3, arg2, arg4, false, var10.field1754);
                    }
                }
            }
            if (arg1 == 2) {
                if (arg6 == 11) {
                    arg6 = 10;
                }
                class70 var12 = class116.method911(arg5, arg3, arg2);
                if (var12 != null) {
                    var12.field1214 = new class144((int) (var12.field1197 >>> 32) & Integer.MAX_VALUE, arg6, arg0, arg5, arg3, arg2, arg4, false, var12.field1214);
                }
            }
            if (~arg1 == -4) {
                class5 var13 = class122.method936(arg5, arg3, arg2);
                if (var13 != null) {
                    var13.field104 = new class144(Integer.MAX_VALUE & (int) (var13.field111 >>> 32), 22, arg0, arg5, arg3, arg2, arg4, false, var13.field104);
                }
            }
        }
        if (arg7 != -29607) {
            field178 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        if (arg1 != 64) {
            this.method77(-108, 56);
        }
        int[][] var3 = super.field3035.method637(arg0, false);
        if (super.field3035.field1493 && this.method1717(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = arg0 % super.field4225 * super.field4225;
            for (int var8 = 0; var8 < class1.field11; ++var8) {
                int var9 = super.field4234[var8 % super.field4230 + var7];
                var5[var8] = class130.method985(4080, var9 << 4);
                var6[var8] = class130.method985(var9, 65280) >> 4;
                var4[var8] = class130.method985(var9, 16711680) >> 12;
            }
        }
        ++field167;
        return var3;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZIII)V")
    public static final void method78(boolean arg0, int arg1, int arg2, int arg3) {
        ++field172;
        if (arg3 != -31487) {
            method80((byte) 14);
        }
        if (arg2 >= 8000 && arg2 <= 48000) {
            class22.field380 = arg0;
            class77.field1324 = arg1;
            class139.field2490 = arg2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(Z)V")
    public static final void method79(boolean arg0) {
        class138.field2459.method83(0);
        if (arg0) {
            method80((byte) -116);
        }
        ++field170;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(B)V")
    public static final void method80(byte arg0) {
        class45.field775 = null;
        class106.field1807 = null;
        class9.field159 = null;
        class38.field653 = null;
        class90.field1500 = null;
        class32.field500 = null;
        class203.field3523 = null;
        class100.field1690 = 0;
        ++field176;
        class247.field4280 = null;
        class210.field3622 = null;
        int var1 = -2 % ((arg0 - 48) / 34);
        class75.field1298 = null;
        class207.field3574 = null;
        class54.field943.method1817(1);
        class154.field2717 = null;
        class178.field3083 = null;
        class116.field2160 = null;
        class53.field935 = null;
        class179.field3094 = null;
        class3.field63 = null;
        class227.field3870 = null;
        class130.field2349 = null;
        class47.field838 = null;
        class151.field2660 = null;
    }

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "(B)V")
    public static void method81(byte arg0) {
        field177 = null;
        field175 = null;
        field171 = null;
        int var1 = 5 / ((40 - arg0) / 60);
        field168 = null;
        field173 = null;
        field178 = null;
        field166 = null;
    }
}
