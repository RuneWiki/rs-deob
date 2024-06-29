import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public abstract class class474 {

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "Lbi;")
    public static class104 field7260 = new class104(51, 8);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[B)Ljava/lang/String;")
    public static final String method2950(int arg0, byte[] arg1) {
        field7258++;
        if (arg0 != 194) {
            field7260 = null;
        }
        int var2 = arg1.length;
        char[] var3 = new char[var2];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            int var6 = arg1[var5] & 0xFF;
            if (var6 >= 128) {
                if (var6 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
                }
                if (var6 >= 224) {
                    if (var6 < 240) {
                        if (var2 <= (var5 + 2)) {
                            throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                        }
                        var5++;
                        int var7 = arg1[var5] & 0xFF;
                        if (var7 >= 128 && var7 <= 191) {
                            var5++;
                            int var8 = arg1[var5] & 0xFF;
                            if (var8 >= 128 && var8 <= 191) {
                                var3[var4++] = (char) class410.method2621(class410.method2621(class272.method1842(var7 << 6, -8256), class272.method1842(-921600, var6 << 12)), class272.method1842(var8, -129));
                                continue;
                            }
                            throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                        }
                        throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                    }
                    if (var6 >= 244) {
                        throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var6);
                    }
                    throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                } else if (var2 > (var5 + 1)) {
                    var5++;
                    int var9 = arg1[var5] & 0xFF;
                    if (var9 < 128 || var9 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var3[var4++] = (char) class410.method2621(class272.method1842(-129, var9), class272.method1842(-12352, var6 << 6));
                } else {
                    throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                }
            } else {
                var3[var4++] = (char) var6;
            }
        }
        return new String(var3, 0, var4);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)[B")
    public abstract byte[] method2951(int arg0);

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I[B)V")
    public abstract void method2952(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)V")
    public static final void method2953(int arg0, byte arg1) {
        if (arg1 > -77) {
            field7260 = null;
        }
        class388.field5920 = 100;
        class136.field1877 = -1;
        field7259++;
        class501.field7516 = arg0;
        class52.field707 = 3;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V")
    public static void method2954(int arg0) {
        field7260 = null;
        int var1 = -31 / ((54 - arg0) / 33);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)[B")
    public abstract byte[] method2955(int arg0, int arg1, int arg2);

    static {
        new class213(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
    }
}
