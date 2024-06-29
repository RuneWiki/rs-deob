import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class180 {

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field2769 = 0;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field2774 = new String[5];

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "Z")
    public static boolean field2773 = false;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Lbq;")
    public static class421 field2761;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "[B")
    public byte[] field2771;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "[S")
    public short[] field2765;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "[S")
    public short[] field2767;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "[S")
    public short[] field2768;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BC)Z", line = 4)
    public static final boolean method1202(byte arg0, char arg1) {
        field2762++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class42.field489;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        if (arg0 != 36) {
            field2761 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)I", line = 39)
    public static final int method1203(int arg0, int arg1) {
        field2772++;
        if (arg0 == 16711935) {
            return -1;
        } else if (arg1 > -58) {
            return 28;
        } else {
            return class11.method56(arg0, -1630);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 54)
    public static final String method1204(byte[] arg0, int arg1, int arg2, int arg3) {
        field2766++;
        if (arg2 != 23706) {
            return null;
        }
        char[] var4 = new char[arg1];
        int var5 = 0;
        int var6 = arg1 + arg3;
        for (int var7 = arg3; var7 < var6; var7++) {
            int var8 = arg0[var7] & 0xFF;
            if (var8 < 128) {
                var4[var5++] = (char) var8;
            } else if (var8 < 194) {
                throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
            } else if (var8 >= 224) {
                if (var8 < 240) {
                    if (var6 <= (var7 + 2)) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    var7++;
                    int var9 = arg0[var7] & 0xFF;
                    if (var9 >= 128 && var9 <= 191) {
                        var7++;
                        int var10 = arg0[var7] & 0xFF;
                        if (var10 >= 128 && var10 <= 191) {
                            var4[var5++] = (char) class313.method1926(class313.method1926(class637.method3693(-129, var9) << 6, class637.method3693(var8 << 12, -921600)), class637.method3693(var10, -129));
                            continue;
                        }
                        throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                }
                if (var8 < 244) {
                    throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                }
                throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
            } else if (var6 > (var7 + 1)) {
                var7++;
                int var11 = arg0[var7] & 0xFF;
                if (var11 < 128 || var11 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class313.method1926(class637.method3693(-129, var11), class637.method3693(var8 << 6, -12352));
            } else {
                throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ldda;ILdda;Ldda;Ldda;)V", line = 132)
    public static final void method1205(class597 arg0, int arg1, class597 arg2, class597 arg3, class597 arg4) {
        field2764++;
        class262.field3884 = arg0;
        if (arg1 != 0) {
            method1203(-95, 89);
        }
        class163.field2179 = arg3;
        class145.field1879 = arg2;
        class320.field4769 = arg4;
        class251.field3650 = new class311[class145.field1879.method3477(false)][];
        class43.field521 = new boolean[class145.field1879.method3477(false)];
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 153)
    public static void method1206(byte arg0) {
        field2774 = null;
        if (arg0 < -86) {
            field2761 = null;
        }
    }
}
