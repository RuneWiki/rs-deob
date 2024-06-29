import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class132 extends class445 {

    @OriginalMember(owner = "client!cu", name = "w", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!cu", name = "u", descriptor = "Lgd;")
    public static class206 field1936;

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!cu", name = "x", descriptor = "I")
    public int field1939;

    @OriginalMember(owner = "client!cu", name = "y", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!cu", name = "A", descriptor = "I")
    public int field1942;

    @OriginalMember(owner = "client!cu", name = "v", descriptor = "Lon;")
    public static class203 field1937;

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "[I")
    public static int[] field1934;

    @OriginalMember(owner = "client!cu", name = "B", descriptor = "[[[J")
    public static long[][][] field1943;

    static {
        new class206("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field1938 = 0;
        field1936 = new class206("red:", "rot:", "rouge:", "vermelho:");
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIZII)V", line = 3)
    public static final void method805(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 <= 59) {
            field1937 = null;
        }
        class225.field2972 = arg1;
        class23.field300 = arg2;
        field1941++;
        class13.field176 = arg5;
        class1.field12 = arg3;
        class169.field2338 = arg6;
        if (arg4 && class1.field12 >= 100) {
            class197.field2680 = class169.field2338 * 128 + 64;
            class412.field5637 = class225.field2972 * 128 + 64;
            class195.field2638 = class247.method1385(87, class197.field2680, class412.field5637, class373.field5104) - class13.field176;
        }
        class56.field772 = 2;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 28)
    public static final byte[] method806(String arg0, byte arg1) {
        field1940++;
        if (arg1 <= 92) {
            return null;
        }
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIIIB)V", line = 168)
    public static final void method807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field1935++;
        int var7 = arg2 - arg0;
        if (arg6 != -104) {
            return;
        }
        int var8 = arg5 + arg0;
        for (int var9 = arg5; var9 < var8; var9++) {
            class330.method1834(arg4, class102.field1472[var9], arg3, arg1, arg6 + 25188);
        }
        int var10 = arg1 + arg0;
        for (int var11 = arg2; var11 > var7; var11--) {
            class330.method1834(arg4, class102.field1472[var11], arg3, arg1, 25084);
        }
        int var12 = arg4 - arg0;
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class102.field1472[var13];
            class330.method1834(var10, var14, arg3, arg1, 25084);
            class330.method1834(arg4, var14, arg3, var12, 25084);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)I", line = 213)
    public static final int method808(int arg0, int arg1) {
        return class56.field768 == null ? 0 : class56.field768[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V", line = 222)
    public static void method809(int arg0) {
        field1936 = null;
        if (arg0 == -27868) {
            field1943 = null;
            field1937 = null;
            field1934 = null;
        }
    }
}
