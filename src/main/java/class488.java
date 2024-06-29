import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class488 extends class577 {

    @OriginalMember(owner = "client!cv", name = "C", descriptor = "I")
    private int field6927 = 0;

    @OriginalMember(owner = "client!cv", name = "T", descriptor = "I")
    private int field6943 = 0;

    @OriginalMember(owner = "client!cv", name = "I", descriptor = "I")
    private int field6933 = -32768;

    @OriginalMember(owner = "client!cv", name = "V", descriptor = "Z")
    public boolean field6945 = false;

    @OriginalMember(owner = "client!cv", name = "bb", descriptor = "I")
    private int field6951 = 0;

    @OriginalMember(owner = "client!cv", name = "ab", descriptor = "I")
    private int field6950 = -1;

    @OriginalMember(owner = "client!cv", name = "U", descriptor = "I")
    public int field6944;

    @OriginalMember(owner = "client!cv", name = "M", descriptor = "I")
    private int field6937;

    @OriginalMember(owner = "client!cv", name = "db", descriptor = "I")
    private int field6953;

    @OriginalMember(owner = "client!cv", name = "D", descriptor = "Ltt;")
    private class78 field6928;

    @OriginalMember(owner = "client!cv", name = "eb", descriptor = "I")
    public static int field6954 = 328;

    @OriginalMember(owner = "client!cv", name = "cb", descriptor = "Z")
    public static boolean field6952 = false;

    @OriginalMember(owner = "client!cv", name = "L", descriptor = "Lsl;")
    public static class391 field6936 = new class391("", 15);

    @OriginalMember(owner = "client!cv", name = "gb", descriptor = "Laq;")
    public static class141 field6956 = new class141(4);

    @OriginalMember(owner = "client!cv", name = "E", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!cv", name = "F", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!cv", name = "G", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!cv", name = "H", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!cv", name = "J", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!cv", name = "K", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!cv", name = "N", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!cv", name = "P", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!cv", name = "Q", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!cv", name = "R", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!cv", name = "S", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!cv", name = "X", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!cv", name = "Y", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!cv", name = "Z", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!cv", name = "hb", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!cv", name = "fb", descriptor = "Ldea;")
    private class206 field6955;

    @OriginalMember(owner = "client!cv", name = "W", descriptor = "Loa;")
    public static class597 field6946;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V")
    public final void method2922(byte arg0) {
        ++field6938;
        if (arg0 != -75) {
            this.field6945 = false;
        }
        if (this.field6955 != null) {
            this.field6955.method1368();
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)V")
    public final void method2923(int arg0, int arg1) {
        ++field6930;
        int var3 = 41 % ((arg1 - 23) / 36);
        if (!this.field6945) {
            this.field6943 += arg0;
            while (this.field6943 > this.field6928.field1049[this.field6951]) {
                this.field6943 -= this.field6928.field1049[this.field6951];
                ++this.field6951;
                if (~this.field6951 <= ~this.field6928.field1035.length) {
                    this.field6945 = true;
                    break;
                }
            }
            if (!this.field6945) {
                class163.method1179(-1721201176, super.field8496, this.field6928, false, super.field8501, super.field8500, this.field6951);
            }
        }
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(B)V")
    public static void method2924(byte arg0) {
        field6936 = null;
        field6956 = null;
        field6946 = null;
        if (arg0 < 13) {
            method2928((class51) null, -96, -4, 103, 33, 11);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILqa;)V")
    public final void method194(int arg0, class208 arg1) {
        ++field6947;
        class159 var3 = this.method2925(-79, arg1, this.field6937, arg0);
        if (var3 != null) {
            this.method2927(arg1, (byte) -72, var3);
        }
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field6944 = arg1 + arg2;
        this.field6937 = arg0;
        this.field6953 = arg4;
        this.field6927 = arg12;
        class389 var14 = class59.field742.method863(this.field6937, (byte) -124);
        int var15 = var14.field5357;
        if (~var15 != 0) {
            this.field6928 = class463.field6521.method2983(var15, -128);
            this.field6945 = false;
        } else {
            this.field6945 = true;
        }
        if (~this.field6944 == ~arg2) {
            class163.method1179(-1721201176, super.field8496, this.field6928, false, super.field8501, super.field8500, this.field6951);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lqa;I)Lpl;")
    public final class558 method189(class208 arg0, int arg1) {
        ++field6934;
        if (arg1 != 31733) {
            this.field6943 = -31;
        }
        return null;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILqa;II)Lr;")
    private final class159 method2925(int arg0, class208 arg1, int arg2, int arg3) {
        int var5 = -122 / ((arg0 - -3) / 46);
        ++field6929;
        class389 var6 = class59.field742.method863(arg2, (byte) -124);
        class176 var7 = class207.field3077[super.field8501];
        class176 var8 = this.field6953 >= 3 ? null : class207.field3077[this.field6953 + 1];
        return !this.field6945 ? var6.method2324(true, this.field6951, arg1, super.field8496, var7, this.field6950, this.field6943, class463.field6521, -1172910271, super.field8500, var8, super.field8502, arg3) : var6.method2324(true, -1, arg1, super.field8496, var7, -1, 0, class463.field6521, -1172910271, super.field8500, var8, super.field8502, arg3);
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILqa;IB)Z")
    public final boolean method171(int arg0, class208 arg1, int arg2, byte arg3) {
        if (arg3 <= 44) {
            this.field6951 = 122;
        }
        ++field6942;
        return false;
    }

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "(I)V")
    public final void method179(int arg0) {
        ++field6941;
        if (arg0 != 1) {
            field6956 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cv", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field6940;
        if (this.field6955 != null) {
            this.field6955.method1368();
        }
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(II)I")
    public static final int method2926(int arg0, int arg1) {
        ++field6957;
        if (arg1 != 6406) {
            if (~arg1 == -6410) {
                return 1;
            } else if (~arg1 != -32842) {
                if (~arg1 == -6411) {
                    return 2;
                } else if (~arg1 == -6408) {
                    return 3;
                } else if (~arg1 == -6409) {
                    return 4;
                } else {
                    if (arg0 != -6410) {
                        method2926(78, -12);
                    }
                    throw new IllegalArgumentException("");
                }
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lqa;BLr;)V")
    private final void method2927(class208 arg0, byte arg1, class159 arg2) {
        ++field6939;
        class450[] var4 = arg2.method60();
        class506[] var5 = arg2.method57();
        if ((this.field6955 == null || this.field6955.field3059) && (var4 != null || var5 != null)) {
            this.field6955 = class206.method1358(class617.field9123);
        }
        if (this.field6955 != null) {
            this.field6955.method1366(arg0, (long) class617.field9123, var4, var5, false);
            this.field6955.method1360(super.field8501, super.field8504, super.field8508, super.field8509, super.field8499);
        }
        if (arg1 != -72) {
            this.method2927((class208) null, (byte) 90, (class159) null);
        }
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(ILqa;)Lin;")
    public final class77 method181(int arg0, class208 arg1) {
        ++field6949;
        class159 var3 = this.method2925(78, arg1, this.field6937, 2048 | (this.field6927 == 0 ? 0 : 5));
        if (var3 == null) {
            return null;
        } else {
            if (~this.field6927 != -1) {
                var3.method61(this.field6927 * 2048);
            }
            class165 var4 = arg1.method428();
            var4.method353(super.field8496, super.field8502, super.field8500);
            if (arg0 < 0) {
                this.method177((byte) -100);
            }
            if (this.field6955 == null) {
                var3.method93(var4, (class381) null, 0);
            } else {
                class283 var5 = this.field6955.method1356();
                arg1.method511(var3, var5, var4, (class381) null, 0);
            }
            this.field6933 = var3.method86();
            this.method2927(arg1, (byte) -72, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lfw;IIIII)V")
    public static final void method2928(class51 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field594 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; ++var6) {
            label56: for (int var7 = arg3; var7 <= arg5; ++var7) {
                long var8 = class22.field219[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 65535L);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class420 var13 = class148.field2163[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field594; ++var14) {
                            if (arg0.field597[var14] == var13.field5683) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field597[arg0.field594++] = var13.field5683;
                        if (arg0.field594 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field594; var15 < 4; ++var15) {
            arg0.field597[var15] = null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "(B)I")
    public final int method177(byte arg0) {
        if (arg0 != 40) {
            return -29;
        } else {
            ++field6931;
            return this.field6933;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lqa;IZIILco;I)V")
    public final void method182(class208 arg0, int arg1, boolean arg2, int arg3, int arg4, class102 arg5, int arg6) {
        ++field6932;
        if (arg6 != 21130) {
            this.method2923(3, -128);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "(B)Z")
    public final boolean method180(byte arg0) {
        if (arg0 != 58) {
            this.field6927 = -52;
        }
        ++field6948;
        return false;
    }
}
