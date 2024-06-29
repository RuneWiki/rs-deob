import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class463 extends class211 {

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field6747 = new String[] { method3524(method3523("I\u0017D7l")), method3524(method3523("I\u0017D1l")), method3524(method3523("XZD[9")), method3524(method3523("M\u0001\u0006\u0019")), method3524(method3523("I\u0017D4l")) };

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "[I")
    public static int[] field6740 = new int[14];

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "Lqea;")
    public static class139 field6741 = new class139();

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "[J")
    public static long[] field6745 = new long[10];

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "D")
    public static double field6743;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "Lkca;")
    public static class91 field6746;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)[I")
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field6739;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (super.field3231.field57) {
                class467.method3551(var3, 0, class343.field5332, class302.field4735[arg1]);
            }
            if (arg0 != 8217) {
                this.method197(-14, 91);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6747[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILjava/io/File;)[B")
    public static final byte[] method3521(int arg0, int arg1, File arg2) {
        try {
            ++field6742;
            try {
                byte[] var3 = new byte[arg0];
                class182.method1590(arg0, var3, arg2, 16);
                return arg1 != 10 ? null : var3;
            } catch (IOException var5) {
                return null;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6747[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6747[2] : field6747[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
    public static void method3522(boolean arg0) {
        try {
            field6741 = null;
            field6746 = null;
            field6745 = null;
            field6740 = null;
            if (!arg0) {
                method3521(-39, 90, (File) null);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6747[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class463() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3523(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 68);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3524(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 116;
                    break;
                case 2:
                    var10005 = 106;
                    break;
                case 3:
                    var10005 = 117;
                    break;
                default:
                    var10005 = 68;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
