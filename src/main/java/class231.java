import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class231 {

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Lad;")
    private class268 field3071 = new class268(256);

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "Lad;")
    private class268 field3074 = new class268(256);

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "Lr;")
    private class110 field3068;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Lr;")
    private class110 field3061;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "Ls;")
    public static class169 field3067 = new class169(11, 3);

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "Lkk;")
    public static class114 field3073 = new class114("WTQA", 2);

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Lje;")
    public static class253 field3072;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static void method1288(int arg0) {
        if (arg0 == 8068) {
            field3072 = null;
            field3067 = null;
            field3073 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([III)Ljn;")
    public final class465 method1289(int[] arg0, int arg1, int arg2) {
        field3066++;
        if (this.field3068.method705((byte) -124) == 1) {
            return this.method1294(arg1, 65529, arg0, 0);
        }
        if (arg2 != 0) {
            this.field3074 = null;
        }
        if (this.field3068.method694(arg1, (byte) 119) != 1) {
            throw new RuntimeException();
        }
        return this.method1294(0, 65529, arg0, arg1);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)I")
    public static final int method1290(int arg0, int arg1, int arg2) {
        field3065++;
        if (arg1 != 2) {
            return 64;
        } else if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI[I)Ljn;")
    public final class465 method1291(byte arg0, int arg1, int[] arg2) {
        field3063++;
        if (this.field3061.method705((byte) -95) == 1) {
            return this.method1293(arg1, arg2, 0, -2011607348);
        } else if (this.field3061.method694(arg1, (byte) 119) == 1) {
            return this.method1293(0, arg2, arg1, -2011607348);
        } else if (arg0 >= -5) {
            return null;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method1292(byte arg0, String arg1) {
        field3064++;
        if (arg0 != 3) {
            method1295((class32) null, (byte) -93);
        }
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[III)Ljn;")
    private final class465 method1293(int arg0, int[] arg1, int arg2, int arg3) {
        field3070++;
        int var5 = (arg2 >>> 12 | arg2 << 4 & 0xFFF8) ^ arg0;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class465 var9 = (class465) this.field3074.method1528(var7, 116);
        if (var9 != null) {
            return var9;
        }
        if (arg3 != -2011607348) {
            field3067 = null;
        }
        if (arg1 != null && arg1[0] <= 0) {
            return null;
        }
        class85 var10 = class85.method534(this.field3061, arg2, arg0);
        if (var10 == null) {
            return null;
        }
        class465 var11 = var10.method533();
        this.field3074.method1525((byte) 19, var11, var7);
        if (arg1 != null) {
            arg1[0] -= var11.field6451.length;
        }
        return var11;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II[II)Ljn;")
    private final class465 method1294(int arg0, int arg1, int[] arg2, int arg3) {
        field3069++;
        int var5 = arg0 ^ (arg3 << 4 & arg1 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class465 var9 = (class465) this.field3074.method1528(var7, 103);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class379 var10 = (class379) this.field3071.method1528(var7, 101);
            if (var10 == null) {
                var10 = class379.method2328(this.field3068, arg3, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field3071.method1525((byte) 19, var10, var7);
            }
            class465 var11 = var10.method2327(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method2614((byte) -110);
                this.field3074.method1525((byte) 19, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lbt;B)V")
    public static final void method1295(class32 arg0, byte arg1) {
        field3062++;
        byte[] var2 = new byte[24];
        if (class48.field644 != null) {
            try {
                class48.field644.method942(0L, (byte) -90);
                class48.field644.method948(var2, (byte) 123);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        if (arg1 > -110) {
            method1288(44);
        }
        arg0.method243((byte) 125, 0, var2, 24);
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lr;Lr;)V")
    public class231(class110 arg0, class110 arg1) {
        this.field3068 = arg1;
        this.field3061 = arg0;
    }
}
