import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class141 extends class164 {

    @OriginalMember(owner = "client!ik", name = "Mb", descriptor = "Lkj;")
    public static class404 field1885 = new class404();

    @OriginalMember(owner = "client!ik", name = "Sb", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!ik", name = "Db", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!ik", name = "Eb", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!ik", name = "Fb", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!ik", name = "Gb", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!ik", name = "Hb", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!ik", name = "Ib", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!ik", name = "Jb", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ik", name = "Kb", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!ik", name = "Lb", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!ik", name = "Nb", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!ik", name = "Ob", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!ik", name = "Pb", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!ik", name = "Qb", descriptor = "I")
    private int field1889;

    @OriginalMember(owner = "client!ik", name = "Rb", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!ik", name = "Tb", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!ik", name = "Cb", descriptor = "Lmu;")
    private class199 field1875;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(Z)I")
    public final int method940(boolean arg0) {
        ++field1876;
        int var2 = super.field2219[super.field2185++] + -this.field1875.method1327(-1) & 255;
        if (!arg0) {
            this.method940(false);
        }
        return ~var2 > -129 ? var2 : (var2 + -128 << 8) + (255 & super.field2219[super.field2185++] - this.field1875.method1327(-1));
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I)V")
    public class141(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([II)V")
    public final void method941(int[] arg0, int arg1) {
        this.field1875 = new class199(arg0);
        if (arg1 > 2) {
            ++field1879;
        }
    }

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "(B)Z")
    public final boolean method942(byte arg0) {
        ++field1886;
        int var2 = 15 % ((arg0 - 27) / 36);
        int var3 = 255 & super.field2219[super.field2185] + -this.field1875.method1322(-13908);
        return ~var3 <= -129;
    }

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "(I)V")
    public static final void method943(int arg0) {
        ++field1878;
        class368 var1 = null;
        try {
            class234 var2 = class312.field4572.method2975(true, 8, "2");
            while (~var2.field3322 == -1) {
                class388.method2433(1L, arg0 ^ 84);
            }
            if (~var2.field3322 == -2) {
                var1 = (class368) var2.field3324;
                class164 var3 = new class164(3 - -(class381.field5804 * 6));
                var3.method1072((byte) 102, 1);
                var3.method1114(class381.field5804, arg0 ^ 101);
                for (int var4 = 0; ~var4 > ~class331.field5170.length; ++var4) {
                    if (class534.field7852[var4]) {
                        var3.method1114(var4, 125);
                        var3.method1073(326170192, class331.field5170[var4]);
                    }
                }
                var1.method2341(var3.field2185, 0, var3.field2219, arg0 ^ 126);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method2344((byte) -93);
            }
        } catch (Exception var5) {
        }
        class439.field6627 = class58.method427((byte) -19);
        if (arg0 != 0) {
            method943(76);
        }
        class298.field4388 = false;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I[BII)V")
    public final void method944(int arg0, byte[] arg1, int arg2, int arg3) {
        int var5 = -121 / ((arg2 - -47) / 42);
        for (int var6 = 0; arg0 > var6; ++var6) {
            arg1[arg3 + var6] = (byte) (super.field2219[super.field2185++] + -this.field1875.method1327(-1));
        }
        ++field1890;
    }

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "(II)I")
    public final int method945(int arg0, int arg1) {
        if (arg1 != -7365) {
            return 93;
        } else {
            ++field1882;
            return arg0 * 8 + -this.field1889;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method946(String arg0, int arg1, boolean arg2) {
        if (arg2) {
            field1892 = 57;
        }
        ++field1880;
        class177 var3 = class344.method2229(2, arg1, (byte) 98);
        var3.method1191(117);
        var3.field2367 = arg0;
    }

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "(II)V")
    public final void method947(int arg0, int arg1) {
        ++field1887;
        super.field2219[super.field2185++] = (byte) (this.field1875.method1327(-1) + arg1);
        int var3 = 111 / ((-2 - arg0) / 44);
    }

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "(I)V")
    public static void method948(int arg0) {
        if (arg0 < -45) {
            field1885 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "(II)I")
    public final int method949(int arg0, int arg1) {
        if (arg0 < 11) {
            return -64;
        } else {
            ++field1877;
            int var3 = this.field1889 >> 3;
            int var4 = -(this.field1889 & 7) + 8;
            this.field1889 += arg1;
            int var5 = 0;
            while (~var4 > ~arg1) {
                var5 += (super.field2219[var3++] & class216.field3048[var4]) << -var4 + arg1;
                arg1 -= var4;
                var4 = 8;
            }
            int var6;
            if (~arg1 != ~var4) {
                var6 = (super.field2219[var3] >> var4 - arg1 & class216.field3048[arg1]) + var5;
            } else {
                var6 = (super.field2219[var3] & class216.field3048[var4]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "(I)V")
    public static final void method950(int arg0) {
        ++field1888;
        for (int var1 = arg0; var1 < 100; ++var1) {
            class430.field6553[var1] = true;
        }
    }

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "(I)V")
    public final void method951(int arg0) {
        this.field1889 = super.field2185 * 8;
        if (arg0 == 1374428641) {
            ++field1883;
        }
    }

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "(I)V")
    public final void method952(int arg0) {
        super.field2185 = (this.field1889 + 7) / 8;
        ++field1884;
        int var2 = 115 % ((-57 - arg0) / 62);
    }

    static {
        new class446("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field1891 = 0;
    }
}
