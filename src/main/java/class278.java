import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class278 extends class377 {

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    private int field3991 = 0;

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "Lpl;")
    private class390 field3996 = new class390();

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "[I")
    public static int[] field4002 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "Ltj;")
    public static class108 field4004;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(FBIZLuh;)V")
    public final void method1911(float arg0, byte arg1, int arg2, boolean arg3, class92 arg4) {
        if (arg1 != -118) {
            this.method1915(-32, (byte) 36);
        }
        ++field3994;
        super.field5374[super.field5370] = (byte) (!arg3 ? arg2 + 30 : arg2 + 40);
        super.field5375[super.field5370] = arg4;
        super.field5372[super.field5370] = arg0;
        ++super.field5370;
        if (super.field5370 >= 5000) {
            super.field5370 = 0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lls;Z)V")
    public final void method1912(class74 arg0, boolean arg1) {
        super.field5374[super.field5370] = 21;
        ++field3993;
        if (arg1) {
            field3990 = 114;
        }
        super.field5375[super.field5370] = arg0;
        ++super.field5370;
        if (~super.field5370 <= -5001) {
            super.field5370 = 0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V")
    public final void method1913(boolean arg0) {
        while (super.field5373 != super.field5370) {
            this.method1920(-44);
        }
        ++field3999;
        if (!arg0) {
            this.method1915(-22, (byte) -33);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lls;B)V")
    public final void method1914(class74 arg0, byte arg1) {
        --super.field5373;
        ++field3995;
        if (arg1 != -88) {
            this.method1911(-1.0339154F, (byte) -25, 37, true, (class92) null);
        }
        if (~super.field5373 > -1) {
            super.field5373 = 4999;
        }
        super.field5374[super.field5373] = 21;
        super.field5375[super.field5373] = arg0;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)V")
    public final void method1915(int arg0, byte arg1) {
        super.field5374[super.field5370] = (byte) arg0;
        ++field3998;
        if (arg1 != -19) {
            method1918((byte) 121);
        }
        ++super.field5370;
        if (super.field5370 >= 5000) {
            super.field5370 = 0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)V")
    public final void method1916(int arg0, int arg1) {
        ++field3989;
        if (arg1 != 0) {
            field4000 = -54;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
    public final void method1917(byte arg0) {
        if (arg0 > 114) {
            ++field4003;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V")
    public static void method1918(byte arg0) {
        field4002 = null;
        field4004 = null;
        if (arg0 >= -37) {
            method1918((byte) -34);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILls;)V")
    public final void method1919(int arg0, class74 arg1) {
        int var3 = -64 % ((arg0 - 83) / 35);
        super.field5374[super.field5370] = 20;
        ++field3997;
        super.field5375[super.field5370] = arg1;
        ++super.field5370;
        if (~super.field5370 <= -5001) {
            super.field5370 = 0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
    private final void method1920(int arg0) {
        ++field4001;
        if (arg0 != -44) {
            field4002 = null;
        }
        int var2 = super.field5373++;
        if (super.field5373 >= 5000) {
            super.field5373 = 0;
        }
        this.field3991 = super.field5374[var2];
        Object var3 = super.field5375[var2];
        super.field5375[var2] = null;
        if (this.field3991 == 21) {
            class352.method2305(this.field3996, (class74) var3);
        } else if (~this.field3991 != -21) {
            if (~this.field3991 <= -31 && ~this.field3991 >= -34) {
                class294.field4251.method956(3000.0F, super.field5372[var2] * 1.5F);
                ((class92) var3).method358(class65.field891, class333.field4842, class150.field2249, class9.field125, this.field3991 - 30 == 0);
            } else if (this.field3991 >= 40 && ~this.field3991 >= -44) {
                class294.field4251.method956(3000.0F, super.field5372[var2] * 1.5F);
                ((class92) var3).method358(class65.field891, class333.field4842, class150.field2249, class213.field3013, this.field3991 - 40 == 0);
            } else if (this.field3991 == 22) {
                class294.field4251.method1006(-1, 1583160, 40);
            } else {
                if (~this.field3991 != -24) {
                    if (this.field3991 == 24) {
                        class294.field4251.method945(0, (class402[]) null);
                        return;
                    }
                } else {
                    class294.field4251.method967();
                }
            }
        } else {
            class74 var4 = (class74) var3;
            if (var4.field975 != null) {
                var4.field975.method22(class294.field4251, (byte) 104);
            }
            if (var4.field977 != null) {
                var4.field977.method22(class294.field4251, (byte) 97);
            }
            if (var4.field967 != null) {
                var4.field967.method22(class294.field4251, (byte) 50);
            }
            if (var4.field976 != null) {
                var4.field976.method22(class294.field4251, (byte) 94);
            }
            if (var4.field969 != null) {
                var4.field969.method22(class294.field4251, (byte) 114);
            }
            for (class353 var5 = var4.field970; var5 != null; var5 = var5.field5127) {
                var5.field5125.method22(class294.field4251, (byte) 82);
            }
        }
    }
}
