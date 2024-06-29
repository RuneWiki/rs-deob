import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class87 {

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "Lku;")
    private class232 field1049 = new class232(128);

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "Lku;")
    public class232 field1057 = new class232(64);

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "Lb;")
    private class201 field1051;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "Lb;")
    public class201 field1052;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "[I")
    public static int[] field1060;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "Ltr;")
    public static class176 field1062;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
    public static final void method483(byte arg0) {
        field1056++;
        class232 var1 = class143.field1895;
        synchronized (class143.field1895) {
            class143.field1895.method1478((byte) -106);
        }
        class232 var2 = class368.field5316;
        synchronized (class368.field5316) {
            class368.field5316.method1478((byte) -126);
        }
        int var3 = -70 / ((31 - arg0) / 36);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
    public static void method484(int arg0) {
        field1060 = null;
        if (arg0 > -60) {
            field1061 = -79;
        }
        field1062 = null;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
    public final void method485(int arg0) {
        class232 var2 = this.field1049;
        synchronized (this.field1049) {
            this.field1049.method1475(0);
        }
        field1055++;
        class232 var3 = this.field1057;
        synchronized (this.field1057) {
            this.field1057.method1475(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V")
    public final void method486(int arg0, int arg1) {
        class232 var3 = this.field1049;
        synchronized (this.field1049) {
            this.field1049.method1486(arg0 + 438126864, arg1);
        }
        field1048++;
        class232 var4 = this.field1057;
        synchronized (this.field1057) {
            if (arg0 != 256) {
                field1061 = 69;
            }
            this.field1057.method1486(438127120, arg1);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)V")
    public final void method487(int arg0, int arg1, int arg2) {
        this.field1049 = new class232(arg1);
        field1059++;
        this.field1057 = new class232(arg2);
        if (arg0 != 27843) {
            method484(1);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BZILjava/lang/String;)Z")
    public static final boolean method488(byte arg0, boolean arg1, int arg2, String arg3) {
        field1050++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg0 == -30) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg3.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg3.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg1) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    return false;
                }
                if (arg2 <= var11) {
                    return false;
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg2 * var6 + var11;
                if (var10 / arg2 != var6) {
                    return false;
                }
                var5 = true;
                var6 = var10;
            }
            return var5;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
    public final void method489(int arg0) {
        class232 var2 = this.field1049;
        synchronized (this.field1049) {
            this.field1049.method1478((byte) -121);
        }
        field1058++;
        class232 var3 = this.field1057;
        synchronized (this.field1057) {
            this.field1057.method1478((byte) -88);
            if (arg0 != 0) {
                this.method486(30, 63);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)Lqo;")
    public final class19 method490(int arg0, int arg1) {
        field1053++;
        class232 var3 = this.field1049;
        class19 var4;
        synchronized (this.field1049) {
            var4 = (class19) this.field1049.method1479(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1051.method1257(arg1, arg0, 24558);
        class19 var6 = new class19();
        var6.field266 = arg1;
        var6.field246 = this;
        if (var5 != null) {
            var6.method130(new class276(var5), (byte) 108);
        }
        var6.method135((byte) -42);
        class232 var7 = this.field1049;
        synchronized (this.field1049) {
            this.field1049.method1473(var6, (long) arg1, -36);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lea;ILb;Lb;)V")
    public class87(class353 arg0, int arg1, class201 arg2, class201 arg3) {
        this.field1051 = arg2;
        this.field1052 = arg3;
        this.field1051.method1235(0, 36);
    }

    static {
        new class326("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field1061 = 0;
        field1060 = new int[256];
    }
}
