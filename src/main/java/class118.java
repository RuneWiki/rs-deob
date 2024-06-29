import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class118 {

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "Lha;")
    public class42 field1835 = new class42();

    @OriginalMember(owner = "client!gw", name = "o", descriptor = "Lqt;")
    public static class459 field1842 = new class459(33, -1);

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!gw", name = "k", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!gw", name = "m", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!gw", name = "p", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!gw", name = "q", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!gw", name = "r", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!gw", name = "s", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!gw", name = "t", descriptor = "Laa;")
    public static class343 field1847;

    @OriginalMember(owner = "client!gw", name = "l", descriptor = "Lha;")
    private class42 field1839;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Z)I", line = 8)
    public final int method852(boolean arg0) {
        field1841++;
        int var2 = 0;
        if (!arg0) {
            this.field1835 = null;
        }
        for (class42 var3 = this.field1835.field857; var3 != this.field1835; var3 = var3.field857) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILha;)V", line = 40)
    public final void method853(int arg0, class42 arg1) {
        field1844++;
        if (arg1.field859 != null) {
            arg1.method421(22071);
        }
        arg1.field857 = this.field1835.field857;
        arg1.field859 = this.field1835;
        if (arg0 != -12691) {
            field1847 = null;
        }
        arg1.field859.field857 = arg1;
        arg1.field857.field859 = arg1;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)Z", line = 59)
    public final boolean method854(int arg0) {
        field1830++;
        if (arg0 == 33) {
            return this.field1835.field857 == this.field1835;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "()V", line = 291)
    public class118() {
        this.field1835.field857 = this.field1835;
        this.field1835.field859 = this.field1835;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(BLgw;)V", line = 74)
    public final void method855(byte arg0, class118 arg1) {
        this.method864(false, arg1, this.field1835.field857);
        field1828++;
        if (arg0 != -88) {
            this.method853(46, null);
        }
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)Lha;", line = 89)
    public final class42 method856(int arg0) {
        field1843++;
        class42 var2 = this.field1835.field859;
        if (this.field1835 == var2) {
            this.field1839 = null;
            return null;
        }
        this.field1839 = var2.field859;
        if (arg0 <= 26) {
            this.method863(68);
        }
        return var2;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IB)Lea;", line = 110)
    public static final class390 method857(int arg0, byte arg1) {
        field1836++;
        class390[] var2 = class139.method1015(0);
        int var3 = 0;
        if (arg1 <= 86) {
            field1847 = null;
        }
        while (var2.length > var3) {
            class390 var4 = var2[var3];
            if (var4.field5534 == arg0) {
                return var4;
            }
            var3++;
        }
        return null;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V", line = 136)
    public static final void method858(int arg0, int arg1) {
        field1832++;
        class275 var2 = class213.method1433((byte) 49, arg1, arg0);
        var2.method1774((byte) 78);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V", line = 147)
    public static void method859(byte arg0) {
        field1847 = null;
        if (arg0 == 62) {
            field1842 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)Lha;", line = 163)
    public final class42 method860(byte arg0) {
        field1840++;
        int var2 = -81 % ((arg0 + 37) / 53);
        class42 var3 = this.field1839;
        if (this.field1835 == var3) {
            this.field1839 = null;
            return null;
        } else {
            this.field1839 = var3.field859;
            return var3;
        }
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)V", line = 182)
    public final void method861(int arg0) {
        field1838++;
        while (true) {
            class42 var2 = this.field1835.field857;
            if (this.field1835 == var2) {
                if (arg0 != -1) {
                    this.method866((byte) -36, null);
                }
                this.field1839 = null;
                return;
            }
            var2.method421(arg0 ^ 0xFFFFA9C8);
        }
    }

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "(I)Lha;", line = 206)
    public final class42 method862(int arg0) {
        field1829++;
        if (arg0 >= -56) {
            return null;
        }
        class42 var2 = this.field1835.field857;
        if (this.field1835 == var2) {
            return null;
        } else {
            var2.method421(22071);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "(I)Lha;", line = 225)
    public final class42 method863(int arg0) {
        field1837++;
        class42 var2 = this.field1835.field857;
        if (this.field1835 == var2) {
            this.field1839 = null;
            return null;
        }
        if (arg0 != -1) {
            field1845 = -83;
        }
        this.field1839 = var2.field857;
        return var2;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZLgw;Lha;)V", line = 247)
    private final void method864(boolean arg0, class118 arg1, class42 arg2) {
        field1834++;
        if (arg0) {
            return;
        }
        class42 var4 = this.field1835.field859;
        this.field1835.field859 = arg2.field859;
        arg2.field859.field857 = this.field1835;
        if (this.field1835 != arg2) {
            arg2.field859 = arg1.field1835.field859;
            arg2.field859.field857 = arg2;
            var4.field857 = arg1.field1835;
            arg1.field1835.field859 = var4;
        }
    }

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "(I)Lha;", line = 269)
    public final class42 method865(int arg0) {
        field1831++;
        class42 var2 = this.field1839;
        if (arg0 != -1) {
            return null;
        } else if (this.field1835 == var2) {
            this.field1839 = null;
            return null;
        } else {
            this.field1839 = var2.field857;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(BLha;)V", line = 300)
    public final void method866(byte arg0, class42 arg1) {
        if (arg1.field859 != null) {
            arg1.method421(22071);
        }
        field1846++;
        arg1.field859 = this.field1835.field859;
        arg1.field857 = this.field1835;
        arg1.field859.field857 = arg1;
        arg1.field857.field859 = arg1;
        if (arg0 != 10) {
            this.method852(false);
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lnf;II)V", line = 323)
    public static final void method867(class414 arg0, int arg1, int arg2) {
        field1833++;
        if (class405.field5762) {
            class405.field5762 = false;
            arg1 = 0;
        }
        if (arg2 != 0) {
            method867(null, -38, -92);
        }
        if (class514.field7468 != null && class514.field7468.method2471(arg0, -1)) {
            return;
        }
        class514.field7468 = arg0;
        class352.field5142 = class165.method1188((byte) 26);
        class197.field2883 = arg1;
        class387.field5513 = arg1;
        if (class387.field5513 == 0) {
            class414.method2472(117);
            return;
        }
        class477.field6946 = class131.field2055;
        class91.field1464 = class430.field6181;
        class66.field1115 = class540.field7953;
        class340.field5032 = class544.field7987;
        class387.field5512 = class196.field2866;
        class336.field4968 = class194.field2813;
        class403.field5737 = class190.field2783;
        class424.field5994 = class518.field7506;
        class84.field1334 = class65.field1111;
        class219.field3348 = class283.field4216;
    }
}
