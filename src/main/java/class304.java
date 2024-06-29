import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class304 {

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "[Lrg;")
    public static class601[] field3854 = new class601[35];

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILej;IIIB)V", line = 8)
    public static final void method1809(int arg0, class112 arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3857++;
        if (arg1.field1399 == -1 && arg1.field1401 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class611.field8310.field8701 * arg1.field1410 >> 8;
        if (arg1.field1408 < arg2) {
            var6 += arg2 - arg1.field1408;
        } else if (arg1.field1398 > arg2) {
            var6 += arg1.field1398 - arg2;
        }
        if (arg1.field1407 < arg0) {
            var6 += arg0 - arg1.field1407;
        } else if (arg0 < arg1.field1409) {
            var6 += arg1.field1409 - arg0;
        }
        if (arg5 != -58) {
            return;
        }
        if (arg1.field1403 == 0 || arg1.field1403 < var6 - 256 || class611.field8310.field8701 == 0 || arg1.field1391 != arg3) {
            if (arg1.field1396 != null) {
                class314.field3941.method1489(arg1.field1396);
                arg1.field1413 = null;
                arg1.field1396 = null;
                arg1.field1390 = null;
            }
            if (arg1.field1386 != null) {
                class314.field3941.method1489(arg1.field1386);
                arg1.field1414 = null;
                arg1.field1412 = null;
                arg1.field1386 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg1.field1403 - var6) * var7 / arg1.field1403;
        if (arg1.field1396 != null) {
            arg1.field1396.method3406(var8);
        } else if (arg1.field1399 >= 0) {
            if (arg1.field1387) {
                if (arg1.field1390 == null) {
                    arg1.field1390 = class494.method2683(class431.field5439, arg1.field1399);
                }
                if (arg1.field1390 != null) {
                    if (arg1.field1413 == null) {
                        arg1.field1413 = arg1.field1390.method2675(new int[] { 22050 });
                    }
                    if (arg1.field1413 != null) {
                        class609 var9 = class609.method3396(arg1.field1413, 100, var8);
                        var9.method3394(-1);
                        class314.field3941.method1485(var9);
                        arg1.field1396 = var9;
                    }
                }
            } else {
                class547 var10 = class547.method2930(class202.field2352, arg1.field1399, 0);
                if (var10 != null) {
                    class4 var11 = var10.method2932().method12(class690.field9575);
                    class609 var12 = class609.method3396(var11, 100, var8);
                    var12.method3394(-1);
                    class314.field3941.method1485(var12);
                    arg1.field1396 = var12;
                }
            }
        }
        if (arg1.field1386 != null) {
            arg1.field1386.method3406(var8);
            if (!arg1.field1386.method1565((byte) 125)) {
                arg1.field1414 = null;
                arg1.field1386 = null;
                arg1.field1412 = null;
            }
        } else if (arg1.field1401 != null && (arg1.field1411 -= arg4) <= 0) {
            if (arg1.field1395) {
                if (arg1.field1412 == null) {
                    int var13 = (int) ((double) arg1.field1401.length * Math.random());
                    arg1.field1412 = class494.method2683(class431.field5439, arg1.field1401[var13]);
                }
                if (arg1.field1412 != null) {
                    if (arg1.field1414 == null) {
                        arg1.field1414 = arg1.field1412.method2675(new int[] { 22050 });
                    }
                    if (arg1.field1414 != null) {
                        class609 var14 = class609.method3396(arg1.field1414, 100, var8);
                        var14.method3394(0);
                        class314.field3941.method1485(var14);
                        arg1.field1411 = arg1.field1388 + ((int) (Math.random() * (double) (arg1.field1405 - arg1.field1388)));
                        arg1.field1386 = var14;
                        return;
                    }
                }
                return;
            }
            int var15 = (int) (Math.random() * (double) arg1.field1401.length);
            class547 var16 = class547.method2930(class202.field2352, arg1.field1401[var15], 0);
            if (var16 != null) {
                class4 var17 = var16.method2932().method12(class690.field9575);
                class609 var18 = class609.method3396(var17, 100, var8);
                var18.method3394(0);
                class314.field3941.method1485(var18);
                arg1.field1411 = arg1.field1388 + (int) ((double) (arg1.field1405 - arg1.field1388) * Math.random());
                arg1.field1386 = var18;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V", line = 209)
    public static final void method1810(byte arg0) {
        field3858++;
        if (class583.field7833 == 6) {
            int var1 = 17 % ((78 - arg0) / 41);
            class583.field7833 = 7;
        }
    }

    @OriginalMember(owner = "client!hs", name = "toString", descriptor = "()Ljava/lang/String;", line = 225)
    public final String toString() {
        field3859++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lkda;FIFIIFFZFI)[B", line = 235)
    public static final byte[] method1811(class361 arg0, float arg1, int arg2, float arg3, int arg4, int arg5, float arg6, float arg7, boolean arg8, float arg9, int arg10) {
        field3856++;
        byte[] var11 = new byte[arg2 * arg5 * arg4];
        class180.method1066(arg7, arg9, arg3, var11, arg6, arg4, 0, arg0, arg1, (byte) 16, arg5, arg10, arg2);
        return arg8 ? var11 : null;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V", line = 250)
    public static final void method1812(int arg0) {
        field3855++;
        if (class694.field9630 != -1) {
            class299.method1783(false, class694.field9630, -1, (byte) 124, -1);
            class694.field9630 = -1;
        }
        if (arg0 != -1) {
            field3854 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)V", line = 270)
    public static void method1813(byte arg0) {
        field3854 = null;
        if (arg0 > -112) {
            field3854 = null;
        }
    }
}
