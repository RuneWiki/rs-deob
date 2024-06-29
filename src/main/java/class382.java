import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class382 extends class439 {

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    private int field5219 = 0;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "Lil;")
    private class42 field5223 = new class42();

    @OriginalMember(owner = "client!df", name = "A", descriptor = "Lhq;")
    public static class365 field5232 = new class365(8);

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public static int field5234 = 0;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "Lwo;")
    public static class285 field5227;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "Lwo;")
    public static class285 field5236;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "[S")
    public static short[] field5235;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lsq;I)V")
    public final void method295(class316 arg0, int arg1) {
        --super.field6036;
        if (arg1 != -4802) {
            this.method2383((byte) -89);
        }
        ++field5228;
        if (super.field6036 < 0) {
            super.field6036 = 4999;
        }
        super.field6040[super.field6036] = 21;
        super.field6031[super.field6036] = arg0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLsq;)V")
    public final void method291(byte arg0, class316 arg1) {
        ++field5225;
        super.field6040[super.field6034] = 20;
        super.field6031[super.field6034] = arg1;
        ++super.field6034;
        if (super.field6034 >= 5000) {
            super.field6034 = 0;
        }
        if (arg0 != 7) {
            field5233 = -54;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILsq;)V")
    public final void method282(int arg0, class316 arg1) {
        ++field5230;
        if (arg0 > -5) {
            field5227 = null;
        }
        super.field6040[super.field6034] = 21;
        super.field6031[super.field6034] = arg1;
        ++super.field6034;
        if (super.field6034 >= 5000) {
            super.field6034 = 0;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILki;)V")
    public static final void method2381(int arg0, int arg1, class204 arg2) {
        ++field5218;
        if (arg1 != -129) {
            field5234 = 110;
        }
        int var3 = -1;
        int var4 = 0;
        if (~class106.field1273 > ~arg2.field2454) {
            class247.method1618(arg1 ^ 155, arg2);
        } else if (arg2.field2446 >= class106.field1273) {
            class437.method2666(31220, arg2);
        } else {
            class303.method1924(arg2, false, (byte) 59);
            var3 = class397.field5393;
            var4 = class325.field4335;
        }
        if (arg2.field1516 < 128 || ~arg2.field1514 > -129 || arg2.field1516 >= (class22.field232 + -1) * 128 || class196.field2329 * 128 + -128 <= arg2.field1514) {
            arg2.field2400 = -1;
            arg2.field2446 = 0;
            arg2.field2454 = 0;
            arg2.field2467 = -1;
            arg2.field1516 = arg2.field2480[0] * 128 + arg2.method841(true) * 64;
            arg2.field1514 = arg2.field2482[0] * 128 + arg2.method841(true) * 64;
            arg2.method1257((byte) 43);
        }
        if (class143.field1684 == arg2 && (arg2.field1516 < 1536 || ~arg2.field1514 > -1537 || ~(class22.field232 * 128 + -1536) >= ~arg2.field1516 || class196.field2329 * 128 + -1536 <= arg2.field1514)) {
            arg2.field2454 = 0;
            arg2.field2400 = -1;
            arg2.field2446 = 0;
            arg2.field2467 = -1;
            arg2.field1516 = arg2.field2480[0] * 128 + arg2.method841(true) * 64;
            arg2.field1514 = arg2.field2482[0] * 128 - -(arg2.method841(true) * 64);
            arg2.method1257((byte) 43);
        }
        int var5 = class299.method1900(arg2, (byte) 107);
        class229.method1433(arg1 ^ 10091, var3, var4, arg2, var5);
        class87.method539(-4279, arg2);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZLip;FZI)V")
    public final void method283(boolean arg0, class279 arg1, float arg2, boolean arg3, int arg4) {
        super.field6040[super.field6034] = (byte) (!arg3 ? arg4 + 30 : arg4 + 40);
        ++field5229;
        if (!arg0) {
            super.field6031[super.field6034] = arg1;
            super.field6038[super.field6034] = arg2;
            ++super.field6034;
            if (super.field6034 >= 5000) {
                super.field6034 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
    public final void method294(int arg0, int arg1) {
        if (arg1 == 0) {
            ++field5220;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)V")
    public final void method298(int arg0, int arg1) {
        ++field5224;
        super.field6040[super.field6034] = (byte) arg1;
        if (arg0 > 15) {
            ++super.field6034;
            if (~super.field6034 <= -5001) {
                super.field6034 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public final void method297(int arg0) {
        ++field5231;
        if (arg0 != 20883) {
            field5235 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static void method2382(int arg0) {
        field5236 = null;
        if (arg0 > 25) {
            field5235 = null;
            field5232 = null;
            field5227 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
    public final void method286(byte arg0) {
        ++field5221;
        while (super.field6036 != super.field6034) {
            this.method2383((byte) 112);
        }
        if (arg0 < 3) {
            method2384(15);
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V")
    private final void method2383(byte arg0) {
        ++field5226;
        int var2 = super.field6036;
        if (arg0 > 103) {
            ++super.field6036;
            if (~super.field6036 <= -5001) {
                super.field6036 = 0;
            }
            this.field5219 = super.field6040[var2];
            Object var3 = super.field6031[var2];
            super.field6031[var2] = null;
            if (~this.field5219 == -22) {
                class137.method884(this.field5223, (class316) var3);
            } else if (~this.field5219 != -21) {
                if (~this.field5219 <= -31 && this.field5219 <= 33) {
                    class131.field1498.method773(3000.0F, super.field6038[var2] * 1.5F);
                    ((class279) var3).method1046(class325.field4341, class121.field1381, class347.field4720, class140.field1628, this.field5219 + -30 == 0);
                } else if (this.field5219 >= 40 && this.field5219 <= 43) {
                    class131.field1498.method773(3000.0F, super.field6038[var2] * 1.5F);
                    ((class279) var3).method1046(class325.field4341, class121.field1381, class347.field4720, class446.field6218, this.field5219 + -40 == 0);
                } else if (~this.field5219 != -23) {
                    if (this.field5219 != 23) {
                        if (~this.field5219 == -25) {
                            class131.field1498.method784(0, (class92[]) null);
                            return;
                        }
                    } else {
                        class131.field1498.method710();
                    }
                } else {
                    class131.field1498.method686(-1, 1583160, 40);
                }
            } else {
                class316 var4 = (class316) var3;
                if (var4.field4268 != null) {
                    var4.field4268.method138((byte) 93, class131.field1498);
                }
                if (var4.field4269 != null) {
                    var4.field4269.method138((byte) 79, class131.field1498);
                }
                if (var4.field4259 != null) {
                    var4.field4259.method138((byte) 113, class131.field1498);
                }
                if (var4.field4266 != null) {
                    var4.field4266.method138((byte) 123, class131.field1498);
                }
                if (var4.field4255 != null) {
                    var4.field4255.method138((byte) 95, class131.field1498);
                }
                for (class272 var5 = var4.field4256; var5 != null; var5 = var5.field3514) {
                    var5.field3512.method138((byte) 84, class131.field1498);
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
    public static final void method2384(int arg0) {
        ++field5222;
        if (class94.field1105 != 2) {
            if (arg0 <= 123) {
                field5235 = null;
            }
            try {
                class443.method2743(class346.field4701, -24425, "tbrefresh");
            } catch (Throwable var1) {
            }
        }
    }
}
