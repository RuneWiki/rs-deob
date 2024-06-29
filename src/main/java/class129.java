import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class129 {

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Liq;")
    public static class362 field1566 = new class362("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Lle;")
    public static class166 field1569 = class99.method550(25329);

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field1572 = 0;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Ltq;")
    public static class376 field1571;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 6)
    public static final void method796(boolean arg0, int arg1, String arg2) {
        field1564++;
        class20 var3 = class369.method2351((byte) 86, 2, arg1);
        var3.method146(88);
        if (!arg0) {
            field1566 = null;
        }
        var3.field263 = arg2;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)Z", line = 20)
    public static final boolean method797(int arg0) {
        field1563++;
        class302 var1 = (class302) class393.field5547.field1104.field5854;
        if (var1 == null || class393.field5547.field1104 == var1) {
            return false;
        } else {
            if (~var1.field4247 <= arg0) {
                var1.field4247 -= 2000;
            }
            return var1.field4247 == 1006;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V", line = 41)
    public static final void method798(int arg0) {
        field1562++;
        int[] var1 = new int[class237.field3379];
        int var2 = 0;
        for (int var3 = 0; var3 < class237.field3379; var3++) {
            class163 var5 = class50.method288(0, var3);
            if (var5.field2224 >= 0 || var5.field2274 >= 0) {
                var1[var2++] = var3;
            }
        }
        class376.field5269 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class376.field5269[var4] = var1[var4];
        }
        if (arg0 != -30495) {
            method801(19);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)[B", line = 80)
    public static final synchronized byte[] method799(int arg0, boolean arg1) {
        field1567++;
        if (arg0 == 100 && class338.field4799 > 0) {
            byte[] var2 = class401.field5734[--class338.field4799];
            class401.field5734[class338.field4799] = null;
            return var2;
        }
        if (!arg1) {
            field1572 = 100;
        }
        if (arg0 == 5000 && class337.field4791 > 0) {
            byte[] var3 = class199.field2825[--class337.field4791];
            class199.field2825[class337.field4791] = null;
            return var3;
        } else if (arg0 == 30000 && class99.field1212 > 0) {
            byte[] var4 = class33.field387[--class99.field1212];
            class33.field387[class99.field1212] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V", line = 120)
    public static void method800(int arg0) {
        field1569 = null;
        field1571 = null;
        if (arg0 != 0) {
            field1568 = 32;
        }
        field1566 = null;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V", line = 135)
    public static final void method801(int arg0) {
        class18.field211.method1626((byte) 106);
        field1565++;
        if (arg0 != 2) {
            field1568 = -22;
        }
    }
}
