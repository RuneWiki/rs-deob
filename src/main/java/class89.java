import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class89 {

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "Leea;")
    private class114 field1023;

    @OriginalMember(owner = "client!kba", name = "j", descriptor = "[I")
    public static int[] field1031;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "Luj;")
    private class324 field1025;

    static {
        new class474("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        field1031 = new int[14];
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)V", line = 3)
    public static final void method569(byte arg0) {
        field1027++;
        if (arg0 != 93) {
            method573(-94, 90, -117, 75, 81, -104);
        }
        for (class276 var1 = (class276) class518.field7540.method719(false); var1 != null; var1 = (class276) class518.field7540.method716(14)) {
            class56 var2 = var1.field3849;
            if (var2.field651) {
                var1.method2108(true);
                var2.method415(-1533);
            } else if (var2.field641 <= class287.field3982) {
                var2.method412(class529.field7661, true);
                if (var2.field651) {
                    var1.method2108(true);
                } else {
                    class367.method2355(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)V", line = 41)
    public static void method570(int arg0) {
        field1031 = null;
        if (arg0 != -11419) {
            method570(89);
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lrt;I)V", line = 51)
    public static final void method571(class194 arg0, int arg1) {
        field1024++;
        int var2 = arg0.method1176((byte) 123);
        class453.field6778 = new class263[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class453.field6778[var3] = new class263();
            class453.field6778[var3].field3740 = arg0.method1176((byte) 124);
            class453.field6778[var3].field3735 = arg0.method1201(arg1 ^ 0xFFFF8DAF);
        }
        class190.field2385 = arg0.method1176((byte) 127);
        class359.field5090 = arg0.method1176((byte) -30);
        if (arg1 != 1) {
            field1031 = null;
        }
        class561.field8011 = arg0.method1176((byte) 125);
        class203.field2700 = new class511[class359.field5090 + 1 - class190.field2385];
        for (int var4 = 0; var4 < class561.field8011; var4++) {
            int var5 = arg0.method1176((byte) -119);
            class511 var6 = class203.field2700[var5] = new class511();
            var6.field6344 = arg0.method1177(255);
            var6.field6346 = arg0.method1178(-230315992);
            var6.field7469 = class190.field2385 + var5;
            var6.field7467 = arg0.method1201(-29266);
            var6.field7471 = arg0.method1201(-29266);
        }
        class450.field6725 = arg0.method1178(-230315992);
        class529.field7659 = true;
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)Luj;", line = 104)
    public final class324 method572(int arg0) {
        field1026++;
        class324 var2 = this.field1023.field1413.field4681;
        if (this.field1023.field1413 == var2) {
            this.field1025 = null;
            return null;
        }
        if (arg0 != 12491) {
            this.method572(-17);
        }
        this.field1025 = var2.field4681;
        return var2;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIIIII)V", line = 126)
    public static final void method573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class113.field1385 <= arg2 && class4.field43 >= arg1 && class418.field6298 <= arg4 && class461.field6877 >= arg0) {
            class202.method1276(arg1, arg5, arg0, arg2, -17806, arg4);
        } else {
            class492.method2954(arg3 ^ 0xE, arg1, arg4, arg5, arg2, arg0);
        }
        field1022++;
        if (arg3 != 14) {
            field1031 = null;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZBLjava/lang/Object;)[B", line = 143)
    public static final byte[] method574(boolean arg0, byte arg1, Object arg2) {
        field1029++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class558.method3236(0, var3) : var3;
        } else if (arg2 instanceof class67) {
            class67 var4 = (class67) arg2;
            return var4.method461(5);
        } else if (arg1 <= 39) {
            return null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "(I)Luj;", line = 179)
    public final class324 method575(int arg0) {
        field1028++;
        class324 var2 = this.field1025;
        if (this.field1023.field1413 == var2) {
            this.field1025 = null;
            return null;
        }
        this.field1025 = var2.field4681;
        if (arg0 != 18032) {
            this.field1025 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(BLeea;)V", line = 201)
    public final void method576(byte arg0, class114 arg1) {
        this.field1023 = arg1;
        if (arg0 != 14) {
            this.method575(58);
        }
        field1030++;
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "()V", line = 216)
    public class89() {
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Leea;)V", line = 218)
    public class89(class114 arg0) {
        this.field1023 = arg0;
    }
}
