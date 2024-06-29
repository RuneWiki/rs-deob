import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class331 {

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "Lgf;")
    public static class180 field5097 = new class180("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    public static int field5100 = 0;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZI[BI)Ljava/lang/String;")
    public static final String method2188(boolean arg0, int arg1, byte[] arg2, int arg3) {
        field5099++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        if (arg0) {
            method2190((byte) 17);
        }
        for (int var6 = 0; var6 < arg3; var6++) {
            int var7 = arg2[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class60.field1047[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILbo;BIILqa;)V")
    public static final void method2189(int arg0, class510 arg1, byte arg2, int arg3, int arg4, class162 arg5) {
        field5098++;
        class494 var6 = class173.field2651.method1760(false, arg1.field7465);
        if (var6.field7198 == -1) {
            return;
        }
        int var7;
        if (arg1.field7452) {
            int var8 = arg1.field7460 + arg0;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class528 var9 = var6.method2944(-127, arg1.field7510, arg5, var7);
        if (var9 == null) {
            return;
        }
        int var10 = arg1.field7459;
        int var11 = arg1.field7475;
        if ((var7 & 0x1) == 1) {
            var10 = arg1.field7475;
            var11 = arg1.field7459;
        }
        int var12 = var9.method134();
        int var13 = var9.method131();
        if (var6.field7197) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (arg2 != -86) {
            field5100 = 121;
        }
        if (var6.field7199 == 0) {
            var9.method3127(arg4, arg3 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method136(arg4, arg3 - (var11 - 1) * 4, var12, var13, 0, var6.field7199 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V")
    public static void method2190(byte arg0) {
        field5097 = null;
        if (arg0 > -92) {
            field5100 = -7;
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)V")
    public static final void method2191(byte arg0) {
        field5096++;
        class437.method2640(0);
        class292.method1811(true);
        if (arg0 >= -127) {
            method2189(-35, null, (byte) -127, 60, 104, null);
        }
    }
}
