import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class282 {

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public int field4099 = 64;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public int field4094 = 1;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public int field4098 = 64;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "Z")
    public boolean field4100 = false;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public int field4092 = -1;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
    public int field4101 = 2;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "Z")
    public boolean field4102 = false;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "Lko;")
    public static class348 field4093;

    static {
        new class180("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lcp;IZILcp;)I", line = 7)
    public static final int method1779(class507 arg0, int arg1, boolean arg2, int arg3, class507 arg4) {
        field4095++;
        if (arg3 == 1) {
            int var5 = arg0.field7819;
            int var6 = arg4.field7819;
            if (!arg2) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return class161.method1166(arg0.method3000(-74).field2393, arg4.method3000(arg1 + 17924).field2393, class370.field5530, -90);
        } else if (arg3 == 3) {
            if (arg0.field7420.equals("-")) {
                if (arg4.field7420.equals("-")) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field7420.equals("-")) {
                return arg2 ? 1 : -1;
            } else {
                return class161.method1166(arg0.field7420, arg4.field7420, class370.field5530, -107);
            }
        } else if (arg3 == 4) {
            if (arg0.method3141(false)) {
                return arg4.method3141(false) ? 0 : 1;
            } else if (arg4.method3141(false)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 5) {
            if (arg0.method3140(-24517)) {
                return arg4.method3140(arg1 - 6580) ? 0 : 1;
            } else if (arg4.method3140(-24517)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 6) {
            if (arg0.method3147((byte) -127)) {
                return arg4.method3147((byte) -99) ? 0 : 1;
            } else if (arg4.method3147((byte) -110)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 7) {
            if (arg0.method3145(-2)) {
                return arg4.method3145(-2) ? 0 : 1;
            } else if (arg4.method3145(-2)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 8) {
            int var7 = arg0.field7413;
            int var8 = arg4.field7413;
            if (arg2) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var8 == -1) {
                    var8 = 1000;
                }
                if (var7 == -1) {
                    var7 = 1000;
                }
            }
            return var7 - var8;
        } else {
            if (arg1 != -17937) {
                method1783(89, -6, false, 90);
            }
            return arg0.field7415 - arg4.field7415;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V", line = 107)
    public static void method1780(int arg0) {
        field4093 = null;
        if (arg0 != 29337) {
            method1783(-47, -36, true, -122);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IILti;I)V", line = 121)
    private final void method1781(int arg0, int arg1, class303 arg2, int arg3) {
        field4096++;
        if (arg0 == 1) {
            this.field4092 = arg2.method1868(arg3 - 16579);
            if (this.field4092 == 65535) {
                this.field4092 = -1;
            }
        } else if (arg0 == 2) {
            this.field4099 = arg2.method1868(0) + 1;
            this.field4098 = arg2.method1868(0) + 1;
        } else if (arg0 == 3) {
            arg2.method1899((byte) 50);
        } else if (arg0 == 4) {
            this.field4101 = arg2.method1918((byte) -48);
        } else if (arg0 == 5) {
            this.field4094 = arg2.method1918((byte) 76);
        } else if (arg0 == 6) {
            this.field4100 = true;
        } else if (arg0 == 7) {
            this.field4102 = true;
        }
        if (arg3 != 16579) {
            this.method1782((byte) -21, 88, null);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BILti;)V", line = 187)
    public final void method1782(byte arg0, int arg1, class303 arg2) {
        while (true) {
            int var4 = arg2.method1918((byte) -67);
            if (var4 == 0) {
                field4097++;
                int var5 = -55 % ((-arg0 - 16) / 55);
                return;
            }
            this.method1781(var4, arg1, arg2, 16579);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIZI)I", line = 224)
    public static final int method1783(int arg0, int arg1, boolean arg2, int arg3) {
        field4103++;
        int var4 = -125 / ((47 - arg3) / 54);
        class78 var5 = class192.method1311(arg1, arg2, -29496);
        if (var5 == null) {
            return 0;
        } else if (arg0 >= 0 && var5.field1302.length > arg0) {
            return var5.field1302[arg0];
        } else {
            return 0;
        }
    }
}
