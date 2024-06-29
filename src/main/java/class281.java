import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class281 {

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "Llk;")
    private class84 field4357 = new class84();

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field4347 = 0;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field4361 = 0;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "Lh;")
    public static class278 field4359 = new class278(5000);

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4362 = "Please remove ";

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "Llk;")
    private class84 field4360;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBI)V")
    public static final void method1879(int arg0, byte arg1, int arg2) {
        if (arg1 <= 58) {
            field4359 = null;
        }
        class120.field1688[arg0] = arg2;
        field4348++;
        class248 var3 = (class248) class230.field3487.method23(216, (long) arg0);
        if (var3 == null) {
            class248 var4 = new class248(class223.method1433((byte) -103) + 500L);
            class230.field3487.method20(var4, (long) arg0, 0);
        } else {
            var3.field3801 = class223.method1433((byte) 124) + 500L;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)Llk;")
    public final class84 method1880(int arg0) {
        field4353++;
        class84 var2 = this.field4357.field1141;
        if (this.field4357 == var2) {
            return null;
        }
        var2.method527(false);
        if (arg0 != 0) {
            this.field4357 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)V")
    public static final void method1881(boolean arg0, int arg1) {
        field4355++;
        if (arg0) {
            method1891(-86, false, (Object) null);
        }
        class280 var2 = class181.method1180(arg1, 0, 2);
        var2.method1871((byte) 26);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)I")
    public final int method1882(int arg0) {
        int var2 = 0;
        field4349++;
        if (arg0 != 0) {
            this.method1880(61);
        }
        class84 var3 = this.field4357.field1141;
        while (this.field4357 != var3) {
            var3 = var3.field1141;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1883(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4352++;
        if (arg5 != 12686) {
            field4359 = null;
        }
        if (arg0 == arg2) {
            class81.method509(arg0, arg6, arg3, arg4, -1484, arg1, arg7);
        } else if ((arg6 - arg0) >= class93.field1294 && arg0 + arg6 <= class296.field4668 && (arg7 - arg2) >= class273.field4228 && class127.field1782 >= arg2 + arg7) {
            class225.method1497(arg2, arg1, arg6, arg4, arg0, arg7, arg3, -32181);
        } else {
            class124.method813(arg7, (byte) 84, arg4, arg6, arg3, arg1, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
    public static final void method1884(int arg0) {
        field4350++;
        class56 var1 = (class56) class289.field4559.method21((byte) 67);
        if (arg0 > -63) {
            return;
        }
        while (var1 != null) {
            int var2 = var1.field808;
            if (class52.method328(19031, var2)) {
                boolean var3 = true;
                class211[] var4 = class158.field2208[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field3011;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2369;
                    class211 var7 = class67.method421(var6, 0);
                    if (var7 != null) {
                        class236.method1583(var7, 0);
                    }
                }
            }
            var1 = (class56) class289.field4559.method22(true);
        }
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V")
    public static void method1885(int arg0) {
        int var1 = 18 / ((arg0 + 50) / 43);
        field4359 = null;
        field4362 = null;
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)Llk;")
    public final class84 method1886(int arg0) {
        field4354++;
        class84 var2 = this.field4360;
        int var3 = -76 / ((31 - arg0) / 51);
        if (this.field4357 == var2) {
            this.field4360 = null;
            return null;
        } else {
            this.field4360 = var2.field1141;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)Llk;")
    public final class84 method1887(byte arg0) {
        field4351++;
        class84 var2 = this.field4357.field1141;
        if (arg0 >= -34) {
            method1885(21);
        }
        if (this.field4357 == var2) {
            this.field4360 = null;
            return null;
        } else {
            this.field4360 = var2.field1141;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)V")
    public final void method1888(int arg0) {
        while (true) {
            class84 var2 = this.field4357.field1141;
            if (this.field4357 == var2) {
                if (arg0 != 0) {
                    return;
                }
                this.field4360 = null;
                field4346++;
                return;
            }
            var2.method527(false);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIILsa;IJ)Z")
    public static final boolean method1889(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class268 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class193.method1233(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Llk;I)V")
    public final void method1890(class84 arg0, int arg1) {
        field4358++;
        if (arg0.field1143 != null) {
            arg0.method527(false);
        }
        arg0.field1141 = this.field4357;
        arg0.field1143 = this.field4357.field1143;
        if (arg1 != 0) {
            method1889(61, -119, 71, 79, 86, -7, (class268) null, 85, 58L);
        }
        arg0.field1143.field1141 = arg0;
        arg0.field1141.field1143 = arg0;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
    public static final byte[] method1891(int arg0, boolean arg1, Object arg2) {
        field4356++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class261.method1724(var3, -24259) : var3;
        } else if (arg2 instanceof class232) {
            class232 var4 = (class232) arg2;
            return var4.method1530(-104);
        } else if (arg0 == 23394) {
            throw new IllegalArgumentException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
    public class281() {
        this.field4357.field1141 = this.field4357;
        this.field4357.field1143 = this.field4357;
    }
}
