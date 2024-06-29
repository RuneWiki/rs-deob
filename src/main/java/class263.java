import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class class263 {

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lbl;")
    public class442 field3984;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Lbg;")
    public static class310 field3985;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field3983;

    static {
        new class423("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field3985 = new class310(32, 6);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II[Ljava/lang/String;B)Ljava/lang/String;", line = 3)
    public static final String method1599(int arg0, int arg1, String[] arg2, byte arg3) {
        if (arg3 <= 121) {
            method1601((byte) 66);
        }
        field3983++;
        if (arg0 == 0) {
            return "";
        } else if (arg0 == 1) {
            String var4 = arg2[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg1;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lqq;I)V", line = 64)
    public static final void method1600(class318 arg0, int arg1) {
        arg0.method1982(0, 0, class482.field7368, 350);
        field3981++;
        arg0.method1971(0, 0, class482.field7368, 350, class116.field1958 << 24 | 0x332277, 1);
        int var2 = 350 / class160.field2517;
        if (class178.field2785 > 0) {
            int var3 = 346 - class160.field2517 - 4;
            int var4 = var2 * var3 / (var2 - (1 - class178.field2785));
            int var5 = 4;
            if (class178.field2785 > 1) {
                var5 += (var3 - var4) * (class178.field2785 - class388.field5619 - 1) / (class178.field2785 - 1);
            }
            arg0.method1971(class482.field7368 - 16, var5, 12, var4, class116.field1958 << 24 | 0x332277, 2);
            for (int var6 = class388.field5619; var6 < (class388.field5619 + var2) && var6 < class178.field2785; var6++) {
                String[] var7 = class499.method3003('\b', 1, class105.field1855[var6]);
                int var8 = (class482.field7368 - 16 - 8) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg0.method1982(var10, 0, var10 + var8 - 8, 350);
                    class217.field3343.method2938(-1, 350 - (class360.field5331 + ((var6 - class388.field5619) * class160.field2517)) - class380.field5545.field5779 - 2, var10, 32768, var7[var9], -16777216);
                }
            }
        }
        arg0.method1982(0, 0, class482.field7368, 350);
        if (arg1 < 25) {
            method1601((byte) -40);
        }
        arg0.method1889(350 - class360.field5331, -1, -75, class482.field7368, 0);
        class493.field7514.method2938(-1, 349 - class512.field7764.field5779, 10, 32768, "--> " + class117.field1964, -16777216);
        int var11 = -1;
        if ((class369.field5424 % 30) > 15) {
            var11 = 16777215;
        }
        arg0.method1946(class512.field7764.method2349("--> " + class117.field1964.substring(0, class511.field7749), 0) + 10, -class512.field7764.field5779 + 350 + -11, var11, 123, 12);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V", line = 128)
    public static void method1601(byte arg0) {
        if (arg0 == -28) {
            field3985 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lbl;)V", line = 150)
    public class263(class442 arg0) {
        this.field3984 = arg0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public abstract void method670(byte arg0);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V")
    public abstract void method673(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZB)V")
    public abstract void method669(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)V")
    public abstract void method666(int arg0, boolean arg1);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lce;IZ)V")
    public abstract void method671(class194 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Z")
    public abstract boolean method675(int arg0);
}
