import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class418 {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Lho;")
    public static class103 field6071 = new class103(13, 3);

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Lao;")
    public static class191 field6073 = new class191(71, 10);

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Ljc;")
    public static class305 field6075 = new class305("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Lho;")
    public static class103 field6076 = new class103(52, 6);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V", line = 6)
    public static final void method2584(int arg0, int arg1) {
        if (arg0 != 244) {
            return;
        }
        field6072++;
        if (class97.field1260 == 0) {
            class246.field3235.method595(arg1, 10542);
        } else {
            class204.field2703 = arg1;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V", line = 23)
    public static void method2585(boolean arg0) {
        field6073 = null;
        field6071 = null;
        if (arg0) {
            field6071 = null;
        }
        field6076 = null;
        field6075 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([BI)Ljava/lang/String;", line = 36)
    public static final String method2586(byte[] arg0, int arg1) {
        if (arg1 != 191) {
            method2584(-27, 4);
        }
        field6070++;
        int var2 = arg0.length;
        char[] var3 = new char[var2];
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
                    if ((var5 + 2) >= var2) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    var5++;
                    int var7 = arg0[var5] & 0xFF;
                    if (var7 >= 128 && var7 <= 191) {
                        var5++;
                        int var8 = arg0[var5] & 0xFF;
                        if (var8 >= 128 && var8 <= 191) {
                            var3[var4++] = (char) class219.method1381(class219.method1381(class95.method534(-921600, var6 << 12), class95.method534(-129, var7) << 6), class95.method534(-129, var8));
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
                    var3[var4++] = (char) class219.method1381(class95.method534(var9, -129), class95.method534(var6, -193) << 6);
                } else {
                    throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                }
            } else {
                var3[var4++] = (char) var6;
            }
        }
        return new String(var3, 0, var4);
    }
}
