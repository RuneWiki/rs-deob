import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class114 {

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "[Lnp;")
    private class85[] field1554;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    private int field1559;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "Lum;")
    public static class82 field1562;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "J")
    private long field1561;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Ldn;")
    public static class201 field1565;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Lnp;")
    private class85 field1555;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "Ljava/lang/Object;")
    public static Object field1564;

    static {
        new class169("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field1562 = new class82("LOCAL", 4);
        new class169("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V", line = 20)
    public static final void method741(byte arg0) {
        int var1 = 94 % ((arg0 + 63) / 56);
        if (class254.field3207 != null) {
            class254.field3207.method2950((byte) 125);
        }
        field1563++;
        if (class531.field7820 != null) {
            class531.field7820.method2950((byte) 123);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Lnp;", line = 38)
    public final class85 method742(int arg0) {
        field1558++;
        if (arg0 >= -106) {
            this.field1555 = null;
        }
        if (this.field1555 == null) {
            return null;
        }
        class85 var2 = this.field1554[(int) ((long) (this.field1559 - 1) & this.field1561)];
        while (this.field1555 != var2) {
            if (this.field1555.field1143 == this.field1561) {
                class85 var3 = this.field1555;
                this.field1555 = this.field1555.field1151;
                return var3;
            }
            this.field1555 = this.field1555.field1151;
        }
        this.field1555 = null;
        return null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(JI)Lnp;", line = 70)
    public final class85 method743(long arg0, int arg1) {
        this.field1561 = arg0;
        field1556++;
        class85 var4 = this.field1554[(int) ((long) (this.field1559 - 1) & arg0)];
        for (this.field1555 = var4.field1151; this.field1555 != var4; this.field1555 = this.field1555.field1151) {
            if (this.field1555.field1143 == arg0) {
                class85 var5 = this.field1555;
                this.field1555 = this.field1555.field1151;
                return var5;
            }
        }
        if (arg1 != 0) {
            field1564 = null;
        }
        this.field1555 = null;
        return null;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V", line = 99)
    public static void method744(int arg0) {
        int var1 = 29 / ((-arg0 - 15) / 57);
        field1562 = null;
        field1565 = null;
        field1564 = null;
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V", line = 110)
    public static final void method745(int arg0) {
        class420.method2472((byte) -101, class240.field3104);
        field1560++;
        class319.field4106++;
        class319.field4112.method565(arg0 - 117, 0);
        if (arg0 != -1) {
            method741((byte) -1);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IJLnp;)V", line = 130)
    public final void method746(int arg0, long arg1, class85 arg2) {
        field1557++;
        if (arg2.field1146 != null) {
            arg2.method540((byte) 122);
        }
        class85 var5 = this.field1554[(int) ((long) (this.field1559 - 1) & arg1)];
        arg2.field1151 = var5;
        arg2.field1146 = var5.field1146;
        if (arg0 <= 45) {
            method741((byte) 38);
        }
        arg2.field1146.field1151 = arg2;
        arg2.field1151.field1146 = arg2;
        arg2.field1143 = arg1;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(I)V", line = 149)
    public class114(int arg0) {
        this.field1554 = new class85[arg0];
        this.field1559 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class85 var3 = this.field1554[var2] = new class85();
            var3.field1146 = var3;
            var3.field1151 = var3;
        }
    }
}
