import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class351 extends class299 {

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5680 = new String[] { method2923(method2922("\u0003&\u001aMC")), method2923(method2922("\u0003&\u001aBC")), method2923(method2922("\u001aj\u001a$\u0016")), method2923(method2922("\u000f1Xf")), method2923(method2922("\u0003&\u001aOC")), method2923(method2922("\u0003&\u001aLC")), method2923(method2922("\u0003&\u001aIC")), method2923(method2922("\u0003&\u001aKC")), method2923(method2922("\u0003&\u001aHC")), method2923(method2922("\u0003&\u001aNC")) };

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "[I")
    public static int[] field5673 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "Lhk;")
    public static class107 field5676;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
    public static void method2918(int arg0) {
        try {
            field5673 = null;
            field5676 = null;
            if (arg0 != 22573) {
                method2918(82);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5680[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[I[ILvf;BI)Lhr;")
    public static final class553 method2919(int arg0, int[] arg1, int[] arg2, class159 arg3, byte arg4, int arg5) {
        try {
            ++field5674;
            byte[] var6 = new byte[arg0 * arg5];
            if (arg4 != 21) {
                field5678 = 86;
            }
            for (int var7 = 0; ~arg5 < ~var7; ++var7) {
                int var8 = arg0 * var7 + arg1[var7];
                for (int var9 = 0; ~arg2[var7] < ~var9; ++var9) {
                    var6[var8++] = -1;
                }
            }
            return new class553(arg3, arg0, arg5, var6);
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field5680[1] + arg0 + ',' + (arg1 != null ? field5680[2] : field5680[3]) + ',' + (arg2 != null ? field5680[2] : field5680[3]) + ',' + (arg3 != null ? field5680[2] : field5680[3]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(ILes;)V")
    public class351(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Les;)V")
    public class351(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)V")
    public final void method846(int arg0, boolean arg1) {
        try {
            super.field4849 = arg0;
            ++field5679;
            if (arg1) {
                this.method846(67, true);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5680[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)I")
    public final int method2920(boolean arg0) {
        try {
            ++field5672;
            if (!arg0) {
                this.method847(54);
            }
            return super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5680[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)Z")
    public final boolean method2921(int arg0) {
        try {
            ++field5670;
            if (arg0 != 3) {
                return false;
            } else if (super.field4850.method3245((byte) -58)) {
                return false;
            } else {
                return ~super.field4850.field6363.method1140(true) != -1;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5680[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)I")
    public final int method852(int arg0, int arg1) {
        try {
            ++field5677;
            if (arg0 != 1) {
                field5673 = null;
            }
            if (super.field4850.method3245((byte) -58)) {
                return 3;
            } else {
                return ~super.field4850.field6363.method1140(true) == -1 ? 3 : 1;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5680[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I")
    public final int method847(int arg0) {
        try {
            if (arg0 != 0) {
                return 25;
            } else {
                ++field5671;
                return 2;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5680[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public final void method848(int arg0) {
        try {
            if (super.field4850.method3245((byte) -58)) {
                super.field4849 = 0;
            }
            ++field5675;
            if (super.field4850.field6363.method1140(true) == 0) {
                super.field4849 = 0;
            }
            if (arg0 != -20456) {
                this.method852(-57, -76);
            }
            if (super.field4849 < 0 || ~super.field4849 < -3) {
                super.field4849 = this.method847(0);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5680[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2922(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 107);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2923(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 97;
                    break;
                case 1:
                    var10005 = 68;
                    break;
                case 2:
                    var10005 = 52;
                    break;
                case 3:
                    var10005 = 10;
                    break;
                default:
                    var10005 = 107;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
