import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class223 {

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
    public int field3148 = 0;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
    public int field3150 = 0;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "Lka;")
    private class473 field3156 = new class473(64);

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "Lch;")
    private class162 field3157 = null;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "Ldk;")
    private class421 field3151;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "Ldk;")
    private class421 field3152;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field3147 = 1407;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "Leq;")
    public static class509 field3146;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "[[Z")
    public static boolean[][] field3153;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(FIFF)F", line = 8)
    public static final float method1386(float arg0, int arg1, float arg2, float arg3) {
        field3154++;
        if (arg1 != -13349) {
            method1389((byte) -49);
        }
        return (arg2 - arg0) * arg3 + arg0;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BI)Lut;", line = 19)
    public final class148 method1387(byte arg0, int arg1) {
        field3149++;
        if (arg0 != 109) {
            this.method1388(null, (byte) -64, null, -35L);
        }
        class148 var3 = (class148) this.field3156.method2767((long) arg1, arg0 - 109);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field3152.method2512(1, (byte) -93, arg1);
        } else {
            var4 = this.field3151.method2512(1, (byte) -93, arg1 & 0x7FFF);
        }
        class148 var5 = new class148();
        var5.field2272 = this;
        if (var4 != null) {
            var5.method1070(new class319(var4), (byte) 77);
        }
        if (arg1 >= 32768) {
            var5.method1069(arg0 ^ 0x1B);
        }
        this.field3156.method2777(arg0 - 1134, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(ILdk;Ldk;Lch;)V", line = 113)
    public class223(int arg0, class421 arg1, class421 arg2, class162 arg3) {
        this.field3151 = arg2;
        this.field3157 = arg3;
        this.field3152 = arg1;
        if (this.field3152 != null) {
            this.field3150 = this.field3152.method2509(0, 1);
        }
        if (this.field3151 != null) {
            this.field3148 = this.field3151.method2509(0, 1);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "([IBLde;J)Ljava/lang/String;", line = 59)
    public final String method1388(int[] arg0, byte arg1, class10 arg2, long arg3) {
        field3155++;
        if (arg1 != -29) {
            this.method1388(null, (byte) -54, null, -82L);
        }
        if (this.field3157 != null) {
            String var6 = this.field3157.method1137(arg3, arg2, (byte) -108, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V", line = 91)
    public static void method1389(byte arg0) {
        field3146 = null;
        field3153 = null;
        if (arg0 != 27) {
            field3147 = 61;
        }
    }
}
