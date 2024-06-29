import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class335 {

    @OriginalMember(owner = "client!iw", name = "l", descriptor = "Lut;")
    private class136 field4145 = new class136();

    @OriginalMember(owner = "client!iw", name = "k", descriptor = "I")
    private int field4144;

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "I")
    private int field4136;

    @OriginalMember(owner = "client!iw", name = "n", descriptor = "Ldj;")
    private class362 field4147;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!iw", name = "h", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!iw", name = "i", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!iw", name = "j", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!iw", name = "m", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!iw", name = "o", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!iw", name = "p", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)I")
    public final int method1977(byte arg0) {
        field4142++;
        if (arg0 >= -23) {
            method1988(101, (byte) 80);
        }
        return this.field4144;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZLwe;)Ljava/lang/Object;")
    public final Object method1978(boolean arg0, class428 arg1) {
        field4141++;
        long var3 = arg1.method2030(-16497);
        if (arg0) {
            this.method1982(false);
        }
        for (class611 var5 = (class611) this.field4147.method2121(126, var3); var5 != null; var5 = (class611) this.field4147.method2118(0)) {
            if (var5.field8196.method2029(22536, arg1)) {
                Object var6 = var5.method788(14);
                if (var6 != null) {
                    if (var5.method790(14)) {
                        class85 var7 = new class85(arg1, var6, var5.field8197);
                        this.field4147.method2112(var7, (byte) 6, var5.field4809);
                        this.field4145.method1005(-38, var7);
                        var7.field1894 = 0L;
                        var5.method2219(13630);
                        var5.method1088(4);
                    } else {
                        this.field4145.method1005(-57, var5);
                        var5.field1894 = 0L;
                    }
                    return var6;
                }
                var5.method2219(13630);
                var5.method1088(4);
                this.field4136 += var5.field8197;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lwe;B)V")
    private final void method1979(class428 arg0, byte arg1) {
        field4135++;
        long var3 = arg0.method2030(-16497);
        for (class611 var5 = (class611) this.field4147.method2121(70, var3); var5 != null; var5 = (class611) this.field4147.method2118(0)) {
            if (var5.field8196.method2029(22536, arg0)) {
                this.method1986(83, var5);
                break;
            }
        }
        if (arg1 >= -90) {
            method1988(25, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(ILwe;Ljava/lang/Object;)V")
    public final void method1980(int arg0, class428 arg1, Object arg2) {
        this.method1987(0, arg1, arg2, arg0);
        field4146++;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V")
    public static final void method1981(int arg0) {
        field4140++;
        if (arg0 != 5500) {
            method1988(-30, (byte) 17);
        }
        class778.field10744.method1687((byte) 61);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)I")
    public final int method1982(boolean arg0) {
        field4149++;
        if (!arg0) {
            this.field4147 = null;
        }
        return this.field4136;
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)V")
    public final void method1983(int arg0) {
        for (class611 var2 = (class611) this.field4145.method1003((byte) 53); var2 != null; var2 = (class611) this.field4145.method1004(true)) {
            if (var2.method790(14)) {
                var2.method2219(13630);
                var2.method1088(4);
                this.field4136 += var2.field8197;
            }
        }
        int var3 = 91 % ((-arg0 - 31) / 61);
        field4134++;
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(B)V")
    public final void method1984(byte arg0) {
        int var2 = -95 % ((-arg0 - 32) / 54);
        this.field4145.method1000(31335);
        field4139++;
        this.field4147.method2115(0);
        this.field4136 = this.field4144;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(BI)V")
    public final void method1985(byte arg0, int arg1) {
        field4148++;
        int var3 = 120 % ((arg0 - 73) / 51);
        if (class183.field2235 == null) {
            return;
        }
        for (class611 var4 = (class611) this.field4145.method1003((byte) 53); var4 != null; var4 = (class611) this.field4145.method1004(true)) {
            if (var4.method790(14)) {
                if (var4.method788(14) == null) {
                    var4.method2219(13630);
                    var4.method1088(4);
                    this.field4136 += var4.field8197;
                }
            } else if ((long) arg1 < ++var4.field1894) {
                class611 var5 = class183.field2235.method2452(32896, var4);
                this.field4147.method2112(var5, (byte) 6, var4.field4809);
                class670.method3760(50, var4, var5);
                var4.method2219(13630);
                var4.method1088(4);
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(ILpm;)V")
    private final void method1986(int arg0, class611 arg1) {
        if (arg0 < 55) {
            this.method1980(85, null, null);
        }
        if (arg1 != null) {
            arg1.method2219(13630);
            arg1.method1088(4);
            this.field4136 += arg1.field8197;
        }
        field4143++;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(ILwe;Ljava/lang/Object;I)V")
    private final void method1987(int arg0, class428 arg1, Object arg2, int arg3) {
        field4137++;
        if (arg3 > this.field4144) {
            throw new IllegalStateException("s>cs");
        }
        this.method1979(arg1, (byte) -113);
        this.field4136 -= arg3;
        while (this.field4136 < 0) {
            class611 var6 = (class611) this.field4145.method1006(24360);
            this.method1986(99, var6);
        }
        class85 var5 = new class85(arg1, arg2, arg3);
        this.field4147.method2112(var5, (byte) 6, arg1.method2030(-16497));
        this.field4145.method1005(-79, var5);
        var5.field1894 = arg0;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IB)Laea;")
    public static final class56 method1988(int arg0, byte arg1) {
        field4138++;
        int var2 = -81 / ((-arg1 - 27) / 47);
        if (arg0 == 0) {
            return new class413();
        } else if (arg0 == 1) {
            return new class280();
        } else if (arg0 == 2) {
            return new class274();
        } else if (arg0 == 3) {
            return new class619();
        } else if (arg0 == 4) {
            return new class114();
        } else if (arg0 == 5) {
            return new class12();
        } else if (arg0 == 6) {
            return new class327();
        } else if (arg0 == 7) {
            return new class599();
        } else if (arg0 == 8) {
            return new class661();
        } else if (arg0 == 9) {
            return new class429();
        } else if (arg0 == 10) {
            return new class477();
        } else if (arg0 == 11) {
            return new class277();
        } else if (arg0 == 12) {
            return new class520();
        } else if (arg0 == 13) {
            return new class39();
        } else if (arg0 == 14) {
            return new class8();
        } else if (arg0 == 15) {
            return new class695();
        } else if (arg0 == 16) {
            return new class74();
        } else if (arg0 == 17) {
            return new class345();
        } else if (arg0 == 18) {
            return new class641();
        } else if (arg0 == 19) {
            return new class72();
        } else if (arg0 == 20) {
            return new class632();
        } else if (arg0 == 21) {
            return new class789();
        } else if (arg0 == 22) {
            return new class556();
        } else if (arg0 == 23) {
            return new class588();
        } else if (arg0 == 24) {
            return new class399();
        } else if (arg0 == 25) {
            return new class281();
        } else if (arg0 == 26) {
            return new class181();
        } else if (arg0 == 27) {
            return new class386();
        } else if (arg0 == 28) {
            return new class309();
        } else if (arg0 == 29) {
            return new class46();
        } else if (arg0 == 30) {
            return new class634();
        } else if (arg0 == 31) {
            return new class352();
        } else if (arg0 == 32) {
            return new class202();
        } else if (arg0 == 33) {
            return new class271();
        } else if (arg0 == 34) {
            return new class337();
        } else if (arg0 == 35) {
            return new class673();
        } else if (arg0 == 36) {
            return new class761();
        } else if (arg0 == 37) {
            return new class353();
        } else if (arg0 == 38) {
            return new class168();
        } else if (arg0 == 39) {
            return new class438();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(I)V")
    public class335(int arg0) {
        this.field4144 = arg0;
        this.field4136 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field4147 = new class362(var2);
    }
}
