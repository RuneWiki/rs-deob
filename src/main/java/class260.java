import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class class260 {

    @OriginalMember(owner = "client!od", name = "e", descriptor = "[J")
    public static long[] field4135 = new long[256];

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field4133 = 2;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "[I")
    public static int[] field4139;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method1736(int arg0) {
        field4139 = null;
        field4135 = null;
        if (arg0 != -28100) {
            field4131 = -44;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZB)V")
    public static final void method1737(boolean arg0, byte arg1) {
        if (arg1 != -30) {
            field4131 = 24;
        }
        field4136++;
        if (arg0 != class16.field242) {
            class16.field242 = arg0;
            class23.method188((byte) -124);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
    public static final void method1738(boolean arg0) {
        if (!arg0) {
            field4134 = 71;
        }
        if (class212.field3396 != null) {
            class212.field3396.method1589(true);
        }
        field4138++;
        if (class165.field2709 != null) {
            class165.field2709.method1589(true);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lni;Z)Lni;")
    public abstract class291 method692(class291 arg0, boolean arg1);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLjava/lang/String;)J")
    public static final long method1739(boolean arg0, String arg1) {
        field4137++;
        if (arg0) {
            return 66L;
        }
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg1.charAt(var5);
            var2 *= 37L;
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 'A');
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public static final void method1740(int arg0) {
        if (arg0 == 1) {
            field4140++;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4135[var0] = var1;
        }
        field4139 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
    }
}
