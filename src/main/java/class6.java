import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 {

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static volatile int field139 = 0;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "[B")
    public static byte[] field140 = new byte[520];

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field144 = 0;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "Lje;")
    public static class67 field146 = class85.method592(255, "<col=00ffff>");

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Lje;")
    public static class67 field148 = class85.method592(255, "blinken2:");

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Lac;")
    public static class4 field142 = new class4();

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "J")
    public static long field147;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Lfd;")
    public static class40 field141;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lkc;B)Z")
    public static final boolean method53(class72 arg0, byte arg1) {
        if (arg1 != 70) {
            field139 = -14;
        }
        field145++;
        if (arg0.field1558 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field1558.length; var2++) {
            int var3 = class137.method1047(var2, true, arg0);
            int var4 = arg0.field1522[var2];
            if (arg0.field1558[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field1558[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field1558[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method54(int arg0) {
        field140 = null;
        field142 = null;
        if (arg0 != 3) {
            method56(false, null, 0);
        }
        field146 = null;
        field141 = null;
        field148 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
    public static final Object method55(boolean arg0, byte[] arg1, int arg2) {
        field143++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class149.field3421) {
            try {
                class159 var3 = (class159) Class.forName("ke").getDeclaredConstructor().newInstance();
                var3.method534(-127, arg1);
                return var3;
            } catch (Throwable var4) {
                class149.field3421 = true;
            }
        }
        if (arg2 != 3) {
            method55(true, null, -52);
        }
        return arg0 ? class65.method439(arg1, (byte) 57) : arg1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLje;I)V")
    public static final void method56(boolean arg0, class67 arg1, int arg2) {
        if (arg2 != 14489) {
            field147 = 127L;
        }
        field138++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class40.field714.method796(arg1, 250);
        int var7 = class40.field714.method789(arg1, 250) * 13;
        class8.method70(var5 - var3, -var3 + var4, var3 + var6 + var3, var7 - -var3 + var3, 0);
        class8.method68(var5 - var3, -var3 + var4, var3 + var6 + var3, var7 - -var3 + var3, 16777215);
        class40.field714.method786(arg1, var5, var4, var6, var7, 16777215, -1, 1, 1, 0);
        class115.method930(var3 + var3 + var6, arg2 + -14537, var4 - var3, var7 - -var3 + var3, var5 - var3);
        if (!arg0) {
            class27.method179(var7, var4, var5, 0, var6);
            return;
        }
        try {
            Graphics var8 = class98.field2193.getGraphics();
            class81.field1792.method102(true, 0, var8, 0);
        } catch (Exception var9) {
            class98.field2193.repaint();
        }
    }
}
