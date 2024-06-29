import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public abstract class class463 extends class76 {

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public int field6731;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public int field6725;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public int field6719;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public int field6724;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    public int field6735;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public int field6723;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public int field6728;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field6720 = 1;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public static int field6730 = 64;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "[I")
    public static int[] field6732 = new int[2];

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field6729 = new String[100];

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
    public static int field6737 = 0;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "Lub;")
    public static class18 field6722 = new class18("WIP", 2);

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    public static int field6736;

    static {
        new class83("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZZJII)Ljava/lang/String;", line = 3)
    public static final String method2723(boolean arg0, boolean arg1, long arg2, int arg3, int arg4) {
        if (!arg0) {
            return null;
        }
        field6733++;
        char var6 = ',';
        char var7 = '.';
        if (arg3 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg3 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg2 < 0L) {
            arg2 = -arg2;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg4 > 0) {
            for (int var10 = 0; var10 < arg4; var10++) {
                int var11 = (int) arg2;
                arg2 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg2 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg2;
            arg2 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg2 * 10)));
            if (arg2 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)V", line = 90)
    public static final void method2724(int arg0) {
        for (class430 var1 = (class430) class428.field6257.method2308((byte) 20); var1 != null; var1 = (class430) class428.field6257.method2308((byte) 20)) {
            class408.method2354(0, var1);
        }
        field6734++;
        if (arg0 > -71) {
            return;
        }
        int var2;
        int var3;
        if (class437.field6374.method560((byte) 115, class278.field3761)) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class304.field4173;
            var3 = class304.field4173;
        }
        client.method1205();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method1192();
            client.method1198(var4);
            client.method1204(var4);
        }
        client.method1197();
        client.method1208();
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)V", line = 134)
    public final void method398(int arg0) {
        if (arg0 > 74) {
            field6726++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)Z", line = 150)
    public final boolean method399(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field6727++;
            return false;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILco;ILqa;ZZ)V", line = 164)
    public final void method394(int arg0, int arg1, class76 arg2, int arg3, class162 arg4, boolean arg5, boolean arg6) {
        if (arg6) {
            field6736++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "(I)V", line = 189)
    public static void method2725(int arg0) {
        int var1 = -55 % ((17 - arg0) / 34);
        field6729 = null;
        field6722 = null;
        field6732 = null;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(IIIIIII)V", line = 199)
    public class463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6731 = arg5;
        this.field6725 = arg2;
        this.field6719 = arg4;
        this.field6724 = arg3;
        this.field6735 = arg0;
        this.field6723 = arg1;
        this.field6728 = arg6;
    }

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "(I)I")
    public abstract int method1837(int arg0);
}
