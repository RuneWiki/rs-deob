import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class353 extends class391 {

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    private int field4822 = 0;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "Lpp;")
    private class267 field4812 = new class267();

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "S")
    public static short field4820 = 256;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 4)
    public final void method1951(byte arg0) {
        ++field4815;
        if (arg0 <= -114) {
            while (~super.field5472 != ~super.field5468) {
                this.method1954(117);
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lsd;B)V", line = 21)
    public final void method1952(class61 arg0, byte arg1) {
        if (arg1 > 116) {
            super.field5470[super.field5468] = 20;
            ++field4813;
            super.field5473[super.field5468] = arg0;
            ++super.field5468;
            if (super.field5468 >= 5000) {
                super.field5468 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V", line = 37)
    public final void method1953(int arg0, int arg1) {
        if (arg1 != 255) {
            this.method1958(-110, false);
        }
        ++field4821;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V", line = 47)
    private final void method1954(int arg0) {
        ++field4816;
        int var2 = super.field5472++;
        if (~super.field5472 <= -5001) {
            super.field5472 = 0;
        }
        this.field4822 = super.field5470[var2];
        int var3 = 25 % ((arg0 - 57) / 60);
        Object var4 = super.field5473[var2];
        super.field5473[var2] = null;
        if (this.field4822 == 21) {
            class263.method1519(this.field4812, (class61) var4);
        } else if (this.field4822 != 20) {
            if (~this.field4822 <= -31 && this.field4822 <= 33) {
                class344.field4741.method440(3000.0F, super.field5466[var2] * 1.5F);
                ((class35) var4).method229(class192.field2742, class141.field2010, class231.field3212, class39.field529, this.field4822 + -30 == 0);
            } else if (this.field4822 >= 40 && this.field4822 <= 43) {
                class344.field4741.method440(3000.0F, super.field5466[var2] * 1.5F);
                ((class35) var4).method229(class192.field2742, class141.field2010, class231.field3212, class103.field1410, this.field4822 - 40 == 0);
            } else if (this.field4822 == 22) {
                class344.field4741.method502(-1, 1583160, 40, 127);
            } else {
                if (this.field4822 != 23) {
                    if (~this.field4822 == -25) {
                        class344.field4741.method490(0, (class432[]) null);
                        return;
                    }
                } else {
                    class344.field4741.method510();
                }
            }
        } else {
            class61 var5 = (class61) var4;
            if (var5.field814 != null) {
                var5.field814.method400(-110, class344.field4741);
            }
            if (var5.field832 != null) {
                var5.field832.method400(-112, class344.field4741);
            }
            if (var5.field825 != null) {
                var5.field825.method400(78, class344.field4741);
            }
            if (var5.field816 != null) {
                var5.field816.method400(67, class344.field4741);
            }
            if (var5.field824 != null) {
                var5.field824.method400(-114, class344.field4741);
            }
            for (class302 var6 = var5.field819; var6 != null; var6 = var6.field4140) {
                var6.field4136.method400(-64, class344.field4741);
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 139)
    public final void method1955(int arg0) {
        ++field4823;
        if (arg0 != 255) {
            this.method1953(20, 27);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILsd;)V", line = 151)
    public final void method1956(int arg0, class61 arg1) {
        ++field4819;
        if (arg0 > -118) {
            this.field4812 = null;
        }
        super.field5470[super.field5468] = 21;
        super.field5473[super.field5468] = arg1;
        ++super.field5468;
        if (super.field5468 >= 5000) {
            super.field5468 = 0;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZLsd;)V", line = 168)
    public final void method1957(boolean arg0, class61 arg1) {
        --super.field5472;
        ++field4818;
        if (super.field5472 < 0) {
            super.field5472 = 4999;
        }
        if (arg0) {
            super.field5470[super.field5472] = 21;
            super.field5473[super.field5472] = arg1;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)V", line = 186)
    public final void method1958(int arg0, boolean arg1) {
        ++field4814;
        super.field5470[super.field5468] = (byte) arg0;
        ++super.field5468;
        if (super.field5468 >= 5000) {
            super.field5468 = 0;
        }
        if (arg1) {
            field4820 = 125;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZLna;FII)V", line = 202)
    public final void method1959(boolean arg0, class35 arg1, float arg2, int arg3, int arg4) {
        if (arg3 <= 56) {
            this.field4822 = -49;
        }
        super.field5470[super.field5468] = (byte) (arg0 ? arg4 + 40 : arg4 + 30);
        ++field4817;
        super.field5473[super.field5468] = arg1;
        super.field5466[super.field5468] = arg2;
        ++super.field5468;
        if (super.field5468 >= 5000) {
            super.field5468 = 0;
        }
    }
}
