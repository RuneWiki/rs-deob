import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class62 {

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "Ljava/lang/String;")
    private String field909 = "null";

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "Lch;")
    public static class151 field907;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "Lbn;")
    public static class321 field912;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "C")
    public char field895;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "C")
    public char field896;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    private int field894;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "Lwk;")
    public class155 field897;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "Lwk;")
    private class155 field906;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "Z")
    public static boolean field913;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method560(boolean arg0, String arg1) {
        field902++;
        if (this.field897 == null) {
            return false;
        }
        if (this.field906 == null) {
            this.method567(-49);
        }
        class93 var3 = (class93) this.field906.method1104(-126, class77.method683(arg1, 0));
        if (!arg0) {
            method564((class89) null, (byte) -27);
        }
        while (var3 != null) {
            if (var3.field1313.equals(arg1)) {
                return true;
            }
            var3 = (class93) this.field906.method1099((byte) 110);
        }
        return false;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    private final void method561(int arg0) {
        field910++;
        this.field906 = new class155(this.field897.method1098(true));
        for (class478 var2 = (class478) this.field897.method1097(64); var2 != null; var2 = (class478) this.field897.method1105(false)) {
            class478 var3 = new class478((int) var2.field6382);
            this.field906.method1100(var3, -44, (long) var2.field6789);
        }
        if (arg0 != 0) {
            this.method560(false, (String) null);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public final String method562(boolean arg0, int arg1) {
        field903++;
        if (this.field897 == null) {
            return this.field909;
        }
        class69 var3 = (class69) this.field897.method1104(-128, (long) arg1);
        if (var3 == null) {
            return this.field909;
        } else {
            if (!arg0) {
                field912 = null;
            }
            return var3.field1007;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lkk;I)V")
    public final void method563(class161 arg0, int arg1) {
        field901++;
        while (true) {
            int var3 = arg0.method1172((byte) 75);
            if (var3 == 0) {
                if (arg1 == 12) {
                    return;
                } else {
                    this.method563((class161) null, -108);
                    return;
                }
            }
            this.method569(-32, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lvc;B)V")
    public static final void method564(class89 arg0, byte arg1) {
        field908++;
        if (class307.field4348 != class262.field3781.field4531) {
            int var2 = -34 / ((-arg1 - 88) / 34);
            if (class385.field5285 != null && class289.method1897(arg0, -107, class262.field3781.field4531)) {
                class307.field4348 = class262.field3781.field4531;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Z")
    public final boolean method565(int arg0, int arg1) {
        field898++;
        if (this.field897 == null) {
            return false;
        }
        if (this.field906 == null) {
            this.method561(0);
        }
        class478 var3 = (class478) this.field906.method1104(arg0 - 134, (long) arg1);
        if (arg0 != 10) {
            this.method567(31);
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "()V")
    public static final void method566() {
        for (int var0 = 0; var0 < class239.field3495; var0++) {
            class325 var1 = class360.field4950[var0];
            class176.method1271(var1);
            class360.field4950[var0] = null;
        }
        class239.field3495 = 0;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    private final void method567(int arg0) {
        field905++;
        if (arg0 > -2) {
            this.method567(3);
        }
        this.field906 = new class155(this.field897.method1098(true));
        for (class69 var2 = (class69) this.field897.method1097(64); var2 != null; var2 = (class69) this.field897.method1105(false)) {
            class93 var3 = new class93(var2.field1007, (int) var2.field6382);
            this.field906.method1100(var3, -113, class77.method683(var2.field1007, 0));
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[Lrn;)V")
    public static final void method568(int arg0, class417[] arg1) {
        field904++;
        class389.field5380 = arg1.length;
        class217.field3142 = new int[class389.field5380 + 10];
        class387.field5303 = new class417[class389.field5380 + 10];
        class214.method1448(arg1, 0, class387.field5303, 0, class389.field5380);
        for (int var2 = arg0; var2 < class389.field5380; var2++) {
            class217.field3142[var2] = class387.field5303[var2].method1295();
        }
        for (int var3 = class389.field5380; var3 < class387.field5303.length; var3++) {
            class217.field3142[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILkk;)V")
    private final void method569(int arg0, int arg1, class161 arg2) {
        int var4 = -64 / ((arg0 - 28) / 50);
        field899++;
        if (arg1 == 1) {
            this.field896 = class441.method2681(16, arg2.method1152(-1910700904));
        } else if (arg1 == 2) {
            this.field895 = class441.method2681(16, arg2.method1152(-1910700904));
        } else if (arg1 == 3) {
            this.field909 = arg2.method1186(-1);
        } else if (arg1 == 4) {
            this.field894 = arg2.method1168(255);
        } else if (arg1 == 5 || arg1 == 6) {
            int var5 = arg2.method1134(-16848);
            this.field897 = new class155(class169.method1230(0, var5));
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg2.method1168(255);
                class449 var8;
                if (arg1 == 5) {
                    var8 = new class69(arg2.method1186(-1));
                } else {
                    var8 = new class478(arg2.method1168(255));
                }
                this.field897.method1100(var8, 109, (long) var7);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public static void method570(byte arg0) {
        field907 = null;
        int var1 = 57 / ((arg0 + 4) / 56);
        field912 = null;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)I")
    public final int method571(int arg0, int arg1) {
        field900++;
        if (this.field897 == null) {
            return this.field894;
        }
        class478 var3 = (class478) this.field897.method1104(-125, (long) arg1);
        if (arg0 != -6) {
            this.method560(true, (String) null);
        }
        return var3 == null ? this.field894 : var3.field6789;
    }

    static {
        new class151("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field907 = new class151(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");
        field912 = null;
        field911 = 0;
    }
}
