import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class259 {

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    private int field4244 = 0;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "[Lab;")
    public class147[] field4216;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public int field4221;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Lna;")
    public static class26 field4219 = class69.method505("(R", (byte) -117);

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field4228 = 0;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "Lna;")
    private static class26 field4236 = class69.method505("Loaded sprites", (byte) -123);

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public static int field4235 = 0;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Lna;")
    public static class26 field4231 = field4236;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Lna;")
    public static class26 field4224 = class69.method505("Hierhin drehen", (byte) -123);

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field4229 = 0;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public static int field4238 = -2;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "[Z")
    public static boolean[] field4239 = new boolean[100];

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "Lna;")
    public static class26 field4242 = class69.method505("<col=ff7000>", (byte) -128);

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Lna;")
    public static class26 field4220 = class69.method505(" )2> <col=ff9040>", (byte) -117);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "J")
    private long field4234;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Lab;")
    private class147 field4230;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "Lab;")
    private class147 field4241;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "[Z")
    public static boolean[] field4226;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIILkm;)V", line = 7)
    public static final void method1819(int arg0, int arg1, int arg2, class324 arg3) {
        if (arg3.field3908 == arg1 && arg1 != -1) {
            class249 var4 = client.method1731(arg1, (byte) -20);
            int var5 = var4.field4045;
            if (var5 == 1) {
                arg3.field3913 = 1;
                arg3.field3976 = 0;
                arg3.field3895 = 0;
                arg3.field3910 = 0;
                arg3.field3971 = arg0;
                class285.method2020(arg3.field3972, var4, 183921384, arg3.field3962, false, arg3.field3976);
            }
            if (var5 == 2) {
                arg3.field3910 = 0;
            }
        } else if (arg1 == -1 || arg3.field3908 == -1 || client.method1731(arg1, (byte) -20).field4060 >= client.method1731(arg3.field3908, (byte) -20).field4060) {
            arg3.field3895 = 0;
            arg3.field3908 = arg1;
            arg3.field3913 = 1;
            arg3.field3910 = 0;
            arg3.field3971 = arg0;
            arg3.field3954 = arg3.field3959;
            arg3.field3976 = 0;
            if (arg3.field3908 != -1) {
                class285.method2020(arg3.field3972, client.method1731(arg3.field3908, (byte) -20), arg2 + 183921345, arg3.field3962, false, arg3.field3976);
            }
        }
        if (arg2 != 39) {
            field4238 = 41;
        }
        field4227++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 63)
    public final void method1820(int arg0) {
        field4233++;
        for (int var2 = 0; var2 < this.field4221; var2++) {
            class147 var3 = this.field4216[var2];
            while (true) {
                class147 var4 = var3.field2296;
                if (var3 == var4) {
                    break;
                }
                var4.method1006(-1024);
            }
        }
        this.field4241 = null;
        int var5 = 1 % ((73 - arg0) / 34);
        this.field4230 = null;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V", line = 96)
    public static void method1821(int arg0) {
        field4219 = null;
        field4231 = null;
        field4239 = null;
        field4224 = null;
        field4226 = null;
        field4220 = null;
        field4242 = null;
        if (arg0 <= 96) {
            method1830(-63, (Component) null);
        }
        field4236 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()V", line = 121)
    public static final void method1822() {
        for (int var0 = 0; var0 < class310.field5328; var0++) {
            class39 var1 = class249.field4073[var0];
            class170.method1174(var1);
            class249.field4073[var0] = null;
        }
        class310.field5328 = 0;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Lab;", line = 171)
    public final class147 method1823(int arg0) {
        this.field4244 = 0;
        if (arg0 < 11) {
            return (class147) null;
        } else {
            field4218++;
            return this.method1825(-66);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)Lj;", line = 201)
    public static final class283 method1824(int arg0, boolean arg1) {
        field4217++;
        if (arg0 == 0) {
            return new class268();
        } else if (arg0 == 1) {
            return new class46();
        } else if (arg0 == 2) {
            return new class194();
        } else if (arg0 == 3) {
            return new class240();
        } else if (arg0 == 4) {
            return new class181();
        } else if (arg0 == 5) {
            return new class185();
        } else if (arg0 == 6) {
            return new class1();
        } else if (arg0 == 7) {
            return new class309();
        } else if (arg0 == 8) {
            return new class261();
        } else if (arg0 == 9) {
            return new class158();
        } else if (arg0 == 10) {
            return new class144();
        } else if (arg0 == 11) {
            return new class155();
        } else if (arg0 == 12) {
            return new class114();
        } else if (arg0 == 13) {
            return new class18();
        } else if (arg0 == 14) {
            return new class110();
        } else if (arg0 == 15) {
            return new class20();
        } else if (arg0 == 16) {
            return new class245();
        } else if (arg0 == 17) {
            return new class303();
        } else if (arg0 == 18) {
            return new class76();
        } else if (arg0 == 19) {
            return new class113();
        } else if (arg0 == 20) {
            return new class72();
        } else if (arg0 == 21) {
            return new class310();
        } else if (arg0 == 22) {
            return new class219();
        } else if (arg0 == 23) {
            return new class74();
        } else if (arg0 == 24) {
            return new class31();
        } else if (arg0 == 25) {
            return new class126();
        } else if (arg0 == 26) {
            return new class98();
        } else if (arg0 == 27) {
            return new class142();
        } else if (arg0 == 28) {
            return new class230();
        } else if (arg0 == 29) {
            return new class315();
        } else if (arg0 == 30) {
            return new class198();
        } else if (arg0 == 31) {
            return new class292();
        } else if (arg0 == 32) {
            return new class112();
        } else if (arg0 == 33) {
            return new class320();
        } else if (arg0 == 34) {
            return new class84();
        } else if (arg0 == 35) {
            return new class201();
        } else if (arg0 == 36) {
            return new class264();
        } else if (arg0 == 37) {
            return new class135();
        } else if (arg0 == 38) {
            return new class190();
        } else if (arg0 == 39) {
            return new class115();
        } else {
            if (!arg1) {
                method1819(8, 6, 81, (class324) null);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)Lab;", line = 536)
    public final class147 method1825(int arg0) {
        field4222++;
        if (this.field4244 > 0 && this.field4216[this.field4244 - 1] != this.field4241) {
            class147 var2 = this.field4241;
            this.field4241 = var2.field2296;
            return var2;
        }
        class147 var3;
        do {
            if (this.field4244 >= this.field4221) {
                if (arg0 > -61) {
                    this.method1820(119);
                }
                return null;
            }
            var3 = this.field4216[this.field4244++].field2296;
        } while (this.field4216[this.field4244 - 1] == var3);
        this.field4241 = var3.field2296;
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILab;J)V", line = 568)
    public final void method1826(int arg0, class147 arg1, long arg2) {
        if (arg1.field2304 != null) {
            arg1.method1006(arg0 - 1025);
        }
        class147 var5 = this.field4216[(int) (arg2 & (long) (this.field4221 - arg0))];
        arg1.field2296 = var5;
        arg1.field2293 = arg2;
        field4225++;
        arg1.field2304 = var5.field2304;
        arg1.field2304.field2296 = arg1;
        arg1.field2296.field2304 = arg1;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V", line = 586)
    public class259(int arg0) {
        this.field4216 = new class147[arg0];
        this.field4221 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class147 var3 = this.field4216[var2] = new class147();
            var3.field2304 = var3;
            var3.field2296 = var3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(JI)Lab;", line = 608)
    public final class147 method1827(long arg0, int arg1) {
        if (arg1 != 0) {
            this.field4216 = (class147[]) null;
        }
        field4214++;
        this.field4234 = arg0;
        class147 var4 = this.field4216[(int) (arg0 & (long) (this.field4221 - 1))];
        for (this.field4230 = var4.field2296; this.field4230 != var4; this.field4230 = this.field4230.field2296) {
            if (this.field4230.field2293 == arg0) {
                class147 var5 = this.field4230;
                this.field4230 = this.field4230.field2296;
                return var5;
            }
        }
        this.field4230 = null;
        return null;
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)I", line = 641)
    public final int method1828(int arg0) {
        int var2 = 75 / ((23 - arg0) / 50);
        field4243++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4221; var4++) {
            class147 var5 = this.field4216[var4];
            class147 var6 = var5.field2296;
            while (var5 != var6) {
                var6 = var6.field2296;
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([Lab;I)I", line = 671)
    public final int method1829(class147[] arg0, int arg1) {
        field4237++;
        if (arg1 < 3) {
            field4220 = (class26) null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4221; var4++) {
            class147 var5 = this.field4216[var4];
            for (class147 var6 = var5.field2296; var6 != var5; var6 = var6.field2296) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 708)
    public static final void method1830(int arg0, Component arg1) {
        if (arg0 != 4) {
            method1824(-104, false);
        }
        field4215++;
        arg1.removeMouseListener(class94.field1539);
        arg1.removeMouseMotionListener(class94.field1539);
        arg1.removeFocusListener(class94.field1539);
        class300.field5175 = 0;
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)Lab;", line = 722)
    public final class147 method1831(int arg0) {
        field4240++;
        if (this.field4230 == null) {
            return null;
        }
        class147 var2 = this.field4216[(int) (this.field4234 & (long) (this.field4221 - 1))];
        if (arg0 != 0) {
            method1819(-100, 110, -46, (class324) null);
        }
        while (this.field4230 != var2) {
            if (this.field4230.field2293 == this.field4234) {
                class147 var3 = this.field4230;
                this.field4230 = this.field4230.field2296;
                return var3;
            }
            this.field4230 = this.field4230.field2296;
        }
        this.field4230 = null;
        return null;
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)I", line = 753)
    public final int method1832(int arg0) {
        field4232++;
        if (arg0 < 66) {
            method1819(-91, -119, -117, (class324) null);
        }
        return this.field4221;
    }
}
