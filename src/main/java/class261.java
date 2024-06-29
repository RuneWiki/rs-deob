import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class261 implements Runnable {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "[Lhk;")
    public volatile class127[] field3945 = new class127[2];

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Z")
    public volatile boolean field3950 = false;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Z")
    public volatile boolean field3947 = false;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field3946 = 0;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field3952 = 0;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Z")
    public static boolean field3954 = true;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Ld;")
    public class244 field3949;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field3951;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1724(byte[] arg0, int arg1) {
        field3955++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class115.method775(arg0, 0, var3, 0, var2);
        if (arg1 != -24259) {
            method1724((byte[]) null, -25);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static void method1725(byte arg0) {
        field3951 = null;
        int var1 = 87 / ((32 - arg0) / 53);
    }

    @OriginalMember(owner = "client!fe", name = "run", descriptor = "()V")
    public final void run() {
        this.field3947 = true;
        try {
            while (!this.field3950) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class127 var2 = this.field3945[var1];
                    if (var2 != null) {
                        var2.method850(-73);
                    }
                }
                class28.method182(10L, 127);
                class186.method1194((Object) null, (byte) 13, this.field3949);
            }
        } catch (Exception var9) {
            class221.method1426((String) null, -1, var9);
        } finally {
            Object var6 = null;
            this.field3947 = false;
        }
        field3953++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIZJI)Ljava/lang/String;")
    public static final String method1726(int arg0, int arg1, boolean arg2, long arg3, int arg4) {
        field3948++;
        char var6 = '.';
        boolean var7 = false;
        if (arg3 < 0L) {
            var7 = true;
            arg3 = -arg3;
        }
        if (arg1 != -11776) {
            field3954 = true;
        }
        char var8 = ',';
        if (arg0 == 0) {
            var6 = ',';
            var8 = '.';
        }
        if (arg0 == 2) {
            var6 = ' ';
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg4 > 0) {
            for (int var10 = 0; var10 < arg4; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg3 * 10)));
            }
            var9.append(var8);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg3 * 10)));
            if (arg3 == 0L) {
                if (var7) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg2) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var6);
                }
            }
        }
    }
}
