import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class262 {

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "Lsba;")
    private class200 field4281 = new class200(256);

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "Lsba;")
    private class200 field4288 = new class200(256);

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "Lri;")
    private class97 field4285;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "Lri;")
    private class97 field4287;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "F")
    public static float field4282;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "[Lf;")
    public static class702[] field4278;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(III[I)Lqr;", line = 6)
    private final class59 method1859(int arg0, int arg1, int arg2, int[] arg3) {
        field4286++;
        if (arg0 <= 12) {
            this.method1859(23, 119, 104, null);
        }
        int var5 = (arg1 << 4 & 0xFFF9 | arg1 >>> 12) ^ arg2;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class59 var9 = (class59) this.field4288.method1558(var7, (byte) -93);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class120 var10 = class120.method1073(this.field4287, arg1, arg2);
            if (var10 == null) {
                return null;
            }
            class59 var11 = var10.method1071();
            this.field4288.method1564(var7, var11, (byte) 85);
            if (arg3 != null) {
                arg3[0] -= var11.field762.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 42)
    public static void method1860(int arg0) {
        int var1 = -106 / ((arg0 - 67) / 36);
        field4278 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V", line = 51)
    public static final void method1861(byte arg0) {
        field4276++;
        class500.field7340.method3474(22090);
        if (arg0 <= 42) {
            field4282 = 0.5644778F;
        }
        class154.field2629 = 0;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBI)I", line = 68)
    public static final int method1862(int arg0, byte arg1, int arg2) {
        field4277++;
        if (arg1 <= 0) {
            method1862(-96, (byte) 24, -69);
        }
        return arg2 == 1 || arg2 == 3 ? class669.field9457[arg0 & 0x3] : class391.field6085[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V", line = 89)
    public static final void method1863(int arg0) {
        class362.method2415(-125, class573.field8182);
        field4280++;
        class406.field6259++;
        if (class672.field9479 && client.field4445) {
            int var1 = class464.field6929.method451(1196);
            if (arg0 > -86) {
                method1862(-35, (byte) 5, 4);
            }
            int var2 = class464.field6929.method454(82);
            int var3 = var2 - class426.field6477;
            int var4 = var1 - class589.field8375;
            if (class66.field857 > var4) {
                var4 = class66.field857;
            }
            if (class66.field857 + class409.field6303.field9411 < class573.field8182.field9411 + var4) {
                var4 = class409.field6303.field9411 + class66.field857 - class573.field8182.field9411;
            }
            if (class157.field2692 > var3) {
                var3 = class157.field2692;
            }
            if ((class157.field2692 + class409.field6303.field9282) < (var3 + class573.field8182.field9282)) {
                var3 = class157.field2692 + class409.field6303.field9282 - class573.field8182.field9282;
            }
            int var5 = var4 + class409.field6303.field9393 - class66.field857;
            int var6 = class409.field6303.field9394 + var3 - class157.field2692;
            if (class464.field6929.method3137(-123)) {
                if (class573.field8182.field9364 < class406.field6259) {
                    int var7 = var4 - class102.field1691;
                    int var8 = var3 - class105.field1705;
                    if (class573.field8182.field9273 < var7 || var7 < -class573.field8182.field9273 || class573.field8182.field9273 < var8 || -class573.field8182.field9273 > var8) {
                        class38.field520 = true;
                    }
                }
                if (class573.field8182.field9279 != null && class38.field520) {
                    class438 var9 = new class438();
                    var9.field6684 = class573.field8182.field9279;
                    var9.field6677 = class573.field8182;
                    var9.field6678 = var6;
                    var9.field6670 = var5;
                    class142.method1201(var9);
                    return;
                }
            } else {
                if (class38.field520) {
                    class490.method3001((byte) 122);
                    if (class573.field8182.field9419 != null) {
                        class438 var10 = new class438();
                        var10.field6684 = class573.field8182.field9419;
                        var10.field6676 = class602.field8563;
                        var10.field6678 = var6;
                        var10.field6670 = var5;
                        var10.field6677 = class573.field8182;
                        class142.method1201(var10);
                    }
                    if (class602.field8563 != null && client.method1938(class573.field8182) != null) {
                        class55.method640(class573.field8182, 23009, class602.field8563);
                    }
                } else if ((class14.field198 == 1 || class350.method2355(2544)) && class52.field693 > 2) {
                    class130.method1134((byte) 35, class426.field6477 + class105.field1705, class589.field8375 - -class102.field1691);
                } else if (class397.method2561(true)) {
                    class130.method1134((byte) 35, class426.field6477 + class105.field1705, class589.field8375 + class102.field1691);
                }
                class573.field8182 = null;
            }
        } else if (class406.field6259 > 1) {
            class573.field8182 = null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIZ[I)Lqr;", line = 208)
    private final class59 method1864(int arg0, int arg1, boolean arg2, int[] arg3) {
        field4283++;
        int var5 = arg0 ^ (arg1 >>> 12 | (arg1 & 0x40000FFF) << 4);
        if (!arg2) {
            field4282 = -1.2790991F;
        }
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class59 var9 = (class59) this.field4288.method1558(var7, (byte) -93);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class249 var10 = (class249) this.field4281.method1558(var7, (byte) -93);
            if (var10 == null) {
                var10 = class249.method1773(this.field4285, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field4281.method1564(var7, var10, (byte) 109);
            }
            class59 var11 = var10.method1768(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method707((byte) -81);
                this.field4288.method1564(var7, var11, (byte) 123);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[I)Lqr;", line = 252)
    public final class59 method1865(int arg0, int arg1, int[] arg2) {
        if (arg0 < 20) {
            field4282 = -0.95980066F;
        }
        field4275++;
        if (this.field4285.method917(true) == 1) {
            return this.method1864(arg1, 0, true, arg2);
        } else if (this.field4285.method949(arg1, 0) == 1) {
            return this.method1864(0, arg1, true, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I[IB)Lqr;", line = 283)
    public final class59 method1866(int arg0, int[] arg1, byte arg2) {
        if (arg2 < 45) {
            return null;
        }
        field4284++;
        if (this.field4287.method917(true) == 1) {
            return this.method1859(65, 0, arg0, arg1);
        } else if (this.field4287.method949(arg0, 0) == 1) {
            return this.method1859(19, arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lri;Lri;)V", line = 310)
    public class262(class97 arg0, class97 arg1) {
        this.field4285 = arg1;
        this.field4287 = arg0;
    }
}
