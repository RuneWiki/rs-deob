import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class118 {

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "[Lbba;")
    public static class98[] field1795 = new class98[14];

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Lvu;")
    public class306 field1793;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "[[[S")
    public static short[][][] field1796;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method909(byte arg0) {
        if (arg0 > -72) {
            method909((byte) -52);
        }
        field1795 = null;
        field1796 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lla;)V")
    public static final void method910(class416 arg0) {
        class248.field3861 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([BI)Ljava/lang/String;")
    public static final String method911(byte[] arg0, int arg1) {
        field1794++;
        int var2 = arg0.length;
        char[] var3 = new char[var2];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            int var6 = arg0[var5] & 0xFF;
            if (var6 >= 128) {
                if (var6 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
                }
                if (var6 < 224) {
                    if (var2 <= var5 + 1) {
                        throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                    }
                    var5++;
                    int var7 = arg0[var5] & 0xFF;
                    if (var7 < 128 || var7 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var3[var4++] = (char) class486.method2826(class689.method3797(-129, var7), class689.method3797(-193, var6) << 6);
                } else if (var6 < 240) {
                    if (var5 + 2 >= var2) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    var5++;
                    int var8 = arg0[var5] & 0xFF;
                    if (var8 >= 128 && var8 <= 191) {
                        var5++;
                        int var9 = arg0[var5] & 0xFF;
                        if (var9 >= 128 && var9 <= 191) {
                            var3[var4++] = (char) class486.method2826(class486.method2826(class689.method3797(-129, var8) << 6, class689.method3797(var6, -225) << 12), class689.method3797(-129, var9));
                            continue;
                        }
                        throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                } else if (var6 < 244) {
                    throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                } else {
                    throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var6);
                }
            } else {
                var3[var4++] = (char) var6;
            }
        }
        if (arg1 != 255) {
            field1795 = null;
        }
        return new String(var3, 0, var4);
    }
}
