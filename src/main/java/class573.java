import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class573 {

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Lcja;")
    private class46 field8165 = new class46(256);

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Lcja;")
    private class46 field8169 = new class46(256);

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Lgj;")
    private class662 field8162;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Lgj;")
    private class662 field8160;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field8161 = -1;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field8158;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field8159;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field8163;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field8164;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field8166;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field8167;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "[I")
    public static int[] field8168;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[I)Lrea;", line = 6)
    public final class221 method3316(int arg0, int arg1, int[] arg2) {
        field8158++;
        if (this.field8162.method3723(5) == 1) {
            return this.method3321(0, arg0, (byte) 119, arg2);
        } else if (this.field8162.method3730((byte) 10, arg0) == 1) {
            return this.method3321(arg0, 0, (byte) 118, arg2);
        } else if (arg1 == 16791) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 28)
    public static void method3317(int arg0) {
        if (arg0 < 76) {
            field8168 = null;
        }
        field8168 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZI[I)Lrea;", line = 40)
    private final class221 method3318(int arg0, boolean arg1, int arg2, int[] arg3) {
        field8164++;
        int var5 = arg0 ^ (arg2 >>> 12 | (arg2 & 0xFFF) << 4);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class221 var9 = (class221) this.field8169.method337(var7, 1);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class253 var10 = (class253) this.field8165.method337(var7, 1);
            if (var10 == null) {
                var10 = class253.method1665(this.field8160, arg2, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field8165.method341(var7, var10, (byte) 118);
            }
            class221 var11 = var10.method1668(arg3);
            if (var11 == null) {
                return null;
            }
            if (!arg1) {
                field8168 = null;
            }
            var10.method1207(102);
            this.field8169.method341(var7, var11, (byte) 84);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIB)Z", line = 85)
    public static final boolean method3319(int arg0, int arg1, byte arg2) {
        if (arg2 <= 108) {
            field8168 = null;
        }
        field8159++;
        return (arg1 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[II)Lrea;", line = 97)
    public final class221 method3320(int arg0, int[] arg1, int arg2) {
        field8166++;
        if (this.field8160.method3723(5) == 1) {
            return this.method3318(arg2, true, 0, arg1);
        } else if (arg0 != -1) {
            return null;
        } else if (this.field8160.method3730((byte) -93, arg2) == 1) {
            return this.method3318(0, true, arg2, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIB[I)Lrea;", line = 118)
    private final class221 method3321(int arg0, int arg1, byte arg2, int[] arg3) {
        if (arg2 < 108) {
            field8167 = -126;
        }
        field8163++;
        int var5 = (arg0 >>> 12 | (arg0 & 0x50000FFF) << 4) ^ arg1;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class221 var9 = (class221) this.field8169.method337(var7, 1);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class40 var10 = class40.method245(this.field8162, arg0, arg1);
            if (var10 == null) {
                return null;
            }
            class221 var11 = var10.method243();
            this.field8169.method341(var7, var11, (byte) 39);
            if (arg3 != null) {
                arg3[0] -= var11.field3235.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lgj;Lgj;)V", line = 177)
    public class573(class662 arg0, class662 arg1) {
        this.field8162 = arg0;
        this.field8160 = arg1;
    }
}
