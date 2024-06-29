import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class78 {

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "[Llk;")
    private class84[] field1087;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Llc;")
    public static class86 field1090 = new class86(4);

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "F")
    public static float field1091 = 128.0F;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1092 = "rating: ";

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "[I")
    public static int[] field1093 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method501(int arg0) {
        field1092 = null;
        if (arg0 == 19304) {
            field1093 = null;
            field1090 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)I")
    public static final int method502(boolean arg0) {
        field1086++;
        return arg0 ? class5.field43 : 86;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(I)V")
    public class78(int arg0) {
        this.field1087 = new class84[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class84 var3 = this.field1087[var2] = new class84();
            var3.field1141 = var3;
            var3.field1143 = var3;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(CI)B")
    public static final byte method503(char arg0, int arg1) {
        field1089++;
        if (arg1 != -383) {
            field1091 = -0.40094024F;
        }
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIILsa;JLsa;Lsa;)V")
    public static final void method504(int arg0, int arg1, int arg2, int arg3, class268 arg4, long arg5, class268 arg6, class268 arg7) {
        class186 var9 = new class186();
        var9.field2566 = arg4;
        var9.field2564 = arg1 * 128 + 64;
        var9.field2562 = arg2 * 128 + 64;
        var9.field2567 = arg3;
        var9.field2569 = arg5;
        var9.field2561 = arg6;
        var9.field2572 = arg7;
        int var10 = 0;
        class89 var11 = class194.field2682[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1240; var12++) {
                class198 var13 = var11.field1226[var12];
                if ((var13.field2753 & 0x400000L) == 4194304L) {
                    int var14 = var13.field2752.method106();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2563 = -var10;
        if (class194.field2682[arg0][arg1][arg2] == null) {
            class194.field2682[arg0][arg1][arg2] = new class89(arg0, arg1, arg2);
        }
        class194.field2682[arg0][arg1][arg2].field1246 = var9;
    }
}
