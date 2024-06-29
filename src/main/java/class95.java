import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class95 {

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Lhp;")
    public static class277 field1124 = new class277(200);

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Z")
    public static boolean field1125 = false;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field1126 = -60;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([BI)Ljava/lang/String;")
    public static final String method598(byte[] arg0, int arg1) {
        field1122++;
        if (arg1 > -56) {
            field1125 = false;
        }
        int var2 = arg0.length;
        char[] var3 = new char[var2];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            int var6 = arg0[var5] & 0xFF;
            if (var6 < 128) {
                var3[var4++] = (char) var6;
            } else if (var6 < 194) {
                throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
            } else if (var6 >= 224) {
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
                        var3[var4++] = (char) class283.method1834(class643.method3659(var8, -129), class283.method1834(class643.method3659(var6 << 12, -921600), class643.method3659(var7, -129) << 6));
                        continue;
                    }
                    throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                }
                throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
            } else if (var5 + 1 < var2) {
                var5++;
                int var9 = arg0[var5] & 0xFF;
                if (var9 < 128 || var9 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var3[var4++] = (char) class283.method1834(class643.method3659(var9, -129), class643.method3659(var6 << 6, -12352));
            } else {
                throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
            }
        }
        return new String(var3, 0, var4);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method599(int arg0) {
        field1124 = null;
        int var1 = -119 % ((arg0 + 78) / 35);
    }
}
