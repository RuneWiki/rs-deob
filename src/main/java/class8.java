import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 {

    @OriginalMember(owner = "client!to", name = "f", descriptor = "[I")
    private int[] field75;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "[S")
    public static short[] field74 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "Lqn;")
    public static class47 field76;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field71;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "Z")
    public static boolean field72;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IJIIIILjava/lang/String;IZLjava/lang/String;Z)V")
    public static final void method45(int arg0, long arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7, boolean arg8, String arg9, boolean arg10) {
        field77++;
        if (class122.field1646 || class2.field24 >= 500) {
            return;
        }
        int var12 = arg5 == -1 ? class236.field3000 : arg5;
        class520 var13 = new class520(arg9, arg6, var12, arg7, arg2, arg1, arg4, arg3, arg10, arg8);
        if (arg0 != 22461) {
            method45(68, 89L, -27, -15, 70, -127, null, -45, true, null, true);
        }
        class201.field2616.method163(var13, 0);
        class2.field24++;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IB)I")
    public final int method46(int arg0, byte arg1) {
        if (arg1 > -28) {
            this.method46(73, (byte) -110);
        }
        field73++;
        int var3 = (this.field75.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field75[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field75[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
    public static final String method47(int arg0, int arg1, byte[] arg2, int arg3) {
        field70++;
        if (arg0 != 29003) {
            return null;
        }
        char[] var4 = new char[arg3];
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
                var4[var5++] = (char) class215.method1323(class215.method1323(class378.method2145(var9, -129) << 6, class378.method2145(-921600, var8 << 12)), class378.method2145(-129, var10));
            } else if ((var7 + 1) < var6) {
                var7++;
                int var11 = arg2[var7] & 0xFF;
                if (var11 < 128 || var11 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class215.method1323(class378.method2145(var8 << 6, -12352), class378.method2145(-129, var11));
            } else {
                throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "([I)V")
    public class8(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field75 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field75[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field75[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field75[var5 + var5] = arg0[var4];
            this.field75[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
    public static void method48(int arg0) {
        field71 = null;
        field74 = null;
        if (arg0 == -1) {
            field76 = null;
        }
    }
}
