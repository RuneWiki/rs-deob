import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class385 extends class292 {

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    private int field5422;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
    private int field5418;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "I")
    private int field5423;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    private int field5416;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
    private int field5408;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    private int field5409;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    private int field5413;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "I")
    private int field5417;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "[B")
    private byte[] field5419;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "[Lss;")
    public static class295[] field5412;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "[[[Lsd;")
    public static class61[][][] field5410;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BII)V")
    public final void method1670(byte arg0, int arg1, int arg2) {
        field5420++;
        if (arg1 == 0) {
            this.field5408 = this.field5422 - (arg2 >= 0 ? arg2 : -arg2);
            this.field5408 = this.field5408 * this.field5408 >> 12;
            this.field5417 = 4096;
            this.field5409 = this.field5408;
        } else {
            this.field5417 = this.field5418 * this.field5408 >> 12;
            this.field5408 = this.field5422 - (arg2 < 0 ? -arg2 : arg2);
            if (this.field5417 < 0) {
                this.field5417 = 0;
            } else if (this.field5417 > 4096) {
                this.field5417 = 4096;
            }
            this.field5408 = this.field5408 * this.field5408 >> 12;
            this.field5408 = this.field5417 * this.field5408 >> 12;
            this.field5409 += this.field5416 * this.field5408 >> 12;
            this.field5416 = this.field5423 * this.field5416 >> 12;
        }
        if (arg0 < 32) {
            this.method1670((byte) -82, 50, 101);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
    public static final void method2209(byte arg0) {
        field5414++;
        class150.method952((byte) -92, class292.field3914);
        class185.field2583++;
        if (class492.field7271 && class23.field378) {
            int var1 = class332.field4528.method54(104);
            int var2 = class332.field4528.method55((byte) -47);
            int var3 = var1 - class119.field1629;
            if (arg0 != -46) {
                field5412 = null;
            }
            int var4 = var2 - class278.field3763;
            if (class49.field667 > var3) {
                var3 = class49.field667;
            }
            if ((var3 + class292.field3914.field4022) > (class49.field667 + class177.field2509.field4022)) {
                var3 = class49.field667 + class177.field2509.field4022 - class292.field3914.field4022;
            }
            if (class191.field2690 > var4) {
                var4 = class191.field2690;
            }
            if ((class292.field3914.field3960 + var4) > (class191.field2690 + class177.field2509.field3960)) {
                var4 = class191.field2690 + class177.field2509.field3960 - class292.field3914.field3960;
            }
            int var5 = class177.field2509.field3968 + var3 - class49.field667;
            int var6 = var4 + class177.field2509.field3977 - class191.field2690;
            if (class332.field4528.method49((byte) -120)) {
                if (class185.field2583 > class292.field3914.field3954) {
                    int var8 = var3 - class311.field4259;
                    int var9 = var4 - class245.field3419;
                    if (var8 > class292.field3914.field3986 || var8 < -class292.field3914.field3986 || class292.field3914.field3986 < var9 || -class292.field3914.field3986 > var9) {
                        class153.field2174 = true;
                    }
                }
                if (class292.field3914.field4077 != null && class153.field2174) {
                    class44 var10 = new class44();
                    var10.field606 = var6;
                    var10.field607 = var5;
                    var10.field613 = class292.field3914;
                    var10.field612 = class292.field3914.field4077;
                    class475.method2798(var10);
                }
            } else {
                if (class153.field2174) {
                    class370.method2145(arg0 + 45);
                    if (class292.field3914.field4038 != null) {
                        class44 var7 = new class44();
                        var7.field613 = class292.field3914;
                        var7.field607 = var5;
                        var7.field610 = class452.field6524;
                        var7.field612 = class292.field3914.field4038;
                        var7.field606 = var6;
                        class475.method2798(var7);
                    }
                    if (class452.field6524 != null && client.method1199(class292.field3914) != null) {
                        class46.method289(class452.field6524, class292.field3914, (byte) -115);
                    }
                } else if ((class17.field186 == 1 || class239.method1386(-101)) && class370.field5198 > 2) {
                    class420.method2514(class278.field3763 + class245.field3419, arg0 ^ 0xFFFFFFB6, class311.field4259 + class119.field1629);
                } else if (class329.method1829((byte) 113)) {
                    class420.method2514(class278.field3763 + class245.field3419, arg0 ^ 0xFFFFFFB4, class311.field4259 + class119.field1629);
                }
                class292.field3914 = null;
            }
        } else if (class185.field2583 > 1) {
            class292.field3914 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V")
    public final void method1671(int arg0) {
        int var2 = -23 / ((-arg0 - 64) / 46);
        field5424++;
        this.field5413 = 0;
        this.field5409 = 0;
    }

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "(I)V")
    public static void method2210(int arg0) {
        field5412 = null;
        int var1 = -53 % ((arg0 - 12) / 50);
        field5410 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
    public static final Object method2211(byte[] arg0, boolean arg1, int arg2) {
        field5415++;
        if (arg0 == null) {
            return null;
        }
        if (arg2 != 17341) {
            method2212((byte) -127, 110, 120, -17, -99, -120);
        }
        if (arg0.length > 136 && !class346.field4747) {
            try {
                class277 var3 = (class277) Class.forName("af").getDeclaredConstructor().newInstance();
                var3.method1567(arg0, (byte) 60);
                return var3;
            } catch (Throwable var4) {
                class346.field4747 = true;
            }
        }
        return arg1 ? class393.method2250(0, arg0) : arg0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BIIIII)V")
    public static final void method2212(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5421++;
        if (arg0 != -106) {
            field5412 = null;
        }
        for (int var6 = arg4; var6 <= arg3; var6++) {
            class419.method2511(class225.field3174[var6], arg5, arg2, arg1, 76);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)Z")
    public static final boolean method2213(int arg0, int arg1) {
        if (arg0 >= -90) {
            field5412 = null;
        }
        field5407++;
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
    public final void method1669(int arg0) {
        field5406++;
        this.field5409 >>= 0x4;
        if (arg0 != -28971) {
            this.field5409 = 98;
        }
        this.field5416 = this.field5423;
        if (this.field5409 < 0) {
            this.field5409 = 0;
        } else if (this.field5409 > 255) {
            this.field5409 = 255;
        }
        this.method1026((byte) this.field5409, 100, this.field5413++);
        this.field5409 = 0;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class385(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field5422 = (int) (arg6 * 4096.0F);
        this.field5418 = (int) (arg7 * 4096.0F);
        this.field5416 = this.field5423 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(BII)V")
    public void method1026(byte arg0, int arg1, int arg2) {
        this.field5419[arg2] = arg0;
        if (arg1 == 100) {
            field5425++;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIZIII)V")
    public static final void method2214(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class34.field485 = arg1;
        class226.field3179 = arg6;
        class463.field6721 = arg4;
        class13.field151 = arg0;
        field5411++;
        if (arg2 > -31) {
            method2210(-54);
        }
        class350.field4790 = arg5;
        if (arg3 && class13.field151 >= 100) {
            class132.field1901 = class350.field4790 * 128 + 64;
            class310.field4240 = class34.field485 * 128 + 64;
            class526.field7729 = class186.method1118(class132.field1901, class310.field4240, 12840, class400.field5571) - class463.field6721;
        }
        class128.field1742 = 2;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(III)Z")
    public static final boolean method2215(int arg0, int arg1, int arg2) {
        field5405++;
        if (arg2 != 540800) {
            field5412 = null;
        }
        return (arg1 & 0x84080) != 0;
    }
}
