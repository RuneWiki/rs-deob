import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class335 {

    @OriginalMember(owner = "client!di", name = "m", descriptor = "Llm;")
    public static class31 field5241;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "[C")
    public static char[] field5242;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public int field5233;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public int field5236;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    private int field5239;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Leq;")
    public class259 field5230;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V")
    public static final void method2222(int arg0, int arg1) {
        if (arg1 != 0) {
            method2229(null, -72);
        }
        if (class290.field4590 == null || class290.field4590.length < arg0) {
            class290.field4590 = new int[arg0];
        }
        field5232++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static void method2223(int arg0) {
        field5242 = null;
        if (arg0 != 12762) {
            method2226(-67);
        }
        field5241 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)[Lvk;")
    public static final class305[] method2224(byte arg0) {
        field5234++;
        int var1 = 98 / ((arg0 + 12) / 53);
        return new class305[] { class120.field1642, class162.field2353, class327.field5129 };
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lhw;II)V")
    private final void method2225(class208 arg0, int arg1, int arg2) {
        if (arg1 == arg2) {
            this.field5239 = arg0.method1455(-3387);
        } else if (arg1 == 2) {
            this.field5236 = arg0.method1445(-105);
            this.field5233 = arg0.method1445(arg2 ^ 0xFFFFFFA7);
        }
        field5231++;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)[Lfg;")
    public static final class298[] method2226(int arg0) {
        field5229++;
        if (arg0 != 0) {
            field5237 = 126;
        }
        return new class298[] { class432.field6519, class432.field6520, class432.field6521, class432.field6522, class432.field6523, class432.field6524, class432.field6525, class432.field6526, class432.field6527, class432.field6528, class432.field6529, class432.field6530 };
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(B)Lok;")
    public final synchronized class175 method2227(byte arg0) {
        field5235++;
        if (arg0 != 61) {
            this.field5239 = -4;
        }
        class175 var2 = (class175) this.field5230.field4188.method2191((byte) -73, (long) this.field5239);
        if (var2 != null) {
            return var2;
        }
        class175 var3 = class175.method1115(this.field5230.field4183, this.field5239, 0);
        if (var3 != null) {
            this.field5230.field4188.method2188(-122, (long) this.field5239, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lhw;I)V")
    public final void method2228(class208 arg0, int arg1) {
        field5240++;
        if (arg1 != -98) {
            return;
        }
        while (true) {
            int var3 = arg0.method1445(-80);
            if (var3 == 0) {
                return;
            }
            this.method2225(arg0, var3, 1);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method2229(String arg0, int arg1) {
        field5238++;
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        if (arg1 != 37) {
            method2229(null, -50);
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    static {
        new class213("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        new class213("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field5241 = new class31(0, 6);
        field5242 = new char[] { '[', ']', '#' };
    }
}
