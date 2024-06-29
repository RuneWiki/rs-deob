import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class195 extends class424 {

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    public int field2546;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "Lme;")
    public static class668 field2541 = new class668(4);

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "[S")
    public static short[] field2548;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
    public static void method1283(int arg0) {
        field2541 = null;
        if (arg0 != -1) {
            field2541 = null;
        }
        field2548 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[B)Ljava/lang/String;")
    public static final String method1284(int arg0, byte[] arg1) {
        field2545++;
        int var2 = arg1.length;
        if (arg0 != 128) {
            field2549 = -16;
        }
        char[] var3 = new char[var2];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            int var6 = arg1[var5] & 0xFF;
            if (var6 < 128) {
                var3[var4++] = (char) var6;
            } else if (var6 < 194) {
                throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
            } else if (var6 < 224) {
                if (var2 <= var5 + 1) {
                    throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                }
                var5++;
                int var7 = arg1[var5] & 0xFF;
                if (var7 < 128 || var7 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var3[var4++] = (char) class131.method954(class597.method3238(var7, -129), class597.method3238(var6, -193) << 6);
            } else if (var6 < 240) {
                if (var2 <= var5 + 2) {
                    throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                }
                var5++;
                int var8 = arg1[var5] & 0xFF;
                if (var8 < 128 || var8 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                }
                var5++;
                int var9 = arg1[var5] & 0xFF;
                if (var9 < 128 || var9 > 191) {
                    throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                }
                var3[var4++] = (char) class131.method954(class131.method954(class597.method3238(-225, var6) << 12, class597.method3238(var8, -129) << 6), class597.method3238(-129, var9));
            } else if (var6 >= 244) {
                throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var6);
            } else {
                throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
            }
        }
        return new String(var3, 0, var4);
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)I")
    public static final int method1285(int arg0) {
        if (arg0 != -225) {
            method1284(-21, null);
        }
        field2542++;
        return class220.field2886 == null ? 0 : class220.field2886.length * 2;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V")
    public static final void method1286(int arg0) {
        class408.field5286.method360(((float) class260.field3509.field1301 * 0.1F + 0.7F) * 1.1523438F);
        field2543++;
        class408.field5286.method390(class563.field7341, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        if (arg0 != -16608) {
            method1285(77);
        }
        class408.field5286.method404(class21.field234, -1, 0);
        class408.field5286.method403(class215.field2772);
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
    public class195() {
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(I)V")
    public class195(int arg0) {
        this.field2546 = arg0;
    }
}
