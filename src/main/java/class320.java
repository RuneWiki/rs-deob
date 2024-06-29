import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public abstract class class320 extends class206 {

    @OriginalMember(owner = "client!vw", name = "u", descriptor = "Lffa;")
    public class197 field5055;

    @OriginalMember(owner = "client!vw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5065 = new String[] { method2719(method2718("\u0015mC\u001a\u0012")), method2719(method2718("\u0015mC\u0004\u0012")), method2719(method2718("\u0015mC\u0005\u0012")), method2719(method2718("\ro\u00019")), method2719(method2718("\u0015mCiS\rs\u0019k\u0012")), method2719(method2718("\u00184C{G")), method2719(method2718("\u0015mC\u001c\u0012")), method2719(method2718("\u0015mC\u0018\u0012")), method2719(method2718("\u0015mC\u001b\u0012")) };

    @OriginalMember(owner = "client!vw", name = "n", descriptor = "I")
    public static int field5060 = 0;

    @OriginalMember(owner = "client!vw", name = "p", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!vw", name = "m", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!vw", name = "j", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!vw", name = "r", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!vw", name = "o", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!vw", name = "k", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!vw", name = "q", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!vw", name = "s", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!vw", name = "l", descriptor = "Z")
    public boolean field5056;

    @OriginalMember(owner = "client!vw", name = "t", descriptor = "[Lcn;")
    public static class541[] field5054;

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "(I)Z", line = 4)
    public final boolean method2707(int arg0) {
        try {
            field5062++;
            if (arg0 != -15624) {
                field5060 = 81;
            }
            return false;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5065[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(B)I", line = 17)
    public int method2709(byte arg0) {
        try {
            field5053++;
            int var2 = -101 % ((76 - arg0) / 50);
            return 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5065[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "(I)Z", line = 33)
    public final boolean method2712(int arg0) {
        try {
            field5059++;
            return arg0 == 0 ? this.field5056 : true;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5065[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V", line = 57)
    public static void method2715(int arg0) {
        try {
            field5054 = null;
            if (arg0 != -24708) {
                method2717(20, 38, 34, 9, 55, 83, -32, (byte) -83);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5065[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)I", line = 67)
    public final int method2716(int arg0) {
        try {
            if (arg0 == 0) {
                field5058++;
                return 1;
            } else {
                return 122;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5065[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lffa;)V", line = 79)
    public class320(class197 arg0) {
        try {
            this.field5055 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5065[4] + (arg0 == null ? field5065[3] : field5065[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIIIIIIB)V", line = 87)
    public static final void method2717(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        try {
            if (class200.field3119 <= arg1 && class676.field9797 >= arg4 && arg6 >= class676.field9807 && arg0 <= class381.field5786) {
                class470.method3569(arg5, arg1, arg4, arg0, arg2, arg6, arg3, (byte) -73);
            } else {
                class31.method206(arg6, arg0, arg1, -69, arg3, arg5, arg2, arg4);
            }
            int var8 = 3 % ((44 - arg7) / 54);
            field5057++;
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field5065[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILbca;ILbca;)V")
    public abstract void method2706(int arg0, class689 arg1, int arg2, class689 arg3);

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Z)Z")
    public abstract boolean method2708(boolean arg0);

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIB)V")
    public abstract void method2710(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "(B)V")
    public abstract void method2711(byte arg0);

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)V")
    public abstract void method2713(int arg0, int arg1);

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)Z")
    public abstract boolean method2714(byte arg0);

    @OriginalMember(owner = "client!vw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2718(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2719(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 99;
                    break;
                case 1:
                    var10005 = 26;
                    break;
                case 2:
                    var10005 = 109;
                    break;
                case 3:
                    var10005 = 85;
                    break;
                default:
                    var10005 = 58;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
