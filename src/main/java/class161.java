import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class161 {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "Lad;")
    private class11 field2093 = new class11(256);

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Lm;")
    private class79 field2096;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Lgk;")
    private class463 field2098;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Loi;")
    public static class169 field2094 = new class169("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "J")
    public static long field2100 = 0L;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "Lhb;")
    public static class250 field2101 = new class250(78, -1);

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 3)
    public static void method1072(int arg0) {
        if (arg0 == -1) {
            field2094 = null;
            field2101 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V", line = 19)
    public final void method1073(byte arg0) {
        this.field2093.method90((byte) -27);
        int var2 = 1 / ((arg0 + 32) / 33);
        field2097++;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBILmv;)V", line = 32)
    public static final void method1074(int arg0, byte arg1, int arg2, class518 arg3) {
        field2102++;
        if (arg1 != 86) {
            return;
        }
        if (arg3.field5191 == arg2 && arg2 != -1) {
            class44 var4 = class403.field5429.method1962(arg2, false);
            int var5 = var4.field643;
            if (var5 == 1) {
                arg3.field5177 = arg0;
                arg3.field5176 = 0;
                arg3.field5225 = 0;
                arg3.field5180 = 0;
                arg3.field5233 = 1;
                class284.method1729(arg3.field6239, arg3.field5176, 121, arg3.field6220, arg3.field6241, var4, class37.field573 == arg3);
            }
            if (var5 == 2) {
                arg3.field5225 = 0;
                return;
            }
        } else if (arg2 == -1 || arg3.field5191 == -1 || class403.field5429.method1962(arg2, false).field648 >= class403.field5429.method1962(arg3.field5191, false).field648) {
            arg3.field5191 = arg2;
            arg3.field5180 = 0;
            arg3.field5233 = 1;
            arg3.field5177 = arg0;
            arg3.field5176 = 0;
            arg3.field5225 = 0;
            arg3.field5252 = arg3.field5244;
            if (arg3.field5191 != -1) {
                class284.method1729(arg3.field6239, arg3.field5176, 116, arg3.field6220, arg3.field6241, class403.field5429.method1962(arg3.field5191, false), class37.field573 == arg3);
                return;
            }
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lgk;Lm;)V", line = 87)
    public class161(class463 arg0, class79 arg1) {
        this.field2096 = arg1;
        this.field2098 = arg0;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)Lsr;", line = 100)
    public final class346 method1075(byte arg0, int arg1) {
        field2103++;
        Object var3 = this.field2093.method78((long) arg1, (byte) -99);
        if (var3 != null) {
            return (class346) var3;
        } else if (this.field2096.method461(arg1, false)) {
            class499 var4 = this.field2096.method460(-26282, arg1);
            int var5 = -86 % ((-arg0 - 49) / 57);
            int var6 = var4.field7331 ? 64 : this.field2098.field6681;
            class346 var8;
            if (var4.field7347 && this.field2098.method879()) {
                float[] var7 = this.field2096.method459(false, 0.7F, (byte) 84, var6, var6, arg1);
                var8 = new class346(this.field2098, 3553, 34842, var6, var6, var4.field7339 != 0, var7, 6408);
            } else {
                short var9;
                int[] var10;
                if (var4.field7349 && class284.method1731(-13615, var4.field7352)) {
                    var9 = 6407;
                    var10 = this.field2096.method458(0.7F, var6, var6, (byte) 0, false, arg1);
                } else {
                    var10 = this.field2096.method457(var6, false, 0.7F, 12071, arg1, var6);
                    var9 = 6408;
                }
                var8 = new class346(this.field2098, 3553, var9, var6, var6, var4.field7339 != 0, var10, false);
            }
            var8.method2040(var4.field7350, (byte) 89, var4.field7345);
            this.field2093.method88((long) arg1, 90, var8);
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V", line = 156)
    public final void method1076(int arg0) {
        field2095++;
        this.field2093.method80(-79, 5);
        if (arg0 < 65) {
            field2101 = null;
        }
    }
}
