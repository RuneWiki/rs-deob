import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class163 extends class141 implements class18 {

    @OriginalMember(owner = "client!an", name = "T", descriptor = "Lop;")
    public class262 field2278;

    @OriginalMember(owner = "client!an", name = "E", descriptor = "Z")
    private boolean field2263;

    @OriginalMember(owner = "client!an", name = "K", descriptor = "Lwl;")
    public static class452 field2269 = new class452(62, 7);

    @OriginalMember(owner = "client!an", name = "R", descriptor = "I")
    public static int field2276 = 0;

    @OriginalMember(owner = "client!an", name = "A", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!an", name = "B", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!an", name = "C", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!an", name = "D", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!an", name = "F", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!an", name = "G", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!an", name = "H", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!an", name = "I", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!an", name = "J", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!an", name = "L", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!an", name = "M", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!an", name = "N", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!an", name = "O", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!an", name = "P", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!an", name = "Q", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!an", name = "S", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!an", name = "y", descriptor = "Liq;")
    public static class134 field2257;

    @OriginalMember(owner = "client!an", name = "z", descriptor = "Liq;")
    public static class134 field2258;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(B)V")
    public final void method116(byte arg0) {
        if (arg0 > -45) {
            this.method11(57);
        }
        ++field2267;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(Z)Z")
    public final boolean method112(boolean arg0) {
        if (!arg0) {
            method984(100);
        }
        ++field2260;
        return false;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Ldr;IB)Lwp;")
    public final class292 method12(class261 arg0, int arg1, byte arg2) {
        int var4 = -127 % ((46 - arg2) / 47);
        ++field2270;
        return this.field2278.method1630(0, false, false, arg0, 89, arg1, 0);
    }

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(Ldr;I)Lkq;")
    public final class70 method10(class261 arg0, int arg1) {
        ++field2259;
        class292 var3 = this.field2278.method1630(super.field1892, false, true, arg0, 100, 1024, super.field1900);
        if (var3 == null) {
            return null;
        } else {
            class361 var4 = arg0.method434();
            var4.method611(super.field1900, super.field1888, super.field1892);
            if (arg1 != 7) {
                return null;
            } else {
                class70 var5 = null;
                if (this.field2263) {
                    var5 = class383.method2309(125, 1);
                }
                if (this.field2278.field3989 == null) {
                    var3.method1282(var4, var5 != null ? var5.field899[0] : null, 0);
                } else {
                    class439 var6 = this.field2278.field3989.method2050();
                    arg0.method369(var3, var6, var4, var5 != null ? var5.field899[0] : null, 0);
                }
                this.field2278.method1623(super.field1895, super.field1890, super.field1901, var3, (byte) 109, super.field1889, arg0, true);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)Z")
    public final boolean method1(int arg0) {
        ++field2277;
        int var2 = -25 / ((arg0 - -1) / 46);
        return this.field2278.method1626(-27318);
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(Z)I")
    public final int method120(boolean arg0) {
        if (arg0) {
            this.method15((class261) null, 51);
        }
        ++field2264;
        return this.field2278.method1631(-120);
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V")
    public final void method11(int arg0) {
        ++field2272;
        if (arg0 != -21910) {
            this.method3((byte) 47);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZILla;IIILdr;)V")
    public final void method117(boolean arg0, int arg1, class269 arg2, int arg3, int arg4, int arg5, class261 arg6) {
        ++field2262;
        if (arg1 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IILdr;I)Z")
    public final boolean method4(int arg0, int arg1, class261 arg2, int arg3) {
        ++field2266;
        class292 var5 = this.field2278.method1630(super.field1892, false, false, arg2, 112, 65536, super.field1900);
        if (arg3 != 2) {
            return false;
        } else if (var5 == null) {
            return false;
        } else {
            class361 var6 = arg2.method434();
            var6.method611(super.field1900, super.field1888, super.field1892);
            return var5.method1297(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)I")
    public final int method3(byte arg0) {
        if (arg0 > -3) {
            field2276 = 69;
        }
        ++field2268;
        return this.field2278.field4005;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)I")
    public final int method7(boolean arg0) {
        ++field2275;
        if (!arg0) {
            this.method11(89);
        }
        return this.field2278.field3998;
    }

    @OriginalMember(owner = "client!an", name = "g", descriptor = "(I)V")
    public static final void method983(int arg0) {
        if (arg0 != 28) {
            method984(111);
        }
        ++field2273;
        int var1 = 0;
        if (class451.field6650) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
        }
        class86.method561(var1, false);
        class85.method551(var1, 958);
        class186.field2796.method1110((byte) -122, var1);
        class109.method671(var1, arg0 ^ 10);
        class219.method1335((byte) -117, var1);
        class333.method2040((byte) -109, var1);
        class437.method2683(var1, (byte) -39);
        class174.method1069(arg0 + -28, var1);
        class188.method1141(55, var1);
        if (class19.field263 != 10) {
            if (class19.field263 == 30) {
                class316.method1929(false, 25);
                return;
            }
        } else {
            class316.method1929(false, 28);
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Ldr;Lfq;IIIIIIIZIIIII)V")
    public class163(class261 arg0, class85 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, ~arg1.field1181 == -2, class281.method1730(arg3, arg2, (byte) -86));
        this.field2278 = new class262(arg0, arg1, arg2, arg3, super.field1902, arg5, arg6, arg8, arg9, arg14);
        this.field2263 = arg1.field1184 != 0 && !arg9;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)I")
    public final int method9(int arg0) {
        if (arg0 < 26) {
            this.method15((class261) null, -95);
        }
        ++field2265;
        return this.field2278.field3985;
    }

    @OriginalMember(owner = "client!an", name = "h", descriptor = "(I)V")
    public static void method984(int arg0) {
        field2257 = null;
        field2258 = null;
        field2269 = null;
        if (arg0 != 4) {
            field2276 = -126;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BLdr;)V")
    public final void method2(byte arg0, class261 arg1) {
        if (arg0 != 76) {
            this.method9(-111);
        }
        this.field2278.method1628(arg1, (byte) -46);
        ++field2271;
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(Ldr;I)V")
    public final void method15(class261 arg0, int arg1) {
        if (arg1 <= 114) {
            this.method11(89);
        }
        ++field2274;
        class292 var3 = this.field2278.method1630(super.field1892, true, true, arg0, 101, 131072, super.field1900);
        if (var3 != null) {
            this.field2278.method1623(super.field1895, super.field1890, super.field1901, var3, (byte) 4, super.field1889, arg0, false);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Ldr;I)V")
    public final void method6(class261 arg0, int arg1) {
        ++field2261;
        this.field2278.method1633(true, arg0);
        if (arg1 > -68) {
            method984(109);
        }
    }

    static {
        new class151((String) null, "die kürzlich gesprochen oder gehandelt haben.", (String) null, (String) null);
    }
}
