import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class285 {

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field3751 = 1;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Lao;")
    public static class191 field3755 = new class191(104, -2);

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "[I")
    public static int[] field3756 = new int[200];

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Lao;")
    public static class191 field3757 = new class191(18, 3);

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Lgb;")
    public static class145 field3758;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V", line = 10)
    public static void method1712(byte arg0) {
        field3758 = null;
        field3757 = null;
        field3756 = null;
        if (arg0 != -126) {
            field3756 = null;
        }
        field3755 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V", line = 27)
    public static final void method1713(boolean arg0) {
        field3752++;
        class106.field1443.field5729 = 0;
        if (!arg0) {
            field3756 = null;
        }
        class334.field4414.field5729 = 0;
        class430.field6246 = 0;
        class93.field1117 = null;
        class272.field3626 = null;
        class434.field6334 = null;
        class188.field2437 = null;
        class132.field1742 = 0;
        class384.field5586 = 0;
        class126.method762((byte) 121);
        class195.method1118(-89);
        for (int var1 = 0; var1 < 2048; var1++) {
            class29.field272[var1] = null;
        }
        class96.field1170 = null;
        for (int var2 = 0; var2 < class339.field4484.length; var2++) {
            class22 var4 = class339.field4484[var2];
            if (var4 != null) {
                var4.field1156 = -1;
            }
        }
        class247.method1529(arg0);
        class47.field491 = 1;
        class57.method345(1, 9);
        for (int var3 = 0; var3 < 100; var3++) {
            class442.field6427[var3] = true;
        }
        class85.method463(4510);
        class488.field7160 = 0L;
        class102.field1387 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 83)
    public static final byte[] method1714(int arg0, String arg1) {
        field3753++;
        int var2 = 105 % ((arg0 - 68) / 41);
        int var3 = arg1.length();
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            char var6 = arg1.charAt(var5);
            if (var6 > '\u0000' && var6 < '\u0080' || var6 >= ' ' && var6 <= 'ÿ') {
                var4[var5] = (byte) var6;
            } else if (var6 == '€') {
                var4[var5] = -128;
            } else if (var6 == '‚') {
                var4[var5] = -126;
            } else if (var6 == 'ƒ') {
                var4[var5] = -125;
            } else if (var6 == '„') {
                var4[var5] = -124;
            } else if (var6 == '…') {
                var4[var5] = -123;
            } else if (var6 == '†') {
                var4[var5] = -122;
            } else if (var6 == '‡') {
                var4[var5] = -121;
            } else if (var6 == 'ˆ') {
                var4[var5] = -120;
            } else if (var6 == '‰') {
                var4[var5] = -119;
            } else if (var6 == 'Š') {
                var4[var5] = -118;
            } else if (var6 == '‹') {
                var4[var5] = -117;
            } else if (var6 == 'Œ') {
                var4[var5] = -116;
            } else if (var6 == 'Ž') {
                var4[var5] = -114;
            } else if (var6 == '‘') {
                var4[var5] = -111;
            } else if (var6 == '’') {
                var4[var5] = -110;
            } else if (var6 == '“') {
                var4[var5] = -109;
            } else if (var6 == '”') {
                var4[var5] = -108;
            } else if (var6 == '•') {
                var4[var5] = -107;
            } else if (var6 == '–') {
                var4[var5] = -106;
            } else if (var6 == '—') {
                var4[var5] = -105;
            } else if (var6 == '˜') {
                var4[var5] = -104;
            } else if (var6 == '™') {
                var4[var5] = -103;
            } else if (var6 == 'š') {
                var4[var5] = -102;
            } else if (var6 == '›') {
                var4[var5] = -101;
            } else if (var6 == 'œ') {
                var4[var5] = -100;
            } else if (var6 == 'ž') {
                var4[var5] = -98;
            } else if (var6 == 'Ÿ') {
                var4[var5] = -97;
            } else {
                var4[var5] = 63;
            }
        }
        return var4;
    }
}
