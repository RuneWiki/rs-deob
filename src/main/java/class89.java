import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class89 extends class176 {

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
    public int field2091;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "Lgg;")
    private static class63 field2087 = class116.method911(43, "Type");

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field2088 = 128;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
    public static int field2092 = 0;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "Lgg;")
    public static class63 field2090 = class116.method911(43, "Neuer Benutzer");

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "[I")
    public static int[] field2085 = new int[256];

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "Lgg;")
    public static class63 field2096 = field2087;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "[Lab;")
    public static class3[] field2089 = new class3[2048];

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "[Lmc;")
    public static class111[] field2093 = new class111[256];

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "Lff;")
    public static class54 field2094;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(JZ)Lgg;")
    public static final class63 method770(long arg0, boolean arg1) {
        field2095++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg1) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class32.field776[(int) (var8 - arg0 * 37L)];
            }
            class63 var7 = new class63();
            var7.field1602 = var6;
            var7.field1628 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static void method771(int arg0) {
        field2090 = null;
        field2096 = null;
        field2085 = null;
        if (arg0 != 0) {
            method770(126L, true);
        }
        field2089 = null;
        field2093 = null;
        field2094 = null;
        field2087 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B[Lgg;)Lgg;")
    public static final class63 method772(byte arg0, class63[] arg1) {
        field2097++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        } else if (arg0 <= 25) {
            return null;
        } else {
            return class16.method176(0, arg1.length, (byte) -124, arg1);
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class89() {
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V")
    public class89(int arg0) {
        this.field2091 = arg0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
    public static final void method773(int arg0, int arg1) {
        field2086++;
        class90 var2 = (class90) class110.field2484.method694(-23979, (long) arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field2102.length; var3++) {
            var2.field2102[var3] = -1;
            var2.field2099[var3] = 0;
        }
        if (arg1 != -25985) {
            field2087 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2085[var0] = var1;
        }
    }
}
