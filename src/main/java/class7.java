import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 extends class262 implements class448 {

    @OriginalMember(owner = "client!il", name = "E", descriptor = "Lpm;")
    public class415 field84;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "Z")
    private boolean field83;

    @OriginalMember(owner = "client!il", name = "P", descriptor = "Ljc;")
    public static class305 field94;

    @OriginalMember(owner = "client!il", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field100;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!il", name = "J", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!il", name = "M", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!il", name = "N", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!il", name = "O", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!il", name = "T", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!il", name = "U", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "Lvm;")
    public static class485 field97;

    static {
        new class305("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field94 = new class305("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");
        field100 = new String[100];
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(BLza;)V", line = 5)
    public final void method36(byte arg0, class287 arg1) {
        ++field96;
        if (arg0 > -120) {
            field97 = null;
        }
        class373 var3 = this.field84.method2544(super.field3514, super.field3515, arg1, true, (byte) 6, true, 262144);
        if (var3 != null) {
            int var4 = super.field3515 >> 7;
            int var5 = super.field3514 >> 7;
            this.field84.method2536(var3, var4, false, var4, var5, arg1, var5, false);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILza;BI)Z", line = 29)
    public final boolean method37(int arg0, class287 arg1, byte arg2, int arg3) {
        ++field95;
        class373 var5 = this.field84.method2544(super.field3514, super.field3515, arg1, false, (byte) 6, false, 131072);
        if (arg2 > -64) {
            this.field83 = false;
        }
        if (var5 == null) {
            return false;
        } else {
            class124 var6 = arg1.method1183();
            var6.method743(super.field3515, super.field3510, super.field3514);
            return var5.method2026(arg3, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(B)Z", line = 49)
    public final boolean method38(byte arg0) {
        ++field82;
        if (arg0 != -89) {
            this.method40(-57, 112, -51, false, -120, (class419) null, (class287) null);
        }
        return this.field84.method2545(arg0 + 11891);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IBLza;)Le;", line = 60)
    public final class373 method39(int arg0, byte arg1, class287 arg2) {
        if (arg1 != -54) {
            return null;
        } else {
            ++field88;
            return this.field84.method2544(0, 0, arg2, false, (byte) 6, false, arg0);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIZILot;Lza;)V", line = 71)
    public final void method40(int arg0, int arg1, int arg2, boolean arg3, int arg4, class419 arg5, class287 arg6) {
        int var8 = 62 / ((61 - arg0) / 47);
        ++field92;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(B)Z", line = 81)
    public final boolean method41(byte arg0) {
        if (arg0 != -62) {
            this.method46(4);
        }
        ++field91;
        return false;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(B)V", line = 92)
    public final void method42(byte arg0) {
        if (arg0 != 92) {
            this.method42((byte) -21);
        }
        ++field90;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "(I)V", line = 103)
    public static void method43(int arg0) {
        field94 = null;
        field97 = null;
        field100 = null;
        if (arg0 != -612420793) {
            method43(-71);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILza;)V", line = 116)
    public final void method44(int arg0, class287 arg1) {
        this.field84.method2549(1, arg1);
        ++field86;
        if (arg0 < 122) {
            this.method45(-92);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 128)
    public final void method45(int arg0) {
        ++field99;
        if (arg0 != 9479) {
            this.method39(103, (byte) -40, (class287) null);
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lza;Ler;IIIIIZIII)V", line = 140)
    public class7(class287 arg0, class70 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class216.method1378(arg8, arg9, -83));
        this.field84 = new class415(arg0, arg1, arg8, arg9, arg2, arg3, super.field3515, super.field3514, arg7, arg10);
        this.field83 = ~arg1.field886 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)I", line = 150)
    public final int method46(int arg0) {
        ++field87;
        int var2 = 95 % ((arg0 - -18) / 42);
        return this.field84.field5938;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)I", line = 160)
    public final int method47(int arg0) {
        ++field85;
        if (arg0 != -15774) {
            field94 = null;
        }
        return this.field84.field5949;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)I", line = 178)
    public final int method48(byte arg0) {
        ++field81;
        if (arg0 != -70) {
            this.method45(74);
        }
        return this.field84.field5977;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BLza;)V", line = 197)
    public final void method49(byte arg0, class287 arg1) {
        this.field84.method2534((byte) 127, arg1);
        ++field80;
        if (arg0 != -56) {
            this.method46(115);
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(BLza;)Luc;", line = 209)
    public final class23 method50(byte arg0, class287 arg1) {
        ++field89;
        class373 var3 = this.field84.method2544(super.field3514, super.field3515, arg1, true, (byte) 6, false, 2048);
        if (var3 == null) {
            return null;
        } else {
            class124 var4 = arg1.method1183();
            if (arg0 != -112) {
                return null;
            } else {
                var4.method743(super.field3515, super.field3510, super.field3514);
                class23 var5 = null;
                if (this.field83) {
                    var5 = class117.method703(1, arg0 ^ 19);
                }
                if (this.field84.field5954 == null) {
                    var3.method2051(var4, var5 != null ? var5.field226[0] : null, 0);
                } else {
                    class336 var6 = this.field84.field5954.method257();
                    arg1.method1203(var3, var6, var4, var5 != null ? var5.field226[0] : null, 0);
                }
                int var7 = super.field3515 >> 7;
                int var8 = super.field3514 >> 7;
                this.field84.method2536(var3, var7, false, var7, var8, arg1, var8, true);
                return var5;
            }
        }
    }
}
