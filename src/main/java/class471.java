import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class471 extends class243 {

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    private int field6570 = 0;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "Lvp;")
    private class172 field6572 = new class172();

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "Loh;")
    public static class368 field6575 = new class368();

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "Lpr;")
    public static class407 field6579 = new class407(13, -2);

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
    public static int field6580 = 0;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZLne;)V", line = 4)
    public final void method1406(boolean arg0, class287 arg1) {
        if (!arg0) {
            this.method1408(99, (class287) null);
        }
        ++field6576;
        --super.field3150;
        if (super.field3150 < 0) {
            super.field3150 = 4999;
        }
        super.field3148[super.field3150] = 21;
        super.field3149[super.field3150] = arg1;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V", line = 21)
    public final void method1407(int arg0, int arg1) {
        ++field6569;
        if (arg1 != 3) {
            this.method2672(-18);
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V", line = 31)
    private final void method2672(int arg0) {
        ++field6567;
        int var2 = super.field3150++;
        if (~super.field3150 <= -5001) {
            super.field3150 = 0;
        }
        this.field6570 = super.field3148[var2];
        Object var3 = super.field3149[var2];
        super.field3149[var2] = null;
        if (~this.field6570 != -22) {
            if (~this.field6570 != -21) {
                if (~this.field6570 <= -31 && ~this.field6570 >= -34) {
                    ((class137) var3).method245(class325.field4238, class75.field789, class658.field9390, class581.field8258, ~(this.field6570 + -30) == -1);
                } else if (~this.field6570 <= -41 && ~this.field6570 >= -44) {
                    ((class137) var3).method245(class325.field4238, class75.field789, class658.field9390, class321.field4164, ~(this.field6570 + -40) == -1);
                } else if (this.field6570 != 22) {
                    if (~this.field6570 != -24) {
                        if (~this.field6570 == -25) {
                            class618.field8703.method355(0, (class463[]) null);
                        }
                    } else {
                        class618.field8703.method339();
                    }
                } else {
                    class618.field8703.method278(-1, 1583160, 40, 127);
                }
            } else {
                class287 var4 = (class287) var3;
                if (var4.field3697 != null) {
                    var4.field3697.method451(class618.field8703, 31055);
                }
                if (var4.field3690 != null) {
                    var4.field3690.method451(class618.field8703, arg0 + 31056);
                }
                if (var4.field3678 != null) {
                    var4.field3678.method451(class618.field8703, arg0 ^ -31056);
                }
                if (var4.field3677 != null) {
                    var4.field3677.method451(class618.field8703, arg0 ^ -31056);
                }
                if (var4.field3686 != null) {
                    var4.field3686.method451(class618.field8703, 31055);
                }
                for (class60 var5 = var4.field3680; var5 != null; var5 = var5.field623) {
                    var5.field625.method451(class618.field8703, 31055);
                }
            }
        } else {
            class397.method2175(this.field6572, (class287) var3);
        }
        if (arg0 != -1) {
            field6579 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ld;IZI)V", line = 129)
    public final void method1411(class137 arg0, int arg1, boolean arg2, int arg3) {
        ++field6573;
        super.field3148[super.field3155] = (byte) (arg2 ? arg3 + 40 : arg3 + 30);
        super.field3149[super.field3155] = arg0;
        if (arg1 != -3172) {
            field6575 = null;
        }
        ++super.field3155;
        if (~super.field3155 <= -5001) {
            super.field3155 = 0;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 145)
    public final void method1412(byte arg0) {
        ++field6574;
        int var2 = 103 / ((17 - arg0) / 45);
        while (super.field3155 != super.field3150) {
            this.method2672(-1);
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)V", line = 158)
    public final void method1413(int arg0, int arg1) {
        super.field3148[super.field3155] = (byte) arg1;
        ++field6578;
        if (arg0 != -8076) {
            this.method1406(false, (class287) null);
        }
        ++super.field3155;
        if (~super.field3155 <= -5001) {
            super.field3155 = 0;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILne;)V", line = 177)
    public final void method1408(int arg0, class287 arg1) {
        super.field3148[super.field3155] = 20;
        ++field6571;
        super.field3149[super.field3155] = arg1;
        ++super.field3155;
        if (super.field3155 >= 5000) {
            super.field3155 = 0;
        }
        if (arg0 != 0) {
            this.method1407(110, -60);
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)V", line = 193)
    public static void method2673(byte arg0) {
        field6575 = null;
        if (arg0 == 22) {
            field6579 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 205)
    public final void method1405(int arg0) {
        if (arg0 > -117) {
            field6575 = null;
        }
        ++field6568;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIILas;)V", line = 217)
    public static final void method2674(int arg0, int arg1, int arg2, int arg3, class139 arg4) {
        class287 var5 = class396.method2161(arg0, arg1, arg2);
        if (var5 != null) {
            int var6 = 0;
            arg4.field1595 = (arg1 << class8.field70) + class389.field5194;
            arg4.field1596 = arg3;
            arg4.field1589 = (arg2 << class8.field70) + class389.field5194;
            for (class60 var7 = var5.field3680; var7 != null; var7 = var7.field623) {
                if (var7.field625.field4649) {
                    int var8 = var7.field625.method740(109);
                    if (var8 != -32768 && var8 < var6) {
                        var6 = var8;
                    }
                }
            }
            if (var6 < 0) {
                arg4.field1596 += var6;
                arg4.field1591 = true;
            } else if (var5.field3686 != null) {
                arg4.field1596 -= var5.field3686.field4474;
            }
            var5.field3687 = arg4;
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(ILne;)V", line = 269)
    public final void method1409(int arg0, class287 arg1) {
        super.field3148[super.field3155] = 21;
        ++field6577;
        super.field3149[super.field3155] = arg1;
        ++super.field3155;
        if (arg0 != 0) {
            this.method1408(12, (class287) null);
        }
        if (~super.field3155 <= -5001) {
            super.field3155 = 0;
        }
    }
}
