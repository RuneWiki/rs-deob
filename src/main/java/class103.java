import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class103 extends class233 implements class18 {

    @OriginalMember(owner = "client!db", name = "u", descriptor = "Lop;")
    public class262 field1380;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "Z")
    private boolean field1394;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "I")
    public static int field1397 = 0;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "[I")
    public static int[] field1392 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!db", name = "w", descriptor = "Lwl;")
    public static class452 field1382 = new class452(49, 3);

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    public static int field1403 = 0;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "Liq;")
    public static class134 field1378;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "Ltb;")
    public static class290 field1402;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "[[[Ldc;")
    public static class13[][][] field1393;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(Ldr;I)Lkq;")
    public final class70 method10(class261 arg0, int arg1) {
        ++field1400;
        class292 var3 = this.field1380.method1630(super.field3524, false, true, arg0, 93, 1024, super.field3525);
        if (arg1 != 7) {
            field1393 = null;
        }
        if (var3 == null) {
            return null;
        } else {
            class361 var4 = arg0.method434();
            var4.method611(super.field3525, super.field3528, super.field3524);
            class70 var5 = null;
            if (this.field1394) {
                var5 = class383.method2309(-105, 1);
            }
            if (this.field1380.field3989 != null) {
                class439 var6 = this.field1380.field3989.method2050();
                arg0.method369(var3, var6, var4, var5 == null ? null : var5.field899[0], 0);
            } else {
                var3.method1282(var4, var5 == null ? null : var5.field899[0], 0);
            }
            this.field1380.method1623(super.field3525 >> 7, super.field3525 >> 7, super.field3524 >> 7, var3, (byte) 109, super.field3524 >> 7, arg0, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(II)Z")
    public static final boolean method650(int arg0, int arg1) {
        class339.field5052 = true;
        if (arg1 != 19334) {
            field1382 = null;
        }
        ++field1381;
        class28.field361 = 65535 & arg0 + 1;
        return true;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLdr;)V")
    public final void method2(byte arg0, class261 arg1) {
        if (arg0 != 76) {
            this.field1380 = null;
        }
        this.field1380.method1628(arg1, (byte) 84);
        ++field1386;
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
    public static final void method651(int arg0) {
        class317.method1940();
        if (arg0 <= 56) {
            field1402 = null;
        }
        ++field1390;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)Z")
    public final boolean method112(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field1383;
            return false;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public final void method11(int arg0) {
        if (arg0 != -21910) {
            field1397 = 64;
        }
        ++field1398;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ldr;IB)Lwp;")
    public final class292 method12(class261 arg0, int arg1, byte arg2) {
        int var4 = 76 % ((arg2 - 46) / 47);
        ++field1391;
        return this.field1380.method1630(0, false, false, arg0, 115, arg1, 0);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Z")
    public final boolean method1(int arg0) {
        ++field1388;
        int var2 = 34 / ((arg0 - -1) / 46);
        return this.field1380.method1626(-27318);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)S")
    public static final short method652(int arg0, byte arg1) {
        ++field1389;
        int var2 = 63 & arg0 >> 10;
        int var3 = (903 & arg0) >> 3;
        int var4 = arg0 & 127;
        int var5 = ~var4 < -65 ? (-var4 + 127) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7 = 76 % ((56 - arg1) / 59);
        int var8;
        if (~var6 != -1) {
            var8 = (var5 << 8) / var6;
        } else {
            var8 = var5 << 1;
        }
        return (short) (var8 >> 4 << 7 | var2 << 10 | var6);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ldr;I)V")
    public final void method6(class261 arg0, int arg1) {
        this.field1380.method1633(true, arg0);
        ++field1396;
        if (arg1 >= -68) {
            field1401 = 8;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)I")
    public final int method7(boolean arg0) {
        ++field1385;
        if (!arg0) {
            this.method12((class261) null, 74, (byte) -85);
        }
        return this.field1380.field3998;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZILla;IIILdr;)V")
    public final void method117(boolean arg0, int arg1, class269 arg2, int arg3, int arg4, int arg5, class261 arg6) {
        if (arg1 != 0) {
            this.field1394 = true;
        }
        ++field1399;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IILdr;I)Z")
    public final boolean method4(int arg0, int arg1, class261 arg2, int arg3) {
        if (arg3 != 2) {
            field1378 = null;
        }
        ++field1395;
        class292 var5 = this.field1380.method1630(super.field3524, false, false, arg2, 122, 65536, super.field3525);
        if (var5 == null) {
            return false;
        } else {
            class361 var6 = arg2.method434();
            var6.method611(super.field3525, super.field3528, super.field3524);
            return var5.method1297(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ldr;Lfq;IIIIIIIZI)V")
    public class103(class261 arg0, class85 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        super(arg6, arg7, arg8, class414.method2582(arg2, arg3, 0));
        this.field1380 = new class262(arg0, arg1, arg2, arg3, arg4, arg5, super.field3525, super.field3524, arg9, arg10);
        this.field1394 = arg1.field1184 != 0 && !arg9;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)I")
    public final int method9(int arg0) {
        if (arg0 <= 26) {
            return 77;
        } else {
            ++field1379;
            return this.field1380.field3985;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)I")
    public final int method3(byte arg0) {
        if (arg0 >= -3) {
            field1397 = -86;
        }
        ++field1376;
        return this.field1380.field4005;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
    public final void method116(byte arg0) {
        ++field1384;
        if (arg0 <= -45) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(Ldr;I)V")
    public final void method15(class261 arg0, int arg1) {
        ++field1387;
        if (arg1 <= 114) {
            this.method6((class261) null, -67);
        }
        class292 var3 = this.field1380.method1630(super.field3524, true, true, arg0, 120, 131072, super.field3525);
        if (var3 != null) {
            this.field1380.method1623(super.field3525 >> 7, super.field3525 >> 7, super.field3524 >> 7, var3, (byte) 94, super.field3524 >> 7, arg0, false);
        }
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
    public static void method653(int arg0) {
        field1402 = null;
        field1382 = null;
        field1392 = null;
        field1378 = null;
        if (arg0 != -20436) {
            field1401 = -58;
        }
        field1393 = null;
    }
}
