import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class623 extends class40 {

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "Ldj;")
    public static class703 field8860 = new class703(4, 1, 1, 1);

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "Lufa;")
    public static class740 field8865 = new class740(0, -1);

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
    public static int field8861;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    public static int field8863;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field8864;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "Ljava/lang/Thread;")
    public static Thread field8862;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(BIII)V")
    public static final void method3600(byte arg0, int arg1, int arg2, int arg3) {
        ++field8863;
        int var4 = arg3 - -class41.field693;
        int var5 = class71.field1085 + arg1;
        if (class565.field8185 != null && ~arg3 <= -1 && ~arg1 <= -1 && ~class184.field2546 < ~arg3 && ~arg1 > ~class240.field3555) {
            if (class243.field3580.field8002.method2026(false) != 0 || ~class108.field1536.field3920 == ~arg2) {
                long var6 = (long) (var5 << 14 | arg2 << 28 | var4);
                class340 var8 = (class340) class591.field8409.method4020(var6, (byte) -58);
                if (var8 == null) {
                    class316.method1944(arg2, arg3, arg1);
                } else {
                    class428 var9 = (class428) var8.field4685.method3565(-69);
                    if (var9 == null) {
                        class316.method1944(arg2, arg3, arg1);
                    } else {
                        class227 var10 = (class227) class316.method1944(arg2, arg3, arg1);
                        if (var10 == null) {
                            var10 = new class227(arg3 << 9, class95.field1372[arg2].method2087(72, arg3, arg1), arg1 << 9, arg2, arg2);
                        } else {
                            var10.field3386 = var10.field3398 = -1;
                        }
                        var10.field3388 = var9.field6171;
                        var10.field3394 = var9.field6169;
                        label61: while (true) {
                            class428 var11 = (class428) var8.field4685.method3561((byte) 21);
                            if (var11 == null) {
                                break;
                            }
                            if (~var10.field3394 != ~var11.field6169) {
                                var10.field3383 = var11.field6171;
                                var10.field3386 = var11.field6169;
                                while (true) {
                                    class428 var12 = (class428) var8.field4685.method3561((byte) 69);
                                    if (var12 == null) {
                                        break label61;
                                    }
                                    if (var10.field3394 != var12.field6169 && ~var10.field3386 != ~var12.field6169) {
                                        var10.field3398 = var12.field6169;
                                        var10.field3399 = var12.field6171;
                                    }
                                }
                            }
                        }
                        int var13 = class530.method3211((arg1 << 9) + 256, 2, (arg3 << 9) + 256, arg2);
                        var10.field3924 = (byte) arg2;
                        var10.field3923 = arg3 << 9;
                        var10.field3916 = arg1 << 9;
                        var10.field3392 = 0;
                        var10.field3922 = var13;
                        var10.field3920 = (byte) arg2;
                        if (arg0 > -107) {
                            method3601((class335) null, -90);
                        }
                        if (class547.method3292((byte) -121, arg1, arg3)) {
                            ++var10.field3924;
                        }
                        class37.method192(arg2, arg3, arg1, var13, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(IIIIIF)V")
    public class623(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lcs;I)V")
    public static final void method3601(class335 arg0, int arg1) {
        ++field8866;
        if (arg1 != -27363) {
            method3600((byte) 28, 16, -71, 18);
        }
        if (!(arg0 instanceof class571)) {
            if (arg0 instanceof class639) {
                class639 var2 = (class639) arg0;
                class457.method2786((byte) 119, var2, ~class108.field1536.field3920 != ~var2.field3920);
                return;
            }
        } else {
            class571 var3 = (class571) arg0;
            if (var3.field8235 == null) {
                return;
            }
            class385.method2374(class108.field1536.field3920 != var3.field3920, -1, var3);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(FI)V")
    public final void method424(float arg0, int arg1) {
        ++field8864;
        if (arg1 == -1) {
            super.field685 = arg0;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BIII)V")
    public final void method428(byte arg0, int arg1, int arg2, int arg3) {
        super.field679 = arg2;
        ++field8861;
        super.field688 = arg3;
        super.field678 = arg1;
        int var5 = 34 / ((46 - arg0) / 45);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)V")
    public static void method3602(boolean arg0) {
        field8860 = null;
        if (arg0) {
            field8860 = null;
        }
        field8862 = null;
        field8865 = null;
    }
}
