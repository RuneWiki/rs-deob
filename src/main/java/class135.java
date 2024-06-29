import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class135 extends RuntimeException {

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1968;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Ljava/lang/String;")
    public String field1969;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "[I")
    public static int[] field1967 = new int[1024];

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field1962 = -1;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field1970 = 0;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Laq;")
    public static class90 field1963;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public static void method943(boolean arg0) {
        field1963 = null;
        field1967 = null;
        if (arg0) {
            field1963 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
    public static final void method944(int arg0, int arg1) {
        if (arg1 < -95) {
            field1966++;
            class13.field258 = arg0;
            class248.field3509.method905((byte) 48);
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class135(Throwable arg0, String arg1) {
        this.field1968 = arg0;
        this.field1969 = arg1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lbe;Z)Z")
    public static final boolean method945(class25 arg0, boolean arg1) {
        field1964++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field441) {
            return false;
        } else if (!arg1) {
            return true;
        } else if (!arg0.method298((byte) 67)) {
            return false;
        } else if (class406.field5775.method886((long) arg0.field420, 25651) == null) {
            return class126.field1780.method886((long) arg0.field429, 25651) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method946(int arg0, int arg1, int arg2, Class arg3) {
        class125 var4 = class328.field4549[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class123 var5 = var4.field1749; var5 != null; var5 = var5.field1711) {
            class447 var6 = var5.field1709;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6261 == arg1 && var6.field6258 == arg2) {
                class278.method1811(var6);
                return;
            }
        }
    }
}
