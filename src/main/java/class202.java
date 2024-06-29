import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class202 {

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "S")
    public short field2927;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "B")
    public byte field2925;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "B")
    public byte field2922;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "Luv;")
    public class243 field2921;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "[I")
    public static int[] field2926;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "Lvp;")
    public static class123 field2923;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
    public static void method1366(int arg0) {
        field2926 = null;
        int var1 = -44 / ((arg0 - 2) / 53);
        field2923 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1367(int arg0, String arg1) {
        field2924++;
        if (arg1 == null) {
            return;
        }
        if (arg0 != 1) {
            field2923 = null;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class343.method2237(arg1, (byte) -57);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class520.field7636; var3++) {
            String var4 = class83.field1361[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class343.method2237(var4, (byte) -57);
            if (var5 != null && var5.equals(var2)) {
                class520.field7636--;
                for (int var6 = var3; var6 < class520.field7636; var6++) {
                    class83.field1361[var6] = class83.field1361[var6 + 1];
                    class173.field2656[var6] = class173.field2656[var6 + 1];
                    class451.field6586[var6] = class451.field6586[var6 + 1];
                    class408.field6017[var6] = class408.field6017[var6 + 1];
                    class374.field5600[var6] = class374.field5600[var6 + 1];
                }
                class60.field1046++;
                class92.field1521 = class285.field4130;
                class114.method841(false, class112.field1781);
                class86.field1436.method1923((byte) 62, class8.method57(-99, arg1));
                class86.field1436.method1882((byte) -92, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Luv;III)V")
    public class202(class243 arg0, int arg1, int arg2, int arg3) {
        this.field2927 = (short) arg1;
        this.field2925 = (byte) arg3;
        this.field2922 = (byte) arg2;
        this.field2921 = arg0;
    }

    static {
        new class180("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field2926 = new int[32];
        field2923 = new class123(47, 3);
        field2928 = 0;
    }
}
