import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class95 {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Lni;")
    public static class367 field1382 = new class367(28, 3);

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "[Lqd;")
    public static class317[] field1383 = new class317[2048];

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([BI)Ljava/lang/String;", line = 4)
    public static final String method632(byte[] arg0, int arg1) {
        field1381++;
        int var2 = arg0.length;
        char[] var3 = new char[var2];
        if (arg1 != 25405) {
            return null;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            int var6 = arg0[var5] & 0xFF;
            if (var6 >= 128) {
                if (var6 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
                }
                if (var6 >= 224) {
                    if (var6 >= 240) {
                        if (var6 < 244) {
                            throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                        }
                        throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var6);
                    }
                    if (var5 + 2 >= var2) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    var5++;
                    int var7 = arg0[var5] & 0xFF;
                    if (var7 >= 128 && var7 <= 191) {
                        var5++;
                        int var8 = arg0[var5] & 0xFF;
                        if (var8 >= 128 && var8 <= 191) {
                            var3[var4++] = (char) class311.method1956(class519.method3092(-129, var8), class311.method1956(class519.method3092(-129, var7) << 6, class519.method3092(var6, -225) << 12));
                            continue;
                        }
                        throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                } else if (var2 > var5 + 1) {
                    var5++;
                    int var9 = arg0[var5] & 0xFF;
                    if (var9 < 128 || var9 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var3[var4++] = (char) class311.method1956(class519.method3092(var6, -193) << 6, class519.method3092(var9, -129));
                } else {
                    throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                }
            } else {
                var3[var4++] = (char) var6;
            }
        }
        return new String(var3, 0, var4);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 80)
    public static void method633(int arg0) {
        field1382 = null;
        if (arg0 != 255) {
            field1382 = null;
        }
        field1383 = null;
    }
}
