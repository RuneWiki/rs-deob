import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class118 {

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Lkj;")
    private class47 field1635 = new class47();

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Lgo;")
    private class304 field1640 = new class304();

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    private int field1638;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    private int field1642;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Lwk;")
    private class155 field1641;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Lap;")
    public static class310 field1633 = new class310(44, 16);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field1643;

    static {
        new class151("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLjava/lang/String;)I", line = 6)
    public static final int method916(byte arg0, String arg1) {
        field1639++;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 == 57) {
            for (int var4 = 0; var4 < var2; var4++) {
                var3 = (var3 << 5) + arg1.charAt(var4) - var3;
            }
            return var3;
        } else {
            return 29;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IJ)Lkj;", line = 39)
    public final class47 method917(int arg0, long arg1) {
        if (arg0 != -6700) {
            this.field1640 = null;
        }
        field1634++;
        class47 var4 = (class47) this.field1641.method1104(arg0 ^ 0x1A57, arg1);
        if (var4 != null) {
            this.field1640.method1962((byte) -67, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 69)
    public static void method918(int arg0) {
        field1633 = null;
        if (arg0 != 10244) {
            method919((class76) null, 30);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lwe;I)Z", line = 80)
    public static final boolean method919(class76 arg0, int arg1) {
        if (arg1 != -18334) {
            field1643 = 125;
        }
        field1637++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field1096) {
            return false;
        } else if (!arg0.method674(31590, class330.field4563)) {
            return false;
        } else if (class442.field6276.method1104(-128, (long) arg0.field1098) == null) {
            return class267.field3838.method1104(-126, (long) arg0.field1100) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V", line = 107)
    public final void method920(int arg0) {
        this.field1640.method1960(-257);
        field1631++;
        this.field1641.method1101((byte) 91);
        if (arg0 != -51) {
            this.method917(-58, -53L);
        }
        this.field1635 = new class47();
        this.field1642 = this.field1638;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(I)V", line = 222)
    public class118(int arg0) {
        this.field1638 = arg0;
        this.field1642 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1641 = new class155(var2);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([BZ)[B", line = 132)
    public static final byte[] method921(byte[] arg0, boolean arg1) {
        field1636++;
        class161 var2 = new class161(arg0);
        int var3 = var2.method1172((byte) 14);
        int var4 = var2.method1168(255);
        if (var4 < 0 || !(class408.field5582 == 0 || class408.field5582 >= var4)) {
            throw new RuntimeException();
        } else if (!arg1) {
            return null;
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1179(var4, 0, var5, false);
            return var5;
        } else {
            int var6 = var2.method1168(255);
            if (var6 < 0 || !(class408.field5582 == 0 || var6 <= class408.field5582)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class287.method1887(var7, var6, arg0, var4, 9);
            } else {
                class391.field5402.method1817(var7, var2, true);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(JILkj;)V", line = 188)
    public final void method922(long arg0, int arg1, class47 arg2) {
        field1632++;
        if (this.field1642 == 0) {
            class47 var5 = this.field1640.method1961((byte) 49);
            var5.method2714(55);
            var5.method479((byte) -8);
            if (this.field1635 == var5) {
                class47 var6 = this.field1640.method1961((byte) 49);
                var6.method2714(55);
                var6.method479((byte) -8);
            }
        } else {
            this.field1642--;
        }
        this.field1641.method1100(arg2, -116, arg0);
        if (arg1 <= 53) {
            method916((byte) -121, (String) null);
        }
        this.field1640.method1962((byte) -67, arg2);
    }
}
