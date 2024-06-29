import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class519 {

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "[I")
    public static int[] field7543 = new int[25];

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "[I")
    public static int[] field7537 = new int[4];

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public int field7534;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public int field7535;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public int field7536;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public int field7538;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public int field7539;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    public int field7544;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public int field7545;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public int field7546;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public int field7547;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public int field7548;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public int field7549;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public int field7550;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    public int field7551;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
    public int field7552;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
    public int field7553;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
    public int field7554;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "I")
    public int field7555;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
    public int field7556;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
    public static void method3078(byte arg0) {
        int var1 = 5 / ((29 - arg0) / 33);
        field7543 = null;
        field7537 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(III[B)[B")
    public static final byte[] method3079(int arg0, int arg1, int arg2, byte[] arg3) {
        field7542++;
        byte[] var4 = new byte[arg1];
        class394.method2448(arg3, arg2, var4, arg0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(JZIII)Ljava/lang/String;")
    public static final String method3080(long arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field7541++;
        if (arg2 != 3) {
            field7537 = null;
        }
        char var6 = ',';
        char var7 = '.';
        if (arg3 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg3 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg0 < 0L) {
            var8 = true;
            arg0 = -arg0;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg4 > 0) {
            for (int var10 = 0; var10 < arg4; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 - (int) arg0 * 10));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg0 * 10));
            if (arg0 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZII)I")
    public static final int method3081(int arg0, boolean arg1, int arg2, int arg3) {
        field7540++;
        class11 var4 = class271.method1714(arg0, 0, arg1);
        if (var4 == null) {
            return -1;
        } else if (~arg2 <= arg3 && arg2 < var4.field151.length) {
            return var4.field151[arg2];
        } else {
            return -1;
        }
    }
}
