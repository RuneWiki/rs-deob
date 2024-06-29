import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class86 extends class481 implements class161 {

    @OriginalMember(owner = "client!np", name = "A", descriptor = "Lah;")
    public class191 field1402;

    @OriginalMember(owner = "client!np", name = "z", descriptor = "Z")
    private boolean field1401;

    @OriginalMember(owner = "client!np", name = "p", descriptor = "Z")
    public static boolean field1391 = false;

    @OriginalMember(owner = "client!np", name = "x", descriptor = "[B")
    public static byte[] field1399 = new byte[520];

    @OriginalMember(owner = "client!np", name = "C", descriptor = "[I")
    public static int[] field1404 = new int[3];

    @OriginalMember(owner = "client!np", name = "J", descriptor = "Z")
    public static boolean field1411 = false;

    @OriginalMember(owner = "client!np", name = "I", descriptor = "I")
    public static int field1410 = 1407;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!np", name = "q", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!np", name = "r", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!np", name = "t", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!np", name = "u", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!np", name = "v", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!np", name = "w", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!np", name = "y", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!np", name = "B", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!np", name = "D", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!np", name = "E", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!np", name = "F", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!np", name = "G", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!np", name = "H", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!np", name = "K", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!np", name = "L", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!np", name = "M", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!np", name = "O", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!np", name = "s", descriptor = "[I")
    public static int[] field1394;

    @OriginalMember(owner = "client!np", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field1415;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "(I)Lcl;")
    public static final class53 method763(int arg0) {
        ++field1412;
        if (class362.field5333 != null && class107.field1626 != null) {
            class107.field1626.method1847(422661894, class362.field5333);
            if (arg0 != 65487) {
                field1415 = null;
            }
            class53 var1 = (class53) class107.field1626.method1840(-69);
            if (var1 == null) {
                return null;
            } else {
                class30 var2 = class362.field5329.method2182(var1.field824, (byte) -42);
                return var2 != null && var2.field360 && var2.method184(81, class362.field5328) ? var1 : class291.method1948(-1);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lza;IZ)Le;")
    public final class289 method111(class299 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return null;
        } else {
            ++field1405;
            return this.field1402.method1322(0, arg0, (byte) -125, false, false, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lza;IIILps;IZ)V")
    public final void method102(class299 arg0, int arg1, int arg2, int arg3, class352 arg4, int arg5, boolean arg6) {
        if (arg3 == -750) {
            ++field1392;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)I")
    public final int method99(byte arg0) {
        if (arg0 != -107) {
            this.method108(0);
        }
        ++field1403;
        return this.field1402.field2946;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(III)Lso;")
    public static final class202 method764(int arg0, int arg1, int arg2) {
        class281 var3 = class348.field5192[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4389;
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V")
    public final void method106(int arg0) {
        if (arg0 != -19159) {
            this.method106(-100);
        }
        ++field1406;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(Z)V")
    public static void method765(boolean arg0) {
        if (!arg0) {
            field1404 = null;
            field1399 = null;
            field1415 = null;
            field1394 = null;
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(B)Z")
    public final boolean method104(byte arg0) {
        int var2 = 53 / ((-41 - arg0) / 38);
        ++field1398;
        return this.field1402.method1328((byte) -93);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILza;)V")
    public final void method98(int arg0, class299 arg1) {
        ++field1393;
        class289 var3 = this.field1402.method1322(super.field7058, arg1, (byte) -126, true, true, 262144, super.field7061);
        if (arg0 == 31203) {
            if (var3 != null) {
                int var4 = super.field7058 >> 7;
                int var5 = super.field7061 >> 7;
                this.field1402.method1323(var5, arg0 + -33579, arg1, false, var3, var4, var4, var5);
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "([BB)[B")
    public static final byte[] method766(byte[] arg0, byte arg1) {
        ++field1416;
        if (arg1 != 122) {
            return null;
        } else {
            int var2 = arg0.length;
            byte[] var3 = new byte[var2];
            class325.method2131(arg0, 0, var3, 0, var2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(ILza;)Lhp;")
    public final class293 method110(int arg0, class299 arg1) {
        ++field1413;
        class289 var3 = this.field1402.method1322(super.field7058, arg1, (byte) -114, true, false, 2048, super.field7061);
        if (arg0 != 0) {
            return null;
        } else if (var3 == null) {
            return null;
        } else {
            class517 var4 = arg1.method538();
            var4.method951(super.field7058, super.field7052, super.field7061);
            class293 var5 = null;
            if (this.field1401) {
                var5 = class467.method2844(-22755, 1);
            }
            if (this.field1402.field2942 != null) {
                class320 var6 = this.field1402.field2942.method2424();
                arg1.method584(var3, var6, var4, var5 == null ? null : var5.field4524[0], 0);
            } else {
                var3.method673(var4, var5 == null ? null : var5.field4524[0], 0);
            }
            int var7 = super.field7058 >> 7;
            int var8 = super.field7061 >> 7;
            this.field1402.method1323(var8, arg0 + -2376, arg1, true, var3, var7, var7, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lza;B)V")
    public final void method96(class299 arg0, byte arg1) {
        this.field1402.method1319(101, arg0);
        if (arg1 <= 78) {
            field1415 = null;
        }
        ++field1407;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)I")
    public final int method97(int arg0) {
        if (arg0 < 82) {
            return -65;
        } else {
            ++field1397;
            return this.field1402.field2917;
        }
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(I)V")
    public final void method108(int arg0) {
        int var2 = -14 % ((arg0 - 48) / 37);
        ++field1409;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(B)Z")
    public final boolean method107(byte arg0) {
        ++field1396;
        return arg0 != -88;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lza;III)Z")
    public final boolean method109(class299 arg0, int arg1, int arg2, int arg3) {
        ++field1408;
        class289 var5 = this.field1402.method1322(super.field7058, arg0, (byte) -128, false, false, 131072, super.field7061);
        if (var5 == null) {
            return false;
        } else {
            class517 var6 = arg0.method538();
            var6.method951(super.field7058, super.field7052, super.field7061);
            return arg2 <= 23 ? true : var5.method638(arg1, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lza;Lii;IIIIIZII)V")
    public class86(class299 arg0, class395 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field5837, arg1.field5775, arg1.field5789);
        this.field1402 = new class191(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field1401 = arg1.field5840 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)I")
    public final int method103(int arg0) {
        if (arg0 > -10) {
            return 124;
        } else {
            ++field1400;
            return this.field1402.field2951;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method767(int arg0, int arg1) {
        if (arg1 != 520) {
            field1411 = true;
        }
        ++field1414;
        return (arg0 >> 24 & 255) + "." + (255 & arg0 >> 16) + "." + ((65487 & arg0) >> 8) + "." + (255 & arg0);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BLza;)V")
    public final void method100(byte arg0, class299 arg1) {
        ++field1395;
        if (arg0 != 51) {
            this.method98(108, (class299) null);
        }
        this.field1402.method1321(arg0 ^ -32049, arg1);
    }
}
