import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class183 extends class198 {

    @OriginalMember(owner = "client!hm", name = "P", descriptor = "I")
    private int field2842 = 1024;

    @OriginalMember(owner = "client!hm", name = "Q", descriptor = "I")
    private int field2843 = 3072;

    @OriginalMember(owner = "client!hm", name = "T", descriptor = "I")
    private int field2846 = 2048;

    @OriginalMember(owner = "client!hm", name = "O", descriptor = "[Lwi;")
    public static class142[] field2841 = new class142[4];

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2836 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!hm", name = "U", descriptor = "I")
    public static int field2847 = 0;

    @OriginalMember(owner = "client!hm", name = "W", descriptor = "I")
    public static int field2849 = 0;

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!hm", name = "M", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!hm", name = "N", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!hm", name = "R", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!hm", name = "S", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!hm", name = "V", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!hm", name = "K", descriptor = "[[B")
    public static byte[][] field2837;

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V")
    public class183() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        ++field2845;
        int var4 = -44 / ((arg0 - 60) / 61);
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field3139 = ~arg1.method1420((byte) 0) == -2;
                }
            } else {
                this.field2843 = arg1.method1419(72);
            }
        } else {
            this.field2842 = arg1.method1419(96);
        }
    }

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "(I)V")
    public static void method1214(int arg0) {
        field2836 = null;
        if (arg0 != 2) {
            method1216((byte) 46);
        }
        field2837 = null;
        field2841 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZ)Lki;")
    public static final class63 method1215(int arg0, boolean arg1) {
        ++field2844;
        class63 var2 = (class63) class249.field3960.method149((byte) -103, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class126.field1953.method1877(arg0, 1, (byte) 116);
            if (!arg1) {
                field2847 = 80;
            }
            class63 var4 = new class63();
            if (var3 != null) {
                var4.method409(-256, arg0, new class202(var3));
            }
            class249.field3960.method152(var4, (long) arg0, arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(B)V")
    public final void method142(byte arg0) {
        int var2 = 119 / ((arg0 - -46) / 47);
        ++field2839;
        this.field2846 = -this.field2842 + this.field2843;
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(B)V")
    public static final void method1216(byte arg0) {
        class18.field253 = null;
        class258.field4244 = null;
        class301.field4936 = null;
        if (arg0 <= 19) {
            method1215(-110, true);
        }
        class121.field1853 = null;
        class220.field3515 = null;
        ++field2848;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        ++field2838;
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (!arg0) {
            this.method200(-114, 28);
        }
        if (super.field3134.field69) {
            int[] var4 = this.method1367((byte) -79, 0, arg1);
            for (int var5 = 0; var5 < class42.field590; ++var5) {
                var3[var5] = (var4[var5] * this.field2846 >> 12) + this.field2842;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)[[I")
    public final int[][] method200(int arg0, int arg1) {
        ++field2840;
        if (arg1 != -2) {
            field2841 = null;
        }
        int[][] var3 = super.field3150.method642(arg0, 1);
        if (super.field3150.field1498) {
            int[][] var4 = this.method1372(0, arg0, (byte) 105);
            int[] var5 = var4[1];
            int[] var6 = var3[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var4[0];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class42.field590 < ~var11; ++var11) {
                var6[var11] = (var9[var11] * this.field2846 >> 12) + this.field2842;
                var8[var11] = this.field2842 - -(var5[var11] * this.field2846 >> 12);
                var10[var11] = (var7[var11] * this.field2846 >> 12) + this.field2842;
            }
        }
        return var3;
    }
}
