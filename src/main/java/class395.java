import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class395 extends class312 {

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    private int field5653 = 0;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "Lgr;")
    private class249 field5663 = new class249();

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field5654 = 0;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "[I")
    public static int[] field5664 = new int[14];

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "Z")
    public static boolean field5660;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V", line = 4)
    public final void method2011(int arg0, int arg1) {
        ++field5656;
        if (arg0 != -28353) {
            field5658 = 100;
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V", line = 14)
    private final void method2500(int arg0) {
        if (arg0 >= 15) {
            ++field5659;
            int var2 = super.field4264++;
            if (~super.field4264 <= -5001) {
                super.field4264 = 0;
            }
            this.field5653 = super.field4273[var2];
            Object var3 = super.field4266[var2];
            super.field4266[var2] = null;
            if (~this.field5653 != -22) {
                if (~this.field5653 == -21) {
                    class125 var4 = (class125) var3;
                    if (var4.field1756 != null) {
                        var4.field1756.method678(class387.field5557, -22948);
                    }
                    if (var4.field1761 != null) {
                        var4.field1761.method678(class387.field5557, -22948);
                    }
                    if (var4.field1740 != null) {
                        var4.field1740.method678(class387.field5557, -22948);
                    }
                    if (var4.field1750 != null) {
                        var4.field1750.method678(class387.field5557, -22948);
                    }
                    if (var4.field1739 != null) {
                        var4.field1739.method678(class387.field5557, -22948);
                    }
                    for (class123 var5 = var4.field1749; var5 != null; var5 = var5.field1711) {
                        var5.field1709.method678(class387.field5557, -22948);
                    }
                    return;
                }
                if (this.field5653 >= 30 && ~this.field5653 >= -34) {
                    class387.field5557.method80(3000.0F, super.field4269[var2] * 1.5F);
                    ((class242) var3).method731(class357.field4890, class405.field5768, class305.field4213, class194.field2654, ~(this.field5653 + -30) == -1);
                    return;
                }
                if (~this.field5653 <= -41 && ~this.field5653 >= -44) {
                    class387.field5557.method80(3000.0F, super.field4269[var2] * 1.5F);
                    ((class242) var3).method731(class357.field4890, class405.field5768, class305.field4213, class34.field528, ~(this.field5653 + -40) == -1);
                    return;
                }
                if (this.field5653 == 22) {
                    class387.field5557.method111(-1, 1583160, 40);
                    return;
                }
                if (~this.field5653 == -24) {
                    class387.field5557.method43();
                    return;
                }
                if (this.field5653 == 24) {
                    class387.field5557.method113(0, (class24[]) null);
                    return;
                }
            } else {
                class180.method1176(this.field5663, (class125) var3);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjd;)V", line = 104)
    public final void method2009(int arg0, class125 arg1) {
        ++field5652;
        --super.field4264;
        if (arg0 > super.field4264) {
            super.field4264 = 4999;
        }
        super.field4273[super.field4264] = 21;
        super.field4266[super.field4264] = arg1;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V", line = 119)
    public static void method2501(byte arg0) {
        if (arg0 < 90) {
            method2501((byte) -49);
        }
        field5664 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(FILij;ZI)V", line = 131)
    public final void method2008(float arg0, int arg1, class242 arg2, boolean arg3, int arg4) {
        super.field4273[super.field4265] = (byte) (arg3 ? arg1 + 40 : arg1 + 30);
        ++field5650;
        super.field4266[super.field4265] = arg2;
        super.field4269[super.field4265] = arg0;
        ++super.field4265;
        if (super.field4265 >= arg4) {
            super.field4265 = 0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)V", line = 152)
    public final void method2010(byte arg0, int arg1) {
        if (arg0 > -36) {
            method2501((byte) -123);
        }
        ++field5665;
        super.field4273[super.field4265] = (byte) arg1;
        ++super.field4265;
        if (super.field4265 >= 5000) {
            super.field4265 = 0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljd;Z)V", line = 167)
    public final void method2006(class125 arg0, boolean arg1) {
        ++field5655;
        super.field4273[super.field4265] = 21;
        super.field4266[super.field4265] = arg0;
        ++super.field4265;
        if (!arg1) {
            this.method2010((byte) -66, 33);
        }
        if (super.field4265 >= 5000) {
            super.field4265 = 0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 189)
    public final void method2012(boolean arg0) {
        if (!arg0) {
            ++field5651;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 199)
    public final void method2013(int arg0) {
        ++field5662;
        if (arg0 >= -74) {
            this.method2010((byte) 69, 21);
        }
        while (super.field4265 != super.field4264) {
            this.method2500(77);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLjd;)V", line = 220)
    public final void method2007(byte arg0, class125 arg1) {
        ++field5657;
        if (arg0 >= -107) {
            method2501((byte) -10);
        }
        super.field4273[super.field4265] = 20;
        super.field4266[super.field4265] = arg1;
        ++super.field4265;
        if (~super.field4265 <= -5001) {
            super.field4265 = 0;
        }
    }
}
