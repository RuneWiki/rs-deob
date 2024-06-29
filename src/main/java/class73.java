import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class class73 {

    @OriginalMember(owner = "client!di", name = "d", descriptor = "[I")
    public static int[] field1002 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field1001 = 0;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field1003 = 1405;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field999;

    // $FF: synthetic field
    @OriginalMember(owner = "client!di", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field1004;

    // $FF: synthetic method
    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method480(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class206("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 8)
    public static final void method474(int arg0) {
        if (arg0 != 0) {
            method474(-31);
        }
        field999++;
        try {
            Method var1 = (field1004 == null ? (field1004 = method480("java.lang.Runtime")) : field1004).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class244.field3242 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V", line = 37)
    public static void method476(int arg0) {
        field1002 = null;
        if (arg0 < 52) {
            method476(-7);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "()V", line = 50)
    public static final void method478() {
        for (int var0 = 0; var0 < class400.field5504; var0++) {
            class471 var1 = class480.field6635[var0];
            class401.method2429(var1);
            class480.field6635[var0] = null;
        }
        class400.field5504 = 0;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZZ)V", line = 74)
    public static final void method479(boolean arg0, boolean arg1) {
        field1000++;
        if (arg0) {
            method479(false, true);
        }
        class450.method2646(class72.field986, class196.field2674, arg1, (byte) -99, class424.field5738);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)Lra;")
    public abstract class63 method472(boolean arg0);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V")
    public abstract void method473(int arg0, int arg1);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)I")
    public abstract int method475(int arg0, byte arg1);

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II)[B")
    public abstract byte[] method477(int arg0, int arg1);
}
