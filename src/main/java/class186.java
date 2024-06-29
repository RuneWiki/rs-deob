import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class186 extends class90 {

    @OriginalMember(owner = "client!lt", name = "A", descriptor = "J")
    public static long field2821 = -1L;

    @OriginalMember(owner = "client!lt", name = "u", descriptor = "[I")
    public static int[] field2815 = new int[99];

    @OriginalMember(owner = "client!lt", name = "x", descriptor = "[S")
    public static short[] field2818 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!lt", name = "w", descriptor = "I")
    public static int field2817 = 0;

    @OriginalMember(owner = "client!lt", name = "K", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!lt", name = "L", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2832;

    @OriginalMember(owner = "client!lt", name = "N", descriptor = "[[[I")
    public static int[][][] field2834;

    @OriginalMember(owner = "client!lt", name = "M", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!lt", name = "s", descriptor = "I")
    public int field2813;

    @OriginalMember(owner = "client!lt", name = "t", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!lt", name = "y", descriptor = "I")
    public int field2819;

    @OriginalMember(owner = "client!lt", name = "z", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!lt", name = "B", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!lt", name = "D", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!lt", name = "F", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!lt", name = "G", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!lt", name = "H", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!lt", name = "I", descriptor = "I")
    public int field2829;

    @OriginalMember(owner = "client!lt", name = "J", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!lt", name = "E", descriptor = "Ljava/lang/String;")
    public String field2825;

    @OriginalMember(owner = "client!lt", name = "v", descriptor = "[Ldp;")
    public static class319[] field2816;

    @OriginalMember(owner = "client!lt", name = "C", descriptor = "[Ldp;")
    public static class319[] field2823;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Len;")
    public static final class329 method1278(Throwable arg0, String arg1) {
        ++field2820;
        class329 var2;
        if (arg0 instanceof class329) {
            var2 = (class329) arg0;
            var2.field4927 = var2.field4927 + ' ' + arg1;
        } else {
            var2 = new class329(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V")
    public final void method1279(byte arg0) {
        ++field2826;
        if (arg0 != -65) {
            this.method1281(-106);
        }
        super.field1255 = 500L + class435.method2539(-10659) | super.field1255 & Long.MIN_VALUE;
        class431.field6125.method1075((byte) -25, this);
    }

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "(I)I")
    public final int method1280(int arg0) {
        ++field2814;
        if (arg0 != 30471) {
            field2818 = null;
        }
        return (int) super.field436;
    }

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "(I)J")
    public final long method1281(int arg0) {
        if (arg0 != 32) {
            return -18L;
        } else {
            ++field2828;
            return super.field1255 & Long.MAX_VALUE;
        }
    }

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "(I)V")
    public static void method1282(int arg0) {
        field2834 = null;
        if (arg0 != 6798) {
            method1282(21);
        }
        field2818 = null;
        field2832 = null;
        field2815 = null;
        field2823 = null;
        field2816 = null;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)I")
    public final int method1283(boolean arg0) {
        if (arg0) {
            this.method1283(false);
        }
        ++field2827;
        return (int) (255L & super.field436 >>> 32);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)V")
    public static final void method1284(int arg0, int arg1, int arg2) {
        class337 var3 = class170.field2427[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field5058 != null) {
                var3.field5058 = null;
            }
            if (var3.field5050 != null) {
                var3.field5050 = null;
            }
        }
    }

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "(I)V")
    public final void method1285(int arg0) {
        ++field2824;
        super.field1255 |= Long.MIN_VALUE;
        if ((long) arg0 == this.method1281(32)) {
            class361.field5466.method1075((byte) -70, this);
        }
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(II)V")
    public class186(int arg0, int arg1) {
        super.field436 = (long) arg0 << 32 | (long) arg1;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -100; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2815[var1] = var0 / 4;
        }
        field2831 = 0;
        field2832 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field2834 = new int[2][][];
        field2833 = 0;
    }
}
