import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class668 extends class207 {

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Lmw;")
    public static class517 field8952 = new class517(88, -1);

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field8950;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field8951;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field8954;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field8957;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public final void method37(int arg0) {
        ++field8951;
        if (super.field2668.method2248(false) == class743.field10050) {
            if (super.field2668.method2254(41)) {
                super.field2669 = 0;
            }
        } else {
            super.field2669 = 1;
        }
        int var2 = -85 % ((arg0 - -58) / 48);
        if (~super.field2669 != -1 && super.field2669 != 1) {
            super.field2669 = this.method36(-35);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)V")
    public final void method41(int arg0, byte arg1) {
        if (arg1 > -7) {
            field8952 = null;
        }
        super.field2669 = arg0;
        ++field8950;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)Z")
    public final boolean method3683(byte arg0) {
        ++field8949;
        if (arg0 != 8) {
            field8952 = null;
        }
        if (super.field2668.method2254(85)) {
            return false;
        } else {
            return super.field2668.method2248(false) == class743.field10050;
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
    public static void method3684(int arg0) {
        if (arg0 >= 38) {
            field8952 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lrd;)V")
    public class668(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(IB)I")
    public final int method39(int arg0, byte arg1) {
        if (arg1 != 69) {
            return -12;
        } else {
            ++field8954;
            if (super.field2668.method2254(arg1 + 35)) {
                return 3;
            } else if (super.field2668.method2248(false) == class743.field10050) {
                if (arg0 == 0) {
                    if (~super.field2668.field5171.method3709(43) == -2) {
                        return 2;
                    }
                    if (super.field2668.field5167.method1438(43) == 1) {
                        return 2;
                    }
                    if (~super.field2668.field5188.method2377(43) < -1) {
                        return 2;
                    }
                }
                return 1;
            } else {
                return 3;
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILha;IBIII)Lka;")
    public static final class497 method3685(int arg0, class66 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field8953;
        if (arg3 >= -77) {
            field8952 = null;
        }
        long var7 = (long) arg0;
        class497 var9 = (class497) class408.field5772.method3109((byte) 117, var7);
        short var10 = 2055;
        if (var9 == null) {
            class625 var11 = class180.method1226(arg0, class768.field10581, 0, true);
            if (var11 == null) {
                return null;
            }
            if (~var11.field8456 > -14) {
                var11.method3460(2, -112);
            }
            var9 = arg1.method484(var11, var10, class4.field28, 64, 768);
            class408.field5772.method3108(var7, 16337, var9);
        }
        class497 var12 = var9.method271((byte) 2, var10, true);
        if (arg4 != 0) {
            var12.method256(arg4);
        }
        if (arg2 != 0) {
            var12.method293(arg2);
        }
        if (~arg6 != -1) {
            var12.method290(arg6);
        }
        if (~arg5 != -1) {
            var12.method266(0, arg5, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)I")
    public final int method3686(int arg0) {
        if (arg0 != 43) {
            return -55;
        } else {
            ++field8955;
            return super.field2669;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[B)Lnba;")
    public static final class315 method3687(int arg0, byte[] arg1) {
        ++field8956;
        class315 var2 = new class315();
        class254 var3 = new class254(arg1);
        var3.field3725 = var3.field3789.length - 2;
        int var4 = var3.method1728((byte) 86);
        int var5 = var3.field3789.length + -2 - var4 + -16;
        var3.field3725 = var5;
        int var6 = var3.method1672(-16516);
        var2.field4441 = var3.method1728((byte) 76);
        var2.field4435 = var3.method1728((byte) 90);
        var2.field4440 = var3.method1728((byte) 40);
        var2.field4453 = var3.method1728((byte) 127);
        var2.field4445 = var3.method1728((byte) 77);
        var2.field4437 = var3.method1728((byte) 108);
        int var7 = var3.method1731((byte) 64);
        if (~var7 < -1) {
            var2.field4451 = new class184[var7];
            for (int var8 = 0; var8 < var7; ++var8) {
                int var9 = var3.method1728((byte) 53);
                class184 var10 = new class184(class8.method45(arg0 + 23693, var9));
                var2.field4451[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method1672(-16516);
                    int var12 = var3.method1672(-16516);
                    var10.method1247(4070, (long) var11, new class445(var12));
                }
            }
        }
        var3.field3725 = 0;
        var2.field4450 = var3.method1694(arg0 ^ arg0);
        var2.field4446 = new int[var6];
        int var13 = 0;
        while (~var5 < ~var3.field3725) {
            int var14 = var3.method1728((byte) 101);
            if (~var14 == -4) {
                if (var2.field4439 == null) {
                    var2.field4439 = new String[var6];
                }
                var2.field4439[var13] = var3.method1699(-79).intern();
            } else if (var14 == 54) {
                if (var2.field4448 == null) {
                    var2.field4448 = new long[var6];
                }
                var2.field4448[var13] = var3.method1723(class250.method1635(arg0, 21814));
            } else {
                if (var2.field4444 == null) {
                    var2.field4444 = new int[var6];
                }
                if (var14 < 150 && var14 != 21 && ~var14 != -39 && ~var14 != -40) {
                    var2.field4444[var13] = var3.method1672(class250.method1635(arg0, -16535));
                } else {
                    var2.field4444[var13] = var3.method1731((byte) 64);
                }
            }
            var2.field4446[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)I")
    public final int method36(int arg0) {
        ++field8957;
        if (arg0 >= -14) {
            field8952 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(ILrd;)V")
    public class668(int arg0, class355 arg1) {
        super(arg0, arg1);
    }
}
