import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class56 implements Runnable {

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "Z")
    public boolean field915 = true;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "Ljava/lang/Object;")
    public Object field913 = new Object();

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public int field917 = 0;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "[I")
    public int[] field918 = new int[500];

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "[I")
    public int[] field916 = new int[500];

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Lhi;")
    private static class82 field898 = class95.method664((byte) -48, "Mar");

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lhi;")
    private static class82 field896 = class95.method664((byte) -113, "Dec");

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lhi;")
    private static class82 field894 = class95.method664((byte) -73, "Oct");

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Lhi;")
    private static class82 field893 = class95.method664((byte) -105, "Nov");

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "Lhi;")
    private static class82 field905 = class95.method664((byte) -123, "Aug");

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Lhi;")
    private static class82 field904 = class95.method664((byte) -121, "Jan");

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Lhi;")
    private static class82 field902 = class95.method664((byte) -49, "Jun");

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "[I")
    public static int[] field897 = new int[50];

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Lhi;")
    private static class82 field906 = class95.method664((byte) -33, "Sep");

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "Lhi;")
    public static class82 field910 = class95.method664((byte) -67, "compass");

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lhi;")
    private static class82 field895 = class95.method664((byte) -53, "May");

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "Lhi;")
    private static class82 field912 = class95.method664((byte) -44, "Apr");

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "Lhi;")
    public static class82 field908 = class95.method664((byte) -112, "clignotant3:");

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "Lhi;")
    private static class82 field911 = class95.method664((byte) -111, "Jul");

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Lhi;")
    private static class82 field892 = class95.method664((byte) -87, "Feb");

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "[Lhi;")
    public static class82[] field903 = new class82[] { field904, field892, field898, field912, field895, field902, field911, field905, field906, field894, field893, field896 };

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "[I")
    public static int[] field900 = new int[4096];

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "[I")
    public static int[] field914;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field900[var0] = class232.method1647(var0, -6726);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)I", line = 38)
    public static final int method387(int arg0) {
        field909++;
        if (arg0 != -28234) {
            field903 = (class82[]) null;
        }
        return ((class134.field2321 == 0 ? 0 : 1) << 20) + ((class308.field5238 ? 1 : 0) << 19) + ((class208.field3641 ? 1 : 0) << 10) + ((class133.field2295 ? 1 : 0) << 8) + ((class77.field1320 ? 1 : 0) << 4) + (class112.field2032 & 0x7) + ((class146.field2468 ? 1 : 0) << 3) + ((class256.field4409 ? 1 : 0) << 5) + (((class198.field3384 ? 1 : 0) << 6) - -((class244.field4232 ? 1 : 0) << 7)) + ((class113.field2040 ? 1 : 0) << 9) + (class33.field504 & 0x3 << 11) + ((class75.field1303 ? 1 : 0) << 13) + ((class126.field2220 ? 1 : 0) << 15) + ((class52.field839 ? 1 : 0) << 16) + ((class284.field4771 == 0 ? 0 : 1) << 21) + ((class138.field2373 == 0 ? 0 : 1) << 22) + (class295.method2031() << 23);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(JI)Lhi;", line = 52)
    public static final class82 method388(long arg0, int arg1) {
        field907++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = arg1;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class119.field2098[(int) (var7 - (arg0 * 37L))];
            }
            class82 var9 = new class82();
            var9.field1419 = var6;
            var9.field1468 = var6.length;
            return var9;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lum;ILum;)V", line = 90)
    public static final void method389(class222 arg0, int arg1, class222 arg2) {
        class50.field810 = arg2;
        field899++;
        class242.field4207 = arg0;
        if (arg1 != 1) {
            field914 = (int[]) null;
        }
        class179.field3062 = class242.field4207.method1568(1673, 3);
    }

    @OriginalMember(owner = "client!hc", name = "run", descriptor = "()V", line = 104)
    public final void run() {
        while (this.field915) {
            Object var1 = this.field913;
            synchronized (this.field913) {
                if (this.field917 < 500) {
                    this.field918[this.field917] = class211.field3702;
                    this.field916[this.field917] = class202.field3471;
                    this.field917++;
                }
            }
            class290.method2001(50L, false);
        }
        field901++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V", line = 147)
    public static void method390(boolean arg0) {
        field895 = null;
        field898 = null;
        field894 = null;
        field903 = null;
        field896 = null;
        field902 = null;
        field897 = null;
        field906 = null;
        field908 = null;
        field904 = null;
        field912 = null;
        if (arg0) {
            return;
        }
        field911 = null;
        field892 = null;
        field900 = null;
        field910 = null;
        field914 = null;
        field893 = null;
        field905 = null;
    }
}
