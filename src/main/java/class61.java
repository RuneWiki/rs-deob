import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class61 extends class337 {

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "Lki;")
    public static class498 field919 = new class498(21, 4);

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    public static int field930 = 1;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
    public static int field927 = 0;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "Z")
    public static boolean field932 = false;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "Llt;")
    public static class475 field925 = new class475("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public int field912;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    public int field916;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "I")
    public int field917;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
    public int field926;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    public int field931;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "Lnq;")
    public class319 field923;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "Lsh;")
    public class49 field915;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "Lmc;")
    public class87 field920;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "Lct;")
    public class97 field922;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 6)
    public static final void method359(String arg0, byte arg1) {
        int var2 = -87 / ((arg1 - 40) / 37);
        field910++;
        class401.method2418(0, "", 0, "", arg0, false);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 17)
    public final void method360(int arg0) {
        this.field920 = null;
        field921++;
        this.field915 = null;
        int var2 = -30 % ((-arg0 - 11) / 51);
        this.field923 = null;
        this.field922 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IC)Z", line = 45)
    public static final boolean method361(int arg0, char arg1) {
        field929++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class42.method250(arg1, (byte) -120)) {
            return true;
        } else if (arg0 == 4) {
            char[] var2 = class454.field6726;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class46.field733;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V", line = 90)
    public static void method362(int arg0) {
        field925 = null;
        if (arg0 == 0) {
            field919 = null;
        }
    }
}
