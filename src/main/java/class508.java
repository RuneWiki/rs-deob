import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class508 extends RuntimeException {

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field7403;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "Ljava/lang/String;")
    public String field7399;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([BI)Ljava/lang/String;")
    public static final String method3042(byte[] arg0, int arg1) {
        field7401++;
        int var2 = arg0.length;
        char[] var3 = new char[var2];
        int var4 = 0;
        int var5 = 0;
        if (arg1 != 255) {
            return null;
        }
        while (var2 > var5) {
            int var6 = arg0[var5] & 0xFF;
            if (var6 < 128) {
                var3[var4++] = (char) var6;
            } else if (var6 < 194) {
                throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
            } else if (var6 < 224) {
                if (var5 + 1 >= var2) {
                    throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                }
                var5++;
                int var7 = arg0[var5] & 0xFF;
                if (var7 < 128 || var7 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var3[var4++] = (char) class418.method2558(class490.method2960(-129, var7), class490.method2960(-193, var6) << 6);
            } else {
                label74: {
                    if (var6 >= 240) {
                        if (var6 < 244) {
                            throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                        }
                        throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var6);
                    }
                    if (var2 <= (var5 + 2)) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    var5++;
                    int var8 = arg0[var5] & 0xFF;
                    if (var8 >= 128 && var8 <= 191) {
                        var5++;
                        int var9 = arg0[var5] & 0xFF;
                        if (var9 >= 128 && var9 <= 191) {
                            var3[var4++] = (char) class418.method2558(class490.method2960(var9, -129), class418.method2558(class490.method2960(var6, -225) << 12, class490.method2960(var8 << 6, -8256)));
                            break label74;
                        }
                        throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                }
            }
            var5++;
        }
        return new String(var3, 0, var4);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public static final String method3043(int arg0, boolean arg1) {
        if (arg1) {
            field7397++;
            return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "([BI)[B")
    public static final byte[] method3044(byte[] arg0, int arg1) {
        field7398++;
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class394.method2448(arg0, 0, var2, 0, arg0.length);
            int var3 = -73 % ((arg1 + 60) / 61);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILza;II)V")
    public static final void method3045(int arg0, class288 arg1, int arg2, int arg3) {
        field7402++;
        if (arg2 != 191) {
            method3042(null, 28);
        }
        client.field3213 = arg1;
        class360.field5288 = new class469[arg3][arg0];
        if (class8.field112 != null) {
            class435.field6470 = class181.method1240(class8.field112[2], -70, class8.field112[4], class8.field112[5], class8.field112[3], class8.field112[0], class8.field112[1]);
        }
        class322.field4924 = new class469();
        class144.method1071((byte) 107);
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class508(Throwable arg0, String arg1) {
        this.field7403 = arg0;
        this.field7399 = arg1;
    }
}
