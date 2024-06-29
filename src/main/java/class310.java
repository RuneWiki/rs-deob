import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class310 {

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
    public int field3965;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "B")
    public byte field3961;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
    public int field3962;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    public int field3955;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public int field3957;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "I")
    public int field3959;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public int field3954;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "Lmb;")
    public class410 field3956;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "I")
    public static int field3966 = 0;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!lt", name = "s", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "Ldj;")
    public class483 field3964;

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "Lma;")
    public class639 field3968;

    @OriginalMember(owner = "client!lt", name = "r", descriptor = "Lbf;")
    public class729 field3971;

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "Ltea;")
    public class759 field3963;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "[I")
    public static int[] field3960;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method1808(byte arg0) {
        field3958++;
        if (arg0 >= -117) {
            return true;
        } else {
            return this.field3961 == 2 || this.field3961 == 3;
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(B)Z", line = 17)
    public static final boolean method1809(byte arg0) {
        if (arg0 > -23) {
            return false;
        } else {
            field3967++;
            return class573.field8011 > 0;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BI)Luw;", line = 32)
    public static final class13 method1810(byte arg0, int arg1) {
        field3972++;
        class13 var2 = (class13) class585.field8121.method778((long) arg1, 122);
        if (var2 != null) {
            return var2;
        }
        int var3 = -38 / ((-arg0 - 59) / 38);
        byte[] var4 = class402.field5564.method3810(0, -23360, arg1);
        class13 var5 = new class13();
        if (var4 != null) {
            var5.method184((byte) 2, arg1, new class179(var4));
        }
        class585.field8121.method774((long) arg1, 91, var5);
        return var5;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZI)Z", line = 62)
    public static final boolean method1811(int arg0, boolean arg1, int arg2) {
        field3970++;
        if (!arg1) {
            field3960 = null;
        }
        return (arg0 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IBIZJ)Ljava/lang/String;", line = 73)
    public static final String method1812(int arg0, byte arg1, int arg2, boolean arg3, long arg4) {
        field3969++;
        char var6 = ',';
        char var7 = '.';
        if (arg2 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg2 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg4 < 0L) {
            arg4 = -arg4;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        int var10 = -110 % ((9 - arg1) / 52);
        if (arg0 > 0) {
            for (int var11 = 0; var11 < arg0; var11++) {
                int var12 = (int) arg4;
                arg4 /= 10L;
                var9.append((char) (var12 + 48 - (int) arg4 * 10));
            }
            var9.append(var6);
        }
        int var13 = 0;
        while (true) {
            int var14 = (int) arg4;
            arg4 /= 10L;
            var9.append((char) (var14 + 48 - ((int) arg4 * 10)));
            if (arg4 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg3) {
                var13++;
                if ((var13 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)V", line = 153)
    public static void method1813(boolean arg0) {
        if (arg0) {
            field3960 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(BIIIIIILmb;)V", line = 171)
    public class310(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class410 arg7) {
        this.field3965 = arg2;
        this.field3961 = arg0;
        this.field3962 = arg1;
        this.field3955 = arg6;
        this.field3957 = arg5;
        this.field3959 = arg4;
        this.field3954 = arg3;
        this.field3956 = arg7;
    }
}
