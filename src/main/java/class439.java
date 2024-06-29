import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class439 extends class47 implements class218 {

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "Z")
    private boolean field6198;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "S")
    private short field6203;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "Z")
    private boolean field6191;

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "B")
    private byte field6206;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "B")
    private byte field6213;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "Z")
    private boolean field6210;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "Z")
    private boolean field6205;

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "Lns;")
    private class57 field6202;

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "Lfq;")
    private class87 field6221;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "Lsh;")
    public static class472 field6201 = new class472(48, 1);

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ltq;I)V", line = 5)
    public final void method258(class63 arg0, int arg1) {
        ++field6193;
        Object var3 = null;
        if (arg1 != -22360) {
            this.field6213 = -124;
        }
        class87 var5;
        if (this.field6221 == null && this.field6205) {
            class447 var4 = this.method2555(111, 131072, arg0, true);
            var5 = var4 != null ? var4.field6337 : null;
        } else {
            var5 = this.field6221;
            this.field6221 = null;
        }
        if (var5 != null) {
            class299.method1868(var5, this.field6206, super.field680, super.field677, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)Z", line = 32)
    public final boolean method253(int arg0) {
        if (arg0 > -9) {
            this.field6202 = null;
        }
        ++field6220;
        return this.field6210;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(Z)I", line = 44)
    public final int method257(boolean arg0) {
        ++field6192;
        if (arg0) {
            this.field6206 = 118;
        }
        return this.field6203 & 65535;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V", line = 55)
    public final void method249(int arg0) {
        if (arg0 > 56) {
            ++field6214;
            this.field6210 = false;
            if (this.field6202 != null) {
                this.field6202.method441(-32769 & this.field6202.method402());
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIIII)V", line = 70)
    public static final void method2551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field6194;
        if (arg4 != -30226) {
            field6201 = null;
        }
        class345.method2127(arg1, (byte) 120, arg2, arg5, arg3, arg8, 0, arg0, arg7, arg6);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ltq;III)Z", line = 87)
    public final boolean method259(class63 arg0, int arg1, int arg2, int arg3) {
        int var5 = -85 / ((-59 - arg2) / 58);
        ++field6195;
        class57 var6 = this.method2557(arg0, -123, 65536);
        if (var6 != null) {
            class315 var7 = arg0.method565();
            var7.method482(super.field680, super.field681, super.field677);
            return var6.method423(arg1, arg3, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Ltq;Lvc;IIIIZIZ)V", line = 111)
    public class439(class63 arg0, class271 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field4042, arg1.field4006);
        this.field6198 = arg6;
        super.field680 = (short) arg3;
        this.field6203 = (short) arg1.field4043;
        this.field6191 = arg1.field4053 != 0 && !arg6;
        this.field6206 = (byte) arg2;
        super.field677 = (short) arg5;
        this.field6213 = (byte) arg7;
        this.field6210 = arg8;
        this.field6205 = arg0.method581() && arg1.field4087 && !this.field6198 && ~class337.field5038.field3952 != -1;
        int var10 = 1024;
        if (this.field6210) {
            var10 |= 32768;
        }
        class447 var11 = this.method2555(-12, var10, arg0, this.field6205);
        if (var11 != null) {
            this.field6202 = var11.field6334;
            this.field6221 = var11.field6337;
            if (this.field6210) {
                this.field6202 = this.field6202.method437((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V", line = 147)
    public static final void method2552(int arg0) {
        ++field6197;
        for (int var1 = 0; class198.field2984 > var1; ++var1) {
            int var10002 = class385.field5696[var1]--;
            if (class385.field5696[var1] >= -10) {
                class54 var4 = class283.field4297[var1];
                if (var4 == null) {
                    var4 = class54.method388(class163.field2261, class78.field1107[var1], 0);
                    if (var4 == null) {
                        continue;
                    }
                    class385.field5696[var1] += var4.method389();
                    class283.field4297[var1] = var4;
                }
                if (class385.field5696[var1] < 0) {
                    int var5;
                    if (class325.field4876[var1] == 0) {
                        var5 = class37.field476[var1] * class337.field5038.field3949 >> 8;
                    } else {
                        int var6 = 3 & class325.field4876[var1] >> 24;
                        if (class472.field6622.field4545 == var6) {
                            int var7 = (255 & class325.field4876[var1]) * 128;
                            int var8 = (16752179 & class325.field4876[var1]) >> 16;
                            int var9 = var8 * 128 + 64 - class472.field6622.field4543;
                            if (var9 < 0) {
                                var9 = -var9;
                            }
                            int var10 = class325.field4876[var1] >> 8 & 255;
                            int var11 = var10 * 128 - (class472.field6622.field4538 + -64);
                            if (~var11 > -1) {
                                var11 = -var11;
                            }
                            int var12 = var9 + -128 + var11;
                            if (var7 < var12) {
                                class385.field5696[var1] = -100;
                                continue;
                            }
                            if (~var12 > -1) {
                                var12 = 0;
                            }
                            var5 = (-var12 + var7) * class337.field5038.field3934 * class37.field476[var1] / var7 >> 8;
                        } else {
                            var5 = 0;
                        }
                    }
                    if (~var5 < -1) {
                        class328 var13 = var4.method390().method2015(class424.field6071);
                        class7 var14 = class7.method77(var13, 100, var5);
                        var14.method59(class419.field6024[var1] + -1);
                        class452.field6419.method2418(var14);
                    }
                    class385.field5696[var1] = -100;
                }
            } else {
                --class198.field2984;
                for (int var3 = var1; ~var3 > ~class198.field2984; ++var3) {
                    class78.field1107[var3] = class78.field1107[var3 + 1];
                    class283.field4297[var3] = class283.field4297[var3 - -1];
                    class419.field6024[var3] = class419.field6024[var3 + 1];
                    class385.field5696[var3] = class385.field5696[var3 + 1];
                    class325.field4876[var3] = class325.field4876[var3 + 1];
                    class37.field476[var3] = class37.field476[var3 - -1];
                }
                --var1;
            }
        }
        int var2 = -85 / ((arg0 - -4) / 59);
        if (class208.field3142 && !class332.method2034((byte) -118)) {
            if (~class337.field5038.field3946 != -1 && ~class487.field6840 != 0) {
                class132.method919(class43.field598, class487.field6840, false, 0, 6481, class337.field5038.field3946);
            }
            class208.field3142 = false;
        } else if (class337.field5038.field3946 != 0 && ~class487.field6840 != 0 && !class332.method2034((byte) -121)) {
            ++class6.field96;
            class378.method2320(class3.field67, (byte) 119);
            class230.field3390.method2596((byte) -110, class487.field6840);
            class487.field6840 = -1;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(Ltq;I)Lcj;", line = 282)
    public final class123 method252(class63 arg0, int arg1) {
        ++field6219;
        if (this.field6202 == null) {
            return null;
        } else {
            if (arg1 != 2) {
                this.field6205 = false;
            }
            class315 var3 = arg0.method565();
            var3.method482(super.field680, super.field681, super.field677);
            class123 var4 = null;
            if (this.field6191) {
                var4 = class225.method1462(1, -22);
            }
            this.field6202.method404(var3, var4 != null ? var4.field1695[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BZLtq;Lhm;III)V", line = 310)
    public final void method245(byte arg0, boolean arg1, class63 arg2, class352 arg3, int arg4, int arg5, int arg6) {
        if (arg3 instanceof class439) {
            class439 var8 = (class439) arg3;
            if (this.field6202 != null && var8.field6202 != null) {
                this.field6202.method447(var8.field6202, arg6, arg4, arg5, arg1);
            }
        }
        if (arg0 <= -41) {
            ++field6208;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;ILre;)I", line = 333)
    public static final int method2553(String arg0, int arg1, class446 arg2) {
        ++field6207;
        int var3 = arg2.field6315;
        byte[] var4 = class384.method2334(12128, arg0);
        arg2.method2639(var4.length, 491265976);
        arg2.field6315 += class174.field2471.method2170(0, arg2.field6316, arg2.field6315, var4.length, -14737, var4);
        int var5 = -45 / ((-59 - arg1) / 35);
        return -var3 + arg2.field6315;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILtq;)V", line = 353)
    public final void method260(int arg0, class63 arg1) {
        if (arg0 != 0) {
            this.field6213 = 100;
        }
        ++field6216;
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V", line = 364)
    public static void method2554(int arg0) {
        if (arg0 != 15851) {
            field6201 = null;
        }
        field6201 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILtq;Z)Lri;", line = 376)
    private final class447 method2555(int arg0, int arg1, class63 arg2, boolean arg3) {
        ++field6218;
        class271 var5 = class206.field3124.method338((byte) 126, this.field6203 & 65535);
        int var6 = -77 % ((arg0 - 53) / 54);
        class48 var7;
        class48 var8;
        if (this.field6198) {
            var7 = class55.field765[this.field6206];
            var8 = class483.field6781[0];
        } else {
            var7 = class483.field6781[this.field6206];
            if (this.field6206 >= 3) {
                var8 = null;
            } else {
                var8 = class483.field6781[this.field6206 + 1];
            }
        }
        return var5.method1773(arg1, super.field677, var7, super.field680, arg2, 22, (byte) -4, arg3, var8, this.field6213, super.field681);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLtq;)V", line = 406)
    public final void method256(byte arg0, class63 arg1) {
        ++field6211;
        Object var3 = null;
        if (arg0 != 82) {
            this.method245((byte) -95, true, (class63) null, (class352) null, -50, -37, -23);
        }
        class87 var5;
        if (this.field6221 == null && this.field6205) {
            class447 var4 = this.method2555(120, 131072, arg1, true);
            var5 = var4 != null ? var4.field6337 : null;
        } else {
            var5 = this.field6221;
            this.field6221 = null;
        }
        if (var5 != null) {
            class373.method2309(var5, this.field6206, super.field680, super.field677, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(Z)V", line = 434)
    public final void method247(boolean arg0) {
        if (arg0) {
            this.field6202 = null;
        }
        ++field6217;
        if (this.field6202 != null) {
            this.field6202.method422();
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)I", line = 451)
    public final int method244(byte arg0) {
        ++field6209;
        if (arg0 >= -8) {
            this.method255((byte) 85, 50, (class63) null);
        }
        return this.field6213;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZLh;)V", line = 463)
    public static final void method2556(boolean arg0, class349 arg1) {
        if (arg0) {
            method2552(-108);
        }
        ++field6200;
        for (class43 var2 = (class43) class131.field1825.method2456(32101); var2 != null; var2 = (class43) class131.field1825.method2461(301)) {
            if (var2.field582 == arg1) {
                if (var2.field580 != null) {
                    class452.field6419.method2415(var2.field580);
                    var2.field580 = null;
                }
                var2.method283(2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)I", line = 496)
    public final int method250(byte arg0) {
        int var2 = -95 / ((arg0 - -49) / 60);
        ++field6212;
        return 22;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)Z", line = 508)
    public final boolean method254(boolean arg0) {
        ++field6204;
        return !arg0 ? false : this.field6205;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ltq;II)Lns;", line = 519)
    private final class57 method2557(class63 arg0, int arg1, int arg2) {
        ++field6199;
        if (this.field6202 != null && ~arg0.method583(this.field6202.method402(), arg2) == -1) {
            return this.field6202;
        } else {
            if (arg1 > -122) {
                this.method245((byte) 11, false, (class63) null, (class352) null, 42, 119, -32);
            }
            class447 var4 = this.method2555(-96, arg2, arg0, false);
            return var4 == null ? null : var4.field6334;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIZ)Ljava/lang/String;", line = 540)
    public static final String method2558(int arg0, int arg1, boolean arg2) {
        ++field6215;
        if (arg0 <= 84) {
            return null;
        } else {
            return arg2 && arg1 >= 0 ? class55.method394(10, arg2, false, arg1) : Integer.toString(arg1);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BILtq;)Lns;", line = 559)
    public final class57 method255(byte arg0, int arg1, class63 arg2) {
        if (arg0 <= 108) {
            method2558(-80, -84, true);
        }
        ++field6190;
        return this.method2557(arg2, -123, arg1);
    }
}
