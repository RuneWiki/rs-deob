import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class242 {

    @OriginalMember(owner = "client!of", name = "E", descriptor = "I")
    private int field4227 = 0;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public int field4204;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "[Lmc;")
    public class184[] field4202;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Lsf;")
    public static class108 field4211 = class140.method973(255, "blaugr-Un:");

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Lsf;")
    private static class108 field4207 = class140.method973(255, "Drop");

    @OriginalMember(owner = "client!of", name = "t", descriptor = "[I")
    public static int[] field4216 = new int[100];

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field4205 = -1;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "[S")
    public static short[] field4221 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!of", name = "b", descriptor = "Lsf;")
    public static class108 field4198 = class140.method973(255, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field4217 = 1;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "Lsf;")
    public static class108 field4220 = field4207;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!of", name = "D", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "J")
    private long field4225;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Lmc;")
    private class184 field4209;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "Lmc;")
    private class184 field4228;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Lik;")
    public static class262 field4201;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "Lca;")
    public static class98 field4219;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "[I")
    public static int[] field4208;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "[Lsf;")
    public static class108[] field4222;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "[[I")
    public static int[][] field4214;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Lmc;", line = 13)
    public final class184 method1672(int arg0) {
        field4203++;
        this.field4227 = arg0;
        return this.method1678(arg0 + 92);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V", line = 22)
    public static void method1673(int arg0) {
        field4220 = null;
        field4222 = null;
        field4207 = null;
        field4216 = null;
        field4221 = null;
        field4198 = null;
        field4211 = null;
        field4201 = null;
        if (arg0 == 28127) {
            field4219 = null;
            field4214 = (int[][]) null;
            field4208 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)I", line = 50)
    public static int method1674(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)I", line = 57)
    public final int method1675(boolean arg0) {
        field4206++;
        int var2 = 0;
        int var3 = 0;
        if (!arg0) {
            this.method1676(-41L, (byte) -64);
        }
        while (var3 < this.field4204) {
            class184 var4 = this.field4202[var3];
            for (class184 var5 = var4.field3373; var5 != var4; var5 = var5.field3373) {
                var2++;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(JB)Lmc;", line = 91)
    public final class184 method1676(long arg0, byte arg1) {
        field4223++;
        this.field4225 = arg0;
        if (arg1 >= -62) {
            return (class184) null;
        }
        class184 var4 = this.field4202[(int) (arg0 & (long) (this.field4204 - 1))];
        for (this.field4209 = var4.field3373; this.field4209 != var4; this.field4209 = this.field4209.field3373) {
            if (this.field4209.field3375 == arg0) {
                class184 var5 = this.field4209;
                this.field4209 = this.field4209.field3373;
                return var5;
            }
        }
        this.field4209 = null;
        return null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)Lmc;", line = 120)
    public final class184 method1677(byte arg0) {
        field4199++;
        if (this.field4209 == null) {
            return null;
        } else if (arg0 >= -21) {
            return (class184) null;
        } else {
            class184 var2 = this.field4202[(int) ((long) (this.field4204 - 1) & this.field4225)];
            while (this.field4209 != var2) {
                if (this.field4209.field3375 == this.field4225) {
                    class184 var3 = this.field4209;
                    this.field4209 = this.field4209.field3373;
                    return var3;
                }
                this.field4209 = this.field4209.field3373;
            }
            this.field4209 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)Lmc;", line = 157)
    public final class184 method1678(int arg0) {
        field4218++;
        int var2 = 117 % ((-arg0 - 79) / 40);
        if (this.field4227 > 0 && this.field4202[this.field4227 - 1] != this.field4228) {
            class184 var3 = this.field4228;
            this.field4228 = var3.field3373;
            return var3;
        }
        class184 var4;
        do {
            if (this.field4227 >= this.field4204) {
                return null;
            }
            var4 = this.field4202[this.field4227++].field3373;
        } while (this.field4202[this.field4227 - 1] == var4);
        this.field4228 = var4.field3373;
        return var4;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V", line = 198)
    public final void method1679(boolean arg0) {
        for (int var2 = 0; var2 < this.field4204; var2++) {
            class184 var3 = this.field4202[var2];
            while (true) {
                class184 var4 = var3.field3373;
                if (var3 == var4) {
                    break;
                }
                var4.method1325(0);
            }
        }
        if (!arg0) {
            field4222 = (class108[]) null;
        }
        field4226++;
        this.field4209 = null;
        this.field4228 = null;
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)I", line = 229)
    public final int method1680(int arg0) {
        field4210++;
        return arg0 == 0 ? this.field4204 : -97;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILmc;J)V", line = 263)
    public final void method1681(int arg0, class184 arg1, long arg2) {
        field4212++;
        if (arg1.field3376 != null) {
            arg1.method1325(0);
        }
        class184 var5 = this.field4202[(int) (arg2 & (long) (this.field4204 - arg0))];
        arg1.field3373 = var5;
        arg1.field3376 = var5.field3376;
        arg1.field3375 = arg2;
        arg1.field3376.field3373 = arg1;
        arg1.field3373.field3376 = arg1;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(I)V", line = 282)
    public class242(int arg0) {
        this.field4204 = arg0;
        this.field4202 = new class184[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class184 var3 = this.field4202[var2] = new class184();
            var3.field3373 = var3;
            var3.field3376 = var3;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V", line = 312)
    public static final void method1682(byte arg0) {
        if (class147.field2643 < class200.field3621) {
            class147.field2643 = (float) ((double) class147.field2643 / 30.0D + (double) class147.field2643);
            if (class147.field2643 > class200.field3621) {
                class147.field2643 = class200.field3621;
            }
            class137.method943(-1);
        } else if (class200.field3621 < class147.field2643) {
            class147.field2643 = (float) ((double) class147.field2643 - (double) class147.field2643 / 30.0D);
            if (class200.field3621 > class147.field2643) {
                class147.field2643 = class200.field3621;
            }
            class137.method943(-1);
        }
        if (class301.field5243 != -1 && class25.field382 != -1) {
            int var1 = class301.field5243 - class202.field3652;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            class202.field3652 += var1;
            int var2 = class25.field382 - class126.field2121;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var1 == 0 && var2 == 0) {
                class25.field382 = -1;
                class301.field5243 = -1;
            }
            class126.field2121 -= -var2;
            class137.method943(-1);
        }
        if (arg0 <= 47) {
            field4208 = (int[]) null;
        }
        field4200++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([Lmc;B)I", line = 372)
    public final int method1683(class184[] arg0, byte arg1) {
        field4213++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4204; var4++) {
            class184 var5 = this.field4202[var4];
            for (class184 var6 = var5.field3373; var6 != var5; var6 = var6.field3373) {
                arg0[var3++] = var6;
            }
        }
        if (arg1 != 113) {
            this.field4202 = (class184[]) null;
        }
        return var3;
    }
}
