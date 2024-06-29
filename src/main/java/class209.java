import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class209 extends class212 {

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "Lcg;")
    public static class49 field3541;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Lcg;")
    public static class49 field3545;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Lje;")
    public static class83 field3542;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "[I")
    public static int[] field3548;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)I", line = 7)
    public static final int method1552(int arg0, int arg1, int arg2) {
        int var3 = arg2 * 57 + arg0;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        if (arg1 <= 67) {
            method1555((byte) 54);
        }
        field3546++;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZB)V", line = 29)
    public static final void method1553(boolean arg0, byte arg1) {
        if (arg0 && class38.field552 != null) {
            class257.field4137 = class38.field552.field5188;
        } else {
            class257.field4137 = -1;
        }
        class336.field5368 = (byte[][][]) null;
        class122.field2116 = (byte[][][]) null;
        field3544++;
        class66.field1064 = (byte[][][]) null;
        class138.field2552 = null;
        class159.field2812 = (int[][][]) null;
        class290.field4636 = (int[][][]) null;
        class38.field552 = null;
        class114.field1915 = 0;
        class40.field602 = (byte[][][]) null;
        class37.field535 = (int[][][]) null;
        class282.field4470 = null;
        class90.field1425 = (byte[][][]) null;
        class185.field3138.method2302(128);
        class91.field1438 = null;
        class222.field3708 = null;
        class84.field1358 = null;
        class287.field4581 = null;
        class255.field4115 = -1;
        class282.field4466 = null;
        if (arg1 != 96) {
            method1556((class320) null, -77, (class320) null);
        }
        class199.field3404 = -1;
        class168.field2931 = null;
        class195.field3306 = null;
        class32.field460 = null;
        class105.field1756 = null;
        class246.field3991 = null;
        class347.field5532 = null;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)I", line = 70)
    public static final int method1554(int arg0) {
        field3550++;
        if (class120.field2076 != null) {
            return 3;
        } else if (class43.field680 && class39.field579) {
            return 2;
        } else if (class43.field680 && !class39.field579) {
            return 1;
        } else {
            if (arg0 > -120) {
                field3548 = (int[]) null;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V", line = 93)
    public static void method1555(byte arg0) {
        field3541 = null;
        field3545 = null;
        if (arg0 != -19) {
            method1560((byte) 63);
        }
        field3548 = null;
        field3542 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lte;ILte;)V", line = 111)
    public static final void method1556(class320 arg0, int arg1, class320 arg2) {
        if (arg2.field5065 != null) {
            arg2.method2195(-1);
        }
        arg2.field5065 = arg0.field5065;
        field3543++;
        arg2.field5068 = arg0;
        arg2.field5065.field5068 = arg2;
        if (arg1 <= -27) {
            arg2.field5068.field5065 = arg2;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([I[Ljava/lang/Object;Z)V", line = 132)
    public static final void method1557(int[] arg0, Object[] arg1, boolean arg2) {
        class223.method1630(arg0, -1, 0, arg1, arg0.length - 1);
        if (arg2) {
            method1558((float[][]) ((float[][]) null), 95, 76, -99, (class337) null, (int[][]) ((int[][]) null), (float[][]) ((float[][]) null), 83, false, -65, (byte) 0, -126, (float[][]) ((float[][]) null), (int[][]) ((int[][]) null), -71, 35, true, (boolean[]) null, (int[]) null, false, false, -102);
        }
        field3540++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([[FIIILbl;[[I[[FIZIBI[[F[[IIIZ[Z[IZZI)V", line = 143)
    public static final void method1558(float[][] arg0, int arg1, int arg2, int arg3, class337 arg4, int[][] arg5, float[][] arg6, int arg7, boolean arg8, int arg9, byte arg10, int arg11, float[][] arg12, int[][] arg13, int arg14, int arg15, boolean arg16, boolean[] arg17, int[] arg18, boolean arg19, boolean arg20, int arg21) {
        field3553++;
        int var22 = (arg15 << 8) + (arg19 ? 255 : 0);
        int var23 = (arg8 ? 255 : 0) + (arg7 << 8);
        int var24 = (arg16 ? 255 : 0) + (arg1 << 8);
        int var25 = (arg20 ? 255 : 0) + (arg3 << 8);
        if (arg11 != 255) {
            return;
        }
        int[] var26 = new int[arg18.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg18[var27 + var27];
            int[][] var29 = arg13 == null || arg17 == null || !arg17[var27] ? arg5 : arg13;
            int var30 = arg18[var27 - (-var27 - 1)];
            var26[var27] = class79.method737(arg12, var24, arg6, var22, var28, false, -42, var23, arg21, arg13, var30, arg0, var25, arg14, arg10, var29, arg4, (float) arg2);
        }
        arg4.method2381(arg9, arg14, arg21, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V", line = 181)
    public static final void method1559(int arg0) {
        class257.field4133.method470(12);
        field3552++;
        class342.field5447.method470(12);
        if (arg0 > -92) {
            method1552(122, 76, -84);
        }
        class85.field1359.method470(12);
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(B)V", line = 198)
    public static final void method1560(byte arg0) {
        class346.field5507.method470(12);
        if (arg0 != 35) {
            field3542 = (class83) null;
        }
        field3549++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIBLao;II)V", line = 210)
    public static final void method1561(int arg0, int arg1, int arg2, byte arg3, class200 arg4, int arg5, int arg6) {
        long var7 = 0L;
        field3547++;
        if (arg3 < 115) {
            method1559(59);
        }
        if (arg2 == 0) {
            var7 = class290.method1980(arg0, arg5, arg6);
        } else if (arg2 == 1) {
            var7 = class100.method865(arg0, arg5, arg6);
        } else if (arg2 == 2) {
            var7 = class143.method1156(arg0, arg5, arg6);
        } else if (arg2 == 3) {
            var7 = class271.method1850(arg0, arg5, arg6);
        }
        boolean var9 = false;
        boolean var10 = false;
        boolean var11 = true;
        int var12 = ((int) var7 & 0x38F2A3) >> 20;
        int var13 = ((int) var7 & 0x7E6EF) >> 14;
        int var14 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        class97 var15 = class92.method798((byte) 104, var14);
        if (var15.method843(-1)) {
            class120.method1016(arg5, arg0, 92, arg6, var15);
        }
        if (var7 == 0L) {
            return;
        }
        class104 var16 = null;
        class104 var17 = null;
        if (arg2 == 0) {
            class297 var21 = class21.method217(arg0, arg5, arg6);
            if (var21 != null) {
                var17 = var21.field4744;
                var16 = var21.field4741;
            }
            if (var15.field1575 != 0) {
                arg4.method1503(!var15.field1536, arg6, var12, var13, -6783, arg5, var15.field1511);
            }
        } else if (arg2 == 1) {
            class44 var18 = class339.method2393(arg0, arg5, arg6);
            if (var18 != null) {
                var16 = var18.field700;
                var17 = var18.field694;
            }
        } else if (arg2 == 2) {
            class241 var20 = client.method1897(arg0, arg5, arg6);
            if (var20 != null) {
                var16 = var20.field3940;
            }
            if (var15.field1575 != 0 && (var15.field1559 + arg5) < 104 && (var15.field1559 + arg6) < 104 && (arg5 + var15.field1549) < 104 && var15.field1549 + arg6 < 104) {
                arg4.method1512(var15.field1511, var15.field1549, var15.field1559, !var15.field1536, arg5, arg6, var12, 131072);
            }
        } else if (arg2 == 3) {
            class330 var19 = class1.method5(arg0, arg5, arg6);
            if (var19 != null) {
                var16 = var19.field5257;
            }
            if (var15.field1575 == 1) {
                arg4.method1511(-19233, arg6, arg5);
            }
        }
        if (var15.field1579 != null) {
            var15 = var15.method833(false);
        }
        if (!class43.field680 || var15 == null || !var15.field1586) {
            return;
        }
        if (var13 == 2) {
            if (var16 instanceof class71) {
                ((class71) var16).method682(-1);
            } else {
                class166.method1309(arg5, var15, var12 + 4, arg6, var13, arg1, 0, (byte) -63, 0);
            }
            if (var17 instanceof class71) {
                ((class71) var17).method682(-1);
            } else {
                class166.method1309(arg5, var15, var12 + 1 & 0x3, arg6, var13, arg1, 0, (byte) 113, 0);
            }
        } else if (var13 == 5) {
            if ((var16 instanceof class71)) {
                ((class71) var16).method682(-1);
            } else {
                class166.method1309(arg5, var15, var12, arg6, 4, arg1, class191.field3199[var12] * 8, (byte) -38, class142.field2600[var12] * 8);
            }
        } else if (var13 == 6) {
            if (var16 instanceof class71) {
                ((class71) var16).method682(-1);
            } else {
                class166.method1309(arg5, var15, var12 + 4, arg6, 4, arg1, class321.field5104[var12] * 8, (byte) -15, class293.field4705[var12] * 8);
            }
        } else if (var13 == 7) {
            if ((var16 instanceof class71)) {
                ((class71) var16).method682(-1);
            } else {
                class166.method1309(arg5, var15, (var12 + 2 & 0x3) + 4, arg6, 4, arg1, 0, (byte) 96, 0);
            }
        } else if (var13 == 8) {
            if ((var16 instanceof class71)) {
                ((class71) var16).method682(-1);
            } else {
                class166.method1309(arg5, var15, var12 + 4, arg6, 4, arg1, class321.field5104[var12] * 8, (byte) 120, class293.field4705[var12] * 8);
            }
            if (var17 instanceof class71) {
                ((class71) var17).method682(-1);
            } else {
                class166.method1309(arg5, var15, (var12 + 2 & 0x3) + 4, arg6, 4, arg1, class321.field5104[var12] * 8, (byte) -112, class293.field4705[var12] * 8);
            }
        } else if (var13 == 11) {
            if ((var16 instanceof class71)) {
                ((class71) var16).method682(-1);
            } else {
                class166.method1309(arg5, var15, var12 + 4, arg6, 10, arg1, 0, (byte) -70, 0);
            }
        } else if ((var16 instanceof class71)) {
            ((class71) var16).method682(-1);
        } else {
            class166.method1309(arg5, var15, var12, arg6, var13, arg1, 0, (byte) 109, 0);
        }
    }
}
