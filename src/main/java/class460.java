import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class460 extends class337 {

    @OriginalMember(owner = "client!rs", name = "s", descriptor = "I")
    private int field6788 = 0;

    @OriginalMember(owner = "client!rs", name = "v", descriptor = "Lat;")
    private class255 field6791 = new class255();

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "Lcv;")
    public static class398 field6787 = new class398(8);

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!rs", name = "t", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!rs", name = "u", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!rs", name = "w", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!rs", name = "x", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!rs", name = "y", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!rs", name = "A", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!rs", name = "C", descriptor = "Lhh;")
    public static class84 field6798;

    @OriginalMember(owner = "client!rs", name = "B", descriptor = "[I")
    public static int[] field6797;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "([[IB)V")
    public static final void method2755(int[][] arg0, byte arg1) {
        ++field6789;
        if (arg1 >= 18) {
            class436.field6332 = arg0;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)V")
    public final void method2212(boolean arg0) {
        ++field6795;
        if (arg0) {
            method2758(9);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
    public final void method2209(byte arg0) {
        while (super.field5147 != super.field5143) {
            this.method2757((byte) -98);
        }
        ++field6794;
        if (arg0 > -123) {
            this.field6788 = 52;
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(Lkf;I)V")
    public final void method2205(class165 arg0, int arg1) {
        super.field5150[super.field5147] = 21;
        ++field6796;
        if (arg1 <= 33) {
            this.method2211((class165) null, (byte) 40);
        }
        super.field5151[super.field5147] = arg0;
        ++super.field5147;
        if (~super.field5147 <= -5001) {
            super.field5147 = 0;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZI)V")
    public final void method2207(boolean arg0, int arg1) {
        ++field6783;
        if (arg0) {
            this.method2207(false, 63);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method2756(String arg0, boolean arg1) {
        if (arg1) {
            method2756((String) null, false);
        }
        class64.method569(2, 0, arg0, 0, "", "");
        ++field6784;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZ)V")
    public final void method2208(int arg0, boolean arg1) {
        super.field5150[super.field5147] = (byte) arg0;
        ++field6792;
        ++super.field5147;
        if (~super.field5147 <= -5001) {
            super.field5147 = 0;
        }
        if (!arg1) {
            this.method2212(false);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lkf;B)V")
    public final void method2211(class165 arg0, byte arg1) {
        ++field6786;
        super.field5150[super.field5147] = 20;
        super.field5151[super.field5147] = arg0;
        if (arg1 < -99) {
            ++super.field5147;
            if (super.field5147 >= 5000) {
                super.field5147 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lkf;I)V")
    public final void method2204(class165 arg0, int arg1) {
        --super.field5143;
        ++field6793;
        if (super.field5143 < arg1) {
            super.field5143 = 4999;
        }
        super.field5150[super.field5143] = 21;
        super.field5151[super.field5143] = arg0;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V")
    private final void method2757(byte arg0) {
        ++field6785;
        int var2 = -98 / ((arg0 - 34) / 63);
        int var3 = super.field5143++;
        if (~super.field5143 <= -5001) {
            super.field5143 = 0;
        }
        this.field6788 = super.field5150[var3];
        Object var4 = super.field5151[var3];
        super.field5151[var3] = null;
        if (~this.field6788 == -22) {
            class363.method2331(this.field6791, (class165) var4);
        } else if (~this.field6788 != -21) {
            if (~this.field6788 <= -31 && this.field6788 <= 33) {
                class44.field675.method514(3000.0F, super.field5141[var3] * 1.5F);
                ((class35) var4).method283(class97.field1574, class105.field1653, class117.field1846, class298.field4257, this.field6788 + -30 == 0);
            } else if (~this.field6788 <= -41 && ~this.field6788 >= -44) {
                class44.field675.method514(3000.0F, super.field5141[var3] * 1.5F);
                ((class35) var4).method283(class97.field1574, class105.field1653, class117.field1846, class342.field5220, this.field6788 + -40 == 0);
            } else if (~this.field6788 == -23) {
                class44.field675.method502(-1, 1583160, 40, 127);
            } else {
                if (this.field6788 != 23) {
                    if (this.field6788 == 24) {
                        class44.field675.method464(0, (class131[]) null);
                        return;
                    }
                } else {
                    class44.field675.method501();
                }
            }
        } else {
            class165 var5 = (class165) var4;
            if (var5.field2480 != null) {
                var5.field2480.method126(class44.field675, -46);
            }
            if (var5.field2484 != null) {
                var5.field2484.method126(class44.field675, -86);
            }
            if (var5.field2482 != null) {
                var5.field2482.method126(class44.field675, -83);
            }
            if (var5.field2493 != null) {
                var5.field2493.method126(class44.field675, -47);
            }
            if (var5.field2487 != null) {
                var5.field2487.method126(class44.field675, -127);
            }
            for (class525 var6 = var5.field2490; var6 != null; var6 = var6.field7716) {
                var6.field7711.method126(class44.field675, -48);
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZFBLna;I)V")
    public final void method2206(boolean arg0, float arg1, byte arg2, class35 arg3, int arg4) {
        if (arg2 > -73) {
            this.method2207(false, -95);
        }
        super.field5150[super.field5147] = (byte) (!arg0 ? arg4 + 30 : arg4 + 40);
        ++field6790;
        super.field5151[super.field5147] = arg3;
        super.field5141[super.field5147] = arg1;
        ++super.field5147;
        if (super.field5147 >= 5000) {
            super.field5147 = 0;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public static void method2758(int arg0) {
        field6798 = null;
        if (arg0 <= -112) {
            field6787 = null;
            field6797 = null;
        }
    }
}
