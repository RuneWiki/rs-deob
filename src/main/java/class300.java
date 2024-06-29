import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class300 extends class24 {

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Luf;")
    public class168 field5078;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "[I")
    public static int[] field5084 = new int[1000];

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "Ltd;")
    public static class216 field5080 = new class216();

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "Luf;")
    public static class168 field5086 = class148.method1019(-1720, "Fertigkeit)2");

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "Luf;")
    public static class168 field5089 = class148.method1019(-1720, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "Luf;")
    public static class168 field5090 = class148.method1019(-1720, ")3runescape)3com");

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "Ldk;")
    public static class241 field5088;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "Ldk;")
    public static class241 field5091;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V", line = 11)
    public static void method2050(int arg0) {
        if (arg0 != -7456) {
            return;
        }
        field5089 = null;
        field5091 = null;
        field5086 = null;
        field5080 = null;
        field5088 = null;
        field5084 = null;
        field5090 = null;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V", line = 33)
    public class300() {
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)[B", line = 40)
    public static final byte[] method2051(boolean arg0, int arg1) {
        class86 var2 = (class86) class76.field1010.method185(-1, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class103.method774(var7, var4, Integer.MIN_VALUE);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class86(var3);
            class76.field1010.method187(var2, (long) arg1, (byte) 10);
        }
        field5081++;
        if (!arg0) {
            method2051(false, 5);
        }
        return var2.field1336;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)I", line = 88)
    public static final int method2052(int arg0, int arg1, int arg2, int arg3) {
        field5079++;
        if (arg1 == arg2) {
            return arg2;
        }
        int var4 = 128 - arg3;
        int var5 = ((arg2 & 0xFF00FF00) >>> 7) * var4 + (arg1 >>> 7 & 0x1FE01FE) * arg3 & 0xFF00FF00;
        if (arg0 != 10) {
            field5091 = (class241) null;
        }
        int var6 = (arg1 & 0xFF00FF) * arg3 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00;
        return (var6 >> 7) + var5;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)Lhc;", line = 110)
    public static final class183 method2053(boolean arg0) {
        if (arg0) {
            method2051(false, -79);
        }
        field5082++;
        try {
            return (class183) Class.forName("tj").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class159();
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Luf;I)V", line = 128)
    public class300(class168 arg0, int arg1) {
        this.field5078 = arg0;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IJ)V", line = 148)
    public static final void method2054(int arg0, long arg1) {
        field5083++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % (long) arg0) == 0L) {
            class82.method525(arg1 - 1L, false);
            class82.method525(1L, false);
        } else {
            class82.method525(arg1, false);
        }
    }
}
