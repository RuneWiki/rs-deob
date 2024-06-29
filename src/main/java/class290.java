import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class290 extends class561 {

    @OriginalMember(owner = "client!qo", name = "Q", descriptor = "I")
    public static int field3885 = 0;

    @OriginalMember(owner = "client!qo", name = "P", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!qo", name = "R", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!qo", name = "S", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!qo", name = "T", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[B)Ljava/lang/String;", line = 3)
    public static final String method1723(int arg0, byte[] arg1) {
        field3888++;
        int var2 = arg1.length;
        char[] var3 = new char[var2];
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -129) {
            field3886 = -30;
        }
        while (var5 < var2) {
            int var6 = arg1[var5] & 0xFF;
            if (var6 >= 128) {
                if (var6 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
                }
                if (var6 < 224) {
                    if (var5 + 1 >= var2) {
                        throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                    }
                    var5++;
                    int var7 = arg1[var5] & 0xFF;
                    if (var7 < 128 || var7 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var3[var4++] = (char) class288.method1722(class230.method1424(var6, -193) << 6, class230.method1424(-129, var7));
                } else {
                    label71: {
                        if (var6 >= 240) {
                            if (var6 >= 244) {
                                throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var6);
                            }
                            throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                        }
                        if (var2 <= (var5 + 2)) {
                            throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                        }
                        var5++;
                        int var8 = arg1[var5] & 0xFF;
                        if (var8 >= 128 && var8 <= 191) {
                            var5++;
                            int var9 = arg1[var5] & 0xFF;
                            if (var9 >= 128 && var9 <= 191) {
                                var3[var4++] = (char) class288.method1722(class288.method1722(class230.method1424(var8 << 6, -8256), class230.method1424(var6 << 12, -921600)), class230.method1424(var9, -129));
                                break label71;
                            }
                            throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                        }
                        throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                    }
                }
            } else {
                var3[var4++] = (char) var6;
            }
            var5++;
        }
        return new String(var3, 0, var4);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V", line = 90)
    public static final void method1724(boolean arg0) {
        class606.field8280.method1986(((float) class72.field935.field6533 * 0.1F + 0.7F) * 1.1523438F);
        field3884++;
        if (!arg0) {
            method1724(true);
        }
        class606.field8280.method1991(class679.field9657, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class606.field8280.method2001(class4.field41, -1, 0);
        class606.field8280.method1952(class59.field835);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "([SI[Ljava/lang/String;)V", line = 106)
    public static final void method1725(short[] arg0, int arg1, String[] arg2) {
        field3887++;
        class307.method1842(arg1, arg2.length - 1, arg2, (byte) 82, arg0);
    }
}
