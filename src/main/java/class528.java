import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class528 {

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "Lwca;")
    private class708 field7770 = new class708();

    @OriginalMember(owner = "client!eaa", name = "l", descriptor = "I")
    private int field7778;

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
    private int field7780;

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "Lqr;")
    private class69 field7769;

    @OriginalMember(owner = "client!eaa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7784 = new String[] { method3958(method3957("Q\u000e.\u001fF\u001c")), method3958(method3957("OAa\u001fs")), method3958(method3957("Z\u001a#]")), method3958(method3957("Q\u000e.\u001fL\u001c")), method3958(method3957("Q\u000e.\u001fI\u001c")), method3958(method3957("Q\u000e.\u001fO\u001c")), method3958(method3957("Q\u000e.\u001fE\u001c")), method3958(method3957("Q\u000e.\u001fG\u001c")), method3958(method3957("Q\u000e.\u001fH\u001c")), method3958(method3957("Q\u000e.\u001fD\u001c")), method3958(method3957("Q\u000e.\u001fM\u001c")), method3958(method3957("Q\u000e.\u001fJ\u001c")), method3958(method3957("Q\u000e.\u001fK\u001c")), method3958(method3957("Q\u000e.\u001f2]\u0001&E0\u001c")), method3958(method3957("Q\u000e.\u001fB\u001c")), method3958(method3957("GQ,B")) };

    @OriginalMember(owner = "client!eaa", name = "p", descriptor = "I")
    public static int field7768;

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
    public static int field7772;

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
    public static int field7773;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
    public static int field7774;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "I")
    public static int field7775;

    @OriginalMember(owner = "client!eaa", name = "m", descriptor = "I")
    public static int field7776;

    @OriginalMember(owner = "client!eaa", name = "n", descriptor = "I")
    public static int field7777;

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!eaa", name = "o", descriptor = "[I")
    public static int[] field7782;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "(I)Z")
    public static final boolean method3945(int arg0) {
        try {
            field7779++;
            return arg0 > -111 ? true : class369.field5987;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7784[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "(I)V")
    public static void method3946(int arg0) {
        try {
            field7782 = null;
            if (arg0 != -7122) {
                method3946(59);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7784[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)I")
    public final int method3947(int arg0) {
        try {
            field7772++;
            return arg0 == 1 ? this.field7778 : -42;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7784[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BILnba;Ljava/lang/Object;)V")
    private final void method3948(byte arg0, int arg1, class314 arg2, Object arg3) {
        try {
            field7775++;
            if (this.field7780 < arg1) {
                throw new IllegalStateException(field7784[15]);
            }
            this.method3956(-126, arg2);
            this.field7778 -= arg1;
            while (this.field7778 < 0) {
                class21 var5 = (class21) this.field7770.method5149((byte) 52);
                this.method3954(false, var5);
            }
            if (arg0 == 93) {
                class86 var6 = new class86(arg2, arg3, arg1);
                this.field7769.method738(var6, arg2.method1765(arg0 ^ 0x3), -12002);
                this.field7770.method5142(var6, (byte) -63);
                var6.field7075 = 0L;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field7784[14] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7784[2] : field7784[1]) + ',' + (arg3 == null ? field7784[2] : field7784[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lnba;B)Ljava/lang/Object;")
    public final Object method3949(class314 arg0, byte arg1) {
        try {
            field7776++;
            long var3 = arg0.method1765(115);
            class21 var5 = (class21) this.field7769.method737((byte) -39, var3);
            if (arg1 < 32) {
                return null;
            }
            while (var5 != null) {
                if (var5.field209.method1771(arg0, true)) {
                    Object var6 = var5.method139(true);
                    if (var6 != null) {
                        if (var5.method138((byte) 101)) {
                            class86 var7 = new class86(arg0, var6, var5.field211);
                            this.field7769.method738(var7, var5.field8252, -12002);
                            this.field7770.method5142(var7, (byte) -63);
                            var7.field7075 = 0L;
                            var5.method4173(-1);
                            var5.method3558((byte) 69);
                        } else {
                            this.field7770.method5142(var5, (byte) -63);
                            var5.field7075 = 0L;
                        }
                        return var6;
                    }
                    var5.method4173(-1);
                    var5.method3558((byte) 96);
                    this.field7778 += var5.field211;
                }
                var5 = (class21) this.field7769.method739(true);
            }
            return null;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field7784[0] + (arg0 == null ? field7784[2] : field7784[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)V")
    public final void method3950(byte arg0) {
        try {
            this.field7770.method5141(0);
            int var2 = -12 % ((arg0 + 60) / 46);
            field7771++;
            this.field7769.method730(true);
            this.field7778 = this.field7780;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7784[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)I")
    public final int method3951(int arg0) {
        try {
            if (arg0 > -41) {
                this.method3954(false, null);
            }
            field7781++;
            return this.field7780;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7784[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
    public final void method3952(int arg0) {
        try {
            field7783++;
            for (class21 var2 = (class21) this.field7770.method5147((byte) 91); var2 != null; var2 = (class21) this.field7770.method5144(arg0 - 12938)) {
                if (var2.method138((byte) 101)) {
                    var2.method4173(-1);
                    var2.method3558((byte) 94);
                    this.field7778 += var2.field211;
                }
            }
            if (arg0 != 13194) {
                this.field7780 = 112;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7784[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BI)V")
    public final void method3953(byte arg0, int arg1) {
        try {
            if (class499.field7480 != null) {
                for (class21 var3 = (class21) this.field7770.method5147((byte) 70); var3 != null; var3 = (class21) this.field7770.method5144(256)) {
                    if (var3.method138((byte) 101)) {
                        if (var3.method139(true) == null) {
                            var3.method4173(-1);
                            var3.method3558((byte) 54);
                            this.field7778 += var3.field211;
                        }
                    } else if (++var3.field7075 > (long) arg1) {
                        class21 var4 = class499.field7480.method39(458752, var3);
                        this.field7769.method738(var4, var3.field8252, arg0 ^ 0x2EF8);
                        class365.method3017((byte) -66, var4, var3);
                        var3.method4173(-1);
                        var3.method3558((byte) 83);
                    }
                }
            }
            if (arg0 == -26) {
                field7773++;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7784[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZLqia;)V")
    private final void method3954(boolean arg0, class21 arg1) {
        try {
            field7777++;
            if (arg1 != null) {
                arg1.method4173(-1);
                arg1.method3558((byte) 108);
                this.field7778 += arg1.field211;
            }
            if (arg0) {
                this.field7769 = null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7784[3] + arg0 + ',' + (arg1 == null ? field7784[2] : field7784[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(I)V")
    public class528(int arg0) {
        try {
            this.field7778 = arg0;
            this.field7780 = arg0;
            int var2;
            for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
            }
            this.field7769 = new class69(var2);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7784[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BLjava/lang/Object;Lnba;)V")
    public final void method3955(byte arg0, Object arg1, class314 arg2) {
        try {
            this.method3948((byte) 93, 1, arg2, arg1);
            field7774++;
            if (arg0 != 69) {
                field7782 = null;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7784[5] + arg0 + ',' + (arg1 == null ? field7784[2] : field7784[1]) + ',' + (arg2 == null ? field7784[2] : field7784[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ILnba;)V")
    private final void method3956(int arg0, class314 arg1) {
        try {
            field7768++;
            long var3 = arg1.method1765(115);
            class21 var5 = (class21) this.field7769.method737((byte) -39, var3);
            int var6 = -127 % ((-arg0 - 64) / 53);
            while (var5 != null) {
                if (var5.field209.method1771(arg1, true)) {
                    this.method3954(false, var5);
                    return;
                }
                var5 = (class21) this.field7769.method739(true);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field7784[8] + arg0 + ',' + (arg1 == null ? field7784[2] : field7784[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3957(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xE);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3958(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 52;
                    break;
                case 1:
                    var10005 = 111;
                    break;
                case 2:
                    var10005 = 79;
                    break;
                case 3:
                    var10005 = 49;
                    break;
                default:
                    var10005 = 14;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
