import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class143 extends class449 {

    @OriginalMember(owner = "client!to", name = "v", descriptor = "I")
    public int field1992;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "I")
    public int field1987;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "Lap;")
    public static class310 field1988 = new class310(15, 8);

    @OriginalMember(owner = "client!to", name = "x", descriptor = "[Ll;")
    public static class177[] field1994 = new class177[8];

    @OriginalMember(owner = "client!to", name = "z", descriptor = "I")
    public static int field1996 = 0;

    @OriginalMember(owner = "client!to", name = "y", descriptor = "[I")
    public static int[] field1995 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!to", name = "A", descriptor = "Lrc;")
    public static class108 field1997 = new class108(74, 10);

    @OriginalMember(owner = "client!to", name = "B", descriptor = "Lrc;")
    public static class108 field1998;

    @OriginalMember(owner = "client!to", name = "C", descriptor = "[I")
    public static int[] field1999;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!to", name = "w", descriptor = "I")
    public static int field1993;

    // $FF: synthetic field
    @OriginalMember(owner = "client!to", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field2000;

    // $FF: synthetic method
    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1032(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class151(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field1998 = new class108(59, 1);
        field1999 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "([[IB)V", line = 3)
    public static final void method1026(int[][] arg0, byte arg1) {
        field1993++;
        if (arg1 == 10) {
            class373.field5141 = arg0;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIII)V", line = 15)
    public static final void method1027(int arg0, int arg1, int arg2, int arg3) {
        class52 var4 = class385.field5285[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class371 var5 = var4.field755;
        class371 var6 = var4.field756;
        if (var5 != null) {
            var5.field5105 = var5.field5105 * arg3 / 16;
            var5.field5115 = var5.field5115 * arg3 / 16;
        }
        if (var6 != null) {
            var6.field5105 = var6.field5105 * arg3 / 16;
            var6.field5115 = var6.field5115 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(III)V", line = 40)
    public static final void method1028(int arg0, int arg1, int arg2) {
        boolean var3 = class385.field5285[0][arg1][arg2] != null && class385.field5285[0][arg1][arg2].field757 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class385.field5285[var4][arg1][arg2] == null) {
                class52 var5 = class385.field5285[var4][arg1][arg2] = new class52(var4, arg1, arg2);
                if (var3) {
                    var5.field749++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(I)V", line = 64)
    public static void method1029(int arg0) {
        field1997 = null;
        field1994 = null;
        field1988 = null;
        field1998 = null;
        field1995 = null;
        field1999 = null;
        if (arg0 >= -72) {
            field1995 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "e", descriptor = "(I)V", line = 79)
    public static final void method1030(int arg0) {
        field1989++;
        try {
            Method var1 = (field2000 == null ? (field2000 = method1032("java.lang.Runtime")) : field2000).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class198.field2928 = var3;
                } catch (Throwable var5) {
                }
            }
            int var4 = 86 / ((-arg0 - 50) / 32);
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!to", name = "f", descriptor = "(I)Lid;", line = 112)
    public static final class266 method1031(int arg0) {
        field1991++;
        if (class330.field4572 == null || class8.field62 == null) {
            return null;
        }
        class8.field62.method2718(true, class330.field4572);
        if (arg0 != -16881) {
            return null;
        }
        class266 var1 = (class266) class8.field62.method2717(arg0 ^ 0x7F6);
        if (var1 == null) {
            return null;
        } else {
            class76 var2 = class330.field4569.method2321(var1.field3826, true);
            return var2 != null && var2.field1089 && var2.method674(31590, class330.field4563) ? var1 : class464.method2773(arg0 + 16881);
        }
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(II)V", line = 146)
    public class143(int arg0, int arg1) {
        this.field1992 = arg1;
        this.field1987 = arg0;
    }
}
