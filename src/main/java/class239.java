import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class239 {

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Lig;")
    public static class206 field3400;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "[I")
    public static int[] field3402;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3403;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method1596(int arg0) {
        field3400 = null;
        field3403 = null;
        if (arg0 != 20) {
            method1598(false, null);
        }
        field3402 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/lang/String;ZIBZLjava/lang/String;)V")
    public static final void method1597(int arg0, String arg1, boolean arg2, int arg3, byte arg4, boolean arg5, String arg6) {
        field3398++;
        class345.field4942.field2708 = 1;
        String var7 = arg1.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg3 != -1) {
            class403 var11 = class565.field8053.method3495(arg4 - 107, arg3);
            if (var11 == null || var11.method2569((byte) -95) != arg2) {
                return;
            }
            if (var11.method2569((byte) -95)) {
                var10 = var11.field6091;
            } else {
                var9 = var11.field6089;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class622.field8999.field26; var13++) {
            class190 var16 = class622.field8999.method25(var13, -74);
            if ((!arg5 || var16.field2377) && var16.field2381 == -1 && var16.field2411 == -1 && var16.field2354 == 0 && var16.field2408.toLowerCase().indexOf(var7) != -1) {
                if (arg3 != -1) {
                    if (arg2) {
                        if (!arg6.equals(var16.method1133(var10, arg3, (byte) 34))) {
                            continue;
                        }
                    } else if (arg0 != var16.method1143(var9, 668, arg3)) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class289.field3995 = -1;
                    class571.field8241 = null;
                    return;
                }
                if (var8.length <= var12) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class289.field3995 = var12;
        class257.field3661 = 0;
        class571.field8241 = var8;
        String[] var14 = new String[class289.field3995];
        if (arg4 != 110) {
            field3403 = null;
        }
        for (int var15 = 0; var15 < class289.field3995; var15++) {
            var14[var15] = class622.field8999.method25(var8[var15], arg4 - 221).field2408;
        }
        class245.method1629(var14, (byte) 109, class571.field8241);
        class345.field4942.method1293(-23829);
        class345.field4942.field2708 = 2;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLpk;)V")
    public static final void method1598(boolean arg0, class171 arg1) {
        field3399++;
        arg1.field2109 = null;
        if (arg0 && class568.field8156 < 20) {
            class354.field5031.method3293(arg1, (byte) 127);
            class568.field8156++;
        }
    }

    static {
        new class474("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field3401 = 0;
        field3400 = new class206(65, 1);
        field3402 = new int[1];
        field3403 = new CRC32();
    }
}
