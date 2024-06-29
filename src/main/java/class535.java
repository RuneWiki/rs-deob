import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public abstract class class535 extends class420 {

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "S")
    public short field7829;

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "S")
    public short field7830;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field7838 = new String[] { method4038(method4037("Q\u00040\u0018A")), method4038(method4037("Q\u00040\u001cA")), method4038(method4037("N\u001br7")), method4038(method4037("[@0u\u0014")), method4038(method4037("Q\u00040\u001aA")), method4038(method4037("Q\u00040g\u0000N\u0007jeA")), method4038(method4037("Q\u00040\u0019A")), method4038(method4037("Q\u00040\u001dA")), method4038(method4037("Q\u00040\u001eA")), method4038(method4037("Q\u00040\u001fA")) };

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "I")
    public static int field7833 = 0;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "Lvha;")
    public static class713 field7834 = new class713(1, 5);

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "I")
    public static int field7831;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "I")
    public static int field7835;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    public static int field7836;

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "I")
    public static int field7837;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ldf;IZIIILha;)V", line = 4)
    public final void method627(class420 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class66 arg6) {
        try {
            ++field7831;
            if (arg5 == 0) {
                throw new IllegalStateException();
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field7838[1] + (arg0 != null ? field7838[3] : field7838[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field7838[3] : field7838[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([Luf;Z)I", line = 16)
    public final int method630(class471[] arg0, boolean arg1) {
        try {
            if (!arg1) {
                this.method630((class471[]) null, false);
            }
            ++field7836;
            return this.method3252(arg0, super.field6197 >> class602.field8828, super.field6211 >> class602.field8828, (byte) 73);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7838[4] + (arg0 != null ? field7838[3] : field7838[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "(I)Z", line = 29)
    public final boolean method629(int arg0) {
        try {
            if (arg0 != 0) {
                this.field7830 = 80;
            }
            ++field7837;
            return class91.field1038[(super.field6197 >> class602.field8828) + class396.field5921 + -class247.field3811][(super.field6211 >> class602.field8828) + -class5.field52 + class396.field5921];
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7838[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(ILha;)Z", line = 47)
    public final boolean method631(int arg0, class66 arg1) {
        try {
            if (arg0 != -10204) {
                return false;
            } else {
                ++field7835;
                return class120.method1045(super.field6211 >> class602.field8828, this.method1088(arg0 + 7978), super.field6205, arg0 ^ 10146, super.field6197 >> class602.field8828);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7838[6] + arg0 + ',' + (arg1 != null ? field7838[3] : field7838[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "(I)V", line = 58)
    public final void method628(int arg0) {
        try {
            ++field7828;
            if (arg0 != -38) {
                method4036(-3);
            }
            throw new IllegalStateException();
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7838[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "(I)V", line = 71)
    public static void method4036(int arg0) {
        try {
            if (arg0 != 5) {
                method4036(-17);
            }
            field7834 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7838[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(IIIIIII)V", line = 80)
    public class535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            super.field6211 = arg2;
            super.field6205 = (byte) arg4;
            super.field6199 = arg1;
            this.field7829 = (short) arg5;
            super.field6200 = (byte) arg3;
            this.field7830 = (short) arg6;
            super.field6197 = arg0;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field7838[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)Z", line = 101)
    public final boolean method625(byte arg0) {
        try {
            if (arg0 != 94) {
                return false;
            } else {
                ++field7832;
                return false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7838[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4037(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 105);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4038(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 32;
                    break;
                case 1:
                    var10005 = 110;
                    break;
                case 2:
                    var10005 = 30;
                    break;
                case 3:
                    var10005 = 91;
                    break;
                default:
                    var10005 = 105;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
