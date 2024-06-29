import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class291 {

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Les;")
    public class261 field4458 = new class261();

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4446 = null;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "Les;")
    private class261 field4460;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Les;", line = 5)
    public final class261 method1884(byte arg0) {
        field4461++;
        if (arg0 != -30) {
            this.field4458 = null;
        }
        class261 var2 = this.field4458.field3976;
        if (this.field4458 == var2) {
            this.field4460 = null;
            return null;
        } else {
            this.field4460 = var2.field3976;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLes;)V", line = 30)
    public final void method1885(boolean arg0, class261 arg1) {
        field4452++;
        if (arg1.field3976 != null) {
            arg1.method1676(!arg0);
        }
        arg1.field3976 = this.field4458.field3976;
        arg1.field3972 = this.field4458;
        arg1.field3976.field3972 = arg1;
        arg1.field3972.field3976 = arg1;
        if (arg0) {
            this.method1886(65);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)I", line = 52)
    public final int method1886(int arg0) {
        if (arg0 != -31340) {
            return -5;
        }
        field4454++;
        int var2 = 0;
        class261 var3 = this.field4458.field3972;
        while (this.field4458 != var3) {
            var3 = var3.field3972;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLes;)V", line = 75)
    public final void method1887(byte arg0, class261 arg1) {
        if (arg1.field3976 != null) {
            arg1.method1676(true);
        }
        field4448++;
        if (arg0 >= 123) {
            arg1.field3976 = this.field4458;
            arg1.field3972 = this.field4458.field3972;
            arg1.field3976.field3972 = arg1;
            arg1.field3972.field3976 = arg1;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Les;Lmf;I)V", line = 96)
    private final void method1888(class261 arg0, class291 arg1, int arg2) {
        field4453++;
        class261 var4 = this.field4458.field3976;
        this.field4458.field3976 = arg0.field3976;
        arg0.field3976.field3972 = this.field4458;
        if (arg2 != 32668) {
            field4445 = -13;
        }
        if (this.field4458 != arg0) {
            arg0.field3976 = arg1.field4458.field3976;
            arg0.field3976.field3972 = arg0;
            var4.field3972 = arg1.field4458;
            arg1.field4458.field3976 = var4;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)Z", line = 120)
    public final boolean method1889(byte arg0) {
        field4456++;
        if (arg0 >= -113) {
            this.method1884((byte) -45);
        }
        return this.field4458.field3972 == this.field4458;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)Lvp;", line = 136)
    public static final class126 method1890(byte arg0, int arg1) {
        int var2 = 98 % ((-arg0 - 55) / 55);
        field4450++;
        if (arg1 == 0) {
            if ((double) class319.field4859 == 3.0D) {
                return class512.field7446;
            }
            if ((double) class319.field4859 == 4.0D) {
                return class520.field7561;
            }
            if ((double) class319.field4859 == 6.0D) {
                return class456.field6773;
            }
            if ((double) class319.field4859 >= 8.0D) {
                return class383.field5603;
            }
        } else if (arg1 == 1) {
            if ((double) class319.field4859 == 3.0D) {
                return class456.field6773;
            }
            if ((double) class319.field4859 == 4.0D) {
                return class383.field5603;
            }
            if ((double) class319.field4859 == 6.0D) {
                return class100.field1928;
            }
            if ((double) class319.field4859 >= 8.0D) {
                return class533.field7742;
            }
        } else if (arg1 == 2) {
            if ((double) class319.field4859 == 3.0D) {
                return class100.field1928;
            }
            if ((double) class319.field4859 == 4.0D) {
                return class533.field7742;
            }
            if ((double) class319.field4859 == 6.0D) {
                return class136.field2292;
            }
            if ((double) class319.field4859 >= 8.0D) {
                return class326.field4943;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V", line = 205)
    public final void method1891(int arg0) {
        field4457++;
        if (arg0 != -3) {
            return;
        }
        while (true) {
            class261 var2 = this.field4458.field3972;
            if (this.field4458 == var2) {
                this.field4460 = null;
                return;
            }
            var2.method1676(true);
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)Les;", line = 227)
    public final class261 method1892(int arg0) {
        field4455++;
        if (arg0 <= 84) {
            return null;
        }
        class261 var2 = this.field4458.field3972;
        if (this.field4458 == var2) {
            this.field4460 = null;
            return null;
        } else {
            this.field4460 = var2.field3972;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)Les;", line = 247)
    public final class261 method1893(byte arg0) {
        field4459++;
        class261 var2 = this.field4460;
        if (arg0 != -2) {
            field4445 = 63;
        }
        if (this.field4458 == var2) {
            this.field4460 = null;
            return null;
        } else {
            this.field4460 = var2.field3972;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(B)Les;", line = 268)
    public final class261 method1894(byte arg0) {
        field4449++;
        class261 var2 = this.field4458.field3972;
        if (this.field4458 == var2) {
            return null;
        } else {
            var2.method1676(true);
            return arg0 > -69 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLmf;)V", line = 287)
    public final void method1895(byte arg0, class291 arg1) {
        int var3 = -90 / ((arg0 - 41) / 63);
        field4451++;
        this.method1888(this.field4458.field3972, arg1, 32668);
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)Les;", line = 298)
    public final class261 method1896(int arg0) {
        field4447++;
        class261 var2 = this.field4460;
        if (arg0 < 45) {
            field4445 = -7;
        }
        if (this.field4458 == var2) {
            this.field4460 = null;
            return null;
        } else {
            this.field4460 = var2.field3976;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V", line = 342)
    public class291() {
        this.field4458.field3972 = this.field4458;
        this.field4458.field3976 = this.field4458;
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V", line = 329)
    public static void method1897(int arg0) {
        if (arg0 != 0) {
            field4446 = null;
        }
        field4446 = null;
    }
}
