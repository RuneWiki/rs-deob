import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class380 extends RuntimeException {

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field5884;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Ljava/lang/String;")
    public String field5883;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "F")
    public static float field5886 = 0.0F;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2402(int arg0) {
        field5890++;
        if (class379.field5881 == -1) {
            return;
        }
        int var1 = class333.field5233.method1660(arg0 - 12900);
        int var2 = class333.field5233.method1655(-108);
        class272 var3 = (class272) class216.field3765.method2538(-3);
        if (var3 != null) {
            var1 = var3.method384((byte) -120);
            var2 = var3.method386((byte) -99);
        }
        if (arg0 != 15666) {
            method2404(false, false);
        }
        class277.method1828(0, var2, class49.field825, class358.field5581, 0, 0, 0, 93, var1, class379.field5881);
        if (class3.field27 != null) {
            class302.method1938(var2, var1, (byte) 85);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI[BI)Ljava/lang/String;", line = 33)
    public static final String method2403(byte arg0, int arg1, byte[] arg2, int arg3) {
        field5889++;
        char[] var4 = new char[arg3];
        if (arg0 != -22) {
            method2403((byte) -35, -45, null, -39);
        }
        int var5 = 0;
        int var6 = arg1 + arg3;
        for (int var7 = arg1; var7 < var6; var7++) {
            int var8 = arg2[var7] & 0xFF;
            if (var8 < 128) {
                var4[var5++] = (char) var8;
            } else if (var8 < 194) {
                throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
            } else if (var8 >= 224) {
                if (var8 >= 240) {
                    if (var8 >= 244) {
                        throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
                    }
                    throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                }
                if (var6 <= var7 + 2) {
                    throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                }
                var7++;
                int var9 = arg2[var7] & 0xFF;
                if (var9 < 128 || var9 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                }
                var7++;
                int var10 = arg2[var7] & 0xFF;
                if (var10 < 128 || var10 > 191) {
                    throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class338.method2141(class338.method2141(class344.method2224(var8 << 12, -921600), class344.method2224(-129, var9) << 6), class344.method2224(var10, -129));
            } else if ((var7 + 1) < var6) {
                var7++;
                int var11 = arg2[var7] & 0xFF;
                if (var11 < 128 || var11 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class338.method2141(class344.method2224(var11, -129), class344.method2224(var8 << 6, -12352));
            } else {
                throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZZ)V", line = 108)
    public static final void method2404(boolean arg0, boolean arg1) {
        if (arg1) {
            class239.method1639(class358.field5581, 28248, arg0, class49.field825, class379.field5881);
            field5888++;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BII)Z", line = 121)
    public static final boolean method2405(byte arg0, int arg1, int arg2) {
        if (arg0 != -47) {
            method2403((byte) 78, -27, null, -21);
        }
        field5885++;
        return (arg2 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 137)
    public class380(Throwable arg0, String arg1) {
        this.field5884 = arg0;
        this.field5883 = arg1;
    }
}
