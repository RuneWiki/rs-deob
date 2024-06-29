import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class379 extends InputStream {

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "Lbg;")
    public static class310 field5538 = new class310(23, 11);

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field5542 = 0;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "Lsk;")
    public static class423 field5543 = new class423("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
    public static final void method2280(int arg0) {
        field5541++;
        int var1 = class328.field4921;
        int[] var2 = class280.field4247;
        for (int var3 = 0; var3 < var1; var3++) {
            class47 var8 = class224.field3450[var2[var3]];
            if (var8 != null && var8.field2184 > 0) {
                var8.field2184--;
                if (var8.field2184 == 0) {
                    var8.field2203 = null;
                }
            }
        }
        int var4 = 118 % ((arg0 - 47) / 55);
        for (int var5 = 0; var5 < class352.field5175; var5++) {
            int var6 = class437.field6440[var5];
            class249 var7 = class195.field3085[var6];
            if (var7 != null && var7.field2184 > 0) {
                var7.field2184--;
                if (var7.field2184 == 0) {
                    var7.field2203 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "read", descriptor = "()I")
    public final int read() {
        class414.method2437(30000L, (byte) -122);
        field5539++;
        return -1;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2281(int arg0, int arg1, boolean arg2) {
        field5540++;
        class56 var3 = class128.field2070.method916((byte) -15, arg0);
        if (!arg2) {
            field5538 = null;
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method387((byte) 3, arg1);
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
    public static void method2282(int arg0) {
        if (arg0 == 11) {
            field5543 = null;
            field5538 = null;
        }
    }
}
