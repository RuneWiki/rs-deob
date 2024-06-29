import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class320 {

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "Lqj;")
    private class535 field4538 = new class535(128);

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "Lqj;")
    public class535 field4545 = new class535(64);

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "Luq;")
    public class172 field4544;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "Luq;")
    private class172 field4536;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4543 = null;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)V")
    public final void method2067(int arg0, int arg1, int arg2) {
        if (arg0 != -13764) {
            this.field4536 = null;
        }
        field4539++;
        this.field4538 = new class535(arg2);
        this.field4545 = new class535(arg1);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
    public static void method2068(int arg0) {
        field4543 = null;
        if (arg0 >= -111) {
            field4543 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
    public final void method2069(int arg0) {
        class535 var2 = this.field4538;
        synchronized (this.field4538) {
            this.field4538.method3113(-127);
        }
        field4542++;
        class535 var3 = this.field4545;
        synchronized (this.field4545) {
            this.field4545.method3113(-127);
        }
        if (arg0 != 36) {
            this.field4538 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)V")
    public final void method2070(int arg0, int arg1) {
        class535 var3 = this.field4538;
        synchronized (this.field4538) {
            if (arg0 != 1850939296) {
                this.field4538 = null;
            }
            this.field4538.method3101(false, arg1);
        }
        field4540++;
        class535 var4 = this.field4545;
        synchronized (this.field4545) {
            this.field4545.method3101(false, arg1);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILs;)V")
    public static final void method2071(int arg0, class295 arg1) {
        class645.field8694[arg0] = arg1;
    }

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "(I)V")
    public final void method2072(int arg0) {
        field4535++;
        class535 var2 = this.field4538;
        synchronized (this.field4538) {
            this.field4538.method3103(-11294);
            if (arg0 != -4) {
                method2071(27, null);
            }
        }
        class535 var3 = this.field4545;
        synchronized (this.field4545) {
            this.field4545.method3103(-11294);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILtd;)I")
    public static final int method2073(int arg0, class478 arg1) {
        field4537++;
        int var2 = -42 % ((-arg0 - 87) / 32);
        String var3 = class631.method3482(arg1, (byte) 100);
        int[] var4 = null;
        if (class235.method1492(arg1.field6718, 29470)) {
            var4 = class16.field156.method2121((int) arg1.field6719, 25928).field5366;
        } else if (arg1.field6703 != -1) {
            var4 = class16.field156.method2121(arg1.field6703, 25928).field5366;
        } else if (class450.method2678(-49, arg1.field6718)) {
            class316 var7 = (class316) class176.field2326.method1248(110, (long) ((int) arg1.field6719));
            if (var7 != null) {
                class22 var8 = var7.field4455;
                class304 var9 = var8.field217;
                if (var9.field4295 != null) {
                    var9 = var9.method1968(class480.field6740, -1);
                }
                if (var9 != null) {
                    var4 = var9.field4340;
                }
            }
        } else if (class480.method2830(arg1.field6718, true)) {
            Object var5 = null;
            class412 var6;
            if (arg1.field6718 == 1012) {
                var6 = class210.field2705.method1362(0, (int) arg1.field6719);
            } else {
                var6 = class210.field2705.method1362(0, (int) (arg1.field6719 >>> 32 & 0x7FFFFFFFL));
            }
            if (var6.field5919 != null) {
                var6 = var6.method2478(class480.field6740, -1);
            }
            if (var6 != null) {
                var4 = var6.field5920;
            }
        }
        if (var4 != null) {
            var3 = var3 + class493.method2907((byte) 127, var4);
        }
        int var10 = class643.field8657.method3627(var3, class584.field7966, 31033);
        if (arg1.field6706) {
            var10 += class180.field2366.method350() + 4;
        }
        return var10;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(II)Ljs;")
    public final class349 method2074(int arg0, int arg1) {
        field4541++;
        class535 var3 = this.field4538;
        class349 var4;
        synchronized (this.field4538) {
            var4 = (class349) this.field4538.method3109((byte) 111, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field4536;
        byte[] var6;
        synchronized (this.field4536) {
            var6 = this.field4536.method1188(36, -18047, arg1);
        }
        class349 var7 = new class349();
        var7.field5083 = arg1;
        var7.field5089 = this;
        if (var6 != null) {
            var7.method2231(new class254(var6), (byte) -20);
        }
        var7.method2237(false);
        if (arg0 <= 87) {
            method2071(61, null);
        }
        class535 var8 = this.field4538;
        synchronized (this.field4538) {
            this.field4538.method3108((long) arg1, 16337, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lkw;ILuq;Luq;)V")
    public class320(class263 arg0, int arg1, class172 arg2, class172 arg3) {
        this.field4544 = arg3;
        this.field4536 = arg2;
        this.field4536.method1175(36, (byte) 86);
    }
}
