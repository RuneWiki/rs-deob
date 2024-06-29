import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class304 {

    @OriginalMember(owner = "client!io", name = "a", descriptor = "Lje;")
    public static class278 field4548 = new class278(12, 0, 1, 0);

    @OriginalMember(owner = "client!io", name = "i", descriptor = "[I")
    public static int[] field4556 = new int[6];

    @OriginalMember(owner = "client!io", name = "h", descriptor = "Z")
    public static boolean field4555 = false;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "Lbj;")
    public static class162 field4552 = new class162(58, 18);

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field4554;

    static {
        new class309("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Z", line = 7)
    public static final boolean method1941(int arg0, int arg1, int arg2) {
        field4551++;
        return (class22.field333[arg2][arg1][arg0] & 0x2) != 0;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V", line = 18)
    public static final void method1942(int arg0, String arg1, String arg2, String arg3, boolean arg4, int arg5, String arg6, int arg7) {
        field4549++;
        for (int var8 = 99; var8 > 0; var8--) {
            class393.field6008[var8] = class393.field6008[var8 - 1];
            class328.field4975[var8] = class328.field4975[var8 - 1];
            class258.field3951[var8] = class258.field3951[var8 - 1];
            class127.field2175[var8] = class127.field2175[var8 - 1];
            class163.field2618[var8] = class163.field2618[var8 - 1];
            class276.field4176[var8] = class276.field4176[var8 - 1];
            class220.field3463[var8] = class220.field3463[var8 - 1];
        }
        class393.field6008[0] = arg7;
        class328.field4975[0] = arg5;
        class258.field3951[0] = arg6;
        class127.field2175[0] = arg3;
        class163.field2618[0] = arg2;
        class220.field3463[0] = arg0;
        if (!arg4) {
            method1945((byte) -42);
        }
        class499.field7331 = class112.field2032;
        class276.field4176[0] = arg1;
        class438.field6511++;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 53)
    public static final String method1943(byte arg0, long arg1) {
        field4550++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else if (arg0 == 116) {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class363.field5310[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZI)V", line = 104)
    public static final void method1944(boolean arg0, int arg1) {
        field4553++;
        class403.method2510((byte) -85);
        class387.method2370((byte) -65);
        class418.method2559(arg1, 0, true);
        class312.method1987(class483.field7117, class262.field4006, 0, class455.field6758);
        class143.method1070(0, class262.field4006, class455.field6758);
        class348.method2171((byte) -24);
        class172.method1195(class420.field6340, -121);
        class102.method895(0);
        if (arg0) {
            method1946(null, -123, 89);
        }
        if (class466.field6932 == 2) {
            class253.method1639(3, -16646);
        } else if (class466.field6932 == 6) {
            class253.method1639(7, -16646);
        } else if (class466.field6932 == 9) {
            class253.method1639(10, -16646);
            return;
        } else if (class466.field6932 == 1) {
            class434.method2604(class455.field6758, class262.field4006, 0);
            return;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V", line = 142)
    public static void method1945(byte arg0) {
        if (arg0 > -106) {
            method1944(true, 94);
        }
        field4556 = null;
        field4548 = null;
        field4552 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "([FII)[F", line = 168)
    public static final float[] method1946(float[] arg0, int arg1, int arg2) {
        int var3 = 76 % ((-arg1 - 44) / 58);
        field4554++;
        float[] var4 = new float[arg2];
        class394.method2449(arg0, 0, var4, 0, arg2);
        return var4;
    }
}
