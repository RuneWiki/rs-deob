import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class71 extends class544 {

    @OriginalMember(owner = "client!kca", name = "s", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "client!kca", name = "o", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "client!kca", name = "m", descriptor = "I")
    public static int field684 = -1;

    @OriginalMember(owner = "client!kca", name = "p", descriptor = "I")
    public static int field687 = 0;

    @OriginalMember(owner = "client!kca", name = "n", descriptor = "[I")
    public static int[] field685 = new int[14];

    @OriginalMember(owner = "client!kca", name = "q", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!kca", name = "r", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(II)I", line = 6)
    public static final int method390(int arg0, int arg1) {
        int var2 = 34 / ((25 - arg0) / 49);
        field689++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V", line = 16)
    public static void method391(int arg0) {
        if (arg0 != -8256) {
            field685 = null;
        }
        field685 = null;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I[B)Ljava/lang/String;", line = 40)
    public static final String method392(int arg0, byte[] arg1) {
        field688++;
        int var2 = arg1.length;
        char[] var3 = new char[var2];
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -9282) {
            field684 = -44;
        }
        while (var5 < var2) {
            int var6 = arg1[var5] & 0xFF;
            if (var6 >= 128) {
                if (var6 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
                }
                if (var6 >= 224) {
                    label70: {
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
                        int var7 = arg1[var5] & 0xFF;
                        if (var7 >= 128 && var7 <= 191) {
                            var5++;
                            int var8 = arg1[var5] & 0xFF;
                            if (var8 >= 128 && var8 <= 191) {
                                var3[var4++] = (char) class42.method223(class42.method223(class288.method1624(-921600, var6 << 12), class288.method1624(var7 << 6, -8256)), class288.method1624(var8, -129));
                                break label70;
                            }
                            throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                        }
                        throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                    }
                } else if (var2 > (var5 + 1)) {
                    var5++;
                    int var9 = arg1[var5] & 0xFF;
                    if (var9 < 128 || var9 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var3[var4++] = (char) class42.method223(class288.method1624(-12352, var6 << 6), class288.method1624(-129, var9));
                } else {
                    throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                }
            } else {
                var3[var4++] = (char) var6;
            }
            var5++;
        }
        return new String(var3, 0, var4);
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(II)V", line = 117)
    public class71(int arg0, int arg1) {
        this.field690 = arg1;
        this.field686 = arg0;
    }
}
