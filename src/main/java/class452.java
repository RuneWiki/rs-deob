import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class452 {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public int field6580;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "Lfd;")
    public static class350 field6576;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Ljava/lang/String;")
    public String field6579;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;", line = 5)
    public static final String[] method2628(String arg0, int arg1, char arg2) {
        field6575++;
        int var3 = class340.method2061(arg2, (byte) -102, arg0);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = arg1; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2 != arg0.charAt(var8); var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V", line = 37)
    public static void method2629(boolean arg0) {
        if (arg0) {
            field6576 = null;
        }
        field6576 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)Let;", line = 50)
    public static final class403 method2630(int arg0, int arg1, int arg2) {
        class468 var3 = class358.field5312[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6766;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIJBZ)Ljava/lang/String;", line = 58)
    public static final String method2631(int arg0, int arg1, long arg2, byte arg3, boolean arg4) {
        field6581++;
        if (arg3 > -21) {
            field6576 = null;
        }
        char var6 = ',';
        char var7 = '.';
        if (arg0 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg0 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg2 < 0L) {
            var8 = true;
            arg2 = -arg2;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg2;
                arg2 /= 10L;
                var9.append((char) (var11 + 48 - (int) arg2 * 10));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg2;
            arg2 /= 10L;
            var9.append((char) (48 - (((int) arg2 * 10) - var13)));
            if (arg2 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V", line = 141)
    public static final void method2632(byte arg0) {
        field6578++;
        class151.field1947.method2315((byte) -107);
        if (arg0 <= 120) {
            field6577 = 96;
        }
    }
}
