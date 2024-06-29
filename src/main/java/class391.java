import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class391 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Liv;")
    public static class84 field5472 = new class84();

    @OriginalMember(owner = "client!q", name = "c", descriptor = "[S")
    public static short[] field5474 = new short[256];

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "[I")
    public static int[] field5476;

    @OriginalMember(owner = "client!q", name = "ra", descriptor = "(I)V")
    public abstract void method1292(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public abstract void method1294(int arg0);

    @OriginalMember(owner = "client!q", name = "G", descriptor = "(III)V")
    public abstract void method1285(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "P", descriptor = "(I)V")
    public abstract void method1297(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lq;")
    public abstract class391 method1295();

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public abstract void method1291(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "la", descriptor = "(Lq;)V")
    public abstract void method1298(class391 arg0);

    @OriginalMember(owner = "client!q", name = "R", descriptor = "(III[I)V")
    public abstract void method1287(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "O", descriptor = "([I)V")
    public abstract void method1289(int[] arg0);

    @OriginalMember(owner = "client!q", name = "S", descriptor = "(I)V")
    public abstract void method1286(int arg0);

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(I)V")
    public abstract void method1293(int arg0);

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "()V")
    public abstract void method1296();

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
    public static void method2242(int arg0) {
        field5476 = null;
        if (arg0 == 20258) {
            field5472 = null;
            field5474 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "pa", descriptor = "(IIIIII)V")
    public abstract void method1290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "GA", descriptor = "(III)V")
    public abstract void method1288(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([BZII)Ljava/lang/String;")
    public static final String method2243(byte[] arg0, boolean arg1, int arg2, int arg3) {
        field5473++;
        if (!arg1) {
            field5476 = null;
        }
        char[] var4 = new char[arg3];
        int var5 = 0;
        int var6 = arg2 + arg3;
        for (int var7 = arg2; var7 < var6; var7++) {
            int var8 = arg0[var7] & 0xFF;
            if (var8 < 128) {
                var4[var5++] = (char) var8;
            } else if (var8 < 194) {
                throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
            } else if (var8 < 224) {
                if (var7 + 1 >= var6) {
                    throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                }
                var7++;
                int var9 = arg0[var7] & 0xFF;
                if (var9 < 128 || var9 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class266.method1624(class249.method1537(-12352, var8 << 6), class249.method1537(-129, var9));
            } else if (var8 < 240) {
                if (var7 + 2 >= var6) {
                    throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                }
                var7++;
                int var10 = arg0[var7] & 0xFF;
                if (var10 >= 128 && var10 <= 191) {
                    var7++;
                    int var11 = arg0[var7] & 0xFF;
                    if (var11 >= 128 && var11 <= 191) {
                        var4[var5++] = (char) class266.method1624(class249.method1537(-129, var11), class266.method1624(class249.method1537(-921600, var8 << 12), class249.method1537(-129, var10) << 6));
                        continue;
                    }
                    throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                }
                throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
            } else if (var8 >= 244) {
                throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
            } else {
                throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
            }
        }
        return new String(var4, 0, var5);
    }
}
