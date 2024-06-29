import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class89 extends class260 {

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Lqp;")
    public static class466 field1291 = new class466("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "Lnj;")
    public static class162 field1301 = new class162(50);

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field1304 = 0;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public static int field1303 = 1;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public int field1296;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public int field1298;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "Ll;")
    public static class16 field1306;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "[I")
    public int[] field1293;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "[I")
    public int[] field1294;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "[I")
    public int[] field1295;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "[Lta;")
    public static class142[] field1302;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "[Ljv;")
    public class56[] field1297;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "[Ljv;")
    public class56[] field1299;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "[[[B")
    public byte[][][] field1300;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "[[[Lhg;")
    public static class486[][][] field1305;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
    public static void method669(int arg0) {
        field1305 = null;
        if (arg0 != 0) {
            field1305 = null;
        }
        field1291 = null;
        field1301 = null;
        field1306 = null;
        field1302 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lya;Lij;III)V")
    public static final void method670(class38 arg0, class291 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class206.field2881) {
            class486 var5 = field1305[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field7100 != null && var5.field7100.method492(-1)) {
                arg1.method498(arg0, class424.field6241, true, var5.field7100, 0, 0, -1);
            }
        }
        if (arg4 < class206.field2881) {
            class486 var6 = field1305[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field7100 != null && var6.field7100.method492(-1)) {
                arg1.method498(arg0, 0, true, var6.field7100, class424.field6241, 0, -1);
            }
        }
        if (arg3 < class206.field2881 && arg4 < class371.field5427) {
            class486 var7 = field1305[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field7100 != null && var7.field7100.method492(-1)) {
                arg1.method498(arg0, class424.field6241, true, var7.field7100, class424.field6241, 0, -1);
            }
        }
        if (arg3 < class206.field2881 && arg4 > 0) {
            class486 var8 = field1305[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field7100 != null && var8.field7100.method492(-1)) {
                arg1.method498(arg0, class424.field6241, true, var8.field7100, -class424.field6241, 0, -1);
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZLjava/lang/String;ZI)Z")
    public static final boolean method671(boolean arg0, String arg1, boolean arg2, int arg3) {
        field1292++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = arg2;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg3 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if ((var10 / arg3) != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }
}
