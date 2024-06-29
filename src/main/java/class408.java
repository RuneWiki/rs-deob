import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class408 {

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Lkp;")
    private class456 field5249 = new class456();

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    private int field5251;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    private int field5241;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Lhd;")
    private class694 field5253;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "[I")
    public static int[] field5240 = new int[1000];

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BILsea;Ljava/lang/Object;)V", line = 3)
    private final void method2286(byte arg0, int arg1, class652 arg2, Object arg3) {
        field5248++;
        if (this.field5251 < arg1) {
            throw new IllegalStateException("s>cs");
        }
        this.method2294(arg2, -26294);
        this.field5241 -= arg1;
        while (this.field5241 < 0) {
            class646 var7 = (class646) this.field5249.method2507((byte) 80);
            this.method2293(var7, (byte) -66);
        }
        int var5 = 67 % ((-arg0 - 16) / 53);
        class364 var6 = new class364(arg2, arg3, arg1);
        this.field5253.method3832(var6, arg2.method869((byte) 97), 74);
        this.field5249.method2504((byte) -90, var6);
        var6.field4648 = 0L;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLsea;)Ljava/lang/Object;", line = 33)
    public final Object method2287(byte arg0, class652 arg1) {
        field5245++;
        long var3 = arg1.method869((byte) 100);
        for (class646 var5 = (class646) this.field5253.method3828(var3, (byte) -91); var5 != null; var5 = (class646) this.field5253.method3829((byte) 93)) {
            if (var5.field8748.method870(false, arg1)) {
                Object var6 = var5.method2115((byte) 106);
                if (var6 != null) {
                    if (var5.method2112(0)) {
                        class364 var7 = new class364(arg1, var6, var5.field8746);
                        this.field5253.method3832(var7, var5.field3321, 94);
                        this.field5249.method2504((byte) -90, var7);
                        var7.field4648 = 0L;
                        var5.method1566(-63);
                        var5.method2110(92);
                    } else {
                        this.field5249.method2504((byte) -116, var5);
                        var5.field4648 = 0L;
                    }
                    return var6;
                }
                var5.method1566(-113);
                var5.method2110(121);
                this.field5241 += var5.field8746;
            }
        }
        if (arg0 > -56) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)I", line = 87)
    public final int method2288(byte arg0) {
        field5244++;
        return arg0 >= -31 ? -25 : this.field5241;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)I", line = 98)
    public final int method2289(byte arg0) {
        field5243++;
        if (arg0 <= 6) {
            method2296(60);
        }
        return this.field5251;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 113)
    public final void method2290(int arg0) {
        field5246++;
        int var2 = -43 % ((-arg0 - 21) / 62);
        this.field5249.method2501(9);
        this.field5253.method3839((byte) -120);
        this.field5241 = this.field5251;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lsea;ILjava/lang/Object;)V", line = 127)
    public final void method2291(class652 arg0, int arg1, Object arg2) {
        this.method2286((byte) -85, 1, arg0, arg2);
        if (arg1 != -16644) {
            this.field5251 = 24;
        }
        field5242++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V", line = 138)
    public final void method2292(int arg0, int arg1) {
        field5252++;
        if (class323.field4028 != null) {
            for (class646 var3 = (class646) this.field5249.method2502(false); var3 != null; var3 = (class646) this.field5249.method2509((byte) -126)) {
                if (var3.method2112(0)) {
                    if (var3.method2115((byte) 122) == null) {
                        var3.method1566(-117);
                        var3.method2110(106);
                        this.field5241 += var3.field8746;
                    }
                } else if (((long) arg1) < (++var3.field4648)) {
                    class646 var4 = class323.field4028.method1902(var3, 512);
                    this.field5253.method3832(var4, var3.field3321, 38);
                    class517.method2804(var4, var3, -121);
                    var3.method1566(-124);
                    var3.method2110(arg0 ^ 0x5CEF);
                }
            }
        }
        if (arg0 != 23682) {
            this.field5241 = 36;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lkb;B)V", line = 186)
    private final void method2293(class646 arg0, byte arg1) {
        if (arg0 != null) {
            arg0.method1566(-117);
            arg0.method2110(100);
            this.field5241 += arg0.field8746;
        }
        field5239++;
        if (arg1 >= -55) {
            this.field5253 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lsea;I)V", line = 206)
    private final void method2294(class652 arg0, int arg1) {
        field5247++;
        long var3 = arg0.method869((byte) 112);
        for (class646 var5 = (class646) this.field5253.method3828(var3, (byte) -91); var5 != null; var5 = (class646) this.field5253.method3829((byte) 64)) {
            if (var5.field8748.method870(false, arg0)) {
                this.method2293(var5, (byte) -74);
                break;
            }
        }
        if (arg1 != -26294) {
            method2296(50);
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V", line = 240)
    public final void method2295(byte arg0) {
        field5250++;
        int var2 = 28 % ((arg0 - 7) / 46);
        for (class646 var3 = (class646) this.field5249.method2502(false); var3 != null; var3 = (class646) this.field5249.method2509((byte) 76)) {
            if (var3.method2112(0)) {
                var3.method1566(-87);
                var3.method2110(123);
                this.field5241 += var3.field8746;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 266)
    public static void method2296(int arg0) {
        field5240 = null;
        if (arg0 > -83) {
            method2296(72);
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I)V", line = 279)
    public class408(int arg0) {
        this.field5251 = arg0;
        this.field5241 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field5253 = new class694(var2);
    }
}
