import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class260 {

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "J")
    public long field3572;

    @OriginalMember(owner = "client!vca", name = "i", descriptor = "Lno;")
    private class658 field3576;

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "Lgt;")
    public static class425 field3573 = new class425();

    @OriginalMember(owner = "client!vca", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field3574 = new String[100];

    @OriginalMember(owner = "client!vca", name = "j", descriptor = "I")
    public static int field3577 = 2;

    @OriginalMember(owner = "client!vca", name = "k", descriptor = "Lcu;")
    public static class206 field3578 = new class206(21, 3);

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!vca", name = "h", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)V")
    public static void method1589(byte arg0) {
        field3573 = null;
        if (arg0 > -83) {
            field3573 = null;
        }
        field3574 = null;
        field3578 = null;
    }

    @OriginalMember(owner = "client!vca", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3576.method3647(this.field3572, true);
        field3570++;
        super.finalize();
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(BII[B)Ljava/lang/String;")
    public static final String method1590(byte arg0, int arg1, int arg2, byte[] arg3) {
        field3571++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        int var6 = arg1 + arg2;
        if (arg0 != -12) {
            return null;
        }
        for (int var7 = arg1; var7 < var6; var7++) {
            int var8 = arg3[var7] & 0xFF;
            if (var8 >= 128) {
                if (var8 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
                }
                if (var8 < 224) {
                    if (var6 <= var7 + 1) {
                        throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                    }
                    var7++;
                    int var9 = arg3[var7] & 0xFF;
                    if (var9 < 128 || var9 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var4[var5++] = (char) class220.method1393(class571.method3139(-129, var9), class571.method3139(-12352, var8 << 6));
                } else if (var8 < 240) {
                    if ((var7 + 2) >= var6) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    var7++;
                    int var10 = arg3[var7] & 0xFF;
                    if (var10 >= 128 && var10 <= 191) {
                        var7++;
                        int var11 = arg3[var7] & 0xFF;
                        if (var11 >= 128 && var11 <= 191) {
                            var4[var5++] = (char) class220.method1393(class571.method3139(var11, -129), class220.method1393(class571.method3139(var8 << 12, -921600), class571.method3139(var10, -129) << 6));
                            continue;
                        }
                        throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                } else if (var8 < 244) {
                    throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                } else {
                    throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
                }
            } else {
                var4[var5++] = (char) var8;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Leh;IB)Ljava/lang/String;")
    public static final String method1591(class335 arg0, int arg1, byte arg2) {
        if (arg2 > -88) {
            method1590((byte) 39, 3, 112, null);
        }
        field3569++;
        try {
            int var3 = arg0.method1997(-129);
            if (var3 > arg1) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg0.field4619 += class44.field637.method369(arg0.field4600, arg0.field4619, 0, var3, var4, 126);
            return class190.method1244(var4, 0, var3, 81);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(JJ)J")
    public static long method1592(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IBIIIII)V")
    public static final void method1593(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class346.field4758 = arg4;
        class287.field4062 = arg6;
        if (arg1 != 123) {
            method1593(-79, (byte) 26, -60, -54, -3, 86, -121);
        }
        class524.field6992 = arg0;
        class87.field1322 = arg2;
        class213.field3046 = arg3;
        field3568++;
        class484.field6546 = arg5;
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lno;J[Lte;)V")
    public class260(class658 arg0, long arg1, class575[] arg2) {
        this.field3572 = arg1;
        this.field3576 = arg0;
    }
}
