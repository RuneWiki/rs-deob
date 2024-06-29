import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class270 extends class10 implements class54 {

    @OriginalMember(owner = "client!u", name = "v", descriptor = "Z")
    private boolean field4260 = false;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    private int field4257 = 50;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "Lkb;")
    private class39 field4255;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "Lkb;")
    private class39 field4272;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "Lpm;")
    private class111 field4268;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "Lpm;")
    private class111 field4278;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "S")
    public static short field4263 = 256;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "Lok;")
    public static class160 field4284;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(II)Z", line = 4)
    public final boolean method380(int arg0, int arg1) {
        if (arg1 != -23908) {
            this.method377((byte) -55, -83);
        }
        field4273++;
        return this.method60(arg0, (byte) -94).field45;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(BI)I", line = 17)
    public final int method377(byte arg0, int arg1) {
        field4266++;
        return arg0 <= 83 ? -86 : this.method60(arg1, (byte) 82).field33 & 0xFF;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 33)
    public static void method1924(int arg0) {
        field4284 = null;
        if (arg0 != 0) {
            field4263 = -124;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZ)V", line = 43)
    public final void method1925(boolean arg0, boolean arg1) {
        field4283++;
        this.field4260 = arg0;
        this.method1926(123);
        if (!arg1) {
            this.method371(-115, -4);
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(IB)I", line = 58)
    public final int method382(int arg0, byte arg1) {
        int var3 = 94 % ((1 - arg1) / 60);
        field4277++;
        return this.method60(arg0, (byte) -23).field27 & 0xFF;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(II)Z", line = 68)
    public final boolean method374(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method378(-0.03103007F, 33, 60);
        }
        field4261++;
        return !this.method60(arg1, (byte) -74).field41;
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(II)I", line = 79)
    public final int method384(int arg0, int arg1) {
        if (arg0 == 255) {
            field4259++;
            return this.method60(arg1, (byte) 103).field29 & 0xFF;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(II)Z", line = 91)
    public final boolean method373(int arg0, int arg1) {
        class223 var3 = this.method1931((byte) -47, arg0);
        int var4 = -110 % ((48 - arg1) / 63);
        field4270++;
        return var3 == null ? false : var3.method1628(this, this.field4272);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V", line = 105)
    public final void method1926(int arg0) {
        this.field4268.method765(false);
        field4254++;
        if (this.field4278 != null) {
            this.field4278.method765(false);
        }
        class223.field3561 = null;
        int var2 = -87 % ((84 - arg0) / 38);
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(II)V", line = 120)
    public final void method381(int arg0, int arg1) {
        int var3 = 46 % ((arg0 - 19) / 57);
        this.method385(this.field4260 || this.method60(arg1, (byte) 105).field30 ? 64 : 128, arg1, 27314);
        field4275++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 130)
    public static final String method1927(String arg0, byte arg1, String arg2, String arg3) {
        field4280++;
        int var4 = arg3.length();
        int var5 = arg0.length();
        int var6 = arg2.length();
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var7 = var4;
        int var8 = var6 - var5;
        if (var8 != 0) {
            int var9 = 0;
            while (true) {
                int var10 = arg3.indexOf(arg0, var9);
                if (var10 < 0) {
                    break;
                }
                var9 = var5 + var10;
                var7 += var8;
            }
        }
        StringBuffer var11 = new StringBuffer(var7);
        int var12 = 0;
        while (true) {
            int var13 = arg3.indexOf(arg0, var12);
            if (var13 < 0) {
                var11.append(arg3.substring(var12));
                if (arg1 != -106) {
                    method1927((String) null, (byte) 41, (String) null, (String) null);
                }
                return var11.toString();
            }
            var11.append(arg3.substring(var12, var13));
            var11.append(arg2);
            var12 = var5 + var13;
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(BI)V", line = 189)
    public final void method1928(byte arg0, int arg1) {
        field4274++;
        this.field4257 = arg1;
        this.field4268 = new class111(this.field4257);
        if (arg0 != 103) {
            return;
        }
        if (class186.field2991) {
            this.field4278 = new class111(this.field4257);
        } else {
            this.field4278 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZIFII)Ln;", line = 214)
    public final class298 method372(boolean arg0, int arg1, float arg2, int arg3, int arg4) {
        class223 var6 = this.method1931((byte) -54, arg3);
        field4256++;
        if (arg4 < 105) {
            return (class298) null;
        } else if (var6 != null && var6.method1628(this, this.field4272)) {
            return arg0 ? var6.field3549.method2332(arg1, arg1, false, this, (double) arg2, 23323, this.field4272) : var6.field3549.method2333(arg1, false, this, arg1, this.field4272, (double) arg2, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(IB)Z", line = 234)
    public final boolean method383(int arg0, byte arg1) {
        field4282++;
        if (arg1 >= -68) {
            this.method380(94, 10);
        }
        return this.field4260 || this.method60(arg0, (byte) -23).field30;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lsh;IIIIZI)Lug;", line = 249)
    public static final class321 method1929(class303 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field4281++;
        int var8 = (arg3 << 17) + (arg4 << 19) + arg2 + (arg5 ? 65536 : 0);
        if (arg1 <= 4) {
            method1924(-111);
        }
        long var9 = (long) arg6 * 3147483667L + (long) var8 * 3849834839L;
        class321 var11 = (class321) class218.field3503.method1619(var9, 48);
        if (var11 != null) {
            return var11;
        }
        class25.field356 = false;
        class321 var12 = class4.method18(120, arg6, false, arg3, false, arg2, arg5, arg0, arg4);
        if (var12 != null && !class25.field356) {
            class218.field3503.method1621(var9, 80, var12);
        }
        return var12;
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(BI)Lda;", line = 278)
    private final class129 method1930(byte arg0, int arg1) {
        field4253++;
        class129 var3 = (class129) this.field4278.method768((long) arg1, false);
        if (var3 == null) {
            int var4 = 1 / ((-arg0 - 33) / 51);
            class129 var5 = new class129(this.method60(arg1, (byte) 84).field28 & 0xFFFF);
            this.field4278.method770(var5, 0, (long) arg1);
            return var5;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V", line = 296)
    public final void method385(int arg0, int arg1, int arg2) {
        class188.method1328(this.method60(arg1, (byte) -21).field29 & 0xFF, this.method60(arg1, (byte) 111).field27 & 0xFF, (byte) 126);
        field4271++;
        boolean var4 = false;
        if (arg2 != 27314) {
            this.field4255 = (class39) null;
        }
        class223 var5 = this.method1931((byte) -65, arg1);
        if (var5 != null) {
            var4 = var5.method1629(this, this.field4272, arg0);
        }
        if (!var4) {
            class129 var6 = this.method1930((byte) 112, arg1);
            var6.method885(false);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[I", line = 325)
    public final int[] method371(int arg0, int arg1) {
        field4264++;
        if (arg0 <= 3) {
            this.field4255 = (class39) null;
        }
        class223 var3 = this.method1931((byte) -102, arg1);
        return var3 == null ? null : var3.method1631(this, this.field4272, this.field4260 || this.method60(arg1, (byte) -82).field30);
    }

    @OriginalMember(owner = "client!u", name = "i", descriptor = "(II)Lef;", line = 348)
    public final class339 method57(int arg0, int arg1) {
        class223 var3 = this.method1931((byte) -95, arg0);
        field4276++;
        if (arg1 == 0) {
            return var3 == null ? null : var3.field3549;
        } else {
            return (class339) null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(FII)[I", line = 360)
    public final int[] method378(float arg0, int arg1, int arg2) {
        field4269++;
        if (arg2 != 15101) {
            return (int[]) null;
        }
        class223 var4 = this.method1931((byte) -35, arg1);
        if (var4 == null) {
            return null;
        } else {
            var4.field3554 = true;
            return var4.method1630(this, this.field4272, arg0, this.field4260 || this.method60(arg1, (byte) -127).field30);
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lkb;Lkb;Lkb;IZ)V", line = 380)
    public class270(class39 arg0, class39 arg1, class39 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field4255 = arg0;
        this.field4257 = arg3;
        this.field4260 = arg4;
        this.field4272 = arg2;
        this.field4268 = new class111(this.field4257);
        if (class186.field2991) {
            this.field4278 = new class111(this.field4257);
        } else {
            this.field4278 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(BI)Lia;", line = 406)
    private final class223 method1931(byte arg0, int arg1) {
        field4279++;
        if (arg0 >= -26) {
            return (class223) null;
        }
        class223 var3 = (class223) this.field4268.method768((long) arg1, false);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field4255.method250(true, arg1, 0);
        if (var4 == null) {
            return null;
        } else {
            class223 var5 = new class223(new class192(var4));
            this.field4268.method770(var5, 0, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(II)Z", line = 433)
    public final boolean method379(int arg0, int arg1) {
        int var3 = 65 % ((-arg1 - 21) / 53);
        field4262++;
        return this.method60(arg0, (byte) -36).field34;
    }

    @OriginalMember(owner = "client!u", name = "j", descriptor = "(II)V", line = 442)
    public final void method1932(int arg0, int arg1) {
        field4267++;
        if (arg1 != 0) {
            this.method373(72, 82);
        }
        for (class223 var3 = (class223) this.field4268.method769(32292); var3 != null; var3 = (class223) this.field4268.method767(-2405)) {
            if (var3.field3554) {
                var3.method1626(arg0);
                var3.field3554 = false;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)I", line = 468)
    public final int method376(byte arg0, int arg1) {
        if (arg0 > -118) {
            this.field4260 = true;
        }
        field4265++;
        return this.method60(arg1, (byte) 100).field28 & 0xFFFF;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)I", line = 487)
    public final int method375(int arg0, byte arg1) {
        field4258++;
        if (arg1 > -95) {
            this.field4272 = (class39) null;
        }
        return this.method60(arg0, (byte) -65).field40 & 0xFF;
    }
}
