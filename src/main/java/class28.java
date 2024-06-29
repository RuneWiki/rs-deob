import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class28 {

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "F")
    public float field525 = 1.0F;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "F")
    public float field531 = 1.0F;

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "F")
    public float field538 = 0.25F;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
    public int field535;

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
    public int field537;

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "F")
    public float field521;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "Len;")
    public class339 field527;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    public int field526;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "F")
    public float field519;

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "F")
    public float field534;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "Lfja;")
    public static class783 field518 = new class783(51, 10);

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
    public static int field536 = 0;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)V", line = 4)
    public static final void method180(int arg0, int arg1) {
        if (arg1 > 12) {
            field523++;
            class281 var2 = class54.method395((byte) -53, (long) arg0, 16);
            var2.method1818((byte) 122);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lir;I)Z", line = 18)
    public final boolean method181(class28 arg0, int arg1) {
        field528++;
        if (arg1 != -24031) {
            method185(-119, -12, -106, (byte) 73);
        }
        return this.field524 == arg0.field524 && this.field521 == arg0.field521 && this.field519 == arg0.field519 && this.field534 == arg0.field534 && this.field538 == arg0.field538 && this.field531 == arg0.field531 && this.field525 == arg0.field525 && this.field532 == arg0.field532 && this.field537 == arg0.field537 && this.field527 == arg0.field527;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lfca;B)V", line = 29)
    public final void method182(class93 arg0, byte arg1) {
        this.field531 = (float) (arg0.method793((byte) 5) * 8) / 255.0F;
        field533++;
        this.field538 = (float) (arg0.method793((byte) 73) * 8) / 255.0F;
        int var3 = -78 / ((arg1 + 11) / 40);
        this.field525 = (float) (arg0.method793((byte) 57) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIIIIII)Z", line = 48)
    public static final boolean method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 != -1803607479) {
            field518 = null;
        }
        field529++;
        if ((arg1 + arg7) > arg3 && arg3 + arg4 > arg1) {
            return (arg0 + arg2) > arg5 && arg5 + arg8 > arg2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V", line = 201)
    public class28() {
        this.field535 = -50;
        this.field537 = 0;
        this.field532 = class625.field8718;
        this.field521 = 1.1523438F;
        this.field527 = class346.field4666;
        this.field526 = -50;
        this.field522 = -60;
        this.field519 = 0.69921875F;
        this.field534 = 1.2F;
        this.field524 = client.field4353;
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lfca;)V", line = 217)
    public class28(class93 arg0) {
        int var2 = arg0.method793((byte) 93);
        if (class111.field1911.field6749.method2258((byte) 60) == 1 && class205.field3095.method493() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field524 = client.field4353;
            } else {
                this.field524 = arg0.method773(3);
            }
            if ((var2 & 0x2) == 0) {
                this.field521 = 1.1523438F;
            } else {
                this.field521 = (float) arg0.method763(-37) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field519 = 0.69921875F;
            } else {
                this.field519 = (float) arg0.method763(-80) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field534 = 1.2F;
            } else {
                this.field534 = (float) arg0.method763(-73) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method773(3);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method763(-71);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method763(86);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method763(-110);
            }
            this.field524 = client.field4353;
            this.field519 = 0.69921875F;
            this.field534 = 1.2F;
            this.field521 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field526 = -50;
            this.field522 = -60;
            this.field535 = -50;
        } else {
            this.field535 = arg0.method774(-4);
            this.field522 = arg0.method774(-4);
            this.field526 = arg0.method774(-4);
        }
        if ((var2 & 0x20) == 0) {
            this.field532 = class625.field8718;
        } else {
            this.field532 = arg0.method773(3);
        }
        if ((var2 & 0x40) == 0) {
            this.field537 = 0;
        } else {
            this.field537 = arg0.method763(-78);
        }
        if ((var2 & 0x80) == 0) {
            this.field527 = class346.field4666;
        } else {
            int var3 = arg0.method763(-12);
            int var4 = arg0.method763(99);
            int var5 = arg0.method763(-1);
            int var6 = arg0.method763(-19);
            int var7 = arg0.method763(5);
            int var8 = arg0.method763(92);
            this.field527 = class347.method2147(var8, 124, var6, var7, var3, var4, var5);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V", line = 74)
    public static void method184(byte arg0) {
        if (arg0 >= -104) {
            method185(-13, 13, 9, (byte) -20);
        }
        field518 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIB)V", line = 86)
    public static final void method185(int arg0, int arg1, int arg2, byte arg3) {
        field520++;
        int var4 = arg0 + class217.field3198;
        int var5 = class400.field5510 + arg1;
        if (class325.field4448 == null || arg0 < 0 || arg1 < 0 || arg0 >= class483.field6515 || arg1 >= class65.field926 || class111.field1911.field6734.method3639((byte) 104) == 0 && class235.field3379.field7391 != arg2) {
            return;
        }
        long var6 = (long) (arg2 << 28 | var5 << 14 | var4);
        class234 var8 = (class234) class214.field3181.method337(var6, arg3 ^ 0xFFFFFF96);
        if (var8 == null) {
            class88.method698(arg2, arg0, arg1);
            return;
        }
        class348 var9 = (class348) var8.field3367.method3589((byte) -128);
        if (var9 == null) {
            class88.method698(arg2, arg0, arg1);
            return;
        }
        class205 var10 = (class205) class88.method698(arg2, arg0, arg1);
        if (var10 == null) {
            var10 = new class205(arg0 << 9, class745.field10286[arg2].method1897((byte) -34, arg1, arg0), arg1 << 9, arg2, arg2);
        } else {
            var10.field3083 = var10.field3101 = -1;
        }
        var10.field3087 = var9.field4694;
        var10.field3094 = var9.field4693;
        label61: while (true) {
            class348 var11 = (class348) var8.field3367.method3591(0);
            if (var11 == null) {
                break;
            }
            if (var10.field3087 != var11.field4694) {
                var10.field3083 = var11.field4694;
                var10.field3096 = var11.field4693;
                while (true) {
                    class348 var12 = (class348) var8.field3367.method3591(0);
                    if (var12 == null) {
                        break label61;
                    }
                    if (var10.field3087 != var12.field4694 && var10.field3083 != var12.field4694) {
                        var10.field3101 = var12.field4694;
                        var10.field3102 = var12.field4693;
                    }
                }
            }
        }
        int var13 = class309.method1973(arg3 + 15461, (arg0 << 9) + 256, (arg1 << 9) + 256, arg2);
        var10.field7404 = (byte) arg2;
        if (arg3 != -105) {
            method183(-80, -55, -88, -55, -31, 68, 119, 118, 0);
        }
        var10.field7391 = (byte) arg2;
        var10.field3091 = 0;
        var10.field7405 = var13;
        var10.field7398 = arg1 << 9;
        var10.field7396 = arg0 << 9;
        if (class61.method425(arg1, 16340, arg0)) {
            var10.field7404++;
        }
        class337.method2111(arg2, arg0, arg1, var13, var10);
    }
}
