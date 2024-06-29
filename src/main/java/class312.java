import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class312 extends class169 {

    @OriginalMember(owner = "client!kp", name = "w", descriptor = "I")
    private int field4412 = 0;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "Lqc;")
    private class483 field4406 = new class483();

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "Lwf;")
    public static class79 field4408 = new class79(56, -1);

    @OriginalMember(owner = "client!kp", name = "A", descriptor = "[I")
    public static int[] field4416 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!kp", name = "B", descriptor = "Lwf;")
    public static class79 field4417 = new class79(61, 1);

    @OriginalMember(owner = "client!kp", name = "C", descriptor = "Lvp;")
    public static class112 field4418 = new class112("", 14);

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!kp", name = "v", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!kp", name = "x", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!kp", name = "y", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)V")
    public final void method1052(int arg0, int arg1) {
        if (arg0 != 1) {
            field4417 = null;
        }
        super.field2468[super.field2469] = (byte) arg1;
        ++field4404;
        ++super.field2469;
        if (~super.field2469 <= -5001) {
            super.field2469 = 0;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IBZ)V")
    public static final void method1926(int arg0, byte arg1, boolean arg2) {
        ++field4415;
        class456 var3 = class264.method1626(0, arg0, arg2);
        if (var3 != null) {
            if (arg1 == -53) {
                var3.method1510((byte) -13);
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILct;)V")
    public final void method1050(int arg0, class88 arg1) {
        ++field4402;
        super.field2468[super.field2469] = 21;
        super.field2466[super.field2469] = arg1;
        if (arg0 != 0) {
            this.method1052(55, -54);
        }
        ++super.field2469;
        if (~super.field2469 <= -5001) {
            super.field2469 = 0;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IFLpl;ZI)V")
    public final void method1043(int arg0, float arg1, class426 arg2, boolean arg3, int arg4) {
        ++field4413;
        super.field2468[super.field2469] = (byte) (arg3 ? arg0 + 40 : arg0 + 30);
        super.field2466[super.field2469] = arg2;
        super.field2472[super.field2469] = arg1;
        if (arg4 != 1) {
            method1927(false);
        }
        ++super.field2469;
        if (super.field2469 >= 5000) {
            super.field2469 = 0;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V")
    public static void method1927(boolean arg0) {
        if (!arg0) {
            field4418 = null;
        }
        field4416 = null;
        field4418 = null;
        field4408 = null;
        field4417 = null;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BI)V")
    public final void method1046(byte arg0, int arg1) {
        ++field4410;
        if (arg0 != -8) {
            this.method1052(50, 23);
        }
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V")
    private final void method1928(int arg0) {
        ++field4403;
        int var2 = super.field2467++;
        if (~super.field2467 <= -5001) {
            super.field2467 = 0;
        }
        this.field4412 = super.field2468[var2];
        if (arg0 == 14) {
            Object var3 = super.field2466[var2];
            super.field2466[var2] = null;
            if (~this.field4412 == -22) {
                class424.method2491(this.field4406, (class88) var3);
            } else if (~this.field4412 != -21) {
                if (this.field4412 >= 30 && this.field4412 <= 33) {
                    class456.field6417.method686(3000.0F, super.field2472[var2] * 1.5F);
                    ((class426) var3).method1221(class58.field770, class214.field3218, class36.field463, class386.field5483, this.field4412 + -30 == 0);
                } else if (~this.field4412 <= -41 && this.field4412 <= 43) {
                    class456.field6417.method686(3000.0F, super.field2472[var2] * 1.5F);
                    ((class426) var3).method1221(class58.field770, class214.field3218, class36.field463, class271.field3950, this.field4412 + -40 == 0);
                } else if (this.field4412 == 22) {
                    class456.field6417.method613(-1, 1583160, 40, 127);
                } else {
                    if (this.field4412 != 23) {
                        if (~this.field4412 == -25) {
                            class456.field6417.method637(0, (class178[]) null);
                            return;
                        }
                    } else {
                        class456.field6417.method675();
                    }
                }
            } else {
                class88 var4 = (class88) var3;
                if (var4.field1078 != null) {
                    var4.field1078.method103(class456.field6417, (byte) -115);
                }
                if (var4.field1082 != null) {
                    var4.field1082.method103(class456.field6417, (byte) -122);
                }
                if (var4.field1087 != null) {
                    var4.field1087.method103(class456.field6417, (byte) -127);
                }
                if (var4.field1066 != null) {
                    var4.field1066.method103(class456.field6417, (byte) -108);
                }
                if (var4.field1070 != null) {
                    var4.field1070.method103(class456.field6417, (byte) -99);
                }
                for (class93 var5 = var4.field1068; var5 != null; var5 = var5.field1178) {
                    var5.field1177.method103(class456.field6417, (byte) -121);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BILrp;)Ljava/lang/String;")
    public static final String method1929(byte arg0, int arg1, class276 arg2) {
        ++field4405;
        try {
            int var3 = arg2.method1712(-1);
            if (var3 > arg1) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field4021 += class431.field6044.method1892(arg2.field4064, 27864, var4, arg2.field4021, var3, 0);
            if (arg0 != -127) {
                method1929((byte) -43, 115, (class276) null);
            }
            return class128.method806(var3, var4, arg0 + -17237, 0);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
    public final void method1048(byte arg0) {
        ++field4414;
        if (arg0 != 62) {
            this.method1045((class88) null, 94);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
    public final void method1047(int arg0) {
        int var2 = 0 % ((25 - arg0) / 56);
        ++field4411;
        while (~super.field2469 != ~super.field2467) {
            this.method1928(14);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BLct;)V")
    public final void method1049(byte arg0, class88 arg1) {
        if (arg0 != 121) {
            this.field4412 = 25;
        }
        super.field2468[super.field2469] = 20;
        ++field4407;
        super.field2466[super.field2469] = arg1;
        ++super.field2469;
        if (~super.field2469 <= -5001) {
            super.field2469 = 0;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lct;I)V")
    public final void method1045(class88 arg0, int arg1) {
        ++field4409;
        if (arg1 != 10389) {
            field4418 = null;
        }
        --super.field2467;
        if (~super.field2467 > -1) {
            super.field2467 = 4999;
        }
        super.field2468[super.field2467] = 21;
        super.field2466[super.field2467] = arg0;
    }
}
