import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class112 {

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Lju;")
    public static class102 field1595 = new class102(45, 3);

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "[I")
    public static int[] field1597 = new int[1];

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static final void method751(byte arg0) {
        field1596++;
        class90.field1217 = class514.field7181.field10338 + class514.field7181.field10332 + 2;
        int var1 = 125 % ((19 - arg0) / 45);
        class69.field980 = class442.field6064.field10332 + class442.field6064.field10338 + 2;
        class688.field9646 = new String[500];
        for (int var2 = 0; var2 < class688.field9646.length; var2++) {
            class688.field9646[var2] = "";
        }
        class645.method3738(class138.field1833.method891(-2041650704, class369.field4721), (byte) -49);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III[B)Ljava/lang/String;")
    public static final String method752(int arg0, int arg1, int arg2, byte[] arg3) {
        field1594++;
        char[] var4 = new char[arg0];
        int var5 = 0;
        int var6 = arg1;
        if (arg2 != 258048) {
            field1597 = null;
        }
        int var7 = arg0 + arg1;
        while (var7 > var6) {
            int var8 = arg3[var6++] & 0xFF;
            int var9;
            if (var8 >= 128) {
                if (var8 < 192) {
                    var9 = 65533;
                } else if (var8 < 224) {
                    if (var6 < var7 && (arg3[var6] & 0xC0) == 128) {
                        var9 = (var8 & 0x1F) << 6 | arg3[var6++] & 0x3F;
                        if (var9 < 128) {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (var8 >= 240) {
                    if (var8 >= 248) {
                        var9 = 65533;
                    } else if (var7 > (var6 + 2) && (arg3[var6] & 0xC0) == 128 && (arg3[var6 + 1] & 0xC0) == 128 && (arg3[var6 + 2] & 0xC0) == 128) {
                        int var10 = arg3[var6++] & 0x3F << 12 | (var8 & 0x7) << 18 | (arg3[var6++] & 0x3F) << 6 | arg3[var6++] & 0x3F;
                        if (var10 >= 65536 && var10 <= 1114111) {
                            var9 = 65533;
                        } else {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (var7 > var6 + 1 && (arg3[var6] & 0xC0) == 128 && (arg3[var6 + 1] & 0xC0) == 128) {
                    var9 = (arg3[var6++] & 0x3F) << 6 | var8 & 0xF << 12 | arg3[var6++] & 0x3F;
                    if (var9 < 2048) {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var8 == 0) {
                var9 = 65533;
            } else {
                var9 = var8;
            }
            var4[var5++] = (char) var9;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static void method753(int arg0) {
        field1597 = null;
        if (arg0 == -129) {
            field1595 = null;
        }
    }
}
