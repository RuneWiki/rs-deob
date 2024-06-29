import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class78 extends class521 {

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "F")
    private float field905 = 0.0F;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Llba;")
    private class468 field904;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Lrg;")
    public static class548 field903 = new class548(78, -1);

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "Lpl;")
    public static class555 field916 = class623.method3570(119);

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "[B")
    public static byte[] field919 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "Lmv;")
    public static class313 field914;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "[[Z")
    public static boolean[][] field918;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILhv;I)V")
    public final void method446(int arg0, class440 arg1, int arg2) {
        super.field7319.method2459(113, arg1);
        if (arg2 != 26440) {
            this.method455(-36, -119, -77);
        }
        ++field915;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lbda;Llba;)V")
    public class78(class428 arg0, class468 arg1) {
        super(arg0);
        this.field904 = arg1;
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V")
    public final void method447(int arg0) {
        ++field913;
        if (super.field7319.method2444(arg0 ^ 30502) == 0) {
            class335 var2 = super.field7319.method2466(arg0 ^ 15);
            super.field7319.method2472(true, 1);
            class335 var3 = super.field7319.method2479((byte) -100);
            var3.method676(var2);
            var3.method1889(1.0F, 0.125F, 4425, 0.125F);
            var3.method1881((byte) 3, 0.0F, this.field905, 0.0F);
            super.field7319.method2431((byte) -86, class104.field1270);
            super.field7319.method2472(true, 0);
        }
        if (arg0 != 15) {
            field917 = -75;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public final void method448(boolean arg0) {
        super.field7319.method2472(true, 1);
        ++field909;
        super.field7319.method2429(class564.field8287, class564.field8287, 66);
        super.field7319.method2435(0, 117, class289.field3751);
        if (arg0) {
            this.method446(-65, (class440) null, -38);
        }
        super.field7319.method2465(class289.field3751, -14787, 0);
        super.field7319.method1810((byte) -83, 1);
        super.field7319.method2459(108, (class440) null);
        super.field7319.method2472(true, 0);
        super.field7319.method2465(class289.field3751, -14787, 0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)V")
    public final void method449(int arg0, boolean arg1) {
        if (arg0 == 256) {
            ++field906;
            super.field7319.method2429(class2.field7, class564.field8287, 42);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)Ldg;")
    public static final class349 method450(int arg0, int arg1, int arg2) {
        if (class383.field5070[arg0][arg1][arg2] == null) {
            boolean var3 = class383.field5070[0][arg1][arg2] != null && class383.field5070[0][arg1][arg2].field4494 != null;
            if (var3 && arg0 >= client.field3216 - 1) {
                return null;
            }
            class220.method1270(arg0, arg1, arg2);
        }
        return class383.field5070[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
    public static void method451(byte arg0) {
        field903 = null;
        field918 = null;
        if (arg0 != 13) {
            field903 = null;
        }
        field919 = null;
        field916 = null;
        field914 = null;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)Z")
    public final boolean method452(int arg0) {
        if (arg0 < 49) {
            this.method447(38);
        }
        ++field907;
        return this.field904.method2729(false);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method453(byte arg0, String arg1) {
        if (arg0 != 97) {
            field916 = null;
        }
        ++field911;
        if (arg1 == null) {
            return null;
        } else {
            int var2 = 0;
            int var3 = arg1.length();
            while (~var3 < ~var2 && class135.method755(true, arg1.charAt(var2))) {
                ++var2;
            }
            while (var3 > var2 && class135.method755(true, arg1.charAt(var3 - 1))) {
                --var3;
            }
            int var4 = -var2 + var3;
            if (~var4 <= -2 && ~var4 >= -13) {
                StringBuffer var5 = new StringBuffer(var4);
                for (int var6 = var2; var6 < var3; ++var6) {
                    char var7 = arg1.charAt(var6);
                    if (class641.method3689(var7, 0)) {
                        char var8 = class561.method3275(251, var7);
                        if (~var8 != -1) {
                            var5.append(var8);
                        }
                    }
                }
                if (var5.length() == 0) {
                    return null;
                } else {
                    return var5.toString();
                }
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BZ)V")
    public final void method454(byte arg0, boolean arg1) {
        super.field7319.method2472(true, 1);
        ++field910;
        super.field7319.method2429(class2.field7, class402.field5281, 111);
        super.field7319.method1798(true, false, 0, 6, class289.field3751);
        super.field7319.method2465(class99.field1226, -14787, 0);
        super.field7319.method1810((byte) -84, 0);
        if (arg0 != 21) {
            field914 = null;
        }
        super.field7319.method2472(true, 0);
        super.field7319.method2434(111, -16777216);
        super.field7319.method2465(class264.field3445, -14787, 0);
        this.method447(arg0 + -6);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
    public final void method455(int arg0, int arg1, int arg2) {
        super.field7319.method2472(true, 1);
        ++field912;
        if ((arg1 & 128) == arg0) {
            if ((1 & arg2) == 1) {
                if (!this.field904.field6540) {
                    int var4 = super.field7319.field5779 % 4000 * 16 / 4000;
                    super.field7319.method2459(71, this.field904.field6541[var4]);
                } else {
                    this.field905 = (float) (super.field7319.field5779 % 4000) / 4000.0F;
                    super.field7319.method2459(102, this.field904.field6545);
                }
            } else if (this.field904.field6540) {
                super.field7319.method2459(81, this.field904.field6545);
            } else {
                super.field7319.method2459(115, this.field904.field6541[0]);
            }
        } else {
            super.field7319.method2459(120, (class440) null);
        }
        super.field7319.method2472(true, 0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V")
    public static final void method456(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~arg2 < ~arg4) {
            class62.method363(arg2, -128, arg1, class328.field4287[arg3], arg4);
        } else {
            class62.method363(arg4, -127, arg1, class328.field4287[arg3], arg2);
        }
        if (arg0 == -2) {
            ++field908;
        }
    }
}
